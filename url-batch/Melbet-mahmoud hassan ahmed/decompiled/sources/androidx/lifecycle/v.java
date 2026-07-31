package androidx.lifecycle;

/* loaded from: classes.dex */
public class v {

    /* renamed from: a, reason: collision with root package name */
    private final a f931a;

    /* renamed from: b, reason: collision with root package name */
    private final w f932b;

    public interface a {
        <T extends u> T a(Class<T> cls);
    }

    static abstract class b implements a {
        b() {
        }

        @Override // androidx.lifecycle.v.a
        public <T extends u> T a(Class<T> cls) {
            throw new UnsupportedOperationException("create(String, Class<?>) must be called on implementaions of KeyedFactory");
        }

        public abstract <T extends u> T b(String str, Class<T> cls);
    }

    public v(w wVar, a aVar) {
        this.f931a = aVar;
        this.f932b = wVar;
    }

    public <T extends u> T a(Class<T> cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName == null) {
            throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
        }
        return (T) b("androidx.lifecycle.ViewModelProvider.DefaultKey:" + canonicalName, cls);
    }

    public <T extends u> T b(String str, Class<T> cls) {
        T t6 = (T) this.f932b.b(str);
        if (cls.isInstance(t6)) {
            return t6;
        }
        a aVar = this.f931a;
        T t7 = aVar instanceof b ? (T) ((b) aVar).b(str, cls) : (T) aVar.a(cls);
        this.f932b.c(str, t7);
        return t7;
    }
}
