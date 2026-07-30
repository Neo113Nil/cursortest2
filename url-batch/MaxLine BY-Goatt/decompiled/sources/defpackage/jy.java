package defpackage;

import android.content.Context;
import com.google.firebase.FirebaseApp;
import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentRuntime;
import com.google.firebase.heartbeatinfo.DefaultHeartBeatController;
import com.google.firebase.heartbeatinfo.HeartBeatInfoStorage;
import com.google.firebase.inject.Provider;
import com.google.firebase.internal.DataCollectionConfigStorage;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final /* synthetic */ class jy implements Provider {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ jy(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // com.google.firebase.inject.Provider
    public final Object get() {
        Object lambda$discoverComponents$0;
        HeartBeatInfoStorage lambda$new$2;
        DataCollectionConfigStorage lambda$new$0;
        int i = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                lambda$discoverComponents$0 = ((ComponentRuntime) obj2).lambda$discoverComponents$0((Component) obj);
                return lambda$discoverComponents$0;
            case 1:
                lambda$new$2 = DefaultHeartBeatController.lambda$new$2((Context) obj2, (String) obj);
                return lambda$new$2;
            default:
                lambda$new$0 = ((FirebaseApp) obj2).lambda$new$0((Context) obj);
                return lambda$new$0;
        }
    }
}
