package defpackage;

import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentFactory;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.datatransport.TransportRegistrar;
import com.google.firebase.installations.FirebaseInstallationsApi;
import com.google.firebase.installations.FirebaseInstallationsRegistrar;
import com.google.firebase.platforminfo.DefaultUserAgentPublisher;
import com.google.firebase.platforminfo.UserAgentPublisher;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final /* synthetic */ class g90 implements ComponentFactory {
    public final /* synthetic */ int a;

    public /* synthetic */ g90(int i) {
        this.a = i;
    }

    @Override // com.google.firebase.components.ComponentFactory
    public final Object create(ComponentContainer componentContainer) {
        UserAgentPublisher lambda$component$0;
        ScheduledExecutorService lambda$getComponents$4;
        ScheduledExecutorService lambda$getComponents$5;
        ScheduledExecutorService lambda$getComponents$6;
        Executor lambda$getComponents$7;
        FirebaseInstallationsApi lambda$getComponents$0;
        nz2 lambda$getComponents$02;
        nz2 lambda$getComponents$1;
        nz2 lambda$getComponents$2;
        switch (this.a) {
            case 0:
                lambda$component$0 = DefaultUserAgentPublisher.lambda$component$0(componentContainer);
                return lambda$component$0;
            case 1:
                lambda$getComponents$4 = ExecutorsRegistrar.lambda$getComponents$4(componentContainer);
                return lambda$getComponents$4;
            case 2:
                lambda$getComponents$5 = ExecutorsRegistrar.lambda$getComponents$5(componentContainer);
                return lambda$getComponents$5;
            case 3:
                lambda$getComponents$6 = ExecutorsRegistrar.lambda$getComponents$6(componentContainer);
                return lambda$getComponents$6;
            case 4:
                lambda$getComponents$7 = ExecutorsRegistrar.lambda$getComponents$7(componentContainer);
                return lambda$getComponents$7;
            case 5:
                lambda$getComponents$0 = FirebaseInstallationsRegistrar.lambda$getComponents$0(componentContainer);
                return lambda$getComponents$0;
            case 6:
                lambda$getComponents$02 = TransportRegistrar.lambda$getComponents$0(componentContainer);
                return lambda$getComponents$02;
            case l42.DOUBLE_FIELD_NUMBER /* 7 */:
                lambda$getComponents$1 = TransportRegistrar.lambda$getComponents$1(componentContainer);
                return lambda$getComponents$1;
            default:
                lambda$getComponents$2 = TransportRegistrar.lambda$getComponents$2(componentContainer);
                return lambda$getComponents$2;
        }
    }
}
