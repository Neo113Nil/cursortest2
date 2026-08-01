package q4;

import e3.o;
import java.util.Iterator;
import kotlin.collections.i0;
import n4.s;
import s.q;
import s.s0;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class j implements Iterator, xd.a {

    /* renamed from: d, reason: collision with root package name */
    public int f8020d = -1;

    /* renamed from: e, reason: collision with root package name */
    public boolean f8021e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ o f8022i;

    public j(o oVar) {
        this.f8022i = oVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f8020d + 1 < ((s0) this.f8022i.f3829c).f();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            i0.c();
            return null;
        }
        this.f8021e = true;
        s0 s0Var = (s0) this.f8022i.f3829c;
        int i3 = this.f8020d + 1;
        this.f8020d = i3;
        return (s) s0Var.g(i3);
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f8021e) {
            i0.l("You must call next() before you can remove an element");
            return;
        }
        s0 s0Var = (s0) this.f8022i.f3829c;
        ((s) s0Var.g(this.f8020d)).f7116i = null;
        int i3 = this.f8020d;
        Object[] objArr = s0Var.f8375i;
        Object obj = objArr[i3];
        Object obj2 = q.f8359c;
        if (obj != obj2) {
            objArr[i3] = obj2;
            s0Var.f8373d = true;
        }
        this.f8020d = i3 - 1;
        this.f8021e = false;
    }
}
