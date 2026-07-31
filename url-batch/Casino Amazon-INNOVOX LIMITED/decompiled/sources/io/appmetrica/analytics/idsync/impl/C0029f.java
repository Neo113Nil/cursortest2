package io.appmetrica.analytics.idsync.impl;

import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;
import io.appmetrica.analytics.idsync.internal.model.IdSyncConfig;
import io.appmetrica.analytics.idsync.internal.model.RequestConfig;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: io.appmetrica.analytics.idsync.impl.f, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0029f extends SafeRunnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h f732a;

    public C0029f(h hVar) {
        this.f732a = hVar;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        IdSyncConfig idSyncConfig;
        if (this.f732a.f && (idSyncConfig = this.f732a.e) != null) {
            this.f732a.getClass();
            if (h.a(idSyncConfig)) {
                List<RequestConfig> requests = idSyncConfig.getRequests();
                h hVar = this.f732a;
                Iterator<T> it = requests.iterator();
                while (it.hasNext()) {
                    hVar.d.a((RequestConfig) it.next());
                }
                h hVar2 = this.f732a;
                IHandlerExecutor iHandlerExecutor = hVar2.c;
                C0029f c0029f = hVar2.g;
                if (c0029f == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("syncRunnable");
                    c0029f = null;
                }
                iHandlerExecutor.executeDelayed(c0029f, this.f732a.b);
            }
        }
    }
}
