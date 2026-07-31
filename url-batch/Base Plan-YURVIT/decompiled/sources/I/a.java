package I;

import O0.l;
import P0.i;
import java.util.Map;

/* loaded from: classes.dex */
public final class a extends i implements l {

    /* renamed from: f, reason: collision with root package name */
    public static final a f513f = new a(1);

    @Override // O0.l
    public final Object j(Object obj) {
        String valueOf;
        Map.Entry entry = (Map.Entry) obj;
        P0.h.e(entry, "entry");
        Object value = entry.getValue();
        if (value instanceof byte[]) {
            byte[] bArr = (byte[]) value;
            P0.h.e(bArr, "<this>");
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
        } else {
            valueOf = String.valueOf(entry.getValue());
        }
        return "  " + ((d) entry.getKey()).f519a + " = " + valueOf;
    }
}
