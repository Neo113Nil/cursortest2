package com.google.android.gms.internal.ads;

import android.os.IBinder;

/* loaded from: classes2.dex */
public final class DA {

    /* renamed from: a, reason: collision with root package name */
    public IBinder f24347a;

    /* renamed from: b, reason: collision with root package name */
    public String f24348b;

    /* renamed from: c, reason: collision with root package name */
    public int f24349c;

    /* renamed from: d, reason: collision with root package name */
    public float f24350d;

    /* renamed from: e, reason: collision with root package name */
    public int f24351e;

    /* renamed from: f, reason: collision with root package name */
    public String f24352f;

    /* renamed from: g, reason: collision with root package name */
    public byte f24353g;

    public final EA a() {
        IBinder iBinder;
        if (this.f24353g == 31 && (iBinder = this.f24347a) != null) {
            return new EA(iBinder, this.f24348b, this.f24349c, this.f24350d, this.f24351e, this.f24352f);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f24347a == null) {
            sb.append(" windowToken");
        }
        if ((this.f24353g & 1) == 0) {
            sb.append(" layoutGravity");
        }
        if ((this.f24353g & 2) == 0) {
            sb.append(" layoutVerticalMargin");
        }
        if ((this.f24353g & 4) == 0) {
            sb.append(" displayMode");
        }
        if ((this.f24353g & 8) == 0) {
            sb.append(" triggerMode");
        }
        if ((this.f24353g & 16) == 0) {
            sb.append(" windowWidthPx");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }
}
