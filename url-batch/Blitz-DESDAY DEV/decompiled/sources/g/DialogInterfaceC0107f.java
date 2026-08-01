package g;

import M.InterfaceC0010k;
import M.Q;
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
import com.winfour.neondrop.R;
import j.C0153j;
import java.util.WeakHashMap;
import m.C0227a;

/* renamed from: g.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class DialogInterfaceC0107f extends a.m implements DialogInterface, InterfaceC0111j {
    public LayoutInflaterFactory2C0101A d;

    /* renamed from: e, reason: collision with root package name */
    public final B f2312e;

    /* renamed from: f, reason: collision with root package name */
    public final C0106e f2313f;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Type inference failed for: r2v2, types: [g.B] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public DialogInterfaceC0107f(ContextThemeWrapper contextThemeWrapper, int i) {
        super(contextThemeWrapper, r2);
        int i2;
        int i3 = i(contextThemeWrapper, i);
        if (i3 == 0) {
            TypedValue typedValue = new TypedValue();
            contextThemeWrapper.getTheme().resolveAttribute(R.attr.dialogTheme, typedValue, true);
            i2 = typedValue.resourceId;
        } else {
            i2 = i3;
        }
        this.f2312e = new InterfaceC0010k() { // from class: g.B
            @Override // M.InterfaceC0010k
            public final boolean g(KeyEvent keyEvent) {
                return DialogInterfaceC0107f.this.k(keyEvent);
            }
        };
        o e2 = e();
        if (i3 == 0) {
            TypedValue typedValue2 = new TypedValue();
            contextThemeWrapper.getTheme().resolveAttribute(R.attr.dialogTheme, typedValue2, true);
            i3 = typedValue2.resourceId;
        }
        ((LayoutInflaterFactory2C0101A) e2).f2206U = i3;
        e2.c();
        this.f2313f = new C0106e(getContext(), this, getWindow());
    }

    public static int i(Context context, int i) {
        if (((i >>> 24) & 255) >= 1) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    @Override // a.m, android.app.Dialog
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        LayoutInflaterFactory2C0101A layoutInflaterFactory2C0101A = (LayoutInflaterFactory2C0101A) e();
        layoutInflaterFactory2C0101A.v();
        ((ViewGroup) layoutInflaterFactory2C0101A.f2188B.findViewById(android.R.id.content)).addView(view, layoutParams);
        layoutInflaterFactory2C0101A.f2223m.a(layoutInflaterFactory2C0101A.f2222l.getCallback());
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        super.dismiss();
        e().d();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return z1.d.o(this.f2312e, getWindow().getDecorView(), this, keyEvent);
    }

    public final o e() {
        if (this.d == null) {
            m mVar = o.f2326a;
            this.d = new LayoutInflaterFactory2C0101A(getContext(), getWindow(), this, this);
        }
        return this.d;
    }

    @Override // android.app.Dialog
    public final View findViewById(int i) {
        LayoutInflaterFactory2C0101A layoutInflaterFactory2C0101A = (LayoutInflaterFactory2C0101A) e();
        layoutInflaterFactory2C0101A.v();
        return layoutInflaterFactory2C0101A.f2222l.findViewById(i);
    }

    public final void g() {
        androidx.lifecycle.H.f(getWindow().getDecorView(), this);
        C0227a.p(getWindow().getDecorView(), this);
        z1.d.U(getWindow().getDecorView(), this);
    }

    public final void h(Bundle bundle) {
        e().a();
        super.onCreate(bundle);
        e().c();
    }

    @Override // android.app.Dialog
    public final void invalidateOptionsMenu() {
        LayoutInflaterFactory2C0101A layoutInflaterFactory2C0101A = (LayoutInflaterFactory2C0101A) e();
        if (layoutInflaterFactory2C0101A.f2225o != null) {
            layoutInflaterFactory2C0101A.z();
            layoutInflaterFactory2C0101A.f2225o.getClass();
            layoutInflaterFactory2C0101A.A(0);
        }
    }

    public final void j(CharSequence charSequence) {
        super.setTitle(charSequence);
        e().j(charSequence);
    }

    public final boolean k(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // a.m, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        int i;
        ListAdapter listAdapter;
        View findViewById;
        h(bundle);
        C0106e c0106e = this.f2313f;
        c0106e.f2293b.setContentView(c0106e.f2305q);
        Window window = c0106e.f2294c;
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
        ViewGroup a2 = C0106e.a(findViewById6, findViewById3);
        ViewGroup a3 = C0106e.a(findViewById7, findViewById4);
        ViewGroup a4 = C0106e.a(findViewById8, findViewById5);
        NestedScrollView nestedScrollView = (NestedScrollView) window.findViewById(R.id.scrollView);
        c0106e.i = nestedScrollView;
        nestedScrollView.setFocusable(false);
        c0106e.i.setNestedScrollingEnabled(false);
        TextView textView = (TextView) a3.findViewById(android.R.id.message);
        c0106e.f2301m = textView;
        if (textView != null) {
            textView.setVisibility(8);
            c0106e.i.removeView(c0106e.f2301m);
            if (c0106e.f2295e != null) {
                ViewGroup viewGroup2 = (ViewGroup) c0106e.i.getParent();
                int indexOfChild = viewGroup2.indexOfChild(c0106e.i);
                viewGroup2.removeViewAt(indexOfChild);
                viewGroup2.addView(c0106e.f2295e, indexOfChild, new ViewGroup.LayoutParams(-1, -1));
            } else {
                a3.setVisibility(8);
            }
        }
        Button button = (Button) a4.findViewById(android.R.id.button1);
        c0106e.f2296f = button;
        com.google.android.material.datepicker.j jVar = c0106e.f2311w;
        button.setOnClickListener(jVar);
        if (TextUtils.isEmpty(null)) {
            c0106e.f2296f.setVisibility(8);
            i = 0;
        } else {
            c0106e.f2296f.setText((CharSequence) null);
            c0106e.f2296f.setVisibility(0);
            i = 1;
        }
        Button button2 = (Button) a4.findViewById(android.R.id.button2);
        c0106e.f2297g = button2;
        button2.setOnClickListener(jVar);
        if (TextUtils.isEmpty(null)) {
            c0106e.f2297g.setVisibility(8);
        } else {
            c0106e.f2297g.setText((CharSequence) null);
            c0106e.f2297g.setVisibility(0);
            i |= 2;
        }
        Button button3 = (Button) a4.findViewById(android.R.id.button3);
        c0106e.h = button3;
        button3.setOnClickListener(jVar);
        if (TextUtils.isEmpty(null)) {
            c0106e.h.setVisibility(8);
        } else {
            c0106e.h.setText((CharSequence) null);
            c0106e.h.setVisibility(0);
            i |= 4;
        }
        TypedValue typedValue = new TypedValue();
        c0106e.f2292a.getTheme().resolveAttribute(R.attr.alertDialogCenterButtons, typedValue, true);
        if (typedValue.data != 0) {
            if (i == 1) {
                Button button4 = c0106e.f2296f;
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button4.getLayoutParams();
                layoutParams.gravity = 1;
                layoutParams.weight = 0.5f;
                button4.setLayoutParams(layoutParams);
            } else if (i == 2) {
                Button button5 = c0106e.f2297g;
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) button5.getLayoutParams();
                layoutParams2.gravity = 1;
                layoutParams2.weight = 0.5f;
                button5.setLayoutParams(layoutParams2);
            } else if (i == 4) {
                Button button6 = c0106e.h;
                LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) button6.getLayoutParams();
                layoutParams3.gravity = 1;
                layoutParams3.weight = 0.5f;
                button6.setLayoutParams(layoutParams3);
            }
        }
        if (i == 0) {
            a4.setVisibility(8);
        }
        if (c0106e.f2302n != null) {
            a2.addView(c0106e.f2302n, 0, new ViewGroup.LayoutParams(-1, -2));
            window.findViewById(R.id.title_template).setVisibility(8);
        } else {
            c0106e.f2299k = (ImageView) window.findViewById(android.R.id.icon);
            if (TextUtils.isEmpty(c0106e.d) || !c0106e.f2309u) {
                window.findViewById(R.id.title_template).setVisibility(8);
                c0106e.f2299k.setVisibility(8);
                a2.setVisibility(8);
            } else {
                TextView textView2 = (TextView) window.findViewById(R.id.alertTitle);
                c0106e.f2300l = textView2;
                textView2.setText(c0106e.d);
                Drawable drawable = c0106e.f2298j;
                if (drawable != null) {
                    c0106e.f2299k.setImageDrawable(drawable);
                } else {
                    c0106e.f2300l.setPadding(c0106e.f2299k.getPaddingLeft(), c0106e.f2299k.getPaddingTop(), c0106e.f2299k.getPaddingRight(), c0106e.f2299k.getPaddingBottom());
                    c0106e.f2299k.setVisibility(8);
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
            NestedScrollView nestedScrollView2 = c0106e.i;
            if (nestedScrollView2 != null) {
                nestedScrollView2.setClipToPadding(true);
            }
            View findViewById9 = c0106e.f2295e != null ? a2.findViewById(R.id.titleDividerNoCustom) : null;
            if (findViewById9 != null) {
                findViewById9.setVisibility(0);
            }
        } else {
            View findViewById10 = a3.findViewById(R.id.textSpacerNoTitle);
            if (findViewById10 != null) {
                findViewById10.setVisibility(0);
            }
        }
        AlertController$RecycleListView alertController$RecycleListView = c0106e.f2295e;
        if (alertController$RecycleListView != null) {
            alertController$RecycleListView.getClass();
            if (!z3 || i2 == 0) {
                alertController$RecycleListView.setPadding(alertController$RecycleListView.getPaddingLeft(), i2 != 0 ? alertController$RecycleListView.getPaddingTop() : alertController$RecycleListView.f1313a, alertController$RecycleListView.getPaddingRight(), z3 ? alertController$RecycleListView.getPaddingBottom() : alertController$RecycleListView.f1314b);
            }
        }
        if (!z2) {
            View view = c0106e.f2295e;
            if (view == null) {
                view = c0106e.i;
            }
            if (view != null) {
                int i3 = (z3 ? 2 : 0) | i2;
                View findViewById11 = window.findViewById(R.id.scrollIndicatorUp);
                View findViewById12 = window.findViewById(R.id.scrollIndicatorDown);
                WeakHashMap weakHashMap = Q.f513a;
                M.G.d(view, i3, 3);
                if (findViewById11 != null) {
                    a3.removeView(findViewById11);
                }
                if (findViewById12 != null) {
                    a3.removeView(findViewById12);
                }
            }
        }
        AlertController$RecycleListView alertController$RecycleListView2 = c0106e.f2295e;
        if (alertController$RecycleListView2 == null || (listAdapter = c0106e.f2303o) == null) {
            return;
        }
        alertController$RecycleListView2.setAdapter(listAdapter);
        int i4 = c0106e.f2304p;
        if (i4 > -1) {
            alertController$RecycleListView2.setItemChecked(i4, true);
            alertController$RecycleListView2.setSelection(i4);
        }
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f2313f.i;
        if (nestedScrollView == null || !nestedScrollView.i(keyEvent)) {
            return super.onKeyDown(i, keyEvent);
        }
        return true;
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f2313f.i;
        if (nestedScrollView == null || !nestedScrollView.i(keyEvent)) {
            return super.onKeyUp(i, keyEvent);
        }
        return true;
    }

    @Override // a.m, android.app.Dialog
    public final void onStop() {
        super.onStop();
        LayoutInflaterFactory2C0101A layoutInflaterFactory2C0101A = (LayoutInflaterFactory2C0101A) e();
        layoutInflaterFactory2C0101A.z();
        K k2 = layoutInflaterFactory2C0101A.f2225o;
        if (k2 != null) {
            k2.f2277t = false;
            C0153j c0153j = k2.f2276s;
            if (c0153j != null) {
                c0153j.a();
            }
        }
    }

    @Override // a.m, android.app.Dialog
    public final void setContentView(int i) {
        g();
        e().g(i);
    }

    @Override // android.app.Dialog
    public final void setTitle(int i) {
        super.setTitle(i);
        e().j(getContext().getString(i));
    }

    @Override // a.m, android.app.Dialog
    public final void setContentView(View view) {
        g();
        e().h(view);
    }

    @Override // android.app.Dialog
    public final void setTitle(CharSequence charSequence) {
        j(charSequence);
        C0106e c0106e = this.f2313f;
        c0106e.d = charSequence;
        TextView textView = c0106e.f2300l;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    @Override // a.m, android.app.Dialog
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        g();
        e().i(view, layoutParams);
    }
}
