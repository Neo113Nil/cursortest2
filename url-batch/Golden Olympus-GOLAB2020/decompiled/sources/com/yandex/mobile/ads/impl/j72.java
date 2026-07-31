package com.yandex.mobile.ads.impl;

import android.text.SpannableStringBuilder;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import java.util.ArrayDeque;
import java.util.Map;

/* loaded from: classes3.dex */
final class j72 {
    public static void a(SpannableStringBuilder spannableStringBuilder, int i4, int i5, k72 k72Var, h72 h72Var, Map map, int i6) {
        h72 h72Var2;
        if (k72Var.k() != -1) {
            spannableStringBuilder.setSpan(new StyleSpan(k72Var.k()), i4, i5, 33);
        }
        if (k72Var.q()) {
            spannableStringBuilder.setSpan(new StrikethroughSpan(), i4, i5, 33);
        }
        if (k72Var.r()) {
            spannableStringBuilder.setSpan(new UnderlineSpan(), i4, i5, 33);
        }
        if (k72Var.p()) {
            d12.a(spannableStringBuilder, new ForegroundColorSpan(k72Var.b()), i4, i5);
        }
        if (k72Var.o()) {
            d12.a(spannableStringBuilder, new BackgroundColorSpan(k72Var.a()), i4, i5);
        }
        if (k72Var.c() != null) {
            d12.a(spannableStringBuilder, new TypefaceSpan(k72Var.c()), i4, i5);
        }
        if (k72Var.n() != null) {
            k72Var.n().getClass();
            d12.a(spannableStringBuilder, new g42(), i4, i5);
        }
        int i7 = k72Var.i();
        if (i7 == 2) {
            while (true) {
                h72Var2 = null;
                if (h72Var == null) {
                    h72Var = null;
                    break;
                }
                k72 a4 = a(h72Var.f26657f, h72Var.c(), map);
                if (a4 != null && a4.i() == 1) {
                    break;
                } else {
                    h72Var = h72Var.f26661j;
                }
            }
            if (h72Var != null) {
                ArrayDeque arrayDeque = new ArrayDeque();
                arrayDeque.push(h72Var);
                while (true) {
                    if (arrayDeque.isEmpty()) {
                        break;
                    }
                    h72 h72Var3 = (h72) arrayDeque.pop();
                    k72 a5 = a(h72Var3.f26657f, h72Var3.c(), map);
                    if (a5 != null && a5.i() == 3) {
                        h72Var2 = h72Var3;
                        break;
                    }
                    for (int a6 = h72Var3.a() - 1; a6 >= 0; a6--) {
                        arrayDeque.push(h72Var3.a(a6));
                    }
                }
                if (h72Var2 != null) {
                    if (h72Var2.a() != 1 || h72Var2.a(0).f26653b == null) {
                        ms0.c("TtmlRenderUtil", "Skipping rubyText node without exactly one text child.");
                    } else {
                        String str = h72Var2.a(0).f26653b;
                        int i8 = u82.f32873a;
                        k72 a7 = a(h72Var2.f26657f, h72Var2.c(), map);
                        if (a7 == null || a7.h() == -1) {
                            a(h72Var.f26657f, h72Var.c(), map);
                        }
                        spannableStringBuilder.setSpan(new ts1(), i4, i5, 33);
                    }
                }
            }
        } else if (i7 == 3 || i7 == 4) {
            spannableStringBuilder.setSpan(new o00(), i4, i5, 33);
        }
        if (k72Var.m()) {
            d12.a(spannableStringBuilder, new nf0(), i4, i5);
        }
        int e4 = k72Var.e();
        if (e4 == 1) {
            d12.a(spannableStringBuilder, new AbsoluteSizeSpan((int) k72Var.d(), true), i4, i5);
        } else if (e4 == 2) {
            d12.a(spannableStringBuilder, new RelativeSizeSpan(k72Var.d()), i4, i5);
        } else {
            if (e4 != 3) {
                return;
            }
            d12.a(spannableStringBuilder, new RelativeSizeSpan(k72Var.d() / 100.0f), i4, i5);
        }
    }

    public static k72 a(k72 k72Var, String[] strArr, Map<String, k72> map) {
        int i4 = 0;
        if (k72Var == null) {
            if (strArr == null) {
                return null;
            }
            if (strArr.length == 1) {
                return map.get(strArr[0]);
            }
            if (strArr.length > 1) {
                k72 k72Var2 = new k72();
                int length = strArr.length;
                while (i4 < length) {
                    k72Var2.a(map.get(strArr[i4]));
                    i4++;
                }
                return k72Var2;
            }
        } else {
            if (strArr != null && strArr.length == 1) {
                return k72Var.a(map.get(strArr[0]));
            }
            if (strArr != null && strArr.length > 1) {
                int length2 = strArr.length;
                while (i4 < length2) {
                    k72Var.a(map.get(strArr[i4]));
                    i4++;
                }
            }
        }
        return k72Var;
    }
}
