package L1;

import M1.B;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: d, reason: collision with root package name */
    public static final d f2703d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ d[] f2704e;

    static {
        d dVar = new d("WARNING", 0);
        f2703d = dVar;
        d[] dVarArr = {dVar, new d("ERROR", 1), new d("HIDDEN", 2)};
        f2704e = dVarArr;
        B.x(dVarArr);
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) f2704e.clone();
    }
}
