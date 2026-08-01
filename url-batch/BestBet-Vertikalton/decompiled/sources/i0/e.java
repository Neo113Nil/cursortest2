package i0;

import Y0.t;
import Z0.f;
import Z0.i;
import android.database.Cursor;
import b1.g;
import c1.AbstractC0091d;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import l0.C0276c;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final String f3016a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f3017b;

    /* renamed from: c, reason: collision with root package name */
    public final AbstractSet f3018c;
    public final AbstractSet d;

    public e(String str, Map map, AbstractSet abstractSet, AbstractSet abstractSet2) {
        k1.e.e(abstractSet, "foreignKeys");
        this.f3016a = str;
        this.f3017b = map;
        this.f3018c = abstractSet;
        this.d = abstractSet2;
    }

    /* JADX WARN: Finally extract failed */
    public static final e a(C0276c c0276c, String str) {
        Map b2;
        i iVar;
        i iVar2;
        Cursor t2 = c0276c.t("PRAGMA table_info(`" + str + "`)");
        try {
            if (t2.getColumnCount() <= 0) {
                b2 = t.f1517a;
                g.d(t2, null);
            } else {
                int columnIndex = t2.getColumnIndex("name");
                int columnIndex2 = t2.getColumnIndex("type");
                int columnIndex3 = t2.getColumnIndex("notnull");
                int columnIndex4 = t2.getColumnIndex("pk");
                int columnIndex5 = t2.getColumnIndex("dflt_value");
                f fVar = new f();
                while (t2.moveToNext()) {
                    String string = t2.getString(columnIndex);
                    String string2 = t2.getString(columnIndex2);
                    boolean z2 = t2.getInt(columnIndex3) != 0;
                    int i = t2.getInt(columnIndex4);
                    String string3 = t2.getString(columnIndex5);
                    k1.e.d(string, "name");
                    k1.e.d(string2, "type");
                    fVar.put(string, new C0163a(string, string2, z2, i, string3, 2));
                }
                b2 = fVar.b();
                g.d(t2, null);
            }
            t2 = c0276c.t("PRAGMA foreign_key_list(`" + str + "`)");
            try {
                int columnIndex6 = t2.getColumnIndex("id");
                int columnIndex7 = t2.getColumnIndex("seq");
                int columnIndex8 = t2.getColumnIndex("table");
                int columnIndex9 = t2.getColumnIndex("on_delete");
                int columnIndex10 = t2.getColumnIndex("on_update");
                List r2 = AbstractC0091d.r(t2);
                t2.moveToPosition(-1);
                i iVar3 = new i();
                while (t2.moveToNext()) {
                    if (t2.getInt(columnIndex7) == 0) {
                        int i2 = t2.getInt(columnIndex6);
                        ArrayList arrayList = new ArrayList();
                        ArrayList arrayList2 = new ArrayList();
                        int i3 = columnIndex6;
                        ArrayList arrayList3 = new ArrayList();
                        for (Object obj : r2) {
                            int i4 = columnIndex7;
                            List list = r2;
                            if (((c) obj).f3010a == i2) {
                                arrayList3.add(obj);
                            }
                            columnIndex7 = i4;
                            r2 = list;
                        }
                        int i5 = columnIndex7;
                        List list2 = r2;
                        Iterator it = arrayList3.iterator();
                        while (it.hasNext()) {
                            c cVar = (c) it.next();
                            arrayList.add(cVar.f3012c);
                            arrayList2.add(cVar.d);
                        }
                        String string4 = t2.getString(columnIndex8);
                        k1.e.d(string4, "cursor.getString(tableColumnIndex)");
                        String string5 = t2.getString(columnIndex9);
                        k1.e.d(string5, "cursor.getString(onDeleteColumnIndex)");
                        String string6 = t2.getString(columnIndex10);
                        k1.e.d(string6, "cursor.getString(onUpdateColumnIndex)");
                        iVar3.add(new b(string4, string5, string6, arrayList, arrayList2));
                        columnIndex6 = i3;
                        columnIndex7 = i5;
                        r2 = list2;
                        columnIndex8 = columnIndex8;
                    }
                }
                i e2 = H1.d.e(iVar3);
                g.d(t2, null);
                t2 = c0276c.t("PRAGMA index_list(`" + str + "`)");
                try {
                    int columnIndex11 = t2.getColumnIndex("name");
                    int columnIndex12 = t2.getColumnIndex("origin");
                    int columnIndex13 = t2.getColumnIndex("unique");
                    if (columnIndex11 == -1 || columnIndex12 == -1 || columnIndex13 == -1) {
                        iVar = null;
                        g.d(t2, null);
                    } else {
                        i iVar4 = new i();
                        while (t2.moveToNext()) {
                            if ("c".equals(t2.getString(columnIndex12))) {
                                String string7 = t2.getString(columnIndex11);
                                boolean z3 = t2.getInt(columnIndex13) == 1;
                                k1.e.d(string7, "name");
                                d s2 = AbstractC0091d.s(c0276c, string7, z3);
                                if (s2 == null) {
                                    g.d(t2, null);
                                    iVar2 = null;
                                    break;
                                }
                                iVar4.add(s2);
                            }
                        }
                        iVar = H1.d.e(iVar4);
                        g.d(t2, null);
                    }
                    iVar2 = iVar;
                    return new e(str, b2, e2, iVar2);
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
        AbstractSet abstractSet;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        if (!this.f3016a.equals(eVar.f3016a) || !this.f3017b.equals(eVar.f3017b) || !k1.e.a(this.f3018c, eVar.f3018c)) {
            return false;
        }
        AbstractSet abstractSet2 = this.d;
        if (abstractSet2 == null || (abstractSet = eVar.d) == null) {
            return true;
        }
        return abstractSet2.equals(abstractSet);
    }

    public final int hashCode() {
        return this.f3018c.hashCode() + ((this.f3017b.hashCode() + (this.f3016a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "TableInfo{name='" + this.f3016a + "', columns=" + this.f3017b + ", foreignKeys=" + this.f3018c + ", indices=" + this.d + '}';
    }
}
