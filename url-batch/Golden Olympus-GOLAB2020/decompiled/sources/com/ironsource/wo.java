package com.ironsource;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public final class wo {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C1454e2 f20243a;

    public wo(@NotNull C1454e2 eventsWrapper) {
        Intrinsics.checkNotNullParameter(eventsWrapper, "eventsWrapper");
        this.f20243a = eventsWrapper;
    }

    public final void a() {
        this.f20243a.a(EnumC1433b2.OPERATIONAL_LOAD_AD, new HashMap());
    }

    public final void b() {
        this.f20243a.a(EnumC1433b2.PAUSE_AD, null);
    }

    public final void c() {
        this.f20243a.a(EnumC1433b2.RESUME_AD, null);
    }

    public final void a(long j4) {
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.EVENTS_DURATION, Long.valueOf(j4));
        this.f20243a.a(EnumC1433b2.OPERATIONAL_LOAD_SUCCESS, hashMap);
    }

    public final void a(long j4, int i4, @NotNull String reason) {
        Intrinsics.checkNotNullParameter(reason, "reason");
        HashMap hashMap = new HashMap();
        hashMap.put("errorCode", Integer.valueOf(i4));
        hashMap.put("reason", reason);
        hashMap.put(IronSourceConstants.EVENTS_DURATION, Long.valueOf(j4));
        this.f20243a.a(EnumC1433b2.OPERATIONAL_LOAD_FAILED, hashMap);
    }
}
