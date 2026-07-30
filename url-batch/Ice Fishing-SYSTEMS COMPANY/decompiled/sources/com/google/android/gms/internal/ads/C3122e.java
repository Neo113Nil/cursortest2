package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.e, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3122e extends AbstractC3446k implements Comparable {

    /* renamed from: x, reason: collision with root package name */
    public final int f30268x;

    /* renamed from: y, reason: collision with root package name */
    public final int f30269y;

    public C3122e(int i, B8 b82, int i4, C3286h c3286h, int i9) {
        super(i, b82, i4);
        int i10;
        this.f30268x = AbstractC3149eQ.J(i9, c3286h.f31122B) ? 1 : 0;
        TP tp = this.f32229w;
        int i11 = tp.f27783v;
        int i12 = -1;
        if (i11 != -1 && (i10 = tp.f27784w) != -1) {
            i12 = i11 * i10;
        }
        this.f30269y = i12;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3446k
    public final int a() {
        return this.f30268x;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3446k
    public final /* bridge */ /* synthetic */ boolean b(AbstractC3446k abstractC3446k) {
        return false;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Integer.compare(this.f30269y, ((C3122e) obj).f30269y);
    }
}
