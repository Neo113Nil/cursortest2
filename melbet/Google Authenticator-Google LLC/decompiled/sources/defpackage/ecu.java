package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.Log;
import android.view.View;
import java.nio.charset.StandardCharsets;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ecu implements hut {
    final /* synthetic */ Object a;
    final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public ecu(ecv ecvVar, View view, int i) {
        this.c = i;
        this.a = view;
        this.b = ecvVar;
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [eer, java.lang.Object] */
    @Override // defpackage.hut
    public final void a(Throwable th) {
        int i = this.c;
        if (i == 0) {
            ((ecv) this.b).a();
            return;
        }
        if (i == 1) {
            th.getClass();
            Log.w(((dvy) this.a).c, "Failed to load avatar.", th);
            this.b.a(null);
        } else if (i != 2) {
            if (i != 3) {
                Log.e("ClientLoggingBackend", "Error while logging.", th);
                return;
            }
            ((ifb) this.a).b = true;
            ((iwr) this.b).a(kbq.c(th), new kaa());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r3v7, types: [ckb, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v3, types: [eer, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v6, types: [android.view.View$OnClickListener, java.lang.Object] */
    @Override // defpackage.hut
    public final /* synthetic */ void b(Object obj) {
        int i = this.c;
        if (i == 0) {
            if (((Boolean) obj).booleanValue()) {
                ((ecv) this.b).b.a.onClick((View) this.a);
            }
            ((ecv) this.b).a();
            return;
        }
        if (i == 1) {
            Bitmap bitmap = (Bitmap) obj;
            bitmap.getClass();
            this.b.a(bitmap);
            return;
        }
        if (i == 2) {
            ((htz) this.a).c.b.a.j((AutoCloseable) obj, this.b);
            return;
        }
        if (i == 3) {
            iws iwsVar = (iws) obj;
            try {
                Object obj2 = this.a;
                ((ifb) obj2).c = iwsVar;
                Iterator it = ((ifb) obj2).a.iterator();
                while (it.hasNext()) {
                    ((Runnable) it.next()).run();
                }
                return;
            } catch (Throwable th) {
                a(th);
                return;
            }
        }
        igs igsVar = (igs) ((kcv) this.a).c;
        String str = (String) obj;
        eru b = eru.b(((ert) igsVar.b.bB()).a(null));
        float a = b.c / b.a();
        if (a < 0.0f) {
            return;
        }
        double d = a;
        jkj C = ((jkp) this.b).C();
        if (!C.b.M()) {
            C.t();
        }
        ihj ihjVar = (ihj) C.b;
        ihjVar.b |= 2048;
        ihjVar.k = d;
        ihj ihjVar2 = (ihj) C.q();
        ikj ikjVar = igsVar.c;
        hrh hrhVar = ihjVar2.g;
        if (hrhVar == null) {
            hrhVar = hrh.a;
        }
        String str2 = hrhVar.j;
        igm igmVar = ign.a;
        int i2 = hpe.a;
        int a2 = hpl.a.b(str2, StandardCharsets.UTF_8).a();
        ?? r3 = ikjVar.b;
        Context context = (Context) ikjVar.a;
        cjf h = r3.a(context, str).h(ihjVar2, djg.a(context, new jsf()));
        h.g(a2);
        hvi d2 = dih.d(h.b());
        gzg gzgVar = new gzg(null);
        huf hufVar = huf.a;
        hvi f = hti.f(d2, gzgVar, hufVar);
        f.c(new iaq(f, 8), hufVar);
        hso.f(f, Exception.class, gvx.a(new gxw(12)), hufVar);
    }

    public ecu(eer eerVar, dvy dvyVar, int i) {
        this.c = i;
        this.b = eerVar;
        this.a = dvyVar;
    }

    public ecu(htz htzVar, Executor executor, int i) {
        this.c = i;
        this.a = htzVar;
        this.b = executor;
    }

    public ecu(Object obj, Object obj2, int i) {
        this.c = i;
        this.b = obj2;
        this.a = obj;
    }
}
