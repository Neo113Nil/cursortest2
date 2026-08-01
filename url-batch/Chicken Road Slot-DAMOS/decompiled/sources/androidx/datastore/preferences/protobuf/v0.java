package androidx.datastore.preferences.protobuf;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class v0 {

    /* renamed from: a, reason: collision with root package name */
    public final a f643a;

    /* renamed from: b, reason: collision with root package name */
    public final String f644b;

    /* renamed from: c, reason: collision with root package name */
    public final Object[] f645c;

    /* renamed from: d, reason: collision with root package name */
    public final int f646d;

    public v0(v vVar, String str, Object[] objArr) {
        this.f643a = vVar;
        this.f644b = str;
        this.f645c = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.f646d = charAt;
            return;
        }
        int i3 = charAt & 8191;
        int i10 = 13;
        int i11 = 1;
        while (true) {
            int i12 = i11 + 1;
            char charAt2 = str.charAt(i11);
            if (charAt2 < 55296) {
                this.f646d = i3 | (charAt2 << i10);
                return;
            } else {
                i3 |= (charAt2 & 8191) << i10;
                i10 += 13;
                i11 = i12;
            }
        }
    }

    public final int a() {
        int i3 = this.f646d;
        if ((i3 & 1) != 0) {
            return 1;
        }
        return (i3 & 4) == 4 ? 3 : 2;
    }
}
