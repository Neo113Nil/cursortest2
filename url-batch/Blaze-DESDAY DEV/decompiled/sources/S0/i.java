package S0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public static final i f786a;

    /* renamed from: b, reason: collision with root package name */
    public static final i f787b;

    /* renamed from: c, reason: collision with root package name */
    public static final i f788c;
    public static final i d;

    /* renamed from: e, reason: collision with root package name */
    public static final i f789e;

    /* renamed from: f, reason: collision with root package name */
    public static final i f790f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ i[] f791g;

    static {
        i iVar = new i("NONE", 0);
        f786a = iVar;
        i iVar2 = new i("MOVED", 1);
        f787b = iVar2;
        i iVar3 = new i("ATE_FOOD", 2);
        f788c = iVar3;
        i iVar4 = new i("DIED", 3);
        d = iVar4;
        i iVar5 = new i("GAME_OVER", 4);
        f789e = iVar5;
        i iVar6 = new i("VICTORY", 5);
        f790f = iVar6;
        f791g = new i[]{iVar, iVar2, iVar3, iVar4, iVar5, iVar6};
    }

    public static i valueOf(String str) {
        return (i) Enum.valueOf(i.class, str);
    }

    public static i[] values() {
        return (i[]) f791g.clone();
    }
}
