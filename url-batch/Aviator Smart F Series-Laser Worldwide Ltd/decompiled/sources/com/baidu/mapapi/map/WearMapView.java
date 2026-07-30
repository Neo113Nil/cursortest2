package com.baidu.mapapi.map;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.NinePatch;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.NinePatchDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.baidu.mapapi.BMapManager;
import com.baidu.mapapi.common.SysOSUtil;
import com.baidu.mapapi.map.MapViewLayoutParams;
import com.baidu.mapapi.model.CoordUtil;
import com.baidu.mapsdkplatform.comapi.map.c;
import com.baidu.mapsdkplatform.comapi.map.q;
import com.baidu.mapsdkplatform.comapi.map.s;
import com.baidu.mapsdkplatform.comapi.map.y;
import com.baidu.platform.comapi.basestruct.GeoPoint;
import com.baidu.platform.comapi.bmsdk.BmDrawItem;
import com.baidu.platform.comapi.map.MapSurfaceView;
import com.baidu.platform.comapi.map.w;
import com.google.android.exoplayer2.audio.AacUtil;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.Timer;
import java.util.TimerTask;
import javax.microedition.khronos.opengles.GL10;

@TargetApi(20)
/* loaded from: classes2.dex */
public class WearMapView extends ViewGroup implements View.OnApplyWindowInsetsListener {
    public static final int BT_INVIEW = 1;

    /* renamed from: b, reason: collision with root package name */
    private static String f6430b;

    /* renamed from: h, reason: collision with root package name */
    private static final SparseArray<Integer> f6436h;
    private float A;
    private int B;
    private int C;
    private int D;
    private int E;
    private int F;
    private int G;
    private boolean H;

    /* renamed from: i, reason: collision with root package name */
    private MapSurfaceView f6437i;

    /* renamed from: j, reason: collision with root package name */
    private BaiduMap f6438j;

    /* renamed from: k, reason: collision with root package name */
    private ImageView f6439k;

    /* renamed from: l, reason: collision with root package name */
    private Bitmap f6440l;

    /* renamed from: m, reason: collision with root package name */
    private y f6441m;
    public AnimationTask mTask;
    public Timer mTimer;
    public f mTimerHandler;

    /* renamed from: n, reason: collision with root package name */
    private boolean f6442n;

    /* renamed from: o, reason: collision with root package name */
    private Point f6443o;

    /* renamed from: p, reason: collision with root package name */
    private Point f6444p;

    /* renamed from: q, reason: collision with root package name */
    private RelativeLayout f6445q;

    /* renamed from: r, reason: collision with root package name */
    private SwipeDismissView f6446r;

    /* renamed from: s, reason: collision with root package name */
    private TextView f6447s;

    /* renamed from: t, reason: collision with root package name */
    private TextView f6448t;

    /* renamed from: u, reason: collision with root package name */
    private ImageView f6449u;

    /* renamed from: v, reason: collision with root package name */
    private boolean f6450v;

    /* renamed from: w, reason: collision with root package name */
    private Context f6451w;

    /* renamed from: x, reason: collision with root package name */
    ScreenShape f6452x;

    /* renamed from: y, reason: collision with root package name */
    private boolean f6453y;

    /* renamed from: z, reason: collision with root package name */
    private boolean f6454z;

    /* renamed from: a, reason: collision with root package name */
    private static final String f6429a = MapView.class.getSimpleName();

    /* renamed from: c, reason: collision with root package name */
    private static int f6431c = 0;

    /* renamed from: d, reason: collision with root package name */
    private static int f6432d = 0;

    /* renamed from: e, reason: collision with root package name */
    private static int f6433e = 0;

    /* renamed from: f, reason: collision with root package name */
    private static int f6434f = 0;

    /* renamed from: g, reason: collision with root package name */
    private static int f6435g = 10;

    public class AnimationTask extends TimerTask {
        public AnimationTask() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            Message message = new Message();
            message.what = 1;
            WearMapView.this.mTimerHandler.sendMessage(message);
        }
    }

    public interface OnDismissCallback {
        void onDismiss();

        void onNotify();
    }

    public enum ScreenShape {
        ROUND,
        RECTANGLE,
        UNDETECTED
    }

    class a implements c.InterfaceC0078c {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ CustomMapStyleCallBack f6457a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ MapCustomStyleOptions f6458b;

        a(CustomMapStyleCallBack customMapStyleCallBack, MapCustomStyleOptions mapCustomStyleOptions) {
            this.f6457a = customMapStyleCallBack;
            this.f6458b = mapCustomStyleOptions;
        }

        @Override // com.baidu.mapsdkplatform.comapi.map.c.InterfaceC0078c
        public void onCustomMapStyleLoadFailed(int i8, String str, String str2) {
            CustomMapStyleCallBack customMapStyleCallBack = this.f6457a;
            if ((customMapStyleCallBack == null || !customMapStyleCallBack.onCustomMapStyleLoadFailed(i8, str, str2)) && !WearMapView.this.H) {
                WearMapView.this.a(str2, this.f6458b);
            }
        }

        @Override // com.baidu.mapsdkplatform.comapi.map.c.InterfaceC0078c
        public void onCustomMapStyleLoadSuccess(boolean z7, String str) {
            CustomMapStyleCallBack customMapStyleCallBack = this.f6457a;
            if ((customMapStyleCallBack == null || !customMapStyleCallBack.onCustomMapStyleLoadSuccess(z7, str)) && !TextUtils.isEmpty(str)) {
                WearMapView.this.a(str, "");
                WearMapView.this.setMapCustomStyleEnable(true);
            }
        }

        @Override // com.baidu.mapsdkplatform.comapi.map.c.InterfaceC0078c
        public void onPreLoadLastCustomMapStyle(String str) {
            CustomMapStyleCallBack customMapStyleCallBack = this.f6457a;
            if (customMapStyleCallBack == null || !customMapStyleCallBack.onPreLoadLastCustomMapStyle(str)) {
                WearMapView.this.H = true;
                WearMapView.this.a(str, this.f6458b);
            }
        }
    }

    class b implements w {
        b() {
        }

        @Override // com.baidu.platform.comapi.map.w
        public void a() {
        }

        @Override // com.baidu.platform.comapi.map.w
        public void b() {
        }

        @Override // com.baidu.platform.comapi.map.w
        public void c() {
        }

        @Override // com.baidu.platform.comapi.map.w
        public void d() {
        }

        @Override // com.baidu.platform.comapi.map.w
        public void e(GeoPoint geoPoint) {
        }

        @Override // com.baidu.platform.comapi.map.w
        public void f(GeoPoint geoPoint) {
        }

        @Override // com.baidu.platform.comapi.map.w
        public void g(GeoPoint geoPoint) {
        }

        @Override // com.baidu.platform.comapi.map.w
        public void onFirstMapTileLoaded() {
        }

        @Override // com.baidu.platform.comapi.map.w
        public void a(MotionEvent motionEvent) {
        }

        @Override // com.baidu.platform.comapi.map.w
        public void b(GeoPoint geoPoint) {
        }

        @Override // com.baidu.platform.comapi.map.w
        public void c(s sVar) {
        }

        @Override // com.baidu.platform.comapi.map.w
        public void d(GeoPoint geoPoint) {
        }

        @Override // com.baidu.platform.comapi.map.w
        public void a(s sVar) {
        }

        @Override // com.baidu.platform.comapi.map.w
        public void b(String str) {
        }

        @Override // com.baidu.platform.comapi.map.w
        public void c(GeoPoint geoPoint) {
        }

        @Override // com.baidu.platform.comapi.map.w
        public boolean d(Point point, Point point2, s sVar) {
            return false;
        }

        @Override // com.baidu.platform.comapi.map.w
        public void a(GeoPoint geoPoint) {
        }

        @Override // com.baidu.platform.comapi.map.w
        public boolean b(Point point, Point point2, s sVar) {
            return false;
        }

        @Override // com.baidu.platform.comapi.map.w
        public boolean c(Point point, Point point2, s sVar) {
            return false;
        }

        @Override // com.baidu.platform.comapi.map.w
        public void a(GL10 gl10, s sVar) {
        }

        @Override // com.baidu.platform.comapi.map.w
        public void b(s sVar) {
            if (WearMapView.this.f6437i == null || WearMapView.this.f6437i.getBaseMap() == null) {
                return;
            }
            float zoomLevel = WearMapView.this.f6437i.getZoomLevel();
            if (zoomLevel < WearMapView.this.f6437i.getController().mMinZoomLevel) {
                zoomLevel = WearMapView.this.f6437i.getController().mMinZoomLevel;
            } else if (zoomLevel > WearMapView.this.f6437i.getController().mMaxZoomLevel) {
                zoomLevel = WearMapView.this.f6437i.getController().mMaxZoomLevel;
            }
            if (Math.abs(WearMapView.this.A - zoomLevel) > 0.0f) {
                int intValue = ((Integer) WearMapView.f6436h.get(Math.round(zoomLevel))).intValue();
                int zoomUnitsInMeter = ((int) (intValue / WearMapView.this.f6437i.getController().getZoomUnitsInMeter())) / 2;
                WearMapView.this.f6449u.setPadding(zoomUnitsInMeter, 0, zoomUnitsInMeter, 0);
                String format = intValue >= 1000 ? String.format(" %d公里 ", Integer.valueOf(intValue / 1000)) : String.format(" %d米 ", Integer.valueOf(intValue));
                WearMapView.this.f6447s.setText(format);
                WearMapView.this.f6448t.setText(format);
                WearMapView.this.A = zoomLevel;
            }
            WearMapView.this.requestLayout();
        }

        @Override // com.baidu.platform.comapi.map.w
        public void a(boolean z7) {
        }

        @Override // com.baidu.platform.comapi.map.w
        public void a(boolean z7, int i8) {
        }

        @Override // com.baidu.platform.comapi.map.w
        public boolean a(Point point, Point point2, s sVar) {
            return false;
        }

        @Override // com.baidu.platform.comapi.map.w
        public boolean a(Point point, s sVar) {
            return false;
        }

        @Override // com.baidu.platform.comapi.map.w
        public boolean a(MotionEvent motionEvent, float f8, float f9, s sVar) {
            return false;
        }

        @Override // com.baidu.platform.comapi.map.w
        public boolean a(BmDrawItem bmDrawItem) {
            return false;
        }

        @Override // com.baidu.platform.comapi.map.w
        public boolean a(String str) {
            return false;
        }
    }

    class c implements View.OnClickListener {
        c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            s y7 = WearMapView.this.f6437i.getBaseMap().y();
            y7.f8148a -= 1.0f;
            WearMapView.this.f6437i.getBaseMap().a(y7, 300);
        }
    }

    class d implements View.OnClickListener {
        d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            s y7 = WearMapView.this.f6437i.getBaseMap().y();
            y7.f8148a += 1.0f;
            WearMapView.this.f6437i.getBaseMap().a(y7, 300);
        }
    }

    class e extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f6463a;

        e(View view) {
            this.f6463a = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f6463a.setVisibility(4);
            super.onAnimationEnd(animator);
        }
    }

    @SuppressLint({"HandlerLeak"})
    private class f extends Handler {

        /* renamed from: a, reason: collision with root package name */
        private final WeakReference<Context> f6465a;

        public f(Context context) {
            this.f6465a = new WeakReference<>(context);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (this.f6465a.get() == null) {
                return;
            }
            super.handleMessage(message);
            if (message.what == 1 && WearMapView.this.f6441m != null) {
                WearMapView.this.a(true);
            }
        }
    }

    static {
        SparseArray<Integer> sparseArray = new SparseArray<>();
        f6436h = sparseArray;
        sparseArray.append(3, 2000000);
        sparseArray.append(4, 1000000);
        sparseArray.append(5, 500000);
        sparseArray.append(6, 200000);
        sparseArray.append(7, Integer.valueOf(AacUtil.AAC_LC_MAX_RATE_BYTES_PER_SECOND));
        sparseArray.append(8, 50000);
        sparseArray.append(9, 25000);
        sparseArray.append(10, 20000);
        sparseArray.append(11, 10000);
        sparseArray.append(12, 5000);
        sparseArray.append(13, 2000);
        sparseArray.append(14, 1000);
        sparseArray.append(15, 500);
        sparseArray.append(16, 200);
        sparseArray.append(17, 100);
        sparseArray.append(18, 50);
        sparseArray.append(19, 20);
        sparseArray.append(20, 10);
        sparseArray.append(21, 5);
        sparseArray.append(22, 2);
    }

    public WearMapView(Context context) {
        super(context);
        this.f6442n = true;
        this.f6450v = true;
        this.f6452x = ScreenShape.ROUND;
        this.f6453y = true;
        this.f6454z = true;
        this.H = false;
        a(context, (BaiduMapOptions) null);
    }

    @Deprecated
    public static void setCustomMapStylePath(String str) {
        if (str == null || str.length() == 0) {
            throw new RuntimeException("BDMapSDKException: customMapStylePath String is illegal");
        }
        if (!new File(str).exists()) {
            throw new RuntimeException("BDMapSDKException: please check whether the customMapStylePath file exits");
        }
        f6430b = str;
    }

    @Deprecated
    public static void setIconCustom(int i8) {
        f6432d = i8;
    }

    @Deprecated
    public static void setLoadCustomMapStyleFileMode(int i8) {
        f6431c = i8;
    }

    @Deprecated
    public static void setMapCustomEnable(boolean z7) {
    }

    private static void setScreenSize(Context context) {
        ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof MapViewLayoutParams) {
            super.addView(view, layoutParams);
        }
    }

    public final BaiduMap getMap() {
        BaiduMap baiduMap = this.f6438j;
        baiduMap.f5643i0 = this;
        return baiduMap;
    }

    public final int getMapLevel() {
        return f6436h.get((int) this.f6437i.getZoomLevel()).intValue();
    }

    public int getScaleControlViewHeight() {
        return this.F;
    }

    public int getScaleControlViewWidth() {
        return this.G;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        if (windowInsets.isRound()) {
            this.f6452x = ScreenShape.ROUND;
        } else {
            this.f6452x = ScreenShape.RECTANGLE;
        }
        return windowInsets;
    }

    public void onCreate(Context context, Bundle bundle) {
        if (bundle == null) {
            return;
        }
        MapStatus mapStatus = (MapStatus) bundle.getParcelable("mapstatus");
        if (this.f6443o != null) {
            this.f6443o = (Point) bundle.getParcelable("scalePosition");
        }
        if (this.f6444p != null) {
            this.f6444p = (Point) bundle.getParcelable("zoomPosition");
        }
        this.f6453y = bundle.getBoolean("mZoomControlEnabled");
        this.f6454z = bundle.getBoolean("mScaleControlEnabled");
        setPadding(bundle.getInt("paddingLeft"), bundle.getInt("paddingTop"), bundle.getInt("paddingRight"), bundle.getInt("paddingBottom"));
        a(context, new BaiduMapOptions().mapStatus(mapStatus));
    }

    public final void onDestroy() {
        if (this.f6451w != null) {
            this.f6437i.unInit();
        }
        Bitmap bitmap = this.f6440l;
        if (bitmap != null && !bitmap.isRecycled()) {
            this.f6440l.recycle();
            this.f6440l = null;
        }
        this.f6441m.d();
        BMapManager.destroy();
        com.baidu.mapsdkplatform.comapi.map.e.a();
        AnimationTask animationTask = this.mTask;
        if (animationTask != null) {
            animationTask.cancel();
        }
        this.f6451w = null;
    }

    public final void onDismiss() {
        removeAllViews();
    }

    public final void onEnterAmbient(Bundle bundle) {
        a(0);
    }

    public void onExitAmbient() {
        a(1);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action == 1) {
                this.mTimer = new Timer();
                AnimationTask animationTask = this.mTask;
                if (animationTask != null) {
                    animationTask.cancel();
                }
                AnimationTask animationTask2 = new AnimationTask();
                this.mTask = animationTask2;
                this.mTimer.schedule(animationTask2, 5000L);
            }
        } else if (this.f6441m.getVisibility() == 0) {
            Timer timer = this.mTimer;
            if (timer != null) {
                if (this.mTask != null) {
                    timer.cancel();
                    this.mTask.cancel();
                }
                this.mTimer = null;
                this.mTask = null;
            }
        } else if (this.f6441m.getVisibility() == 4) {
            if (this.mTimer != null) {
                AnimationTask animationTask3 = this.mTask;
                if (animationTask3 != null) {
                    animationTask3.cancel();
                }
                this.mTimer.cancel();
                this.mTask = null;
                this.mTimer = null;
            }
            a(false);
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    @TargetApi(20)
    protected final void onLayout(boolean z7, int i8, int i9, int i10, int i11) {
        float f8;
        float f9;
        int i12;
        int i13;
        int i14;
        int i15;
        int childCount = getChildCount();
        a(this.f6439k);
        if (((getWidth() - this.B) - this.C) - this.f6439k.getMeasuredWidth() <= 0 || ((getHeight() - this.D) - this.E) - this.f6439k.getMeasuredHeight() <= 0) {
            this.B = 0;
            this.C = 0;
            this.E = 0;
            this.D = 0;
            f8 = 1.0f;
            f9 = 1.0f;
        } else {
            f8 = ((getWidth() - this.B) - this.C) / getWidth();
            f9 = ((getHeight() - this.D) - this.E) / getHeight();
        }
        for (int i16 = 0; i16 < childCount; i16++) {
            View childAt = getChildAt(i16);
            View view = this.f6437i;
            if (childAt == view) {
                view.layout(0, 0, getWidth(), getHeight());
            } else if (childAt == this.f6439k) {
                int i17 = (int) (this.E + (12.0f * f9));
                if (this.f6452x == ScreenShape.ROUND) {
                    a(this.f6441m);
                    int i18 = f6433e / 2;
                    i14 = a(i18, this.f6441m.getMeasuredWidth() / 2);
                    i15 = ((f6433e / 2) - a(i18, i18 - i14)) + f6435g;
                } else {
                    i14 = 0;
                    i15 = 0;
                }
                int i19 = (f6434f - i14) - i17;
                int measuredHeight = i19 - this.f6439k.getMeasuredHeight();
                int i20 = f6433e - i15;
                this.f6439k.layout(i20 - this.f6439k.getMeasuredWidth(), measuredHeight, i20, i19);
            } else {
                y yVar = this.f6441m;
                if (childAt == yVar) {
                    if (yVar.c()) {
                        a(this.f6441m);
                        Point point = this.f6444p;
                        if (point == null) {
                            int a8 = (int) ((12.0f * f9) + this.D + (this.f6452x == ScreenShape.ROUND ? a(f6434f / 2, this.f6441m.getMeasuredWidth() / 2) : 0));
                            int measuredWidth = (f6433e - this.f6441m.getMeasuredWidth()) / 2;
                            this.f6441m.layout(measuredWidth, a8, this.f6441m.getMeasuredWidth() + measuredWidth, this.f6441m.getMeasuredHeight() + a8);
                        } else {
                            y yVar2 = this.f6441m;
                            int i21 = point.x;
                            yVar2.layout(i21, point.y, yVar2.getMeasuredWidth() + i21, this.f6444p.y + this.f6441m.getMeasuredHeight());
                        }
                    }
                } else if (childAt == this.f6445q) {
                    if (this.f6452x == ScreenShape.ROUND) {
                        a(yVar);
                        int i22 = f6433e / 2;
                        i12 = a(i22, this.f6441m.getMeasuredWidth() / 2);
                        i13 = ((f6433e / 2) - a(i22, i22 - i12)) + f6435g;
                    } else {
                        i12 = 0;
                        i13 = 0;
                    }
                    a(this.f6445q);
                    Point point2 = this.f6443o;
                    if (point2 == null) {
                        this.G = this.f6445q.getMeasuredWidth();
                        this.F = this.f6445q.getMeasuredHeight();
                        int i23 = (int) (this.B + (5.0f * f8) + i13);
                        int i24 = (f6434f - ((int) (this.E + (12.0f * f9)))) - i12;
                        this.f6445q.layout(i23, i24 - this.f6445q.getMeasuredHeight(), this.G + i23, i24);
                    } else {
                        RelativeLayout relativeLayout = this.f6445q;
                        int i25 = point2.x;
                        relativeLayout.layout(i25, point2.y, relativeLayout.getMeasuredWidth() + i25, this.f6443o.y + this.f6445q.getMeasuredHeight());
                    }
                } else {
                    View view2 = this.f6446r;
                    if (childAt == view2) {
                        a(view2);
                        this.f6446r.layout(0, 0, this.f6446r.getMeasuredWidth(), f6434f);
                    } else {
                        ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                        if (layoutParams instanceof MapViewLayoutParams) {
                            MapViewLayoutParams mapViewLayoutParams = (MapViewLayoutParams) layoutParams;
                            Point a9 = mapViewLayoutParams.f6010c == MapViewLayoutParams.ELayoutMode.absoluteMode ? mapViewLayoutParams.f6009b : this.f6437i.getBaseMap() != null ? this.f6437i.getBaseMap().a(CoordUtil.ll2mc(mapViewLayoutParams.f6008a)) : new Point();
                            a(childAt);
                            int measuredWidth2 = childAt.getMeasuredWidth();
                            int measuredHeight2 = childAt.getMeasuredHeight();
                            int i26 = (int) (a9.x - (mapViewLayoutParams.f6011d * measuredWidth2));
                            int i27 = ((int) (a9.y - (mapViewLayoutParams.f6012e * measuredHeight2))) + mapViewLayoutParams.f6013f;
                            childAt.layout(i26, i27, measuredWidth2 + i26, measuredHeight2 + i27);
                        }
                    }
                }
            }
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        BaiduMap baiduMap;
        if (bundle == null || (baiduMap = this.f6438j) == null) {
            return;
        }
        bundle.putParcelable("mapstatus", baiduMap.getMapStatus());
        Point point = this.f6443o;
        if (point != null) {
            bundle.putParcelable("scalePosition", point);
        }
        Point point2 = this.f6444p;
        if (point2 != null) {
            bundle.putParcelable("zoomPosition", point2);
        }
        bundle.putBoolean("mZoomControlEnabled", this.f6453y);
        bundle.putBoolean("mScaleControlEnabled", this.f6454z);
        bundle.putInt("paddingLeft", this.B);
        bundle.putInt("paddingTop", this.D);
        bundle.putInt("paddingRight", this.C);
        bundle.putInt("paddingBottom", this.E);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        if (view == this.f6439k) {
            return;
        }
        super.removeView(view);
    }

    public void setCustomStyleFilePathAndMode(String str, int i8) {
    }

    public void setMapCustomStyle(MapCustomStyleOptions mapCustomStyleOptions, CustomMapStyleCallBack customMapStyleCallBack) {
        if (mapCustomStyleOptions == null) {
            return;
        }
        String customMapStyleId = mapCustomStyleOptions.getCustomMapStyleId();
        if (customMapStyleId != null && !customMapStyleId.isEmpty()) {
            com.baidu.mapsdkplatform.comapi.map.c.a().a(this.f6451w, customMapStyleId, new a(customMapStyleCallBack, mapCustomStyleOptions));
            return;
        }
        String localCustomStyleFilePath = mapCustomStyleOptions.getLocalCustomStyleFilePath();
        if (localCustomStyleFilePath == null || localCustomStyleFilePath.isEmpty()) {
            return;
        }
        a(localCustomStyleFilePath, "");
    }

    public void setMapCustomStyleEnable(boolean z7) {
    }

    public void setMapCustomStylePath(String str) {
        a(str, "");
    }

    public void setOnDismissCallbackListener(OnDismissCallback onDismissCallback) {
        SwipeDismissView swipeDismissView = this.f6446r;
        if (swipeDismissView == null) {
            return;
        }
        swipeDismissView.setCallback(onDismissCallback);
    }

    @Override // android.view.View
    public void setPadding(int i8, int i9, int i10, int i11) {
        this.B = i8;
        this.D = i9;
        this.C = i10;
        this.E = i11;
    }

    public void setScaleControlPosition(Point point) {
        int i8;
        if (point != null && (i8 = point.x) >= 0 && point.y >= 0 && i8 <= getWidth() && point.y <= getHeight()) {
            this.f6443o = point;
            requestLayout();
        }
    }

    public void setShape(ScreenShape screenShape) {
        this.f6452x = screenShape;
    }

    public void setViewAnimitionEnable(boolean z7) {
        this.f6442n = z7;
    }

    public void setZoomControlsPosition(Point point) {
        int i8;
        if (point != null && (i8 = point.x) >= 0 && point.y >= 0 && i8 <= getWidth() && point.y <= getHeight()) {
            this.f6444p = point;
            requestLayout();
        }
    }

    public void showScaleControl(boolean z7) {
        this.f6445q.setVisibility(z7 ? 0 : 8);
        this.f6454z = z7;
    }

    public void showZoomControls(boolean z7) {
        if (this.f6441m.c()) {
            this.f6441m.setVisibility(z7 ? 0 : 8);
            this.f6453y = z7;
        }
    }

    private void d(Context context) {
        y yVar = new y(context, true);
        this.f6441m = yVar;
        if (yVar.c()) {
            this.f6441m.setOnZoomOutClickListener(new c());
            this.f6441m.setOnZoomInClickListener(new d());
            addView(this.f6441m);
        }
    }

    private void e() {
        if (this.f6437i != null && this.f6450v) {
            b();
            this.f6450v = false;
        }
    }

    private void b(Context context) {
        this.f6445q = new RelativeLayout(context);
        this.f6445q.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        this.f6447s = new TextView(context);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(14);
        this.f6447s.setTextColor(Color.parseColor("#FFFFFF"));
        this.f6447s.setTextSize(2, 11.0f);
        TextView textView = this.f6447s;
        textView.setTypeface(textView.getTypeface(), 1);
        this.f6447s.setLayoutParams(layoutParams);
        this.f6447s.setId(Integer.MAX_VALUE);
        this.f6445q.addView(this.f6447s);
        this.f6448t = new TextView(context);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams2.width = -2;
        layoutParams2.height = -2;
        layoutParams2.addRule(14);
        this.f6448t.setTextColor(Color.parseColor("#000000"));
        this.f6448t.setTextSize(2, 11.0f);
        this.f6448t.setLayoutParams(layoutParams2);
        this.f6445q.addView(this.f6448t);
        this.f6449u = new ImageView(context);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams3.width = -2;
        layoutParams3.height = -2;
        layoutParams3.addRule(14);
        layoutParams3.addRule(3, this.f6447s.getId());
        this.f6449u.setLayoutParams(layoutParams3);
        Bitmap a8 = com.baidu.mapsdkplatform.comapi.commonutils.a.a("icon_scale.9.png", context);
        byte[] ninePatchChunk = a8.getNinePatchChunk();
        NinePatch.isNinePatchChunk(ninePatchChunk);
        this.f6449u.setBackgroundDrawable(new NinePatchDrawable(a8, ninePatchChunk, new Rect(), null));
        this.f6445q.addView(this.f6449u);
        addView(this.f6445q);
    }

    private void c(Context context) {
        this.f6446r = new SwipeDismissView(context, this);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams((int) ((context.getResources().getDisplayMetrics().density * 34.0f) + 0.5f), f6434f);
        this.f6446r.setBackgroundColor(Color.argb(0, 0, 0, 0));
        this.f6446r.setLayoutParams(layoutParams);
        addView(this.f6446r);
    }

    public WearMapView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f6442n = true;
        this.f6450v = true;
        this.f6452x = ScreenShape.ROUND;
        this.f6453y = true;
        this.f6454z = true;
        this.H = false;
        a(context, (BaiduMapOptions) null);
    }

    private int a(int i8, int i9) {
        return i8 - ((int) Math.sqrt(Math.pow(i8, 2.0d) - Math.pow(i9, 2.0d)));
    }

    public WearMapView(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        this.f6442n = true;
        this.f6450v = true;
        this.f6452x = ScreenShape.ROUND;
        this.f6453y = true;
        this.f6454z = true;
        this.H = false;
        a(context, (BaiduMapOptions) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, MapCustomStyleOptions mapCustomStyleOptions) {
        if (!TextUtils.isEmpty(str)) {
            a(str, "");
            setMapCustomStyleEnable(true);
            return;
        }
        String localCustomStyleFilePath = mapCustomStyleOptions.getLocalCustomStyleFilePath();
        if (TextUtils.isEmpty(localCustomStyleFilePath)) {
            return;
        }
        a(localCustomStyleFilePath, "");
        setMapCustomStyleEnable(true);
    }

    private void d() {
        if (this.f6437i == null || this.f6450v) {
            return;
        }
        a();
        this.f6450v = true;
    }

    public WearMapView(Context context, BaiduMapOptions baiduMapOptions) {
        super(context);
        this.f6442n = true;
        this.f6450v = true;
        this.f6452x = ScreenShape.ROUND;
        this.f6453y = true;
        this.f6454z = true;
        this.H = false;
        a(context, baiduMapOptions);
    }

    private void a(Context context, BaiduMapOptions baiduMapOptions) {
        Point point;
        Point point2;
        setScreenSize(context);
        setOnApplyWindowInsetsListener(this);
        this.f6451w = context;
        this.mTimerHandler = new f(context);
        this.mTimer = new Timer();
        AnimationTask animationTask = this.mTask;
        if (animationTask != null) {
            animationTask.cancel();
        }
        AnimationTask animationTask2 = new AnimationTask();
        this.mTask = animationTask2;
        this.mTimer.schedule(animationTask2, 5000L);
        com.baidu.mapsdkplatform.comapi.map.e.c();
        BMapManager.init();
        a(context, baiduMapOptions, f6430b);
        this.f6437i.getController().set3DGestureEnable(false);
        this.f6437i.getController().setOverlookGestureEnable(false);
        a(context);
        d(context);
        c(context);
        if (baiduMapOptions != null && !baiduMapOptions.f5697h) {
            this.f6441m.setVisibility(4);
        }
        b(context);
        if (baiduMapOptions != null && !baiduMapOptions.f5698i) {
            this.f6445q.setVisibility(4);
        }
        if (baiduMapOptions != null && (point2 = baiduMapOptions.f5701l) != null) {
            this.f6444p = point2;
        }
        if (baiduMapOptions == null || (point = baiduMapOptions.f5700k) == null) {
            return;
        }
        this.f6443o = point;
    }

    private void b() {
        MapSurfaceView mapSurfaceView = this.f6437i;
        if (mapSurfaceView == null) {
            return;
        }
        mapSurfaceView.onForeground();
    }

    private void a(Context context, BaiduMapOptions baiduMapOptions, String str) {
        this.f6437i = new MapSurfaceView(context);
        if (baiduMapOptions != null) {
            this.f6438j = new BaiduMap(context, this.f6437i, baiduMapOptions.a());
        } else {
            this.f6438j = new BaiduMap(context, this.f6437i, (q) null);
        }
        addView(this.f6437i);
        this.f6437i.getBaseMap().a(new b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(boolean z7) {
        if (this.f6442n) {
            a(this.f6441m, z7);
        }
    }

    private void a(Context context) {
        int densityDpi = SysOSUtil.getDensityDpi();
        Bitmap a8 = com.baidu.mapsdkplatform.comapi.commonutils.a.a(densityDpi < 180 ? "logo_l.png" : "logo_h.png", context);
        if (densityDpi > 480) {
            Matrix matrix = new Matrix();
            matrix.postScale(2.0f, 2.0f);
            this.f6440l = Bitmap.createBitmap(a8, 0, 0, a8.getWidth(), a8.getHeight(), matrix, true);
        } else if (densityDpi <= 320 || densityDpi > 480) {
            this.f6440l = a8;
        } else {
            Matrix matrix2 = new Matrix();
            matrix2.postScale(1.5f, 1.5f);
            this.f6440l = Bitmap.createBitmap(a8, 0, 0, a8.getWidth(), a8.getHeight(), matrix2, true);
        }
        if (this.f6440l != null) {
            ImageView imageView = new ImageView(context);
            this.f6439k = imageView;
            imageView.setImageBitmap(this.f6440l);
            addView(this.f6439k);
        }
    }

    private void a() {
        MapSurfaceView mapSurfaceView = this.f6437i;
        if (mapSurfaceView == null) {
            return;
        }
        mapSurfaceView.onBackground();
    }

    private void a(int i8) {
        MapSurfaceView mapSurfaceView = this.f6437i;
        if (mapSurfaceView == null) {
            return;
        }
        if (i8 == 0) {
            mapSurfaceView.onPause();
            d();
        } else {
            if (i8 != 1) {
                return;
            }
            mapSurfaceView.onResume();
            e();
        }
    }

    private void a(View view) {
        int makeMeasureSpec;
        int makeMeasureSpec2;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new ViewGroup.LayoutParams(-2, -2);
        }
        int i8 = layoutParams.width;
        if (i8 > 0) {
            makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i8, 1073741824);
        } else {
            makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        }
        int i9 = layoutParams.height;
        if (i9 > 0) {
            makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i9, 1073741824);
        } else {
            makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        }
        view.measure(makeMeasureSpec, makeMeasureSpec2);
    }

    private void a(View view, boolean z7) {
        if (z7) {
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(ObjectAnimator.ofFloat(view, "TranslationY", 0.0f, -50.0f), ObjectAnimator.ofFloat(view, "alpha", 1.0f, 0.0f));
            animatorSet.addListener(new e(view));
            animatorSet.setDuration(1200L);
            animatorSet.start();
            return;
        }
        view.setVisibility(0);
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSet2.playTogether(ObjectAnimator.ofFloat(view, "TranslationY", -50.0f, 0.0f), ObjectAnimator.ofFloat(view, "alpha", 0.0f, 1.0f));
        animatorSet2.setDuration(1200L);
        animatorSet2.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, String str2) {
        MapSurfaceView mapSurfaceView = this.f6437i;
        if (mapSurfaceView == null || mapSurfaceView.getBaseMap() == null) {
            return;
        }
        if (TextUtils.isEmpty(str)) {
            Log.e(f6429a, "customStyleFilePath is empty or null, please check!");
            return;
        }
        if (!str.endsWith(".sty")) {
            Log.e(f6429a, "customStyleFile format is incorrect , please check!");
        } else if (!new File(str).exists()) {
            Log.e(f6429a, "customStyleFile does not exist , please check!");
        } else {
            this.f6437i.getBaseMap().a(str, "");
        }
    }
}
