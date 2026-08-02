package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jyh {
    public Object a;
    public Enum b;
    public Number c;
    public Object d;

    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, jyv] */
    public final jyj a() {
        Object obj = this.a;
        obj.getClass();
        Enum r1 = this.b;
        r1.getClass();
        Number number = this.c;
        number.getClass();
        return new jyj((String) obj, (jyi) r1, ((Long) number).longValue(), this.d);
    }

    public final void b(long j) {
        this.c = Long.valueOf(j);
    }
}
