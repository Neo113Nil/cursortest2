package z3;

import java.util.List;
import kotlin.jvm.internal.t;
import l5.C0512p;
import u0.AbstractC0676f;

/* loaded from: classes.dex */
public final class g extends i {

    /* renamed from: t, reason: collision with root package name */
    public final i f6307t;

    public g(i iVar) {
        super(d.f6299i, t.a(List.class), iVar.f6325c, C0512p.f5303f, 32);
        this.f6307t = iVar;
    }

    @Override // z3.i
    public final Object b(V5.g gVar) {
        return AbstractC0676f.n(this.f6307t.b(gVar));
    }

    @Override // z3.i
    public final Object c(a aVar) {
        return AbstractC0676f.n(this.f6307t.c(aVar));
    }

    @Override // z3.i
    public final void d(a6.d writer, Object obj) {
        List value = (List) obj;
        kotlin.jvm.internal.i.e(writer, "writer");
        kotlin.jvm.internal.i.e(value, "value");
        int size = value.size();
        for (int i7 = 0; i7 < size; i7++) {
            this.f6307t.d(writer, value.get(i7));
        }
    }

    @Override // z3.i
    public final void e(a6.d writer, int i7, Object obj) {
        List list = (List) obj;
        kotlin.jvm.internal.i.e(writer, "writer");
        if (list == null || list.isEmpty()) {
            return;
        }
        super.e(writer, i7, list);
    }

    @Override // z3.i
    public final int f(Object obj) {
        List value = (List) obj;
        kotlin.jvm.internal.i.e(value, "value");
        int size = value.size();
        int i7 = 0;
        for (int i8 = 0; i8 < size; i8++) {
            i7 += this.f6307t.f(value.get(i8));
        }
        return i7;
    }

    @Override // z3.i
    public final int g(int i7, Object obj) {
        List list = (List) obj;
        if (list == null || list.isEmpty()) {
            return 0;
        }
        return super.g(i7, list);
    }
}
