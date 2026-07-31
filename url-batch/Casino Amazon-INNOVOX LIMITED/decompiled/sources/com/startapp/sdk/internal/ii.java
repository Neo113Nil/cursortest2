package com.startapp.sdk.internal;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.regex.Pattern;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public final class ii implements Comparable {
    public static final Pattern c = Pattern.compile("\\d{2}:\\d{2}:\\d{2}(.\\d{3})?");
    public static final Pattern d = Pattern.compile("((\\d{1,2})|(100))%");

    /* renamed from: a, reason: collision with root package name */
    public final String f279a;
    public final Comparable b;

    public ii(String str, Comparable comparable) {
        this.f279a = str;
        this.b = comparable;
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

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.b.compareTo(((ii) obj).b);
    }
}
