package androidx.lifecycle;

import android.os.Bundle;
import h0.C2435d;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class O implements C2435d.c {

    /* renamed from: a, reason: collision with root package name */
    private final C2435d f12592a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f12593b;

    /* renamed from: c, reason: collision with root package name */
    private Bundle f12594c;

    /* renamed from: d, reason: collision with root package name */
    private final W1.h f12595d;

    static final class a extends kotlin.jvm.internal.s implements Function0 {

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ c0 f12596i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(c0 c0Var) {
            super(0);
            this.f12596i = c0Var;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final P invoke() {
            return N.e(this.f12596i);
        }
    }

    public O(C2435d savedStateRegistry, c0 viewModelStoreOwner) {
        Intrinsics.checkNotNullParameter(savedStateRegistry, "savedStateRegistry");
        Intrinsics.checkNotNullParameter(viewModelStoreOwner, "viewModelStoreOwner");
        this.f12592a = savedStateRegistry;
        this.f12595d = W1.i.b(new a(viewModelStoreOwner));
    }

    private final P c() {
        return (P) this.f12595d.getValue();
    }

    @Override // h0.C2435d.c
    public Bundle a() {
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f12594c;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        for (Map.Entry entry : c().d().entrySet()) {
            String str = (String) entry.getKey();
            Bundle a4 = ((K) entry.getValue()).c().a();
            if (!Intrinsics.areEqual(a4, Bundle.EMPTY)) {
                bundle.putBundle(str, a4);
            }
        }
        this.f12593b = false;
        return bundle;
    }

    public final Bundle b(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        d();
        Bundle bundle = this.f12594c;
        Bundle bundle2 = bundle != null ? bundle.getBundle(key) : null;
        Bundle bundle3 = this.f12594c;
        if (bundle3 != null) {
            bundle3.remove(key);
        }
        Bundle bundle4 = this.f12594c;
        if (bundle4 != null && bundle4.isEmpty()) {
            this.f12594c = null;
        }
        return bundle2;
    }

    public final void d() {
        if (this.f12593b) {
            return;
        }
        Bundle b4 = this.f12592a.b("androidx.lifecycle.internal.SavedStateHandlesProvider");
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f12594c;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        if (b4 != null) {
            bundle.putAll(b4);
        }
        this.f12594c = bundle;
        this.f12593b = true;
        c();
    }
}
