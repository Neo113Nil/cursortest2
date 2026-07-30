package g2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class y {

    /* renamed from: f, reason: collision with root package name */
    public static final y f4070f;

    /* renamed from: g, reason: collision with root package name */
    public static final y f4071g;

    /* renamed from: h, reason: collision with root package name */
    public static final y f4072h;

    /* renamed from: i, reason: collision with root package name */
    public static final y f4073i;

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ y[] f4074j;

    static {
        y yVar = new y("StartInput", 0);
        f4070f = yVar;
        y yVar2 = new y("StopInput", 1);
        f4071g = yVar2;
        y yVar3 = new y("ShowKeyboard", 2);
        f4072h = yVar3;
        y yVar4 = new y("HideKeyboard", 3);
        f4073i = yVar4;
        f4074j = new y[]{yVar, yVar2, yVar3, yVar4};
    }

    public static y valueOf(String str) {
        return (y) Enum.valueOf(y.class, str);
    }

    public static y[] values() {
        return (y[]) f4074j.clone();
    }
}
