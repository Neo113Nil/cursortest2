package androidx.appcompat.widget;

import android.text.TextUtils;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityManager;
import androidx.core.view.AbstractC1281a0;
import androidx.core.view.AbstractC1289e0;

/* loaded from: classes.dex */
class h0 implements View.OnLongClickListener, View.OnHoverListener, View.OnAttachStateChangeListener {

    /* renamed from: k, reason: collision with root package name */
    private static h0 f10925k;

    /* renamed from: l, reason: collision with root package name */
    private static h0 f10926l;

    /* renamed from: a, reason: collision with root package name */
    private final View f10927a;

    /* renamed from: b, reason: collision with root package name */
    private final CharSequence f10928b;

    /* renamed from: c, reason: collision with root package name */
    private final int f10929c;

    /* renamed from: d, reason: collision with root package name */
    private final Runnable f10930d = new Runnable() { // from class: androidx.appcompat.widget.f0
        @Override // java.lang.Runnable
        public final void run() {
            h0.this.h(false);
        }
    };

    /* renamed from: e, reason: collision with root package name */
    private final Runnable f10931e = new Runnable() { // from class: androidx.appcompat.widget.g0
        @Override // java.lang.Runnable
        public final void run() {
            h0.this.d();
        }
    };

    /* renamed from: f, reason: collision with root package name */
    private int f10932f;

    /* renamed from: g, reason: collision with root package name */
    private int f10933g;

    /* renamed from: h, reason: collision with root package name */
    private i0 f10934h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f10935i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f10936j;

    private h0(View view, CharSequence charSequence) {
        this.f10927a = view;
        this.f10928b = charSequence;
        this.f10929c = AbstractC1289e0.g(ViewConfiguration.get(view.getContext()));
        c();
        view.setOnLongClickListener(this);
        view.setOnHoverListener(this);
    }

    private void b() {
        this.f10927a.removeCallbacks(this.f10930d);
    }

    private void c() {
        this.f10936j = true;
    }

    private void e() {
        this.f10927a.postDelayed(this.f10930d, ViewConfiguration.getLongPressTimeout());
    }

    private static void f(h0 h0Var) {
        h0 h0Var2 = f10925k;
        if (h0Var2 != null) {
            h0Var2.b();
        }
        f10925k = h0Var;
        if (h0Var != null) {
            h0Var.e();
        }
    }

    public static void g(View view, CharSequence charSequence) {
        h0 h0Var = f10925k;
        if (h0Var != null && h0Var.f10927a == view) {
            f(null);
        }
        if (!TextUtils.isEmpty(charSequence)) {
            new h0(view, charSequence);
            return;
        }
        h0 h0Var2 = f10926l;
        if (h0Var2 != null && h0Var2.f10927a == view) {
            h0Var2.d();
        }
        view.setOnLongClickListener(null);
        view.setLongClickable(false);
        view.setOnHoverListener(null);
    }

    private boolean i(MotionEvent motionEvent) {
        int x4 = (int) motionEvent.getX();
        int y4 = (int) motionEvent.getY();
        if (!this.f10936j && Math.abs(x4 - this.f10932f) <= this.f10929c && Math.abs(y4 - this.f10933g) <= this.f10929c) {
            return false;
        }
        this.f10932f = x4;
        this.f10933g = y4;
        this.f10936j = false;
        return true;
    }

    void d() {
        if (f10926l == this) {
            f10926l = null;
            i0 i0Var = this.f10934h;
            if (i0Var != null) {
                i0Var.c();
                this.f10934h = null;
                c();
                this.f10927a.removeOnAttachStateChangeListener(this);
            } else {
                Log.e("TooltipCompatHandler", "sActiveHandler.mPopup == null");
            }
        }
        if (f10925k == this) {
            f(null);
        }
        this.f10927a.removeCallbacks(this.f10931e);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void h(boolean z4) {
        long longPressTimeout;
        long j4;
        long j5;
        if (this.f10927a.isAttachedToWindow()) {
            f(null);
            h0 h0Var = f10926l;
            if (h0Var != null) {
                h0Var.d();
            }
            f10926l = this;
            this.f10935i = z4;
            i0 i0Var = new i0(this.f10927a.getContext());
            this.f10934h = i0Var;
            i0Var.e(this.f10927a, this.f10932f, this.f10933g, this.f10935i, this.f10928b);
            this.f10927a.addOnAttachStateChangeListener(this);
            if (this.f10935i) {
                j5 = 2500;
            } else {
                if ((AbstractC1281a0.M(this.f10927a) & 1) == 1) {
                    longPressTimeout = ViewConfiguration.getLongPressTimeout();
                    j4 = 3000;
                } else {
                    longPressTimeout = ViewConfiguration.getLongPressTimeout();
                    j4 = 15000;
                }
                j5 = j4 - longPressTimeout;
            }
            this.f10927a.removeCallbacks(this.f10931e);
            this.f10927a.postDelayed(this.f10931e, j5);
        }
    }

    @Override // android.view.View.OnHoverListener
    public boolean onHover(View view, MotionEvent motionEvent) {
        if (this.f10934h != null && this.f10935i) {
            return false;
        }
        AccessibilityManager accessibilityManager = (AccessibilityManager) this.f10927a.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action != 7) {
            if (action == 10) {
                c();
                d();
            }
        } else if (this.f10927a.isEnabled() && this.f10934h == null && i(motionEvent)) {
            f(this);
        }
        return false;
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(View view) {
        this.f10932f = view.getWidth() / 2;
        this.f10933g = view.getHeight() / 2;
        h(true);
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        d();
    }
}
