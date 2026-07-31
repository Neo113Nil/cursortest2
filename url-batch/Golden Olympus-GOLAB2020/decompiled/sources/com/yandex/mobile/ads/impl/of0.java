package com.yandex.mobile.ads.impl;

import java.net.InetAddress;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class of0 {

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private static final ConcurrentHashMap<String, Boolean> f30017b = new ConcurrentHashMap<>();

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f30018c = 0;

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ConcurrentHashMap<String, Boolean> f30019a = f30017b;

    public final boolean a(int i4, @NotNull String host) {
        Object m243constructorimpl;
        Intrinsics.checkNotNullParameter(host, "host");
        ConcurrentHashMap<String, Boolean> concurrentHashMap = this.f30019a;
        Boolean bool = concurrentHashMap.get(host);
        if (bool == null) {
            l82.f28461a.getClass();
            Intrinsics.checkNotNullParameter(host, "host");
            try {
                Result.Companion companion = Result.Companion;
                m243constructorimpl = Result.m243constructorimpl(Boolean.valueOf(InetAddress.getByName(host).isReachable(i4)));
            } catch (Throwable th) {
                Result.Companion companion2 = Result.Companion;
                m243constructorimpl = Result.m243constructorimpl(ResultKt.createFailure(th));
            }
            if (Result.m244isFailureimpl(m243constructorimpl)) {
                m243constructorimpl = null;
            }
            Boolean bool2 = (Boolean) m243constructorimpl;
            bool = Boolean.valueOf(bool2 != null ? bool2.booleanValue() : false);
            Boolean putIfAbsent = concurrentHashMap.putIfAbsent(host, bool);
            if (putIfAbsent != null) {
                bool = putIfAbsent;
            }
        }
        Intrinsics.checkNotNullExpressionValue(bool, "getOrPut(...)");
        return bool.booleanValue();
    }
}
