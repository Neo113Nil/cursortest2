package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kad {
    public static final kad a;
    public static final kad b;
    public static final kad c;
    public static final kad d;
    public static final kad e;
    private static final /* synthetic */ kad[] f;

    static {
        kad kadVar = new kad("UNARY", 0);
        a = kadVar;
        kad kadVar2 = new kad("CLIENT_STREAMING", 1);
        b = kadVar2;
        kad kadVar3 = new kad("SERVER_STREAMING", 2);
        c = kadVar3;
        kad kadVar4 = new kad("BIDI_STREAMING", 3);
        d = kadVar4;
        kad kadVar5 = new kad("UNKNOWN", 4);
        e = kadVar5;
        f = new kad[]{kadVar, kadVar2, kadVar3, kadVar4, kadVar5};
    }

    public static kad[] values() {
        return (kad[]) f.clone();
    }

    public final boolean a() {
        return this == a || this == b;
    }
}
