package com.google.android.material.color;

import android.content.Context;
import android.graphics.Color;
import android.util.TypedValue;
import android.view.View;
import androidx.core.graphics.a;
import com.google.android.material.resources.MaterialAttributes;
import kotlin.KotlinVersion;

/* loaded from: classes.dex */
public abstract class MaterialColors {
    public static int compositeARGBWithAlpha(int i4, int i5) {
        return a.k(i4, (Color.alpha(i4) * i5) / KotlinVersion.MAX_COMPONENT_VALUE);
    }

    public static int getColor(View view, int i4) {
        return MaterialAttributes.resolveOrThrow(view, i4);
    }

    public static boolean isColorLight(int i4) {
        return i4 != 0 && a.d(i4) > 0.5d;
    }

    public static int layer(View view, int i4, int i5, float f4) {
        return layer(getColor(view, i4), getColor(view, i5), f4);
    }

    public static int getColor(Context context, int i4, String str) {
        return MaterialAttributes.resolveOrThrow(context, i4, str);
    }

    public static int getColor(View view, int i4, int i5) {
        return getColor(view.getContext(), i4, i5);
    }

    public static int getColor(Context context, int i4, int i5) {
        TypedValue resolve = MaterialAttributes.resolve(context, i4);
        return resolve != null ? resolve.data : i5;
    }

    public static int layer(int i4, int i5, float f4) {
        return layer(i4, a.k(i5, Math.round(Color.alpha(i5) * f4)));
    }

    public static int layer(int i4, int i5) {
        return a.g(i5, i4);
    }
}
