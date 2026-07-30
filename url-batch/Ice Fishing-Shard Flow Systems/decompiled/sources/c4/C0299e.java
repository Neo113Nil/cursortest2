package c4;

import k6.InterfaceC0608c;
import kotlin.jvm.internal.E;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: c4.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0299e extends AbstractC0303i {

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ int f4218t;

    /* renamed from: u, reason: collision with root package name */
    public final AbstractC0303i f4219u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0299e(AbstractC0303i originalAdapter, int i2) {
        super(EnumC0298d.f4214l, E.a(int[].class), originalAdapter.f4239c, new int[0], 32);
        this.f4218t = i2;
        switch (i2) {
            case 1:
                Intrinsics.checkNotNullParameter(originalAdapter, "originalAdapter");
                super(EnumC0298d.f4214l, E.a(long[].class), originalAdapter.f4239c, new long[0], 32);
                this.f4219u = originalAdapter;
                break;
            default:
                Intrinsics.checkNotNullParameter(originalAdapter, "originalAdapter");
                this.f4219u = originalAdapter;
                break;
        }
    }

    @Override // c4.AbstractC0303i
    public final Object b(B.f reader) {
        int i2 = this.f4218t;
        AbstractC0303i abstractC0303i = this.f4219u;
        switch (i2) {
            case 0:
                Intrinsics.checkNotNullParameter(reader, "reader");
                return new int[]{((Number) abstractC0303i.b(reader)).intValue()};
            case 1:
                Intrinsics.checkNotNullParameter(reader, "reader");
                return new long[]{((Number) abstractC0303i.b(reader)).longValue()};
            default:
                Intrinsics.checkNotNullParameter(reader, "reader");
                Object obj = abstractC0303i.f4240d;
                long e7 = reader.e();
                while (true) {
                    int f7 = ((C0295a) reader.f152e).f();
                    if (f7 == -1) {
                        reader.i(e7);
                        return obj;
                    }
                    if (f7 == 1) {
                        obj = abstractC0303i.b(reader);
                    } else {
                        reader.q(f7);
                    }
                }
        }
    }

    @Override // c4.AbstractC0303i
    public final Object c(C0295a reader) {
        int i2 = this.f4218t;
        AbstractC0303i abstractC0303i = this.f4219u;
        switch (i2) {
            case 0:
                Intrinsics.checkNotNullParameter(reader, "reader");
                return new int[]{((Number) abstractC0303i.c(reader)).intValue()};
            case 1:
                Intrinsics.checkNotNullParameter(reader, "reader");
                return new long[]{((Number) abstractC0303i.c(reader)).longValue()};
            default:
                Intrinsics.checkNotNullParameter(reader, "reader");
                Object obj = abstractC0303i.f4240d;
                int c7 = reader.c();
                while (true) {
                    int f7 = reader.f();
                    if (f7 == -1) {
                        reader.d(c7);
                        return obj;
                    }
                    if (f7 == 1) {
                        obj = abstractC0303i.c(reader);
                    } else {
                        reader.k(f7);
                    }
                }
        }
    }

    @Override // c4.AbstractC0303i
    public final void e(l2.c writer, Object obj) {
        switch (this.f4218t) {
            case 0:
                int[] value = (int[]) obj;
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                for (int i2 : value) {
                    this.f4219u.e(writer, Integer.valueOf(i2));
                }
                break;
            case 1:
                long[] value2 = (long[]) obj;
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value2, "value");
                for (long j : value2) {
                    this.f4219u.e(writer, Long.valueOf(j));
                }
                break;
            default:
                Intrinsics.checkNotNullParameter(writer, "writer");
                if (obj != null) {
                    AbstractC0303i abstractC0303i = this.f4219u;
                    if (!obj.equals(abstractC0303i.f4240d)) {
                        abstractC0303i.f(writer, 1, obj);
                        break;
                    }
                }
                break;
        }
    }

    @Override // c4.AbstractC0303i
    public void f(l2.c writer, int i2, Object obj) {
        switch (this.f4218t) {
            case 0:
                int[] iArr = (int[]) obj;
                Intrinsics.checkNotNullParameter(writer, "writer");
                if (iArr != null && iArr.length != 0) {
                    super.f(writer, i2, iArr);
                    break;
                }
                break;
            case 1:
                long[] jArr = (long[]) obj;
                Intrinsics.checkNotNullParameter(writer, "writer");
                if (jArr != null && jArr.length != 0) {
                    super.f(writer, i2, jArr);
                    break;
                }
                break;
            default:
                super.f(writer, i2, obj);
                break;
        }
    }

    @Override // c4.AbstractC0303i
    public final int g(Object obj) {
        switch (this.f4218t) {
            case 0:
                int[] value = (int[]) obj;
                Intrinsics.checkNotNullParameter(value, "value");
                int i2 = 0;
                for (int i5 : value) {
                    i2 += this.f4219u.g(Integer.valueOf(i5));
                }
                return i2;
            case 1:
                long[] value2 = (long[]) obj;
                Intrinsics.checkNotNullParameter(value2, "value");
                int i7 = 0;
                for (long j : value2) {
                    i7 += this.f4219u.g(Long.valueOf(j));
                }
                return i7;
            default:
                if (obj != null) {
                    AbstractC0303i abstractC0303i = this.f4219u;
                    if (!obj.equals(abstractC0303i.f4240d)) {
                        return abstractC0303i.h(1, obj);
                    }
                }
                return 0;
        }
    }

    @Override // c4.AbstractC0303i
    public int h(int i2, Object obj) {
        switch (this.f4218t) {
            case 0:
                int[] iArr = (int[]) obj;
                if (iArr == null || iArr.length == 0) {
                    return 0;
                }
                return super.h(i2, iArr);
            case 1:
                long[] jArr = (long[]) obj;
                if (jArr == null || jArr.length == 0) {
                    return 0;
                }
                return super.h(i2, jArr);
            default:
                return super.h(i2, obj);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C0299e(AbstractC0303i abstractC0303i, InterfaceC0608c interfaceC0608c, Object obj) {
        super(r2, interfaceC0608c, r4, obj, 32);
        this.f4218t = 2;
        EnumC0298d enumC0298d = EnumC0298d.f4214l;
        EnumC0307m enumC0307m = EnumC0307m.f4252i;
        this.f4219u = abstractC0303i;
    }
}
