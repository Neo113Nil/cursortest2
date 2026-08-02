package defpackage;

import android.database.sqlite.SQLiteDatabase;
import java.util.HashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class cgl implements cgn {
    public final /* synthetic */ cgp a;
    public final /* synthetic */ ces b;
    private final /* synthetic */ int c;

    public /* synthetic */ cgl(cgp cgpVar, ces cesVar, int i) {
        this.c = i;
        this.a = cgpVar;
        this.b = cesVar;
    }

    @Override // defpackage.cgn
    public final Object a(Object obj) {
        if (this.c != 0) {
            Long m = cgp.m((SQLiteDatabase) obj, this.b);
            if (m == null) {
                return false;
            }
            return (Boolean) cgp.g(this.a.c().rawQuery("SELECT 1 FROM events WHERE context_id = ? LIMIT 1", new String[]{m.toString()}), new cgg(2));
        }
        ces cesVar = this.b;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        cgp cgpVar = this.a;
        int i = cgpVar.a.c;
        List i2 = cgpVar.i(sQLiteDatabase, cesVar, i);
        for (ccn ccnVar : ccn.values()) {
            if (ccnVar != cesVar.c) {
                int size = i - i2.size();
                if (size <= 0) {
                    break;
                }
                i2.addAll(cgpVar.i(sQLiteDatabase, cesVar.a(ccnVar), size));
            }
        }
        HashMap hashMap = new HashMap();
        StringBuilder sb = new StringBuilder("event_id IN (");
        for (int i3 = 0; i3 < i2.size(); i3++) {
            sb.append(((cgc) i2.get(i3)).a);
            if (i3 < i2.size() - 1) {
                sb.append(',');
            }
        }
        sb.append(')');
        cgp.g(sQLiteDatabase.query("event_metadata", new String[]{"event_id", "name", "value"}, sb.toString(), null, null, null, null), new cgh(hashMap, 0));
        ListIterator listIterator = i2.listIterator();
        while (listIterator.hasNext()) {
            cgc cgcVar = (cgc) listIterator.next();
            long j = cgcVar.a;
            Long valueOf = Long.valueOf(j);
            if (hashMap.containsKey(valueOf)) {
                cen c = cgcVar.c.c();
                for (bwg bwgVar : (Set) hashMap.get(valueOf)) {
                    c.d((String) bwgVar.a, (String) bwgVar.b);
                }
                listIterator.set(new cgc(j, cgcVar.b, c.a()));
            }
        }
        return i2;
    }
}
