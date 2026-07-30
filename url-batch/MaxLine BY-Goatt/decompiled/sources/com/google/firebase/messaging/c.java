package com.google.firebase.messaging;

import android.content.Intent;
import com.google.firebase.messaging.WithinAppServiceConnection;
import defpackage.ev1;
import defpackage.jt2;
import defpackage.p30;
import defpackage.uu1;
import java.util.concurrent.ScheduledFuture;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final /* synthetic */ class c implements ev1, p30, uu1 {
    public final /* synthetic */ int m;
    public final /* synthetic */ Object n;

    public /* synthetic */ c(int i, Object obj) {
        this.m = i;
        this.n = obj;
    }

    @Override // defpackage.p30
    public Object g(jt2 jt2Var) {
        String lambda$extractResponseWhenComplete$0;
        lambda$extractResponseWhenComplete$0 = ((GmsRpc) this.n).lambda$extractResponseWhenComplete$0(jt2Var);
        return lambda$extractResponseWhenComplete$0;
    }

    @Override // defpackage.uu1
    public void onComplete(jt2 jt2Var) {
        int i = this.m;
        Object obj = this.n;
        switch (i) {
            case 2:
                WakeLockHolder.completeWakefulIntent((Intent) obj);
                break;
            case 3:
                ((WithinAppServiceConnection.BindRequest) obj).finish();
                break;
            default:
                ((ScheduledFuture) obj).cancel(false);
                break;
        }
    }

    @Override // defpackage.ev1
    public void onSuccess(Object obj) {
        ((FirebaseMessaging) this.n).lambda$new$3((TopicsSubscriber) obj);
    }
}
