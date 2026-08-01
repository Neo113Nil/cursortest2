package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class hq {
    public static final hq f;
    public static final hq g;
    public static final hq h;
    public static final hq i;
    public static final hq j;
    public static final /* synthetic */ hq[] k;

    static {
        hq hqVar = new hq("DESTROYED", 0);
        f = hqVar;
        hq hqVar2 = new hq("INITIALIZED", 1);
        g = hqVar2;
        hq hqVar3 = new hq("CREATED", 2);
        h = hqVar3;
        hq hqVar4 = new hq("STARTED", 3);
        i = hqVar4;
        hq hqVar5 = new hq("RESUMED", 4);
        j = hqVar5;
        k = new hq[]{hqVar, hqVar2, hqVar3, hqVar4, hqVar5};
    }

    public static hq valueOf(String str) {
        return (hq) Enum.valueOf(hq.class, str);
    }

    public static hq[] values() {
        return (hq[]) k.clone();
    }
}
