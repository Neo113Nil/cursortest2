package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.r1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3825r1 implements InterfaceC3664o1 {

    /* renamed from: a, reason: collision with root package name */
    public final int f33927a;

    /* renamed from: b, reason: collision with root package name */
    public final int f33928b;

    /* renamed from: c, reason: collision with root package name */
    public final int f33929c;

    /* renamed from: d, reason: collision with root package name */
    public final int f33930d;

    /* renamed from: e, reason: collision with root package name */
    public final int f33931e;

    /* renamed from: f, reason: collision with root package name */
    public final int f33932f;

    public C3825r1(int i, int i4, int i9, int i10, int i11, int i12) {
        this.f33927a = i;
        this.f33928b = i4;
        this.f33929c = i9;
        this.f33930d = i10;
        this.f33931e = i11;
        this.f33932f = i12;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3664o1
    public final int a() {
        return 1752331379;
    }

    public final int b() {
        int i = this.f33927a;
        if (i == 1935960438) {
            return 2;
        }
        if (i == 1935963489) {
            return 1;
        }
        if (i == 1937012852) {
            return 3;
        }
        AbstractC3217fl.I("AviStreamHeaderChunk", "Found unsupported streamType fourCC: ".concat(String.valueOf(Integer.toHexString(i))));
        return -1;
    }
}
