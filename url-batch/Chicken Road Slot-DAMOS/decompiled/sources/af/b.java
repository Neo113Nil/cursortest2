package af;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: d, reason: collision with root package name */
    public static final b f373d;

    /* renamed from: e, reason: collision with root package name */
    public static final b f374e;

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ b[] f375i;

    static {
        b bVar = new b("Singleton", 0);
        f373d = bVar;
        b bVar2 = new b("Factory", 1);
        f374e = bVar2;
        f375i = new b[]{bVar, bVar2, new b("Scoped", 2)};
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f375i.clone();
    }
}
