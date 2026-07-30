package defpackage;

import java.util.ArrayList;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class r02 implements Function0 {
    public final /* synthetic */ s02 m;

    public r02(s02 s02Var) {
        this.m = s02Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        ArrayList arrayList = this.m.a;
        tn1 tn1Var = new tn1(arrayList.size());
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            a81 a81Var = (a81) arrayList.get(i);
            Object obj = a81Var.b;
            int i2 = a81Var.a;
            Object o61Var = obj != null ? new o61(Integer.valueOf(i2), a81Var.b) : Integer.valueOf(i2);
            int f = tn1Var.f(o61Var);
            boolean z = f < 0;
            Object obj2 = z ? null : tn1Var.c[f];
            if (obj2 != null) {
                if (obj2 instanceof jn1) {
                    jn1 jn1Var = (jn1) obj2;
                    jn1Var.a(a81Var);
                    a81Var = jn1Var;
                } else {
                    Object[] objArr = ot1.a;
                    jn1 jn1Var2 = new jn1(2);
                    jn1Var2.a(obj2);
                    jn1Var2.a(a81Var);
                    a81Var = jn1Var2;
                }
            }
            if (z) {
                int i3 = ~f;
                tn1Var.b[i3] = o61Var;
                tn1Var.c[i3] = a81Var;
            } else {
                tn1Var.c[f] = a81Var;
            }
        }
        return new um1(tn1Var);
    }
}
