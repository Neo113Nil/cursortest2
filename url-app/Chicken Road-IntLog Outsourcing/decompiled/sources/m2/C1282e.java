package m2;

import kotlin.jvm.internal.t;
import z4.InterfaceC1586c;

/* renamed from: m2.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1282e extends AbstractC1286i {

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ int f11157t;

    /* renamed from: u, reason: collision with root package name */
    public final AbstractC1286i f11158u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1282e(AbstractC1286i abstractC1286i, int i2) {
        super(EnumC1281d.f11153d, t.a(int[].class), abstractC1286i.f11179c, new int[0], 32);
        this.f11157t = i2;
        switch (i2) {
            case 1:
                super(EnumC1281d.f11153d, t.a(long[].class), abstractC1286i.f11179c, new long[0], 32);
                this.f11158u = abstractC1286i;
                break;
            default:
                this.f11158u = abstractC1286i;
                break;
        }
    }

    @Override // m2.AbstractC1286i
    public final Object b(V0.j jVar) {
        AbstractC1286i abstractC1286i = this.f11158u;
        switch (this.f11157t) {
            case 0:
                return new int[]{((Number) abstractC1286i.b(jVar)).intValue()};
            case 1:
                return new long[]{((Number) abstractC1286i.b(jVar)).longValue()};
            default:
                long z = jVar.z();
                Object obj = abstractC1286i.f11180d;
                while (true) {
                    int f3 = ((C1278a) jVar.f3212b).f();
                    if (f3 == -1) {
                        jVar.D(z);
                        return obj;
                    }
                    if (f3 == 1) {
                        obj = abstractC1286i.b(jVar);
                    } else {
                        jVar.O(f3);
                    }
                }
        }
    }

    @Override // m2.AbstractC1286i
    public final Object c(C1278a reader) {
        AbstractC1286i abstractC1286i = this.f11158u;
        switch (this.f11157t) {
            case 0:
                kotlin.jvm.internal.i.e(reader, "reader");
                return new int[]{((Number) abstractC1286i.c(reader)).intValue()};
            case 1:
                kotlin.jvm.internal.i.e(reader, "reader");
                return new long[]{((Number) abstractC1286i.c(reader)).longValue()};
            default:
                kotlin.jvm.internal.i.e(reader, "reader");
                int c2 = reader.c();
                Object obj = abstractC1286i.f11180d;
                while (true) {
                    int f3 = reader.f();
                    if (f3 == -1) {
                        reader.d(c2);
                        return obj;
                    }
                    if (f3 == 1) {
                        obj = abstractC1286i.c(reader);
                    } else {
                        reader.k(f3);
                    }
                }
        }
    }

    @Override // m2.AbstractC1286i
    public final void d(U.e writer, Object obj) {
        switch (this.f11157t) {
            case 0:
                int[] value = (int[]) obj;
                kotlin.jvm.internal.i.e(writer, "writer");
                kotlin.jvm.internal.i.e(value, "value");
                for (int i2 : value) {
                    this.f11158u.d(writer, Integer.valueOf(i2));
                }
                break;
            case 1:
                long[] value2 = (long[]) obj;
                kotlin.jvm.internal.i.e(writer, "writer");
                kotlin.jvm.internal.i.e(value2, "value");
                for (long j2 : value2) {
                    this.f11158u.d(writer, Long.valueOf(j2));
                }
                break;
            default:
                kotlin.jvm.internal.i.e(writer, "writer");
                if (obj != null) {
                    AbstractC1286i abstractC1286i = this.f11158u;
                    if (!obj.equals(abstractC1286i.f11180d)) {
                        abstractC1286i.e(writer, 1, obj);
                        break;
                    }
                }
                break;
        }
    }

    @Override // m2.AbstractC1286i
    public void e(U.e writer, int i2, Object obj) {
        switch (this.f11157t) {
            case 0:
                int[] iArr = (int[]) obj;
                kotlin.jvm.internal.i.e(writer, "writer");
                if (iArr != null && iArr.length != 0) {
                    super.e(writer, i2, iArr);
                    break;
                }
                break;
            case 1:
                long[] jArr = (long[]) obj;
                kotlin.jvm.internal.i.e(writer, "writer");
                if (jArr != null && jArr.length != 0) {
                    super.e(writer, i2, jArr);
                    break;
                }
                break;
            default:
                super.e(writer, i2, obj);
                break;
        }
    }

    @Override // m2.AbstractC1286i
    public final int f(Object obj) {
        switch (this.f11157t) {
            case 0:
                int[] value = (int[]) obj;
                kotlin.jvm.internal.i.e(value, "value");
                int i2 = 0;
                for (int i3 : value) {
                    i2 += this.f11158u.f(Integer.valueOf(i3));
                }
                return i2;
            case 1:
                long[] value2 = (long[]) obj;
                kotlin.jvm.internal.i.e(value2, "value");
                int i6 = 0;
                for (long j2 : value2) {
                    i6 += this.f11158u.f(Long.valueOf(j2));
                }
                return i6;
            default:
                if (obj != null) {
                    AbstractC1286i abstractC1286i = this.f11158u;
                    if (!obj.equals(abstractC1286i.f11180d)) {
                        return abstractC1286i.g(1, obj);
                    }
                }
                return 0;
        }
    }

    @Override // m2.AbstractC1286i
    public int g(int i2, Object obj) {
        switch (this.f11157t) {
            case 0:
                int[] iArr = (int[]) obj;
                if (iArr == null || iArr.length == 0) {
                    return 0;
                }
                return super.g(i2, iArr);
            case 1:
                long[] jArr = (long[]) obj;
                if (jArr == null || jArr.length == 0) {
                    return 0;
                }
                return super.g(i2, jArr);
            default:
                return super.g(i2, obj);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C1282e(AbstractC1286i abstractC1286i, InterfaceC1586c interfaceC1586c, Object obj) {
        super(r2, interfaceC1586c, r4, obj, 32);
        this.f11157t = 2;
        EnumC1281d enumC1281d = EnumC1281d.f11153d;
        EnumC1289l enumC1289l = EnumC1289l.f11191c;
        this.f11158u = abstractC1286i;
    }
}
