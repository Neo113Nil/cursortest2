package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class bk {
    public static final /* synthetic */ int a = 0;
    private static final qy b = new qy(0);

    public static Class a(ClassLoader classLoader, String str) {
        qy qyVar = b;
        qy qyVar2 = (qy) qyVar.get(classLoader);
        if (qyVar2 == null) {
            qyVar2 = new qy(0);
            qyVar.put(classLoader, qyVar2);
        }
        Class cls = (Class) qyVar2.get(str);
        if (cls != null) {
            return cls;
        }
        Class<?> cls2 = Class.forName(str, false, classLoader);
        qyVar2.put(str, cls2);
        return cls2;
    }

    public bd b(String str) {
        throw null;
    }
}
