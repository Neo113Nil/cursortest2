package m;

import android.content.Context;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class g2 implements m6.b {

    /* renamed from: d, reason: collision with root package name */
    public Object f6077d;

    /* renamed from: e, reason: collision with root package name */
    public Object f6078e;

    /* renamed from: i, reason: collision with root package name */
    public Object f6079i;

    /* renamed from: r, reason: collision with root package name */
    public Object f6080r;

    /* renamed from: s, reason: collision with root package name */
    public Object f6081s;

    /* renamed from: t, reason: collision with root package name */
    public Object f6082t;

    /* renamed from: u, reason: collision with root package name */
    public Object f6083u;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.util.Map] */
    public g2(Set set, s.e eVar, String str, String str2, t7.a aVar) {
        Set unmodifiableSet = set == null ? Collections.EMPTY_SET : Collections.unmodifiableSet(set);
        this.f6077d = unmodifiableSet;
        s.e eVar2 = eVar == null ? Collections.EMPTY_MAP : eVar;
        this.f6079i = eVar2;
        this.f6080r = str;
        this.f6081s = str2;
        this.f6082t = aVar == null ? t7.a.f9322b : aVar;
        HashSet hashSet = new HashSet(unmodifiableSet);
        Iterator it = eVar2.values().iterator();
        if (it.hasNext()) {
            throw v4.a.i(it);
        }
        this.f6078e = Collections.unmodifiableSet(hashSet);
    }

    @Override // gd.a
    public Object get() {
        return new q6.i((Context) ((gd.a) this.f6077d).get(), (l6.d) ((gd.a) this.f6078e).get(), (r6.g) ((gd.a) this.f6079i).get(), (p.e) ((p.e) this.f6080r).get(), (Executor) ((gd.a) this.f6081s).get(), (r6.g) ((gd.a) this.f6082t).get(), new s7.c0(20), new s7.c0(19), (r6.g) ((gd.a) this.f6083u).get());
    }
}
