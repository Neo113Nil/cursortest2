package com.onesignal.debug.internal.crash;

import f3.InterfaceC0368a;
import x5.InterfaceC0732a;

/* loaded from: classes.dex */
public abstract class q {

    public static final class a extends kotlin.jvm.internal.j implements InterfaceC0732a {
        final /* synthetic */ c3.f $platformProvider;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(c3.f fVar) {
            super(0);
            this.$platformProvider = fVar;
        }

        @Override // x5.InterfaceC0732a
        public final Boolean invoke() {
            return Boolean.valueOf(!kotlin.jvm.internal.i.a(this.$platformProvider.getAppState(), "background"));
        }
    }

    public static final InterfaceC0368a createAnrDetector(c3.f platformProvider, c3.c logger, long j4, long j7, long j8) {
        kotlin.jvm.internal.i.e(platformProvider, "platformProvider");
        kotlin.jvm.internal.i.e(logger, "logger");
        return new p(new c3.k(platformProvider, new a6.d(platformProvider), new V5.g(4, platformProvider)), logger, j4, j7, j8, new a(platformProvider), null, 64, null);
    }
}
