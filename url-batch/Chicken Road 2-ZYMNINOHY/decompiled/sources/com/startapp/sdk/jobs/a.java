package com.startapp.sdk.jobs;

import com.startapp.sdk.internal.d3;
import com.startapp.sdk.internal.za;
import java.util.concurrent.ExecutorService;

/* loaded from: classes.dex */
public final class a extends d3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SchedulerService f8057a;

    public a(SchedulerService schedulerService) {
        this.f8057a = schedulerService;
    }

    @Override // com.startapp.sdk.internal.d3
    public final void a(za zaVar) {
        ExecutorService executorService = this.f8057a.f8055a;
        if (executorService != null) {
            executorService.execute(zaVar);
        }
    }
}
