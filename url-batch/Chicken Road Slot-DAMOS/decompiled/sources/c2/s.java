package c2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class s {

    /* renamed from: d, reason: collision with root package name */
    public static final s f1656d;

    /* renamed from: e, reason: collision with root package name */
    public static final s f1657e;

    /* renamed from: i, reason: collision with root package name */
    public static final s f1658i;

    /* renamed from: r, reason: collision with root package name */
    public static final s f1659r;

    /* renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ s[] f1660s;

    static {
        s sVar = new s("LookaheadMeasurement", 0);
        f1656d = sVar;
        s sVar2 = new s("LookaheadPlacement", 1);
        f1657e = sVar2;
        s sVar3 = new s("Measurement", 2);
        f1658i = sVar3;
        s sVar4 = new s("Placement", 3);
        f1659r = sVar4;
        f1660s = new s[]{sVar, sVar2, sVar3, sVar4};
    }

    public static s valueOf(String str) {
        return (s) Enum.valueOf(s.class, str);
    }

    public static s[] values() {
        return (s[]) f1660s.clone();
    }
}
