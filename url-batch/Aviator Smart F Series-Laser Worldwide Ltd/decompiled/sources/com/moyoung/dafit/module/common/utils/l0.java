package com.moyoung.dafit.module.common.utils;

import android.support.v4.media.session.PlaybackStateCompat;
import java.util.Locale;

/* loaded from: classes4.dex */
public class l0 {
    public static String getStorageSize(long j8) {
        return getStorageSize(j8, 1);
    }

    public static String getStorageSize(long j8, int i8) {
        if (j8 < 1024) {
            return j8 + "B";
        }
        if (j8 < PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED) {
            return String.format(Locale.getDefault(), "%.0f", Float.valueOf(j8 / 1024.0f)) + "KB";
        }
        return String.format(Locale.getDefault(), i8 == 2 ? "%.2f" : "%.1f", Float.valueOf(j8 / 1048576.0f)) + "MB";
    }
}
