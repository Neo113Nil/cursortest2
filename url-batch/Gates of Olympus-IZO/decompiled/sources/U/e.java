package U;

/* loaded from: classes.dex */
public final class e extends Z1.j implements Y1.e {

    /* renamed from: e, reason: collision with root package name */
    public static final e f3297e = new e(2);

    @Override // Y1.e
    public final Object g(Object obj, Object obj2) {
        String str = (String) obj;
        j jVar = (j) obj2;
        if (str.length() == 0) {
            return jVar.toString();
        }
        return str + ", " + jVar;
    }
}
