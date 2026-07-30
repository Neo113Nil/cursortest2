package Y5;

import g1.C4523c;
import java.util.List;
import kotlin.jvm.internal.s;
import r7.C4985p;

/* loaded from: classes2.dex */
public final class g extends i {

    /* renamed from: t, reason: collision with root package name */
    public final i f3993t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(i originalAdapter) {
        super(d.f3985w, s.a(List.class), originalAdapter.f4010c, C4985p.f40358n, 32);
        kotlin.jvm.internal.h.e(originalAdapter, "originalAdapter");
        this.f3993t = originalAdapter;
    }

    @Override // Y5.i
    public final Object b(I0.j jVar) {
        return p8.g.k(this.f3993t.b(jVar));
    }

    @Override // Y5.i
    public final Object c(a aVar) {
        return p8.g.k(this.f3993t.c(aVar));
    }

    @Override // Y5.i
    public final void d(C4523c writer, Object obj) {
        List value = (List) obj;
        kotlin.jvm.internal.h.e(writer, "writer");
        kotlin.jvm.internal.h.e(value, "value");
        int size = value.size();
        for (int i = 0; i < size; i++) {
            this.f3993t.d(writer, value.get(i));
        }
    }

    @Override // Y5.i
    public final void e(C4523c writer, int i, Object obj) {
        List list = (List) obj;
        kotlin.jvm.internal.h.e(writer, "writer");
        if (list == null || list.isEmpty()) {
            return;
        }
        super.e(writer, i, list);
    }

    @Override // Y5.i
    public final int f(Object obj) {
        List value = (List) obj;
        kotlin.jvm.internal.h.e(value, "value");
        int size = value.size();
        int i = 0;
        for (int i4 = 0; i4 < size; i4++) {
            i += this.f3993t.f(value.get(i4));
        }
        return i;
    }

    @Override // Y5.i
    public final int g(int i, Object obj) {
        List list = (List) obj;
        if (list == null || list.isEmpty()) {
            return 0;
        }
        return super.g(i, list);
    }
}
