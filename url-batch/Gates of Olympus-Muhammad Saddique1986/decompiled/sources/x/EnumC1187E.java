package x;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: x.E, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC1187E {

    /* renamed from: d, reason: collision with root package name */
    public static final EnumC1187E f9940d;

    /* renamed from: e, reason: collision with root package name */
    public static final EnumC1187E f9941e;

    /* renamed from: f, reason: collision with root package name */
    public static final EnumC1187E f9942f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ EnumC1187E[] f9943g;

    static {
        EnumC1187E enumC1187E = new EnumC1187E("Cursor", 0);
        f9940d = enumC1187E;
        EnumC1187E enumC1187E2 = new EnumC1187E("SelectionStart", 1);
        f9941e = enumC1187E2;
        EnumC1187E enumC1187E3 = new EnumC1187E("SelectionEnd", 2);
        f9942f = enumC1187E3;
        f9943g = new EnumC1187E[]{enumC1187E, enumC1187E2, enumC1187E3};
    }

    public static EnumC1187E valueOf(String str) {
        return (EnumC1187E) Enum.valueOf(EnumC1187E.class, str);
    }

    public static EnumC1187E[] values() {
        return (EnumC1187E[]) f9943g.clone();
    }
}
