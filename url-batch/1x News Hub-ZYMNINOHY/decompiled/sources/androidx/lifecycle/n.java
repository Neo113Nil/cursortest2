package androidx.lifecycle;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public h f2385a;

    /* renamed from: b, reason: collision with root package name */
    public l f2386b;

    public final void a(m mVar, EnumC0165g enumC0165g) {
        h a3 = enumC0165g.a();
        h state1 = this.f2385a;
        kotlin.jvm.internal.j.e(state1, "state1");
        if (a3.compareTo(state1) < 0) {
            state1 = a3;
        }
        this.f2385a = state1;
        this.f2386b.a(mVar, enumC0165g);
        this.f2385a = a3;
    }
}
