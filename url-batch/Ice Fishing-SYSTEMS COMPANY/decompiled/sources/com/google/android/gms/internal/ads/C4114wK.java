package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.wK, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4114wK extends AbstractC4006uK {

    /* renamed from: n, reason: collision with root package name */
    public final EK f34974n = new EK();

    public final AbstractC4006uK e(String str) {
        return (AbstractC4006uK) this.f34974n.get(str);
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof C4114wK) && ((C4114wK) obj).f34974n.equals(this.f34974n);
        }
        return true;
    }

    public final int hashCode() {
        return this.f34974n.hashCode();
    }
}
