package androidx.activity;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class ImmLeaksCleaner implements androidx.lifecycle.p {
    static {
        new m2.b(z.f146f);
    }

    @Override // androidx.lifecycle.p
    public final void a(androidx.lifecycle.r rVar, androidx.lifecycle.l lVar) {
        if (lVar == androidx.lifecycle.l.ON_DESTROY) {
            throw null;
        }
    }
}
