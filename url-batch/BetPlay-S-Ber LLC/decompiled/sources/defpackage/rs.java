package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class rs {
    public static final rs f;
    public static final rs g;
    public static final rs h;
    public static final rs i;
    public static final /* synthetic */ rs[] j;

    static {
        rs rsVar = new rs("NONE", 0);
        f = rsVar;
        rs rsVar2 = new rs("START", 1);
        g = rsVar2;
        rs rsVar3 = new rs("END", 2);
        h = rsVar3;
        rs rsVar4 = new rs("BOTH", 3);
        i = rsVar4;
        j = new rs[]{rsVar, rsVar2, rsVar3, rsVar4};
    }

    public static rs valueOf(String str) {
        return (rs) Enum.valueOf(rs.class, str);
    }

    public static rs[] values() {
        return (rs[]) j.clone();
    }
}
