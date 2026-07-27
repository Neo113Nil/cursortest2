package m2;

import g4.C0471p;
import java.util.List;
import kotlin.jvm.internal.t;

/* renamed from: m2.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1284g extends AbstractC1286i {

    /* renamed from: t, reason: collision with root package name */
    public final AbstractC1286i f11161t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1284g(AbstractC1286i originalAdapter) {
        super(EnumC1281d.f11153d, t.a(List.class), originalAdapter.f11179c, C0471p.f5750a, 32);
        kotlin.jvm.internal.i.e(originalAdapter, "originalAdapter");
        this.f11161t = originalAdapter;
    }

    @Override // m2.AbstractC1286i
    public final Object b(V0.j jVar) {
        return K1.b.W(this.f11161t.b(jVar));
    }

    @Override // m2.AbstractC1286i
    public final Object c(C1278a reader) {
        kotlin.jvm.internal.i.e(reader, "reader");
        return K1.b.W(this.f11161t.c(reader));
    }

    @Override // m2.AbstractC1286i
    public final void d(U.e writer, Object obj) {
        List value = (List) obj;
        kotlin.jvm.internal.i.e(writer, "writer");
        kotlin.jvm.internal.i.e(value, "value");
        int size = value.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.f11161t.d(writer, value.get(i2));
        }
    }

    @Override // m2.AbstractC1286i
    public final void e(U.e writer, int i2, Object obj) {
        List list = (List) obj;
        kotlin.jvm.internal.i.e(writer, "writer");
        if (list == null || list.isEmpty()) {
            return;
        }
        super.e(writer, i2, list);
    }

    @Override // m2.AbstractC1286i
    public final int f(Object obj) {
        List value = (List) obj;
        kotlin.jvm.internal.i.e(value, "value");
        int size = value.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            i2 += this.f11161t.f(value.get(i3));
        }
        return i2;
    }

    @Override // m2.AbstractC1286i
    public final int g(int i2, Object obj) {
        List list = (List) obj;
        if (list == null || list.isEmpty()) {
            return 0;
        }
        return super.g(i2, list);
    }
}
