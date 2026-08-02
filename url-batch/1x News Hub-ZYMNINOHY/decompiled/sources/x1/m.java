package x1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final String f10768a;

    /* renamed from: b, reason: collision with root package name */
    public final List f10769b;

    public m(String str, List list) {
        this.f10768a = str;
        this.f10769b = list == null ? new ArrayList() : list;
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
        for (int i3 = 0; i3 < list.size(); i3++) {
            bArr[i3] = (byte) ((Integer) list.get(i3)).intValue();
        }
        return bArr;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        String str = this.f10768a;
        if (str != null) {
            if (!str.equals(mVar.f10768a)) {
                return false;
            }
        } else if (mVar.f10768a != null) {
            return false;
        }
        List list = this.f10769b;
        if (list.size() != mVar.f10769b.size()) {
            return false;
        }
        for (int i3 = 0; i3 < list.size(); i3++) {
            boolean z = list.get(i3) instanceof byte[];
            List list2 = mVar.f10769b;
            if (z && (list2.get(i3) instanceof byte[])) {
                if (!Arrays.equals((byte[]) list.get(i3), (byte[]) list2.get(i3))) {
                    return false;
                }
            } else if (!list.get(i3).equals(list2.get(i3))) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        String str = this.f10768a;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(this.f10768a);
        List list = this.f10769b;
        if (list == null || list.isEmpty()) {
            str = "";
        } else {
            str = " " + list;
        }
        sb.append(str);
        return sb.toString();
    }
}
