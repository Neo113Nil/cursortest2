package com.facebook.ads.internal.q.a;

import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public class v {

    /* renamed from: a, reason: collision with root package name */
    public static final DisplayMetrics f5437a = Resources.getSystem().getDisplayMetrics();

    /* renamed from: b, reason: collision with root package name */
    public static final float f5438b = f5437a.density;

    /* renamed from: c, reason: collision with root package name */
    private static final AtomicInteger f5439c = new AtomicInteger(1);

    public static int a() {
        int i;
        int i2;
        do {
            i = f5439c.get();
            i2 = i + 1;
            if (i2 > 16777215) {
                i2 = 1;
            }
        } while (!f5439c.compareAndSet(i, i2));
        return i;
    }

    public static int a(int i) {
        return (int) TypedValue.applyDimension(2, i, f5437a);
    }

    public static void a(View view) {
        view.setId(Build.VERSION.SDK_INT >= 17 ? View.generateViewId() : a());
    }

    public static void a(View view, int i) {
        if (Build.VERSION.SDK_INT >= 16) {
            view.setBackground(new ColorDrawable(i));
        } else {
            view.setBackgroundDrawable(new ColorDrawable(i));
        }
    }

    public static void a(View view, Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 16) {
            view.setBackground(drawable);
        } else {
            view.setBackgroundDrawable(drawable);
        }
    }

    public static void a(View... viewArr) {
        for (View view : viewArr) {
            b(view);
        }
    }

    public static void b(View view) {
        ViewGroup viewGroup;
        if (view == null || (viewGroup = (ViewGroup) view.getParent()) == null) {
            return;
        }
        viewGroup.removeView(view);
    }
}
