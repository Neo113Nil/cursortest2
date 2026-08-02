package defpackage;

import java.nio.charset.StandardCharsets;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class kbo implements jzz {
    @Override // defpackage.jzz
    public final /* synthetic */ Object a(byte[] bArr) {
        int i;
        byte b;
        List list = kbq.a;
        int length = bArr.length;
        char c = 0;
        if (length == 1) {
            if (bArr[0] == 48) {
                return kbq.b;
            }
            length = 1;
        }
        if (length != 1) {
            if (length == 2 && (b = bArr[0]) >= 48 && b <= 57) {
                i = (b - 48) * 10;
                c = 1;
            }
            return kbq.d.e("Unknown code ".concat(new String(bArr, StandardCharsets.US_ASCII)));
        }
        i = 0;
        byte b2 = bArr[c];
        if (b2 >= 48 && b2 <= 57) {
            int i2 = i + (b2 - 48);
            List list2 = kbq.a;
            if (i2 < list2.size()) {
                return (kbq) list2.get(i2);
            }
        }
        return kbq.d.e("Unknown code ".concat(new String(bArr, StandardCharsets.US_ASCII)));
    }

    @Override // defpackage.jzz
    public final /* bridge */ /* synthetic */ byte[] b(Object obj) {
        return ((kbq) obj).o.s;
    }
}
