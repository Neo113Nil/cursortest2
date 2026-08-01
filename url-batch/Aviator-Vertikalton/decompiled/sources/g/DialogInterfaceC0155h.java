package g;

import K.InterfaceC0015k;
import K.X;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.app.AlertController$RecycleListView;
import androidx.core.widget.NestedScrollView;
import com.fortuneink.neonpad.R;
import j.AbstractC0169b;
import j.InterfaceC0168a;
import java.util.WeakHashMap;

/* renamed from: g.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class DialogInterfaceC0155h extends a.q implements DialogInterface, InterfaceC0159l {

    /* renamed from: d, reason: collision with root package name */
    public LayoutInflaterFactory2C0141C f2573d;

    /* renamed from: e, reason: collision with root package name */
    public final C0142D f2574e;

    /* renamed from: f, reason: collision with root package name */
    public final C0154g f2575f;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Type inference failed for: r2v2, types: [g.D] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public DialogInterfaceC0155h(ContextThemeWrapper contextThemeWrapper, int i) {
        super(contextThemeWrapper, r2);
        int i2;
        int g2 = g(contextThemeWrapper, i);
        if (g2 == 0) {
            TypedValue typedValue = new TypedValue();
            contextThemeWrapper.getTheme().resolveAttribute(R.attr.dialogTheme, typedValue, true);
            i2 = typedValue.resourceId;
        } else {
            i2 = g2;
        }
        this.f2574e = new InterfaceC0015k() { // from class: g.D
            @Override // K.InterfaceC0015k
            public final boolean superDispatchKeyEvent(KeyEvent keyEvent) {
                return DialogInterfaceC0155h.this.i(keyEvent);
            }
        };
        q d2 = d();
        if (g2 == 0) {
            TypedValue typedValue2 = new TypedValue();
            contextThemeWrapper.getTheme().resolveAttribute(R.attr.dialogTheme, typedValue2, true);
            g2 = typedValue2.resourceId;
        }
        ((LayoutInflaterFactory2C0141C) d2).f2452T = g2;
        d2.d();
        this.f2575f = new C0154g(getContext(), this, getWindow());
    }

    public static int g(Context context, int i) {
        if (((i >>> 24) & 255) >= 1) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    @Override // a.q, android.app.Dialog
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        LayoutInflaterFactory2C0141C layoutInflaterFactory2C0141C = (LayoutInflaterFactory2C0141C) d();
        layoutInflaterFactory2C0141C.x();
        ((ViewGroup) layoutInflaterFactory2C0141C.f2434A.findViewById(android.R.id.content)).addView(view, layoutParams);
        layoutInflaterFactory2C0141C.f2469m.a(layoutInflaterFactory2C0141C.f2468l.getCallback());
    }

    public final q d() {
        if (this.f2573d == null) {
            ExecutorC0162o executorC0162o = q.f2583a;
            this.f2573d = new LayoutInflaterFactory2C0141C(getContext(), getWindow(), this, this);
        }
        return this.f2573d;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        super.dismiss();
        d().g();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return q1.l.s(this.f2574e, getWindow().getDecorView(), this, keyEvent);
    }

    public final void e() {
        androidx.lifecycle.J.f(getWindow().getDecorView(), this);
        q1.l.j0(getWindow().getDecorView(), this);
        q1.l.i0(getWindow().getDecorView(), this);
    }

    public final void f(Bundle bundle) {
        d().a();
        super.onCreate(bundle);
        d().d();
    }

    @Override // android.app.Dialog
    public final View findViewById(int i) {
        LayoutInflaterFactory2C0141C layoutInflaterFactory2C0141C = (LayoutInflaterFactory2C0141C) d();
        layoutInflaterFactory2C0141C.x();
        return layoutInflaterFactory2C0141C.f2468l.findViewById(i);
    }

    public final void h(CharSequence charSequence) {
        super.setTitle(charSequence);
        d().m(charSequence);
    }

    public final boolean i(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Dialog
    public final void invalidateOptionsMenu() {
        d().b();
    }

    @Override // a.q, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        int i;
        ListAdapter listAdapter;
        View findViewById;
        f(bundle);
        C0154g c0154g = this.f2575f;
        c0154g.f2553b.setContentView(c0154g.f2566q);
        Window window = c0154g.f2554c;
        View findViewById2 = window.findViewById(R.id.parentPanel);
        View findViewById3 = findViewById2.findViewById(R.id.topPanel);
        View findViewById4 = findViewById2.findViewById(R.id.contentPanel);
        View findViewById5 = findViewById2.findViewById(R.id.buttonPanel);
        ViewGroup viewGroup = (ViewGroup) findViewById2.findViewById(R.id.customPanel);
        window.setFlags(131072, 131072);
        viewGroup.setVisibility(8);
        View findViewById6 = viewGroup.findViewById(R.id.topPanel);
        View findViewById7 = viewGroup.findViewById(R.id.contentPanel);
        View findViewById8 = viewGroup.findViewById(R.id.buttonPanel);
        ViewGroup a2 = C0154g.a(findViewById6, findViewById3);
        ViewGroup a3 = C0154g.a(findViewById7, findViewById4);
        ViewGroup a4 = C0154g.a(findViewById8, findViewById5);
        NestedScrollView nestedScrollView = (NestedScrollView) window.findViewById(R.id.scrollView);
        c0154g.i = nestedScrollView;
        nestedScrollView.setFocusable(false);
        c0154g.i.setNestedScrollingEnabled(false);
        TextView textView = (TextView) a3.findViewById(android.R.id.message);
        c0154g.f2562m = textView;
        if (textView != null) {
            textView.setVisibility(8);
            c0154g.i.removeView(c0154g.f2562m);
            if (c0154g.f2556e != null) {
                ViewGroup viewGroup2 = (ViewGroup) c0154g.i.getParent();
                int indexOfChild = viewGroup2.indexOfChild(c0154g.i);
                viewGroup2.removeViewAt(indexOfChild);
                viewGroup2.addView(c0154g.f2556e, indexOfChild, new ViewGroup.LayoutParams(-1, -1));
            } else {
                a3.setVisibility(8);
            }
        }
        Button button = (Button) a4.findViewById(android.R.id.button1);
        c0154g.f2557f = button;
        com.google.android.material.datepicker.j jVar = c0154g.f2572w;
        button.setOnClickListener(jVar);
        if (TextUtils.isEmpty(null)) {
            c0154g.f2557f.setVisibility(8);
            i = 0;
        } else {
            c0154g.f2557f.setText((CharSequence) null);
            c0154g.f2557f.setVisibility(0);
            i = 1;
        }
        Button button2 = (Button) a4.findViewById(android.R.id.button2);
        c0154g.f2558g = button2;
        button2.setOnClickListener(jVar);
        if (TextUtils.isEmpty(null)) {
            c0154g.f2558g.setVisibility(8);
        } else {
            c0154g.f2558g.setText((CharSequence) null);
            c0154g.f2558g.setVisibility(0);
            i |= 2;
        }
        Button button3 = (Button) a4.findViewById(android.R.id.button3);
        c0154g.h = button3;
        button3.setOnClickListener(jVar);
        if (TextUtils.isEmpty(null)) {
            c0154g.h.setVisibility(8);
        } else {
            c0154g.h.setText((CharSequence) null);
            c0154g.h.setVisibility(0);
            i |= 4;
        }
        TypedValue typedValue = new TypedValue();
        c0154g.f2552a.getTheme().resolveAttribute(R.attr.alertDialogCenterButtons, typedValue, true);
        if (typedValue.data != 0) {
            if (i == 1) {
                Button button4 = c0154g.f2557f;
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button4.getLayoutParams();
                layoutParams.gravity = 1;
                layoutParams.weight = 0.5f;
                button4.setLayoutParams(layoutParams);
            } else if (i == 2) {
                Button button5 = c0154g.f2558g;
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) button5.getLayoutParams();
                layoutParams2.gravity = 1;
                layoutParams2.weight = 0.5f;
                button5.setLayoutParams(layoutParams2);
            } else if (i == 4) {
                Button button6 = c0154g.h;
                LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) button6.getLayoutParams();
                layoutParams3.gravity = 1;
                layoutParams3.weight = 0.5f;
                button6.setLayoutParams(layoutParams3);
            }
        }
        if (i == 0) {
            a4.setVisibility(8);
        }
        if (c0154g.f2563n != null) {
            a2.addView(c0154g.f2563n, 0, new ViewGroup.LayoutParams(-1, -2));
            window.findViewById(R.id.title_template).setVisibility(8);
        } else {
            c0154g.f2560k = (ImageView) window.findViewById(android.R.id.icon);
            if (TextUtils.isEmpty(c0154g.f2555d) || !c0154g.f2570u) {
                window.findViewById(R.id.title_template).setVisibility(8);
                c0154g.f2560k.setVisibility(8);
                a2.setVisibility(8);
            } else {
                TextView textView2 = (TextView) window.findViewById(R.id.alertTitle);
                c0154g.f2561l = textView2;
                textView2.setText(c0154g.f2555d);
                Drawable drawable = c0154g.f2559j;
                if (drawable != null) {
                    c0154g.f2560k.setImageDrawable(drawable);
                } else {
                    c0154g.f2561l.setPadding(c0154g.f2560k.getPaddingLeft(), c0154g.f2560k.getPaddingTop(), c0154g.f2560k.getPaddingRight(), c0154g.f2560k.getPaddingBottom());
                    c0154g.f2560k.setVisibility(8);
                }
            }
        }
        boolean z2 = viewGroup.getVisibility() != 8;
        int i2 = (a2 == null || a2.getVisibility() == 8) ? 0 : 1;
        boolean z3 = a4.getVisibility() != 8;
        if (!z3 && (findViewById = a3.findViewById(R.id.textSpacerNoButtons)) != null) {
            findViewById.setVisibility(0);
        }
        if (i2 != 0) {
            NestedScrollView nestedScrollView2 = c0154g.i;
            if (nestedScrollView2 != null) {
                nestedScrollView2.setClipToPadding(true);
            }
            View findViewById9 = c0154g.f2556e != null ? a2.findViewById(R.id.titleDividerNoCustom) : null;
            if (findViewById9 != null) {
                findViewById9.setVisibility(0);
            }
        } else {
            View findViewById10 = a3.findViewById(R.id.textSpacerNoTitle);
            if (findViewById10 != null) {
                findViewById10.setVisibility(0);
            }
        }
        AlertController$RecycleListView alertController$RecycleListView = c0154g.f2556e;
        if (alertController$RecycleListView != null) {
            alertController$RecycleListView.getClass();
            if (!z3 || i2 == 0) {
                alertController$RecycleListView.setPadding(alertController$RecycleListView.getPaddingLeft(), i2 != 0 ? alertController$RecycleListView.getPaddingTop() : alertController$RecycleListView.f953a, alertController$RecycleListView.getPaddingRight(), z3 ? alertController$RecycleListView.getPaddingBottom() : alertController$RecycleListView.f954b);
            }
        }
        if (!z2) {
            View view = c0154g.f2556e;
            if (view == null) {
                view = c0154g.i;
            }
            if (view != null) {
                int i3 = (z3 ? 2 : 0) | i2;
                View findViewById11 = window.findViewById(R.id.scrollIndicatorUp);
                View findViewById12 = window.findViewById(R.id.scrollIndicatorDown);
                WeakHashMap weakHashMap = X.f418a;
                K.M.d(view, i3, 3);
                if (findViewById11 != null) {
                    a3.removeView(findViewById11);
                }
                if (findViewById12 != null) {
                    a3.removeView(findViewById12);
                }
            }
        }
        AlertController$RecycleListView alertController$RecycleListView2 = c0154g.f2556e;
        if (alertController$RecycleListView2 == null || (listAdapter = c0154g.f2564o) == null) {
            return;
        }
        alertController$RecycleListView2.setAdapter(listAdapter);
        int i4 = c0154g.f2565p;
        if (i4 > -1) {
            alertController$RecycleListView2.setItemChecked(i4, true);
            alertController$RecycleListView2.setSelection(i4);
        }
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f2575f.i;
        if (nestedScrollView == null || !nestedScrollView.i(keyEvent)) {
            return super.onKeyDown(i, keyEvent);
        }
        return true;
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f2575f.i;
        if (nestedScrollView == null || !nestedScrollView.i(keyEvent)) {
            return super.onKeyUp(i, keyEvent);
        }
        return true;
    }

    @Override // a.q, android.app.Dialog
    public final void onStop() {
        super.onStop();
        LayoutInflaterFactory2C0141C layoutInflaterFactory2C0141C = (LayoutInflaterFactory2C0141C) d();
        layoutInflaterFactory2C0141C.B();
        AbstractC0148a abstractC0148a = layoutInflaterFactory2C0141C.f2471o;
        if (abstractC0148a != null) {
            abstractC0148a.m(false);
        }
    }

    @Override // g.InterfaceC0159l
    public final void onSupportActionModeFinished(AbstractC0169b abstractC0169b) {
    }

    @Override // g.InterfaceC0159l
    public final void onSupportActionModeStarted(AbstractC0169b abstractC0169b) {
    }

    @Override // g.InterfaceC0159l
    public final AbstractC0169b onWindowStartingSupportActionMode(InterfaceC0168a interfaceC0168a) {
        return null;
    }

    @Override // a.q, android.app.Dialog
    public final void setContentView(int i) {
        e();
        d().j(i);
    }

    @Override // android.app.Dialog
    public final void setTitle(int i) {
        super.setTitle(i);
        d().m(getContext().getString(i));
    }

    @Override // a.q, android.app.Dialog
    public final void setContentView(View view) {
        e();
        d().k(view);
    }

    @Override // android.app.Dialog
    public final void setTitle(CharSequence charSequence) {
        h(charSequence);
        C0154g c0154g = this.f2575f;
        c0154g.f2555d = charSequence;
        TextView textView = c0154g.f2561l;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    @Override // a.q, android.app.Dialog
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        e();
        d().l(view, layoutParams);
    }
}
