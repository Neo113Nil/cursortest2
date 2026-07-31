package y0;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class f extends q6.j implements p6.e {

    /* renamed from: e, reason: collision with root package name */
    public static final f f8700e = new f(2);

    @Override // p6.e
    public final Object g(Object obj, Object obj2) {
        String str = (String) obj;
        k kVar = (k) obj2;
        if (str.length() == 0) {
            return kVar.toString();
        }
        return str + ", " + kVar;
    }
}
