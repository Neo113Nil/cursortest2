package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class gga {
    public static final gga a;
    public static final gga b;
    public static final gga c;
    public static final gga d;
    public static final gga e;
    private static final /* synthetic */ gga[] f;

    static {
        gga ggaVar = new gga("KEY_VALUE", 0);
        a = ggaVar;
        gga ggaVar2 = new gga("TEXT", 1);
        b = ggaVar2;
        gga ggaVar3 = new gga("HTML", 2);
        c = ggaVar3;
        gga ggaVar4 = new gga("BINARY", 3);
        d = ggaVar4;
        gga ggaVar5 = new gga("PROTO", 4);
        e = ggaVar5;
        f = new gga[]{ggaVar, ggaVar2, ggaVar3, ggaVar4, ggaVar5};
    }

    public static gga[] values() {
        return (gga[]) f.clone();
    }
}
