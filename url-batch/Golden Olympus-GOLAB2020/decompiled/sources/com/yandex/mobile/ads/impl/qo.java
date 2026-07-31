package com.yandex.mobile.ads.impl;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class qo {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C2105n4 f30857a = new C2105n4();

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final qg1 f30858b = new qg1();

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final EnumC2082m4 f30859c = EnumC2082m4.f28844A;

    @Nullable
    public final Long a() {
        Object obj;
        Iterator<T> it = this.f30857a.b().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((C2058l4) obj).a() == this.f30859c) {
                break;
            }
        }
        C2058l4 c2058l4 = (C2058l4) obj;
        if (c2058l4 == null) {
            return null;
        }
        Object obj2 = c2058l4.b().get(IronSourceConstants.EVENTS_DURATION);
        if (obj2 instanceof Long) {
            return (Long) obj2;
        }
        return null;
    }

    public final void b() {
        this.f30857a.a();
        C2105n4 c2105n4 = this.f30857a;
        EnumC2082m4 enumC2082m4 = this.f30859c;
        C2001ij.a(c2105n4, enumC2082m4, "adLoadingPhaseType", enumC2082m4, null);
    }

    public final void c() {
        C2105n4 c2105n4 = this.f30857a;
        EnumC2082m4 adLoadingPhaseType = this.f30859c;
        qg1 parametersProvider = this.f30858b;
        c2105n4.getClass();
        Intrinsics.checkNotNullParameter(adLoadingPhaseType, "adLoadingPhaseType");
        Intrinsics.checkNotNullParameter(parametersProvider, "parametersProvider");
        c2105n4.a(adLoadingPhaseType, parametersProvider, null);
    }
}
