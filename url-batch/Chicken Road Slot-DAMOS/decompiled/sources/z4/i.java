package z4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class i {

    /* renamed from: d, reason: collision with root package name */
    public static final i f10752d;

    /* renamed from: e, reason: collision with root package name */
    public static final i f10753e;

    /* renamed from: i, reason: collision with root package name */
    public static final i f10754i;

    /* renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ i[] f10755r;

    static {
        i iVar = new i("NO_OP", 0);
        f10752d = iVar;
        i iVar2 = new i("ADD", 1);
        f10753e = iVar2;
        i iVar3 = new i("REMOVE", 2);
        f10754i = iVar3;
        f10755r = new i[]{iVar, iVar2, iVar3};
    }

    public static i valueOf(String str) {
        return (i) Enum.valueOf(i.class, str);
    }

    public static i[] values() {
        return (i[]) f10755r.clone();
    }
}
