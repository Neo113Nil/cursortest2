package l8;

import java.io.IOException;
import java.util.ArrayList;
import r7.AbstractC4978i;

/* renamed from: l8.e, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4713e {

    /* renamed from: c, reason: collision with root package name */
    public final u8.r f39116c;

    /* renamed from: f, reason: collision with root package name */
    public int f39119f;

    /* renamed from: g, reason: collision with root package name */
    public int f39120g;

    /* renamed from: a, reason: collision with root package name */
    public int f39114a = 4096;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f39115b = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public C4712d[] f39117d = new C4712d[8];

    /* renamed from: e, reason: collision with root package name */
    public int f39118e = 7;

    public C4713e(u uVar) {
        this.f39116c = u8.b.b(uVar);
    }

    public final int a(int i) {
        int i4;
        int i9 = 0;
        if (i > 0) {
            int length = this.f39117d.length;
            while (true) {
                length--;
                i4 = this.f39118e;
                if (length < i4 || i <= 0) {
                    break;
                }
                C4712d c4712d = this.f39117d[length];
                kotlin.jvm.internal.h.b(c4712d);
                int i10 = c4712d.f39113c;
                i -= i10;
                this.f39120g -= i10;
                this.f39119f--;
                i9++;
            }
            C4712d[] c4712dArr = this.f39117d;
            System.arraycopy(c4712dArr, i4 + 1, c4712dArr, i4 + 1 + i9, this.f39119f);
            this.f39118e += i9;
        }
        return i9;
    }

    public final u8.h b(int i) {
        if (i >= 0) {
            C4712d[] c4712dArr = g.f39129a;
            if (i <= c4712dArr.length - 1) {
                return c4712dArr[i].f39111a;
            }
        }
        int length = this.f39118e + 1 + (i - g.f39129a.length);
        if (length >= 0) {
            C4712d[] c4712dArr2 = this.f39117d;
            if (length < c4712dArr2.length) {
                C4712d c4712d = c4712dArr2[length];
                kotlin.jvm.internal.h.b(c4712d);
                return c4712d.f39111a;
            }
        }
        throw new IOException("Header index too large " + (i + 1));
    }

    public final void c(C4712d c4712d) {
        this.f39115b.add(c4712d);
        int i = this.f39114a;
        int i4 = c4712d.f39113c;
        if (i4 > i) {
            C4712d[] c4712dArr = this.f39117d;
            AbstractC4978i.M(c4712dArr, 0, c4712dArr.length);
            this.f39118e = this.f39117d.length - 1;
            this.f39119f = 0;
            this.f39120g = 0;
            return;
        }
        a((this.f39120g + i4) - i);
        int i9 = this.f39119f + 1;
        C4712d[] c4712dArr2 = this.f39117d;
        if (i9 > c4712dArr2.length) {
            C4712d[] c4712dArr3 = new C4712d[c4712dArr2.length * 2];
            System.arraycopy(c4712dArr2, 0, c4712dArr3, c4712dArr2.length, c4712dArr2.length);
            this.f39118e = this.f39117d.length - 1;
            this.f39117d = c4712dArr3;
        }
        int i10 = this.f39118e;
        this.f39118e = i10 - 1;
        this.f39117d[i10] = c4712d;
        this.f39119f++;
        this.f39120g += i4;
    }

    public final u8.h d() {
        int i;
        u8.r source = this.f39116c;
        byte j9 = source.j();
        byte[] bArr = f8.c.f37814a;
        int i4 = j9 & 255;
        int i9 = 0;
        boolean z8 = (j9 & com.anythink.core.common.s.a.c.f16474a) == 128;
        long e6 = e(i4, com.anythink.expressad.video.module.a.a.f21886R);
        if (!z8) {
            return source.k(e6);
        }
        u8.e eVar = new u8.e();
        int[] iArr = B.f39089a;
        kotlin.jvm.internal.h.e(source, "source");
        K2.o oVar = B.f39091c;
        K2.o oVar2 = oVar;
        int i10 = 0;
        for (long j10 = 0; j10 < e6; j10++) {
            byte j11 = source.j();
            byte[] bArr2 = f8.c.f37814a;
            i9 = (i9 << 8) | (j11 & 255);
            i10 += 8;
            while (i10 >= 8) {
                int i11 = (i9 >>> (i10 - 8)) & com.anythink.basead.exoplayer.k.p.f8630b;
                K2.o[] oVarArr = (K2.o[]) oVar2.f1610c;
                kotlin.jvm.internal.h.b(oVarArr);
                oVar2 = oVarArr[i11];
                kotlin.jvm.internal.h.b(oVar2);
                if (((K2.o[]) oVar2.f1610c) == null) {
                    eVar.X(oVar2.f1608a);
                    i10 -= oVar2.f1609b;
                    oVar2 = oVar;
                } else {
                    i10 -= 8;
                }
            }
        }
        while (i10 > 0) {
            int i12 = (i9 << (8 - i10)) & com.anythink.basead.exoplayer.k.p.f8630b;
            K2.o[] oVarArr2 = (K2.o[]) oVar2.f1610c;
            kotlin.jvm.internal.h.b(oVarArr2);
            K2.o oVar3 = oVarArr2[i12];
            kotlin.jvm.internal.h.b(oVar3);
            if (((K2.o[]) oVar3.f1610c) != null || (i = oVar3.f1609b) > i10) {
                break;
            }
            eVar.X(oVar3.f1608a);
            i10 -= i;
            oVar2 = oVar;
        }
        return eVar.B(eVar.f41277u);
    }

    public final int e(int i, int i4) {
        int i9 = i & i4;
        if (i9 < i4) {
            return i9;
        }
        int i10 = 0;
        while (true) {
            byte j9 = this.f39116c.j();
            byte[] bArr = f8.c.f37814a;
            int i11 = j9 & 255;
            if ((j9 & com.anythink.core.common.s.a.c.f16474a) == 0) {
                return i4 + (i11 << i10);
            }
            i4 += (j9 & Byte.MAX_VALUE) << i10;
            i10 += 7;
        }
    }
}
