package androidx.datastore.preferences.protobuf;

import java.io.Serializable;

/* loaded from: classes.dex */
public enum r0 {
    INT(0),
    LONG(0L),
    FLOAT(Float.valueOf(0.0f)),
    DOUBLE(Double.valueOf(0.0d)),
    BOOLEAN(Boolean.FALSE),
    STRING(""),
    BYTE_STRING(C0191g.f3498i),
    ENUM(null),
    MESSAGE(null);


    /* renamed from: d, reason: collision with root package name */
    public final Object f3566d;

    r0(Serializable serializable) {
        this.f3566d = serializable;
    }
}
