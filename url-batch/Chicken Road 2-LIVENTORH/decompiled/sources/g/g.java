package g;

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
import com.oriondriftchasers.arordrft.R;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class g extends a.o implements DialogInterface, k {

    /* renamed from: j, reason: collision with root package name */
    public c0 f1640j;

    /* renamed from: k, reason: collision with root package name */
    public final d0 f1641k;

    /* renamed from: l, reason: collision with root package name */
    public final e f1642l;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Type inference failed for: r2v2, types: [g.d0] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public g(ContextThemeWrapper contextThemeWrapper, int i) {
        super(contextThemeWrapper, r2);
        int i4;
        int h4 = h(contextThemeWrapper, i);
        if (h4 == 0) {
            TypedValue typedValue = new TypedValue();
            contextThemeWrapper.getTheme().resolveAttribute(R.attr.dialogTheme, typedValue, true);
            i4 = typedValue.resourceId;
        } else {
            i4 = h4;
        }
        this.f1641k = new n0.i() { // from class: g.d0
            @Override // n0.i
            public final boolean c(KeyEvent keyEvent) {
                return g.this.j(keyEvent);
            }
        };
        p f2 = f();
        if (h4 == 0) {
            TypedValue typedValue2 = new TypedValue();
            contextThemeWrapper.getTheme().resolveAttribute(R.attr.dialogTheme, typedValue2, true);
            h4 = typedValue2.resourceId;
        }
        ((c0) f2).Y = h4;
        f2.c();
        this.f1642l = new e(getContext(), this, getWindow());
    }

    public static int h(Context context, int i) {
        if (((i >>> 24) & 255) >= 1) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    @Override // a.o, android.app.Dialog
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        d();
        c0 c0Var = (c0) f();
        c0Var.u();
        ((ViewGroup) c0Var.F.findViewById(android.R.id.content)).addView(view, layoutParams);
        c0Var.f1597r.a(c0Var.f1596q.getCallback());
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        super.dismiss();
        f().d();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return h.a.r(this.f1641k, getWindow().getDecorView(), this, keyEvent);
    }

    public final p f() {
        if (this.f1640j == null) {
            n nVar = p.f1676f;
            this.f1640j = new c0(getContext(), getWindow(), this, this);
        }
        return this.f1640j;
    }

    @Override // android.app.Dialog
    public final View findViewById(int i) {
        c0 c0Var = (c0) f();
        c0Var.u();
        return c0Var.f1596q.findViewById(i);
    }

    public final void g(Bundle bundle) {
        f().a();
        super.onCreate(bundle);
        f().c();
    }

    public final void i(CharSequence charSequence) {
        super.setTitle(charSequence);
        f().j(charSequence);
    }

    @Override // android.app.Dialog
    public final void invalidateOptionsMenu() {
        c0 c0Var = (c0) f();
        if (c0Var.f1599t != null) {
            c0Var.z();
            c0Var.f1599t.getClass();
            c0Var.A(0);
        }
    }

    public final boolean j(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // a.o, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        int i;
        ListAdapter listAdapter;
        View findViewById;
        g(bundle);
        e eVar = this.f1642l;
        eVar.f1608b.setContentView(eVar.f1621q);
        Context context = eVar.f1607a;
        Window window = eVar.f1609c;
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
        ViewGroup a2 = e.a(findViewById6, findViewById3);
        ViewGroup a4 = e.a(findViewById7, findViewById4);
        ViewGroup a5 = e.a(findViewById8, findViewById5);
        NestedScrollView nestedScrollView = (NestedScrollView) window.findViewById(R.id.scrollView);
        eVar.i = nestedScrollView;
        nestedScrollView.setFocusable(false);
        eVar.i.setNestedScrollingEnabled(false);
        TextView textView = (TextView) a4.findViewById(android.R.id.message);
        eVar.f1617m = textView;
        if (textView != null) {
            textView.setVisibility(8);
            eVar.i.removeView(eVar.f1617m);
            if (eVar.f1610e != null) {
                ViewGroup viewGroup2 = (ViewGroup) eVar.i.getParent();
                int indexOfChild = viewGroup2.indexOfChild(eVar.i);
                viewGroup2.removeViewAt(indexOfChild);
                viewGroup2.addView(eVar.f1610e, indexOfChild, new ViewGroup.LayoutParams(-1, -1));
            } else {
                a4.setVisibility(8);
            }
        }
        Button button = (Button) a5.findViewById(android.R.id.button1);
        eVar.f1611f = button;
        com.google.android.material.datepicker.l lVar = eVar.f1627w;
        button.setOnClickListener(lVar);
        if (TextUtils.isEmpty(null)) {
            eVar.f1611f.setVisibility(8);
            i = 0;
        } else {
            eVar.f1611f.setText((CharSequence) null);
            eVar.f1611f.setVisibility(0);
            i = 1;
        }
        Button button2 = (Button) a5.findViewById(android.R.id.button2);
        eVar.f1612g = button2;
        button2.setOnClickListener(lVar);
        if (TextUtils.isEmpty(null)) {
            eVar.f1612g.setVisibility(8);
        } else {
            eVar.f1612g.setText((CharSequence) null);
            eVar.f1612g.setVisibility(0);
            i |= 2;
        }
        Button button3 = (Button) a5.findViewById(android.R.id.button3);
        eVar.f1613h = button3;
        button3.setOnClickListener(lVar);
        if (TextUtils.isEmpty(null)) {
            eVar.f1613h.setVisibility(8);
        } else {
            eVar.f1613h.setText((CharSequence) null);
            eVar.f1613h.setVisibility(0);
            i |= 4;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogCenterButtons, typedValue, true);
        if (typedValue.data != 0) {
            if (i == 1) {
                Button button4 = eVar.f1611f;
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button4.getLayoutParams();
                layoutParams.gravity = 1;
                layoutParams.weight = 0.5f;
                button4.setLayoutParams(layoutParams);
            } else if (i == 2) {
                Button button5 = eVar.f1612g;
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) button5.getLayoutParams();
                layoutParams2.gravity = 1;
                layoutParams2.weight = 0.5f;
                button5.setLayoutParams(layoutParams2);
            } else if (i == 4) {
                Button button6 = eVar.f1613h;
                LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) button6.getLayoutParams();
                layoutParams3.gravity = 1;
                layoutParams3.weight = 0.5f;
                button6.setLayoutParams(layoutParams3);
            }
        }
        if (i == 0) {
            a5.setVisibility(8);
        }
        if (eVar.f1618n != null) {
            a2.addView(eVar.f1618n, 0, new ViewGroup.LayoutParams(-1, -2));
            window.findViewById(R.id.title_template).setVisibility(8);
        } else {
            eVar.f1615k = (ImageView) window.findViewById(android.R.id.icon);
            if (TextUtils.isEmpty(eVar.d) || !eVar.f1625u) {
                window.findViewById(R.id.title_template).setVisibility(8);
                eVar.f1615k.setVisibility(8);
                a2.setVisibility(8);
            } else {
                TextView textView2 = (TextView) window.findViewById(R.id.alertTitle);
                eVar.f1616l = textView2;
                textView2.setText(eVar.d);
                Drawable drawable = eVar.f1614j;
                if (drawable != null) {
                    eVar.f1615k.setImageDrawable(drawable);
                } else {
                    eVar.f1616l.setPadding(eVar.f1615k.getPaddingLeft(), eVar.f1615k.getPaddingTop(), eVar.f1615k.getPaddingRight(), eVar.f1615k.getPaddingBottom());
                    eVar.f1615k.setVisibility(8);
                }
            }
        }
        boolean z3 = viewGroup.getVisibility() != 8;
        int i4 = (a2 == null || a2.getVisibility() == 8) ? 0 : 1;
        boolean z4 = a5.getVisibility() != 8;
        if (!z4 && (findViewById = a4.findViewById(R.id.textSpacerNoButtons)) != null) {
            findViewById.setVisibility(0);
        }
        if (i4 != 0) {
            NestedScrollView nestedScrollView2 = eVar.i;
            if (nestedScrollView2 != null) {
                nestedScrollView2.setClipToPadding(true);
            }
            View findViewById9 = eVar.f1610e != null ? a2.findViewById(R.id.titleDividerNoCustom) : null;
            if (findViewById9 != null) {
                findViewById9.setVisibility(0);
            }
        } else {
            View findViewById10 = a4.findViewById(R.id.textSpacerNoTitle);
            if (findViewById10 != null) {
                findViewById10.setVisibility(0);
            }
        }
        AlertController$RecycleListView alertController$RecycleListView = eVar.f1610e;
        if (alertController$RecycleListView != null && (!z4 || i4 == 0)) {
            alertController$RecycleListView.setPadding(alertController$RecycleListView.getPaddingLeft(), i4 != 0 ? alertController$RecycleListView.getPaddingTop() : alertController$RecycleListView.f120f, alertController$RecycleListView.getPaddingRight(), z4 ? alertController$RecycleListView.getPaddingBottom() : alertController$RecycleListView.f121g);
        }
        if (!z3) {
            View view = eVar.f1610e;
            if (view == null) {
                view = eVar.i;
            }
            if (view != null) {
                int i5 = z4 ? 2 : 0;
                View findViewById11 = window.findViewById(R.id.scrollIndicatorUp);
                View findViewById12 = window.findViewById(R.id.scrollIndicatorDown);
                WeakHashMap weakHashMap = n0.l0.f2757a;
                n0.e0.b(view, i4 | i5, 3);
                if (findViewById11 != null) {
                    a4.removeView(findViewById11);
                }
                if (findViewById12 != null) {
                    a4.removeView(findViewById12);
                }
            }
        }
        AlertController$RecycleListView alertController$RecycleListView2 = eVar.f1610e;
        if (alertController$RecycleListView2 == null || (listAdapter = eVar.f1619o) == null) {
            return;
        }
        alertController$RecycleListView2.setAdapter(listAdapter);
        int i6 = eVar.f1620p;
        if (i6 > -1) {
            alertController$RecycleListView2.setItemChecked(i6, true);
            alertController$RecycleListView2.setSelection(i6);
        }
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f1642l.i;
        if (nestedScrollView == null || !nestedScrollView.i(keyEvent)) {
            return super.onKeyDown(i, keyEvent);
        }
        return true;
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f1642l.i;
        if (nestedScrollView == null || !nestedScrollView.i(keyEvent)) {
            return super.onKeyUp(i, keyEvent);
        }
        return true;
    }

    @Override // a.o, android.app.Dialog
    public final void onStop() {
        super.onStop();
        c0 c0Var = (c0) f();
        c0Var.z();
        m0 m0Var = c0Var.f1599t;
        if (m0Var != null) {
            m0Var.G = false;
            j.j jVar = m0Var.F;
            if (jVar != null) {
                jVar.a();
            }
        }
    }

    @Override // a.o, android.app.Dialog
    public final void setContentView(int i) {
        d();
        f().g(i);
    }

    @Override // android.app.Dialog
    public final void setTitle(int i) {
        super.setTitle(i);
        f().j(getContext().getString(i));
    }

    @Override // a.o, android.app.Dialog
    public final void setContentView(View view) {
        d();
        f().h(view);
    }

    @Override // android.app.Dialog
    public final void setTitle(CharSequence charSequence) {
        i(charSequence);
        e eVar = this.f1642l;
        eVar.d = charSequence;
        TextView textView = eVar.f1616l;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    @Override // a.o, android.app.Dialog
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        d();
        f().i(view, layoutParams);
    }
}
