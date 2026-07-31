package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
final class u6 {

    /* renamed from: a, reason: collision with root package name */
    long f12649a;

    /* renamed from: b, reason: collision with root package name */
    final String f12650b;

    /* renamed from: c, reason: collision with root package name */
    final String f12651c;

    /* renamed from: d, reason: collision with root package name */
    final long f12652d;

    /* renamed from: e, reason: collision with root package name */
    final long f12653e;

    /* renamed from: f, reason: collision with root package name */
    final long f12654f;

    /* renamed from: g, reason: collision with root package name */
    final long f12655g;

    /* renamed from: h, reason: collision with root package name */
    final List<s5> f12656h;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    u6(String str, j5 j5Var) {
        this(str, r2, r3, r5, r7, r9, r0);
        String str2 = j5Var.f6971b;
        long j7 = j5Var.f6972c;
        long j8 = j5Var.f6973d;
        long j9 = j5Var.f6974e;
        long j10 = j5Var.f6975f;
        List list = j5Var.f6977h;
        if (list == null) {
            Map<String, String> map = j5Var.f6976g;
            list = new ArrayList(map.size());
            for (Map.Entry<String, String> entry : map.entrySet()) {
                list.add(new s5(entry.getKey(), entry.getValue()));
            }
        }
    }

    private u6(String str, String str2, long j7, long j8, long j9, long j10, List<s5> list) {
        this.f12650b = str;
        this.f12651c = true == "".equals(str2) ? null : str2;
        this.f12652d = j7;
        this.f12653e = j8;
        this.f12654f = j9;
        this.f12655g = j10;
        this.f12656h = list;
    }

    static u6 a(v6 v6Var) {
        if (x6.e(v6Var) != 538247942) {
            throw new IOException();
        }
        String h7 = x6.h(v6Var);
        String h8 = x6.h(v6Var);
        long f7 = x6.f(v6Var);
        long f8 = x6.f(v6Var);
        long f9 = x6.f(v6Var);
        long f10 = x6.f(v6Var);
        int e7 = x6.e(v6Var);
        if (e7 < 0) {
            StringBuilder sb = new StringBuilder(31);
            sb.append("readHeaderList size=");
            sb.append(e7);
            throw new IOException(sb.toString());
        }
        List emptyList = e7 == 0 ? Collections.emptyList() : new ArrayList();
        for (int i7 = 0; i7 < e7; i7++) {
            emptyList.add(new s5(x6.h(v6Var).intern(), x6.h(v6Var).intern()));
        }
        return new u6(h7, h8, f7, f8, f9, f10, emptyList);
    }
}
