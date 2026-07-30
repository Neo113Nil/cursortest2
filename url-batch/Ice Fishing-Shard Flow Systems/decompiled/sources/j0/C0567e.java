package j0;

import S5.i;
import S5.n;
import android.database.Cursor;
import com.onesignal.inAppMessages.internal.display.impl.m;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.I;
import kotlin.collections.L;
import kotlin.jvm.internal.Intrinsics;
import m0.C0684c;

/* renamed from: j0.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0567e {

    /* renamed from: a, reason: collision with root package name */
    public final String f5944a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f5945b;

    /* renamed from: c, reason: collision with root package name */
    public final Set f5946c;

    /* renamed from: d, reason: collision with root package name */
    public final Set f5947d;

    public C0567e(String name, Map columns, AbstractSet foreignKeys, AbstractSet abstractSet) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(columns, "columns");
        Intrinsics.checkNotNullParameter(foreignKeys, "foreignKeys");
        this.f5944a = name;
        this.f5945b = columns;
        this.f5946c = foreignKeys;
        this.f5947d = abstractSet;
    }

    /* JADX WARN: Code restructure failed: missing block: B:69:0x01f4, code lost:
    
        r9 = kotlin.collections.L.a(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x01f8, code lost:
    
        r3.close();
     */
    /* JADX WARN: Finally extract failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final C0567e a(C0684c database, String tableName) {
        Map b7;
        Intrinsics.checkNotNullParameter(database, "database");
        Intrinsics.checkNotNullParameter(tableName, "tableName");
        Intrinsics.checkNotNullParameter(database, "database");
        Intrinsics.checkNotNullParameter(tableName, "tableName");
        Cursor E7 = database.E("PRAGMA table_info(`" + tableName + "`)");
        try {
            if (E7.getColumnCount() <= 0) {
                b7 = I.c();
                E7.close();
            } else {
                int columnIndex = E7.getColumnIndex("name");
                int columnIndex2 = E7.getColumnIndex(m.EVENT_TYPE_KEY);
                int columnIndex3 = E7.getColumnIndex("notnull");
                int columnIndex4 = E7.getColumnIndex("pk");
                int columnIndex5 = E7.getColumnIndex("dflt_value");
                i builder = new i();
                while (E7.moveToNext()) {
                    String name = E7.getString(columnIndex);
                    String type = E7.getString(columnIndex2);
                    boolean z7 = E7.getInt(columnIndex3) != 0;
                    int i2 = E7.getInt(columnIndex4);
                    String string = E7.getString(columnIndex5);
                    Intrinsics.checkNotNullExpressionValue(name, "name");
                    Intrinsics.checkNotNullExpressionValue(type, "type");
                    builder.put(name, new C0563a(name, type, z7, i2, string, 2));
                }
                Intrinsics.checkNotNullParameter(builder, "builder");
                b7 = builder.b();
                E7.close();
            }
            E7 = database.E("PRAGMA foreign_key_list(`" + tableName + "`)");
            try {
                int columnIndex6 = E7.getColumnIndex("id");
                int columnIndex7 = E7.getColumnIndex("seq");
                int columnIndex8 = E7.getColumnIndex("table");
                int columnIndex9 = E7.getColumnIndex("on_delete");
                int columnIndex10 = E7.getColumnIndex("on_update");
                List E8 = d4.c.E(E7);
                E7.moveToPosition(-1);
                n nVar = new n();
                while (E7.moveToNext()) {
                    if (E7.getInt(columnIndex7) == 0) {
                        int i5 = E7.getInt(columnIndex6);
                        ArrayList arrayList = new ArrayList();
                        ArrayList arrayList2 = new ArrayList();
                        int i7 = columnIndex6;
                        ArrayList arrayList3 = new ArrayList();
                        for (Object obj : E8) {
                            int i8 = columnIndex7;
                            List list = E8;
                            if (((C0565c) obj).f5936d == i5) {
                                arrayList3.add(obj);
                            }
                            columnIndex7 = i8;
                            E8 = list;
                        }
                        int i9 = columnIndex7;
                        List list2 = E8;
                        int size = arrayList3.size();
                        int i10 = 0;
                        while (i10 < size) {
                            Object obj2 = arrayList3.get(i10);
                            i10++;
                            C0565c c0565c = (C0565c) obj2;
                            arrayList.add(c0565c.f5938i);
                            arrayList2.add(c0565c.f5939l);
                            arrayList3 = arrayList3;
                        }
                        String string2 = E7.getString(columnIndex8);
                        Intrinsics.checkNotNullExpressionValue(string2, "cursor.getString(tableColumnIndex)");
                        String string3 = E7.getString(columnIndex9);
                        Intrinsics.checkNotNullExpressionValue(string3, "cursor.getString(onDeleteColumnIndex)");
                        String string4 = E7.getString(columnIndex10);
                        Intrinsics.checkNotNullExpressionValue(string4, "cursor.getString(onUpdateColumnIndex)");
                        nVar.add(new C0564b(string2, string3, string4, arrayList, arrayList2));
                        columnIndex6 = i7;
                        columnIndex7 = i9;
                        E8 = list2;
                    }
                }
                n a7 = L.a(nVar);
                E7.close();
                E7 = database.E("PRAGMA index_list(`" + tableName + "`)");
                try {
                    int columnIndex11 = E7.getColumnIndex("name");
                    int columnIndex12 = E7.getColumnIndex("origin");
                    int columnIndex13 = E7.getColumnIndex("unique");
                    n nVar2 = null;
                    if (columnIndex11 != -1 && columnIndex12 != -1 && columnIndex13 != -1) {
                        n nVar3 = new n();
                        while (true) {
                            if (!E7.moveToNext()) {
                                break;
                            }
                            if ("c".equals(E7.getString(columnIndex12))) {
                                String name2 = E7.getString(columnIndex11);
                                boolean z8 = E7.getInt(columnIndex13) == 1;
                                Intrinsics.checkNotNullExpressionValue(name2, "name");
                                C0566d F4 = d4.c.F(database, name2, z8);
                                if (F4 == null) {
                                    E7.close();
                                    break;
                                }
                                nVar3.add(F4);
                            }
                        }
                        return new C0567e(tableName, b7, a7, nVar2);
                    }
                    E7.close();
                    return new C0567e(tableName, b7, a7, nVar2);
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
        if (!(obj instanceof C0567e)) {
            return false;
        }
        C0567e c0567e = (C0567e) obj;
        if (!this.f5944a.equals(c0567e.f5944a) || !this.f5945b.equals(c0567e.f5945b) || !Intrinsics.a(this.f5946c, c0567e.f5946c)) {
            return false;
        }
        Set set2 = this.f5947d;
        if (set2 == null || (set = c0567e.f5947d) == null) {
            return true;
        }
        return set2.equals(set);
    }

    public final int hashCode() {
        return this.f5946c.hashCode() + ((this.f5945b.hashCode() + (this.f5944a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "TableInfo{name='" + this.f5944a + "', columns=" + this.f5945b + ", foreignKeys=" + this.f5946c + ", indices=" + this.f5947d + '}';
    }
}
