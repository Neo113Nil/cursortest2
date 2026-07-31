package com.startapp.sdk.internal;

import android.content.Context;
import android.util.Pair;
import com.startapp.sdk.jobs.SchedulerService;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public final class h4 implements c7 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f258a;

    public h4(Context context) {
        this.f258a = context;
    }

    @Override // com.startapp.sdk.internal.c7
    public final Object call() {
        Context context = this.f258a;
        Pair pair = new Pair(new ia(context, SchedulerService.class), new hh(context));
        return new ha((gf) pair.first, (gf) pair.second);
    }
}
