package androidx.lifecycle;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import v1.InterfaceC1247d;

/* loaded from: classes.dex */
public final /* synthetic */ class I implements InterfaceC1247d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5431a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f5432b;

    public /* synthetic */ I(int i2, Object obj) {
        this.f5431a = i2;
        this.f5432b = obj;
    }

    @Override // v1.InterfaceC1247d
    public final Bundle a() {
        switch (this.f5431a) {
            case 0:
                return J.a((J) this.f5432b);
            case 1:
                b.o this$0 = (b.o) this.f5432b;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Bundle outState = new Bundle();
                b.m mVar = this$0.f5569o;
                mVar.getClass();
                Intrinsics.checkNotNullParameter(outState, "outState");
                LinkedHashMap linkedHashMap = mVar.f5551b;
                outState.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList<>(linkedHashMap.values()));
                outState.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList<>(linkedHashMap.keySet()));
                outState.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList<>(mVar.f5553d));
                outState.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", new Bundle(mVar.f5556g));
                return outState;
            default:
                Map a4 = ((P.l) this.f5432b).a();
                Bundle bundle = new Bundle();
                for (Map.Entry entry : ((LinkedHashMap) a4).entrySet()) {
                    String str = (String) entry.getKey();
                    List list = (List) entry.getValue();
                    bundle.putParcelableArrayList(str, list instanceof ArrayList ? (ArrayList) list : new ArrayList<>(list));
                }
                return bundle;
        }
    }
}
