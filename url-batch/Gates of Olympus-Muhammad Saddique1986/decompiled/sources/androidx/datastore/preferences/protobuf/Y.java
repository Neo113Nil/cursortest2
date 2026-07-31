package androidx.datastore.preferences.protobuf;

/* loaded from: classes.dex */
public final class Y {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC0267v f5035a;

    /* renamed from: b, reason: collision with root package name */
    public final String f5036b;

    /* renamed from: c, reason: collision with root package name */
    public final Object[] f5037c;

    /* renamed from: d, reason: collision with root package name */
    public final int f5038d;

    public Y(AbstractC0267v abstractC0267v, String str, Object[] objArr) {
        this.f5035a = abstractC0267v;
        this.f5036b = str;
        this.f5037c = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.f5038d = charAt;
            return;
        }
        int i3 = charAt & 8191;
        int i4 = 1;
        int i5 = 13;
        while (true) {
            int i6 = i4 + 1;
            char charAt2 = str.charAt(i4);
            if (charAt2 < 55296) {
                this.f5038d = i3 | (charAt2 << i5);
                return;
            } else {
                i3 |= (charAt2 & 8191) << i5;
                i5 += 13;
                i4 = i6;
            }
        }
    }

    public final AbstractC0245a a() {
        return this.f5035a;
    }

    public final Object[] b() {
        return this.f5037c;
    }

    public final String c() {
        return this.f5036b;
    }

    public final int d() {
        return (this.f5038d & 1) == 1 ? 1 : 2;
    }
}
