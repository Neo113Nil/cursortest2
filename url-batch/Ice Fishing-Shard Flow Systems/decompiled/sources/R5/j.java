package R5;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class j {

    /* renamed from: d, reason: collision with root package name */
    public static final j f2417d;

    /* renamed from: e, reason: collision with root package name */
    public static final j f2418e;

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ j[] f2419i;

    static {
        j jVar = new j("SYNCHRONIZED", 0);
        j jVar2 = new j("PUBLICATION", 1);
        f2417d = jVar2;
        j jVar3 = new j("NONE", 2);
        f2418e = jVar3;
        j[] jVarArr = {jVar, jVar2, jVar3};
        f2419i = jVarArr;
        d4.c.o(jVarArr);
    }

    public static j valueOf(String str) {
        return (j) Enum.valueOf(j.class, str);
    }

    public static j[] values() {
        return (j[]) f2419i.clone();
    }
}
