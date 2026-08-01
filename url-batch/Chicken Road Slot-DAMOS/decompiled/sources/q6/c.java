package q6;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: d, reason: collision with root package name */
    public static final c f8032d;

    /* renamed from: e, reason: collision with root package name */
    public static final c f8033e;

    /* renamed from: i, reason: collision with root package name */
    public static final c f8034i;

    /* renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ c[] f8035r;

    static {
        c cVar = new c("NETWORK_UNMETERED", 0);
        f8032d = cVar;
        c cVar2 = new c("DEVICE_IDLE", 1);
        f8033e = cVar2;
        c cVar3 = new c("DEVICE_CHARGING", 2);
        f8034i = cVar3;
        f8035r = new c[]{cVar, cVar2, cVar3};
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) f8035r.clone();
    }
}
