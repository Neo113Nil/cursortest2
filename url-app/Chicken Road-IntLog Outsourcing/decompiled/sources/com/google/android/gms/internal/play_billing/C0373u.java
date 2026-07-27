package com.google.android.gms.internal.play_billing;

/* renamed from: com.google.android.gms.internal.play_billing.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0373u extends AbstractC0376v {

    /* renamed from: b, reason: collision with root package name */
    public static final C0373u f5264b = new C0373u(0);

    /* renamed from: c, reason: collision with root package name */
    public static final C0373u f5265c = new C0373u(1);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5266a;

    public /* synthetic */ C0373u(int i2) {
        this.f5266a = i2;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC0376v
    public final int a(AbstractC0376v abstractC0376v) {
        switch (this.f5266a) {
            case 0:
                return abstractC0376v == this ? 0 : 1;
            default:
                return abstractC0376v == this ? 0 : -1;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC0376v
    public final void b(StringBuilder sb) {
        switch (this.f5266a) {
            case 0:
                throw new AssertionError();
            default:
                sb.append("(-∞");
                return;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC0376v
    public final void c(StringBuilder sb) {
        switch (this.f5266a) {
            case 0:
                sb.append("+∞)");
                return;
            default:
                throw new AssertionError();
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        switch (this.f5266a) {
            case 0:
                return ((AbstractC0376v) obj) == this ? 0 : 1;
            default:
                return ((AbstractC0376v) obj) == this ? 0 : -1;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC0376v
    public final int hashCode() {
        switch (this.f5266a) {
        }
        return System.identityHashCode(this);
    }

    public final String toString() {
        switch (this.f5266a) {
            case 0:
                return "+∞";
            default:
                return "-∞";
        }
    }
}
