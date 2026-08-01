package com.google.android.gms.internal.measurement;

import java.util.Comparator;
import java.util.Map;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class t implements Comparator {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f2804d;

    public /* synthetic */ t(int i3) {
        this.f2804d = i3;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f2804d) {
            case 0:
                int a9 = v4.a.a(obj);
                int a10 = v4.a.a(obj2);
                if (a9 != a10) {
                    if (a9 == 0 || a10 == 0) {
                        throw null;
                    }
                    return a9 - a10;
                }
                int b10 = a4.i.b(a9);
                if (b10 == 0) {
                    return ((Boolean) obj).compareTo((Boolean) obj2);
                }
                if (b10 == 1) {
                    return ((String) obj).compareTo((String) obj2);
                }
                if (b10 == 2) {
                    return ((Long) obj).compareTo((Long) obj2);
                }
                if (b10 == 3) {
                    return ((Double) obj).compareTo((Double) obj2);
                }
                throw null;
            default:
                return ((String) ((Map.Entry) obj).getKey()).compareTo((String) ((Map.Entry) obj2).getKey());
        }
    }
}
