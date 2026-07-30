package F;

import java.util.Comparator;

/* loaded from: classes.dex */
public final /* synthetic */ class c implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = (byte[]) obj2;
        if (bArr.length != bArr2.length) {
            return bArr.length - bArr2.length;
        }
        for (int i2 = 0; i2 < bArr.length; i2++) {
            byte b7 = bArr[i2];
            byte b8 = bArr2[i2];
            if (b7 != b8) {
                return b7 - b8;
            }
        }
        return 0;
    }
}
