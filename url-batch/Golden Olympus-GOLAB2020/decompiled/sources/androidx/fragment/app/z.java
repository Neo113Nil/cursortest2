package androidx.fragment.app;

import android.view.ViewGroup;
import androidx.lifecycle.AbstractC1346l;
import java.lang.reflect.Modifier;
import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class z {

    /* renamed from: a, reason: collision with root package name */
    private final l f12531a;

    /* renamed from: b, reason: collision with root package name */
    private final ClassLoader f12532b;

    /* renamed from: d, reason: collision with root package name */
    int f12534d;

    /* renamed from: e, reason: collision with root package name */
    int f12535e;

    /* renamed from: f, reason: collision with root package name */
    int f12536f;

    /* renamed from: g, reason: collision with root package name */
    int f12537g;

    /* renamed from: h, reason: collision with root package name */
    int f12538h;

    /* renamed from: i, reason: collision with root package name */
    boolean f12539i;

    /* renamed from: k, reason: collision with root package name */
    String f12541k;

    /* renamed from: l, reason: collision with root package name */
    int f12542l;

    /* renamed from: m, reason: collision with root package name */
    CharSequence f12543m;

    /* renamed from: n, reason: collision with root package name */
    int f12544n;

    /* renamed from: o, reason: collision with root package name */
    CharSequence f12545o;

    /* renamed from: p, reason: collision with root package name */
    ArrayList f12546p;

    /* renamed from: q, reason: collision with root package name */
    ArrayList f12547q;

    /* renamed from: s, reason: collision with root package name */
    ArrayList f12549s;

    /* renamed from: c, reason: collision with root package name */
    ArrayList f12533c = new ArrayList();

    /* renamed from: j, reason: collision with root package name */
    boolean f12540j = true;

    /* renamed from: r, reason: collision with root package name */
    boolean f12548r = false;

    static final class a {

        /* renamed from: a, reason: collision with root package name */
        int f12550a;

        /* renamed from: b, reason: collision with root package name */
        Fragment f12551b;

        /* renamed from: c, reason: collision with root package name */
        boolean f12552c;

        /* renamed from: d, reason: collision with root package name */
        int f12553d;

        /* renamed from: e, reason: collision with root package name */
        int f12554e;

        /* renamed from: f, reason: collision with root package name */
        int f12555f;

        /* renamed from: g, reason: collision with root package name */
        int f12556g;

        /* renamed from: h, reason: collision with root package name */
        AbstractC1346l.b f12557h;

        /* renamed from: i, reason: collision with root package name */
        AbstractC1346l.b f12558i;

        a() {
        }

        a(int i4, Fragment fragment) {
            this.f12550a = i4;
            this.f12551b = fragment;
            this.f12552c = false;
            AbstractC1346l.b bVar = AbstractC1346l.b.RESUMED;
            this.f12557h = bVar;
            this.f12558i = bVar;
        }

        a(int i4, Fragment fragment, boolean z4) {
            this.f12550a = i4;
            this.f12551b = fragment;
            this.f12552c = z4;
            AbstractC1346l.b bVar = AbstractC1346l.b.RESUMED;
            this.f12557h = bVar;
            this.f12558i = bVar;
        }
    }

    z(l lVar, ClassLoader classLoader) {
        this.f12531a = lVar;
        this.f12532b = classLoader;
    }

    public z b(int i4, Fragment fragment, String str) {
        l(i4, fragment, str, 1);
        return this;
    }

    z c(ViewGroup viewGroup, Fragment fragment, String str) {
        fragment.mContainer = viewGroup;
        return b(viewGroup.getId(), fragment, str);
    }

    public z d(Fragment fragment, String str) {
        l(0, fragment, str, 1);
        return this;
    }

    void e(a aVar) {
        this.f12533c.add(aVar);
        aVar.f12553d = this.f12534d;
        aVar.f12554e = this.f12535e;
        aVar.f12555f = this.f12536f;
        aVar.f12556g = this.f12537g;
    }

    public z f(String str) {
        if (!this.f12540j) {
            throw new IllegalStateException("This FragmentTransaction is not allowed to be added to the back stack.");
        }
        this.f12539i = true;
        this.f12541k = str;
        return this;
    }

    public abstract int g();

    public abstract int h();

    public abstract void i();

    public abstract void j();

    public z k() {
        if (this.f12539i) {
            throw new IllegalStateException("This transaction is already being added to the back stack");
        }
        this.f12540j = false;
        return this;
    }

    void l(int i4, Fragment fragment, String str, int i5) {
        String str2 = fragment.mPreviousWho;
        if (str2 != null) {
            X.c.f(fragment, str2);
        }
        Class<?> cls = fragment.getClass();
        int modifiers = cls.getModifiers();
        if (cls.isAnonymousClass() || !Modifier.isPublic(modifiers) || (cls.isMemberClass() && !Modifier.isStatic(modifiers))) {
            throw new IllegalStateException("Fragment " + cls.getCanonicalName() + " must be a public static class to be  properly recreated from instance state.");
        }
        if (str != null) {
            String str3 = fragment.mTag;
            if (str3 != null && !str.equals(str3)) {
                throw new IllegalStateException("Can't change tag of fragment " + fragment + ": was " + fragment.mTag + " now " + str);
            }
            fragment.mTag = str;
        }
        if (i4 != 0) {
            if (i4 == -1) {
                throw new IllegalArgumentException("Can't add fragment " + fragment + " with tag " + str + " to container view with no id");
            }
            int i6 = fragment.mFragmentId;
            if (i6 != 0 && i6 != i4) {
                throw new IllegalStateException("Can't change container ID of fragment " + fragment + ": was " + fragment.mFragmentId + " now " + i4);
            }
            fragment.mFragmentId = i4;
            fragment.mContainerId = i4;
        }
        e(new a(i5, fragment));
    }

    public z m(Fragment fragment) {
        e(new a(3, fragment));
        return this;
    }

    public z n(int i4, Fragment fragment) {
        return o(i4, fragment, null);
    }

    public z o(int i4, Fragment fragment, String str) {
        if (i4 == 0) {
            throw new IllegalArgumentException("Must use non-zero containerViewId");
        }
        l(i4, fragment, str, 2);
        return this;
    }

    public z p(int i4, int i5, int i6, int i7) {
        this.f12534d = i4;
        this.f12535e = i5;
        this.f12536f = i6;
        this.f12537g = i7;
        return this;
    }

    public z q(boolean z4) {
        this.f12548r = z4;
        return this;
    }
}
