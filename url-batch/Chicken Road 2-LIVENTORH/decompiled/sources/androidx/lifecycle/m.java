package androidx.lifecycle;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class m {

    /* renamed from: f, reason: collision with root package name */
    public static final m f617f;

    /* renamed from: g, reason: collision with root package name */
    public static final m f618g;

    /* renamed from: h, reason: collision with root package name */
    public static final m f619h;
    public static final m i;

    /* renamed from: j, reason: collision with root package name */
    public static final m f620j;

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ m[] f621k;

    static {
        m mVar = new m("DESTROYED", 0);
        f617f = mVar;
        m mVar2 = new m("INITIALIZED", 1);
        f618g = mVar2;
        m mVar3 = new m("CREATED", 2);
        f619h = mVar3;
        m mVar4 = new m("STARTED", 3);
        i = mVar4;
        m mVar5 = new m("RESUMED", 4);
        f620j = mVar5;
        f621k = new m[]{mVar, mVar2, mVar3, mVar4, mVar5};
    }

    public static m valueOf(String str) {
        return (m) Enum.valueOf(m.class, str);
    }

    public static m[] values() {
        return (m[]) f621k.clone();
    }
}
