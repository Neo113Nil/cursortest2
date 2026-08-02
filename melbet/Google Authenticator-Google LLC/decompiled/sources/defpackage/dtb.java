package defpackage;

import android.os.Build;
import android.os.Trace;
import android.view.View;
import java.lang.reflect.Method;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class dtb implements krt {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    private final /* synthetic */ int e;

    public /* synthetic */ dtb(asp aspVar, boolean z, String str, avi aviVar, int i) {
        this.e = i;
        this.d = aspVar;
        this.a = z;
        this.b = str;
        this.c = aviVar;
    }

    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Object, kvm] */
    @Override // defpackage.krt
    public final Object a(Object obj) {
        Object obj2;
        int i = this.e;
        if (i == 0) {
            String str = (String) obj;
            if (this.a) {
                return ixg.g(this.b, new avz((dtd) this.c, (cid) this.d, str, (kqj) null, 2));
            }
            return null;
        }
        if (i == 1) {
            Throwable th = (Throwable) obj;
            if (th instanceof ava) {
                ((asp) this.d).h(((ava) th).a);
            }
            if (this.a && (obj2 = this.b) != null) {
                int hashCode = ((avi) this.c).a.hashCode();
                if (Build.VERSION.SDK_INT >= 29) {
                    Trace.endAsyncSection(yk.i((String) obj2), hashCode);
                } else {
                    String i2 = yk.i((String) obj2);
                    try {
                        if (yk.c == null) {
                            yk.c = Trace.class.getMethod("asyncTraceEnd", Long.TYPE, String.class, Integer.TYPE);
                        }
                        Method method = yk.c;
                        if (method == null) {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        method.invoke(null, Long.valueOf(yk.a), i2, Integer.valueOf(hashCode));
                    } catch (Exception e) {
                        yk.h(e);
                    }
                }
            }
            return kow.a;
        }
        ((View) obj).getClass();
        hen henVar = new hen(4);
        boolean z = this.a;
        henVar.g("sa", String.valueOf(z));
        henVar.g("ve", String.valueOf(true != z ? 109736 : 109340));
        henVar.g("origin", "8");
        dqw dqwVar = (dqw) this.d;
        String str2 = dqwVar.c;
        if (!str2.isEmpty()) {
            henVar.g("rfn", str2);
        }
        String str3 = dqwVar.d;
        if (!str3.isEmpty()) {
            henVar.g("rfnc", str3);
        }
        String str4 = dqwVar.e;
        if (!str4.isEmpty()) {
            henVar.g("security-event-id", str4);
        }
        jkj k = iiw.a.k();
        if (!k.b.M()) {
            k.t();
        }
        int i3 = true != dqwVar.f ? 409 : 10820;
        Object obj3 = this.b;
        iiw iiwVar = (iiw) k.b;
        iiwVar.b |= 1;
        iiwVar.c = i3;
        k.G(henVar.d(true));
        iiw iiwVar2 = (iiw) k.q();
        String str5 = dqwVar.a;
        iiwVar2.getClass();
        dvk dvkVar = (dvk) obj3;
        dvkVar.c.d();
        dvkVar.d.e(dih.ag(str5, iiwVar2, gyf.a), new dtn(new dty(str5), jiv.a), 2);
        return jiv.b;
    }

    public /* synthetic */ dtb(dvk dvkVar, dqw dqwVar, boolean z, gjl gjlVar, int i) {
        this.e = i;
        this.b = dvkVar;
        this.d = dqwVar;
        this.a = z;
        this.c = gjlVar;
    }

    public /* synthetic */ dtb(boolean z, kvm kvmVar, dtd dtdVar, cid cidVar, int i) {
        this.e = i;
        this.a = z;
        this.b = kvmVar;
        this.c = dtdVar;
        this.d = cidVar;
    }
}
