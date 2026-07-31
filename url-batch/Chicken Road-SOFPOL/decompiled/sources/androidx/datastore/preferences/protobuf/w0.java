package androidx.datastore.preferences.protobuf;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class w0 {

    /* renamed from: a, reason: collision with root package name */
    public final a f790a;

    /* renamed from: b, reason: collision with root package name */
    public final String f791b;

    /* renamed from: c, reason: collision with root package name */
    public final Object[] f792c;

    /* renamed from: d, reason: collision with root package name */
    public final int f793d;

    public w0(w wVar, String str, Object[] objArr) {
        this.f790a = wVar;
        this.f791b = str;
        this.f792c = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.f793d = charAt;
            return;
        }
        int i = charAt & 8191;
        int i8 = 13;
        int i9 = 1;
        while (true) {
            int i10 = i9 + 1;
            char charAt2 = str.charAt(i9);
            if (charAt2 < 55296) {
                this.f793d = i | (charAt2 << i8);
                return;
            } else {
                i |= (charAt2 & 8191) << i8;
                i8 += 13;
                i9 = i10;
            }
        }
    }

    public final int a() {
        int i = this.f793d;
        if ((i & 1) != 0) {
            return 1;
        }
        return (i & 4) == 4 ? 3 : 2;
    }
}
