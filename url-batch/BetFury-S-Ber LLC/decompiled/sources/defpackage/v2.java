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
import com.trembin.nirefon.betfury.R;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class v2 extends x4 implements DialogInterface {
    public final t2 l;

    public v2(ContextThemeWrapper contextThemeWrapper, int i) {
        super(contextThemeWrapper, h(contextThemeWrapper, i));
        this.l = new t2(getContext(), this, getWindow());
    }

    public static int h(Context context, int i) {
        if (((i >>> 24) & 255) >= 1) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    @Override // defpackage.x4, defpackage.ae, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        int i;
        ListAdapter listAdapter;
        View findViewById;
        super.onCreate(bundle);
        t2 t2Var = this.l;
        t2Var.b.setContentView(t2Var.q);
        Context context = t2Var.a;
        Window window = t2Var.c;
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
        ViewGroup a = t2.a(findViewById6, findViewById3);
        ViewGroup a2 = t2.a(findViewById7, findViewById4);
        ViewGroup a3 = t2.a(findViewById8, findViewById5);
        NestedScrollView nestedScrollView = (NestedScrollView) window.findViewById(R.id.scrollView);
        t2Var.i = nestedScrollView;
        nestedScrollView.setFocusable(false);
        t2Var.i.setNestedScrollingEnabled(false);
        TextView textView = (TextView) a2.findViewById(android.R.id.message);
        t2Var.m = textView;
        if (textView != null) {
            textView.setVisibility(8);
            t2Var.i.removeView(t2Var.m);
            if (t2Var.e != null) {
                ViewGroup viewGroup2 = (ViewGroup) t2Var.i.getParent();
                int indexOfChild = viewGroup2.indexOfChild(t2Var.i);
                viewGroup2.removeViewAt(indexOfChild);
                viewGroup2.addView(t2Var.e, indexOfChild, new ViewGroup.LayoutParams(-1, -1));
            } else {
                a2.setVisibility(8);
            }
        }
        Button button = (Button) a3.findViewById(android.R.id.button1);
        t2Var.f = button;
        y0 y0Var = t2Var.w;
        button.setOnClickListener(y0Var);
        boolean isEmpty = TextUtils.isEmpty(null);
        Button button2 = t2Var.f;
        if (isEmpty) {
            button2.setVisibility(8);
            i = 0;
        } else {
            button2.setText((CharSequence) null);
            t2Var.f.setVisibility(0);
            i = 1;
        }
        Button button3 = (Button) a3.findViewById(android.R.id.button2);
        t2Var.g = button3;
        button3.setOnClickListener(y0Var);
        boolean isEmpty2 = TextUtils.isEmpty(null);
        Button button4 = t2Var.g;
        if (isEmpty2) {
            button4.setVisibility(8);
        } else {
            button4.setText((CharSequence) null);
            t2Var.g.setVisibility(0);
            i |= 2;
        }
        Button button5 = (Button) a3.findViewById(android.R.id.button3);
        t2Var.h = button5;
        button5.setOnClickListener(y0Var);
        boolean isEmpty3 = TextUtils.isEmpty(null);
        Button button6 = t2Var.h;
        if (isEmpty3) {
            button6.setVisibility(8);
        } else {
            button6.setText((CharSequence) null);
            t2Var.h.setVisibility(0);
            i |= 4;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogCenterButtons, typedValue, true);
        if (typedValue.data != 0) {
            if (i == 1) {
                Button button7 = t2Var.f;
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button7.getLayoutParams();
                layoutParams.gravity = 1;
                layoutParams.weight = 0.5f;
                button7.setLayoutParams(layoutParams);
            } else if (i == 2) {
                Button button8 = t2Var.g;
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) button8.getLayoutParams();
                layoutParams2.gravity = 1;
                layoutParams2.weight = 0.5f;
                button8.setLayoutParams(layoutParams2);
            } else if (i == 4) {
                Button button9 = t2Var.h;
                LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) button9.getLayoutParams();
                layoutParams3.gravity = 1;
                layoutParams3.weight = 0.5f;
                button9.setLayoutParams(layoutParams3);
            }
        }
        if (i == 0) {
            a3.setVisibility(8);
        }
        if (t2Var.n != null) {
            a.addView(t2Var.n, 0, new ViewGroup.LayoutParams(-1, -2));
            window.findViewById(R.id.title_template).setVisibility(8);
        } else {
            t2Var.k = (ImageView) window.findViewById(android.R.id.icon);
            if (TextUtils.isEmpty(t2Var.d) || !t2Var.u) {
                window.findViewById(R.id.title_template).setVisibility(8);
                t2Var.k.setVisibility(8);
                a.setVisibility(8);
            } else {
                TextView textView2 = (TextView) window.findViewById(R.id.alertTitle);
                t2Var.l = textView2;
                textView2.setText(t2Var.d);
                Drawable drawable = t2Var.j;
                if (drawable != null) {
                    t2Var.k.setImageDrawable(drawable);
                } else {
                    t2Var.l.setPadding(t2Var.k.getPaddingLeft(), t2Var.k.getPaddingTop(), t2Var.k.getPaddingRight(), t2Var.k.getPaddingBottom());
                    t2Var.k.setVisibility(8);
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
            NestedScrollView nestedScrollView2 = t2Var.i;
            if (nestedScrollView2 != null) {
                nestedScrollView2.setClipToPadding(true);
            }
            View findViewById9 = t2Var.e != null ? a.findViewById(R.id.titleDividerNoCustom) : null;
            if (findViewById9 != null) {
                findViewById9.setVisibility(0);
            }
        } else {
            View findViewById10 = a2.findViewById(R.id.textSpacerNoTitle);
            if (findViewById10 != null) {
                findViewById10.setVisibility(0);
            }
        }
        AlertController$RecycleListView alertController$RecycleListView = t2Var.e;
        if (alertController$RecycleListView != null && (!z2 || i2 == 0)) {
            alertController$RecycleListView.setPadding(alertController$RecycleListView.getPaddingLeft(), i2 != 0 ? alertController$RecycleListView.getPaddingTop() : alertController$RecycleListView.f, alertController$RecycleListView.getPaddingRight(), z2 ? alertController$RecycleListView.getPaddingBottom() : alertController$RecycleListView.g);
        }
        if (!z) {
            View view = t2Var.e;
            if (view == null) {
                view = t2Var.i;
            }
            if (view != null) {
                int i3 = z2 ? 2 : 0;
                View findViewById11 = window.findViewById(R.id.scrollIndicatorUp);
                View findViewById12 = window.findViewById(R.id.scrollIndicatorDown);
                WeakHashMap weakHashMap = hm0.a;
                view.setScrollIndicators(i2 | i3, 3);
                if (findViewById11 != null) {
                    a2.removeView(findViewById11);
                }
                if (findViewById12 != null) {
                    a2.removeView(findViewById12);
                }
            }
        }
        AlertController$RecycleListView alertController$RecycleListView2 = t2Var.e;
        if (alertController$RecycleListView2 == null || (listAdapter = t2Var.o) == null) {
            return;
        }
        alertController$RecycleListView2.setAdapter(listAdapter);
        int i4 = t2Var.p;
        if (i4 > -1) {
            alertController$RecycleListView2.setItemChecked(i4, true);
            alertController$RecycleListView2.setSelection(i4);
        }
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.l.i;
        if (nestedScrollView == null || !nestedScrollView.i(keyEvent)) {
            return super.onKeyDown(i, keyEvent);
        }
        return true;
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.l.i;
        if (nestedScrollView == null || !nestedScrollView.i(keyEvent)) {
            return super.onKeyUp(i, keyEvent);
        }
        return true;
    }

    @Override // defpackage.x4, android.app.Dialog
    public final void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        t2 t2Var = this.l;
        t2Var.d = charSequence;
        TextView textView = t2Var.l;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }
}
