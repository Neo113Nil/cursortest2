package defpackage;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.Signature;
import android.content.res.TypedArray;
import android.graphics.Path;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.os.Process;
import android.os.StrictMode;
import android.os.Trace;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.AnimationUtils;
import android.view.animation.PathInterpolator;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.awerser.monnit.betplay.R;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
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
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public abstract class vw implements v90 {
    public static final Object a = new Object();
    public static final b8 b = new b8();
    public static final ix c = new ix(13);
    public static final byte[] d = {48, 49, 53, 0};
    public static final byte[] e = {48, 49, 48, 0};
    public static final byte[] f = {48, 48, 57, 0};
    public static final byte[] g = {48, 48, 53, 0};
    public static final byte[] h = {48, 48, 49, 0};
    public static final byte[] i = {48, 48, 49, 0};
    public static final byte[] j = {48, 48, 50, 0};
    public static final int[] k = {R.attr.colorPrimary};
    public static final int[] l = {R.attr.colorPrimaryVariant};
    public static long m;
    public static Method n;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    public static final Class D(qa qaVar) {
        qaVar.getClass();
        Class a2 = qaVar.a();
        if (a2.isPrimitive()) {
            String name = a2.getName();
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
        return a2;
    }

    public static float E(String[] strArr, int i2) {
        float parseFloat = Float.parseFloat(strArr[i2]);
        if (parseFloat >= 0.0f && parseFloat <= 1.0f) {
            return parseFloat;
        }
        throw new IllegalArgumentException("Motion easing control point value must be between 0 and 1; instead got: " + parseFloat);
    }

    public static File K(Context context) {
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

    public static void L(int i2, uc ucVar, ed edVar, boolean z) {
        pc pcVar;
        pc pcVar2;
        boolean z2;
        pc pcVar3;
        pc pcVar4;
        if (edVar.m) {
            return;
        }
        if (!(edVar instanceof fd) && edVar.z() && k(edVar)) {
            fd.V(edVar, ucVar, new b8());
        }
        pc i3 = edVar.i(2);
        pc i4 = edVar.i(4);
        int d2 = i3.d();
        int d3 = i4.d();
        HashSet hashSet = i3.a;
        if (hashSet != null && i3.c) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                pc pcVar5 = (pc) it.next();
                ed edVar2 = pcVar5.d;
                int i5 = i2 + 1;
                boolean k2 = k(edVar2);
                pc pcVar6 = edVar2.I;
                pc pcVar7 = edVar2.K;
                if (edVar2.z() && k2) {
                    z2 = true;
                    fd.V(edVar2, ucVar, new b8());
                } else {
                    z2 = true;
                }
                boolean z3 = ((pcVar5 == pcVar6 && (pcVar4 = pcVar7.f) != null && pcVar4.c) || (pcVar5 == pcVar7 && (pcVar3 = pcVar6.f) != null && pcVar3.c)) ? z2 : false;
                int i6 = edVar2.p0[0];
                if (i6 != 3 || k2) {
                    if (!edVar2.z()) {
                        if (pcVar5 == pcVar6 && pcVar7.f == null) {
                            int e2 = pcVar6.e() + d2;
                            edVar2.J(e2, edVar2.q() + e2);
                            L(i5, ucVar, edVar2, z);
                        } else if (pcVar5 == pcVar7 && pcVar6.f == null) {
                            int e3 = d2 - pcVar7.e();
                            edVar2.J(e3 - edVar2.q(), e3);
                            L(i5, ucVar, edVar2, z);
                        } else if (z3 && !edVar2.x()) {
                            l0(i5, ucVar, edVar2, z);
                        }
                    }
                } else if (i6 == 3 && edVar2.v >= 0 && edVar2.u >= 0 && (edVar2.g0 == 8 || (edVar2.r == 0 && edVar2.W == 0.0f))) {
                    if (!edVar2.x() && !edVar2.F && z3 && !edVar2.x()) {
                        m0(i5, edVar, ucVar, edVar2, z);
                    }
                }
            }
        }
        if (edVar instanceof bn) {
            return;
        }
        HashSet hashSet2 = i4.a;
        if (hashSet2 != null && i4.c) {
            Iterator it2 = hashSet2.iterator();
            while (it2.hasNext()) {
                pc pcVar8 = (pc) it2.next();
                ed edVar3 = pcVar8.d;
                int i7 = i2 + 1;
                boolean k3 = k(edVar3);
                pc pcVar9 = edVar3.I;
                pc pcVar10 = edVar3.K;
                if (edVar3.z() && k3) {
                    fd.V(edVar3, ucVar, new b8());
                }
                boolean z4 = (pcVar8 == pcVar9 && (pcVar2 = pcVar10.f) != null && pcVar2.c) || (pcVar8 == pcVar10 && (pcVar = pcVar9.f) != null && pcVar.c);
                int i8 = edVar3.p0[0];
                if (i8 != 3 || k3) {
                    if (!edVar3.z()) {
                        if (pcVar8 == pcVar9 && pcVar10.f == null) {
                            int e4 = pcVar9.e() + d3;
                            edVar3.J(e4, edVar3.q() + e4);
                            L(i7, ucVar, edVar3, z);
                        } else if (pcVar8 == pcVar10 && pcVar9.f == null) {
                            int e5 = d3 - pcVar10.e();
                            edVar3.J(e5 - edVar3.q(), e5);
                            L(i7, ucVar, edVar3, z);
                        } else if (z4 && !edVar3.x()) {
                            l0(i7, ucVar, edVar3, z);
                        }
                    }
                } else if (i8 == 3 && edVar3.v >= 0 && edVar3.u >= 0) {
                    if (edVar3.g0 == 8 || (edVar3.r == 0 && edVar3.W == 0.0f)) {
                        if (!edVar3.x() && !edVar3.F && z4 && !edVar3.x()) {
                            m0(i7, edVar, ucVar, edVar3, z);
                        }
                    }
                }
            }
        }
        edVar.m = true;
    }

    public static int M(int i2) {
        if (i2 == 1) {
            return 0;
        }
        if (i2 == 2) {
            return 1;
        }
        if (i2 == 4) {
            return 2;
        }
        if (i2 == 8) {
            return 3;
        }
        if (i2 == 16) {
            return 4;
        }
        if (i2 == 32) {
            return 5;
        }
        if (i2 == 64) {
            return 6;
        }
        if (i2 == 128) {
            return 7;
        }
        if (i2 == 256) {
            return 8;
        }
        if (i2 == 512) {
            return 9;
        }
        o8.j(o30.e("type needs to be >= FIRST and <= LAST, type=", i2));
        return 0;
    }

    public static final boolean N(AssertionError assertionError) {
        Logger logger = cw.a;
        if (assertionError.getCause() != null) {
            String message = assertionError.getMessage();
            if (message != null ? l40.g0(message, "getsockname failed") : false) {
                return true;
            }
        }
        return false;
    }

    public static boolean O(int i2, Rect rect, Rect rect2) {
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
                o8.j("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
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

    public static boolean P(EditText editText) {
        return editText.getInputType() != 0;
    }

    public static boolean Q() {
        if (Build.VERSION.SDK_INT >= 29) {
            return s60.a();
        }
        try {
            if (n == null) {
                m = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                n = Trace.class.getMethod("isTagEnabled", Long.TYPE);
            }
            return ((Boolean) n.invoke(null, Long.valueOf(m))).booleanValue();
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

    public static boolean S(String str, String str2) {
        return str.startsWith(str2.concat("(")) && str.endsWith(")");
    }

    public static int V(int i2, int i3, int i4) {
        if ((i3 & 8) != 0) {
            i2--;
        }
        if (i4 <= i2) {
            return i2 - i4;
        }
        o8.x(o30.d(i4, i2, "PROTOCOL_ERROR padding ", " > remaining length "));
        return 0;
    }

    public static int W(int i2, Rect rect, Rect rect2) {
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
                o8.j("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                return 0;
            }
            i3 = rect2.top;
            i4 = rect.bottom;
        }
        return Math.max(0, i3 - i4);
    }

    public static int X(int i2, Rect rect, Rect rect2) {
        if (i2 != 17) {
            if (i2 != 33) {
                if (i2 != 66) {
                    if (i2 != 130) {
                        o8.j("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                        return 0;
                    }
                }
            }
            return Math.abs(((rect.width() / 2) + rect.left) - ((rect2.width() / 2) + rect2.left));
        }
        return Math.abs(((rect.height() / 2) + rect.top) - ((rect2.height() / 2) + rect2.top));
    }

    public static MappedByteBuffer Y(Context context, Uri uri) {
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

    public static TypedArray Z(Context context, AttributeSet attributeSet, int[] iArr, int i2, int i3, int... iArr2) {
        n(context, attributeSet, i2, i3);
        r(context, attributeSet, iArr, i2, i3, iArr2);
        return context.obtainStyledAttributes(attributeSet, iArr, i2, i3);
    }

    public static void a0(EditorInfo editorInfo, InputConnection inputConnection, TextView textView) {
        if (inputConnection == null || editorInfo.hintText != null) {
            return;
        }
        for (ViewParent parent = textView.getParent(); parent instanceof View; parent = parent.getParent()) {
        }
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
    public static void b0(Context context, String str) {
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
    public static String c0(Context context) {
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

    public static final void d(k50 k50Var, l50 l50Var, String str) {
        m50.i.fine(l50Var.b + ' ' + String.format("%-22s", Arrays.copyOf(new Object[]{str}, 1)) + ": " + k50Var.a);
    }

    public static int d0(Context context, int i2, int i3) {
        TypedValue P = l70.P(context.getTheme(), i2);
        return (P == null || P.type != 16) ? i3 : P.data;
    }

    public static l7 e() {
        l7 l7Var = l7.l;
        l7Var.getClass();
        l7 l7Var2 = l7Var.f;
        if (l7Var2 == null) {
            long nanoTime = System.nanoTime();
            l7.i.await(l7.j, TimeUnit.MILLISECONDS);
            l7 l7Var3 = l7.l;
            l7Var3.getClass();
            if (l7Var3.f != null || System.nanoTime() - nanoTime < l7.k) {
                return null;
            }
            return l7.l;
        }
        long nanoTime2 = l7Var2.g - System.nanoTime();
        if (nanoTime2 > 0) {
            l7.i.await(nanoTime2, TimeUnit.NANOSECONDS);
            return null;
        }
        l7 l7Var4 = l7.l;
        l7Var4.getClass();
        l7Var4.f = l7Var2.f;
        l7Var2.f = null;
        return l7Var2;
    }

    public static TimeInterpolator e0(Context context, int i2, TimeInterpolator timeInterpolator) {
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(i2, typedValue, true)) {
            return timeInterpolator;
        }
        if (typedValue.type != 3) {
            o8.j("Motion easing theme attribute must be an @interpolator resource for ?attr/motionEasing*Interpolator attributes or a string for ?attr/motionEasing* attributes.");
            return null;
        }
        String valueOf = String.valueOf(typedValue.string);
        if (!S(valueOf, "cubic-bezier") && !S(valueOf, "path")) {
            return AnimationUtils.loadInterpolator(context, typedValue.resourceId);
        }
        if (S(valueOf, "cubic-bezier")) {
            String[] split = valueOf.substring(13, valueOf.length() - 1).split(",");
            if (split.length == 4) {
                return new PathInterpolator(E(split, 0), E(split, 1), E(split, 2), E(split, 3));
            }
            throw new IllegalArgumentException("Motion easing theme attribute must have 4 control points if using bezier curve format; instead got: " + split.length);
        }
        if (!S(valueOf, "path")) {
            o8.j("Invalid motion easing type: ".concat(valueOf));
            return null;
        }
        String substring = valueOf.substring(5, valueOf.length() - 1);
        Path path = new Path();
        try {
            ex.b(j8.i(substring), path);
            return new PathInterpolator(path);
        } catch (RuntimeException e2) {
            throw new RuntimeException("Error in parsing ".concat(substring), e2);
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
    
        r11 = W(r9, r10, r11);
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
    
        defpackage.o8.j("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
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
    public static boolean f(int i2, Rect rect, Rect rect2, Rect rect3) {
        boolean g2 = g(i2, rect, rect2);
        if (!g(i2, rect, rect3) && g2) {
            if (i2 != 17) {
                if (i2 != 33) {
                    if (i2 != 66) {
                        if (i2 != 130) {
                            o8.j("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                            return false;
                        }
                    }
                }
            }
        }
        return false;
    }

    public static v30 f0(Context context) {
        TypedValue P = l70.P(context.getTheme(), R.attr.motionSpringFastSpatial);
        int[] iArr = ly.z;
        TypedArray obtainStyledAttributes = P == null ? context.obtainStyledAttributes(null, iArr, 0, R.style.Motion_Material3_Spring_Standard_Fast_Spatial) : context.obtainStyledAttributes(P.resourceId, iArr);
        v30 v30Var = new v30();
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
            v30Var.a = Math.sqrt(f2);
            v30Var.c = false;
            if (f3 < 0.0f) {
                throw new IllegalArgumentException("Damping ratio must be non-negative");
            }
            v30Var.b = f3;
            v30Var.c = false;
            obtainStyledAttributes.recycle();
            return v30Var;
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0033 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean g(int i2, Rect rect, Rect rect2) {
        if (i2 != 17) {
            if (i2 != 33) {
                if (i2 != 66) {
                    if (i2 != 130) {
                        o8.j("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
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

    public static void h(String str) {
        if (str.length() > 127) {
            str = str.substring(0, 127);
        }
        Trace.beginSection(str);
    }

    public static void i0(h5 h5Var, float f2) {
        d10 d10Var = (d10) h5Var.g;
        d9 d9Var = (d9) h5Var.h;
        boolean useCompatPadding = d9Var.getUseCompatPadding();
        boolean preventCornerOverlap = d9Var.getPreventCornerOverlap();
        if (f2 != d10Var.e || d10Var.f != useCompatPadding || d10Var.g != preventCornerOverlap) {
            d10Var.e = f2;
            d10Var.f = useCompatPadding;
            d10Var.g = preventCornerOverlap;
            d10Var.b(null);
            d10Var.invalidateSelf();
        }
        if (!d9Var.getUseCompatPadding()) {
            h5Var.M(0, 0, 0, 0);
            return;
        }
        d10 d10Var2 = (d10) h5Var.g;
        float f3 = d10Var2.e;
        float f4 = d10Var2.a;
        int ceil = (int) Math.ceil(e10.a(f3, f4, d9Var.getPreventCornerOverlap()));
        int ceil2 = (int) Math.ceil(e10.b(f3, f4, d9Var.getPreventCornerOverlap()));
        h5Var.M(ceil, ceil2, ceil, ceil2);
    }

    public static void j0(View view, rt rtVar) {
        wg wgVar = rtVar.g.b;
        if (wgVar == null || !wgVar.a) {
            return;
        }
        float f2 = 0.0f;
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            f2 += ((View) parent).getElevation();
        }
        pt ptVar = rtVar.g;
        if (ptVar.l != f2) {
            ptVar.l = f2;
            rtVar.y();
        }
    }

    public static boolean k(ed edVar) {
        int[] iArr = edVar.p0;
        int i2 = iArr[0];
        int i3 = iArr[1];
        ed edVar2 = edVar.T;
        fd fdVar = edVar2 != null ? (fd) edVar2 : null;
        if (fdVar != null) {
            int i4 = fdVar.p0[0];
        }
        if (fdVar != null) {
            int i5 = fdVar.p0[1];
        }
        boolean z = i2 == 1 || edVar.A() || i2 == 2 || (i2 == 3 && edVar.r == 0 && edVar.W == 0.0f && edVar.t(0)) || (i2 == 3 && edVar.r == 1 && edVar.u(0, edVar.q()));
        boolean z2 = i3 == 1 || edVar.B() || i3 == 2 || (i3 == 3 && edVar.s == 0 && edVar.W == 0.0f && edVar.t(1)) || (i3 == 3 && edVar.s == 1 && edVar.u(1, edVar.k()));
        return (edVar.W > 0.0f && (z || z2)) || (z && z2);
    }

    public static void l(String str, boolean z) {
        if (z) {
            return;
        }
        o8.j(str);
    }

    public static void l0(int i2, uc ucVar, ed edVar, boolean z) {
        float f2 = edVar.d0;
        pc pcVar = edVar.I;
        int d2 = pcVar.f.d();
        pc pcVar2 = edVar.K;
        int d3 = pcVar2.f.d();
        int e2 = pcVar.e() + d2;
        int e3 = d3 - pcVar2.e();
        if (d2 == d3) {
            f2 = 0.5f;
        } else {
            d2 = e2;
            d3 = e3;
        }
        int q = edVar.q();
        int i3 = (d3 - d2) - q;
        if (d2 > d3) {
            i3 = (d2 - d3) - q;
        }
        int i4 = ((int) (i3 > 0 ? (f2 * i3) + 0.5f : f2 * i3)) + d2;
        int i5 = i4 + q;
        if (d2 > d3) {
            i5 = i4 - q;
        }
        edVar.J(i4, i5);
        L(i2 + 1, ucVar, edVar, z);
    }

    public static void m(int i2) {
        if (i2 < 0) {
            throw new IllegalArgumentException();
        }
    }

    public static void m0(int i2, ed edVar, uc ucVar, ed edVar2, boolean z) {
        float f2 = edVar2.d0;
        pc pcVar = edVar2.I;
        int e2 = pcVar.e() + pcVar.f.d();
        pc pcVar2 = edVar2.K;
        int d2 = pcVar2.f.d() - pcVar2.e();
        if (d2 >= e2) {
            int q = edVar2.q();
            if (edVar2.g0 != 8) {
                int i3 = edVar2.r;
                if (i3 == 2) {
                    q = (int) (edVar2.d0 * 0.5f * (edVar instanceof fd ? edVar.q() : edVar.T.q()));
                } else if (i3 == 0) {
                    q = d2 - e2;
                }
                q = Math.max(edVar2.u, q);
                int i4 = edVar2.v;
                if (i4 > 0) {
                    q = Math.min(i4, q);
                }
            }
            int i5 = e2 + ((int) ((f2 * ((d2 - e2) - q)) + 0.5f));
            edVar2.J(i5, q + i5);
            L(i2 + 1, ucVar, edVar2, z);
        }
    }

    public static void n(Context context, AttributeSet attributeSet, int i2, int i3) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ly.L, i2, i3);
        boolean z = obtainStyledAttributes.getBoolean(1, false);
        obtainStyledAttributes.recycle();
        if (z) {
            TypedValue typedValue = new TypedValue();
            if (!context.getTheme().resolveAttribute(R.attr.isMaterialTheme, typedValue, true) || (typedValue.type == 18 && typedValue.data == 0)) {
                s(context, l, "Theme.MaterialComponents");
            }
        }
        s(context, k, "Theme.AppCompat");
    }

    public static void n0(int i2, uc ucVar, ed edVar) {
        float f2 = edVar.e0;
        pc pcVar = edVar.J;
        int d2 = pcVar.f.d();
        pc pcVar2 = edVar.L;
        int d3 = pcVar2.f.d();
        int e2 = pcVar.e() + d2;
        int e3 = d3 - pcVar2.e();
        if (d2 == d3) {
            f2 = 0.5f;
        } else {
            d2 = e2;
            d3 = e3;
        }
        int k2 = edVar.k();
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
        edVar.K(i5, i6);
        r0(i2 + 1, ucVar, edVar);
    }

    public static void o(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static void o0(int i2, ed edVar, uc ucVar, ed edVar2) {
        float f2 = edVar2.e0;
        pc pcVar = edVar2.J;
        int e2 = pcVar.e() + pcVar.f.d();
        pc pcVar2 = edVar2.L;
        int d2 = pcVar2.f.d() - pcVar2.e();
        if (d2 >= e2) {
            int k2 = edVar2.k();
            if (edVar2.g0 != 8) {
                int i3 = edVar2.s;
                if (i3 == 2) {
                    k2 = (int) (f2 * 0.5f * (edVar instanceof fd ? edVar.k() : edVar.T.k()));
                } else if (i3 == 0) {
                    k2 = d2 - e2;
                }
                k2 = Math.max(edVar2.x, k2);
                int i4 = edVar2.y;
                if (i4 > 0) {
                    k2 = Math.min(i4, k2);
                }
            }
            int i5 = e2 + ((int) ((f2 * ((d2 - e2) - k2)) + 0.5f));
            edVar2.K(i5, k2 + i5);
            r0(i2 + 1, ucVar, edVar2);
        }
    }

    public static void p(int i2) {
        if (2 > i2 || i2 >= 37) {
            throw new IllegalArgumentException("radix " + i2 + " was not in valid range " + new lp(2, 36, 1));
        }
    }

    public static void q(int i2, int i3, int i4) {
        if (i2 >= 0 && i3 <= i4) {
            if (i2 <= i3) {
                return;
            }
            o8.j(o30.d(i2, i3, "fromIndex: ", " > toIndex: "));
        } else {
            throw new IndexOutOfBoundsException("fromIndex: " + i2 + ", toIndex: " + i3 + ", size: " + i4);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x001b, code lost:
    
        if (r0.getResourceId(0, -1) != (-1)) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void r(Context context, AttributeSet attributeSet, int[] iArr, int i2, int i3, int... iArr2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ly.L, i2, i3);
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
            o8.j("This component requires that you specify a valid TextAppearance attribute. Update your app theme to inherit from Theme.MaterialComponents (or a descendant).");
        }
    }

    public static void r0(int i2, uc ucVar, ed edVar) {
        boolean z;
        pc pcVar;
        pc pcVar2;
        pc pcVar3;
        pc pcVar4;
        if (edVar.n) {
            return;
        }
        if (!(edVar instanceof fd) && edVar.z() && k(edVar)) {
            fd.V(edVar, ucVar, new b8());
        }
        pc i3 = edVar.i(3);
        pc i4 = edVar.i(5);
        int d2 = i3.d();
        int d3 = i4.d();
        HashSet hashSet = i3.a;
        if (hashSet != null && i3.c) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                pc pcVar5 = (pc) it.next();
                ed edVar2 = pcVar5.d;
                int i5 = i2 + 1;
                boolean k2 = k(edVar2);
                pc pcVar6 = edVar2.J;
                pc pcVar7 = edVar2.L;
                if (edVar2.z() && k2) {
                    fd.V(edVar2, ucVar, new b8());
                }
                boolean z2 = (pcVar5 == pcVar6 && (pcVar4 = pcVar7.f) != null && pcVar4.c) || (pcVar5 == pcVar7 && (pcVar3 = pcVar6.f) != null && pcVar3.c);
                int i6 = edVar2.p0[1];
                if (i6 != 3 || k2) {
                    if (!edVar2.z()) {
                        if (pcVar5 == pcVar6 && pcVar7.f == null) {
                            int e2 = pcVar6.e() + d2;
                            edVar2.K(e2, edVar2.k() + e2);
                            r0(i5, ucVar, edVar2);
                        } else if (pcVar5 == pcVar7 && pcVar6.f == null) {
                            int e3 = d2 - pcVar7.e();
                            edVar2.K(e3 - edVar2.k(), e3);
                            r0(i5, ucVar, edVar2);
                        } else if (z2 && !edVar2.y()) {
                            n0(i5, ucVar, edVar2);
                        }
                    }
                } else if (i6 == 3 && edVar2.y >= 0 && edVar2.x >= 0 && (edVar2.g0 == 8 || (edVar2.s == 0 && edVar2.W == 0.0f))) {
                    if (!edVar2.y() && !edVar2.F && z2 && !edVar2.y()) {
                        o0(i5, edVar, ucVar, edVar2);
                    }
                }
            }
        }
        boolean z3 = true;
        z3 = true;
        z3 = true;
        if (edVar instanceof bn) {
            return;
        }
        HashSet hashSet2 = i4.a;
        if (hashSet2 != null && i4.c) {
            Iterator it2 = hashSet2.iterator();
            while (it2.hasNext()) {
                pc pcVar8 = (pc) it2.next();
                ed edVar3 = pcVar8.d;
                int i7 = i2 + 1;
                boolean k3 = k(edVar3);
                pc pcVar9 = edVar3.J;
                pc pcVar10 = edVar3.L;
                if (edVar3.z() && k3) {
                    fd.V(edVar3, ucVar, new b8());
                }
                boolean z4 = (pcVar8 == pcVar9 && (pcVar2 = pcVar10.f) != null && pcVar2.c) || (pcVar8 == pcVar10 && (pcVar = pcVar9.f) != null && pcVar.c);
                int i8 = edVar3.p0[1];
                if (i8 != 3 || k3) {
                    if (!edVar3.z()) {
                        if (pcVar8 == pcVar9 && pcVar10.f == null) {
                            int e4 = pcVar9.e() + d3;
                            edVar3.K(e4, edVar3.k() + e4);
                            r0(i7, ucVar, edVar3);
                        } else if (pcVar8 == pcVar10 && pcVar9.f == null) {
                            int e5 = d3 - pcVar10.e();
                            edVar3.K(e5 - edVar3.k(), e5);
                            r0(i7, ucVar, edVar3);
                        } else if (z4 && !edVar3.y()) {
                            n0(i7, ucVar, edVar3);
                        }
                    }
                } else if (i8 == 3 && edVar3.y >= 0 && edVar3.x >= 0 && (edVar3.g0 == 8 || (edVar3.s == 0 && edVar3.W == 0.0f))) {
                    if (!edVar3.y() && !edVar3.F && z4 && !edVar3.y()) {
                        o0(i7, edVar, ucVar, edVar3);
                    }
                }
            }
        }
        pc i9 = edVar.i(6);
        if (i9.a != null && i9.c) {
            int d4 = i9.d();
            Iterator it3 = i9.a.iterator();
            while (it3.hasNext()) {
                pc pcVar11 = (pc) it3.next();
                ed edVar4 = pcVar11.d;
                int i10 = i2 + 1;
                boolean k4 = k(edVar4);
                pc pcVar12 = edVar4.M;
                if (edVar4.z() && k4) {
                    fd.V(edVar4, ucVar, new b8());
                }
                if (edVar4.p0[z3 ? 1 : 0] != 3 || k4) {
                    if (!edVar4.z()) {
                        if (pcVar11 == pcVar12) {
                            int e6 = pcVar11.e() + d4;
                            if (edVar4.E) {
                                int i11 = e6 - edVar4.a0;
                                int i12 = edVar4.V + i11;
                                edVar4.Z = i11;
                                edVar4.J.l(i11);
                                edVar4.L.l(i12);
                                pcVar12.l(e6);
                                z = z3 ? 1 : 0;
                                edVar4.l = z;
                            } else {
                                z = z3 ? 1 : 0;
                            }
                            r0(i10, ucVar, edVar4);
                            z3 = z;
                        }
                    }
                }
                z = z3 ? 1 : 0;
                z3 = z;
            }
        }
        edVar.n = z3;
    }

    public static void s(Context context, int[] iArr, String str) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(iArr);
        for (int i2 = 0; i2 < iArr.length; i2++) {
            if (!obtainStyledAttributes.hasValue(i2)) {
                obtainStyledAttributes.recycle();
                throw new IllegalArgumentException("The style on this component requires your app theme to be " + str + " (or a descendant).");
            }
        }
        obtainStyledAttributes.recycle();
    }

    public static boolean t(File file, InputStream inputStream) {
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

    /* JADX WARN: Removed duplicated region for block: B:19:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static pj u(Context context) {
        ProviderInfo providerInfo;
        nj njVar;
        ApplicationInfo applicationInfo;
        int i2 = 16;
        vg keVar = Build.VERSION.SDK_INT >= 28 ? new ke(i2) : new vg(i2);
        PackageManager packageManager = context.getPackageManager();
        o(packageManager, "Package manager required to locate emoji font provider");
        Iterator<ResolveInfo> it = packageManager.queryIntentContentProviders(new Intent("androidx.content.action.LOAD_EMOJI_FONT"), 0).iterator();
        while (true) {
            if (!it.hasNext()) {
                providerInfo = null;
                break;
            }
            providerInfo = it.next().providerInfo;
            if (providerInfo != null && (applicationInfo = providerInfo.applicationInfo) != null && (applicationInfo.flags & 1) == 1) {
                break;
            }
        }
        if (providerInfo != null) {
            try {
                String str = providerInfo.authority;
                String str2 = providerInfo.packageName;
                Signature[] l2 = keVar.l(packageManager, str2);
                ArrayList arrayList = new ArrayList();
                for (Signature signature : l2) {
                    arrayList.add(signature.toByteArray());
                }
                njVar = new nj(str, str2, "emojicompat-emoji-font", Collections.singletonList(arrayList), null, null);
            } catch (PackageManager.NameNotFoundException e2) {
                Log.wtf("emoji2.text.DefaultEmojiConfig", e2);
            }
            if (njVar != null) {
                return null;
            }
            return new pj(new oj(context, njVar));
        }
        njVar = null;
        if (njVar != null) {
        }
    }

    public static op v(int i2) {
        return i2 != 0 ? i2 != 1 ? new g10() : new be() : new g10();
    }

    public static final boolean w(char c2, char c3, boolean z) {
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

    public static final String x(long j2) {
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

    /* JADX WARN: Removed duplicated region for block: B:18:0x004c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static kn y(SSLSession sSLSession) {
        List list;
        Certificate[] localCertificates;
        Certificate[] peerCertificates;
        List list2 = vh.f;
        String cipherSuite = sSLSession.getCipherSuite();
        if (cipherSuite == null) {
            o8.t("cipherSuite == null");
            return null;
        }
        if (cipherSuite.equals("TLS_NULL_WITH_NULL_NULL") ? true : cipherSuite.equals("SSL_NULL_WITH_NULL_NULL")) {
            o8.x("cipherSuite == ".concat(cipherSuite));
            return null;
        }
        na k2 = na.b.k(cipherSuite);
        String protocol = sSLSession.getProtocol();
        if (protocol == null) {
            o8.t("tlsVersion == null");
            return null;
        }
        if ("NONE".equals(protocol)) {
            o8.x("tlsVersion == NONE");
            return null;
        }
        h60 u = op.u(protocol);
        try {
            peerCertificates = sSLSession.getPeerCertificates();
        } catch (SSLPeerUnverifiedException unused) {
        }
        if (peerCertificates != null) {
            list = y70.i(Arrays.copyOf(peerCertificates, peerCertificates.length));
            localCertificates = sSLSession.getLocalCertificates();
            if (localCertificates != null) {
                list2 = y70.i(Arrays.copyOf(localCertificates, localCertificates.length));
            }
            return new kn(u, k2, list2, new jn(0, list));
        }
        list = list2;
        localCertificates = sSLSession.getLocalCertificates();
        if (localCertificates != null) {
        }
        return new kn(u, k2, list2, new jn(0, list));
    }

    public abstract int A();

    public abstract InputFilter[] B(InputFilter[] inputFilterArr);

    public abstract int C();

    public abstract int F();

    public abstract int G();

    public abstract int H(View view);

    public abstract int I(CoordinatorLayout coordinatorLayout);

    public abstract int J();

    public abstract boolean R(float f2);

    public abstract boolean T(View view);

    public abstract boolean U(float f2, float f3);

    public abstract void g0(boolean z);

    public abstract void h0(boolean z);

    public abstract int i(ViewGroup.MarginLayoutParams marginLayoutParams);

    public abstract float j(int i2);

    public abstract boolean k0(View view, float f2);

    public abstract void p0(ViewGroup.MarginLayoutParams marginLayoutParams, int i2);

    public abstract void q0(ViewGroup.MarginLayoutParams marginLayoutParams, int i2, int i3);

    public abstract int z(ViewGroup.MarginLayoutParams marginLayoutParams);

    @Override // defpackage.v90
    public void b() {
    }

    @Override // defpackage.v90
    public void c() {
    }
}
