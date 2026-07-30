package com.onevcat.uniwebview.internal.obfuscated;

import android.app.Activity;
import android.graphics.Color;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toolbar;
import androidx.core.view.ViewCompat;
import com.google.common.primitives.Ints;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.onevcat.uniwebview.internal.obfuscated.z0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0133z0 extends Toolbar {
    public final LinearLayout a;
    public final LinearLayout b;
    public final LinearLayout c;
    public final TextView d;
    public final ArrayList e;
    public TextView f;
    public TextView g;
    public TextView h;
    public boolean i;
    public boolean j;
    public String k;
    public EnumC0128y l;
    public EnumC0124x m;
    public String n;
    public A0 o;
    public int p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0133z0(Activity context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.e = new ArrayList();
        EnumC0089o kind = EnumC0089o.Title;
        Intrinsics.checkNotNullParameter(kind, "kind");
        this.k = "uwv.toolbar.title";
        this.l = EnumC0128y.None;
        this.m = EnumC0124x.None;
        setTitle("");
        setElevation(5.0f);
        setBackgroundColor(-1);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(16);
        linearLayout.setLayoutParams(new Toolbar.LayoutParams(-1, -1));
        linearLayout.setPadding(24, 0, 24, 0);
        LinearLayout linearLayout2 = new LinearLayout(getContext());
        linearLayout2.setOrientation(0);
        linearLayout2.setGravity(16);
        linearLayout2.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        this.a = linearLayout2;
        LinearLayout linearLayout3 = new LinearLayout(context);
        linearLayout3.setOrientation(0);
        linearLayout3.setGravity(17);
        linearLayout3.setLayoutParams(new LinearLayout.LayoutParams(0, -1, 1.0f));
        this.b = linearLayout3;
        LinearLayout linearLayout4 = new LinearLayout(getContext());
        linearLayout4.setOrientation(0);
        linearLayout4.setGravity(16);
        linearLayout4.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        this.c = linearLayout4;
        TextView textView = new TextView(context);
        textView.setGravity(17);
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(textView.getTypeface(), 1);
        textView.setTextColor(ViewCompat.MEASURED_STATE_MASK);
        textView.setVisibility(8);
        this.d = textView;
        linearLayout.addView(linearLayout2);
        linearLayout.addView(linearLayout3);
        linearLayout.addView(linearLayout4);
        addView(linearLayout);
        this.p = Integer.MAX_VALUE;
    }

    public static final boolean b(C0133z0 this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        A0 a0 = this$0.o;
        if (a0 == null) {
            return true;
        }
        ((com.onevcat.uniwebview.d) a0).a(this$0.k, "longPress", this$0.n);
        return true;
    }

    public final void a(TextView textView, C0104s c0104s) {
        if (c0104s.a != EnumC0112u.BuiltIn) {
            return;
        }
        EnumC0089o enumC0089o = c0104s.c;
        int i = enumC0089o == null ? -1 : AbstractC0129y0.a[enumC0089o.ordinal()];
        if (i == 1) {
            this.f = textView;
        } else if (i == 2) {
            this.g = textView;
        } else {
            if (i != 3) {
                return;
            }
            this.h = textView;
        }
    }

    public final A0 getDelegate() {
        return this.o;
    }

    public final int getMaxHeight() {
        return this.p;
    }

    @Override // android.widget.Toolbar, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.p < getMeasuredHeight()) {
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(this.p, Ints.MAX_POWER_OF_TWO));
        }
    }

    public final void setDelegate(A0 a0) {
        this.o = a0;
    }

    public final void setDoneButtonText(String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        TextView textView = this.h;
        if (textView == null) {
            return;
        }
        textView.setText(text);
    }

    public final void setGoBackButtonText(String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        TextView textView = this.f;
        if (textView == null) {
            return;
        }
        textView.setText(text);
    }

    public final void setGoForwardButtonText(String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        TextView textView = this.g;
        if (textView == null) {
            return;
        }
        textView.setText(text);
    }

    public final void setMaxHeight(int i) {
        this.p = Math.max(0, i);
        requestLayout();
    }

    public final void setNavigationButtonsShow(boolean z) {
        int i = z ? 0 : 8;
        TextView textView = this.f;
        if (textView != null) {
            textView.setVisibility(i);
        }
        TextView textView2 = this.g;
        if (textView2 == null) {
            return;
        }
        textView2.setVisibility(i);
    }

    public final void setToolbarTitleText(String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.d.setText(text);
        this.d.setVisibility(0);
    }

    public final TextView a(final C0104s c0104s, C0132z c0132z) {
        String str;
        C0093p c0093p;
        String str2 = c0104s.d;
        if (str2 != null && str2.length() != 0) {
            str = c0104s.d;
        } else {
            if (c0104s.a == EnumC0112u.BuiltIn) {
                EnumC0089o enumC0089o = c0104s.c;
                int i = enumC0089o == null ? -1 : AbstractC0129y0.a[enumC0089o.ordinal()];
                if (i != -1) {
                    if (i == 1) {
                        str = "❮";
                    } else if (i == 2) {
                        str = "❯";
                    } else if (i == 3) {
                        str = "Done";
                    } else if (i == 4) {
                        str = "↻";
                    } else if (i != 5) {
                        throw new NoWhenBranchMatchedException();
                    }
                }
            }
            str = "";
        }
        int applyDimension = (int) TypedValue.applyDimension(1, 44.0f, getContext().getResources().getDisplayMetrics());
        C0108t c0108t = c0104s.f;
        if (c0108t == null || (c0093p = c0108t.a) == null) {
            c0093p = c0132z.e;
        }
        TextView textView = new TextView(getContext());
        textView.setText(str);
        textView.setTextSize(1, 16.0f);
        float f = 255;
        textView.setTextColor(Color.argb((int) (c0093p.d * f), (int) (c0093p.a * f), (int) (c0093p.b * f), (int) (c0093p.c * f)));
        textView.setGravity(17);
        textView.setMinimumWidth(applyDimension);
        textView.setMinimumHeight(applyDimension);
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.onevcat.uniwebview.internal.obfuscated.z0$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C0133z0.a(C0133z0.this, c0104s, view);
            }
        });
        if (c0104s.a == EnumC0112u.BuiltIn && c0104s.c == EnumC0089o.Reload) {
            textView.setContentDescription("Reload");
        }
        return textView;
    }

    public final void a(C0132z config) {
        C0093p c0093p;
        EnumC0128y enumC0128y;
        EnumC0124x enumC0124x;
        Intrinsics.checkNotNullParameter(config, "config");
        this.f = null;
        this.g = null;
        this.h = null;
        this.e.clear();
        this.a.removeAllViews();
        this.b.removeAllViews();
        this.c.removeAllViews();
        C0093p c0093p2 = config.d;
        float f = 255;
        setBackgroundColor(Color.argb((int) (c0093p2.d * f), (int) (c0093p2.a * f), (int) (c0093p2.b * f), (int) (c0093p2.c * f)));
        Intrinsics.checkNotNullParameter(EnumC0089o.Title, "kind");
        this.k = "uwv.toolbar.title";
        this.l = EnumC0128y.None;
        this.m = EnumC0124x.None;
        this.n = null;
        boolean z = false;
        for (C0104s c0104s : config.h) {
            if (!Intrinsics.areEqual(c0104s.e, Boolean.FALSE)) {
                if (c0104s.a == EnumC0112u.BuiltIn) {
                    EnumC0089o enumC0089o = c0104s.c;
                    EnumC0089o kind = EnumC0089o.Title;
                    if (enumC0089o == kind) {
                        TextView textView = this.d;
                        String str = c0104s.d;
                        if (str == null) {
                            str = "";
                        }
                        textView.setText(str);
                        TextView textView2 = this.d;
                        C0108t c0108t = c0104s.f;
                        if (c0108t == null || (c0093p = c0108t.a) == null) {
                            c0093p = config.f;
                        }
                        textView2.setTextColor(Color.argb((int) (c0093p.d * f), (int) (c0093p.a * f), (int) (c0093p.b * f), (int) (c0093p.c * f)));
                        this.d.setVisibility(0);
                        this.b.addView(this.d, new LinearLayout.LayoutParams(-2, -2));
                        C0120w c0120w = c0104s.g;
                        String str2 = c0104s.b;
                        if (str2.length() == 0) {
                            Intrinsics.checkNotNullParameter(kind, "kind");
                            str2 = "uwv.toolbar.title";
                        }
                        this.k = str2;
                        if (c0120w != null) {
                            enumC0128y = c0120w.a;
                        } else {
                            enumC0128y = EnumC0128y.None;
                        }
                        this.l = enumC0128y;
                        if (c0120w != null) {
                            enumC0124x = c0120w.b;
                        } else {
                            enumC0124x = EnumC0124x.None;
                        }
                        this.m = enumC0124x;
                        this.n = c0120w != null ? c0120w.c : null;
                        z = true;
                    }
                }
                TextView a = a(c0104s, config);
                LinearLayout linearLayout = this.b;
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                layoutParams.setMargins(4, 0, 4, 0);
                linearLayout.addView(a, layoutParams);
                this.e.add(a);
                a(a, c0104s);
            }
        }
        if (!z) {
            this.d.setVisibility(8);
        }
        a(z);
        List<C0104s> list = config.g;
        LinearLayout linearLayout2 = this.a;
        for (C0104s c0104s2 : list) {
            if (!Intrinsics.areEqual(c0104s2.e, Boolean.FALSE) && (c0104s2.a != EnumC0112u.BuiltIn || c0104s2.c != EnumC0089o.Title)) {
                TextView a2 = a(c0104s2, config);
                LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
                layoutParams2.setMargins(4, 0, 4, 0);
                linearLayout2.addView(a2, layoutParams2);
                this.e.add(a2);
                a(a2, c0104s2);
            }
        }
        List<C0104s> list2 = config.i;
        LinearLayout linearLayout3 = this.c;
        for (C0104s c0104s3 : list2) {
            if (!Intrinsics.areEqual(c0104s3.e, Boolean.FALSE) && (c0104s3.a != EnumC0112u.BuiltIn || c0104s3.c != EnumC0089o.Title)) {
                TextView a3 = a(c0104s3, config);
                LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
                layoutParams3.setMargins(4, 0, 4, 0);
                linearLayout3.addView(a3, layoutParams3);
                this.e.add(a3);
                a(a3, c0104s3);
            }
        }
        a(this.i, this.j);
        requestLayout();
    }

    public final void a(boolean z, boolean z2) {
        this.i = z;
        this.j = z2;
        TextView textView = this.f;
        if (textView != null) {
            textView.setEnabled(z);
        }
        TextView textView2 = this.f;
        if (textView2 != null) {
            textView2.setAlpha(z ? 1.0f : 0.3f);
        }
        TextView textView3 = this.g;
        if (textView3 != null) {
            textView3.setEnabled(z2);
        }
        TextView textView4 = this.g;
        if (textView4 == null) {
            return;
        }
        textView4.setAlpha(z2 ? 1.0f : 0.3f);
    }

    public static final void a(C0133z0 this$0, C0104s item, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(item, "$item");
        this$0.getClass();
        if (item.a == EnumC0112u.BuiltIn) {
            EnumC0089o enumC0089o = item.c;
            int i = enumC0089o == null ? -1 : AbstractC0129y0.a[enumC0089o.ordinal()];
            if (i == 1) {
                A0 a0 = this$0.o;
                if (a0 != null) {
                    String identifier = item.b;
                    com.onevcat.uniwebview.d dVar = (com.onevcat.uniwebview.d) a0;
                    Intrinsics.checkNotNullParameter(identifier, "identifier");
                    if (dVar.b(identifier, "tap", null)) {
                        return;
                    }
                    dVar.v.c();
                    return;
                }
                return;
            }
            if (i == 2) {
                A0 a02 = this$0.o;
                if (a02 != null) {
                    String identifier2 = item.b;
                    com.onevcat.uniwebview.d dVar2 = (com.onevcat.uniwebview.d) a02;
                    Intrinsics.checkNotNullParameter(identifier2, "identifier");
                    if (dVar2.b(identifier2, "tap", null)) {
                        return;
                    }
                    com.onevcat.uniwebview.a aVar = dVar2.v;
                    com.onevcat.uniwebview.a f = aVar.f();
                    if (f != null) {
                        if (f.canGoForward()) {
                            f.goForward();
                            return;
                        }
                        return;
                    } else {
                        if (aVar.canGoForward()) {
                            aVar.goForward();
                            return;
                        }
                        return;
                    }
                }
                return;
            }
            if (i == 3) {
                A0 a03 = this$0.o;
                if (a03 != null) {
                    String identifier3 = item.b;
                    com.onevcat.uniwebview.d dVar3 = (com.onevcat.uniwebview.d) a03;
                    Intrinsics.checkNotNullParameter(identifier3, "identifier");
                    if (dVar3.b(identifier3, "tap", null)) {
                        return;
                    }
                    com.onevcat.uniwebview.a aVar2 = dVar3.v;
                    H3 method = H3.WebViewDone;
                    aVar2.getClass();
                    Intrinsics.checkNotNullParameter(method, "method");
                    Intrinsics.checkNotNullParameter("", "parameters");
                    aVar2.j.a(method, "");
                    return;
                }
                return;
            }
            if (i == 4) {
                A0 a04 = this$0.o;
                if (a04 != null) {
                    String identifier4 = item.b;
                    com.onevcat.uniwebview.d dVar4 = (com.onevcat.uniwebview.d) a04;
                    Intrinsics.checkNotNullParameter(identifier4, "identifier");
                    if (dVar4.b(identifier4, "tap", null)) {
                        return;
                    }
                    dVar4.v.reload();
                    return;
                }
                return;
            }
        }
        A0 a05 = this$0.o;
        if (a05 != null) {
            String identifier5 = item.b;
            Intrinsics.checkNotNullParameter(identifier5, "identifier");
            ((com.onevcat.uniwebview.d) a05).b(identifier5, "tap", null);
        }
    }

    public final void a(boolean z) {
        boolean z2 = z && this.l != EnumC0128y.None;
        boolean z3 = z && this.m != EnumC0124x.None;
        if (z2) {
            this.d.setOnClickListener(new View.OnClickListener() { // from class: com.onevcat.uniwebview.internal.obfuscated.z0$$ExternalSyntheticLambda1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C0133z0.a(C0133z0.this, view);
                }
            });
        } else {
            this.d.setOnClickListener(null);
        }
        if (z3) {
            this.d.setOnLongClickListener(new View.OnLongClickListener() { // from class: com.onevcat.uniwebview.internal.obfuscated.z0$$ExternalSyntheticLambda2
                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(View view) {
                    return C0133z0.b(C0133z0.this, view);
                }
            });
        } else {
            this.d.setOnLongClickListener(null);
        }
    }

    public static final void a(C0133z0 this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        A0 a0 = this$0.o;
        if (a0 != null) {
            ((com.onevcat.uniwebview.d) a0).a(this$0.k, "tap", this$0.n);
        }
    }

    public final void a(float f, float f2, float f3, float f4) {
        float f5 = 255;
        setBackgroundColor(Color.argb((int) (f4 * f5), (int) (f * f5), (int) (f2 * f5), (int) (f3 * f5)));
    }
}
