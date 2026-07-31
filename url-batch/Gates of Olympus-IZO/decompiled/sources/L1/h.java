package L1;

import M1.B;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class h {

    /* renamed from: d, reason: collision with root package name */
    public static final h f2705d;

    /* renamed from: e, reason: collision with root package name */
    public static final h f2706e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ h[] f2707f;

    static {
        h hVar = new h("SYNCHRONIZED", 0);
        h hVar2 = new h("PUBLICATION", 1);
        f2705d = hVar2;
        h hVar3 = new h("NONE", 2);
        f2706e = hVar3;
        h[] hVarArr = {hVar, hVar2, hVar3};
        f2707f = hVarArr;
        B.x(hVarArr);
    }

    public static h valueOf(String str) {
        return (h) Enum.valueOf(h.class, str);
    }

    public static h[] values() {
        return (h[]) f2707f.clone();
    }
}
