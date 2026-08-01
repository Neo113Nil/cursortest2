package u0;

import java.util.ConcurrentModificationException;
import kotlin.collections.i0;
import kotlin.jvm.internal.Intrinsics;
import wd.g0;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public class d extends c {

    /* renamed from: r, reason: collision with root package name */
    public final x0.g f9582r;

    /* renamed from: s, reason: collision with root package name */
    public Object f9583s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f9584t;

    /* renamed from: u, reason: collision with root package name */
    public int f9585u;

    public d(x0.g gVar, j[] jVarArr) {
        super(gVar.f10229e, jVarArr);
        this.f9582r = gVar;
        this.f9585u = gVar.f10231r;
    }

    public final void c(int i3, i iVar, Object obj, int i10) {
        int i11 = i10 * 5;
        j[] jVarArr = this.f9579d;
        if (i11 <= 30) {
            int E = 1 << g8.b.E(i3, i11);
            if (iVar.h(E)) {
                jVarArr[i10].a(iVar.f9594d, Integer.bitCount(iVar.f9591a) * 2, iVar.f(E));
                this.f9580e = i10;
                return;
            } else {
                int t6 = iVar.t(E);
                i s3 = iVar.s(t6);
                jVarArr[i10].a(iVar.f9594d, Integer.bitCount(iVar.f9591a) * 2, t6);
                c(i3, s3, obj, i10 + 1);
                return;
            }
        }
        j jVar = jVarArr[i10];
        Object[] objArr = iVar.f9594d;
        jVar.a(objArr, objArr.length, 0);
        while (true) {
            j jVar2 = jVarArr[i10];
            if (Intrinsics.a(jVar2.f9595d[jVar2.f9597i], obj)) {
                this.f9580e = i10;
                return;
            } else {
                jVarArr[i10].f9597i += 2;
            }
        }
    }

    @Override // u0.c, java.util.Iterator
    public final Object next() {
        if (this.f9582r.f10231r != this.f9585u) {
            throw new ConcurrentModificationException();
        }
        if (!this.f9581i) {
            i0.c();
            return null;
        }
        j jVar = this.f9579d[this.f9580e];
        this.f9583s = jVar.f9595d[jVar.f9597i];
        this.f9584t = true;
        return super.next();
    }

    @Override // u0.c, java.util.Iterator
    public final void remove() {
        if (!this.f9584t) {
            throw new IllegalStateException();
        }
        boolean z10 = this.f9581i;
        x0.g gVar = this.f9582r;
        if (!z10) {
            g0.b(gVar).remove(this.f9583s);
        } else {
            if (!z10) {
                i0.c();
                return;
            }
            j jVar = this.f9579d[this.f9580e];
            Object obj = jVar.f9595d[jVar.f9597i];
            g0.b(gVar).remove(this.f9583s);
            c(obj != null ? obj.hashCode() : 0, gVar.f10229e, obj, 0);
        }
        this.f9583s = null;
        this.f9584t = false;
        this.f9585u = gVar.f10231r;
    }
}
