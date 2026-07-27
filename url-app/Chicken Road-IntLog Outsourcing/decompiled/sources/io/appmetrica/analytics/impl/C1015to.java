package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import java.util.LinkedList;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.to, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1015to implements InterfaceC1041uo {
    @Override // io.appmetrica.analytics.impl.InterfaceC1041uo
    public final C0989so a(List<C0989so> list) {
        LinkedList linkedList = new LinkedList();
        boolean z = true;
        for (C0989so c0989so : list) {
            if (!c0989so.f9268a) {
                linkedList.add(c0989so.f9269b);
                z = false;
            }
        }
        return z ? new C0989so(this, true, "") : new C0989so(this, false, TextUtils.join(", ", linkedList));
    }
}
