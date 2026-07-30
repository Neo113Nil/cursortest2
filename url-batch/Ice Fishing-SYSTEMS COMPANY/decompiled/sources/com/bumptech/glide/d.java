package com.bumptech.glide;

import B1.w;
import N3.r;
import U.q;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.PasswordTransformationMethod;
import android.view.ActionMode;
import android.widget.TextView;
import androidx.fragment.app.C0471d;
import e.C4462a;
import e8.A;
import e8.C4484b;
import h4.C4568a;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.Method;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import m.Q0;
import m.Z;
import r7.AbstractC4978i;
import r7.C4985p;
import z7.AbstractC5283a;

/* loaded from: classes.dex */
public abstract class d {
    public d() {
        new ConcurrentHashMap();
    }

    public static ActionMode.Callback A(ActionMode.Callback callback, TextView textView) {
        int i = Build.VERSION.SDK_INT;
        return (i < 26 || i > 27 || (callback instanceof q) || callback == null) ? callback : new q(callback, textView);
    }

    public static Object a(Parcel parcel, Parcelable.Creator creator) {
        if (parcel.readInt() != 0) {
            return creator.createFromParcel(parcel);
        }
        return null;
    }

    public static void b(Throwable th, Throwable exception) {
        kotlin.jvm.internal.h.e(th, "<this>");
        kotlin.jvm.internal.h.e(exception, "exception");
        if (th != exception) {
            Integer num = A7.a.f41a;
            if (num == null || num.intValue() >= 19) {
                th.addSuppressed(exception);
                return;
            }
            Method method = AbstractC5283a.f42179a;
            if (method != null) {
                method.invoke(th, exception);
            }
        }
    }

    public static final Y7.f c(String str, e eVar, Y7.e[] eVarArr, E7.l lVar) {
        if (M7.j.T(str)) {
            throw new IllegalArgumentException("Blank serial names are prohibited");
        }
        if (eVar.equals(Y7.i.f4056g)) {
            throw new IllegalArgumentException("For StructureKind.CLASS please use 'buildClassSerialDescriptor' instead");
        }
        Y7.a aVar = new Y7.a(str);
        lVar.invoke(aVar);
        return new Y7.f(str, eVar, aVar.f4028b.size(), AbstractC4978i.P(eVarArr), aVar);
    }

    public static final double e(double d2, N7.c cVar, N7.c targetUnit) {
        kotlin.jvm.internal.h.e(targetUnit, "targetUnit");
        long convert = targetUnit.f2210n.convert(1L, cVar.f2210n);
        return convert > 0 ? d2 * convert : d2 / r8.convert(1L, r9);
    }

    public static final long f(long j9, N7.c sourceUnit, N7.c targetUnit) {
        kotlin.jvm.internal.h.e(sourceUnit, "sourceUnit");
        kotlin.jvm.internal.h.e(targetUnit, "targetUnit");
        return targetUnit.f2210n.convert(j9, sourceUnit.f2210n);
    }

    public static N3.b g(String str, String str2) {
        C4568a c4568a = new C4568a(str, str2);
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(r.a(C4568a.class));
        return new N3.b(null, new HashSet(hashSet), new HashSet(hashSet2), 0, 1, new F3.l(1, c4568a), hashSet3);
    }

    public static N3.b m(String str, w wVar) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(r.a(C4568a.class));
        for (Class cls : new Class[0]) {
            Z5.c.b(cls, "Null interface");
            hashSet.add(r.a(cls));
        }
        N3.j a9 = N3.j.a(Context.class);
        if (hashSet.contains(a9.f2177a)) {
            throw new IllegalArgumentException("Components are not allowed to depend on interfaces they themselves provide.");
        }
        hashSet2.add(a9);
        return new N3.b(null, new HashSet(hashSet), new HashSet(hashSet2), 0, 1, new C0471d(6, str, wVar), hashSet3);
    }

    public static e8.l n(SSLSession sSLSession) {
        Object obj;
        String cipherSuite = sSLSession.getCipherSuite();
        if (cipherSuite == null) {
            throw new IllegalStateException("cipherSuite == null");
        }
        if (cipherSuite.equals("TLS_NULL_WITH_NULL_NULL") || cipherSuite.equals("SSL_NULL_WITH_NULL_NULL")) {
            throw new IOException("cipherSuite == ".concat(cipherSuite));
        }
        e8.f b9 = e8.f.f37372b.b(cipherSuite);
        String protocol = sSLSession.getProtocol();
        if (protocol == null) {
            throw new IllegalStateException("tlsVersion == null");
        }
        if ("NONE".equals(protocol)) {
            throw new IOException("tlsVersion == NONE");
        }
        A.f37336u.getClass();
        A c4 = C4484b.c(protocol);
        try {
            obj = f8.d.k(sSLSession.getPeerCertificates());
        } catch (SSLPeerUnverifiedException unused) {
            obj = C4985p.f40358n;
        }
        return new e8.l(c4, b9, f8.d.k(sSLSession.getLocalCertificates()), new Y5.l(2, obj));
    }

    public static ColorStateList o(Context context, TypedArray typedArray, int i) {
        int resourceId;
        ColorStateList c4;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (c4 = E.e.c(context, resourceId)) == null) ? typedArray.getColorStateList(i) : c4;
    }

    public static ColorStateList p(Context context, Q0 q02, int i) {
        int resourceId;
        ColorStateList c4;
        TypedArray typedArray = (TypedArray) q02.f39326c;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (c4 = E.e.c(context, resourceId)) == null) ? q02.f(i) : c4;
    }

    public static ColorStateList q(Drawable drawable) {
        ColorStateList colorStateList;
        if (drawable instanceof ColorDrawable) {
            return ColorStateList.valueOf(((ColorDrawable) drawable).getColor());
        }
        if (Build.VERSION.SDK_INT < 29 || !f4.m.o(drawable)) {
            return null;
        }
        colorStateList = f4.m.d(drawable).getColorStateList();
        return colorStateList;
    }

    public static Drawable r(Context context, TypedArray typedArray, int i) {
        int resourceId;
        Drawable h9;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (h9 = f.h(context, resourceId)) == null) ? typedArray.getDrawable(i) : h9;
    }

    public static Object s(String str, Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 34) {
            return K.d.a(bundle, str, C4462a.class);
        }
        Parcelable parcelable = bundle.getParcelable(str);
        if (C4462a.class.isInstance(parcelable)) {
            return parcelable;
        }
        return null;
    }

    public static M.e t(Z z8) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            return new M.e(U.o.c(z8));
        }
        TextPaint textPaint = new TextPaint(z8.getPaint());
        TextDirectionHeuristic textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR;
        int a9 = U.m.a(z8);
        int d2 = U.m.d(z8);
        if (z8.getTransformationMethod() instanceof PasswordTransformationMethod) {
            textDirectionHeuristic = TextDirectionHeuristics.LTR;
        } else {
            if (i < 28 || (z8.getInputType() & 15) != 3) {
                boolean z9 = z8.getLayoutDirection() == 1;
                switch (z8.getTextDirection()) {
                    case 2:
                        textDirectionHeuristic = TextDirectionHeuristics.ANYRTL_LTR;
                        break;
                    case 3:
                        textDirectionHeuristic = TextDirectionHeuristics.LTR;
                        break;
                    case 4:
                        textDirectionHeuristic = TextDirectionHeuristics.RTL;
                        break;
                    case 5:
                        textDirectionHeuristic = TextDirectionHeuristics.LOCALE;
                        break;
                    case 6:
                        break;
                    case 7:
                        textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_RTL;
                        break;
                    default:
                        if (z9) {
                            textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_RTL;
                            break;
                        }
                        break;
                }
            } else {
                byte directionality = Character.getDirectionality(U.o.b(U.n.a(z8.getTextLocale()))[0].codePointAt(0));
                textDirectionHeuristic = (directionality == 1 || directionality == 2) ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR;
            }
        }
        return new M.e(textPaint, textDirectionHeuristic, a9, d2);
    }

    public static boolean u(Context context) {
        return context.getResources().getConfiguration().fontScale >= 1.3f;
    }

    public static void v(TextView textView, int i) {
        S0.f.e(i);
        if (Build.VERSION.SDK_INT >= 28) {
            U.o.d(textView, i);
            return;
        }
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i4 = textView.getIncludeFontPadding() ? fontMetricsInt.top : fontMetricsInt.ascent;
        if (i > Math.abs(i4)) {
            textView.setPadding(textView.getPaddingLeft(), i + i4, textView.getPaddingRight(), textView.getPaddingBottom());
        }
    }

    public static void w(TextView textView, int i) {
        S0.f.e(i);
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i4 = textView.getIncludeFontPadding() ? fontMetricsInt.bottom : fontMetricsInt.descent;
        if (i > Math.abs(i4)) {
            textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), i - i4);
        }
    }

    public static void x(TextView textView, int i) {
        S0.f.e(i);
        if (i != textView.getPaint().getFontMetricsInt(null)) {
            textView.setLineSpacing(i - r0, 1.0f);
        }
    }

    public static String y(Throwable th) {
        kotlin.jvm.internal.h.e(th, "<this>");
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        th.printStackTrace(printWriter);
        printWriter.flush();
        String stringWriter2 = stringWriter.toString();
        kotlin.jvm.internal.h.d(stringWriter2, "toString(...)");
        return stringWriter2;
    }

    public static ActionMode.Callback z(ActionMode.Callback callback) {
        return (!(callback instanceof q) || Build.VERSION.SDK_INT < 26) ? callback : ((q) callback).f3207a;
    }

    public abstract List d(String str, List list);

    public abstract Typeface h(Context context, F.g gVar, Resources resources, int i);

    public abstract Typeface i(Context context, L.h[] hVarArr, int i);

    public Typeface j(Context context, InputStream inputStream) {
        File o9 = e.o(context);
        if (o9 == null) {
            return null;
        }
        try {
            if (e.j(o9, inputStream)) {
                return Typeface.createFromFile(o9.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            o9.delete();
        }
    }

    public Typeface k(Context context, Resources resources, int i, String str, int i4) {
        File o9 = e.o(context);
        if (o9 == null) {
            return null;
        }
        try {
            if (e.i(o9, resources, i)) {
                return Typeface.createFromFile(o9.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            o9.delete();
        }
    }

    public L.h l(L.h[] hVarArr, int i) {
        int i4 = (i & 1) == 0 ? 400 : com.anythink.core.common.m.a.f14558n;
        boolean z8 = (i & 2) != 0;
        L.h hVar = null;
        int i9 = Integer.MAX_VALUE;
        for (L.h hVar2 : hVarArr) {
            int abs = (Math.abs(hVar2.f1688c - i4) * 2) + (hVar2.f1689d == z8 ? 0 : 1);
            if (hVar == null || i9 > abs) {
                hVar = hVar2;
                i9 = abs;
            }
        }
        return hVar;
    }
}
