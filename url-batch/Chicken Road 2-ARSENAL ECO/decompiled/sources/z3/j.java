package z3;

import java.util.List;
import kotlin.jvm.internal.t;
import l5.C0512p;
import u0.AbstractC0676f;

/* loaded from: classes.dex */
public final class j extends i {

    /* renamed from: t, reason: collision with root package name */
    public final i f6328t;

    public j(i iVar) {
        super(iVar.f6323a, t.a(List.class), iVar.f6325c, C0512p.f5303f, 32);
        this.f6328t = iVar;
    }

    @Override // z3.i
    public final Object b(V5.g gVar) {
        return AbstractC0676f.n(this.f6328t.b(gVar));
    }

    @Override // z3.i
    public final Object c(a aVar) {
        return AbstractC0676f.n(this.f6328t.c(aVar));
    }

    @Override // z3.i
    public final void d(a6.d writer, Object obj) {
        List value = (List) obj;
        kotlin.jvm.internal.i.e(writer, "writer");
        kotlin.jvm.internal.i.e(value, "value");
        throw new UnsupportedOperationException("Repeated values can only be encoded with a tag.");
    }

    @Override // z3.i
    public final void e(a6.d writer, int i7, Object obj) {
        List list = (List) obj;
        kotlin.jvm.internal.i.e(writer, "writer");
        if (list == null) {
            return;
        }
        int size = list.size();
        for (int i8 = 0; i8 < size; i8++) {
            this.f6328t.e(writer, i7, list.get(i8));
        }
    }

    @Override // z3.i
    public final int f(Object obj) {
        List value = (List) obj;
        kotlin.jvm.internal.i.e(value, "value");
        throw new UnsupportedOperationException("Repeated values can only be sized with a tag.");
    }

    @Override // z3.i
    public final int g(int i7, Object obj) {
        List list = (List) obj;
        if (list == null) {
            return 0;
        }
        int size = list.size();
        int i8 = 0;
        for (int i9 = 0; i9 < size; i9++) {
            i8 += this.f6328t.g(i7, list.get(i9));
        }
        return i8;
    }
}
