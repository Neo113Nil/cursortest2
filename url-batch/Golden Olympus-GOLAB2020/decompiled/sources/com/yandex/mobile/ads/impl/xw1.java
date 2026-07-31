package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.wz1;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
final class xw1 {

    /* renamed from: d, reason: collision with root package name */
    private static final n12 f34698d = n12.a(':');

    /* renamed from: e, reason: collision with root package name */
    private static final n12 f34699e = n12.a('*');

    /* renamed from: a, reason: collision with root package name */
    private final ArrayList f34700a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    private int f34701b = 0;

    /* renamed from: c, reason: collision with root package name */
    private int f34702c;

    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final long f34703a;

        /* renamed from: b, reason: collision with root package name */
        public final int f34704b;

        public a(int i4, long j4) {
            this.f34703a = j4;
            this.f34704b = i4;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00b3 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(q70 q70Var, hj1 hj1Var, ArrayList arrayList) {
        char c4;
        int i4 = 4;
        int i5 = this.f34701b;
        if (i5 == 0) {
            long b4 = q70Var.b();
            hj1Var.f26771a = (b4 == -1 || b4 < 8) ? 0L : b4 - 8;
            this.f34701b = 1;
            return;
        }
        if (i5 == 1) {
            sf1 sf1Var = new sf1(8);
            q70Var.b(sf1Var.c(), 0, 8);
            this.f34702c = sf1Var.k() + 8;
            if (sf1Var.h() != 1397048916) {
                hj1Var.f26771a = 0L;
                return;
            } else {
                hj1Var.f26771a = q70Var.a() - (this.f34702c - 12);
                this.f34701b = 2;
                return;
            }
        }
        short s4 = 2192;
        int i6 = 8;
        short s5 = 2817;
        if (i5 == 2) {
            long b5 = q70Var.b();
            int i7 = this.f34702c - 20;
            sf1 sf1Var2 = new sf1(i7);
            q70Var.b(sf1Var2.c(), 0, i7);
            int i8 = 0;
            while (i8 < i7 / 12) {
                sf1Var2.f(2);
                short m4 = sf1Var2.m();
                if (m4 == s4 || m4 == 2816 || m4 == s5 || m4 == 2819 || m4 == 2820) {
                    this.f34700a.add(new a(sf1Var2.k(), (b5 - this.f34702c) - sf1Var2.k()));
                } else {
                    sf1Var2.f(i6);
                }
                i8++;
                s5 = 2817;
                s4 = 2192;
                i6 = 8;
            }
            if (this.f34700a.isEmpty()) {
                hj1Var.f26771a = 0L;
                return;
            } else {
                this.f34701b = 3;
                hj1Var.f26771a = ((a) this.f34700a.get(0)).f34703a;
                return;
            }
        }
        if (i5 != 3) {
            throw new IllegalStateException();
        }
        long a4 = q70Var.a();
        int b6 = (int) ((q70Var.b() - q70Var.a()) - this.f34702c);
        sf1 sf1Var3 = new sf1(b6);
        q70Var.b(sf1Var3.c(), 0, b6);
        int i9 = 0;
        while (i9 < this.f34700a.size()) {
            a aVar = (a) this.f34700a.get(i9);
            sf1Var3.e((int) (aVar.f34703a - a4));
            sf1Var3.f(i4);
            int k4 = sf1Var3.k();
            Charset charset = un.f33183c;
            String a5 = sf1Var3.a(k4, charset);
            a5.getClass();
            char c5 = 65535;
            switch (a5.hashCode()) {
                case -1711564334:
                    if (a5.equals("SlowMotion_Data")) {
                        c5 = 0;
                    }
                    switch (c5) {
                        case 0:
                            c4 = 2192;
                            break;
                        case 1:
                            c4 = 2819;
                            break;
                        case 2:
                            c4 = 2816;
                            break;
                        case 3:
                            c4 = 2820;
                            break;
                        case 4:
                            c4 = 2817;
                            break;
                        default:
                            throw wf1.a("Invalid SEF name", (Exception) null);
                    }
                    int i10 = aVar.f34704b - (k4 + 8);
                    if (c4 != 2192) {
                        ArrayList arrayList2 = new ArrayList();
                        List<String> a6 = f34699e.a(sf1Var3.a(i10, charset));
                        for (int i11 = 0; i11 < a6.size(); i11++) {
                            List<String> a7 = f34698d.a(a6.get(i11));
                            if (a7.size() != 3) {
                                throw wf1.a((String) null, (Exception) null);
                            }
                            try {
                                arrayList2.add(new wz1.b(1 << (Integer.parseInt(a7.get(2)) - 1), Long.parseLong(a7.get(0)), Long.parseLong(a7.get(1))));
                            } catch (NumberFormatException e4) {
                                throw wf1.a((String) null, (Exception) e4);
                            }
                        }
                        arrayList.add(new wz1(arrayList2));
                    } else if (c4 != 2816 && c4 != 2817 && c4 != 2819 && c4 != 2820) {
                        throw new IllegalStateException();
                    }
                    i9++;
                    i4 = 4;
                case -1332107749:
                    if (a5.equals("Super_SlowMotion_Edit_Data")) {
                        c5 = 1;
                    }
                    switch (c5) {
                    }
                    int i102 = aVar.f34704b - (k4 + 8);
                    if (c4 != 2192) {
                    }
                    i9++;
                    i4 = 4;
                    break;
                case -1251387154:
                    if (a5.equals("Super_SlowMotion_Data")) {
                        c5 = 2;
                    }
                    switch (c5) {
                    }
                    int i1022 = aVar.f34704b - (k4 + 8);
                    if (c4 != 2192) {
                    }
                    i9++;
                    i4 = 4;
                    break;
                case -830665521:
                    if (a5.equals("Super_SlowMotion_Deflickering_On")) {
                        c5 = 3;
                    }
                    switch (c5) {
                    }
                    int i10222 = aVar.f34704b - (k4 + 8);
                    if (c4 != 2192) {
                    }
                    i9++;
                    i4 = 4;
                    break;
                case 1760745220:
                    if (a5.equals("Super_SlowMotion_BGM")) {
                        c5 = 4;
                    }
                    switch (c5) {
                    }
                    int i102222 = aVar.f34704b - (k4 + 8);
                    if (c4 != 2192) {
                    }
                    i9++;
                    i4 = 4;
                    break;
                default:
                    switch (c5) {
                    }
                    int i1022222 = aVar.f34704b - (k4 + 8);
                    if (c4 != 2192) {
                    }
                    i9++;
                    i4 = 4;
                    break;
            }
        }
        hj1Var.f26771a = 0L;
    }

    public final void a() {
        this.f34700a.clear();
        this.f34701b = 0;
    }
}
