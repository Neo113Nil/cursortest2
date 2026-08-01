package r4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: d, reason: collision with root package name */
    public static final f f8170d;

    /* renamed from: e, reason: collision with root package name */
    public static final f f8171e;

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ f[] f8172i;

    static {
        f fVar = new f("PATH", 0);
        f8170d = fVar;
        f fVar2 = new f("QUERY", 1);
        f8171e = fVar2;
        f8172i = new f[]{fVar, fVar2};
    }

    public static f valueOf(String str) {
        return (f) Enum.valueOf(f.class, str);
    }

    public static f[] values() {
        return (f[]) f8172i.clone();
    }
}
