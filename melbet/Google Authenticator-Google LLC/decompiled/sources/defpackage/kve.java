package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class kve {
    public final Throwable b;
    public final kuh c;

    public kve(Throwable th, boolean z) {
        this.b = th;
        this.c = new kuh(z, kul.a);
    }

    public final boolean a() {
        return this.c.b();
    }

    public final String toString() {
        return kvp.a(this) + "[" + this.b + "]";
    }
}
