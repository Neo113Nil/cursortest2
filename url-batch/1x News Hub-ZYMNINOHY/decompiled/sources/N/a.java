package N;

import java.util.Map;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.k;
import l2.l;

/* loaded from: classes.dex */
public final class a extends k implements l {

    /* renamed from: e, reason: collision with root package name */
    public static final a f976e = new a(1);

    @Override // l2.l
    public final Object invoke(Object obj) {
        String valueOf;
        Map.Entry entry = (Map.Entry) obj;
        j.e(entry, "entry");
        Object value = entry.getValue();
        if (value instanceof byte[]) {
            byte[] bArr = (byte[]) value;
            j.e(bArr, "<this>");
            StringBuilder sb = new StringBuilder();
            sb.append((CharSequence) "[");
            int i3 = 0;
            for (byte b3 : bArr) {
                i3++;
                if (i3 > 1) {
                    sb.append((CharSequence) ", ");
                }
                sb.append((CharSequence) String.valueOf((int) b3));
            }
            sb.append((CharSequence) "]");
            valueOf = sb.toString();
        } else {
            valueOf = String.valueOf(entry.getValue());
        }
        return "  " + ((d) entry.getKey()).f981a + " = " + valueOf;
    }
}
