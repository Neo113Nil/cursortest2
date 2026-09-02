package z3;

import kotlin.jvm.internal.t;

/* loaded from: classes.dex */
public final class b extends i {

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ int f6294t = 0;

    /* renamed from: u, reason: collision with root package name */
    public final i f6295u;

    public b(c cVar) {
        super(d.f6299i, t.a(double[].class), cVar.f6325c, new double[0], 32);
        this.f6295u = cVar;
    }

    @Override // z3.i
    public final Object b(V5.g gVar) {
        switch (this.f6294t) {
            case 0:
                return new double[]{Double.longBitsToDouble(((a) gVar.f2734g).i())};
            default:
                return new float[]{Float.intBitsToFloat(((a) gVar.f2734g).h())};
        }
    }

    @Override // z3.i
    public final Object c(a aVar) {
        switch (this.f6294t) {
            case 0:
                return new double[]{Double.longBitsToDouble(aVar.i())};
            default:
                return new float[]{Float.intBitsToFloat(aVar.h())};
        }
    }

    @Override // z3.i
    public final void d(a6.d writer, Object obj) {
        switch (this.f6294t) {
            case 0:
                double[] value = (double[]) obj;
                kotlin.jvm.internal.i.e(writer, "writer");
                kotlin.jvm.internal.i.e(value, "value");
                for (double d7 : value) {
                    ((c) this.f6295u).d(writer, Double.valueOf(d7));
                }
                break;
            default:
                float[] value2 = (float[]) obj;
                kotlin.jvm.internal.i.e(writer, "writer");
                kotlin.jvm.internal.i.e(value2, "value");
                for (float f7 : value2) {
                    ((c) this.f6295u).d(writer, Float.valueOf(f7));
                }
                break;
        }
    }

    @Override // z3.i
    public final void e(a6.d writer, int i7, Object obj) {
        switch (this.f6294t) {
            case 0:
                double[] dArr = (double[]) obj;
                kotlin.jvm.internal.i.e(writer, "writer");
                if (dArr != null && dArr.length != 0) {
                    super.e(writer, i7, dArr);
                    break;
                }
                break;
            default:
                float[] fArr = (float[]) obj;
                kotlin.jvm.internal.i.e(writer, "writer");
                if (fArr != null && fArr.length != 0) {
                    super.e(writer, i7, fArr);
                    break;
                }
                break;
        }
    }

    @Override // z3.i
    public final int f(Object obj) {
        switch (this.f6294t) {
            case 0:
                double[] value = (double[]) obj;
                kotlin.jvm.internal.i.e(value, "value");
                int i7 = 0;
                for (double d7 : value) {
                    ((c) this.f6295u).f(Double.valueOf(d7));
                    i7 += 8;
                }
                return i7;
            default:
                float[] value2 = (float[]) obj;
                kotlin.jvm.internal.i.e(value2, "value");
                int i8 = 0;
                for (float f7 : value2) {
                    ((c) this.f6295u).getClass();
                    i8 += 4;
                }
                return i8;
        }
    }

    @Override // z3.i
    public final int g(int i7, Object obj) {
        switch (this.f6294t) {
            case 0:
                double[] dArr = (double[]) obj;
                if (dArr == null || dArr.length == 0) {
                    return 0;
                }
                return super.g(i7, dArr);
            default:
                float[] fArr = (float[]) obj;
                if (fArr == null || fArr.length == 0) {
                    return 0;
                }
                return super.g(i7, fArr);
        }
    }

    public b(c cVar, byte b7) {
        super(d.f6299i, t.a(float[].class), cVar.f6325c, new float[0], 32);
        this.f6295u = cVar;
    }
}
