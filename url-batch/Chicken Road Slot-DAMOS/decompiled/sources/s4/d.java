package s4;

import java.util.LinkedHashSet;
import kotlin.collections.j0;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public final a.a f8418a;

    /* renamed from: b, reason: collision with root package name */
    public final j0 f8419b;

    /* renamed from: c, reason: collision with root package name */
    public final j0 f8420c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f8421d;

    /* renamed from: e, reason: collision with root package name */
    public c6.i f8422e;

    public d(a.a aVar, boolean z10) {
        this.f8418a = aVar;
        j0 j0Var = j0.f5574d;
        this.f8419b = j0Var;
        this.f8420c = j0Var;
        this.f8421d = z10;
    }

    public abstract void a();

    public abstract void b();

    public abstract void c(b bVar);

    public abstract void d(b bVar);

    public final void e() {
        c6.i iVar = this.f8422e;
        if (iVar == null || !((LinkedHashSet) iVar.f1822c).remove(this)) {
            return;
        }
        g gVar = (g) iVar.f1821b;
        gVar.getClass();
        if (equals(gVar.f8432f)) {
            if (gVar.g == -1) {
                a();
            }
            gVar.f8432f = null;
            gVar.g = 0;
            gVar.f8433h = null;
        }
        gVar.f8430d.remove(this);
        gVar.f8431e.remove(this);
        this.f8422e = null;
        gVar.b();
    }

    public final void f(boolean z10) {
        g gVar;
        if (this.f8421d == z10) {
            return;
        }
        this.f8421d = z10;
        c6.i iVar = this.f8422e;
        if (iVar == null || (gVar = (g) iVar.f1821b) == null) {
            return;
        }
        gVar.b();
    }
}
