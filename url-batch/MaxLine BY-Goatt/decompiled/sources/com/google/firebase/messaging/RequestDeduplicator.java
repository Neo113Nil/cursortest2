package com.google.firebase.messaging;

import android.util.Log;
import defpackage.hi;
import defpackage.jt2;
import defpackage.p30;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
class RequestDeduplicator {
    private final Executor executor;
    private final Map<String, jt2> getTokenRequests = new hi(0);

    /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
    public interface GetTokenRequest {
        jt2 start();
    }

    public RequestDeduplicator(Executor executor) {
        this.executor = executor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ jt2 lambda$getOrStartGetTokenRequest$0(String str, jt2 jt2Var) {
        synchronized (this) {
            this.getTokenRequests.remove(str);
        }
        return jt2Var;
    }

    public synchronized jt2 getOrStartGetTokenRequest(final String str, GetTokenRequest getTokenRequest) {
        jt2 jt2Var = this.getTokenRequests.get(str);
        if (jt2Var != null) {
            if (Log.isLoggable(Constants.TAG, 3)) {
                Log.d(Constants.TAG, "Joining ongoing request for: " + str);
            }
            return jt2Var;
        }
        if (Log.isLoggable(Constants.TAG, 3)) {
            Log.d(Constants.TAG, "Making new request for: " + str);
        }
        jt2 g = getTokenRequest.start().g(this.executor, new p30() { // from class: com.google.firebase.messaging.h
            @Override // defpackage.p30
            public final Object g(jt2 jt2Var2) {
                jt2 lambda$getOrStartGetTokenRequest$0;
                lambda$getOrStartGetTokenRequest$0 = RequestDeduplicator.this.lambda$getOrStartGetTokenRequest$0(str, jt2Var2);
                return lambda$getOrStartGetTokenRequest$0;
            }
        });
        this.getTokenRequests.put(str, g);
        return g;
    }
}
