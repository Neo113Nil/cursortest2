package M2;

/* loaded from: classes.dex */
public abstract class s extends u implements S2.d, S2.e {
    @Override // M2.AbstractC0253e
    public final S2.a a() {
        F.f3581a.getClass();
        return this;
    }

    @Override // S2.d
    public final void i() {
        if (this.f3610m) {
            throw new UnsupportedOperationException("Kotlin reflection is not yet supported for synthetic Java properties. Please follow/upvote https://youtrack.jetbrains.com/issue/KT-55980");
        }
        S2.a c4 = c();
        if (c4 == this) {
            throw new K2.a();
        }
        ((s) ((S2.e) c4)).i();
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ((t) this).i();
        throw null;
    }
}
