package E1;

import L1.z;
import b0.C0261L;
import h1.C0438i;
import m.C0580E;
import w2.L;
import w2.O;

/* loaded from: classes.dex */
public final /* synthetic */ class k implements Y1.c {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f766d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f767e;

    public /* synthetic */ k(int i3, Object obj) {
        this.f766d = i3;
        this.f767e = obj;
    }

    @Override // Y1.c
    public final Object j(Object obj) {
        switch (this.f766d) {
            case 0:
                C0261L c0261l = (C0261L) obj;
                Z1.i.f(c0261l, "$this$graphicsLayer");
                C0580E c0580e = (C0580E) this.f767e;
                c0261l.d(((Number) c0580e.f5570f.getValue()).floatValue());
                c0261l.e(((Number) c0580e.f5570f.getValue()).floatValue());
                return z.f2729a;
            case 1:
                int intValue = ((Integer) obj).intValue();
                StringBuilder sb = new StringBuilder();
                u2.f fVar = (u2.f) this.f767e;
                sb.append(fVar.f8541e[intValue]);
                sb.append(": ");
                sb.append(fVar.f8542f[intValue].d());
                return sb.toString();
            case C0438i.FLOAT_FIELD_NUMBER /* 2 */:
                Z1.i.f((u2.a) obj, "$this$buildSerialDescriptor");
                ((L) this.f767e).getClass();
                return z.f2729a;
            default:
                int intValue2 = ((Integer) obj).intValue();
                StringBuilder sb2 = new StringBuilder();
                O o3 = (O) this.f767e;
                sb2.append(o3.f8626e[intValue2]);
                sb2.append(": ");
                sb2.append(o3.h(intValue2).d());
                return sb2.toString();
        }
    }
}
