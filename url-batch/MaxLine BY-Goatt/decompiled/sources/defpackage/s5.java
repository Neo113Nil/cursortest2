package defpackage;

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
import com.majelw.libystne.R;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class s5 extends ay implements DialogInterface, ve {
    public qf q;
    public final rf r;
    public final q5 s;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Type inference failed for: r2v2, types: [rf] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public s5(ContextThemeWrapper contextThemeWrapper, int i) {
        super(contextThemeWrapper, r2);
        int i2;
        int g = g(contextThemeWrapper, i);
        if (g == 0) {
            TypedValue typedValue = new TypedValue();
            contextThemeWrapper.getTheme().resolveAttribute(R.attr.dialogTheme, typedValue, true);
            i2 = typedValue.resourceId;
        } else {
            i2 = g;
        }
        this.r = new y71() { // from class: rf
            @Override // defpackage.y71
            public final boolean superDispatchKeyEvent(KeyEvent keyEvent) {
                return s5.this.i(keyEvent);
            }
        };
        df d = d();
        if (g == 0) {
            TypedValue typedValue2 = new TypedValue();
            contextThemeWrapper.getTheme().resolveAttribute(R.attr.dialogTheme, typedValue2, true);
            g = typedValue2.resourceId;
        }
        ((qf) d).f0 = g;
        d.g();
        this.s = new q5(getContext(), this, getWindow());
    }

    public static int g(Context context, int i) {
        if (((i >>> 24) & 255) >= 1) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    @Override // defpackage.ay, android.app.Dialog
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        qf qfVar = (qf) d();
        qfVar.z();
        ((ViewGroup) qfVar.M.findViewById(android.R.id.content)).addView(view, layoutParams);
        qfVar.y.a(qfVar.x.getCallback());
    }

    public final df d() {
        if (this.q == null) {
            cf cfVar = df.m;
            this.q = new qf(getContext(), getWindow(), this, this);
        }
        return this.q;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        super.dismiss();
        d().h();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return s03.j(this.r, getWindow().getDecorView(), this, keyEvent);
    }

    public final void e() {
        ij2.l(getWindow().getDecorView(), this);
        uj2.d(getWindow().getDecorView(), this);
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        decorView.setTag(R.id.view_tree_on_back_pressed_dispatcher_owner, this);
    }

    public final void f(Bundle bundle) {
        d().c();
        super.onCreate(bundle);
        d().g();
    }

    @Override // android.app.Dialog
    public final View findViewById(int i) {
        qf qfVar = (qf) d();
        qfVar.z();
        return qfVar.x.findViewById(i);
    }

    public final void h(CharSequence charSequence) {
        super.setTitle(charSequence);
        d().o(charSequence);
    }

    public final boolean i(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Dialog
    public final void invalidateOptionsMenu() {
        d().d();
    }

    @Override // defpackage.ay, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        int i;
        ListAdapter listAdapter;
        View findViewById;
        f(bundle);
        q5 q5Var = this.s;
        q5Var.b.setContentView(q5Var.q);
        Context context = q5Var.a;
        Window window = q5Var.c;
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
        ViewGroup a = q5.a(findViewById6, findViewById3);
        ViewGroup a2 = q5.a(findViewById7, findViewById4);
        ViewGroup a3 = q5.a(findViewById8, findViewById5);
        NestedScrollView nestedScrollView = (NestedScrollView) window.findViewById(R.id.scrollView);
        q5Var.i = nestedScrollView;
        nestedScrollView.setFocusable(false);
        q5Var.i.setNestedScrollingEnabled(false);
        TextView textView = (TextView) a2.findViewById(android.R.id.message);
        q5Var.m = textView;
        if (textView != null) {
            textView.setVisibility(8);
            q5Var.i.removeView(q5Var.m);
            if (q5Var.e != null) {
                ViewGroup viewGroup2 = (ViewGroup) q5Var.i.getParent();
                int indexOfChild = viewGroup2.indexOfChild(q5Var.i);
                viewGroup2.removeViewAt(indexOfChild);
                viewGroup2.addView(q5Var.e, indexOfChild, new ViewGroup.LayoutParams(-1, -1));
            } else {
                a2.setVisibility(8);
            }
        }
        Button button = (Button) a3.findViewById(android.R.id.button1);
        q5Var.f = button;
        s2 s2Var = q5Var.w;
        button.setOnClickListener(s2Var);
        boolean isEmpty = TextUtils.isEmpty(null);
        Button button2 = q5Var.f;
        if (isEmpty) {
            button2.setVisibility(8);
            i = 0;
        } else {
            button2.setText((CharSequence) null);
            q5Var.f.setVisibility(0);
            i = 1;
        }
        Button button3 = (Button) a3.findViewById(android.R.id.button2);
        q5Var.g = button3;
        button3.setOnClickListener(s2Var);
        boolean isEmpty2 = TextUtils.isEmpty(null);
        Button button4 = q5Var.g;
        if (isEmpty2) {
            button4.setVisibility(8);
        } else {
            button4.setText((CharSequence) null);
            q5Var.g.setVisibility(0);
            i |= 2;
        }
        Button button5 = (Button) a3.findViewById(android.R.id.button3);
        q5Var.h = button5;
        button5.setOnClickListener(s2Var);
        boolean isEmpty3 = TextUtils.isEmpty(null);
        Button button6 = q5Var.h;
        if (isEmpty3) {
            button6.setVisibility(8);
        } else {
            button6.setText((CharSequence) null);
            q5Var.h.setVisibility(0);
            i |= 4;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogCenterButtons, typedValue, true);
        if (typedValue.data != 0) {
            if (i == 1) {
                Button button7 = q5Var.f;
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button7.getLayoutParams();
                layoutParams.gravity = 1;
                layoutParams.weight = 0.5f;
                button7.setLayoutParams(layoutParams);
            } else if (i == 2) {
                Button button8 = q5Var.g;
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) button8.getLayoutParams();
                layoutParams2.gravity = 1;
                layoutParams2.weight = 0.5f;
                button8.setLayoutParams(layoutParams2);
            } else if (i == 4) {
                Button button9 = q5Var.h;
                LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) button9.getLayoutParams();
                layoutParams3.gravity = 1;
                layoutParams3.weight = 0.5f;
                button9.setLayoutParams(layoutParams3);
            }
        }
        if (i == 0) {
            a3.setVisibility(8);
        }
        if (q5Var.n != null) {
            a.addView(q5Var.n, 0, new ViewGroup.LayoutParams(-1, -2));
            window.findViewById(R.id.title_template).setVisibility(8);
        } else {
            q5Var.k = (ImageView) window.findViewById(android.R.id.icon);
            if (TextUtils.isEmpty(q5Var.d) || !q5Var.u) {
                window.findViewById(R.id.title_template).setVisibility(8);
                q5Var.k.setVisibility(8);
                a.setVisibility(8);
            } else {
                TextView textView2 = (TextView) window.findViewById(R.id.alertTitle);
                q5Var.l = textView2;
                textView2.setText(q5Var.d);
                Drawable drawable = q5Var.j;
                if (drawable != null) {
                    q5Var.k.setImageDrawable(drawable);
                } else {
                    q5Var.l.setPadding(q5Var.k.getPaddingLeft(), q5Var.k.getPaddingTop(), q5Var.k.getPaddingRight(), q5Var.k.getPaddingBottom());
                    q5Var.k.setVisibility(8);
                }
            }
        }
        boolean z = viewGroup.getVisibility() != 8;
        int i2 = (a == null || a.getVisibility() == 8) ? 0 : 1;
        boolean z2 = a3.getVisibility() != 8;
        if (!z2 && (findViewById = a2.findViewById(R.id.textSpacerNoButtons)) != null) {
            findViewById.setVisibility(0);
        }
        if (i2 != 0) {
            NestedScrollView nestedScrollView2 = q5Var.i;
            if (nestedScrollView2 != null) {
                nestedScrollView2.setClipToPadding(true);
            }
            View findViewById9 = q5Var.e != null ? a.findViewById(R.id.titleDividerNoCustom) : null;
            if (findViewById9 != null) {
                findViewById9.setVisibility(0);
            }
        } else {
            View findViewById10 = a2.findViewById(R.id.textSpacerNoTitle);
            if (findViewById10 != null) {
                findViewById10.setVisibility(0);
            }
        }
        AlertController$RecycleListView alertController$RecycleListView = q5Var.e;
        if (alertController$RecycleListView != null && (!z2 || i2 == 0)) {
            alertController$RecycleListView.setPadding(alertController$RecycleListView.getPaddingLeft(), i2 != 0 ? alertController$RecycleListView.getPaddingTop() : alertController$RecycleListView.m, alertController$RecycleListView.getPaddingRight(), z2 ? alertController$RecycleListView.getPaddingBottom() : alertController$RecycleListView.n);
        }
        if (!z) {
            View view = q5Var.e;
            if (view == null) {
                view = q5Var.i;
            }
            if (view != null) {
                int i3 = z2 ? 2 : 0;
                View findViewById11 = window.findViewById(R.id.scrollIndicatorUp);
                View findViewById12 = window.findViewById(R.id.scrollIndicatorDown);
                WeakHashMap weakHashMap = e53.a;
                view.setScrollIndicators(i2 | i3, 3);
                if (findViewById11 != null) {
                    a2.removeView(findViewById11);
                }
                if (findViewById12 != null) {
                    a2.removeView(findViewById12);
                }
            }
        }
        AlertController$RecycleListView alertController$RecycleListView2 = q5Var.e;
        if (alertController$RecycleListView2 == null || (listAdapter = q5Var.o) == null) {
            return;
        }
        alertController$RecycleListView2.setAdapter(listAdapter);
        int i4 = q5Var.p;
        if (i4 > -1) {
            alertController$RecycleListView2.setItemChecked(i4, true);
            alertController$RecycleListView2.setSelection(i4);
        }
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.s.i;
        if (nestedScrollView == null || !nestedScrollView.j(keyEvent)) {
            return super.onKeyDown(i, keyEvent);
        }
        return true;
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.s.i;
        if (nestedScrollView == null || !nestedScrollView.j(keyEvent)) {
            return super.onKeyUp(i, keyEvent);
        }
        return true;
    }

    @Override // defpackage.ay, android.app.Dialog
    public final void onStop() {
        super.onStop();
        qf qfVar = (qf) d();
        qfVar.D();
        w63 w63Var = qfVar.z;
        if (w63Var != null) {
            w63Var.t = false;
            x53 x53Var = w63Var.s;
            if (x53Var != null) {
                x53Var.a();
            }
        }
    }

    @Override // defpackage.ay, android.app.Dialog
    public final void setContentView(int i) {
        e();
        d().l(i);
    }

    @Override // android.app.Dialog
    public final void setTitle(int i) {
        super.setTitle(i);
        d().o(getContext().getString(i));
    }

    @Override // defpackage.ay, android.app.Dialog
    public final void setContentView(View view) {
        e();
        d().m(view);
    }

    @Override // defpackage.ay, android.app.Dialog
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        e();
        d().n(view, layoutParams);
    }

    @Override // android.app.Dialog
    public final void setTitle(CharSequence charSequence) {
        h(charSequence);
        q5 q5Var = this.s;
        q5Var.d = charSequence;
        TextView textView = q5Var.l;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }
}
