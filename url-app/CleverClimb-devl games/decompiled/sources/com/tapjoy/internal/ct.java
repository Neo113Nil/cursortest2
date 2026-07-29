package com.tapjoy.internal;

/* loaded from: classes2.dex */
public final class ct {

    /* renamed from: a, reason: collision with root package name */
    public final cw f7895a;

    /* renamed from: b, reason: collision with root package name */
    public final cw f7896b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f7897c;

    private ct(cw cwVar, cw cwVar2) {
        this.f7895a = cwVar;
        if (cwVar2 == null) {
            this.f7896b = cw.NONE;
        } else {
            this.f7896b = cwVar2;
        }
        this.f7897c = false;
    }

    public static ct a(cw cwVar, cw cwVar2) {
        dp.a(cwVar, "Impression owner is null");
        if (cwVar.equals(cw.NONE)) {
            throw new IllegalArgumentException("Impression owner is none");
        }
        return new ct(cwVar, cwVar2);
    }
}
