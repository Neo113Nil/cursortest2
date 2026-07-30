package com.my.lib;

/* loaded from: classes4.dex */
public final class B {
    public static void a(String msg) {
        kotlin.jvm.internal.s.checkNotNullParameter("MY", "tag");
        kotlin.jvm.internal.s.checkNotNullParameter(msg, "msg");
    }

    public static void a(String msg, Exception e8, int i8) {
        if ((i8 & 2) != 0) {
            msg = "";
        }
        kotlin.jvm.internal.s.checkNotNullParameter("MY", "tag");
        kotlin.jvm.internal.s.checkNotNullParameter(msg, "msg");
        kotlin.jvm.internal.s.checkNotNullParameter(e8, "e");
    }
}
