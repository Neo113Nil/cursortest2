package defpackage;

import android.content.Context;
import com.google.android.apps.authenticator2.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ExecutorService;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class egt implements efx {
    private final ExecutorService a;
    private final Context b;
    private final efx c;
    private final ciq d;

    public egt(ciq ciqVar, ExecutorService executorService, Context context, efx efxVar) {
        executorService.getClass();
        this.d = ciqVar;
        this.a = executorService;
        this.b = context;
        this.c = efxVar;
    }

    private final chu g() {
        iyh iyhVar = new iyh();
        Context context = this.b;
        iyhVar.h(context.getString(R.string.og_account_not_restricted));
        iyhVar.i(hoq.f(hoq.e(context.getString(R.string.og_account_not_restricted))));
        iyhVar.g(context.getString(R.string.og_dismiss));
        return iyhVar.f();
    }

    @Override // defpackage.efx
    public final hvi a() {
        return ixl.e(kvp.g(new kwn(this.a)), new aki(this, (kqj) null, 18));
    }

    @Override // defpackage.efx
    public final hvi b() {
        return hnu.aJ(kpk.a);
    }

    @Override // defpackage.efx
    public final hvi c() {
        return this.c.c();
    }

    public final chu d() {
        iyh iyhVar = new iyh();
        Context context = this.b;
        iyhVar.h(context.getString(R.string.og_failed_to_fetch_restriction_info));
        iyhVar.i(hoq.f(hoq.e(context.getString(R.string.og_failed_to_fetch_restriction_info))));
        iyhVar.g(context.getString(R.string.og_dismiss));
        return iyhVar.f();
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x00c5, code lost:
    
        if (r8 != r1) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00ef, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0044, code lost:
    
        if (r8 != r1) goto L19;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(String str, kqj kqjVar) {
        egr egrVar;
        int i;
        List list;
        Object obj;
        chu chuVar;
        try {
            if (kqjVar instanceof egr) {
                egrVar = (egr) kqjVar;
                int i2 = egrVar.c;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    egrVar.c = i2 - Integer.MIN_VALUE;
                    Object obj2 = egrVar.a;
                    Object obj3 = kqp.a;
                    i = egrVar.c;
                    if (i != 0) {
                        ixc.Y(obj2);
                        egrVar.d = str;
                        egrVar.c = 1;
                        obj2 = f(egrVar);
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ixc.Y(obj2);
                            obj2.getClass();
                            cht chtVar = (cht) obj2;
                            return (!chtVar.a.a || (chuVar = chtVar.b) == null) ? g() : chuVar;
                        }
                        str = egrVar.d;
                        ixc.Y(obj2);
                    }
                    list = (List) obj2;
                    if (!list.isEmpty()) {
                        return g();
                    }
                    ArrayList arrayList = new ArrayList(ixc.w(list));
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((chs) it.next()).a);
                    }
                    Iterator it2 = arrayList.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            obj = null;
                            break;
                        }
                        obj = it2.next();
                        if (ksp.b(((cid) obj).c, str)) {
                            break;
                        }
                    }
                    cid cidVar = (cid) obj;
                    if (cidVar == null) {
                        return g();
                    }
                    ciq ciqVar = this.d;
                    Locale f = pk.g(this.b.getResources().getConfiguration()).f(0);
                    if (f == null) {
                        f = Locale.ENGLISH;
                        f.getClass();
                    }
                    String languageTag = f.toLanguageTag();
                    if (languageTag == null) {
                        throw new NullPointerException("Null languageTag");
                    }
                    ddi a = ciqVar.a(new chx(cidVar, languageTag));
                    egrVar.d = null;
                    egrVar.c = 2;
                    obj2 = jav.i(a, egrVar);
                }
            }
            if (i != 0) {
            }
            list = (List) obj2;
            if (!list.isEmpty()) {
            }
        } catch (Exception unused) {
            return d();
        }
        egrVar = new egr(this, kqjVar);
        Object obj22 = egrVar.a;
        Object obj32 = kqp.a;
        i = egrVar.c;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(kqj kqjVar) {
        egs egsVar;
        int i;
        List list;
        if (kqjVar instanceof egs) {
            egsVar = (egs) kqjVar;
            int i2 = egsVar.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                egsVar.c = i2 - Integer.MIN_VALUE;
                Object obj = egsVar.a;
                kqp kqpVar = kqp.a;
                i = egsVar.c;
                if (i != 0) {
                    ixc.Y(obj);
                    if (jtp.c(this.b)) {
                        ggb a = chy.a();
                        a.i("com.google");
                        a.j(true);
                        ddi b = this.d.b(a.h());
                        egsVar.c = 1;
                        obj = jav.i(b, egsVar);
                        if (obj == kqpVar) {
                            return kqpVar;
                        }
                    }
                    return kpk.a;
                }
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ixc.Y(obj);
                list = ((chz) obj).b;
                if (list != null) {
                    return ixc.p(list);
                }
                return kpk.a;
            }
        }
        egsVar = new egs(this, kqjVar);
        Object obj2 = egsVar.a;
        kqp kqpVar2 = kqp.a;
        i = egsVar.c;
        if (i != 0) {
        }
        list = ((chz) obj2).b;
        if (list != null) {
        }
        return kpk.a;
    }
}
