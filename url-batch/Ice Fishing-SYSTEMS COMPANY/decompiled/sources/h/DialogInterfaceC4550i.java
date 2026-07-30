package h;

import O.InterfaceC0348j;
import O.X;
import android.R;
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
import com.icefishing.icefishingliveapp.C5284R;
import java.util.WeakHashMap;
import k.AbstractC4614b;
import k.InterfaceC4613a;

/* renamed from: h.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class DialogInterfaceC4550i extends androidx.activity.q implements DialogInterface, InterfaceC4554m {

    /* renamed from: w, reason: collision with root package name */
    public LayoutInflaterFactory2C4535B f38110w;

    /* renamed from: x, reason: collision with root package name */
    public final C4536C f38111x;

    /* renamed from: y, reason: collision with root package name */
    public final C4549h f38112y;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Type inference failed for: r2v2, types: [h.C] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public DialogInterfaceC4550i(ContextThemeWrapper contextThemeWrapper, int i) {
        super(contextThemeWrapper, r2);
        int i4;
        int e6 = e(contextThemeWrapper, i);
        if (e6 == 0) {
            TypedValue typedValue = new TypedValue();
            contextThemeWrapper.getTheme().resolveAttribute(C5284R.attr.dialogTheme, typedValue, true);
            i4 = typedValue.resourceId;
        } else {
            i4 = e6;
        }
        this.f38111x = new InterfaceC0348j() { // from class: h.C
            @Override // O.InterfaceC0348j
            public final boolean superDispatchKeyEvent(KeyEvent keyEvent) {
                return DialogInterfaceC4550i.this.g(keyEvent);
            }
        };
        q c4 = c();
        if (e6 == 0) {
            TypedValue typedValue2 = new TypedValue();
            contextThemeWrapper.getTheme().resolveAttribute(C5284R.attr.dialogTheme, typedValue2, true);
            e6 = typedValue2.resourceId;
        }
        ((LayoutInflaterFactory2C4535B) c4).f38016z0 = e6;
        c4.d();
        this.f38112y = new C4549h(getContext(), this, getWindow());
    }

    public static int e(Context context, int i) {
        if (((i >>> 24) & com.anythink.basead.exoplayer.k.p.f8630b) >= 1) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(C5284R.attr.alertDialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    @Override // androidx.activity.q, android.app.Dialog
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        b();
        LayoutInflaterFactory2C4535B layoutInflaterFactory2C4535B = (LayoutInflaterFactory2C4535B) c();
        layoutInflaterFactory2C4535B.x();
        ((ViewGroup) layoutInflaterFactory2C4535B.f37998T.findViewById(R.id.content)).addView(view, layoutParams);
        layoutInflaterFactory2C4535B.f37977F.a(layoutInflaterFactory2C4535B.f37975E.getCallback());
    }

    public final q c() {
        if (this.f38110w == null) {
            T0.l lVar = q.f38120n;
            this.f38110w = new LayoutInflaterFactory2C4535B(getContext(), getWindow(), this, this);
        }
        return this.f38110w;
    }

    public final void d(Bundle bundle) {
        c().a();
        super.onCreate(bundle);
        c().d();
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        super.dismiss();
        c().e();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return com.bumptech.glide.e.l(this.f38111x, getWindow().getDecorView(), this, keyEvent);
    }

    public final void f(CharSequence charSequence) {
        super.setTitle(charSequence);
        c().l(charSequence);
    }

    @Override // android.app.Dialog
    public final View findViewById(int i) {
        LayoutInflaterFactory2C4535B layoutInflaterFactory2C4535B = (LayoutInflaterFactory2C4535B) c();
        layoutInflaterFactory2C4535B.x();
        return layoutInflaterFactory2C4535B.f37975E.findViewById(i);
    }

    public final boolean g(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Dialog
    public final void invalidateOptionsMenu() {
        c().b();
    }

    @Override // androidx.activity.q, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        int i;
        ListAdapter listAdapter;
        View findViewById;
        d(bundle);
        C4549h c4549h = this.f38112y;
        c4549h.f38089b.setContentView(c4549h.f38103q);
        Window window = c4549h.f38090c;
        View findViewById2 = window.findViewById(C5284R.id.parentPanel);
        View findViewById3 = findViewById2.findViewById(C5284R.id.topPanel);
        View findViewById4 = findViewById2.findViewById(C5284R.id.contentPanel);
        View findViewById5 = findViewById2.findViewById(C5284R.id.buttonPanel);
        ViewGroup viewGroup = (ViewGroup) findViewById2.findViewById(C5284R.id.customPanel);
        window.setFlags(131072, 131072);
        viewGroup.setVisibility(8);
        View findViewById6 = viewGroup.findViewById(C5284R.id.topPanel);
        View findViewById7 = viewGroup.findViewById(C5284R.id.contentPanel);
        View findViewById8 = viewGroup.findViewById(C5284R.id.buttonPanel);
        ViewGroup a9 = C4549h.a(findViewById6, findViewById3);
        ViewGroup a10 = C4549h.a(findViewById7, findViewById4);
        ViewGroup a11 = C4549h.a(findViewById8, findViewById5);
        NestedScrollView nestedScrollView = (NestedScrollView) window.findViewById(C5284R.id.scrollView);
        c4549h.i = nestedScrollView;
        nestedScrollView.setFocusable(false);
        c4549h.i.setNestedScrollingEnabled(false);
        TextView textView = (TextView) a10.findViewById(R.id.message);
        c4549h.f38099m = textView;
        if (textView != null) {
            textView.setVisibility(8);
            c4549h.i.removeView(c4549h.f38099m);
            if (c4549h.f38092e != null) {
                ViewGroup viewGroup2 = (ViewGroup) c4549h.i.getParent();
                int indexOfChild = viewGroup2.indexOfChild(c4549h.i);
                viewGroup2.removeViewAt(indexOfChild);
                viewGroup2.addView(c4549h.f38092e, indexOfChild, new ViewGroup.LayoutParams(-1, -1));
            } else {
                a10.setVisibility(8);
            }
        }
        Button button = (Button) a11.findViewById(R.id.button1);
        c4549h.f38093f = button;
        com.google.android.material.datepicker.j jVar = c4549h.f38109w;
        button.setOnClickListener(jVar);
        if (TextUtils.isEmpty(null)) {
            c4549h.f38093f.setVisibility(8);
            i = 0;
        } else {
            c4549h.f38093f.setText((CharSequence) null);
            c4549h.f38093f.setVisibility(0);
            i = 1;
        }
        Button button2 = (Button) a11.findViewById(R.id.button2);
        c4549h.f38094g = button2;
        button2.setOnClickListener(jVar);
        if (TextUtils.isEmpty(null)) {
            c4549h.f38094g.setVisibility(8);
        } else {
            c4549h.f38094g.setText((CharSequence) null);
            c4549h.f38094g.setVisibility(0);
            i |= 2;
        }
        Button button3 = (Button) a11.findViewById(R.id.button3);
        c4549h.f38095h = button3;
        button3.setOnClickListener(jVar);
        if (TextUtils.isEmpty(null)) {
            c4549h.f38095h.setVisibility(8);
        } else {
            c4549h.f38095h.setText((CharSequence) null);
            c4549h.f38095h.setVisibility(0);
            i |= 4;
        }
        TypedValue typedValue = new TypedValue();
        c4549h.f38088a.getTheme().resolveAttribute(C5284R.attr.alertDialogCenterButtons, typedValue, true);
        if (typedValue.data != 0) {
            if (i == 1) {
                Button button4 = c4549h.f38093f;
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button4.getLayoutParams();
                layoutParams.gravity = 1;
                layoutParams.weight = 0.5f;
                button4.setLayoutParams(layoutParams);
            } else if (i == 2) {
                Button button5 = c4549h.f38094g;
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) button5.getLayoutParams();
                layoutParams2.gravity = 1;
                layoutParams2.weight = 0.5f;
                button5.setLayoutParams(layoutParams2);
            } else if (i == 4) {
                Button button6 = c4549h.f38095h;
                LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) button6.getLayoutParams();
                layoutParams3.gravity = 1;
                layoutParams3.weight = 0.5f;
                button6.setLayoutParams(layoutParams3);
            }
        }
        if (i == 0) {
            a11.setVisibility(8);
        }
        if (c4549h.f38100n != null) {
            a9.addView(c4549h.f38100n, 0, new ViewGroup.LayoutParams(-1, -2));
            window.findViewById(C5284R.id.title_template).setVisibility(8);
        } else {
            c4549h.f38097k = (ImageView) window.findViewById(R.id.icon);
            if (TextUtils.isEmpty(c4549h.f38091d) || !c4549h.f38107u) {
                window.findViewById(C5284R.id.title_template).setVisibility(8);
                c4549h.f38097k.setVisibility(8);
                a9.setVisibility(8);
            } else {
                TextView textView2 = (TextView) window.findViewById(C5284R.id.alertTitle);
                c4549h.f38098l = textView2;
                textView2.setText(c4549h.f38091d);
                Drawable drawable = c4549h.f38096j;
                if (drawable != null) {
                    c4549h.f38097k.setImageDrawable(drawable);
                } else {
                    c4549h.f38098l.setPadding(c4549h.f38097k.getPaddingLeft(), c4549h.f38097k.getPaddingTop(), c4549h.f38097k.getPaddingRight(), c4549h.f38097k.getPaddingBottom());
                    c4549h.f38097k.setVisibility(8);
                }
            }
        }
        boolean z8 = viewGroup.getVisibility() != 8;
        int i4 = (a9 == null || a9.getVisibility() == 8) ? 0 : 1;
        boolean z9 = a11.getVisibility() != 8;
        if (!z9 && (findViewById = a10.findViewById(C5284R.id.textSpacerNoButtons)) != null) {
            findViewById.setVisibility(0);
        }
        if (i4 != 0) {
            NestedScrollView nestedScrollView2 = c4549h.i;
            if (nestedScrollView2 != null) {
                nestedScrollView2.setClipToPadding(true);
            }
            View findViewById9 = c4549h.f38092e != null ? a9.findViewById(C5284R.id.titleDividerNoCustom) : null;
            if (findViewById9 != null) {
                findViewById9.setVisibility(0);
            }
        } else {
            View findViewById10 = a10.findViewById(C5284R.id.textSpacerNoTitle);
            if (findViewById10 != null) {
                findViewById10.setVisibility(0);
            }
        }
        AlertController$RecycleListView alertController$RecycleListView = c4549h.f38092e;
        if (alertController$RecycleListView != null) {
            alertController$RecycleListView.getClass();
            if (!z9 || i4 == 0) {
                alertController$RecycleListView.setPadding(alertController$RecycleListView.getPaddingLeft(), i4 != 0 ? alertController$RecycleListView.getPaddingTop() : alertController$RecycleListView.f4586n, alertController$RecycleListView.getPaddingRight(), z9 ? alertController$RecycleListView.getPaddingBottom() : alertController$RecycleListView.f4587u);
            }
        }
        if (!z8) {
            View view = c4549h.f38092e;
            if (view == null) {
                view = c4549h.i;
            }
            if (view != null) {
                int i9 = (z9 ? 2 : 0) | i4;
                View findViewById11 = window.findViewById(C5284R.id.scrollIndicatorUp);
                View findViewById12 = window.findViewById(C5284R.id.scrollIndicatorDown);
                WeakHashMap weakHashMap = X.f2240a;
                O.M.d(view, i9, 3);
                if (findViewById11 != null) {
                    a10.removeView(findViewById11);
                }
                if (findViewById12 != null) {
                    a10.removeView(findViewById12);
                }
            }
        }
        AlertController$RecycleListView alertController$RecycleListView2 = c4549h.f38092e;
        if (alertController$RecycleListView2 == null || (listAdapter = c4549h.f38101o) == null) {
            return;
        }
        alertController$RecycleListView2.setAdapter(listAdapter);
        int i10 = c4549h.f38102p;
        if (i10 > -1) {
            alertController$RecycleListView2.setItemChecked(i10, true);
            alertController$RecycleListView2.setSelection(i10);
        }
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f38112y.i;
        if (nestedScrollView == null || !nestedScrollView.i(keyEvent)) {
            return super.onKeyDown(i, keyEvent);
        }
        return true;
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f38112y.i;
        if (nestedScrollView == null || !nestedScrollView.i(keyEvent)) {
            return super.onKeyUp(i, keyEvent);
        }
        return true;
    }

    @Override // androidx.activity.q, android.app.Dialog
    public final void onStop() {
        super.onStop();
        LayoutInflaterFactory2C4535B layoutInflaterFactory2C4535B = (LayoutInflaterFactory2C4535B) c();
        layoutInflaterFactory2C4535B.C();
        AbstractC4542a abstractC4542a = layoutInflaterFactory2C4535B.f37981H;
        if (abstractC4542a != null) {
            abstractC4542a.q(false);
        }
    }

    @Override // h.InterfaceC4554m
    public final AbstractC4614b onWindowStartingSupportActionMode(InterfaceC4613a interfaceC4613a) {
        return null;
    }

    @Override // androidx.activity.q, android.app.Dialog
    public final void setContentView(int i) {
        b();
        c().h(i);
    }

    @Override // android.app.Dialog
    public final void setTitle(int i) {
        super.setTitle(i);
        c().l(getContext().getString(i));
    }

    @Override // androidx.activity.q, android.app.Dialog
    public final void setContentView(View view) {
        b();
        c().i(view);
    }

    @Override // android.app.Dialog
    public final void setTitle(CharSequence charSequence) {
        f(charSequence);
        C4549h c4549h = this.f38112y;
        c4549h.f38091d = charSequence;
        TextView textView = c4549h.f38098l;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    @Override // androidx.activity.q, android.app.Dialog
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        b();
        c().k(view, layoutParams);
    }

    @Override // h.InterfaceC4554m
    public final void onSupportActionModeFinished(AbstractC4614b abstractC4614b) {
    }

    @Override // h.InterfaceC4554m
    public final void onSupportActionModeStarted(AbstractC4614b abstractC4614b) {
    }
}
