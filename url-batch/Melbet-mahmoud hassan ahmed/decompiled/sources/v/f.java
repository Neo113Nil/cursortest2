package v;

import android.database.Cursor;
import android.os.Build;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/* loaded from: classes.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    public final String f22550a;

    /* renamed from: b, reason: collision with root package name */
    public final Map<String, a> f22551b;

    /* renamed from: c, reason: collision with root package name */
    public final Set<b> f22552c;

    /* renamed from: d, reason: collision with root package name */
    public final Set<d> f22553d;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final String f22554a;

        /* renamed from: b, reason: collision with root package name */
        public final String f22555b;

        /* renamed from: c, reason: collision with root package name */
        public final int f22556c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f22557d;

        /* renamed from: e, reason: collision with root package name */
        public final int f22558e;

        /* renamed from: f, reason: collision with root package name */
        public final String f22559f;

        /* renamed from: g, reason: collision with root package name */
        private final int f22560g;

        public a(String str, String str2, boolean z6, int i7, String str3, int i8) {
            this.f22554a = str;
            this.f22555b = str2;
            this.f22557d = z6;
            this.f22558e = i7;
            this.f22556c = a(str2);
            this.f22559f = str3;
            this.f22560g = i8;
        }

        private static int a(String str) {
            if (str == null) {
                return 5;
            }
            String upperCase = str.toUpperCase(Locale.US);
            if (upperCase.contains("INT")) {
                return 3;
            }
            if (upperCase.contains("CHAR") || upperCase.contains("CLOB") || upperCase.contains("TEXT")) {
                return 2;
            }
            if (upperCase.contains("BLOB")) {
                return 5;
            }
            return (upperCase.contains("REAL") || upperCase.contains("FLOA") || upperCase.contains("DOUB")) ? 4 : 1;
        }

        public boolean b() {
            return this.f22558e > 0;
        }

        public boolean equals(Object obj) {
            String str;
            String str2;
            String str3;
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            if (Build.VERSION.SDK_INT >= 20) {
                if (this.f22558e != aVar.f22558e) {
                    return false;
                }
            } else if (b() != aVar.b()) {
                return false;
            }
            if (!this.f22554a.equals(aVar.f22554a) || this.f22557d != aVar.f22557d) {
                return false;
            }
            if (this.f22560g == 1 && aVar.f22560g == 2 && (str3 = this.f22559f) != null && !str3.equals(aVar.f22559f)) {
                return false;
            }
            if (this.f22560g == 2 && aVar.f22560g == 1 && (str2 = aVar.f22559f) != null && !str2.equals(this.f22559f)) {
                return false;
            }
            int i7 = this.f22560g;
            return (i7 == 0 || i7 != aVar.f22560g || ((str = this.f22559f) == null ? aVar.f22559f == null : str.equals(aVar.f22559f))) && this.f22556c == aVar.f22556c;
        }

        public int hashCode() {
            return (((((this.f22554a.hashCode() * 31) + this.f22556c) * 31) + (this.f22557d ? 1231 : 1237)) * 31) + this.f22558e;
        }

        public String toString() {
            return "Column{name='" + this.f22554a + "', type='" + this.f22555b + "', affinity='" + this.f22556c + "', notNull=" + this.f22557d + ", primaryKeyPosition=" + this.f22558e + ", defaultValue='" + this.f22559f + "'}";
        }
    }

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public final String f22561a;

        /* renamed from: b, reason: collision with root package name */
        public final String f22562b;

        /* renamed from: c, reason: collision with root package name */
        public final String f22563c;

        /* renamed from: d, reason: collision with root package name */
        public final List<String> f22564d;

        /* renamed from: e, reason: collision with root package name */
        public final List<String> f22565e;

        public b(String str, String str2, String str3, List<String> list, List<String> list2) {
            this.f22561a = str;
            this.f22562b = str2;
            this.f22563c = str3;
            this.f22564d = Collections.unmodifiableList(list);
            this.f22565e = Collections.unmodifiableList(list2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            b bVar = (b) obj;
            if (this.f22561a.equals(bVar.f22561a) && this.f22562b.equals(bVar.f22562b) && this.f22563c.equals(bVar.f22563c) && this.f22564d.equals(bVar.f22564d)) {
                return this.f22565e.equals(bVar.f22565e);
            }
            return false;
        }

        public int hashCode() {
            return (((((((this.f22561a.hashCode() * 31) + this.f22562b.hashCode()) * 31) + this.f22563c.hashCode()) * 31) + this.f22564d.hashCode()) * 31) + this.f22565e.hashCode();
        }

        public String toString() {
            return "ForeignKey{referenceTable='" + this.f22561a + "', onDelete='" + this.f22562b + "', onUpdate='" + this.f22563c + "', columnNames=" + this.f22564d + ", referenceColumnNames=" + this.f22565e + '}';
        }
    }

    static class c implements Comparable<c> {

        /* renamed from: f, reason: collision with root package name */
        final int f22566f;

        /* renamed from: g, reason: collision with root package name */
        final int f22567g;

        /* renamed from: h, reason: collision with root package name */
        final String f22568h;

        /* renamed from: i, reason: collision with root package name */
        final String f22569i;

        c(int i7, int i8, String str, String str2) {
            this.f22566f = i7;
            this.f22567g = i8;
            this.f22568h = str;
            this.f22569i = str2;
        }

        @Override // java.lang.Comparable
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public int compareTo(c cVar) {
            int i7 = this.f22566f - cVar.f22566f;
            return i7 == 0 ? this.f22567g - cVar.f22567g : i7;
        }
    }

    public static class d {

        /* renamed from: a, reason: collision with root package name */
        public final String f22570a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f22571b;

        /* renamed from: c, reason: collision with root package name */
        public final List<String> f22572c;

        public d(String str, boolean z6, List<String> list) {
            this.f22570a = str;
            this.f22571b = z6;
            this.f22572c = list;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            d dVar = (d) obj;
            if (this.f22571b == dVar.f22571b && this.f22572c.equals(dVar.f22572c)) {
                return this.f22570a.startsWith("index_") ? dVar.f22570a.startsWith("index_") : this.f22570a.equals(dVar.f22570a);
            }
            return false;
        }

        public int hashCode() {
            return ((((this.f22570a.startsWith("index_") ? -1184239155 : this.f22570a.hashCode()) * 31) + (this.f22571b ? 1 : 0)) * 31) + this.f22572c.hashCode();
        }

        public String toString() {
            return "Index{name='" + this.f22570a + "', unique=" + this.f22571b + ", columns=" + this.f22572c + '}';
        }
    }

    public f(String str, Map<String, a> map, Set<b> set, Set<d> set2) {
        this.f22550a = str;
        this.f22551b = Collections.unmodifiableMap(map);
        this.f22552c = Collections.unmodifiableSet(set);
        this.f22553d = set2 == null ? null : Collections.unmodifiableSet(set2);
    }

    public static f a(w.b bVar, String str) {
        return new f(str, b(bVar, str), d(bVar, str), f(bVar, str));
    }

    private static Map<String, a> b(w.b bVar, String str) {
        Cursor L = bVar.L("PRAGMA table_info(`" + str + "`)");
        HashMap hashMap = new HashMap();
        try {
            if (L.getColumnCount() > 0) {
                int columnIndex = L.getColumnIndex("name");
                int columnIndex2 = L.getColumnIndex("type");
                int columnIndex3 = L.getColumnIndex("notnull");
                int columnIndex4 = L.getColumnIndex("pk");
                int columnIndex5 = L.getColumnIndex("dflt_value");
                while (L.moveToNext()) {
                    String string = L.getString(columnIndex);
                    hashMap.put(string, new a(string, L.getString(columnIndex2), L.getInt(columnIndex3) != 0, L.getInt(columnIndex4), L.getString(columnIndex5), 2));
                }
            }
            return hashMap;
        } finally {
            L.close();
        }
    }

    private static List<c> c(Cursor cursor) {
        int columnIndex = cursor.getColumnIndex("id");
        int columnIndex2 = cursor.getColumnIndex("seq");
        int columnIndex3 = cursor.getColumnIndex("from");
        int columnIndex4 = cursor.getColumnIndex("to");
        int count = cursor.getCount();
        ArrayList arrayList = new ArrayList();
        for (int i7 = 0; i7 < count; i7++) {
            cursor.moveToPosition(i7);
            arrayList.add(new c(cursor.getInt(columnIndex), cursor.getInt(columnIndex2), cursor.getString(columnIndex3), cursor.getString(columnIndex4)));
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    private static Set<b> d(w.b bVar, String str) {
        HashSet hashSet = new HashSet();
        Cursor L = bVar.L("PRAGMA foreign_key_list(`" + str + "`)");
        try {
            int columnIndex = L.getColumnIndex("id");
            int columnIndex2 = L.getColumnIndex("seq");
            int columnIndex3 = L.getColumnIndex("table");
            int columnIndex4 = L.getColumnIndex("on_delete");
            int columnIndex5 = L.getColumnIndex("on_update");
            List<c> c7 = c(L);
            int count = L.getCount();
            for (int i7 = 0; i7 < count; i7++) {
                L.moveToPosition(i7);
                if (L.getInt(columnIndex2) == 0) {
                    int i8 = L.getInt(columnIndex);
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    for (c cVar : c7) {
                        if (cVar.f22566f == i8) {
                            arrayList.add(cVar.f22568h);
                            arrayList2.add(cVar.f22569i);
                        }
                    }
                    hashSet.add(new b(L.getString(columnIndex3), L.getString(columnIndex4), L.getString(columnIndex5), arrayList, arrayList2));
                }
            }
            return hashSet;
        } finally {
            L.close();
        }
    }

    private static d e(w.b bVar, String str, boolean z6) {
        Cursor L = bVar.L("PRAGMA index_xinfo(`" + str + "`)");
        try {
            int columnIndex = L.getColumnIndex("seqno");
            int columnIndex2 = L.getColumnIndex("cid");
            int columnIndex3 = L.getColumnIndex("name");
            if (columnIndex != -1 && columnIndex2 != -1 && columnIndex3 != -1) {
                TreeMap treeMap = new TreeMap();
                while (L.moveToNext()) {
                    if (L.getInt(columnIndex2) >= 0) {
                        treeMap.put(Integer.valueOf(L.getInt(columnIndex)), L.getString(columnIndex3));
                    }
                }
                ArrayList arrayList = new ArrayList(treeMap.size());
                arrayList.addAll(treeMap.values());
                return new d(str, z6, arrayList);
            }
            return null;
        } finally {
            L.close();
        }
    }

    private static Set<d> f(w.b bVar, String str) {
        Cursor L = bVar.L("PRAGMA index_list(`" + str + "`)");
        try {
            int columnIndex = L.getColumnIndex("name");
            int columnIndex2 = L.getColumnIndex("origin");
            int columnIndex3 = L.getColumnIndex("unique");
            if (columnIndex != -1 && columnIndex2 != -1 && columnIndex3 != -1) {
                HashSet hashSet = new HashSet();
                while (L.moveToNext()) {
                    if ("c".equals(L.getString(columnIndex2))) {
                        String string = L.getString(columnIndex);
                        boolean z6 = true;
                        if (L.getInt(columnIndex3) != 1) {
                            z6 = false;
                        }
                        d e7 = e(bVar, string, z6);
                        if (e7 == null) {
                            return null;
                        }
                        hashSet.add(e7);
                    }
                }
                return hashSet;
            }
            return null;
        } finally {
            L.close();
        }
    }

    public boolean equals(Object obj) {
        Set<d> set;
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        f fVar = (f) obj;
        String str = this.f22550a;
        if (str == null ? fVar.f22550a != null : !str.equals(fVar.f22550a)) {
            return false;
        }
        Map<String, a> map = this.f22551b;
        if (map == null ? fVar.f22551b != null : !map.equals(fVar.f22551b)) {
            return false;
        }
        Set<b> set2 = this.f22552c;
        if (set2 == null ? fVar.f22552c != null : !set2.equals(fVar.f22552c)) {
            return false;
        }
        Set<d> set3 = this.f22553d;
        if (set3 == null || (set = fVar.f22553d) == null) {
            return true;
        }
        return set3.equals(set);
    }

    public int hashCode() {
        String str = this.f22550a;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        Map<String, a> map = this.f22551b;
        int hashCode2 = (hashCode + (map != null ? map.hashCode() : 0)) * 31;
        Set<b> set = this.f22552c;
        return hashCode2 + (set != null ? set.hashCode() : 0);
    }

    public String toString() {
        return "TableInfo{name='" + this.f22550a + "', columns=" + this.f22551b + ", foreignKeys=" + this.f22552c + ", indices=" + this.f22553d + '}';
    }
}
