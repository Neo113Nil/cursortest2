package m1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class q {

    /* renamed from: d, reason: collision with root package name */
    public static final q f8299d;

    /* renamed from: e, reason: collision with root package name */
    public static final q f8300e;

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ q[] f8301i;

    /* JADX INFO: Fake field, exist only in values array */
    q EF0;

    static {
        q qVar = new q("NONE", 0);
        q qVar2 = new q("ADDING", 1);
        f8299d = qVar2;
        q qVar3 = new q("REMOVING", 2);
        f8300e = qVar3;
        f8301i = new q[]{qVar, qVar2, qVar3};
    }

    public static q valueOf(String str) {
        return (q) Enum.valueOf(q.class, str);
    }

    public static q[] values() {
        return (q[]) f8301i.clone();
    }
}
