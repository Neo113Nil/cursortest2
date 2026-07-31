package z3;

import a.AbstractC0219a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class m {

    /* renamed from: g, reason: collision with root package name */
    public static final m f6336g;

    /* renamed from: h, reason: collision with root package name */
    public static final m f6337h;

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ m[] f6338i;

    /* renamed from: f, reason: collision with root package name */
    public final String f6339f;

    static {
        m mVar = new m("PROTO_2", 0, "proto2");
        f6336g = mVar;
        m mVar2 = new m("PROTO_3", 1, "proto3");
        f6337h = mVar2;
        m[] mVarArr = {mVar, mVar2};
        f6338i = mVarArr;
        AbstractC0219a.n(mVarArr);
    }

    public m(String str, int i7, String str2) {
        this.f6339f = str2;
    }

    public static m valueOf(String str) {
        return (m) Enum.valueOf(m.class, str);
    }

    public static m[] values() {
        return (m[]) f6338i.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f6339f;
    }
}
