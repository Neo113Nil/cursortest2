package w2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class j {

    /* renamed from: d, reason: collision with root package name */
    public static final j f10040d;

    /* renamed from: e, reason: collision with root package name */
    public static final j f10041e;

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ j[] f10042i;

    static {
        j jVar = new j("Ltr", 0);
        f10040d = jVar;
        j jVar2 = new j("Rtl", 1);
        f10041e = jVar2;
        f10042i = new j[]{jVar, jVar2};
    }

    public static j valueOf(String str) {
        return (j) Enum.valueOf(j.class, str);
    }

    public static j[] values() {
        return (j[]) f10042i.clone();
    }
}
