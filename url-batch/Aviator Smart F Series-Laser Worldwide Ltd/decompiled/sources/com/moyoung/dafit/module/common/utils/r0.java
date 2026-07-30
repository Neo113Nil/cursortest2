package com.moyoung.dafit.module.common.utils;

import android.content.Context;
import android.widget.Toast;
import androidx.annotation.StringRes;

/* loaded from: classes4.dex */
public class r0 {
    private r0() {
    }

    public static void showLong(CharSequence charSequence) {
        showLong(d.get(), charSequence);
    }

    public static void showShort(CharSequence charSequence) {
        showShort(d.get(), charSequence);
    }

    public static void showLong(@StringRes int i8) {
        showLong(d.get(), i8);
    }

    public static void showShort(@StringRes int i8) {
        showShort(d.get(), i8);
    }

    public static void showLong(Context context, CharSequence charSequence) {
        Toast.makeText(context.getApplicationContext(), charSequence, 1).show();
    }

    public static void showShort(Context context, CharSequence charSequence) {
        Toast.makeText(context.getApplicationContext(), charSequence, 0).show();
    }

    public static void showLong(Context context, @StringRes int i8) {
        Toast.makeText(context.getApplicationContext(), i8, 1).show();
    }

    public static void showShort(Context context, @StringRes int i8) {
        Toast.makeText(context.getApplicationContext(), i8, 0).show();
    }
}
