package j$.time;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes2.dex */
public final /* synthetic */ class h {
    public static /* synthetic */ void a(String str) {
        throw new c(str);
    }

    public static /* synthetic */ void b(String str, int i) {
        throw new c(str + i);
    }

    public static /* synthetic */ void c(String str, int i, Object obj) {
        throw new c(str + i + obj);
    }

    public static /* synthetic */ void d(String str, Object obj) {
        throw new j$.time.temporal.t(str + obj);
    }

    public static /* synthetic */ void e(String str, Object obj, Object obj2) {
        throw new ClassCastException(str + obj + ((Object) ", actual: ") + obj2);
    }

    public static /* synthetic */ void f(String str, Object obj, Object obj2, Object obj3) {
        throw new c(str + obj + obj2 + obj3);
    }

    public static /* synthetic */ void g(String str, Object obj, Object obj2, Throwable th) {
        throw new c(str + obj + ((Object) " of type ") + obj2, th);
    }

    public static /* synthetic */ void h(String str, int i) {
        throw new IllegalArgumentException(str + i);
    }

    public static /* synthetic */ void i(String str, Object obj) {
        throw new c(str + obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void j(String str, int i) {
        throw new IllegalArgumentException(str + ((char) i));
    }
}
