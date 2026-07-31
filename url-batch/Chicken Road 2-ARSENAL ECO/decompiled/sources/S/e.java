package S;

import a.AbstractC0219a;
import android.database.Cursor;
import com.onesignal.inAppMessages.internal.display.impl.n;
import i6.g;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.i;
import l5.q;
import m5.C0529f;
import m5.C0532i;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final String f2196a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f2197b;

    /* renamed from: c, reason: collision with root package name */
    public final Set f2198c;

    /* renamed from: d, reason: collision with root package name */
    public final Set f2199d;

    public e(String str, Map map, AbstractSet foreignKeys, AbstractSet abstractSet) {
        i.e(foreignKeys, "foreignKeys");
        this.f2196a = str;
        this.f2197b = map;
        this.f2198c = foreignKeys;
        this.f2199d = abstractSet;
    }

    /* JADX WARN: Code restructure failed: missing block: B:69:0x01dd, code lost:
    
        r9 = a.AbstractC0219a.e(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x01e1, code lost:
    
        r3.close();
     */
    /* JADX WARN: Finally extract failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final e a(V.c cVar, String str) {
        Map b7;
        Cursor F6 = cVar.F("PRAGMA table_info(`" + str + "`)");
        try {
            if (F6.getColumnCount() <= 0) {
                b7 = q.f5304f;
                F6.close();
            } else {
                int columnIndex = F6.getColumnIndex("name");
                int columnIndex2 = F6.getColumnIndex(n.EVENT_TYPE_KEY);
                int columnIndex3 = F6.getColumnIndex("notnull");
                int columnIndex4 = F6.getColumnIndex("pk");
                int columnIndex5 = F6.getColumnIndex("dflt_value");
                C0529f c0529f = new C0529f();
                while (F6.moveToNext()) {
                    String name = F6.getString(columnIndex);
                    String type = F6.getString(columnIndex2);
                    boolean z5 = F6.getInt(columnIndex3) != 0;
                    int i7 = F6.getInt(columnIndex4);
                    String string = F6.getString(columnIndex5);
                    i.d(name, "name");
                    i.d(type, "type");
                    c0529f.put(name, new a(name, type, z5, i7, string, 2));
                }
                b7 = c0529f.b();
                F6.close();
            }
            F6 = cVar.F("PRAGMA foreign_key_list(`" + str + "`)");
            try {
                int columnIndex6 = F6.getColumnIndex("id");
                int columnIndex7 = F6.getColumnIndex("seq");
                int columnIndex8 = F6.getColumnIndex("table");
                int columnIndex9 = F6.getColumnIndex("on_delete");
                int columnIndex10 = F6.getColumnIndex("on_update");
                List v5 = g.v(F6);
                F6.moveToPosition(-1);
                C0532i c0532i = new C0532i();
                while (F6.moveToNext()) {
                    if (F6.getInt(columnIndex7) == 0) {
                        int i8 = F6.getInt(columnIndex6);
                        ArrayList arrayList = new ArrayList();
                        ArrayList arrayList2 = new ArrayList();
                        int i9 = columnIndex6;
                        ArrayList arrayList3 = new ArrayList();
                        for (Object obj : v5) {
                            int i10 = columnIndex7;
                            List list = v5;
                            if (((c) obj).f2188f == i8) {
                                arrayList3.add(obj);
                            }
                            columnIndex7 = i10;
                            v5 = list;
                        }
                        int i11 = columnIndex7;
                        List list2 = v5;
                        int size = arrayList3.size();
                        int i12 = 0;
                        while (i12 < size) {
                            Object obj2 = arrayList3.get(i12);
                            i12++;
                            c cVar2 = (c) obj2;
                            arrayList.add(cVar2.f2190h);
                            arrayList2.add(cVar2.f2191i);
                            arrayList3 = arrayList3;
                        }
                        String string2 = F6.getString(columnIndex8);
                        i.d(string2, "cursor.getString(tableColumnIndex)");
                        String string3 = F6.getString(columnIndex9);
                        i.d(string3, "cursor.getString(onDeleteColumnIndex)");
                        String string4 = F6.getString(columnIndex10);
                        i.d(string4, "cursor.getString(onUpdateColumnIndex)");
                        c0532i.add(new b(string2, string3, string4, arrayList, arrayList2));
                        columnIndex6 = i9;
                        columnIndex7 = i11;
                        v5 = list2;
                    }
                }
                C0532i e4 = AbstractC0219a.e(c0532i);
                F6.close();
                F6 = cVar.F("PRAGMA index_list(`" + str + "`)");
                try {
                    int columnIndex11 = F6.getColumnIndex("name");
                    int columnIndex12 = F6.getColumnIndex("origin");
                    int columnIndex13 = F6.getColumnIndex("unique");
                    C0532i c0532i2 = null;
                    if (columnIndex11 != -1 && columnIndex12 != -1 && columnIndex13 != -1) {
                        C0532i c0532i3 = new C0532i();
                        while (true) {
                            if (!F6.moveToNext()) {
                                break;
                            }
                            if ("c".equals(F6.getString(columnIndex12))) {
                                String name2 = F6.getString(columnIndex11);
                                boolean z6 = F6.getInt(columnIndex13) == 1;
                                i.d(name2, "name");
                                d w5 = g.w(cVar, name2, z6);
                                if (w5 == null) {
                                    F6.close();
                                    break;
                                }
                                c0532i3.add(w5);
                            }
                        }
                        return new e(str, b7, e4, c0532i2);
                    }
                    F6.close();
                    return new e(str, b7, e4, c0532i2);
                } finally {
                }
            } catch (Throwable th) {
                try {
                    throw th;
                } finally {
                }
            }
        } finally {
            try {
                throw th;
            } finally {
            }
        }
    }

    public final boolean equals(Object obj) {
        Set set;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        if (!this.f2196a.equals(eVar.f2196a) || !this.f2197b.equals(eVar.f2197b) || !i.a(this.f2198c, eVar.f2198c)) {
            return false;
        }
        Set set2 = this.f2199d;
        if (set2 == null || (set = eVar.f2199d) == null) {
            return true;
        }
        return set2.equals(set);
    }

    public final int hashCode() {
        return this.f2198c.hashCode() + ((this.f2197b.hashCode() + (this.f2196a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "TableInfo{name='" + this.f2196a + "', columns=" + this.f2197b + ", foreignKeys=" + this.f2198c + ", indices=" + this.f2199d + '}';
    }
}
