package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.text.TextUtils;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class x30 extends RelativeLayout {

    /* renamed from: g, reason: collision with root package name */
    private static final float[] f14024g = {5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f};

    /* renamed from: f, reason: collision with root package name */
    private AnimationDrawable f14025f;

    public x30(Context context, w30 w30Var, RelativeLayout.LayoutParams layoutParams) {
        super(context);
        r3.o.i(w30Var);
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(f14024g, null, null));
        shapeDrawable.getPaint().setColor(w30Var.g());
        setLayoutParams(layoutParams);
        y2.t.r();
        setBackground(shapeDrawable);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        if (!TextUtils.isEmpty(w30Var.e())) {
            RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
            TextView textView = new TextView(context);
            textView.setLayoutParams(layoutParams3);
            textView.setId(1195835393);
            textView.setTypeface(Typeface.DEFAULT);
            textView.setText(w30Var.e());
            textView.setTextColor(w30Var.b());
            textView.setTextSize(w30Var.t6());
            qw.b();
            int s7 = bo0.s(context, 4);
            qw.b();
            textView.setPadding(s7, 0, bo0.s(context, 4), 0);
            addView(textView);
            layoutParams2.addRule(1, textView.getId());
        }
        ImageView imageView = new ImageView(context);
        imageView.setLayoutParams(layoutParams2);
        imageView.setId(1195835394);
        List<z30> u6 = w30Var.u6();
        if (u6 != null && u6.size() > 1) {
            this.f14025f = new AnimationDrawable();
            Iterator<z30> it = u6.iterator();
            while (it.hasNext()) {
                try {
                    this.f14025f.addFrame((Drawable) x3.b.O0(it.next().d()), w30Var.a());
                } catch (Exception e7) {
                    io0.e("Error while getting drawable.", e7);
                }
            }
            y2.t.r();
            imageView.setBackground(this.f14025f);
        } else if (u6.size() == 1) {
            try {
                imageView.setImageDrawable((Drawable) x3.b.O0(u6.get(0).d()));
            } catch (Exception e8) {
                io0.e("Error while getting drawable.", e8);
            }
        }
        addView(imageView);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        AnimationDrawable animationDrawable = this.f14025f;
        if (animationDrawable != null) {
            animationDrawable.start();
        }
        super.onAttachedToWindow();
    }
}
