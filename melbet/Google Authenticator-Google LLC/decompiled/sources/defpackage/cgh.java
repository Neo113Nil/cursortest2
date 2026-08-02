package defpackage;

import android.database.Cursor;
import java.util.HashSet;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class cgh implements cgn {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ cgh(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.Map] */
    @Override // defpackage.cgn
    public final Object a(Object obj) {
        int i = this.b;
        if (i == 0) {
            Cursor cursor = (Cursor) obj;
            while (cursor.moveToNext()) {
                ?? r0 = this.a;
                Long valueOf = Long.valueOf(cursor.getLong(0));
                Set set = (Set) r0.get(valueOf);
                if (set == null) {
                    set = new HashSet();
                    r0.put(valueOf, set);
                }
                set.add(new bwg(cursor.getString(1), cursor.getString(2)));
            }
            return null;
        }
        if (i != 1) {
            Cursor cursor2 = (Cursor) obj;
            while (cursor2.moveToNext()) {
                Object obj2 = this.a;
                cgp cgpVar = (cgp) obj2;
                cgpVar.j(cursor2.getInt(0), cff.MAX_RETRIES_REACHED, cursor2.getString(1));
            }
            return null;
        }
        Cursor cursor3 = (Cursor) obj;
        while (cursor3.moveToNext()) {
            Object obj3 = this.a;
            cgp cgpVar2 = (cgp) obj3;
            cgpVar2.j(cursor3.getInt(0), cff.MESSAGE_TOO_OLD, cursor3.getString(1));
        }
        return null;
    }
}
