package com.onevcat.uniwebview;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.core.view.ViewCompat;
import com.imaginationoverflow.unity.referrer.BuildConfig;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class v0 extends Toolbar {
    public final TextView a;
    public final TextView b;
    public final TextView c;
    public w0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        setTitle(BuildConfig.FLAVOR);
        setElevation(5.0f);
        setBackgroundColor(-1);
        LinearLayout linearLayout = new LinearLayout(context);
        Toolbar.LayoutParams layoutParams = new Toolbar.LayoutParams(-2, -2);
        layoutParams.gravity = GravityCompat.END;
        linearLayout.setLayoutParams(layoutParams);
        TextView a = a("❮");
        this.b = a;
        TextView a2 = a("❯");
        this.c = a2;
        TextView a3 = a("Done");
        this.a = a3;
        a(false, false);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.setMargins(24, 0, 24, 0);
        linearLayout.addView(a, layoutParams2);
        linearLayout.addView(a2, layoutParams2);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams3.setMargins(48, 0, 24, 0);
        linearLayout.addView(a3, layoutParams3);
        addView(linearLayout);
    }

    public final TextView a(String str) {
        final TextView textView = new TextView(getContext());
        textView.setText(str);
        textView.setTextSize(1, 16.0f);
        textView.setTextColor(ViewCompat.MEASURED_STATE_MASK);
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.onevcat.uniwebview.v0$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                v0.a(v0.this, textView, view);
            }
        });
        return textView;
    }

    public final void b(float f, float f2, float f3, float f4) {
        float f5 = 255;
        setTitleTextColor(Color.argb((int) (f4 * f5), (int) (f * f5), (int) (f2 * f5), (int) (f3 * f5)));
    }

    public final w0 getDelegate() {
        return this.d;
    }

    public final void setDelegate(w0 w0Var) {
        this.d = w0Var;
    }

    public final void setDoneButtonText(String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.a.setText(text);
    }

    public final void setGoBackButtonText(String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.b.setText(text);
    }

    public final void setGoForwardButtonText(String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.c.setText(text);
    }

    public final void setNavigationButtonsShow(boolean z) {
        this.b.setVisibility(z ? 0 : 8);
        this.c.setVisibility(z ? 0 : 8);
    }

    public static final void a(v0 this$0, TextView button, View view) {
        w0 w0Var;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(button, "$button");
        if (Intrinsics.areEqual(button, this$0.a)) {
            w0 w0Var2 = this$0.d;
            if (w0Var2 != null) {
                s0 s0Var = (s0) w0Var2;
                s0Var.c.a(s0Var.p.getName(), h5.WebViewDone, BuildConfig.FLAVOR);
                return;
            }
            return;
        }
        if (Intrinsics.areEqual(button, this$0.b)) {
            w0 w0Var3 = this$0.d;
            if (w0Var3 != null) {
                ((s0) w0Var3).p.c();
                return;
            }
            return;
        }
        if (!Intrinsics.areEqual(button, this$0.c) || (w0Var = this$0.d) == null) {
            return;
        }
        b0 b0Var = ((s0) w0Var).p;
        b0 b0Var2 = b0Var.d.i;
        if (b0Var2 != null) {
            if (b0Var2.canGoForward()) {
                b0Var2.goForward();
            }
        } else if (b0Var.canGoForward()) {
            b0Var.goForward();
        }
    }

    public final void a(float f, float f2, float f3, float f4) {
        float f5 = 255;
        setBackgroundColor(Color.argb((int) (f4 * f5), (int) (f * f5), (int) (f2 * f5), (int) (f3 * f5)));
    }

    public final void a(boolean z, boolean z2) {
        this.b.setEnabled(z);
        this.b.setAlpha(z ? 1.0f : 0.3f);
        this.c.setEnabled(z2);
        this.c.setAlpha(z2 ? 1.0f : 0.3f);
    }
}
