package defpackage;

import android.database.sqlite.SQLiteDatabase;
import java.util.HashMap;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class cfu implements cgv {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ cfu(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // defpackage.cgv
    public final Object a() {
        int i = this.b;
        if (i == 0) {
            cgp cgpVar = (cgp) this.a;
            Integer num = (Integer) cgpVar.e(new cgi(cgpVar, System.currentTimeMillis() - cgpVar.a.e, 0));
            num.intValue();
            return num;
        }
        if (i == 1) {
            int i2 = cfd.e;
            final cfc cfcVar = new cfc();
            final HashMap hashMap = new HashMap();
            final cgp cgpVar2 = (cgp) this.a;
            return (cfd) cgpVar2.e(new cgn() { // from class: cgd
                public final /* synthetic */ String b = "SELECT log_source, reason, events_dropped_count FROM log_event_dropped";

                @Override // defpackage.cgn
                public final Object a(Object obj) {
                    return (cfd) cgp.g(((SQLiteDatabase) obj).rawQuery(this.b, new String[0]), new cge(cgp.this, hashMap, cfcVar, 0));
                }
            });
        }
        if (i == 2) {
            ((cgp) ((iee) this.a).c).e(new cgg(0));
            return null;
        }
        cgg cggVar = new cgg(5);
        cfz cfzVar = (cfz) this.a;
        Iterator it = ((Iterable) ((cgp) cfzVar.b).e(cggVar)).iterator();
        while (it.hasNext()) {
            ((iyi) cfzVar.c).x((ces) it.next(), 1, false);
        }
        return null;
    }
}
