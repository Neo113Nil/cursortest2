package Y5;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class d {

    /* renamed from: u, reason: collision with root package name */
    public static final d f3983u;

    /* renamed from: v, reason: collision with root package name */
    public static final d f3984v;

    /* renamed from: w, reason: collision with root package name */
    public static final d f3985w;

    /* renamed from: x, reason: collision with root package name */
    public static final d f3986x;

    /* renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ d[] f3987y;

    /* renamed from: n, reason: collision with root package name */
    public final int f3988n;

    static {
        d dVar = new d("VARINT", 0, 0);
        f3983u = dVar;
        d dVar2 = new d("FIXED64", 1, 1);
        f3984v = dVar2;
        d dVar3 = new d("LENGTH_DELIMITED", 2, 2);
        f3985w = dVar3;
        d dVar4 = new d("FIXED32", 3, 5);
        f3986x = dVar4;
        d[] dVarArr = {dVar, dVar2, dVar3, dVar4};
        f3987y = dVarArr;
        W2.e.d(dVarArr);
    }

    public d(String str, int i, int i4) {
        this.f3988n = i4;
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) f3987y.clone();
    }

    public final i a() {
        int ordinal = ordinal();
        if (ordinal == 0) {
            return i.f3999k;
        }
        if (ordinal == 1) {
            return i.f4000l;
        }
        if (ordinal == 2) {
            return i.f4002n;
        }
        if (ordinal == 3) {
            return i.i;
        }
        throw new B0.c();
    }
}
