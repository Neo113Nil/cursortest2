package com.baidu.mapapi.map;

import android.graphics.Color;

/* loaded from: classes2.dex */
public class MyLocationConfiguration {

    /* renamed from: a, reason: collision with root package name */
    private boolean f6089a;
    public int accuracyCircleFillColor;
    public int accuracyCircleStrokeColor;

    /* renamed from: b, reason: collision with root package name */
    private boolean f6090b;

    /* renamed from: c, reason: collision with root package name */
    private BitmapDescriptor f6091c;

    /* renamed from: d, reason: collision with root package name */
    private float f6092d;

    /* renamed from: e, reason: collision with root package name */
    private BitmapDescriptor f6093e;
    public boolean enableArrow;
    public boolean enableDirection;

    /* renamed from: f, reason: collision with root package name */
    private String f6094f;

    /* renamed from: g, reason: collision with root package name */
    private float f6095g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f6096h;
    public final LocationMode locationMode;
    public int width;

    public static class Builder {

        /* renamed from: d, reason: collision with root package name */
        private String f6100d;
        public boolean enableArrow;
        public LocationMode locationMode;
        public boolean enableDirection = true;

        /* renamed from: a, reason: collision with root package name */
        private boolean f6097a = false;

        /* renamed from: b, reason: collision with root package name */
        private BitmapDescriptor f6098b = null;

        /* renamed from: c, reason: collision with root package name */
        private BitmapDescriptor f6099c = null;

        /* renamed from: e, reason: collision with root package name */
        private float f6101e = 1.0f;

        /* renamed from: f, reason: collision with root package name */
        private float f6102f = 1.0f;

        /* renamed from: g, reason: collision with root package name */
        private boolean f6103g = true;
        public int accuracyCircleStrokeColor = 4653056;
        public int accuracyCircleFillColor = 4521984;

        public Builder(LocationMode locationMode, boolean z7) {
            this.locationMode = locationMode;
            this.enableArrow = z7;
        }

        public MyLocationConfiguration build() {
            return new MyLocationConfiguration(this);
        }

        public Builder setAccuracyCircleFillColor(int i8) {
            this.accuracyCircleFillColor = a(i8);
            return this;
        }

        public Builder setAccuracyCircleStrokeColor(int i8) {
            this.accuracyCircleStrokeColor = a(i8);
            return this;
        }

        public Builder setAnimation(boolean z7) {
            this.f6103g = z7;
            return this;
        }

        public Builder setArrow(BitmapDescriptor bitmapDescriptor) {
            this.f6098b = bitmapDescriptor;
            return this;
        }

        public Builder setArrowSize(float f8) {
            this.f6102f = f8;
            return this;
        }

        public Builder setCustomMarker(BitmapDescriptor bitmapDescriptor) {
            this.f6099c = bitmapDescriptor;
            return this;
        }

        public Builder setGifMarker(String str) {
            this.f6100d = str;
            return this;
        }

        public Builder setMarkerRotation(boolean z7) {
            this.f6097a = z7;
            return this;
        }

        public Builder setMarkerSize(float f8) {
            this.f6101e = f8;
            return this;
        }

        private int a(int i8) {
            return Color.argb(((-16777216) & i8) >> 24, i8 & 255, (65280 & i8) >> 8, (16711680 & i8) >> 16);
        }
    }

    public enum LocationMode {
        NORMAL,
        FOLLOWING,
        COMPASS
    }

    private int a(int i8) {
        return Color.argb(((-16777216) & i8) >> 24, i8 & 255, (65280 & i8) >> 8, (16711680 & i8) >> 16);
    }

    public BitmapDescriptor getArrow() {
        return this.f6091c;
    }

    public float getArrowSize() {
        return this.f6092d;
    }

    public BitmapDescriptor getCustomMarker() {
        return this.f6093e;
    }

    public String getGifMarker() {
        return this.f6094f;
    }

    public float getMarkerSize() {
        return this.f6095g;
    }

    public boolean isEnableCustom() {
        return this.f6090b;
    }

    public boolean isEnableRotation() {
        return this.f6089a;
    }

    public boolean isNeedAnimation() {
        return this.f6096h;
    }

    public void setAnimation(boolean z7) {
        this.f6096h = z7;
    }

    public void setArrow(BitmapDescriptor bitmapDescriptor) {
        this.f6091c = bitmapDescriptor;
    }

    public void setArrowSize(float f8) {
        this.f6092d = f8;
    }

    public void setCustomMarker(BitmapDescriptor bitmapDescriptor) {
        this.f6093e = bitmapDescriptor;
    }

    public void setGifMarker(String str) {
        this.f6094f = str;
    }

    public void setMarkerRotation(boolean z7) {
        this.f6089a = z7;
    }

    public void setMarkerSize(float f8) {
        this.f6095g = f8;
    }

    private MyLocationConfiguration(Builder builder) {
        this.enableDirection = true;
        this.f6089a = false;
        this.f6090b = true;
        this.f6092d = 1.0f;
        this.f6095g = 1.0f;
        this.f6096h = true;
        this.accuracyCircleFillColor = 4521984;
        this.accuracyCircleStrokeColor = 4653056;
        this.width = 0;
        this.locationMode = builder.locationMode;
        boolean z7 = builder.enableArrow;
        this.enableArrow = z7;
        this.f6090b = true;
        if (z7) {
            this.f6089a = builder.f6097a;
            if (builder.f6098b == null) {
                builder.setArrow(BitmapDescriptorFactory.fromAsset("icon_arrow.png"));
            }
            this.f6091c = builder.f6098b;
            this.f6093e = builder.f6099c;
            String str = builder.f6100d;
            this.f6094f = str;
            if (this.f6093e == null && str == null) {
                this.f6093e = BitmapDescriptorFactory.fromAsset("icon_blue.png");
            }
            this.f6095g = builder.f6101e;
            this.f6092d = builder.f6102f;
            this.f6096h = builder.f6103g;
        } else {
            this.f6089a = builder.f6097a;
            this.f6094f = builder.f6100d;
            this.f6093e = builder.f6099c;
            this.f6095g = builder.f6101e;
            if (this.f6094f == null && this.f6093e == null) {
                this.f6093e = BitmapDescriptorFactory.fromAsset("icon_blue.png");
            }
            this.f6096h = builder.f6103g;
        }
        this.accuracyCircleFillColor = builder.accuracyCircleFillColor;
        this.accuracyCircleStrokeColor = builder.accuracyCircleStrokeColor;
    }

    public MyLocationConfiguration(LocationMode locationMode, boolean z7, BitmapDescriptor bitmapDescriptor, int i8, int i9) {
        this.enableDirection = true;
        this.f6089a = false;
        this.f6090b = true;
        this.f6092d = 1.0f;
        this.f6095g = 1.0f;
        this.f6096h = true;
        this.accuracyCircleFillColor = 4521984;
        this.accuracyCircleStrokeColor = 4653056;
        this.width = 0;
        this.locationMode = locationMode == null ? LocationMode.NORMAL : locationMode;
        this.f6090b = false;
        this.enableDirection = z7;
        this.f6093e = bitmapDescriptor;
        this.accuracyCircleFillColor = a(i8);
        this.accuracyCircleStrokeColor = a(i9);
    }

    public MyLocationConfiguration(LocationMode locationMode, boolean z7, BitmapDescriptor bitmapDescriptor, int i8, int i9, int i10) {
        this.enableDirection = true;
        this.f6089a = false;
        this.f6090b = true;
        this.f6092d = 1.0f;
        this.f6095g = 1.0f;
        this.f6096h = true;
        this.accuracyCircleFillColor = 4521984;
        this.accuracyCircleStrokeColor = 4653056;
        this.width = 0;
        this.locationMode = locationMode == null ? LocationMode.NORMAL : locationMode;
        this.enableDirection = z7;
        this.f6093e = bitmapDescriptor;
        this.accuracyCircleFillColor = a(i8);
        this.accuracyCircleStrokeColor = a(i9);
        this.width = i10;
    }

    public MyLocationConfiguration(LocationMode locationMode, boolean z7, BitmapDescriptor bitmapDescriptor) {
        this.enableDirection = true;
        this.f6089a = false;
        this.f6090b = true;
        this.f6092d = 1.0f;
        this.f6095g = 1.0f;
        this.f6096h = true;
        this.accuracyCircleFillColor = 4521984;
        this.accuracyCircleStrokeColor = 4653056;
        this.width = 0;
        this.locationMode = locationMode == null ? LocationMode.NORMAL : locationMode;
        this.f6090b = false;
        this.enableDirection = z7;
        this.f6093e = bitmapDescriptor;
        this.accuracyCircleFillColor = a(4521984);
        this.accuracyCircleStrokeColor = a(this.accuracyCircleStrokeColor);
    }
}
