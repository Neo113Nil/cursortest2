package okhttp3.internal.http2;

import java.io.IOException;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes9.dex */
public final /* synthetic */ class Http2Connection$$ExternalSyntheticLambda5 implements Function0 {
    public final /* synthetic */ int $r8$classId = 0;
    public final /* synthetic */ Http2Connection f$0;
    public final /* synthetic */ int f$1;
    public final /* synthetic */ List f$2;

    public /* synthetic */ Http2Connection$$ExternalSyntheticLambda5(Http2Connection http2Connection, int i, List list) {
        this.f$0 = http2Connection;
        this.f$1 = i;
        this.f$2 = list;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$r8$classId) {
            case 0:
                Http2Connection http2Connection = this.f$0;
                int i = this.f$1;
                http2Connection.pushObserver.getClass();
                try {
                    http2Connection.writer.rstStream(i, ErrorCode.CANCEL);
                    synchronized (http2Connection) {
                        http2Connection.currentPushRequests.remove(Integer.valueOf(i));
                    }
                } catch (IOException unused) {
                }
                return Unit.INSTANCE;
            default:
                Http2Connection http2Connection2 = this.f$0;
                int i2 = this.f$1;
                http2Connection2.pushObserver.getClass();
                try {
                    http2Connection2.writer.rstStream(i2, ErrorCode.CANCEL);
                    synchronized (http2Connection2) {
                        http2Connection2.currentPushRequests.remove(Integer.valueOf(i2));
                    }
                } catch (IOException unused2) {
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ Http2Connection$$ExternalSyntheticLambda5(Http2Connection http2Connection, int i, List list, boolean z) {
        this.f$0 = http2Connection;
        this.f$1 = i;
        this.f$2 = list;
    }
}
