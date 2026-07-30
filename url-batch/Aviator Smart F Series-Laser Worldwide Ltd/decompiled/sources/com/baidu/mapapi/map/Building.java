package com.baidu.mapapi.map;

import android.os.Bundle;
import com.baidu.mapapi.map.Prism;
import com.baidu.mapapi.model.CoordUtil;
import com.baidu.mapapi.model.LatLng;
import com.baidu.mapapi.search.core.BuildingInfo;
import com.baidu.mapsdkplatform.comapi.map.t;
import com.baidu.platform.comapi.basestruct.GeoPoint;
import com.baidu.platform.comapi.bmsdk.BmDrawItem;
import com.baidu.platform.comapi.bmsdk.BmGeoElement;
import com.baidu.platform.comapi.bmsdk.BmPrism;
import com.baidu.platform.comapi.bmsdk.style.BmBitmapResource;
import com.baidu.platform.comapi.bmsdk.style.BmSurfaceStyle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public class Building extends Prism {

    /* renamed from: p, reason: collision with root package name */
    BuildingInfo f5705p;

    /* renamed from: s, reason: collision with root package name */
    int f5708s;

    /* renamed from: v, reason: collision with root package name */
    BitmapDescriptor f5711v;

    /* renamed from: x, reason: collision with root package name */
    int f5713x;

    /* renamed from: y, reason: collision with root package name */
    boolean f5714y;

    /* renamed from: q, reason: collision with root package name */
    float f5706q = 0.0f;

    /* renamed from: r, reason: collision with root package name */
    float f5707r = 0.0f;

    /* renamed from: t, reason: collision with root package name */
    int f5709t = 0;

    /* renamed from: u, reason: collision with root package name */
    boolean f5710u = false;

    /* renamed from: w, reason: collision with root package name */
    Prism.AnimateType f5712w = Prism.AnimateType.AnimateNormal;

    /* renamed from: z, reason: collision with root package name */
    boolean f5715z = false;
    float A = 5.0f;

    public enum AnimateType {
        AnimateSlow,
        AnimateNormal,
        AnimateFast
    }

    public Building() {
        this.type = com.baidu.mapsdkplatform.comapi.map.d.prism;
    }

    @Override // com.baidu.mapapi.map.Prism, com.baidu.mapapi.map.Overlay
    Bundle a(Bundle bundle) {
        super.a(bundle);
        if (this.f5705p != null) {
            bundle.putDouble("m_height", r0.getHeight());
            bundle.putString("encodedPoints", this.f5705p.getGeom());
            bundle.putInt("encodePointType", EncodePointType.BUILDINGINFO.ordinal());
            bundle.putInt("m_showLevel", this.f5713x);
            bundle.putInt("m_isAnimation", this.f5714y ? 1 : 0);
            bundle.putInt("m_has_floor", this.f5710u ? 1 : 0);
            bundle.putFloat("m_floor_height", this.f5706q);
            bundle.putFloat("m_last_floor_height", this.f5707r);
            Overlay.a(this.f5709t, bundle);
            if (this.f5711v != null) {
                Bundle bundle2 = new Bundle();
                bundle2.putBundle("image_info", this.f5711v.a());
                bundle.putBundle("m_floor_image", bundle2);
            }
            bundle.putInt("m_buildingFloorAnimateType", this.f5712w.ordinal());
            bundle.putInt("m_isRoundedCorner", this.f5715z ? 1 : 0);
            bundle.putFloat("m_roundedCornerRadius", this.A);
        }
        bundle.putInt("m_isBuilding", this.f5705p != null ? 1 : 0);
        int hashCode = hashCode();
        this.f5708s = hashCode;
        bundle.putInt("buildingId", hashCode);
        return bundle;
    }

    public Prism.AnimateType getBuildingFloorAnimateType() {
        return this.f5712w;
    }

    public int getBuildingId() {
        return this.f5708s;
    }

    public BuildingInfo getBuildingInfo() {
        return this.f5705p;
    }

    public int getFloorColor() {
        return this.f5709t;
    }

    public float getFloorHeight() {
        return this.f5706q;
    }

    public BitmapDescriptor getFloorSideTextureImage() {
        return this.f5711v;
    }

    @Override // com.baidu.mapapi.map.Prism
    public float getHeight() {
        return this.f6225g;
    }

    @Override // com.baidu.mapapi.map.Prism
    public List<LatLng> getPoints() {
        return this.f6228j;
    }

    public float getRoundedCornerRadius() {
        return this.A;
    }

    public int getShowLevel() {
        return this.f5713x;
    }

    @Override // com.baidu.mapapi.map.Prism
    public int getSideFaceColor() {
        return this.f6231m;
    }

    @Override // com.baidu.mapapi.map.Prism
    public int getTopFaceColor() {
        return this.f6230l;
    }

    public boolean isAnimation() {
        return this.f5714y;
    }

    public boolean isRoundedCorner() {
        return this.f5715z;
    }

    public void setAnimation(boolean z7) {
        BmPrism bmPrism;
        this.f5714y = z7;
        if (!OverlayUtil.isOverlayUpgrade() || (bmPrism = this.f6233o) == null || this.f6122f == null) {
            return;
        }
        bmPrism.c(z7);
        this.f6122f.b();
    }

    public void setBuildingFloorAnimateType(Prism.AnimateType animateType) {
        this.f5712w = animateType;
        if (!OverlayUtil.isOverlayUpgrade()) {
            this.listener.d(this);
            return;
        }
        BmPrism bmPrism = this.f6233o;
        if (bmPrism == null || this.f6122f == null) {
            return;
        }
        bmPrism.f(this.f5712w.ordinal());
        this.f6122f.b();
    }

    public void setBuildingInfo(BuildingInfo buildingInfo) {
        if (buildingInfo == null) {
            return;
        }
        this.f5705p = buildingInfo;
        if (!OverlayUtil.isOverlayUpgrade()) {
            this.listener.d(this);
            return;
        }
        BmPrism bmPrism = this.f6233o;
        if (bmPrism == null || this.f6122f == null) {
            return;
        }
        bmPrism.c();
        float height = this.f5705p.getHeight();
        ArrayList arrayList = new ArrayList();
        Iterator<LatLng> it = new t().d(this.f5705p.getGeom()).iterator();
        while (it.hasNext()) {
            GeoPoint ll2mc = CoordUtil.ll2mc(it.next());
            arrayList.add(new com.baidu.platform.comapi.bmsdk.b(ll2mc.getLongitudeE6(), ll2mc.getLatitudeE6()));
        }
        this.f6229k.a(arrayList);
        this.f6233o.a(this.f6229k);
        this.f6233o.c(height);
        this.f6122f.b();
    }

    public void setFloorColor(int i8) {
        this.f5710u = true;
        this.f5709t = i8;
        if (!OverlayUtil.isOverlayUpgrade()) {
            this.listener.d(this);
            return;
        }
        if (this.f6233o == null || this.f6122f == null) {
            return;
        }
        BmSurfaceStyle bmSurfaceStyle = new BmSurfaceStyle();
        BmSurfaceStyle bmSurfaceStyle2 = new BmSurfaceStyle();
        bmSurfaceStyle.a(this.f5709t);
        bmSurfaceStyle2.a(this.f5709t);
        if (this.f5711v != null) {
            bmSurfaceStyle.a(new BmBitmapResource(this.f5711v.getBitmap()));
        }
        this.f6233o.e(this.f5710u);
        this.f6233o.b(bmSurfaceStyle2);
        this.f6233o.a(bmSurfaceStyle);
        this.f6122f.b();
    }

    public void setFloorHeight(float f8) {
        BuildingInfo buildingInfo = this.f5705p;
        if (buildingInfo == null) {
            return;
        }
        if (f8 < 0.0f) {
            this.f5707r = this.f5706q;
            this.f5706q = 0.0f;
            return;
        }
        if (f8 > buildingInfo.getHeight()) {
            this.f5707r = this.f5706q;
            this.f5706q = this.f5705p.getHeight();
            return;
        }
        this.f5707r = this.f5706q;
        this.f5706q = f8;
        if (!OverlayUtil.isOverlayUpgrade()) {
            this.listener.d(this);
            return;
        }
        BmPrism bmPrism = this.f6233o;
        if (bmPrism == null || this.f6122f == null) {
            return;
        }
        bmPrism.b(this.f5706q);
        this.f6233o.d(this.f5707r);
        this.f6122f.b();
    }

    public void setFloorSideTextureImage(BitmapDescriptor bitmapDescriptor) {
        this.f5711v = bitmapDescriptor;
        this.f5710u = true;
        if (!OverlayUtil.isOverlayUpgrade()) {
            this.listener.d(this);
            return;
        }
        if (this.f6233o == null || this.f6122f == null) {
            return;
        }
        BmSurfaceStyle bmSurfaceStyle = new BmSurfaceStyle();
        bmSurfaceStyle.a(this.f5709t);
        if (this.f5711v != null) {
            bmSurfaceStyle.a(new BmBitmapResource(this.f5711v.getBitmap()));
        }
        this.f6233o.a(bmSurfaceStyle);
        this.f6233o.e(this.f5710u);
        this.f6122f.b();
    }

    public void setRoundedCornerEnable(boolean z7) {
        this.f5715z = z7;
        if (!OverlayUtil.isOverlayUpgrade()) {
            this.listener.d(this);
            return;
        }
        BmPrism bmPrism = this.f6233o;
        if (bmPrism == null || this.f6122f == null) {
            return;
        }
        bmPrism.f(z7);
        this.f6122f.b();
    }

    public void setRoundedCornerRadius(float f8) {
        this.A = f8 > 0.0f ? f8 : 0.0f;
        if (!OverlayUtil.isOverlayUpgrade()) {
            this.listener.d(this);
            return;
        }
        BmPrism bmPrism = this.f6233o;
        if (bmPrism == null || this.f6122f == null) {
            return;
        }
        bmPrism.e(f8);
        this.f6122f.b();
    }

    public void setShowLevel(int i8) {
        this.f5713x = i8;
    }

    @Override // com.baidu.mapapi.map.Prism, com.baidu.mapapi.map.Overlay
    BmDrawItem toDrawItem() {
        BmPrism bmPrism = new BmPrism();
        this.f6233o = bmPrism;
        bmPrism.a(this);
        setDrawItem(this.f6233o);
        super.toDrawItem();
        this.f6229k = new BmGeoElement();
        BuildingInfo buildingInfo = this.f5705p;
        if (buildingInfo != null) {
            this.f6233o.c(buildingInfo.getHeight());
            this.f6233o.d(true);
            this.f6233o.c(this.f5714y);
            this.f6233o.b(this.f5713x);
            BmSurfaceStyle bmSurfaceStyle = new BmSurfaceStyle();
            BmSurfaceStyle bmSurfaceStyle2 = new BmSurfaceStyle();
            if (this.f5711v != null) {
                bmSurfaceStyle.a(new BmBitmapResource(this.f5711v.getBitmap()));
            }
            bmSurfaceStyle.a(this.f5709t);
            bmSurfaceStyle2.a(this.f5709t);
            this.f6233o.e(this.f5710u);
            this.f6233o.d(this.f5707r);
            this.f6233o.a(bmSurfaceStyle);
            this.f6233o.b(bmSurfaceStyle2);
            this.f6233o.b(this.f5706q);
            this.f6233o.f(this.f5712w.ordinal());
            this.f6233o.e(1);
            ArrayList arrayList = new ArrayList();
            Iterator<LatLng> it = new t().d(this.f5705p.getGeom()).iterator();
            while (it.hasNext()) {
                GeoPoint ll2mc = CoordUtil.ll2mc(it.next());
                arrayList.add(new com.baidu.platform.comapi.bmsdk.b(ll2mc.getLongitudeE6(), ll2mc.getLatitudeE6()));
            }
            this.f6229k.a(arrayList);
            this.f6233o.a(this.f6229k);
            this.f6233o.f(this.f5715z);
            this.f6233o.e(this.A);
        }
        int hashCode = hashCode();
        this.f5708s = hashCode;
        this.f6233o.a(String.valueOf(hashCode));
        return this.f6233o;
    }
}
