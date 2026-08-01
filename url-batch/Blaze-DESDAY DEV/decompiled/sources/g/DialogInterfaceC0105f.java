package g;

import K.InterfaceC0013k;
import K.T;
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
import com.winworm.neongrid.R;
import java.util.WeakHashMap;

/* renamed from: g.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class DialogInterfaceC0105f extends a.m implements DialogInterface, InterfaceC0109j {
    public LayoutInflaterFactory2C0092A d;

    /* renamed from: e, reason: collision with root package name */
    public final C0093B f2250e;

    /* renamed from: f, reason: collision with root package name */
    public final C0104e f2251f;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Type inference failed for: r2v2, types: [g.B] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public DialogInterfaceC0105f(ContextThemeWrapper contextThemeWrapper, int i) {
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
        this.f2250e = new InterfaceC0013k() { // from class: g.B
            @Override // K.InterfaceC0013k
            public final boolean d(KeyEvent keyEvent) {
                return DialogInterfaceC0105f.this.k(keyEvent);
            }
        };
        o f2 = f();
        if (i3 == 0) {
            TypedValue typedValue2 = new TypedValue();
            contextThemeWrapper.getTheme().resolveAttribute(R.attr.dialogTheme, typedValue2, true);
            i3 = typedValue2.resourceId;
        }
        ((LayoutInflaterFactory2C0092A) f2).f2144U = i3;
        f2.c();
        this.f2251f = new C0104e(getContext(), this, getWindow());
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
        LayoutInflaterFactory2C0092A layoutInflaterFactory2C0092A = (LayoutInflaterFactory2C0092A) f();
        layoutInflaterFactory2C0092A.v();
        ((ViewGroup) layoutInflaterFactory2C0092A.f2126B.findViewById(android.R.id.content)).addView(view, layoutParams);
        layoutInflaterFactory2C0092A.f2161m.a(layoutInflaterFactory2C0092A.f2160l.getCallback());
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        super.dismiss();
        f().d();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return z1.l.r(this.f2250e, getWindow().getDecorView(), this, keyEvent);
    }

    public final o f() {
        if (this.d == null) {
            m mVar = o.f2264a;
            this.d = new LayoutInflaterFactory2C0092A(getContext(), getWindow(), this, this);
        }
        return this.d;
    }

    @Override // android.app.Dialog
    public final View findViewById(int i) {
        LayoutInflaterFactory2C0092A layoutInflaterFactory2C0092A = (LayoutInflaterFactory2C0092A) f();
        layoutInflaterFactory2C0092A.v();
        return layoutInflaterFactory2C0092A.f2160l.findViewById(i);
    }

    public final void g() {
        androidx.lifecycle.H.f(getWindow().getDecorView(), this);
        i0.g.p(getWindow().getDecorView(), this);
        z1.l.S(getWindow().getDecorView(), this);
    }

    public final void h(Bundle bundle) {
        f().a();
        super.onCreate(bundle);
        f().c();
    }

    @Override // android.app.Dialog
    public final void invalidateOptionsMenu() {
        LayoutInflaterFactory2C0092A layoutInflaterFactory2C0092A = (LayoutInflaterFactory2C0092A) f();
        if (layoutInflaterFactory2C0092A.f2163o != null) {
            layoutInflaterFactory2C0092A.z();
            layoutInflaterFactory2C0092A.f2163o.getClass();
            layoutInflaterFactory2C0092A.A(0);
        }
    }

    public final void j(CharSequence charSequence) {
        super.setTitle(charSequence);
        f().j(charSequence);
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
        C0104e c0104e = this.f2251f;
        c0104e.f2231b.setContentView(c0104e.f2243q);
        Window window = c0104e.f2232c;
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
        ViewGroup a2 = C0104e.a(findViewById6, findViewById3);
        ViewGroup a3 = C0104e.a(findViewById7, findViewById4);
        ViewGroup a4 = C0104e.a(findViewById8, findViewById5);
        NestedScrollView nestedScrollView = (NestedScrollView) window.findViewById(R.id.scrollView);
        c0104e.i = nestedScrollView;
        nestedScrollView.setFocusable(false);
        c0104e.i.setNestedScrollingEnabled(false);
        TextView textView = (TextView) a3.findViewById(android.R.id.message);
        c0104e.f2239m = textView;
        if (textView != null) {
            textView.setVisibility(8);
            c0104e.i.removeView(c0104e.f2239m);
            if (c0104e.f2233e != null) {
                ViewGroup viewGroup2 = (ViewGroup) c0104e.i.getParent();
                int indexOfChild = viewGroup2.indexOfChild(c0104e.i);
                viewGroup2.removeViewAt(indexOfChild);
                viewGroup2.addView(c0104e.f2233e, indexOfChild, new ViewGroup.LayoutParams(-1, -1));
            } else {
                a3.setVisibility(8);
            }
        }
        Button button = (Button) a4.findViewById(android.R.id.button1);
        c0104e.f2234f = button;
        com.google.android.material.datepicker.j jVar = c0104e.f2249w;
        button.setOnClickListener(jVar);
        if (TextUtils.isEmpty(null)) {
            c0104e.f2234f.setVisibility(8);
            i = 0;
        } else {
            c0104e.f2234f.setText((CharSequence) null);
            c0104e.f2234f.setVisibility(0);
            i = 1;
        }
        Button button2 = (Button) a4.findViewById(android.R.id.button2);
        c0104e.f2235g = button2;
        button2.setOnClickListener(jVar);
        if (TextUtils.isEmpty(null)) {
            c0104e.f2235g.setVisibility(8);
        } else {
            c0104e.f2235g.setText((CharSequence) null);
            c0104e.f2235g.setVisibility(0);
            i |= 2;
        }
        Button button3 = (Button) a4.findViewById(android.R.id.button3);
        c0104e.h = button3;
        button3.setOnClickListener(jVar);
        if (TextUtils.isEmpty(null)) {
            c0104e.h.setVisibility(8);
        } else {
            c0104e.h.setText((CharSequence) null);
            c0104e.h.setVisibility(0);
            i |= 4;
        }
        TypedValue typedValue = new TypedValue();
        c0104e.f2230a.getTheme().resolveAttribute(R.attr.alertDialogCenterButtons, typedValue, true);
        if (typedValue.data != 0) {
            if (i == 1) {
                Button button4 = c0104e.f2234f;
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button4.getLayoutParams();
                layoutParams.gravity = 1;
                layoutParams.weight = 0.5f;
                button4.setLayoutParams(layoutParams);
            } else if (i == 2) {
                Button button5 = c0104e.f2235g;
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) button5.getLayoutParams();
                layoutParams2.gravity = 1;
                layoutParams2.weight = 0.5f;
                button5.setLayoutParams(layoutParams2);
            } else if (i == 4) {
                Button button6 = c0104e.h;
                LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) button6.getLayoutParams();
                layoutParams3.gravity = 1;
                layoutParams3.weight = 0.5f;
                button6.setLayoutParams(layoutParams3);
            }
        }
        if (i == 0) {
            a4.setVisibility(8);
        }
        if (c0104e.f2240n != null) {
            a2.addView(c0104e.f2240n, 0, new ViewGroup.LayoutParams(-1, -2));
            window.findViewById(R.id.title_template).setVisibility(8);
        } else {
            c0104e.f2237k = (ImageView) window.findViewById(android.R.id.icon);
            if (TextUtils.isEmpty(c0104e.d) || !c0104e.f2247u) {
                window.findViewById(R.id.title_template).setVisibility(8);
                c0104e.f2237k.setVisibility(8);
                a2.setVisibility(8);
            } else {
                TextView textView2 = (TextView) window.findViewById(R.id.alertTitle);
                c0104e.f2238l = textView2;
                textView2.setText(c0104e.d);
                Drawable drawable = c0104e.f2236j;
                if (drawable != null) {
                    c0104e.f2237k.setImageDrawable(drawable);
                } else {
                    c0104e.f2238l.setPadding(c0104e.f2237k.getPaddingLeft(), c0104e.f2237k.getPaddingTop(), c0104e.f2237k.getPaddingRight(), c0104e.f2237k.getPaddingBottom());
                    c0104e.f2237k.setVisibility(8);
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
            NestedScrollView nestedScrollView2 = c0104e.i;
            if (nestedScrollView2 != null) {
                nestedScrollView2.setClipToPadding(true);
            }
            View findViewById9 = c0104e.f2233e != null ? a2.findViewById(R.id.titleDividerNoCustom) : null;
            if (findViewById9 != null) {
                findViewById9.setVisibility(0);
            }
        } else {
            View findViewById10 = a3.findViewById(R.id.textSpacerNoTitle);
            if (findViewById10 != null) {
                findViewById10.setVisibility(0);
            }
        }
        AlertController$RecycleListView alertController$RecycleListView = c0104e.f2233e;
        if (alertController$RecycleListView != null) {
            alertController$RecycleListView.getClass();
            if (!z3 || i2 == 0) {
                alertController$RecycleListView.setPadding(alertController$RecycleListView.getPaddingLeft(), i2 != 0 ? alertController$RecycleListView.getPaddingTop() : alertController$RecycleListView.f1256a, alertController$RecycleListView.getPaddingRight(), z3 ? alertController$RecycleListView.getPaddingBottom() : alertController$RecycleListView.f1257b);
            }
        }
        if (!z2) {
            View view = c0104e.f2233e;
            if (view == null) {
                view = c0104e.i;
            }
            if (view != null) {
                int i3 = (z3 ? 2 : 0) | i2;
                View findViewById11 = window.findViewById(R.id.scrollIndicatorUp);
                View findViewById12 = window.findViewById(R.id.scrollIndicatorDown);
                WeakHashMap weakHashMap = T.f440a;
                K.I.d(view, i3, 3);
                if (findViewById11 != null) {
                    a3.removeView(findViewById11);
                }
                if (findViewById12 != null) {
                    a3.removeView(findViewById12);
                }
            }
        }
        AlertController$RecycleListView alertController$RecycleListView2 = c0104e.f2233e;
        if (alertController$RecycleListView2 == null || (listAdapter = c0104e.f2241o) == null) {
            return;
        }
        alertController$RecycleListView2.setAdapter(listAdapter);
        int i4 = c0104e.f2242p;
        if (i4 > -1) {
            alertController$RecycleListView2.setItemChecked(i4, true);
            alertController$RecycleListView2.setSelection(i4);
        }
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f2251f.i;
        if (nestedScrollView == null || !nestedScrollView.i(keyEvent)) {
            return super.onKeyDown(i, keyEvent);
        }
        return true;
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f2251f.i;
        if (nestedScrollView == null || !nestedScrollView.i(keyEvent)) {
            return super.onKeyUp(i, keyEvent);
        }
        return true;
    }

    @Override // a.m, android.app.Dialog
    public final void onStop() {
        super.onStop();
        LayoutInflaterFactory2C0092A layoutInflaterFactory2C0092A = (LayoutInflaterFactory2C0092A) f();
        layoutInflaterFactory2C0092A.z();
        K k2 = layoutInflaterFactory2C0092A.f2163o;
        if (k2 != null) {
            k2.f2215t = false;
            j.j jVar = k2.f2214s;
            if (jVar != null) {
                jVar.a();
            }
        }
    }

    @Override // a.m, android.app.Dialog
    public final void setContentView(int i) {
        g();
        f().g(i);
    }

    @Override // android.app.Dialog
    public final void setTitle(int i) {
        super.setTitle(i);
        f().j(getContext().getString(i));
    }

    @Override // a.m, android.app.Dialog
    public final void setContentView(View view) {
        g();
        f().h(view);
    }

    @Override // android.app.Dialog
    public final void setTitle(CharSequence charSequence) {
        j(charSequence);
        C0104e c0104e = this.f2251f;
        c0104e.d = charSequence;
        TextView textView = c0104e.f2238l;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    @Override // a.m, android.app.Dialog
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        g();
        f().i(view, layoutParams);
    }
}
