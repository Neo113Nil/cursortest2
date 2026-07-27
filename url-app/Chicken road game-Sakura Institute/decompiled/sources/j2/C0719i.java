package j2;

import java.util.HashMap;
import java.util.Map;

/* renamed from: j2.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0719i {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f7165a = new HashMap();

    public final String a(String str) {
        String str2 = str + "<value>: null\n";
        HashMap hashMap = this.f7165a;
        if (hashMap.isEmpty()) {
            return str2 + str + "<empty>";
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            StringBuilder sb = new StringBuilder();
            sb.append(str2);
            sb.append(str);
            sb.append(entry.getKey());
            sb.append(":\n");
            sb.append(((C0719i) entry.getValue()).a(str + "\t"));
            sb.append("\n");
            str2 = sb.toString();
        }
        return str2;
    }
}
