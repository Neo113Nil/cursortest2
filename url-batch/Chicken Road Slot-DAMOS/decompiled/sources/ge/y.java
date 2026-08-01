package ge;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class y {

    /* renamed from: d, reason: collision with root package name */
    public static final y f4417d;

    /* renamed from: e, reason: collision with root package name */
    public static final y f4418e;

    /* renamed from: i, reason: collision with root package name */
    public static final y f4419i;

    /* renamed from: r, reason: collision with root package name */
    public static final y f4420r;

    /* renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ y[] f4421s;

    static {
        y yVar = new y("DEFAULT", 0);
        f4417d = yVar;
        y yVar2 = new y("LAZY", 1);
        f4418e = yVar2;
        y yVar3 = new y("ATOMIC", 2);
        f4419i = yVar3;
        y yVar4 = new y("UNDISPATCHED", 3);
        f4420r = yVar4;
        f4421s = new y[]{yVar, yVar2, yVar3, yVar4};
    }

    public static y valueOf(String str) {
        return (y) Enum.valueOf(y.class, str);
    }

    public static y[] values() {
        return (y[]) f4421s.clone();
    }
}
