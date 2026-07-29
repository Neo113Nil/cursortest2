package com.umeng.commonsdk.proguard;

import com.umeng.commonsdk.proguard.ab;

/* compiled from: TProtocolUtil.java */
/* loaded from: classes2.dex */
public class ak {

    /* renamed from: a, reason: collision with root package name */
    private static int f9030a = Integer.MAX_VALUE;

    public static void a(int i) {
        f9030a = i;
    }

    public static void a(ah ahVar, byte b2) throws o {
        a(ahVar, b2, f9030a);
    }

    public static void a(ah ahVar, byte b2, int i) throws o {
        if (i <= 0) {
            throw new o("Maximum skip depth exceeded");
        }
        int i2 = 0;
        switch (b2) {
            case 2:
                ahVar.t();
                return;
            case 3:
                ahVar.u();
                return;
            case 4:
                ahVar.y();
                return;
            case 5:
            case 7:
            case 9:
            default:
                return;
            case 6:
                ahVar.v();
                return;
            case 8:
                ahVar.w();
                return;
            case 10:
                ahVar.x();
                return;
            case 11:
                ahVar.A();
                return;
            case 12:
                ahVar.j();
                while (true) {
                    ac l = ahVar.l();
                    if (l.f9012b != 0) {
                        a(ahVar, l.f9012b, i - 1);
                        ahVar.m();
                    } else {
                        ahVar.k();
                        return;
                    }
                }
            case 13:
                ae n = ahVar.n();
                while (i2 < n.f9018c) {
                    int i3 = i - 1;
                    a(ahVar, n.f9016a, i3);
                    a(ahVar, n.f9017b, i3);
                    i2++;
                }
                ahVar.o();
                return;
            case 14:
                al r = ahVar.r();
                while (i2 < r.f9032b) {
                    a(ahVar, r.f9031a, i - 1);
                    i2++;
                }
                ahVar.s();
                return;
            case 15:
                ad p = ahVar.p();
                while (i2 < p.f9015b) {
                    a(ahVar, p.f9014a, i - 1);
                    i2++;
                }
                ahVar.q();
                return;
        }
    }

    public static aj a(byte[] bArr, aj ajVar) {
        if (bArr[0] > 16) {
            return new ab.a();
        }
        return (bArr.length <= 1 || (bArr[1] & 128) == 0) ? ajVar : new ab.a();
    }
}
