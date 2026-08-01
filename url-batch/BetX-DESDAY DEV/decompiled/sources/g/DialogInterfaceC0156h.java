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
import com.luckyarcade.spinthrow.R;
import j.AbstractC0170b;
import j.InterfaceC0169a;
import java.util.WeakHashMap;

/* renamed from: g.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class DialogInterfaceC0156h extends a.q implements DialogInterface, InterfaceC0160l {

    /* renamed from: d, reason: collision with root package name */
    public LayoutInflaterFactory2C0142C f2577d;

    /* renamed from: e, reason: collision with root package name */
    public final C0143D f2578e;

    /* renamed from: f, reason: collision with root package name */
    public final C0155g f2579f;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Type inference failed for: r2v2, types: [g.D] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public DialogInterfaceC0156h(ContextThemeWrapper contextThemeWrapper, int i) {
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
        this.f2578e = new InterfaceC0015k() { // from class: g.D
            @Override // K.InterfaceC0015k
            public final boolean superDispatchKeyEvent(KeyEvent keyEvent) {
                return DialogInterfaceC0156h.this.i(keyEvent);
            }
        };
        q d2 = d();
        if (g2 == 0) {
            TypedValue typedValue2 = new TypedValue();
            contextThemeWrapper.getTheme().resolveAttribute(R.attr.dialogTheme, typedValue2, true);
            g2 = typedValue2.resourceId;
        }
        ((LayoutInflaterFactory2C0142C) d2).f2456T = g2;
        d2.d();
        this.f2579f = new C0155g(getContext(), this, getWindow());
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
        LayoutInflaterFactory2C0142C layoutInflaterFactory2C0142C = (LayoutInflaterFactory2C0142C) d();
        layoutInflaterFactory2C0142C.x();
        ((ViewGroup) layoutInflaterFactory2C0142C.f2438A.findViewById(android.R.id.content)).addView(view, layoutParams);
        layoutInflaterFactory2C0142C.f2473m.a(layoutInflaterFactory2C0142C.f2472l.getCallback());
    }

    public final q d() {
        if (this.f2577d == null) {
            ExecutorC0163o executorC0163o = q.f2587a;
            this.f2577d = new LayoutInflaterFactory2C0142C(getContext(), getWindow(), this, this);
        }
        return this.f2577d;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        super.dismiss();
        d().e();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return q1.l.s(this.f2578e, getWindow().getDecorView(), this, keyEvent);
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
        LayoutInflaterFactory2C0142C layoutInflaterFactory2C0142C = (LayoutInflaterFactory2C0142C) d();
        layoutInflaterFactory2C0142C.x();
        return layoutInflaterFactory2C0142C.f2472l.findViewById(i);
    }

    public final void h(CharSequence charSequence) {
        super.setTitle(charSequence);
        d().k(charSequence);
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
        C0155g c0155g = this.f2579f;
        c0155g.f2557b.setContentView(c0155g.f2570q);
        Window window = c0155g.f2558c;
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
        ViewGroup a2 = C0155g.a(findViewById6, findViewById3);
        ViewGroup a3 = C0155g.a(findViewById7, findViewById4);
        ViewGroup a4 = C0155g.a(findViewById8, findViewById5);
        NestedScrollView nestedScrollView = (NestedScrollView) window.findViewById(R.id.scrollView);
        c0155g.i = nestedScrollView;
        nestedScrollView.setFocusable(false);
        c0155g.i.setNestedScrollingEnabled(false);
        TextView textView = (TextView) a3.findViewById(android.R.id.message);
        c0155g.f2566m = textView;
        if (textView != null) {
            textView.setVisibility(8);
            c0155g.i.removeView(c0155g.f2566m);
            if (c0155g.f2560e != null) {
                ViewGroup viewGroup2 = (ViewGroup) c0155g.i.getParent();
                int indexOfChild = viewGroup2.indexOfChild(c0155g.i);
                viewGroup2.removeViewAt(indexOfChild);
                viewGroup2.addView(c0155g.f2560e, indexOfChild, new ViewGroup.LayoutParams(-1, -1));
            } else {
                a3.setVisibility(8);
            }
        }
        Button button = (Button) a4.findViewById(android.R.id.button1);
        c0155g.f2561f = button;
        com.google.android.material.datepicker.j jVar = c0155g.f2576w;
        button.setOnClickListener(jVar);
        if (TextUtils.isEmpty(null)) {
            c0155g.f2561f.setVisibility(8);
            i = 0;
        } else {
            c0155g.f2561f.setText((CharSequence) null);
            c0155g.f2561f.setVisibility(0);
            i = 1;
        }
        Button button2 = (Button) a4.findViewById(android.R.id.button2);
        c0155g.f2562g = button2;
        button2.setOnClickListener(jVar);
        if (TextUtils.isEmpty(null)) {
            c0155g.f2562g.setVisibility(8);
        } else {
            c0155g.f2562g.setText((CharSequence) null);
            c0155g.f2562g.setVisibility(0);
            i |= 2;
        }
        Button button3 = (Button) a4.findViewById(android.R.id.button3);
        c0155g.h = button3;
        button3.setOnClickListener(jVar);
        if (TextUtils.isEmpty(null)) {
            c0155g.h.setVisibility(8);
        } else {
            c0155g.h.setText((CharSequence) null);
            c0155g.h.setVisibility(0);
            i |= 4;
        }
        TypedValue typedValue = new TypedValue();
        c0155g.f2556a.getTheme().resolveAttribute(R.attr.alertDialogCenterButtons, typedValue, true);
        if (typedValue.data != 0) {
            if (i == 1) {
                Button button4 = c0155g.f2561f;
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button4.getLayoutParams();
                layoutParams.gravity = 1;
                layoutParams.weight = 0.5f;
                button4.setLayoutParams(layoutParams);
            } else if (i == 2) {
                Button button5 = c0155g.f2562g;
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) button5.getLayoutParams();
                layoutParams2.gravity = 1;
                layoutParams2.weight = 0.5f;
                button5.setLayoutParams(layoutParams2);
            } else if (i == 4) {
                Button button6 = c0155g.h;
                LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) button6.getLayoutParams();
                layoutParams3.gravity = 1;
                layoutParams3.weight = 0.5f;
                button6.setLayoutParams(layoutParams3);
            }
        }
        if (i == 0) {
            a4.setVisibility(8);
        }
        if (c0155g.f2567n != null) {
            a2.addView(c0155g.f2567n, 0, new ViewGroup.LayoutParams(-1, -2));
            window.findViewById(R.id.title_template).setVisibility(8);
        } else {
            c0155g.f2564k = (ImageView) window.findViewById(android.R.id.icon);
            if (TextUtils.isEmpty(c0155g.f2559d) || !c0155g.f2574u) {
                window.findViewById(R.id.title_template).setVisibility(8);
                c0155g.f2564k.setVisibility(8);
                a2.setVisibility(8);
            } else {
                TextView textView2 = (TextView) window.findViewById(R.id.alertTitle);
                c0155g.f2565l = textView2;
                textView2.setText(c0155g.f2559d);
                Drawable drawable = c0155g.f2563j;
                if (drawable != null) {
                    c0155g.f2564k.setImageDrawable(drawable);
                } else {
                    c0155g.f2565l.setPadding(c0155g.f2564k.getPaddingLeft(), c0155g.f2564k.getPaddingTop(), c0155g.f2564k.getPaddingRight(), c0155g.f2564k.getPaddingBottom());
                    c0155g.f2564k.setVisibility(8);
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
            NestedScrollView nestedScrollView2 = c0155g.i;
            if (nestedScrollView2 != null) {
                nestedScrollView2.setClipToPadding(true);
            }
            View findViewById9 = c0155g.f2560e != null ? a2.findViewById(R.id.titleDividerNoCustom) : null;
            if (findViewById9 != null) {
                findViewById9.setVisibility(0);
            }
        } else {
            View findViewById10 = a3.findViewById(R.id.textSpacerNoTitle);
            if (findViewById10 != null) {
                findViewById10.setVisibility(0);
            }
        }
        AlertController$RecycleListView alertController$RecycleListView = c0155g.f2560e;
        if (alertController$RecycleListView != null) {
            alertController$RecycleListView.getClass();
            if (!z3 || i2 == 0) {
                alertController$RecycleListView.setPadding(alertController$RecycleListView.getPaddingLeft(), i2 != 0 ? alertController$RecycleListView.getPaddingTop() : alertController$RecycleListView.f954a, alertController$RecycleListView.getPaddingRight(), z3 ? alertController$RecycleListView.getPaddingBottom() : alertController$RecycleListView.f955b);
            }
        }
        if (!z2) {
            View view = c0155g.f2560e;
            if (view == null) {
                view = c0155g.i;
            }
            if (view != null) {
                int i3 = (z3 ? 2 : 0) | i2;
                View findViewById11 = window.findViewById(R.id.scrollIndicatorUp);
                View findViewById12 = window.findViewById(R.id.scrollIndicatorDown);
                WeakHashMap weakHashMap = X.f419a;
                K.M.d(view, i3, 3);
                if (findViewById11 != null) {
                    a3.removeView(findViewById11);
                }
                if (findViewById12 != null) {
                    a3.removeView(findViewById12);
                }
            }
        }
        AlertController$RecycleListView alertController$RecycleListView2 = c0155g.f2560e;
        if (alertController$RecycleListView2 == null || (listAdapter = c0155g.f2568o) == null) {
            return;
        }
        alertController$RecycleListView2.setAdapter(listAdapter);
        int i4 = c0155g.f2569p;
        if (i4 > -1) {
            alertController$RecycleListView2.setItemChecked(i4, true);
            alertController$RecycleListView2.setSelection(i4);
        }
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f2579f.i;
        if (nestedScrollView == null || !nestedScrollView.i(keyEvent)) {
            return super.onKeyDown(i, keyEvent);
        }
        return true;
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f2579f.i;
        if (nestedScrollView == null || !nestedScrollView.i(keyEvent)) {
            return super.onKeyUp(i, keyEvent);
        }
        return true;
    }

    @Override // a.q, android.app.Dialog
    public final void onStop() {
        super.onStop();
        LayoutInflaterFactory2C0142C layoutInflaterFactory2C0142C = (LayoutInflaterFactory2C0142C) d();
        layoutInflaterFactory2C0142C.B();
        AbstractC0149a abstractC0149a = layoutInflaterFactory2C0142C.f2475o;
        if (abstractC0149a != null) {
            abstractC0149a.m(false);
        }
    }

    @Override // g.InterfaceC0160l
    public final void onSupportActionModeFinished(AbstractC0170b abstractC0170b) {
    }

    @Override // g.InterfaceC0160l
    public final void onSupportActionModeStarted(AbstractC0170b abstractC0170b) {
    }

    @Override // g.InterfaceC0160l
    public final AbstractC0170b onWindowStartingSupportActionMode(InterfaceC0169a interfaceC0169a) {
        return null;
    }

    @Override // a.q, android.app.Dialog
    public final void setContentView(int i) {
        e();
        d().h(i);
    }

    @Override // android.app.Dialog
    public final void setTitle(int i) {
        super.setTitle(i);
        d().k(getContext().getString(i));
    }

    @Override // a.q, android.app.Dialog
    public final void setContentView(View view) {
        e();
        d().i(view);
    }

    @Override // android.app.Dialog
    public final void setTitle(CharSequence charSequence) {
        h(charSequence);
        C0155g c0155g = this.f2579f;
        c0155g.f2559d = charSequence;
        TextView textView = c0155g.f2565l;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    @Override // a.q, android.app.Dialog
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        e();
        d().j(view, layoutParams);
    }
}
