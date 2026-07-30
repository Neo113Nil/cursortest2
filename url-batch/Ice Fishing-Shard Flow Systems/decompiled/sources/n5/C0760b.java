package n5;

import K4.e;
import K4.j;
import com.appsflyer.attribution.RequestError;
import k5.C0601a;
import k5.C0602b;
import k5.C0603c;
import k5.h;
import k5.i;
import k5.l;
import m5.m;
import s5.AbstractC0894a;
import s5.AbstractC0897d;

/* renamed from: n5.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0760b extends i {

    /* renamed from: b, reason: collision with root package name */
    public final long f6988b;

    /* renamed from: c, reason: collision with root package name */
    public final long f6989c;

    /* renamed from: d, reason: collision with root package name */
    public final C0601a f6990d;

    /* renamed from: e, reason: collision with root package name */
    public final byte[] f6991e;

    /* renamed from: f, reason: collision with root package name */
    public final i f6992f;

    /* renamed from: g, reason: collision with root package name */
    public final m[] f6993g;

    /* renamed from: h, reason: collision with root package name */
    public final int f6994h;

    /* renamed from: i, reason: collision with root package name */
    public final j f6995i;
    public final String j;

    /* renamed from: k, reason: collision with root package name */
    public final String f6996k;

    /* renamed from: l, reason: collision with root package name */
    public final byte[] f6997l;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C0760b(long j, long j7, C0601a c0601a, byte[] bArr, i iVar, m[] mVarArr, int i2, j jVar, String str, String str2, byte[] bArr2) {
        super(h.b(AbstractC0894a.f7787k, bArr2) + (str2 != null ? AbstractC0894a.j.f6058c + h.f6083b : 0) + (str == null ? 0 : AbstractC0894a.f7786i.f6058c + h.f6082a) + r8 + r16);
        int i5;
        int i7;
        int i8;
        int c7 = h.c(AbstractC0894a.f7779b, j7) + h.c(AbstractC0894a.f7778a, j);
        C0602b c0602b = AbstractC0894a.f7780c;
        int i9 = c0601a.f6054a;
        if (i9 == 0) {
            i7 = 0;
        } else {
            int i10 = c0602b.f6058c;
            if (i9 >= 0) {
                i5 = C0603c.b(i9);
            } else {
                int i11 = C0603c.f6060e;
                i5 = 10;
            }
            i7 = i10 + i5;
        }
        int b7 = h.b(AbstractC0894a.f7781d, bArr) + i7 + c7;
        int b8 = (i2 == 0 ? 0 : C0603c.b(i2) + AbstractC0894a.f7784g.f6058c) + h.e(AbstractC0894a.f7783f, mVarArr) + (iVar != null ? b7 + h.d(AbstractC0894a.f7782e, iVar) : b7);
        C0602b c0602b2 = AbstractC0894a.f7785h;
        if ((((e) jVar).f1459b & 255) == 0) {
            i8 = 0;
        } else {
            int i12 = c0602b2.f6058c;
            int i13 = C0603c.f6060e;
            i8 = i12 + 4;
        }
        this.f6988b = j;
        this.f6989c = j7;
        this.j = str;
        this.f6996k = str2;
        this.f6995i = jVar;
        this.f6990d = c0601a;
        this.f6991e = bArr;
        this.f6992f = iVar;
        this.f6993g = mVarArr;
        this.f6994h = i2;
        this.f6997l = bArr2;
    }

    public static C0601a d(I4.i iVar) {
        switch (iVar.ordinal()) {
            case 0:
                return AbstractC0897d.f7794a;
            case 1:
                return AbstractC0897d.f7795b;
            case 2:
                return AbstractC0897d.f7796c;
            case 3:
                return AbstractC0897d.f7797d;
            case 4:
                return AbstractC0897d.f7798e;
            case 5:
                return AbstractC0897d.f7799f;
            case 6:
                return AbstractC0897d.f7800g;
            case S.j.DOUBLE_FIELD_NUMBER /* 7 */:
                return AbstractC0897d.f7801h;
            case S.j.BYTES_FIELD_NUMBER /* 8 */:
                return AbstractC0897d.f7802i;
            case 9:
                return AbstractC0897d.j;
            case 10:
                return AbstractC0897d.f7803k;
            case RequestError.STOP_TRACKING /* 11 */:
                return AbstractC0897d.f7804l;
            case 12:
                return AbstractC0897d.f7805m;
            case 13:
                return AbstractC0897d.f7806n;
            case 14:
                return AbstractC0897d.f7807o;
            case 15:
                return AbstractC0897d.f7808p;
            case 16:
                return AbstractC0897d.f7809q;
            case 17:
                return AbstractC0897d.f7810r;
            case 18:
                return AbstractC0897d.f7811s;
            case 19:
                return AbstractC0897d.f7812t;
            case 20:
                return AbstractC0897d.f7813u;
            case 21:
                return AbstractC0897d.f7814v;
            case 22:
                return AbstractC0897d.f7815w;
            case 23:
                return AbstractC0897d.f7816x;
            case 24:
                return AbstractC0897d.f7817y;
            default:
                return AbstractC0897d.f7794a;
        }
    }

    @Override // k5.AbstractC0605e
    public final void c(l lVar) {
        C0602b c0602b = AbstractC0894a.f7778a;
        long j = this.f6988b;
        if (j != 0) {
            lVar.N(c0602b, j);
        }
        C0602b c0602b2 = AbstractC0894a.f7779b;
        long j7 = this.f6989c;
        if (j7 != 0) {
            lVar.N(c0602b2, j7);
        }
        C0602b c0602b3 = AbstractC0894a.f7780c;
        C0601a c0601a = this.f6990d;
        if (c0601a.f6054a != 0) {
            lVar.L(c0602b3, c0601a);
        }
        lVar.B(AbstractC0894a.f7781d, this.f6991e);
        i iVar = this.f6992f;
        if (iVar != null) {
            lVar.a(AbstractC0894a.f7782e, iVar);
        }
        lVar.j(AbstractC0894a.f7783f, this.f6993g);
        C0602b c0602b4 = AbstractC0894a.f7784g;
        int i2 = this.f6994h;
        if (i2 != 0) {
            lVar.Z(c0602b4, i2);
        }
        C0602b c0602b5 = AbstractC0894a.f7785h;
        int i5 = ((e) this.f6995i).f1459b & 255;
        if (i5 != 0) {
            lVar.M(c0602b5, i5);
        }
        C0602b c0602b6 = AbstractC0894a.f7786i;
        String str = this.j;
        if (str != null) {
            lVar.X(c0602b6, str);
        }
        C0602b c0602b7 = AbstractC0894a.j;
        String str2 = this.f6996k;
        if (str2 != null) {
            lVar.Q(c0602b7, str2);
        }
        lVar.B(AbstractC0894a.f7787k, this.f6997l);
    }
}
