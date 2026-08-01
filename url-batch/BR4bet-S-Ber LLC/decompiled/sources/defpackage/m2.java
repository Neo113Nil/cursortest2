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
import com.moontiko.really.admiralcasino.R;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class m2 extends p4 implements DialogInterface {
    public final k2 l;

    public m2(ContextThemeWrapper contextThemeWrapper, int i) {
        super(contextThemeWrapper, h(contextThemeWrapper, i));
        this.l = new k2(getContext(), this, getWindow());
    }

    public static int h(Context context, int i) {
        if (((i >>> 24) & 255) >= 1) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    @Override // defpackage.p4, defpackage.yc, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        int i;
        ListAdapter listAdapter;
        View findViewById;
        super.onCreate(bundle);
        k2 k2Var = this.l;
        k2Var.b.setContentView(k2Var.x);
        Context context = k2Var.a;
        Window window = k2Var.c;
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
        ViewGroup a = k2.a(findViewById6, findViewById3);
        ViewGroup a2 = k2.a(findViewById7, findViewById4);
        ViewGroup a3 = k2.a(findViewById8, findViewById5);
        NestedScrollView nestedScrollView = (NestedScrollView) window.findViewById(R.id.scrollView);
        k2Var.p = nestedScrollView;
        nestedScrollView.setFocusable(false);
        k2Var.p.setNestedScrollingEnabled(false);
        TextView textView = (TextView) a2.findViewById(android.R.id.message);
        k2Var.t = textView;
        if (textView != null) {
            CharSequence charSequence = k2Var.e;
            if (charSequence != null) {
                textView.setText(charSequence);
            } else {
                textView.setVisibility(8);
                k2Var.p.removeView(k2Var.t);
                if (k2Var.f != null) {
                    ViewGroup viewGroup2 = (ViewGroup) k2Var.p.getParent();
                    int indexOfChild = viewGroup2.indexOfChild(k2Var.p);
                    viewGroup2.removeViewAt(indexOfChild);
                    viewGroup2.addView(k2Var.f, indexOfChild, new ViewGroup.LayoutParams(-1, -1));
                } else {
                    a2.setVisibility(8);
                }
            }
        }
        Button button = (Button) a3.findViewById(android.R.id.button1);
        k2Var.g = button;
        v0 v0Var = k2Var.D;
        button.setOnClickListener(v0Var);
        boolean isEmpty = TextUtils.isEmpty(k2Var.h);
        Button button2 = k2Var.g;
        if (isEmpty) {
            button2.setVisibility(8);
            i = 0;
        } else {
            button2.setText(k2Var.h);
            k2Var.g.setVisibility(0);
            i = 1;
        }
        Button button3 = (Button) a3.findViewById(android.R.id.button2);
        k2Var.j = button3;
        button3.setOnClickListener(v0Var);
        boolean isEmpty2 = TextUtils.isEmpty(k2Var.k);
        Button button4 = k2Var.j;
        if (isEmpty2) {
            button4.setVisibility(8);
        } else {
            button4.setText(k2Var.k);
            k2Var.j.setVisibility(0);
            i |= 2;
        }
        Button button5 = (Button) a3.findViewById(android.R.id.button3);
        k2Var.m = button5;
        button5.setOnClickListener(v0Var);
        boolean isEmpty3 = TextUtils.isEmpty(k2Var.n);
        Button button6 = k2Var.m;
        if (isEmpty3) {
            button6.setVisibility(8);
        } else {
            button6.setText(k2Var.n);
            k2Var.m.setVisibility(0);
            i |= 4;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogCenterButtons, typedValue, true);
        if (typedValue.data != 0) {
            if (i == 1) {
                Button button7 = k2Var.g;
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button7.getLayoutParams();
                layoutParams.gravity = 1;
                layoutParams.weight = 0.5f;
                button7.setLayoutParams(layoutParams);
            } else if (i == 2) {
                Button button8 = k2Var.j;
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) button8.getLayoutParams();
                layoutParams2.gravity = 1;
                layoutParams2.weight = 0.5f;
                button8.setLayoutParams(layoutParams2);
            } else if (i == 4) {
                Button button9 = k2Var.m;
                LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) button9.getLayoutParams();
                layoutParams3.gravity = 1;
                layoutParams3.weight = 0.5f;
                button9.setLayoutParams(layoutParams3);
            }
        }
        if (i == 0) {
            a3.setVisibility(8);
        }
        if (k2Var.u != null) {
            a.addView(k2Var.u, 0, new ViewGroup.LayoutParams(-1, -2));
            window.findViewById(R.id.title_template).setVisibility(8);
        } else {
            k2Var.r = (ImageView) window.findViewById(android.R.id.icon);
            if (TextUtils.isEmpty(k2Var.d) || !k2Var.B) {
                window.findViewById(R.id.title_template).setVisibility(8);
                k2Var.r.setVisibility(8);
                a.setVisibility(8);
            } else {
                TextView textView2 = (TextView) window.findViewById(R.id.alertTitle);
                k2Var.s = textView2;
                textView2.setText(k2Var.d);
                Drawable drawable = k2Var.q;
                if (drawable != null) {
                    k2Var.r.setImageDrawable(drawable);
                } else {
                    k2Var.s.setPadding(k2Var.r.getPaddingLeft(), k2Var.r.getPaddingTop(), k2Var.r.getPaddingRight(), k2Var.r.getPaddingBottom());
                    k2Var.r.setVisibility(8);
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
            NestedScrollView nestedScrollView2 = k2Var.p;
            if (nestedScrollView2 != null) {
                nestedScrollView2.setClipToPadding(true);
            }
            View findViewById9 = (k2Var.e == null && k2Var.f == null) ? null : a.findViewById(R.id.titleDividerNoCustom);
            if (findViewById9 != null) {
                findViewById9.setVisibility(0);
            }
        } else {
            View findViewById10 = a2.findViewById(R.id.textSpacerNoTitle);
            if (findViewById10 != null) {
                findViewById10.setVisibility(0);
            }
        }
        AlertController$RecycleListView alertController$RecycleListView = k2Var.f;
        if (alertController$RecycleListView != null && (!z2 || i2 == 0)) {
            alertController$RecycleListView.setPadding(alertController$RecycleListView.getPaddingLeft(), i2 != 0 ? alertController$RecycleListView.getPaddingTop() : alertController$RecycleListView.f, alertController$RecycleListView.getPaddingRight(), z2 ? alertController$RecycleListView.getPaddingBottom() : alertController$RecycleListView.g);
        }
        if (!z) {
            View view = k2Var.f;
            if (view == null) {
                view = k2Var.p;
            }
            if (view != null) {
                int i3 = z2 ? 2 : 0;
                View findViewById11 = window.findViewById(R.id.scrollIndicatorUp);
                View findViewById12 = window.findViewById(R.id.scrollIndicatorDown);
                WeakHashMap weakHashMap = ic0.a;
                view.setScrollIndicators(i2 | i3, 3);
                if (findViewById11 != null) {
                    a2.removeView(findViewById11);
                }
                if (findViewById12 != null) {
                    a2.removeView(findViewById12);
                }
            }
        }
        AlertController$RecycleListView alertController$RecycleListView2 = k2Var.f;
        if (alertController$RecycleListView2 == null || (listAdapter = k2Var.v) == null) {
            return;
        }
        alertController$RecycleListView2.setAdapter(listAdapter);
        int i4 = k2Var.w;
        if (i4 > -1) {
            alertController$RecycleListView2.setItemChecked(i4, true);
            alertController$RecycleListView2.setSelection(i4);
        }
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.l.p;
        if (nestedScrollView == null || !nestedScrollView.i(keyEvent)) {
            return super.onKeyDown(i, keyEvent);
        }
        return true;
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.l.p;
        if (nestedScrollView == null || !nestedScrollView.i(keyEvent)) {
            return super.onKeyUp(i, keyEvent);
        }
        return true;
    }

    @Override // defpackage.p4, android.app.Dialog
    public final void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        k2 k2Var = this.l;
        k2Var.d = charSequence;
        TextView textView = k2Var.s;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }
}
