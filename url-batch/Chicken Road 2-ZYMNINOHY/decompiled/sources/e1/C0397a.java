package e1;

import T.E;
import V0.l;
import W.InterfaceC0113f;
import W.J;
import W.u;
import a.AbstractC0124a;
import java.io.EOFException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.regex.Pattern;
import y0.AbstractC1569a;
import y0.o;

/* renamed from: e1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0397a implements l {

    /* renamed from: a, reason: collision with root package name */
    public final u f8417a;

    public C0397a(int i4) {
        switch (i4) {
            case 1:
                this.f8417a = new u(10);
                break;
            default:
                this.f8417a = new u();
                break;
        }
    }

    @Override // V0.l
    public void b(byte[] bArr, int i4, int i5, V0.k kVar, InterfaceC0113f interfaceC0113f) {
        V.b a3;
        u uVar = this.f8417a;
        uVar.K(i4 + i5, bArr);
        uVar.M(i4);
        ArrayList arrayList = new ArrayList();
        while (uVar.a() > 0) {
            AbstractC0124a.g("Incomplete Mp4Webvtt Top Level box header found.", uVar.a() >= 8);
            int m4 = uVar.m();
            if (uVar.m() == 1987343459) {
                int i6 = m4 - 8;
                CharSequence charSequence = null;
                V.a aVar = null;
                while (i6 > 0) {
                    AbstractC0124a.g("Incomplete vtt cue box header found.", i6 >= 8);
                    int m5 = uVar.m();
                    int m6 = uVar.m();
                    int i7 = m5 - 8;
                    byte[] bArr2 = uVar.f3351a;
                    int i8 = uVar.f3352b;
                    String str = J.f3263a;
                    String str2 = new String(bArr2, i8, i7, StandardCharsets.UTF_8);
                    uVar.N(i7);
                    i6 = (i6 - 8) - i7;
                    if (m6 == 1937011815) {
                        C0404h c0404h = new C0404h();
                        AbstractC0405i.e(str2, c0404h);
                        aVar = c0404h.a();
                    } else if (m6 == 1885436268) {
                        charSequence = AbstractC0405i.f(null, str2.trim(), Collections.EMPTY_LIST);
                    }
                }
                if (charSequence == null) {
                    charSequence = "";
                }
                if (aVar != null) {
                    aVar.f3115a = charSequence;
                    aVar.f3116b = null;
                    a3 = aVar.a();
                } else {
                    Pattern pattern = AbstractC0405i.f8460a;
                    C0404h c0404h2 = new C0404h();
                    c0404h2.f8451c = charSequence;
                    a3 = c0404h2.a().a();
                }
                arrayList.add(a3);
            } else {
                uVar.N(m4 - 8);
            }
        }
        interfaceC0113f.accept(new V0.a(-9223372036854775807L, -9223372036854775807L, arrayList));
    }

    @Override // V0.l
    public int c() {
        return 2;
    }

    public E d(o oVar, D0.d dVar, int i4) {
        E e4 = null;
        int i5 = 0;
        loop0: while (true) {
            int i6 = 0;
            do {
                int i7 = i6 % 10;
                int i8 = i7 + 10;
                u uVar = this.f8417a;
                if (i7 == 0 && i6 != 0) {
                    byte[] bArr = uVar.f3351a;
                    System.arraycopy(bArr, 10, bArr, 0, 9);
                }
                int i9 = i6 == 0 ? 10 : 1;
                try {
                    oVar.E(uVar.f3351a, i8 - i9, i9);
                    uVar.M(i7);
                    uVar.L(i8);
                    if (uVar.a() < 3) {
                        throw new IndexOutOfBoundsException("position=" + uVar.f3352b + ", limit=" + uVar.f3353c);
                    }
                    int C4 = uVar.C();
                    int i10 = uVar.f3352b - 3;
                    uVar.f3352b = i10;
                    if (C4 != 4801587) {
                        if (AbstractC1569a.k(uVar.i()) != -1) {
                            break loop0;
                        }
                        if (i6 == 0) {
                            uVar.c(20);
                        }
                        i6++;
                    } else {
                        uVar.N(6);
                        int y4 = uVar.y();
                        int i11 = y4 + 10;
                        if (e4 == null) {
                            byte[] bArr2 = new byte[i11];
                            System.arraycopy(uVar.f3351a, i10, bArr2, 0, 10);
                            oVar.E(bArr2, 10, y4);
                            e4 = new M0.h(dVar).H(i11, bArr2);
                        } else {
                            oVar.o(y4);
                        }
                        i5 += i11;
                    }
                } catch (EOFException unused) {
                }
            } while (i6 <= i4);
        }
        oVar.u();
        oVar.o(i5);
        return e4;
    }
}
