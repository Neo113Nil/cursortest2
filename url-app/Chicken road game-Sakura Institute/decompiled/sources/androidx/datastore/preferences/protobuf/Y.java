package androidx.datastore.preferences.protobuf;

/* loaded from: classes.dex */
public final class Y {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC0456v f5309a;

    /* renamed from: b, reason: collision with root package name */
    public final String f5310b;

    /* renamed from: c, reason: collision with root package name */
    public final Object[] f5311c;

    /* renamed from: d, reason: collision with root package name */
    public final int f5312d;

    public Y(AbstractC0456v abstractC0456v, String str, Object[] objArr) {
        this.f5309a = abstractC0456v;
        this.f5310b = str;
        this.f5311c = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.f5312d = charAt;
            return;
        }
        int i2 = charAt & 8191;
        int i4 = 1;
        int i5 = 13;
        while (true) {
            int i6 = i4 + 1;
            char charAt2 = str.charAt(i4);
            if (charAt2 < 55296) {
                this.f5312d = i2 | (charAt2 << i5);
                return;
            } else {
                i2 |= (charAt2 & 8191) << i5;
                i5 += 13;
                i4 = i6;
            }
        }
    }

    public final AbstractC0434a a() {
        return this.f5309a;
    }

    public final Object[] b() {
        return this.f5311c;
    }

    public final String c() {
        return this.f5310b;
    }

    public final int d() {
        return (this.f5312d & 1) == 1 ? 1 : 2;
    }
}
