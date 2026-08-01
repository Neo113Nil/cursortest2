package defpackage;

import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.Intent;
import android.content.res.TypedArray;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import android.view.View;
import android.view.ViewParent;
import android.view.animation.AnimationUtils;
import android.view.animation.PathInterpolator;
import android.widget.EdgeEffect;
import com.google.android.material.appbar.AppBarLayout;
import com.trembin.nirefon.betfury.R;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.cert.Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public abstract class d50 {
    public static qc e;
    public static final Object a = new Object();
    public static final lm b = new lm("CLOSED", 1);
    public static final String[] c = {"standard", "accelerate", "decelerate", "linear"};
    public static final qc d = new qc(null, null, null);
    public static final byte[] f = {112, 114, 111, 0};
    public static final byte[] g = {112, 114, 109, 0};
    public static final int[] h = {R.attr.colorPrimary};
    public static final int[] i = {R.attr.colorPrimaryVariant};
    public static final int[] j = {android.R.attr.stateListAnimator};

    public static boolean A(int i2, Rect rect, Rect rect2) {
        if (i2 == 17) {
            int i3 = rect.right;
            int i4 = rect2.right;
            if ((i3 > i4 || rect.left >= i4) && rect.left > rect2.left) {
                return true;
            }
        } else if (i2 == 33) {
            int i5 = rect.bottom;
            int i6 = rect2.bottom;
            if ((i5 > i6 || rect.top >= i6) && rect.top > rect2.top) {
                return true;
            }
        } else if (i2 == 66) {
            int i7 = rect.left;
            int i8 = rect2.left;
            if ((i7 < i8 || rect.right <= i8) && rect.right < rect2.right) {
                return true;
            }
        } else {
            if (i2 != 130) {
                s9.k("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                return false;
            }
            int i9 = rect.top;
            int i10 = rect2.top;
            if ((i9 < i10 || rect.bottom <= i10) && rect.bottom < rect2.bottom) {
                return true;
            }
        }
        return false;
    }

    public static boolean B(String str, String str2) {
        return str.startsWith(str2.concat("(")) && str.endsWith(")");
    }

    public static int C(int i2, Rect rect, Rect rect2) {
        int i3;
        int i4;
        if (i2 == 17) {
            i3 = rect.left;
            i4 = rect2.right;
        } else if (i2 == 33) {
            i3 = rect.top;
            i4 = rect2.bottom;
        } else if (i2 == 66) {
            i3 = rect2.left;
            i4 = rect.right;
        } else {
            if (i2 != 130) {
                s9.k("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                return 0;
            }
            i3 = rect2.top;
            i4 = rect.bottom;
        }
        return Math.max(0, i3 - i4);
    }

    public static int D(int i2, Rect rect, Rect rect2) {
        if (i2 != 17) {
            if (i2 != 33) {
                if (i2 != 66) {
                    if (i2 != 130) {
                        s9.k("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                        return 0;
                    }
                }
            }
            return Math.abs(((rect.width() / 2) + rect.left) - ((rect2.width() / 2) + rect2.left));
        }
        return Math.abs(((rect.height() / 2) + rect.top) - ((rect2.height() / 2) + rect2.top));
    }

    public static TypedArray E(Context context, AttributeSet attributeSet, int[] iArr, int i2, int i3, int... iArr2) {
        e(context, attributeSet, i2, i3);
        g(context, attributeSet, iArr, i2, i3, iArr2);
        return context.obtainStyledAttributes(attributeSet, iArr, i2, i3);
    }

    public static float F(EdgeEffect edgeEffect, float f2, float f3) {
        if (Build.VERSION.SDK_INT >= 31) {
            return jl.c(edgeEffect, f2, f3);
        }
        edgeEffect.onPull(f2, f3);
        return f2;
    }

    public static final boolean G(String str) {
        str.getClass();
        return (str.equals("GET") || str.equals("HEAD")) ? false : true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x003c, code lost:
    
        if (r5 != null) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x003e, code lost:
    
        r5.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x004c, code lost:
    
        if (r5 == null) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void H(Context context, String str) {
        synchronized (a) {
            if (str.equals("")) {
                context.deleteFile("androidx.appcompat.app.AppCompatDelegate.application_locales_record_file");
                return;
            }
            try {
                FileOutputStream openFileOutput = context.openFileOutput("androidx.appcompat.app.AppCompatDelegate.application_locales_record_file", 0);
                XmlSerializer newSerializer = Xml.newSerializer();
                try {
                    try {
                        newSerializer.setOutput(openFileOutput, null);
                        newSerializer.startDocument("UTF-8", Boolean.TRUE);
                        newSerializer.startTag(null, "locales");
                        newSerializer.attribute(null, "application_locales", str);
                        newSerializer.endTag(null, "locales");
                        newSerializer.endDocument();
                    } catch (Throwable th) {
                        if (openFileOutput != null) {
                            try {
                                openFileOutput.close();
                            } catch (IOException unused) {
                            }
                        }
                        throw th;
                    }
                } catch (Exception e2) {
                    Log.w("AppLocalesStorageHelper", "Storing App Locales : Failed to persist app-locales in storage ", e2);
                }
            } catch (FileNotFoundException unused2) {
                Log.w("AppLocalesStorageHelper", "Storing App Locales : FileNotFoundException: Cannot open file androidx.appcompat.app.AppCompatDelegate.application_locales_record_file for writing ");
            }
        }
    }

    public static int[] I(ByteArrayInputStream byteArrayInputStream, int i2) {
        int[] iArr = new int[i2];
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            i3 += (int) gk0.H(byteArrayInputStream, 2);
            iArr[i4] = i3;
        }
        return iArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0044, code lost:
    
        if (r2 != null) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0046, code lost:
    
        r2.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x002e, code lost:
    
        if (r5 != 4) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x003b, code lost:
    
        if (r3.getName().equals("locales") == false) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x003d, code lost:
    
        r1 = r3.getAttributeValue(null, "application_locales");
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0053, code lost:
    
        if (r2 == null) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String J(Context context) {
        String str;
        synchronized (a) {
            str = "";
            try {
                FileInputStream openFileInput = context.openFileInput("androidx.appcompat.app.AppCompatDelegate.application_locales_record_file");
                try {
                    try {
                        XmlPullParser newPullParser = Xml.newPullParser();
                        newPullParser.setInput(openFileInput, "UTF-8");
                        int depth = newPullParser.getDepth();
                        while (true) {
                            int next = newPullParser.next();
                            if (next != 1) {
                                if (next == 3 && newPullParser.getDepth() <= depth) {
                                    break;
                                }
                            } else {
                                break;
                            }
                        }
                    } catch (IOException | XmlPullParserException unused) {
                        Log.w("AppLocalesStorageHelper", "Reading app Locales : Unable to parse through file :androidx.appcompat.app.AppCompatDelegate.application_locales_record_file");
                    }
                } catch (Throwable th) {
                    if (openFileInput != null) {
                        try {
                            openFileInput.close();
                        } catch (IOException unused2) {
                        }
                    }
                    throw th;
                }
            } catch (FileNotFoundException unused3) {
                return "";
            }
        }
        return str;
        if (str.isEmpty()) {
            context.deleteFile("androidx.appcompat.app.AppCompatDelegate.application_locales_record_file");
        }
        return str;
    }

    public static pj[] K(FileInputStream fileInputStream, byte[] bArr, byte[] bArr2, pj[] pjVarArr) {
        byte[] bArr3 = gk0.m;
        if (!Arrays.equals(bArr, bArr3)) {
            if (!Arrays.equals(bArr, gk0.n)) {
                s9.u("Unsupported meta version");
                return null;
            }
            int H = (int) gk0.H(fileInputStream, 2);
            byte[] E = gk0.E(fileInputStream, (int) gk0.H(fileInputStream, 4), (int) gk0.H(fileInputStream, 4));
            if (fileInputStream.read() > 0) {
                s9.u("Content found after the end of file");
                return null;
            }
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(E);
            try {
                pj[] M = M(byteArrayInputStream, bArr2, H, pjVarArr);
                byteArrayInputStream.close();
                return M;
            } catch (Throwable th) {
                try {
                    byteArrayInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        if (Arrays.equals(gk0.h, bArr2)) {
            s9.u("Requires new Baseline Profile Metadata. Please rebuild the APK with Android Gradle Plugin 7.2 Canary 7 or higher");
            return null;
        }
        if (!Arrays.equals(bArr, bArr3)) {
            s9.u("Unsupported meta version");
            return null;
        }
        int H2 = (int) gk0.H(fileInputStream, 1);
        byte[] E2 = gk0.E(fileInputStream, (int) gk0.H(fileInputStream, 4), (int) gk0.H(fileInputStream, 4));
        if (fileInputStream.read() > 0) {
            s9.u("Content found after the end of file");
            return null;
        }
        ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(E2);
        try {
            pj[] L = L(byteArrayInputStream2, H2, pjVarArr);
            byteArrayInputStream2.close();
            return L;
        } catch (Throwable th3) {
            try {
                byteArrayInputStream2.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    public static pj[] L(ByteArrayInputStream byteArrayInputStream, int i2, pj[] pjVarArr) {
        if (byteArrayInputStream.available() == 0) {
            return new pj[0];
        }
        if (i2 != pjVarArr.length) {
            s9.u("Mismatched number of dex files found in metadata");
            return null;
        }
        String[] strArr = new String[i2];
        int[] iArr = new int[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            int H = (int) gk0.H(byteArrayInputStream, 2);
            iArr[i3] = (int) gk0.H(byteArrayInputStream, 2);
            strArr[i3] = new String(gk0.C(byteArrayInputStream, H), StandardCharsets.UTF_8);
        }
        for (int i4 = 0; i4 < i2; i4++) {
            pj pjVar = pjVarArr[i4];
            if (!pjVar.b.equals(strArr[i4])) {
                s9.u("Order of dexfiles in metadata did not match baseline");
                return null;
            }
            int i5 = iArr[i4];
            pjVar.e = i5;
            pjVar.h = I(byteArrayInputStream, i5);
        }
        return pjVarArr;
    }

    public static pj[] M(ByteArrayInputStream byteArrayInputStream, byte[] bArr, int i2, pj[] pjVarArr) {
        pj pjVar;
        if (byteArrayInputStream.available() == 0) {
            return new pj[0];
        }
        if (i2 != pjVarArr.length) {
            s9.u("Mismatched number of dex files found in metadata");
            return null;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            gk0.H(byteArrayInputStream, 2);
            String str = new String(gk0.C(byteArrayInputStream, (int) gk0.H(byteArrayInputStream, 2)), StandardCharsets.UTF_8);
            long H = gk0.H(byteArrayInputStream, 4);
            int H2 = (int) gk0.H(byteArrayInputStream, 2);
            if (pjVarArr.length > 0) {
                int indexOf = str.indexOf("!");
                if (indexOf < 0) {
                    indexOf = str.indexOf(":");
                }
                String substring = indexOf > 0 ? str.substring(indexOf + 1) : str;
                for (int i4 = 0; i4 < pjVarArr.length; i4++) {
                    if (pjVarArr[i4].b.equals(substring)) {
                        pjVar = pjVarArr[i4];
                        break;
                    }
                }
            }
            pjVar = null;
            if (pjVar == null) {
                s9.u("Missing profile key: ".concat(str));
                return null;
            }
            pjVar.d = H;
            int[] I = I(byteArrayInputStream, H2);
            if (Arrays.equals(bArr, gk0.l)) {
                pjVar.e = H2;
                pjVar.h = I;
            }
        }
        return pjVarArr;
    }

    public static pj[] N(FileInputStream fileInputStream, byte[] bArr, String str) {
        if (!Arrays.equals(bArr, gk0.i)) {
            s9.u("Unsupported version");
            return null;
        }
        int H = (int) gk0.H(fileInputStream, 1);
        byte[] E = gk0.E(fileInputStream, (int) gk0.H(fileInputStream, 4), (int) gk0.H(fileInputStream, 4));
        if (fileInputStream.read() > 0) {
            s9.u("Content found after the end of file");
            return null;
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(E);
        try {
            pj[] O = O(byteArrayInputStream, str, H);
            byteArrayInputStream.close();
            return O;
        } catch (Throwable th) {
            try {
                byteArrayInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static pj[] O(ByteArrayInputStream byteArrayInputStream, String str, int i2) {
        int i3 = 0;
        if (byteArrayInputStream.available() == 0) {
            return new pj[0];
        }
        pj[] pjVarArr = new pj[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            int H = (int) gk0.H(byteArrayInputStream, 2);
            int H2 = (int) gk0.H(byteArrayInputStream, 2);
            pjVarArr[i4] = new pj(str, new String(gk0.C(byteArrayInputStream, H), StandardCharsets.UTF_8), gk0.H(byteArrayInputStream, 4), H2, (int) gk0.H(byteArrayInputStream, 4), (int) gk0.H(byteArrayInputStream, 4), new int[H2], new TreeMap());
        }
        int i5 = 0;
        while (i5 < i2) {
            pj pjVar = pjVarArr[i5];
            int available = byteArrayInputStream.available();
            int i6 = pjVar.f;
            int i7 = pjVar.g;
            TreeMap treeMap = pjVar.i;
            int i8 = available - i6;
            int i9 = i3;
            while (byteArrayInputStream.available() > i8) {
                i9 += (int) gk0.H(byteArrayInputStream, 2);
                treeMap.put(Integer.valueOf(i9), 1);
                int H3 = (int) gk0.H(byteArrayInputStream, 2);
                while (H3 > 0) {
                    gk0.H(byteArrayInputStream, 2);
                    int H4 = (int) gk0.H(byteArrayInputStream, 1);
                    if (H4 != 6 && H4 != 7) {
                        while (H4 > 0) {
                            gk0.H(byteArrayInputStream, 1);
                            int i10 = i3;
                            int i11 = i5;
                            for (int H5 = (int) gk0.H(byteArrayInputStream, 1); H5 > 0; H5--) {
                                gk0.H(byteArrayInputStream, 2);
                            }
                            H4--;
                            i3 = i10;
                            i5 = i11;
                        }
                    }
                    H3--;
                    i3 = i3;
                    i5 = i5;
                }
            }
            int i12 = i3;
            int i13 = i5;
            if (byteArrayInputStream.available() != i8) {
                s9.u("Read too much data during profile line parse");
                return null;
            }
            pjVar.h = I(byteArrayInputStream, pjVar.e);
            BitSet valueOf = BitSet.valueOf(gk0.C(byteArrayInputStream, (((i7 * 2) + 7) & (-8)) / 8));
            for (int i14 = i12; i14 < i7; i14++) {
                int i15 = valueOf.get(i14) ? 2 : i12;
                if (valueOf.get(i14 + i7)) {
                    i15 |= 4;
                }
                if (i15 != 0) {
                    Integer num = (Integer) treeMap.get(Integer.valueOf(i14));
                    if (num == null) {
                        num = Integer.valueOf(i12);
                    }
                    treeMap.put(Integer.valueOf(i14), Integer.valueOf(i15 | num.intValue()));
                }
            }
            i5 = i13 + 1;
            i3 = i12;
        }
        return pjVarArr;
    }

    public static final Object P(Object obj) {
        if (!(obj instanceof ld)) {
            return obj;
        }
        Throwable th = ((ld) obj).a;
        th.getClass();
        return new z90(th);
    }

    public static final void Q(Object[] objArr, int i2, int i3) {
        objArr.getClass();
        while (i2 < i3) {
            objArr[i2] = null;
            i2++;
        }
    }

    public static int R(Context context, int i2, int i3) {
        TypedValue J = n9.J(context.getTheme(), i2);
        return (J == null || J.type != 16) ? i3 : J.data;
    }

    public static TimeInterpolator S(Context context, int i2, TimeInterpolator timeInterpolator) {
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(i2, typedValue, true)) {
            return timeInterpolator;
        }
        if (typedValue.type != 3) {
            s9.k("Motion easing theme attribute must be an @interpolator resource for ?attr/motionEasing*Interpolator attributes or a string for ?attr/motionEasing* attributes.");
            return null;
        }
        String valueOf = String.valueOf(typedValue.string);
        if (!B(valueOf, "cubic-bezier") && !B(valueOf, "path")) {
            return AnimationUtils.loadInterpolator(context, typedValue.resourceId);
        }
        if (B(valueOf, "cubic-bezier")) {
            String[] split = valueOf.substring(13, valueOf.length() - 1).split(",");
            if (split.length == 4) {
                return new PathInterpolator(x(0, split), x(1, split), x(2, split), x(3, split));
            }
            throw new IllegalArgumentException("Motion easing theme attribute must have 4 control points if using bezier curve format; instead got: " + split.length);
        }
        if (!B(valueOf, "path")) {
            s9.k("Invalid motion easing type: ".concat(valueOf));
            return null;
        }
        String substring = valueOf.substring(5, valueOf.length() - 1);
        Path path = new Path();
        try {
            m50.b(gk0.l(substring), path);
            return new PathInterpolator(path);
        } catch (RuntimeException e2) {
            throw new RuntimeException("Error in parsing ".concat(substring), e2);
        }
    }

    public static ue0 T(Context context) {
        TypedValue J = n9.J(context.getTheme(), R.attr.motionSpringFastSpatial);
        int[] iArr = c70.A;
        TypedArray obtainStyledAttributes = J == null ? context.obtainStyledAttributes(null, iArr, 0, R.style.Motion_Material3_Spring_Standard_Fast_Spatial) : context.obtainStyledAttributes(J.resourceId, iArr);
        ue0 ue0Var = new ue0();
        try {
            float f2 = obtainStyledAttributes.getFloat(1, Float.MIN_VALUE);
            if (f2 == Float.MIN_VALUE) {
                throw new IllegalArgumentException("A MaterialSpring style must have stiffness value.");
            }
            float f3 = obtainStyledAttributes.getFloat(0, Float.MIN_VALUE);
            if (f3 == Float.MIN_VALUE) {
                throw new IllegalArgumentException("A MaterialSpring style must have a damping value.");
            }
            if (f2 <= 0.0f) {
                throw new IllegalArgumentException("Spring stiffness constant must be positive.");
            }
            ue0Var.a = Math.sqrt(f2);
            ue0Var.c = false;
            if (f3 < 0.0f) {
                throw new IllegalArgumentException("Damping ratio must be non-negative");
            }
            ue0Var.b = f3;
            ue0Var.c = false;
            obtainStyledAttributes.recycle();
            return ue0Var;
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    public static final Object U(xr xrVar) {
        Thread.interrupted();
        return gk0.L(um.f, new qh(xrVar, null));
    }

    public static void W(AppBarLayout appBarLayout, float f2) {
        int integer = appBarLayout.getResources().getInteger(R.integer.app_bar_elevation_anim_duration);
        StateListAnimator stateListAnimator = new StateListAnimator();
        long j2 = integer;
        stateListAnimator.addState(new int[]{android.R.attr.state_enabled, R.attr.state_liftable, -2130904209}, ObjectAnimator.ofFloat(appBarLayout, "elevation", 0.0f).setDuration(j2));
        stateListAnimator.addState(new int[]{android.R.attr.state_enabled}, ObjectAnimator.ofFloat(appBarLayout, "elevation", f2).setDuration(j2));
        stateListAnimator.addState(new int[0], ObjectAnimator.ofFloat(appBarLayout, "elevation", 0.0f).setDuration(0L));
        appBarLayout.setStateListAnimator(stateListAnimator);
    }

    public static void Y(View view, g10 g10Var) {
        tl tlVar = g10Var.g.b;
        if (tlVar == null || !tlVar.a) {
            return;
        }
        float f2 = 0.0f;
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            f2 += ((View) parent).getElevation();
        }
        e10 e10Var = g10Var.g;
        if (e10Var.l != f2) {
            e10Var.l = f2;
            g10Var.y();
        }
    }

    public static hv Z(jv jvVar, int i2) {
        jvVar.getClass();
        boolean z = i2 > 0;
        Integer valueOf = Integer.valueOf(i2);
        if (!z) {
            throw new IllegalArgumentException("Step must be positive, was: " + valueOf + '.');
        }
        int i3 = jvVar.f;
        int i4 = jvVar.g;
        if (jvVar.h <= 0) {
            i2 = -i2;
        }
        return new hv(i3, i4, i2);
    }

    public static final String a(Object[] objArr, int i2, int i3, o oVar) {
        StringBuilder sb = new StringBuilder((i3 * 3) + 2);
        sb.append("[");
        for (int i4 = 0; i4 < i3; i4++) {
            if (i4 > 0) {
                sb.append(", ");
            }
            Object obj = objArr[i2 + i4];
            if (obj == oVar) {
                sb.append("(this Collection)");
            } else {
                sb.append(obj);
            }
        }
        sb.append("]");
        return sb.toString();
    }

    /* JADX WARN: Finally extract failed */
    public static boolean a0(ByteArrayOutputStream byteArrayOutputStream, byte[] bArr, pj[] pjVarArr) {
        int length;
        byte[] bArr2 = gk0.l;
        byte[] bArr3 = gk0.k;
        byte[] bArr4 = gk0.h;
        int i2 = 0;
        if (!Arrays.equals(bArr, bArr4)) {
            byte[] bArr5 = gk0.i;
            if (Arrays.equals(bArr, bArr5)) {
                byte[] j2 = j(pjVarArr, bArr5);
                gk0.W(byteArrayOutputStream, pjVarArr.length, 1);
                gk0.W(byteArrayOutputStream, j2.length, 4);
                byte[] i3 = gk0.i(j2);
                gk0.W(byteArrayOutputStream, i3.length, 4);
                byteArrayOutputStream.write(i3);
                return true;
            }
            if (Arrays.equals(bArr, bArr3)) {
                gk0.W(byteArrayOutputStream, pjVarArr.length, 1);
                for (pj pjVar : pjVarArr) {
                    int size = pjVar.i.size() * 4;
                    String r = r(pjVar.a, pjVar.b, bArr3);
                    Charset charset = StandardCharsets.UTF_8;
                    gk0.X(byteArrayOutputStream, r.getBytes(charset).length);
                    gk0.X(byteArrayOutputStream, pjVar.h.length);
                    gk0.W(byteArrayOutputStream, size, 4);
                    gk0.W(byteArrayOutputStream, pjVar.c, 4);
                    byteArrayOutputStream.write(r.getBytes(charset));
                    Iterator it = pjVar.i.keySet().iterator();
                    while (it.hasNext()) {
                        gk0.X(byteArrayOutputStream, ((Integer) it.next()).intValue());
                        gk0.X(byteArrayOutputStream, 0);
                    }
                    for (int i4 : pjVar.h) {
                        gk0.X(byteArrayOutputStream, i4);
                    }
                }
                return true;
            }
            byte[] bArr6 = gk0.j;
            if (Arrays.equals(bArr, bArr6)) {
                byte[] j3 = j(pjVarArr, bArr6);
                gk0.W(byteArrayOutputStream, pjVarArr.length, 1);
                gk0.W(byteArrayOutputStream, j3.length, 4);
                byte[] i5 = gk0.i(j3);
                gk0.W(byteArrayOutputStream, i5.length, 4);
                byteArrayOutputStream.write(i5);
                return true;
            }
            if (!Arrays.equals(bArr, bArr2)) {
                return false;
            }
            gk0.X(byteArrayOutputStream, pjVarArr.length);
            for (pj pjVar2 : pjVarArr) {
                String str = pjVar2.a;
                TreeMap treeMap = pjVar2.i;
                String r2 = r(str, pjVar2.b, bArr2);
                Charset charset2 = StandardCharsets.UTF_8;
                gk0.X(byteArrayOutputStream, r2.getBytes(charset2).length);
                gk0.X(byteArrayOutputStream, treeMap.size());
                gk0.X(byteArrayOutputStream, pjVar2.h.length);
                gk0.W(byteArrayOutputStream, pjVar2.c, 4);
                byteArrayOutputStream.write(r2.getBytes(charset2));
                Iterator it2 = treeMap.keySet().iterator();
                while (it2.hasNext()) {
                    gk0.X(byteArrayOutputStream, ((Integer) it2.next()).intValue());
                }
                for (int i6 : pjVar2.h) {
                    gk0.X(byteArrayOutputStream, i6);
                }
            }
            return true;
        }
        ArrayList arrayList = new ArrayList(3);
        ArrayList arrayList2 = new ArrayList(3);
        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
        try {
            gk0.X(byteArrayOutputStream2, pjVarArr.length);
            int i7 = 2;
            int i8 = 2;
            for (pj pjVar3 : pjVarArr) {
                gk0.W(byteArrayOutputStream2, pjVar3.c, 4);
                gk0.W(byteArrayOutputStream2, pjVar3.d, 4);
                gk0.W(byteArrayOutputStream2, pjVar3.g, 4);
                String r3 = r(pjVar3.a, pjVar3.b, bArr4);
                Charset charset3 = StandardCharsets.UTF_8;
                int length2 = r3.getBytes(charset3).length;
                gk0.X(byteArrayOutputStream2, length2);
                i8 = i8 + 14 + length2;
                byteArrayOutputStream2.write(r3.getBytes(charset3));
            }
            byte[] byteArray = byteArrayOutputStream2.toByteArray();
            if (i8 != byteArray.length) {
                throw new IllegalStateException("Expected size " + i8 + ", does not match actual size " + byteArray.length);
            }
            jp0 jp0Var = new jp0(lo.DEX_FILES, byteArray, false);
            byteArrayOutputStream2.close();
            arrayList.add(jp0Var);
            ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
            int i9 = 0;
            for (int i10 = 0; i10 < pjVarArr.length; i10++) {
                try {
                    pj pjVar4 = pjVarArr[i10];
                    gk0.X(byteArrayOutputStream3, i10);
                    gk0.X(byteArrayOutputStream3, pjVar4.e);
                    i9 = i9 + 4 + (pjVar4.e * i7);
                    int[] iArr = pjVar4.h;
                    int length3 = iArr.length;
                    int i11 = 0;
                    int i12 = 0;
                    while (i11 < length3) {
                        int i13 = iArr[i11];
                        gk0.X(byteArrayOutputStream3, i13 - i12);
                        i11++;
                        i7 = i7;
                        i12 = i13;
                    }
                } catch (Throwable th) {
                }
            }
            byte[] byteArray2 = byteArrayOutputStream3.toByteArray();
            if (i9 != byteArray2.length) {
                throw new IllegalStateException("Expected size " + i9 + ", does not match actual size " + byteArray2.length);
            }
            jp0 jp0Var2 = new jp0(lo.CLASSES, byteArray2, true);
            byteArrayOutputStream3.close();
            arrayList.add(jp0Var2);
            byteArrayOutputStream3 = new ByteArrayOutputStream();
            int i14 = 0;
            int i15 = 0;
            while (i14 < pjVarArr.length) {
                try {
                    pj pjVar5 = pjVarArr[i14];
                    Iterator it3 = pjVar5.i.entrySet().iterator();
                    int i16 = i2;
                    while (it3.hasNext()) {
                        i16 |= ((Integer) ((Map.Entry) it3.next()).getValue()).intValue();
                    }
                    ByteArrayOutputStream byteArrayOutputStream4 = new ByteArrayOutputStream();
                    try {
                        f0(byteArrayOutputStream4, i16, pjVar5);
                        byte[] byteArray3 = byteArrayOutputStream4.toByteArray();
                        byteArrayOutputStream4.close();
                        byteArrayOutputStream4 = new ByteArrayOutputStream();
                        try {
                            g0(byteArrayOutputStream4, pjVar5);
                            byte[] byteArray4 = byteArrayOutputStream4.toByteArray();
                            byteArrayOutputStream4.close();
                            gk0.X(byteArrayOutputStream3, i14);
                            int length4 = byteArray3.length + 2 + byteArray4.length;
                            int i17 = i15 + 6;
                            gk0.W(byteArrayOutputStream3, length4, 4);
                            gk0.X(byteArrayOutputStream3, i16);
                            byteArrayOutputStream3.write(byteArray3);
                            byteArrayOutputStream3.write(byteArray4);
                            i15 = i17 + length4;
                            i14++;
                            i2 = 0;
                        } finally {
                        }
                    } finally {
                    }
                } finally {
                    try {
                        byteArrayOutputStream3.close();
                        throw th;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
            }
            byte[] byteArray5 = byteArrayOutputStream3.toByteArray();
            if (i15 != byteArray5.length) {
                throw new IllegalStateException("Expected size " + i15 + ", does not match actual size " + byteArray5.length);
            }
            jp0 jp0Var3 = new jp0(lo.METHODS, byteArray5, true);
            byteArrayOutputStream3.close();
            arrayList.add(jp0Var3);
            long size2 = 12 + (arrayList.size() * 16);
            gk0.W(byteArrayOutputStream, arrayList.size(), 4);
            for (int i18 = 0; i18 < arrayList.size(); i18++) {
                jp0 jp0Var4 = (jp0) arrayList.get(i18);
                lo loVar = jp0Var4.a;
                byte[] bArr7 = jp0Var4.b;
                gk0.W(byteArrayOutputStream, loVar.getValue(), 4);
                gk0.W(byteArrayOutputStream, size2, 4);
                if (jp0Var4.c) {
                    long length5 = bArr7.length;
                    byte[] i19 = gk0.i(bArr7);
                    arrayList2.add(i19);
                    gk0.W(byteArrayOutputStream, i19.length, 4);
                    gk0.W(byteArrayOutputStream, length5, 4);
                    length = i19.length;
                } else {
                    arrayList2.add(bArr7);
                    gk0.W(byteArrayOutputStream, bArr7.length, 4);
                    gk0.W(byteArrayOutputStream, 0L, 4);
                    length = bArr7.length;
                }
                size2 += length;
            }
            for (int i20 = 0; i20 < arrayList2.size(); i20++) {
                byteArrayOutputStream.write((byte[]) arrayList2.get(i20));
            }
            return true;
        } catch (Throwable th3) {
            try {
                byteArrayOutputStream2.close();
                throw th3;
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
                throw th3;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0026, code lost:
    
        if (r10.bottom <= r12.top) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0071, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0041, code lost:
    
        if (r9 == 17) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0043, code lost:
    
        if (r9 != 66) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0046, code lost:
    
        r11 = C(r9, r10, r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x004a, code lost:
    
        if (r9 == 17) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x004c, code lost:
    
        if (r9 == 33) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x004e, code lost:
    
        if (r9 == 66) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0050, code lost:
    
        if (r9 != 130) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0052, code lost:
    
        r9 = r12.bottom;
        r10 = r10.bottom;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x006f, code lost:
    
        if (r11 >= java.lang.Math.max(1, r9 - r10)) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0058, code lost:
    
        defpackage.s9.k("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x005b, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005c, code lost:
    
        r9 = r12.right;
        r10 = r10.right;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0061, code lost:
    
        r9 = r10.top;
        r10 = r12.top;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0066, code lost:
    
        r9 = r10.left;
        r10 = r12.left;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0031, code lost:
    
        if (r10.right <= r12.left) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0038, code lost:
    
        if (r10.top >= r12.bottom) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x003f, code lost:
    
        if (r10.left >= r12.right) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean b(int i2, Rect rect, Rect rect2, Rect rect3) {
        boolean c2 = c(i2, rect, rect2);
        if (!c(i2, rect, rect3) && c2) {
            if (i2 != 17) {
                if (i2 != 33) {
                    if (i2 != 66) {
                        if (i2 != 130) {
                            s9.k("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                            return false;
                        }
                    }
                }
            }
        }
        return false;
    }

    public static jv b0(int i2, int i3) {
        if (i3 > Integer.MIN_VALUE) {
            return new jv(i2, i3 - 1, 1);
        }
        jv jvVar = jv.i;
        return jv.i;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0033 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean c(int i2, Rect rect, Rect rect2) {
        if (i2 != 17) {
            if (i2 != 33) {
                if (i2 != 66) {
                    if (i2 != 130) {
                        s9.k("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                        return false;
                    }
                }
            }
            return rect2.right >= rect.left && rect2.left <= rect.right;
        }
        if (rect2.bottom >= rect.top && rect2.top <= rect.bottom) {
            return true;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [eg] */
    /* JADX WARN: Type inference failed for: r2v1, types: [ch] */
    /* JADX WARN: Type inference failed for: r2v2, types: [ch] */
    public static final qk0 c0(eg egVar, qg qgVar, Object obj) {
        qk0 qk0Var = null;
        if (egVar != 0 && qgVar.w(rk0.f) != null) {
            while (true) {
                if ((egVar instanceof fk) || (egVar = egVar.c()) == 0) {
                    break;
                }
                if (egVar instanceof qk0) {
                    qk0Var = (qk0) egVar;
                    break;
                }
            }
            if (qk0Var != null) {
                qk0Var.T(qgVar, obj);
            }
        }
        return qk0Var;
    }

    public static void d(long j2, t9 t9Var, int i2, ArrayList arrayList, int i3, int i4, ArrayList arrayList2) {
        int i5;
        int i6;
        ArrayList arrayList3;
        long j3;
        int i7;
        int i8 = i2;
        ArrayList arrayList4 = arrayList;
        ArrayList arrayList5 = arrayList2;
        if (i3 >= i4) {
            s9.k("Failed requirement.");
            return;
        }
        for (int i9 = i3; i9 < i4; i9++) {
            if (((y9) arrayList4.get(i9)).a() < i8) {
                s9.k("Failed requirement.");
                return;
            }
        }
        y9 y9Var = (y9) arrayList.get(i3);
        y9 y9Var2 = (y9) arrayList4.get(i4 - 1);
        if (i8 == y9Var.a()) {
            int intValue = ((Number) arrayList5.get(i3)).intValue();
            int i10 = i3 + 1;
            y9 y9Var3 = (y9) arrayList4.get(i10);
            i5 = i10;
            i6 = intValue;
            y9Var = y9Var3;
        } else {
            i5 = i3;
            i6 = -1;
        }
        if (y9Var.d(i8) == y9Var2.d(i8)) {
            int min = Math.min(y9Var.a(), y9Var2.a());
            int i11 = 0;
            for (int i12 = i8; i12 < min && y9Var.d(i12) == y9Var2.d(i12); i12++) {
                i11++;
            }
            long j4 = (t9Var.g / 4) + j2 + 2 + i11 + 1;
            t9Var.V(-i11);
            t9Var.V(i6);
            int i13 = i8 + i11;
            while (i8 < i13) {
                t9Var.V(y9Var.d(i8) & 255);
                i8++;
            }
            if (i5 + 1 == i4) {
                if (i13 == ((y9) arrayList4.get(i5)).a()) {
                    t9Var.V(((Number) arrayList5.get(i5)).intValue());
                    return;
                } else {
                    s9.u("Check failed.");
                    return;
                }
            }
            t9 t9Var2 = new t9();
            t9Var.V(((int) ((t9Var2.g / 4) + j4)) * (-1));
            d(j4, t9Var2, i13, arrayList4, i5, i4, arrayList5);
            t9Var.S(t9Var2);
            return;
        }
        int i14 = 1;
        for (int i15 = i5 + 1; i15 < i4; i15++) {
            if (((y9) arrayList4.get(i15 - 1)).d(i8) != ((y9) arrayList4.get(i15)).d(i8)) {
                i14++;
            }
        }
        long j5 = (t9Var.g / 4) + j2 + 2 + (i14 * 2);
        t9Var.V(i14);
        t9Var.V(i6);
        for (int i16 = i5; i16 < i4; i16++) {
            int d2 = ((y9) arrayList4.get(i16)).d(i8);
            if (i16 == i5 || d2 != ((y9) arrayList4.get(i16 - 1)).d(i8)) {
                t9Var.V(d2 & 255);
            }
        }
        t9 t9Var3 = new t9();
        int i17 = i5;
        while (i17 < i4) {
            byte d3 = ((y9) arrayList4.get(i17)).d(i8);
            int i18 = i17 + 1;
            int i19 = i18;
            while (true) {
                if (i19 >= i4) {
                    i19 = i4;
                    break;
                } else if (d3 != ((y9) arrayList4.get(i19)).d(i8)) {
                    break;
                } else {
                    i19++;
                }
            }
            if (i18 == i19 && i8 + 1 == ((y9) arrayList4.get(i17)).a()) {
                t9Var.V(((Number) arrayList5.get(i17)).intValue());
                arrayList3 = arrayList5;
                j3 = j5;
                i7 = i19;
            } else {
                t9Var.V(((int) ((t9Var3.g / 4) + j5)) * (-1));
                arrayList3 = arrayList5;
                j3 = j5;
                i7 = i19;
                d(j3, t9Var3, i8 + 1, arrayList, i17, i7, arrayList3);
                arrayList4 = arrayList;
            }
            j5 = j3;
            i17 = i7;
            arrayList5 = arrayList3;
        }
        t9Var.S(t9Var3);
    }

    public static void d0(ByteArrayOutputStream byteArrayOutputStream, pj pjVar) {
        g0(byteArrayOutputStream, pjVar);
        int i2 = pjVar.g;
        int[] iArr = pjVar.h;
        int length = iArr.length;
        int i3 = 0;
        int i4 = 0;
        while (i3 < length) {
            int i5 = iArr[i3];
            gk0.X(byteArrayOutputStream, i5 - i4);
            i3++;
            i4 = i5;
        }
        byte[] bArr = new byte[(((i2 * 2) + 7) & (-8)) / 8];
        for (Map.Entry entry : pjVar.i.entrySet()) {
            int intValue = ((Integer) entry.getKey()).intValue();
            int intValue2 = ((Integer) entry.getValue()).intValue();
            if ((intValue2 & 2) != 0) {
                int i6 = intValue / 8;
                bArr[i6] = (byte) (bArr[i6] | (1 << (intValue % 8)));
            }
            if ((intValue2 & 4) != 0) {
                int i7 = intValue + i2;
                int i8 = i7 / 8;
                bArr[i8] = (byte) ((1 << (i7 % 8)) | bArr[i8]);
            }
        }
        byteArrayOutputStream.write(bArr);
    }

    public static void e(Context context, AttributeSet attributeSet, int i2, int i3) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, c70.M, i2, i3);
        boolean z = obtainStyledAttributes.getBoolean(1, false);
        obtainStyledAttributes.recycle();
        if (z) {
            TypedValue typedValue = new TypedValue();
            if (!context.getTheme().resolveAttribute(R.attr.isMaterialTheme, typedValue, true) || (typedValue.type == 18 && typedValue.data == 0)) {
                h(context, i, "Theme.MaterialComponents");
            }
        }
        h(context, h, "Theme.AppCompat");
    }

    public static void e0(ByteArrayOutputStream byteArrayOutputStream, pj pjVar, String str) {
        Charset charset = StandardCharsets.UTF_8;
        gk0.X(byteArrayOutputStream, str.getBytes(charset).length);
        gk0.X(byteArrayOutputStream, pjVar.e);
        gk0.W(byteArrayOutputStream, pjVar.f, 4);
        gk0.W(byteArrayOutputStream, pjVar.c, 4);
        gk0.W(byteArrayOutputStream, pjVar.g, 4);
        byteArrayOutputStream.write(str.getBytes(charset));
    }

    public static void f(int i2) {
        if (2 > i2 || i2 >= 37) {
            throw new IllegalArgumentException("radix " + i2 + " was not in valid range " + new jv(2, 36, 1));
        }
    }

    public static void f0(ByteArrayOutputStream byteArrayOutputStream, int i2, pj pjVar) {
        int i3 = pjVar.g;
        byte[] bArr = new byte[(((Integer.bitCount(i2 & (-2)) * i3) + 7) & (-8)) / 8];
        for (Map.Entry entry : pjVar.i.entrySet()) {
            int intValue = ((Integer) entry.getKey()).intValue();
            int intValue2 = ((Integer) entry.getValue()).intValue();
            int i4 = 0;
            for (int i5 = 1; i5 <= 4; i5 <<= 1) {
                if (i5 != 1 && (i5 & i2) != 0) {
                    if ((i5 & intValue2) == i5) {
                        int i6 = (i4 * i3) + intValue;
                        int i7 = i6 / 8;
                        bArr[i7] = (byte) ((1 << (i6 % 8)) | bArr[i7]);
                    }
                    i4++;
                }
            }
        }
        byteArrayOutputStream.write(bArr);
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x001b, code lost:
    
        if (r0.getResourceId(0, -1) != (-1)) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void g(Context context, AttributeSet attributeSet, int[] iArr, int i2, int i3, int... iArr2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, c70.M, i2, i3);
        boolean z = false;
        if (!obtainStyledAttributes.getBoolean(2, false)) {
            obtainStyledAttributes.recycle();
            return;
        }
        if (iArr2.length != 0) {
            TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr, i2, i3);
            for (int i4 : iArr2) {
                if (obtainStyledAttributes2.getResourceId(i4, -1) == -1) {
                    obtainStyledAttributes2.recycle();
                    break;
                }
            }
            obtainStyledAttributes2.recycle();
            z = true;
            obtainStyledAttributes.recycle();
            if (z) {
                return;
            }
            s9.k("This component requires that you specify a valid TextAppearance attribute. Update your app theme to inherit from Theme.MaterialComponents (or a descendant).");
        }
    }

    public static void g0(ByteArrayOutputStream byteArrayOutputStream, pj pjVar) {
        int i2 = 0;
        for (Map.Entry entry : pjVar.i.entrySet()) {
            int intValue = ((Integer) entry.getKey()).intValue();
            if ((((Integer) entry.getValue()).intValue() & 1) != 0) {
                gk0.X(byteArrayOutputStream, intValue - i2);
                gk0.X(byteArrayOutputStream, 0);
                i2 = intValue;
            }
        }
    }

    public static void h(Context context, int[] iArr, String str) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(iArr);
        for (int i2 = 0; i2 < iArr.length; i2++) {
            if (!obtainStyledAttributes.hasValue(i2)) {
                obtainStyledAttributes.recycle();
                s9.k(r7.c("The style on this component requires your app theme to be ", str, " (or a descendant)."));
                return;
            }
        }
        obtainStyledAttributes.recycle();
    }

    public static long i(long j2) {
        if (j2 < -4611686018427387903L) {
            return -4611686018427387903L;
        }
        if (j2 > 4611686018427387903L) {
            return 4611686018427387903L;
        }
        return j2;
    }

    public static byte[] j(pj[] pjVarArr, byte[] bArr) {
        int i2 = 0;
        int i3 = 0;
        for (pj pjVar : pjVarArr) {
            i3 += ((((pjVar.g * 2) + 7) & (-8)) / 8) + (pjVar.e * 2) + r(pjVar.a, pjVar.b, bArr).getBytes(StandardCharsets.UTF_8).length + 16 + pjVar.f;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(i3);
        if (Arrays.equals(bArr, gk0.j)) {
            int length = pjVarArr.length;
            while (i2 < length) {
                pj pjVar2 = pjVarArr[i2];
                e0(byteArrayOutputStream, pjVar2, r(pjVar2.a, pjVar2.b, bArr));
                d0(byteArrayOutputStream, pjVar2);
                i2++;
            }
        } else {
            for (pj pjVar3 : pjVarArr) {
                e0(byteArrayOutputStream, pjVar3, r(pjVar3.a, pjVar3.b, bArr));
            }
            int length2 = pjVarArr.length;
            while (i2 < length2) {
                d0(byteArrayOutputStream, pjVarArr[i2]);
                i2++;
            }
        }
        if (byteArrayOutputStream.size() == i3) {
            return byteArrayOutputStream.toByteArray();
        }
        throw new IllegalStateException("The bytes saved do not match expectation. actual=" + byteArrayOutputStream.size() + " expected=" + i3);
    }

    public static n9 k(int i2) {
        return i2 != 0 ? i2 != 1 ? new xa0() : new nh() : new xa0();
    }

    public static Intent l() {
        throw null;
    }

    public static om0 m(Class cls) {
        try {
            Object newInstance = cls.getDeclaredConstructor(null).newInstance(null);
            newInstance.getClass();
            return (om0) newInstance;
        } catch (IllegalAccessException e2) {
            s9.q("Cannot create an instance of ", cls, e2);
            return null;
        } catch (InstantiationException e3) {
            s9.q("Cannot create an instance of ", cls, e3);
            return null;
        } catch (NoSuchMethodException e4) {
            s9.q("Cannot create an instance of ", cls, e4);
            return null;
        }
    }

    public static boolean n(File file) {
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
            z = n(file2) && z;
        }
        return z;
    }

    public static final boolean o(char c2, char c3, boolean z) {
        if (c2 == c3) {
            return true;
        }
        if (!z) {
            return false;
        }
        char upperCase = Character.toUpperCase(c2);
        char upperCase2 = Character.toUpperCase(c3);
        return upperCase == upperCase2 || Character.toLowerCase(upperCase) == Character.toLowerCase(upperCase2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [lc0] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.lang.Object, lc0] */
    public static final Object p(uc0 uc0Var, long j2, xr xrVar) {
        while (true) {
            if (uc0Var.c >= j2 && !uc0Var.a()) {
                return uc0Var;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = de.a;
            Object obj = atomicReferenceFieldUpdater.get(uc0Var);
            lm lmVar = b;
            if (obj == lmVar) {
                return lmVar;
            }
            ?? r1 = (lc0) ((de) obj);
            if (r1 == 0) {
                r1 = (lc0) xrVar.g(Long.valueOf(uc0Var.c + 1), uc0Var);
                while (!atomicReferenceFieldUpdater.compareAndSet(uc0Var, null, r1)) {
                    if (atomicReferenceFieldUpdater.get(uc0Var) != null) {
                        break;
                    }
                }
                if (uc0Var.a()) {
                    uc0Var.b();
                }
            }
            uc0Var = r1;
        }
    }

    public static final qg q(qg qgVar, qg qgVar2, boolean z) {
        Boolean bool = Boolean.FALSE;
        int i2 = 4;
        boolean booleanValue = ((Boolean) qgVar.n(bool, new gd(i2))).booleanValue();
        boolean booleanValue2 = ((Boolean) qgVar2.n(bool, new gd(i2))).booleanValue();
        if (!booleanValue && !booleanValue2) {
            return qgVar.r(qgVar2);
        }
        gd gdVar = new gd(2);
        um umVar = um.f;
        qg qgVar3 = (qg) qgVar.n(umVar, gdVar);
        Object obj = qgVar2;
        if (booleanValue2) {
            obj = qgVar2.n(umVar, new gd(3));
        }
        return qgVar3.r((qg) obj);
    }

    public static String r(String str, String str2, byte[] bArr) {
        byte[] bArr2 = gk0.k;
        byte[] bArr3 = gk0.l;
        String str3 = (Arrays.equals(bArr, bArr3) || Arrays.equals(bArr, bArr2)) ? ":" : "!";
        if (str.length() <= 0) {
            if ("!".equals(str3)) {
                return str2.replace(":", "!");
            }
            if (":".equals(str3)) {
                return str2.replace("!", ":");
            }
        } else {
            if (str2.equals("classes.dex")) {
                return str;
            }
            if (str2.contains("!") || str2.contains(":")) {
                if ("!".equals(str3)) {
                    return str2.replace(":", "!");
                }
                if (":".equals(str3)) {
                    return str2.replace("!", ":");
                }
            } else if (!str2.endsWith(".apk")) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                return r7.d(sb, (Arrays.equals(bArr, bArr3) || Arrays.equals(bArr, bArr2)) ? ":" : "!", str2);
            }
        }
        return str2;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0051  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static vs s(SSLSession sSLSession) {
        List list;
        Certificate[] localCertificates;
        Certificate[] peerCertificates;
        List list2 = wm.f;
        String cipherSuite = sSLSession.getCipherSuite();
        if (cipherSuite == null) {
            s9.u("cipherSuite == null");
            return null;
        }
        if (cipherSuite.equals("TLS_NULL_WITH_NULL_NULL") ? true : cipherSuite.equals("SSL_NULL_WITH_NULL_NULL")) {
            s9.w("cipherSuite == ".concat(cipherSuite));
            return null;
        }
        zb i2 = zb.b.i(cipherSuite);
        String protocol = sSLSession.getProtocol();
        if (protocol == null) {
            s9.u("tlsVersion == null");
            return null;
        }
        if ("NONE".equals(protocol)) {
            s9.w("tlsVersion == NONE");
            return null;
        }
        ni0.Companion.getClass();
        ni0 a2 = mi0.a(protocol);
        try {
            peerCertificates = sSLSession.getPeerCertificates();
        } catch (SSLPeerUnverifiedException unused) {
        }
        if (peerCertificates != null) {
            list = zk0.i(Arrays.copyOf(peerCertificates, peerCertificates.length));
            localCertificates = sSLSession.getLocalCertificates();
            if (localCertificates != null) {
                list2 = zk0.i(Arrays.copyOf(localCertificates, localCertificates.length));
            }
            return new vs(a2, i2, list2, new us(0, list));
        }
        list = list2;
        localCertificates = sSLSession.getLocalCertificates();
        if (localCertificates != null) {
        }
        return new vs(a2, i2, list2, new us(0, list));
    }

    public static final fj t(qg qgVar) {
        og w = qgVar.w(sl.g);
        fj fjVar = w instanceof fj ? (fj) w : null;
        return fjVar == null ? gi.a : fjVar;
    }

    public static float u(EdgeEffect edgeEffect) {
        if (Build.VERSION.SDK_INT >= 31) {
            return jl.b(edgeEffect);
        }
        return 0.0f;
    }

    public static Drawable v(Context context, int i2) {
        return p90.b().c(context, i2);
    }

    public static float x(int i2, String[] strArr) {
        float parseFloat = Float.parseFloat(strArr[i2]);
        if (parseFloat >= 0.0f && parseFloat <= 1.0f) {
            return parseFloat;
        }
        throw new IllegalArgumentException("Motion easing control point value must be between 0 and 1; instead got: " + parseFloat);
    }

    public static final ka y(dg dgVar) {
        ka kaVar;
        ka kaVar2;
        if (!(dgVar instanceof ek)) {
            return new ka(dgVar, 1);
        }
        ek ekVar = (ek) dgVar;
        lm lmVar = mv.i;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = ek.m;
        loop0: while (true) {
            Object obj = atomicReferenceFieldUpdater.get(ekVar);
            kaVar = null;
            if (obj == null) {
                atomicReferenceFieldUpdater.set(ekVar, lmVar);
                kaVar2 = null;
                break;
            }
            if (obj instanceof ka) {
                while (!atomicReferenceFieldUpdater.compareAndSet(ekVar, obj, lmVar)) {
                    if (atomicReferenceFieldUpdater.get(ekVar) != obj) {
                        break;
                    }
                }
                kaVar2 = (ka) obj;
                break loop0;
            }
            if (obj != lmVar && !(obj instanceof Throwable)) {
                s9.x(obj, "Inconsistent state ");
                return null;
            }
        }
        if (kaVar2 != null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = ka.l;
            Object obj2 = atomicReferenceFieldUpdater2.get(kaVar2);
            if (!(obj2 instanceof jd) || ((jd) obj2).d == null) {
                ka.k.set(kaVar2, 536870911);
                atomicReferenceFieldUpdater2.set(kaVar2, q1.a);
                kaVar = kaVar2;
            } else {
                kaVar2.r();
            }
            if (kaVar != null) {
                return kaVar;
            }
        }
        return new ka(dgVar, 2);
    }

    public static final Bundle z(Bundle bundle, String str) {
        Bundle bundle2 = bundle.getBundle(str);
        if (bundle2 != null) {
            return bundle2;
        }
        s9.k(r7.c("No valid saved state was found for the key '", str, "'. It may be missing, null, or not of the expected type. This can occur if the value was saved with a different type or if the saved state was modified unexpectedly."));
        return null;
    }

    public abstract void V(boolean z);

    public abstract void X(boolean z);

    public abstract InputFilter[] w(InputFilter[] inputFilterArr);
}
