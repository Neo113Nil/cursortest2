package y2;

import M1.B;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class m {

    /* renamed from: f, reason: collision with root package name */
    public static final m f8858f;

    /* renamed from: g, reason: collision with root package name */
    public static final m f8859g;

    /* renamed from: h, reason: collision with root package name */
    public static final m f8860h;

    /* renamed from: i, reason: collision with root package name */
    public static final m f8861i;

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ m[] f8862j;

    /* renamed from: d, reason: collision with root package name */
    public final char f8863d;

    /* renamed from: e, reason: collision with root package name */
    public final char f8864e;

    static {
        m mVar = new m("OBJ", 0, '{', '}');
        f8858f = mVar;
        m mVar2 = new m("LIST", 1, '[', ']');
        f8859g = mVar2;
        m mVar3 = new m("MAP", 2, '{', '}');
        f8860h = mVar3;
        m mVar4 = new m("POLY_OBJ", 3, '[', ']');
        f8861i = mVar4;
        m[] mVarArr = {mVar, mVar2, mVar3, mVar4};
        f8862j = mVarArr;
        B.x(mVarArr);
    }

    public m(String str, int i3, char c3, char c4) {
        this.f8863d = c3;
        this.f8864e = c4;
    }

    public static m valueOf(String str) {
        return (m) Enum.valueOf(m.class, str);
    }

    public static m[] values() {
        return (m[]) f8862j.clone();
    }
}
