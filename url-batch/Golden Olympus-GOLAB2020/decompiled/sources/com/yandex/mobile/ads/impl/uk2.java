package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes3.dex */
public final class uk2 {
    public static boolean a(@NotNull XmlPullParser p4) {
        Intrinsics.checkNotNullParameter(p4, "p");
        return p4.next() != 3;
    }

    public static boolean b(@NotNull XmlPullParser p4) {
        Intrinsics.checkNotNullParameter(p4, "p");
        return p4.getEventType() == 2;
    }

    @NotNull
    public static String c(@NotNull XmlPullParser p4) {
        String str;
        Intrinsics.checkNotNullParameter(p4, "p");
        if (p4.next() == 4) {
            str = p4.getText();
            Intrinsics.checkNotNullExpressionValue(str, "getText(...)");
            p4.nextTag();
        } else {
            str = "";
        }
        int length = str.length() - 1;
        int i4 = 0;
        boolean z4 = false;
        while (i4 <= length) {
            boolean z5 = Intrinsics.compare((int) str.charAt(!z4 ? i4 : length), 32) <= 0;
            if (z4) {
                if (!z5) {
                    break;
                }
                length--;
            } else if (z5) {
                i4++;
            } else {
                z4 = true;
            }
        }
        return str.subSequence(i4, length + 1).toString();
    }

    public static void d(@NotNull XmlPullParser parser) {
        Intrinsics.checkNotNullParameter(parser, "parser");
        if (parser.getEventType() != 2) {
            throw new IllegalStateException("Check failed.");
        }
        int i4 = 1;
        while (i4 != 0) {
            int next = parser.next();
            if (next == 2) {
                i4++;
            } else if (next == 3) {
                i4--;
            }
        }
    }
}
