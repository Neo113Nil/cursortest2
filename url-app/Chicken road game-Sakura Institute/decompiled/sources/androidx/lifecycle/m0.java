package androidx.lifecycle;

import android.os.Bundle;
import com.android.installreferrer.api.InstallReferrerClient;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final /* synthetic */ class m0 implements x3.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f999a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1000b;

    public /* synthetic */ m0(int i7, Object obj) {
        this.f999a = i7;
        this.f1000b = obj;
    }

    @Override // x3.d
    public final Bundle a() {
        switch (this.f999a) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return n0.a((n0) this.f1000b);
            case 1:
                b.o oVar = (b.o) this.f1000b;
                Bundle bundle = new Bundle();
                b.m mVar = oVar.f1203n;
                mVar.getClass();
                LinkedHashMap linkedHashMap = mVar.f1184b;
                bundle.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList<>(linkedHashMap.values()));
                bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList<>(linkedHashMap.keySet()));
                bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList<>(mVar.f1186d));
                bundle.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", new Bundle(mVar.f1189g));
                return bundle;
            default:
                Map c4 = ((p0.j) this.f1000b).c();
                Bundle bundle2 = new Bundle();
                for (Map.Entry entry : ((LinkedHashMap) c4).entrySet()) {
                    String str = (String) entry.getKey();
                    List list = (List) entry.getValue();
                    bundle2.putParcelableArrayList(str, list instanceof ArrayList ? (ArrayList) list : new ArrayList<>(list));
                }
                return bundle2;
        }
    }
}
