package io.appmetrica.analytics.impl;

import java.util.Comparator;

/* renamed from: io.appmetrica.analytics.impl.kd, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0620kd implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        String str = ((C0569id) obj).f7563a;
        String str2 = ((C0569id) obj2).f7563a;
        if (str == str2) {
            return 0;
        }
        if (str == null) {
            return -1;
        }
        if (str2 == null) {
            return 1;
        }
        return str.compareTo(str2);
    }
}
