package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class efe {
    public static final efe a;
    public static final efe b;
    private static final /* synthetic */ efe[] d;
    public final String c;

    static {
        efe efeVar = new efe("COLOR_RESOLVER_UNBOUND", 0, "ColorResolverUnbound");
        a = efeVar;
        efe efeVar2 = new efe("BENTO_INTENT_LAUNCHER_BINDER_UNBOUND", 1, "BentoIntentLauncherBinderUnbound");
        b = efeVar2;
        efe[] efeVarArr = {efeVar, efeVar2};
        d = efeVarArr;
        ixf.k(efeVarArr);
    }

    private efe(String str, int i, String str2) {
        this.c = str2;
    }

    public static efe[] values() {
        return (efe[]) d.clone();
    }
}
