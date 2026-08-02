package com.squareup.cash.storage;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import kotlin.text.StringsKt;

/* loaded from: classes6.dex */
public abstract class UtilsKt {
    public static final SimpleDateFormat timestampFormat = new SimpleDateFormat("yyyyMMddHHmmssSS", Locale.US);

    public static final String tempFileName(String str) {
        return Boxes$$ExternalSyntheticOutline1.m$1(str, "-", timestampFormat.format(new Date()), ".", StringsKt.trimStart("jpg", '.'));
    }
}
