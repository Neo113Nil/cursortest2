package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dhb {
    public static final dhb a;
    public static final dhb b;
    private static final /* synthetic */ dhb[] c;

    static {
        dhb dhbVar = new dhb("NON_ASYNC_HANDLER", 0);
        a = dhbVar;
        dhb dhbVar2 = new dhb("ASYNC_HANDLER", 1);
        b = dhbVar2;
        c = new dhb[]{dhbVar, dhbVar2};
    }

    public static dhb[] values() {
        return (dhb[]) c.clone();
    }
}
