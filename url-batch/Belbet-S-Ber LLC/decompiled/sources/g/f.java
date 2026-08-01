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
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.app.AlertController$RecycleListView;
import androidx.core.widget.NestedScrollView;
import com.gdmhkmf.belbet.R;
import java.util.WeakHashMap;
import l.t1;
import n0.p0;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class f extends a.o implements DialogInterface, j {

    /* renamed from: j, reason: collision with root package name */
    public a0 f1515j;

    /* renamed from: k, reason: collision with root package name */
    public final b0 f1516k;

    /* renamed from: l, reason: collision with root package name */
    public final e f1517l;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Type inference failed for: r2v2, types: [g.b0] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public f(ContextThemeWrapper contextThemeWrapper, int i) {
        super(contextThemeWrapper, r2);
        int i4;
        int h = h(contextThemeWrapper, i);
        if (h == 0) {
            TypedValue typedValue = new TypedValue();
            contextThemeWrapper.getTheme().resolveAttribute(R.attr.dialogTheme, typedValue, true);
            i4 = typedValue.resourceId;
        } else {
            i4 = h;
        }
        this.f1516k = new n0.l() { // from class: g.b0
            @Override // n0.l
            public final boolean b(KeyEvent keyEvent) {
                return f.this.j(keyEvent);
            }
        };
        o e4 = e();
        if (h == 0) {
            TypedValue typedValue2 = new TypedValue();
            contextThemeWrapper.getTheme().resolveAttribute(R.attr.dialogTheme, typedValue2, true);
            h = typedValue2.resourceId;
        }
        ((a0) e4).Z = h;
        e4.c();
        this.f1517l = new e(getContext(), this, getWindow());
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
        a0 a0Var = (a0) e();
        a0Var.u();
        ((ViewGroup) a0Var.G.findViewById(android.R.id.content)).addView(view, layoutParams);
        a0Var.f1461r.a(a0Var.f1460q.getCallback());
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        super.dismiss();
        e().d();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return b4.d.t(this.f1516k, getWindow().getDecorView(), this, keyEvent);
    }

    public final o e() {
        if (this.f1515j == null) {
            m mVar = o.f1557f;
            this.f1515j = new a0(getContext(), getWindow(), this, this);
        }
        return this.f1515j;
    }

    @Override // android.app.Dialog
    public final View findViewById(int i) {
        a0 a0Var = (a0) e();
        a0Var.u();
        return a0Var.f1460q.findViewById(i);
    }

    public final void g(Bundle bundle) {
        e().a();
        super.onCreate(bundle);
        e().c();
    }

    public final void i(CharSequence charSequence) {
        super.setTitle(charSequence);
        e().j(charSequence);
    }

    @Override // android.app.Dialog
    public final void invalidateOptionsMenu() {
        a0 a0Var = (a0) e();
        if (a0Var.f1463t != null) {
            a0Var.y();
            a0Var.f1463t.getClass();
            a0Var.A(0);
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
        e eVar = this.f1517l;
        eVar.f1493b.setContentView(eVar.f1514z);
        Context context = eVar.f1492a;
        Window window = eVar.f1494c;
        View findViewById2 = window.findViewById(R.id.parentPanel);
        View findViewById3 = findViewById2.findViewById(R.id.topPanel);
        View findViewById4 = findViewById2.findViewById(R.id.contentPanel);
        View findViewById5 = findViewById2.findViewById(R.id.buttonPanel);
        ViewGroup viewGroup = (ViewGroup) findViewById2.findViewById(R.id.customPanel);
        View view = eVar.f1497g;
        if (view == null) {
            view = null;
        }
        boolean z4 = view != null;
        if (!z4 || !e.a(view)) {
            window.setFlags(131072, 131072);
        }
        if (z4) {
            FrameLayout frameLayout = (FrameLayout) window.findViewById(R.id.custom);
            frameLayout.addView(view, new ViewGroup.LayoutParams(-1, -1));
            if (eVar.h) {
                frameLayout.setPadding(0, 0, 0, 0);
            }
            if (eVar.f1496f != null) {
                ((LinearLayout.LayoutParams) ((t1) viewGroup.getLayoutParams())).weight = 0.0f;
            }
        } else {
            viewGroup.setVisibility(8);
        }
        View findViewById6 = viewGroup.findViewById(R.id.topPanel);
        View findViewById7 = viewGroup.findViewById(R.id.contentPanel);
        View findViewById8 = viewGroup.findViewById(R.id.buttonPanel);
        ViewGroup b2 = e.b(findViewById6, findViewById3);
        ViewGroup b5 = e.b(findViewById7, findViewById4);
        ViewGroup b6 = e.b(findViewById8, findViewById5);
        NestedScrollView nestedScrollView = (NestedScrollView) window.findViewById(R.id.scrollView);
        eVar.f1506r = nestedScrollView;
        nestedScrollView.setFocusable(false);
        eVar.f1506r.setNestedScrollingEnabled(false);
        TextView textView = (TextView) b5.findViewById(android.R.id.message);
        eVar.f1510v = textView;
        if (textView != null) {
            String str = eVar.f1495e;
            if (str != null) {
                textView.setText(str);
            } else {
                textView.setVisibility(8);
                eVar.f1506r.removeView(eVar.f1510v);
                if (eVar.f1496f != null) {
                    ViewGroup viewGroup2 = (ViewGroup) eVar.f1506r.getParent();
                    int indexOfChild = viewGroup2.indexOfChild(eVar.f1506r);
                    viewGroup2.removeViewAt(indexOfChild);
                    viewGroup2.addView(eVar.f1496f, indexOfChild, new ViewGroup.LayoutParams(-1, -1));
                } else {
                    b5.setVisibility(8);
                }
            }
        }
        Button button = (Button) b6.findViewById(android.R.id.button1);
        eVar.i = button;
        com.google.android.material.datepicker.p pVar = eVar.F;
        button.setOnClickListener(pVar);
        if (TextUtils.isEmpty(eVar.f1498j)) {
            eVar.i.setVisibility(8);
            i = 0;
        } else {
            eVar.i.setText(eVar.f1498j);
            eVar.i.setVisibility(0);
            i = 1;
        }
        Button button2 = (Button) b6.findViewById(android.R.id.button2);
        eVar.f1500l = button2;
        button2.setOnClickListener(pVar);
        if (TextUtils.isEmpty(eVar.f1501m)) {
            eVar.f1500l.setVisibility(8);
        } else {
            eVar.f1500l.setText(eVar.f1501m);
            eVar.f1500l.setVisibility(0);
            i |= 2;
        }
        Button button3 = (Button) b6.findViewById(android.R.id.button3);
        eVar.f1503o = button3;
        button3.setOnClickListener(pVar);
        if (TextUtils.isEmpty(eVar.f1504p)) {
            eVar.f1503o.setVisibility(8);
        } else {
            eVar.f1503o.setText(eVar.f1504p);
            eVar.f1503o.setVisibility(0);
            i |= 4;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogCenterButtons, typedValue, true);
        if (typedValue.data != 0) {
            if (i == 1) {
                Button button4 = eVar.i;
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button4.getLayoutParams();
                layoutParams.gravity = 1;
                layoutParams.weight = 0.5f;
                button4.setLayoutParams(layoutParams);
            } else if (i == 2) {
                Button button5 = eVar.f1500l;
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) button5.getLayoutParams();
                layoutParams2.gravity = 1;
                layoutParams2.weight = 0.5f;
                button5.setLayoutParams(layoutParams2);
            } else if (i == 4) {
                Button button6 = eVar.f1503o;
                LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) button6.getLayoutParams();
                layoutParams3.gravity = 1;
                layoutParams3.weight = 0.5f;
                button6.setLayoutParams(layoutParams3);
            }
        }
        if (i == 0) {
            b6.setVisibility(8);
        }
        if (eVar.f1511w != null) {
            b2.addView(eVar.f1511w, 0, new ViewGroup.LayoutParams(-1, -2));
            window.findViewById(R.id.title_template).setVisibility(8);
        } else {
            eVar.f1508t = (ImageView) window.findViewById(android.R.id.icon);
            if (TextUtils.isEmpty(eVar.d) || !eVar.D) {
                window.findViewById(R.id.title_template).setVisibility(8);
                eVar.f1508t.setVisibility(8);
                b2.setVisibility(8);
            } else {
                TextView textView2 = (TextView) window.findViewById(R.id.alertTitle);
                eVar.f1509u = textView2;
                textView2.setText(eVar.d);
                Drawable drawable = eVar.f1507s;
                if (drawable != null) {
                    eVar.f1508t.setImageDrawable(drawable);
                } else {
                    eVar.f1509u.setPadding(eVar.f1508t.getPaddingLeft(), eVar.f1508t.getPaddingTop(), eVar.f1508t.getPaddingRight(), eVar.f1508t.getPaddingBottom());
                    eVar.f1508t.setVisibility(8);
                }
            }
        }
        boolean z5 = viewGroup.getVisibility() != 8;
        int i4 = (b2 == null || b2.getVisibility() == 8) ? 0 : 1;
        boolean z6 = b6.getVisibility() != 8;
        if (!z6 && (findViewById = b5.findViewById(R.id.textSpacerNoButtons)) != null) {
            findViewById.setVisibility(0);
        }
        if (i4 != 0) {
            NestedScrollView nestedScrollView2 = eVar.f1506r;
            if (nestedScrollView2 != null) {
                nestedScrollView2.setClipToPadding(true);
            }
            View findViewById9 = (eVar.f1495e == null && eVar.f1496f == null) ? null : b2.findViewById(R.id.titleDividerNoCustom);
            if (findViewById9 != null) {
                findViewById9.setVisibility(0);
            }
        } else {
            View findViewById10 = b5.findViewById(R.id.textSpacerNoTitle);
            if (findViewById10 != null) {
                findViewById10.setVisibility(0);
            }
        }
        AlertController$RecycleListView alertController$RecycleListView = eVar.f1496f;
        if (alertController$RecycleListView != null && (!z6 || i4 == 0)) {
            alertController$RecycleListView.setPadding(alertController$RecycleListView.getPaddingLeft(), i4 != 0 ? alertController$RecycleListView.getPaddingTop() : alertController$RecycleListView.f253f, alertController$RecycleListView.getPaddingRight(), z6 ? alertController$RecycleListView.getPaddingBottom() : alertController$RecycleListView.f254g);
        }
        if (!z5) {
            View view2 = eVar.f1496f;
            if (view2 == null) {
                view2 = eVar.f1506r;
            }
            if (view2 != null) {
                int i5 = z6 ? 2 : 0;
                View findViewById11 = window.findViewById(R.id.scrollIndicatorUp);
                View findViewById12 = window.findViewById(R.id.scrollIndicatorDown);
                WeakHashMap weakHashMap = p0.f2816a;
                view2.setScrollIndicators(i4 | i5, 3);
                if (findViewById11 != null) {
                    b5.removeView(findViewById11);
                }
                if (findViewById12 != null) {
                    b5.removeView(findViewById12);
                }
            }
        }
        AlertController$RecycleListView alertController$RecycleListView2 = eVar.f1496f;
        if (alertController$RecycleListView2 == null || (listAdapter = eVar.f1512x) == null) {
            return;
        }
        alertController$RecycleListView2.setAdapter(listAdapter);
        int i6 = eVar.f1513y;
        if (i6 > -1) {
            alertController$RecycleListView2.setItemChecked(i6, true);
            alertController$RecycleListView2.setSelection(i6);
        }
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f1517l.f1506r;
        if (nestedScrollView == null || !nestedScrollView.i(keyEvent)) {
            return super.onKeyDown(i, keyEvent);
        }
        return true;
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f1517l.f1506r;
        if (nestedScrollView == null || !nestedScrollView.i(keyEvent)) {
            return super.onKeyUp(i, keyEvent);
        }
        return true;
    }

    @Override // a.o, android.app.Dialog
    public final void onStop() {
        super.onStop();
        a0 a0Var = (a0) e();
        a0Var.y();
        k0 k0Var = a0Var.f1463t;
        if (k0Var != null) {
            k0Var.f1550u = false;
            j.j jVar = k0Var.f1549t;
            if (jVar != null) {
                jVar.a();
            }
        }
    }

    @Override // a.o, android.app.Dialog
    public final void setContentView(int i) {
        d();
        e().g(i);
    }

    @Override // android.app.Dialog
    public final void setTitle(int i) {
        super.setTitle(i);
        e().j(getContext().getString(i));
    }

    @Override // a.o, android.app.Dialog
    public final void setContentView(View view) {
        d();
        e().h(view);
    }

    @Override // android.app.Dialog
    public final void setTitle(CharSequence charSequence) {
        i(charSequence);
        e eVar = this.f1517l;
        eVar.d = charSequence;
        TextView textView = eVar.f1509u;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    @Override // a.o, android.app.Dialog
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        d();
        e().i(view, layoutParams);
    }
}
