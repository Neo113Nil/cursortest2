package com.google.android.gms.internal.play_billing;

/* renamed from: com.google.android.gms.internal.play_billing.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0264u extends AbstractC0267v {

    /* renamed from: b, reason: collision with root package name */
    public static final C0264u f2936b = new C0264u(0);

    /* renamed from: c, reason: collision with root package name */
    public static final C0264u f2937c = new C0264u(1);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2938a;

    public /* synthetic */ C0264u(int i3) {
        this.f2938a = i3;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC0267v
    public final int a(AbstractC0267v abstractC0267v) {
        switch (this.f2938a) {
            case 0:
                return abstractC0267v == this ? 0 : 1;
            default:
                return abstractC0267v == this ? 0 : -1;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC0267v
    public final void b(StringBuilder sb) {
        switch (this.f2938a) {
            case 0:
                throw new AssertionError();
            default:
                sb.append("(-∞");
                return;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC0267v
    public final void c(StringBuilder sb) {
        switch (this.f2938a) {
            case 0:
                sb.append("+∞)");
                return;
            default:
                throw new AssertionError();
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        switch (this.f2938a) {
            case 0:
                return ((AbstractC0267v) obj) == this ? 0 : 1;
            default:
                return ((AbstractC0267v) obj) == this ? 0 : -1;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC0267v
    public final int hashCode() {
        switch (this.f2938a) {
        }
        return System.identityHashCode(this);
    }

    public final String toString() {
        switch (this.f2938a) {
            case 0:
                return "+∞";
            default:
                return "-∞";
        }
    }
}
