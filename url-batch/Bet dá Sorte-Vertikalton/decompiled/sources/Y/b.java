package Y;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final b f1099a;

    /* renamed from: b, reason: collision with root package name */
    public static final b f1100b;

    /* renamed from: c, reason: collision with root package name */
    public static final b f1101c;
    public static final /* synthetic */ b[] d;

    /* JADX INFO: Fake field, exist only in values array */
    b EF0;

    static {
        b bVar = new b("PENALTY_LOG", 0);
        b bVar2 = new b("PENALTY_DEATH", 1);
        b bVar3 = new b("DETECT_FRAGMENT_REUSE", 2);
        f1099a = bVar3;
        b bVar4 = new b("DETECT_FRAGMENT_TAG_USAGE", 3);
        f1100b = bVar4;
        b bVar5 = new b("DETECT_RETAIN_INSTANCE_USAGE", 4);
        b bVar6 = new b("DETECT_SET_USER_VISIBLE_HINT", 5);
        b bVar7 = new b("DETECT_TARGET_FRAGMENT_USAGE", 6);
        b bVar8 = new b("DETECT_WRONG_FRAGMENT_CONTAINER", 7);
        f1101c = bVar8;
        d = new b[]{bVar, bVar2, bVar3, bVar4, bVar5, bVar6, bVar7, bVar8};
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) d.clone();
    }
}
