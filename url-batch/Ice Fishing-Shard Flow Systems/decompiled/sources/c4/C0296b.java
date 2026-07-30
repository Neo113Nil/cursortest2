package c4;

import kotlin.jvm.internal.E;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: c4.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0296b extends AbstractC0303i {

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ int f4209t = 0;

    /* renamed from: u, reason: collision with root package name */
    public final AbstractC0303i f4210u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0296b(C0297c originalAdapter) {
        super(EnumC0298d.f4214l, E.a(double[].class), originalAdapter.f4239c, new double[0], 32);
        Intrinsics.checkNotNullParameter(originalAdapter, "originalAdapter");
        this.f4210u = originalAdapter;
    }

    @Override // c4.AbstractC0303i
    public final Object b(B.f reader) {
        switch (this.f4209t) {
            case 0:
                Intrinsics.checkNotNullParameter(reader, "reader");
                return new double[]{Double.longBitsToDouble(((C0295a) reader.f152e).i())};
            default:
                Intrinsics.checkNotNullParameter(reader, "reader");
                return new float[]{Float.intBitsToFloat(((C0295a) reader.f152e).h())};
        }
    }

    @Override // c4.AbstractC0303i
    public final Object c(C0295a reader) {
        switch (this.f4209t) {
            case 0:
                Intrinsics.checkNotNullParameter(reader, "reader");
                return new double[]{Double.longBitsToDouble(reader.i())};
            default:
                Intrinsics.checkNotNullParameter(reader, "reader");
                return new float[]{Float.intBitsToFloat(reader.h())};
        }
    }

    @Override // c4.AbstractC0303i
    public final void e(l2.c writer, Object obj) {
        switch (this.f4209t) {
            case 0:
                double[] value = (double[]) obj;
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                for (double d7 : value) {
                    ((C0297c) this.f4210u).e(writer, Double.valueOf(d7));
                }
                break;
            default:
                float[] value2 = (float[]) obj;
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value2, "value");
                for (float f7 : value2) {
                    ((C0297c) this.f4210u).e(writer, Float.valueOf(f7));
                }
                break;
        }
    }

    @Override // c4.AbstractC0303i
    public final void f(l2.c writer, int i2, Object obj) {
        switch (this.f4209t) {
            case 0:
                double[] dArr = (double[]) obj;
                Intrinsics.checkNotNullParameter(writer, "writer");
                if (dArr != null && dArr.length != 0) {
                    super.f(writer, i2, dArr);
                    break;
                }
                break;
            default:
                float[] fArr = (float[]) obj;
                Intrinsics.checkNotNullParameter(writer, "writer");
                if (fArr != null && fArr.length != 0) {
                    super.f(writer, i2, fArr);
                    break;
                }
                break;
        }
    }

    @Override // c4.AbstractC0303i
    public final int g(Object obj) {
        switch (this.f4209t) {
            case 0:
                double[] value = (double[]) obj;
                Intrinsics.checkNotNullParameter(value, "value");
                int i2 = 0;
                for (double d7 : value) {
                    ((C0297c) this.f4210u).g(Double.valueOf(d7));
                    i2 += 8;
                }
                return i2;
            default:
                float[] value2 = (float[]) obj;
                Intrinsics.checkNotNullParameter(value2, "value");
                int i5 = 0;
                for (float f7 : value2) {
                    ((C0297c) this.f4210u).getClass();
                    i5 += 4;
                }
                return i5;
        }
    }

    @Override // c4.AbstractC0303i
    public final int h(int i2, Object obj) {
        switch (this.f4209t) {
            case 0:
                double[] dArr = (double[]) obj;
                if (dArr == null || dArr.length == 0) {
                    return 0;
                }
                return super.h(i2, dArr);
            default:
                float[] fArr = (float[]) obj;
                if (fArr == null || fArr.length == 0) {
                    return 0;
                }
                return super.h(i2, fArr);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0296b(C0297c originalAdapter, byte b7) {
        super(EnumC0298d.f4214l, E.a(float[].class), originalAdapter.f4239c, new float[0], 32);
        Intrinsics.checkNotNullParameter(originalAdapter, "originalAdapter");
        this.f4210u = originalAdapter;
    }
}
