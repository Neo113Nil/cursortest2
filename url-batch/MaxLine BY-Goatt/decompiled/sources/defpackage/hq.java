package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class hq {
    public static final hq m;
    public static final hq n;
    public static final hq o;
    public static final /* synthetic */ hq[] p;

    static {
        hq hqVar = new hq("SUSPEND", 0);
        m = hqVar;
        hq hqVar2 = new hq("DROP_OLDEST", 1);
        n = hqVar2;
        hq hqVar3 = new hq("DROP_LATEST", 2);
        o = hqVar3;
        p = new hq[]{hqVar, hqVar2, hqVar3};
    }

    public static hq valueOf(String str) {
        return (hq) Enum.valueOf(hq.class, str);
    }

    public static hq[] values() {
        return (hq[]) p.clone();
    }
}
