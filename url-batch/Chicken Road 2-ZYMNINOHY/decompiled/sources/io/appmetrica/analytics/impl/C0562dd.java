package io.appmetrica.analytics.impl;

import java.util.Comparator;

/* renamed from: io.appmetrica.analytics.impl.dd, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0562dd implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        String str = ((C0510bd) obj).f11534a;
        String str2 = ((C0510bd) obj2).f11534a;
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
