package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jqw {
    private ago a;
    private final String b;

    public jqw(ago agoVar) {
        this.a = agoVar;
        this.b = (String) agoVar.a(agj.a);
    }

    public final void a() {
        this.a = null;
    }

    public final void b(ago agoVar) {
        agp agpVar = new agp(agoVar);
        agpVar.b(agj.a, this.b);
        this.a = agpVar;
    }

    public final boolean c() {
        return this.a == null;
    }
}
