package o1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class m {

    /* renamed from: f, reason: collision with root package name */
    public static final m f2911f;

    /* renamed from: g, reason: collision with root package name */
    public static final m f2912g;
    public static final m h;
    public static final /* synthetic */ m[] i;

    static {
        m mVar = new m("ALL", 0);
        f2911f = mVar;
        m mVar2 = new m("THIS_MONTH", 1);
        f2912g = mVar2;
        m mVar3 = new m("SOON", 2);
        h = mVar3;
        i = new m[]{mVar, mVar2, mVar3};
    }

    public static m valueOf(String str) {
        return (m) Enum.valueOf(m.class, str);
    }

    public static m[] values() {
        return (m[]) i.clone();
    }
}
