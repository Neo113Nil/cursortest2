package com.ironsource.b.b;

import com.ironsource.b.d.c;

/* compiled from: EventsFormatterFactory.java */
/* loaded from: classes2.dex */
class c {
    static a a(String str, int i) {
        if ("ironbeast".equals(str)) {
            return new e(i);
        }
        if ("outcome".equals(str)) {
            return new f(i);
        }
        if (i == 2) {
            return new e(i);
        }
        if (i == 3) {
            return new f(i);
        }
        com.ironsource.b.d.d.c().a(c.a.NATIVE, "EventsFormatterFactory failed to instantiate a formatter (type: " + str + ", adUnit: " + i + ")", 2);
        return null;
    }
}
