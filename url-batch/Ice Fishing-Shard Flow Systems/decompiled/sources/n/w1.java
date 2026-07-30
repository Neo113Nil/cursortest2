package n;

import android.content.Context;
import c1.InterfaceC0289b;
import i1.InterfaceC0543c;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;
import u.C0934e;

/* loaded from: classes.dex */
public final class w1 implements InterfaceC0289b {

    /* renamed from: d, reason: collision with root package name */
    public Object f6941d;

    /* renamed from: e, reason: collision with root package name */
    public Object f6942e;

    /* renamed from: i, reason: collision with root package name */
    public Object f6943i;

    /* renamed from: l, reason: collision with root package name */
    public Object f6944l;

    /* renamed from: m, reason: collision with root package name */
    public Object f6945m;

    /* renamed from: n, reason: collision with root package name */
    public Object f6946n;

    /* renamed from: o, reason: collision with root package name */
    public Object f6947o;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.util.Map] */
    public w1(Set set, C0934e c0934e, String str, String str2, H1.a aVar) {
        Set unmodifiableSet = set == null ? Collections.EMPTY_SET : Collections.unmodifiableSet(set);
        this.f6941d = unmodifiableSet;
        C0934e c0934e2 = c0934e == null ? Collections.EMPTY_MAP : c0934e;
        this.f6943i = c0934e2;
        this.f6944l = str;
        this.f6945m = str2;
        this.f6946n = aVar == null ? H1.a.f955b : aVar;
        HashSet hashSet = new HashSet(unmodifiableSet);
        Iterator it = c0934e2.values().iterator();
        if (it.hasNext()) {
            it.next().getClass();
            throw new ClassCastException();
        }
        this.f6942e = Collections.unmodifiableSet(hashSet);
    }

    @Override // Q5.a
    public Object get() {
        return new g1.i((Context) ((Q5.a) this.f6941d).get(), (b1.e) ((Q5.a) this.f6942e).get(), (h1.d) ((Q5.a) this.f6943i).get(), (g1.c) ((D0.j) this.f6944l).get(), (Executor) ((Q5.a) this.f6945m).get(), (InterfaceC0543c) ((Q5.a) this.f6946n).get(), new q1.h(22), new c2.e(), (h1.c) ((Q5.a) this.f6947o).get());
    }
}
