package h0;

import android.content.Context;
import d0.j;
import i0.c;
import i0.e;
import i0.f;
import i0.g;
import i0.h;
import java.util.ArrayList;
import java.util.List;
import l0.p;

/* loaded from: classes.dex */
public class d implements c.a {

    /* renamed from: d, reason: collision with root package name */
    private static final String f16731d = j.f("WorkConstraintsTracker");

    /* renamed from: a, reason: collision with root package name */
    private final c f16732a;

    /* renamed from: b, reason: collision with root package name */
    private final i0.c<?>[] f16733b;

    /* renamed from: c, reason: collision with root package name */
    private final Object f16734c;

    public d(Context context, n0.a aVar, c cVar) {
        Context applicationContext = context.getApplicationContext();
        this.f16732a = cVar;
        this.f16733b = new i0.c[]{new i0.a(applicationContext, aVar), new i0.b(applicationContext, aVar), new h(applicationContext, aVar), new i0.d(applicationContext, aVar), new g(applicationContext, aVar), new f(applicationContext, aVar), new e(applicationContext, aVar)};
        this.f16734c = new Object();
    }

    @Override // i0.c.a
    public void a(List<String> list) {
        synchronized (this.f16734c) {
            ArrayList arrayList = new ArrayList();
            for (String str : list) {
                if (c(str)) {
                    j.c().a(f16731d, String.format("Constraints met for %s", str), new Throwable[0]);
                    arrayList.add(str);
                }
            }
            c cVar = this.f16732a;
            if (cVar != null) {
                cVar.e(arrayList);
            }
        }
    }

    @Override // i0.c.a
    public void b(List<String> list) {
        synchronized (this.f16734c) {
            c cVar = this.f16732a;
            if (cVar != null) {
                cVar.c(list);
            }
        }
    }

    public boolean c(String str) {
        synchronized (this.f16734c) {
            for (i0.c<?> cVar : this.f16733b) {
                if (cVar.d(str)) {
                    j.c().a(f16731d, String.format("Work %s constrained by %s", str, cVar.getClass().getSimpleName()), new Throwable[0]);
                    return false;
                }
            }
            return true;
        }
    }

    public void d(Iterable<p> iterable) {
        synchronized (this.f16734c) {
            for (i0.c<?> cVar : this.f16733b) {
                cVar.g(null);
            }
            for (i0.c<?> cVar2 : this.f16733b) {
                cVar2.e(iterable);
            }
            for (i0.c<?> cVar3 : this.f16733b) {
                cVar3.g(this);
            }
        }
    }

    public void e() {
        synchronized (this.f16734c) {
            for (i0.c<?> cVar : this.f16733b) {
                cVar.f();
            }
        }
    }
}
