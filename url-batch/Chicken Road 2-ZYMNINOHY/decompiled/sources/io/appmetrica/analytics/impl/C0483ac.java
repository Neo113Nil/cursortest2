package io.appmetrica.analytics.impl;

import android.content.Context;

/* renamed from: io.appmetrica.analytics.impl.ac, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0483ac implements InterfaceC0630g4 {
    @Override // io.appmetrica.analytics.impl.InterfaceC0630g4
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final C0992u4 a(Context context, C0554d5 c0554d5, P3 p32, C0863p4 c0863p4) {
        C1070x4 c1070x4;
        C1018v4 c1018v4 = new C1018v4(p32.f10790b);
        C1096y4 c1096y4 = new C1096y4();
        synchronized (c0554d5) {
            c1070x4 = (C1070x4) c0554d5.a(c1018v4, c0863p4, c1096y4, c0554d5.f11651b);
        }
        return new C0992u4(context, c1070x4, c0863p4);
    }
}
