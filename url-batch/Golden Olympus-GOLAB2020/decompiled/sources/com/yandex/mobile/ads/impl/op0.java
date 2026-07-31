package com.yandex.mobile.ads.impl;

import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class op0 {
    @NotNull
    public static final String a(long j4) {
        return j4 < 0 ? "invalid" : j4 < 1000 ? "<1" : (1000 > j4 || j4 >= 2001) ? (2001 > j4 || j4 >= 3001) ? (3001 > j4 || j4 >= 5001) ? (5001 > j4 || j4 >= 10001) ? (10001 > j4 || j4 >= 15001) ? (15001 > j4 || j4 >= 20001) ? (20001 > j4 || j4 >= 30001) ? (30001 > j4 || j4 >= 60001) ? (60001 > j4 || j4 >= 300001) ? (300001 > j4 || j4 >= 1800001) ? (1800001 > j4 || j4 >= 7200001) ? ">7200" : "1800-7200" : "300-1800" : "60-300" : "30-60" : "20-30" : "15-20" : "10-15" : "5-10" : "3-5" : "2-3" : "1-2";
    }
}
