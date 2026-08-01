package f;

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
import com.gglhk.bofio.fortunetiger.R;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class g extends androidx.activity.q implements DialogInterface, j {

    /* renamed from: i, reason: collision with root package name */
    public b0 f1597i;

    /* renamed from: j, reason: collision with root package name */
    public final c0 f1598j;

    /* renamed from: k, reason: collision with root package name */
    public final e f1599k;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Type inference failed for: r2v2, types: [f.c0] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public g(ContextThemeWrapper contextThemeWrapper, int i4) {
        super(contextThemeWrapper, r2);
        int i5;
        int g = g(contextThemeWrapper, i4);
        if (g == 0) {
            TypedValue typedValue = new TypedValue();
            contextThemeWrapper.getTheme().resolveAttribute(R.attr.dialogTheme, typedValue, true);
            i5 = typedValue.resourceId;
        } else {
            i5 = g;
        }
        this.f1598j = new k0.i() { // from class: f.c0
            @Override // k0.i
            public final boolean b(KeyEvent keyEvent) {
                return g.this.i(keyEvent);
            }
        };
        p d4 = d();
        if (g == 0) {
            TypedValue typedValue2 = new TypedValue();
            contextThemeWrapper.getTheme().resolveAttribute(R.attr.dialogTheme, typedValue2, true);
            g = typedValue2.resourceId;
        }
        ((b0) d4).Z = g;
        d4.c();
        this.f1599k = new e(getContext(), this, getWindow());
    }

    public static int g(Context context, int i4) {
        if (((i4 >>> 24) & 255) >= 1) {
            return i4;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    @Override // androidx.activity.q, android.app.Dialog
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        c();
        b0 b0Var = (b0) d();
        b0Var.v();
        ((ViewGroup) b0Var.G.findViewById(android.R.id.content)).addView(view, layoutParams);
        b0Var.f1558r.a(b0Var.f1557q.getCallback());
    }

    public final p d() {
        if (this.f1597i == null) {
            n nVar = p.f1638f;
            this.f1597i = new b0(getContext(), getWindow(), this, this);
        }
        return this.f1597i;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        super.dismiss();
        d().d();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return k3.d.x(this.f1598j, getWindow().getDecorView(), this, keyEvent);
    }

    public final void e(Bundle bundle) {
        d().a();
        super.onCreate(bundle);
        d().c();
    }

    @Override // android.app.Dialog
    public final View findViewById(int i4) {
        b0 b0Var = (b0) d();
        b0Var.v();
        return b0Var.f1557q.findViewById(i4);
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
        b0 b0Var = (b0) d();
        if (b0Var.f1560t != null) {
            b0Var.z();
            b0Var.f1560t.getClass();
            b0Var.A(0);
        }
    }

    @Override // androidx.activity.q, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        int i4;
        ListAdapter listAdapter;
        View findViewById;
        e(bundle);
        e eVar = this.f1599k;
        eVar.f1572b.setContentView(eVar.f1584q);
        Context context = eVar.f1571a;
        Window window = eVar.c;
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
        ViewGroup a4 = e.a(findViewById6, findViewById3);
        ViewGroup a5 = e.a(findViewById7, findViewById4);
        ViewGroup a6 = e.a(findViewById8, findViewById5);
        NestedScrollView nestedScrollView = (NestedScrollView) window.findViewById(R.id.scrollView);
        eVar.f1576i = nestedScrollView;
        nestedScrollView.setFocusable(false);
        eVar.f1576i.setNestedScrollingEnabled(false);
        TextView textView = (TextView) a5.findViewById(android.R.id.message);
        eVar.f1580m = textView;
        if (textView != null) {
            textView.setVisibility(8);
            eVar.f1576i.removeView(eVar.f1580m);
            if (eVar.f1574e != null) {
                ViewGroup viewGroup2 = (ViewGroup) eVar.f1576i.getParent();
                int indexOfChild = viewGroup2.indexOfChild(eVar.f1576i);
                viewGroup2.removeViewAt(indexOfChild);
                viewGroup2.addView(eVar.f1574e, indexOfChild, new ViewGroup.LayoutParams(-1, -1));
            } else {
                a5.setVisibility(8);
            }
        }
        Button button = (Button) a6.findViewById(android.R.id.button1);
        eVar.f1575f = button;
        com.google.android.material.datepicker.k kVar = eVar.f1590w;
        button.setOnClickListener(kVar);
        if (TextUtils.isEmpty(null)) {
            eVar.f1575f.setVisibility(8);
            i4 = 0;
        } else {
            eVar.f1575f.setText((CharSequence) null);
            eVar.f1575f.setVisibility(0);
            i4 = 1;
        }
        Button button2 = (Button) a6.findViewById(android.R.id.button2);
        eVar.g = button2;
        button2.setOnClickListener(kVar);
        if (TextUtils.isEmpty(null)) {
            eVar.g.setVisibility(8);
        } else {
            eVar.g.setText((CharSequence) null);
            eVar.g.setVisibility(0);
            i4 |= 2;
        }
        Button button3 = (Button) a6.findViewById(android.R.id.button3);
        eVar.h = button3;
        button3.setOnClickListener(kVar);
        if (TextUtils.isEmpty(null)) {
            eVar.h.setVisibility(8);
        } else {
            eVar.h.setText((CharSequence) null);
            eVar.h.setVisibility(0);
            i4 |= 4;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogCenterButtons, typedValue, true);
        if (typedValue.data != 0) {
            if (i4 == 1) {
                Button button4 = eVar.f1575f;
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button4.getLayoutParams();
                layoutParams.gravity = 1;
                layoutParams.weight = 0.5f;
                button4.setLayoutParams(layoutParams);
            } else if (i4 == 2) {
                Button button5 = eVar.g;
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) button5.getLayoutParams();
                layoutParams2.gravity = 1;
                layoutParams2.weight = 0.5f;
                button5.setLayoutParams(layoutParams2);
            } else if (i4 == 4) {
                Button button6 = eVar.h;
                LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) button6.getLayoutParams();
                layoutParams3.gravity = 1;
                layoutParams3.weight = 0.5f;
                button6.setLayoutParams(layoutParams3);
            }
        }
        if (i4 == 0) {
            a6.setVisibility(8);
        }
        if (eVar.f1581n != null) {
            a4.addView(eVar.f1581n, 0, new ViewGroup.LayoutParams(-1, -2));
            window.findViewById(R.id.title_template).setVisibility(8);
        } else {
            eVar.f1578k = (ImageView) window.findViewById(android.R.id.icon);
            if (TextUtils.isEmpty(eVar.f1573d) || !eVar.f1588u) {
                window.findViewById(R.id.title_template).setVisibility(8);
                eVar.f1578k.setVisibility(8);
                a4.setVisibility(8);
            } else {
                TextView textView2 = (TextView) window.findViewById(R.id.alertTitle);
                eVar.f1579l = textView2;
                textView2.setText(eVar.f1573d);
                Drawable drawable = eVar.f1577j;
                if (drawable != null) {
                    eVar.f1578k.setImageDrawable(drawable);
                } else {
                    eVar.f1579l.setPadding(eVar.f1578k.getPaddingLeft(), eVar.f1578k.getPaddingTop(), eVar.f1578k.getPaddingRight(), eVar.f1578k.getPaddingBottom());
                    eVar.f1578k.setVisibility(8);
                }
            }
        }
        boolean z3 = viewGroup.getVisibility() != 8;
        int i5 = (a4 == null || a4.getVisibility() == 8) ? 0 : 1;
        boolean z4 = a6.getVisibility() != 8;
        if (!z4 && (findViewById = a5.findViewById(R.id.textSpacerNoButtons)) != null) {
            findViewById.setVisibility(0);
        }
        if (i5 != 0) {
            NestedScrollView nestedScrollView2 = eVar.f1576i;
            if (nestedScrollView2 != null) {
                nestedScrollView2.setClipToPadding(true);
            }
            View findViewById9 = eVar.f1574e != null ? a4.findViewById(R.id.titleDividerNoCustom) : null;
            if (findViewById9 != null) {
                findViewById9.setVisibility(0);
            }
        } else {
            View findViewById10 = a5.findViewById(R.id.textSpacerNoTitle);
            if (findViewById10 != null) {
                findViewById10.setVisibility(0);
            }
        }
        AlertController$RecycleListView alertController$RecycleListView = eVar.f1574e;
        if (alertController$RecycleListView != null && (!z4 || i5 == 0)) {
            alertController$RecycleListView.setPadding(alertController$RecycleListView.getPaddingLeft(), i5 != 0 ? alertController$RecycleListView.getPaddingTop() : alertController$RecycleListView.f147f, alertController$RecycleListView.getPaddingRight(), z4 ? alertController$RecycleListView.getPaddingBottom() : alertController$RecycleListView.g);
        }
        if (!z3) {
            View view = eVar.f1574e;
            if (view == null) {
                view = eVar.f1576i;
            }
            if (view != null) {
                int i6 = z4 ? 2 : 0;
                View findViewById11 = window.findViewById(R.id.scrollIndicatorUp);
                View findViewById12 = window.findViewById(R.id.scrollIndicatorDown);
                WeakHashMap weakHashMap = k0.j0.f2752a;
                k0.c0.b(view, i5 | i6, 3);
                if (findViewById11 != null) {
                    a5.removeView(findViewById11);
                }
                if (findViewById12 != null) {
                    a5.removeView(findViewById12);
                }
            }
        }
        AlertController$RecycleListView alertController$RecycleListView2 = eVar.f1574e;
        if (alertController$RecycleListView2 == null || (listAdapter = eVar.f1582o) == null) {
            return;
        }
        alertController$RecycleListView2.setAdapter(listAdapter);
        int i7 = eVar.f1583p;
        if (i7 > -1) {
            alertController$RecycleListView2.setItemChecked(i7, true);
            alertController$RecycleListView2.setSelection(i7);
        }
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i4, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f1599k.f1576i;
        if (nestedScrollView == null || !nestedScrollView.i(keyEvent)) {
            return super.onKeyDown(i4, keyEvent);
        }
        return true;
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i4, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f1599k.f1576i;
        if (nestedScrollView == null || !nestedScrollView.i(keyEvent)) {
            return super.onKeyUp(i4, keyEvent);
        }
        return true;
    }

    @Override // androidx.activity.q, android.app.Dialog
    public final void onStop() {
        super.onStop();
        b0 b0Var = (b0) d();
        b0Var.z();
        l0 l0Var = b0Var.f1560t;
        if (l0Var != null) {
            l0Var.f1634y = false;
            i.j jVar = l0Var.f1633x;
            if (jVar != null) {
                jVar.a();
            }
        }
    }

    @Override // androidx.activity.q, android.app.Dialog
    public final void setContentView(int i4) {
        c();
        d().g(i4);
    }

    @Override // android.app.Dialog
    public final void setTitle(int i4) {
        super.setTitle(i4);
        d().k(getContext().getString(i4));
    }

    @Override // androidx.activity.q, android.app.Dialog
    public final void setContentView(View view) {
        c();
        d().h(view);
    }

    @Override // android.app.Dialog
    public final void setTitle(CharSequence charSequence) {
        h(charSequence);
        e eVar = this.f1599k;
        eVar.f1573d = charSequence;
        TextView textView = eVar.f1579l;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    @Override // androidx.activity.q, android.app.Dialog
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        c();
        d().i(view, layoutParams);
    }
}
