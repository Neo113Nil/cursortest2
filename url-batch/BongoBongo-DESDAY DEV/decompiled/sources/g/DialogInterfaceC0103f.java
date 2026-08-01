package g;

import L.InterfaceC0013k;
import L.T;
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
import com.winfour.winrandom.R;
import h.AbstractC0112a;
import java.util.WeakHashMap;

/* renamed from: g.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class DialogInterfaceC0103f extends a.m implements DialogInterface, InterfaceC0107j {
    public A d;

    /* renamed from: e, reason: collision with root package name */
    public final B f2330e;

    /* renamed from: f, reason: collision with root package name */
    public final C0102e f2331f;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Type inference failed for: r2v2, types: [g.B] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public DialogInterfaceC0103f(ContextThemeWrapper contextThemeWrapper, int i) {
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
        this.f2330e = new InterfaceC0013k() { // from class: g.B
            @Override // L.InterfaceC0013k
            public final boolean e(KeyEvent keyEvent) {
                return DialogInterfaceC0103f.this.k(keyEvent);
            }
        };
        o f2 = f();
        if (i3 == 0) {
            TypedValue typedValue2 = new TypedValue();
            contextThemeWrapper.getTheme().resolveAttribute(R.attr.dialogTheme, typedValue2, true);
            i3 = typedValue2.resourceId;
        }
        ((A) f2).f2219U = i3;
        f2.c();
        this.f2331f = new C0102e(getContext(), this, getWindow());
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
        A a2 = (A) f();
        a2.v();
        ((ViewGroup) a2.f2201B.findViewById(android.R.id.content)).addView(view, layoutParams);
        a2.f2236m.a(a2.f2235l.getCallback());
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        super.dismiss();
        f().d();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return A1.d.z(this.f2330e, getWindow().getDecorView(), this, keyEvent);
    }

    public final o f() {
        if (this.d == null) {
            m mVar = o.f2344a;
            this.d = new A(getContext(), getWindow(), this, this);
        }
        return this.d;
    }

    @Override // android.app.Dialog
    public final View findViewById(int i) {
        A a2 = (A) f();
        a2.v();
        return a2.f2235l.findViewById(i);
    }

    public final void g() {
        androidx.lifecycle.H.f(getWindow().getDecorView(), this);
        AbstractC0112a.q(getWindow().getDecorView(), this);
        A1.m.c0(getWindow().getDecorView(), this);
    }

    public final void h(Bundle bundle) {
        f().a();
        super.onCreate(bundle);
        f().c();
    }

    @Override // android.app.Dialog
    public final void invalidateOptionsMenu() {
        A a2 = (A) f();
        if (a2.f2238o != null) {
            a2.z();
            a2.f2238o.getClass();
            a2.A(0);
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
        C0102e c0102e = this.f2331f;
        c0102e.f2310b.setContentView(c0102e.f2323q);
        Window window = c0102e.f2311c;
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
        ViewGroup a2 = C0102e.a(findViewById6, findViewById3);
        ViewGroup a3 = C0102e.a(findViewById7, findViewById4);
        ViewGroup a4 = C0102e.a(findViewById8, findViewById5);
        NestedScrollView nestedScrollView = (NestedScrollView) window.findViewById(R.id.scrollView);
        c0102e.i = nestedScrollView;
        nestedScrollView.setFocusable(false);
        c0102e.i.setNestedScrollingEnabled(false);
        TextView textView = (TextView) a3.findViewById(android.R.id.message);
        c0102e.f2319m = textView;
        if (textView != null) {
            textView.setVisibility(8);
            c0102e.i.removeView(c0102e.f2319m);
            if (c0102e.f2312e != null) {
                ViewGroup viewGroup2 = (ViewGroup) c0102e.i.getParent();
                int indexOfChild = viewGroup2.indexOfChild(c0102e.i);
                viewGroup2.removeViewAt(indexOfChild);
                viewGroup2.addView(c0102e.f2312e, indexOfChild, new ViewGroup.LayoutParams(-1, -1));
            } else {
                a3.setVisibility(8);
            }
        }
        Button button = (Button) a4.findViewById(android.R.id.button1);
        c0102e.f2313f = button;
        com.google.android.material.datepicker.j jVar = c0102e.f2329w;
        button.setOnClickListener(jVar);
        if (TextUtils.isEmpty(null)) {
            c0102e.f2313f.setVisibility(8);
            i = 0;
        } else {
            c0102e.f2313f.setText((CharSequence) null);
            c0102e.f2313f.setVisibility(0);
            i = 1;
        }
        Button button2 = (Button) a4.findViewById(android.R.id.button2);
        c0102e.f2314g = button2;
        button2.setOnClickListener(jVar);
        if (TextUtils.isEmpty(null)) {
            c0102e.f2314g.setVisibility(8);
        } else {
            c0102e.f2314g.setText((CharSequence) null);
            c0102e.f2314g.setVisibility(0);
            i |= 2;
        }
        Button button3 = (Button) a4.findViewById(android.R.id.button3);
        c0102e.f2315h = button3;
        button3.setOnClickListener(jVar);
        if (TextUtils.isEmpty(null)) {
            c0102e.f2315h.setVisibility(8);
        } else {
            c0102e.f2315h.setText((CharSequence) null);
            c0102e.f2315h.setVisibility(0);
            i |= 4;
        }
        TypedValue typedValue = new TypedValue();
        c0102e.f2309a.getTheme().resolveAttribute(R.attr.alertDialogCenterButtons, typedValue, true);
        if (typedValue.data != 0) {
            if (i == 1) {
                Button button4 = c0102e.f2313f;
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button4.getLayoutParams();
                layoutParams.gravity = 1;
                layoutParams.weight = 0.5f;
                button4.setLayoutParams(layoutParams);
            } else if (i == 2) {
                Button button5 = c0102e.f2314g;
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) button5.getLayoutParams();
                layoutParams2.gravity = 1;
                layoutParams2.weight = 0.5f;
                button5.setLayoutParams(layoutParams2);
            } else if (i == 4) {
                Button button6 = c0102e.f2315h;
                LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) button6.getLayoutParams();
                layoutParams3.gravity = 1;
                layoutParams3.weight = 0.5f;
                button6.setLayoutParams(layoutParams3);
            }
        }
        if (i == 0) {
            a4.setVisibility(8);
        }
        if (c0102e.f2320n != null) {
            a2.addView(c0102e.f2320n, 0, new ViewGroup.LayoutParams(-1, -2));
            window.findViewById(R.id.title_template).setVisibility(8);
        } else {
            c0102e.f2317k = (ImageView) window.findViewById(android.R.id.icon);
            if (TextUtils.isEmpty(c0102e.d) || !c0102e.f2327u) {
                window.findViewById(R.id.title_template).setVisibility(8);
                c0102e.f2317k.setVisibility(8);
                a2.setVisibility(8);
            } else {
                TextView textView2 = (TextView) window.findViewById(R.id.alertTitle);
                c0102e.f2318l = textView2;
                textView2.setText(c0102e.d);
                Drawable drawable = c0102e.f2316j;
                if (drawable != null) {
                    c0102e.f2317k.setImageDrawable(drawable);
                } else {
                    c0102e.f2318l.setPadding(c0102e.f2317k.getPaddingLeft(), c0102e.f2317k.getPaddingTop(), c0102e.f2317k.getPaddingRight(), c0102e.f2317k.getPaddingBottom());
                    c0102e.f2317k.setVisibility(8);
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
            NestedScrollView nestedScrollView2 = c0102e.i;
            if (nestedScrollView2 != null) {
                nestedScrollView2.setClipToPadding(true);
            }
            View findViewById9 = c0102e.f2312e != null ? a2.findViewById(R.id.titleDividerNoCustom) : null;
            if (findViewById9 != null) {
                findViewById9.setVisibility(0);
            }
        } else {
            View findViewById10 = a3.findViewById(R.id.textSpacerNoTitle);
            if (findViewById10 != null) {
                findViewById10.setVisibility(0);
            }
        }
        AlertController$RecycleListView alertController$RecycleListView = c0102e.f2312e;
        if (alertController$RecycleListView != null) {
            alertController$RecycleListView.getClass();
            if (!z3 || i2 == 0) {
                alertController$RecycleListView.setPadding(alertController$RecycleListView.getPaddingLeft(), i2 != 0 ? alertController$RecycleListView.getPaddingTop() : alertController$RecycleListView.f1305a, alertController$RecycleListView.getPaddingRight(), z3 ? alertController$RecycleListView.getPaddingBottom() : alertController$RecycleListView.f1306b);
            }
        }
        if (!z2) {
            View view = c0102e.f2312e;
            if (view == null) {
                view = c0102e.i;
            }
            if (view != null) {
                int i3 = (z3 ? 2 : 0) | i2;
                View findViewById11 = window.findViewById(R.id.scrollIndicatorUp);
                View findViewById12 = window.findViewById(R.id.scrollIndicatorDown);
                WeakHashMap weakHashMap = T.f490a;
                L.I.d(view, i3, 3);
                if (findViewById11 != null) {
                    a3.removeView(findViewById11);
                }
                if (findViewById12 != null) {
                    a3.removeView(findViewById12);
                }
            }
        }
        AlertController$RecycleListView alertController$RecycleListView2 = c0102e.f2312e;
        if (alertController$RecycleListView2 == null || (listAdapter = c0102e.f2321o) == null) {
            return;
        }
        alertController$RecycleListView2.setAdapter(listAdapter);
        int i4 = c0102e.f2322p;
        if (i4 > -1) {
            alertController$RecycleListView2.setItemChecked(i4, true);
            alertController$RecycleListView2.setSelection(i4);
        }
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f2331f.i;
        if (nestedScrollView == null || !nestedScrollView.i(keyEvent)) {
            return super.onKeyDown(i, keyEvent);
        }
        return true;
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f2331f.i;
        if (nestedScrollView == null || !nestedScrollView.i(keyEvent)) {
            return super.onKeyUp(i, keyEvent);
        }
        return true;
    }

    @Override // a.m, android.app.Dialog
    public final void onStop() {
        super.onStop();
        A a2 = (A) f();
        a2.z();
        K k2 = a2.f2238o;
        if (k2 != null) {
            k2.f2295x = false;
            k.j jVar = k2.f2294w;
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
        C0102e c0102e = this.f2331f;
        c0102e.d = charSequence;
        TextView textView = c0102e.f2318l;
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
