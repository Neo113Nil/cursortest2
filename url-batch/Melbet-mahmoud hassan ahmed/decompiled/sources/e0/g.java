package e0;

import android.text.TextUtils;
import d0.m;
import d0.r;
import d0.u;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* loaded from: classes.dex */
public class g extends r {

    /* renamed from: j, reason: collision with root package name */
    private static final String f15778j = d0.j.f("WorkContinuationImpl");

    /* renamed from: a, reason: collision with root package name */
    private final i f15779a;

    /* renamed from: b, reason: collision with root package name */
    private final String f15780b;

    /* renamed from: c, reason: collision with root package name */
    private final d0.d f15781c;

    /* renamed from: d, reason: collision with root package name */
    private final List<? extends u> f15782d;

    /* renamed from: e, reason: collision with root package name */
    private final List<String> f15783e;

    /* renamed from: f, reason: collision with root package name */
    private final List<String> f15784f;

    /* renamed from: g, reason: collision with root package name */
    private final List<g> f15785g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f15786h;

    /* renamed from: i, reason: collision with root package name */
    private m f15787i;

    public g(i iVar, String str, d0.d dVar, List<? extends u> list, List<g> list2) {
        this.f15779a = iVar;
        this.f15780b = str;
        this.f15781c = dVar;
        this.f15782d = list;
        this.f15785g = list2;
        this.f15783e = new ArrayList(list.size());
        this.f15784f = new ArrayList();
        if (list2 != null) {
            Iterator<g> it = list2.iterator();
            while (it.hasNext()) {
                this.f15784f.addAll(it.next().f15784f);
            }
        }
        for (int i7 = 0; i7 < list.size(); i7++) {
            String a7 = list.get(i7).a();
            this.f15783e.add(a7);
            this.f15784f.add(a7);
        }
    }

    public g(i iVar, List<? extends u> list) {
        this(iVar, null, d0.d.KEEP, list, null);
    }

    private static boolean i(g gVar, Set<String> set) {
        set.addAll(gVar.c());
        Set<String> l7 = l(gVar);
        Iterator<String> it = set.iterator();
        while (it.hasNext()) {
            if (l7.contains(it.next())) {
                return true;
            }
        }
        List<g> e7 = gVar.e();
        if (e7 != null && !e7.isEmpty()) {
            Iterator<g> it2 = e7.iterator();
            while (it2.hasNext()) {
                if (i(it2.next(), set)) {
                    return true;
                }
            }
        }
        set.removeAll(gVar.c());
        return false;
    }

    public static Set<String> l(g gVar) {
        HashSet hashSet = new HashSet();
        List<g> e7 = gVar.e();
        if (e7 != null && !e7.isEmpty()) {
            Iterator<g> it = e7.iterator();
            while (it.hasNext()) {
                hashSet.addAll(it.next().c());
            }
        }
        return hashSet;
    }

    public m a() {
        if (this.f15786h) {
            d0.j.c().h(f15778j, String.format("Already enqueued work ids (%s)", TextUtils.join(", ", this.f15783e)), new Throwable[0]);
        } else {
            m0.b bVar = new m0.b(this);
            this.f15779a.p().b(bVar);
            this.f15787i = bVar.d();
        }
        return this.f15787i;
    }

    public d0.d b() {
        return this.f15781c;
    }

    public List<String> c() {
        return this.f15783e;
    }

    public String d() {
        return this.f15780b;
    }

    public List<g> e() {
        return this.f15785g;
    }

    public List<? extends u> f() {
        return this.f15782d;
    }

    public i g() {
        return this.f15779a;
    }

    public boolean h() {
        return i(this, new HashSet());
    }

    public boolean j() {
        return this.f15786h;
    }

    public void k() {
        this.f15786h = true;
    }
}
