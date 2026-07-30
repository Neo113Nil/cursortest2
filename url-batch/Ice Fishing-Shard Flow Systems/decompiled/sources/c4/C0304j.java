package c4;

import java.util.List;
import kotlin.collections.A;
import kotlin.collections.q;
import kotlin.jvm.internal.E;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: c4.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0304j extends AbstractC0303i {

    /* renamed from: t, reason: collision with root package name */
    public final AbstractC0303i f4242t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0304j(AbstractC0303i originalAdapter) {
        super(originalAdapter.f4237a, E.a(List.class), originalAdapter.f4239c, A.f6115d, 32);
        Intrinsics.checkNotNullParameter(originalAdapter, "originalAdapter");
        this.f4242t = originalAdapter;
    }

    @Override // c4.AbstractC0303i
    public final Object b(B.f reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        return q.b(this.f4242t.b(reader));
    }

    @Override // c4.AbstractC0303i
    public final Object c(C0295a reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        return q.b(this.f4242t.c(reader));
    }

    @Override // c4.AbstractC0303i
    public final void e(l2.c writer, Object obj) {
        List value = (List) obj;
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(value, "value");
        throw new UnsupportedOperationException("Repeated values can only be encoded with a tag.");
    }

    @Override // c4.AbstractC0303i
    public final void f(l2.c writer, int i2, Object obj) {
        List list = (List) obj;
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (list == null) {
            return;
        }
        int size = list.size();
        for (int i5 = 0; i5 < size; i5++) {
            this.f4242t.f(writer, i2, list.get(i5));
        }
    }

    @Override // c4.AbstractC0303i
    public final int g(Object obj) {
        List value = (List) obj;
        Intrinsics.checkNotNullParameter(value, "value");
        throw new UnsupportedOperationException("Repeated values can only be sized with a tag.");
    }

    @Override // c4.AbstractC0303i
    public final int h(int i2, Object obj) {
        List list = (List) obj;
        if (list == null) {
            return 0;
        }
        int size = list.size();
        int i5 = 0;
        for (int i7 = 0; i7 < size; i7++) {
            i5 += this.f4242t.h(i2, list.get(i7));
        }
        return i5;
    }
}
