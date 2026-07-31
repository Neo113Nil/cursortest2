package B2;

import c0.InterfaceC0306i;
import h1.C0438i;
import m.InterfaceC0613x;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements InterfaceC0306i, InterfaceC0613x {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f412a;

    @Override // m.InterfaceC0613x
    public float a(float f3) {
        return f3;
    }

    @Override // c0.InterfaceC0306i
    public double b(double d3) {
        double d4;
        switch (this.f412a) {
            case 1:
                double d5 = d3 < 0.0d ? -d3 : d3;
                if (d5 >= 0.0031308049535603718d) {
                    d5 = Math.pow(d5, 0.4166666666666667d) - 0.05213270142180095d;
                    d4 = 0.9478672985781991d;
                } else {
                    d4 = 0.07739938080495357d;
                }
                return Math.copySign(d5 / d4, d3);
            case C0438i.FLOAT_FIELD_NUMBER /* 2 */:
                double d6 = d3 < 0.0d ? -d3 : d3;
                return Math.copySign(d6 >= 0.04045d ? Math.pow((0.9478672985781991d * d6) + 0.05213270142180095d, 2.4d) : d6 * 0.07739938080495357d, d3);
            default:
                return d3;
        }
    }
}
