package q1;

import H0.u;
import K.InterfaceC0015k;
import K.W;
import K.X;
import K.g0;
import O0.q;
import T.v;
import a.C;
import android.animation.TimeInterpolator;
import android.app.ActionBar;
import android.app.Activity;
import android.app.AppOpsManager;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Binder;
import android.os.Build;
import android.os.Process;
import android.os.Trace;
import android.text.InputFilter;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.ImageView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.lifecycle.K;
import com.fortuneink.neonpad.R;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import e0.I;
import e0.U;
import i1.B;
import i1.r;
import java.io.File;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.MappedByteBuffer;
import java.security.MessageDigest;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;

/* loaded from: classes.dex */
public abstract class l {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f3952a = false;

    /* renamed from: b, reason: collision with root package name */
    public static Method f3953b = null;

    /* renamed from: c, reason: collision with root package name */
    public static boolean f3954c = false;

    /* renamed from: d, reason: collision with root package name */
    public static Field f3955d;

    /* renamed from: e, reason: collision with root package name */
    public static long f3956e;

    /* renamed from: f, reason: collision with root package name */
    public static Method f3957f;

    public l() {
        new ConcurrentHashMap();
    }

    public static float A(String[] strArr, int i) {
        float parseFloat = Float.parseFloat(strArr[i]);
        if (parseFloat >= 0.0f && parseFloat <= 1.0f) {
            return parseFloat;
        }
        throw new IllegalArgumentException("Motion easing control point value must be between 0 and 1; instead got: " + parseFloat);
    }

    public static final int F(int i, int i2, int i3) {
        if (i3 > 0) {
            if (i >= i2) {
                return i2;
            }
            int i4 = i2 % i3;
            if (i4 < 0) {
                i4 += i3;
            }
            int i5 = i % i3;
            if (i5 < 0) {
                i5 += i3;
            }
            int i6 = (i4 - i5) % i3;
            if (i6 < 0) {
                i6 += i3;
            }
            return i2 - i6;
        }
        if (i3 >= 0) {
            throw new IllegalArgumentException("Step is zero.");
        }
        if (i <= i2) {
            return i2;
        }
        int i7 = -i3;
        int i8 = i % i7;
        if (i8 < 0) {
            i8 += i7;
        }
        int i9 = i2 % i7;
        if (i9 < 0) {
            i9 += i7;
        }
        int i10 = (i8 - i9) % i7;
        if (i10 < 0) {
            i10 += i7;
        }
        return i2 + i10;
    }

    public static boolean K() {
        boolean isEnabled;
        try {
            if (f3957f == null) {
                isEnabled = Trace.isEnabled();
                return isEnabled;
            }
        } catch (NoClassDefFoundError | NoSuchMethodError unused) {
        }
        try {
            if (f3957f == null) {
                f3956e = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                f3957f = Trace.class.getMethod("isTagEnabled", Long.TYPE);
            }
            return ((Boolean) f3957f.invoke(null, Long.valueOf(f3956e))).booleanValue();
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

    public static boolean M(String str, String str2) {
        return str.startsWith(str2.concat("(")) && str.endsWith(")");
    }

    public static float V(EdgeEffect edgeEffect, float f2, float f3) {
        if (Build.VERSION.SDK_INT >= 31) {
            return Q.e.c(edgeEffect, f2, f3);
        }
        Q.d.a(edgeEffect, f2, f3);
        return f2;
    }

    public static String a0(X509Certificate x509Certificate) {
        StringBuilder sb = new StringBuilder("sha256/");
        v1.j jVar = v1.j.f4485d;
        byte[] encoded = x509Certificate.getPublicKey().getEncoded();
        X0.f.d(encoded, "publicKey.encoded");
        int length = encoded.length;
        int i = 0;
        r.e(encoded.length, 0, length);
        byte[] w02 = O0.g.w0(0, length, encoded);
        v1.j jVar2 = new v1.j(w02);
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        messageDigest.update(w02, 0, jVar2.a());
        byte[] digest = messageDigest.digest();
        X0.f.b(digest);
        new v1.j(digest);
        byte[] bArr = v1.a.f4470a;
        X0.f.e(bArr, "map");
        byte[] bArr2 = new byte[((digest.length + 2) / 3) * 4];
        int length2 = digest.length - (digest.length % 3);
        int i2 = 0;
        while (i < length2) {
            byte b2 = digest[i];
            int i3 = i + 2;
            byte b3 = digest[i + 1];
            i += 3;
            byte b4 = digest[i3];
            bArr2[i2] = bArr[(b2 & 255) >> 2];
            bArr2[i2 + 1] = bArr[((b2 & 3) << 4) | ((b3 & 255) >> 4)];
            int i4 = i2 + 3;
            bArr2[i2 + 2] = bArr[((b3 & 15) << 2) | ((b4 & 255) >> 6)];
            i2 += 4;
            bArr2[i4] = bArr[b4 & 63];
        }
        int length3 = digest.length - length2;
        if (length3 == 1) {
            byte b5 = digest[i];
            bArr2[i2] = bArr[(b5 & 255) >> 2];
            bArr2[1 + i2] = bArr[(b5 & 3) << 4];
            bArr2[2 + i2] = 61;
            bArr2[i2 + 3] = 61;
        } else if (length3 == 2) {
            int i5 = i + 1;
            byte b6 = digest[i];
            byte b7 = digest[i5];
            bArr2[i2] = bArr[(b6 & 255) >> 2];
            bArr2[1 + i2] = bArr[((b6 & 3) << 4) | ((b7 & 255) >> 4)];
            bArr2[i2 + 2] = bArr[(b7 & 15) << 2];
            bArr2[i2 + 3] = 61;
        }
        sb.append(new String(bArr2, e1.a.f2371a));
        return sb.toString();
    }

    public static void b(Throwable th, Throwable th2) {
        X0.f.e(th, "<this>");
        X0.f.e(th2, "exception");
        if (th != th2) {
            Integer num = S0.a.f774a;
            if (num == null || num.intValue() >= 19) {
                th.addSuppressed(th2);
                return;
            }
            Method method = R0.a.f736a;
            if (method != null) {
                method.invoke(th, th2);
            }
        }
    }

    public static U.b b0(MappedByteBuffer mappedByteBuffer) {
        long j2;
        ByteBuffer duplicate = mappedByteBuffer.duplicate();
        duplicate.order(ByteOrder.BIG_ENDIAN);
        duplicate.position(duplicate.position() + 4);
        int i = duplicate.getShort() & 65535;
        if (i > 100) {
            throw new IOException("Cannot read metadata.");
        }
        duplicate.position(duplicate.position() + 6);
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                j2 = -1;
                break;
            }
            int i3 = duplicate.getInt();
            duplicate.position(duplicate.position() + 4);
            j2 = duplicate.getInt() & 4294967295L;
            duplicate.position(duplicate.position() + 4);
            if (1835365473 == i3) {
                break;
            }
            i2++;
        }
        if (j2 != -1) {
            duplicate.position(duplicate.position() + ((int) (j2 - duplicate.position())));
            duplicate.position(duplicate.position() + 12);
            long j3 = duplicate.getInt() & 4294967295L;
            for (int i4 = 0; i4 < j3; i4++) {
                int i5 = duplicate.getInt();
                long j4 = duplicate.getInt() & 4294967295L;
                duplicate.getInt();
                if (1164798569 == i5 || 1701669481 == i5) {
                    duplicate.position((int) (j4 + j2));
                    U.b bVar = new U.b();
                    duplicate.order(ByteOrder.LITTLE_ENDIAN);
                    int position = duplicate.position() + duplicate.getInt(duplicate.position());
                    bVar.f409d = duplicate;
                    bVar.f406a = position;
                    int i6 = position - duplicate.getInt(position);
                    bVar.f407b = i6;
                    bVar.f408c = ((ByteBuffer) bVar.f409d).getShort(i6);
                    return bVar;
                }
            }
        }
        throw new IOException("Cannot read metadata.");
    }

    public static void c(StringBuilder sb, Object obj, W0.l lVar) {
        if (lVar != null) {
            sb.append((CharSequence) lVar.c(obj));
            return;
        }
        if (obj == null ? true : obj instanceof CharSequence) {
            sb.append((CharSequence) obj);
        } else if (obj instanceof Character) {
            sb.append(((Character) obj).charValue());
        } else {
            sb.append((CharSequence) String.valueOf(obj));
        }
    }

    public static void c0(TextInputLayout textInputLayout, CheckableImageButton checkableImageButton, ColorStateList colorStateList) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (checkableImageButton.getDrawable() == null || colorStateList == null || !colorStateList.isStateful()) {
            return;
        }
        int[] drawableState = textInputLayout.getDrawableState();
        int[] drawableState2 = checkableImageButton.getDrawableState();
        int length = drawableState.length;
        int[] copyOf = Arrays.copyOf(drawableState, drawableState.length + drawableState2.length);
        System.arraycopy(drawableState2, 0, copyOf, length, drawableState2.length);
        int colorForState = colorStateList.getColorForState(copyOf, colorStateList.getDefaultColor());
        Drawable mutate = drawable.mutate();
        D.a.h(mutate, ColorStateList.valueOf(colorForState));
        checkableImageButton.setImageDrawable(mutate);
    }

    public static void d(TextInputLayout textInputLayout, CheckableImageButton checkableImageButton, ColorStateList colorStateList, PorterDuff.Mode mode) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (drawable != null) {
            drawable = drawable.mutate();
            if (colorStateList == null || !colorStateList.isStateful()) {
                D.a.h(drawable, colorStateList);
            } else {
                int[] drawableState = textInputLayout.getDrawableState();
                int[] drawableState2 = checkableImageButton.getDrawableState();
                int length = drawableState.length;
                int[] copyOf = Arrays.copyOf(drawableState, drawableState.length + drawableState2.length);
                System.arraycopy(drawableState2, 0, copyOf, length, drawableState2.length);
                D.a.h(drawable, ColorStateList.valueOf(colorStateList.getColorForState(copyOf, colorStateList.getDefaultColor())));
            }
            if (mode != null) {
                D.a.i(drawable, mode);
            }
        }
        if (checkableImageButton.getDrawable() != drawable) {
            checkableImageButton.setImageDrawable(drawable);
        }
    }

    public static TypedValue d0(Context context, int i) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(i, typedValue, true)) {
            return typedValue;
        }
        return null;
    }

    public static boolean e0(Context context, int i, boolean z2) {
        TypedValue d02 = d0(context, i);
        return (d02 == null || d02.type != 18) ? z2 : d02.data != 0;
    }

    public static int f0(Context context, int i, int i2) {
        TypedValue d02 = d0(context, i);
        return (d02 == null || d02.type != 16) ? i2 : d02.data;
    }

    public static int g(String str, Context context) {
        int c2;
        int myPid = Process.myPid();
        int myUid = Process.myUid();
        String packageName = context.getPackageName();
        if (context.checkPermission(str, myPid, myUid) == -1) {
            return -1;
        }
        String d2 = z.g.d(str);
        if (d2 != null) {
            if (packageName == null) {
                String[] packagesForUid = context.getPackageManager().getPackagesForUid(myUid);
                if (packagesForUid == null || packagesForUid.length <= 0) {
                    return -1;
                }
                packageName = packagesForUid[0];
            }
            int myUid2 = Process.myUid();
            String packageName2 = context.getPackageName();
            if (myUid2 != myUid || !Objects.equals(packageName2, packageName)) {
                c2 = z.g.c((AppOpsManager) z.g.a(context, AppOpsManager.class), d2, packageName);
            } else if (Build.VERSION.SDK_INT >= 29) {
                AppOpsManager c3 = z.h.c(context);
                c2 = z.h.a(c3, d2, Binder.getCallingUid(), packageName);
                if (c2 == 0) {
                    c2 = z.h.a(c3, d2, myUid, z.h.b(context));
                }
            } else {
                c2 = z.g.c((AppOpsManager) z.g.a(context, AppOpsManager.class), d2, packageName);
            }
            if (c2 != 0) {
                return -2;
            }
        }
        return 0;
    }

    public static TimeInterpolator g0(Context context, int i, Interpolator interpolator) {
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(i, typedValue, true)) {
            return interpolator;
        }
        if (typedValue.type != 3) {
            throw new IllegalArgumentException("Motion easing theme attribute must be an @interpolator resource for ?attr/motionEasing*Interpolator attributes or a string for ?attr/motionEasing* attributes.");
        }
        String valueOf = String.valueOf(typedValue.string);
        if (!M(valueOf, "cubic-bezier") && !M(valueOf, "path")) {
            return AnimationUtils.loadInterpolator(context, typedValue.resourceId);
        }
        if (M(valueOf, "cubic-bezier")) {
            String[] split = valueOf.substring(13, valueOf.length() - 1).split(",");
            if (split.length == 4) {
                return M.a.b(A(split, 0), A(split, 1), A(split, 2), A(split, 3));
            }
            throw new IllegalArgumentException("Motion easing theme attribute must have 4 control points if using bezier curve format; instead got: " + split.length);
        }
        if (!M(valueOf, "path")) {
            throw new IllegalArgumentException("Invalid motion easing type: ".concat(valueOf));
        }
        String substring = valueOf.substring(5, valueOf.length() - 1);
        Path path = new Path();
        try {
            C.g.b(d.s(substring), path);
            return M.a.c(path);
        } catch (RuntimeException e2) {
            throw new RuntimeException("Error in parsing ".concat(substring), e2);
        }
    }

    public static int h(int i, int i2, int i3) {
        return i < i2 ? i2 : i > i3 ? i3 : i;
    }

    public static TypedValue h0(Context context, int i, String str) {
        TypedValue d02 = d0(context, i);
        if (d02 != null) {
            return d02;
        }
        throw new IllegalArgumentException(String.format("%1$s requires a value for the %2$s attribute to be set in your app theme. You can either set the attribute in your theme or update your theme to inherit from Theme.MaterialComponents (or a descendant).", str, context.getResources().getResourceName(i)));
    }

    public static final void i0(View view, C c2) {
        X0.f.e(view, "<this>");
        view.setTag(R.id.view_tree_on_back_pressed_dispatcher_owner, c2);
    }

    public static final void j0(View view, g0.f fVar) {
        X0.f.e(view, "<this>");
        view.setTag(R.id.view_tree_saved_state_registry_owner, fVar);
    }

    public static int k(U u2, T.g gVar, View view, View view2, I i, boolean z2) {
        if (i.v() == 0 || u2.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z2) {
            return Math.abs(I.H(view) - I.H(view2)) + 1;
        }
        return Math.min(gVar.l(), gVar.b(view2) - gVar.e(view));
    }

    public static int l(U u2, T.g gVar, View view, View view2, I i, boolean z2, boolean z3) {
        if (i.v() == 0 || u2.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        int max = z3 ? Math.max(0, (u2.b() - Math.max(I.H(view), I.H(view2))) - 1) : Math.max(0, Math.min(I.H(view), I.H(view2)));
        if (z2) {
            return Math.round((max * (Math.abs(gVar.b(view2) - gVar.e(view)) / (Math.abs(I.H(view) - I.H(view2)) + 1))) + (gVar.k() - gVar.e(view)));
        }
        return max;
    }

    public static int m(U u2, T.g gVar, View view, View view2, I i, boolean z2) {
        if (i.v() == 0 || u2.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z2) {
            return u2.b();
        }
        return (int) (((gVar.b(view2) - gVar.e(view)) / (Math.abs(I.H(view) - I.H(view2)) + 1)) * u2.b());
    }

    public static ImageView.ScaleType n(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 5 ? i != 6 ? ImageView.ScaleType.CENTER : ImageView.ScaleType.CENTER_INSIDE : ImageView.ScaleType.CENTER_CROP : ImageView.ScaleType.FIT_END : ImageView.ScaleType.FIT_CENTER : ImageView.ScaleType.FIT_START : ImageView.ScaleType.FIT_XY;
    }

    public static void n0(Window window, boolean z2) {
        if (Build.VERSION.SDK_INT >= 30) {
            g0.a(window, z2);
            return;
        }
        View decorView = window.getDecorView();
        int systemUiVisibility = decorView.getSystemUiVisibility();
        decorView.setSystemUiVisibility(z2 ? systemUiVisibility & (-1793) : systemUiVisibility | 1792);
    }

    public static void p0(CheckableImageButton checkableImageButton, View.OnLongClickListener onLongClickListener) {
        WeakHashMap weakHashMap = X.f418a;
        boolean hasOnClickListeners = checkableImageButton.hasOnClickListeners();
        boolean z2 = onLongClickListener != null;
        boolean z3 = hasOnClickListeners || z2;
        checkableImageButton.setFocusable(z3);
        checkableImageButton.setClickable(hasOnClickListeners);
        checkableImageButton.setPressable(hasOnClickListeners);
        checkableImageButton.setLongClickable(z2);
        checkableImageButton.setImportantForAccessibility(z3 ? 1 : 2);
    }

    public static boolean r(View view, KeyEvent keyEvent) {
        ArrayList arrayList;
        int size;
        int indexOfKey;
        WeakHashMap weakHashMap = X.f418a;
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        ArrayList arrayList2 = W.f414d;
        W w2 = (W) view.getTag(R.id.tag_unhandled_key_event_manager);
        WeakReference weakReference = null;
        if (w2 == null) {
            w2 = new W();
            w2.f415a = null;
            w2.f416b = null;
            w2.f417c = null;
            view.setTag(R.id.tag_unhandled_key_event_manager, w2);
        }
        WeakReference weakReference2 = w2.f417c;
        if (weakReference2 != null && weakReference2.get() == keyEvent) {
            return false;
        }
        w2.f417c = new WeakReference(keyEvent);
        if (w2.f416b == null) {
            w2.f416b = new SparseArray();
        }
        SparseArray sparseArray = w2.f416b;
        if (keyEvent.getAction() == 1 && (indexOfKey = sparseArray.indexOfKey(keyEvent.getKeyCode())) >= 0) {
            weakReference = (WeakReference) sparseArray.valueAt(indexOfKey);
            sparseArray.removeAt(indexOfKey);
        }
        if (weakReference == null) {
            weakReference = (WeakReference) sparseArray.get(keyEvent.getKeyCode());
        }
        if (weakReference == null) {
            return false;
        }
        View view2 = (View) weakReference.get();
        if (view2 == null || !view2.isAttachedToWindow() || (arrayList = (ArrayList) view2.getTag(R.id.tag_unhandled_key_listeners)) == null || (size = arrayList.size() - 1) < 0) {
            return true;
        }
        arrayList.get(size).getClass();
        throw new ClassCastException();
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:64:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean s(InterfaceC0015k interfaceC0015k, View view, Window.Callback callback, KeyEvent keyEvent) {
        DialogInterface.OnKeyListener onKeyListener;
        Window window;
        boolean z2 = false;
        if (interfaceC0015k == null) {
            return false;
        }
        if (Build.VERSION.SDK_INT >= 28) {
            return interfaceC0015k.superDispatchKeyEvent(keyEvent);
        }
        if (callback instanceof Activity) {
            Activity activity = (Activity) callback;
            activity.onUserInteraction();
            Window window2 = activity.getWindow();
            if (window2.hasFeature(8)) {
                ActionBar actionBar = activity.getActionBar();
                if (keyEvent.getKeyCode() == 82 && actionBar != null) {
                    if (!f3952a) {
                        try {
                            f3953b = actionBar.getClass().getMethod("onMenuKeyEvent", KeyEvent.class);
                        } catch (NoSuchMethodException unused) {
                        }
                        f3952a = true;
                    }
                    Method method = f3953b;
                    if (method != null) {
                        try {
                            Object invoke = method.invoke(actionBar, keyEvent);
                            if (invoke != null) {
                                z2 = ((Boolean) invoke).booleanValue();
                            }
                        } catch (IllegalAccessException | InvocationTargetException unused2) {
                        }
                    }
                    if (z2) {
                        return true;
                    }
                }
            }
            if (window2.superDispatchKeyEvent(keyEvent)) {
                return true;
            }
            View decorView = window2.getDecorView();
            if (X.b(decorView, keyEvent)) {
                return true;
            }
            return keyEvent.dispatch(activity, decorView != null ? decorView.getKeyDispatcherState() : null, activity);
        }
        if (!(callback instanceof Dialog)) {
            return (view != null && X.b(view, keyEvent)) || interfaceC0015k.superDispatchKeyEvent(keyEvent);
        }
        Dialog dialog = (Dialog) callback;
        if (!f3954c) {
            try {
                Field declaredField = Dialog.class.getDeclaredField("mOnKeyListener");
                f3955d = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused3) {
            }
            f3954c = true;
        }
        Field field = f3955d;
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
            if (X.b(decorView2, keyEvent)) {
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
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x004b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static i1.l u(SSLSession sSLSession) {
        List list;
        Certificate[] localCertificates;
        Certificate[] peerCertificates;
        List list2 = q.f694a;
        String cipherSuite = sSLSession.getCipherSuite();
        if (cipherSuite == null) {
            throw new IllegalStateException("cipherSuite == null");
        }
        if (cipherSuite.equals("TLS_NULL_WITH_NULL_NULL") ? true : cipherSuite.equals("SSL_NULL_WITH_NULL_NULL")) {
            throw new IOException("cipherSuite == ".concat(cipherSuite));
        }
        i1.h c2 = i1.h.f2659b.c(cipherSuite);
        String protocol = sSLSession.getProtocol();
        if (protocol == null) {
            throw new IllegalStateException("tlsVersion == null");
        }
        if ("NONE".equals(protocol)) {
            throw new IOException("tlsVersion == NONE");
        }
        B i = i1.m.i(protocol);
        try {
            peerCertificates = sSLSession.getPeerCertificates();
        } catch (SSLPeerUnverifiedException unused) {
        }
        if (peerCertificates != null) {
            list = j1.b.j(Arrays.copyOf(peerCertificates, peerCertificates.length));
            localCertificates = sSLSession.getLocalCertificates();
            if (localCertificates != null) {
                list2 = j1.b.j(Arrays.copyOf(localCertificates, localCertificates.length));
            }
            return new i1.l(i, c2, list2, new K(1, list));
        }
        list = list2;
        localCertificates = sSLSession.getLocalCertificates();
        if (localCertificates != null) {
        }
        return new i1.l(i, c2, list2, new K(1, list));
    }

    public static float w(EdgeEffect edgeEffect) {
        if (Build.VERSION.SDK_INT >= 31) {
            return Q.e.b(edgeEffect);
        }
        return 0.0f;
    }

    public abstract int B();

    public abstract int C();

    public abstract int D(View view);

    public abstract int E(CoordinatorLayout coordinatorLayout);

    public abstract int G();

    public int H(View view) {
        return 0;
    }

    public int I() {
        return 0;
    }

    public abstract void J();

    public abstract boolean L(float f2);

    public abstract boolean N(View view);

    public abstract boolean O(float f2, float f3);

    public abstract void P(Throwable th);

    public abstract View Q(int i);

    public abstract void R(int i);

    public abstract void S(Typeface typeface, boolean z2);

    public abstract boolean T();

    public abstract void U(v vVar);

    public void W(View view, int i) {
    }

    public abstract void X(int i);

    public abstract void Y(View view, int i, int i2);

    public abstract void Z(View view, float f2, float f3);

    public abstract int e(ViewGroup.MarginLayoutParams marginLayoutParams);

    public abstract float f(int i);

    public abstract int i(View view, int i);

    public abstract int j(View view, int i);

    public abstract void k0(boolean z2);

    public abstract void l0(boolean z2);

    public abstract void m0(boolean z2);

    public abstract Typeface o(Context context, B.g gVar, Resources resources, int i);

    public abstract void o0(boolean z2);

    public abstract Typeface p(Context context, H.k[] kVarArr, int i);

    public Typeface q(Context context, Resources resources, int i, String str, int i2) {
        File F = d.F(context);
        if (F == null) {
            return null;
        }
        try {
            if (d.o(F, resources, i)) {
                return Typeface.createFromFile(F.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            F.delete();
        }
    }

    public abstract void q0();

    public abstract boolean r0(View view, float f2);

    public abstract boolean s0(View view, int i);

    public H.k t(int i, H.k[] kVarArr) {
        new H0.e(1);
        int i2 = (i & 1) == 0 ? 400 : 700;
        boolean z2 = (i & 2) != 0;
        H.k kVar = null;
        int i3 = Integer.MAX_VALUE;
        for (H.k kVar2 : kVarArr) {
            int abs = (Math.abs(kVar2.f245c - i2) * 2) + (kVar2.f246d == z2 ? 0 : 1);
            if (kVar == null || i3 > abs) {
                kVar = kVar2;
                i3 = abs;
            }
        }
        return kVar;
    }

    public abstract void t0(ViewGroup.MarginLayoutParams marginLayoutParams, int i, int i2);

    public abstract void v(u uVar, float f2, float f3);

    public abstract int x();

    public abstract InputFilter[] y(InputFilter[] inputFilterArr);

    public abstract int z();
}
