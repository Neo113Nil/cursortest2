package Z;

import android.database.Cursor;
import c0.C0301c;
import com.onesignal.inAppMessages.internal.display.impl.WebViewManager;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import e5.g;
import g4.C0472q;
import h4.C0488f;
import h4.C0491i;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.i;
import u1.AbstractC1477a;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final String f3744a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f3745b;

    /* renamed from: c, reason: collision with root package name */
    public final AbstractSet f3746c;

    /* renamed from: d, reason: collision with root package name */
    public final AbstractSet f3747d;

    public e(String str, Map map, AbstractSet foreignKeys, AbstractSet abstractSet) {
        i.e(foreignKeys, "foreignKeys");
        this.f3744a = str;
        this.f3745b = map;
        this.f3746c = foreignKeys;
        this.f3747d = abstractSet;
    }

    /* JADX WARN: Finally extract failed */
    public static final e a(C0301c c0301c, String str) {
        Map c2;
        C0491i c0491i;
        C0491i c0491i2;
        Cursor C2 = c0301c.C("PRAGMA table_info(`" + str + "`)");
        try {
            Cursor cursor = C2;
            if (cursor.getColumnCount() <= 0) {
                c2 = C0472q.f5751a;
                AbstractC1477a.e(C2, null);
            } else {
                int columnIndex = cursor.getColumnIndex("name");
                int columnIndex2 = cursor.getColumnIndex(WebViewManager.EVENT_TYPE_KEY);
                int columnIndex3 = cursor.getColumnIndex("notnull");
                int columnIndex4 = cursor.getColumnIndex("pk");
                int columnIndex5 = cursor.getColumnIndex("dflt_value");
                C0488f c0488f = new C0488f();
                while (cursor.moveToNext()) {
                    String name = cursor.getString(columnIndex);
                    String type = cursor.getString(columnIndex2);
                    boolean z = cursor.getInt(columnIndex3) != 0;
                    int i2 = cursor.getInt(columnIndex4);
                    String string = cursor.getString(columnIndex5);
                    i.d(name, "name");
                    i.d(type, "type");
                    c0488f.put(name, new a(name, type, z, i2, string, 2));
                }
                c2 = c0488f.c();
                AbstractC1477a.e(C2, null);
            }
            C2 = c0301c.C("PRAGMA foreign_key_list(`" + str + "`)");
            try {
                Cursor cursor2 = C2;
                int columnIndex6 = cursor2.getColumnIndex(OutcomeConstants.OUTCOME_ID);
                int columnIndex7 = cursor2.getColumnIndex("seq");
                int columnIndex8 = cursor2.getColumnIndex("table");
                int columnIndex9 = cursor2.getColumnIndex("on_delete");
                int columnIndex10 = cursor2.getColumnIndex("on_update");
                List u5 = g.u(cursor2);
                cursor2.moveToPosition(-1);
                C0491i c0491i3 = new C0491i();
                while (cursor2.moveToNext()) {
                    if (cursor2.getInt(columnIndex7) == 0) {
                        int i3 = cursor2.getInt(columnIndex6);
                        ArrayList arrayList = new ArrayList();
                        int i6 = columnIndex6;
                        ArrayList arrayList2 = new ArrayList();
                        int i7 = columnIndex7;
                        ArrayList arrayList3 = new ArrayList();
                        for (Object obj : u5) {
                            List list = u5;
                            Map map = c2;
                            if (((c) obj).f3736a == i3) {
                                arrayList3.add(obj);
                            }
                            u5 = list;
                            c2 = map;
                        }
                        Map map2 = c2;
                        List list2 = u5;
                        Iterator it = arrayList3.iterator();
                        while (it.hasNext()) {
                            c cVar = (c) it.next();
                            arrayList.add(cVar.f3738c);
                            arrayList2.add(cVar.f3739d);
                        }
                        String string2 = cursor2.getString(columnIndex8);
                        i.d(string2, "cursor.getString(tableColumnIndex)");
                        String string3 = cursor2.getString(columnIndex9);
                        i.d(string3, "cursor.getString(onDeleteColumnIndex)");
                        String string4 = cursor2.getString(columnIndex10);
                        i.d(string4, "cursor.getString(onUpdateColumnIndex)");
                        c0491i3.add(new b(string2, string3, string4, arrayList, arrayList2));
                        columnIndex6 = i6;
                        columnIndex7 = i7;
                        u5 = list2;
                        c2 = map2;
                        cursor2 = cursor2;
                    }
                }
                Map map3 = c2;
                C0491i e3 = g.e(c0491i3);
                AbstractC1477a.e(C2, null);
                C2 = c0301c.C("PRAGMA index_list(`" + str + "`)");
                try {
                    Cursor cursor3 = C2;
                    int columnIndex11 = cursor3.getColumnIndex("name");
                    int columnIndex12 = cursor3.getColumnIndex("origin");
                    int columnIndex13 = cursor3.getColumnIndex("unique");
                    if (columnIndex11 == -1 || columnIndex12 == -1 || columnIndex13 == -1) {
                        c0491i = null;
                        AbstractC1477a.e(C2, null);
                    } else {
                        C0491i c0491i4 = new C0491i();
                        while (cursor3.moveToNext()) {
                            if ("c".equals(cursor3.getString(columnIndex12))) {
                                String name2 = cursor3.getString(columnIndex11);
                                boolean z5 = cursor3.getInt(columnIndex13) == 1;
                                i.d(name2, "name");
                                d v4 = g.v(c0301c, name2, z5);
                                if (v4 == null) {
                                    AbstractC1477a.e(C2, null);
                                    c0491i2 = null;
                                    break;
                                }
                                c0491i4.add(v4);
                            }
                        }
                        c0491i = g.e(c0491i4);
                        AbstractC1477a.e(C2, null);
                    }
                    c0491i2 = c0491i;
                    return new e(str, map3, e3, c0491i2);
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
        if (!this.f3744a.equals(eVar.f3744a) || !this.f3745b.equals(eVar.f3745b) || !i.a(this.f3746c, eVar.f3746c)) {
            return false;
        }
        AbstractSet abstractSet2 = this.f3747d;
        if (abstractSet2 == null || (abstractSet = eVar.f3747d) == null) {
            return true;
        }
        return abstractSet2.equals(abstractSet);
    }

    public final int hashCode() {
        return this.f3746c.hashCode() + ((this.f3745b.hashCode() + (this.f3744a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "TableInfo{name='" + this.f3744a + "', columns=" + this.f3745b + ", foreignKeys=" + this.f3746c + ", indices=" + this.f3747d + '}';
    }
}
