package com.yandex.mobile.ads.impl;

import android.util.Pair;
import java.util.Map;

/* loaded from: classes3.dex */
public final class wj2 {
    /* JADX WARN: Can't wrap try/catch for region: R(10:5|(2:6|7)|(7:9|10|11|12|(1:14)|16|17)|20|10|11|12|(0)|16|17) */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002d A[Catch: NumberFormatException -> 0x0031, TRY_LEAVE, TryCatch #0 {NumberFormatException -> 0x0031, blocks: (B:12:0x0025, B:14:0x002d), top: B:11:0x0025 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Pair<Long, Long> a(v30 v30Var) {
        long j4;
        String str;
        String str2;
        Map<String, String> queryKeyStatus = v30Var.queryKeyStatus();
        if (queryKeyStatus == null) {
            return null;
        }
        long j5 = -9223372036854775807L;
        try {
            str2 = queryKeyStatus.get("LicenseDurationRemaining");
        } catch (NumberFormatException unused) {
        }
        if (str2 != null) {
            j4 = Long.parseLong(str2);
            Long valueOf = Long.valueOf(j4);
            str = queryKeyStatus.get("PlaybackDurationRemaining");
            if (str != null) {
                j5 = Long.parseLong(str);
            }
            return new Pair<>(valueOf, Long.valueOf(j5));
        }
        j4 = -9223372036854775807L;
        Long valueOf2 = Long.valueOf(j4);
        str = queryKeyStatus.get("PlaybackDurationRemaining");
        if (str != null) {
        }
        return new Pair<>(valueOf2, Long.valueOf(j5));
    }
}
