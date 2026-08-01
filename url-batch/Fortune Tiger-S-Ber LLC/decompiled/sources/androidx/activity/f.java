package androidx.activity;

import android.os.Bundle;
import androidx.fragment.app.k0;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final /* synthetic */ class f implements c1.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f96a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f97b;

    public /* synthetic */ f(int i4, Object obj) {
        this.f96a = i4;
        this.f97b = obj;
    }

    @Override // c1.c
    public final Bundle a() {
        switch (this.f96a) {
            case 0:
                f.i iVar = (f.i) this.f97b;
                Bundle bundle = new Bundle();
                l lVar = iVar.f131m;
                lVar.getClass();
                LinkedHashMap linkedHashMap = lVar.f119b;
                bundle.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList<>(linkedHashMap.values()));
                bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList<>(linkedHashMap.keySet()));
                bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList<>(lVar.f120d));
                bundle.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", new Bundle(lVar.g));
                return bundle;
            case 1:
                f.i iVar2 = (f.i) this.f97b;
                while (f.i.n(((androidx.fragment.app.w) iVar2.f1605x.g).f550n)) {
                }
                iVar2.f1606y.d(androidx.lifecycle.l.ON_STOP);
                return new Bundle();
            default:
                return ((k0) this.f97b).T();
        }
    }
}
