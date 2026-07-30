package o5;

import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f6852a = new HashMap();

    public final String a(String str) {
        String str2 = str + "<value>: null\n";
        HashMap hashMap = this.f6852a;
        if (hashMap.isEmpty()) {
            return str2 + str + "<empty>";
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            StringBuilder sb = new StringBuilder();
            sb.append(str2);
            sb.append(str);
            sb.append(entry.getKey());
            sb.append(":\n");
            sb.append(((i) entry.getValue()).a(str + "\t"));
            sb.append("\n");
            str2 = sb.toString();
        }
        return str2;
    }
}
