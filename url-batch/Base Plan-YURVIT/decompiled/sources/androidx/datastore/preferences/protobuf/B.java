package androidx.datastore.preferences.protobuf;

import java.io.Serializable;

/* loaded from: classes.dex */
public enum B {
    VOID(Void.class, null),
    INT(Integer.class, 0),
    LONG(Long.class, 0L),
    FLOAT(Float.class, Float.valueOf(0.0f)),
    DOUBLE(Double.class, Double.valueOf(0.0d)),
    BOOLEAN(Boolean.class, Boolean.FALSE),
    STRING(String.class, ""),
    BYTE_STRING(C0095g.class, C0095g.f1525g),
    ENUM(Integer.class, null),
    MESSAGE(Object.class, null);


    /* renamed from: e, reason: collision with root package name */
    public final Object f1447e;

    B(Class cls, Serializable serializable) {
        this.f1447e = serializable;
    }
}
