package B;

import c0.InterfaceC0363i;
import m.InterfaceC0638x;
import r.AbstractC0856c;

/* loaded from: classes.dex */
public final /* synthetic */ class r implements InterfaceC0363i, InterfaceC0638x {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f438a;

    @Override // m.InterfaceC0638x
    public float a(float f3) {
        return f3;
    }

    @Override // c0.InterfaceC0363i
    public double b(double d3) {
        double d4;
        switch (this.f438a) {
            case k1.i.BYTES_FIELD_NUMBER /* 8 */:
                double d5 = d3 < 0.0d ? -d3 : d3;
                if (d5 >= 0.0031308049535603718d) {
                    d5 = Math.pow(d5, 0.4166666666666667d) - 0.05213270142180095d;
                    d4 = 0.9478672985781991d;
                } else {
                    d4 = 0.07739938080495357d;
                }
                return Math.copySign(d5 / d4, d3);
            case AbstractC0856c.f8037c /* 9 */:
                double d6 = d3 < 0.0d ? -d3 : d3;
                return Math.copySign(d6 >= 0.04045d ? Math.pow((0.9478672985781991d * d6) + 0.05213270142180095d, 2.4d) : d6 * 0.07739938080495357d, d3);
            default:
                return d3;
        }
    }
}
