package defpackage;

import com.android.installreferrer.api.InstallReferrerClient;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class mf implements Runnable {
    public final /* synthetic */ int d;
    public final int e;
    public final Object g;

    public mf(List list, int i, Throwable th) {
        this.d = 2;
        ka0.l(list, "initCallbacks cannot be null");
        this.g = new ArrayList(list);
        this.e = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.d;
        int i2 = this.e;
        Object obj = this.g;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                break;
            case 1:
                rj rjVar = (rj) obj;
                Boolean bool = Boolean.TRUE;
                String str = (String) rjVar.a.get(Integer.valueOf(i2));
                if (str != null) {
                    l2 l2Var = (l2) rjVar.e.get(str);
                    if (l2Var == null) {
                        rjVar.g.remove(str);
                        rjVar.f.put(str, bool);
                        break;
                    } else {
                        m2 m2Var = l2Var.a;
                        if (rjVar.d.remove(str)) {
                            ((Function1) ((ao0) m2Var.e).getValue()).invoke(bool);
                            break;
                        }
                    }
                }
                break;
            case 2:
                ArrayList arrayList = (ArrayList) obj;
                int size = arrayList.size();
                int i3 = 0;
                if (i2 == 1) {
                    while (i3 < size) {
                        eq eqVar = (eq) arrayList.get(i3);
                        eqVar.a.setValue(Boolean.TRUE);
                        eqVar.b.e = new k70(true);
                        i3++;
                    }
                    break;
                } else {
                    while (i3 < size) {
                        ((eq) arrayList.get(i3)).b.e = mo.g;
                        i3++;
                    }
                    break;
                }
            default:
                ((es1) obj).i(i2);
                break;
        }
    }

    public mf(rj rjVar, int i, j41 j41Var) {
        this.d = 1;
        this.g = rjVar;
        this.e = i;
    }

    public /* synthetic */ mf(int i, int i2, Object obj) {
        this.d = i2;
        this.g = obj;
        this.e = i;
    }
}
