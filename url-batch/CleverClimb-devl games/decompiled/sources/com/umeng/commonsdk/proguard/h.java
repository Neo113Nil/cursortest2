package com.umeng.commonsdk.proguard;

import com.tapjoy.TJAdUnitConstants;

/* compiled from: TApplicationException.java */
/* loaded from: classes2.dex */
public class h extends o {

    /* renamed from: a, reason: collision with root package name */
    public static final int f9065a = 0;

    /* renamed from: b, reason: collision with root package name */
    public static final int f9066b = 1;

    /* renamed from: c, reason: collision with root package name */
    public static final int f9067c = 2;

    /* renamed from: d, reason: collision with root package name */
    public static final int f9068d = 3;
    public static final int e = 4;
    public static final int f = 5;
    public static final int g = 6;
    public static final int h = 7;
    private static final am j = new am("TApplicationException");
    private static final ac k = new ac(TJAdUnitConstants.String.MESSAGE, (byte) 11, 1);
    private static final ac l = new ac("type", (byte) 8, 2);
    private static final long m = 1;
    protected int i;

    public h() {
        this.i = 0;
    }

    public h(int i) {
        this.i = 0;
        this.i = i;
    }

    public h(int i, String str) {
        super(str);
        this.i = 0;
        this.i = i;
    }

    public h(String str) {
        super(str);
        this.i = 0;
    }

    public int a() {
        return this.i;
    }

    public static h a(ah ahVar) throws o {
        ahVar.j();
        String str = null;
        int i = 0;
        while (true) {
            ac l2 = ahVar.l();
            if (l2.f9012b != 0) {
                switch (l2.f9013c) {
                    case 1:
                        if (l2.f9012b == 11) {
                            str = ahVar.z();
                            break;
                        } else {
                            ak.a(ahVar, l2.f9012b);
                            break;
                        }
                    case 2:
                        if (l2.f9012b == 8) {
                            i = ahVar.w();
                            break;
                        } else {
                            ak.a(ahVar, l2.f9012b);
                            break;
                        }
                    default:
                        ak.a(ahVar, l2.f9012b);
                        break;
                }
                ahVar.m();
            } else {
                ahVar.k();
                return new h(i, str);
            }
        }
    }

    public void b(ah ahVar) throws o {
        ahVar.a(j);
        if (getMessage() != null) {
            ahVar.a(k);
            ahVar.a(getMessage());
            ahVar.c();
        }
        ahVar.a(l);
        ahVar.a(this.i);
        ahVar.c();
        ahVar.d();
        ahVar.b();
    }
}
