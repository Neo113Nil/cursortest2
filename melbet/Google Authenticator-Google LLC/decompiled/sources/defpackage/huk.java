package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class huk {
    public static final huk a;
    public static final huk b;
    public static final huk c;
    private static final /* synthetic */ huk[] d;

    static {
        huk hukVar = new huk("NOT_RUN", 0);
        a = hukVar;
        huk hukVar2 = new huk("CANCELLED", 1);
        b = hukVar2;
        huk hukVar3 = new huk("STARTED", 2);
        c = hukVar3;
        d = new huk[]{hukVar, hukVar2, hukVar3};
    }

    public static huk[] values() {
        return (huk[]) d.clone();
    }
}
