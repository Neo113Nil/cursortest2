package l;

import android.content.Context;
import b1.C0267d;
import b1.C0273j;
import e4.InterfaceC0412a;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;
import r.C1392b;

/* loaded from: classes.dex */
public final class q0 implements X0.b {

    /* renamed from: a, reason: collision with root package name */
    public Object f10941a;

    /* renamed from: b, reason: collision with root package name */
    public Object f10942b;

    /* renamed from: c, reason: collision with root package name */
    public Object f10943c;

    /* renamed from: d, reason: collision with root package name */
    public Object f10944d;

    /* renamed from: e, reason: collision with root package name */
    public Object f10945e;

    /* renamed from: f, reason: collision with root package name */
    public Object f10946f;

    /* renamed from: g, reason: collision with root package name */
    public Object f10947g;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.util.Map] */
    public q0(Set set, C1392b c1392b, String str, String str2, F1.a aVar) {
        Set emptySet = set == null ? Collections.emptySet() : Collections.unmodifiableSet(set);
        this.f10941a = emptySet;
        C1392b emptyMap = c1392b == null ? Collections.emptyMap() : c1392b;
        this.f10943c = emptyMap;
        this.f10944d = str;
        this.f10945e = str2;
        this.f10946f = aVar == null ? F1.a.f674b : aVar;
        HashSet hashSet = new HashSet(emptySet);
        Iterator it = emptyMap.values().iterator();
        if (it.hasNext()) {
            it.next().getClass();
            throw new ClassCastException();
        }
        this.f10942b = Collections.unmodifiableSet(hashSet);
    }

    @Override // e4.InterfaceC0412a
    public Object get() {
        return new C0273j((Context) ((V0.j) this.f10941a).f3212b, (W0.f) ((InterfaceC0412a) this.f10942b).get(), (c1.d) ((InterfaceC0412a) this.f10943c).get(), (C0267d) ((B4.i) this.f10944d).get(), (Executor) ((InterfaceC0412a) this.f10945e).get(), (d1.c) ((InterfaceC0412a) this.f10946f).get(), new W1.e(), new l1.j(22), (c1.c) ((InterfaceC0412a) this.f10947g).get());
    }
}
