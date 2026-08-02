package okhttp3.internal.ws;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import okhttp3.internal.connection.RealCall;

/* loaded from: classes9.dex */
public final /* synthetic */ class RealWebSocket$$ExternalSyntheticLambda3 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ RealWebSocket f$0;

    public /* synthetic */ RealWebSocket$$ExternalSyntheticLambda3(RealWebSocket realWebSocket, int i) {
        this.$r8$classId = i;
        this.f$0 = realWebSocket;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$r8$classId;
        RealWebSocket realWebSocket = this.f$0;
        switch (i) {
            case 0:
                RealCall realCall = realWebSocket.call;
                realCall.getClass();
                realCall.cancel();
                break;
            default:
                RealCall realCall2 = realWebSocket.call;
                realCall2.getClass();
                realCall2.cancel();
                break;
        }
        return Unit.INSTANCE;
    }
}
