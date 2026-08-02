package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ebn {
    public static final ebn a;
    public static final ebn b;
    public static final ebn c;
    public static final ebn d;
    public static final ebn e;
    private static final /* synthetic */ ebn[] f;

    static {
        ebn ebnVar = new ebn("INCOGNITO", 0);
        a = ebnVar;
        ebn ebnVar2 = new ebn("CUSTOM", 1);
        b = ebnVar2;
        ebn ebnVar3 = new ebn("SETTINGS", 2);
        c = ebnVar3;
        ebn ebnVar4 = new ebn("PRIVACY_ADVISOR", 3);
        d = ebnVar4;
        ebn ebnVar5 = new ebn("HELP_AND_FEEDBACK", 4);
        e = ebnVar5;
        f = new ebn[]{ebnVar, ebnVar2, ebnVar3, ebnVar4, ebnVar5};
    }

    public static ebn[] values() {
        return (ebn[]) f.clone();
    }
}
