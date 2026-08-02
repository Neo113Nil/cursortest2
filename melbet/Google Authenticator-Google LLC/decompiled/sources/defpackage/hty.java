package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class hty {
    public static final hty a;
    public static final hty b;
    public static final hty c;
    public static final hty d;
    public static final hty e;
    public static final hty f;
    private static final /* synthetic */ hty[] g;

    static {
        hty htyVar = new hty("OPEN", 0);
        a = htyVar;
        hty htyVar2 = new hty("SUBSUMED", 1);
        b = htyVar2;
        hty htyVar3 = new hty("WILL_CLOSE", 2);
        c = htyVar3;
        hty htyVar4 = new hty("CLOSING", 3);
        d = htyVar4;
        hty htyVar5 = new hty("CLOSED", 4);
        e = htyVar5;
        hty htyVar6 = new hty("WILL_CREATE_VALUE_AND_CLOSER", 5);
        f = htyVar6;
        g = new hty[]{htyVar, htyVar2, htyVar3, htyVar4, htyVar5, htyVar6};
    }

    public static hty[] values() {
        return (hty[]) g.clone();
    }
}
