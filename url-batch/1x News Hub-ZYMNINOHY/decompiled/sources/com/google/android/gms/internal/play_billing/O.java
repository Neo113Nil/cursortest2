package com.google.android.gms.internal.play_billing;

/* loaded from: classes.dex */
public final class O extends P {

    /* renamed from: c, reason: collision with root package name */
    public static final O f2770c = new O(C0264u.f2937c, C0264u.f2936b);

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC0267v f2771a;

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC0267v f2772b;

    public O(AbstractC0267v abstractC0267v, AbstractC0267v abstractC0267v2) {
        this.f2771a = abstractC0267v;
        this.f2772b = abstractC0267v2;
        if (abstractC0267v.a(abstractC0267v2) > 0 || abstractC0267v == C0264u.f2936b || abstractC0267v2 == C0264u.f2937c) {
            StringBuilder sb = new StringBuilder(16);
            abstractC0267v.b(sb);
            sb.append("..");
            abstractC0267v2.c(sb);
            throw new IllegalArgumentException("Invalid range: ".concat(sb.toString()));
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof O) {
            O o = (O) obj;
            if (this.f2771a.equals(o.f2771a) && this.f2772b.equals(o.f2772b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f2772b.hashCode() + (this.f2771a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(16);
        this.f2771a.b(sb);
        sb.append("..");
        this.f2772b.c(sb);
        return sb.toString();
    }
}
