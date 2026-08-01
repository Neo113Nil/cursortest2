package com.google.firebase.messaging;

import android.content.Context;
import com.google.android.gms.internal.measurement.se;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final /* synthetic */ class p implements l8.e {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f3162d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ l8.r f3163e;

    public /* synthetic */ p(l8.r rVar, int i3) {
        this.f3162d = i3;
        this.f3163e = rVar;
    }

    @Override // l8.e
    public final Object b(se seVar) {
        FirebaseMessaging lambda$getComponents$0;
        switch (this.f3162d) {
            case 0:
                lambda$getComponents$0 = FirebaseMessagingRegistrar.lambda$getComponents$0(this.f3163e, seVar);
                return lambda$getComponents$0;
            default:
                return new u8.c((Context) seVar.a(Context.class), ((g8.g) seVar.a(g8.g.class)).d(), seVar.e(l8.r.a(u8.d.class)), seVar.f(d9.b.class), (Executor) seVar.d(this.f3163e));
        }
    }
}
