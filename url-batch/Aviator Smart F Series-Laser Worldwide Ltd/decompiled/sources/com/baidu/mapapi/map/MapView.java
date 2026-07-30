package com.baidu.mapapi.map;

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
import android.util.SparseIntArray;
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
import com.baidu.platform.comapi.map.MapSurfaceView;
import com.baidu.platform.comapi.map.w;
import com.baidu.platform.comapi.util.h;
import com.baidu.platform.comapi.util.j;
import com.google.android.exoplayer2.audio.AacUtil;
import com.google.android.gms.common.internal.ImagesContract;
import java.io.File;
import java.util.HashMap;
import javax.microedition.khronos.opengles.GL10;

/* loaded from: classes2.dex */
public final class MapView extends ViewGroup {

    /* renamed from: a, reason: collision with root package name */
    private static final String f5973a = "MapView";

    /* renamed from: b, reason: collision with root package name */
    private static String f5974b;

    /* renamed from: c, reason: collision with root package name */
    private static int f5975c;

    /* renamed from: d, reason: collision with root package name */
    private static int f5976d;

    /* renamed from: e, reason: collision with root package name */
    private static final SparseIntArray f5977e;
    private int A;
    private int B;
    private int C;
    private int D;
    private boolean E;

    /* renamed from: f, reason: collision with root package name */
    private MapSurfaceView f5978f;

    /* renamed from: g, reason: collision with root package name */
    private BaiduMap f5979g;

    /* renamed from: h, reason: collision with root package name */
    private ImageView f5980h;

    /* renamed from: i, reason: collision with root package name */
    private Bitmap f5981i;

    /* renamed from: j, reason: collision with root package name */
    private y f5982j;

    /* renamed from: k, reason: collision with root package name */
    private Point f5983k;

    /* renamed from: l, reason: collision with root package name */
    private Point f5984l;

    /* renamed from: m, reason: collision with root package name */
    private RelativeLayout f5985m;

    /* renamed from: n, reason: collision with root package name */
    private TextView f5986n;

    /* renamed from: o, reason: collision with root package name */
    private TextView f5987o;

    /* renamed from: p, reason: collision with root package name */
    private ImageView f5988p;

    /* renamed from: q, reason: collision with root package name */
    private Context f5989q;

    /* renamed from: r, reason: collision with root package name */
    private final Object f5990r;

    /* renamed from: s, reason: collision with root package name */
    private boolean f5991s;

    /* renamed from: t, reason: collision with root package name */
    private com.baidu.mapsdkplatform.comapi.c f5992t;

    /* renamed from: u, reason: collision with root package name */
    private int f5993u;

    /* renamed from: v, reason: collision with root package name */
    private boolean f5994v;

    /* renamed from: w, reason: collision with root package name */
    private boolean f5995w;

    /* renamed from: x, reason: collision with root package name */
    private float f5996x;

    /* renamed from: y, reason: collision with root package name */
    private int f5997y;

    /* renamed from: z, reason: collision with root package name */
    private int f5998z;

    class a implements com.baidu.mapsdkplatform.comapi.c {
        a() {
        }

        @Override // com.baidu.mapsdkplatform.comapi.c
        public void a(String str) {
            synchronized (MapView.this.f5990r) {
                try {
                    if (MapView.this.f5991s) {
                        return;
                    }
                    if (str != null) {
                        h.b().a(str, com.baidu.platform.comjni.base.sdkauth.a.ParkingSpace.a());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    class b implements c.InterfaceC0078c {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ CustomMapStyleCallBack f6000a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ MapCustomStyleOptions f6001b;

        b(CustomMapStyleCallBack customMapStyleCallBack, MapCustomStyleOptions mapCustomStyleOptions) {
            this.f6000a = customMapStyleCallBack;
            this.f6001b = mapCustomStyleOptions;
        }

        @Override // com.baidu.mapsdkplatform.comapi.map.c.InterfaceC0078c
        public void onCustomMapStyleLoadFailed(int i8, String str, String str2) {
            HashMap hashMap = new HashMap();
            hashMap.put("O", ImagesContract.LOCAL);
            hashMap.put(ExifInterface.LONGITUDE_EAST, "0");
            SDKLogFactory.getLogUsrActStatistics().addLogWithLowLevel("B", "CS", "0", hashMap);
            CustomMapStyleCallBack customMapStyleCallBack = this.f6000a;
            if ((customMapStyleCallBack == null || !customMapStyleCallBack.onCustomMapStyleLoadFailed(i8, str, str2)) && !MapView.this.E) {
                MapView.this.a(str2, this.f6001b);
            }
        }

        @Override // com.baidu.mapsdkplatform.comapi.map.c.InterfaceC0078c
        public void onCustomMapStyleLoadSuccess(boolean z7, String str) {
            HashMap hashMap = new HashMap();
            hashMap.put("O", "online");
            hashMap.put(ExifInterface.LONGITUDE_EAST, "1");
            SDKLogFactory.getLogUsrActStatistics().addLogWithLowLevel("B", "CS", "0", hashMap);
            CustomMapStyleCallBack customMapStyleCallBack = this.f6000a;
            if ((customMapStyleCallBack == null || !customMapStyleCallBack.onCustomMapStyleLoadSuccess(z7, str)) && z7 && !TextUtils.isEmpty(str)) {
                MapView.this.a(str, "");
                MapView.this.setMapCustomStyleEnable(true);
            }
        }

        @Override // com.baidu.mapsdkplatform.comapi.map.c.InterfaceC0078c
        public void onPreLoadLastCustomMapStyle(String str) {
            CustomMapStyleCallBack customMapStyleCallBack = this.f6000a;
            if (customMapStyleCallBack == null || !customMapStyleCallBack.onPreLoadLastCustomMapStyle(str)) {
                MapView.this.a(str, this.f6001b);
                MapView.this.E = true;
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
            if (MapView.this.f5978f == null || MapView.this.f5978f.getController() == null) {
                return;
            }
            float zoomLevel = MapView.this.f5978f.getZoomLevel();
            if (zoomLevel < MapView.this.f5978f.getController().mMinZoomLevel) {
                zoomLevel = MapView.this.f5978f.getController().mMinZoomLevel;
            } else if (zoomLevel > MapView.this.f5978f.getController().mMaxZoomLevel) {
                zoomLevel = MapView.this.f5978f.getController().mMaxZoomLevel;
            }
            if (Math.abs(MapView.this.f5996x - zoomLevel) > 0.0f) {
                MapView.this.updateScaleUI(zoomLevel);
            }
            MapView.this.a();
            MapView.this.requestLayout();
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
            float zoomLevel = MapView.this.f5978f.getZoomLevel();
            float f8 = zoomLevel - 1.0f;
            double d8 = zoomLevel;
            if (Math.floor(d8) != d8) {
                f8 = (float) Math.floor(d8);
            }
            if (MapView.this.f5978f.getController() == null) {
                return;
            }
            float max = Math.max(f8, MapView.this.f5978f.getController().mMinZoomLevel);
            BaiduMap.mapStatusReason |= 16;
            MapView.this.f5978f.setZoomLevel(max);
        }
    }

    class e implements View.OnClickListener {
        e() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            float zoomLevel = MapView.this.f5978f.getZoomLevel();
            float f8 = 1.0f + zoomLevel;
            double d8 = zoomLevel;
            if (((int) Math.ceil(d8)) != ((int) zoomLevel)) {
                f8 = (float) Math.ceil(d8);
            }
            if (MapView.this.f5978f.getController() == null) {
                return;
            }
            float min = Math.min(f8, MapView.this.f5978f.getController().mMaxZoomLevel);
            BaiduMap.mapStatusReason |= 16;
            MapView.this.f5978f.setZoomLevel(min);
        }
    }

    class f implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f6006a;

        f(View view) {
            this.f6006a = view;
        }

        @Override // java.lang.Runnable
        public void run() {
            MapView.this.removeView(this.f6006a);
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f5977e = sparseIntArray;
        sparseIntArray.append(3, 2000000);
        sparseIntArray.append(4, 1000000);
        sparseIntArray.append(5, 500000);
        sparseIntArray.append(6, 200000);
        sparseIntArray.append(7, AacUtil.AAC_LC_MAX_RATE_BYTES_PER_SECOND);
        sparseIntArray.append(8, 50000);
        sparseIntArray.append(9, 25000);
        sparseIntArray.append(10, 20000);
        sparseIntArray.append(11, 10000);
        sparseIntArray.append(12, 5000);
        sparseIntArray.append(13, 2000);
        sparseIntArray.append(14, 1000);
        sparseIntArray.append(15, 500);
        sparseIntArray.append(16, 200);
        sparseIntArray.append(17, 100);
        sparseIntArray.append(18, 50);
        sparseIntArray.append(19, 20);
        sparseIntArray.append(20, 10);
        sparseIntArray.append(21, 5);
        sparseIntArray.append(22, 2);
        sparseIntArray.append(23, 2);
        sparseIntArray.append(24, 2);
        sparseIntArray.append(25, 2);
        sparseIntArray.append(26, 2);
    }

    public MapView(Context context) {
        super(context);
        this.f5990r = new Object();
        this.f5991s = false;
        this.f5992t = new a();
        this.f5993u = LogoPosition.logoPostionleftBottom.ordinal();
        this.f5994v = true;
        this.f5995w = true;
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
        f5974b = str;
    }

    @Deprecated
    public static void setIconCustom(int i8) {
        f5976d = i8;
    }

    @Deprecated
    public static void setLoadCustomMapStyleFileMode(int i8) {
        f5975c = i8;
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

    public void cancelRenderMap() {
    }

    public final LogoPosition getLogoPosition() {
        int i8 = this.f5993u;
        return i8 != 1 ? i8 != 2 ? i8 != 3 ? i8 != 4 ? i8 != 5 ? LogoPosition.logoPostionleftBottom : LogoPosition.logoPostionRightTop : LogoPosition.logoPostionRightBottom : LogoPosition.logoPostionCenterTop : LogoPosition.logoPostionCenterBottom : LogoPosition.logoPostionleftTop;
    }

    public final BaiduMap getMap() {
        BaiduMap baiduMap = this.f5979g;
        baiduMap.f5639g0 = this;
        return baiduMap;
    }

    public final int getMapLevel() {
        return f5977e.get(Math.round(this.f5978f.getZoomLevel()));
    }

    public Point getScaleControlPosition() {
        return this.f5983k;
    }

    public int getScaleControlViewHeight() {
        return this.C;
    }

    public int getScaleControlViewWidth() {
        return this.D;
    }

    public Point getZoomControlsPosition() {
        return this.f5984l;
    }

    public boolean handleMultiTouch(float f8, float f9, float f10, float f11) {
        return false;
    }

    public void handleTouchDown(float f8, float f9) {
    }

    public boolean handleTouchMove(float f8, float f9) {
        return false;
    }

    public boolean handleTouchUp(float f8, float f9) {
        return false;
    }

    public boolean inRangeOfView(float f8, float f9) {
        MapSurfaceView mapSurfaceView = this.f5978f;
        return mapSurfaceView != null && mapSurfaceView.inRangeOfView(f8, f9);
    }

    public boolean isSetBackgroundDraw() {
        MapSurfaceView mapSurfaceView = this.f5978f;
        if (mapSurfaceView == null) {
            return false;
        }
        return mapSurfaceView.isSetBackgroundDraw();
    }

    public boolean isShowScaleControl() {
        return this.f5995w;
    }

    public void onCreate(Context context, Bundle bundle) {
        if (bundle == null) {
            return;
        }
        if (this.f5983k != null) {
            this.f5983k = (Point) bundle.getParcelable("scalePosition");
        }
        if (this.f5984l != null) {
            this.f5984l = (Point) bundle.getParcelable("zoomPosition");
        }
        this.f5994v = bundle.getBoolean("mZoomControlEnabled");
        this.f5995w = bundle.getBoolean("mScaleControlEnabled");
        this.f5993u = bundle.getInt("logoPosition");
        setPadding(bundle.getInt("paddingLeft"), bundle.getInt("paddingTop"), bundle.getInt("paddingRight"), bundle.getInt("paddingBottom"));
    }

    public final void onDestroy() {
        synchronized (this.f5990r) {
            try {
                BaiduMap baiduMap = this.f5979g;
                if (baiduMap != null) {
                    baiduMap.d();
                }
                h.a();
                this.f5991s = true;
                MapSurfaceView mapSurfaceView = this.f5978f;
                if (mapSurfaceView != null) {
                    mapSurfaceView.unInit();
                }
                Bitmap bitmap = this.f5981i;
                if (bitmap != null && !bitmap.isRecycled()) {
                    this.f5981i.recycle();
                    this.f5981i = null;
                }
                if (f5974b != null) {
                    f5974b = null;
                }
                com.baidu.mapsdkplatform.comapi.a.e().a(this.f5992t);
                this.f5982j.d();
                BMapManager.destroy();
                com.baidu.mapsdkplatform.comapi.map.e.a();
                this.f5989q = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z7, int i8, int i9, int i10, int i11) {
        float f8;
        float f9;
        int measuredHeight;
        int measuredWidth;
        int measuredWidth2;
        int childCount = getChildCount();
        a(this.f5980h);
        if (((getWidth() - this.f5997y) - this.f5998z) - this.f5980h.getMeasuredWidth() <= 0 || ((getHeight() - this.A) - this.B) - this.f5980h.getMeasuredHeight() <= 0) {
            this.f5997y = 0;
            this.f5998z = 0;
            this.B = 0;
            this.A = 0;
            f8 = 1.0f;
            f9 = 1.0f;
        } else {
            f8 = ((getWidth() - this.f5997y) - this.f5998z) / getWidth();
            f9 = ((getHeight() - this.A) - this.B) / getHeight();
        }
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (childAt != null) {
                MapSurfaceView mapSurfaceView = this.f5978f;
                if (childAt == mapSurfaceView) {
                    mapSurfaceView.layout(0, 0, getWidth(), getHeight());
                } else {
                    ImageView imageView = this.f5980h;
                    if (childAt == imageView) {
                        float f10 = f8 * 5.0f;
                        int i13 = (int) (this.f5997y + f10);
                        int i14 = (int) (this.f5998z + f10);
                        float f11 = 5.0f * f9;
                        int i15 = (int) (this.A + f11);
                        int i16 = (int) (this.B + f11);
                        int i17 = this.f5993u;
                        if (i17 == 1) {
                            measuredHeight = imageView.getMeasuredHeight() + i15;
                            measuredWidth = this.f5980h.getMeasuredWidth() + i13;
                        } else if (i17 == 2) {
                            measuredHeight = getHeight() - i16;
                            i15 = measuredHeight - this.f5980h.getMeasuredHeight();
                            i13 = (((getWidth() - this.f5980h.getMeasuredWidth()) + this.f5997y) - this.f5998z) / 2;
                            measuredWidth = (((getWidth() + this.f5980h.getMeasuredWidth()) + this.f5997y) - this.f5998z) / 2;
                        } else if (i17 != 3) {
                            if (i17 == 4) {
                                measuredHeight = getHeight() - i16;
                                i15 = measuredHeight - this.f5980h.getMeasuredHeight();
                                measuredWidth = getWidth() - i14;
                                measuredWidth2 = this.f5980h.getMeasuredWidth();
                            } else if (i17 != 5) {
                                measuredHeight = getHeight() - i16;
                                measuredWidth = this.f5980h.getMeasuredWidth() + i13;
                                i15 = measuredHeight - this.f5980h.getMeasuredHeight();
                            } else {
                                measuredHeight = i15 + imageView.getMeasuredHeight();
                                measuredWidth = getWidth() - i14;
                                measuredWidth2 = this.f5980h.getMeasuredWidth();
                            }
                            i13 = measuredWidth - measuredWidth2;
                        } else {
                            measuredHeight = i15 + imageView.getMeasuredHeight();
                            i13 = (((getWidth() - this.f5980h.getMeasuredWidth()) + this.f5997y) - this.f5998z) / 2;
                            measuredWidth = (((getWidth() + this.f5980h.getMeasuredWidth()) + this.f5997y) - this.f5998z) / 2;
                        }
                        this.f5980h.layout(i13, i15, measuredWidth, measuredHeight);
                    } else {
                        y yVar = this.f5982j;
                        if (childAt != yVar) {
                            RelativeLayout relativeLayout = this.f5985m;
                            if (childAt == relativeLayout) {
                                a(relativeLayout);
                                Point point = this.f5983k;
                                if (point == null) {
                                    this.D = this.f5985m.getMeasuredWidth();
                                    this.C = this.f5985m.getMeasuredHeight();
                                    int i18 = (int) (this.f5997y + (5.0f * f8));
                                    int height = (getHeight() - ((int) ((this.B + (f9 * 5.0f)) + 56.0f))) - this.f5980h.getMeasuredHeight();
                                    this.f5985m.layout(i18, height, this.D + i18, this.C + height);
                                } else {
                                    RelativeLayout relativeLayout2 = this.f5985m;
                                    int i19 = point.x;
                                    relativeLayout2.layout(i19, point.y, relativeLayout2.getMeasuredWidth() + i19, this.f5983k.y + this.f5985m.getMeasuredHeight());
                                }
                            } else {
                                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                                if (layoutParams instanceof MapViewLayoutParams) {
                                    MapViewLayoutParams mapViewLayoutParams = (MapViewLayoutParams) layoutParams;
                                    Point a8 = mapViewLayoutParams.f6010c == MapViewLayoutParams.ELayoutMode.absoluteMode ? mapViewLayoutParams.f6009b : this.f5978f.getBaseMap() != null ? this.f5978f.getBaseMap().a(CoordUtil.ll2mc(mapViewLayoutParams.f6008a)) : new Point();
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
                            a(this.f5982j);
                            Point point2 = this.f5984l;
                            if (point2 == null) {
                                int height2 = (int) (((getHeight() - 15) * f9) + this.A);
                                int width = (int) (((getWidth() - 15) * f8) + this.f5997y);
                                int measuredWidth4 = width - this.f5982j.getMeasuredWidth();
                                int measuredHeight3 = height2 - this.f5982j.getMeasuredHeight();
                                if (this.f5993u == 4) {
                                    height2 -= this.f5980h.getMeasuredHeight();
                                    measuredHeight3 -= this.f5980h.getMeasuredHeight();
                                }
                                this.f5982j.layout(measuredWidth4, measuredHeight3, width, height2);
                            } else {
                                y yVar2 = this.f5982j;
                                int i22 = point2.x;
                                yVar2.layout(i22, point2.y, yVar2.getMeasuredWidth() + i22, this.f5984l.y + this.f5982j.getMeasuredHeight());
                            }
                        }
                    }
                }
            }
        }
    }

    public final void onPause() {
        this.f5978f.onPause();
    }

    public final void onResume() {
        this.f5978f.onResume();
    }

    public void onSaveInstanceState(Bundle bundle) {
        BaiduMap baiduMap;
        if (bundle == null || (baiduMap = this.f5979g) == null) {
            return;
        }
        bundle.putParcelable("mapstatus", baiduMap.getMapStatus());
        bundle.putBoolean("mZoomControlEnabled", this.f5994v);
        bundle.putBoolean("mScaleControlEnabled", this.f5995w);
        bundle.putInt("logoPosition", this.f5993u);
        bundle.putInt("paddingLeft", this.f5997y);
        bundle.putInt("paddingTop", this.A);
        bundle.putInt("paddingRight", this.f5998z);
        bundle.putInt("paddingBottom", this.B);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        if (view == this.f5980h) {
            return;
        }
        if (d()) {
            super.removeView(view);
        } else {
            j.a(new f(view), 0L);
        }
    }

    public void renderMap() {
    }

    public void setCustomStyleFilePathAndMode(String str, int i8) {
    }

    public final void setLogoPosition(LogoPosition logoPosition) {
        if (logoPosition == null) {
            this.f5993u = LogoPosition.logoPostionleftBottom.ordinal();
        } else {
            this.f5993u = logoPosition.ordinal();
        }
        requestLayout();
    }

    public void setMapCustomStyle(MapCustomStyleOptions mapCustomStyleOptions, CustomMapStyleCallBack customMapStyleCallBack) {
        if (mapCustomStyleOptions == null) {
            return;
        }
        String customMapStyleId = mapCustomStyleOptions.getCustomMapStyleId();
        if (customMapStyleId != null && !customMapStyleId.isEmpty()) {
            com.baidu.mapsdkplatform.comapi.map.c.a().a(this.f5989q, customMapStyleId, new b(customMapStyleCallBack, mapCustomStyleOptions));
            return;
        }
        String localCustomStyleFilePath = mapCustomStyleOptions.getLocalCustomStyleFilePath();
        if (localCustomStyleFilePath == null || localCustomStyleFilePath.isEmpty()) {
            return;
        }
        a(localCustomStyleFilePath, "");
        setMapCustomStyleEnable(true);
    }

    public void setMapCustomStyleEnable(boolean z7) {
        MapSurfaceView mapSurfaceView = this.f5978f;
        if (mapSurfaceView == null || mapSurfaceView.getBaseMap() == null) {
            return;
        }
        this.f5978f.getBaseMap().r(z7);
    }

    public void setMapCustomStylePath(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("O", ImagesContract.LOCAL);
        hashMap.put(ExifInterface.LONGITUDE_EAST, "1");
        SDKLogFactory.getLogUsrActStatistics().addLogWithLowLevel("B", "CS", "0", hashMap);
        a(str, "");
    }

    @Override // android.view.View
    public void setPadding(int i8, int i9, int i10, int i11) {
        this.f5997y = i8;
        this.A = i9;
        this.f5998z = i10;
        this.B = i11;
    }

    public void setScaleControlPosition(Point point) {
        int i8;
        if (point != null && (i8 = point.x) >= 0 && point.y >= 0 && i8 <= getWidth() && point.y <= getHeight()) {
            this.f5983k = point;
            requestLayout();
        }
    }

    public void setSupBackgroundDraw(boolean z7) {
        MapSurfaceView mapSurfaceView = this.f5978f;
        if (mapSurfaceView == null) {
            return;
        }
        mapSurfaceView.setSupBackgroundDraw(z7);
    }

    public void setUpViewEventToMapView(MotionEvent motionEvent) {
        this.f5978f.onTouchEvent(motionEvent);
    }

    public final void setZOrderMediaOverlay(boolean z7) {
        MapSurfaceView mapSurfaceView = this.f5978f;
        if (mapSurfaceView == null) {
            return;
        }
        mapSurfaceView.setZOrderMediaOverlay(z7);
    }

    public void setZoomControlsPosition(Point point) {
        int i8;
        if (point != null && (i8 = point.x) >= 0 && point.y >= 0 && i8 <= getWidth() && point.y <= getHeight()) {
            this.f5984l = point;
            requestLayout();
        }
    }

    public void showScaleControl(boolean z7) {
        this.f5985m.setVisibility(z7 ? 0 : 8);
        this.f5995w = z7;
    }

    public void showZoomControls(boolean z7) {
        if (this.f5982j.c()) {
            this.f5982j.setVisibility(z7 ? 0 : 8);
            this.f5994v = z7;
        }
    }

    public void updateScaleUI(float f8) {
        MapSurfaceView mapSurfaceView = this.f5978f;
        if (mapSurfaceView == null || mapSurfaceView.getController() == null) {
            return;
        }
        int i8 = f5977e.get(Math.round(f8));
        int zoomUnitsInMeter = (int) (i8 / this.f5978f.getController().getZoomUnitsInMeter());
        ImageView imageView = this.f5988p;
        if (imageView != null) {
            int i9 = zoomUnitsInMeter / 2;
            imageView.setPadding(i9, 0, i9, 0);
        }
        String format = i8 >= 1000 ? this.f5979g.getMapLanguage() == MapLanguage.ENGLISH ? String.format(" %dkm ", Integer.valueOf(i8 / 1000)) : String.format(" %d公里 ", Integer.valueOf(i8 / 1000)) : this.f5979g.getMapLanguage() == MapLanguage.ENGLISH ? String.format(" %dm ", Integer.valueOf(i8)) : String.format(" %d米 ", Integer.valueOf(i8));
        TextView textView = this.f5986n;
        if (textView != null) {
            textView.setText(format);
        }
        TextView textView2 = this.f5987o;
        if (textView2 != null) {
            textView2.setText(format);
        }
        this.f5996x = f8;
    }

    private void b() {
        this.f5979g.setMapLanguage(com.baidu.platform.comapi.e.b.e().d(), false);
    }

    private boolean c() {
        try {
            Class.forName("com.baidu.bmfmap.map.FlutterMapView");
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    private boolean d() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    private void e() {
        HashMap hashMap = new HashMap();
        if (c()) {
            hashMap.put(ExifInterface.GPS_DIRECTION_TRUE, "1");
        } else {
            hashMap.put(ExifInterface.GPS_DIRECTION_TRUE, "0");
        }
        SDKLogFactory.getLogUsrActStatistics().addLogWithLowLevel("B", "M", "0", hashMap);
    }

    private void c(Context context) {
        y yVar = new y(context, false);
        this.f5982j = yVar;
        if (yVar.c()) {
            this.f5982j.setOnZoomOutClickListener(new d());
            this.f5982j.setOnZoomInClickListener(new e());
            addView(this.f5982j);
        }
    }

    private void b(Context context) {
        this.f5985m = new RelativeLayout(context);
        this.f5985m.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        this.f5986n = new TextView(context);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(14);
        this.f5986n.setTextColor(Color.parseColor("#FFFFFF"));
        this.f5986n.setTextSize(2, 11.0f);
        TextView textView = this.f5986n;
        textView.setTypeface(textView.getTypeface(), 1);
        this.f5986n.setLayoutParams(layoutParams);
        this.f5986n.setId(Integer.MAX_VALUE);
        this.f5985m.addView(this.f5986n);
        this.f5987o = new TextView(context);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams2.width = -2;
        layoutParams2.height = -2;
        layoutParams2.addRule(14);
        this.f5987o.setTextColor(Color.parseColor("#000000"));
        this.f5987o.setTextSize(2, 11.0f);
        this.f5987o.setLayoutParams(layoutParams2);
        this.f5985m.addView(this.f5987o);
        this.f5988p = new ImageView(context);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams3.width = -2;
        layoutParams3.height = -2;
        layoutParams3.addRule(14);
        layoutParams3.addRule(3, this.f5986n.getId());
        ImageView imageView = this.f5988p;
        if (imageView != null) {
            imageView.setLayoutParams(layoutParams3);
            Bitmap a8 = com.baidu.mapsdkplatform.comapi.commonutils.a.a("icon_scale.9.png", context);
            if (a8 != null) {
                byte[] ninePatchChunk = a8.getNinePatchChunk();
                if (NinePatch.isNinePatchChunk(ninePatchChunk)) {
                    this.f5988p.setBackgroundDrawable(new NinePatchDrawable(a8, ninePatchChunk, new Rect(), null));
                }
            }
            this.f5985m.addView(this.f5988p);
        }
        addView(this.f5985m);
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

    public MapView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f5990r = new Object();
        this.f5991s = false;
        this.f5992t = new a();
        this.f5993u = LogoPosition.logoPostionleftBottom.ordinal();
        this.f5994v = true;
        this.f5995w = true;
        this.E = false;
        a(context, (BaiduMapOptions) null);
    }

    public MapView(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        this.f5990r = new Object();
        this.f5991s = false;
        this.f5992t = new a();
        this.f5993u = LogoPosition.logoPostionleftBottom.ordinal();
        this.f5994v = true;
        this.f5995w = true;
        this.E = false;
        a(context, (BaiduMapOptions) null);
    }

    private void a(Context context, BaiduMapOptions baiduMapOptions) {
        Point point;
        Point point2;
        LogoPosition logoPosition;
        this.f5989q = context;
        com.baidu.mapsdkplatform.comapi.map.e.c();
        BMapManager.init();
        if (SysOSUtil.getAuthToken() != null) {
            synchronized (this.f5990r) {
                h.b().a(SysOSUtil.getAuthToken(), com.baidu.platform.comjni.base.sdkauth.a.ParkingSpace.a() | com.baidu.platform.comjni.base.sdkauth.a.WaterMark.a());
                this.f5991s = false;
            }
        } else {
            com.baidu.mapsdkplatform.comapi.a.e().b(this.f5992t);
            PermissionCheck.permissionCheck();
        }
        a(context, baiduMapOptions, f5974b, f5975c);
        a(context);
        c(context);
        if (baiduMapOptions != null && !baiduMapOptions.f5697h) {
            this.f5982j.setVisibility(4);
        }
        b(context);
        if (baiduMapOptions != null && !baiduMapOptions.f5698i) {
            this.f5985m.setVisibility(4);
        }
        if (baiduMapOptions != null && (logoPosition = baiduMapOptions.f5699j) != null) {
            this.f5993u = logoPosition.ordinal();
        }
        if (baiduMapOptions != null && (point2 = baiduMapOptions.f5701l) != null) {
            this.f5984l = point2;
        }
        if (baiduMapOptions != null && (point = baiduMapOptions.f5700k) != null) {
            this.f5983k = point;
        }
        e();
        b();
    }

    public MapView(Context context, BaiduMapOptions baiduMapOptions) {
        super(context);
        this.f5990r = new Object();
        this.f5991s = false;
        this.f5992t = new a();
        this.f5993u = LogoPosition.logoPostionleftBottom.ordinal();
        this.f5994v = true;
        this.f5995w = true;
        this.E = false;
        a(context, baiduMapOptions);
    }

    private void a(Context context, BaiduMapOptions baiduMapOptions, String str, int i8) {
        this.f5978f = new MapSurfaceView(context);
        if (baiduMapOptions != null) {
            this.f5979g = new BaiduMap(context, this.f5978f, baiduMapOptions.a());
        } else {
            this.f5979g = new BaiduMap(context, this.f5978f, (q) null);
        }
        addView(this.f5978f);
        c cVar = new c();
        if (this.f5978f.getBaseMap() != null) {
            this.f5978f.getBaseMap().a(cVar);
        }
    }

    private void a(Context context) {
        int densityDpi = SysOSUtil.getDensityDpi();
        Bitmap a8 = com.baidu.mapsdkplatform.comapi.commonutils.a.a(densityDpi < 180 ? "logo_l.png" : "logo_h.png", context);
        if (a8 == null) {
            return;
        }
        if (densityDpi > 480) {
            Matrix matrix = new Matrix();
            matrix.postScale(2.0f, 2.0f);
            this.f5981i = Bitmap.createBitmap(a8, 0, 0, a8.getWidth(), a8.getHeight(), matrix, true);
        } else if (densityDpi > 320) {
            Matrix matrix2 = new Matrix();
            matrix2.postScale(1.5f, 1.5f);
            this.f5981i = Bitmap.createBitmap(a8, 0, 0, a8.getWidth(), a8.getHeight(), matrix2, true);
        } else {
            this.f5981i = a8;
        }
        if (this.f5981i != null) {
            ImageView imageView = new ImageView(context);
            this.f5980h = imageView;
            imageView.setImageBitmap(this.f5981i);
            addView(this.f5980h);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        y yVar = this.f5982j;
        if (yVar == null || !yVar.c() || this.f5978f.getBaseMap() == null) {
            return;
        }
        float f8 = this.f5978f.getBaseMap().y().f8148a;
        this.f5982j.setIsZoomOutEnabled(f8 > this.f5978f.getBaseMap().f8052e);
        this.f5982j.setIsZoomInEnabled(f8 < this.f5978f.getBaseMap().f8051d);
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
        MapSurfaceView mapSurfaceView = this.f5978f;
        if (mapSurfaceView == null || mapSurfaceView.getBaseMap() == null) {
            return;
        }
        if (TextUtils.isEmpty(str)) {
            Log.e(f5973a, "customStyleFilePath is empty or null, please check!");
            return;
        }
        if (!str.endsWith(".sty")) {
            Log.e(f5973a, "customStyleFile format is incorrect , please check!");
        } else if (!new File(str).exists()) {
            Log.e(f5973a, "customStyleFile does not exist , please check!");
        } else {
            this.f5978f.getBaseMap().a(str, str2);
        }
    }
}
