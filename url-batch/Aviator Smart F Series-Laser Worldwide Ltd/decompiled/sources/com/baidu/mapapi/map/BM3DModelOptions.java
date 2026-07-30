package com.baidu.mapapi.map;

import android.text.TextUtils;
import com.baidu.mapapi.model.LatLng;

/* loaded from: classes2.dex */
public final class BM3DModelOptions extends OverlayOptions {

    /* renamed from: a, reason: collision with root package name */
    private String f5547a;

    /* renamed from: b, reason: collision with root package name */
    private String f5548b;

    /* renamed from: c, reason: collision with root package name */
    private LatLng f5549c;

    /* renamed from: f, reason: collision with root package name */
    private float f5552f;

    /* renamed from: g, reason: collision with root package name */
    private float f5553g;

    /* renamed from: h, reason: collision with root package name */
    private float f5554h;

    /* renamed from: i, reason: collision with root package name */
    private float f5555i;

    /* renamed from: j, reason: collision with root package name */
    private float f5556j;

    /* renamed from: k, reason: collision with root package name */
    private float f5557k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f5558l;

    /* renamed from: q, reason: collision with root package name */
    private int f5563q;

    /* renamed from: d, reason: collision with root package name */
    private float f5550d = 1.0f;

    /* renamed from: e, reason: collision with root package name */
    private boolean f5551e = false;

    /* renamed from: m, reason: collision with root package name */
    private boolean f5559m = true;
    public ModelYawAxis yawAxis = ModelYawAxis.Z;

    /* renamed from: n, reason: collision with root package name */
    private BM3DModelType f5560n = BM3DModelType.BM3DModelTypeObj;

    /* renamed from: o, reason: collision with root package name */
    private boolean f5561o = false;

    /* renamed from: p, reason: collision with root package name */
    private int f5562p = 0;

    /* renamed from: r, reason: collision with root package name */
    private float f5564r = 1.0f;

    public enum BM3DModelType {
        BM3DModelTypeObj(0),
        BM3DModelTypeglTF(2);


        /* renamed from: b, reason: collision with root package name */
        private final int f5566b;

        BM3DModelType(int i8) {
            this.f5566b = i8;
        }

        public int getType() {
            return this.f5566b;
        }
    }

    public enum ModelYawAxis {
        Z,
        X,
        Y
    }

    public BM3DModelOptions animationIndex(int i8) {
        this.f5563q = i8;
        return this;
    }

    public BM3DModelOptions animationRepeatCount(int i8) {
        this.f5562p = i8;
        return this;
    }

    public BM3DModelOptions animationSpeed(float f8) {
        this.f5564r = f8;
        return this;
    }

    public int getAnimationIndex() {
        return this.f5563q;
    }

    public int getAnimationRepeatCount() {
        return this.f5562p;
    }

    public float getAnimationSpeed() {
        return this.f5564r;
    }

    public BM3DModelType getBM3DModelType() {
        return this.f5560n;
    }

    public String getModelName() {
        return this.f5548b;
    }

    public String getModelPath() {
        return this.f5547a;
    }

    public float getOffsetX() {
        return this.f5555i;
    }

    public float getOffsetY() {
        return this.f5556j;
    }

    public float getOffsetZ() {
        return this.f5557k;
    }

    @Override // com.baidu.mapapi.map.OverlayOptions
    Overlay getOverlay() {
        BM3DModel bM3DModel = new BM3DModel();
        if (TextUtils.isEmpty(this.f5547a)) {
            throw new IllegalArgumentException("BDMapSDKException: BM3DModel modelPath can not be null");
        }
        bM3DModel.f5528g = this.f5547a;
        if (TextUtils.isEmpty(this.f5548b)) {
            throw new IllegalArgumentException("BDMapSDKException: BM3DModel mModelName can not be null");
        }
        bM3DModel.f5529h = this.f5548b;
        LatLng latLng = this.f5549c;
        if (latLng == null) {
            throw new IllegalArgumentException("BDMapSDKException: BM3DModel mPosition can not be null");
        }
        bM3DModel.f5530i = latLng;
        bM3DModel.f5531j = this.f5550d;
        bM3DModel.f5532k = this.f5551e;
        bM3DModel.f5533l = this.f5552f;
        bM3DModel.f5534m = this.f5553g;
        bM3DModel.f5535n = this.f5554h;
        bM3DModel.f5536o = this.f5555i;
        bM3DModel.f5537p = this.f5556j;
        bM3DModel.f5538q = this.f5557k;
        bM3DModel.f6120d = this.f5559m;
        bM3DModel.f5539r = this.f5560n;
        bM3DModel.f5542u = this.f5563q;
        bM3DModel.f5540s = this.f5561o;
        bM3DModel.f5541t = this.f5562p;
        bM3DModel.f5543v = this.f5564r;
        bM3DModel.f5546y = this.f5558l;
        return bM3DModel;
    }

    public LatLng getPosition() {
        return this.f5549c;
    }

    public float getRotateX() {
        return this.f5552f;
    }

    public float getRotateY() {
        return this.f5553g;
    }

    public float getRotateZ() {
        return this.f5554h;
    }

    public float getScale() {
        return this.f5550d;
    }

    public int getYawAxis() {
        return this.yawAxis.ordinal();
    }

    public boolean isSkeletonAnimationEnable() {
        return this.f5561o;
    }

    public boolean isVisible() {
        return this.f5559m;
    }

    public boolean isZoomFixed() {
        return this.f5551e;
    }

    public boolean ismAlwaysShow() {
        return this.f5558l;
    }

    public BM3DModelOptions setAlwaysShow(boolean z7) {
        this.f5558l = z7;
        return this;
    }

    public BM3DModelOptions setBM3DModelType(BM3DModelType bM3DModelType) {
        this.f5560n = bM3DModelType;
        return this;
    }

    public BM3DModelOptions setModelName(String str) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("BDMapSDKException: BM3DModel modelName can not be null");
        }
        this.f5548b = str;
        return this;
    }

    public BM3DModelOptions setModelPath(String str) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("BDMapSDKException: BM3DModel modelPath can not be null");
        }
        this.f5547a = str;
        return this;
    }

    public BM3DModelOptions setOffset(float f8, float f9, float f10) {
        this.f5555i = f8;
        this.f5556j = f9;
        this.f5557k = f10;
        return this;
    }

    public BM3DModelOptions setPosition(LatLng latLng) {
        if (latLng == null) {
            throw new IllegalArgumentException("BDMapSDKException: BM3DModel position can not be null");
        }
        this.f5549c = latLng;
        return this;
    }

    public BM3DModelOptions setRotate(float f8, float f9, float f10) {
        this.f5552f = f8;
        this.f5553g = f9;
        this.f5554h = f10;
        return this;
    }

    public BM3DModelOptions setScale(float f8) {
        this.f5550d = f8;
        return this;
    }

    public BM3DModelOptions setSkeletonAnimationEnable(boolean z7) {
        this.f5561o = z7;
        return this;
    }

    public BM3DModelOptions setYawAxis(ModelYawAxis modelYawAxis) {
        this.yawAxis = modelYawAxis;
        return this;
    }

    public BM3DModelOptions setZoomFixed(boolean z7) {
        this.f5551e = z7;
        return this;
    }

    public BM3DModelOptions visible(boolean z7) {
        this.f5559m = z7;
        return this;
    }
}
