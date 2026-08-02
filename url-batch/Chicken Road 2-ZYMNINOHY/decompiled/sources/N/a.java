package N;

import java.util.Map;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.j;
import o3.InterfaceC1339l;

/* loaded from: classes.dex */
public final class a extends j implements InterfaceC1339l {

    /* renamed from: e, reason: collision with root package name */
    public static final a f1784e = new a(1);

    @Override // o3.InterfaceC1339l
    public final Object invoke(Object obj) {
        String valueOf;
        Map.Entry entry = (Map.Entry) obj;
        i.e(entry, "entry");
        Object value = entry.getValue();
        if (value instanceof byte[]) {
            byte[] bArr = (byte[]) value;
            i.e(bArr, "<this>");
            StringBuilder sb = new StringBuilder();
            sb.append((CharSequence) "[");
            int i4 = 0;
            for (byte b4 : bArr) {
                i4++;
                if (i4 > 1) {
                    sb.append((CharSequence) ", ");
                }
                sb.append((CharSequence) String.valueOf((int) b4));
            }
            sb.append((CharSequence) "]");
            valueOf = sb.toString();
        } else {
            valueOf = String.valueOf(entry.getValue());
        }
        return "  " + ((d) entry.getKey()).f1790a + " = " + valueOf;
    }
}
