package B6;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class x {

    /* renamed from: i, reason: collision with root package name */
    public static final x f266i;

    /* renamed from: l, reason: collision with root package name */
    public static final x f267l;

    /* renamed from: m, reason: collision with root package name */
    public static final x f268m;

    /* renamed from: n, reason: collision with root package name */
    public static final x f269n;

    /* renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ x[] f270o;

    /* renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ Y5.b f271p;

    /* renamed from: d, reason: collision with root package name */
    public final char f272d;

    /* renamed from: e, reason: collision with root package name */
    public final char f273e;

    static {
        x xVar = new x("OBJ", 0, '{', '}');
        f266i = xVar;
        x xVar2 = new x("LIST", 1, '[', ']');
        f267l = xVar2;
        x xVar3 = new x("MAP", 2, '{', '}');
        f268m = xVar3;
        x xVar4 = new x("POLY_OBJ", 3, '[', ']');
        f269n = xVar4;
        x[] xVarArr = {xVar, xVar2, xVar3, xVar4};
        f270o = xVarArr;
        f271p = d4.c.o(xVarArr);
    }

    public x(String str, int i2, char c7, char c8) {
        this.f272d = c7;
        this.f273e = c8;
    }

    public static x valueOf(String str) {
        return (x) Enum.valueOf(x.class, str);
    }

    public static x[] values() {
        return (x[]) f270o.clone();
    }
}
