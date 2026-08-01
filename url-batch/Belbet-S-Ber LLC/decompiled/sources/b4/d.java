package b4;

import android.app.ActionBar;
import android.app.Activity;
import android.app.AppOpsManager;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.Process;
import android.os.Trace;
import android.text.SpannableStringBuilder;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.inputmethod.EditorInfo;
import android.widget.EdgeEffect;
import android.window.BackEvent;
import com.gdmhkmf.belbet.R;
import com.google.android.material.datepicker.i0;
import g4.u;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.Socket;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.MappedByteBuffer;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.logging.Logger;
import k1.y;
import l.j2;
import n0.o0;
import n0.p0;
import n0.u0;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public abstract class d implements r0.e, u0 {

    /* renamed from: f, reason: collision with root package name */
    public static long f833f = 0;

    /* renamed from: g, reason: collision with root package name */
    public static Method f834g = null;
    public static boolean h = true;
    public static Field i = null;

    /* renamed from: j, reason: collision with root package name */
    public static boolean f835j = false;

    /* renamed from: k, reason: collision with root package name */
    public static boolean f836k = false;

    /* renamed from: l, reason: collision with root package name */
    public static Method f837l = null;

    /* renamed from: m, reason: collision with root package name */
    public static boolean f838m = false;

    /* renamed from: n, reason: collision with root package name */
    public static Field f839n;

    public d() {
        new ConcurrentHashMap();
    }

    public static String B(long j2) {
        return i0.b("yMMMd", Locale.getDefault()).format(new Date(j2));
    }

    public static int C(int i4) {
        if (i4 == 1) {
            return 0;
        }
        if (i4 == 2) {
            return 1;
        }
        if (i4 == 4) {
            return 2;
        }
        if (i4 == 8) {
            return 3;
        }
        if (i4 == 16) {
            return 4;
        }
        if (i4 == 32) {
            return 5;
        }
        if (i4 == 64) {
            return 6;
        }
        if (i4 == 128) {
            return 7;
        }
        if (i4 == 256) {
            return 8;
        }
        if (i4 == 512) {
            return 9;
        }
        throw new IllegalArgumentException(a4.b.f("type needs to be >= FIRST and <= LAST, type=", i4));
    }

    public static final boolean D(AssertionError assertionError) {
        Logger logger = g4.m.f1944a;
        if (assertionError.getCause() != null) {
            String message = assertionError.getMessage();
            if (message != null ? p3.d.s0(message, "getsockname failed") : false) {
                return true;
            }
        }
        return false;
    }

    public static boolean E() {
        if (Build.VERSION.SDK_INT >= 29) {
            return j1.a.a();
        }
        try {
            if (f834g == null) {
                f833f = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                f834g = Trace.class.getMethod("isTagEnabled", Long.TYPE);
            }
            return ((Boolean) f834g.invoke(null, Long.valueOf(f833f))).booleanValue();
        } catch (Exception e4) {
            if (!(e4 instanceof InvocationTargetException)) {
                Log.v("Trace", "Unable to call isTagEnabled via reflection", e4);
                return false;
            }
            Throwable cause = e4.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            throw new RuntimeException(cause);
        }
    }

    public static float L(EdgeEffect edgeEffect, float f5, float f6) {
        if (Build.VERSION.SDK_INT >= 31) {
            return r0.b.c(edgeEffect, f5, f6);
        }
        edgeEffect.onPull(f5, f6);
        return f5;
    }

    public static w0.b M(MappedByteBuffer mappedByteBuffer) {
        long j2;
        ByteBuffer duplicate = mappedByteBuffer.duplicate();
        duplicate.order(ByteOrder.BIG_ENDIAN);
        duplicate.position(duplicate.position() + 4);
        int i4 = duplicate.getShort() & 65535;
        if (i4 > 100) {
            throw new IOException("Cannot read metadata.");
        }
        duplicate.position(duplicate.position() + 6);
        int i5 = 0;
        while (true) {
            if (i5 >= i4) {
                j2 = -1;
                break;
            }
            int i6 = duplicate.getInt();
            duplicate.position(duplicate.position() + 4);
            j2 = duplicate.getInt() & 4294967295L;
            duplicate.position(duplicate.position() + 4);
            if (1835365473 == i6) {
                break;
            }
            i5++;
        }
        if (j2 != -1) {
            duplicate.position(duplicate.position() + ((int) (j2 - duplicate.position())));
            duplicate.position(duplicate.position() + 12);
            long j4 = duplicate.getInt() & 4294967295L;
            for (int i7 = 0; i7 < j4; i7++) {
                int i8 = duplicate.getInt();
                long j5 = duplicate.getInt() & 4294967295L;
                duplicate.getInt();
                if (1164798569 == i8 || 1701669481 == i8) {
                    duplicate.position((int) (j5 + j2));
                    w0.b bVar = new w0.b();
                    duplicate.order(ByteOrder.LITTLE_ENDIAN);
                    int position = duplicate.position() + duplicate.getInt(duplicate.position());
                    bVar.d = duplicate;
                    bVar.f2771a = position;
                    int i9 = position - duplicate.getInt(position);
                    bVar.f2772b = i9;
                    bVar.f2773c = ((ByteBuffer) bVar.d).getShort(i9);
                    return bVar;
                }
            }
        }
        throw new IOException("Cannot read metadata.");
    }

    public static TypedValue N(Context context, int i4) {
        return O(context.getTheme(), i4);
    }

    public static TypedValue O(Resources.Theme theme, int i4) {
        TypedValue typedValue = new TypedValue();
        if (theme.resolveAttribute(i4, typedValue, true)) {
            return typedValue;
        }
        return null;
    }

    public static boolean P(Resources.Theme theme, int i4, boolean z4) {
        TypedValue O = O(theme, i4);
        return (O == null || O.type != 18) ? z4 : O.data != 0;
    }

    public static TypedValue Q(Context context, int i4, String str) {
        TypedValue N = N(context, i4);
        if (N != null) {
            return N;
        }
        throw new IllegalArgumentException(String.format("%1$s requires a value for the %2$s attribute to be set in your app theme. You can either set the attribute in your theme or update your theme to inherit from Theme.MaterialComponents (or a descendant).", str, context.getResources().getResourceName(i4)));
    }

    public static TypedValue R(View view, int i4) {
        return Q(view.getContext(), i4, view.getClass().getCanonicalName());
    }

    public static void S(EditorInfo editorInfo, CharSequence charSequence, int i4, int i5) {
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        editorInfo.extras.putCharSequence("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SURROUNDING_TEXT", charSequence != null ? new SpannableStringBuilder(charSequence) : null);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_HEAD", i4);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_END", i5);
    }

    public static final g4.c V(Socket socket) {
        Logger logger = g4.m.f1944a;
        u uVar = new u(socket);
        OutputStream outputStream = socket.getOutputStream();
        i3.d.d(outputStream, "getOutputStream(...)");
        return new g4.c(uVar, new g4.c(outputStream, uVar));
    }

    public static final g4.d W(Socket socket) {
        Logger logger = g4.m.f1944a;
        u uVar = new u(socket);
        InputStream inputStream = socket.getInputStream();
        i3.d.d(inputStream, "getInputStream(...)");
        return new g4.d(uVar, new g4.d(inputStream, uVar, 1), 0);
    }

    public static m3.a X(m3.c cVar, int i4) {
        i3.d.e(cVar, "<this>");
        boolean z4 = i4 > 0;
        Integer valueOf = Integer.valueOf(i4);
        if (!z4) {
            throw new IllegalArgumentException("Step must be positive, was: " + valueOf + '.');
        }
        int i5 = cVar.f2735f;
        int i6 = cVar.f2736g;
        if (cVar.h <= 0) {
            i4 = -i4;
        }
        return new m3.a(i5, i6, i4);
    }

    public static m3.c Y(int i4, int i5) {
        if (i5 > Integer.MIN_VALUE) {
            return new m3.c(i4, i5 - 1, 1);
        }
        m3.c cVar = m3.c.i;
        return m3.c.i;
    }

    public static final d1.b h(BackEvent backEvent) {
        float touchX;
        float touchY;
        float progress;
        int swipeEdge;
        touchX = backEvent.getTouchX();
        touchY = backEvent.getTouchY();
        progress = backEvent.getProgress();
        swipeEdge = backEvent.getSwipeEdge();
        return new d1.b(swipeEdge, progress, touchX, touchY, Build.VERSION.SDK_INT >= 36 ? backEvent.getFrameTimeMillis() : 0L);
    }

    public static final boolean i(int i4, int i5, int i6, byte[] bArr, byte[] bArr2) {
        i3.d.e(bArr, "a");
        i3.d.e(bArr2, "b");
        for (int i7 = 0; i7 < i6; i7++) {
            if (bArr[i7 + i4] != bArr2[i7 + i5]) {
                return false;
            }
        }
        return true;
    }

    public static void j(String str) {
        if (str.length() > 127) {
            str = str.substring(0, 127);
        }
        Trace.beginSection(str);
    }

    public static final void k(long j2, long j4, long j5) {
        if ((j4 | j5) < 0 || j4 > j2 || j2 - j4 < j5) {
            throw new ArrayIndexOutOfBoundsException("size=" + j2 + " offset=" + j4 + " byteCount=" + j5);
        }
    }

    public static void l(int i4) {
        if (2 > i4 || i4 >= 37) {
            throw new IllegalArgumentException("radix " + i4 + " was not in valid range " + new m3.c(2, 36, 1));
        }
    }

    public static int m(Context context, String str) {
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
                        noteProxyOpNoThrow = appOpsManager != null ? appOpsManager.checkOpNoThrow(permissionToOp, myUid, c0.d.a(context)) : 1;
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

    public static boolean s(View view, KeyEvent keyEvent) {
        ArrayList arrayList;
        int size;
        int indexOfKey;
        WeakHashMap weakHashMap = p0.f2816a;
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        ArrayList arrayList2 = o0.d;
        o0 o0Var = (o0) view.getTag(R.id.tag_unhandled_key_event_manager);
        WeakReference weakReference = null;
        if (o0Var == null) {
            o0Var = new o0();
            o0Var.f2812a = null;
            o0Var.f2813b = null;
            o0Var.f2814c = null;
            view.setTag(R.id.tag_unhandled_key_event_manager, o0Var);
        }
        WeakReference weakReference2 = o0Var.f2814c;
        if (weakReference2 != null && weakReference2.get() == keyEvent) {
            return false;
        }
        o0Var.f2814c = new WeakReference(keyEvent);
        if (o0Var.f2813b == null) {
            o0Var.f2813b = new SparseArray();
        }
        SparseArray sparseArray = o0Var.f2813b;
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

    /* JADX WARN: Removed duplicated region for block: B:56:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:63:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean t(n0.l lVar, View view, Window.Callback callback, KeyEvent keyEvent) {
        DialogInterface.OnKeyListener onKeyListener;
        Window window;
        boolean z4 = false;
        if (lVar != null) {
            if (Build.VERSION.SDK_INT >= 28) {
                return lVar.b(keyEvent);
            }
            if (callback instanceof Activity) {
                Activity activity = (Activity) callback;
                activity.onUserInteraction();
                Window window2 = activity.getWindow();
                if (window2.hasFeature(8)) {
                    ActionBar actionBar = activity.getActionBar();
                    if (keyEvent.getKeyCode() == 82 && actionBar != null) {
                        if (!f836k) {
                            try {
                                f837l = actionBar.getClass().getMethod("onMenuKeyEvent", KeyEvent.class);
                            } catch (NoSuchMethodException unused) {
                            }
                            f836k = true;
                        }
                        Method method = f837l;
                        if (method != null) {
                            try {
                                Object invoke = method.invoke(actionBar, keyEvent);
                                if (invoke != null) {
                                    z4 = ((Boolean) invoke).booleanValue();
                                }
                            } catch (IllegalAccessException | InvocationTargetException unused2) {
                            }
                        }
                        if (z4) {
                            return true;
                        }
                    }
                }
                if (window2.superDispatchKeyEvent(keyEvent)) {
                    return true;
                }
                View decorView = window2.getDecorView();
                if (p0.c(decorView, keyEvent)) {
                    return true;
                }
                return keyEvent.dispatch(activity, decorView != null ? decorView.getKeyDispatcherState() : null, activity);
            }
            if (callback instanceof Dialog) {
                Dialog dialog = (Dialog) callback;
                if (!f838m) {
                    try {
                        Field declaredField = Dialog.class.getDeclaredField("mOnKeyListener");
                        f839n = declaredField;
                        declaredField.setAccessible(true);
                    } catch (NoSuchFieldException unused3) {
                    }
                    f838m = true;
                }
                Field field = f839n;
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
                    if (p0.c(decorView2, keyEvent)) {
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
            } else if ((view != null && p0.c(view, keyEvent)) || lVar.b(keyEvent)) {
                return true;
            }
        }
        return false;
    }

    public static final boolean u(char c5, char c6, boolean z4) {
        if (c5 == c6) {
            return true;
        }
        if (!z4) {
            return false;
        }
        char upperCase = Character.toUpperCase(c5);
        char upperCase2 = Character.toUpperCase(c6);
        return upperCase == upperCase2 || Character.toLowerCase(upperCase) == Character.toLowerCase(upperCase2);
    }

    public static View v(View view, int i4) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            View findViewById = viewGroup.getChildAt(i5).findViewById(i4);
            if (findViewById != null) {
                return findViewById;
            }
        }
        return null;
    }

    public static float x(EdgeEffect edgeEffect) {
        if (Build.VERSION.SDK_INT >= 31) {
            return r0.b.b(edgeEffect);
        }
        return 0.0f;
    }

    public static Drawable y(Context context, int i4) {
        return j2.b().c(context, i4);
    }

    public static final int z(int i4, int i5, int i6) {
        if (i6 > 0) {
            if (i4 < i5) {
                int i7 = i5 % i6;
                if (i7 < 0) {
                    i7 += i6;
                }
                int i8 = i4 % i6;
                if (i8 < 0) {
                    i8 += i6;
                }
                int i9 = (i7 - i8) % i6;
                if (i9 < 0) {
                    i9 += i6;
                }
                return i5 - i9;
            }
        } else {
            if (i6 >= 0) {
                throw new IllegalArgumentException("Step is zero.");
            }
            if (i4 > i5) {
                int i10 = -i6;
                int i11 = i4 % i10;
                if (i11 < 0) {
                    i11 += i10;
                }
                int i12 = i5 % i10;
                if (i12 < 0) {
                    i12 += i10;
                }
                int i13 = (i11 - i12) % i10;
                if (i13 < 0) {
                    i13 += i10;
                }
                return i13 + i5;
            }
        }
        return i5;
    }

    public float A(View view) {
        if (h) {
            try {
                return y.a(view);
            } catch (NoSuchMethodError unused) {
                h = false;
            }
        }
        return view.getAlpha();
    }

    public abstract void F(Throwable th);

    public abstract View G(int i4);

    public abstract void H(int i4);

    public abstract void I(Typeface typeface, boolean z4);

    public abstract boolean J();

    public abstract void K(a0.k kVar);

    public void T(View view, float f5) {
        if (h) {
            try {
                y.b(view, f5);
                return;
            } catch (NoSuchMethodError unused) {
                h = false;
            }
        }
        view.setAlpha(f5);
    }

    public void U(View view, int i4) {
        if (!f835j) {
            try {
                Field declaredField = View.class.getDeclaredField("mViewFlags");
                i = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
                Log.i("ViewUtilsApi19", "fetchViewFlagsField: ");
            }
            f835j = true;
        }
        Field field = i;
        if (field != null) {
            try {
                i.setInt(view, i4 | (field.getInt(view) & (-13)));
            } catch (IllegalAccessException unused2) {
            }
        }
    }

    public abstract List n(List list, String str);

    public abstract Typeface o(Context context, e0.f fVar, Resources resources, int i4);

    public abstract Typeface p(Context context, k0.i[] iVarArr, int i4);

    public Typeface q(Context context, List list, int i4) {
        throw new IllegalStateException("createFromFontInfoWithFallback must only be called on API 29+");
    }

    public Typeface r(Context context, Resources resources, int i4, String str, int i5) {
        File G = l.G(context);
        if (G == null) {
            return null;
        }
        try {
            if (l.k(G, resources, i4)) {
                return Typeface.createFromFile(G.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            G.delete();
        }
    }

    public abstract void w(o2.y yVar, float f5, float f6);

    @Override // n0.u0
    public void c() {
    }

    @Override // n0.u0
    public void g() {
    }
}
