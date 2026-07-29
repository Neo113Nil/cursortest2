package com.cmplay.base.util;

import java.text.SimpleDateFormat;

/* compiled from: DateUtil.java */
/* loaded from: classes.dex */
public class l {

    /* renamed from: a, reason: collision with root package name */
    public static SimpleDateFormat f4031a;

    /* renamed from: b, reason: collision with root package name */
    public static SimpleDateFormat f4032b;

    /* renamed from: c, reason: collision with root package name */
    public static SimpleDateFormat f4033c;

    /* renamed from: d, reason: collision with root package name */
    private static SimpleDateFormat f4034d;
    private static SimpleDateFormat e;

    public static synchronized String a(long j, String str) {
        String format;
        synchronized (l.class) {
            if (f4033c == null) {
                f4033c = new SimpleDateFormat(str);
            }
            format = f4033c.format(Long.valueOf(j));
        }
        return format;
    }
}
