package com.baidu.platform.comapi.wnplatform.mulitmap;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.baidu.mapapi.map.LogoPosition;
import com.baidu.mapauto.auth.base.BaseLicenseAuthDataStandardProcess;
import com.baidu.platform.comapi.license.ILicenseAuthManager;
import com.baidu.platform.comapi.license.ILicenseAuthManagerListener;
import com.baidu.platform.comapi.license.LicenseAuthManager;
import com.baidu.platform.comapi.license.LicenseAuthManagerProvider;
import com.baidu.platform.comapi.map.MapController;
import com.baidu.platform.comapi.map.MapTextureView;
import com.baidu.platform.comapi.util.SysOSUtil;
import com.baidu.platform.comapi.wnplatform.model.OverLookingMode;
import com.baidu.platform.comapi.wnplatform.mulitmap.IMultiNaviView;
import com.baidu.platform.comapi.wnplatform.walkmap.WNaviBaiduMap;
import com.baidu.platform.comapi.wnplatform.walkmap.c;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.io.File;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public class MultiNaviView extends ViewGroup implements IMultiNaviView {

    /* renamed from: a, reason: collision with root package name */
    private static final String f10518a = "MultiNaviView";

    /* renamed from: b, reason: collision with root package name */
    private final c f10519b;

    /* renamed from: c, reason: collision with root package name */
    private ILicenseAuthManager f10520c;

    /* renamed from: d, reason: collision with root package name */
    private final b f10521d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f10522e;

    /* renamed from: f, reason: collision with root package name */
    private int f10523f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f10524g;

    /* renamed from: h, reason: collision with root package name */
    private ImageView f10525h;

    /* renamed from: i, reason: collision with root package name */
    private int f10526i;

    /* renamed from: j, reason: collision with root package name */
    private int f10527j;

    /* renamed from: k, reason: collision with root package name */
    private int f10528k;

    /* renamed from: l, reason: collision with root package name */
    private int f10529l;

    /* renamed from: m, reason: collision with root package name */
    private int f10530m;

    class a implements com.baidu.platform.comapi.map.c {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ IMultiNaviView.SnapshotReadyCallback f10531a;

        a(IMultiNaviView.SnapshotReadyCallback snapshotReadyCallback) {
            this.f10531a = snapshotReadyCallback;
        }

        @Override // com.baidu.platform.comapi.map.c
        public void a(Bitmap bitmap) {
            this.f10531a.onSnapshotReady(bitmap);
        }
    }

    private class b implements ILicenseAuthManagerListener {
        private b() {
        }

        private void a(boolean z7) {
            if (z7 && MultiNaviView.this.f10522e) {
                return;
            }
            if (z7) {
                MultiNaviView multiNaviView = MultiNaviView.this;
                multiNaviView.f10522e = multiNaviView.f10519b.a(MultiNaviView.this.getMultiMapView().getController().getMapId(), 17.0f);
            } else if (MultiNaviView.this.f10522e) {
                MultiNaviView.this.f10519b.l();
                MultiNaviView.this.f10522e = false;
            }
        }

        @Override // com.baidu.platform.comapi.license.ILicenseAuthManagerListener
        public void onError(String str, String str2, int i8, int i9, String str3) {
            if (a(str, str2)) {
                a(MultiNaviView.this.a(i9, null, null));
            }
        }

        @Override // com.baidu.platform.comapi.license.ILicenseAuthManagerListener
        public void onSuccess(String str, String str2, int i8, Map<String, Integer> map) {
            if (a(str, str2)) {
                a(MultiNaviView.this.f10520c.isHaveAuthority(map));
            }
        }

        /* synthetic */ b(MultiNaviView multiNaviView, a aVar) {
            this();
        }

        private boolean a(String str, String str2) {
            ILicenseAuthManager iLicenseAuthManager = MultiNaviView.this.f10520c;
            if (iLicenseAuthManager == null) {
                return false;
            }
            return iLicenseAuthManager.isEffective(str, str2);
        }
    }

    public MultiNaviView(@NonNull Context context) {
        this(context, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public MapTextureView getMultiMapView() {
        View childAt = getChildAt(0);
        if (childAt instanceof MapTextureView) {
            return (MapTextureView) childAt;
        }
        throw new RuntimeException();
    }

    @Override // com.baidu.platform.comapi.wnplatform.mulitmap.IMultiNaviView
    public MapTextureView getMapTextureView() {
        return getMultiMapView();
    }

    @Override // com.baidu.platform.comapi.wnplatform.mulitmap.IMultiNaviView
    public boolean isSetBackgroundDraw() {
        return getMultiMapView().isSetBackgroundDraw();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f10523f = 0;
        ILicenseAuthManager iLicenseAuthManager = this.f10520c;
        if (iLicenseAuthManager != null) {
            try {
                if (!iLicenseAuthManager.isHaveAuthority(iLicenseAuthManager.loadLocalAuth(getContext())) && this.f10522e) {
                    this.f10519b.l();
                    this.f10522e = false;
                }
            } catch (BaseLicenseAuthDataStandardProcess.ProcessException e8) {
                if (!a(e8.getCode(), null, null) && this.f10522e) {
                    this.f10519b.l();
                    this.f10522e = false;
                }
            }
        }
        LicenseAuthManager.addLicenseAuthLicense(this.f10521d);
    }

    @Override // com.baidu.platform.comapi.wnplatform.mulitmap.IMultiNaviView
    public void onDestroy() {
        if (this.f10524g && this.f10523f == 4) {
            getMultiMapView().onPause();
        }
        this.f10523f = 5;
        if (this.f10522e) {
            this.f10519b.l();
            this.f10522e = false;
        }
        ViewParent parent = getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this);
        }
        getMultiMapView().onDestroy();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f10523f = 1;
        LicenseAuthManager.removeLicenseAuthLicense(this.f10521d);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z7, int i8, int i9, int i10, int i11) {
        getMultiMapView().layout(0, 0, i10 - i8, i11 - i9);
        a();
    }

    @Override // com.baidu.platform.comapi.wnplatform.mulitmap.IMultiNaviView
    public void onPause() {
        this.f10523f = 4;
        if (this.f10524g) {
            return;
        }
        getMultiMapView().onPause();
    }

    @Override // com.baidu.platform.comapi.wnplatform.mulitmap.IMultiNaviView
    public void onResume() {
        if (this.f10523f == 3) {
            return;
        }
        this.f10523f = 3;
        getMultiMapView().onResume();
    }

    @Override // com.baidu.platform.comapi.wnplatform.mulitmap.IMultiNaviView
    public void screenshot(IMultiNaviView.SnapshotReadyCallback snapshotReadyCallback) {
        if (snapshotReadyCallback == null) {
            return;
        }
        getMapTextureView().doCaptureMapView(new a(snapshotReadyCallback), getWidth(), getHeight(), Bitmap.Config.ARGB_8888);
    }

    public void setCustomMapEnable(boolean z7) {
        MapTextureView mapTextureView = getMapTextureView();
        if (mapTextureView == null || mapTextureView.getBaseMap() == null) {
            return;
        }
        mapTextureView.getBaseMap().r(z7);
    }

    @Override // com.baidu.platform.comapi.wnplatform.mulitmap.IMultiNaviView
    public boolean setDefaultLevel(float f8) {
        if (!this.f10522e) {
            return false;
        }
        MapController controller = getMultiMapView().getController();
        if (controller != null) {
            float f9 = controller.mMaxZoomLevel;
            if (f8 < controller.mMinZoomLevel || f8 > f9) {
                return false;
            }
        }
        this.f10519b.a(f8);
        return true;
    }

    @Override // com.baidu.platform.comapi.wnplatform.mulitmap.IMultiNaviView
    public boolean setDefaultOverlooking(OverLookingMode overLookingMode) {
        if (!this.f10522e) {
            return false;
        }
        this.f10519b.a(overLookingMode);
        return true;
    }

    @Override // com.baidu.platform.comapi.wnplatform.mulitmap.IMultiNaviView
    public final void setLogoPosition(LogoPosition logoPosition) {
        if (logoPosition == null) {
            this.f10526i = LogoPosition.logoPostionleftBottom.ordinal();
        } else {
            this.f10526i = logoPosition.ordinal();
        }
        requestLayout();
    }

    public void setMapCustomStylePath(String str) {
        MapTextureView mapTextureView = getMapTextureView();
        if (mapTextureView == null || mapTextureView.getBaseMap() == null) {
            return;
        }
        if (TextUtils.isEmpty(str)) {
            Log.e(f10518a, "customStyleFilePath is empty or null, please check!");
            return;
        }
        if (!str.endsWith(".sty")) {
            Log.e(f10518a, "customStyleFile format is incorrect , please check!");
        } else if (new File(str).exists()) {
            mapTextureView.getBaseMap().a(str, "");
        } else {
            Log.e(f10518a, "customStyleFile does not exist , please check!");
        }
    }

    @Override // com.baidu.platform.comapi.wnplatform.mulitmap.IMultiNaviView
    public void setMapDpiScale(float f8) {
        getMapTextureView().getController().getBaseMap().setDpiScale(f8);
    }

    @Override // com.baidu.platform.comapi.wnplatform.mulitmap.IMultiNaviView
    public void setMapPausedDraw(boolean z7) {
        this.f10524g = z7;
    }

    @Override // com.baidu.platform.comapi.wnplatform.mulitmap.IMultiNaviView
    public boolean setNaviType(int i8) {
        boolean a8;
        if (this.f10522e) {
            this.f10519b.l();
            this.f10522e = false;
        }
        ILicenseAuthManager a9 = a(i8);
        this.f10520c = a9;
        if (a9.isHaveAuthority()) {
            if (!this.f10519b.a(getMultiMapView().getController().getMapId(), 17.0f)) {
                return false;
            }
            this.f10522e = true;
            return true;
        }
        try {
            ILicenseAuthManager iLicenseAuthManager = this.f10520c;
            a8 = iLicenseAuthManager.isHaveAuthority(iLicenseAuthManager.loadLocalAuth(getContext()));
        } catch (BaseLicenseAuthDataStandardProcess.ProcessException e8) {
            a8 = a(e8.getCode(), null, null);
        }
        if (!a8 || !this.f10519b.a(getMultiMapView().getController().getMapId(), 17.0f)) {
            return false;
        }
        this.f10522e = true;
        return true;
    }

    @Override // android.view.View, com.baidu.platform.comapi.wnplatform.mulitmap.IMultiNaviView
    public void setPadding(int i8, int i9, int i10, int i11) {
        this.f10527j = i8;
        this.f10528k = i9;
        this.f10529l = i10;
        this.f10530m = i11;
    }

    @Override // com.baidu.platform.comapi.wnplatform.mulitmap.IMultiNaviView
    public boolean setRotateMode(IMultiNaviView.Map_Rotate_Mode map_Rotate_Mode) {
        if (!this.f10522e) {
            return false;
        }
        this.f10519b.c(map_Rotate_Mode.ordinal());
        return true;
    }

    @Override // com.baidu.platform.comapi.wnplatform.mulitmap.IMultiNaviView
    public boolean setSupBackgroundDraw(boolean z7) {
        getMultiMapView().setSupBackgroundDraw(z7);
        return true;
    }

    public MultiNaviView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private MapTextureView b(Context context) {
        MapTextureView mapTextureView = new MapTextureView(context);
        MapController mapController = new MapController();
        mapController.createByDuplicateAppBaseMap(WNaviBaiduMap.getId());
        Bundle bundle = new Bundle();
        bundle.putDouble("centerptx", 1.295815798E7d);
        bundle.putDouble("centerpty", 4825999.74d);
        int screenHeight = SysOSUtil.getInstance().getScreenHeight();
        bundle.putInt(TtmlNode.RIGHT, SysOSUtil.getInstance().getScreenWidth());
        bundle.putInt("bottom", screenHeight);
        bundle.putDouble("level", 17.0d);
        mapController.initMapResources(bundle);
        mapTextureView.attachBaseMapController(mapController);
        return mapTextureView;
    }

    public MultiNaviView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        this.f10522e = false;
        this.f10523f = -1;
        this.f10519b = com.baidu.platform.comapi.walknavi.b.n().t();
        this.f10521d = new b(this, null);
        this.f10524g = false;
        addView(b(context));
        a(context);
    }

    private void a() {
        int makeMeasureSpec;
        int makeMeasureSpec2;
        int i8;
        int i9;
        int measuredHeight;
        int measuredWidth;
        int height;
        int width;
        int width2;
        int measuredWidth2;
        ImageView imageView = this.f10525h;
        if (imageView == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new ViewGroup.LayoutParams(-2, -2);
        }
        int i10 = layoutParams.width;
        if (i10 > 0) {
            makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i10, 1073741824);
        } else {
            makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        }
        int i11 = layoutParams.height;
        if (i11 > 0) {
            makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i11, 1073741824);
        } else {
            makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        }
        this.f10525h.measure(makeMeasureSpec, makeMeasureSpec2);
        int i12 = this.f10526i;
        if (i12 != 1) {
            if (i12 == 2) {
                height = getHeight() - this.f10530m;
                i9 = height - this.f10525h.getMeasuredHeight();
                width = (((getWidth() - this.f10525h.getMeasuredWidth()) + this.f10527j) - this.f10529l) / 2;
                width2 = (((getWidth() + this.f10525h.getMeasuredWidth()) + this.f10527j) - this.f10529l) / 2;
            } else if (i12 != 3) {
                if (i12 == 4) {
                    measuredHeight = getHeight() - this.f10530m;
                    i9 = measuredHeight - this.f10525h.getMeasuredHeight();
                    measuredWidth = getWidth() - this.f10529l;
                    measuredWidth2 = this.f10525h.getMeasuredWidth();
                } else if (i12 != 5) {
                    i8 = this.f10527j;
                    measuredHeight = getHeight() - this.f10530m;
                    measuredWidth = this.f10525h.getMeasuredWidth() + i8;
                    i9 = measuredHeight - this.f10525h.getMeasuredHeight();
                } else {
                    i9 = this.f10528k;
                    measuredHeight = i9 + this.f10525h.getMeasuredHeight();
                    measuredWidth = getWidth() - this.f10529l;
                    measuredWidth2 = this.f10525h.getMeasuredWidth();
                }
                i8 = measuredWidth - measuredWidth2;
            } else {
                i9 = this.f10528k;
                height = this.f10525h.getMeasuredHeight() + i9;
                width = (((getWidth() - this.f10525h.getMeasuredWidth()) + this.f10527j) - this.f10529l) / 2;
                width2 = (((getWidth() + this.f10525h.getMeasuredWidth()) + this.f10527j) - this.f10529l) / 2;
            }
            int i13 = width2;
            measuredHeight = height;
            i8 = width;
            measuredWidth = i13;
        } else {
            i8 = this.f10527j;
            i9 = this.f10528k;
            measuredHeight = this.f10525h.getMeasuredHeight() + i9;
            measuredWidth = this.f10525h.getMeasuredWidth() + i8;
        }
        this.f10525h.layout(i8, i9, measuredWidth, measuredHeight);
    }

    private ILicenseAuthManager a(int i8) {
        if (i8 == 0) {
            return LicenseAuthManagerProvider.getInstance().getMultiScreenWalkingNaviAuthManager();
        }
        if (i8 == 1) {
            return LicenseAuthManagerProvider.getInstance().getMultiScreenRidingNaviAuthManager();
        }
        throw new IllegalArgumentException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a(int i8, List<Integer> list, List<Integer> list2) {
        if (list != null && list.contains(Integer.valueOf(i8))) {
            return true;
        }
        if (list2 == null || !list2.contains(Integer.valueOf(i8))) {
            return i8 == 0 || i8 == 1 || i8 == 100 || i8 == 101 || i8 == 102;
        }
        return false;
    }

    private void a(Context context) {
        int densityDpi = com.baidu.mapapi.common.SysOSUtil.getDensityDpi();
        Bitmap a8 = com.baidu.mapsdkplatform.comapi.commonutils.a.a(densityDpi < 180 ? "logo_l.png" : "logo_h.png", context);
        if (a8 == null) {
            return;
        }
        if (densityDpi > 480) {
            Matrix matrix = new Matrix();
            matrix.postScale(2.0f, 2.0f);
            a8 = Bitmap.createBitmap(a8, 0, 0, a8.getWidth(), a8.getHeight(), matrix, true);
        } else if (densityDpi > 320) {
            Matrix matrix2 = new Matrix();
            matrix2.postScale(1.5f, 1.5f);
            a8 = Bitmap.createBitmap(a8, 0, 0, a8.getWidth(), a8.getHeight(), matrix2, true);
        }
        if (a8 != null) {
            ImageView imageView = new ImageView(context);
            this.f10525h = imageView;
            imageView.setImageBitmap(a8);
            addView(this.f10525h);
        }
    }
}
