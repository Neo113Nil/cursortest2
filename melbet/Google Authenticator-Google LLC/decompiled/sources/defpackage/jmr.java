package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum jmr {
    DOUBLE(jms.d, 1),
    FLOAT(jms.c, 5),
    INT64(jms.b, 0),
    UINT64(jms.b, 0),
    INT32(jms.a, 0),
    FIXED64(jms.b, 1),
    FIXED32(jms.a, 5),
    BOOL(jms.e, 0),
    STRING(jms.f, 2),
    GROUP(jms.i, 3),
    MESSAGE(jms.i, 2),
    BYTES(jms.g, 2),
    UINT32(jms.a, 0),
    ENUM(jms.h, 0),
    SFIXED32(jms.a, 5),
    SFIXED64(jms.b, 1),
    SINT32(jms.a, 0),
    SINT64(jms.b, 0);

    public final jms s;
    public final int t;

    jmr(jms jmsVar, int i) {
        this.s = jmsVar;
        this.t = i;
    }
}
