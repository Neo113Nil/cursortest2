package c1;

import E.AbstractC0005f;
import V.b;
import V0.k;
import V0.l;
import W.AbstractC0108a;
import W.InterfaceC0113f;
import W.J;
import W.u;
import a.AbstractC0124a;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;
import kotlin.KotlinVersion;
import v2.G;
import v2.I;
import v2.a0;

/* renamed from: c1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0283a implements l {

    /* renamed from: a, reason: collision with root package name */
    public final u f5643a = new u();

    /* renamed from: b, reason: collision with root package name */
    public final boolean f5644b;

    /* renamed from: c, reason: collision with root package name */
    public final int f5645c;

    /* renamed from: d, reason: collision with root package name */
    public final int f5646d;

    /* renamed from: e, reason: collision with root package name */
    public final String f5647e;

    /* renamed from: f, reason: collision with root package name */
    public final float f5648f;

    /* renamed from: g, reason: collision with root package name */
    public final int f5649g;

    public C0283a(List list) {
        if (list.size() != 1 || (((byte[]) list.get(0)).length != 48 && ((byte[]) list.get(0)).length != 53)) {
            this.f5645c = 0;
            this.f5646d = -1;
            this.f5647e = "sans-serif";
            this.f5644b = false;
            this.f5648f = 0.85f;
            this.f5649g = -1;
            return;
        }
        byte[] bArr = (byte[]) list.get(0);
        this.f5645c = bArr[24];
        this.f5646d = ((bArr[26] & 255) << 24) | ((bArr[27] & 255) << 16) | ((bArr[28] & 255) << 8) | (bArr[29] & 255);
        this.f5647e = "Serif".equals(new String(bArr, 43, bArr.length - 43, StandardCharsets.UTF_8)) ? "serif" : "sans-serif";
        int i4 = bArr[25] * 20;
        this.f5649g = i4;
        boolean z = (bArr[0] & 32) != 0;
        this.f5644b = z;
        if (z) {
            this.f5648f = J.i(((bArr[11] & 255) | ((bArr[10] & 255) << 8)) / i4, 0.0f, 0.95f);
        } else {
            this.f5648f = 0.85f;
        }
    }

    public static void d(SpannableStringBuilder spannableStringBuilder, int i4, int i5, int i6, int i7, int i8) {
        if (i4 != i5) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan((i4 >>> 8) | ((i4 & KotlinVersion.MAX_COMPONENT_VALUE) << 24)), i6, i7, i8 | 33);
        }
    }

    public static void e(SpannableStringBuilder spannableStringBuilder, int i4, int i5, int i6, int i7, int i8) {
        if (i4 != i5) {
            int i9 = i8 | 33;
            boolean z = (i4 & 1) != 0;
            boolean z4 = (i4 & 2) != 0;
            if (z) {
                if (z4) {
                    spannableStringBuilder.setSpan(new StyleSpan(3), i6, i7, i9);
                } else {
                    spannableStringBuilder.setSpan(new StyleSpan(1), i6, i7, i9);
                }
            } else if (z4) {
                spannableStringBuilder.setSpan(new StyleSpan(2), i6, i7, i9);
            }
            boolean z5 = (i4 & 4) != 0;
            if (z5) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), i6, i7, i9);
            }
            if (z5 || z || z4) {
                return;
            }
            spannableStringBuilder.setSpan(new StyleSpan(0), i6, i7, i9);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // V0.l
    public final void b(byte[] bArr, int i4, int i5, k kVar, InterfaceC0113f interfaceC0113f) {
        String x4;
        int i6;
        int i7;
        u uVar = this.f5643a;
        uVar.K(i4 + i5, bArr);
        uVar.M(i4);
        int i8 = 1;
        int i9 = 0;
        int i10 = 2;
        AbstractC0124a.h(uVar.a() >= 2);
        int G4 = uVar.G();
        if (G4 == 0) {
            x4 = "";
        } else {
            int i11 = uVar.f3352b;
            Charset I4 = uVar.I();
            int i12 = G4 - (uVar.f3352b - i11);
            if (I4 == null) {
                I4 = StandardCharsets.UTF_8;
            }
            x4 = uVar.x(i12, I4);
        }
        if (x4.isEmpty()) {
            G g4 = I.f15571b;
            interfaceC0113f.accept(new V0.a(-9223372036854775807L, -9223372036854775807L, a0.f15605e));
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(x4);
        e(spannableStringBuilder, this.f5645c, 0, 0, spannableStringBuilder.length(), 16711680);
        d(spannableStringBuilder, this.f5646d, -1, 0, spannableStringBuilder.length(), 16711680);
        int length = spannableStringBuilder.length();
        String str = this.f5647e;
        if (str != "sans-serif") {
            spannableStringBuilder.setSpan(new TypefaceSpan(str), 0, length, 16711713);
        }
        float f4 = this.f5648f;
        while (uVar.a() >= 8) {
            int i13 = uVar.f3352b;
            int m4 = uVar.m();
            int m5 = uVar.m();
            if (m5 == 1937013100) {
                AbstractC0124a.h(uVar.a() >= i10 ? i8 : i9);
                int G5 = uVar.G();
                int i14 = i9;
                while (i14 < G5) {
                    AbstractC0124a.h(uVar.a() >= 12 ? i8 : i9);
                    int G6 = uVar.G();
                    int G7 = uVar.G();
                    uVar.N(i10);
                    int i15 = i14;
                    int z = uVar.z();
                    uVar.N(i8);
                    int m6 = uVar.m();
                    if (G7 > spannableStringBuilder.length()) {
                        StringBuilder r4 = AbstractC0005f.r(G7, "Truncating styl end (", ") to cueText.length() (");
                        r4.append(spannableStringBuilder.length());
                        r4.append(").");
                        AbstractC0108a.s("Tx3gParser", r4.toString());
                        G7 = spannableStringBuilder.length();
                    }
                    if (G6 >= G7) {
                        AbstractC0108a.s("Tx3gParser", AbstractC0005f.l("Ignoring styl with start (", G6, ") >= end (", G7, ")."));
                        i7 = i15;
                    } else {
                        i7 = i15;
                        int i16 = G7;
                        e(spannableStringBuilder, z, this.f5645c, G6, i16, 0);
                        d(spannableStringBuilder, m6, this.f5646d, G6, i16, 0);
                    }
                    i14 = i7 + 1;
                    i8 = 1;
                    i9 = 0;
                    i10 = 2;
                }
                i6 = i10;
            } else if (m5 == 1952608120 && this.f5644b) {
                i6 = 2;
                AbstractC0124a.h(uVar.a() >= 2);
                f4 = J.i(uVar.G() / this.f5649g, 0.0f, 0.95f);
            } else {
                i6 = 2;
            }
            uVar.M(i13 + m4);
            i10 = i6;
            i8 = 1;
            i9 = 0;
        }
        interfaceC0113f.accept(new V0.a(-9223372036854775807L, -9223372036854775807L, I.o(new b(spannableStringBuilder, null, null, null, f4, 0, 0, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, false, -16777216, Integer.MIN_VALUE, 0.0f, 0))));
    }

    @Override // V0.l
    public final int c() {
        return 2;
    }
}
