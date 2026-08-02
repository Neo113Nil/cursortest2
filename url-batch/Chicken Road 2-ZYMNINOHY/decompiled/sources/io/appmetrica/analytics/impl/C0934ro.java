package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import java.util.LinkedList;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.ro, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0934ro implements InterfaceC0960so {
    @Override // io.appmetrica.analytics.impl.InterfaceC0960so
    public final C0909qo a(List<C0909qo> list) {
        LinkedList linkedList = new LinkedList();
        boolean z = true;
        for (C0909qo c0909qo : list) {
            if (!c0909qo.f12630a) {
                linkedList.add(c0909qo.f12631b);
                z = false;
            }
        }
        return z ? new C0909qo(this, true, "") : new C0909qo(this, false, TextUtils.join(", ", linkedList));
    }
}
