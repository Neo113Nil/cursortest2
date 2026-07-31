package H2;

import f.AbstractC0382a;
import h1.C0438i;
import java.io.IOException;

/* loaded from: classes.dex */
public final class D extends IOException {

    /* renamed from: d, reason: collision with root package name */
    public final int f1927d;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public D(int i3) {
        super("stream was reset: ".concat(r0));
        String str;
        AbstractC0080b.s("errorCode", i3);
        switch (i3) {
            case 1:
                str = "NO_ERROR";
                break;
            case C0438i.FLOAT_FIELD_NUMBER /* 2 */:
                str = "PROTOCOL_ERROR";
                break;
            case C0438i.INTEGER_FIELD_NUMBER /* 3 */:
                str = "INTERNAL_ERROR";
                break;
            case C0438i.LONG_FIELD_NUMBER /* 4 */:
                str = "FLOW_CONTROL_ERROR";
                break;
            case 5:
                str = "SETTINGS_TIMEOUT";
                break;
            case 6:
                str = "STREAM_CLOSED";
                break;
            case C0438i.DOUBLE_FIELD_NUMBER /* 7 */:
                str = "FRAME_SIZE_ERROR";
                break;
            case 8:
                str = "REFUSED_STREAM";
                break;
            case AbstractC0382a.f4777a /* 9 */:
                str = "CANCEL";
                break;
            case AbstractC0382a.f4779c /* 10 */:
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
        this.f1927d = i3;
    }
}
