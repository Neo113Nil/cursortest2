package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ifx {
    public static final ifx a;
    public static final ifx b;
    public static final ifx c;
    public static final ifx d;
    public static final ifx e;
    private static final /* synthetic */ ifx[] g;
    public final String f;

    static {
        ifx ifxVar = new ifx("SUCCESS", 0, "success");
        a = ifxVar;
        ifx ifxVar2 = new ifx("FAILURE", 1, "failure");
        b = ifxVar2;
        ifx ifxVar3 = new ifx("OK_HTTP_FALLBACK", 2, "ok_http_fallback");
        c = ifxVar3;
        ifx ifxVar4 = new ifx("CRONET_LOAD_EXCEPTION", 3, "cronet_load_exception");
        d = ifxVar4;
        ifx ifxVar5 = new ifx("JAVA_FALLBACK", 4, "java_fallback");
        e = ifxVar5;
        ifx[] ifxVarArr = {ifxVar, ifxVar2, ifxVar3, ifxVar4, ifxVar5};
        g = ifxVarArr;
        ixf.k(ifxVarArr);
    }

    private ifx(String str, int i, String str2) {
        this.f = str2;
    }

    public static ifx[] values() {
        return (ifx[]) g.clone();
    }
}
