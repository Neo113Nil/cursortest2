package B;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public final String f89a;

    /* renamed from: b, reason: collision with root package name */
    public final List f90b;

    public u(String str, List list) {
        this.f89a = str;
        this.f90b = list == null ? new ArrayList() : list;
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
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        String str = this.f89a;
        if (str != null) {
            if (!str.equals(uVar.f89a)) {
                return false;
            }
        } else if (uVar.f89a != null) {
            return false;
        }
        List list = this.f90b;
        if (list.size() != uVar.f90b.size()) {
            return false;
        }
        for (int i2 = 0; i2 < list.size(); i2++) {
            boolean z = list.get(i2) instanceof byte[];
            List list2 = uVar.f90b;
            if (z && (list2.get(i2) instanceof byte[])) {
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
        String str = this.f89a;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(this.f89a);
        List list = this.f90b;
        if (list == null || list.isEmpty()) {
            str = "";
        } else {
            str = " " + list;
        }
        sb.append(str);
        return sb.toString();
    }
}
