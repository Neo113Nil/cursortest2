package d;

import b.ac;
import b.ad;
import b.s;

/* compiled from: Response.java */
/* loaded from: classes2.dex */
public final class m<T> {

    /* renamed from: a, reason: collision with root package name */
    private final ac f9607a;

    /* renamed from: b, reason: collision with root package name */
    private final T f9608b;

    /* renamed from: c, reason: collision with root package name */
    private final ad f9609c;

    public static <T> m<T> a(T t, ac acVar) {
        if (acVar == null) {
            throw new NullPointerException("rawResponse == null");
        }
        if (!acVar.c()) {
            throw new IllegalArgumentException("rawResponse must be successful response");
        }
        return new m<>(acVar, t, null);
    }

    public static <T> m<T> a(ad adVar, ac acVar) {
        if (adVar == null) {
            throw new NullPointerException("body == null");
        }
        if (acVar == null) {
            throw new NullPointerException("rawResponse == null");
        }
        if (acVar.c()) {
            throw new IllegalArgumentException("rawResponse should not be successful response");
        }
        return new m<>(acVar, null, adVar);
    }

    private m(ac acVar, T t, ad adVar) {
        this.f9607a = acVar;
        this.f9608b = t;
        this.f9609c = adVar;
    }

    public int a() {
        return this.f9607a.b();
    }

    public s b() {
        return this.f9607a.e();
    }

    public boolean c() {
        return this.f9607a.c();
    }

    public T d() {
        return this.f9608b;
    }

    public String toString() {
        return this.f9607a.toString();
    }
}
