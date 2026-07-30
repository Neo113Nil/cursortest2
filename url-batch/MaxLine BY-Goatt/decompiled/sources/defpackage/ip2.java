package defpackage;

import com.facebook.appevents.internal.ViewHierarchyConstants;
import java.io.IOException;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class ip2 extends IOException {
    public final int m;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ip2(int i) {
        super("stream was reset: ".concat(r0));
        String str;
        if (i == 0) {
            throw null;
        }
        switch (i) {
            case 1:
                str = "NO_ERROR";
                break;
            case 2:
                str = "PROTOCOL_ERROR";
                break;
            case 3:
                str = "INTERNAL_ERROR";
                break;
            case 4:
                str = "FLOW_CONTROL_ERROR";
                break;
            case 5:
                str = "SETTINGS_TIMEOUT";
                break;
            case 6:
                str = "STREAM_CLOSED";
                break;
            case l42.DOUBLE_FIELD_NUMBER /* 7 */:
                str = "FRAME_SIZE_ERROR";
                break;
            case 8:
                str = "REFUSED_STREAM";
                break;
            case 9:
                str = "CANCEL";
                break;
            case 10:
                str = "COMPRESSION_ERROR";
                break;
            case 11:
                str = "CONNECT_ERROR";
                break;
            case ViewHierarchyConstants.PICKER_BITMASK /* 12 */:
                str = "ENHANCE_YOUR_CALM";
                break;
            case ViewHierarchyConstants.SWITCH_BITMASK /* 13 */:
                str = "INADEQUATE_SECURITY";
                break;
            case ViewHierarchyConstants.RADIO_GROUP_BITMASK /* 14 */:
                str = "HTTP_1_1_REQUIRED";
                break;
            default:
                str = "null";
                break;
        }
        this.m = i;
    }
}
