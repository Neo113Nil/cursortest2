package io.appmetrica.analytics.idsync.impl;

import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;
import io.appmetrica.analytics.idsync.internal.model.IdSyncConfig;
import io.appmetrica.analytics.idsync.internal.model.RequestConfig;
import java.util.Iterator;
import java.util.List;

/* renamed from: io.appmetrica.analytics.idsync.impl.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0468f extends SafeRunnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h f9913a;

    public C0468f(h hVar) {
        this.f9913a = hVar;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        IdSyncConfig idSyncConfig;
        if (this.f9913a.f9920f && (idSyncConfig = this.f9913a.f9919e) != null) {
            this.f9913a.getClass();
            if (h.a(idSyncConfig)) {
                List<RequestConfig> requests = idSyncConfig.getRequests();
                h hVar = this.f9913a;
                Iterator<T> it = requests.iterator();
                while (it.hasNext()) {
                    hVar.f9918d.a((RequestConfig) it.next());
                }
                h hVar2 = this.f9913a;
                IHandlerExecutor iHandlerExecutor = hVar2.f9917c;
                C0468f c0468f = hVar2.f9921g;
                if (c0468f != null) {
                    iHandlerExecutor.executeDelayed(c0468f, hVar2.f9916b);
                } else {
                    kotlin.jvm.internal.i.i("syncRunnable");
                    throw null;
                }
            }
        }
    }
}
