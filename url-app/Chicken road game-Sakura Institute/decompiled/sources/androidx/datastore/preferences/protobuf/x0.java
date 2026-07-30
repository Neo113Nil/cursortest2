package androidx.datastore.preferences.protobuf;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class x0 {

    /* renamed from: a, reason: collision with root package name */
    public final a f924a;

    /* renamed from: b, reason: collision with root package name */
    public final String f925b;

    /* renamed from: c, reason: collision with root package name */
    public final Object[] f926c;

    /* renamed from: d, reason: collision with root package name */
    public final int f927d;

    public x0(v vVar, String str, Object[] objArr) {
        this.f924a = vVar;
        this.f925b = str;
        this.f926c = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.f927d = charAt;
            return;
        }
        int i7 = charAt & 8191;
        int i8 = 13;
        int i9 = 1;
        while (true) {
            int i10 = i9 + 1;
            char charAt2 = str.charAt(i9);
            if (charAt2 < 55296) {
                this.f927d = i7 | (charAt2 << i8);
                return;
            } else {
                i7 |= (charAt2 & 8191) << i8;
                i8 += 13;
                i9 = i10;
            }
        }
    }
}
