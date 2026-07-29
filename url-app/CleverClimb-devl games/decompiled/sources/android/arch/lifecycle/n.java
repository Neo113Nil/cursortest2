package android.arch.lifecycle;

/* compiled from: ViewModelProvider.java */
/* loaded from: classes.dex */
public class n {

    /* renamed from: a, reason: collision with root package name */
    private final a f1373a;

    /* renamed from: b, reason: collision with root package name */
    private final o f1374b;

    /* compiled from: ViewModelProvider.java */
    public interface a {
        <T extends m> T create(Class<T> cls);
    }

    public n(o oVar, a aVar) {
        this.f1373a = aVar;
        this.f1374b = oVar;
    }

    public <T extends m> T a(Class<T> cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName == null) {
            throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
        }
        return (T) a("android.arch.lifecycle.ViewModelProvider.DefaultKey:" + canonicalName, cls);
    }

    public <T extends m> T a(String str, Class<T> cls) {
        T t = (T) this.f1374b.a(str);
        if (cls.isInstance(t)) {
            return t;
        }
        T t2 = (T) this.f1373a.create(cls);
        this.f1374b.a(str, t2);
        return t2;
    }
}
