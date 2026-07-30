package com.baidu.mapapi.map;

import android.graphics.Color;
import android.os.Bundle;
import com.baidu.mapapi.model.LatLng;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes2.dex */
public class HexagonMap {
    public static final Gradient DEFAULT_GRADIENT;
    public static final int DEFAULT_MAX_HIGH = 0;
    public static final int DEFAULT_MAX_LEVEL = 22;
    public static final int DEFAULT_MIN_LEVEL = 4;

    /* renamed from: a, reason: collision with root package name */
    private static final int[] f5877a;

    /* renamed from: b, reason: collision with root package name */
    private static final float[] f5878b;

    /* renamed from: c, reason: collision with root package name */
    private Collection<WeightedLatLng> f5879c;

    /* renamed from: d, reason: collision with root package name */
    private float f5880d;

    /* renamed from: e, reason: collision with root package name */
    private float f5881e;

    /* renamed from: f, reason: collision with root package name */
    private HexagonType f5882f;

    /* renamed from: g, reason: collision with root package name */
    private float f5883g;

    /* renamed from: h, reason: collision with root package name */
    private float f5884h;
    protected b hexagonMapLayerListener;

    /* renamed from: i, reason: collision with root package name */
    private float f5885i;

    /* renamed from: j, reason: collision with root package name */
    private Gradient f5886j;

    /* renamed from: k, reason: collision with root package name */
    private int f5887k;

    /* renamed from: l, reason: collision with root package name */
    private int f5888l;

    /* renamed from: m, reason: collision with root package name */
    private int[] f5889m;

    /* renamed from: n, reason: collision with root package name */
    private float[] f5890n;

    public static class Builder {

        /* renamed from: a, reason: collision with root package name */
        private Collection<WeightedLatLng> f5891a;

        /* renamed from: b, reason: collision with root package name */
        private float f5892b = 200.0f;

        /* renamed from: c, reason: collision with root package name */
        private HexagonType f5893c = HexagonType.VERTEX_UP;

        /* renamed from: d, reason: collision with root package name */
        private float f5894d = 5.0f;

        /* renamed from: e, reason: collision with root package name */
        private Gradient f5895e = HexagonMap.DEFAULT_GRADIENT;

        /* renamed from: f, reason: collision with root package name */
        private float f5896f = 1.0f;

        /* renamed from: g, reason: collision with root package name */
        private int f5897g = 0;

        /* renamed from: h, reason: collision with root package name */
        private int f5898h = 22;

        /* renamed from: i, reason: collision with root package name */
        private int f5899i = 4;

        /* renamed from: j, reason: collision with root package name */
        private float f5900j = 1.0f;

        /* renamed from: k, reason: collision with root package name */
        private float f5901k = 0.0f;

        public HexagonMap build() {
            if (this.f5891a != null) {
                return new HexagonMap(this);
            }
            throw new IllegalStateException("BDMapSDKException: No input data: you must use either .data or .weightedData before building");
        }

        public Builder data(Collection<LatLng> collection) {
            if (collection == null || collection.isEmpty()) {
                throw new IllegalArgumentException("BDMapSDKException: No input points.");
            }
            if (collection.contains(null)) {
                throw new IllegalArgumentException("BDMapSDKException: input points can not contain null.");
            }
            return weightedData(HexagonMap.b(collection));
        }

        public Builder gap(float f8) {
            if (f8 < 0.0f) {
                this.f5894d = 0.0f;
                return this;
            }
            this.f5894d = f8;
            return this;
        }

        public Builder gradient(Gradient gradient) {
            if (gradient == null) {
                throw new IllegalArgumentException("BDMapSDKException: gradient can not be null");
            }
            this.f5895e = gradient;
            return this;
        }

        public Builder hexagonType(HexagonType hexagonType) {
            this.f5893c = hexagonType;
            return this;
        }

        public Builder maxIntensity(float f8) {
            if (f8 >= 0.0f && f8 > this.f5901k) {
                this.f5900j = f8;
            }
            return this;
        }

        public Builder maxShowLevel(int i8) {
            if (i8 < this.f5899i) {
                return this;
            }
            if (i8 > 22) {
                this.f5898h = 22;
            }
            this.f5898h = i8;
            return this;
        }

        public Builder minIntensity(float f8) {
            if (f8 < 0.0f) {
                this.f5901k = 0.0f;
                return this;
            }
            if (f8 >= this.f5900j) {
                return this;
            }
            this.f5901k = f8;
            return this;
        }

        public Builder minShowLevel(int i8) {
            if (i8 < 4) {
                this.f5899i = 4;
                return this;
            }
            if (i8 > this.f5898h) {
                return this;
            }
            this.f5899i = i8;
            return this;
        }

        public Builder opacity(float f8) {
            if (f8 < 0.0f) {
                this.f5896f = 0.0f;
                return this;
            }
            if (f8 > 1.0f) {
                this.f5896f = 1.0f;
                return this;
            }
            this.f5896f = f8;
            return this;
        }

        public Builder radius(int i8) {
            if (i8 < 0) {
                return this;
            }
            this.f5892b = i8;
            return this;
        }

        public Builder weightedData(Collection<WeightedLatLng> collection) {
            if (collection == null || collection.isEmpty()) {
                throw new IllegalArgumentException("BDMapSDKException: No input points.");
            }
            if (collection.contains(null)) {
                throw new IllegalArgumentException("BDMapSDKException: input points can not contain null.");
            }
            this.f5891a = collection;
            return this;
        }
    }

    public enum HexagonType {
        VERTEX_UP,
        EDGE_UP
    }

    interface b {
        void a(HexagonMap hexagonMap);

        void a(HexagonMap hexagonMap, boolean z7);
    }

    static {
        int[] iArr = {Color.rgb(0, 0, 250), Color.rgb(0, 225, 0), Color.rgb(255, 0, 0)};
        f5877a = iArr;
        float[] fArr = {0.0f, 0.5f, 1.0f};
        f5878b = fArr;
        DEFAULT_GRADIENT = new Gradient(iArr, fArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Collection<WeightedLatLng> b(Collection<LatLng> collection) {
        ArrayList arrayList = new ArrayList();
        Iterator<LatLng> it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(new WeightedLatLng(it.next()));
        }
        return arrayList;
    }

    public void remove() {
        Collection<WeightedLatLng> collection = this.f5879c;
        if (collection != null) {
            collection.clear();
        }
        this.hexagonMapLayerListener.a(this);
    }

    public void setShow(boolean z7) {
        this.hexagonMapLayerListener.a(this, z7);
    }

    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putFloat("radius", this.f5880d);
        bundle.putFloat("gap", this.f5881e);
        bundle.putFloat("alpha", this.f5883g);
        new HexagonMapData(this.f5879c, this.f5884h).toBundle(bundle);
        bundle.putIntArray("color_array", this.f5889m);
        bundle.putInt("hexagon_type", this.f5882f.ordinal());
        bundle.putFloatArray("color_start_points", this.f5890n);
        bundle.putFloat("max_intentity", this.f5884h);
        bundle.putFloat("min_intentity", this.f5885i);
        bundle.putFloat("max_show_level", this.f5887k);
        bundle.putFloat("min_show_level", this.f5888l);
        return bundle;
    }

    private HexagonMap(Builder builder) {
        this.f5879c = builder.f5891a;
        this.f5880d = builder.f5892b;
        this.f5881e = builder.f5894d;
        this.f5882f = builder.f5893c;
        this.f5886j = builder.f5895e;
        this.f5887k = builder.f5898h;
        this.f5888l = builder.f5899i;
        this.f5884h = builder.f5900j;
        this.f5885i = builder.f5901k;
        this.f5883g = builder.f5896f;
        a(this.f5886j);
    }

    private void a(Gradient gradient) {
        this.f5886j = gradient;
        this.f5889m = gradient.a(this.f5883g);
        this.f5890n = gradient.b();
    }
}
