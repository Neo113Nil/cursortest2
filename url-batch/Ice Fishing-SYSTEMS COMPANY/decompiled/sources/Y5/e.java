package Y5;

import g1.C4523c;
import kotlin.jvm.internal.s;

/* loaded from: classes2.dex */
public final class e extends i {

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ int f3989t;

    /* renamed from: u, reason: collision with root package name */
    public final i f3990u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(i iVar, int i) {
        super(d.f3985w, s.a(int[].class), iVar.f4010c, new int[0], 32);
        this.f3989t = i;
        switch (i) {
            case 1:
                super(d.f3985w, s.a(long[].class), iVar.f4010c, new long[0], 32);
                this.f3990u = iVar;
                break;
            default:
                this.f3990u = iVar;
                break;
        }
    }

    @Override // Y5.i
    public final Object b(I0.j jVar) {
        i iVar = this.f3990u;
        switch (this.f3989t) {
            case 0:
                return new int[]{((Number) iVar.b(jVar)).intValue()};
            case 1:
                return new long[]{((Number) iVar.b(jVar)).longValue()};
            default:
                long a9 = jVar.a();
                Object obj = iVar.f4011d;
                while (true) {
                    int f6 = ((a) jVar.f1233u).f();
                    if (f6 == -1) {
                        jVar.l(a9);
                        return obj;
                    }
                    if (f6 == 1) {
                        obj = iVar.b(jVar);
                    } else {
                        jVar.w(f6);
                    }
                }
        }
    }

    @Override // Y5.i
    public final Object c(a aVar) {
        i iVar = this.f3990u;
        switch (this.f3989t) {
            case 0:
                return new int[]{((Number) iVar.c(aVar)).intValue()};
            case 1:
                return new long[]{((Number) iVar.c(aVar)).longValue()};
            default:
                int c4 = aVar.c();
                Object obj = iVar.f4011d;
                while (true) {
                    int f6 = aVar.f();
                    if (f6 == -1) {
                        aVar.d(c4);
                        return obj;
                    }
                    if (f6 == 1) {
                        obj = iVar.c(aVar);
                    } else {
                        aVar.k(f6);
                    }
                }
        }
    }

    @Override // Y5.i
    public final void d(C4523c writer, Object obj) {
        switch (this.f3989t) {
            case 0:
                int[] value = (int[]) obj;
                kotlin.jvm.internal.h.e(writer, "writer");
                kotlin.jvm.internal.h.e(value, "value");
                for (int i : value) {
                    this.f3990u.d(writer, Integer.valueOf(i));
                }
                break;
            case 1:
                long[] value2 = (long[]) obj;
                kotlin.jvm.internal.h.e(writer, "writer");
                kotlin.jvm.internal.h.e(value2, "value");
                for (long j9 : value2) {
                    this.f3990u.d(writer, Long.valueOf(j9));
                }
                break;
            default:
                kotlin.jvm.internal.h.e(writer, "writer");
                if (obj != null) {
                    i iVar = this.f3990u;
                    if (!obj.equals(iVar.f4011d)) {
                        iVar.e(writer, 1, obj);
                        break;
                    }
                }
                break;
        }
    }

    @Override // Y5.i
    public void e(C4523c writer, int i, Object obj) {
        switch (this.f3989t) {
            case 0:
                int[] iArr = (int[]) obj;
                kotlin.jvm.internal.h.e(writer, "writer");
                if (iArr != null && iArr.length != 0) {
                    super.e(writer, i, iArr);
                    break;
                }
                break;
            case 1:
                long[] jArr = (long[]) obj;
                kotlin.jvm.internal.h.e(writer, "writer");
                if (jArr != null && jArr.length != 0) {
                    super.e(writer, i, jArr);
                    break;
                }
                break;
            default:
                super.e(writer, i, obj);
                break;
        }
    }

    @Override // Y5.i
    public final int f(Object obj) {
        switch (this.f3989t) {
            case 0:
                int[] value = (int[]) obj;
                kotlin.jvm.internal.h.e(value, "value");
                int i = 0;
                for (int i4 : value) {
                    i += this.f3990u.f(Integer.valueOf(i4));
                }
                return i;
            case 1:
                long[] value2 = (long[]) obj;
                kotlin.jvm.internal.h.e(value2, "value");
                int i9 = 0;
                for (long j9 : value2) {
                    i9 += this.f3990u.f(Long.valueOf(j9));
                }
                return i9;
            default:
                if (obj != null) {
                    i iVar = this.f3990u;
                    if (!obj.equals(iVar.f4011d)) {
                        return iVar.g(1, obj);
                    }
                }
                return 0;
        }
    }

    @Override // Y5.i
    public int g(int i, Object obj) {
        switch (this.f3989t) {
            case 0:
                int[] iArr = (int[]) obj;
                if (iArr == null || iArr.length == 0) {
                    return 0;
                }
                return super.g(i, iArr);
            case 1:
                long[] jArr = (long[]) obj;
                if (jArr == null || jArr.length == 0) {
                    return 0;
                }
                return super.g(i, jArr);
            default:
                return super.g(i, obj);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public e(i iVar, K7.c cVar, Object obj) {
        super(r2, cVar, r4, obj, 32);
        this.f3989t = 2;
        d dVar = d.f3985w;
        n nVar = n.f4024v;
        this.f3990u = iVar;
    }
}
