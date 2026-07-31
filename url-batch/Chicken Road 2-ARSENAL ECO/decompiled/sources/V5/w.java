package V5;

import a.AbstractC0219a;
import r5.C0621b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class w {

    /* renamed from: h, reason: collision with root package name */
    public static final w f2775h;

    /* renamed from: i, reason: collision with root package name */
    public static final w f2776i;

    /* renamed from: j, reason: collision with root package name */
    public static final w f2777j;

    /* renamed from: k, reason: collision with root package name */
    public static final w f2778k;

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ w[] f2779l;

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ C0621b f2780m;

    /* renamed from: f, reason: collision with root package name */
    public final char f2781f;

    /* renamed from: g, reason: collision with root package name */
    public final char f2782g;

    static {
        w wVar = new w("OBJ", 0, '{', '}');
        f2775h = wVar;
        w wVar2 = new w("LIST", 1, '[', ']');
        f2776i = wVar2;
        w wVar3 = new w("MAP", 2, '{', '}');
        f2777j = wVar3;
        w wVar4 = new w("POLY_OBJ", 3, '[', ']');
        f2778k = wVar4;
        w[] wVarArr = {wVar, wVar2, wVar3, wVar4};
        f2779l = wVarArr;
        f2780m = AbstractC0219a.n(wVarArr);
    }

    public w(String str, int i7, char c7, char c8) {
        this.f2781f = c7;
        this.f2782g = c8;
    }

    public static w valueOf(String str) {
        return (w) Enum.valueOf(w.class, str);
    }

    public static w[] values() {
        return (w[]) f2779l.clone();
    }
}
