package com.yandex.mobile.ads.impl;

import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import com.yandex.mobile.ads.impl.uu;
import java.util.List;
import kotlin.KotlinVersion;

/* loaded from: classes3.dex */
public final class m72 extends jy1 {

    /* renamed from: m, reason: collision with root package name */
    private final sf1 f28928m = new sf1();

    /* renamed from: n, reason: collision with root package name */
    private final boolean f28929n;

    /* renamed from: o, reason: collision with root package name */
    private final int f28930o;

    /* renamed from: p, reason: collision with root package name */
    private final int f28931p;

    /* renamed from: q, reason: collision with root package name */
    private final String f28932q;

    /* renamed from: r, reason: collision with root package name */
    private final float f28933r;

    /* renamed from: s, reason: collision with root package name */
    private final int f28934s;

    public m72(List<byte[]> list) {
        if (list.size() != 1 || (list.get(0).length != 48 && list.get(0).length != 53)) {
            this.f28930o = 0;
            this.f28931p = -1;
            this.f28932q = "sans-serif";
            this.f28929n = false;
            this.f28933r = 0.85f;
            this.f28934s = -1;
            return;
        }
        byte[] bArr = list.get(0);
        this.f28930o = bArr[24];
        this.f28931p = ((bArr[26] & 255) << 24) | ((bArr[27] & 255) << 16) | ((bArr[28] & 255) << 8) | (bArr[29] & 255);
        this.f28932q = "Serif".equals(u82.a(bArr, 43, bArr.length - 43)) ? "serif" : "sans-serif";
        int i4 = bArr[25] * 20;
        this.f28934s = i4;
        boolean z4 = (bArr[0] & 32) != 0;
        this.f28929n = z4;
        if (z4) {
            this.f28933r = u82.a(((bArr[11] & 255) | ((bArr[10] & 255) << 8)) / i4);
        } else {
            this.f28933r = 0.85f;
        }
    }

    private static void a(SpannableStringBuilder spannableStringBuilder, int i4, int i5, int i6, int i7, int i8) {
        if (i4 != i5) {
            int i9 = i8 | 33;
            boolean z4 = (i4 & 1) != 0;
            boolean z5 = (i4 & 2) != 0;
            if (z4) {
                if (z5) {
                    spannableStringBuilder.setSpan(new StyleSpan(3), i6, i7, i9);
                } else {
                    spannableStringBuilder.setSpan(new StyleSpan(1), i6, i7, i9);
                }
            } else if (z5) {
                spannableStringBuilder.setSpan(new StyleSpan(2), i6, i7, i9);
            }
            boolean z6 = (i4 & 4) != 0;
            if (z6) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), i6, i7, i9);
            }
            if (z6 || z4 || z5) {
                return;
            }
            spannableStringBuilder.setSpan(new StyleSpan(0), i6, i7, i9);
        }
    }

    @Override // com.yandex.mobile.ads.impl.jy1
    protected final c32 a(byte[] bArr, int i4, boolean z4) {
        String a4;
        char f4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9 = 1;
        int i10 = 8;
        this.f28928m.a(i4, bArr);
        sf1 sf1Var = this.f28928m;
        int i11 = 2;
        if (sf1Var.a() >= 2) {
            int z5 = sf1Var.z();
            if (z5 == 0) {
                a4 = "";
            } else if (sf1Var.a() >= 2 && ((f4 = sf1Var.f()) == 65279 || f4 == 65534)) {
                a4 = sf1Var.a(z5, un.f33185e);
            } else {
                a4 = sf1Var.a(z5, un.f33183c);
            }
            if (a4.isEmpty()) {
                return n72.f29467c;
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(a4);
            a(spannableStringBuilder, this.f28930o, 0, 0, spannableStringBuilder.length(), 16711680);
            int i12 = this.f28931p;
            int length = spannableStringBuilder.length();
            int i13 = 0;
            if (i12 != -1) {
                spannableStringBuilder.setSpan(new ForegroundColorSpan((i12 >>> 8) | ((i12 & KotlinVersion.MAX_COMPONENT_VALUE) << 24)), 0, length, 16711713);
            }
            String str = this.f28932q;
            int length2 = spannableStringBuilder.length();
            if (str != "sans-serif") {
                spannableStringBuilder.setSpan(new TypefaceSpan(str), 0, length2, 16711713);
            }
            float f5 = this.f28933r;
            while (this.f28928m.a() >= i10) {
                int d4 = this.f28928m.d();
                int h4 = this.f28928m.h();
                int h5 = this.f28928m.h();
                if (h5 == 1937013100) {
                    if (this.f28928m.a() >= i11) {
                        int z6 = this.f28928m.z();
                        int i14 = i13;
                        while (i14 < z6) {
                            sf1 sf1Var2 = this.f28928m;
                            if (sf1Var2.a() >= 12) {
                                int z7 = sf1Var2.z();
                                int z8 = sf1Var2.z();
                                sf1Var2.f(i11);
                                int i15 = i14;
                                int t4 = sf1Var2.t();
                                sf1Var2.f(i9);
                                int h6 = sf1Var2.h();
                                int i16 = i9;
                                int i17 = i10;
                                if (z8 > spannableStringBuilder.length()) {
                                    ms0.d("Tx3gDecoder", "Truncating styl end (" + z8 + ") to cueText.length() (" + spannableStringBuilder.length() + ").");
                                    z8 = spannableStringBuilder.length();
                                }
                                if (z7 >= z8) {
                                    ms0.d("Tx3gDecoder", "Ignoring styl with start (" + z7 + ") >= end (" + z8 + ").");
                                    i8 = i15;
                                } else {
                                    i8 = i15;
                                    a(spannableStringBuilder, t4, this.f28930o, z7, z8, 0);
                                    if (h6 != this.f28931p) {
                                        spannableStringBuilder.setSpan(new ForegroundColorSpan((h6 >>> 8) | ((h6 & KotlinVersion.MAX_COMPONENT_VALUE) << 24)), z7, z8, 33);
                                    }
                                }
                                i14 = i8 + 1;
                                i9 = i16;
                                i10 = i17;
                                i11 = 2;
                            } else {
                                throw new e32("Unexpected subtitle format.");
                            }
                        }
                        i5 = i9;
                        i6 = i10;
                        i7 = i11;
                    } else {
                        throw new e32("Unexpected subtitle format.");
                    }
                } else {
                    i5 = i9;
                    i6 = i10;
                    if (h5 == 1952608120 && this.f28929n) {
                        i7 = 2;
                        if (this.f28928m.a() >= 2) {
                            int i18 = u82.f32873a;
                            f5 = Math.max(0.0f, Math.min(this.f28928m.z() / this.f28934s, 0.95f));
                        } else {
                            throw new e32("Unexpected subtitle format.");
                        }
                    } else {
                        i7 = 2;
                    }
                }
                this.f28928m.e(d4 + h4);
                i9 = i5;
                i11 = i7;
                i10 = i6;
                i13 = 0;
            }
            return new n72(new uu.a().a(spannableStringBuilder).a(0, f5).a(0).a());
        }
        throw new e32("Unexpected subtitle format.");
    }
}
