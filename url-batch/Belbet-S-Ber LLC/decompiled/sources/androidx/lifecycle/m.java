package androidx.lifecycle;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class m {

    /* renamed from: f, reason: collision with root package name */
    public static final m f722f;

    /* renamed from: g, reason: collision with root package name */
    public static final m f723g;
    public static final m h;
    public static final m i;

    /* renamed from: j, reason: collision with root package name */
    public static final m f724j;

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ m[] f725k;

    static {
        m mVar = new m("DESTROYED", 0);
        f722f = mVar;
        m mVar2 = new m("INITIALIZED", 1);
        f723g = mVar2;
        m mVar3 = new m("CREATED", 2);
        h = mVar3;
        m mVar4 = new m("STARTED", 3);
        i = mVar4;
        m mVar5 = new m("RESUMED", 4);
        f724j = mVar5;
        f725k = new m[]{mVar, mVar2, mVar3, mVar4, mVar5};
    }

    public static m valueOf(String str) {
        return (m) Enum.valueOf(m.class, str);
    }

    public static m[] values() {
        return (m[]) f725k.clone();
    }
}
