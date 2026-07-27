package j0;

import A.AbstractC0017m;
import A.C0011g;
import A.C0020p;
import A.C0021q;
import A.C0024u;
import A.C0025v;
import A.InterfaceC0015k;
import A.InterfaceC0019o;
import A.V;
import A.Y;
import A.a0;
import A.b0;
import A.c0;
import A0.I;
import A1.AbstractC0082v;
import A1.C0044a;
import A1.C0048c;
import A1.C0050d;
import A1.C0054f;
import A1.C0056g;
import A1.C0060i;
import A1.C0062j;
import A1.C0079s;
import D.B;
import D.N1;
import F0.k;
import F0.r;
import G.C0192d;
import G.C0205j0;
import G.C0208l;
import G.C0216p;
import G.C0222s0;
import G.InterfaceC0191c0;
import G.InterfaceC0213n0;
import G.W;
import G.W0;
import H.D;
import L0.h;
import M0.m;
import M0.n;
import M2.E;
import O.f;
import Q.v;
import Q0.g;
import S.o;
import Z.C0323u;
import Z.K;
import Z.S;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.ParcelFileDescriptor;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.util.Log;
import android.view.KeyEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.ExtractedText;
import androidx.compose.foundation.layout.FillElement;
import d1.AbstractC0543a;
import f0.AbstractC0576G;
import f0.C0584e;
import f0.C0585f;
import f1.C0612f;
import f1.C0614h;
import f1.C0618l;
import i.AbstractC0664E;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import k.C0738d;
import k.C0741g;
import k.C0745k;
import k.C0746l;
import k.M;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;
import kotlin.text.y;
import kotlinx.serialization.descriptors.SerialDescriptor;
import l.g0;
import l.m0;
import l.s0;
import l.t0;
import l.w0;
import l0.w;
import m.p0;
import m.u0;
import m3.i;
import m3.s;
import n.AbstractC0864b;
import p0.InterfaceC0980p;
import q.AbstractC1031j;
import q.AbstractC1039r;
import q.C1028g;
import q.C1041t;
import q.e0;
import q.f0;
import r0.C1067h;
import r0.C1068i;
import r0.C1069j;
import r0.InterfaceC1070k;
import s0.C1157n;
import u3.l;
import w.P;
import y.t;
import y2.AbstractC1343r;
import y2.C1331f;
import y2.C1336k;
import y2.EnumC1337l;
import y2.InterfaceC1335j;
import z1.AbstractC1365I;
import z1.AbstractC1366J;
import z1.C1361E;
import z1.C1374S;
import z1.C1377c;
import z1.C1379e;
import z2.C1403G;
import z2.C1405I;
import z2.C1439w;

/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static C0585f f7137a;

    /* renamed from: b, reason: collision with root package name */
    public static C0585f f7138b;

    /* renamed from: c, reason: collision with root package name */
    public static C0585f f7139c;

    /* renamed from: d, reason: collision with root package name */
    public static C0585f f7140d;

    public static final long A(KeyEvent keyEvent) {
        return u3.d.d(keyEvent.getKeyCode());
    }

    public static final C0585f B() {
        C0585f c0585f = f7139c;
        if (c0585f != null) {
            return c0585f;
        }
        C0584e c0584e = new C0584e("Outlined.MilitaryTech", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        C1405I c1405i = AbstractC0576G.f6305a;
        S s4 = new S(C0323u.f4542b);
        W0 w02 = new W0(1);
        w02.j(17.0f, 10.43f);
        w02.n(2.0f);
        w02.f(7.0f);
        w02.o(8.43f);
        w02.e(0.0f, 0.35f, 0.18f, 0.68f, 0.49f, 0.86f);
        w02.i(4.18f, 2.51f);
        w02.i(-0.99f, 2.34f);
        w02.i(-3.41f, 0.29f);
        w02.i(2.59f, 2.24f);
        w02.h(9.07f, 22.0f);
        w02.h(12.0f, 20.23f);
        w02.h(14.93f, 22.0f);
        w02.i(-0.78f, -3.33f);
        w02.i(2.59f, -2.24f);
        w02.i(-3.41f, -0.29f);
        w02.i(-0.99f, -2.34f);
        w02.i(4.18f, -2.51f);
        w02.d(16.82f, 11.11f, 17.0f, 10.79f, 17.0f, 10.43f);
        w02.c();
        w02.j(11.0f, 11.07f);
        w02.i(-2.0f, -1.2f);
        w02.n(4.0f);
        w02.g(2.0f);
        w02.n(11.07f);
        w02.c();
        w02.j(15.0f, 9.87f);
        w02.i(-2.0f, 1.2f);
        w02.n(4.0f);
        w02.g(2.0f);
        w02.n(9.87f);
        w02.c();
        C0584e.a(c0584e, w02.f2781d, s4);
        C0585f b4 = c0584e.b();
        f7139c = b4;
        return b4;
    }

    public static final int C(KeyEvent keyEvent) {
        int action = keyEvent.getAction();
        if (action != 0) {
            return action != 1 ? 0 : 1;
        }
        return 2;
    }

    public static final boolean D(a0 a0Var, boolean z4) {
        InterfaceC0980p c4;
        P p4 = a0Var.f87d;
        if (p4 == null || (c4 = p4.c()) == null) {
            return false;
        }
        Y.d Y3 = M1.a.Y(c4);
        long i2 = a0Var.i(z4);
        float d4 = Y.c.d(i2);
        if (Y3.f4374a > d4 || d4 > Y3.f4376c) {
            return false;
        }
        float e4 = Y.c.e(i2);
        return Y3.f4375b <= e4 && e4 <= Y3.f4377d;
    }

    public static MappedByteBuffer E(Context context, Uri uri) {
        try {
            ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(uri, "r", null);
            if (openFileDescriptor == null) {
                if (openFileDescriptor != null) {
                    openFileDescriptor.close();
                }
                return null;
            }
            try {
                FileInputStream fileInputStream = new FileInputStream(openFileDescriptor.getFileDescriptor());
                try {
                    FileChannel channel = fileInputStream.getChannel();
                    MappedByteBuffer map = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                    fileInputStream.close();
                    openFileDescriptor.close();
                    return map;
                } finally {
                }
            } finally {
            }
        } catch (IOException unused) {
            return null;
        }
    }

    public static long F(int i2, String str) {
        int u4 = u(str, 0, i2, false);
        Matcher matcher = i.f8374m.matcher(str);
        int i4 = -1;
        int i5 = -1;
        int i6 = -1;
        int i7 = -1;
        int i8 = -1;
        int i9 = -1;
        while (u4 < i2) {
            int u5 = u(str, u4 + 1, i2, true);
            matcher.region(u4, u5);
            if (i5 == -1 && matcher.usePattern(i.f8374m).matches()) {
                String group = matcher.group(1);
                Intrinsics.checkNotNullExpressionValue(group, "matcher.group(1)");
                i5 = Integer.parseInt(group);
                String group2 = matcher.group(2);
                Intrinsics.checkNotNullExpressionValue(group2, "matcher.group(2)");
                i8 = Integer.parseInt(group2);
                String group3 = matcher.group(3);
                Intrinsics.checkNotNullExpressionValue(group3, "matcher.group(3)");
                i9 = Integer.parseInt(group3);
            } else if (i6 == -1 && matcher.usePattern(i.f8373l).matches()) {
                String group4 = matcher.group(1);
                Intrinsics.checkNotNullExpressionValue(group4, "matcher.group(1)");
                i6 = Integer.parseInt(group4);
            } else {
                if (i7 == -1) {
                    Pattern pattern = i.f8372k;
                    if (matcher.usePattern(pattern).matches()) {
                        String group5 = matcher.group(1);
                        Intrinsics.checkNotNullExpressionValue(group5, "matcher.group(1)");
                        Locale US = Locale.US;
                        Intrinsics.checkNotNullExpressionValue(US, "US");
                        String lowerCase = group5.toLowerCase(US);
                        Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(locale)");
                        String pattern2 = pattern.pattern();
                        Intrinsics.checkNotNullExpressionValue(pattern2, "MONTH_PATTERN.pattern()");
                        i7 = y.v(pattern2, lowerCase, 0, false, 6) / 4;
                    }
                }
                if (i4 == -1 && matcher.usePattern(i.f8371j).matches()) {
                    String group6 = matcher.group(1);
                    Intrinsics.checkNotNullExpressionValue(group6, "matcher.group(1)");
                    i4 = Integer.parseInt(group6);
                }
            }
            u4 = u(str, u5 + 1, i2, false);
        }
        if (70 <= i4 && i4 < 100) {
            i4 += 1900;
        }
        if (i4 >= 0 && i4 < 70) {
            i4 += 2000;
        }
        if (i4 < 1601) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (i7 == -1) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (1 > i6 || i6 >= 32) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (i5 < 0 || i5 >= 24) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (i8 < 0 || i8 >= 60) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (i9 < 0 || i9 >= 60) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        GregorianCalendar gregorianCalendar = new GregorianCalendar(n3.b.f8562e);
        gregorianCalendar.setLenient(false);
        gregorianCalendar.set(1, i4);
        gregorianCalendar.set(2, i7 - 1);
        gregorianCalendar.set(5, i6);
        gregorianCalendar.set(11, i5);
        gregorianCalendar.set(12, i8);
        gregorianCalendar.set(13, i9);
        gregorianCalendar.set(14, 0);
        return gregorianCalendar.getTimeInMillis();
    }

    public static l1.b I(MappedByteBuffer mappedByteBuffer) {
        long j4;
        ByteBuffer duplicate = mappedByteBuffer.duplicate();
        duplicate.order(ByteOrder.BIG_ENDIAN);
        duplicate.position(duplicate.position() + 4);
        int i2 = duplicate.getShort() & 65535;
        if (i2 > 100) {
            throw new IOException("Cannot read metadata.");
        }
        duplicate.position(duplicate.position() + 6);
        int i4 = 0;
        while (true) {
            if (i4 >= i2) {
                j4 = -1;
                break;
            }
            int i5 = duplicate.getInt();
            duplicate.position(duplicate.position() + 4);
            j4 = duplicate.getInt() & 4294967295L;
            duplicate.position(duplicate.position() + 4);
            if (1835365473 == i5) {
                break;
            }
            i4++;
        }
        if (j4 != -1) {
            duplicate.position(duplicate.position() + ((int) (j4 - duplicate.position())));
            duplicate.position(duplicate.position() + 12);
            long j5 = duplicate.getInt() & 4294967295L;
            for (int i6 = 0; i6 < j5; i6++) {
                int i7 = duplicate.getInt();
                long j6 = duplicate.getInt() & 4294967295L;
                duplicate.getInt();
                if (1164798569 == i7 || 1701669481 == i7) {
                    duplicate.position((int) (j6 + j4));
                    l1.b bVar = new l1.b();
                    duplicate.order(ByteOrder.LITTLE_ENDIAN);
                    int position = duplicate.position() + duplicate.getInt(duplicate.position());
                    bVar.f838j = duplicate;
                    bVar.f835d = position;
                    int i8 = position - duplicate.getInt(position);
                    bVar.f836e = i8;
                    bVar.f837i = ((ByteBuffer) bVar.f838j).getShort(i8);
                    return bVar;
                }
            }
        }
        throw new IOException("Cannot read metadata.");
    }

    public static final u0 J(C0216p c0216p) {
        Object[] objArr = new Object[0];
        t tVar = u0.f8193i;
        boolean d4 = c0216p.d(0);
        Object I3 = c0216p.I();
        if (d4 || I3 == C0208l.f2826a) {
            I3 = new p0(0);
            c0216p.c0(I3);
        }
        return (u0) l.s0(objArr, tVar, (Function0) I3, c0216p, 0, 4);
    }

    public static final float K(long j4, float f4, M0.b bVar) {
        float c4;
        long b4 = m.b(j4);
        if (n.a(b4, 4294967296L)) {
            if (bVar.q() <= 1.05d) {
                return bVar.M(j4);
            }
            c4 = m.c(j4) / m.c(bVar.a0(f4));
        } else {
            if (!n.a(b4, 8589934592L)) {
                return Float.NaN;
            }
            c4 = m.c(j4);
        }
        return c4 * f4;
    }

    public static final long L(long j4) {
        return (Math.round(Y.c.e(j4)) & 4294967295L) | (Math.round(Y.c.d(j4)) << 32);
    }

    public static final void M(Spannable spannable, long j4, int i2, int i4) {
        if (j4 != 16) {
            spannable.setSpan(new ForegroundColorSpan(K.D(j4)), i2, i4, 33);
        }
    }

    public static final void N(Spannable spannable, long j4, M0.b bVar, int i2, int i4) {
        long b4 = m.b(j4);
        if (n.a(b4, 4294967296L)) {
            spannable.setSpan(new AbsoluteSizeSpan(O2.c.a(bVar.M(j4)), false), i2, i4, 33);
        } else if (n.a(b4, 8589934592L)) {
            spannable.setSpan(new RelativeSizeSpan(m.c(j4)), i2, i4, 33);
        }
    }

    public static void O(EditorInfo editorInfo, CharSequence charSequence) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 30) {
            AbstractC0543a.a(editorInfo, charSequence);
            return;
        }
        charSequence.getClass();
        if (i2 >= 30) {
            AbstractC0543a.a(editorInfo, charSequence);
            return;
        }
        int i4 = editorInfo.initialSelStart;
        int i5 = editorInfo.initialSelEnd;
        int i6 = i4 > i5 ? i5 : i4;
        if (i4 <= i5) {
            i4 = i5;
        }
        int length = charSequence.length();
        if (i6 < 0 || i4 > length) {
            R(editorInfo, null, 0, 0);
            return;
        }
        int i7 = editorInfo.inputType & 4095;
        if (i7 == 129 || i7 == 225 || i7 == 18) {
            R(editorInfo, null, 0, 0);
            return;
        }
        if (length <= 2048) {
            R(editorInfo, charSequence, i6, i4);
            return;
        }
        int i8 = i4 - i6;
        int i9 = i8 > 1024 ? 0 : i8;
        int i10 = 2048 - i9;
        int min = Math.min(charSequence.length() - i4, i10 - Math.min(i6, (int) (i10 * 0.8d)));
        int min2 = Math.min(i6, i10 - min);
        int i11 = i6 - min2;
        if (Character.isLowSurrogate(charSequence.charAt(i11))) {
            i11++;
            min2--;
        }
        if (Character.isHighSurrogate(charSequence.charAt((i4 + min) - 1))) {
            min--;
        }
        int i12 = min2 + i9;
        R(editorInfo, i9 != i8 ? TextUtils.concat(charSequence.subSequence(i11, i11 + min2), charSequence.subSequence(i4, min + i4)) : charSequence.subSequence(i11, i12 + min + i11), min2, i12);
    }

    public static final void P(D d4, int i2, int i4) {
        int i5 = 1 << i2;
        int i6 = d4.f3180n;
        if ((i6 & i5) == 0) {
            d4.f3180n = i5 | i6;
            d4.f3176j[(d4.f3177k - d4.b0().f3172a) + i2] = i4;
        } else {
            C0192d.T("Already pushed argument " + d4.b0().b(i2));
            throw null;
        }
    }

    public static final void Q(D d4, int i2, Object obj) {
        int i4 = 1 << i2;
        int i5 = d4.f3181o;
        if ((i5 & i4) == 0) {
            d4.f3181o = i4 | i5;
            d4.f3178l[(d4.f3179m - d4.b0().f3173b) + i2] = obj;
        } else {
            C0192d.T("Already pushed argument " + d4.b0().c(i2));
            throw null;
        }
    }

    public static void R(EditorInfo editorInfo, CharSequence charSequence, int i2, int i4) {
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        editorInfo.extras.putCharSequence("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SURROUNDING_TEXT", charSequence != null ? new SpannableStringBuilder(charSequence) : null);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_HEAD", i2);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_END", i4);
    }

    public static final ExtractedText S(G0.y yVar) {
        ExtractedText extractedText = new ExtractedText();
        String str = yVar.f3093a.f328a;
        extractedText.text = str;
        extractedText.startOffset = 0;
        extractedText.partialEndOffset = str.length();
        extractedText.partialStartOffset = -1;
        long j4 = yVar.f3094b;
        extractedText.selectionStart = A0.K.e(j4);
        extractedText.selectionEnd = A0.K.d(j4);
        extractedText.flags = !y.o(yVar.f3093a.f328a, '\n') ? 1 : 0;
        return extractedText;
    }

    public static o T(o oVar, u0 u0Var) {
        return S.a.b(oVar, C1157n.f10272m, new androidx.compose.foundation.e(u0Var, false, null, true));
    }

    public static final void a(String str, Function0 function0, C0216p c0216p, int i2) {
        int i4;
        int i5;
        Function0 function02;
        c0216p.U(-62544789);
        if ((i2 & 6) == 0) {
            i4 = (c0216p.f(str) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= c0216p.h(function0) ? 32 : 16;
        }
        int i6 = i4;
        if ((i6 & 19) == 18 && c0216p.z()) {
            c0216p.N();
            i5 = i2;
            function02 = function0;
        } else {
            c0216p.S(58171487);
            Object I3 = c0216p.I();
            W w4 = C0208l.f2826a;
            W w5 = W.f2779l;
            if (I3 == w4) {
                I3 = C0192d.K("", w5);
                c0216p.c0(I3);
            }
            InterfaceC0191c0 interfaceC0191c0 = (InterfaceC0191c0) I3;
            Object f4 = AbstractC0017m.f(c0216p, false, 58173055);
            if (f4 == w4) {
                f4 = C0192d.K("", w5);
                c0216p.c0(f4);
            }
            InterfaceC0191c0 interfaceC0191c02 = (InterfaceC0191c0) f4;
            Object f5 = AbstractC0017m.f(c0216p, false, 58174591);
            if (f5 == w4) {
                f5 = C0192d.K("", w5);
                c0216p.c0(f5);
            }
            InterfaceC0191c0 interfaceC0191c03 = (InterfaceC0191c0) f5;
            c0216p.q(false);
            i5 = i2;
            function02 = function0;
            D.W0.a(function0, f.b(721991347, new C0054f(str, function0, interfaceC0191c0, interfaceC0191c02, interfaceC0191c03), c0216p), null, f.b(15394741, new C0056g(function0, 0), c0216p), null, AbstractC0082v.f744k, f.b(1102983480, new C0060i(interfaceC0191c0, interfaceC0191c02, interfaceC0191c03, 0), c0216p), null, AbstractC1365I.f11801b, 0L, 0L, 0L, 0.0f, null, c0216p, ((i6 >> 3) & 14) | 1772592, 0, 16020);
        }
        C0222s0 s4 = c0216p.s();
        if (s4 != null) {
            s4.f2903d = new C0044a(str, function02, i5, 2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v4, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r13v6 */
    public static final void b(m0 m0Var, o oVar, Function1 function1, S.c cVar, Function1 function12, O.a aVar, C0216p c0216p, int i2) {
        int i4;
        C0746l c0746l;
        i.y yVar;
        v vVar;
        Object obj;
        C0746l c0746l2;
        ?? r13;
        int i5;
        c0216p.U(-114689412);
        if ((i2 & 6) == 0) {
            i4 = (c0216p.f(m0Var) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= c0216p.f(oVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= c0216p.h(function1) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i4 |= c0216p.f(cVar) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i4 |= c0216p.h(function12) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i4 |= c0216p.h(aVar) ? 131072 : 65536;
        }
        if ((74899 & i4) == 74898 && c0216p.z()) {
            c0216p.N();
        } else {
            int i6 = i4 & 14;
            boolean z4 = i6 == 4;
            Object I3 = c0216p.I();
            Object obj2 = C0208l.f2826a;
            if (z4 || I3 == obj2) {
                I3 = new C0746l(m0Var, cVar);
                c0216p.c0(I3);
            }
            C0746l c0746l3 = (C0746l) I3;
            boolean z5 = i6 == 4;
            Object I4 = c0216p.I();
            Object obj3 = I4;
            if (z5 || I4 == obj2) {
                Object[] objArr = {m0Var.f7800a.l()};
                v vVar2 = new v();
                vVar2.addAll(C1439w.z(objArr));
                c0216p.c0(vVar2);
                obj3 = vVar2;
            }
            v vVar3 = (v) obj3;
            boolean z6 = i6 == 4;
            Object I5 = c0216p.I();
            if (z6 || I5 == obj2) {
                long[] jArr = AbstractC0664E.f6891a;
                I5 = new i.y();
                c0216p.c0(I5);
            }
            i.y yVar2 = (i.y) I5;
            boolean contains = vVar3.contains(m0Var.f7800a.l());
            t0 t0Var = m0Var.f7800a;
            if (!contains) {
                vVar3.clear();
                vVar3.add(t0Var.l());
            }
            Object l4 = t0Var.l();
            C0205j0 c0205j0 = m0Var.f7803d;
            if (Intrinsics.a(l4, c0205j0.getValue())) {
                if (vVar3.size() != 1 || !Intrinsics.a(vVar3.get(0), t0Var.l())) {
                    vVar3.clear();
                    vVar3.add(t0Var.l());
                }
                if (yVar2.f6986e != 1 || yVar2.b(t0Var.l())) {
                    yVar2.a();
                }
                c0746l3.f7301b = cVar;
            }
            if (Intrinsics.a(t0Var.l(), c0205j0.getValue()) || vVar3.contains(c0205j0.getValue())) {
                c0746l = c0746l3;
            } else {
                ListIterator listIterator = vVar3.listIterator();
                int i7 = 0;
                while (true) {
                    A2.b bVar = (A2.b) listIterator;
                    ListIterator listIterator2 = listIterator;
                    if (!bVar.hasNext()) {
                        c0746l = c0746l3;
                        i5 = -1;
                        i7 = -1;
                        break;
                    }
                    Object invoke = function12.invoke(bVar.next());
                    c0746l = c0746l3;
                    if (Intrinsics.a(invoke, function12.invoke(c0205j0.getValue()))) {
                        i5 = -1;
                        break;
                    } else {
                        i7++;
                        c0746l3 = c0746l;
                        listIterator = listIterator2;
                    }
                }
                if (i7 == i5) {
                    vVar3.add(c0205j0.getValue());
                } else {
                    vVar3.set(i7, c0205j0.getValue());
                }
            }
            if (yVar2.b(c0205j0.getValue()) && yVar2.b(t0Var.l())) {
                c0216p.S(915535767);
                c0216p.q(false);
                yVar = yVar2;
                vVar = vVar3;
                obj = obj2;
                r13 = 0;
                c0746l2 = c0746l;
            } else {
                boolean z7 = false;
                c0216p.S(912931457);
                yVar2.a();
                int size = vVar3.size();
                int i8 = 0;
                while (i8 < size) {
                    Object obj4 = vVar3.get(i8);
                    i.y yVar3 = yVar2;
                    v vVar4 = vVar3;
                    C0746l c0746l4 = c0746l;
                    yVar3.i(obj4, f.b(885640742, new C0738d(m0Var, obj4, function1, c0746l4, vVar4, aVar), c0216p));
                    i8++;
                    yVar2 = yVar3;
                    obj2 = obj2;
                    z7 = z7;
                    vVar3 = vVar4;
                    c0746l = c0746l4;
                }
                yVar = yVar2;
                vVar = vVar3;
                obj = obj2;
                boolean z8 = z7;
                c0746l2 = c0746l;
                c0216p.q(z8);
                r13 = z8;
            }
            C0746l c0746l5 = c0746l2;
            boolean f4 = c0216p.f(m0Var.f()) | c0216p.f(c0746l5);
            Object I6 = c0216p.I();
            if (f4 || I6 == obj) {
                I6 = (k.v) function1.invoke(c0746l5);
                c0216p.c0(I6);
            }
            k.v vVar5 = (k.v) I6;
            c0746l5.getClass();
            boolean f5 = c0216p.f(c0746l5);
            Object I7 = c0216p.I();
            if (f5 || I7 == obj) {
                I7 = C0192d.K(Boolean.FALSE, W.f2779l);
                c0216p.c0(I7);
            }
            InterfaceC0191c0 interfaceC0191c0 = (InterfaceC0191c0) I7;
            InterfaceC0191c0 N3 = C0192d.N(vVar5.f7337d, c0216p);
            m0 m0Var2 = c0746l5.f7300a;
            if (Intrinsics.a(m0Var2.f7800a.l(), m0Var2.f7803d.getValue())) {
                interfaceC0191c0.setValue(Boolean.FALSE);
            } else if (N3.getValue() != null) {
                interfaceC0191c0.setValue(Boolean.TRUE);
            }
            boolean booleanValue = ((Boolean) interfaceC0191c0.getValue()).booleanValue();
            o oVar2 = S.l.f3977a;
            if (booleanValue) {
                c0216p.S(249037309);
                g0 a4 = s0.a(c0746l5.f7300a, w0.f7863h, null, c0216p, 0, 2);
                boolean f6 = c0216p.f(a4);
                Object I8 = c0216p.I();
                if (f6 || I8 == obj) {
                    M m4 = (M) N3.getValue();
                    if (m4 == null || m4.f7265a) {
                        oVar2 = l.V(oVar2);
                    }
                    I8 = oVar2.h(new C0745k(c0746l5, a4, N3));
                    c0216p.c0(I8);
                }
                oVar2 = (o) I8;
                c0216p.q(r13);
            } else {
                c0216p.S(249353726);
                c0216p.q(r13);
            }
            o h4 = oVar.h(oVar2);
            Object I9 = c0216p.I();
            if (I9 == obj) {
                I9 = new C0741g(c0746l5);
                c0216p.c0(I9);
            }
            C0741g c0741g = (C0741g) I9;
            int i9 = c0216p.f2861P;
            InterfaceC0213n0 m5 = c0216p.m();
            o d4 = S.a.d(c0216p, h4);
            InterfaceC1070k.f9822h.getClass();
            C1068i c1068i = C1069j.f9816b;
            c0216p.W();
            if (c0216p.f2860O) {
                c0216p.l(c1068i);
            } else {
                c0216p.f0();
            }
            C0192d.R(c0216p, c0741g, C1069j.f9820f);
            C0192d.R(c0216p, m5, C1069j.f9819e);
            C1067h c1067h = C1069j.f9821g;
            if (c0216p.f2860O || !Intrinsics.a(c0216p.I(), Integer.valueOf(i9))) {
                AbstractC0017m.r(i9, c0216p, i9, c1067h);
            }
            C0192d.R(c0216p, d4, C1069j.f9818d);
            c0216p.S(-1491001814);
            int size2 = vVar.size();
            int i10 = r13;
            while (i10 < size2) {
                v vVar6 = vVar;
                Object obj5 = vVar6.get(i10);
                c0216p.O(1908315325, r13, function12.invoke(obj5), null);
                Function2 function2 = (Function2) yVar.e(obj5);
                if (function2 == null) {
                    c0216p.S(-971711888);
                } else {
                    c0216p.S(1908317105);
                    function2.h(c0216p, Integer.valueOf((int) r13));
                }
                c0216p.q(r13);
                c0216p.q(r13);
                i10++;
                vVar = vVar6;
            }
            c0216p.q(r13);
            c0216p.q(true);
        }
        C0222s0 s4 = c0216p.s();
        if (s4 != null) {
            s4.f2903d = new B(m0Var, oVar, function1, cVar, function12, aVar, i2);
        }
    }

    public static final void c(String athleteId, Function0 onBack, C0216p c0216p, int i2) {
        int i4;
        Object obj;
        String str;
        String str2;
        Object obj2;
        boolean z4;
        InterfaceC0191c0 interfaceC0191c0;
        String str3;
        Object obj3;
        boolean z5;
        Intrinsics.checkNotNullParameter(athleteId, "athleteId");
        Intrinsics.checkNotNullParameter(onBack, "onBack");
        c0216p.U(-997628950);
        if ((i2 & 6) == 0) {
            i4 = (c0216p.f(athleteId) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= c0216p.h(onBack) ? 32 : 16;
        }
        if ((i4 & 19) == 18 && c0216p.z()) {
            c0216p.N();
        } else {
            ListIterator listIterator = AbstractC1366J.f11818d.listIterator();
            while (true) {
                A2.b bVar = (A2.b) listIterator;
                if (!bVar.hasNext()) {
                    obj = null;
                    break;
                } else {
                    obj = bVar.next();
                    if (Intrinsics.a(((C1377c) obj).f11851a, athleteId)) {
                        break;
                    }
                }
            }
            final C1377c c1377c = (C1377c) obj;
            c0216p.S(-1669036461);
            S.e eVar = S.b.f3963r;
            E1.i iVar = K.f4461a;
            if (c1377c == null) {
                o b4 = androidx.compose.foundation.a.b(androidx.compose.foundation.layout.c.f5082b, AbstractC1365I.f11800a, iVar);
                C1041t a4 = AbstractC1039r.a(AbstractC1031j.f9267c, eVar, c0216p, 0);
                int i5 = c0216p.f2861P;
                InterfaceC0213n0 m4 = c0216p.m();
                o d4 = S.a.d(c0216p, b4);
                InterfaceC1070k.f9822h.getClass();
                Function0 function0 = C1069j.f9816b;
                c0216p.W();
                if (c0216p.f2860O) {
                    c0216p.l(function0);
                } else {
                    c0216p.f0();
                }
                C0192d.R(c0216p, a4, C1069j.f9820f);
                C0192d.R(c0216p, m4, C1069j.f9819e);
                C1067h c1067h = C1069j.f9821g;
                if (c0216p.f2860O || !Intrinsics.a(c0216p.I(), Integer.valueOf(i5))) {
                    AbstractC0017m.r(i5, c0216p, i5, c1067h);
                }
                C0192d.R(c0216p, d4, C1069j.f9818d);
                e("Athlete not found", onBack, c0216p, (i4 & 112) | 6);
                AbstractC0864b.e("Missing athlete", "This athlete was removed.", null, null, c0216p, 54, 12);
                c0216p.q(true);
                c0216p.q(false);
                C0222s0 s4 = c0216p.s();
                if (s4 != null) {
                    s4.f2903d = new C0044a(athleteId, onBack, i2, 0);
                    return;
                }
                return;
            }
            Object f4 = AbstractC0017m.f(c0216p, false, -1669028285);
            Object obj4 = C0208l.f2826a;
            W w4 = W.f2779l;
            if (f4 == obj4) {
                f4 = C0192d.K(Boolean.FALSE, w4);
                c0216p.c0(f4);
            }
            final InterfaceC0191c0 interfaceC0191c02 = (InterfaceC0191c0) f4;
            Object f5 = AbstractC0017m.f(c0216p, false, -1669026621);
            if (f5 == obj4) {
                f5 = C0192d.K(Boolean.FALSE, w4);
                c0216p.c0(f5);
            }
            InterfaceC0191c0 interfaceC0191c03 = (InterfaceC0191c0) f5;
            c0216p.q(false);
            v vVar = AbstractC1366J.f11825k;
            final ArrayList arrayList = new ArrayList();
            ListIterator listIterator2 = vVar.listIterator();
            while (true) {
                A2.b bVar2 = (A2.b) listIterator2;
                boolean hasNext = bVar2.hasNext();
                str = c1377c.f11851a;
                if (!hasNext) {
                    break;
                }
                Object next = bVar2.next();
                if (Intrinsics.a(((C1379e) next).f11859b, str)) {
                    arrayList.add(next);
                }
            }
            v vVar2 = AbstractC1366J.f11823i;
            final ArrayList arrayList2 = new ArrayList();
            ListIterator listIterator3 = vVar2.listIterator();
            while (true) {
                A2.b bVar3 = (A2.b) listIterator3;
                boolean hasNext2 = bVar3.hasNext();
                ListIterator listIterator4 = listIterator3;
                str2 = c1377c.f11852b;
                if (!hasNext2) {
                    break;
                }
                Object next2 = bVar3.next();
                InterfaceC0191c0 interfaceC0191c04 = interfaceC0191c03;
                if (u.i(true, ((C1361E) next2).f11788c, str2)) {
                    arrayList2.add(next2);
                }
                interfaceC0191c03 = interfaceC0191c04;
                listIterator3 = listIterator4;
            }
            final InterfaceC0191c0 interfaceC0191c05 = interfaceC0191c03;
            v vVar3 = AbstractC1366J.f11824j;
            ArrayList arrayList3 = new ArrayList();
            ListIterator listIterator5 = vVar3.listIterator();
            while (true) {
                A2.b bVar4 = (A2.b) listIterator5;
                if (!bVar4.hasNext()) {
                    break;
                }
                Object next3 = bVar4.next();
                ListIterator listIterator6 = listIterator5;
                if (Intrinsics.a(((C1374S) next3).f11844b, str)) {
                    arrayList3.add(next3);
                }
                listIterator5 = listIterator6;
            }
            final List D3 = C1403G.D(arrayList3, new C0062j(0));
            FillElement fillElement = androidx.compose.foundation.layout.c.f5082b;
            o b5 = androidx.compose.foundation.a.b(fillElement, AbstractC1365I.f11800a, iVar);
            C1041t a5 = AbstractC1039r.a(AbstractC1031j.f9267c, eVar, c0216p, 0);
            int i6 = c0216p.f2861P;
            InterfaceC0213n0 m5 = c0216p.m();
            o d5 = S.a.d(c0216p, b5);
            InterfaceC1070k.f9822h.getClass();
            Function0 function02 = C1069j.f9816b;
            c0216p.W();
            if (c0216p.f2860O) {
                c0216p.l(function02);
            } else {
                c0216p.f0();
            }
            C0192d.R(c0216p, a5, C1069j.f9820f);
            C0192d.R(c0216p, m5, C1069j.f9819e);
            C1067h c1067h2 = C1069j.f9821g;
            if (c0216p.f2860O || !Intrinsics.a(c0216p.I(), Integer.valueOf(i6))) {
                AbstractC0017m.r(i6, c0216p, i6, c1067h2);
            }
            C0192d.R(c0216p, d5, C1069j.f9818d);
            e(str2, onBack, c0216p, i4 & 112);
            o h4 = androidx.compose.foundation.layout.b.h(fillElement, 14);
            C1028g c1028g = new C1028g(10);
            c0216p.S(546721015);
            boolean h5 = c0216p.h(c1377c) | c0216p.h(arrayList) | c0216p.h(arrayList2) | c0216p.h(D3);
            Object I3 = c0216p.I();
            if (h5 || I3 == obj4) {
                obj2 = obj4;
                z4 = false;
                interfaceC0191c0 = interfaceC0191c05;
                str3 = str;
                I3 = new Function1() { // from class: A1.b
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj5) {
                        r.g LazyColumn = (r.g) obj5;
                        Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
                        C1377c c1377c2 = C1377c.this;
                        r.g.a(LazyColumn, new O.a(1237512992, true, new C0064k(1, c1377c2)));
                        r.g.a(LazyColumn, new O.a(125797065, true, new C0066l(c1377c2, interfaceC0191c02, 1)));
                        r.g.a(LazyColumn, new O.a(571334376, true, new C0072o(arrayList, interfaceC0191c05, 1)));
                        r.g.a(LazyColumn, new O.a(1016871687, true, new C0074p(1, arrayList2)));
                        r.g.a(LazyColumn, new O.a(1462408998, true, new C0076q(1, D3)));
                        return Unit.f7487a;
                    }
                };
                c0216p.c0(I3);
            } else {
                obj2 = obj4;
                interfaceC0191c0 = interfaceC0191c05;
                str3 = str;
                z4 = false;
            }
            c0216p.q(z4);
            InterfaceC0191c0 interfaceC0191c06 = interfaceC0191c0;
            s.a(h4, null, null, false, c1028g, null, null, false, (Function1) I3, c0216p, 24582, 238);
            c0216p.q(true);
            c0216p.S(-1668850267);
            if (((Boolean) interfaceC0191c02.getValue()).booleanValue()) {
                c0216p.S(-1668848780);
                Object I4 = c0216p.I();
                obj3 = obj2;
                if (I4 == obj3) {
                    I4 = new C0048c(0, interfaceC0191c02);
                    c0216p.c0(I4);
                }
                z5 = false;
                c0216p.q(false);
                f(c1377c, (Function0) I4, c0216p, 48);
            } else {
                obj3 = obj2;
                z5 = false;
            }
            c0216p.q(z5);
            if (((Boolean) interfaceC0191c06.getValue()).booleanValue()) {
                c0216p.S(-1668846478);
                Object I5 = c0216p.I();
                if (I5 == obj3) {
                    I5 = new C0048c(1, interfaceC0191c06);
                    c0216p.c0(I5);
                }
                c0216p.q(z5);
                a(str3, (Function0) I5, c0216p, 48);
            }
        }
        C0222s0 s5 = c0216p.s();
        if (s5 != null) {
            s5.f2903d = new C0044a(athleteId, onBack, i2, 1);
        }
    }

    public static final M0.d d(Context context) {
        float f4 = context.getResources().getConfiguration().fontScale;
        float f5 = context.getResources().getDisplayMetrics().density;
        N0.a a4 = N0.b.a(f4);
        if (a4 == null) {
            a4 = new M0.l(f4);
        }
        return new M0.d(f5, f4, a4);
    }

    public static final void e(String str, Function0 function0, C0216p c0216p, int i2) {
        int i4;
        c0216p.U(-2112607412);
        if ((i2 & 6) == 0) {
            i4 = (c0216p.f(str) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= c0216p.h(function0) ? 32 : 16;
        }
        int i5 = i4;
        if ((i5 & 19) == 18 && c0216p.z()) {
            c0216p.N();
        } else {
            o i6 = androidx.compose.foundation.layout.b.i(androidx.compose.foundation.a.a(androidx.compose.foundation.layout.c.f5081a, H1.f.q(new Pair[]{new Pair(Float.valueOf(0.0f), new C0323u(AbstractC1365I.f11804e)), new Pair(Float.valueOf(1.0f), new C0323u(AbstractC1365I.f11805f))})), 8, 12);
            f0 b4 = e0.b(AbstractC1031j.f9265a, S.b.f3962q, c0216p, 48);
            int i7 = c0216p.f2861P;
            InterfaceC0213n0 m4 = c0216p.m();
            o d4 = S.a.d(c0216p, i6);
            InterfaceC1070k.f9822h.getClass();
            C1068i c1068i = C1069j.f9816b;
            c0216p.W();
            if (c0216p.f2860O) {
                c0216p.l(c1068i);
            } else {
                c0216p.f0();
            }
            C0192d.R(c0216p, b4, C1069j.f9820f);
            C0192d.R(c0216p, m4, C1069j.f9819e);
            C1067h c1067h = C1069j.f9821g;
            if (c0216p.f2860O || !Intrinsics.a(c0216p.I(), Integer.valueOf(i7))) {
                AbstractC0017m.r(i7, c0216p, i7, c1067h);
            }
            C0192d.R(c0216p, d4, C1069j.f9818d);
            D.W0.f(function0, null, false, null, null, AbstractC0082v.f737d, c0216p, ((i5 >> 3) & 14) | 196608);
            N1.b(str, null, AbstractC1365I.f11801b, l.k0(20), null, k.f2617l, r.f2625c, 0L, null, null, 0L, 0, false, 0, 0, null, null, c0216p, (i5 & 14) | 199680, 0, 130962);
            c0216p.q(true);
        }
        C0222s0 s4 = c0216p.s();
        if (s4 != null) {
            s4.f2903d = new C0044a(str, function0, i2, 3);
        }
    }

    public static final void f(C1377c c1377c, Function0 function0, C0216p c0216p, int i2) {
        int i4;
        c0216p.U(1964814190);
        if ((i2 & 6) == 0) {
            i4 = (c0216p.h(c1377c) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= c0216p.h(function0) ? 32 : 16;
        }
        int i5 = i4;
        if ((i5 & 19) == 18 && c0216p.z()) {
            c0216p.N();
        } else {
            c0216p.S(-918646893);
            Object I3 = c0216p.I();
            if (I3 == C0208l.f2826a) {
                I3 = C0192d.K(c1377c.f11857g, W.f2779l);
                c0216p.c0(I3);
            }
            InterfaceC0191c0 interfaceC0191c0 = (InterfaceC0191c0) I3;
            c0216p.q(false);
            D.W0.a(function0, f.b(868816934, new C0060i(c1377c, function0, interfaceC0191c0), c0216p), null, f.b(284045284, new C0056g(function0, 1), c0216p), null, AbstractC0082v.f740g, f.b(-593112191, new C0079s(0, interfaceC0191c0), c0216p), null, AbstractC1365I.f11801b, 0L, 0L, 0L, 0.0f, null, c0216p, ((i5 >> 3) & 14) | 1772592, 0, 16020);
        }
        C0222s0 s4 = c0216p.s();
        if (s4 != null) {
            s4.f2903d = new C0050d(i2, 0, c1377c, function0);
        }
    }

    public static final long g(int i2, int i4) {
        return (i4 & 4294967295L) | (i2 << 32);
    }

    public static final Y.d h(long j4, long j5) {
        return new Y.d(Y.c.d(j4), Y.c.e(j4), Y.f.d(j5) + Y.c.d(j4), Y.f.b(j5) + Y.c.e(j4));
    }

    public static final void i(boolean z4, h hVar, a0 a0Var, C0216p c0216p, int i2) {
        int i4;
        c0216p.U(-1344558920);
        if ((i2 & 6) == 0) {
            i4 = (c0216p.g(z4) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= c0216p.f(hVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= c0216p.h(a0Var) ? 256 : 128;
        }
        if ((i4 & 147) == 146 && c0216p.z()) {
            c0216p.N();
        } else {
            int i5 = i4 & 14;
            boolean f4 = (i5 == 4) | c0216p.f(a0Var);
            Object I3 = c0216p.I();
            Object obj = C0208l.f2826a;
            if (f4 || I3 == obj) {
                I3 = new Y(a0Var, z4);
                c0216p.c0(I3);
            }
            w.Y y4 = (w.Y) I3;
            boolean h4 = c0216p.h(a0Var) | (i5 == 4);
            Object I4 = c0216p.I();
            if (h4 || I4 == obj) {
                I4 = new b0(a0Var, z4);
                c0216p.c0(I4);
            }
            InterfaceC0019o interfaceC0019o = (InterfaceC0019o) I4;
            boolean f5 = A0.K.f(a0Var.j().f3094b);
            S.l lVar = S.l.f3977a;
            boolean h5 = c0216p.h(y4);
            Object I5 = c0216p.I();
            if (h5 || I5 == obj) {
                I5 = new c0(y4, null);
                c0216p.c0(I5);
            }
            M1.a.h(interfaceC0019o, z4, hVar, f5, 0L, w.a(lVar, y4, (Function2) I5), c0216p, (i4 << 3) & 1008);
        }
        C0222s0 s4 = c0216p.s();
        if (s4 != null) {
            s4.f2903d = new C0011g(z4, hVar, a0Var, i2);
        }
    }

    public static final A.r j(V v4, InterfaceC0015k interfaceC0015k) {
        boolean z4 = v4.d() == 1;
        C0020p c0020p = (C0020p) v4.f63d;
        return new A.r(m(c0020p, z4, true, interfaceC0015k), m(c0020p, z4, false, interfaceC0015k), z4);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x0082 -> B:13:0x0065). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x0085 -> B:13:0x0065). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object k(List list, C0618l c0618l, E2.c cVar) {
        C0612f c0612f;
        int i2;
        List list2;
        E e4;
        Iterator it;
        Throwable th;
        if (cVar instanceof C0612f) {
            c0612f = (C0612f) cVar;
            int i4 = c0612f.f6574m;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                c0612f.f6574m = i4 - Integer.MIN_VALUE;
                Object obj = c0612f.f6573l;
                Object obj2 = D2.a.f2163d;
                i2 = c0612f.f6574m;
                if (i2 != 0) {
                    AbstractC1343r.b(obj);
                    ArrayList arrayList = new ArrayList();
                    C0614h c0614h = new C0614h(list, arrayList, null);
                    c0612f.f6571j = arrayList;
                    c0612f.f6574m = 1;
                    if (c0618l.a(c0614h, c0612f) == obj2) {
                        return obj2;
                    }
                    list2 = arrayList;
                } else {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        it = c0612f.f6572k;
                        e4 = (E) c0612f.f6571j;
                        try {
                            AbstractC1343r.b(obj);
                        } catch (Throwable th2) {
                            Object obj3 = e4.f3580d;
                            if (obj3 == null) {
                                e4.f3580d = th2;
                            } else {
                                C1331f.a((Throwable) obj3, th2);
                            }
                        }
                        while (it.hasNext()) {
                            Function1 function1 = (Function1) it.next();
                            c0612f.f6571j = e4;
                            c0612f.f6572k = it;
                            c0612f.f6574m = 2;
                            if (function1.invoke(c0612f) == obj2) {
                                return obj2;
                            }
                        }
                        th = (Throwable) e4.f3580d;
                        if (th == null) {
                            return Unit.f7487a;
                        }
                        throw th;
                    }
                    list2 = (List) c0612f.f6571j;
                    AbstractC1343r.b(obj);
                }
                e4 = new E();
                it = list2.iterator();
                while (it.hasNext()) {
                }
                th = (Throwable) e4.f3580d;
                if (th == null) {
                }
            }
        }
        c0612f = new C0612f(cVar);
        Object obj4 = c0612f.f6573l;
        Object obj22 = D2.a.f2163d;
        i2 = c0612f.f6574m;
        if (i2 != 0) {
        }
        e4 = new E();
        it = list2.iterator();
        while (it.hasNext()) {
        }
        th = (Throwable) e4.f3580d;
        if (th == null) {
        }
    }

    public static final C0021q l(V v4, C0020p c0020p, C0021q c0021q) {
        boolean z4 = v4.f61b;
        int i2 = c0020p.f173c;
        int i4 = c0020p.f172b;
        int i5 = z4 ? i4 : i2;
        EnumC1337l enumC1337l = EnumC1337l.f11671e;
        InterfaceC1335j b4 = C1336k.b(enumC1337l, new C0025v(c0020p, i5));
        InterfaceC1335j b5 = C1336k.b(enumC1337l, new C0024u(c0020p, i5, z4 ? i2 : i4, v4, b4));
        if (1 != c0021q.f178c) {
            return (C0021q) b5.getValue();
        }
        int i6 = c0020p.f174d;
        if (i5 == i6) {
            return c0021q;
        }
        I i7 = (I) c0020p.f175e;
        if (((Number) b4.getValue()).intValue() != i7.e(i6)) {
            return (C0021q) b5.getValue();
        }
        int i8 = c0021q.f177b;
        long k4 = i7.k(i8);
        if (i6 != -1) {
            if (i5 != i6) {
                if (!(z4 ^ (i4 >= i2 && i4 > i2))) {
                }
            }
            return c0020p.a(i5);
        }
        int i9 = A0.K.f300c;
        return (i8 == ((int) (k4 >> 32)) || i8 == ((int) (4294967295L & k4))) ? (C0021q) b5.getValue() : c0020p.a(i5);
    }

    public static final C0021q m(C0020p c0020p, boolean z4, boolean z5, InterfaceC0015k interfaceC0015k) {
        long j4;
        long a4 = interfaceC0015k.a(c0020p, z5 ? c0020p.f172b : c0020p.f173c);
        if (z4 ^ z5) {
            int i2 = A0.K.f300c;
            j4 = a4 >> 32;
        } else {
            int i4 = A0.K.f300c;
            j4 = 4294967295L & a4;
        }
        return c0020p.a((int) j4);
    }

    public static final g3.f n(String serialName, u3.d kind, SerialDescriptor[] typeParameters, Function1 builder) {
        Intrinsics.checkNotNullParameter(serialName, "serialName");
        Intrinsics.checkNotNullParameter(kind, "kind");
        Intrinsics.checkNotNullParameter(typeParameters, "typeParameters");
        Intrinsics.checkNotNullParameter(builder, "builder");
        if (y.x(serialName)) {
            throw new IllegalArgumentException("Blank serial names are prohibited");
        }
        if (kind.equals(g3.i.f6807h)) {
            throw new IllegalArgumentException("For StructureKind.CLASS please use 'buildClassSerialDescriptor' instead");
        }
        g3.a aVar = new g3.a(serialName);
        builder.invoke(aVar);
        return new g3.f(serialName, kind, aVar.f6778c.size(), C1439w.z(typeParameters), aVar);
    }

    public static final C0021q r(C0021q c0021q, C0020p c0020p, int i2) {
        return new C0021q(((I) c0020p.f175e).a(i2), i2, c0021q.f178c);
    }

    public static void s(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static Handler t(Looper looper) {
        if (Build.VERSION.SDK_INT >= 28) {
            return X0.d.a(looper);
        }
        try {
            return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
        } catch (IllegalAccessException e4) {
            e = e4;
            Log.w("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
            return new Handler(looper);
        } catch (InstantiationException e5) {
            e = e5;
            Log.w("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
            return new Handler(looper);
        } catch (NoSuchMethodException e6) {
            e = e6;
            Log.w("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
            return new Handler(looper);
        } catch (InvocationTargetException e7) {
            Throwable cause = e7.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException(cause);
        }
    }

    public static int u(String str, int i2, int i4, boolean z4) {
        while (i2 < i4) {
            char charAt = str.charAt(i2);
            if (((charAt < ' ' && charAt != '\t') || charAt >= 127 || ('0' <= charAt && charAt < ':') || (('a' <= charAt && charAt < '{') || (('A' <= charAt && charAt < '[') || charAt == ':'))) == (!z4)) {
                return i2;
            }
            i2++;
        }
        return i4;
    }

    public static final boolean v(int i2, int i4) {
        return i2 == i4;
    }

    public static final boolean w(int i2, int i4) {
        return i2 == i4;
    }

    public static String x(List list, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "");
        int size = list.size();
        int i2 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            Object obj = list.get(i4);
            i2++;
            if (i2 > 1) {
                sb.append((CharSequence) str);
            }
            if (obj != null ? obj instanceof CharSequence : true) {
                sb.append((CharSequence) obj);
            } else if (obj instanceof Character) {
                sb.append(((Character) obj).charValue());
            } else {
                sb.append((CharSequence) String.valueOf(obj));
            }
        }
        sb.append((CharSequence) "");
        return sb.toString();
    }

    public static final C0585f y() {
        C0585f c0585f = f7137a;
        if (c0585f != null) {
            return c0585f;
        }
        C0584e c0584e = new C0584e("Outlined.Add", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        C1405I c1405i = AbstractC0576G.f6305a;
        S s4 = new S(C0323u.f4542b);
        W0 w02 = new W0(1);
        w02.j(19.0f, 13.0f);
        w02.g(-6.0f);
        w02.o(6.0f);
        w02.g(-2.0f);
        w02.o(-6.0f);
        w02.f(5.0f);
        w02.o(-2.0f);
        w02.g(6.0f);
        w02.n(5.0f);
        w02.g(2.0f);
        w02.o(6.0f);
        w02.g(6.0f);
        w02.o(2.0f);
        w02.c();
        C0584e.a(c0584e, w02.f2781d, s4);
        C0585f b4 = c0584e.b();
        f7137a = b4;
        return b4;
    }

    public static final int z(k kVar, int i2) {
        boolean z4 = Intrinsics.e(kVar.f2618d, k.f2613e.f2618d) >= 0;
        boolean a4 = F0.i.a(i2, 1);
        if (a4 && z4) {
            return 3;
        }
        if (z4) {
            return 1;
        }
        return a4 ? 2 : 0;
    }

    public abstract void G(g gVar, g gVar2);

    public abstract void H(g gVar, Thread thread);

    public abstract boolean o(Q0.h hVar, Q0.d dVar);

    public abstract boolean p(Q0.h hVar, Object obj, Object obj2);

    public abstract boolean q(Q0.h hVar, g gVar, g gVar2);
}
