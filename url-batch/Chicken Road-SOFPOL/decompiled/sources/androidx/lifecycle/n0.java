package androidx.lifecycle;

import android.os.Bundle;
import java.util.Arrays;
import java.util.Map;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class n0 implements x4.d {

    /* renamed from: a, reason: collision with root package name */
    public final x4.e f842a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f843b;

    /* renamed from: c, reason: collision with root package name */
    public Bundle f844c;

    /* renamed from: d, reason: collision with root package name */
    public final c6.k f845d;

    public n0(x4.e eVar, x0 x0Var) {
        q6.i.e(eVar, "savedStateRegistry");
        this.f842a = eVar;
        this.f845d = a.a.r(new m0(0, x0Var));
    }

    @Override // x4.d
    public final Bundle a() {
        Bundle j7 = h0.a.j((c6.f[]) Arrays.copyOf(new c6.f[0], 0));
        Bundle bundle = this.f844c;
        if (bundle != null) {
            j7.putAll(bundle);
        }
        for (Map.Entry entry : ((o0) this.f845d.getValue()).f846b.entrySet()) {
            String str = (String) entry.getKey();
            Bundle a8 = ((b.g) ((i0) entry.getValue()).f832b.f2978a).a();
            if (!a8.isEmpty()) {
                r2.o.f0(j7, str, a8);
            }
        }
        this.f843b = false;
        return j7;
    }

    public final void b() {
        if (this.f843b) {
            return;
        }
        Bundle a8 = this.f842a.a("androidx.lifecycle.internal.SavedStateHandlesProvider");
        Bundle j7 = h0.a.j((c6.f[]) Arrays.copyOf(new c6.f[0], 0));
        Bundle bundle = this.f844c;
        if (bundle != null) {
            j7.putAll(bundle);
        }
        if (a8 != null) {
            j7.putAll(a8);
        }
        this.f844c = j7;
        this.f843b = true;
    }
}
