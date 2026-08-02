package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class baw {
    public static final baw a;
    public static final baw b;
    public static final baw c;
    private static final /* synthetic */ baw[] d;

    static {
        baw bawVar = new baw("PREFER_ARGB_8888", 0);
        a = bawVar;
        baw bawVar2 = new baw("PREFER_RGB_565", 1);
        b = bawVar2;
        d = new baw[]{bawVar, bawVar2};
        c = bawVar;
    }

    public static baw[] values() {
        return (baw[]) d.clone();
    }
}
