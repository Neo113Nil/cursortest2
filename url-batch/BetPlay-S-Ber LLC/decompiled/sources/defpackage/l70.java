package defpackage;

import android.app.ActionBar;
import android.app.Activity;
import android.app.Dialog;
import android.content.ComponentName;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import android.util.Xml;
import android.view.Display;
import android.view.KeyEvent;
import android.view.RoundedCorner;
import android.view.View;
import android.view.Window;
import android.view.inputmethod.EditorInfo;
import android.widget.TextView;
import com.awerser.monnit.betplay.R;
import com.google.android.material.appbar.MaterialToolbar;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;
import java.util.zip.DataFormatException;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.Inflater;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public abstract class l70 {
    public static Method h = null;
    public static boolean i = false;
    public static boolean k = false;
    public static Method l = null;
    public static boolean m = false;
    public static Field n;
    public static final float[][] a = {new float[]{0.401288f, 0.650173f, -0.051461f}, new float[]{-0.250268f, 1.204414f, 0.045854f}, new float[]{-0.002079f, 0.048952f, 0.953127f}};
    public static final float[][] b = {new float[]{1.8620678f, -1.0112547f, 0.14918678f}, new float[]{0.38752654f, 0.62144744f, -0.00897398f}, new float[]{-0.0158415f, -0.03412294f, 1.0499644f}};
    public static final float[] c = {95.047f, 100.0f, 108.883f};
    public static final float[][] d = {new float[]{0.41233894f, 0.35762063f, 0.18051042f}, new float[]{0.2126f, 0.7152f, 0.0722f}, new float[]{0.01932141f, 0.11916382f, 0.9503448f}};
    public static final String[] e = {"standard", "accelerate", "decelerate", "linear"};
    public static final boolean[] f = new boolean[3];
    public static final Object g = new Object();
    public static final ma j = new ma(4);

    public static Typeface A(Configuration configuration, Typeface typeface) {
        int i2;
        int i3;
        int weight;
        int i4;
        Typeface create;
        if (Build.VERSION.SDK_INT < 31) {
            return null;
        }
        i2 = configuration.fontWeightAdjustment;
        if (i2 == Integer.MAX_VALUE) {
            return null;
        }
        i3 = configuration.fontWeightAdjustment;
        if (i3 == 0 || typeface == null) {
            return null;
        }
        weight = typeface.getWeight();
        i4 = configuration.fontWeightAdjustment;
        create = Typeface.create(typeface, i(i4 + weight, 1, 1000), typeface.isItalic());
        return create;
    }

    public static nn B(String... strArr) {
        if (strArr.length % 2 != 0) {
            o8.j("Expected alternating header names and values");
            return null;
        }
        String[] strArr2 = (String[]) strArr.clone();
        int length = strArr2.length;
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3++) {
            String str = strArr2[i3];
            if (str == null) {
                o8.j("Headers cannot be null");
                return null;
            }
            strArr2[i3] = l40.q0(str).toString();
        }
        int t = t(0, strArr2.length - 1, 2);
        if (t >= 0) {
            while (true) {
                String str2 = strArr2[i2];
                String str3 = strArr2[i2 + 1];
                g(str2);
                h(str3, str2);
                if (i2 == t) {
                    break;
                }
                i2 += 2;
            }
        }
        return new nn(strArr2);
    }

    public static ob F(String str) {
        int i2;
        String str2;
        boolean e0 = t40.e0(str, "HTTP/1.", false);
        dy dyVar = dy.HTTP_1_0;
        if (e0) {
            i2 = 9;
            if (str.length() < 9 || str.charAt(8) != ' ') {
                throw new ProtocolException("Unexpected status line: ".concat(str));
            }
            int charAt = str.charAt(7) - '0';
            if (charAt != 0) {
                if (charAt != 1) {
                    throw new ProtocolException("Unexpected status line: ".concat(str));
                }
                dyVar = dy.HTTP_1_1;
            }
        } else {
            if (!t40.e0(str, "ICY ", false)) {
                throw new ProtocolException("Unexpected status line: ".concat(str));
            }
            i2 = 4;
        }
        int i3 = i2 + 3;
        if (str.length() < i3) {
            throw new ProtocolException("Unexpected status line: ".concat(str));
        }
        try {
            int parseInt = Integer.parseInt(str.substring(i2, i3));
            if (str.length() <= i3) {
                str2 = "";
            } else {
                if (str.charAt(i3) != ' ') {
                    throw new ProtocolException("Unexpected status line: ".concat(str));
                }
                str2 = str.substring(i2 + 4);
            }
            return new ob(dyVar, parseInt, str2);
        } catch (NumberFormatException unused) {
            throw new ProtocolException("Unexpected status line: ".concat(str));
        }
    }

    public static uj G(XmlResourceParser xmlResourceParser, Resources resources) {
        int next;
        int i2;
        int i3;
        int i4;
        TypedArray typedArray;
        do {
            next = xmlResourceParser.next();
            i2 = 2;
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next != 2) {
            throw new XmlPullParserException("No start tag found");
        }
        xmlResourceParser.require(2, null, "font-family");
        if (!xmlResourceParser.getName().equals("font-family")) {
            W(xmlResourceParser);
            return null;
        }
        TypedArray obtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), iy.b);
        int i5 = 0;
        String string = obtainAttributes.getString(0);
        String string2 = obtainAttributes.getString(5);
        String string3 = obtainAttributes.getString(6);
        String string4 = obtainAttributes.getString(2);
        int resourceId = obtainAttributes.getResourceId(1, 0);
        int i6 = 3;
        int integer = obtainAttributes.getInteger(3, 1);
        int integer2 = obtainAttributes.getInteger(4, 500);
        String string5 = obtainAttributes.getString(7);
        obtainAttributes.recycle();
        if (string == null || string2 == null) {
            ArrayList arrayList = new ArrayList();
            while (xmlResourceParser.next() != 3) {
                if (xmlResourceParser.getEventType() == 2) {
                    if (xmlResourceParser.getName().equals("font")) {
                        TypedArray obtainAttributes2 = resources.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), iy.c);
                        int i7 = obtainAttributes2.getInt(obtainAttributes2.hasValue(8) ? 8 : 1, 400);
                        boolean z = 1 == obtainAttributes2.getInt(obtainAttributes2.hasValue(6) ? 6 : 2, 0);
                        int i8 = obtainAttributes2.hasValue(9) ? 9 : 3;
                        String string6 = obtainAttributes2.getString(obtainAttributes2.hasValue(7) ? 7 : 4);
                        int i9 = obtainAttributes2.getInt(i8, 0);
                        int i10 = obtainAttributes2.hasValue(5) ? 5 : 0;
                        int resourceId2 = obtainAttributes2.getResourceId(i10, 0);
                        String string7 = obtainAttributes2.getString(i10);
                        obtainAttributes2.recycle();
                        while (xmlResourceParser.next() != 3) {
                            W(xmlResourceParser);
                        }
                        arrayList.add(new wj(string7, i7, z, string6, i9, resourceId2));
                    } else {
                        W(xmlResourceParser);
                    }
                }
            }
            if (arrayList.isEmpty()) {
                return null;
            }
            return new vj((wj[]) arrayList.toArray(new wj[0]));
        }
        List M = M(resources, resourceId);
        ArrayList arrayList2 = new ArrayList();
        while (xmlResourceParser.next() != i6) {
            if (xmlResourceParser.getEventType() == i2) {
                if (xmlResourceParser.getName().equals("fallback")) {
                    TypedArray obtainAttributes3 = resources.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), iy.d);
                    try {
                        String string8 = obtainAttributes3.getString(i5);
                        String string9 = obtainAttributes3.getString(1);
                        i4 = integer;
                        String string10 = obtainAttributes3.getString(i2);
                        if (string8 == null) {
                            typedArray = obtainAttributes3;
                            throw new XmlPullParserException("query attribute must be set in fallback element");
                        }
                        while (xmlResourceParser.next() != i6) {
                            W(xmlResourceParser);
                        }
                        try {
                            typedArray = obtainAttributes3;
                            i3 = i6;
                            try {
                                nj njVar = new nj(string, string2, string8, M, string9, string10);
                                typedArray.recycle();
                                arrayList2.add(njVar);
                            } catch (Throwable th) {
                                th = th;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            typedArray = obtainAttributes3;
                        }
                        th = th;
                    } catch (Throwable th3) {
                        th = th3;
                        typedArray = obtainAttributes3;
                    }
                    typedArray.recycle();
                    throw th;
                }
                i3 = i6;
                i4 = integer;
                W(xmlResourceParser);
                i6 = i3;
                integer = i4;
                i2 = 2;
                i5 = 0;
            }
        }
        int i11 = integer;
        if (!arrayList2.isEmpty()) {
            return new xj(arrayList2, i11, integer2, string5);
        }
        if (string3 == null) {
            o8.j("The provider font XML requires query attribute or fallback children.");
            return null;
        }
        arrayList2.add(new nj(string, string2, string3, M, null, null));
        if (string4 != null) {
            arrayList2.add(new nj(string, string2, string4, M, null, null));
        }
        return new xj(arrayList2, i11, integer2, string5);
    }

    public static PorterDuff.Mode H(int i2, PorterDuff.Mode mode) {
        if (i2 == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i2 == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i2 == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i2) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }

    public static final boolean I(String str) {
        str.getClass();
        return (str.equals("GET") || str.equals("HEAD")) ? false : true;
    }

    public static byte[] L(InputStream inputStream, int i2) {
        byte[] bArr = new byte[i2];
        int i3 = 0;
        while (i3 < i2) {
            int read = inputStream.read(bArr, i3, i2 - i3);
            if (read < 0) {
                o8.t(o30.e("Not enough bytes to read: ", i2));
                return null;
            }
            i3 += read;
        }
        return bArr;
    }

    public static List M(Resources resources, int i2) {
        if (i2 == 0) {
            return Collections.EMPTY_LIST;
        }
        TypedArray obtainTypedArray = resources.obtainTypedArray(i2);
        try {
            if (obtainTypedArray.length() == 0) {
                return Collections.EMPTY_LIST;
            }
            ArrayList arrayList = new ArrayList();
            if (obtainTypedArray.getType(0) == 1) {
                for (int i3 = 0; i3 < obtainTypedArray.length(); i3++) {
                    int resourceId = obtainTypedArray.getResourceId(i3, 0);
                    if (resourceId != 0) {
                        String[] stringArray = resources.getStringArray(resourceId);
                        ArrayList arrayList2 = new ArrayList();
                        for (String str : stringArray) {
                            arrayList2.add(Base64.decode(str, 0));
                        }
                        arrayList.add(arrayList2);
                    }
                }
            } else {
                String[] stringArray2 = resources.getStringArray(i2);
                ArrayList arrayList3 = new ArrayList();
                for (String str2 : stringArray2) {
                    arrayList3.add(Base64.decode(str2, 0));
                }
                arrayList.add(arrayList3);
            }
            return arrayList;
        } finally {
            obtainTypedArray.recycle();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x005d, code lost:
    
        if (r0.finished() == false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0062, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x006a, code lost:
    
        throw new java.lang.IllegalStateException("Inflater did not finish");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static byte[] N(FileInputStream fileInputStream, int i2, int i3) {
        Inflater inflater = new Inflater();
        try {
            byte[] bArr = new byte[i3];
            byte[] bArr2 = new byte[2048];
            int i4 = 0;
            int i5 = 0;
            while (!inflater.finished() && !inflater.needsDictionary() && i4 < i2) {
                int read = fileInputStream.read(bArr2);
                if (read < 0) {
                    throw new IllegalStateException("Invalid zip data. Stream ended after $totalBytesRead bytes. Expected " + i2 + " bytes");
                }
                inflater.setInput(bArr2, 0, read);
                try {
                    i5 += inflater.inflate(bArr, i5, i3 - i5);
                    i4 += read;
                } catch (DataFormatException e2) {
                    throw new IllegalStateException(e2.getMessage());
                }
            }
            throw new IllegalStateException("Didn't read enough bytes during decompression. expected=" + i2 + " actual=" + i4);
        } finally {
            inflater.end();
        }
    }

    public static long O(InputStream inputStream, int i2) {
        byte[] L = L(inputStream, i2);
        long j2 = 0;
        for (int i3 = 0; i3 < i2; i3++) {
            j2 += (L[i3] & 255) << (i3 * 8);
        }
        return j2;
    }

    public static TypedValue P(Resources.Theme theme, int i2) {
        TypedValue typedValue = new TypedValue();
        if (theme.resolveAttribute(i2, typedValue, true)) {
            return typedValue;
        }
        return null;
    }

    public static boolean Q(Resources.Theme theme, int i2, boolean z) {
        TypedValue P = P(theme, i2);
        return (P == null || P.type != 18) ? z : P.data != 0;
    }

    public static TypedValue R(Context context, int i2, String str) {
        TypedValue P = P(context.getTheme(), i2);
        if (P != null) {
            return P;
        }
        throw new IllegalArgumentException(String.format("%1$s requires a value for the %2$s attribute to be set in your app theme. You can either set the attribute in your theme or update your theme to inherit from Theme.MaterialComponents (or a descendant).", str, context.getResources().getResourceName(i2)));
    }

    public static TypedValue S(View view, int i2) {
        return R(view.getContext(), i2, view.getClass().getCanonicalName());
    }

    public static void V(EditorInfo editorInfo, CharSequence charSequence, int i2, int i3) {
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        editorInfo.extras.putCharSequence("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SURROUNDING_TEXT", charSequence != null ? new SpannableStringBuilder(charSequence) : null);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_HEAD", i2);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_END", i3);
    }

    public static void W(XmlPullParser xmlPullParser) {
        int i2 = 1;
        while (i2 > 0) {
            int next = xmlPullParser.next();
            if (next == 2) {
                i2++;
            } else if (next == 3) {
                i2--;
            }
        }
    }

    public static void X(ByteArrayOutputStream byteArrayOutputStream, long j2, int i2) {
        byte[] bArr = new byte[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            bArr[i3] = (byte) ((j2 >> (i3 * 8)) & 255);
        }
        byteArrayOutputStream.write(bArr);
    }

    public static void Y(ByteArrayOutputStream byteArrayOutputStream, int i2) {
        X(byteArrayOutputStream, i2, 2);
    }

    public static float Z() {
        return ((float) Math.pow(0.5689655172413793d, 3.0d)) * 100.0f;
    }

    public static void a(long j2, p8 p8Var, int i2, ArrayList arrayList, int i3, int i4, ArrayList arrayList2) {
        int i5;
        int i6;
        ArrayList arrayList3;
        long j3;
        int i7;
        int i8 = i2;
        ArrayList arrayList4 = arrayList;
        ArrayList arrayList5 = arrayList2;
        if (i3 >= i4) {
            o8.j("Failed requirement.");
            return;
        }
        for (int i9 = i3; i9 < i4; i9++) {
            if (((t8) arrayList4.get(i9)).a() < i8) {
                o8.j("Failed requirement.");
                return;
            }
        }
        t8 t8Var = (t8) arrayList.get(i3);
        t8 t8Var2 = (t8) arrayList4.get(i4 - 1);
        if (i8 == t8Var.a()) {
            int intValue = ((Number) arrayList5.get(i3)).intValue();
            int i10 = i3 + 1;
            t8 t8Var3 = (t8) arrayList4.get(i10);
            i5 = i10;
            i6 = intValue;
            t8Var = t8Var3;
        } else {
            i5 = i3;
            i6 = -1;
        }
        if (t8Var.d(i8) == t8Var2.d(i8)) {
            int min = Math.min(t8Var.a(), t8Var2.a());
            int i11 = 0;
            for (int i12 = i8; i12 < min && t8Var.d(i12) == t8Var2.d(i12); i12++) {
                i11++;
            }
            long j4 = (p8Var.g / 4) + j2 + 2 + i11 + 1;
            p8Var.y(-i11);
            p8Var.y(i6);
            int i13 = i8 + i11;
            while (i8 < i13) {
                p8Var.y(t8Var.d(i8) & 255);
                i8++;
            }
            if (i5 + 1 == i4) {
                if (i13 == ((t8) arrayList4.get(i5)).a()) {
                    p8Var.y(((Number) arrayList5.get(i5)).intValue());
                    return;
                } else {
                    o8.t("Check failed.");
                    return;
                }
            }
            p8 p8Var2 = new p8();
            p8Var.y(((int) ((p8Var2.g / 4) + j4)) * (-1));
            a(j4, p8Var2, i13, arrayList4, i5, i4, arrayList5);
            p8Var.v(p8Var2);
            return;
        }
        int i14 = 1;
        for (int i15 = i5 + 1; i15 < i4; i15++) {
            if (((t8) arrayList4.get(i15 - 1)).d(i8) != ((t8) arrayList4.get(i15)).d(i8)) {
                i14++;
            }
        }
        long j5 = (p8Var.g / 4) + j2 + 2 + (i14 * 2);
        p8Var.y(i14);
        p8Var.y(i6);
        for (int i16 = i5; i16 < i4; i16++) {
            int d2 = ((t8) arrayList4.get(i16)).d(i8);
            if (i16 == i5 || d2 != ((t8) arrayList4.get(i16 - 1)).d(i8)) {
                p8Var.y(d2 & 255);
            }
        }
        p8 p8Var3 = new p8();
        int i17 = i5;
        while (i17 < i4) {
            byte d3 = ((t8) arrayList4.get(i17)).d(i8);
            int i18 = i17 + 1;
            int i19 = i18;
            while (true) {
                if (i19 >= i4) {
                    i19 = i4;
                    break;
                } else if (d3 != ((t8) arrayList4.get(i19)).d(i8)) {
                    break;
                } else {
                    i19++;
                }
            }
            if (i18 == i19 && i8 + 1 == ((t8) arrayList4.get(i17)).a()) {
                p8Var.y(((Number) arrayList5.get(i17)).intValue());
                arrayList3 = arrayList5;
                j3 = j5;
                i7 = i19;
            } else {
                p8Var.y(((int) ((p8Var3.g / 4) + j5)) * (-1));
                arrayList3 = arrayList5;
                j3 = j5;
                i7 = i19;
                a(j3, p8Var3, i8 + 1, arrayList, i17, i7, arrayList3);
                arrayList4 = arrayList;
            }
            j5 = j3;
            i17 = i7;
            arrayList5 = arrayList3;
        }
        p8Var.v(p8Var3);
    }

    public static void f(fd fdVar, xq xqVar, ed edVar) {
        edVar.o = -1;
        pc pcVar = edVar.M;
        int[] iArr = edVar.p0;
        pc pcVar2 = edVar.L;
        pc pcVar3 = edVar.J;
        pc pcVar4 = edVar.K;
        pc pcVar5 = edVar.I;
        edVar.p = -1;
        int[] iArr2 = fdVar.p0;
        if (iArr2[0] != 2 && iArr[0] == 4) {
            int i2 = pcVar5.g;
            int q = fdVar.q() - pcVar4.g;
            pcVar5.i = xqVar.k(pcVar5);
            pcVar4.i = xqVar.k(pcVar4);
            xqVar.d(pcVar5.i, i2);
            xqVar.d(pcVar4.i, q);
            edVar.o = 2;
            edVar.Y = i2;
            int i3 = q - i2;
            edVar.U = i3;
            int i4 = edVar.b0;
            if (i3 < i4) {
                edVar.U = i4;
            }
        }
        if (iArr2[1] == 2 || iArr[1] != 4) {
            return;
        }
        int i5 = pcVar3.g;
        int k2 = fdVar.k() - pcVar2.g;
        pcVar3.i = xqVar.k(pcVar3);
        pcVar2.i = xqVar.k(pcVar2);
        xqVar.d(pcVar3.i, i5);
        xqVar.d(pcVar2.i, k2);
        if (edVar.a0 > 0 || edVar.g0 == 8) {
            p30 k3 = xqVar.k(pcVar);
            pcVar.i = k3;
            xqVar.d(k3, edVar.a0 + i5);
        }
        edVar.p = 2;
        edVar.Z = i5;
        int i6 = k2 - i5;
        edVar.V = i6;
        int i7 = edVar.c0;
        if (i6 < i7) {
            edVar.V = i7;
        }
    }

    public static void g(String str) {
        if (str.length() <= 0) {
            o8.j("name is empty");
            return;
        }
        int length = str.length();
        for (int i2 = 0; i2 < length; i2++) {
            char charAt = str.charAt(i2);
            if ('!' > charAt || charAt >= 127) {
                o8.e(y70.f("Unexpected char %#04x at %d in header name: %s", Integer.valueOf(charAt), Integer.valueOf(i2), str));
                return;
            }
        }
    }

    public static void h(String str, String str2) {
        int length = str.length();
        for (int i2 = 0; i2 < length; i2++) {
            char charAt = str.charAt(i2);
            if (charAt != '\t' && (' ' > charAt || charAt >= 127)) {
                o8.e(y70.f("Unexpected char %#04x at %d in %s value", Integer.valueOf(charAt), Integer.valueOf(i2), str2).concat(y70.n(str2) ? "" : ": ".concat(str)));
                return;
            }
        }
    }

    public static int i(int i2, int i3, int i4) {
        return i2 < i3 ? i3 : i2 > i4 ? i4 : i2;
    }

    public static byte[] k(byte[] bArr) {
        Deflater deflater = new Deflater(1);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            DeflaterOutputStream deflaterOutputStream = new DeflaterOutputStream(byteArrayOutputStream, deflater);
            try {
                deflaterOutputStream.write(bArr);
                deflaterOutputStream.close();
                deflater.end();
                return byteArrayOutputStream.toByteArray();
            } finally {
            }
        } catch (Throwable th) {
            deflater.end();
            throw th;
        }
    }

    public static boolean l(File file) {
        if (!file.isDirectory()) {
            file.delete();
            return true;
        }
        File[] listFiles = file.listFiles();
        if (listFiles == null) {
            return false;
        }
        boolean z = true;
        for (File file2 : listFiles) {
            z = l(file2) && z;
        }
        return z;
    }

    public static boolean m(View view, KeyEvent keyEvent) {
        ArrayList arrayList;
        int size;
        int indexOfKey;
        WeakHashMap weakHashMap = e90.a;
        if (Build.VERSION.SDK_INT < 28) {
            ArrayList arrayList2 = d90.d;
            d90 d90Var = (d90) view.getTag(R.id.tag_unhandled_key_event_manager);
            WeakReference weakReference = null;
            if (d90Var == null) {
                d90Var = new d90();
                d90Var.a = null;
                d90Var.b = null;
                d90Var.c = null;
                view.setTag(R.id.tag_unhandled_key_event_manager, d90Var);
            }
            WeakReference weakReference2 = d90Var.c;
            if (weakReference2 == null || weakReference2.get() != keyEvent) {
                d90Var.c = new WeakReference(keyEvent);
                if (d90Var.b == null) {
                    d90Var.b = new SparseArray();
                }
                SparseArray sparseArray = d90Var.b;
                if (keyEvent.getAction() == 1 && (indexOfKey = sparseArray.indexOfKey(keyEvent.getKeyCode())) >= 0) {
                    weakReference = (WeakReference) sparseArray.valueAt(indexOfKey);
                    sparseArray.removeAt(indexOfKey);
                }
                if (weakReference == null) {
                    weakReference = (WeakReference) sparseArray.get(keyEvent.getKeyCode());
                }
                if (weakReference != null) {
                    View view2 = (View) weakReference.get();
                    if (view2 == null || !view2.isAttachedToWindow() || (arrayList = (ArrayList) view2.getTag(R.id.tag_unhandled_key_listeners)) == null || (size = arrayList.size() - 1) < 0) {
                        return true;
                    }
                    arrayList.get(size).getClass();
                    o8.c();
                    return false;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:63:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean n(xp xpVar, View view, Window.Callback callback, KeyEvent keyEvent) {
        DialogInterface.OnKeyListener onKeyListener;
        Window window;
        boolean z = false;
        if (xpVar != null) {
            if (Build.VERSION.SDK_INT >= 28) {
                return xpVar.b(keyEvent);
            }
            if (callback instanceof Activity) {
                Activity activity = (Activity) callback;
                activity.onUserInteraction();
                Window window2 = activity.getWindow();
                if (window2.hasFeature(8)) {
                    ActionBar actionBar = activity.getActionBar();
                    if (keyEvent.getKeyCode() == 82 && actionBar != null) {
                        if (!k) {
                            try {
                                l = actionBar.getClass().getMethod("onMenuKeyEvent", KeyEvent.class);
                            } catch (NoSuchMethodException unused) {
                            }
                            k = true;
                        }
                        Method method = l;
                        if (method != null) {
                            try {
                                Object invoke = method.invoke(actionBar, keyEvent);
                                if (invoke != null) {
                                    z = ((Boolean) invoke).booleanValue();
                                }
                            } catch (IllegalAccessException | InvocationTargetException unused2) {
                            }
                        }
                        if (z) {
                            return true;
                        }
                    }
                }
                if (window2.superDispatchKeyEvent(keyEvent)) {
                    return true;
                }
                View decorView = window2.getDecorView();
                if (e90.c(decorView, keyEvent)) {
                    return true;
                }
                return keyEvent.dispatch(activity, decorView != null ? decorView.getKeyDispatcherState() : null, activity);
            }
            if (callback instanceof Dialog) {
                Dialog dialog = (Dialog) callback;
                if (!m) {
                    try {
                        Field declaredField = Dialog.class.getDeclaredField("mOnKeyListener");
                        n = declaredField;
                        declaredField.setAccessible(true);
                    } catch (NoSuchFieldException unused3) {
                    }
                    m = true;
                }
                Field field = n;
                if (field != null) {
                    try {
                        onKeyListener = (DialogInterface.OnKeyListener) field.get(dialog);
                    } catch (IllegalAccessException unused4) {
                    }
                    if (onKeyListener == null && onKeyListener.onKey(dialog, keyEvent.getKeyCode(), keyEvent)) {
                        return true;
                    }
                    window = dialog.getWindow();
                    if (!window.superDispatchKeyEvent(keyEvent)) {
                        return true;
                    }
                    View decorView2 = window.getDecorView();
                    if (e90.c(decorView2, keyEvent)) {
                        return true;
                    }
                    return keyEvent.dispatch(dialog, decorView2 != null ? decorView2.getKeyDispatcherState() : null, dialog);
                }
                onKeyListener = null;
                if (onKeyListener == null) {
                }
                window = dialog.getWindow();
                if (!window.superDispatchKeyEvent(keyEvent)) {
                }
            } else if ((view != null && e90.c(view, keyEvent)) || xpVar.b(keyEvent)) {
                return true;
            }
        }
        return false;
    }

    public static final boolean o(int i2, int i3) {
        return (i2 & i3) == i3;
    }

    public static Drawable p(Context context, int i2) {
        return s00.b().c(context, i2);
    }

    public static Intent q(r3 r3Var) {
        Intent parentActivityIntent = r3Var.getParentActivityIntent();
        if (parentActivityIntent != null) {
            return parentActivityIntent;
        }
        try {
            String s = s(r3Var, r3Var.getComponentName());
            if (s == null) {
                return null;
            }
            ComponentName componentName = new ComponentName(r3Var, s);
            try {
                return s(r3Var, componentName) == null ? Intent.makeMainActivity(componentName) : new Intent().setComponent(componentName);
            } catch (PackageManager.NameNotFoundException unused) {
                Log.e("NavUtils", "getParentActivityIntent: bad parentActivityName '" + s + "' in manifest");
                return null;
            }
        } catch (PackageManager.NameNotFoundException e2) {
            throw new IllegalArgumentException(e2);
        }
    }

    public static Intent r(r3 r3Var, ComponentName componentName) {
        String s = s(r3Var, componentName);
        if (s == null) {
            return null;
        }
        ComponentName componentName2 = new ComponentName(componentName.getPackageName(), s);
        return s(r3Var, componentName2) == null ? Intent.makeMainActivity(componentName2) : new Intent().setComponent(componentName2);
    }

    public static String s(Context context, ComponentName componentName) {
        String string;
        ActivityInfo activityInfo = context.getPackageManager().getActivityInfo(componentName, Build.VERSION.SDK_INT >= 29 ? 269222528 : 787072);
        String str = activityInfo.parentActivityName;
        if (str != null) {
            return str;
        }
        Bundle bundle = activityInfo.metaData;
        if (bundle == null || (string = bundle.getString("android.support.PARENT_ACTIVITY")) == null) {
            return null;
        }
        if (string.charAt(0) != '.') {
            return string;
        }
        return context.getPackageName() + string;
    }

    public static final int t(int i2, int i3, int i4) {
        if (i4 > 0) {
            if (i2 < i3) {
                int i5 = i3 % i4;
                if (i5 < 0) {
                    i5 += i4;
                }
                int i6 = i2 % i4;
                if (i6 < 0) {
                    i6 += i4;
                }
                int i7 = (i5 - i6) % i4;
                if (i7 < 0) {
                    i7 += i4;
                }
                return i3 - i7;
            }
        } else {
            if (i4 >= 0) {
                o8.j("Step is zero.");
                return 0;
            }
            if (i2 > i3) {
                int i8 = -i4;
                int i9 = i2 % i8;
                if (i9 < 0) {
                    i9 += i8;
                }
                int i10 = i3 % i8;
                if (i10 < 0) {
                    i10 += i8;
                }
                int i11 = (i9 - i10) % i8;
                if (i11 < 0) {
                    i11 += i8;
                }
                return i11 + i3;
            }
        }
        return i3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:3:0x0007, code lost:
    
        r3 = r3.getRoundedCorner(r4);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static f10 u(Display display, int i2) {
        RoundedCorner roundedCorner;
        int position;
        int i3;
        int radius;
        Point center;
        if (Build.VERSION.SDK_INT < 31 || roundedCorner == null) {
            return null;
        }
        position = roundedCorner.getPosition();
        if (position != 0) {
            i3 = 1;
            if (position != 1) {
                i3 = 2;
                if (position != 2) {
                    i3 = 3;
                    if (position != 3) {
                        o8.j(o30.e("Invalid position: ", position));
                        return null;
                    }
                }
            }
        } else {
            i3 = 0;
        }
        radius = roundedCorner.getRadius();
        center = roundedCorner.getCenter();
        return new f10(i3, radius, center);
    }

    public static ArrayList v(MaterialToolbar materialToolbar, CharSequence charSequence) {
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < materialToolbar.getChildCount(); i2++) {
            View childAt = materialToolbar.getChildAt(i2);
            if (childAt instanceof TextView) {
                TextView textView = (TextView) childAt;
                if (TextUtils.equals(textView.getText(), charSequence)) {
                    arrayList.add(textView);
                }
            }
        }
        return arrayList;
    }

    public static int w(float f2) {
        if (f2 < 1.0f) {
            return -16777216;
        }
        if (f2 > 99.0f) {
            return -1;
        }
        float f3 = (f2 + 16.0f) / 116.0f;
        float f4 = f2 > 8.0f ? f3 * f3 * f3 : f2 / 903.2963f;
        float f5 = f3 * f3 * f3;
        boolean z = f5 > 0.008856452f;
        float f6 = z ? f5 : ((f3 * 116.0f) - 16.0f) / 903.2963f;
        if (!z) {
            f5 = ((f3 * 116.0f) - 16.0f) / 903.2963f;
        }
        float[] fArr = c;
        return nb.a(f6 * fArr[0], f4 * fArr[1], f5 * fArr[2]);
    }

    public static float y(int i2) {
        float f2 = i2 / 255.0f;
        return (f2 <= 0.04045f ? f2 / 12.92f : (float) Math.pow((f2 + 0.055f) / 1.055f, 2.4000000953674316d)) * 100.0f;
    }

    public static List z(Object obj) {
        List singletonList = Collections.singletonList(obj);
        singletonList.getClass();
        return singletonList;
    }

    public abstract void C(int i2);

    public abstract void D(Typeface typeface);

    public abstract void E(Typeface typeface, boolean z);

    public abstract void J(s sVar, s sVar2);

    public abstract void K(s sVar, Thread thread);

    public abstract void T(boolean z);

    public abstract void U(boolean z);

    public void b(int i2) {
        new Handler(Looper.getMainLooper()).post(new ns(i2, 1, this));
    }

    public abstract boolean c(t tVar, p pVar);

    public abstract boolean d(t tVar, Object obj, Object obj2);

    public abstract boolean e(t tVar, s sVar, s sVar2);

    public abstract List j(List list, String str);

    public abstract boolean x();
}
