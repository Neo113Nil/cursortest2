package z3;

import com.onesignal.inAppMessages.internal.display.impl.a;
import kotlin.jvm.internal.t;

/* loaded from: classes.dex */
public final class e extends i {

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ int f6303t;

    /* renamed from: u, reason: collision with root package name */
    public final i f6304u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(i iVar, int i7) {
        super(d.f6299i, t.a(int[].class), iVar.f6325c, new int[0], 32);
        this.f6303t = i7;
        switch (i7) {
            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                super(d.f6299i, t.a(long[].class), iVar.f6325c, new long[0], 32);
                this.f6304u = iVar;
                break;
            default:
                this.f6304u = iVar;
                break;
        }
    }

    @Override // z3.i
    public final Object b(V5.g gVar) {
        int i7 = this.f6303t;
        i iVar = this.f6304u;
        switch (i7) {
            case 0:
                return new int[]{((Number) iVar.b(gVar)).intValue()};
            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                return new long[]{((Number) iVar.b(gVar)).longValue()};
            default:
                Object obj = iVar.f6326d;
                long h7 = gVar.h();
                while (true) {
                    int f7 = ((a) gVar.f2734g).f();
                    if (f7 == -1) {
                        gVar.i(h7);
                        return obj;
                    }
                    if (f7 == 1) {
                        obj = iVar.b(gVar);
                    } else {
                        gVar.o(f7);
                    }
                }
        }
    }

    @Override // z3.i
    public final Object c(a aVar) {
        int i7 = this.f6303t;
        i iVar = this.f6304u;
        switch (i7) {
            case 0:
                return new int[]{((Number) iVar.c(aVar)).intValue()};
            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                return new long[]{((Number) iVar.c(aVar)).longValue()};
            default:
                Object obj = iVar.f6326d;
                int c7 = aVar.c();
                while (true) {
                    int f7 = aVar.f();
                    if (f7 == -1) {
                        aVar.d(c7);
                        return obj;
                    }
                    if (f7 == 1) {
                        obj = iVar.c(aVar);
                    } else {
                        aVar.k(f7);
                    }
                }
        }
    }

    @Override // z3.i
    public final void d(a6.d writer, Object obj) {
        switch (this.f6303t) {
            case 0:
                int[] value = (int[]) obj;
                kotlin.jvm.internal.i.e(writer, "writer");
                kotlin.jvm.internal.i.e(value, "value");
                for (int i7 : value) {
                    this.f6304u.d(writer, Integer.valueOf(i7));
                }
                break;
            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                long[] value2 = (long[]) obj;
                kotlin.jvm.internal.i.e(writer, "writer");
                kotlin.jvm.internal.i.e(value2, "value");
                for (long j4 : value2) {
                    this.f6304u.d(writer, Long.valueOf(j4));
                }
                break;
            default:
                kotlin.jvm.internal.i.e(writer, "writer");
                if (obj != null) {
                    i iVar = this.f6304u;
                    if (!obj.equals(iVar.f6326d)) {
                        iVar.e(writer, 1, obj);
                        break;
                    }
                }
                break;
        }
    }

    @Override // z3.i
    public void e(a6.d writer, int i7, Object obj) {
        switch (this.f6303t) {
            case 0:
                int[] iArr = (int[]) obj;
                kotlin.jvm.internal.i.e(writer, "writer");
                if (iArr != null && iArr.length != 0) {
                    super.e(writer, i7, iArr);
                    break;
                }
                break;
            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                long[] jArr = (long[]) obj;
                kotlin.jvm.internal.i.e(writer, "writer");
                if (jArr != null && jArr.length != 0) {
                    super.e(writer, i7, jArr);
                    break;
                }
                break;
            default:
                super.e(writer, i7, obj);
                break;
        }
    }

    @Override // z3.i
    public final int f(Object obj) {
        switch (this.f6303t) {
            case 0:
                int[] value = (int[]) obj;
                kotlin.jvm.internal.i.e(value, "value");
                int i7 = 0;
                for (int i8 : value) {
                    i7 += this.f6304u.f(Integer.valueOf(i8));
                }
                return i7;
            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                long[] value2 = (long[]) obj;
                kotlin.jvm.internal.i.e(value2, "value");
                int i9 = 0;
                for (long j4 : value2) {
                    i9 += this.f6304u.f(Long.valueOf(j4));
                }
                return i9;
            default:
                if (obj != null) {
                    i iVar = this.f6304u;
                    if (!obj.equals(iVar.f6326d)) {
                        return iVar.g(1, obj);
                    }
                }
                return 0;
        }
    }

    @Override // z3.i
    public int g(int i7, Object obj) {
        switch (this.f6303t) {
            case 0:
                int[] iArr = (int[]) obj;
                if (iArr == null || iArr.length == 0) {
                    return 0;
                }
                return super.g(i7, iArr);
            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                long[] jArr = (long[]) obj;
                if (jArr == null || jArr.length == 0) {
                    return 0;
                }
                return super.g(i7, jArr);
            default:
                return super.g(i7, obj);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public e(i iVar, D5.c cVar, Object obj) {
        super(r2, cVar, r4, obj, 32);
        this.f6303t = 2;
        d dVar = d.f6299i;
        m mVar = m.f6337h;
        this.f6304u = iVar;
    }
}
