package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class gh {
    public static final gh d;
    public static final /* synthetic */ gh[] e;

    /* JADX INFO: Fake field, exist only in values array */
    gh EF0;

    static {
        gh ghVar = new gh("UNKNOWN", 0);
        gh ghVar2 = new gh("ANDROID_FIREBASE", 1);
        d = ghVar2;
        e = new gh[]{ghVar, ghVar2};
    }

    public static gh valueOf(String str) {
        return (gh) Enum.valueOf(gh.class, str);
    }

    public static gh[] values() {
        return (gh[]) e.clone();
    }
}
