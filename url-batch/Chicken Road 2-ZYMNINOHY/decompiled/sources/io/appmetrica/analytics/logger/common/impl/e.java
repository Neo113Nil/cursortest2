package io.appmetrica.analytics.logger.common.impl;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final Pattern f13195a = Pattern.compile("[\\p{Space},;]");

    public static int a(Matcher matcher, int i4, int i5) {
        if (i5 >= i4) {
            int i6 = ((i5 - i4) / 2) + i4;
            matcher.region(i6, i5);
            if (matcher.find()) {
                int start = matcher.start();
                int a3 = a(matcher, start + 1, i5);
                return a3 == -1 ? start : a3;
            }
            matcher.region(i4, i6);
            if (matcher.find()) {
                int start2 = matcher.start();
                int a4 = a(matcher, start2 + 1, i6);
                return a4 == -1 ? start2 : a4;
            }
        }
        return -1;
    }
}
