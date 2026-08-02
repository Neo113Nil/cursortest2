package com.startapp.sdk.internal;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class bj implements Comparable {

    /* renamed from: c, reason: collision with root package name */
    public static final Pattern f3614c = Pattern.compile("\\d{2}:\\d{2}:\\d{2}(.\\d{3})?");

    /* renamed from: d, reason: collision with root package name */
    public static final Pattern f3615d = Pattern.compile("((\\d{1,2})|(100))%");

    /* renamed from: a, reason: collision with root package name */
    public final String f3616a;

    /* renamed from: b, reason: collision with root package name */
    public final Number f3617b;

    /* JADX WARN: Multi-variable type inference failed */
    public bj(String str, Comparable comparable) {
        this.f3616a = str;
        this.f3617b = (Number) comparable;
    }

    public static Integer a(String str) {
        String[] split = str.split(StringUtils.PROCESS_POSTFIX_DELIMITER);
        if (split.length != 3) {
            return null;
        }
        try {
            return Integer.valueOf((Integer.parseInt(split[1]) * 60000) + (Integer.parseInt(split[0]) * 3600000) + ((int) (Float.parseFloat(split[2]) * 1000.0f)));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Comparable, java.lang.Number] */
    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f3617b.compareTo(((bj) obj).f3617b);
    }
}
