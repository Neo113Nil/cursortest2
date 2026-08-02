package defpackage;

import android.accounts.Account;
import android.net.Uri;
import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class bqi implements Callable {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    public /* synthetic */ bqi(atx atxVar, ArrayList arrayList, String str, int i) {
        this.d = i;
        this.a = atxVar;
        this.c = arrayList;
        this.b = str;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r0v22, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r0v9, types: [hvi, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r1v21, types: [java.lang.Object, krt] */
    /* JADX WARN: Type inference failed for: r1v8, types: [hvi, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r8v17, types: [hvi, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v28, types: [java.lang.Object, krt] */
    @Override // java.util.concurrent.Callable
    public final Object call() {
        boolean z;
        switch (this.d) {
            case 0:
                return new bqo((hel) hnu.aR(this.a), hel.o((Collection) hnu.aR(this.b)), (bpc) hnu.aR(this.c));
            case 1:
                WorkDatabase workDatabase = ((atx) this.a).e;
                String str = (String) this.b;
                ((ArrayList) this.c).addAll(workDatabase.D().a(str));
                return workDatabase.C().c(str);
            case 2:
                return (Void) dih.x(((ddw) ((haf) ((cxs) this.c).a).a).f((Uri) this.a, (Uri) this.b));
            case 3:
                ?? r0 = this.a;
                ?? r1 = this.b;
                ?? r8 = this.c;
                List list = (List) egy.g(r0, "device accounts");
                List<Account> list2 = (List) egy.g(r1, "g1 accounts");
                hel helVar = (hel) egy.g(r8, "owners");
                if (list == null && list2 == null && helVar == null) {
                    throw new egb();
                }
                ArrayList arrayList = new ArrayList();
                HashMap hashMap = new HashMap();
                if (list != null) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        dih.M(((Account) it.next()).name, arrayList, hashMap);
                    }
                    z = true;
                } else {
                    z = false;
                }
                if (list2 != null) {
                    for (Account account : list2) {
                        if (!z) {
                            dih.M(account.name, arrayList, hashMap);
                        }
                        efz efzVar = (efz) hashMap.get(account.name);
                        if (efzVar != null) {
                            efzVar.d(true);
                        }
                    }
                }
                if (helVar != null) {
                    int size = helVar.size();
                    for (int i = 0; i < size; i++) {
                        ega egaVar = (ega) helVar.get(i);
                        String str2 = egaVar.a;
                        if (!z) {
                            dih.M(str2, arrayList, hashMap);
                        }
                        efz efzVar2 = (efz) hashMap.get(str2);
                        if (efzVar2 != null) {
                            efzVar2.a = egaVar.b;
                            efzVar2.b = egaVar.c;
                            efzVar2.c = egaVar.d;
                            efzVar2.d = egaVar.e;
                            efzVar2.e = egaVar.g;
                            efzVar2.c(egaVar.h);
                        }
                    }
                }
                int i2 = hel.d;
                heg hegVar = new heg(4);
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    hegVar.h(((efz) hashMap.get((String) it2.next())).a());
                }
                return hegVar.g();
            case 4:
                ((fdf) this.a).a.execSQL((String) this.b, (Object[]) this.c);
                return null;
            case 5:
                return (Uri) this.b.a(this.c.a(this.a));
            case 6:
                return new gns((gzp) hnu.aR(this.b), her.i((Map) hnu.aR(this.c)), (gzp) this.a);
            default:
                Object obj = this.c;
                Object obj2 = this.b;
                Map map = ((idp) obj2).a;
                Object obj3 = this.a;
                synchronized (map) {
                    if (obj == null) {
                        ((idp) obj2).d((String) ((idp) obj2).e((ido) obj3).a);
                        return ((idp) obj2).f((ido) obj3);
                    }
                    iyi e = ((idp) obj2).e((ido) obj3);
                    if (!((String) e.a).equals(obj)) {
                        return e;
                    }
                    ((idp) obj2).d((String) obj);
                    return ((idp) obj2).f((ido) obj3);
                }
        }
    }

    public /* synthetic */ bqi(cxs cxsVar, Uri uri, Uri uri2, int i) {
        this.d = i;
        this.c = cxsVar;
        this.a = uri;
        this.b = uri2;
    }

    public /* synthetic */ bqi(Object obj, Object obj2, Object obj3, int i) {
        this.d = i;
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
    }

    public /* synthetic */ bqi(Object obj, Object obj2, Object obj3, int i, byte[] bArr) {
        this.d = i;
        this.b = obj;
        this.c = obj2;
        this.a = obj3;
    }
}
