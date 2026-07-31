package com.google.android.material.resources;

import android.content.Context;
import android.util.TypedValue;
import android.view.View;

/* loaded from: classes.dex */
public abstract class MaterialAttributes {
    public static TypedValue resolve(Context context, int i4) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(i4, typedValue, true)) {
            return typedValue;
        }
        return null;
    }

    public static boolean resolveBoolean(Context context, int i4, boolean z4) {
        TypedValue resolve = resolve(context, i4);
        return (resolve == null || resolve.type != 18) ? z4 : resolve.data != 0;
    }

    public static int resolveOrThrow(Context context, int i4, String str) {
        TypedValue resolve = resolve(context, i4);
        if (resolve != null) {
            return resolve.data;
        }
        throw new IllegalArgumentException(String.format("%1$s requires a value for the %2$s attribute to be set in your app theme. You can either set the attribute in your theme or update your theme to inherit from Theme.MaterialComponents (or a descendant).", str, context.getResources().getResourceName(i4)));
    }

    public static int resolveOrThrow(View view, int i4) {
        return resolveOrThrow(view.getContext(), i4, view.getClass().getCanonicalName());
    }
}
