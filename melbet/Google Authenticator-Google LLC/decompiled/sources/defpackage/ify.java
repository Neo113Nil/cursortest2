package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ify {
    public static final ify a;
    public static final ify b;
    public static final ify c;
    public static final ify d;
    private static final /* synthetic */ ify[] f;
    public final String e;

    static {
        ify ifyVar = new ify("LEGACY_CRONET_ONLY", 0, "legacy_cronet_only");
        a = ifyVar;
        ify ifyVar2 = new ify("CRONET_ONLY", 1, "cronet_only");
        b = ifyVar2;
        ify ifyVar3 = new ify("LEGACY_OK_HTTP_FALLBACK", 2, "legacy_ok_http_fallback");
        c = ifyVar3;
        ify ifyVar4 = new ify("OK_HTTP_FALLBACK", 3, "ok_http_fallback");
        d = ifyVar4;
        ify[] ifyVarArr = {ifyVar, ifyVar2, ifyVar3, ifyVar4};
        f = ifyVarArr;
        ixf.k(ifyVarArr);
    }

    private ify(String str, int i, String str2) {
        this.e = str2;
    }

    public static ify[] values() {
        return (ify[]) f.clone();
    }
}
