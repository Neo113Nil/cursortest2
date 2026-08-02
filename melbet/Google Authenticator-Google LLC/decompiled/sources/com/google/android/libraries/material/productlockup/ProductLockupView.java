package com.google.android.libraries.material.productlockup;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.authenticator2.R;
import defpackage.a;
import defpackage.dnf;
import defpackage.dng;
import defpackage.dnh;
import defpackage.e;
import defpackage.yq;
import java.nio.charset.StandardCharsets;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class ProductLockupView extends ViewGroup {
    private static final Pattern a = Pattern.compile(String.format(" %1$s|%1$s ", "Google"));
    private static final int[] f = {1};
    private static final int[] g = {2};
    private static final int[] h = {1, 2};
    private static Typeface i;
    final ImageView b;
    public final TextView c;
    public dng d;
    public int e;
    private final dng j;
    private final dng k;
    private Drawable l;
    private int m;
    private String n;
    private boolean o;
    private boolean p;
    private boolean q;

    public ProductLockupView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        String trim;
        if (i == null) {
            i = Typeface.createFromAsset(context.getAssets(), "ProductSans-Regular.ttf");
        }
        this.j = new dng(getResources(), R.dimen.product_name_text_size, R.dimen.logo_margin_top, R.dimen.logo_width, R.dimen.logo_height, R.dimen.separation_margin);
        this.k = new dng(getResources(), R.dimen.product_name_text_size_small, R.dimen.logo_margin_top_small, R.dimen.logo_width_small, R.dimen.logo_height_small, R.dimen.separation_margin_small);
        boolean z = true;
        LayoutInflater.from(context).inflate(R.layout.product_lockup_view, (ViewGroup) this, true);
        ImageView imageView = (ImageView) findViewById(R.id.logo);
        imageView.getClass();
        this.b = imageView;
        TextView textView = (TextView) findViewById(R.id.product_name);
        textView.getClass();
        this.c = textView;
        textView.setTypeface(i);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, dnh.b, i2, R.style.Widget_GoogleMaterial_ProductLockupView);
        if (obtainStyledAttributes.hasValue(2)) {
            this.l = obtainStyledAttributes.getDrawable(2);
        } else {
            this.l = e.f(context, 2131230949);
        }
        int i3 = obtainStyledAttributes.getInt(1, 0);
        this.m = i3;
        h(i3);
        textView.setTextColor(obtainStyledAttributes.getColor(4, 0));
        String string = obtainStyledAttributes.getString(0);
        String trim2 = (string == null ? "" : string).trim();
        this.n = trim2;
        this.p = a.matcher(trim2).find();
        if (!TextUtils.isEmpty(string) && !StandardCharsets.ISO_8859_1.newEncoder().canEncode(string)) {
            z = false;
        }
        this.o = z;
        boolean startsWith = this.n.startsWith("Google");
        String str = this.n;
        if (startsWith) {
            trim = str.substring(6).trim();
        } else {
            boolean endsWith = str.endsWith("Google");
            String str2 = this.n;
            trim = endsWith ? str2.substring(0, str2.length() - 6).trim() : str2;
        }
        textView.setText(trim);
        setContentDescription(this.n.isEmpty() ? "Google" : this.n);
        requestLayout();
        a(obtainStyledAttributes.getInt(3, 0));
        obtainStyledAttributes.recycle();
    }

    protected static final int b(int i2) {
        if (i2 == 1) {
            return R.color.google_black;
        }
        if (i2 == 2) {
            return R.color.google_white;
        }
        if (i2 == 3) {
            return R.color.google_grey700;
        }
        throw new IllegalStateException(a.Y(i2, "Unrecognized logoColor: "));
    }

    private final int c() {
        if (this.n.isEmpty()) {
            return 0;
        }
        TextView textView = this.c;
        return Math.max(textView.getPaint().getFontMetricsInt().top + textView.getBaseline(), 0);
    }

    private final int d(dng dngVar) {
        return Math.round(dngVar.e * (true != this.p ? 0.15f : 1.0f));
    }

    private final void e(View view, int i2, int i3, int i4, int i5) {
        int i6 = yq.a;
        boolean z = false;
        if (getLayoutDirection() == 1 && !this.o) {
            z = true;
        }
        int measuredWidth = z ? getMeasuredWidth() - i4 : i2;
        if (z) {
            i4 = getMeasuredWidth() - i2;
        }
        view.layout(measuredWidth, i3, i4, i5);
    }

    private final void f() {
        this.b.measure(View.MeasureSpec.makeMeasureSpec(this.d.c, 1073741824), View.MeasureSpec.makeMeasureSpec(this.d.d, 1073741824));
    }

    private final void g() {
        float f2 = this.d.a;
        TextView textView = this.c;
        textView.setTextSize(0, f2);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        textView.measure(makeMeasureSpec, makeMeasureSpec);
    }

    private final void h(int i2) {
        dng dngVar;
        if (i2 == -1) {
            dngVar = null;
        } else if (i2 == 0) {
            dngVar = this.j;
        } else if (i2 == 1) {
            dngVar = this.j;
        } else {
            if (i2 != 2) {
                throw new IllegalStateException(a.Y(i2, "Unrecognized sizingMode: "));
            }
            dngVar = this.k;
        }
        this.d = dngVar;
    }

    private final boolean i(int i2, boolean z) {
        int i3;
        if (z) {
            dng dngVar = this.d;
            i3 = dngVar.c + d(dngVar);
        } else {
            i3 = 0;
        }
        g();
        return i3 + this.c.getMeasuredWidth() <= i2;
    }

    public void a(int i2) {
        this.e = i2;
        Drawable mutate = this.l.mutate();
        int i3 = this.e;
        if (i3 == 0) {
            mutate.setTintList(null);
        } else {
            mutate.setTint(getContext().getColor(b(i3)));
        }
        this.b.setImageDrawable(mutate);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        ImageView imageView = this.b;
        int i6 = 0;
        if (imageView.getVisibility() != 8) {
            TextView textView = this.c;
            int measuredWidth = (textView.getVisibility() == 8 || this.q) ? 0 : textView.getMeasuredWidth() + d(this.d);
            int c = c() + this.d.b;
            e(imageView, measuredWidth, c, imageView.getMeasuredWidth() + measuredWidth, imageView.getMeasuredHeight() + c);
        }
        TextView textView2 = this.c;
        if (textView2.getVisibility() != 8) {
            if (imageView.getVisibility() != 8 && this.q) {
                i6 = imageView.getMeasuredWidth() + d(this.d);
            }
            int i7 = i6;
            e(textView2, i7, 0, i7 + textView2.getMeasuredWidth(), textView2.getMeasuredHeight());
        }
    }

    @Override // android.view.View
    protected final void onMeasure(int i2, int i3) {
        int[] iArr;
        ImageView imageView = this.b;
        int size = View.MeasureSpec.getSize(i2);
        imageView.setVisibility(0);
        TextView textView = this.c;
        textView.setVisibility(0);
        this.q = this.n.startsWith("Google");
        boolean endsWith = this.n.endsWith("Google");
        int i4 = this.m;
        if (i4 == -1) {
            iArr = null;
        } else if (i4 == 0) {
            iArr = h;
        } else if (i4 == 1) {
            iArr = f;
        } else {
            if (i4 != 2) {
                throw new IllegalStateException(a.Y(i4, "Unrecognized sizingMode: "));
            }
            iArr = g;
        }
        if (this.q || endsWith) {
            for (int i5 : iArr) {
                h(i5);
                if (i(size, true)) {
                    f();
                    g();
                    break;
                }
            }
        }
        int length = iArr.length;
        int i6 = 0;
        while (true) {
            if (i6 >= length) {
                h(1);
                this.q = true;
                f();
                textView.setVisibility(8);
                break;
            }
            h(iArr[i6]);
            if (i(size, false)) {
                g();
                imageView.setVisibility(8);
                break;
            }
            i6++;
        }
        boolean z = imageView.getVisibility() == 0;
        boolean z2 = textView.getVisibility() == 0;
        int measuredWidth = z ? imageView.getMeasuredWidth() : 0;
        if (z2) {
            measuredWidth += textView.getMeasuredWidth();
        }
        if (z && z2) {
            measuredWidth += d(this.d);
        }
        setMeasuredDimension(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(Math.max(imageView.getMeasuredHeight() + this.d.b + c(), textView.getMeasuredHeight()), 1073741824));
    }

    @Override // android.view.View
    protected final void onRestoreInstanceState(Parcelable parcelable) {
        dnf dnfVar = (dnf) parcelable;
        super.onRestoreInstanceState(dnfVar.getSuperState());
        this.n = dnfVar.a;
        this.p = dnfVar.b;
    }

    @Override // android.view.View
    protected final Parcelable onSaveInstanceState() {
        dnf dnfVar = new dnf(super.onSaveInstanceState());
        dnfVar.a = this.n;
        dnfVar.b = this.p;
        return dnfVar;
    }

    public ProductLockupView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.productLockupViewStyle);
    }

    public ProductLockupView(Context context) {
        this(context, null);
    }
}
