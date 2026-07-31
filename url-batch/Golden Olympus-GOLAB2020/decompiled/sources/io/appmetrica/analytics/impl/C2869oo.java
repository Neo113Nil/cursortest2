package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import java.util.LinkedList;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.oo, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2869oo implements InterfaceC2895po {
    @Override // io.appmetrica.analytics.impl.InterfaceC2895po
    public final C2843no a(List<C2843no> list) {
        LinkedList linkedList = new LinkedList();
        boolean z4 = true;
        for (C2843no c2843no : list) {
            if (!c2843no.f39527a) {
                linkedList.add(c2843no.f39528b);
                z4 = false;
            }
        }
        return z4 ? new C2843no(this, true, "") : new C2843no(this, false, TextUtils.join(", ", linkedList));
    }
}
