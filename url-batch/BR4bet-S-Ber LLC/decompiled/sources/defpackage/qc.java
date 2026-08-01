package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final /* synthetic */ class qc implements l40 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ qc(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.l40
    public final Bundle a() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                Bundle bundle = new Bundle();
                uc ucVar = ((m3) obj).m;
                ucVar.getClass();
                LinkedHashMap linkedHashMap = ucVar.b;
                bundle.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList<>(linkedHashMap.values()));
                bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList<>(linkedHashMap.keySet()));
                bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList<>(ucVar.d));
                bundle.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", new Bundle(ucVar.g));
                return bundle;
            case 1:
                m3 m3Var = (m3) obj;
                while (m3.l(m3Var.k())) {
                }
                m3Var.z.d(gs.ON_STOP);
                return new Bundle();
            default:
                return ((en) obj).T();
        }
    }
}
