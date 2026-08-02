package okhttp3.internal.http2;

import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.ShaderBrush;
import java.io.IOException;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final /* synthetic */ class Http2Connection$$ExternalSyntheticLambda0 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ long f$1;

    public /* synthetic */ Http2Connection$$ExternalSyntheticLambda0(Object obj, long j, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = j;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        boolean z;
        switch (this.$r8$classId) {
            case 0:
                Http2Connection http2Connection = (Http2Connection) this.f$0;
                long j = this.f$1;
                synchronized (http2Connection) {
                    long j2 = http2Connection.intervalPongsReceived;
                    long j3 = http2Connection.intervalPingsSent;
                    if (j2 < j3) {
                        z = true;
                    } else {
                        http2Connection.intervalPingsSent = j3 + 1;
                        z = false;
                    }
                }
                if (z) {
                    ErrorCode errorCode = ErrorCode.PROTOCOL_ERROR;
                    http2Connection.close$okhttp(errorCode, errorCode, null);
                    j = -1;
                } else {
                    try {
                        http2Connection.writer.ping(1, 0, false);
                    } catch (IOException e) {
                        ErrorCode errorCode2 = ErrorCode.PROTOCOL_ERROR;
                        http2Connection.close$okhttp(errorCode2, errorCode2, e);
                    }
                }
                return Long.valueOf(j);
            default:
                return ((ShaderBrush) ((Brush) this.f$0)).mo671createShaderuvyYCjk(this.f$1);
        }
    }
}
