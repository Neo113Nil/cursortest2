package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final class ds {
    public static final ds f;
    public static final ds g;
    public static final ds h;
    public static final ds i;
    public static final /* synthetic */ ds[] j;

    static {
        ds dsVar = new ds("NONE", 0);
        f = dsVar;
        ds dsVar2 = new ds("START", 1);
        g = dsVar2;
        ds dsVar3 = new ds("END", 2);
        h = dsVar3;
        ds dsVar4 = new ds("BOTH", 3);
        i = dsVar4;
        j = new ds[]{dsVar, dsVar2, dsVar3, dsVar4};
    }

    public static ds valueOf(String str) {
        return (ds) Enum.valueOf(ds.class, str);
    }

    public static ds[] values() {
        return (ds[]) j.clone();
    }
}
