package androidx.datastore.preferences.protobuf;

/* loaded from: classes.dex */
public final class V {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC0089a f1489a;

    /* renamed from: b, reason: collision with root package name */
    public final String f1490b;

    /* renamed from: c, reason: collision with root package name */
    public final Object[] f1491c;

    /* renamed from: d, reason: collision with root package name */
    public final int f1492d;

    public V(AbstractC0110w abstractC0110w, String str, Object[] objArr) {
        this.f1489a = abstractC0110w;
        this.f1490b = str;
        this.f1491c = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.f1492d = charAt;
            return;
        }
        int i2 = charAt & 8191;
        int i3 = 13;
        int i4 = 1;
        while (true) {
            int i5 = i4 + 1;
            char charAt2 = str.charAt(i4);
            if (charAt2 < 55296) {
                this.f1492d = i2 | (charAt2 << i3);
                return;
            } else {
                i2 |= (charAt2 & 8191) << i3;
                i3 += 13;
                i4 = i5;
            }
        }
    }

    public final int a() {
        int i2 = this.f1492d;
        if ((i2 & 1) != 0) {
            return 1;
        }
        return (i2 & 4) == 4 ? 3 : 2;
    }
}
