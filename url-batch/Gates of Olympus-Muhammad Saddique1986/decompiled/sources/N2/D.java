package N2;

import java.io.IOException;
import r.AbstractC0856c;

/* loaded from: classes.dex */
public final class D extends IOException {

    /* renamed from: d, reason: collision with root package name */
    public final int f3579d;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public D(int i3) {
        super("stream was reset: ".concat(r0));
        String str;
        A.k.s("errorCode", i3);
        switch (i3) {
            case 1:
                str = "NO_ERROR";
                break;
            case k1.i.FLOAT_FIELD_NUMBER /* 2 */:
                str = "PROTOCOL_ERROR";
                break;
            case k1.i.INTEGER_FIELD_NUMBER /* 3 */:
                str = "INTERNAL_ERROR";
                break;
            case k1.i.LONG_FIELD_NUMBER /* 4 */:
                str = "FLOW_CONTROL_ERROR";
                break;
            case 5:
                str = "SETTINGS_TIMEOUT";
                break;
            case 6:
                str = "STREAM_CLOSED";
                break;
            case k1.i.DOUBLE_FIELD_NUMBER /* 7 */:
                str = "FRAME_SIZE_ERROR";
                break;
            case k1.i.BYTES_FIELD_NUMBER /* 8 */:
                str = "REFUSED_STREAM";
                break;
            case AbstractC0856c.f8037c /* 9 */:
                str = "CANCEL";
                break;
            case AbstractC0856c.f8039e /* 10 */:
                str = "COMPRESSION_ERROR";
                break;
            case 11:
                str = "CONNECT_ERROR";
                break;
            case 12:
                str = "ENHANCE_YOUR_CALM";
                break;
            case 13:
                str = "INADEQUATE_SECURITY";
                break;
            case 14:
                str = "HTTP_1_1_REQUIRED";
                break;
            default:
                str = "null";
                break;
        }
        this.f3579d = i3;
    }
}
