package androidx.datastore.preferences.protobuf;

/* loaded from: classes.dex */
public final class Y {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC0211v f3834a;

    /* renamed from: b, reason: collision with root package name */
    public final String f3835b;

    /* renamed from: c, reason: collision with root package name */
    public final Object[] f3836c;

    /* renamed from: d, reason: collision with root package name */
    public final int f3837d;

    public Y(AbstractC0211v abstractC0211v, String str, Object[] objArr) {
        this.f3834a = abstractC0211v;
        this.f3835b = str;
        this.f3836c = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.f3837d = charAt;
            return;
        }
        int i3 = charAt & 8191;
        int i4 = 1;
        int i5 = 13;
        while (true) {
            int i6 = i4 + 1;
            char charAt2 = str.charAt(i4);
            if (charAt2 < 55296) {
                this.f3837d = i3 | (charAt2 << i5);
                return;
            } else {
                i3 |= (charAt2 & 8191) << i5;
                i5 += 13;
                i4 = i6;
            }
        }
    }

    public final AbstractC0189a a() {
        return this.f3834a;
    }

    public final Object[] b() {
        return this.f3836c;
    }

    public final String c() {
        return this.f3835b;
    }

    public final int d() {
        return (this.f3837d & 1) == 1 ? 1 : 2;
    }
}
