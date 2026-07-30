package defpackage;

import android.view.View;
import com.android.installreferrer.api.InstallReferrerClient;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public class sc1 implements wn1 {
    public static sc1 b;
    public static sc1 c;
    public final /* synthetic */ int a;

    public /* synthetic */ sc1(int i) {
        this.a = i;
    }

    public static final i7 d(int i, String str) {
        WeakHashMap weakHashMap = kp1.w;
        return new i7(i, str);
    }

    public static final hm1 e(int i, String str) {
        WeakHashMap weakHashMap = kp1.w;
        return new hm1(new i90(0, 0, 0, 0), str);
    }

    public static kp1 f(View view) {
        kp1 kp1Var;
        WeakHashMap weakHashMap = kp1.w;
        synchronized (weakHashMap) {
            try {
                Object obj = weakHashMap.get(view);
                if (obj == null) {
                    obj = new kp1(view);
                    weakHashMap.put(view, obj);
                }
                kp1Var = (kp1) obj;
            } catch (Throwable th) {
                throw th;
            }
        }
        return kp1Var;
    }

    @Override // defpackage.wn1
    public tn1 a(Class cls) {
        return ca0.i(cls);
    }

    @Override // defpackage.wn1
    public tn1 b(Class cls, bn0 bn0Var) {
        return a(cls);
    }

    @Override // defpackage.wn1
    public tn1 c(yg ygVar, bn0 bn0Var) {
        Class cls = ygVar.a;
        cls.getClass();
        return b(cls, bn0Var);
    }

    public String toString() {
        switch (this.a) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return "SharingStarted.Eagerly";
            case 1:
                return "ReusedSlotId";
            default:
                return super.toString();
        }
    }
}
