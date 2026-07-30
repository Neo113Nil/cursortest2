package i;

import I.InterfaceC0115k;
import I.T;
import a.AbstractC0169a;
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
import com.icefishing.icefish.ice.fishing.s294s.R;
import java.util.WeakHashMap;
import l.AbstractC0646b;
import l.InterfaceC0645a;
import n.A0;

/* renamed from: i.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class DialogInterfaceC0522i extends d.p implements DialogInterface, InterfaceC0526m {

    /* renamed from: l, reason: collision with root package name */
    public LayoutInflaterFactory2C0500B f5464l;

    /* renamed from: m, reason: collision with root package name */
    public final C0501C f5465m;

    /* renamed from: n, reason: collision with root package name */
    public final C0521h f5466n;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Type inference failed for: r2v2, types: [i.C] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public DialogInterfaceC0522i(ContextThemeWrapper contextThemeWrapper, int i2) {
        super(contextThemeWrapper, r2);
        int i5;
        int e7 = e(contextThemeWrapper, i2);
        if (e7 == 0) {
            TypedValue typedValue = new TypedValue();
            contextThemeWrapper.getTheme().resolveAttribute(R.attr.dialogTheme, typedValue, true);
            i5 = typedValue.resourceId;
        } else {
            i5 = e7;
        }
        this.f5465m = new InterfaceC0115k() { // from class: i.C
            @Override // I.InterfaceC0115k
            public final boolean superDispatchKeyEvent(KeyEvent keyEvent) {
                return DialogInterfaceC0522i.this.g(keyEvent);
            }
        };
        AbstractC0529p c7 = c();
        if (e7 == 0) {
            TypedValue typedValue2 = new TypedValue();
            contextThemeWrapper.getTheme().resolveAttribute(R.attr.dialogTheme, typedValue2, true);
            e7 = typedValue2.resourceId;
        }
        ((LayoutInflaterFactory2C0500B) c7).f5331b0 = e7;
        c7.e();
        this.f5466n = new C0521h(getContext(), this, getWindow());
    }

    public static int e(Context context, int i2) {
        if (((i2 >>> 24) & 255) >= 1) {
            return i2;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    @Override // d.p, android.app.Dialog
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        LayoutInflaterFactory2C0500B layoutInflaterFactory2C0500B = (LayoutInflaterFactory2C0500B) c();
        layoutInflaterFactory2C0500B.x();
        ((ViewGroup) layoutInflaterFactory2C0500B.f5313I.findViewById(android.R.id.content)).addView(view, layoutParams);
        layoutInflaterFactory2C0500B.f5348u.a(layoutInflaterFactory2C0500B.f5347t.getCallback());
    }

    public final AbstractC0529p c() {
        if (this.f5464l == null) {
            Q0.m mVar = AbstractC0529p.f5470d;
            this.f5464l = new LayoutInflaterFactory2C0500B(getContext(), getWindow(), this, this);
        }
        return this.f5464l;
    }

    public final void d(Bundle bundle) {
        c().a();
        super.onCreate(bundle);
        c().e();
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        super.dismiss();
        c().f();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return AbstractC0169a.j(this.f5465m, getWindow().getDecorView(), this, keyEvent);
    }

    public final void f(CharSequence charSequence) {
        super.setTitle(charSequence);
        c().m(charSequence);
    }

    @Override // android.app.Dialog
    public final View findViewById(int i2) {
        LayoutInflaterFactory2C0500B layoutInflaterFactory2C0500B = (LayoutInflaterFactory2C0500B) c();
        layoutInflaterFactory2C0500B.x();
        return layoutInflaterFactory2C0500B.f5347t.findViewById(i2);
    }

    public final boolean g(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Dialog
    public final void invalidateOptionsMenu() {
        c().b();
    }

    @Override // d.p, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        int i2;
        ListAdapter listAdapter;
        View findViewById;
        d(bundle);
        C0521h c0521h = this.f5466n;
        c0521h.f5440b.setContentView(c0521h.f5463z);
        Context context = c0521h.f5439a;
        Window window = c0521h.f5441c;
        View findViewById2 = window.findViewById(R.id.parentPanel);
        View findViewById3 = findViewById2.findViewById(R.id.topPanel);
        View findViewById4 = findViewById2.findViewById(R.id.contentPanel);
        View findViewById5 = findViewById2.findViewById(R.id.buttonPanel);
        ViewGroup viewGroup = (ViewGroup) findViewById2.findViewById(R.id.customPanel);
        FrameLayout frameLayout = c0521h.f5445g;
        if (frameLayout == null) {
            frameLayout = null;
        }
        boolean z7 = frameLayout != null;
        if (!z7 || !C0521h.a(frameLayout)) {
            window.setFlags(131072, 131072);
        }
        if (z7) {
            FrameLayout frameLayout2 = (FrameLayout) window.findViewById(R.id.custom);
            frameLayout2.addView(frameLayout, new ViewGroup.LayoutParams(-1, -1));
            if (c0521h.f5446h) {
                frameLayout2.setPadding(0, 0, 0, 0);
            }
            if (c0521h.f5444f != null) {
                ((LinearLayout.LayoutParams) ((A0) viewGroup.getLayoutParams())).weight = 0.0f;
            }
        } else {
            viewGroup.setVisibility(8);
        }
        View findViewById6 = viewGroup.findViewById(R.id.topPanel);
        View findViewById7 = viewGroup.findViewById(R.id.contentPanel);
        View findViewById8 = viewGroup.findViewById(R.id.buttonPanel);
        ViewGroup b7 = C0521h.b(findViewById6, findViewById3);
        ViewGroup b8 = C0521h.b(findViewById7, findViewById4);
        ViewGroup b9 = C0521h.b(findViewById8, findViewById5);
        NestedScrollView nestedScrollView = (NestedScrollView) window.findViewById(R.id.scrollView);
        c0521h.f5455r = nestedScrollView;
        nestedScrollView.setFocusable(false);
        c0521h.f5455r.setNestedScrollingEnabled(false);
        TextView textView = (TextView) b8.findViewById(android.R.id.message);
        c0521h.f5459v = textView;
        if (textView != null) {
            String str = c0521h.f5443e;
            if (str != null) {
                textView.setText(str);
            } else {
                textView.setVisibility(8);
                c0521h.f5455r.removeView(c0521h.f5459v);
                if (c0521h.f5444f != null) {
                    ViewGroup viewGroup2 = (ViewGroup) c0521h.f5455r.getParent();
                    int indexOfChild = viewGroup2.indexOfChild(c0521h.f5455r);
                    viewGroup2.removeViewAt(indexOfChild);
                    viewGroup2.addView(c0521h.f5444f, indexOfChild, new ViewGroup.LayoutParams(-1, -1));
                } else {
                    b8.setVisibility(8);
                }
            }
        }
        Button button = (Button) b9.findViewById(android.R.id.button1);
        c0521h.f5447i = button;
        ViewOnClickListenerC0516c viewOnClickListenerC0516c = c0521h.f5438F;
        button.setOnClickListener(viewOnClickListenerC0516c);
        if (TextUtils.isEmpty(c0521h.j)) {
            c0521h.f5447i.setVisibility(8);
            i2 = 0;
        } else {
            c0521h.f5447i.setText(c0521h.j);
            c0521h.f5447i.setVisibility(0);
            i2 = 1;
        }
        Button button2 = (Button) b9.findViewById(android.R.id.button2);
        c0521h.f5449l = button2;
        button2.setOnClickListener(viewOnClickListenerC0516c);
        if (TextUtils.isEmpty(c0521h.f5450m)) {
            c0521h.f5449l.setVisibility(8);
        } else {
            c0521h.f5449l.setText(c0521h.f5450m);
            c0521h.f5449l.setVisibility(0);
            i2 |= 2;
        }
        Button button3 = (Button) b9.findViewById(android.R.id.button3);
        c0521h.f5452o = button3;
        button3.setOnClickListener(viewOnClickListenerC0516c);
        if (TextUtils.isEmpty(c0521h.f5453p)) {
            c0521h.f5452o.setVisibility(8);
        } else {
            c0521h.f5452o.setText(c0521h.f5453p);
            c0521h.f5452o.setVisibility(0);
            i2 |= 4;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogCenterButtons, typedValue, true);
        if (typedValue.data != 0) {
            if (i2 == 1) {
                Button button4 = c0521h.f5447i;
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button4.getLayoutParams();
                layoutParams.gravity = 1;
                layoutParams.weight = 0.5f;
                button4.setLayoutParams(layoutParams);
            } else if (i2 == 2) {
                Button button5 = c0521h.f5449l;
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) button5.getLayoutParams();
                layoutParams2.gravity = 1;
                layoutParams2.weight = 0.5f;
                button5.setLayoutParams(layoutParams2);
            } else if (i2 == 4) {
                Button button6 = c0521h.f5452o;
                LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) button6.getLayoutParams();
                layoutParams3.gravity = 1;
                layoutParams3.weight = 0.5f;
                button6.setLayoutParams(layoutParams3);
            }
        }
        if (i2 == 0) {
            b9.setVisibility(8);
        }
        if (c0521h.f5460w != null) {
            b7.addView(c0521h.f5460w, 0, new ViewGroup.LayoutParams(-1, -2));
            window.findViewById(R.id.title_template).setVisibility(8);
        } else {
            c0521h.f5457t = (ImageView) window.findViewById(android.R.id.icon);
            if (TextUtils.isEmpty(c0521h.f5442d) || !c0521h.f5436D) {
                window.findViewById(R.id.title_template).setVisibility(8);
                c0521h.f5457t.setVisibility(8);
                b7.setVisibility(8);
            } else {
                TextView textView2 = (TextView) window.findViewById(R.id.alertTitle);
                c0521h.f5458u = textView2;
                textView2.setText(c0521h.f5442d);
                Drawable drawable = c0521h.f5456s;
                if (drawable != null) {
                    c0521h.f5457t.setImageDrawable(drawable);
                } else {
                    c0521h.f5458u.setPadding(c0521h.f5457t.getPaddingLeft(), c0521h.f5457t.getPaddingTop(), c0521h.f5457t.getPaddingRight(), c0521h.f5457t.getPaddingBottom());
                    c0521h.f5457t.setVisibility(8);
                }
            }
        }
        boolean z8 = viewGroup.getVisibility() != 8;
        int i5 = (b7 == null || b7.getVisibility() == 8) ? 0 : 1;
        boolean z9 = b9.getVisibility() != 8;
        if (!z9 && (findViewById = b8.findViewById(R.id.textSpacerNoButtons)) != null) {
            findViewById.setVisibility(0);
        }
        if (i5 != 0) {
            NestedScrollView nestedScrollView2 = c0521h.f5455r;
            if (nestedScrollView2 != null) {
                nestedScrollView2.setClipToPadding(true);
            }
            View findViewById9 = (c0521h.f5443e == null && c0521h.f5444f == null) ? null : b7.findViewById(R.id.titleDividerNoCustom);
            if (findViewById9 != null) {
                findViewById9.setVisibility(0);
            }
        } else {
            View findViewById10 = b8.findViewById(R.id.textSpacerNoTitle);
            if (findViewById10 != null) {
                findViewById10.setVisibility(0);
            }
        }
        AlertController$RecycleListView alertController$RecycleListView = c0521h.f5444f;
        if (alertController$RecycleListView != null && (!z9 || i5 == 0)) {
            alertController$RecycleListView.setPadding(alertController$RecycleListView.getPaddingLeft(), i5 != 0 ? alertController$RecycleListView.getPaddingTop() : alertController$RecycleListView.f3106d, alertController$RecycleListView.getPaddingRight(), z9 ? alertController$RecycleListView.getPaddingBottom() : alertController$RecycleListView.f3107e);
        }
        if (!z8) {
            View view = c0521h.f5444f;
            if (view == null) {
                view = c0521h.f5455r;
            }
            if (view != null) {
                int i7 = z9 ? 2 : 0;
                View findViewById11 = window.findViewById(R.id.scrollIndicatorUp);
                View findViewById12 = window.findViewById(R.id.scrollIndicatorDown);
                WeakHashMap weakHashMap = T.f1153a;
                view.setScrollIndicators(i5 | i7, 3);
                if (findViewById11 != null) {
                    b8.removeView(findViewById11);
                }
                if (findViewById12 != null) {
                    b8.removeView(findViewById12);
                }
            }
        }
        AlertController$RecycleListView alertController$RecycleListView2 = c0521h.f5444f;
        if (alertController$RecycleListView2 == null || (listAdapter = c0521h.f5461x) == null) {
            return;
        }
        alertController$RecycleListView2.setAdapter(listAdapter);
        int i8 = c0521h.f5462y;
        if (i8 > -1) {
            alertController$RecycleListView2.setItemChecked(i8, true);
            alertController$RecycleListView2.setSelection(i8);
        }
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i2, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f5466n.f5455r;
        if (nestedScrollView == null || !nestedScrollView.d(keyEvent)) {
            return super.onKeyDown(i2, keyEvent);
        }
        return true;
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i2, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f5466n.f5455r;
        if (nestedScrollView == null || !nestedScrollView.d(keyEvent)) {
            return super.onKeyUp(i2, keyEvent);
        }
        return true;
    }

    @Override // d.p, android.app.Dialog
    public final void onStop() {
        super.onStop();
        LayoutInflaterFactory2C0500B layoutInflaterFactory2C0500B = (LayoutInflaterFactory2C0500B) c();
        layoutInflaterFactory2C0500B.B();
        AbstractC0514a abstractC0514a = layoutInflaterFactory2C0500B.f5350w;
        if (abstractC0514a != null) {
            abstractC0514a.q(false);
        }
    }

    @Override // i.InterfaceC0526m
    public final AbstractC0646b onWindowStartingSupportActionMode(InterfaceC0645a interfaceC0645a) {
        return null;
    }

    @Override // d.p, android.app.Dialog
    public final void setContentView(int i2) {
        c().i(i2);
    }

    @Override // android.app.Dialog
    public final void setTitle(int i2) {
        super.setTitle(i2);
        c().m(getContext().getString(i2));
    }

    @Override // d.p, android.app.Dialog
    public final void setContentView(View view) {
        c().k(view);
    }

    @Override // d.p, android.app.Dialog
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        c().l(view, layoutParams);
    }

    @Override // android.app.Dialog
    public final void setTitle(CharSequence charSequence) {
        f(charSequence);
        C0521h c0521h = this.f5466n;
        c0521h.f5442d = charSequence;
        TextView textView = c0521h.f5458u;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    @Override // i.InterfaceC0526m
    public final void onSupportActionModeFinished(AbstractC0646b abstractC0646b) {
    }

    @Override // i.InterfaceC0526m
    public final void onSupportActionModeStarted(AbstractC0646b abstractC0646b) {
    }
}
