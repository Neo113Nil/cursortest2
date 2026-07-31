package kotlin.jvm.internal;

/* loaded from: classes.dex */
public class m {
    public j6.e a(g gVar) {
        return gVar;
    }

    public j6.c b(Class cls) {
        return new c(cls);
    }

    public j6.d c(Class cls, String str) {
        return new k(cls, str);
    }

    public String d(f fVar) {
        String obj = fVar.getClass().getGenericInterfaces()[0].toString();
        return obj.startsWith("kotlin.jvm.functions.") ? obj.substring(21) : obj;
    }

    public String e(j jVar) {
        return d(jVar);
    }
}
