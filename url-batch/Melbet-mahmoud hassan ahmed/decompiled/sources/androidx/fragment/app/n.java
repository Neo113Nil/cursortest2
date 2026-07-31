package androidx.fragment.app;

import androidx.lifecycle.e;
import java.lang.reflect.Modifier;
import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class n {

    /* renamed from: b, reason: collision with root package name */
    int f766b;

    /* renamed from: c, reason: collision with root package name */
    int f767c;

    /* renamed from: d, reason: collision with root package name */
    int f768d;

    /* renamed from: e, reason: collision with root package name */
    int f769e;

    /* renamed from: f, reason: collision with root package name */
    int f770f;

    /* renamed from: g, reason: collision with root package name */
    int f771g;

    /* renamed from: h, reason: collision with root package name */
    boolean f772h;

    /* renamed from: j, reason: collision with root package name */
    String f774j;

    /* renamed from: k, reason: collision with root package name */
    int f775k;

    /* renamed from: l, reason: collision with root package name */
    CharSequence f776l;

    /* renamed from: m, reason: collision with root package name */
    int f777m;

    /* renamed from: n, reason: collision with root package name */
    CharSequence f778n;

    /* renamed from: o, reason: collision with root package name */
    ArrayList<String> f779o;

    /* renamed from: p, reason: collision with root package name */
    ArrayList<String> f780p;

    /* renamed from: r, reason: collision with root package name */
    ArrayList<Runnable> f782r;

    /* renamed from: a, reason: collision with root package name */
    ArrayList<a> f765a = new ArrayList<>();

    /* renamed from: i, reason: collision with root package name */
    boolean f773i = true;

    /* renamed from: q, reason: collision with root package name */
    boolean f781q = false;

    static final class a {

        /* renamed from: a, reason: collision with root package name */
        int f783a;

        /* renamed from: b, reason: collision with root package name */
        Fragment f784b;

        /* renamed from: c, reason: collision with root package name */
        int f785c;

        /* renamed from: d, reason: collision with root package name */
        int f786d;

        /* renamed from: e, reason: collision with root package name */
        int f787e;

        /* renamed from: f, reason: collision with root package name */
        int f788f;

        /* renamed from: g, reason: collision with root package name */
        e.c f789g;

        /* renamed from: h, reason: collision with root package name */
        e.c f790h;

        a() {
        }

        a(int i7, Fragment fragment) {
            this.f783a = i7;
            this.f784b = fragment;
            e.c cVar = e.c.RESUMED;
            this.f789g = cVar;
            this.f790h = cVar;
        }
    }

    public n b(Fragment fragment, String str) {
        f(0, fragment, str, 1);
        return this;
    }

    void c(a aVar) {
        this.f765a.add(aVar);
        aVar.f785c = this.f766b;
        aVar.f786d = this.f767c;
        aVar.f787e = this.f768d;
        aVar.f788f = this.f769e;
    }

    public abstract int d();

    public abstract int e();

    void f(int i7, Fragment fragment, String str, int i8) {
        Class<?> cls = fragment.getClass();
        int modifiers = cls.getModifiers();
        if (cls.isAnonymousClass() || !Modifier.isPublic(modifiers) || (cls.isMemberClass() && !Modifier.isStatic(modifiers))) {
            throw new IllegalStateException("Fragment " + cls.getCanonicalName() + " must be a public static class to be  properly recreated from instance state.");
        }
        if (str != null) {
            String str2 = fragment.C;
            if (str2 != null && !str.equals(str2)) {
                throw new IllegalStateException("Can't change tag of fragment " + fragment + ": was " + fragment.C + " now " + str);
            }
            fragment.C = str;
        }
        if (i7 != 0) {
            if (i7 == -1) {
                throw new IllegalArgumentException("Can't add fragment " + fragment + " with tag " + str + " to container view with no id");
            }
            int i9 = fragment.A;
            if (i9 != 0 && i9 != i7) {
                throw new IllegalStateException("Can't change container ID of fragment " + fragment + ": was " + fragment.A + " now " + i7);
            }
            fragment.A = i7;
            fragment.B = i7;
        }
        c(new a(i8, fragment));
    }

    public n g(Fragment fragment) {
        c(new a(3, fragment));
        return this;
    }
}
