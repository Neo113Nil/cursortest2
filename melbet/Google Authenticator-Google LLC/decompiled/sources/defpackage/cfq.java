package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class cfq {
    public static final cfq a;
    public static final cfq b;
    public static final cfq c;
    private static final /* synthetic */ cfq[] d;

    static {
        cfq cfqVar = new cfq("NETWORK_UNMETERED", 0);
        a = cfqVar;
        cfq cfqVar2 = new cfq("DEVICE_IDLE", 1);
        b = cfqVar2;
        cfq cfqVar3 = new cfq("DEVICE_CHARGING", 2);
        c = cfqVar3;
        d = new cfq[]{cfqVar, cfqVar2, cfqVar3};
    }

    public static cfq[] values() {
        return (cfq[]) d.clone();
    }
}
