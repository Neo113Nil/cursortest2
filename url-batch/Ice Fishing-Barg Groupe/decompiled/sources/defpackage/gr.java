package defpackage;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Iterator;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class gr implements fy1, p91 {
    public final p91 OPXfSBeufaJ8;
    public Throwable dgRBjINgWbAK;
    public final fy1 rtx2ld2ELZv4;
    public hu wdg6QnbFHrFF;
    public final fr x50lh2ztY7Y5;

    public gr(fy1 fy1Var) {
        r91 r91Var = new r91();
        fy1Var.getClass();
        this.rtx2ld2ELZv4 = fy1Var;
        this.OPXfSBeufaJ8 = r91Var;
        this.x50lh2ztY7Y5 = new fr(this);
    }

    public final void OPXfSBeufaJ8(StringBuilder sb) {
        int i;
        if (this.wdg6QnbFHrFF == null && this.dgRBjINgWbAK == null) {
            sb.append("\t\tStatus: Free connection");
            sb.append('\n');
        } else {
            sb.append("\t\tStatus: Acquired connection");
            sb.append('\n');
            hu huVar = this.wdg6QnbFHrFF;
            if (huVar != null) {
                sb.append("\t\tCoroutine: " + huVar);
                sb.append('\n');
            }
            Throwable th = this.dgRBjINgWbAK;
            if (th != null) {
                sb.append("\t\tAcquired:");
                sb.append('\n');
                StringWriter stringWriter = new StringWriter();
                PrintWriter printWriter = new PrintWriter(stringWriter);
                th.printStackTrace(printWriter);
                printWriter.flush();
                String stringWriter2 = stringWriter.toString();
                stringWriter2.getClass();
                Iterator it = zk.Yadk4uqlxLy8(ia2.Nlhe969cAGO8(stringWriter2)).iterator();
                while (it.hasNext()) {
                    sb.append("\t\t" + ((String) it.next()));
                    sb.append('\n');
                }
            }
        }
        if (this.x50lh2ztY7Y5 != null) {
            StringBuilder sb2 = new StringBuilder("\t\tPrepared Statement Cache Size: ");
            fr frVar = this.x50lh2ztY7Y5;
            synchronized (frVar.TSizfFm2Yiuu) {
                i = frVar.Y1f8riQaR6yg;
            }
            sb2.append(i);
            sb.append(sb2.toString());
            sb.append('\n');
        }
    }

    @Override // defpackage.fy1
    public final boolean S9EYkSpbGuxq() {
        return this.rtx2ld2ELZv4.S9EYkSpbGuxq();
    }

    @Override // defpackage.p91
    public final Object a92UlCVFR9N8(ct ctVar) {
        return this.OPXfSBeufaJ8.a92UlCVFR9N8(ctVar);
    }

    @Override // defpackage.fy1
    public final hy1 amuv7NJvPxHu(String str) {
        str.getClass();
        fr frVar = this.x50lh2ztY7Y5;
        if (frVar == null) {
            return this.rtx2ld2ELZv4.amuv7NJvPxHu(str);
        }
        Object TSizfFm2Yiuu = frVar.TSizfFm2Yiuu(str);
        TSizfFm2Yiuu.getClass();
        return new er((hy1) TSizfFm2Yiuu);
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        fr frVar = this.x50lh2ztY7Y5;
        if (frVar != null) {
            frVar.a92UlCVFR9N8(-1);
        }
        this.rtx2ld2ELZv4.close();
    }

    @Override // defpackage.p91
    public final void lS5Rgt96tfkO(Object obj) {
        this.OPXfSBeufaJ8.lS5Rgt96tfkO(null);
    }

    public final String toString() {
        return this.rtx2ld2ELZv4.toString();
    }
}
