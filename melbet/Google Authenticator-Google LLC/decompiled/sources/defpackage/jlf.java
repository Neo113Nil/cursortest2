package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum jlf {
    VOID(Void.class),
    INT(Integer.class),
    LONG(Long.class),
    FLOAT(Float.class),
    DOUBLE(Double.class),
    BOOLEAN(Boolean.class),
    STRING(String.class),
    BYTE_STRING(jjq.class),
    ENUM(Integer.class),
    MESSAGE(Object.class);

    public final Class k;

    static {
        jjq jjqVar = jjq.d;
    }

    jlf(Class cls) {
        this.k = cls;
    }
}
