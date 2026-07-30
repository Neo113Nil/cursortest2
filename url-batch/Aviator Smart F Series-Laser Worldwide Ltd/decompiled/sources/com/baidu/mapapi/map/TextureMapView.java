package com.baidu.mapapi.map;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.NinePatch;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.NinePatchDrawable;
import android.os.Bundle;
import android.os.Looper;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.exifinterface.media.ExifInterface;
import com.baidu.mapapi.BMapManager;
import com.baidu.mapapi.common.SysOSUtil;
import com.baidu.mapapi.map.MapViewLayoutParams;
import com.baidu.mapapi.model.CoordUtil;
import com.baidu.mapsdkplatform.comapi.map.c;
import com.baidu.mapsdkplatform.comapi.map.q;
import com.baidu.mapsdkplatform.comapi.map.s;
import com.baidu.mapsdkplatform.comapi.map.y;
import com.baidu.mapsdkplatform.comapi.util.PermissionCheck;
import com.baidu.platform.comapi.basestruct.GeoPoint;
import com.baidu.platform.comapi.bmsdk.BmDrawItem;
import com.baidu.platform.comapi.logstatistics.SDKLogFactory;
import com.baidu.platform.comapi.map.MapTextureView;
import com.baidu.platform.comapi.map.w;
import com.baidu.platform.comapi.util.h;
import com.baidu.platform.comapi.util.j;
import com.google.android.exoplayer2.audio.AacUtil;
import java.io.File;
import java.util.HashMap;
import javax.microedition.khronos.opengles.GL10;

/* loaded from: classes2.dex */
public final class TextureMapView extends ViewGroup {

    /* renamed from: a, reason: collision with root package name */
    private static final String f6336a = "TextureMapView";

    /* renamed from: b, reason: collision with root package name */
    private static String f6337b;

    /* renamed from: c, reason: collision with root package name */
    private static int f6338c;

    /* renamed from: d, reason: collision with root package name */
    private static int f6339d;

    /* renamed from: e, reason: collision with root package name */
    private static final SparseArray<Integer> f6340e;
    private int A;
    private int B;
    private int C;
    private int D;
    private boolean E;

    /* renamed from: f, reason: collision with root package name */
    private MapTextureView f6341f;

    /* renamed from: g, reason: collision with root package name */
    private BaiduMap f6342g;

    /* renamed from: h, reason: collision with root package name */
    private ImageView f6343h;

    /* renamed from: i, reason: collision with root package name */
    private Bitmap f6344i;

    /* renamed from: j, reason: collision with root package name */
    private y f6345j;

    /* renamed from: k, reason: collision with root package name */
    private Point f6346k;

    /* renamed from: l, reason: collision with root package name */
    private Point f6347l;

    /* renamed from: m, reason: collision with root package name */
    private RelativeLayout f6348m;

    /* renamed from: n, reason: collision with root package name */
    private TextView f6349n;

    /* renamed from: o, reason: collision with root package name */
    private TextView f6350o;

    /* renamed from: p, reason: collision with root package name */
    private ImageView f6351p;

    /* renamed from: q, reason: collision with root package name */
    private Context f6352q;

    /* renamed from: r, reason: collision with root package name */
    private final Object f6353r;

    /* renamed from: s, reason: collision with root package name */
    private boolean f6354s;

    /* renamed from: t, reason: collision with root package name */
    private com.baidu.mapsdkplatform.comapi.c f6355t;

    /* renamed from: u, reason: collision with root package name */
    private float f6356u;

    /* renamed from: v, reason: collision with root package name */
    private int f6357v;

    /* renamed from: w, reason: collision with root package name */
    private boolean f6358w;

    /* renamed from: x, reason: collision with root package name */
    private boolean f6359x;

    /* renamed from: y, reason: collision with root package name */
    private int f6360y;

    /* renamed from: z, reason: collision with root package name */
    private int f6361z;

    class a implements com.baidu.mapsdkplatform.comapi.c {
        a() {
        }

        @Override // com.baidu.mapsdkplatform.comapi.c
        public void a(String str) {
            synchronized (TextureMapView.this.f6353r) {
                try {
                    if (TextureMapView.this.f6354s) {
                        return;
                    }
                    if (str != null) {
                        h.b().a(str, com.baidu.platform.comjni.base.sdkauth.a.ParkingSpace.a() | com.baidu.platform.comjni.base.sdkauth.a.WaterMark.a());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    class b implements c.InterfaceC0078c {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ CustomMapStyleCallBack f6363a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ MapCustomStyleOptions f6364b;

        b(CustomMapStyleCallBack customMapStyleCallBack, MapCustomStyleOptions mapCustomStyleOptions) {
            this.f6363a = customMapStyleCallBack;
            this.f6364b = mapCustomStyleOptions;
        }

        @Override // com.baidu.mapsdkplatform.comapi.map.c.InterfaceC0078c
        public void onCustomMapStyleLoadFailed(int i8, String str, String str2) {
            CustomMapStyleCallBack customMapStyleCallBack = this.f6363a;
            if ((customMapStyleCallBack == null || !customMapStyleCallBack.onCustomMapStyleLoadFailed(i8, str, str2)) && !TextureMapView.this.E) {
                TextureMapView.this.a(str2, this.f6364b);
            }
        }

        @Override // com.baidu.mapsdkplatform.comapi.map.c.InterfaceC0078c
        public void onCustomMapStyleLoadSuccess(boolean z7, String str) {
            CustomMapStyleCallBack customMapStyleCallBack = this.f6363a;
            if ((customMapStyleCallBack == null || !customMapStyleCallBack.onCustomMapStyleLoadSuccess(z7, str)) && !TextUtils.isEmpty(str)) {
                TextureMapView.this.a(str, "");
                TextureMapView.this.setMapCustomStyleEnable(true);
            }
        }

        @Override // com.baidu.mapsdkplatform.comapi.map.c.InterfaceC0078c
        public void onPreLoadLastCustomMapStyle(String str) {
            CustomMapStyleCallBack customMapStyleCallBack = this.f6363a;
            if (customMapStyleCallBack == null || !customMapStyleCallBack.onPreLoadLastCustomMapStyle(str)) {
                TextureMapView.this.a(str, this.f6364b);
                TextureMapView.this.E = true;
            }
        }
    }

    class c implements w {
        c() {
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
            if (TextureMapView.this.f6341f == null || TextureMapView.this.f6341f.getController() == null) {
                return;
            }
            float zoomLevel = TextureMapView.this.f6341f.getZoomLevel();
            if (zoomLevel < TextureMapView.this.f6341f.getController().mMinZoomLevel) {
                zoomLevel = TextureMapView.this.f6341f.getController().mMinZoomLevel;
            } else if (zoomLevel > TextureMapView.this.f6341f.getController().mMaxZoomLevel) {
                zoomLevel = TextureMapView.this.f6341f.getController().mMaxZoomLevel;
            }
            if (Math.abs(TextureMapView.this.f6356u - zoomLevel) > 0.0f) {
                TextureMapView.this.updateScaleUI(zoomLevel);
            }
            TextureMapView.this.a();
            TextureMapView.this.requestLayout();
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

    class d implements View.OnClickListener {
        d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            float zoomLevel = TextureMapView.this.f6341f.getZoomLevel();
            float f8 = zoomLevel - 1.0f;
            double d8 = zoomLevel;
            if (Math.floor(d8) != d8) {
                f8 = (float) Math.floor(d8);
            }
            float max = Math.max(f8, TextureMapView.this.f6341f.getController().mMinZoomLevel);
            BaiduMap.mapStatusReason |= 16;
            TextureMapView.this.f6341f.setZoomLevel(max);
        }
    }

    class e implements View.OnClickListener {
        e() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            float zoomLevel = TextureMapView.this.f6341f.getZoomLevel();
            float f8 = 1.0f + zoomLevel;
            double d8 = zoomLevel;
            if (((int) Math.ceil(d8)) != ((int) zoomLevel)) {
                f8 = (float) Math.ceil(d8);
            }
            float min = Math.min(f8, TextureMapView.this.f6341f.getController().mMaxZoomLevel);
            BaiduMap.mapStatusReason |= 16;
            TextureMapView.this.f6341f.setZoomLevel(min);
        }
    }

    class f implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f6369a;

        f(View view) {
            this.f6369a = view;
        }

        @Override // java.lang.Runnable
        public void run() {
            TextureMapView.this.removeView(this.f6369a);
        }
    }

    static {
        SparseArray<Integer> sparseArray = new SparseArray<>();
        f6340e = sparseArray;
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

    public TextureMapView(Context context) {
        super(context);
        this.f6353r = new Object();
        this.f6354s = false;
        this.f6355t = new a();
        this.f6357v = LogoPosition.logoPostionleftBottom.ordinal();
        this.f6358w = true;
        this.f6359x = true;
        this.E = false;
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
        f6337b = str;
    }

    @Deprecated
    public static void setIconCustom(int i8) {
        f6339d = i8;
    }

    @Deprecated
    public static void setLoadCustomMapStyleFileMode(int i8) {
        f6338c = i8;
    }

    @Deprecated
    public static void setMapCustomEnable(boolean z7) {
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof MapViewLayoutParams) {
            if (view.getParent() != null) {
                ((ViewGroup) view.getParent()).removeView(view);
            }
            super.addView(view, layoutParams);
        }
    }

    public final LogoPosition getLogoPosition() {
        int i8 = this.f6357v;
        return i8 != 1 ? i8 != 2 ? i8 != 3 ? i8 != 4 ? i8 != 5 ? LogoPosition.logoPostionleftBottom : LogoPosition.logoPostionRightTop : LogoPosition.logoPostionRightBottom : LogoPosition.logoPostionCenterTop : LogoPosition.logoPostionCenterBottom : LogoPosition.logoPostionleftTop;
    }

    public final BaiduMap getMap() {
        BaiduMap baiduMap = this.f6342g;
        baiduMap.f5641h0 = this;
        return baiduMap;
    }

    public final int getMapLevel() {
        return f6340e.get((int) this.f6341f.getBaseMap().y().f8148a).intValue();
    }

    public Point getScaleControlPosition() {
        return this.f6346k;
    }

    public int getScaleControlViewHeight() {
        return this.C;
    }

    public int getScaleControlViewWidth() {
        return this.D;
    }

    public void onCreate(Context context, Bundle bundle) {
        if (bundle == null) {
            return;
        }
        if (this.f6346k != null) {
            this.f6346k = (Point) bundle.getParcelable("scalePosition");
        }
        if (this.f6347l != null) {
            this.f6347l = (Point) bundle.getParcelable("zoomPosition");
        }
        this.f6358w = bundle.getBoolean("mZoomControlEnabled");
        this.f6359x = bundle.getBoolean("mScaleControlEnabled");
        this.f6357v = bundle.getInt("logoPosition");
        setPadding(bundle.getInt("paddingLeft"), bundle.getInt("paddingTop"), bundle.getInt("paddingRight"), bundle.getInt("paddingBottom"));
    }

    public final void onDestroy() {
        synchronized (this.f6353r) {
            try {
                if (this.f6352q != null) {
                    this.f6341f.onDestroy();
                }
                BaiduMap baiduMap = this.f6342g;
                if (baiduMap != null) {
                    baiduMap.d();
                }
                h.a();
                this.f6354s = true;
                Bitmap bitmap = this.f6344i;
                if (bitmap != null && !bitmap.isRecycled()) {
                    this.f6344i.recycle();
                }
                com.baidu.mapsdkplatform.comapi.a.e().a(this.f6355t);
                this.f6345j.d();
                BMapManager.destroy();
                com.baidu.mapsdkplatform.comapi.map.e.a();
                this.f6352q = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    @SuppressLint({"NewApi"})
    protected final void onLayout(boolean z7, int i8, int i9, int i10, int i11) {
        float f8;
        float f9;
        int measuredHeight;
        int measuredWidth;
        int measuredWidth2;
        int childCount = getChildCount();
        a(this.f6343h);
        if (((getWidth() - this.f6360y) - this.f6361z) - this.f6343h.getMeasuredWidth() <= 0 || ((getHeight() - this.A) - this.B) - this.f6343h.getMeasuredHeight() <= 0) {
            this.f6360y = 0;
            this.f6361z = 0;
            this.B = 0;
            this.A = 0;
            f8 = 1.0f;
            f9 = 1.0f;
        } else {
            f8 = ((getWidth() - this.f6360y) - this.f6361z) / getWidth();
            f9 = ((getHeight() - this.A) - this.B) / getHeight();
        }
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (childAt != null) {
                MapTextureView mapTextureView = this.f6341f;
                if (childAt == mapTextureView) {
                    mapTextureView.layout(0, 0, getWidth(), getHeight());
                } else {
                    ImageView imageView = this.f6343h;
                    if (childAt == imageView) {
                        float f10 = f8 * 5.0f;
                        int i13 = (int) (this.f6360y + f10);
                        int i14 = (int) (this.f6361z + f10);
                        float f11 = 5.0f * f9;
                        int i15 = (int) (this.A + f11);
                        int i16 = (int) (this.B + f11);
                        int i17 = this.f6357v;
                        if (i17 == 1) {
                            measuredHeight = imageView.getMeasuredHeight() + i15;
                            measuredWidth = this.f6343h.getMeasuredWidth() + i13;
                        } else if (i17 == 2) {
                            measuredHeight = getHeight() - i16;
                            i15 = measuredHeight - this.f6343h.getMeasuredHeight();
                            i13 = (((getWidth() - this.f6343h.getMeasuredWidth()) + this.f6360y) - this.f6361z) / 2;
                            measuredWidth = (((getWidth() + this.f6343h.getMeasuredWidth()) + this.f6360y) - this.f6361z) / 2;
                        } else if (i17 != 3) {
                            if (i17 == 4) {
                                measuredHeight = getHeight() - i16;
                                i15 = measuredHeight - this.f6343h.getMeasuredHeight();
                                measuredWidth = getWidth() - i14;
                                measuredWidth2 = this.f6343h.getMeasuredWidth();
                            } else if (i17 != 5) {
                                measuredHeight = getHeight() - i16;
                                measuredWidth = this.f6343h.getMeasuredWidth() + i13;
                                i15 = measuredHeight - this.f6343h.getMeasuredHeight();
                            } else {
                                measuredHeight = i15 + imageView.getMeasuredHeight();
                                measuredWidth = getWidth() - i14;
                                measuredWidth2 = this.f6343h.getMeasuredWidth();
                            }
                            i13 = measuredWidth - measuredWidth2;
                        } else {
                            measuredHeight = i15 + imageView.getMeasuredHeight();
                            i13 = (((getWidth() - this.f6343h.getMeasuredWidth()) + this.f6360y) - this.f6361z) / 2;
                            measuredWidth = (((getWidth() + this.f6343h.getMeasuredWidth()) + this.f6360y) - this.f6361z) / 2;
                        }
                        this.f6343h.layout(i13, i15, measuredWidth, measuredHeight);
                    } else {
                        y yVar = this.f6345j;
                        if (childAt != yVar) {
                            RelativeLayout relativeLayout = this.f6348m;
                            if (childAt == relativeLayout) {
                                a(relativeLayout);
                                Point point = this.f6346k;
                                if (point == null) {
                                    this.D = this.f6348m.getMeasuredWidth();
                                    this.C = this.f6348m.getMeasuredHeight();
                                    int i18 = (int) (this.f6360y + (5.0f * f8));
                                    int height = (getHeight() - ((int) ((this.B + (f9 * 5.0f)) + 56.0f))) - this.f6343h.getMeasuredHeight();
                                    this.f6348m.layout(i18, height, this.D + i18, this.C + height);
                                } else {
                                    RelativeLayout relativeLayout2 = this.f6348m;
                                    int i19 = point.x;
                                    relativeLayout2.layout(i19, point.y, relativeLayout2.getMeasuredWidth() + i19, this.f6346k.y + this.f6348m.getMeasuredHeight());
                                }
                            } else {
                                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                                if (layoutParams instanceof MapViewLayoutParams) {
                                    MapViewLayoutParams mapViewLayoutParams = (MapViewLayoutParams) layoutParams;
                                    Point a8 = mapViewLayoutParams.f6010c == MapViewLayoutParams.ELayoutMode.absoluteMode ? mapViewLayoutParams.f6009b : this.f6341f.getBaseMap() != null ? this.f6341f.getBaseMap().a(CoordUtil.ll2mc(mapViewLayoutParams.f6008a)) : new Point();
                                    a(childAt);
                                    int measuredWidth3 = childAt.getMeasuredWidth();
                                    int measuredHeight2 = childAt.getMeasuredHeight();
                                    float f12 = mapViewLayoutParams.f6011d;
                                    float f13 = mapViewLayoutParams.f6012e;
                                    int i20 = ((int) (a8.x - (f12 * measuredWidth3))) + mapViewLayoutParams.f6014g;
                                    int i21 = ((int) (a8.y - (f13 * measuredHeight2))) + mapViewLayoutParams.f6013f;
                                    childAt.layout(i20, i21, measuredWidth3 + i20, measuredHeight2 + i21);
                                }
                            }
                        } else if (yVar.c()) {
                            a(this.f6345j);
                            Point point2 = this.f6347l;
                            if (point2 == null) {
                                int height2 = (int) (((getHeight() - 15) * f9) + this.A);
                                int width = (int) (((getWidth() - 15) * f8) + this.f6360y);
                                int measuredWidth4 = width - this.f6345j.getMeasuredWidth();
                                int measuredHeight3 = height2 - this.f6345j.getMeasuredHeight();
                                if (this.f6357v == 4) {
                                    height2 -= this.f6343h.getMeasuredHeight();
                                    measuredHeight3 -= this.f6343h.getMeasuredHeight();
                                }
                                this.f6345j.layout(measuredWidth4, measuredHeight3, width, height2);
                            } else {
                                y yVar2 = this.f6345j;
                                int i22 = point2.x;
                                yVar2.layout(i22, point2.y, yVar2.getMeasuredWidth() + i22, this.f6347l.y + this.f6345j.getMeasuredHeight());
                            }
                        }
                    }
                }
            }
        }
    }

    public final void onPause() {
        this.f6341f.onPause();
    }

    public final void onResume() {
        this.f6341f.onResume();
    }

    public void onSaveInstanceState(Bundle bundle) {
        BaiduMap baiduMap;
        if (bundle == null || (baiduMap = this.f6342g) == null) {
            return;
        }
        bundle.putParcelable("mapstatus", baiduMap.getMapStatus());
        Point point = this.f6346k;
        if (point != null) {
            bundle.putParcelable("scalePosition", point);
        }
        Point point2 = this.f6347l;
        if (point2 != null) {
            bundle.putParcelable("zoomPosition", point2);
        }
        bundle.putBoolean("mZoomControlEnabled", this.f6358w);
        bundle.putBoolean("mScaleControlEnabled", this.f6359x);
        bundle.putInt("logoPosition", this.f6357v);
        bundle.putInt("paddingLeft", this.f6360y);
        bundle.putInt("paddingTop", this.A);
        bundle.putInt("paddingRight", this.f6361z);
        bundle.putInt("paddingBottom", this.B);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        if (view == this.f6343h) {
            return;
        }
        if (c()) {
            super.removeView(view);
        } else {
            j.a(new f(view), 0L);
        }
    }

    public void setCustomStyleFilePathAndMode(String str, int i8) {
    }

    public final void setLogoPosition(LogoPosition logoPosition) {
        if (logoPosition == null) {
            this.f6357v = LogoPosition.logoPostionleftBottom.ordinal();
        } else {
            this.f6357v = logoPosition.ordinal();
        }
        requestLayout();
    }

    public void setMapCustomStyle(MapCustomStyleOptions mapCustomStyleOptions, CustomMapStyleCallBack customMapStyleCallBack) {
        if (mapCustomStyleOptions == null) {
            return;
        }
        String customMapStyleId = mapCustomStyleOptions.getCustomMapStyleId();
        if (customMapStyleId != null && !customMapStyleId.isEmpty()) {
            com.baidu.mapsdkplatform.comapi.map.c.a().a(this.f6352q, customMapStyleId, new b(customMapStyleCallBack, mapCustomStyleOptions));
            return;
        }
        String localCustomStyleFilePath = mapCustomStyleOptions.getLocalCustomStyleFilePath();
        if (localCustomStyleFilePath == null || localCustomStyleFilePath.isEmpty()) {
            return;
        }
        a(localCustomStyleFilePath, "");
    }

    public void setMapCustomStyleEnable(boolean z7) {
        MapTextureView mapTextureView = this.f6341f;
        if (mapTextureView == null || mapTextureView.getBaseMap() == null) {
            return;
        }
        this.f6341f.getBaseMap().r(z7);
    }

    public void setMapCustomStylePath(String str) {
        a(str, "");
    }

    @Override // android.view.View
    public void setPadding(int i8, int i9, int i10, int i11) {
        this.f6360y = i8;
        this.A = i9;
        this.f6361z = i10;
        this.B = i11;
    }

    public void setScaleControlPosition(Point point) {
        int i8;
        if (point != null && (i8 = point.x) >= 0 && point.y >= 0 && i8 <= getWidth() && point.y <= getHeight()) {
            this.f6346k = point;
            requestLayout();
        }
    }

    public void setZoomControlsPosition(Point point) {
        int i8;
        if (point != null && (i8 = point.x) >= 0 && point.y >= 0 && i8 <= getWidth() && point.y <= getHeight()) {
            this.f6347l = point;
            requestLayout();
        }
    }

    public void showScaleControl(boolean z7) {
        this.f6348m.setVisibility(z7 ? 0 : 8);
        this.f6359x = z7;
    }

    public void showZoomControls(boolean z7) {
        if (this.f6345j.c()) {
            this.f6345j.setVisibility(z7 ? 0 : 8);
            this.f6358w = z7;
        }
    }

    public void updateScaleUI(float f8) {
        MapTextureView mapTextureView = this.f6341f;
        if (mapTextureView == null || mapTextureView.getController() == null) {
            return;
        }
        int intValue = f6340e.get(Math.round(f8)).intValue();
        int zoomUnitsInMeter = (int) (intValue / this.f6341f.getController().getZoomUnitsInMeter());
        ImageView imageView = this.f6351p;
        if (imageView != null) {
            int i8 = zoomUnitsInMeter / 2;
            imageView.setPadding(i8, 0, i8, 0);
        }
        String format = intValue >= 1000 ? this.f6342g.getMapLanguage() == MapLanguage.ENGLISH ? String.format(" %dkm ", Integer.valueOf(intValue / 1000)) : String.format(" %d公里 ", Integer.valueOf(intValue / 1000)) : this.f6342g.getMapLanguage() == MapLanguage.ENGLISH ? String.format(" %dm ", Integer.valueOf(intValue)) : String.format(" %d米 ", Integer.valueOf(intValue));
        TextView textView = this.f6349n;
        if (textView != null) {
            textView.setText(format);
        }
        TextView textView2 = this.f6350o;
        if (textView2 != null) {
            textView2.setText(format);
        }
        this.f6356u = f8;
    }

    private boolean b() {
        try {
            Class.forName("com.baidu.bmfmap.map.FlutterTextureMapView");
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    private void c(Context context) {
        y yVar = new y(context);
        this.f6345j = yVar;
        if (yVar.c()) {
            this.f6345j.setOnZoomOutClickListener(new d());
            this.f6345j.setOnZoomInClickListener(new e());
            addView(this.f6345j);
        }
    }

    private void d() {
        HashMap hashMap = new HashMap();
        if (b()) {
            hashMap.put(ExifInterface.GPS_DIRECTION_TRUE, "1");
        } else {
            hashMap.put(ExifInterface.GPS_DIRECTION_TRUE, "0");
        }
        SDKLogFactory.getLogUsrActStatistics().addLogWithLowLevel("B", "M", "0.1", hashMap);
    }

    private void b(Context context) {
        this.f6348m = new RelativeLayout(context);
        this.f6348m.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        this.f6349n = new TextView(context);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(14);
        this.f6349n.setTextColor(Color.parseColor("#FFFFFF"));
        this.f6349n.setTextSize(2, 11.0f);
        TextView textView = this.f6349n;
        textView.setTypeface(textView.getTypeface(), 1);
        this.f6349n.setLayoutParams(layoutParams);
        this.f6349n.setId(Integer.MAX_VALUE);
        this.f6348m.addView(this.f6349n);
        this.f6350o = new TextView(context);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams2.width = -2;
        layoutParams2.height = -2;
        layoutParams2.addRule(14);
        this.f6350o.setTextColor(Color.parseColor("#000000"));
        this.f6350o.setTextSize(2, 11.0f);
        this.f6350o.setLayoutParams(layoutParams2);
        this.f6348m.addView(this.f6350o);
        this.f6351p = new ImageView(context);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams3.width = -2;
        layoutParams3.height = -2;
        layoutParams3.addRule(14);
        layoutParams3.addRule(3, this.f6349n.getId());
        this.f6351p.setLayoutParams(layoutParams3);
        Bitmap a8 = com.baidu.mapsdkplatform.comapi.commonutils.a.a("icon_scale.9.png", context);
        byte[] ninePatchChunk = a8.getNinePatchChunk();
        NinePatch.isNinePatchChunk(ninePatchChunk);
        this.f6351p.setBackgroundDrawable(new NinePatchDrawable(a8, ninePatchChunk, new Rect(), null));
        this.f6348m.addView(this.f6351p);
        addView(this.f6348m);
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

    public TextureMapView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f6353r = new Object();
        this.f6354s = false;
        this.f6355t = new a();
        this.f6357v = LogoPosition.logoPostionleftBottom.ordinal();
        this.f6358w = true;
        this.f6359x = true;
        this.E = false;
        a(context, (BaiduMapOptions) null);
    }

    private boolean c() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    public TextureMapView(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        this.f6353r = new Object();
        this.f6354s = false;
        this.f6355t = new a();
        this.f6357v = LogoPosition.logoPostionleftBottom.ordinal();
        this.f6358w = true;
        this.f6359x = true;
        this.E = false;
        a(context, (BaiduMapOptions) null);
    }

    private void a(Context context, BaiduMapOptions baiduMapOptions) {
        Point point;
        Point point2;
        LogoPosition logoPosition;
        setBackgroundColor(-1);
        this.f6352q = context;
        com.baidu.mapsdkplatform.comapi.map.e.c();
        BMapManager.init();
        if (SysOSUtil.getAuthToken() != null) {
            synchronized (this.f6353r) {
                h.b().a(SysOSUtil.getAuthToken(), com.baidu.platform.comjni.base.sdkauth.a.ParkingSpace.a());
                this.f6354s = false;
            }
        } else {
            com.baidu.mapsdkplatform.comapi.a.e().b(this.f6355t);
            PermissionCheck.permissionCheck();
        }
        a(context, baiduMapOptions, f6337b, f6339d);
        a(context);
        c(context);
        if (baiduMapOptions != null && !baiduMapOptions.f5697h) {
            this.f6345j.setVisibility(4);
        }
        b(context);
        if (baiduMapOptions != null && !baiduMapOptions.f5698i) {
            this.f6348m.setVisibility(4);
        }
        if (baiduMapOptions != null && (logoPosition = baiduMapOptions.f5699j) != null) {
            this.f6357v = logoPosition.ordinal();
        }
        if (baiduMapOptions != null && (point2 = baiduMapOptions.f5701l) != null) {
            this.f6347l = point2;
        }
        if (baiduMapOptions != null && (point = baiduMapOptions.f5700k) != null) {
            this.f6346k = point;
        }
        d();
    }

    public TextureMapView(Context context, BaiduMapOptions baiduMapOptions) {
        super(context);
        this.f6353r = new Object();
        this.f6354s = false;
        this.f6355t = new a();
        this.f6357v = LogoPosition.logoPostionleftBottom.ordinal();
        this.f6358w = true;
        this.f6359x = true;
        this.E = false;
        a(context, baiduMapOptions);
    }

    private void a(Context context, BaiduMapOptions baiduMapOptions, String str, int i8) {
        MapTextureView mapTextureView = new MapTextureView(context);
        this.f6341f = mapTextureView;
        addView(mapTextureView);
        if (baiduMapOptions != null) {
            this.f6342g = new BaiduMap(context, this.f6341f, baiduMapOptions.a());
        } else {
            this.f6342g = new BaiduMap(context, this.f6341f, (q) null);
        }
        this.f6341f.getBaseMap().a(new c());
    }

    private void a(Context context) {
        int densityDpi = SysOSUtil.getDensityDpi();
        Bitmap a8 = com.baidu.mapsdkplatform.comapi.commonutils.a.a(densityDpi < 180 ? "logo_l.png" : "logo_h.png", context);
        if (densityDpi > 480) {
            Matrix matrix = new Matrix();
            matrix.postScale(2.0f, 2.0f);
            this.f6344i = Bitmap.createBitmap(a8, 0, 0, a8.getWidth(), a8.getHeight(), matrix, true);
        } else if (densityDpi <= 320 || densityDpi > 480) {
            this.f6344i = a8;
        } else {
            Matrix matrix2 = new Matrix();
            matrix2.postScale(1.5f, 1.5f);
            this.f6344i = Bitmap.createBitmap(a8, 0, 0, a8.getWidth(), a8.getHeight(), matrix2, true);
        }
        if (this.f6344i != null) {
            ImageView imageView = new ImageView(context);
            this.f6343h = imageView;
            imageView.setImageBitmap(this.f6344i);
            addView(this.f6343h);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        y yVar = this.f6345j;
        if (yVar == null || !yVar.c()) {
            return;
        }
        float f8 = this.f6341f.getBaseMap().y().f8148a;
        this.f6345j.setIsZoomOutEnabled(f8 > this.f6341f.getBaseMap().f8052e);
        this.f6345j.setIsZoomInEnabled(f8 < this.f6341f.getBaseMap().f8051d);
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

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, String str2) {
        MapTextureView mapTextureView = this.f6341f;
        if (mapTextureView == null || mapTextureView.getBaseMap() == null) {
            return;
        }
        if (TextUtils.isEmpty(str)) {
            Log.e(f6336a, "customStyleFilePath is empty or null, please check!");
            return;
        }
        if (!str.endsWith(".sty")) {
            Log.e(f6336a, "customStyleFile format is incorrect , please check!");
        } else if (!new File(str).exists()) {
            Log.e(f6336a, "customStyleFile does not exist , please check!");
        } else {
            this.f6341f.getBaseMap().a(str, str2);
        }
    }
}
