package defpackage;

import android.os.Bundle;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class bn implements amd {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public bn(di diVar, int i) {
        this.b = i;
        this.a = diVar;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r5v17, types: [java.lang.Object, java.util.Map] */
    @Override // defpackage.amd
    public final Bundle a() {
        kol[] kolVarArr;
        switch (this.b) {
            case 0:
                return ((by) this.a).a();
            case 1:
                bg bgVar = (bg) this.a;
                bgVar.d();
                bgVar.d.b(aej.ON_STOP);
                return new Bundle();
            case 2:
                Bundle bundle = new Bundle();
                ((di) this.a).i();
                return bundle;
            case 3:
                Bundle bundle2 = new Bundle();
                oh ohVar = ((ng) this.a).g;
                Map map = ohVar.b;
                bundle2.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList<>(map.values()));
                bundle2.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList<>(map.keySet()));
                bundle2.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList<>(ohVar.c));
                bundle2.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", new Bundle(ohVar.f));
                return bundle2;
            case 4:
                ldt ldtVar = (ldt) this.a;
                for (Map.Entry entry : ixd.t(ldtVar.d).entrySet()) {
                    ldtVar.s((String) entry.getKey(), ((lao) entry.getValue()).b());
                }
                for (Map.Entry entry2 : ixd.t(ldtVar.c).entrySet()) {
                    ldtVar.s((String) entry2.getKey(), ((amd) entry2.getValue()).a());
                }
                ?? r5 = ldtVar.a;
                if (r5.isEmpty()) {
                    kolVarArr = new kol[0];
                } else {
                    ArrayList arrayList = new ArrayList(r5.size());
                    for (Map.Entry entry3 : r5.entrySet()) {
                        arrayList.add(new kol((String) entry3.getKey(), entry3.getValue()));
                    }
                    kolVarArr = (kol[]) arrayList.toArray(new kol[0]);
                }
                return pk.h((kol[]) Arrays.copyOf(kolVarArr, kolVarArr.length));
            case 5:
                Bundle bundle3 = new Bundle();
                ftz ftzVar = (ftz) this.a;
                bundle3.putBundle("state_account_state_bundle", ftzVar.a.a());
                bundle3.putBoolean("tiktok_accounts_disabled", ftzVar.b);
                return bundle3;
            case 6:
                Bundle bundle4 = new Bundle();
                fuc fucVar = (fuc) this.a;
                fucVar.a.f(bundle4);
                ftp ftpVar = fucVar.b;
                if (ftpVar != null) {
                    bundle4.putInt("KSCH$AC$callbacks_id", ftpVar.a);
                    bundle4.putInt("KSCH$AC$callbacks_state", ftpVar.b);
                }
                return bundle4;
            case 7:
                Bundle bundle5 = new Bundle();
                bundle5.putParcelable("active_account_id", ((fyx) this.a).f);
                return bundle5;
            default:
                Bundle bundle6 = new Bundle();
                gbn gbnVar = (gbn) this.a;
                Set set = gbnVar.c;
                bundle6.putParcelableArray("future_wrappers", (Parcelable[]) set.toArray(new gbp[set.size()]));
                bundle6.putInt("last_process_id", gbnVar.d);
                gbnVar.b.f(bundle6);
                return bundle6;
        }
    }

    public /* synthetic */ bn(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }
}
