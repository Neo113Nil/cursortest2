package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bbm {
    public static final bbm a;
    public static final bbm b;
    private static final /* synthetic */ bbm[] c;

    static {
        bbm bbmVar = new bbm("SRGB", 0);
        a = bbmVar;
        bbm bbmVar2 = new bbm("DISPLAY_P3", 1);
        b = bbmVar2;
        c = new bbm[]{bbmVar, bbmVar2};
    }

    public static bbm[] values() {
        return (bbm[]) c.clone();
    }
}
