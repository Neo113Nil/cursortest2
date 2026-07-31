package io.appmetrica.analytics.impl;

import java.util.Collection;
import kotlin.collections.CollectionsKt;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;

/* renamed from: io.appmetrica.analytics.impl.t, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2973t implements InterfaceC3025v {

    /* renamed from: a, reason: collision with root package name */
    public final String f39819a = "yandex";

    @Nullable
    public final String a() {
        try {
            return new JSONArray((Collection) CollectionsKt.plus((Collection) CollectionsKt.listOf(this.f39819a), (Iterable) C3082x4.l().m().f39893d)).toString();
        } catch (Throwable unused) {
            return null;
        }
    }
}
