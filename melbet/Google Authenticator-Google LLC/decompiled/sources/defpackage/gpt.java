package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class gpt {
    public final gsb a;

    public gpt(gsb gsbVar) {
        this.a = gsbVar;
    }

    public static gpt a(String str) {
        jkj k = gsb.a.k();
        if (!k.b.M()) {
            k.t();
        }
        gsb gsbVar = (gsb) k.b;
        str.getClass();
        gsbVar.b |= 1;
        gsbVar.c = str;
        return new gpt((gsb) k.q());
    }

    public final String b() {
        return this.a.c;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof gpt) && this.a.c.equals(((gpt) obj).a.c);
    }

    public final int hashCode() {
        return this.a.c.hashCode();
    }

    public final String toString() {
        return String.format("SyncKey[name=%s]", b());
    }
}
