package androidx.datastore.preferences.protobuf;

/* loaded from: classes.dex */
public final class U {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC0185a f3460a;

    /* renamed from: b, reason: collision with root package name */
    public final String f3461b;

    /* renamed from: c, reason: collision with root package name */
    public final Object[] f3462c;

    /* renamed from: d, reason: collision with root package name */
    public final int f3463d;

    public U(AbstractC0205v abstractC0205v, String str, Object[] objArr) {
        this.f3460a = abstractC0205v;
        this.f3461b = str;
        this.f3462c = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.f3463d = charAt;
            return;
        }
        int i2 = charAt & 8191;
        int i5 = 13;
        int i7 = 1;
        while (true) {
            int i8 = i7 + 1;
            char charAt2 = str.charAt(i7);
            if (charAt2 < 55296) {
                this.f3463d = i2 | (charAt2 << i5);
                return;
            } else {
                i2 |= (charAt2 & 8191) << i5;
                i5 += 13;
                i7 = i8;
            }
        }
    }

    public final int a() {
        int i2 = this.f3463d;
        if ((i2 & 1) != 0) {
            return 1;
        }
        return (i2 & 4) == 4 ? 3 : 2;
    }
}
