package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sj {
    static final boolean[] a = new boolean[3];

    static void a(se seVar, rv rvVar, sd sdVar) {
        sdVar.q = -1;
        sdVar.r = -1;
        int[] iArr = seVar.ar;
        if (iArr[0] != 2 && sdVar.ar[0] == 4) {
            sc scVar = sdVar.K;
            int i = scVar.f;
            int j = seVar.j();
            sc scVar2 = sdVar.M;
            int i2 = j - scVar2.f;
            scVar.h = rvVar.b(scVar);
            scVar2.h = rvVar.b(scVar2);
            rvVar.f(scVar.h, i);
            rvVar.f(scVar2.h, i2);
            sdVar.q = 2;
            sdVar.aa = i;
            int i3 = i2 - i;
            sdVar.W = i3;
            int i4 = sdVar.ad;
            if (i3 < i4) {
                sdVar.W = i4;
            }
        }
        if (iArr[1] == 2 || sdVar.ar[1] != 4) {
            return;
        }
        sc scVar3 = sdVar.L;
        int i5 = scVar3.f;
        int h = seVar.h();
        sc scVar4 = sdVar.N;
        int i6 = h - scVar4.f;
        scVar3.h = rvVar.b(scVar3);
        scVar4.h = rvVar.b(scVar4);
        rvVar.f(scVar3.h, i5);
        rvVar.f(scVar4.h, i6);
        if (sdVar.ac > 0 || sdVar.ai == 8) {
            sc scVar5 = sdVar.O;
            scVar5.h = rvVar.b(scVar5);
            rvVar.f(scVar5.h, sdVar.ac + i5);
        }
        sdVar.r = 2;
        sdVar.ab = i5;
        int i7 = i6 - i5;
        sdVar.X = i7;
        int i8 = sdVar.ae;
        if (i7 < i8) {
            sdVar.X = i8;
        }
    }

    public static final boolean b(int i, int i2) {
        return (i & i2) == i2;
    }
}
