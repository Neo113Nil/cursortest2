package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jms {
    public static final jms a;
    public static final jms b;
    public static final jms c;
    public static final jms d;
    public static final jms e;
    public static final jms f;
    public static final jms g;
    public static final jms h;
    public static final jms i;
    private static final /* synthetic */ jms[] j;

    static {
        jms jmsVar = new jms("INT", 0);
        a = jmsVar;
        jms jmsVar2 = new jms("LONG", 1);
        b = jmsVar2;
        jms jmsVar3 = new jms("FLOAT", 2);
        c = jmsVar3;
        jms jmsVar4 = new jms("DOUBLE", 3);
        d = jmsVar4;
        jms jmsVar5 = new jms("BOOLEAN", 4);
        e = jmsVar5;
        jms jmsVar6 = new jms("STRING", 5);
        f = jmsVar6;
        jjq jjqVar = jjq.d;
        jms jmsVar7 = new jms("BYTE_STRING", 6);
        g = jmsVar7;
        jms jmsVar8 = new jms("ENUM", 7);
        h = jmsVar8;
        jms jmsVar9 = new jms("MESSAGE", 8);
        i = jmsVar9;
        j = new jms[]{jmsVar, jmsVar2, jmsVar3, jmsVar4, jmsVar5, jmsVar6, jmsVar7, jmsVar8, jmsVar9};
    }

    public static jms[] values() {
        return (jms[]) j.clone();
    }
}
