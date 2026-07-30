package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class Ew {

    /* renamed from: a, reason: collision with root package name */
    public String f24856a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f24857b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f24858c;

    /* renamed from: d, reason: collision with root package name */
    public long f24859d;

    /* renamed from: e, reason: collision with root package name */
    public long f24860e;

    /* renamed from: f, reason: collision with root package name */
    public byte f24861f;

    public final Fw a() {
        String str;
        if (this.f24861f == 63 && (str = this.f24856a) != null) {
            return new Fw(str, this.f24857b, this.f24858c, this.f24859d, this.f24860e);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f24856a == null) {
            sb.append(" clientVersion");
        }
        if ((this.f24861f & 1) == 0) {
            sb.append(" shouldGetAdvertisingId");
        }
        if ((this.f24861f & 2) == 0) {
            sb.append(" isGooglePlayServicesAvailable");
        }
        if ((this.f24861f & 4) == 0) {
            sb.append(" enableQuerySignalsTimeout");
        }
        if ((this.f24861f & 8) == 0) {
            sb.append(" querySignalsTimeoutMs");
        }
        if ((this.f24861f & 16) == 0) {
            sb.append(" enableQuerySignalsCache");
        }
        if ((this.f24861f & 32) == 0) {
            sb.append(" querySignalsCacheTtlSeconds");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }
}
