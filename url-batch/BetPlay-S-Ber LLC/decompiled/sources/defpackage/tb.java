package defpackage;

import android.os.Bundle;
import androidx.fragment.app.k;
import androidx.fragment.app.n;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final /* synthetic */ class tb implements u10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ tb(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.u10
    public final Bundle a() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                Bundle bundle = new Bundle();
                yb ybVar = ((k) obj).m;
                ybVar.getClass();
                LinkedHashMap linkedHashMap = ybVar.b;
                bundle.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList<>(linkedHashMap.values()));
                bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList<>(linkedHashMap.keySet()));
                bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList<>(ybVar.d));
                bundle.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", new Bundle(ybVar.g));
                return bundle;
            case 1:
                r3 r3Var = (r3) obj;
                while (k.p(((kk) r3Var.z.g).i)) {
                }
                r3Var.A.e(gq.ON_STOP);
                return new Bundle();
            case 2:
                return ((n) obj).S();
            default:
                return q10.a((q10) obj);
        }
    }
}
