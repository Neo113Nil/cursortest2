package q2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ i[] f10240a = {new i("PUBLIC", 0), new i("PROTECTED", 1), new i("INTERNAL", 2), new i("PRIVATE", 3)};

    /* JADX INFO: Fake field, exist only in values array */
    i EF5;

    public static i valueOf(String str) {
        return (i) Enum.valueOf(i.class, str);
    }

    public static i[] values() {
        return (i[]) f10240a.clone();
    }
}
