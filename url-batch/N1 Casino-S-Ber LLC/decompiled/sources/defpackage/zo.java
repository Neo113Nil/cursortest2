package defpackage;

import android.R;
import android.app.ActionBar;
import android.app.Activity;
import android.app.Dialog;
import android.content.ComponentName;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Outline;
import android.graphics.Path;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.widget.TextView;
import com.google.android.material.appbar.MaterialToolbar;
import java.io.File;
import java.lang.ref.WeakReference;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.ProtocolException;
import java.security.MessageDigest;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.Locale;
import java.util.WeakHashMap;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public abstract class zo {
    public static Method k = null;
    public static boolean l = false;
    public static boolean n = false;
    public static Method o = null;
    public static boolean p = false;
    public static Field q;
    public static final int[] a = {R.attr.name, R.attr.tint, R.attr.height, R.attr.width, R.attr.alpha, R.attr.autoMirrored, R.attr.tintMode, R.attr.viewportWidth, R.attr.viewportHeight};
    public static final int[] b = {R.attr.name, R.attr.pivotX, R.attr.pivotY, R.attr.scaleX, R.attr.scaleY, R.attr.rotation, R.attr.translateX, R.attr.translateY};
    public static final int[] c = {R.attr.name, R.attr.fillColor, R.attr.pathData, R.attr.strokeColor, R.attr.strokeWidth, R.attr.trimPathStart, R.attr.trimPathEnd, R.attr.trimPathOffset, R.attr.strokeLineCap, R.attr.strokeLineJoin, R.attr.strokeMiterLimit, R.attr.strokeAlpha, R.attr.fillAlpha, R.attr.fillType};
    public static final int[] d = {R.attr.name, R.attr.pathData, R.attr.fillType};
    public static final int[] e = {R.attr.drawable};
    public static final int[] f = {R.attr.name, R.attr.animation};
    public static final Object[] g = new Object[0];
    public static final String[] h = {"standard", "accelerate", "decelerate", "linear"};
    public static final boolean[] i = new boolean[3];
    public static final Object j = new Object();
    public static final ja m = new ja(6);

    public static m4 E(String str) {
        int i2;
        String str2;
        boolean m0 = k40.m0(str, "HTTP/1.", false);
        nx nxVar = nx.HTTP_1_0;
        if (m0) {
            i2 = 9;
            if (str.length() < 9 || str.charAt(8) != ' ') {
                throw new ProtocolException("Unexpected status line: ".concat(str));
            }
            int charAt = str.charAt(7) - '0';
            if (charAt != 0) {
                if (charAt != 1) {
                    throw new ProtocolException("Unexpected status line: ".concat(str));
                }
                nxVar = nx.HTTP_1_1;
            }
        } else {
            if (!k40.m0(str, "ICY ", false)) {
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
            return new m4(nxVar, parseInt, str2);
        } catch (NumberFormatException unused) {
            throw new ProtocolException("Unexpected status line: ".concat(str));
        }
    }

    public static long F(String str, int i2) {
        int l2 = l(str, 0, i2, false);
        Matcher matcher = ld.m.matcher(str);
        int i3 = -1;
        int i4 = -1;
        int i5 = -1;
        int i6 = -1;
        int i7 = -1;
        int i8 = -1;
        while (l2 < i2) {
            int l3 = l(str, l2 + 1, i2, true);
            matcher.region(l2, l3);
            if (i4 == -1 && matcher.usePattern(ld.m).matches()) {
                String group = matcher.group(1);
                group.getClass();
                i4 = Integer.parseInt(group);
                String group2 = matcher.group(2);
                group2.getClass();
                i7 = Integer.parseInt(group2);
                String group3 = matcher.group(3);
                group3.getClass();
                i8 = Integer.parseInt(group3);
            } else if (i5 == -1 && matcher.usePattern(ld.l).matches()) {
                String group4 = matcher.group(1);
                group4.getClass();
                i5 = Integer.parseInt(group4);
            } else {
                if (i6 == -1) {
                    Pattern pattern = ld.k;
                    if (matcher.usePattern(pattern).matches()) {
                        String group5 = matcher.group(1);
                        group5.getClass();
                        Locale locale = Locale.US;
                        locale.getClass();
                        String lowerCase = group5.toLowerCase(locale);
                        lowerCase.getClass();
                        String pattern2 = pattern.pattern();
                        pattern2.getClass();
                        i6 = c40.p0(pattern2, lowerCase, 0, false) / 4;
                    }
                }
                if (i3 == -1 && matcher.usePattern(ld.j).matches()) {
                    String group6 = matcher.group(1);
                    group6.getClass();
                    i3 = Integer.parseInt(group6);
                }
            }
            l2 = l(str, l3 + 1, i2, false);
        }
        if (70 <= i3 && i3 < 100) {
            i3 += 1900;
        }
        if (i3 >= 0 && i3 < 70) {
            i3 += 2000;
        }
        if (i3 < 1601) {
            t8.k("Failed requirement.");
            return 0L;
        }
        if (i6 == -1) {
            t8.k("Failed requirement.");
            return 0L;
        }
        if (1 > i5 || i5 >= 32) {
            t8.k("Failed requirement.");
            return 0L;
        }
        if (i4 < 0 || i4 >= 24) {
            t8.k("Failed requirement.");
            return 0L;
        }
        if (i7 < 0 || i7 >= 60) {
            t8.k("Failed requirement.");
            return 0L;
        }
        if (i8 < 0 || i8 >= 60) {
            t8.k("Failed requirement.");
            return 0L;
        }
        GregorianCalendar gregorianCalendar = new GregorianCalendar(r70.e);
        gregorianCalendar.setLenient(false);
        gregorianCalendar.set(1, i3);
        gregorianCalendar.set(2, i6 - 1);
        gregorianCalendar.set(5, i5);
        gregorianCalendar.set(11, i4);
        gregorianCalendar.set(12, i7);
        gregorianCalendar.set(13, i8);
        gregorianCalendar.set(14, 0);
        return gregorianCalendar.getTimeInMillis();
    }

    public static final boolean G(String str) {
        str.getClass();
        return (str.equals("GET") || str.equals("HEAD")) ? false : true;
    }

    public static String H(X509Certificate x509Certificate) {
        StringBuilder sb = new StringBuilder("sha256/");
        y8 y8Var = y8.i;
        byte[] encoded = x509Certificate.getPublicKey().getEncoded();
        encoded.getClass();
        int length = encoded.length;
        o8.i(encoded.length, 0L, length);
        e70.j(length, encoded.length);
        int i2 = 0;
        byte[] copyOfRange = Arrays.copyOfRange(encoded, 0, length);
        copyOfRange.getClass();
        y8 y8Var2 = new y8(copyOfRange);
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        messageDigest.update(copyOfRange, 0, y8Var2.a());
        byte[] digest = messageDigest.digest();
        digest.getClass();
        new y8(digest);
        byte[] bArr = a.a;
        bArr.getClass();
        byte[] bArr2 = new byte[((digest.length + 2) / 3) * 4];
        int length2 = digest.length - (digest.length % 3);
        int i3 = 0;
        while (i2 < length2) {
            byte b2 = digest[i2];
            int i4 = i2 + 2;
            byte b3 = digest[i2 + 1];
            i2 += 3;
            byte b4 = digest[i4];
            bArr2[i3] = bArr[(b2 & 255) >> 2];
            bArr2[i3 + 1] = bArr[((b2 & 3) << 4) | ((b3 & 255) >> 4)];
            int i5 = i3 + 3;
            bArr2[i3 + 2] = bArr[((b3 & 15) << 2) | ((b4 & 255) >> 6)];
            i3 += 4;
            bArr2[i5] = bArr[b4 & 63];
        }
        int length3 = digest.length - length2;
        if (length3 == 1) {
            byte b5 = digest[i2];
            bArr2[i3] = bArr[(b5 & 255) >> 2];
            bArr2[i3 + 1] = bArr[(b5 & 3) << 4];
            bArr2[i3 + 2] = 61;
            bArr2[i3 + 3] = 61;
        } else if (length3 == 2) {
            int i6 = i2 + 1;
            byte b6 = digest[i2];
            byte b7 = digest[i6];
            bArr2[i3] = bArr[(b6 & 255) >> 2];
            bArr2[i3 + 1] = bArr[((b6 & 3) << 4) | ((b7 & 255) >> 4)];
            bArr2[i3 + 2] = bArr[(b7 & 15) << 2];
            bArr2[i3 + 3] = 61;
        }
        sb.append(new String(bArr2, z9.a));
        return sb.toString();
    }

    public static TypedValue I(Resources.Theme theme, int i2) {
        TypedValue typedValue = new TypedValue();
        if (theme.resolveAttribute(i2, typedValue, true)) {
            return typedValue;
        }
        return null;
    }

    public static boolean J(Resources.Theme theme, int i2, boolean z) {
        TypedValue I = I(theme, i2);
        return (I == null || I.type != 18) ? z : I.data != 0;
    }

    public static TypedValue K(Context context, int i2, String str) {
        TypedValue I = I(context.getTheme(), i2);
        if (I != null) {
            return I;
        }
        throw new IllegalArgumentException(String.format("%1$s requires a value for the %2$s attribute to be set in your app theme. You can either set the attribute in your theme or update your theme to inherit from Theme.MaterialComponents (or a descendant).", str, context.getResources().getResourceName(i2)));
    }

    public static TypedValue L(View view, int i2) {
        return K(view.getContext(), i2, view.getClass().getCanonicalName());
    }

    public static void M(RuntimeException runtimeException, String str) {
        StackTraceElement[] stackTrace = runtimeException.getStackTrace();
        int length = stackTrace.length;
        int i2 = -1;
        for (int i3 = 0; i3 < length; i3++) {
            if (str.equals(stackTrace[i3].getClassName())) {
                i2 = i3;
            }
        }
        runtimeException.setStackTrace((StackTraceElement[]) Arrays.copyOfRange(stackTrace, i2 + 1, length));
    }

    public static void N(Outline outline, Path path) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 30) {
            eg.a(outline, path);
            return;
        }
        if (i2 >= 29) {
            try {
                dg.a(outline, path);
            } catch (IllegalArgumentException unused) {
            }
        } else if (path.isConvex()) {
            dg.a(outline, path);
        }
    }

    public static void O(String str) {
        lk lkVar = new lk("lateinit property " + str + " has not been initialized");
        M(lkVar, zo.class.getName());
        throw lkVar;
    }

    public static int P(Context context, int i2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(R.style.Animation.Activity, new int[]{i2});
        int resourceId = obtainStyledAttributes.getResourceId(0, -1);
        obtainStyledAttributes.recycle();
        return resourceId;
    }

    public static final Object[] Q(Collection collection) {
        int size = collection.size();
        if (size != 0) {
            Iterator it = collection.iterator();
            if (it.hasNext()) {
                Object[] objArr = new Object[size];
                int i2 = 0;
                while (true) {
                    int i3 = i2 + 1;
                    objArr[i2] = it.next();
                    if (i3 >= objArr.length) {
                        if (!it.hasNext()) {
                            return objArr;
                        }
                        int i4 = ((i3 * 3) + 1) >>> 1;
                        if (i4 <= i3) {
                            i4 = 2147483645;
                            if (i3 >= 2147483645) {
                                throw new OutOfMemoryError();
                            }
                        }
                        objArr = Arrays.copyOf(objArr, i4);
                    } else if (!it.hasNext()) {
                        return Arrays.copyOf(objArr, i3);
                    }
                    i2 = i3;
                }
            }
        }
        return g;
    }

    public static final Object[] R(Collection collection, Object[] objArr) {
        Object[] objArr2;
        int size = collection.size();
        int i2 = 0;
        if (size != 0) {
            Iterator it = collection.iterator();
            if (it.hasNext()) {
                if (size <= objArr.length) {
                    objArr2 = objArr;
                } else {
                    Object newInstance = Array.newInstance(objArr.getClass().getComponentType(), size);
                    newInstance.getClass();
                    objArr2 = (Object[]) newInstance;
                }
                while (true) {
                    int i3 = i2 + 1;
                    objArr2[i2] = it.next();
                    if (i3 >= objArr2.length) {
                        if (!it.hasNext()) {
                            return objArr2;
                        }
                        int i4 = ((i3 * 3) + 1) >>> 1;
                        if (i4 <= i3) {
                            i4 = 2147483645;
                            if (i3 >= 2147483645) {
                                throw new OutOfMemoryError();
                            }
                        }
                        objArr2 = Arrays.copyOf(objArr2, i4);
                    } else if (!it.hasNext()) {
                        if (objArr2 != objArr) {
                            return Arrays.copyOf(objArr2, i3);
                        }
                        objArr[i3] = null;
                        return objArr;
                    }
                    i2 = i3;
                }
            } else if (objArr.length > 0) {
                objArr[0] = null;
            }
        } else if (objArr.length > 0) {
            objArr[0] = null;
            return objArr;
        }
        return objArr;
    }

    public static void a(Throwable th, Throwable th2) {
        th.getClass();
        th2.getClass();
        if (th != th2) {
            Integer num = fp.a;
            if (num == null || num.intValue() >= 19) {
                th.addSuppressed(th2);
                return;
            }
            Method method = xw.a;
            if (method != null) {
                method.invoke(th, th2);
            }
        }
    }

    public static boolean b(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    public static void c(String str, boolean z) {
        if (z) {
            return;
        }
        t8.k(str);
    }

    public static void d(int i2) {
        if (i2 < 0) {
            throw new IllegalArgumentException();
        }
    }

    public static void e(bd bdVar, kq kqVar, ad adVar) {
        adVar.o = -1;
        lc lcVar = adVar.M;
        int[] iArr = adVar.p0;
        lc lcVar2 = adVar.L;
        lc lcVar3 = adVar.J;
        lc lcVar4 = adVar.K;
        lc lcVar5 = adVar.I;
        adVar.p = -1;
        int[] iArr2 = bdVar.p0;
        if (iArr2[0] != 2 && iArr[0] == 4) {
            int i2 = lcVar5.g;
            int q2 = bdVar.q() - lcVar4.g;
            lcVar5.i = kqVar.k(lcVar5);
            lcVar4.i = kqVar.k(lcVar4);
            kqVar.d(lcVar5.i, i2);
            kqVar.d(lcVar4.i, q2);
            adVar.o = 2;
            adVar.Y = i2;
            int i3 = q2 - i2;
            adVar.U = i3;
            int i4 = adVar.b0;
            if (i3 < i4) {
                adVar.U = i4;
            }
        }
        if (iArr2[1] == 2 || iArr[1] != 4) {
            return;
        }
        int i5 = lcVar3.g;
        int k2 = bdVar.k() - lcVar2.g;
        lcVar3.i = kqVar.k(lcVar3);
        lcVar2.i = kqVar.k(lcVar2);
        kqVar.d(lcVar3.i, i5);
        kqVar.d(lcVar2.i, k2);
        if (adVar.a0 > 0 || adVar.g0 == 8) {
            e30 k3 = kqVar.k(lcVar);
            lcVar.i = k3;
            kqVar.d(k3, adVar.a0 + i5);
        }
        adVar.p = 2;
        adVar.Z = i5;
        int i6 = k2 - i5;
        adVar.V = i6;
        int i7 = adVar.c0;
        if (i6 < i7) {
            adVar.V = i7;
        }
    }

    public static void f(String str) {
        if (str.length() <= 0) {
            t8.k("name is empty");
            return;
        }
        int length = str.length();
        for (int i2 = 0; i2 < length; i2++) {
            char charAt = str.charAt(i2);
            if ('!' > charAt || charAt >= 127) {
                t8.e(r70.f("Unexpected char %#04x at %d in header name: %s", Integer.valueOf(charAt), Integer.valueOf(i2), str));
                return;
            }
        }
    }

    public static void g(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static void h(int i2, int i3, int i4) {
        if (i2 >= 0 && i3 <= i4) {
            if (i2 <= i3) {
                return;
            }
            t8.k(d30.d(i2, i3, "fromIndex: ", " > toIndex: "));
        } else {
            throw new IndexOutOfBoundsException("fromIndex: " + i2 + ", toIndex: " + i3 + ", size: " + i4);
        }
    }

    public static void i(String str, String str2) {
        int length = str.length();
        for (int i2 = 0; i2 < length; i2++) {
            char charAt = str.charAt(i2);
            if (charAt != '\t' && (' ' > charAt || charAt >= 127)) {
                t8.e(r70.f("Unexpected char %#04x at %d in %s value", Integer.valueOf(charAt), Integer.valueOf(i2), str2).concat(r70.n(str2) ? "" : ": ".concat(str)));
                return;
            }
        }
    }

    public static int j(int i2, int i3, int i4) {
        return i2 < i3 ? i3 : i2 > i4 ? i4 : i2;
    }

    public static int k(int i2, int i3) {
        if (i2 < i3) {
            return -1;
        }
        return i2 == i3 ? 0 : 1;
    }

    public static int l(String str, int i2, int i3, boolean z) {
        while (i2 < i3) {
            char charAt = str.charAt(i2);
            if (((charAt < ' ' && charAt != '\t') || charAt >= 127 || ('0' <= charAt && charAt < ':') || (('a' <= charAt && charAt < '{') || (('A' <= charAt && charAt < '[') || charAt == ':'))) == (!z)) {
                return i2;
            }
            i2++;
        }
        return i3;
    }

    public static boolean m(File file) {
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
            z = m(file2) && z;
        }
        return z;
    }

    public static boolean n(View view, KeyEvent keyEvent) {
        ArrayList arrayList;
        int size;
        int indexOfKey;
        WeakHashMap weakHashMap = x80.a;
        if (Build.VERSION.SDK_INT < 28) {
            ArrayList arrayList2 = w80.d;
            w80 w80Var = (w80) view.getTag(com.derinko.gbini.n1casino.R.id.tag_unhandled_key_event_manager);
            WeakReference weakReference = null;
            if (w80Var == null) {
                w80Var = new w80();
                w80Var.a = null;
                w80Var.b = null;
                w80Var.c = null;
                view.setTag(com.derinko.gbini.n1casino.R.id.tag_unhandled_key_event_manager, w80Var);
            }
            WeakReference weakReference2 = w80Var.c;
            if (weakReference2 == null || weakReference2.get() != keyEvent) {
                w80Var.c = new WeakReference(keyEvent);
                if (w80Var.b == null) {
                    w80Var.b = new SparseArray();
                }
                SparseArray sparseArray = w80Var.b;
                if (keyEvent.getAction() == 1 && (indexOfKey = sparseArray.indexOfKey(keyEvent.getKeyCode())) >= 0) {
                    weakReference = (WeakReference) sparseArray.valueAt(indexOfKey);
                    sparseArray.removeAt(indexOfKey);
                }
                if (weakReference == null) {
                    weakReference = (WeakReference) sparseArray.get(keyEvent.getKeyCode());
                }
                if (weakReference != null) {
                    View view2 = (View) weakReference.get();
                    if (view2 == null || !view2.isAttachedToWindow() || (arrayList = (ArrayList) view2.getTag(com.derinko.gbini.n1casino.R.id.tag_unhandled_key_listeners)) == null || (size = arrayList.size() - 1) < 0) {
                        return true;
                    }
                    arrayList.get(size).getClass();
                    t8.c();
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
    public static boolean o(mp mpVar, View view, Window.Callback callback, KeyEvent keyEvent) {
        DialogInterface.OnKeyListener onKeyListener;
        Window window;
        boolean z = false;
        if (mpVar != null) {
            if (Build.VERSION.SDK_INT >= 28) {
                return mpVar.b(keyEvent);
            }
            if (callback instanceof Activity) {
                Activity activity = (Activity) callback;
                activity.onUserInteraction();
                Window window2 = activity.getWindow();
                if (window2.hasFeature(8)) {
                    ActionBar actionBar = activity.getActionBar();
                    if (keyEvent.getKeyCode() == 82 && actionBar != null) {
                        if (!n) {
                            try {
                                o = actionBar.getClass().getMethod("onMenuKeyEvent", KeyEvent.class);
                            } catch (NoSuchMethodException unused) {
                            }
                            n = true;
                        }
                        Method method = o;
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
                if (x80.c(decorView, keyEvent)) {
                    return true;
                }
                return keyEvent.dispatch(activity, decorView != null ? decorView.getKeyDispatcherState() : null, activity);
            }
            if (callback instanceof Dialog) {
                Dialog dialog = (Dialog) callback;
                if (!p) {
                    try {
                        Field declaredField = Dialog.class.getDeclaredField("mOnKeyListener");
                        q = declaredField;
                        declaredField.setAccessible(true);
                    } catch (NoSuchFieldException unused3) {
                    }
                    p = true;
                }
                Field field = q;
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
                    if (x80.c(decorView2, keyEvent)) {
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
            } else if ((view != null && x80.c(view, keyEvent)) || mpVar.b(keyEvent)) {
                return true;
            }
        }
        return false;
    }

    public static final boolean p(int i2, int i3) {
        return (i2 & i3) == i3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x0047, code lost:
    
        if (r5.c == r8.hashCode()) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ColorStateList q(Context context, int i2) {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        d00 d00Var;
        Resources resources = context.getResources();
        Resources.Theme theme = context.getTheme();
        e00 e00Var = new e00(resources, theme);
        synchronized (f00.c) {
            try {
                SparseArray sparseArray = (SparseArray) f00.b.get(e00Var);
                colorStateList = null;
                if (sparseArray != null && sparseArray.size() > 0 && (d00Var = (d00) sparseArray.get(i2)) != null) {
                    if (d00Var.b.equals(resources.getConfiguration())) {
                        if (theme == null) {
                            if (d00Var.c != 0) {
                            }
                            colorStateList2 = d00Var.a;
                        }
                        if (theme != null) {
                        }
                    }
                    sparseArray.remove(i2);
                }
                colorStateList2 = null;
            } finally {
            }
        }
        if (colorStateList2 != null) {
            return colorStateList2;
        }
        ThreadLocal threadLocal = f00.a;
        TypedValue typedValue = (TypedValue) threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        resources.getValue(i2, typedValue, true);
        int i3 = typedValue.type;
        if (i3 < 28 || i3 > 31) {
            try {
                colorStateList = kb.a(resources, resources.getXml(i2), theme);
            } catch (Exception e2) {
                Log.w("ResourcesCompat", "Failed to inflate ColorStateList, leaving it to the framework", e2);
            }
        }
        if (colorStateList == null) {
            return resources.getColorStateList(i2, theme);
        }
        synchronized (f00.c) {
            try {
                WeakHashMap weakHashMap = f00.b;
                SparseArray sparseArray2 = (SparseArray) weakHashMap.get(e00Var);
                if (sparseArray2 == null) {
                    sparseArray2 = new SparseArray();
                    weakHashMap.put(e00Var, sparseArray2);
                }
                sparseArray2.append(i2, new d00(colorStateList, e00Var.a.getConfiguration(), theme));
            } finally {
            }
        }
        return colorStateList;
    }

    public static ColorStateList r(Drawable drawable) {
        ColorStateList colorStateList;
        if (drawable instanceof ColorDrawable) {
            return ColorStateList.valueOf(((ColorDrawable) drawable).getColor());
        }
        if (Build.VERSION.SDK_INT < 29 || !y.s(drawable)) {
            return null;
        }
        colorStateList = y.f(drawable).getColorStateList();
        return colorStateList;
    }

    public static Drawable s(Context context, int i2) {
        return c00.b().c(context, i2);
    }

    public static Intent t(c3 c3Var) {
        Intent parentActivityIntent = c3Var.getParentActivityIntent();
        if (parentActivityIntent != null) {
            return parentActivityIntent;
        }
        try {
            String v = v(c3Var, c3Var.getComponentName());
            if (v == null) {
                return null;
            }
            ComponentName componentName = new ComponentName(c3Var, v);
            try {
                return v(c3Var, componentName) == null ? Intent.makeMainActivity(componentName) : new Intent().setComponent(componentName);
            } catch (PackageManager.NameNotFoundException unused) {
                Log.e("NavUtils", "getParentActivityIntent: bad parentActivityName '" + v + "' in manifest");
                return null;
            }
        } catch (PackageManager.NameNotFoundException e2) {
            throw new IllegalArgumentException(e2);
        }
    }

    public static Intent u(c3 c3Var, ComponentName componentName) {
        String v = v(c3Var, componentName);
        if (v == null) {
            return null;
        }
        ComponentName componentName2 = new ComponentName(componentName.getPackageName(), v);
        return v(c3Var, componentName2) == null ? Intent.makeMainActivity(componentName2) : new Intent().setComponent(componentName2);
    }

    public static String v(Context context, ComponentName componentName) {
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

    public static ArrayList w(MaterialToolbar materialToolbar, CharSequence charSequence) {
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

    public static final boolean x(AssertionError assertionError) {
        Logger logger = vv.a;
        if (assertionError.getCause() != null) {
            String message = assertionError.getMessage();
            if (message != null ? c40.o0(message, "getsockname failed") : false) {
                return true;
            }
        }
        return false;
    }

    public static Typeface y(Configuration configuration, Typeface typeface) {
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
        create = Typeface.create(typeface, j(i4 + weight, 1, 1000), typeface.isItalic());
        return create;
    }

    public static ym z(String... strArr) {
        if (strArr.length % 2 != 0) {
            t8.k("Expected alternating header names and values");
            return null;
        }
        String[] strArr2 = (String[]) strArr.clone();
        int length = strArr2.length;
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3++) {
            String str = strArr2[i3];
            if (str == null) {
                t8.k("Headers cannot be null");
                return null;
            }
            strArr2[i3] = c40.y0(str).toString();
        }
        int y = jw.y(0, strArr2.length - 1, 2);
        if (y >= 0) {
            while (true) {
                String str2 = strArr2[i2];
                String str3 = strArr2[i2 + 1];
                f(str2);
                i(str3, str2);
                if (i2 == y) {
                    break;
                }
                i2 += 2;
            }
        }
        return new ym(strArr2);
    }

    public abstract void A(Throwable th);

    public abstract void B(int i2);

    public abstract void C(Typeface typeface, boolean z);

    public abstract void D(we weVar);
}
