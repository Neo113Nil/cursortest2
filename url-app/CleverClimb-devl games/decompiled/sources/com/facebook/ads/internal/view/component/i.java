package com.facebook.ads.internal.view.component;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import android.text.TextUtils;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.ads.internal.adapters.j;

/* loaded from: classes.dex */
public class i extends LinearLayout {

    /* renamed from: a, reason: collision with root package name */
    private static final float f5607a = Resources.getSystem().getDisplayMetrics().density;

    /* renamed from: b, reason: collision with root package name */
    private static final int f5608b = (int) (f5607a * 6.0f);

    /* renamed from: c, reason: collision with root package name */
    private static final int f5609c = (int) (f5607a * 8.0f);

    /* renamed from: d, reason: collision with root package name */
    private final TextView f5610d;
    private final TextView e;

    public i(Context context, j jVar, boolean z, boolean z2, boolean z3) {
        super(context);
        setOrientation(1);
        Typeface create = Build.VERSION.SDK_INT >= 21 ? Typeface.create("sans-serif-medium", 0) : Typeface.create(Typeface.SANS_SERIF, 1);
        this.f5610d = new TextView(context);
        this.f5610d.setTypeface(create);
        this.f5610d.setTextSize(2, z2 ? 18.0f : 22.0f);
        this.f5610d.setTextColor(jVar.c(z));
        this.f5610d.setEllipsize(TextUtils.TruncateAt.END);
        this.f5610d.setLineSpacing(f5608b, 1.0f);
        this.e = new TextView(context);
        this.e.setTypeface(Typeface.SANS_SERIF, 0);
        this.e.setTextSize(2, z2 ? 14.0f : 16.0f);
        this.e.setTextColor(jVar.b(z));
        this.e.setEllipsize(TextUtils.TruncateAt.END);
        this.e.setLineSpacing(f5608b, 1.0f);
        addView(this.f5610d, new LinearLayout.LayoutParams(-1, -2));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.setMargins(0, z3 ? f5609c / 2 : f5609c, 0, 0);
        addView(this.e, layoutParams);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0035, code lost:
    
        if (r8 != false) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void a(String str, String str2, boolean z, boolean z2) {
        TextView textView;
        boolean z3 = !TextUtils.isEmpty(str);
        boolean z4 = !TextUtils.isEmpty(str2);
        TextView textView2 = this.f5610d;
        if (!z3) {
            str = str2;
        }
        textView2.setText(str);
        TextView textView3 = this.e;
        if (!z3) {
            str2 = "";
        }
        textView3.setText(str2);
        int i = 3;
        if (z3 && z4) {
            this.f5610d.setMaxLines(z ? 1 : 2);
            textView = this.e;
            if (z) {
                i = 1;
            }
        } else {
            textView = this.f5610d;
            if (!z) {
                if (z2) {
                    i = 4;
                }
            }
            i = 2;
        }
        textView.setMaxLines(i);
    }

    public void setAlignment(int i) {
        this.f5610d.setGravity(i);
        this.e.setGravity(i);
    }
}
