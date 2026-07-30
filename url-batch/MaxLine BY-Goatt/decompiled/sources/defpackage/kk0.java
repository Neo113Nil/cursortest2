package defpackage;

import android.content.Context;
import android.content.Intent;
import com.facebook.internal.LockOnGetVariable;
import com.google.firebase.messaging.FcmBroadcastProcessor;
import java.util.concurrent.Callable;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final /* synthetic */ class kk0 implements Callable {
    public final /* synthetic */ int m;
    public final /* synthetic */ Object n;
    public final /* synthetic */ Object o;

    public /* synthetic */ kk0(int i, Object obj, Object obj2) {
        this.m = i;
        this.n = obj;
        this.o = obj2;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        Integer lambda$startMessagingService$0;
        Void _init_$lambda$0;
        int i = this.m;
        Object obj = this.o;
        Object obj2 = this.n;
        switch (i) {
            case 0:
                lambda$startMessagingService$0 = FcmBroadcastProcessor.lambda$startMessagingService$0((Context) obj2, (Intent) obj);
                return lambda$startMessagingService$0;
            default:
                _init_$lambda$0 = LockOnGetVariable._init_$lambda$0((LockOnGetVariable) obj2, (Callable) obj);
                return _init_$lambda$0;
        }
    }
}
