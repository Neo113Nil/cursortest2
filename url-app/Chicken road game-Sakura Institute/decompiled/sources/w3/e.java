package w3;

import a8.m;
import android.database.Cursor;
import e6.v;
import f6.g;
import f6.j;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import r6.k;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final String f9515a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f9516b;

    /* renamed from: c, reason: collision with root package name */
    public final Set f9517c;

    /* renamed from: d, reason: collision with root package name */
    public final Set f9518d;

    public e(String str, Map map, AbstractSet abstractSet, AbstractSet abstractSet2) {
        k.f(abstractSet, "foreignKeys");
        this.f9515a = str;
        this.f9516b = map;
        this.f9517c = abstractSet;
        this.f9518d = abstractSet2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:69:0x01e2, code lost:
    
        r9 = a8.m.k(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x01e6, code lost:
    
        r3.close();
     */
    /* JADX WARN: Finally extract failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final e a(y3.a aVar, String str) {
        Map b9;
        k.f(aVar, "database");
        Cursor O = aVar.O("PRAGMA table_info(`" + str + "`)");
        try {
            if (O.getColumnCount() <= 0) {
                b9 = v.f2827f;
                O.close();
            } else {
                int columnIndex = O.getColumnIndex("name");
                int columnIndex2 = O.getColumnIndex("type");
                int columnIndex3 = O.getColumnIndex("notnull");
                int columnIndex4 = O.getColumnIndex("pk");
                int columnIndex5 = O.getColumnIndex("dflt_value");
                g gVar = new g();
                while (O.moveToNext()) {
                    String string = O.getString(columnIndex);
                    String string2 = O.getString(columnIndex2);
                    boolean z8 = O.getInt(columnIndex3) != 0;
                    int i7 = O.getInt(columnIndex4);
                    String string3 = O.getString(columnIndex5);
                    k.e(string, "name");
                    k.e(string2, "type");
                    gVar.put(string, new a(string, string2, z8, i7, string3, 2));
                }
                b9 = gVar.b();
                O.close();
            }
            O = aVar.O("PRAGMA foreign_key_list(`" + str + "`)");
            try {
                int columnIndex6 = O.getColumnIndex("id");
                int columnIndex7 = O.getColumnIndex("seq");
                int columnIndex8 = O.getColumnIndex("table");
                int columnIndex9 = O.getColumnIndex("on_delete");
                int columnIndex10 = O.getColumnIndex("on_update");
                List h3 = v0.d.h(O);
                O.moveToPosition(-1);
                j jVar = new j();
                while (O.moveToNext()) {
                    if (O.getInt(columnIndex7) == 0) {
                        int i8 = O.getInt(columnIndex6);
                        ArrayList arrayList = new ArrayList();
                        ArrayList arrayList2 = new ArrayList();
                        int i9 = columnIndex6;
                        ArrayList arrayList3 = new ArrayList();
                        for (Object obj : h3) {
                            int i10 = columnIndex7;
                            List list = h3;
                            if (((c) obj).f9507f == i8) {
                                arrayList3.add(obj);
                            }
                            columnIndex7 = i10;
                            h3 = list;
                        }
                        int i11 = columnIndex7;
                        List list2 = h3;
                        int size = arrayList3.size();
                        int i12 = 0;
                        while (i12 < size) {
                            Object obj2 = arrayList3.get(i12);
                            i12++;
                            c cVar = (c) obj2;
                            arrayList.add(cVar.f9509h);
                            arrayList2.add(cVar.f9510i);
                            arrayList3 = arrayList3;
                        }
                        String string4 = O.getString(columnIndex8);
                        k.e(string4, "cursor.getString(tableColumnIndex)");
                        String string5 = O.getString(columnIndex9);
                        k.e(string5, "cursor.getString(onDeleteColumnIndex)");
                        String string6 = O.getString(columnIndex10);
                        k.e(string6, "cursor.getString(onUpdateColumnIndex)");
                        jVar.add(new b(string4, string5, string6, arrayList, arrayList2));
                        columnIndex6 = i9;
                        columnIndex7 = i11;
                        h3 = list2;
                    }
                }
                j k8 = m.k(jVar);
                O.close();
                O = aVar.O("PRAGMA index_list(`" + str + "`)");
                try {
                    int columnIndex11 = O.getColumnIndex("name");
                    int columnIndex12 = O.getColumnIndex("origin");
                    int columnIndex13 = O.getColumnIndex("unique");
                    j jVar2 = null;
                    if (columnIndex11 != -1 && columnIndex12 != -1 && columnIndex13 != -1) {
                        j jVar3 = new j();
                        while (true) {
                            if (!O.moveToNext()) {
                                break;
                            }
                            if ("c".equals(O.getString(columnIndex12))) {
                                String string7 = O.getString(columnIndex11);
                                boolean z9 = O.getInt(columnIndex13) == 1;
                                k.e(string7, "name");
                                d i13 = v0.d.i(aVar, string7, z9);
                                if (i13 == null) {
                                    O.close();
                                    break;
                                }
                                jVar3.add(i13);
                            }
                        }
                        return new e(str, b9, k8, jVar2);
                    }
                    O.close();
                    return new e(str, b9, k8, jVar2);
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
        if (!this.f9515a.equals(eVar.f9515a) || !this.f9516b.equals(eVar.f9516b) || !k.a(this.f9517c, eVar.f9517c)) {
            return false;
        }
        Set set2 = this.f9518d;
        if (set2 == null || (set = eVar.f9518d) == null) {
            return true;
        }
        return set2.equals(set);
    }

    public final int hashCode() {
        return this.f9517c.hashCode() + ((this.f9516b.hashCode() + (this.f9515a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "TableInfo{name='" + this.f9515a + "', columns=" + this.f9516b + ", foreignKeys=" + this.f9517c + ", indices=" + this.f9518d + '}';
    }
}
