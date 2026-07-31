package com.yandex.mobile.ads.impl;

import java.util.ArrayList;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class kw0 {

    /* renamed from: b, reason: collision with root package name */
    private static final Pattern f28342b = Pattern.compile("([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)");

    /* renamed from: c, reason: collision with root package name */
    private static final Pattern f28343c = Pattern.compile(";\\s*(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)|\"([^\"]*)\"))?");

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f28344d = 0;

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f28345a;

    public static final class a {
        @NotNull
        public static kw0 a(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<this>");
            Matcher matcher = kw0.f28342b.matcher(str);
            if (!matcher.lookingAt()) {
                throw new IllegalArgumentException(("No subtype found for: \"" + str + "\"").toString());
            }
            String group = matcher.group(1);
            Intrinsics.checkNotNullExpressionValue(group, "group(...)");
            Locale US = Locale.US;
            Intrinsics.checkNotNullExpressionValue(US, "US");
            Intrinsics.checkNotNullExpressionValue(group.toLowerCase(US), "toLowerCase(...)");
            String group2 = matcher.group(2);
            Intrinsics.checkNotNullExpressionValue(group2, "group(...)");
            Intrinsics.checkNotNullExpressionValue(US, "US");
            Intrinsics.checkNotNullExpressionValue(group2.toLowerCase(US), "toLowerCase(...)");
            ArrayList arrayList = new ArrayList();
            Matcher matcher2 = kw0.f28343c.matcher(str);
            int end = matcher.end();
            while (end < str.length()) {
                matcher2.region(end, str.length());
                if (!matcher2.lookingAt()) {
                    String substring = str.substring(end);
                    Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
                    throw new IllegalArgumentException(("Parameter is not formatted correctly: \"" + substring + "\" for: \"" + str + "\"").toString());
                }
                String group3 = matcher2.group(1);
                if (group3 == null) {
                    end = matcher2.end();
                } else {
                    String group4 = matcher2.group(2);
                    if (group4 == null) {
                        group4 = matcher2.group(3);
                    } else if (StringsKt.K(group4, "'", false, 2, null) && StringsKt.v(group4, "'", false, 2, null) && group4.length() > 2) {
                        group4 = group4.substring(1, group4.length() - 1);
                        Intrinsics.checkNotNullExpressionValue(group4, "substring(...)");
                    }
                    arrayList.add(group3);
                    arrayList.add(group4);
                    end = matcher2.end();
                }
            }
            return new kw0(str, (String[]) arrayList.toArray(new String[0]));
        }
    }

    private kw0(String str) {
        this.f28345a = str;
    }

    public final boolean equals(@Nullable Object obj) {
        return (obj instanceof kw0) && Intrinsics.areEqual(((kw0) obj).f28345a, this.f28345a);
    }

    public final int hashCode() {
        return this.f28345a.hashCode();
    }

    @NotNull
    public final String toString() {
        return this.f28345a;
    }

    public /* synthetic */ kw0(String str, String[] strArr) {
        this(str);
    }
}
