package l5;

import u1.AbstractC1477a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public static final e f11078a;

    /* renamed from: b, reason: collision with root package name */
    public static final e f11079b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ e[] f11080c;

    static {
        e eVar = new e("RELEASE", 0);
        f11078a = eVar;
        e eVar2 = new e("LOOP", 1);
        f11079b = eVar2;
        e[] eVarArr = {eVar, eVar2, new e("STOP", 2)};
        f11080c = eVarArr;
        AbstractC1477a.n(eVarArr);
    }

    public static e valueOf(String str) {
        return (e) Enum.valueOf(e.class, str);
    }

    public static e[] values() {
        return (e[]) f11080c.clone();
    }
}
