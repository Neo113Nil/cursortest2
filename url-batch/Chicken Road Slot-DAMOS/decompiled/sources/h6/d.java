package h6;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: d, reason: collision with root package name */
    public static final d f4479d;

    /* renamed from: e, reason: collision with root package name */
    public static final d f4480e;

    /* renamed from: i, reason: collision with root package name */
    public static final d f4481i;

    /* renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ d[] f4482r;

    static {
        d dVar = new d("DEFAULT", 0);
        f4479d = dVar;
        d dVar2 = new d("VERY_LOW", 1);
        f4480e = dVar2;
        d dVar3 = new d("HIGHEST", 2);
        f4481i = dVar3;
        f4482r = new d[]{dVar, dVar2, dVar3};
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) f4482r.clone();
    }
}
