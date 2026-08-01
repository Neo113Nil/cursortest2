package s8;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: d, reason: collision with root package name */
    public static final d f9153d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ d[] f9154e;

    static {
        d dVar = new d("DEFAULT", 0);
        f9153d = dVar;
        f9154e = new d[]{dVar, new d("SIGNED", 1), new d("FIXED", 2)};
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) f9154e.clone();
    }
}
