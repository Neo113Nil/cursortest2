package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class hs {
    public static final hs f;
    public static final hs g;
    public static final hs h;
    public static final hs i;
    public static final hs j;
    public static final /* synthetic */ hs[] k;

    static {
        hs hsVar = new hs("DESTROYED", 0);
        f = hsVar;
        hs hsVar2 = new hs("INITIALIZED", 1);
        g = hsVar2;
        hs hsVar3 = new hs("CREATED", 2);
        h = hsVar3;
        hs hsVar4 = new hs("STARTED", 3);
        i = hsVar4;
        hs hsVar5 = new hs("RESUMED", 4);
        j = hsVar5;
        k = new hs[]{hsVar, hsVar2, hsVar3, hsVar4, hsVar5};
    }

    public static hs valueOf(String str) {
        return (hs) Enum.valueOf(hs.class, str);
    }

    public static hs[] values() {
        return (hs[]) k.clone();
    }
}
