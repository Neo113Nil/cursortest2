package com.google.android.gms.internal.ads;

import t0.AbstractC5051n;

/* loaded from: classes2.dex */
public final class GE {

    /* renamed from: c, reason: collision with root package name */
    public static final GE f25115c;

    /* renamed from: d, reason: collision with root package name */
    public static final GE f25116d;

    /* renamed from: e, reason: collision with root package name */
    public static final GE f25117e;

    /* renamed from: f, reason: collision with root package name */
    public static final GE f25118f;

    /* renamed from: g, reason: collision with root package name */
    public static final GE f25119g;

    /* renamed from: h, reason: collision with root package name */
    public static final GE f25120h;
    public static final GE i;

    /* renamed from: j, reason: collision with root package name */
    public static final GE f25121j;

    /* renamed from: k, reason: collision with root package name */
    public static final GE f25122k;

    /* renamed from: l, reason: collision with root package name */
    public static final GE f25123l;

    /* renamed from: m, reason: collision with root package name */
    public static final GE f25124m;

    /* renamed from: n, reason: collision with root package name */
    public static final GE f25125n;

    /* renamed from: o, reason: collision with root package name */
    public static final GE f25126o;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25127a;

    /* renamed from: b, reason: collision with root package name */
    public String f25128b;

    static {
        int i4 = 0;
        f25115c = new GE("SHA1", i4);
        f25116d = new GE("SHA224", i4);
        f25117e = new GE("SHA256", i4);
        f25118f = new GE("SHA384", i4);
        f25119g = new GE("SHA512", i4);
        int i9 = 1;
        f25120h = new GE("TINK", i9);
        i = new GE("CRUNCHY", i9);
        f25121j = new GE("NO_PREFIX", i9);
        int i10 = 2;
        f25122k = new GE("TINK", i10);
        f25123l = new GE("NO_PREFIX", i10);
        int i11 = 3;
        f25124m = new GE("SHA256", i11);
        f25125n = new GE("SHA384", i11);
        f25126o = new GE("SHA512", i11);
    }

    public static GE a(Lr lr) {
        String str;
        lr.G(2);
        int K8 = lr.K();
        int i4 = K8 >> 1;
        int i9 = K8 & 1;
        int K9 = lr.K() >> 3;
        if (i4 == 4 || i4 == 5 || i4 == 7 || i4 == 8) {
            str = "dvhe";
        } else if (i4 == 9) {
            str = "dvav";
        } else {
            if (i4 != 10) {
                return null;
            }
            str = "dav1";
        }
        int i10 = K9 | (i9 << 5);
        String str2 = com.anythink.core.common.d.j.f12535z;
        String str3 = i4 < 10 ? ".0" : com.anythink.core.common.d.j.f12535z;
        int length = str3.length() + 4;
        int length2 = String.valueOf(i4).length();
        int length3 = String.valueOf(i10).length();
        if (i10 < 10) {
            str2 = ".0";
        }
        StringBuilder sb = new StringBuilder(AbstractC5051n.a(length + length2, length3, str2));
        sb.append(str);
        sb.append(str3);
        sb.append(i4);
        sb.append(str2);
        sb.append(i10);
        return new GE(sb.toString(), 5);
    }

    public String toString() {
        switch (this.f25127a) {
            case 0:
                return this.f25128b;
            case 1:
                return this.f25128b;
            case 2:
                return this.f25128b;
            case 3:
                return this.f25128b;
            default:
                return super.toString();
        }
    }

    public /* synthetic */ GE(String str, int i4) {
        this.f25127a = i4;
        this.f25128b = str;
    }
}
