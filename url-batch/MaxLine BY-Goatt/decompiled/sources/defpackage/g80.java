package defpackage;

import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentFactory;
import com.google.firebase.components.Qualified;
import com.google.firebase.heartbeatinfo.DefaultHeartBeatController;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.FirebaseMessagingRegistrar;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final /* synthetic */ class g80 implements ComponentFactory {
    public final /* synthetic */ int a;
    public final /* synthetic */ Qualified b;

    public /* synthetic */ g80(Qualified qualified, int i) {
        this.a = i;
        this.b = qualified;
    }

    @Override // com.google.firebase.components.ComponentFactory
    public final Object create(ComponentContainer componentContainer) {
        DefaultHeartBeatController lambda$component$3;
        FirebaseMessaging lambda$getComponents$0;
        int i = this.a;
        Qualified qualified = this.b;
        switch (i) {
            case 0:
                lambda$component$3 = DefaultHeartBeatController.lambda$component$3(qualified, componentContainer);
                return lambda$component$3;
            default:
                lambda$getComponents$0 = FirebaseMessagingRegistrar.lambda$getComponents$0(qualified, componentContainer);
                return lambda$getComponents$0;
        }
    }
}
