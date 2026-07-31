package io.appmetrica.analytics.logger.common.impl;

import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final e f40492a;

    public b() {
        this(new e());
    }

    public final ArrayList a(String str) {
        String[] split = str.split("\\n");
        ArrayList arrayList = new ArrayList();
        for (String str2 : split) {
            int i4 = 0;
            while (str2.length() > i4) {
                int length = str2.length();
                int i5 = i4 + 3800;
                int min = Math.min(length, i5);
                if (length > i5) {
                    int a4 = e.a(this.f40492a.f40497a.matcher(str2), i4, min);
                    length = a4 == -1 ? min : a4 + 1;
                }
                arrayList.add(str2.substring(i4, length));
                i4 = length;
            }
        }
        return arrayList;
    }

    public b(e eVar) {
        this.f40492a = eVar;
    }
}
