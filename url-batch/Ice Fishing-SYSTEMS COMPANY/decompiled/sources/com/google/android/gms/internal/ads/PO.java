package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: classes2.dex */
public final class PO {

    /* renamed from: a, reason: collision with root package name */
    public final String f26921a;

    /* renamed from: b, reason: collision with root package name */
    public int f26922b;

    /* renamed from: c, reason: collision with root package name */
    public long f26923c;

    /* renamed from: d, reason: collision with root package name */
    public final BQ f26924d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f26925e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f26926f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ QO f26927g;

    public PO(QO qo, String str, int i, BQ bq) {
        Objects.requireNonNull(qo);
        this.f26927g = qo;
        this.f26921a = str;
        this.f26922b = i;
        this.f26923c = bq == null ? -1L : bq.f24046d;
        if (bq == null || !bq.b()) {
            return;
        }
        this.f26924d = bq;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000e, code lost:
    
        if (r0 < r9.a()) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a(AbstractC3832r8 abstractC3832r8, AbstractC3832r8 abstractC3832r82) {
        BQ bq;
        int i = this.f26922b;
        if (i < abstractC3832r8.a()) {
            QO qo = this.f26927g;
            abstractC3832r8.b(i, qo.f27150a, 0L);
            Y7 y72 = qo.f27150a;
            for (int i4 = y72.f28803k; i4 <= y72.f28804l; i4++) {
                int e6 = abstractC3832r82.e(abstractC3832r8.f(i4));
                if (e6 != -1) {
                    i = abstractC3832r82.d(e6, qo.f27151b, false).f26108c;
                    break;
                }
            }
            i = -1;
        }
        this.f26922b = i;
        return i != -1 && ((bq = this.f26924d) == null || abstractC3832r82.e(bq.f24043a) != -1);
    }

    public final boolean b(KO ko) {
        BQ bq = ko.f25962d;
        if (bq == null) {
            return this.f26922b != ko.f25961c;
        }
        long j9 = this.f26923c;
        if (j9 == -1) {
            return false;
        }
        long j10 = bq.f24046d;
        if (j10 > j9) {
            return true;
        }
        BQ bq2 = this.f26924d;
        if (bq2 == null) {
            return false;
        }
        AbstractC3832r8 abstractC3832r8 = ko.f25960b;
        int e6 = abstractC3832r8.e(bq.f24043a);
        int e9 = abstractC3832r8.e(bq2.f24043a);
        if (j10 < bq2.f24046d || e6 < e9) {
            return false;
        }
        if (e6 > e9) {
            return true;
        }
        boolean b9 = bq.b();
        int i = bq2.f24044b;
        if (!b9) {
            int i4 = bq.f24047e;
            return i4 == -1 || i4 > i;
        }
        int i9 = bq.f24044b;
        if (i9 > i) {
            return true;
        }
        if (i9 == i) {
            return bq.f24045c > bq2.f24045c;
        }
        return false;
    }
}
