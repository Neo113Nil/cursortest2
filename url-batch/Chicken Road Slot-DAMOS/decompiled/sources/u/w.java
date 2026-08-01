package u;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class w {

    /* renamed from: d, reason: collision with root package name */
    public static final w f9555d;

    /* renamed from: e, reason: collision with root package name */
    public static final w f9556e;

    /* renamed from: i, reason: collision with root package name */
    public static final w f9557i;

    /* renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ w[] f9558r;

    static {
        w wVar = new w("PreEnter", 0);
        f9555d = wVar;
        w wVar2 = new w("Visible", 1);
        f9556e = wVar2;
        w wVar3 = new w("PostExit", 2);
        f9557i = wVar3;
        f9558r = new w[]{wVar, wVar2, wVar3};
    }

    public static w valueOf(String str) {
        return (w) Enum.valueOf(w.class, str);
    }

    public static w[] values() {
        return (w[]) f9558r.clone();
    }
}
