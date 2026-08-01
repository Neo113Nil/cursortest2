package d8;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class c extends d {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public c(String str, String str2) {
        super(new a(str, r4), (Character) '=');
        char[] charArray = str2.toCharArray();
        i7.a.t(charArray.length == 64);
    }

    @Override // d8.d
    public final void c(StringBuilder sb2, byte[] bArr, int i3) {
        int i10 = 0;
        i7.a.D(0, i3, bArr.length);
        for (int i11 = i3; i11 >= 3; i11 -= 3) {
            int i12 = i10 + 2;
            int i13 = ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10] & 255) << 16);
            i10 += 3;
            int i14 = i13 | (bArr[i12] & 255);
            a aVar = this.f3693a;
            char[] cArr = aVar.f3686b;
            char[] cArr2 = aVar.f3686b;
            sb2.append(cArr[i14 >>> 18]);
            sb2.append(cArr2[(i14 >>> 12) & 63]);
            sb2.append(cArr2[(i14 >>> 6) & 63]);
            sb2.append(cArr2[i14 & 63]);
        }
        if (i10 < i3) {
            b(sb2, bArr, i10, i3 - i10);
        }
    }
}
