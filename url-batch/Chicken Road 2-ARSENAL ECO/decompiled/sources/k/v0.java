package k;

import android.content.Context;
import h1.C0402a;
import j5.InterfaceC0438a;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;
import q.C0582b;

/* loaded from: classes.dex */
public final class v0 implements F0.b {

    /* renamed from: f, reason: collision with root package name */
    public Object f5136f;

    /* renamed from: g, reason: collision with root package name */
    public Object f5137g;

    /* renamed from: h, reason: collision with root package name */
    public Object f5138h;

    /* renamed from: i, reason: collision with root package name */
    public Object f5139i;

    /* renamed from: j, reason: collision with root package name */
    public Object f5140j;

    /* renamed from: k, reason: collision with root package name */
    public Object f5141k;

    /* renamed from: l, reason: collision with root package name */
    public Object f5142l;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.util.Map] */
    public v0(Set set, C0582b c0582b, String str, String str2, C0402a c0402a) {
        Set unmodifiableSet = set == null ? Collections.EMPTY_SET : Collections.unmodifiableSet(set);
        this.f5136f = unmodifiableSet;
        C0582b c0582b2 = c0582b == null ? Collections.EMPTY_MAP : c0582b;
        this.f5138h = c0582b2;
        this.f5139i = str;
        this.f5140j = str2;
        this.f5141k = c0402a == null ? C0402a.f4333a : c0402a;
        HashSet hashSet = new HashSet(unmodifiableSet);
        Iterator it = c0582b2.values().iterator();
        if (it.hasNext()) {
            it.next().getClass();
            throw new ClassCastException();
        }
        this.f5137g = Collections.unmodifiableSet(hashSet);
    }

    @Override // j5.InterfaceC0438a
    public Object get() {
        return new J0.k((Context) ((InterfaceC0438a) this.f5136f).get(), (E0.e) ((InterfaceC0438a) this.f5137g).get(), (K0.d) ((InterfaceC0438a) this.f5138h).get(), (J0.d) ((B0.c) this.f5139i).get(), (Executor) ((InterfaceC0438a) this.f5140j).get(), (L0.c) ((InterfaceC0438a) this.f5141k).get(), new U0.h(4), new R0.g(), (K0.c) ((InterfaceC0438a) this.f5142l).get());
    }
}
