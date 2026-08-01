package androidx.lifecycle;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class m {

    /* renamed from: f, reason: collision with root package name */
    public static final m f590f;
    public static final m g;
    public static final m h;

    /* renamed from: i, reason: collision with root package name */
    public static final m f591i;

    /* renamed from: j, reason: collision with root package name */
    public static final m f592j;

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ m[] f593k;

    static {
        m mVar = new m("DESTROYED", 0);
        f590f = mVar;
        m mVar2 = new m("INITIALIZED", 1);
        g = mVar2;
        m mVar3 = new m("CREATED", 2);
        h = mVar3;
        m mVar4 = new m("STARTED", 3);
        f591i = mVar4;
        m mVar5 = new m("RESUMED", 4);
        f592j = mVar5;
        f593k = new m[]{mVar, mVar2, mVar3, mVar4, mVar5};
    }

    public static m valueOf(String str) {
        return (m) Enum.valueOf(m.class, str);
    }

    public static m[] values() {
        return (m[]) f593k.clone();
    }
}
