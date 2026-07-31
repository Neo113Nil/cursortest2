package u4;

import android.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    private final String f22540a;

    /* renamed from: b, reason: collision with root package name */
    private final List<Object> f22541b;

    public d(String str, List<Object> list) {
        this.f22540a = str;
        this.f22541b = list == null ? new ArrayList<>() : list;
    }

    private static Map<String, Object> a(Map<Object, Object> map) {
        HashMap hashMap = new HashMap();
        for (Map.Entry<Object, Object> entry : map.entrySet()) {
            Object value = entry.getValue();
            hashMap.put(j(entry.getKey()), value instanceof Map ? a((Map) value) : j(value));
        }
        return hashMap;
    }

    private String[] c(List<Object> list) {
        return (String[]) h(list).toArray(new String[0]);
    }

    private Object[] g(List<Object> list) {
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            Iterator<Object> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(k(it.next()));
            }
        }
        return arrayList.toArray(new Object[0]);
    }

    private List<String> h(List<Object> list) {
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            Iterator<Object> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(j(it.next()));
            }
        }
        return arrayList;
    }

    private static String j(Object obj) {
        if (obj == null) {
            return null;
        }
        if (!(obj instanceof byte[])) {
            return obj instanceof Map ? a((Map) obj).toString() : obj.toString();
        }
        ArrayList arrayList = new ArrayList();
        for (byte b7 : (byte[]) obj) {
            arrayList.add(Integer.valueOf(b7));
        }
        return arrayList.toString();
    }

    private static Object k(Object obj) {
        if (obj == null) {
            return null;
        }
        if (v4.a.f22829c) {
            Log.d("Sqflite", "arg " + obj.getClass().getCanonicalName() + " " + j(obj));
        }
        if (obj instanceof List) {
            List list = (List) obj;
            byte[] bArr = new byte[list.size()];
            for (int i7 = 0; i7 < list.size(); i7++) {
                bArr[i7] = (byte) ((Integer) list.get(i7)).intValue();
            }
            obj = bArr;
        }
        if (v4.a.f22829c) {
            Log.d("Sqflite", "arg " + obj.getClass().getCanonicalName() + " " + j(obj));
        }
        return obj;
    }

    public String[] b() {
        return c(this.f22541b);
    }

    public List<Object> d() {
        return this.f22541b;
    }

    public String e() {
        return this.f22540a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        String str = this.f22540a;
        if (str != null) {
            if (!str.equals(dVar.f22540a)) {
                return false;
            }
        } else if (dVar.f22540a != null) {
            return false;
        }
        if (this.f22541b.size() != dVar.f22541b.size()) {
            return false;
        }
        for (int i7 = 0; i7 < this.f22541b.size(); i7++) {
            if ((this.f22541b.get(i7) instanceof byte[]) && (dVar.f22541b.get(i7) instanceof byte[])) {
                if (!Arrays.equals((byte[]) this.f22541b.get(i7), (byte[]) dVar.f22541b.get(i7))) {
                    return false;
                }
            } else if (!this.f22541b.get(i7).equals(dVar.f22541b.get(i7))) {
                return false;
            }
        }
        return true;
    }

    public Object[] f() {
        return g(this.f22541b);
    }

    public int hashCode() {
        String str = this.f22540a;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public d i() {
        if (this.f22541b.size() == 0) {
            return this;
        }
        StringBuilder sb = new StringBuilder();
        ArrayList arrayList = new ArrayList();
        int length = this.f22540a.length();
        int i7 = 0;
        int i8 = 0;
        for (int i9 = 0; i9 < length; i9++) {
            char charAt = this.f22540a.charAt(i9);
            if (charAt == '?') {
                int i10 = i9 + 1;
                if (i10 < length && Character.isDigit(this.f22540a.charAt(i10))) {
                    return this;
                }
                i7++;
                if (i8 >= this.f22541b.size()) {
                    return this;
                }
                int i11 = i8 + 1;
                Object obj = this.f22541b.get(i8);
                if ((obj instanceof Integer) || (obj instanceof Long)) {
                    sb.append(obj.toString());
                    i8 = i11;
                } else {
                    arrayList.add(obj);
                    i8 = i11;
                }
            }
            sb.append(charAt);
        }
        return i7 != this.f22541b.size() ? this : new d(sb.toString(), arrayList);
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(this.f22540a);
        List<Object> list = this.f22541b;
        if (list == null || list.isEmpty()) {
            str = "";
        } else {
            str = " " + h(this.f22541b);
        }
        sb.append(str);
        return sb.toString();
    }
}
