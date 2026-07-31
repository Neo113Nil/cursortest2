package p2;

import java.util.ArrayList;
import java.util.List;
import o2.a0;
import o2.w;
import r0.n2;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final List<byte[]> f19972a;

    /* renamed from: b, reason: collision with root package name */
    public final int f19973b;

    /* renamed from: c, reason: collision with root package name */
    public final int f19974c;

    /* renamed from: d, reason: collision with root package name */
    public final int f19975d;

    /* renamed from: e, reason: collision with root package name */
    public final float f19976e;

    /* renamed from: f, reason: collision with root package name */
    public final String f19977f;

    private a(List<byte[]> list, int i7, int i8, int i9, float f7, String str) {
        this.f19972a = list;
        this.f19973b = i7;
        this.f19974c = i8;
        this.f19975d = i9;
        this.f19976e = f7;
        this.f19977f = str;
    }

    private static byte[] a(a0 a0Var) {
        int I = a0Var.I();
        int e7 = a0Var.e();
        a0Var.P(I);
        return o2.e.d(a0Var.d(), e7, I);
    }

    public static a b(a0 a0Var) {
        String str;
        int i7;
        float f7;
        try {
            a0Var.P(4);
            int C = (a0Var.C() & 3) + 1;
            if (C == 3) {
                throw new IllegalStateException();
            }
            ArrayList arrayList = new ArrayList();
            int C2 = a0Var.C() & 31;
            for (int i8 = 0; i8 < C2; i8++) {
                arrayList.add(a(a0Var));
            }
            int C3 = a0Var.C();
            for (int i9 = 0; i9 < C3; i9++) {
                arrayList.add(a(a0Var));
            }
            int i10 = -1;
            if (C2 > 0) {
                w.c l7 = o2.w.l((byte[]) arrayList.get(0), C, ((byte[]) arrayList.get(0)).length);
                int i11 = l7.f19818f;
                int i12 = l7.f19819g;
                float f8 = l7.f19820h;
                str = o2.e.a(l7.f19813a, l7.f19814b, l7.f19815c);
                i10 = i11;
                i7 = i12;
                f7 = f8;
            } else {
                str = null;
                i7 = -1;
                f7 = 1.0f;
            }
            return new a(arrayList, C, i10, i7, f7, str);
        } catch (ArrayIndexOutOfBoundsException e7) {
            throw n2.a("Error parsing AVC config", e7);
        }
    }
}
