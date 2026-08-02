package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ily {
    public static jli a(Object obj, Object obj2) {
        jli jliVar = (jli) obj;
        jli jliVar2 = (jli) obj2;
        if (!jliVar2.isEmpty()) {
            if (!jliVar.b) {
                jliVar = jliVar.a();
            }
            jliVar.b();
            if (!jliVar2.isEmpty()) {
                jliVar.putAll(jliVar2);
            }
        }
        return jliVar;
    }

    public static final boolean b(Object obj) {
        return !((jli) obj).b;
    }

    public static final Object c() {
        return jli.a.a();
    }

    public static final iwq d(Object obj) {
        return (iwq) ((ikk) obj).a;
    }
}
