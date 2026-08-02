package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;
import android.util.Base64;
import android.util.Log;
import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Map;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class awb implements kri {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ awb(Object obj, Object obj2, int i) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [cvp, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v17, types: [cvo, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v26, types: [dqy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v17, types: [java.lang.Object, krt] */
    @Override // defpackage.kri
    public final Object a() {
        int i = 5;
        char[] cArr = null;
        switch (this.c) {
            case 0:
                awp awpVar = ((awd) this.a).a;
                Object obj = this.b;
                synchronized (awpVar.b) {
                    LinkedHashSet linkedHashSet = awpVar.c;
                    if (linkedHashSet.remove(obj) && linkedHashSet.isEmpty()) {
                        awpVar.e();
                    }
                }
                return kow.a;
            case 1:
                Object obj2 = this.b;
                Object obj3 = this.a;
                synchronized (avy.b) {
                    Map map = avy.c;
                    map.remove(obj3);
                    if (map.isEmpty()) {
                        asq.a();
                        String str = awa.a;
                        ((ConnectivityManager) obj2).unregisterNetworkCallback(avy.a);
                        avy.f = null;
                        avy.d = null;
                        avy.e = false;
                    }
                }
                return kow.a;
            case 2:
                auy auyVar = (auy) this.b;
                aei.i((String) this.a, auyVar);
                aei.j(auyVar);
                return kow.a;
            case 3:
                Object obj4 = this.b;
                auy auyVar2 = (auy) obj4;
                WorkDatabase workDatabase = auyVar2.d;
                workDatabase.getClass();
                workDatabase.o(new avl(obj4, this.a, i, cArr));
                aei.j(auyVar2);
                return kow.a;
            case 4:
                return this.a.a(this.b);
            case 5:
                cwi.b(this.b, ((dvf) this.a).f);
                return kow.a;
            case 6:
                cww.l.b(this.b, new ccb(((dvi) this.a).a, 12)).getClass();
                return kow.a;
            case 7:
                cvg cvgVar = ((dvs) this.a).a;
                jkx jkxVar = cvgVar.c;
                jkxVar.getClass();
                ArrayList<cvl> arrayList = new ArrayList();
                for (Object obj5 : jkxVar) {
                    if (dqw.a(cvgVar.b, (cvl) obj5) != null) {
                        arrayList.add(obj5);
                    }
                }
                for (cvl cvlVar : arrayList) {
                    if (!cvlVar.h) {
                        Object obj6 = this.b;
                        String str2 = cvgVar.b;
                        String str3 = cvlVar.b;
                        cwd cwdVar = cwe.a;
                        cpa cpaVar = new cpa();
                        cpaVar.b = new cli[]{cvb.a};
                        cpaVar.a = new cik(str2, (Object) str3, 8);
                        cpaVar.c = 28004;
                        ((dvk) obj6).b.i(0, cpaVar.a());
                    }
                }
                return kow.a;
            case 8:
                cwe.b(this.b, ((dvk) this.a).b);
                return kow.a;
            case 9:
                cvw.b.b(this.b, new ccb(((dvq) this.a).n, i)).getClass();
                return kow.a;
            case 10:
                ((dwb) this.a).a.f((ehn) this.b);
                return kow.a;
            case 11:
                ((ekx) this.a).c.f((dja) this.b);
                return kow.a;
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                Object e = ((ggn) this.b).b().E().e(Base64.decode((String) this.a, 3));
                e.getClass();
                return e;
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                Object obj7 = this.b;
                Object obj8 = this.a;
                try {
                    jll jllVar = ((ggn) obj8).e;
                    jllVar.getClass();
                    jlk B = jllVar.B();
                    B.k(((ggk) obj7).c == 6 ? (jjq) ((ggk) obj7).d : jjq.d);
                    jll q = B.q();
                    q.getClass();
                    return q;
                } catch (RuntimeException e2) {
                    Log.e("MendelPackageState", "Failed to parse flag", e2);
                    return ((ggn) obj8).b();
                } catch (jld e3) {
                    Log.e("MendelPackageState", "Failed to parse flag", e3);
                    return ((ggn) obj8).b();
                }
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                Object obj9 = this.a;
                Object obj10 = this.b;
                try {
                    jll jllVar2 = ((ggn) obj9).e;
                    jllVar2.getClass();
                    jlk B2 = jllVar2.B();
                    B2.getClass();
                    Object a = ((ety) obj10).a();
                    if (a instanceof jjq) {
                        Object a2 = ((ety) obj10).a();
                        a2.getClass();
                        B2.k((jjq) a2);
                    } else {
                        if (!(a instanceof byte[])) {
                            Class<?> cls = ((ety) obj10).a().getClass();
                            int i2 = ksx.a;
                            throw new IllegalStateException("Invalid type " + new ksj(cls));
                        }
                        Object a3 = ((ety) obj10).a();
                        a3.getClass();
                        B2.i((byte[]) a3);
                    }
                    jll q2 = B2.q();
                    q2.getClass();
                    return q2;
                } catch (RuntimeException e4) {
                    Log.e("MendelPackageState", "Failed to parse flag", e4);
                    return ((ggn) obj9).b();
                } catch (jld e5) {
                    Log.e("MendelPackageState", "Failed to parse flag", e5);
                    return ((ggn) obj9).b();
                }
            default:
                return new idm((Context) this.b, ((idq) this.a).a);
        }
    }

    public /* synthetic */ awb(Object obj, Object obj2, int i, byte[] bArr) {
        this.c = i;
        this.b = obj;
        this.a = obj2;
    }
}
