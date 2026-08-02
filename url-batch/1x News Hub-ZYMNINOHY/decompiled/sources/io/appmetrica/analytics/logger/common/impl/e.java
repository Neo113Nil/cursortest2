package io.appmetrica.analytics.logger.common.impl;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final Pattern f8799a = Pattern.compile("[\\p{Space},;]");

    public static int a(Matcher matcher, int i3, int i4) {
        if (i4 >= i3) {
            int i5 = ((i4 - i3) / 2) + i3;
            matcher.region(i5, i4);
            if (matcher.find()) {
                int start = matcher.start();
                int a3 = a(matcher, start + 1, i4);
                return a3 == -1 ? start : a3;
            }
            matcher.region(i3, i5);
            if (matcher.find()) {
                int start2 = matcher.start();
                int a4 = a(matcher, start2 + 1, i5);
                return a4 == -1 ? start2 : a4;
            }
        }
        return -1;
    }
}
