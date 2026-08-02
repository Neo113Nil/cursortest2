package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dhn {
    public static final dhn a;
    public static final dhn b;
    private static final /* synthetic */ dhn[] c;

    static {
        dhn dhnVar = new dhn("LOG_ERROR", 0);
        a = dhnVar;
        dhn dhnVar2 = new dhn("CRASH_APP", 1);
        b = dhnVar2;
        c = new dhn[]{dhnVar, dhnVar2};
    }

    public static dhn[] values() {
        return (dhn[]) c.clone();
    }
}
