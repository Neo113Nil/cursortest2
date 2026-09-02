package z3;

import H5.r;
import a.AbstractC0219a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: g, reason: collision with root package name */
    public static final d f6297g;

    /* renamed from: h, reason: collision with root package name */
    public static final d f6298h;

    /* renamed from: i, reason: collision with root package name */
    public static final d f6299i;

    /* renamed from: j, reason: collision with root package name */
    public static final d f6300j;

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ d[] f6301k;

    /* renamed from: f, reason: collision with root package name */
    public final int f6302f;

    static {
        d dVar = new d("VARINT", 0, 0);
        f6297g = dVar;
        d dVar2 = new d("FIXED64", 1, 1);
        f6298h = dVar2;
        d dVar3 = new d("LENGTH_DELIMITED", 2, 2);
        f6299i = dVar3;
        d dVar4 = new d("FIXED32", 3, 5);
        f6300j = dVar4;
        d[] dVarArr = {dVar, dVar2, dVar3, dVar4};
        f6301k = dVarArr;
        AbstractC0219a.n(dVarArr);
    }

    public d(String str, int i7, int i8) {
        this.f6302f = i8;
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) f6301k.clone();
    }

    public final i a() {
        int ordinal = ordinal();
        if (ordinal == 0) {
            return i.f6314k;
        }
        if (ordinal == 1) {
            return i.f6315l;
        }
        if (ordinal == 2) {
            return i.f6317n;
        }
        if (ordinal == 3) {
            return i.f6312i;
        }
        throw new r();
    }
}
