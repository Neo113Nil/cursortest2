package com.baidu.mapapi.map;

/* loaded from: classes2.dex */
public class MyLocationData {
    public final float accuracy;
    public final float direction;
    public final double latitude;
    public final double longitude;
    public final int satellitesNum;
    public final float speed;

    public static class Builder {

        /* renamed from: a, reason: collision with root package name */
        private double f6105a;

        /* renamed from: b, reason: collision with root package name */
        private double f6106b;

        /* renamed from: c, reason: collision with root package name */
        private float f6107c;

        /* renamed from: d, reason: collision with root package name */
        private float f6108d;

        /* renamed from: e, reason: collision with root package name */
        private float f6109e;

        /* renamed from: f, reason: collision with root package name */
        private int f6110f;

        public Builder accuracy(float f8) {
            this.f6109e = f8;
            return this;
        }

        public MyLocationData build() {
            return new MyLocationData(this.f6105a, this.f6106b, this.f6107c, this.f6108d, this.f6109e, this.f6110f);
        }

        public Builder direction(float f8) {
            this.f6108d = f8;
            return this;
        }

        public Builder latitude(double d8) {
            this.f6105a = d8;
            return this;
        }

        public Builder longitude(double d8) {
            this.f6106b = d8;
            return this;
        }

        public Builder satellitesNum(int i8) {
            this.f6110f = i8;
            return this;
        }

        public Builder speed(float f8) {
            this.f6107c = f8;
            return this;
        }
    }

    MyLocationData(double d8, double d9, float f8, float f9, float f10, int i8) {
        this.latitude = d8;
        this.longitude = d9;
        this.speed = f8;
        this.direction = f9;
        this.accuracy = f10;
        this.satellitesNum = i8;
    }
}
