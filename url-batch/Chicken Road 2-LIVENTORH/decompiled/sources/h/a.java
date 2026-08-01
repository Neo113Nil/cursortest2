package h;

import a.y;
import android.app.ActionBar;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.icu.text.DecimalFormatSymbols;
import android.os.Build;
import android.os.Trace;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.PasswordTransformationMethod;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EdgeEffect;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.emoji2.text.t;
import androidx.fragment.app.w0;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import com.oriondriftchasers.arordrft.R;
import j1.x;
import j1.z;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.WeakHashMap;
import l.c1;
import l.e3;
import l.g3;
import l.m2;
import l0.c;
import l2.e;
import l2.h;
import l2.j;
import l2.l;
import n0.i;
import n0.k0;
import n0.l0;
import n0.q0;
import n0.r0;
import r0.b;
import s.f;
import s.g;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public abstract class a implements q0 {

    /* renamed from: a, reason: collision with root package name */
    public static long f1792a = 0;

    /* renamed from: b, reason: collision with root package name */
    public static Method f1793b = null;

    /* renamed from: c, reason: collision with root package name */
    public static boolean f1794c = true;
    public static boolean d = true;

    /* renamed from: e, reason: collision with root package name */
    public static Field f1795e = null;

    /* renamed from: f, reason: collision with root package name */
    public static boolean f1796f = false;

    /* renamed from: g, reason: collision with root package name */
    public static boolean f1797g = false;

    /* renamed from: h, reason: collision with root package name */
    public static Method f1798h = null;
    public static boolean i = false;

    /* renamed from: j, reason: collision with root package name */
    public static Field f1799j;

    public static c H(c1 c1Var) {
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 28) {
            return new c(g0.a.h(c1Var));
        }
        TextPaint textPaint = new TextPaint(c1Var.getPaint());
        TextDirectionHeuristic textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR;
        int breakStrategy = c1Var.getBreakStrategy();
        int hyphenationFrequency = c1Var.getHyphenationFrequency();
        if (c1Var.getTransformationMethod() instanceof PasswordTransformationMethod) {
            textDirectionHeuristic = TextDirectionHeuristics.LTR;
        } else {
            if (i4 < 28 || (c1Var.getInputType() & 15) != 3) {
                boolean z3 = c1Var.getLayoutDirection() == 1;
                switch (c1Var.getTextDirection()) {
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
                        if (z3) {
                            textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_RTL;
                            break;
                        }
                        break;
                }
            } else {
                byte directionality = Character.getDirectionality(g0.a.a(DecimalFormatSymbols.getInstance(c1Var.getTextLocale()))[0].codePointAt(0));
                textDirectionHeuristic = (directionality == 1 || directionality == 2) ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR;
            }
        }
        return new c(textPaint, textDirectionHeuristic, breakStrategy, hyphenationFrequency);
    }

    public static int J(Context context, int i4) {
        if (i4 == 0) {
            return 0;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i4, n1.a.f2830w);
        TypedValue typedValue = new TypedValue();
        boolean value = obtainStyledAttributes.getValue(4, typedValue);
        if (!value) {
            value = obtainStyledAttributes.getValue(2, typedValue);
        }
        obtainStyledAttributes.recycle();
        if (value) {
            return typedValue.getComplexUnit() == 2 ? Math.round(TypedValue.complexToFloat(typedValue.data) * context.getResources().getDisplayMetrics().density) : TypedValue.complexToDimensionPixelSize(typedValue.data, context.getResources().getDisplayMetrics());
        }
        return 0;
    }

    public static int M(int i4) {
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
        throw new IllegalArgumentException(w0.d("type needs to be >= FIRST and <= LAST, type=", i4));
    }

    public static boolean N() {
        if (Build.VERSION.SDK_INT >= 29) {
            return i1.a.a();
        }
        try {
            if (f1793b == null) {
                f1792a = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                f1793b = Trace.class.getMethod("isTagEnabled", Long.TYPE);
            }
            return ((Boolean) f1793b.invoke(null, Long.valueOf(f1792a))).booleanValue();
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

    public static boolean P(Context context) {
        return context.getResources().getConfiguration().fontScale >= 1.3f;
    }

    public static Typeface S(Configuration configuration, Typeface typeface) {
        int i4;
        int i5;
        int weight;
        int i6;
        Typeface create;
        if (Build.VERSION.SDK_INT < 31) {
            return null;
        }
        i4 = configuration.fontWeightAdjustment;
        if (i4 == Integer.MAX_VALUE) {
            return null;
        }
        i5 = configuration.fontWeightAdjustment;
        if (i5 == 0 || typeface == null) {
            return null;
        }
        weight = typeface.getWeight();
        i6 = configuration.fontWeightAdjustment;
        create = Typeface.create(typeface, n(i6 + weight, 1, 1000), typeface.isItalic());
        return create;
    }

    public static void T(EditorInfo editorInfo, InputConnection inputConnection, TextView textView) {
        if (inputConnection == null || editorInfo.hintText != null) {
            return;
        }
        for (ViewParent parent = textView.getParent(); parent instanceof View; parent = parent.getParent()) {
        }
    }

    public static float W(EdgeEffect edgeEffect, float f2, float f4) {
        if (Build.VERSION.SDK_INT >= 31) {
            return r0.c.c(edgeEffect, f2, f4);
        }
        b.a(edgeEffect, f2, f4);
        return f2;
    }

    public static void Z(TextInputLayout textInputLayout, CheckableImageButton checkableImageButton, ColorStateList colorStateList) {
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
        mutate.setTintList(ColorStateList.valueOf(colorForState));
        checkableImageButton.setImageDrawable(mutate);
    }

    public static TypedValue a0(Context context, int i4) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(i4, typedValue, true)) {
            return typedValue;
        }
        return null;
    }

    public static boolean b0(Context context, int i4, boolean z3) {
        TypedValue a02 = a0(context, i4);
        return (a02 == null || a02.type != 18) ? z3 : a02.data != 0;
    }

    public static TypedValue c0(Context context, int i4, String str) {
        TypedValue a02 = a0(context, i4);
        if (a02 != null) {
            return a02;
        }
        throw new IllegalArgumentException(String.format("%1$s requires a value for the %2$s attribute to be set in your app theme. You can either set the attribute in your theme or update your theme to inherit from Theme.MaterialComponents (or a descendant).", str, context.getResources().getResourceName(i4)));
    }

    public static void d(TextInputLayout textInputLayout, CheckableImageButton checkableImageButton, ColorStateList colorStateList, PorterDuff.Mode mode) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (drawable != null) {
            drawable = drawable.mutate();
            if (colorStateList == null || !colorStateList.isStateful()) {
                drawable.setTintList(colorStateList);
            } else {
                int[] drawableState = textInputLayout.getDrawableState();
                int[] drawableState2 = checkableImageButton.getDrawableState();
                int length = drawableState.length;
                int[] copyOf = Arrays.copyOf(drawableState, drawableState.length + drawableState2.length);
                System.arraycopy(drawableState2, 0, copyOf, length, drawableState2.length);
                drawable.setTintList(ColorStateList.valueOf(colorStateList.getColorForState(copyOf, colorStateList.getDefaultColor())));
            }
            if (mode != null) {
                drawable.setTintMode(mode);
            }
        }
        if (checkableImageButton.getDrawable() != drawable) {
            checkableImageButton.setImageDrawable(drawable);
        }
    }

    public static void e(String str) {
        if (str.length() > 127) {
            str = str.substring(0, 127);
        }
        Trace.beginSection(str);
    }

    public static void f0(Window window, boolean z3) {
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 35) {
            r0.c(window, z3);
        } else {
            if (i4 >= 30) {
                r0.b(window, z3);
                return;
            }
            View decorView = window.getDecorView();
            int systemUiVisibility = decorView.getSystemUiVisibility();
            decorView.setSystemUiVisibility(z3 ? systemUiVisibility & (-1793) : systemUiVisibility | 1792);
        }
    }

    public static void g0(TextView textView, int i4) {
        l(i4);
        if (Build.VERSION.SDK_INT >= 28) {
            g0.a.i(textView, i4);
            return;
        }
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i5 = textView.getIncludeFontPadding() ? fontMetricsInt.top : fontMetricsInt.ascent;
        if (i4 > Math.abs(i5)) {
            textView.setPadding(textView.getPaddingLeft(), i4 + i5, textView.getPaddingRight(), textView.getPaddingBottom());
        }
    }

    public static void h0(CheckableImageButton checkableImageButton, View.OnLongClickListener onLongClickListener) {
        boolean hasOnClickListeners = checkableImageButton.hasOnClickListeners();
        boolean z3 = onLongClickListener != null;
        boolean z4 = hasOnClickListeners || z3;
        checkableImageButton.setFocusable(z4);
        checkableImageButton.setClickable(hasOnClickListeners);
        checkableImageButton.setPressable(hasOnClickListeners);
        checkableImageButton.setLongClickable(z3);
        checkableImageButton.setImportantForAccessibility(z4 ? 1 : 2);
    }

    public static void i0(TextView textView, int i4) {
        l(i4);
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i5 = textView.getIncludeFontPadding() ? fontMetricsInt.bottom : fontMetricsInt.descent;
        if (i4 > Math.abs(i5)) {
            textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), i4 - i5);
        }
    }

    public static void j0(TextView textView, int i4) {
        l(i4);
        if (i4 != textView.getPaint().getFontMetricsInt(null)) {
            textView.setLineSpacing(i4 - r0, 1.0f);
        }
    }

    public static void k(boolean z3, String str) {
        if (!z3) {
            throw new IllegalArgumentException(str);
        }
    }

    public static void k0(View view, j jVar) {
        d2.a aVar = jVar.f2598g.f2583c;
        if (aVar == null || !aVar.f1122a) {
            return;
        }
        float f2 = 0.0f;
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            f2 += ((View) parent).getElevation();
        }
        h hVar = jVar.f2598g;
        if (hVar.f2591m != f2) {
            hVar.f2591m = f2;
            jVar.x();
        }
    }

    public static void l(int i4) {
        if (i4 < 0) {
            throw new IllegalArgumentException();
        }
    }

    public static void l0(View view, CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            e3.a(view, charSequence);
            return;
        }
        g3 g3Var = g3.f2309p;
        if (g3Var != null && g3Var.f2311f == view) {
            g3.b(null);
        }
        if (!TextUtils.isEmpty(charSequence)) {
            new g3(view, charSequence);
            return;
        }
        g3 g3Var2 = g3.f2310q;
        if (g3Var2 != null && g3Var2.f2311f == view) {
            g3Var2.a();
        }
        view.setOnLongClickListener(null);
        view.setLongClickable(false);
        view.setOnHoverListener(null);
    }

    public static void m(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static int n(int i4, int i5, int i6) {
        return i4 < i5 ? i5 : i4 > i6 ? i6 : i4;
    }

    public static ImageView.ScaleType o(int i4) {
        return i4 != 0 ? i4 != 1 ? i4 != 2 ? i4 != 3 ? i4 != 5 ? i4 != 6 ? ImageView.ScaleType.CENTER : ImageView.ScaleType.CENTER_INSIDE : ImageView.ScaleType.CENTER_CROP : ImageView.ScaleType.FIT_END : ImageView.ScaleType.FIT_CENTER : ImageView.ScaleType.FIT_START : ImageView.ScaleType.FIT_XY;
    }

    public static a p(int i4) {
        return i4 != 0 ? i4 != 1 ? new l() : new e() : new l();
    }

    public static void p0(ViewGroup viewGroup, boolean z3) {
        if (Build.VERSION.SDK_INT >= 29) {
            x.b(viewGroup, z3);
        } else if (f1794c) {
            try {
                x.b(viewGroup, z3);
            } catch (NoSuchMethodError unused) {
                f1794c = false;
            }
        }
    }

    public static boolean q(View view, KeyEvent keyEvent) {
        ArrayList arrayList;
        int size;
        int indexOfKey;
        WeakHashMap weakHashMap = l0.f2757a;
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        ArrayList arrayList2 = k0.d;
        k0 k0Var = (k0) view.getTag(R.id.tag_unhandled_key_event_manager);
        WeakReference weakReference = null;
        if (k0Var == null) {
            k0Var = new k0();
            k0Var.f2753a = null;
            k0Var.f2754b = null;
            k0Var.f2755c = null;
            view.setTag(R.id.tag_unhandled_key_event_manager, k0Var);
        }
        WeakReference weakReference2 = k0Var.f2755c;
        if (weakReference2 != null && weakReference2.get() == keyEvent) {
            return false;
        }
        k0Var.f2755c = new WeakReference(keyEvent);
        if (k0Var.f2754b == null) {
            k0Var.f2754b = new SparseArray();
        }
        SparseArray sparseArray = k0Var.f2754b;
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

    public static ActionMode.Callback q0(ActionMode.Callback callback) {
        return (!(callback instanceof r0.h) || Build.VERSION.SDK_INT < 26) ? callback : ((r0.h) callback).f3141a;
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:63:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean r(i iVar, View view, Window.Callback callback, KeyEvent keyEvent) {
        DialogInterface.OnKeyListener onKeyListener;
        Window window;
        boolean z3 = false;
        if (iVar != null) {
            if (Build.VERSION.SDK_INT >= 28) {
                return iVar.c(keyEvent);
            }
            if (callback instanceof Activity) {
                Activity activity = (Activity) callback;
                activity.onUserInteraction();
                Window window2 = activity.getWindow();
                if (window2.hasFeature(8)) {
                    ActionBar actionBar = activity.getActionBar();
                    if (keyEvent.getKeyCode() == 82 && actionBar != null) {
                        if (!f1797g) {
                            try {
                                f1798h = actionBar.getClass().getMethod("onMenuKeyEvent", KeyEvent.class);
                            } catch (NoSuchMethodException unused) {
                            }
                            f1797g = true;
                        }
                        Method method = f1798h;
                        if (method != null) {
                            try {
                                Object invoke = method.invoke(actionBar, keyEvent);
                                if (invoke != null) {
                                    z3 = ((Boolean) invoke).booleanValue();
                                }
                            } catch (IllegalAccessException | InvocationTargetException unused2) {
                            }
                        }
                        if (z3) {
                            return true;
                        }
                    }
                }
                if (window2.superDispatchKeyEvent(keyEvent)) {
                    return true;
                }
                View decorView = window2.getDecorView();
                if (l0.c(decorView, keyEvent)) {
                    return true;
                }
                return keyEvent.dispatch(activity, decorView != null ? decorView.getKeyDispatcherState() : null, activity);
            }
            if (callback instanceof Dialog) {
                Dialog dialog = (Dialog) callback;
                if (!i) {
                    try {
                        Field declaredField = Dialog.class.getDeclaredField("mOnKeyListener");
                        f1799j = declaredField;
                        declaredField.setAccessible(true);
                    } catch (NoSuchFieldException unused3) {
                    }
                    i = true;
                }
                Field field = f1799j;
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
                    if (l0.c(decorView2, keyEvent)) {
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
            } else if ((view != null && l0.c(view, keyEvent)) || iVar.c(keyEvent)) {
                return true;
            }
        }
        return false;
    }

    public static View s(View view, int i4) {
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

    public static ActionMode.Callback s0(ActionMode.Callback callback, TextView textView) {
        int i4 = Build.VERSION.SDK_INT;
        return (i4 < 26 || i4 > 27 || (callback instanceof r0.h) || callback == null) ? callback : new r0.h(callback, textView);
    }

    public static ColorStateList t(Context context, TypedArray typedArray, int i4) {
        int resourceId;
        ColorStateList B;
        return (!typedArray.hasValue(i4) || (resourceId = typedArray.getResourceId(i4, 0)) == 0 || (B = y.B(context, resourceId)) == null) ? typedArray.getColorStateList(i4) : B;
    }

    public static ColorStateList u(Context context, t tVar, int i4) {
        int resourceId;
        ColorStateList B;
        TypedArray typedArray = (TypedArray) tVar.f356c;
        return (!typedArray.hasValue(i4) || (resourceId = typedArray.getResourceId(i4, 0)) == 0 || (B = y.B(context, resourceId)) == null) ? tVar.m(i4) : B;
    }

    public static float w(EdgeEffect edgeEffect) {
        if (Build.VERSION.SDK_INT >= 31) {
            return r0.c.b(edgeEffect);
        }
        return 0.0f;
    }

    public static Drawable x(Context context, int i4) {
        return m2.b().c(context, i4);
    }

    public static Drawable y(Context context, TypedArray typedArray, int i4) {
        int resourceId;
        Drawable x3;
        return (!typedArray.hasValue(i4) || (resourceId = typedArray.getResourceId(i4, 0)) == 0 || (x3 = x(context, resourceId)) == null) ? typedArray.getDrawable(i4) : x3;
    }

    public abstract int A();

    public abstract int B();

    public abstract int C();

    public abstract int D(View view);

    public abstract int E(CoordinatorLayout coordinatorLayout);

    public abstract int F();

    public abstract int G(View view, ViewGroup.MarginLayoutParams marginLayoutParams);

    public float I(View view) {
        if (d) {
            try {
                return z.a(view);
            } catch (NoSuchMethodError unused) {
                d = false;
            }
        }
        return view.getAlpha();
    }

    public abstract int K();

    public abstract ViewPropertyAnimator L(View view, int i4);

    public abstract boolean O(float f2);

    public abstract boolean Q(View view);

    public abstract boolean R(float f2, float f4);

    public abstract void U(int i4);

    public abstract void V(Typeface typeface, boolean z3);

    public abstract void X(f fVar, f fVar2);

    public abstract void Y(f fVar, Thread thread);

    public abstract void e0(boolean z3);

    public abstract int f(ViewGroup.MarginLayoutParams marginLayoutParams);

    public abstract float g(int i4);

    public abstract boolean h(g gVar, s.c cVar);

    public abstract boolean i(g gVar, Object obj, Object obj2);

    public abstract boolean j(g gVar, f fVar, f fVar2);

    public void m0(View view, float f2) {
        if (d) {
            try {
                z.b(view, f2);
                return;
            } catch (NoSuchMethodError unused) {
                d = false;
            }
        }
        view.setAlpha(f2);
    }

    public void n0(View view, int i4) {
        if (!f1796f) {
            try {
                Field declaredField = View.class.getDeclaredField("mViewFlags");
                f1795e = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
                Log.i("ViewUtilsApi19", "fetchViewFlagsField: ");
            }
            f1796f = true;
        }
        Field field = f1795e;
        if (field != null) {
            try {
                f1795e.setInt(view, i4 | (field.getInt(view) & (-13)));
            } catch (IllegalAccessException unused2) {
            }
        }
    }

    public abstract boolean o0(View view, float f2);

    public abstract void r0(ViewGroup.MarginLayoutParams marginLayoutParams, int i4, int i5);

    public abstract void v(l2.x xVar, float f2, float f4);

    public abstract int z();

    public void d0(boolean z3) {
    }

    @Override // n0.q0
    public void b() {
    }

    @Override // n0.q0
    public void c() {
    }
}
