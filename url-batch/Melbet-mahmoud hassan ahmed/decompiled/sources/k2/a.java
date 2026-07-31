package k2;

import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import c2.b;
import c2.g;
import c2.h;
import c2.j;
import java.util.List;
import l4.d;
import o2.a0;
import o2.m0;
import o2.r;

/* loaded from: classes.dex */
public final class a extends g {

    /* renamed from: o, reason: collision with root package name */
    private final a0 f18207o;

    /* renamed from: p, reason: collision with root package name */
    private final boolean f18208p;

    /* renamed from: q, reason: collision with root package name */
    private final int f18209q;

    /* renamed from: r, reason: collision with root package name */
    private final int f18210r;

    /* renamed from: s, reason: collision with root package name */
    private final String f18211s;

    /* renamed from: t, reason: collision with root package name */
    private final float f18212t;

    /* renamed from: u, reason: collision with root package name */
    private final int f18213u;

    public a(List<byte[]> list) {
        super("Tx3gDecoder");
        this.f18207o = new a0();
        if (list.size() != 1 || (list.get(0).length != 48 && list.get(0).length != 53)) {
            this.f18209q = 0;
            this.f18210r = -1;
            this.f18211s = "sans-serif";
            this.f18208p = false;
            this.f18212t = 0.85f;
            this.f18213u = -1;
            return;
        }
        byte[] bArr = list.get(0);
        this.f18209q = bArr[24];
        this.f18210r = ((bArr[26] & 255) << 24) | ((bArr[27] & 255) << 16) | ((bArr[28] & 255) << 8) | (bArr[29] & 255);
        this.f18211s = "Serif".equals(m0.E(bArr, 43, bArr.length - 43)) ? "serif" : "sans-serif";
        int i7 = bArr[25] * 20;
        this.f18213u = i7;
        boolean z6 = (bArr[0] & 32) != 0;
        this.f18208p = z6;
        if (z6) {
            this.f18212t = m0.p(((bArr[11] & 255) | ((bArr[10] & 255) << 8)) / i7, 0.0f, 0.95f);
        } else {
            this.f18212t = 0.85f;
        }
    }

    private void C(a0 a0Var, SpannableStringBuilder spannableStringBuilder) {
        int i7;
        D(a0Var.a() >= 12);
        int I = a0Var.I();
        int I2 = a0Var.I();
        a0Var.P(2);
        int C = a0Var.C();
        a0Var.P(1);
        int m7 = a0Var.m();
        if (I2 > spannableStringBuilder.length()) {
            r.i("Tx3gDecoder", "Truncating styl end (" + I2 + ") to cueText.length() (" + spannableStringBuilder.length() + ").");
            i7 = spannableStringBuilder.length();
        } else {
            i7 = I2;
        }
        if (I < i7) {
            int i8 = i7;
            F(spannableStringBuilder, C, this.f18209q, I, i8, 0);
            E(spannableStringBuilder, m7, this.f18210r, I, i8, 0);
            return;
        }
        r.i("Tx3gDecoder", "Ignoring styl with start (" + I + ") >= end (" + i7 + ").");
    }

    private static void D(boolean z6) {
        if (!z6) {
            throw new j("Unexpected subtitle format.");
        }
    }

    private static void E(SpannableStringBuilder spannableStringBuilder, int i7, int i8, int i9, int i10, int i11) {
        if (i7 != i8) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan((i7 >>> 8) | ((i7 & 255) << 24)), i9, i10, i11 | 33);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void F(SpannableStringBuilder spannableStringBuilder, int i7, int i8, int i9, int i10, int i11) {
        StyleSpan styleSpan;
        boolean z6;
        if (i7 != i8) {
            int i12 = i11 | 33;
            boolean z7 = (i7 & 1) != 0;
            boolean z8 = (i7 & 2) != 0;
            if (!z7) {
                if (z8) {
                    styleSpan = new StyleSpan(2);
                }
                z6 = (i7 & 4) != 0;
                if (z6) {
                    spannableStringBuilder.setSpan(new UnderlineSpan(), i9, i10, i12);
                }
                if (!z6 || z7 || z8) {
                    return;
                }
                spannableStringBuilder.setSpan(new StyleSpan(0), i9, i10, i12);
                return;
            }
            styleSpan = z8 ? new StyleSpan(3) : new StyleSpan(1);
            spannableStringBuilder.setSpan(styleSpan, i9, i10, i12);
            if ((i7 & 4) != 0) {
            }
            if (z6) {
            }
            if (z6) {
            }
        }
    }

    private static void G(SpannableStringBuilder spannableStringBuilder, String str, int i7, int i8) {
        if (str != "sans-serif") {
            spannableStringBuilder.setSpan(new TypefaceSpan(str), i7, i8, 16711713);
        }
    }

    private static String H(a0 a0Var) {
        char g7;
        D(a0Var.a() >= 2);
        int I = a0Var.I();
        if (I == 0) {
            return "";
        }
        return a0Var.A(I, (a0Var.a() < 2 || !((g7 = a0Var.g()) == 65279 || g7 == 65534)) ? d.f18614c : d.f18617f);
    }

    @Override // c2.g
    protected h A(byte[] bArr, int i7, boolean z6) {
        this.f18207o.M(bArr, i7);
        String H = H(this.f18207o);
        if (H.isEmpty()) {
            return b.f18214g;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(H);
        F(spannableStringBuilder, this.f18209q, 0, 0, spannableStringBuilder.length(), 16711680);
        E(spannableStringBuilder, this.f18210r, -1, 0, spannableStringBuilder.length(), 16711680);
        G(spannableStringBuilder, this.f18211s, 0, spannableStringBuilder.length());
        float f7 = this.f18212t;
        while (this.f18207o.a() >= 8) {
            int e7 = this.f18207o.e();
            int m7 = this.f18207o.m();
            int m8 = this.f18207o.m();
            if (m8 == 1937013100) {
                D(this.f18207o.a() >= 2);
                int I = this.f18207o.I();
                for (int i8 = 0; i8 < I; i8++) {
                    C(this.f18207o, spannableStringBuilder);
                }
            } else if (m8 == 1952608120 && this.f18208p) {
                D(this.f18207o.a() >= 2);
                f7 = m0.p(this.f18207o.I() / this.f18213u, 0.0f, 0.95f);
            }
            this.f18207o.O(e7 + m7);
        }
        return new b(new b.C0043b().o(spannableStringBuilder).h(f7, 0).i(0).a());
    }
}
