package defpackage;

import android.animation.Animator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.AnimatedStateListDrawable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableWrapper;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.autofill.AutofillManager;
import android.widget.CompoundButton;
import com.google.android.apps.authenticator2.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class fgs extends hu {
    private static final int e = 2132019738;
    private static final int[] f = {R.attr.state_indeterminate};
    private static final int[] g = {R.attr.state_error};
    private static final int[][] h = {new int[]{android.R.attr.state_enabled, R.attr.state_error}, new int[]{android.R.attr.state_enabled, android.R.attr.state_checked}, new int[]{android.R.attr.state_enabled, -16842912}, new int[]{-16842910, android.R.attr.state_checked}, new int[]{-16842910, -16842912}};
    private static final int i = Resources.getSystem().getIdentifier("btn_check_material_anim", "drawable", "android");
    ColorStateList b;
    final ColorStateList c;
    public int[] d;
    private final LinkedHashSet j;
    private ColorStateList k;
    private boolean l;
    private final boolean m;
    private final boolean n;
    private final CharSequence o;
    private Drawable p;
    private Drawable q;
    private boolean r;
    private final PorterDuff.Mode s;
    private int t;
    private boolean u;
    private CharSequence v;
    private CompoundButton.OnCheckedChangeListener w;
    private final aqh x;
    private final aqc y;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public fgs(Context context, AttributeSet attributeSet) {
        super(frj.a(context, attributeSet, R.attr.checkboxStyle, r4), attributeSet, R.attr.checkboxStyle);
        ColorStateList r;
        int i2 = e;
        new LinkedHashSet();
        this.j = new LinkedHashSet();
        Context context2 = getContext();
        aqh aqhVar = new aqh(context2);
        Resources resources = context2.getResources();
        Resources.Theme theme = context2.getTheme();
        ThreadLocal threadLocal = uy.a;
        Drawable drawable = resources.getDrawable(R.drawable.mtrl_checkbox_button_checked_unchecked, theme);
        drawable.setCallback(aqhVar.d);
        new aqg(drawable.getConstantState());
        aqhVar.e = drawable;
        this.x = aqhVar;
        this.y = new fgp(this);
        Context context3 = getContext();
        ColorStateList colorStateList = this.b;
        this.b = colorStateList == null ? super.getButtonTintList() != null ? super.getButtonTintList() : null : colorStateList;
        hw hwVar = this.a;
        if (hwVar != null) {
            hwVar.b = true;
            hwVar.a();
        }
        byo c = fjw.c(context3, attributeSet, fgt.a, R.attr.checkboxStyle, i2, new int[0]);
        this.q = c.j(2);
        if (this.p != null && fny.m(context3, R.attr.isMaterial3Theme, false)) {
            int h2 = c.h(0, 0);
            int h3 = c.h(1, 0);
            if (h2 == i && h3 == 0) {
                super.setButtonDrawable((Drawable) null);
                this.p = e.f(context3, R.drawable.mtrl_checkbox_button);
                this.r = true;
                if (this.q == null) {
                    this.q = e.f(context3, R.drawable.mtrl_checkbox_button_icon);
                }
            }
        }
        this.c = fny.r(context3, c, 3);
        this.s = a.q(c.e(4, -1), PorterDuff.Mode.SRC_IN);
        this.l = c.o(11, false);
        this.m = c.o(6, true);
        this.n = c.o(9, false);
        this.o = c.l(8);
        if (c.p(7)) {
            a(c.e(7, 0));
        }
        if (c.p(10) && (r = fny.r(context3, c, 10)) != null) {
            Drawable background = getBackground();
            background = background instanceof DrawableWrapper ? ((DrawableWrapper) background).getDrawable() : background;
            if (background instanceof RippleDrawable) {
                ((RippleDrawable) background).setColor(r);
            }
        }
        c.n();
        b();
    }

    private final void b() {
        ColorStateList colorStateList;
        Animator.AnimatorListener animatorListener;
        this.p = fhr.f(this.p, this.b, getButtonTintMode());
        Drawable drawable = this.q;
        ColorStateList colorStateList2 = this.c;
        this.q = fhr.f(drawable, colorStateList2, this.s);
        if (this.r) {
            aqh aqhVar = this.x;
            if (aqhVar != null) {
                aqc aqcVar = this.y;
                if (aqcVar != null) {
                    Drawable drawable2 = aqhVar.e;
                    if (drawable2 != null) {
                        ((AnimatedVectorDrawable) drawable2).unregisterAnimationCallback(aqcVar.a());
                    }
                    ArrayList arrayList = aqhVar.c;
                    if (arrayList != null) {
                        arrayList.remove(aqcVar);
                        if (aqhVar.c.size() == 0 && (animatorListener = aqhVar.b) != null) {
                            aqhVar.a.c.removeListener(animatorListener);
                            aqhVar.b = null;
                        }
                    }
                }
                if (aqcVar != null) {
                    Drawable drawable3 = aqhVar.e;
                    if (drawable3 != null) {
                        ((AnimatedVectorDrawable) drawable3).registerAnimationCallback(aqcVar.a());
                    } else {
                        if (aqhVar.c == null) {
                            aqhVar.c = new ArrayList();
                        }
                        if (!aqhVar.c.contains(aqcVar)) {
                            aqhVar.c.add(aqcVar);
                            if (aqhVar.b == null) {
                                aqhVar.b = new aqe(aqhVar);
                            }
                            aqhVar.a.c.addListener(aqhVar.b);
                        }
                    }
                }
            }
            Drawable drawable4 = this.p;
            if ((drawable4 instanceof AnimatedStateListDrawable) && aqhVar != null) {
                ((AnimatedStateListDrawable) drawable4).addTransition(R.id.checked, R.id.unchecked, aqhVar, false);
                ((AnimatedStateListDrawable) this.p).addTransition(R.id.indeterminate, R.id.unchecked, aqhVar, false);
            }
        }
        Drawable drawable5 = this.p;
        if (drawable5 != null && (colorStateList = this.b) != null) {
            drawable5.setTintList(colorStateList);
        }
        Drawable drawable6 = this.q;
        if (drawable6 != null && colorStateList2 != null) {
            drawable6.setTintList(colorStateList2);
        }
        Drawable drawable7 = this.p;
        Drawable drawable8 = this.q;
        if (drawable7 == null) {
            drawable7 = drawable8;
        } else if (drawable8 != null) {
            int intrinsicWidth = drawable8.getIntrinsicWidth();
            if (intrinsicWidth == -1) {
                intrinsicWidth = drawable7.getIntrinsicWidth();
            }
            int intrinsicHeight = drawable8.getIntrinsicHeight();
            if (intrinsicHeight == -1) {
                intrinsicHeight = drawable7.getIntrinsicHeight();
            }
            if (intrinsicWidth > drawable7.getIntrinsicWidth() || intrinsicHeight > drawable7.getIntrinsicHeight()) {
                float f2 = intrinsicWidth / intrinsicHeight;
                if (f2 >= drawable7.getIntrinsicWidth() / drawable7.getIntrinsicHeight()) {
                    int intrinsicWidth2 = drawable7.getIntrinsicWidth();
                    intrinsicHeight = (int) (intrinsicWidth2 / f2);
                    intrinsicWidth = intrinsicWidth2;
                } else {
                    intrinsicHeight = drawable7.getIntrinsicHeight();
                    intrinsicWidth = (int) (f2 * intrinsicHeight);
                }
            }
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{drawable7, drawable8});
            layerDrawable.setLayerSize(1, intrinsicWidth, intrinsicHeight);
            layerDrawable.setLayerGravity(1, 17);
            drawable7 = layerDrawable;
        }
        super.setButtonDrawable(drawable7);
        refreshDrawableState();
    }

    private final void c() {
        if (Build.VERSION.SDK_INT < 30 || this.v != null) {
            return;
        }
        int i2 = this.t;
        super.setStateDescription(i2 == 1 ? getResources().getString(R.string.mtrl_checkbox_state_description_checked) : i2 == 0 ? getResources().getString(R.string.mtrl_checkbox_state_description_unchecked) : getResources().getString(R.string.mtrl_checkbox_state_description_indeterminate));
    }

    public final void a(int i2) {
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener;
        if (this.t != i2) {
            this.t = i2;
            super.setChecked(i2 == 1);
            refreshDrawableState();
            c();
            if (this.u) {
                return;
            }
            this.u = true;
            LinkedHashSet linkedHashSet = this.j;
            if (linkedHashSet != null) {
                Iterator it = linkedHashSet.iterator();
                while (it.hasNext()) {
                    ((fgq) it.next()).a();
                }
            }
            if (this.t != 2 && (onCheckedChangeListener = this.w) != null) {
                onCheckedChangeListener.onCheckedChanged(this, isChecked());
            }
            AutofillManager m43m = am$$ExternalSyntheticApiModelOutline0.m43m(getContext().getSystemService(am$$ExternalSyntheticApiModelOutline0.m49m$1()));
            if (m43m != null) {
                m43m.notifyValueChanged(this);
            }
            this.u = false;
        }
    }

    @Override // android.widget.CompoundButton
    public final Drawable getButtonDrawable() {
        return this.p;
    }

    @Override // android.widget.CompoundButton
    public final ColorStateList getButtonTintList() {
        return this.b;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final boolean isChecked() {
        return this.t == 1;
    }

    @Override // android.widget.TextView, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.l && this.b == null && this.c == null) {
            this.l = true;
            ColorStateList colorStateList = this.k;
            if (colorStateList == null) {
                int[][] iArr = h;
                int length = iArr.length;
                int c = fhq.c(this, R.attr.colorControlActivated);
                int c2 = fhq.c(this, R.attr.colorError);
                int c3 = fhq.c(this, R.attr.colorSurface);
                int c4 = fhq.c(this, R.attr.colorOnSurface);
                ColorStateList colorStateList2 = new ColorStateList(iArr, new int[]{fhq.e(c3, c2, 1.0f), fhq.e(c3, c, 1.0f), fhq.e(c3, c4, 0.54f), fhq.e(c3, c4, 0.38f), fhq.e(c3, c4, 0.38f)});
                this.k = colorStateList2;
                colorStateList = colorStateList2;
            }
            setButtonTintList(colorStateList);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected final int[] onCreateDrawableState(int i2) {
        int[] iArr;
        int[] onCreateDrawableState = super.onCreateDrawableState(i2 + 2);
        if (this.t == 2) {
            mergeDrawableStates(onCreateDrawableState, f);
        }
        if (this.n) {
            mergeDrawableStates(onCreateDrawableState, g);
        }
        int i3 = 0;
        while (true) {
            int length = onCreateDrawableState.length;
            if (i3 >= length) {
                int[] copyOf = Arrays.copyOf(onCreateDrawableState, length + 1);
                copyOf[length] = 16842912;
                iArr = copyOf;
                break;
            }
            int i4 = onCreateDrawableState[i3];
            if (i4 == 16842912) {
                iArr = onCreateDrawableState;
                break;
            }
            if (i4 == 0) {
                iArr = (int[]) onCreateDrawableState.clone();
                iArr[i3] = 16842912;
                break;
            }
            i3++;
        }
        this.d = iArr;
        return onCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected final void onDraw(Canvas canvas) {
        Drawable drawable;
        if (!this.m || !TextUtils.isEmpty(getText()) || (drawable = this.p) == null) {
            super.onDraw(canvas);
            return;
        }
        int i2 = true == fik.i(this) ? -1 : 1;
        int width = getWidth() - drawable.getIntrinsicWidth();
        int save = canvas.save();
        int i3 = (width / 2) * i2;
        canvas.translate(i3, 0.0f);
        super.onDraw(canvas);
        canvas.restoreToCount(save);
        if (getBackground() != null) {
            Rect bounds = drawable.getBounds();
            getBackground().setHotspotBounds(bounds.left + i3, bounds.top, bounds.right + i3, bounds.bottom);
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (accessibilityNodeInfo != null && this.n) {
            accessibilityNodeInfo.setText(String.valueOf(accessibilityNodeInfo.getText()) + ", " + String.valueOf(this.o));
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof fgr)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        fgr fgrVar = (fgr) parcelable;
        super.onRestoreInstanceState(fgrVar.getSuperState());
        a(fgrVar.a);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final Parcelable onSaveInstanceState() {
        fgr fgrVar = new fgr(super.onSaveInstanceState());
        fgrVar.a = this.t;
        return fgrVar;
    }

    @Override // defpackage.hu, android.widget.CompoundButton
    public final void setButtonDrawable(int i2) {
        setButtonDrawable(e.f(getContext(), i2));
    }

    @Override // android.widget.CompoundButton
    public final void setButtonTintList(ColorStateList colorStateList) {
        if (this.b == colorStateList) {
            return;
        }
        this.b = colorStateList;
        b();
    }

    @Override // android.widget.CompoundButton
    public final void setButtonTintMode(PorterDuff.Mode mode) {
        hw hwVar = this.a;
        if (hwVar != null) {
            hwVar.a = mode;
            hwVar.c = true;
            hwVar.a();
        }
        b();
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final void setChecked(boolean z) {
        a(z ? 1 : 0);
    }

    @Override // android.widget.CompoundButton
    public final void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.w = onCheckedChangeListener;
    }

    @Override // android.widget.CompoundButton, android.view.View
    public final void setStateDescription(CharSequence charSequence) {
        this.v = charSequence;
        if (charSequence == null) {
            c();
        } else {
            super.setStateDescription(charSequence);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final void toggle() {
        a(!isChecked() ? 1 : 0);
    }

    @Override // defpackage.hu, android.widget.CompoundButton
    public final void setButtonDrawable(Drawable drawable) {
        this.p = drawable;
        this.r = false;
        b();
    }
}
