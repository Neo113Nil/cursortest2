package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.View;
import androidx.compose.foundation.a;
import androidx.compose.foundation.layout.b;
import androidx.compose.material3.MinimumInteractiveModifier;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.facebook.internal.NativeProtocol;
import com.facebook.internal.Utility;
import com.majelw.libystne.R;
import defpackage.q13;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.cert.Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.regex.Matcher;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import kotlin.coroutines.h;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.d;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public abstract class ap {
    public static final char[] a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    public static final my b = new my(1791883786, new py(1), false);
    public static final Class[] c = {Serializable.class, Parcelable.class, String.class, SparseArray.class, Binder.class, Size.class, SizeF.class};
    public static final u30 d = new u30(24);
    public static final su e = new su(2);
    public static final StackTraceElement[] f = new StackTraceElement[0];
    public static Method g;
    public static Method h;
    public static boolean i;

    public static final Rect A(TextPaint textPaint, CharSequence charSequence, int i2, int i3) {
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            if (spanned.nextSpanTransition(i2 - 1, i3, MetricAffectingSpan.class) != i3) {
                Rect rect = new Rect();
                Rect rect2 = new Rect();
                TextPaint textPaint2 = new TextPaint();
                while (i2 < i3) {
                    int nextSpanTransition = spanned.nextSpanTransition(i2, i3, MetricAffectingSpan.class);
                    MetricAffectingSpan[] metricAffectingSpanArr = (MetricAffectingSpan[]) spanned.getSpans(i2, nextSpanTransition, MetricAffectingSpan.class);
                    textPaint2.set(textPaint);
                    i0 F = o70.F(metricAffectingSpanArr);
                    while (F.hasNext()) {
                        MetricAffectingSpan metricAffectingSpan = (MetricAffectingSpan) F.next();
                        if (spanned.getSpanStart(metricAffectingSpan) != spanned.getSpanEnd(metricAffectingSpan)) {
                            metricAffectingSpan.updateMeasureState(textPaint2);
                        }
                    }
                    if (Build.VERSION.SDK_INT >= 29) {
                        x6.m(textPaint2, charSequence, i2, nextSpanTransition, rect2);
                    } else {
                        textPaint2.getTextBounds(charSequence.toString(), i2, nextSpanTransition, rect2);
                    }
                    rect.right = rect2.width() + rect.right;
                    rect.top = Math.min(rect.top, rect2.top);
                    rect.bottom = Math.max(rect.bottom, rect2.bottom);
                    i2 = nextSpanTransition;
                }
                return rect;
            }
        }
        Rect rect3 = new Rect();
        if (Build.VERSION.SDK_INT >= 29) {
            x6.m(textPaint, charSequence, i2, i3, rect3);
            return rect3;
        }
        textPaint.getTextBounds(charSequence.toString(), i2, i3, rect3);
        return rect3;
    }

    public static final String[] B(t20 t20Var) {
        t20Var.getClass();
        return (String[]) ((x8) t20Var).b.toArray(new String[0]);
    }

    public static final boolean C(float[] fArr, float[] fArr2) {
        if (fArr.length < 16 || fArr2.length < 16) {
            return false;
        }
        float f2 = fArr[0];
        float f3 = fArr[1];
        float f4 = fArr[2];
        float f5 = fArr[3];
        float f6 = fArr[4];
        float f7 = fArr[5];
        float f8 = fArr[6];
        float f9 = fArr[7];
        float f10 = fArr[8];
        float f11 = fArr[9];
        float f12 = fArr[10];
        float f13 = fArr[11];
        float f14 = fArr[12];
        float f15 = fArr[13];
        float f16 = fArr[14];
        float f17 = fArr[15];
        float f18 = (f2 * f7) - (f3 * f6);
        float f19 = (f2 * f8) - (f4 * f6);
        float f20 = (f2 * f9) - (f5 * f6);
        float f21 = (f3 * f8) - (f4 * f7);
        float f22 = (f3 * f9) - (f5 * f7);
        float f23 = (f4 * f9) - (f5 * f8);
        float f24 = (f10 * f15) - (f11 * f14);
        float f25 = (f10 * f16) - (f12 * f14);
        float f26 = (f10 * f17) - (f13 * f14);
        float f27 = (f11 * f16) - (f12 * f15);
        float f28 = (f11 * f17) - (f13 * f15);
        float f29 = (f12 * f17) - (f13 * f16);
        float f30 = (f23 * f24) + (((f21 * f26) + ((f20 * f27) + ((f18 * f29) - (f19 * f28)))) - (f22 * f25));
        if (f30 != 0.0f) {
            float f31 = 1.0f / f30;
            fArr2[0] = ((f9 * f27) + ((f7 * f29) - (f8 * f28))) * f31;
            fArr2[1] = (((f4 * f28) + ((-f3) * f29)) - (f5 * f27)) * f31;
            fArr2[2] = ((f17 * f21) + ((f15 * f23) - (f16 * f22))) * f31;
            fArr2[3] = (((f12 * f22) + ((-f11) * f23)) - (f13 * f21)) * f31;
            float f32 = -f6;
            fArr2[4] = (((f8 * f26) + (f32 * f29)) - (f9 * f25)) * f31;
            fArr2[5] = ((f5 * f25) + ((f29 * f2) - (f4 * f26))) * f31;
            float f33 = -f14;
            fArr2[6] = (((f16 * f20) + (f33 * f23)) - (f17 * f19)) * f31;
            fArr2[7] = ((f13 * f19) + ((f23 * f10) - (f12 * f20))) * f31;
            fArr2[8] = ((f9 * f24) + ((f6 * f28) - (f7 * f26))) * f31;
            fArr2[9] = (((f26 * f3) + ((-f2) * f28)) - (f5 * f24)) * f31;
            fArr2[10] = ((f17 * f18) + ((f14 * f22) - (f15 * f20))) * f31;
            fArr2[11] = (((f20 * f11) + ((-f10) * f22)) - (f13 * f18)) * f31;
            fArr2[12] = (((f7 * f25) + (f32 * f27)) - (f8 * f24)) * f31;
            fArr2[13] = ((f4 * f24) + ((f2 * f27) - (f3 * f25))) * f31;
            fArr2[14] = (((f15 * f19) + (f33 * f21)) - (f16 * f18)) * f31;
            fArr2[15] = ((f12 * f18) + ((f10 * f21) - (f11 * f19))) * f31;
        }
        return !(f30 == 0.0f);
    }

    public static final boolean D(long j) {
        return (j & 9223372034707292159L) != 9205357640488583168L;
    }

    public static final long E(float f2, long j, long j2) {
        hu1 hu1Var = kw.x;
        long a2 = aw.a(j, hu1Var);
        long a3 = aw.a(j2, hu1Var);
        float d2 = aw.d(a2);
        float h2 = aw.h(a2);
        float g2 = aw.g(a2);
        float e2 = aw.e(a2);
        float d3 = aw.d(a3);
        float h3 = aw.h(a3);
        float g3 = aw.g(a3);
        float e3 = aw.e(a3);
        if (f2 < 0.0f) {
            f2 = 0.0f;
        }
        if (f2 > 1.0f) {
            f2 = 1.0f;
        }
        return aw.a(k(yk3.K(h2, h3, f2), yk3.K(g2, g3, f2), yk3.K(e2, e3, f2), yk3.K(d2, d3, f2), hu1Var), aw.f(j2));
    }

    public static final float F(long j) {
        iw f2 = aw.f(j);
        if (!o70.v(f2.b, 12884901888L)) {
            k21.a("The specified color must be encoded in an RGB color space. The supplied color space is " + ((Object) o70.P(f2.b)));
        }
        la2 la2Var = ((pa2) f2).p;
        double b2 = la2Var.b(aw.h(j));
        float b3 = (float) ((la2Var.b(aw.e(j)) * 0.0722d) + (la2Var.b(aw.g(j)) * 0.7152d) + (b2 * 0.2126d));
        if (b3 < 0.0f) {
            b3 = 0.0f;
        }
        if (b3 > 1.0f) {
            return 1.0f;
        }
        return b3;
    }

    public static final int G(yg2 yg2Var, int i2) {
        int i3;
        int[] iArr = yg2Var.r;
        int i4 = i2 + 1;
        int length = yg2Var.q.length;
        iArr.getClass();
        int i5 = length - 1;
        int i6 = 0;
        while (true) {
            if (i6 <= i5) {
                i3 = (i6 + i5) >>> 1;
                int i7 = iArr[i3];
                if (i7 >= i4) {
                    if (i7 <= i4) {
                        break;
                    }
                    i5 = i3 - 1;
                } else {
                    i6 = i3 + 1;
                }
            } else {
                i3 = (-i6) - 1;
                break;
            }
        }
        return i3 >= 0 ? i3 : ~i3;
    }

    public static final int H(long j) {
        float[] fArr = kw.a;
        long a2 = aw.a(j, kw.e) >>> 32;
        q13.a aVar = q13.m;
        return (int) a2;
    }

    public static void I(ad1 ad1Var, wd2 wd2Var) {
        zc1 b2 = ad1Var.b();
        if (b2 == zc1.n || b2.compareTo(zc1.p) >= 0) {
            wd2Var.d();
        } else {
            ad1Var.a(new n80(ad1Var, wd2Var));
        }
    }

    public static final int J(float f2, float[] fArr, int i2) {
        float f3 = f2 >= 0.0f ? f2 : 0.0f;
        if (f3 > 1.0f) {
            f3 = 1.0f;
        }
        if (Math.abs(f3 - f2) > 1.05E-6f) {
            f3 = Float.NaN;
        }
        fArr[i2] = f3;
        return !Float.isNaN(f3) ? 1 : 0;
    }

    public static final void a(vl1 vl1Var, a00 a00Var, int i2) {
        a00Var.Z(-1375361188);
        int i3 = i2 | 6;
        int i4 = 0;
        if (a00Var.P(i3 & 1, (i3 & 3) != 2)) {
            ph1.a(6, a00Var);
            vl1Var = sl1.a;
        } else {
            a00Var.S();
        }
        n72 s = a00Var.s();
        if (s != null) {
            s.d = new qh(vl1Var, i2, i4);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0179  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final long b(float f2, float f3, float f4, float f5, iw iwVar) {
        int i2;
        int i3;
        int i4;
        float b2;
        float a2;
        int i5;
        int i6;
        int i7;
        int i8;
        float b3;
        float a3;
        int i9;
        int i10;
        int i11;
        if (iwVar.c()) {
            float f6 = f5 < 0.0f ? 0.0f : f5;
            if (f6 > 1.0f) {
                f6 = 1.0f;
            }
            int i12 = ((int) ((f6 * 255.0f) + 0.5f)) << 24;
            float f7 = f2 < 0.0f ? 0.0f : f2;
            if (f7 > 1.0f) {
                f7 = 1.0f;
            }
            int i13 = i12 | (((int) ((f7 * 255.0f) + 0.5f)) << 16);
            float f8 = f3 < 0.0f ? 0.0f : f3;
            if (f8 > 1.0f) {
                f8 = 1.0f;
            }
            int i14 = i13 | (((int) ((f8 * 255.0f) + 0.5f)) << 8);
            float f9 = f4 >= 0.0f ? f4 : 0.0f;
            float f10 = f9 <= 1.0f ? f9 : 1.0f;
            q13.a aVar = q13.m;
            long j = (i14 | ((int) ((f10 * 255.0f) + 0.5f))) << 32;
            int i15 = aw.h;
            return j;
        }
        if (((int) (iwVar.b >> 32)) != 3) {
            k21.a("Color only works with ColorSpaces with 3 components");
        }
        int i16 = iwVar.c;
        if (i16 == -1) {
            k21.a("Unknown color space, please use a color space in ColorSpaces");
        }
        float b4 = iwVar.b(0);
        float a4 = iwVar.a(0);
        if (f2 >= b4) {
            b4 = f2;
        }
        if (b4 <= a4) {
            a4 = b4;
        }
        int floatToRawIntBits = Float.floatToRawIntBits(a4);
        int i17 = floatToRawIntBits >>> 31;
        int i18 = (floatToRawIntBits >>> 23) & 255;
        int i19 = floatToRawIntBits & 8388607;
        if (i18 == 255) {
            i3 = i19 != 0 ? 512 : 0;
            i2 = 31;
        } else {
            i2 = i18 - 112;
            if (i2 >= 31) {
                i3 = 0;
                i2 = 49;
            } else if (i2 > 0) {
                int i20 = i19 >> 13;
                if ((floatToRawIntBits & 4096) != 0) {
                    i4 = (((i2 << 10) | i20) + 1) | (i17 << 15);
                    short s = (short) i4;
                    b2 = iwVar.b(1);
                    a2 = iwVar.a(1);
                    if (f3 >= b2) {
                        b2 = f3;
                    }
                    if (b2 <= a2) {
                        a2 = b2;
                    }
                    int floatToRawIntBits2 = Float.floatToRawIntBits(a2);
                    int i21 = floatToRawIntBits2 >>> 31;
                    i5 = (floatToRawIntBits2 >>> 23) & 255;
                    int i22 = floatToRawIntBits2 & 8388607;
                    if (i5 != 255) {
                        i7 = i22 != 0 ? 512 : 0;
                        i6 = 31;
                    } else {
                        i6 = i5 - 112;
                        if (i6 >= 31) {
                            i7 = 0;
                            i6 = 49;
                        } else if (i6 > 0) {
                            int i23 = i22 >> 13;
                            if ((floatToRawIntBits2 & 4096) != 0) {
                                i8 = (((i6 << 10) | i23) + 1) | (i21 << 15);
                                short s2 = (short) i8;
                                b3 = iwVar.b(2);
                                a3 = iwVar.a(2);
                                if (f4 >= b3) {
                                    b3 = f4;
                                }
                                if (b3 <= a3) {
                                    a3 = b3;
                                }
                                int floatToRawIntBits3 = Float.floatToRawIntBits(a3);
                                int i24 = floatToRawIntBits3 >>> 31;
                                i9 = (floatToRawIntBits3 >>> 23) & 255;
                                int i25 = 8388607 & floatToRawIntBits3;
                                if (i9 == 255) {
                                    i10 = i25 != 0 ? 512 : 0;
                                    r7 = 31;
                                } else {
                                    int i26 = i9 - 112;
                                    if (i26 >= 31) {
                                        i10 = 0;
                                        r7 = 49;
                                    } else if (i26 > 0) {
                                        int i27 = i25 >> 13;
                                        if ((floatToRawIntBits3 & 4096) != 0) {
                                            i11 = (((i26 << 10) | i27) + 1) | (i24 << 15);
                                            long j2 = (i16 & 63) | ((s & 65535) << 48) | ((s2 & 65535) << 32) | ((65535 & ((short) i11)) << 16) | ((((int) ((((f5 >= 0.0f ? f5 : 0.0f) <= 1.0f ? r6 : 1.0f) * 1023.0f) + 0.5f)) & 1023) << 6);
                                            q13.a aVar2 = q13.m;
                                            int i28 = aw.h;
                                            return j2;
                                        }
                                        i10 = i27;
                                        r7 = i26;
                                    } else if (i26 >= -10) {
                                        int i29 = (i25 | 8388608) >> (1 - i26);
                                        if ((i29 & 4096) != 0) {
                                            i29 += Utility.DEFAULT_STREAM_BUFFER_SIZE;
                                        }
                                        i10 = i29 >> 13;
                                    } else {
                                        i10 = 0;
                                    }
                                }
                                i11 = i10 | (i24 << 15) | (r7 << 10);
                                if (f5 >= 0.0f) {
                                }
                                long j22 = (i16 & 63) | ((s & 65535) << 48) | ((s2 & 65535) << 32) | ((65535 & ((short) i11)) << 16) | ((((int) ((((f5 >= 0.0f ? f5 : 0.0f) <= 1.0f ? r6 : 1.0f) * 1023.0f) + 0.5f)) & 1023) << 6);
                                q13.a aVar22 = q13.m;
                                int i282 = aw.h;
                                return j22;
                            }
                            i7 = i23;
                        } else if (i6 >= -10) {
                            int i30 = (i22 | 8388608) >> (1 - i6);
                            if ((i30 & 4096) != 0) {
                                i30 += Utility.DEFAULT_STREAM_BUFFER_SIZE;
                            }
                            i7 = i30 >> 13;
                            i6 = 0;
                        } else {
                            i7 = 0;
                            i6 = 0;
                        }
                    }
                    i8 = i7 | (i21 << 15) | (i6 << 10);
                    short s22 = (short) i8;
                    b3 = iwVar.b(2);
                    a3 = iwVar.a(2);
                    if (f4 >= b3) {
                    }
                    if (b3 <= a3) {
                    }
                    int floatToRawIntBits32 = Float.floatToRawIntBits(a3);
                    int i242 = floatToRawIntBits32 >>> 31;
                    i9 = (floatToRawIntBits32 >>> 23) & 255;
                    int i252 = 8388607 & floatToRawIntBits32;
                    if (i9 == 255) {
                    }
                    i11 = i10 | (i242 << 15) | (r7 << 10);
                    if (f5 >= 0.0f) {
                    }
                    long j222 = (i16 & 63) | ((s & 65535) << 48) | ((s22 & 65535) << 32) | ((65535 & ((short) i11)) << 16) | ((((int) ((((f5 >= 0.0f ? f5 : 0.0f) <= 1.0f ? r6 : 1.0f) * 1023.0f) + 0.5f)) & 1023) << 6);
                    q13.a aVar222 = q13.m;
                    int i2822 = aw.h;
                    return j222;
                }
                i3 = i20;
            } else if (i2 >= -10) {
                int i31 = (i19 | 8388608) >> (1 - i2);
                if ((i31 & 4096) != 0) {
                    i31 += Utility.DEFAULT_STREAM_BUFFER_SIZE;
                }
                i3 = i31 >> 13;
                i2 = 0;
            } else {
                i3 = 0;
                i2 = 0;
            }
        }
        i4 = i3 | (i17 << 15) | (i2 << 10);
        short s3 = (short) i4;
        b2 = iwVar.b(1);
        a2 = iwVar.a(1);
        if (f3 >= b2) {
        }
        if (b2 <= a2) {
        }
        int floatToRawIntBits22 = Float.floatToRawIntBits(a2);
        int i212 = floatToRawIntBits22 >>> 31;
        i5 = (floatToRawIntBits22 >>> 23) & 255;
        int i222 = floatToRawIntBits22 & 8388607;
        if (i5 != 255) {
        }
        i8 = i7 | (i212 << 15) | (i6 << 10);
        short s222 = (short) i8;
        b3 = iwVar.b(2);
        a3 = iwVar.a(2);
        if (f4 >= b3) {
        }
        if (b3 <= a3) {
        }
        int floatToRawIntBits322 = Float.floatToRawIntBits(a3);
        int i2422 = floatToRawIntBits322 >>> 31;
        i9 = (floatToRawIntBits322 >>> 23) & 255;
        int i2522 = 8388607 & floatToRawIntBits322;
        if (i9 == 255) {
        }
        i11 = i10 | (i2422 << 15) | (r7 << 10);
        if (f5 >= 0.0f) {
        }
        long j2222 = (i16 & 63) | ((s3 & 65535) << 48) | ((s222 & 65535) << 32) | ((65535 & ((short) i11)) << 16) | ((((int) ((((f5 >= 0.0f ? f5 : 0.0f) <= 1.0f ? r6 : 1.0f) * 1023.0f) + 0.5f)) & 1023) << 6);
        q13.a aVar2222 = q13.m;
        int i28222 = aw.h;
        return j2222;
    }

    public static final long c(int i2) {
        long j = i2;
        q13.a aVar = q13.m;
        long j2 = j << 32;
        int i3 = aw.h;
        return j2;
    }

    public static final long d(long j) {
        long j2 = j << 32;
        q13.a aVar = q13.m;
        int i2 = aw.h;
        return j2;
    }

    public static long e(int i2, int i3, int i4) {
        return c(((i2 & 255) << 16) | (-16777216) | ((i3 & 255) << 8) | (i4 & 255));
    }

    public static final x8 f(String str) {
        return new x8(qj2.b(str));
    }

    public static final long g(float f2, float f3) {
        return (Float.floatToRawIntBits(f3) & 4294967295L) | (Float.floatToRawIntBits(f2) << 32);
    }

    public static final void h(Function0 function0, vl1 vl1Var, boolean z, g01 g01Var, my myVar, a00 a00Var, int i2) {
        int i3;
        vl1 vl1Var2;
        int i4;
        g01 g01Var2;
        boolean z2;
        g01 g01Var3;
        boolean z3;
        a00Var.Z(-1142896114);
        if ((i2 & 6) == 0) {
            i3 = (a00Var.h(function0) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        int i5 = i3 | 432;
        if ((i2 & 3072) == 0) {
            i5 = i3 | 1456;
        }
        int i6 = i5 | 24576;
        if ((196608 & i2) == 0) {
            i6 |= a00Var.h(myVar) ? 131072 : NativeProtocol.MESSAGE_GET_ACCESS_TOKEN_REQUEST;
        }
        if ((74899 & i6) == 74898 && a00Var.B()) {
            a00Var.S();
            vl1Var2 = vl1Var;
            z3 = z;
            g01Var3 = g01Var;
        } else {
            a00Var.U();
            if ((i2 & 1) == 0 || a00Var.z()) {
                a00Var.X(-1519621781);
                long j = ((aw) a00Var.j(e20.a)).a;
                gw gwVar = (gw) a00Var.j(hw.a);
                g01 g01Var4 = gwVar.L;
                if (g01Var4 == null) {
                    long j2 = aw.f;
                    g01 g01Var5 = new g01(j2, j, j2, aw.b(j, 0.38f));
                    gwVar.L = g01Var5;
                    g01Var4 = g01Var5;
                }
                long j3 = g01Var4.b;
                if (aw.c(j3, j)) {
                    a00Var.q(false);
                } else {
                    long b2 = aw.b(j, 0.38f);
                    long j4 = g01Var4.a;
                    long j5 = g01Var4.c;
                    if (j == 16) {
                        j = j3;
                    }
                    if (b2 == 16) {
                        b2 = g01Var4.d;
                    }
                    g01 g01Var6 = new g01(j4, j, j5, b2);
                    a00Var.q(false);
                    g01Var4 = g01Var6;
                }
                vl1Var2 = sl1.a;
                i4 = i6 & (-7169);
                g01Var2 = g01Var4;
                z2 = true;
            } else {
                a00Var.S();
                vl1Var2 = vl1Var;
                z2 = z;
                i4 = i6 & (-7169);
                g01Var2 = g01Var;
            }
            a00Var.r();
            bp2 bp2Var = c41.a;
            vl1 d2 = a.d(a.b(yk3.u(b.h(vl1Var2.k(MinimumInteractiveModifier.a), 40.0f), kk2.a(5, a00Var)), z2 ? g01Var2.a : g01Var2.c, e), null, za2.a(a00Var, 54, 4), z2, new fb2(0), function0, 8);
            oj1 e2 = fp.e(qb2.t, false);
            int D = iv1.D(a00Var);
            v02 l = a00Var.l();
            vl1 E = bd3.E(a00Var, d2);
            pz.b.getClass();
            o00 o00Var = oz.b;
            a00Var.b0();
            if (a00Var.S) {
                a00Var.k(o00Var);
            } else {
                a00Var.l0();
            }
            uj2.e(a00Var, e2, oz.f);
            uj2.e(a00Var, l, oz.e);
            sc scVar = oz.g;
            if (a00Var.S || !Intrinsics.b(a00Var.M(), Integer.valueOf(D))) {
                q40.r(D, a00Var, D, scVar);
            }
            uj2.e(a00Var, E, oz.d);
            yk3.a(e20.a.a(new aw(z2 ? g01Var2.b : g01Var2.d)), myVar, a00Var, ((i4 >> 12) & 112) | 8);
            a00Var.q(true);
            g01Var3 = g01Var2;
            z3 = z2;
        }
        n72 s = a00Var.s();
        if (s != null) {
            s.d = new h01(function0, vl1Var2, z3, g01Var3, myVar, i2);
        }
    }

    public static final long i(float f2, float f3) {
        return (Float.floatToRawIntBits(f3) & 4294967295L) | (Float.floatToRawIntBits(f2) << 32);
    }

    public static final void j(boolean z, Function2 function2, a00 a00Var, int i2) {
        a00Var.Z(-642000585);
        int i3 = 2;
        int i4 = 4;
        int i5 = (a00Var.g(z) ? 4 : 2) | i2 | (a00Var.h(function2) ? 32 : 16);
        if (a00Var.P(i5 & 1, (i5 & 19) != 18)) {
            Object obj = (uq1) a00Var.j(nf1.a);
            if (obj == null) {
                a00Var.X(950836184);
                View view = (View) a00Var.j(AndroidCompositionLocals_androidKt.f);
                view.getClass();
                while (true) {
                    if (view == null) {
                        obj = null;
                        break;
                    }
                    Object tag = view.getTag(R.id.view_tree_navigation_event_dispatcher_owner);
                    Object obj2 = tag instanceof uq1 ? (uq1) tag : null;
                    if (obj2 != null) {
                        obj = obj2;
                        break;
                    } else {
                        Object g2 = ti2.g(view);
                        view = g2 instanceof View ? (View) g2 : null;
                    }
                }
                a00Var.q(false);
            } else {
                a00Var.X(950834231);
                a00Var.q(false);
            }
            if (obj == null) {
                a00Var.X(1512740606);
                obj = (su1) a00Var.j(of1.a);
                if (obj == null) {
                    a00Var.X(1208426157);
                    View view2 = (View) a00Var.j(AndroidCompositionLocals_androidKt.f);
                    view2.getClass();
                    while (true) {
                        if (view2 == null) {
                            obj = null;
                            break;
                        }
                        Object tag2 = view2.getTag(R.id.view_tree_on_back_pressed_dispatcher_owner);
                        Object obj3 = tag2 instanceof su1 ? (su1) tag2 : null;
                        if (obj3 != null) {
                            obj = obj3;
                            break;
                        } else {
                            Object g3 = ti2.g(view2);
                            view2 = g3 instanceof View ? (View) g3 : null;
                        }
                    }
                } else {
                    a00Var.X(1208423708);
                }
                a00Var.q(false);
                if (obj == null) {
                    a00Var.X(1208428160);
                    Object obj4 = (Context) a00Var.j(AndroidCompositionLocals_androidKt.b);
                    while (true) {
                        if (!(obj4 instanceof ContextWrapper)) {
                            obj4 = null;
                            break;
                        } else if (obj4 instanceof su1) {
                            break;
                        } else {
                            obj4 = ((ContextWrapper) obj4).getBaseContext();
                        }
                    }
                    obj = (su1) obj4;
                } else {
                    a00Var.X(1208423789);
                }
                a00Var.q(false);
            } else {
                a00Var.X(1512737723);
            }
            a00Var.q(false);
            if (obj == null) {
                lh.g("No NavigationEventDispatcherOwner was provided via LocalNavigationEventDispatcherOwner and no OnBackPressedDispatcherOwner was provided via LocalOnBackPressedDispatcherOwner. Please provide one of the two.");
                return;
            }
            boolean f2 = a00Var.f(obj);
            Object M = a00Var.M();
            Object obj5 = sz.a;
            if (f2 || M == obj5) {
                uq1 uq1Var = obj instanceof uq1 ? (uq1) obj : null;
                tq1 navigationEventDispatcher = uq1Var != null ? uq1Var.getNavigationEventDispatcher() : null;
                su1 su1Var = obj instanceof su1 ? (su1) obj : null;
                M = new um(navigationEventDispatcher, su1Var != null ? su1Var.getOnBackPressedDispatcher() : null);
                a00Var.i0(M);
            }
            Object obj6 = (um) M;
            Object M2 = a00Var.M();
            if (M2 == obj5) {
                M2 = l41.x(h.m, a00Var);
                a00Var.i0(M2);
            }
            a50 a50Var = (a50) M2;
            long j = a00Var.T;
            boolean f3 = a00Var.f(obj6) | a00Var.e(j);
            Object M3 = a00Var.M();
            if (f3 || M3 == obj5) {
                M3 = new iz(a50Var, new x32(j, obj));
                a00Var.i0(M3);
            }
            iz izVar = (iz) M3;
            a00Var.X(-348514256);
            boolean h2 = a00Var.h(izVar) | a00Var.h(function2);
            Object M4 = a00Var.M();
            if (h2 || M4 == obj5) {
                M4 = new h00(i4, izVar, function2);
                a00Var.i0(M4);
            }
            l41.m((Function0) M4, a00Var);
            Boolean valueOf = Boolean.valueOf(z);
            int i6 = i5 & 14;
            boolean h3 = a00Var.h(izVar) | (i6 == 4);
            Object M5 = a00Var.M();
            if (h3 || M5 == obj5) {
                M5 = new bk(izVar, z);
                a00Var.i0(M5);
            }
            o70.f(valueOf, izVar, null, (Function1) M5, a00Var, i6);
            boolean h4 = a00Var.h(obj6) | a00Var.h(izVar);
            Object M6 = a00Var.M();
            if (h4 || M6 == obj5) {
                M6 = new ek(5, obj6, izVar);
                a00Var.i0(M6);
            }
            l41.e(obj6, izVar, (Function1) M6, a00Var);
            a00Var.q(false);
        } else {
            a00Var.S();
        }
        n72 s = a00Var.s();
        if (s != null) {
            s.d = new ju0(z, function2, i2, i3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x009c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final long k(float f2, float f3, float f4, float f5, iw iwVar) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        if (iwVar.c()) {
            q13.a aVar = q13.m;
            long j = ((((((int) ((f5 * 255.0f) + 0.5f)) << 24) | (((int) ((f2 * 255.0f) + 0.5f)) << 16)) | (((int) ((f3 * 255.0f) + 0.5f)) << 8)) | ((int) ((255.0f * f4) + 0.5f))) << 32;
            int i11 = aw.h;
            return j;
        }
        int floatToRawIntBits = Float.floatToRawIntBits(f2);
        int i12 = floatToRawIntBits >>> 31;
        int i13 = (floatToRawIntBits >>> 23) & 255;
        int i14 = floatToRawIntBits & 8388607;
        int i15 = 49;
        int i16 = 0;
        if (i13 == 255) {
            i3 = i14 != 0 ? 512 : 0;
            i2 = 31;
        } else {
            i2 = i13 - 112;
            if (i2 >= 31) {
                i2 = 49;
                i3 = 0;
            } else if (i2 > 0) {
                int i17 = i14 >> 13;
                if ((floatToRawIntBits & 4096) != 0) {
                    i4 = (((i2 << 10) | i17) + 1) | (i12 << 15);
                    short s = (short) i4;
                    int floatToRawIntBits2 = Float.floatToRawIntBits(f3);
                    int i18 = floatToRawIntBits2 >>> 31;
                    i5 = (floatToRawIntBits2 >>> 23) & 255;
                    int i19 = floatToRawIntBits2 & 8388607;
                    if (i5 != 255) {
                        i7 = i19 != 0 ? 512 : 0;
                        i6 = 31;
                    } else {
                        i6 = i5 - 112;
                        if (i6 >= 31) {
                            i6 = 49;
                            i7 = 0;
                        } else if (i6 > 0) {
                            int i20 = i19 >> 13;
                            if ((floatToRawIntBits2 & 4096) != 0) {
                                i8 = (((i6 << 10) | i20) + 1) | (i18 << 15);
                                short s2 = (short) i8;
                                int floatToRawIntBits3 = Float.floatToRawIntBits(f4);
                                int i21 = floatToRawIntBits3 >>> 31;
                                i9 = (floatToRawIntBits3 >>> 23) & 255;
                                int i22 = 8388607 & floatToRawIntBits3;
                                if (i9 == 255) {
                                    i16 = i22 == 0 ? 0 : 512;
                                    i15 = 31;
                                } else {
                                    int i23 = i9 - 112;
                                    if (i23 < 31) {
                                        if (i23 > 0) {
                                            i16 = i22 >> 13;
                                            if ((floatToRawIntBits3 & 4096) != 0) {
                                                i10 = (((i23 << 10) | i16) + 1) | (i21 << 15);
                                                long max = ((((short) i10) & 65535) << 16) | ((s & 65535) << 48) | ((s2 & 65535) << 32) | ((((int) ((Math.max(0.0f, Math.min(f5, 1.0f)) * 1023.0f) + 0.5f)) & 1023) << 6) | (iwVar.c & 63);
                                                q13.a aVar2 = q13.m;
                                                int i24 = aw.h;
                                                return max;
                                            }
                                            i15 = i23;
                                        } else if (i23 >= -10) {
                                            int i25 = (i22 | 8388608) >> (1 - i23);
                                            if ((i25 & 4096) != 0) {
                                                i25 += Utility.DEFAULT_STREAM_BUFFER_SIZE;
                                            }
                                            i15 = 0;
                                            i16 = i25 >> 13;
                                        } else {
                                            i15 = 0;
                                        }
                                    }
                                }
                                i10 = (i21 << 15) | (i15 << 10) | i16;
                                long max2 = ((((short) i10) & 65535) << 16) | ((s & 65535) << 48) | ((s2 & 65535) << 32) | ((((int) ((Math.max(0.0f, Math.min(f5, 1.0f)) * 1023.0f) + 0.5f)) & 1023) << 6) | (iwVar.c & 63);
                                q13.a aVar22 = q13.m;
                                int i242 = aw.h;
                                return max2;
                            }
                            i7 = i20;
                        } else if (i6 >= -10) {
                            int i26 = (i19 | 8388608) >> (1 - i6);
                            if ((i26 & 4096) != 0) {
                                i26 += Utility.DEFAULT_STREAM_BUFFER_SIZE;
                            }
                            i7 = i26 >> 13;
                            i6 = 0;
                        } else {
                            i7 = 0;
                            i6 = 0;
                        }
                    }
                    i8 = i7 | (i18 << 15) | (i6 << 10);
                    short s22 = (short) i8;
                    int floatToRawIntBits32 = Float.floatToRawIntBits(f4);
                    int i212 = floatToRawIntBits32 >>> 31;
                    i9 = (floatToRawIntBits32 >>> 23) & 255;
                    int i222 = 8388607 & floatToRawIntBits32;
                    if (i9 == 255) {
                    }
                    i10 = (i212 << 15) | (i15 << 10) | i16;
                    long max22 = ((((short) i10) & 65535) << 16) | ((s & 65535) << 48) | ((s22 & 65535) << 32) | ((((int) ((Math.max(0.0f, Math.min(f5, 1.0f)) * 1023.0f) + 0.5f)) & 1023) << 6) | (iwVar.c & 63);
                    q13.a aVar222 = q13.m;
                    int i2422 = aw.h;
                    return max22;
                }
                i3 = i17;
            } else if (i2 >= -10) {
                int i27 = (i14 | 8388608) >> (1 - i2);
                if ((i27 & 4096) != 0) {
                    i27 += Utility.DEFAULT_STREAM_BUFFER_SIZE;
                }
                i3 = i27 >> 13;
                i2 = 0;
            } else {
                i3 = 0;
                i2 = 0;
            }
        }
        i4 = i3 | (i12 << 15) | (i2 << 10);
        short s3 = (short) i4;
        int floatToRawIntBits22 = Float.floatToRawIntBits(f3);
        int i182 = floatToRawIntBits22 >>> 31;
        i5 = (floatToRawIntBits22 >>> 23) & 255;
        int i192 = floatToRawIntBits22 & 8388607;
        if (i5 != 255) {
        }
        i8 = i7 | (i182 << 15) | (i6 << 10);
        short s222 = (short) i8;
        int floatToRawIntBits322 = Float.floatToRawIntBits(f4);
        int i2122 = floatToRawIntBits322 >>> 31;
        i9 = (floatToRawIntBits322 >>> 23) & 255;
        int i2222 = 8388607 & floatToRawIntBits322;
        if (i9 == 255) {
        }
        i10 = (i2122 << 15) | (i15 << 10) | i16;
        long max222 = ((((short) i10) & 65535) << 16) | ((s3 & 65535) << 48) | ((s222 & 65535) << 32) | ((((int) ((Math.max(0.0f, Math.min(f5, 1.0f)) * 1023.0f) + 0.5f)) & 1023) << 6) | (iwVar.c & 63);
        q13.a aVar2222 = q13.m;
        int i24222 = aw.h;
        return max222;
    }

    public static final up1 l(Context context) {
        context.getClass();
        up1 up1Var = new up1(context);
        dr1 dr1Var = up1Var.v;
        dr1Var.a(new cz(dr1Var));
        dr1Var.a(new ez());
        dr1Var.a(new ab0());
        return up1Var;
    }

    public static final int m(char c2) {
        if ('0' <= c2 && c2 < ':') {
            return c2 - '0';
        }
        if ('a' <= c2 && c2 < 'g') {
            return c2 - 'W';
        }
        if ('A' <= c2 && c2 < 'G') {
            return c2 - '7';
        }
        throw new IllegalArgumentException("Unexpected hex digit: " + c2);
    }

    public static final Typeface n(m92 m92Var, Context context) {
        int i2 = m92Var.a;
        ThreadLocal threadLocal = t92.a;
        Typeface a2 = context.isRestricted() ? null : t92.a(context, i2, new TypedValue(), 0, null, false);
        a2.getClass();
        return a2;
    }

    public static float p(float[] fArr) {
        if (fArr.length < 6) {
            return 0.0f;
        }
        float f2 = fArr[0];
        float f3 = fArr[1];
        float f4 = fArr[2];
        float f5 = fArr[3];
        float f6 = fArr[4];
        float f7 = fArr[5];
        float f8 = (((((f4 * f7) + ((f3 * f6) + (f2 * f5))) - (f5 * f6)) - (f3 * f4)) - (f2 * f7)) * 0.5f;
        return f8 < 0.0f ? -f8 : f8;
    }

    public static final void q(n53 n53Var, wd2 wd2Var, ad1 ad1Var) {
        wd2Var.getClass();
        ad1Var.getClass();
        qd2 qd2Var = (qd2) n53Var.c("androidx.lifecycle.savedstate.vm.tag");
        if (qd2Var == null || qd2Var.o) {
            return;
        }
        qd2Var.p(ad1Var, wd2Var);
        I(ad1Var, wd2Var);
    }

    public static final boolean r(Object obj) {
        if (obj instanceof xm2) {
            xm2 xm2Var = (xm2) obj;
            if (xm2Var.e() == qb2.Z || xm2Var.e() == by1.B || xm2Var.e() == by1.q) {
                Object value = xm2Var.getValue();
                if (value == null) {
                    return true;
                }
                return r(value);
            }
        } else if (!(obj instanceof tt0) || !(obj instanceof Serializable)) {
            for (int i2 = 0; i2 < 7; i2++) {
                if (c[i2].isInstance(obj)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final long s(long j, long j2) {
        float f2;
        float f3;
        long a2 = aw.a(j, aw.f(j2));
        float d2 = aw.d(j2);
        float d3 = aw.d(a2);
        float f4 = 1.0f - d3;
        float f5 = (d2 * f4) + d3;
        float h2 = aw.h(a2);
        float h3 = aw.h(j2);
        float f6 = 0.0f;
        if (f5 == 0.0f) {
            f2 = 0.0f;
        } else {
            f2 = (((h3 * d2) * f4) + (h2 * d3)) / f5;
        }
        float g2 = aw.g(a2);
        float g3 = aw.g(j2);
        if (f5 == 0.0f) {
            f3 = 0.0f;
        } else {
            f3 = (((g3 * d2) * f4) + (g2 * d3)) / f5;
        }
        float e2 = aw.e(a2);
        float e3 = aw.e(j2);
        if (f5 != 0.0f) {
            f6 = (((e3 * d2) * f4) + (e2 * d3)) / f5;
        }
        return k(f2, f3, f6, f5, aw.f(j2));
    }

    public static final qd2 t(wd2 wd2Var, ad1 ad1Var, String str, Bundle bundle) {
        pd2 pd2Var;
        wd2Var.getClass();
        ad1Var.getClass();
        Bundle a2 = wd2Var.a(str);
        if (a2 != null) {
            bundle = a2;
        }
        if (bundle == null) {
            pd2Var = new pd2();
        } else {
            ClassLoader classLoader = pd2.class.getClassLoader();
            classLoader.getClass();
            bundle.setClassLoader(classLoader);
            uh1 uh1Var = new uh1(bundle.size());
            for (String str2 : bundle.keySet()) {
                str2.getClass();
                uh1Var.put(str2, bundle.get(str2));
            }
            pd2Var = new pd2(uh1Var.b());
        }
        qd2 qd2Var = new qd2(str, pd2Var);
        qd2Var.p(ad1Var, wd2Var);
        I(ad1Var, wd2Var);
        return qd2Var;
    }

    public static final jp0 u(Context context) {
        return new jp0(new u9(context, 0), new v9(Build.VERSION.SDK_INT >= 31 ? kq0.a.a(context) : 0));
    }

    public static void v(Canvas canvas, boolean z) {
        Method method;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 29) {
            x6.j(canvas, z);
            return;
        }
        if (!i) {
            try {
                if (i2 == 28) {
                    Method declaredMethod = Class.class.getDeclaredMethod("getDeclaredMethod", String.class, new Class[0].getClass());
                    g = (Method) declaredMethod.invoke(Canvas.class, "insertReorderBarrier", new Class[0]);
                    h = (Method) declaredMethod.invoke(Canvas.class, "insertInorderBarrier", new Class[0]);
                } else {
                    g = Canvas.class.getDeclaredMethod("insertReorderBarrier", null);
                    h = Canvas.class.getDeclaredMethod("insertInorderBarrier", null);
                }
                Method method2 = g;
                if (method2 != null) {
                    method2.setAccessible(true);
                }
                Method method3 = h;
                if (method3 != null) {
                    method3.setAccessible(true);
                }
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            }
            i = true;
        }
        if (z) {
            try {
                Method method4 = g;
                if (method4 != null) {
                    method4.invoke(canvas, null);
                }
            } catch (IllegalAccessException | InvocationTargetException unused2) {
                return;
            }
        }
        if (z || (method = h) == null) {
            return;
        }
        method.invoke(canvas, null);
    }

    public static final long w(long j, boolean z, int i2, float f2) {
        int h2 = ((z || i2 == 2) && u10.d(j)) ? u10.h(j) : Integer.MAX_VALUE;
        if (u10.j(j) != h2) {
            h2 = d.c(ti2.c(f2), u10.j(j), h2);
        }
        return zm3.w(0, h2, 0, u10.g(j));
    }

    public static final t40 x(Executor executor) {
        return new fj0(executor);
    }

    public static dx0 y(SSLSession sSLSession) {
        List list;
        sSLSession.getClass();
        String cipherSuite = sSLSession.getCipherSuite();
        if (cipherSuite == null) {
            lh.g("cipherSuite == null");
            return null;
        }
        int i2 = 1;
        if (cipherSuite.equals("TLS_NULL_WITH_NULL_NULL") ? true : cipherSuite.equals("SSL_NULL_WITH_NULL_NULL")) {
            dm0.j("cipherSuite == ".concat(cipherSuite));
            return null;
        }
        eu l = eu.b.l(cipherSuite);
        String protocol = sSLSession.getProtocol();
        if (protocol == null) {
            lh.g("tlsVersion == null");
            return null;
        }
        if ("NONE".equals(protocol)) {
            dm0.j("tlsVersion == NONE");
            return null;
        }
        xx2 a2 = uj2.a(protocol);
        try {
            Certificate[] peerCertificates = sSLSession.getPeerCertificates();
            list = peerCertificates != null ? n33.i(Arrays.copyOf(peerCertificates, peerCertificates.length)) : ah0.m;
        } catch (SSLPeerUnverifiedException unused) {
            list = ah0.m;
        }
        Certificate[] localCertificates = sSLSession.getLocalCertificates();
        return new dx0(a2, l, localCertificates != null ? n33.i(Arrays.copyOf(localCertificates, localCertificates.length)) : ah0.m, new p80(i2, list));
    }

    public static zj1 z(String str) {
        str.getClass();
        Matcher matcher = zj1.b.matcher(str);
        if (!matcher.lookingAt()) {
            ey.h(str, "No subtype found for: \"");
            return null;
        }
        String group = matcher.group(1);
        group.getClass();
        Locale locale = Locale.US;
        locale.getClass();
        group.toLowerCase(locale).getClass();
        String group2 = matcher.group(2);
        group2.getClass();
        group2.toLowerCase(locale).getClass();
        ArrayList arrayList = new ArrayList();
        Matcher matcher2 = zj1.c.matcher(str);
        int end = matcher.end();
        while (end < str.length()) {
            matcher2.region(end, str.length());
            if (!matcher2.lookingAt()) {
                b71.l("Parameter is not formatted correctly: \"", str.substring(end), "\" for: \"", str, 34);
                return null;
            }
            String group3 = matcher2.group(1);
            if (group3 == null) {
                end = matcher2.end();
            } else {
                String group4 = matcher2.group(2);
                if (group4 == null) {
                    group4 = matcher2.group(3);
                } else if (tp2.o(group4, "'", false) && tp2.h(group4, "'", false) && group4.length() > 2) {
                    group4 = group4.substring(1, group4.length() - 1);
                }
                arrayList.add(group3);
                arrayList.add(group4);
                end = matcher2.end();
            }
        }
        return new zj1(str);
    }

    public abstract int o(int i2, u81 u81Var);
}
