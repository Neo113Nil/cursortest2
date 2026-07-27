package B3;

import A3.n;
import io.appmetrica.analytics.impl.C0793l9;
import y3.C1567a;
import y3.C1568b;
import y3.C1569c;
import y3.h;
import y3.i;
import y3.m;

/* loaded from: classes.dex */
public final class b extends i {

    /* renamed from: b, reason: collision with root package name */
    public final long f261b;

    /* renamed from: c, reason: collision with root package name */
    public final long f262c;

    /* renamed from: d, reason: collision with root package name */
    public final C1567a f263d;

    /* renamed from: e, reason: collision with root package name */
    public final byte[] f264e;

    /* renamed from: f, reason: collision with root package name */
    public final i f265f;

    /* renamed from: g, reason: collision with root package name */
    public final n[] f266g;

    /* renamed from: h, reason: collision with root package name */
    public final int f267h;

    /* renamed from: i, reason: collision with root package name */
    public final Y2.e f268i;

    /* renamed from: j, reason: collision with root package name */
    public final String f269j;

    /* renamed from: k, reason: collision with root package name */
    public final String f270k;

    /* renamed from: l, reason: collision with root package name */
    public final byte[] f271l;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public b(long j2, long j6, C1567a c1567a, byte[] bArr, i iVar, n[] nVarArr, int i2, Y2.e eVar, String str, String str2, byte[] bArr2) {
        super(h.b(G3.a.f1012k, bArr2) + (str2 == null ? 0 : G3.a.f1011j.f12384c + h.f12410b) + (str == null ? 0 : G3.a.f1010i.f12384c + h.f12409a) + r3 + r15);
        int i3;
        int i6;
        int i7;
        int c2 = h.c(G3.a.f1003b, j6) + h.c(G3.a.f1002a, j2);
        C1568b c1568b = G3.a.f1004c;
        int i8 = c1567a.f12380a;
        if (i8 == 0) {
            i6 = 0;
        } else {
            int i9 = c1568b.f12384c;
            if (i8 >= 0) {
                i3 = C1569c.b(i8);
            } else {
                int i10 = C1569c.f12386e;
                i3 = 10;
            }
            i6 = i9 + i3;
        }
        int b6 = h.b(G3.a.f1005d, bArr) + i6 + c2;
        int b7 = (i2 == 0 ? 0 : C1569c.b(i2) + G3.a.f1008g.f12384c) + h.e(G3.a.f1007f, nVarArr) + (iVar != null ? b6 + h.d(G3.a.f1006e, iVar) : b6);
        C1568b c1568b2 = G3.a.f1009h;
        if ((eVar.f3692b & 255) == 0) {
            i7 = 0;
        } else {
            int i11 = c1568b2.f12384c;
            int i12 = C1569c.f12386e;
            i7 = i11 + 4;
        }
        this.f261b = j2;
        this.f262c = j6;
        this.f269j = str;
        this.f270k = str2;
        this.f268i = eVar;
        this.f263d = c1567a;
        this.f264e = bArr;
        this.f265f = iVar;
        this.f266g = nVarArr;
        this.f267h = i2;
        this.f271l = bArr2;
    }

    public static C1567a d(W2.i iVar) {
        switch (iVar.ordinal()) {
            case 0:
                return G3.d.f1019a;
            case 1:
                return G3.d.f1020b;
            case 2:
                return G3.d.f1021c;
            case 3:
                return G3.d.f1022d;
            case 4:
                return G3.d.f1023e;
            case 5:
                return G3.d.f1024f;
            case 6:
                return G3.d.f1025g;
            case 7:
                return G3.d.f1026h;
            case 8:
                return G3.d.f1027i;
            case 9:
                return G3.d.f1028j;
            case 10:
                return G3.d.f1029k;
            case 11:
                return G3.d.f1030l;
            case 12:
                return G3.d.f1031m;
            case 13:
                return G3.d.f1032n;
            case 14:
                return G3.d.f1033o;
            case 15:
                return G3.d.f1034p;
            case 16:
                return G3.d.f1035q;
            case 17:
                return G3.d.f1036r;
            case 18:
                return G3.d.f1037s;
            case C0793l9.f8681C /* 19 */:
                return G3.d.f1038t;
            case C0793l9.f8682D /* 20 */:
                return G3.d.f1039u;
            case C0793l9.f8683E /* 21 */:
                return G3.d.f1040v;
            case 22:
                return G3.d.f1041w;
            case 23:
                return G3.d.f1042x;
            case 24:
                return G3.d.f1043y;
            default:
                return G3.d.f1019a;
        }
    }

    @Override // y3.AbstractC1571e
    public final void c(m mVar) {
        C1568b c1568b = G3.a.f1002a;
        long j2 = this.f261b;
        if (j2 == 0) {
            mVar.getClass();
        } else {
            mVar.K(c1568b, j2);
        }
        C1568b c1568b2 = G3.a.f1003b;
        long j6 = this.f262c;
        if (j6 != 0) {
            mVar.K(c1568b2, j6);
        }
        C1568b c1568b3 = G3.a.f1004c;
        C1567a c1567a = this.f263d;
        if (c1567a.f12380a != 0) {
            mVar.I(c1568b3, c1567a);
        }
        mVar.y(G3.a.f1005d, this.f264e);
        i iVar = this.f265f;
        if (iVar != null) {
            mVar.a(G3.a.f1006e, iVar);
        }
        mVar.o(G3.a.f1007f, this.f266g);
        C1568b c1568b4 = G3.a.f1008g;
        int i2 = this.f267h;
        if (i2 != 0) {
            mVar.W(c1568b4, i2);
        }
        C1568b c1568b5 = G3.a.f1009h;
        int i3 = this.f268i.f3692b & 255;
        if (i3 != 0) {
            mVar.J(c1568b5, i3);
        }
        C1568b c1568b6 = G3.a.f1010i;
        String str = this.f269j;
        if (str != null) {
            mVar.U(c1568b6, str);
        }
        C1568b c1568b7 = G3.a.f1011j;
        String str2 = this.f270k;
        if (str2 != null) {
            mVar.N(c1568b7, str2);
        }
        mVar.y(G3.a.f1012k, this.f271l);
    }
}
