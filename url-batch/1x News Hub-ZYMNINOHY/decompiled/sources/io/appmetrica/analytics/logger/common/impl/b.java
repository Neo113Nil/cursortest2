package io.appmetrica.analytics.logger.common.impl;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final e f8794a;

    public b() {
        this(new e());
    }

    public final ArrayList a(String str) {
        String[] split = str.split("\\n");
        ArrayList arrayList = new ArrayList();
        for (String str2 : split) {
            int i3 = 0;
            while (str2.length() > i3) {
                int length = str2.length();
                int i4 = i3 + 3800;
                int min = Math.min(length, i4);
                if (length > i4) {
                    int a3 = e.a(this.f8794a.f8799a.matcher(str2), i3, min);
                    length = a3 == -1 ? min : a3 + 1;
                }
                arrayList.add(str2.substring(i3, length));
                i3 = length;
            }
        }
        return arrayList;
    }

    public b(e eVar) {
        this.f8794a = eVar;
    }
}
