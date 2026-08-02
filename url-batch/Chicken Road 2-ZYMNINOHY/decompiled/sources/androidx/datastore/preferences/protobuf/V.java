package androidx.datastore.preferences.protobuf;

/* loaded from: classes.dex */
public final class V {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC0168a f4597a;

    /* renamed from: b, reason: collision with root package name */
    public final String f4598b;

    /* renamed from: c, reason: collision with root package name */
    public final Object[] f4599c;

    /* renamed from: d, reason: collision with root package name */
    public final int f4600d;

    public V(AbstractC0189w abstractC0189w, String str, Object[] objArr) {
        this.f4597a = abstractC0189w;
        this.f4598b = str;
        this.f4599c = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.f4600d = charAt;
            return;
        }
        int i4 = charAt & 8191;
        int i5 = 13;
        int i6 = 1;
        while (true) {
            int i7 = i6 + 1;
            char charAt2 = str.charAt(i6);
            if (charAt2 < 55296) {
                this.f4600d = i4 | (charAt2 << i5);
                return;
            } else {
                i4 |= (charAt2 & 8191) << i5;
                i5 += 13;
                i6 = i7;
            }
        }
    }

    public final int a() {
        int i4 = this.f4600d;
        if ((i4 & 1) != 0) {
            return 1;
        }
        return (i4 & 4) == 4 ? 3 : 2;
    }
}
