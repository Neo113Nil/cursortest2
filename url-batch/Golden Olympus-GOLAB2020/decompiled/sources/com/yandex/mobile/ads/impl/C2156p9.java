package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.wx;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.p9, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2156p9 {
    @NotNull
    public static List a(@NotNull wx.g adapter) {
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        List createListBuilder = CollectionsKt.createListBuilder();
        createListBuilder.add(wx.d.f34228a);
        createListBuilder.add(new wx.e("Info"));
        if (adapter.i() == hw.f26960c && adapter.a() != null) {
            String g4 = adapter.g();
            createListBuilder.add(new wx.f((g4 == null || StringsKt.z(g4)) ? "ID" : adapter.g(), adapter.a()));
        }
        createListBuilder.add(new wx.f("Type", adapter.i().a()));
        List<ex> h4 = adapter.h();
        if (h4 != null) {
            for (ex exVar : h4) {
                createListBuilder.add(new wx.f(exVar.a(), exVar.b()));
            }
        }
        List<zx> b4 = adapter.b();
        if (b4 != null && !b4.isEmpty()) {
            createListBuilder.add(wx.d.f34228a);
            createListBuilder.add(new wx.e("CPM floors"));
            String g5 = adapter.g();
            String str = (g5 == null || StringsKt.z(g5)) ? "" : adapter.g() + ": ";
            for (zx zxVar : adapter.b()) {
                createListBuilder.add(new wx.f(str + zxVar.b(), "cpm: " + zxVar.a()));
            }
        }
        return CollectionsKt.build(createListBuilder);
    }
}
