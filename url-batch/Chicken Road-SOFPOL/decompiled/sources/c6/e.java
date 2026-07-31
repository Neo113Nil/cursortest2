package c6;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: d, reason: collision with root package name */
    public static final e f1745d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ e[] f1746e;

    /* JADX INFO: Fake field, exist only in values array */
    e EF0;

    static {
        e eVar = new e("SYNCHRONIZED", 0);
        e eVar2 = new e("PUBLICATION", 1);
        e eVar3 = new e("NONE", 2);
        f1745d = eVar3;
        f1746e = new e[]{eVar, eVar2, eVar3};
    }

    public static e valueOf(String str) {
        return (e) Enum.valueOf(e.class, str);
    }

    public static e[] values() {
        return (e[]) f1746e.clone();
    }
}
