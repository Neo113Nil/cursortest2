package com.moyoung.dafit.module.common.utils;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import androidx.annotation.StringRes;

/* loaded from: classes4.dex */
public class l {
    public static void copyText(String str) {
        copyText(str, "Copy success!");
    }

    public static void copyText(String str, @StringRes int i8) {
        copyText(str, d.get().getString(i8));
    }

    public static void copyText(String str, String str2) {
        Context context = d.get();
        ClipData newPlainText = ClipData.newPlainText("label", str);
        ClipboardManager clipboardManager = (ClipboardManager) context.getSystemService("clipboard");
        if (clipboardManager != null) {
            clipboardManager.setPrimaryClip(newPlainText);
            r0.showShort(context, str2);
        }
    }
}
