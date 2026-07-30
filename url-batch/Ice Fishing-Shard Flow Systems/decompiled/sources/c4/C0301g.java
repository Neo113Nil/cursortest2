package c4;

import java.util.List;
import kotlin.collections.A;
import kotlin.collections.q;
import kotlin.jvm.internal.E;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: c4.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0301g extends AbstractC0303i {

    /* renamed from: t, reason: collision with root package name */
    public final AbstractC0303i f4222t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0301g(AbstractC0303i originalAdapter) {
        super(EnumC0298d.f4214l, E.a(List.class), originalAdapter.f4239c, A.f6115d, 32);
        Intrinsics.checkNotNullParameter(originalAdapter, "originalAdapter");
        this.f4222t = originalAdapter;
    }

    @Override // c4.AbstractC0303i
    public final Object b(B.f reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        return q.b(this.f4222t.b(reader));
    }

    @Override // c4.AbstractC0303i
    public final Object c(C0295a reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        return q.b(this.f4222t.c(reader));
    }

    @Override // c4.AbstractC0303i
    public final void e(l2.c writer, Object obj) {
        List value = (List) obj;
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(value, "value");
        int size = value.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.f4222t.e(writer, value.get(i2));
        }
    }

    @Override // c4.AbstractC0303i
    public final void f(l2.c writer, int i2, Object obj) {
        List list = (List) obj;
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (list == null || list.isEmpty()) {
            return;
        }
        super.f(writer, i2, list);
    }

    @Override // c4.AbstractC0303i
    public final int g(Object obj) {
        List value = (List) obj;
        Intrinsics.checkNotNullParameter(value, "value");
        int size = value.size();
        int i2 = 0;
        for (int i5 = 0; i5 < size; i5++) {
            i2 += this.f4222t.g(value.get(i5));
        }
        return i2;
    }

    @Override // c4.AbstractC0303i
    public final int h(int i2, Object obj) {
        List list = (List) obj;
        if (list == null || list.isEmpty()) {
            return 0;
        }
        return super.h(i2, list);
    }
}
