package defpackage;

import com.google.firebase.heartbeatinfo.DefaultHeartBeatController;
import java.util.concurrent.Callable;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final /* synthetic */ class f80 implements Callable {
    public final /* synthetic */ int m;
    public final /* synthetic */ DefaultHeartBeatController n;

    public /* synthetic */ f80(DefaultHeartBeatController defaultHeartBeatController, int i) {
        this.m = i;
        this.n = defaultHeartBeatController;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        String lambda$getHeartBeatsHeader$1;
        Void lambda$registerHeartBeat$0;
        int i = this.m;
        DefaultHeartBeatController defaultHeartBeatController = this.n;
        switch (i) {
            case 0:
                lambda$getHeartBeatsHeader$1 = defaultHeartBeatController.lambda$getHeartBeatsHeader$1();
                return lambda$getHeartBeatsHeader$1;
            default:
                lambda$registerHeartBeat$0 = defaultHeartBeatController.lambda$registerHeartBeat$0();
                return lambda$registerHeartBeat$0;
        }
    }
}
