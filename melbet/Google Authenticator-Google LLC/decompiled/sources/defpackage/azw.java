package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class azw {
    public static final azw a;
    public static final azw b;
    public static final azw c;
    public static final azw d;
    private static final /* synthetic */ azw[] e;

    static {
        azw azwVar = new azw("IMMEDIATE", 0);
        a = azwVar;
        azw azwVar2 = new azw("HIGH", 1);
        b = azwVar2;
        azw azwVar3 = new azw("NORMAL", 2);
        c = azwVar3;
        azw azwVar4 = new azw("LOW", 3);
        d = azwVar4;
        e = new azw[]{azwVar, azwVar2, azwVar3, azwVar4};
    }

    public static azw[] values() {
        return (azw[]) e.clone();
    }
}
