package defpackage;

import com.google.firebase.encoders.proto.ProtoEnum;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public enum cg1 implements ProtoEnum {
    REASON_UNKNOWN(0),
    MESSAGE_TOO_OLD(1),
    CACHE_FULL(2),
    PAYLOAD_TOO_BIG(3),
    MAX_RETRIES_REACHED(4),
    INVALID_PAYLOD(5),
    SERVER_ERROR(6);

    public final int m;

    cg1(int i) {
        this.m = i;
    }

    @Override // com.google.firebase.encoders.proto.ProtoEnum
    public final int getNumber() {
        return this.m;
    }
}
