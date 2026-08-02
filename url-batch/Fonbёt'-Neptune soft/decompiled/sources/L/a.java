package L;

import P0.l;
import Q0.i;
import java.util.Map;

/* loaded from: classes.dex */
public final class a extends i implements l {

    /* renamed from: f, reason: collision with root package name */
    public static final a f756f = new a(1);

    @Override // P0.l
    public final Object i(Object obj) {
        String valueOf;
        Map.Entry entry = (Map.Entry) obj;
        Q0.h.e(entry, "entry");
        Object value = entry.getValue();
        if (value instanceof byte[]) {
            byte[] bArr = (byte[]) value;
            Q0.h.e(bArr, "<this>");
            StringBuilder sb = new StringBuilder();
            sb.append((CharSequence) "[");
            int i2 = 0;
            for (byte b2 : bArr) {
                i2++;
                if (i2 > 1) {
                    sb.append((CharSequence) ", ");
                }
                sb.append((CharSequence) String.valueOf((int) b2));
            }
            sb.append((CharSequence) "]");
            valueOf = sb.toString();
            Q0.h.d(valueOf, "toString(...)");
        } else {
            valueOf = String.valueOf(entry.getValue());
        }
        return "  " + ((d) entry.getKey()).f762a + " = " + valueOf;
    }
}
