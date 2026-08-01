package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final class vp {
    public static final vp f;
    public static final vp g;
    public static final vp h;
    public static final vp i;
    public static final vp j;
    public static final /* synthetic */ vp[] k;

    static {
        vp vpVar = new vp("DESTROYED", 0);
        f = vpVar;
        vp vpVar2 = new vp("INITIALIZED", 1);
        g = vpVar2;
        vp vpVar3 = new vp("CREATED", 2);
        h = vpVar3;
        vp vpVar4 = new vp("STARTED", 3);
        i = vpVar4;
        vp vpVar5 = new vp("RESUMED", 4);
        j = vpVar5;
        k = new vp[]{vpVar, vpVar2, vpVar3, vpVar4, vpVar5};
    }

    public static vp valueOf(String str) {
        return (vp) Enum.valueOf(vp.class, str);
    }

    public static vp[] values() {
        return (vp[]) k.clone();
    }
}
