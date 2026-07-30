package Y5;

import g1.C4523c;
import kotlin.jvm.internal.s;

/* loaded from: classes2.dex */
public final class b extends i {

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ int f3980t = 0;

    /* renamed from: u, reason: collision with root package name */
    public final i f3981u;

    public b(c cVar) {
        super(d.f3985w, s.a(double[].class), cVar.f4010c, new double[0], 32);
        this.f3981u = cVar;
    }

    @Override // Y5.i
    public final Object b(I0.j jVar) {
        switch (this.f3980t) {
            case 0:
                return new double[]{Double.longBitsToDouble(((a) jVar.f1233u).i())};
            default:
                return new float[]{Float.intBitsToFloat(((a) jVar.f1233u).h())};
        }
    }

    @Override // Y5.i
    public final Object c(a aVar) {
        switch (this.f3980t) {
            case 0:
                return new double[]{Double.longBitsToDouble(aVar.i())};
            default:
                return new float[]{Float.intBitsToFloat(aVar.h())};
        }
    }

    @Override // Y5.i
    public final void d(C4523c writer, Object obj) {
        switch (this.f3980t) {
            case 0:
                double[] value = (double[]) obj;
                kotlin.jvm.internal.h.e(writer, "writer");
                kotlin.jvm.internal.h.e(value, "value");
                for (double d2 : value) {
                    ((c) this.f3981u).d(writer, Double.valueOf(d2));
                }
                break;
            default:
                float[] value2 = (float[]) obj;
                kotlin.jvm.internal.h.e(writer, "writer");
                kotlin.jvm.internal.h.e(value2, "value");
                for (float f6 : value2) {
                    ((c) this.f3981u).d(writer, Float.valueOf(f6));
                }
                break;
        }
    }

    @Override // Y5.i
    public final void e(C4523c writer, int i, Object obj) {
        switch (this.f3980t) {
            case 0:
                double[] dArr = (double[]) obj;
                kotlin.jvm.internal.h.e(writer, "writer");
                if (dArr != null && dArr.length != 0) {
                    super.e(writer, i, dArr);
                    break;
                }
                break;
            default:
                float[] fArr = (float[]) obj;
                kotlin.jvm.internal.h.e(writer, "writer");
                if (fArr != null && fArr.length != 0) {
                    super.e(writer, i, fArr);
                    break;
                }
                break;
        }
    }

    @Override // Y5.i
    public final int f(Object obj) {
        switch (this.f3980t) {
            case 0:
                double[] value = (double[]) obj;
                kotlin.jvm.internal.h.e(value, "value");
                int i = 0;
                for (double d2 : value) {
                    ((c) this.f3981u).f(Double.valueOf(d2));
                    i += 8;
                }
                return i;
            default:
                float[] value2 = (float[]) obj;
                kotlin.jvm.internal.h.e(value2, "value");
                int i4 = 0;
                for (float f6 : value2) {
                    ((c) this.f3981u).getClass();
                    i4 += 4;
                }
                return i4;
        }
    }

    @Override // Y5.i
    public final int g(int i, Object obj) {
        switch (this.f3980t) {
            case 0:
                double[] dArr = (double[]) obj;
                if (dArr == null || dArr.length == 0) {
                    return 0;
                }
                return super.g(i, dArr);
            default:
                float[] fArr = (float[]) obj;
                if (fArr == null || fArr.length == 0) {
                    return 0;
                }
                return super.g(i, fArr);
        }
    }

    public b(c cVar, byte b9) {
        super(d.f3985w, s.a(float[].class), cVar.f4010c, new float[0], 32);
        this.f3981u = cVar;
    }
}
