package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import java.util.LinkedList;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.to, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0864to implements InterfaceC0890uo {
    @Override // io.appmetrica.analytics.impl.InterfaceC0890uo
    public final C0838so a(List<C0838so> list) {
        LinkedList linkedList = new LinkedList();
        boolean z = true;
        for (C0838so c0838so : list) {
            if (!c0838so.f8327a) {
                linkedList.add(c0838so.f8328b);
                z = false;
            }
        }
        return z ? new C0838so(this, true, "") : new C0838so(this, false, TextUtils.join(", ", linkedList));
    }
}
