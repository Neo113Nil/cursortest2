package com.yandex.mobile.ads.impl;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.regex.Pattern;

/* loaded from: classes3.dex */
public final class uj2 {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f33155a = 0;

    static {
        Pattern.compile("^NOTE([ \t].*)?$");
    }

    public static long a(String str) {
        int i4 = u82.f32873a;
        String[] split = str.split("\\.", 2);
        long j4 = 0;
        for (String str2 : split[0].split(StringUtils.PROCESS_POSTFIX_DELIMITER, -1)) {
            j4 = (j4 * 60) + Long.parseLong(str2);
        }
        long j5 = j4 * 1000;
        if (split.length == 2) {
            j5 += Long.parseLong(split[1]);
        }
        return j5 * 1000;
    }
}
