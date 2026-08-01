package defpackage;

import android.animation.TimeInterpolator;
import android.app.AppOpsManager;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Path;
import android.graphics.Point;
import android.net.Uri;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import android.os.Process;
import android.os.StrictMode;
import android.os.Trace;
import android.text.SpannableStringBuilder;
import android.util.AttributeSet;
import android.util.Base64;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import android.view.Display;
import android.view.KeyEvent;
import android.view.RoundedCorner;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.AnimationUtils;
import android.view.animation.PathInterpolator;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.derinko.gbini.n1casino.R;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.security.cert.Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import java.util.zip.DataFormatException;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.Inflater;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import org.json.JSONObject;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public abstract class o8 {
    public static final char[] a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    public static final float[][] b = {new float[]{0.401288f, 0.650173f, -0.051461f}, new float[]{-0.250268f, 1.204414f, 0.045854f}, new float[]{-0.002079f, 0.048952f, 0.953127f}};
    public static final float[][] c = {new float[]{1.8620678f, -1.0112547f, 0.14918678f}, new float[]{0.38752654f, 0.62144744f, -0.00897398f}, new float[]{-0.0158415f, -0.03412294f, 1.0499644f}};
    public static final float[] d = {95.047f, 100.0f, 108.883f};
    public static final float[][] e = {new float[]{0.41233894f, 0.35762063f, 0.18051042f}, new float[]{0.2126f, 0.7152f, 0.0722f}, new float[]{0.01932141f, 0.11916382f, 0.9503448f}};
    public static final v7 f = new v7();
    public static final vw g = new vw(13);
    public static final byte[] h = {48, 49, 53, 0};
    public static final byte[] i = {48, 49, 48, 0};
    public static final byte[] j = {48, 48, 57, 0};
    public static final byte[] k = {48, 48, 53, 0};
    public static final byte[] l = {48, 48, 49, 0};
    public static final byte[] m = {48, 48, 49, 0};
    public static final byte[] n = {48, 48, 50, 0};
    public static final int[] o = {R.attr.colorPrimary};
    public static final int[] p = {R.attr.colorPrimaryVariant};
    public static long q;
    public static Method r;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    public static final Class A(ma maVar) {
        maVar.getClass();
        if (c10.class.isPrimitive()) {
            String name = c10.class.getName();
            switch (name.hashCode()) {
                case -1325958191:
                    if (name.equals("double")) {
                        return Double.class;
                    }
                    break;
                case 104431:
                    if (name.equals("int")) {
                        return Integer.class;
                    }
                    break;
                case 3039496:
                    if (name.equals("byte")) {
                        return Byte.class;
                    }
                    break;
                case 3052374:
                    if (name.equals("char")) {
                        return Character.class;
                    }
                    break;
                case 3327612:
                    if (name.equals("long")) {
                        return Long.class;
                    }
                    break;
                case 3625364:
                    if (name.equals("void")) {
                        return Void.class;
                    }
                    break;
                case 64711720:
                    if (name.equals("boolean")) {
                        return Boolean.class;
                    }
                    break;
                case 97526364:
                    if (name.equals("float")) {
                        return Float.class;
                    }
                    break;
                case 109413500:
                    if (name.equals("short")) {
                        return Short.class;
                    }
                    break;
            }
        }
        return c10.class;
    }

    public static float B(String[] strArr, int i2) {
        float parseFloat = Float.parseFloat(strArr[i2]);
        if (parseFloat >= 0.0f && parseFloat <= 1.0f) {
            return parseFloat;
        }
        throw new IllegalArgumentException("Motion easing control point value must be between 0 and 1; instead got: " + parseFloat);
    }

    public static void B0(int i2, qc qcVar, ad adVar) {
        boolean z;
        lc lcVar;
        lc lcVar2;
        lc lcVar3;
        lc lcVar4;
        if (adVar.n) {
            return;
        }
        if (!(adVar instanceof bd) && adVar.z() && g(adVar)) {
            bd.V(adVar, qcVar, new v7());
        }
        lc i3 = adVar.i(3);
        lc i4 = adVar.i(5);
        int d2 = i3.d();
        int d3 = i4.d();
        HashSet hashSet = i3.a;
        if (hashSet != null && i3.c) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                lc lcVar5 = (lc) it.next();
                ad adVar2 = lcVar5.d;
                int i5 = i2 + 1;
                boolean g2 = g(adVar2);
                lc lcVar6 = adVar2.J;
                lc lcVar7 = adVar2.L;
                if (adVar2.z() && g2) {
                    bd.V(adVar2, qcVar, new v7());
                }
                boolean z2 = (lcVar5 == lcVar6 && (lcVar4 = lcVar7.f) != null && lcVar4.c) || (lcVar5 == lcVar7 && (lcVar3 = lcVar6.f) != null && lcVar3.c);
                int i6 = adVar2.p0[1];
                if (i6 != 3 || g2) {
                    if (!adVar2.z()) {
                        if (lcVar5 == lcVar6 && lcVar7.f == null) {
                            int e2 = lcVar6.e() + d2;
                            adVar2.K(e2, adVar2.k() + e2);
                            B0(i5, qcVar, adVar2);
                        } else if (lcVar5 == lcVar7 && lcVar6.f == null) {
                            int e3 = d2 - lcVar7.e();
                            adVar2.K(e3 - adVar2.k(), e3);
                            B0(i5, qcVar, adVar2);
                        } else if (z2 && !adVar2.y()) {
                            u0(i5, qcVar, adVar2);
                        }
                    }
                } else if (i6 == 3 && adVar2.y >= 0 && adVar2.x >= 0 && (adVar2.g0 == 8 || (adVar2.s == 0 && adVar2.W == 0.0f))) {
                    if (!adVar2.y() && !adVar2.F && z2 && !adVar2.y()) {
                        v0(i5, adVar, qcVar, adVar2);
                    }
                }
            }
        }
        boolean z3 = true;
        z3 = true;
        z3 = true;
        if (adVar instanceof om) {
            return;
        }
        HashSet hashSet2 = i4.a;
        if (hashSet2 != null && i4.c) {
            Iterator it2 = hashSet2.iterator();
            while (it2.hasNext()) {
                lc lcVar8 = (lc) it2.next();
                ad adVar3 = lcVar8.d;
                int i7 = i2 + 1;
                boolean g3 = g(adVar3);
                lc lcVar9 = adVar3.J;
                lc lcVar10 = adVar3.L;
                if (adVar3.z() && g3) {
                    bd.V(adVar3, qcVar, new v7());
                }
                boolean z4 = (lcVar8 == lcVar9 && (lcVar2 = lcVar10.f) != null && lcVar2.c) || (lcVar8 == lcVar10 && (lcVar = lcVar9.f) != null && lcVar.c);
                int i8 = adVar3.p0[1];
                if (i8 != 3 || g3) {
                    if (!adVar3.z()) {
                        if (lcVar8 == lcVar9 && lcVar10.f == null) {
                            int e4 = lcVar9.e() + d3;
                            adVar3.K(e4, adVar3.k() + e4);
                            B0(i7, qcVar, adVar3);
                        } else if (lcVar8 == lcVar10 && lcVar9.f == null) {
                            int e5 = d3 - lcVar10.e();
                            adVar3.K(e5 - adVar3.k(), e5);
                            B0(i7, qcVar, adVar3);
                        } else if (z4 && !adVar3.y()) {
                            u0(i7, qcVar, adVar3);
                        }
                    }
                } else if (i8 == 3 && adVar3.y >= 0 && adVar3.x >= 0 && (adVar3.g0 == 8 || (adVar3.s == 0 && adVar3.W == 0.0f))) {
                    if (!adVar3.y() && !adVar3.F && z4 && !adVar3.y()) {
                        v0(i7, adVar, qcVar, adVar3);
                    }
                }
            }
        }
        lc i9 = adVar.i(6);
        if (i9.a != null && i9.c) {
            int d4 = i9.d();
            Iterator it3 = i9.a.iterator();
            while (it3.hasNext()) {
                lc lcVar11 = (lc) it3.next();
                ad adVar4 = lcVar11.d;
                int i10 = i2 + 1;
                boolean g4 = g(adVar4);
                lc lcVar12 = adVar4.M;
                if (adVar4.z() && g4) {
                    bd.V(adVar4, qcVar, new v7());
                }
                if (adVar4.p0[z3 ? 1 : 0] != 3 || g4) {
                    if (!adVar4.z()) {
                        if (lcVar11 == lcVar12) {
                            int e6 = lcVar11.e() + d4;
                            if (adVar4.E) {
                                int i11 = e6 - adVar4.a0;
                                int i12 = adVar4.V + i11;
                                adVar4.Z = i11;
                                adVar4.J.l(i11);
                                adVar4.L.l(i12);
                                lcVar12.l(e6);
                                z = z3 ? 1 : 0;
                                adVar4.l = z;
                            } else {
                                z = z3 ? 1 : 0;
                            }
                            B0(i10, qcVar, adVar4);
                            z3 = z;
                        }
                    }
                }
                z = z3 ? 1 : 0;
                z3 = z;
            }
        }
        adVar.n = z3;
    }

    public static void C0(ByteArrayOutputStream byteArrayOutputStream, long j2, int i2) {
        byte[] bArr = new byte[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            bArr[i3] = (byte) ((j2 >> (i3 * 8)) & 255);
        }
        byteArrayOutputStream.write(bArr);
    }

    public static void D0(ByteArrayOutputStream byteArrayOutputStream, int i2) {
        C0(byteArrayOutputStream, i2, 2);
    }

    public static float E0() {
        return ((float) Math.pow(0.5689655172413793d, 3.0d)) * 100.0f;
    }

    /* JADX WARN: Code restructure failed: missing block: B:3:0x0007, code lost:
    
        r3 = r3.getRoundedCorner(r4);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static p00 G(Display display, int i2) {
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
                        t8.k(d30.e("Invalid position: ", position));
                        return null;
                    }
                }
            }
        } else {
            i3 = 0;
        }
        radius = roundedCorner.getRadius();
        center = roundedCorner.getCenter();
        return new p00(i3, radius, center);
    }

    public static File I(Context context) {
        File cacheDir = context.getCacheDir();
        if (cacheDir == null) {
            return null;
        }
        String str = ".font" + Process.myPid() + "-" + Process.myTid() + "-";
        for (int i2 = 0; i2 < 100; i2++) {
            File file = new File(cacheDir, str + i2);
            if (file.createNewFile()) {
                return file;
            }
        }
        return null;
    }

    public static void K(int i2, qc qcVar, ad adVar, boolean z) {
        lc lcVar;
        lc lcVar2;
        boolean z2;
        lc lcVar3;
        lc lcVar4;
        if (adVar.m) {
            return;
        }
        if (!(adVar instanceof bd) && adVar.z() && g(adVar)) {
            bd.V(adVar, qcVar, new v7());
        }
        lc i3 = adVar.i(2);
        lc i4 = adVar.i(4);
        int d2 = i3.d();
        int d3 = i4.d();
        HashSet hashSet = i3.a;
        if (hashSet != null && i3.c) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                lc lcVar5 = (lc) it.next();
                ad adVar2 = lcVar5.d;
                int i5 = i2 + 1;
                boolean g2 = g(adVar2);
                lc lcVar6 = adVar2.I;
                lc lcVar7 = adVar2.K;
                if (adVar2.z() && g2) {
                    z2 = true;
                    bd.V(adVar2, qcVar, new v7());
                } else {
                    z2 = true;
                }
                boolean z3 = ((lcVar5 == lcVar6 && (lcVar4 = lcVar7.f) != null && lcVar4.c) || (lcVar5 == lcVar7 && (lcVar3 = lcVar6.f) != null && lcVar3.c)) ? z2 : false;
                int i6 = adVar2.p0[0];
                if (i6 != 3 || g2) {
                    if (!adVar2.z()) {
                        if (lcVar5 == lcVar6 && lcVar7.f == null) {
                            int e2 = lcVar6.e() + d2;
                            adVar2.J(e2, adVar2.q() + e2);
                            K(i5, qcVar, adVar2, z);
                        } else if (lcVar5 == lcVar7 && lcVar6.f == null) {
                            int e3 = d2 - lcVar7.e();
                            adVar2.J(e3 - adVar2.q(), e3);
                            K(i5, qcVar, adVar2, z);
                        } else if (z3 && !adVar2.x()) {
                            s0(i5, qcVar, adVar2, z);
                        }
                    }
                } else if (i6 == 3 && adVar2.v >= 0 && adVar2.u >= 0 && (adVar2.g0 == 8 || (adVar2.r == 0 && adVar2.W == 0.0f))) {
                    if (!adVar2.x() && !adVar2.F && z3 && !adVar2.x()) {
                        t0(i5, adVar, qcVar, adVar2, z);
                    }
                }
            }
        }
        if (adVar instanceof om) {
            return;
        }
        HashSet hashSet2 = i4.a;
        if (hashSet2 != null && i4.c) {
            Iterator it2 = hashSet2.iterator();
            while (it2.hasNext()) {
                lc lcVar8 = (lc) it2.next();
                ad adVar3 = lcVar8.d;
                int i7 = i2 + 1;
                boolean g3 = g(adVar3);
                lc lcVar9 = adVar3.I;
                lc lcVar10 = adVar3.K;
                if (adVar3.z() && g3) {
                    bd.V(adVar3, qcVar, new v7());
                }
                boolean z4 = (lcVar8 == lcVar9 && (lcVar2 = lcVar10.f) != null && lcVar2.c) || (lcVar8 == lcVar10 && (lcVar = lcVar9.f) != null && lcVar.c);
                int i8 = adVar3.p0[0];
                if (i8 != 3 || g3) {
                    if (!adVar3.z()) {
                        if (lcVar8 == lcVar9 && lcVar10.f == null) {
                            int e4 = lcVar9.e() + d3;
                            adVar3.J(e4, adVar3.q() + e4);
                            K(i7, qcVar, adVar3, z);
                        } else if (lcVar8 == lcVar10 && lcVar9.f == null) {
                            int e5 = d3 - lcVar10.e();
                            adVar3.J(e5 - adVar3.q(), e5);
                            K(i7, qcVar, adVar3, z);
                        } else if (z4 && !adVar3.x()) {
                            s0(i7, qcVar, adVar3, z);
                        }
                    }
                } else if (i8 == 3 && adVar3.v >= 0 && adVar3.u >= 0) {
                    if (adVar3.g0 == 8 || (adVar3.r == 0 && adVar3.W == 0.0f)) {
                        if (!adVar3.x() && !adVar3.F && z4 && !adVar3.x()) {
                            t0(i7, adVar, qcVar, adVar3, z);
                        }
                    }
                }
            }
        }
        adVar.m = true;
    }

    public static int L(float f2) {
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
        float[] fArr = d;
        return lb.a(f6 * fArr[0], f4 * fArr[1], f5 * fArr[2]);
    }

    public static boolean N() {
        if (Build.VERSION.SDK_INT >= 29) {
            return m60.a();
        }
        try {
            if (r == null) {
                q = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                r = Trace.class.getMethod("isTagEnabled", Long.TYPE);
            }
            return ((Boolean) r.invoke(null, Long.valueOf(q))).booleanValue();
        } catch (Exception e2) {
            if (!(e2 instanceof InvocationTargetException)) {
                Log.v("Trace", "Unable to call isTagEnabled via reflection", e2);
                return false;
            }
            Throwable cause = e2.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            throw new RuntimeException(cause);
        }
    }

    public static boolean P(String str, String str2) {
        return str.startsWith(str2.concat("(")) && str.endsWith(")");
    }

    public static int S(int i2, int i3, int i4) {
        if ((i3 & 8) != 0) {
            i2--;
        }
        if (i4 <= i2) {
            return i2 - i4;
        }
        t8.y(d30.d(i4, i2, "PROTOCOL_ERROR padding ", " > remaining length "));
        return 0;
    }

    public static float T(int i2) {
        float f2 = i2 / 255.0f;
        return (f2 <= 0.04045f ? f2 / 12.92f : (float) Math.pow((f2 + 0.055f) / 1.055f, 2.4000000953674316d)) * 100.0f;
    }

    public static List U(Object obj) {
        List singletonList = Collections.singletonList(obj);
        singletonList.getClass();
        return singletonList;
    }

    public static MappedByteBuffer V(Context context, Uri uri) {
        ParcelFileDescriptor openFileDescriptor;
        try {
            openFileDescriptor = context.getContentResolver().openFileDescriptor(uri, "r", null);
        } catch (IOException unused) {
        }
        if (openFileDescriptor == null) {
            if (openFileDescriptor != null) {
                openFileDescriptor.close();
                return null;
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
    }

    public static TypedArray W(Context context, AttributeSet attributeSet, int[] iArr, int i2, int i3, int... iArr2) {
        h(context, attributeSet, i2, i3);
        k(context, attributeSet, iArr, i2, i3, iArr2);
        return context.obtainStyledAttributes(attributeSet, iArr, i2, i3);
    }

    public static void Y(EditorInfo editorInfo, InputConnection inputConnection, TextView textView) {
        if (inputConnection == null || editorInfo.hintText != null) {
            return;
        }
        for (ViewParent parent = textView.getParent(); parent instanceof View; parent = parent.getParent()) {
        }
    }

    public static final int a(char c2) {
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

    public static final void b(d50 d50Var, e50 e50Var, String str) {
        f50.i.fine(e50Var.b + ' ' + String.format("%-22s", Arrays.copyOf(new Object[]{str}, 1)) + ": " + d50Var.a);
    }

    public static x6 c() {
        x6 x6Var = x6.l;
        x6Var.getClass();
        x6 x6Var2 = x6Var.f;
        if (x6Var2 == null) {
            long nanoTime = System.nanoTime();
            x6.i.await(x6.j, TimeUnit.MILLISECONDS);
            x6 x6Var3 = x6.l;
            x6Var3.getClass();
            if (x6Var3.f != null || System.nanoTime() - nanoTime < x6.k) {
                return null;
            }
            return x6.l;
        }
        long nanoTime2 = x6Var2.g - System.nanoTime();
        if (nanoTime2 > 0) {
            x6.i.await(nanoTime2, TimeUnit.NANOSECONDS);
            return null;
        }
        x6 x6Var4 = x6.l;
        x6Var4.getClass();
        x6Var4.f = x6Var2.f;
        x6Var2.f = null;
        return x6Var2;
    }

    public static void d(String str) {
        if (str.length() > 127) {
            str = str.substring(0, 127);
        }
        Trace.beginSection(str);
    }

    public static zj d0(XmlResourceParser xmlResourceParser, Resources resources) {
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
            r0(xmlResourceParser);
            return null;
        }
        TypedArray obtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), sx.b);
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
                        TypedArray obtainAttributes2 = resources.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), sx.c);
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
                            r0(xmlResourceParser);
                        }
                        arrayList.add(new bk(string7, i7, z, string6, i9, resourceId2));
                    } else {
                        r0(xmlResourceParser);
                    }
                }
            }
            if (arrayList.isEmpty()) {
                return null;
            }
            return new ak((bk[]) arrayList.toArray(new bk[0]));
        }
        List f0 = f0(resources, resourceId);
        ArrayList arrayList2 = new ArrayList();
        while (xmlResourceParser.next() != i6) {
            if (xmlResourceParser.getEventType() == i2) {
                if (xmlResourceParser.getName().equals("fallback")) {
                    TypedArray obtainAttributes3 = resources.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), sx.d);
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
                            r0(xmlResourceParser);
                        }
                        try {
                            typedArray = obtainAttributes3;
                            i3 = i6;
                            try {
                                sj sjVar = new sj(string, string2, string8, f0, string9, string10);
                                typedArray.recycle();
                                arrayList2.add(sjVar);
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
                r0(xmlResourceParser);
                i6 = i3;
                integer = i4;
                i2 = 2;
                i5 = 0;
            }
        }
        int i11 = integer;
        if (!arrayList2.isEmpty()) {
            return new ck(arrayList2, i11, integer2, string5);
        }
        if (string3 == null) {
            t8.k("The provider font XML requires query attribute or fallback children.");
            return null;
        }
        arrayList2.add(new sj(string, string2, string3, f0, null, null));
        if (string4 != null) {
            arrayList2.add(new sj(string, string2, string4, f0, null, null));
        }
        return new ck(arrayList2, i11, integer2, string5);
    }

    public static byte[] e0(InputStream inputStream, int i2) {
        byte[] bArr = new byte[i2];
        int i3 = 0;
        while (i3 < i2) {
            int read = inputStream.read(bArr, i3, i2 - i3);
            if (read < 0) {
                t8.t(d30.e("Not enough bytes to read: ", i2));
                return null;
            }
            i3 += read;
        }
        return bArr;
    }

    public static List f0(Resources resources, int i2) {
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

    public static boolean g(ad adVar) {
        int[] iArr = adVar.p0;
        int i2 = iArr[0];
        int i3 = iArr[1];
        ad adVar2 = adVar.T;
        bd bdVar = adVar2 != null ? (bd) adVar2 : null;
        if (bdVar != null) {
            int i4 = bdVar.p0[0];
        }
        if (bdVar != null) {
            int i5 = bdVar.p0[1];
        }
        boolean z = i2 == 1 || adVar.A() || i2 == 2 || (i2 == 3 && adVar.r == 0 && adVar.W == 0.0f && adVar.t(0)) || (i2 == 3 && adVar.r == 1 && adVar.u(0, adVar.q()));
        boolean z2 = i3 == 1 || adVar.B() || i3 == 2 || (i3 == 3 && adVar.s == 0 && adVar.W == 0.0f && adVar.t(1)) || (i3 == 3 && adVar.s == 1 && adVar.u(1, adVar.k()));
        return (adVar.W > 0.0f && (z || z2)) || (z && z2);
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
    public static byte[] g0(FileInputStream fileInputStream, int i2, int i3) {
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

    public static void h(Context context, AttributeSet attributeSet, int i2, int i3) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, vx.K, i2, i3);
        boolean z = obtainStyledAttributes.getBoolean(1, false);
        obtainStyledAttributes.recycle();
        if (z) {
            TypedValue typedValue = new TypedValue();
            if (!context.getTheme().resolveAttribute(R.attr.isMaterialTheme, typedValue, true) || (typedValue.type == 18 && typedValue.data == 0)) {
                l(context, p, "Theme.MaterialComponents");
            }
        }
        l(context, o, "Theme.AppCompat");
    }

    public static long h0(InputStream inputStream, int i2) {
        byte[] e0 = e0(inputStream, i2);
        long j2 = 0;
        for (int i3 = 0; i3 < i2; i3++) {
            j2 += (e0[i3] & 255) << (i3 * 8);
        }
        return j2;
    }

    public static final void i(long j2, long j3, long j4) {
        if ((j3 | j4) < 0 || j3 > j2 || j2 - j3 < j4) {
            throw new ArrayIndexOutOfBoundsException("size=" + j2 + " offset=" + j3 + " byteCount=" + j4);
        }
    }

    public static int i0(Context context, int i2, int i3) {
        TypedValue I = zo.I(context.getTheme(), i2);
        return (I == null || I.type != 16) ? i3 : I.data;
    }

    public static int j(Context context, String str) {
        int noteProxyOpNoThrow;
        int myPid = Process.myPid();
        int myUid = Process.myUid();
        String packageName = context.getPackageName();
        if (context.checkPermission(str, myPid, myUid) != -1) {
            String permissionToOp = AppOpsManager.permissionToOp(str);
            if (permissionToOp != null) {
                if (packageName == null) {
                    String[] packagesForUid = context.getPackageManager().getPackagesForUid(myUid);
                    if (packagesForUid != null && packagesForUid.length > 0) {
                        packageName = packagesForUid[0];
                    }
                }
                int myUid2 = Process.myUid();
                String packageName2 = context.getPackageName();
                if (myUid2 != myUid || !Objects.equals(packageName2, packageName)) {
                    noteProxyOpNoThrow = ((AppOpsManager) context.getSystemService(AppOpsManager.class)).noteProxyOpNoThrow(permissionToOp, packageName);
                } else if (Build.VERSION.SDK_INT >= 29) {
                    AppOpsManager appOpsManager = (AppOpsManager) context.getSystemService(AppOpsManager.class);
                    noteProxyOpNoThrow = appOpsManager == null ? 1 : appOpsManager.checkOpNoThrow(permissionToOp, Binder.getCallingUid(), packageName);
                    if (noteProxyOpNoThrow == 0) {
                        noteProxyOpNoThrow = appOpsManager != null ? appOpsManager.checkOpNoThrow(permissionToOp, myUid, d6.a(context)) : 1;
                    }
                } else {
                    noteProxyOpNoThrow = ((AppOpsManager) context.getSystemService(AppOpsManager.class)).noteProxyOpNoThrow(permissionToOp, packageName);
                }
                if (noteProxyOpNoThrow != 0) {
                    return -2;
                }
            }
            return 0;
        }
        return -1;
    }

    public static TimeInterpolator j0(Context context, int i2, TimeInterpolator timeInterpolator) {
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(i2, typedValue, true)) {
            return timeInterpolator;
        }
        if (typedValue.type != 3) {
            t8.k("Motion easing theme attribute must be an @interpolator resource for ?attr/motionEasing*Interpolator attributes or a string for ?attr/motionEasing* attributes.");
            return null;
        }
        String valueOf = String.valueOf(typedValue.string);
        if (!P(valueOf, "cubic-bezier") && !P(valueOf, "path")) {
            return AnimationUtils.loadInterpolator(context, typedValue.resourceId);
        }
        if (P(valueOf, "cubic-bezier")) {
            String[] split = valueOf.substring(13, valueOf.length() - 1).split(",");
            if (split.length == 4) {
                return new PathInterpolator(B(split, 0), B(split, 1), B(split, 2), B(split, 3));
            }
            throw new IllegalArgumentException("Motion easing theme attribute must have 4 control points if using bezier curve format; instead got: " + split.length);
        }
        if (!P(valueOf, "path")) {
            t8.k("Invalid motion easing type: ".concat(valueOf));
            return null;
        }
        String substring = valueOf.substring(5, valueOf.length() - 1);
        Path path = new Path();
        try {
            rw.b(e70.q(substring), path);
            return new PathInterpolator(path);
        } catch (RuntimeException e2) {
            throw new RuntimeException("Error in parsing ".concat(substring), e2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x001b, code lost:
    
        if (r0.getResourceId(0, -1) != (-1)) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void k(Context context, AttributeSet attributeSet, int[] iArr, int i2, int i3, int... iArr2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, vx.K, i2, i3);
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
            t8.k("This component requires that you specify a valid TextAppearance attribute. Update your app theme to inherit from Theme.MaterialComponents (or a descendant).");
        }
    }

    public static m30 k0(Context context) {
        TypedValue I = zo.I(context.getTheme(), R.attr.motionSpringFastSpatial);
        int[] iArr = vx.y;
        TypedArray obtainStyledAttributes = I == null ? context.obtainStyledAttributes(null, iArr, 0, R.style.Motion_Material3_Spring_Standard_Fast_Spatial) : context.obtainStyledAttributes(I.resourceId, iArr);
        m30 m30Var = new m30();
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
            m30Var.a = Math.sqrt(f2);
            m30Var.c = false;
            if (f3 < 0.0f) {
                throw new IllegalArgumentException("Damping ratio must be non-negative");
            }
            m30Var.b = f3;
            m30Var.c = false;
            obtainStyledAttributes.recycle();
            return m30Var;
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    public static void l(Context context, int[] iArr, String str) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(iArr);
        for (int i2 = 0; i2 < iArr.length; i2++) {
            if (!obtainStyledAttributes.hasValue(i2)) {
                obtainStyledAttributes.recycle();
                throw new IllegalArgumentException("The style on this component requires your app theme to be " + str + " (or a descendant).");
            }
        }
        obtainStyledAttributes.recycle();
    }

    public static void m0(View view, ct ctVar) {
        eh ehVar = ctVar.g.b;
        if (ehVar == null || !ehVar.a) {
            return;
        }
        float f2 = 0.0f;
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            f2 += ((View) parent).getElevation();
        }
        at atVar = ctVar.g;
        if (atVar.l != f2) {
            atVar.l = f2;
            ctVar.y();
        }
    }

    public static void o0(EditorInfo editorInfo, CharSequence charSequence, int i2, int i3) {
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        editorInfo.extras.putCharSequence("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SURROUNDING_TEXT", charSequence != null ? new SpannableStringBuilder(charSequence) : null);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_HEAD", i2);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_END", i3);
    }

    public static byte[] p(byte[] bArr) {
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

    public static boolean q(File file, InputStream inputStream) {
        FileOutputStream fileOutputStream;
        StrictMode.ThreadPolicy allowThreadDiskWrites = StrictMode.allowThreadDiskWrites();
        FileOutputStream fileOutputStream2 = null;
        try {
            try {
                fileOutputStream = new FileOutputStream(file, false);
            } catch (IOException e2) {
                e = e2;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            byte[] bArr = new byte[1024];
            while (true) {
                int read = inputStream.read(bArr);
                if (read != -1) {
                    fileOutputStream.write(bArr, 0, read);
                } else {
                    try {
                        break;
                    } catch (IOException unused) {
                    }
                }
            }
            fileOutputStream.close();
            StrictMode.setThreadPolicy(allowThreadDiskWrites);
            return true;
        } catch (IOException e3) {
            e = e3;
            fileOutputStream2 = fileOutputStream;
            Log.e("TypefaceCompatUtil", "Error copying resource contents to temp file: " + e.getMessage());
            if (fileOutputStream2 != null) {
                try {
                    fileOutputStream2.close();
                } catch (IOException unused2) {
                }
            }
            StrictMode.setThreadPolicy(allowThreadDiskWrites);
            return false;
        } catch (Throwable th2) {
            th = th2;
            fileOutputStream2 = fileOutputStream;
            if (fileOutputStream2 != null) {
                try {
                    fileOutputStream2.close();
                } catch (IOException unused3) {
                }
            }
            StrictMode.setThreadPolicy(allowThreadDiskWrites);
            throw th;
        }
    }

    public static jw r(int i2) {
        return i2 != 0 ? i2 != 1 ? new q00() : new be() : new q00();
    }

    public static void r0(XmlPullParser xmlPullParser) {
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

    public static void s0(int i2, qc qcVar, ad adVar, boolean z) {
        float f2 = adVar.d0;
        lc lcVar = adVar.I;
        int d2 = lcVar.f.d();
        lc lcVar2 = adVar.K;
        int d3 = lcVar2.f.d();
        int e2 = lcVar.e() + d2;
        int e3 = d3 - lcVar2.e();
        if (d2 == d3) {
            f2 = 0.5f;
        } else {
            d2 = e2;
            d3 = e3;
        }
        int q2 = adVar.q();
        int i3 = (d3 - d2) - q2;
        if (d2 > d3) {
            i3 = (d2 - d3) - q2;
        }
        int i4 = ((int) (i3 > 0 ? (f2 * i3) + 0.5f : f2 * i3)) + d2;
        int i5 = i4 + q2;
        if (d2 > d3) {
            i5 = i4 - q2;
        }
        adVar.J(i4, i5);
        K(i2 + 1, qcVar, adVar, z);
    }

    public static final String t(long j2) {
        String str;
        if (j2 <= -999500000) {
            str = ((j2 - 500000000) / 1000000000) + " s ";
        } else if (j2 <= -999500) {
            str = ((j2 - 500000) / 1000000) + " ms";
        } else if (j2 <= 0) {
            str = ((j2 - 500) / 1000) + " µs";
        } else if (j2 < 999500) {
            str = ((j2 + 500) / 1000) + " µs";
        } else if (j2 < 999500000) {
            str = ((j2 + 500000) / 1000000) + " ms";
        } else {
            str = ((j2 + 500000000) / 1000000000) + " s ";
        }
        return String.format("%6s", Arrays.copyOf(new Object[]{str}, 1));
    }

    public static void t0(int i2, ad adVar, qc qcVar, ad adVar2, boolean z) {
        float f2 = adVar2.d0;
        lc lcVar = adVar2.I;
        int e2 = lcVar.e() + lcVar.f.d();
        lc lcVar2 = adVar2.K;
        int d2 = lcVar2.f.d() - lcVar2.e();
        if (d2 >= e2) {
            int q2 = adVar2.q();
            if (adVar2.g0 != 8) {
                int i3 = adVar2.r;
                if (i3 == 2) {
                    q2 = (int) (adVar2.d0 * 0.5f * (adVar instanceof bd ? adVar.q() : adVar.T.q()));
                } else if (i3 == 0) {
                    q2 = d2 - e2;
                }
                q2 = Math.max(adVar2.u, q2);
                int i4 = adVar2.v;
                if (i4 > 0) {
                    q2 = Math.min(i4, q2);
                }
            }
            int i5 = e2 + ((int) ((f2 * ((d2 - e2) - q2)) + 0.5f));
            adVar2.J(i5, q2 + i5);
            K(i2 + 1, qcVar, adVar2, z);
        }
    }

    public static fv u(JSONObject jSONObject) {
        String string = jSONObject.getString("id");
        string.getClass();
        String optString = jSONObject.optString("title", "");
        optString.getClass();
        String optString2 = jSONObject.optString("content", "");
        optString2.getClass();
        String optString3 = jSONObject.optString("color", (String) fv.h.get(0));
        optString3.getClass();
        return new fv(string, optString, optString2, optString3, jSONObject.optBoolean("pinned", false), jSONObject.optLong("createdAt", System.currentTimeMillis()), jSONObject.optLong("updatedAt", System.currentTimeMillis()));
    }

    public static void u0(int i2, qc qcVar, ad adVar) {
        float f2 = adVar.e0;
        lc lcVar = adVar.J;
        int d2 = lcVar.f.d();
        lc lcVar2 = adVar.L;
        int d3 = lcVar2.f.d();
        int e2 = lcVar.e() + d2;
        int e3 = d3 - lcVar2.e();
        if (d2 == d3) {
            f2 = 0.5f;
        } else {
            d2 = e2;
            d3 = e3;
        }
        int k2 = adVar.k();
        int i3 = (d3 - d2) - k2;
        if (d2 > d3) {
            i3 = (d2 - d3) - k2;
        }
        int i4 = (int) (i3 > 0 ? (f2 * i3) + 0.5f : f2 * i3);
        int i5 = d2 + i4;
        int i6 = i5 + k2;
        if (d2 > d3) {
            i5 = d2 - i4;
            i6 = i5 - k2;
        }
        adVar.K(i5, i6);
        B0(i2 + 1, qcVar, adVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x004c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static sm v(SSLSession sSLSession) {
        List list;
        Certificate[] localCertificates;
        Certificate[] peerCertificates;
        List list2 = di.f;
        String cipherSuite = sSLSession.getCipherSuite();
        if (cipherSuite == null) {
            t8.t("cipherSuite == null");
            return null;
        }
        if (cipherSuite.equals("TLS_NULL_WITH_NULL_NULL") ? true : cipherSuite.equals("SSL_NULL_WITH_NULL_NULL")) {
            t8.y("cipherSuite == ".concat(cipherSuite));
            return null;
        }
        ka j2 = ka.b.j(cipherSuite);
        String protocol = sSLSession.getProtocol();
        if (protocol == null) {
            t8.t("tlsVersion == null");
            return null;
        }
        if ("NONE".equals(protocol)) {
            t8.y("tlsVersion == NONE");
            return null;
        }
        z50 u = e70.u(protocol);
        try {
            peerCertificates = sSLSession.getPeerCertificates();
        } catch (SSLPeerUnverifiedException unused) {
        }
        if (peerCertificates != null) {
            list = r70.i(Arrays.copyOf(peerCertificates, peerCertificates.length));
            localCertificates = sSLSession.getLocalCertificates();
            if (localCertificates != null) {
                list2 = r70.i(Arrays.copyOf(localCertificates, localCertificates.length));
            }
            return new sm(u, j2, list2, new rm(0, list));
        }
        list = list2;
        localCertificates = sSLSession.getLocalCertificates();
        if (localCertificates != null) {
        }
        return new sm(u, j2, list2, new rm(0, list));
    }

    public static void v0(int i2, ad adVar, qc qcVar, ad adVar2) {
        float f2 = adVar2.e0;
        lc lcVar = adVar2.J;
        int e2 = lcVar.e() + lcVar.f.d();
        lc lcVar2 = adVar2.L;
        int d2 = lcVar2.f.d() - lcVar2.e();
        if (d2 >= e2) {
            int k2 = adVar2.k();
            if (adVar2.g0 != 8) {
                int i3 = adVar2.s;
                if (i3 == 2) {
                    k2 = (int) (f2 * 0.5f * (adVar instanceof bd ? adVar.k() : adVar.T.k()));
                } else if (i3 == 0) {
                    k2 = d2 - e2;
                }
                k2 = Math.max(adVar2.x, k2);
                int i4 = adVar2.y;
                if (i4 > 0) {
                    k2 = Math.min(i4, k2);
                }
            }
            int i5 = e2 + ((int) ((f2 * ((d2 - e2) - k2)) + 0.5f));
            adVar2.K(i5, k2 + i5);
            B0(i2 + 1, qcVar, adVar2);
        }
    }

    public static vo x0(xo xoVar, int i2) {
        xoVar.getClass();
        boolean z = i2 > 0;
        Integer valueOf = Integer.valueOf(i2);
        if (!z) {
            throw new IllegalArgumentException("Step must be positive, was: " + valueOf + '.');
        }
        int i3 = xoVar.f;
        int i4 = xoVar.g;
        if (xoVar.h <= 0) {
            i2 = -i2;
        }
        return new vo(i3, i4, i2);
    }

    public static xo y0(int i2, int i3) {
        if (i3 > Integer.MIN_VALUE) {
            return new xo(i2, i3 - 1, 1);
        }
        xo xoVar = xo.i;
        return xo.i;
    }

    public abstract void A0(ViewGroup.MarginLayoutParams marginLayoutParams, int i2, int i3);

    public abstract int C();

    public abstract int D();

    public abstract int E(View view);

    public abstract int F(CoordinatorLayout coordinatorLayout);

    public abstract int H();

    public abstract Context J();

    public boolean M() {
        return false;
    }

    public abstract boolean O(float f2);

    public abstract boolean Q(View view);

    public abstract boolean R(float f2, float f3);

    public abstract void X();

    public abstract boolean a0(int i2, KeyEvent keyEvent);

    public boolean b0(KeyEvent keyEvent) {
        return false;
    }

    public boolean c0() {
        return false;
    }

    public abstract int e(ViewGroup.MarginLayoutParams marginLayoutParams);

    public abstract float f(int i2);

    public abstract void l0(boolean z);

    public abstract List m(List list, String str);

    public boolean n() {
        return false;
    }

    public abstract void n0(boolean z);

    public abstract boolean o();

    public abstract void p0(CharSequence charSequence);

    public abstract boolean q0(View view, float f2);

    public abstract void s(boolean z);

    public abstract int w(ViewGroup.MarginLayoutParams marginLayoutParams);

    public l1 w0(q4 q4Var) {
        return null;
    }

    public abstract int x();

    public abstract int y();

    public abstract int z();

    public abstract void z0(ViewGroup.MarginLayoutParams marginLayoutParams, int i2);

    public void Z() {
    }
}
