package h;

import M.P;
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
import com.winpower.neonfit.R;
import java.util.WeakHashMap;

/* renamed from: h.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class DialogInterfaceC0129f extends B implements DialogInterface {

    /* renamed from: f, reason: collision with root package name */
    public final C0128e f2798f;

    public DialogInterfaceC0129f(ContextThemeWrapper contextThemeWrapper, int i) {
        super(contextThemeWrapper, i(contextThemeWrapper, i));
        this.f2798f = new C0128e(getContext(), this, getWindow());
    }

    public static int i(Context context, int i) {
        if (((i >>> 24) & 255) >= 1) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    @Override // h.B, b.m, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        int i;
        ListAdapter listAdapter;
        View findViewById;
        super.onCreate(bundle);
        C0128e c0128e = this.f2798f;
        c0128e.f2779b.setContentView(c0128e.f2791q);
        Window window = c0128e.f2780c;
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
        ViewGroup a2 = C0128e.a(findViewById6, findViewById3);
        ViewGroup a3 = C0128e.a(findViewById7, findViewById4);
        ViewGroup a4 = C0128e.a(findViewById8, findViewById5);
        NestedScrollView nestedScrollView = (NestedScrollView) window.findViewById(R.id.scrollView);
        c0128e.i = nestedScrollView;
        nestedScrollView.setFocusable(false);
        c0128e.i.setNestedScrollingEnabled(false);
        TextView textView = (TextView) a3.findViewById(android.R.id.message);
        c0128e.f2787m = textView;
        if (textView != null) {
            textView.setVisibility(8);
            c0128e.i.removeView(c0128e.f2787m);
            if (c0128e.e != null) {
                ViewGroup viewGroup2 = (ViewGroup) c0128e.i.getParent();
                int indexOfChild = viewGroup2.indexOfChild(c0128e.i);
                viewGroup2.removeViewAt(indexOfChild);
                viewGroup2.addView(c0128e.e, indexOfChild, new ViewGroup.LayoutParams(-1, -1));
            } else {
                a3.setVisibility(8);
            }
        }
        Button button = (Button) a4.findViewById(android.R.id.button1);
        c0128e.f2782f = button;
        com.google.android.material.datepicker.j jVar = c0128e.f2797w;
        button.setOnClickListener(jVar);
        if (TextUtils.isEmpty(null)) {
            c0128e.f2782f.setVisibility(8);
            i = 0;
        } else {
            c0128e.f2782f.setText((CharSequence) null);
            c0128e.f2782f.setVisibility(0);
            i = 1;
        }
        Button button2 = (Button) a4.findViewById(android.R.id.button2);
        c0128e.f2783g = button2;
        button2.setOnClickListener(jVar);
        if (TextUtils.isEmpty(null)) {
            c0128e.f2783g.setVisibility(8);
        } else {
            c0128e.f2783g.setText((CharSequence) null);
            c0128e.f2783g.setVisibility(0);
            i |= 2;
        }
        Button button3 = (Button) a4.findViewById(android.R.id.button3);
        c0128e.f2784h = button3;
        button3.setOnClickListener(jVar);
        if (TextUtils.isEmpty(null)) {
            c0128e.f2784h.setVisibility(8);
        } else {
            c0128e.f2784h.setText((CharSequence) null);
            c0128e.f2784h.setVisibility(0);
            i |= 4;
        }
        TypedValue typedValue = new TypedValue();
        c0128e.f2778a.getTheme().resolveAttribute(R.attr.alertDialogCenterButtons, typedValue, true);
        if (typedValue.data != 0) {
            if (i == 1) {
                Button button4 = c0128e.f2782f;
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button4.getLayoutParams();
                layoutParams.gravity = 1;
                layoutParams.weight = 0.5f;
                button4.setLayoutParams(layoutParams);
            } else if (i == 2) {
                Button button5 = c0128e.f2783g;
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) button5.getLayoutParams();
                layoutParams2.gravity = 1;
                layoutParams2.weight = 0.5f;
                button5.setLayoutParams(layoutParams2);
            } else if (i == 4) {
                Button button6 = c0128e.f2784h;
                LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) button6.getLayoutParams();
                layoutParams3.gravity = 1;
                layoutParams3.weight = 0.5f;
                button6.setLayoutParams(layoutParams3);
            }
        }
        if (i == 0) {
            a4.setVisibility(8);
        }
        if (c0128e.f2788n != null) {
            a2.addView(c0128e.f2788n, 0, new ViewGroup.LayoutParams(-1, -2));
            window.findViewById(R.id.title_template).setVisibility(8);
        } else {
            c0128e.f2785k = (ImageView) window.findViewById(android.R.id.icon);
            if (TextUtils.isEmpty(c0128e.f2781d) || !c0128e.f2795u) {
                window.findViewById(R.id.title_template).setVisibility(8);
                c0128e.f2785k.setVisibility(8);
                a2.setVisibility(8);
            } else {
                TextView textView2 = (TextView) window.findViewById(R.id.alertTitle);
                c0128e.f2786l = textView2;
                textView2.setText(c0128e.f2781d);
                Drawable drawable = c0128e.j;
                if (drawable != null) {
                    c0128e.f2785k.setImageDrawable(drawable);
                } else {
                    c0128e.f2786l.setPadding(c0128e.f2785k.getPaddingLeft(), c0128e.f2785k.getPaddingTop(), c0128e.f2785k.getPaddingRight(), c0128e.f2785k.getPaddingBottom());
                    c0128e.f2785k.setVisibility(8);
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
            NestedScrollView nestedScrollView2 = c0128e.i;
            if (nestedScrollView2 != null) {
                nestedScrollView2.setClipToPadding(true);
            }
            View findViewById9 = c0128e.e != null ? a2.findViewById(R.id.titleDividerNoCustom) : null;
            if (findViewById9 != null) {
                findViewById9.setVisibility(0);
            }
        } else {
            View findViewById10 = a3.findViewById(R.id.textSpacerNoTitle);
            if (findViewById10 != null) {
                findViewById10.setVisibility(0);
            }
        }
        AlertController$RecycleListView alertController$RecycleListView = c0128e.e;
        if (alertController$RecycleListView != null) {
            alertController$RecycleListView.getClass();
            if (!z3 || i2 == 0) {
                alertController$RecycleListView.setPadding(alertController$RecycleListView.getPaddingLeft(), i2 != 0 ? alertController$RecycleListView.getPaddingTop() : alertController$RecycleListView.f1674a, alertController$RecycleListView.getPaddingRight(), z3 ? alertController$RecycleListView.getPaddingBottom() : alertController$RecycleListView.f1675b);
            }
        }
        if (!z2) {
            View view = c0128e.e;
            if (view == null) {
                view = c0128e.i;
            }
            if (view != null) {
                int i3 = (z3 ? 2 : 0) | i2;
                View findViewById11 = window.findViewById(R.id.scrollIndicatorUp);
                View findViewById12 = window.findViewById(R.id.scrollIndicatorDown);
                WeakHashMap weakHashMap = P.f711a;
                M.F.d(view, i3, 3);
                if (findViewById11 != null) {
                    a3.removeView(findViewById11);
                }
                if (findViewById12 != null) {
                    a3.removeView(findViewById12);
                }
            }
        }
        AlertController$RecycleListView alertController$RecycleListView2 = c0128e.e;
        if (alertController$RecycleListView2 == null || (listAdapter = c0128e.f2789o) == null) {
            return;
        }
        alertController$RecycleListView2.setAdapter(listAdapter);
        int i4 = c0128e.f2790p;
        if (i4 > -1) {
            alertController$RecycleListView2.setItemChecked(i4, true);
            alertController$RecycleListView2.setSelection(i4);
        }
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f2798f.i;
        if (nestedScrollView == null || !nestedScrollView.i(keyEvent)) {
            return super.onKeyDown(i, keyEvent);
        }
        return true;
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f2798f.i;
        if (nestedScrollView == null || !nestedScrollView.i(keyEvent)) {
            return super.onKeyUp(i, keyEvent);
        }
        return true;
    }

    @Override // h.B, android.app.Dialog
    public final void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        C0128e c0128e = this.f2798f;
        c0128e.f2781d = charSequence;
        TextView textView = c0128e.f2786l;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }
}
