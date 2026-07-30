package com.moyoung.dafit.module.common.utils;

import android.text.TextUtils;

/* loaded from: classes4.dex */
public class w0 {
    private w0() {
    }

    public static String getFileName(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return str.substring(str.lastIndexOf("/") + 1);
    }
}
