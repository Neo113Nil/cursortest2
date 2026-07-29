package com.facebook.ads.internal.view.component;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.support.v4.graphics.ColorUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.facebook.ads.internal.adapters.j;
import com.facebook.ads.internal.q.a.v;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class d extends LinearLayout {

    /* renamed from: a, reason: collision with root package name */
    private final int f5596a;

    /* renamed from: b, reason: collision with root package name */
    private final int f5597b;

    /* renamed from: c, reason: collision with root package name */
    private final int f5598c;

    /* renamed from: d, reason: collision with root package name */
    private int f5599d;
    private List<GradientDrawable> e;

    public d(Context context, j jVar, int i) {
        super(context);
        this.f5599d = -1;
        setOrientation(0);
        setGravity(17);
        float f = v.f5438b;
        int i2 = (int) (8.0f * f);
        int i3 = (int) (6.0f * f);
        this.f5598c = (int) (f * 1.0f);
        this.f5596a = jVar.a(false);
        this.f5597b = ColorUtils.setAlphaComponent(this.f5596a, 128);
        this.e = new ArrayList();
        for (int i4 = 0; i4 < i; i4++) {
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(1);
            gradientDrawable.setSize(i2, i2);
            gradientDrawable.setStroke(this.f5598c, 0);
            ImageView imageView = new ImageView(context);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
            layoutParams.setMargins(0, 0, i3, 0);
            layoutParams.gravity = 17;
            imageView.setLayoutParams(layoutParams);
            imageView.setImageDrawable(gradientDrawable);
            this.e.add(gradientDrawable);
            addView(imageView);
        }
        a(0);
    }

    public void a(int i) {
        int i2;
        int i3;
        if (this.f5599d == i) {
            return;
        }
        this.f5599d = i;
        for (int i4 = 0; i4 < this.e.size(); i4++) {
            if (i4 == i) {
                i2 = this.f5596a;
                i3 = this.f5596a;
            } else {
                i2 = this.f5597b;
                i3 = 0;
            }
            this.e.get(i4).setStroke(this.f5598c, i3);
            this.e.get(i4).setColor(i2);
            this.e.get(i4).invalidateSelf();
        }
    }
}
