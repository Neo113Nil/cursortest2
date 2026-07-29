package com.tapjoy.internal;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/* loaded from: classes2.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    private static final ThreadLocal f8523a = new ThreadLocal() { // from class: com.tapjoy.internal.w.1
        @Override // java.lang.ThreadLocal
        protected final /* synthetic */ Object initialValue() {
            return new SimpleDateFormat("yyyy-MM-dd HH:mm:ssZ");
        }
    };

    /* renamed from: b, reason: collision with root package name */
    private static final ThreadLocal f8524b = new ThreadLocal() { // from class: com.tapjoy.internal.w.2
        @Override // java.lang.ThreadLocal
        protected final /* synthetic */ Object initialValue() {
            return new SimpleDateFormat("yyyy-MM-dd HH.mm.ss");
        }
    };

    public static String a(Date date) {
        return ((DateFormat) f8523a.get()).format(date);
    }
}
