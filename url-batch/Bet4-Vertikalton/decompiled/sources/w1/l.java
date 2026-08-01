package w1;

import K.C0014l;
import K.InterfaceC0013k;
import K.S;
import K.T;
import K.Y;
import K.e0;
import U.u;
import android.app.ActionBar;
import android.app.Activity;
import android.app.AppOpsManager;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Binder;
import android.os.Build;
import android.os.Process;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.widget.EdgeEffect;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import com.playbag.tripgear.R;
import java.io.File;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.MappedByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import l.M0;
import z.AbstractC0320d;

/* loaded from: classes.dex */
public abstract class l implements Q.j {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f4186a = false;

    /* renamed from: b, reason: collision with root package name */
    public static Method f4187b = null;

    /* renamed from: c, reason: collision with root package name */
    public static boolean f4188c = false;
    public static Field d;

    public l() {
        new ConcurrentHashMap();
    }

    public static Drawable A(Context context, TypedArray typedArray, int i) {
        int resourceId;
        Drawable z2;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (z2 = z(context, resourceId)) == null) ? typedArray.getDrawable(i) : z2;
    }

    public static final int B(int i, int i2, int i3) {
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

    public static boolean F(Context context) {
        return context.getResources().getConfiguration().fontScale >= 1.3f;
    }

    public static Typeface G(Configuration configuration, Typeface typeface) {
        int i;
        int i2;
        int weight;
        int i3;
        Typeface create;
        if (Build.VERSION.SDK_INT < 31) {
            return null;
        }
        i = configuration.fontWeightAdjustment;
        if (i == Integer.MAX_VALUE) {
            return null;
        }
        i2 = configuration.fontWeightAdjustment;
        if (i2 == 0 || typeface == null) {
            return null;
        }
        weight = typeface.getWeight();
        i3 = configuration.fontWeightAdjustment;
        create = Typeface.create(typeface, j(i3 + weight, 1, 1000), typeface.isItalic());
        return create;
    }

    public static float L(EdgeEffect edgeEffect, float f2, float f3) {
        if (Build.VERSION.SDK_INT >= 31) {
            return Q.e.c(edgeEffect, f2, f3);
        }
        Q.d.a(edgeEffect, f2, f3);
        return f2;
    }

    public static V.b R(MappedByteBuffer mappedByteBuffer) {
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
                    V.b bVar = new V.b();
                    duplicate.order(ByteOrder.LITTLE_ENDIAN);
                    int position = duplicate.position() + duplicate.getInt(duplicate.position());
                    bVar.d = duplicate;
                    bVar.f413a = position;
                    int i6 = position - duplicate.getInt(position);
                    bVar.f414b = i6;
                    bVar.f415c = ((ByteBuffer) bVar.d).getShort(i6);
                    return bVar;
                }
            }
        }
        throw new IOException("Cannot read metadata.");
    }

    public static void S(TextInputLayout textInputLayout, CheckableImageButton checkableImageButton, ColorStateList colorStateList) {
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

    public static void V(Window window, boolean z2) {
        if (Build.VERSION.SDK_INT >= 30) {
            e0.a(window, z2);
            return;
        }
        View decorView = window.getDecorView();
        int systemUiVisibility = decorView.getSystemUiVisibility();
        decorView.setSystemUiVisibility(z2 ? systemUiVisibility & (-1793) : systemUiVisibility | 1792);
    }

    public static void W(CheckableImageButton checkableImageButton, View.OnLongClickListener onLongClickListener) {
        WeakHashMap weakHashMap = T.f423a;
        boolean hasOnClickListeners = checkableImageButton.hasOnClickListeners();
        boolean z2 = onLongClickListener != null;
        boolean z3 = hasOnClickListeners || z2;
        checkableImageButton.setFocusable(z3);
        checkableImageButton.setClickable(hasOnClickListeners);
        checkableImageButton.setPressable(hasOnClickListeners);
        checkableImageButton.setLongClickable(z2);
        checkableImageButton.setImportantForAccessibility(z3 ? 1 : 2);
    }

    public static void Y(Drawable drawable, int i) {
        D.a.g(drawable, i);
    }

    public static final void Z(Object obj) {
        if (obj instanceof R0.d) {
            throw ((R0.d) obj).f775a;
        }
    }

    public static void e(TextInputLayout textInputLayout, CheckableImageButton checkableImageButton, ColorStateList colorStateList, PorterDuff.Mode mode) {
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

    public static B1.e f() {
        B1.e eVar = B1.e.f64l;
        d1.d.b(eVar);
        B1.e eVar2 = eVar.f66f;
        if (eVar2 == null) {
            long nanoTime = System.nanoTime();
            B1.e.i.await(B1.e.f62j, TimeUnit.MILLISECONDS);
            B1.e eVar3 = B1.e.f64l;
            d1.d.b(eVar3);
            if (eVar3.f66f != null || System.nanoTime() - nanoTime < B1.e.f63k) {
                return null;
            }
            return B1.e.f64l;
        }
        long nanoTime2 = eVar2.f67g - System.nanoTime();
        if (nanoTime2 > 0) {
            B1.e.i.await(nanoTime2, TimeUnit.NANOSECONDS);
            return null;
        }
        B1.e eVar4 = B1.e.f64l;
        d1.d.b(eVar4);
        eVar4.f66f = eVar2.f66f;
        eVar2.f66f = null;
        return eVar2;
    }

    public static void g(long j2, B1.f fVar, int i, ArrayList arrayList, int i2, int i3, ArrayList arrayList2) {
        int i4;
        int i5;
        int i6;
        int i7;
        B1.f fVar2;
        int i8 = i;
        if (i2 >= i3) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        for (int i9 = i2; i9 < i3; i9++) {
            if (((B1.i) arrayList.get(i9)).a() < i8) {
                throw new IllegalArgumentException("Failed requirement.");
            }
        }
        B1.i iVar = (B1.i) arrayList.get(i2);
        B1.i iVar2 = (B1.i) arrayList.get(i3 - 1);
        int i10 = -1;
        if (i8 == iVar.a()) {
            int intValue = ((Number) arrayList2.get(i2)).intValue();
            int i11 = i2 + 1;
            B1.i iVar3 = (B1.i) arrayList.get(i11);
            i4 = i11;
            i5 = intValue;
            iVar = iVar3;
        } else {
            i4 = i2;
            i5 = -1;
        }
        if (iVar.d(i8) == iVar2.d(i8)) {
            int min = Math.min(iVar.a(), iVar2.a());
            int i12 = 0;
            for (int i13 = i8; i13 < min && iVar.d(i13) == iVar2.d(i13); i13++) {
                i12++;
            }
            long j3 = 4;
            long j4 = (fVar.f69b / j3) + j2 + 2 + i12 + 1;
            fVar.w(-i12);
            fVar.w(i5);
            int i14 = i12 + i8;
            while (i8 < i14) {
                fVar.w(iVar.d(i8) & 255);
                i8++;
            }
            if (i4 + 1 == i3) {
                if (i14 != ((B1.i) arrayList.get(i4)).a()) {
                    throw new IllegalStateException("Check failed.");
                }
                fVar.w(((Number) arrayList2.get(i4)).intValue());
                return;
            } else {
                B1.f fVar3 = new B1.f();
                fVar.w(((int) ((fVar3.f69b / j3) + j4)) * (-1));
                g(j4, fVar3, i14, arrayList, i4, i3, arrayList2);
                fVar.t(fVar3);
                return;
            }
        }
        int i15 = 1;
        for (int i16 = i4 + 1; i16 < i3; i16++) {
            if (((B1.i) arrayList.get(i16 - 1)).d(i8) != ((B1.i) arrayList.get(i16)).d(i8)) {
                i15++;
            }
        }
        long j5 = 4;
        long j6 = (fVar.f69b / j5) + j2 + 2 + (i15 * 2);
        fVar.w(i15);
        fVar.w(i5);
        for (int i17 = i4; i17 < i3; i17++) {
            int d2 = ((B1.i) arrayList.get(i17)).d(i8);
            if (i17 == i4 || d2 != ((B1.i) arrayList.get(i17 - 1)).d(i8)) {
                fVar.w(d2 & 255);
            }
        }
        B1.f fVar4 = new B1.f();
        int i18 = i4;
        while (i18 < i3) {
            byte d3 = ((B1.i) arrayList.get(i18)).d(i8);
            int i19 = i18 + 1;
            int i20 = i19;
            while (true) {
                if (i20 >= i3) {
                    i6 = i3;
                    break;
                } else {
                    if (d3 != ((B1.i) arrayList.get(i20)).d(i8)) {
                        i6 = i20;
                        break;
                    }
                    i20++;
                }
            }
            if (i19 == i6 && i8 + 1 == ((B1.i) arrayList.get(i18)).a()) {
                fVar.w(((Number) arrayList2.get(i18)).intValue());
                i7 = i6;
                fVar2 = fVar4;
            } else {
                fVar.w(((int) ((fVar4.f69b / j5) + j6)) * i10);
                i7 = i6;
                fVar2 = fVar4;
                g(j6, fVar4, i8 + 1, arrayList, i18, i6, arrayList2);
            }
            fVar4 = fVar2;
            i18 = i7;
            i10 = -1;
        }
        fVar.t(fVar4);
    }

    public static final void h(View view) {
        d1.d.e(view, "<this>");
        j1.e eVar = new j1.e();
        Y y2 = new Y(view, eVar);
        y2.d = eVar;
        eVar.d = y2;
        while (eVar.hasNext()) {
            View view2 = (View) eVar.next();
            R.a aVar = (R.a) view2.getTag(R.id.pooling_container_listener_holder_tag);
            if (aVar == null) {
                aVar = new R.a();
                view2.setTag(R.id.pooling_container_listener_holder_tag, aVar);
            }
            ArrayList arrayList = aVar.f772a;
            int x02 = S0.h.x0(arrayList);
            if (-1 < x02) {
                arrayList.get(x02).getClass();
                throw new ClassCastException();
            }
        }
    }

    public static int i(Context context, String str) {
        int c2;
        int myPid = Process.myPid();
        int myUid = Process.myUid();
        String packageName = context.getPackageName();
        if (context.checkPermission(str, myPid, myUid) == -1) {
            return -1;
        }
        String d2 = AbstractC0320d.d(str);
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
                c2 = AbstractC0320d.c((AppOpsManager) AbstractC0320d.a(context, AppOpsManager.class), d2, packageName);
            } else if (Build.VERSION.SDK_INT >= 29) {
                AppOpsManager c3 = z.e.c(context);
                c2 = z.e.a(c3, d2, Binder.getCallingUid(), packageName);
                if (c2 == 0) {
                    c2 = z.e.a(c3, d2, myUid, z.e.b(context));
                }
            } else {
                c2 = AbstractC0320d.c((AppOpsManager) AbstractC0320d.a(context, AppOpsManager.class), d2, packageName);
            }
            if (c2 != 0) {
                return -2;
            }
        }
        return 0;
    }

    public static int j(int i, int i2, int i3) {
        return i < i2 ? i2 : i > i3 ? i3 : i;
    }

    public static final void m(B1.h hVar, Throwable th) {
        if (hVar != null) {
            if (th == null) {
                hVar.close();
                return;
            }
            try {
                hVar.close();
            } catch (Throwable th2) {
                d.d(th, th2);
            }
        }
    }

    public static ImageView.ScaleType n(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 5 ? i != 6 ? ImageView.ScaleType.CENTER : ImageView.ScaleType.CENTER_INSIDE : ImageView.ScaleType.CENTER_CROP : ImageView.ScaleType.FIT_END : ImageView.ScaleType.FIT_CENTER : ImageView.ScaleType.FIT_START : ImageView.ScaleType.FIT_XY;
    }

    public static boolean r(View view, KeyEvent keyEvent) {
        ArrayList arrayList;
        int size;
        int indexOfKey;
        WeakHashMap weakHashMap = T.f423a;
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        ArrayList arrayList2 = S.d;
        S s2 = (S) view.getTag(R.id.tag_unhandled_key_event_manager);
        WeakReference weakReference = null;
        if (s2 == null) {
            s2 = new S();
            s2.f420a = null;
            s2.f421b = null;
            s2.f422c = null;
            view.setTag(R.id.tag_unhandled_key_event_manager, s2);
        }
        WeakReference weakReference2 = s2.f422c;
        if (weakReference2 != null && weakReference2.get() == keyEvent) {
            return false;
        }
        s2.f422c = new WeakReference(keyEvent);
        if (s2.f421b == null) {
            s2.f421b = new SparseArray();
        }
        SparseArray sparseArray = s2.f421b;
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
    public static boolean s(InterfaceC0013k interfaceC0013k, View view, Window.Callback callback, KeyEvent keyEvent) {
        DialogInterface.OnKeyListener onKeyListener;
        Window window;
        boolean z2 = false;
        if (interfaceC0013k == null) {
            return false;
        }
        if (Build.VERSION.SDK_INT >= 28) {
            return interfaceC0013k.e(keyEvent);
        }
        if (callback instanceof Activity) {
            Activity activity = (Activity) callback;
            activity.onUserInteraction();
            Window window2 = activity.getWindow();
            if (window2.hasFeature(8)) {
                ActionBar actionBar = activity.getActionBar();
                if (keyEvent.getKeyCode() == 82 && actionBar != null) {
                    if (!f4186a) {
                        try {
                            f4187b = actionBar.getClass().getMethod("onMenuKeyEvent", KeyEvent.class);
                        } catch (NoSuchMethodException unused) {
                        }
                        f4186a = true;
                    }
                    Method method = f4187b;
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
            if (T.b(decorView, keyEvent)) {
                return true;
            }
            return keyEvent.dispatch(activity, decorView != null ? decorView.getKeyDispatcherState() : null, activity);
        }
        if (!(callback instanceof Dialog)) {
            return (view != null && T.b(view, keyEvent)) || interfaceC0013k.e(keyEvent);
        }
        Dialog dialog = (Dialog) callback;
        if (!f4188c) {
            try {
                Field declaredField = Dialog.class.getDeclaredField("mOnKeyListener");
                d = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused3) {
            }
            f4188c = true;
        }
        Field field = d;
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
            if (T.b(decorView2, keyEvent)) {
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

    public static ColorStateList u(Context context, C0014l c0014l, int i) {
        int resourceId;
        ColorStateList A2;
        TypedArray typedArray = (TypedArray) c0014l.f475b;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (A2 = d.A(context, resourceId)) == null) ? c0014l.b(i) : A2;
    }

    public static ColorStateList v(Context context, TypedArray typedArray, int i) {
        int resourceId;
        ColorStateList A2;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (A2 = d.A(context, resourceId)) == null) ? typedArray.getColorStateList(i) : A2;
    }

    public static ColorStateList w(Drawable drawable) {
        ColorStateList colorStateList;
        if (drawable instanceof ColorDrawable) {
            return ColorStateList.valueOf(((ColorDrawable) drawable).getColor());
        }
        if (Build.VERSION.SDK_INT < 29 || !B0.a.q(drawable)) {
            return null;
        }
        colorStateList = B0.a.e(drawable).getColorStateList();
        return colorStateList;
    }

    public static float y(EdgeEffect edgeEffect) {
        return Build.VERSION.SDK_INT >= 31 ? Q.e.b(edgeEffect) : RecyclerView.f1530C0;
    }

    public static Drawable z(Context context, int i) {
        return M0.b().c(context, i);
    }

    public int C(View view) {
        return 0;
    }

    public int D() {
        return 0;
    }

    public abstract void E();

    public abstract void H(Throwable th);

    public abstract View I(int i);

    public abstract boolean J();

    public abstract void K(u uVar);

    public void M(View view, int i) {
    }

    public abstract void N(int i);

    public abstract void O(View view, int i, int i2);

    public abstract void P(View view, float f2, float f3);

    public abstract Object Q(Intent intent, int i);

    public abstract void T(boolean z2);

    public abstract void U(boolean z2);

    public abstract void X();

    public abstract boolean a0(View view, int i);

    public abstract int k(View view, int i);

    public abstract int l(View view, int i);

    public abstract Typeface o(Context context, B.g gVar, Resources resources, int i);

    public abstract Typeface p(Context context, H.k[] kVarArr, int i);

    public Typeface q(Context context, Resources resources, int i, String str, int i2) {
        File N2 = d.N(context);
        if (N2 == null) {
            return null;
        }
        try {
            if (d.u(N2, resources, i)) {
                return Typeface.createFromFile(N2.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            N2.delete();
        }
    }

    public H.k t(int i, H.k[] kVarArr) {
        new J0.e(2);
        int i2 = (i & 1) == 0 ? 400 : 700;
        boolean z2 = (i & 2) != 0;
        H.k kVar = null;
        int i3 = Integer.MAX_VALUE;
        for (H.k kVar2 : kVarArr) {
            int abs = (Math.abs(kVar2.f279c - i2) * 2) + (kVar2.d == z2 ? 0 : 1);
            if (kVar == null || i3 > abs) {
                kVar = kVar2;
                i3 = abs;
            }
        }
        return kVar;
    }

    public abstract void x(J0.u uVar, float f2, float f3);
}
