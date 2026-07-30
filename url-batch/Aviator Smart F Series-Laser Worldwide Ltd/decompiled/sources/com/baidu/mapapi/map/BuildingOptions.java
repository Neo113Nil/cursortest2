package com.baidu.mapapi.map;

import com.baidu.mapapi.map.Prism;
import com.baidu.mapapi.search.core.BuildingInfo;

/* loaded from: classes2.dex */
public class BuildingOptions extends PrismOptions {

    /* renamed from: k, reason: collision with root package name */
    private int f5719k;

    /* renamed from: l, reason: collision with root package name */
    private BitmapDescriptor f5720l;

    /* renamed from: n, reason: collision with root package name */
    private BuildingInfo f5722n;

    /* renamed from: i, reason: collision with root package name */
    private float f5717i = 0.0f;

    /* renamed from: j, reason: collision with root package name */
    private boolean f5718j = false;

    /* renamed from: m, reason: collision with root package name */
    private Prism.AnimateType f5721m = Prism.AnimateType.AnimateNormal;

    /* renamed from: o, reason: collision with root package name */
    private boolean f5723o = true;

    /* renamed from: p, reason: collision with root package name */
    boolean f5724p = true;

    /* renamed from: q, reason: collision with root package name */
    private boolean f5725q = false;

    /* renamed from: r, reason: collision with root package name */
    private float f5726r = 5.0f;

    public Prism.AnimateType getBuildingFloorAnimateType() {
        return this.f5721m;
    }

    public BuildingInfo getBuildingInfo() {
        return this.f5722n;
    }

    public int getFloorColor() {
        return this.f5719k;
    }

    public float getFloorHeight() {
        return this.f5717i;
    }

    public BitmapDescriptor getFloorSideTextureImage() {
        return this.f5720l;
    }

    @Override // com.baidu.mapapi.map.PrismOptions, com.baidu.mapapi.map.OverlayOptions
    Overlay getOverlay() {
        Building building = new Building();
        building.f6119c = getZIndex();
        building.f6120d = this.f5724p;
        building.f6232n = getCustomSideImage();
        building.f6225g = getHeight();
        building.f6231m = getSideFaceColor();
        building.f6230l = getTopFaceColor();
        building.f5714y = this.f5723o;
        building.f5713x = this.f6242h;
        BuildingInfo buildingInfo = this.f5722n;
        building.f5705p = buildingInfo;
        if (buildingInfo != null) {
            building.f6226h = buildingInfo.getGeom();
            building.f6227i = EncodePointType.BUILDINGINFO.ordinal();
        }
        building.f5710u = this.f5718j;
        building.f5706q = this.f5717i;
        building.f5709t = this.f5719k;
        building.f5711v = this.f5720l;
        building.f5712w = this.f5721m;
        building.f5715z = this.f5725q;
        building.A = this.f5726r;
        return building;
    }

    public float getRoundedCornerRadius() {
        return this.f5726r;
    }

    public boolean isAnimation() {
        return this.f5723o;
    }

    public boolean isRoundedCorner() {
        return this.f5725q;
    }

    public BuildingOptions setAnimation(boolean z7) {
        this.f5723o = z7;
        return this;
    }

    public BuildingOptions setBuildingFloorAnimateType(Prism.AnimateType animateType) {
        this.f5721m = animateType;
        return this;
    }

    public BuildingOptions setBuildingInfo(BuildingInfo buildingInfo) {
        this.f5722n = buildingInfo;
        return this;
    }

    public BuildingOptions setFloorColor(int i8) {
        this.f5718j = true;
        this.f5719k = i8;
        return this;
    }

    public BuildingOptions setFloorHeight(float f8) {
        BuildingInfo buildingInfo = this.f5722n;
        if (buildingInfo == null) {
            return this;
        }
        if (f8 < 0.0f) {
            this.f5717i = 0.0f;
            return this;
        }
        if (f8 > buildingInfo.getHeight()) {
            this.f5717i = this.f5722n.getHeight();
            return this;
        }
        this.f5717i = f8;
        return this;
    }

    public BuildingOptions setFloorSideTextureImage(BitmapDescriptor bitmapDescriptor) {
        this.f5718j = true;
        this.f5720l = bitmapDescriptor;
        return this;
    }

    public BuildingOptions setRoundedCornerEnable(boolean z7) {
        this.f5725q = z7;
        return this;
    }

    public BuildingOptions setRoundedCornerRadius(float f8) {
        if (f8 <= 0.0f) {
            f8 = 0.0f;
        }
        this.f5726r = f8;
        return this;
    }
}
