package defpackage;

import android.content.Context;
import android.util.Log;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes2.dex */
abstract class euv extends eui implements eul {
    private volatile int d;
    private bst e;

    public euv(String str, String str2, evj evjVar) {
        super(str, str2, evjVar);
        this.d = -1;
    }

    @Override // defpackage.eul
    public final int a() {
        return this.d;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0065 A[Catch: all -> 0x00e3, TryCatch #0 {, blocks: (B:10:0x0012, B:12:0x0019, B:13:0x002c, B:15:0x0036, B:17:0x0048, B:20:0x005d, B:22:0x0065, B:23:0x006b, B:25:0x0079, B:27:0x0085, B:29:0x008d, B:30:0x009e, B:43:0x00af, B:32:0x00c4, B:36:0x00cf, B:38:0x00d5, B:39:0x00db, B:46:0x00b7, B:48:0x00dd), top: B:9:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00cf A[Catch: all -> 0x00e3, TryCatch #0 {, blocks: (B:10:0x0012, B:12:0x0019, B:13:0x002c, B:15:0x0036, B:17:0x0048, B:20:0x005d, B:22:0x0065, B:23:0x006b, B:25:0x0079, B:27:0x0085, B:29:0x008d, B:30:0x009e, B:43:0x00af, B:32:0x00c4, B:36:0x00cf, B:38:0x00d5, B:39:0x00db, B:46:0x00b7, B:48:0x00dd), top: B:9:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00d5 A[Catch: all -> 0x00e3, TryCatch #0 {, blocks: (B:10:0x0012, B:12:0x0019, B:13:0x002c, B:15:0x0036, B:17:0x0048, B:20:0x005d, B:22:0x0065, B:23:0x006b, B:25:0x0079, B:27:0x0085, B:29:0x008d, B:30:0x009e, B:43:0x00af, B:32:0x00c4, B:36:0x00cf, B:38:0x00d5, B:39:0x00db, B:46:0x00b7, B:48:0x00dd), top: B:9:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00af A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // defpackage.eui
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected final Object f(etd etdVar) {
        evi eviVar;
        Object obj;
        String str;
        Object obj2;
        int a = a();
        if (a == -1 || a < i().r()) {
            synchronized (this) {
                int a2 = a();
                Object obj3 = null;
                if (a2 == -1) {
                    etd.f();
                    etdVar.getClass();
                    eviVar = this.c.a(etdVar);
                    j(eviVar.g);
                } else {
                    eviVar = null;
                }
                int r = i().r();
                if (a2 < r) {
                    etd.f();
                    etdVar.getClass();
                    Context context = etdVar.c;
                    gzp a3 = esz.a(context);
                    if (a3.f()) {
                        String e = ((bry) a3.b()).e(etb.a(this.a), null, this.b);
                        if (e != null) {
                            obj = bD(e);
                            if (eviVar == null) {
                                eviVar = this.c.a(etdVar);
                            }
                            str = eviVar.d;
                            if (!context.getPackageName().equals("com.android.vending") && !context.getPackageName().equals("com.google.android.wearable.app.cn") && !str.startsWith("com.google.android.gms.measurement#")) {
                                eos.J(etdVar.d().submit(new evb(etdVar, str, 2)));
                            }
                            obj2 = ((her) eviVar.d().d).get(this.b);
                            if (obj2 != null) {
                                try {
                                    obj3 = b(obj2);
                                } catch (IOException | ClassCastException e2) {
                                    Log.e("FilePhenotypeFlags", "Invalid Phenotype flag value for flag ".concat(this.b), e2);
                                }
                            }
                            if (true == a3.f()) {
                                obj = obj3;
                            }
                            if (obj == null) {
                                obj = e();
                            }
                            if (obj != null) {
                                g(obj);
                                h(r);
                            }
                            return obj;
                        }
                    }
                    obj = null;
                    if (eviVar == null) {
                    }
                    str = eviVar.d;
                    if (!context.getPackageName().equals("com.android.vending")) {
                        eos.J(etdVar.d().submit(new evb(etdVar, str, 2)));
                    }
                    obj2 = ((her) eviVar.d().d).get(this.b);
                    if (obj2 != null) {
                    }
                    if (true == a3.f()) {
                    }
                    if (obj == null) {
                    }
                    if (obj != null) {
                    }
                    return obj;
                }
            }
        }
        return d();
    }

    @Override // defpackage.eul
    public final void h(int i) {
        this.d = i;
    }

    @Override // defpackage.eul
    public final bst i() {
        return this.e;
    }

    @Override // defpackage.eul
    public final void j(bst bstVar) {
        this.e = bstVar;
    }
}
