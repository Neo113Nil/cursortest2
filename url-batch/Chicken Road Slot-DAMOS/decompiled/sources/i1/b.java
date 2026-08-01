package i1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: d, reason: collision with root package name */
    public static final b f4585d;

    /* renamed from: e, reason: collision with root package name */
    public static final b f4586e;

    /* renamed from: i, reason: collision with root package name */
    public static final b f4587i;

    /* renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ b[] f4588r;

    static {
        b bVar = new b("None", 0);
        f4585d = bVar;
        b bVar2 = new b("Cancelled", 1);
        f4586e = bVar2;
        b bVar3 = new b("Redirected", 2);
        f4587i = bVar3;
        f4588r = new b[]{bVar, bVar2, bVar3, new b("RedirectCancelled", 3)};
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f4588r.clone();
    }
}
