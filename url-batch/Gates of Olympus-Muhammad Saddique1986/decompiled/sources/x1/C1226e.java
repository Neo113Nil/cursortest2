package x1;

import S1.v;
import T1.f;
import T1.h;
import android.database.Cursor;
import f2.j;
import h2.AbstractC0508a;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import n.r;

/* renamed from: x1.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1226e {

    /* renamed from: a, reason: collision with root package name */
    public final String f10316a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f10317b;

    /* renamed from: c, reason: collision with root package name */
    public final AbstractSet f10318c;

    /* renamed from: d, reason: collision with root package name */
    public final AbstractSet f10319d;

    public C1226e(String str, Map map, AbstractSet abstractSet, AbstractSet abstractSet2) {
        j.f(abstractSet, "foreignKeys");
        this.f10316a = str;
        this.f10317b = map;
        this.f10318c = abstractSet;
        this.f10319d = abstractSet2;
    }

    /* JADX WARN: Finally extract failed */
    public static final C1226e a(A1.c cVar, String str) {
        Map b3;
        h hVar;
        h hVar2;
        Cursor n3 = cVar.n("PRAGMA table_info(`" + str + "`)");
        try {
            if (n3.getColumnCount() <= 0) {
                b3 = v.f4321d;
                O2.d.t(n3, null);
            } else {
                int columnIndex = n3.getColumnIndex("name");
                int columnIndex2 = n3.getColumnIndex("type");
                int columnIndex3 = n3.getColumnIndex("notnull");
                int columnIndex4 = n3.getColumnIndex("pk");
                int columnIndex5 = n3.getColumnIndex("dflt_value");
                f fVar = new f();
                while (n3.moveToNext()) {
                    String string = n3.getString(columnIndex);
                    String string2 = n3.getString(columnIndex2);
                    boolean z3 = n3.getInt(columnIndex3) != 0;
                    int i3 = n3.getInt(columnIndex4);
                    String string3 = n3.getString(columnIndex5);
                    j.e(string, "name");
                    j.e(string2, "type");
                    fVar.put(string, new C1222a(string, string2, z3, i3, string3, 2));
                }
                b3 = fVar.b();
                O2.d.t(n3, null);
            }
            n3 = cVar.n("PRAGMA foreign_key_list(`" + str + "`)");
            try {
                int columnIndex6 = n3.getColumnIndex("id");
                int columnIndex7 = n3.getColumnIndex("seq");
                int columnIndex8 = n3.getColumnIndex("table");
                int columnIndex9 = n3.getColumnIndex("on_delete");
                int columnIndex10 = n3.getColumnIndex("on_update");
                List o3 = r.o(n3);
                n3.moveToPosition(-1);
                h hVar3 = new h();
                while (n3.moveToNext()) {
                    if (n3.getInt(columnIndex7) == 0) {
                        int i4 = n3.getInt(columnIndex6);
                        ArrayList arrayList = new ArrayList();
                        ArrayList arrayList2 = new ArrayList();
                        int i5 = columnIndex6;
                        ArrayList arrayList3 = new ArrayList();
                        for (Object obj : o3) {
                            int i6 = columnIndex7;
                            List list = o3;
                            if (((C1224c) obj).f10308d == i4) {
                                arrayList3.add(obj);
                            }
                            columnIndex7 = i6;
                            o3 = list;
                        }
                        int i7 = columnIndex7;
                        List list2 = o3;
                        Iterator it = arrayList3.iterator();
                        while (it.hasNext()) {
                            C1224c c1224c = (C1224c) it.next();
                            arrayList.add(c1224c.f10310f);
                            arrayList2.add(c1224c.f10311g);
                        }
                        String string4 = n3.getString(columnIndex8);
                        j.e(string4, "cursor.getString(tableColumnIndex)");
                        String string5 = n3.getString(columnIndex9);
                        j.e(string5, "cursor.getString(onDeleteColumnIndex)");
                        String string6 = n3.getString(columnIndex10);
                        j.e(string6, "cursor.getString(onUpdateColumnIndex)");
                        hVar3.add(new C1223b(string4, string5, string6, arrayList, arrayList2));
                        columnIndex6 = i5;
                        columnIndex7 = i7;
                        o3 = list2;
                        columnIndex8 = columnIndex8;
                    }
                }
                h q3 = AbstractC0508a.q(hVar3);
                O2.d.t(n3, null);
                n3 = cVar.n("PRAGMA index_list(`" + str + "`)");
                try {
                    int columnIndex11 = n3.getColumnIndex("name");
                    int columnIndex12 = n3.getColumnIndex("origin");
                    int columnIndex13 = n3.getColumnIndex("unique");
                    if (columnIndex11 == -1 || columnIndex12 == -1 || columnIndex13 == -1) {
                        hVar = null;
                        O2.d.t(n3, null);
                    } else {
                        h hVar4 = new h();
                        while (n3.moveToNext()) {
                            if ("c".equals(n3.getString(columnIndex12))) {
                                String string7 = n3.getString(columnIndex11);
                                boolean z4 = n3.getInt(columnIndex13) == 1;
                                j.e(string7, "name");
                                C1225d p3 = r.p(cVar, string7, z4);
                                if (p3 == null) {
                                    O2.d.t(n3, null);
                                    hVar2 = null;
                                    break;
                                }
                                hVar4.add(p3);
                            }
                        }
                        hVar = AbstractC0508a.q(hVar4);
                        O2.d.t(n3, null);
                    }
                    hVar2 = hVar;
                    return new C1226e(str, b3, q3, hVar2);
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
        if (!(obj instanceof C1226e)) {
            return false;
        }
        C1226e c1226e = (C1226e) obj;
        if (!this.f10316a.equals(c1226e.f10316a) || !this.f10317b.equals(c1226e.f10317b) || !j.a(this.f10318c, c1226e.f10318c)) {
            return false;
        }
        AbstractSet abstractSet2 = this.f10319d;
        if (abstractSet2 == null || (abstractSet = c1226e.f10319d) == null) {
            return true;
        }
        return abstractSet2.equals(abstractSet);
    }

    public final int hashCode() {
        return this.f10318c.hashCode() + ((this.f10317b.hashCode() + (this.f10316a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "TableInfo{name='" + this.f10316a + "', columns=" + this.f10317b + ", foreignKeys=" + this.f10318c + ", indices=" + this.f10319d + '}';
    }
}
