package androidx.datastore.preferences.protobuf;

import java.io.Serializable;

/* loaded from: classes.dex */
public enum A {
    VOID(Void.class, null),
    INT(Integer.class, 0),
    LONG(Long.class, 0L),
    FLOAT(Float.class, Float.valueOf(0.0f)),
    DOUBLE(Double.class, Double.valueOf(0.0d)),
    BOOLEAN(Boolean.class, Boolean.FALSE),
    STRING(String.class, ""),
    BYTE_STRING(C0191g.class, C0191g.f3498i),
    ENUM(Integer.class, null),
    MESSAGE(Object.class, null);


    /* renamed from: d, reason: collision with root package name */
    public final Object f3419d;

    A(Class cls, Serializable serializable) {
        this.f3419d = serializable;
    }
}
