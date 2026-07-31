package androidx.datastore.preferences.protobuf;

import java.io.Serializable;

/* loaded from: classes.dex */
public enum t0 {
    INT(0),
    LONG(0L),
    FLOAT(Float.valueOf(0.0f)),
    DOUBLE(Double.valueOf(0.0d)),
    BOOLEAN(Boolean.FALSE),
    STRING(""),
    BYTE_STRING(C0095g.f1525g),
    ENUM(null),
    MESSAGE(null);


    /* renamed from: e, reason: collision with root package name */
    public final Object f1599e;

    t0(Serializable serializable) {
        this.f1599e = serializable;
    }
}
