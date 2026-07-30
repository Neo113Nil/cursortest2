package com.baidu.mapapi.map;

import android.graphics.Point;
import android.view.ViewGroup;
import com.baidu.mapapi.model.LatLng;

/* loaded from: classes2.dex */
public final class MapViewLayoutParams extends ViewGroup.LayoutParams {
    public static final int ALIGN_BOTTOM = 16;
    public static final int ALIGN_CENTER_HORIZONTAL = 4;
    public static final int ALIGN_CENTER_VERTICAL = 32;
    public static final int ALIGN_LEFT = 1;
    public static final int ALIGN_RIGHT = 2;
    public static final int ALIGN_TOP = 8;

    /* renamed from: a, reason: collision with root package name */
    LatLng f6008a;

    /* renamed from: b, reason: collision with root package name */
    Point f6009b;

    /* renamed from: c, reason: collision with root package name */
    ELayoutMode f6010c;

    /* renamed from: d, reason: collision with root package name */
    float f6011d;

    /* renamed from: e, reason: collision with root package name */
    float f6012e;

    /* renamed from: f, reason: collision with root package name */
    int f6013f;

    /* renamed from: g, reason: collision with root package name */
    int f6014g;

    public static final class Builder {

        /* renamed from: a, reason: collision with root package name */
        private int f6015a;

        /* renamed from: b, reason: collision with root package name */
        private int f6016b;

        /* renamed from: c, reason: collision with root package name */
        private LatLng f6017c;

        /* renamed from: d, reason: collision with root package name */
        private Point f6018d;

        /* renamed from: e, reason: collision with root package name */
        private ELayoutMode f6019e = ELayoutMode.absoluteMode;

        /* renamed from: f, reason: collision with root package name */
        private int f6020f = 4;

        /* renamed from: g, reason: collision with root package name */
        private int f6021g = 16;

        /* renamed from: h, reason: collision with root package name */
        private int f6022h;

        /* renamed from: i, reason: collision with root package name */
        private int f6023i;

        public Builder align(int i8, int i9) {
            if (i8 == 1 || i8 == 2 || i8 == 4) {
                this.f6020f = i8;
            }
            if (i9 == 8 || i9 == 16 || i9 == 32) {
                this.f6021g = i9;
            }
            return this;
        }

        public MapViewLayoutParams build() {
            ELayoutMode eLayoutMode = this.f6019e;
            if (eLayoutMode != ELayoutMode.mapMode ? !(eLayoutMode == ELayoutMode.absoluteMode && this.f6018d == null) : this.f6017c != null) {
                return new MapViewLayoutParams(this.f6015a, this.f6016b, this.f6017c, this.f6018d, this.f6019e, this.f6020f, this.f6021g, this.f6022h, this.f6023i);
            }
            throw new IllegalStateException("BDMapSDKException: if it is map mode, you must supply position info; else if it is absolute mode, you must supply the point info");
        }

        public Builder height(int i8) {
            this.f6016b = i8;
            return this;
        }

        public Builder layoutMode(ELayoutMode eLayoutMode) {
            this.f6019e = eLayoutMode;
            return this;
        }

        public Builder point(Point point) {
            this.f6018d = point;
            return this;
        }

        public Builder position(LatLng latLng) {
            this.f6017c = latLng;
            return this;
        }

        public Builder width(int i8) {
            this.f6015a = i8;
            return this;
        }

        public Builder xOffset(int i8) {
            this.f6023i = i8;
            return this;
        }

        public Builder yOffset(int i8) {
            this.f6022h = i8;
            return this;
        }
    }

    public enum ELayoutMode {
        mapMode,
        absoluteMode
    }

    MapViewLayoutParams(int i8, int i9, LatLng latLng, Point point, ELayoutMode eLayoutMode, int i10, int i11, int i12, int i13) {
        super(i8, i9);
        this.f6008a = latLng;
        this.f6009b = point;
        this.f6010c = eLayoutMode;
        if (i10 == 1) {
            this.f6011d = 0.0f;
        } else if (i10 == 2) {
            this.f6011d = 1.0f;
        } else if (i10 != 4) {
            this.f6011d = 0.5f;
        } else {
            this.f6011d = 0.5f;
        }
        if (i11 == 8) {
            this.f6012e = 0.0f;
        } else if (i11 == 16) {
            this.f6012e = 1.0f;
        } else if (i11 != 32) {
            this.f6012e = 1.0f;
        } else {
            this.f6012e = 0.5f;
        }
        this.f6013f = i12;
        this.f6014g = i13;
    }
}
