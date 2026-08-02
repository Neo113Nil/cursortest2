package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.Outline;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.StrictMode;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewParent;
import android.widget.EditText;
import android.widget.ImageView;
import com.google.android.apps.authenticator2.R;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.textfield.TextInputLayout;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class fhq {
    public fhq(TabLayout tabLayout) {
        new WeakReference(tabLayout);
    }

    private static int A(Context context, TypedValue typedValue) {
        return typedValue.resourceId != 0 ? context.getColor(typedValue.resourceId) : typedValue.data;
    }

    private static int[] B(TextInputLayout textInputLayout, CheckableImageButton checkableImageButton) {
        int[] drawableState = textInputLayout.getDrawableState();
        int[] drawableState2 = checkableImageButton.getDrawableState();
        int length = drawableState.length;
        int length2 = drawableState2.length;
        int[] copyOf = Arrays.copyOf(drawableState, length + length2);
        System.arraycopy(drawableState2, 0, copyOf, length, length2);
        return copyOf;
    }

    private static void C(CheckableImageButton checkableImageButton) {
        boolean hasOnClickListeners = checkableImageButton.hasOnClickListeners();
        checkableImageButton.setFocusable(hasOnClickListeners);
        checkableImageButton.setClickable(hasOnClickListeners);
        checkableImageButton.c = hasOnClickListeners;
        checkableImageButton.setLongClickable(false);
        checkableImageButton.setImportantForAccessibility(true != hasOnClickListeners ? 2 : 1);
    }

    static void a(Outline outline, Path path) {
        outline.setConvexPath(path);
    }

    public static int b(int i, int i2) {
        return va.c(i, (Color.alpha(i) * i2) / 255);
    }

    public static int c(View view, int i) {
        return A(view.getContext(), fny.l(view.getContext(), i, view.getClass().getCanonicalName()));
    }

    public static int d(Context context, int i, int i2) {
        Integer f = f(context, i);
        return f != null ? f.intValue() : i2;
    }

    public static int e(int i, int i2, float f) {
        return va.b(va.c(i2, Math.round(Color.alpha(i2) * f)), i);
    }

    public static Integer f(Context context, int i) {
        TypedValue j = fny.j(context, i);
        if (j != null) {
            return Integer.valueOf(A(context, j));
        }
        return null;
    }

    public static int g(Context context, String str) {
        return A(context, fny.l(context, R.attr.colorSurface, str));
    }

    public static void h(AnimatorSet animatorSet, List list) {
        int size = list.size();
        long j = 0;
        for (int i = 0; i < size; i++) {
            Animator animator = (Animator) list.get(i);
            j = Math.max(j, animator.getStartDelay() + animator.getDuration());
        }
        ValueAnimator ofInt = ValueAnimator.ofInt(0, 0);
        ofInt.setDuration(j);
        list.add(0, ofInt);
        animatorSet.playTogether(list);
    }

    public static void i(StrictMode.ThreadPolicy threadPolicy) {
        StrictMode.setThreadPolicy(threadPolicy);
        if (Looper.myLooper() == Looper.getMainLooper()) {
            new Handler(Looper.myLooper()).postAtFrontOfQueue(new evp(threadPolicy, 10));
        }
    }

    public static by j(jpu jpuVar) {
        int d = jpuVar.d() - 1;
        if (d == 0) {
            return ((bg) jpuVar.a()).a();
        }
        if (d == 1) {
            return jpuVar.e().a();
        }
        by F = jpuVar.b().F();
        F.getClass();
        return F;
    }

    public static boolean l(Intent intent) {
        intent.getClass();
        return intent.hasExtra("tiktok_account_operation_contexts");
    }

    public static ImageView.ScaleType m(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 5 ? i != 6 ? ImageView.ScaleType.CENTER : ImageView.ScaleType.CENTER_INSIDE : ImageView.ScaleType.CENTER_CROP : ImageView.ScaleType.FIT_END : ImageView.ScaleType.FIT_CENTER : ImageView.ScaleType.FIT_START : ImageView.ScaleType.FIT_XY;
    }

    public static void n(TextInputLayout textInputLayout, CheckableImageButton checkableImageButton, ColorStateList colorStateList, PorterDuff.Mode mode) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (drawable != null) {
            drawable = drawable.mutate();
            if (colorStateList == null || !colorStateList.isStateful()) {
                drawable.setTintList(colorStateList);
            } else {
                drawable.setTintList(ColorStateList.valueOf(colorStateList.getColorForState(B(textInputLayout, checkableImageButton), colorStateList.getDefaultColor())));
            }
            if (mode != null) {
                drawable.setTintMode(mode);
            }
        }
        if (checkableImageButton.getDrawable() != drawable) {
            checkableImageButton.setImageDrawable(drawable);
        }
    }

    public static void o(TextInputLayout textInputLayout, CheckableImageButton checkableImageButton, ColorStateList colorStateList) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (checkableImageButton.getDrawable() == null || colorStateList == null || !colorStateList.isStateful()) {
            return;
        }
        int colorForState = colorStateList.getColorForState(B(textInputLayout, checkableImageButton), colorStateList.getDefaultColor());
        Drawable mutate = drawable.mutate();
        mutate.setTintList(ColorStateList.valueOf(colorForState));
        checkableImageButton.setImageDrawable(mutate);
    }

    public static void p(CheckableImageButton checkableImageButton, int i) {
        checkableImageButton.setMinimumWidth(i);
        checkableImageButton.setMinimumHeight(i);
    }

    public static void q(CheckableImageButton checkableImageButton, View.OnClickListener onClickListener) {
        checkableImageButton.setOnClickListener(onClickListener);
        C(checkableImageButton);
    }

    public static void r(CheckableImageButton checkableImageButton) {
        checkableImageButton.setOnLongClickListener(null);
        C(checkableImageButton);
    }

    public static void s(CheckableImageButton checkableImageButton, CharSequence charSequence) {
        if (true != checkableImageButton.isFocusable()) {
            charSequence = null;
        }
        checkableImageButton.setTooltipText(charSequence);
    }

    public static boolean t(EditText editText) {
        return editText.getInputType() != 0;
    }

    public static RectF u(TabLayout tabLayout, View view) {
        if (view == null) {
            return new RectF();
        }
        if (tabLayout.w || !(view instanceof fpy)) {
            return new RectF(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
        fpy fpyVar = (fpy) view;
        View[] viewArr = {fpyVar.a, fpyVar.b, null};
        int i = 0;
        int i2 = 0;
        boolean z = false;
        for (int i3 = 0; i3 < 3; i3++) {
            View view2 = viewArr[i3];
            if (view2 != null && view2.getVisibility() == 0) {
                i2 = z ? Math.min(i2, view2.getLeft()) : view2.getLeft();
                i = z ? Math.max(i, view2.getRight()) : view2.getRight();
                z = true;
            }
        }
        int i4 = i - i2;
        View[] viewArr2 = {fpyVar.a, fpyVar.b, null};
        int i5 = 0;
        int i6 = 0;
        boolean z2 = false;
        for (int i7 = 0; i7 < 3; i7++) {
            View view3 = viewArr2[i7];
            if (view3 != null && view3.getVisibility() == 0) {
                i6 = z2 ? Math.min(i6, view3.getTop()) : view3.getTop();
                i5 = z2 ? Math.max(i5, view3.getBottom()) : view3.getBottom();
                z2 = true;
            }
        }
        int i8 = i5 - i6;
        int c = (int) fik.c(fpyVar.getContext(), 24);
        if (i4 < c) {
            i4 = c;
        }
        int left = (fpyVar.getLeft() + fpyVar.getRight()) / 2;
        int top = (fpyVar.getTop() + fpyVar.getBottom()) / 2;
        int i9 = i4 / 2;
        return new RectF(left - i9, top - (i8 / 2), left + i9, (left / 2) + top);
    }

    public static void w(View view, float f) {
        Drawable background = view.getBackground();
        if (background instanceof fob) {
            ((fob) background).L(f);
        }
    }

    public static void x(View view) {
        Drawable background = view.getBackground();
        if (background instanceof fob) {
            y(view, (fob) background);
        }
    }

    public static void y(View view, fob fobVar) {
        fhs fhsVar = fobVar.p.b;
        if (fhsVar == null || !fhsVar.a) {
            return;
        }
        float f = 0.0f;
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            f += ((View) parent).getElevation();
        }
        fobVar.O(f);
    }

    public static fny z(int i) {
        return i != 1 ? new foe() : new fnx();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void k(by byVar) {
        try {
            byVar.ag(1);
            List<bd> h = byVar.h();
            h.getClass();
            if (h.isEmpty()) {
                return;
            }
            ae aeVar = new ae(byVar);
            for (bd bdVar : h) {
                if (bdVar instanceof jrq) {
                    Object C = ((jrq) bdVar).C();
                    C.getClass();
                    if (C instanceof ftq) {
                        aeVar.i(bdVar);
                    }
                }
                by F = bdVar.F();
                F.getClass();
                F.Z();
                k(F);
            }
            if (aeVar.g()) {
                return;
            }
            aeVar.n();
            aeVar.c();
        } catch (IllegalStateException e) {
            StringWriter stringWriter = new StringWriter();
            byVar.D("fm_state", null, new PrintWriter(stringWriter), new String[0]);
            ((hkf) ((hkf) ftr.a.f()).h(e).i("com/google/apps/tiktok/account/api/controller/ActivityAccountState$Companion", "clearFragments", 301, "ActivityAccountState.kt")).u("popBackStackImmediate failure, fragment state %s", new igk(igj.a, stringWriter.toString()));
            throw e;
        }
    }

    public void v(TabLayout tabLayout, View view, View view2, float f, Drawable drawable) {
        RectF u = u(tabLayout, view);
        RectF u2 = u(tabLayout, view2);
        drawable.setBounds(fes.b((int) u.left, (int) u2.left, f), drawable.getBounds().top, fes.b((int) u.right, (int) u2.right, f), drawable.getBounds().bottom);
    }

    public fhq(byte[] bArr) {
    }
}
