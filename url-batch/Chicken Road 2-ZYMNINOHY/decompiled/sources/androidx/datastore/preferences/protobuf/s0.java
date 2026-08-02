package androidx.datastore.preferences.protobuf;

import java.io.Serializable;

/* loaded from: classes.dex */
public enum s0 {
    INT(0),
    LONG(0L),
    FLOAT(Float.valueOf(0.0f)),
    DOUBLE(Double.valueOf(0.0d)),
    BOOLEAN(Boolean.FALSE),
    STRING(""),
    BYTE_STRING(C0174g.f4635c),
    ENUM(null),
    MESSAGE(null);


    /* renamed from: a, reason: collision with root package name */
    public final Object f4707a;

    s0(Serializable serializable) {
        this.f4707a = serializable;
    }
}
