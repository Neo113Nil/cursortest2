package hd;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class i {

    /* renamed from: d, reason: collision with root package name */
    public static final i f4507d;

    /* renamed from: e, reason: collision with root package name */
    public static final i f4508e;

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ i[] f4509i;

    /* JADX INFO: Fake field, exist only in values array */
    i EF0;

    static {
        i iVar = new i("SYNCHRONIZED", 0);
        i iVar2 = new i("PUBLICATION", 1);
        f4507d = iVar2;
        i iVar3 = new i("NONE", 2);
        f4508e = iVar3;
        f4509i = new i[]{iVar, iVar2, iVar3};
    }

    public static i valueOf(String str) {
        return (i) Enum.valueOf(i.class, str);
    }

    public static i[] values() {
        return (i[]) f4509i.clone();
    }
}
