package com.startapp.sdk.jobs;

import com.startapp.sdk.internal.ga;
import com.startapp.sdk.internal.y2;
import java.util.concurrent.ExecutorService;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public final class a extends y2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SchedulerService f533a;

    public a(SchedulerService schedulerService) {
        this.f533a = schedulerService;
    }

    @Override // com.startapp.sdk.internal.y2
    public final void a(ga gaVar) {
        ExecutorService executorService = this.f533a.f532a;
        if (executorService != null) {
            executorService.execute(gaVar);
        }
    }
}
