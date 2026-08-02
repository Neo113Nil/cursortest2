package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class liw {
    public static final liw a;
    public static final liw b;
    public static final liw c;
    public static final liw d;
    public static final liw e;
    public static final liw f;
    private static final /* synthetic */ liw[] g;

    static {
        liw liwVar = new liw("CRONET_SOURCE_UNSPECIFIED", 0);
        a = liwVar;
        liw liwVar2 = new liw("CRONET_SOURCE_STATICALLY_LINKED", 1);
        b = liwVar2;
        liw liwVar3 = new liw("CRONET_SOURCE_PLAY_SERVICES", 2);
        c = liwVar3;
        liw liwVar4 = new liw("CRONET_SOURCE_FALLBACK", 3);
        d = liwVar4;
        liw liwVar5 = new liw("CRONET_SOURCE_PLATFORM", 4);
        e = liwVar5;
        liw liwVar6 = new liw("CRONET_SOURCE_FAKE", 5);
        f = liwVar6;
        g = new liw[]{liwVar, liwVar2, liwVar3, liwVar4, liwVar5, liwVar6};
    }

    public static liw[] values() {
        return (liw[]) g.clone();
    }
}
