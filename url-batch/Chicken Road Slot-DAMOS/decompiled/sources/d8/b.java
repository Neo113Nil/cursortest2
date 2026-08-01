package d8;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class b extends d {

    /* renamed from: d, reason: collision with root package name */
    public final char[] f3691d;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public b() {
        super(new a("base16()", r1), (Character) null);
        char[] charArray = "0123456789ABCDEF".toCharArray();
        this.f3691d = new char[512];
        i7.a.t(charArray.length == 16);
        for (int i3 = 0; i3 < 256; i3++) {
            char[] cArr = this.f3691d;
            cArr[i3] = charArray[i3 >>> 4];
            cArr[i3 | 256] = charArray[i3 & 15];
        }
    }

    @Override // d8.d
    public final void c(StringBuilder sb2, byte[] bArr, int i3) {
        i7.a.D(0, i3, bArr.length);
        for (int i10 = 0; i10 < i3; i10++) {
            int i11 = bArr[i10] & 255;
            char[] cArr = this.f3691d;
            sb2.append(cArr[i11]);
            sb2.append(cArr[i11 | 256]);
        }
    }
}
