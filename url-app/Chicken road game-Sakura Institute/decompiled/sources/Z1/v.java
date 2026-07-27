package Z1;

import android.R;
import android.view.Menu;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import l.AbstractC0784j;
import s.C1093I;
import s2.InterfaceC1195a;
import u2.InterfaceC1229b;
import w2.C1293b;
import y2.C1338m;

/* loaded from: classes.dex */
public final class v implements c {

    /* renamed from: a, reason: collision with root package name */
    public final Object f4604a;

    /* renamed from: b, reason: collision with root package name */
    public Object f4605b;

    /* renamed from: c, reason: collision with root package name */
    public Object f4606c;

    /* renamed from: d, reason: collision with root package name */
    public Object f4607d;

    /* renamed from: e, reason: collision with root package name */
    public Object f4608e;

    /* renamed from: f, reason: collision with root package name */
    public Object f4609f;

    public v(C1093I c1093i) {
        Y.d dVar = Y.d.f4373e;
        this.f4604a = c1093i;
        this.f4605b = dVar;
        this.f4606c = null;
        this.f4607d = null;
        this.f4608e = null;
        this.f4609f = null;
    }

    public static void i(int i2, Menu menu) {
        int i4;
        int d4 = AbstractC0784j.d(i2);
        int d5 = AbstractC0784j.d(i2);
        if (d5 == 0) {
            i4 = R.string.copy;
        } else if (d5 == 1) {
            i4 = R.string.paste;
        } else if (d5 == 2) {
            i4 = R.string.cut;
        } else {
            if (d5 != 3) {
                throw new C1338m();
            }
            i4 = R.string.selectAll;
        }
        menu.add(0, d4, AbstractC0784j.d(i2), i4).setShowAsAction(1);
    }

    public static void j(Menu menu, int i2, Function0 function0) {
        if (function0 != null && menu.findItem(AbstractC0784j.d(i2)) == null) {
            i(i2, menu);
        } else {
            if (function0 != null || menu.findItem(AbstractC0784j.d(i2)) == null) {
                return;
            }
            menu.removeItem(AbstractC0784j.d(i2));
        }
    }

    @Override // Z1.c
    public Object a(Class cls) {
        if (!((Set) this.f4604a).contains(t.a(cls))) {
            throw new I1.b("Attempting to request an undeclared dependency " + cls + ".");
        }
        Object a4 = ((c) this.f4609f).a(cls);
        if (!cls.equals(InterfaceC1195a.class)) {
            return a4;
        }
        return new u();
    }

    @Override // Z1.c
    public InterfaceC1229b b(Class cls) {
        return e(t.a(C1293b.class));
    }

    @Override // Z1.c
    public InterfaceC1229b c(t tVar) {
        if (((Set) this.f4608e).contains(tVar)) {
            return ((c) this.f4609f).c(tVar);
        }
        throw new I1.b("Attempting to request an undeclared dependency Provider<Set<" + tVar + ">>.");
    }

    @Override // Z1.c
    public Set d(t tVar) {
        if (((Set) this.f4607d).contains(tVar)) {
            return ((c) this.f4609f).d(tVar);
        }
        throw new I1.b("Attempting to request an undeclared dependency Set<" + tVar + ">.");
    }

    @Override // Z1.c
    public InterfaceC1229b e(t tVar) {
        if (((Set) this.f4605b).contains(tVar)) {
            return ((c) this.f4609f).e(tVar);
        }
        throw new I1.b("Attempting to request an undeclared dependency Provider<" + tVar + ">.");
    }

    @Override // Z1.c
    public Object f(t tVar) {
        if (((Set) this.f4604a).contains(tVar)) {
            return ((c) this.f4609f).f(tVar);
        }
        throw new I1.b("Attempting to request an undeclared dependency " + tVar + ".");
    }

    @Override // Z1.c
    public r g(t tVar) {
        if (((Set) this.f4606c).contains(tVar)) {
            return ((c) this.f4609f).g(tVar);
        }
        throw new I1.b("Attempting to request an undeclared dependency Deferred<" + tVar + ">.");
    }

    @Override // Z1.c
    public r h(Class cls) {
        return g(t.a(cls));
    }

    public v(b bVar, c cVar) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        for (k kVar : bVar.f4563c) {
            int i2 = kVar.f4588c;
            boolean z4 = i2 == 0;
            int i4 = kVar.f4587b;
            t tVar = kVar.f4586a;
            if (z4) {
                if (i4 == 2) {
                    hashSet4.add(tVar);
                } else {
                    hashSet.add(tVar);
                }
            } else if (i2 == 2) {
                hashSet3.add(tVar);
            } else if (i4 == 2) {
                hashSet5.add(tVar);
            } else {
                hashSet2.add(tVar);
            }
        }
        if (!bVar.f4566f.isEmpty()) {
            hashSet.add(t.a(InterfaceC1195a.class));
        }
        this.f4604a = Collections.unmodifiableSet(hashSet);
        this.f4605b = Collections.unmodifiableSet(hashSet2);
        this.f4606c = Collections.unmodifiableSet(hashSet3);
        this.f4607d = Collections.unmodifiableSet(hashSet4);
        this.f4608e = Collections.unmodifiableSet(hashSet5);
        this.f4609f = cVar;
    }

    public v(p3.d taskRunner) {
        Intrinsics.checkNotNullParameter(taskRunner, "taskRunner");
        this.f4604a = taskRunner;
        this.f4609f = t3.i.f10787a;
    }
}
