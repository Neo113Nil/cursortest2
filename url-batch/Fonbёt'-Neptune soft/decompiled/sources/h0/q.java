package h0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public final String f2357a;

    /* renamed from: b, reason: collision with root package name */
    public final List f2358b;

    public q(String str, List list) {
        this.f2357a = str;
        this.f2358b = list == null ? new ArrayList() : list;
    }

    public static Object a(Object obj) {
        if (obj == null) {
            return null;
        }
        if (!(obj instanceof List)) {
            return obj;
        }
        List list = (List) obj;
        byte[] bArr = new byte[list.size()];
        for (int i2 = 0; i2 < list.size(); i2++) {
            bArr[i2] = (byte) ((Integer) list.get(i2)).intValue();
        }
        return bArr;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        String str = this.f2357a;
        if (str != null) {
            if (!str.equals(qVar.f2357a)) {
                return false;
            }
        } else if (qVar.f2357a != null) {
            return false;
        }
        List list = this.f2358b;
        if (list.size() != qVar.f2358b.size()) {
            return false;
        }
        for (int i2 = 0; i2 < list.size(); i2++) {
            boolean z2 = list.get(i2) instanceof byte[];
            List list2 = qVar.f2358b;
            if (z2 && (list2.get(i2) instanceof byte[])) {
                if (!Arrays.equals((byte[]) list.get(i2), (byte[]) list2.get(i2))) {
                    return false;
                }
            } else if (!list.get(i2).equals(list2.get(i2))) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        String str = this.f2357a;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(this.f2357a);
        List list = this.f2358b;
        if (list == null || list.isEmpty()) {
            str = "";
        } else {
            str = " " + list;
        }
        sb.append(str);
        return sb.toString();
    }
}
