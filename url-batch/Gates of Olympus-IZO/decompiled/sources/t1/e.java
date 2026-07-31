package t1;

import M1.v;
import N1.g;
import Z1.i;
import android.database.Cursor;
import e2.AbstractC0381e;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import v1.InterfaceC1018a;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final String f7990a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f7991b;

    /* renamed from: c, reason: collision with root package name */
    public final AbstractSet f7992c;

    /* renamed from: d, reason: collision with root package name */
    public final AbstractSet f7993d;

    public e(String str, Map map, AbstractSet abstractSet, AbstractSet abstractSet2) {
        i.f(abstractSet, "foreignKeys");
        this.f7990a = str;
        this.f7991b = map;
        this.f7992c = abstractSet;
        this.f7993d = abstractSet2;
    }

    /* JADX WARN: Finally extract failed */
    public static final e a(InterfaceC1018a interfaceC1018a, String str) {
        Map b2;
        N1.i iVar;
        N1.i iVar2;
        i.f(interfaceC1018a, "database");
        Cursor K3 = interfaceC1018a.K("PRAGMA table_info(`" + str + "`)");
        try {
            if (K3.getColumnCount() <= 0) {
                b2 = v.f2804d;
                I2.d.u(K3, null);
            } else {
                int columnIndex = K3.getColumnIndex("name");
                int columnIndex2 = K3.getColumnIndex("type");
                int columnIndex3 = K3.getColumnIndex("notnull");
                int columnIndex4 = K3.getColumnIndex("pk");
                int columnIndex5 = K3.getColumnIndex("dflt_value");
                g gVar = new g();
                while (K3.moveToNext()) {
                    String string = K3.getString(columnIndex);
                    String string2 = K3.getString(columnIndex2);
                    boolean z3 = K3.getInt(columnIndex3) != 0;
                    int i3 = K3.getInt(columnIndex4);
                    String string3 = K3.getString(columnIndex5);
                    i.e(string, "name");
                    i.e(string2, "type");
                    gVar.put(string, new C0918a(string, string2, z3, i3, string3, 2));
                }
                b2 = gVar.b();
                I2.d.u(K3, null);
            }
            K3 = interfaceC1018a.K("PRAGMA foreign_key_list(`" + str + "`)");
            try {
                int columnIndex6 = K3.getColumnIndex("id");
                int columnIndex7 = K3.getColumnIndex("seq");
                int columnIndex8 = K3.getColumnIndex("table");
                int columnIndex9 = K3.getColumnIndex("on_delete");
                int columnIndex10 = K3.getColumnIndex("on_update");
                List J3 = AbstractC0381e.J(K3);
                K3.moveToPosition(-1);
                N1.i iVar3 = new N1.i();
                while (K3.moveToNext()) {
                    if (K3.getInt(columnIndex7) == 0) {
                        int i4 = K3.getInt(columnIndex6);
                        ArrayList arrayList = new ArrayList();
                        ArrayList arrayList2 = new ArrayList();
                        int i5 = columnIndex6;
                        ArrayList arrayList3 = new ArrayList();
                        for (Object obj : J3) {
                            int i6 = columnIndex7;
                            List list = J3;
                            if (((c) obj).f7982d == i4) {
                                arrayList3.add(obj);
                            }
                            columnIndex7 = i6;
                            J3 = list;
                        }
                        int i7 = columnIndex7;
                        List list2 = J3;
                        Iterator it = arrayList3.iterator();
                        while (it.hasNext()) {
                            c cVar = (c) it.next();
                            arrayList.add(cVar.f7984f);
                            arrayList2.add(cVar.f7985g);
                        }
                        String string4 = K3.getString(columnIndex8);
                        i.e(string4, "cursor.getString(tableColumnIndex)");
                        String string5 = K3.getString(columnIndex9);
                        i.e(string5, "cursor.getString(onDeleteColumnIndex)");
                        String string6 = K3.getString(columnIndex10);
                        i.e(string6, "cursor.getString(onUpdateColumnIndex)");
                        iVar3.add(new b(string4, string5, string6, arrayList, arrayList2));
                        columnIndex6 = i5;
                        columnIndex7 = i7;
                        J3 = list2;
                        columnIndex8 = columnIndex8;
                    }
                }
                N1.i n3 = I2.d.n(iVar3);
                I2.d.u(K3, null);
                K3 = interfaceC1018a.K("PRAGMA index_list(`" + str + "`)");
                try {
                    int columnIndex11 = K3.getColumnIndex("name");
                    int columnIndex12 = K3.getColumnIndex("origin");
                    int columnIndex13 = K3.getColumnIndex("unique");
                    if (columnIndex11 == -1 || columnIndex12 == -1 || columnIndex13 == -1) {
                        iVar = null;
                        I2.d.u(K3, null);
                    } else {
                        N1.i iVar4 = new N1.i();
                        while (K3.moveToNext()) {
                            if ("c".equals(K3.getString(columnIndex12))) {
                                String string7 = K3.getString(columnIndex11);
                                boolean z4 = K3.getInt(columnIndex13) == 1;
                                i.e(string7, "name");
                                d K4 = AbstractC0381e.K(interfaceC1018a, string7, z4);
                                if (K4 == null) {
                                    I2.d.u(K3, null);
                                    iVar2 = null;
                                    break;
                                }
                                iVar4.add(K4);
                            }
                        }
                        iVar = I2.d.n(iVar4);
                        I2.d.u(K3, null);
                    }
                    iVar2 = iVar;
                    return new e(str, b2, n3, iVar2);
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
        if (!this.f7990a.equals(eVar.f7990a) || !this.f7991b.equals(eVar.f7991b) || !i.a(this.f7992c, eVar.f7992c)) {
            return false;
        }
        AbstractSet abstractSet2 = this.f7993d;
        if (abstractSet2 == null || (abstractSet = eVar.f7993d) == null) {
            return true;
        }
        return abstractSet2.equals(abstractSet);
    }

    public final int hashCode() {
        return this.f7992c.hashCode() + ((this.f7991b.hashCode() + (this.f7990a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "TableInfo{name='" + this.f7990a + "', columns=" + this.f7991b + ", foreignKeys=" + this.f7992c + ", indices=" + this.f7993d + '}';
    }
}
