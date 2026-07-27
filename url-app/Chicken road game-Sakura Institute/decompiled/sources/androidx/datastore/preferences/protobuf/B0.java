package androidx.datastore.preferences.protobuf;

import java.io.Serializable;

/* loaded from: classes.dex */
public enum B0 {
    INT(0),
    LONG(0L),
    FLOAT(Float.valueOf(0.0f)),
    DOUBLE(Double.valueOf(0.0d)),
    BOOLEAN(Boolean.FALSE),
    STRING(""),
    BYTE_STRING(C0442g.f5338i),
    ENUM(null),
    MESSAGE(null);

    B0(Serializable serializable) {
    }
}
