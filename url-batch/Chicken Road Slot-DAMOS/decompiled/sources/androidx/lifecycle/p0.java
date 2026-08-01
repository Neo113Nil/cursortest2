package androidx.lifecycle;

import android.os.Bundle;
import java.util.Arrays;
import java.util.Map;
import kotlin.Pair;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class p0 implements f5.d {

    /* renamed from: a, reason: collision with root package name */
    public final c6.l f713a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f714b;

    /* renamed from: c, reason: collision with root package name */
    public Bundle f715c;

    /* renamed from: d, reason: collision with root package name */
    public final hd.q f716d;

    public p0(c6.l lVar, a1 a1Var) {
        lVar.getClass();
        this.f713a = lVar;
        this.f716d = hd.h.b(new a1.b(2, a1Var));
    }

    @Override // f5.d
    public final Bundle a() {
        kotlin.collections.k0.f5575d.getClass();
        Bundle h10 = z4.w.h((Pair[]) Arrays.copyOf(new Pair[0], 0));
        Bundle bundle = this.f715c;
        if (bundle != null) {
            h10.putAll(bundle);
        }
        for (Map.Entry entry : ((q0) this.f716d.getValue()).f717b.entrySet()) {
            String str = (String) entry.getKey();
            Bundle a9 = ((d.f) ((l0) entry.getValue()).f698b.f2802s).a();
            if (!a9.isEmpty()) {
                str.getClass();
                h10.putBundle(str, a9);
            }
        }
        this.f714b = false;
        return h10;
    }

    public final void b() {
        if (this.f714b) {
            return;
        }
        Bundle b10 = this.f713a.b("androidx.lifecycle.internal.SavedStateHandlesProvider");
        kotlin.collections.k0.f5575d.getClass();
        Bundle h10 = z4.w.h((Pair[]) Arrays.copyOf(new Pair[0], 0));
        Bundle bundle = this.f715c;
        if (bundle != null) {
            h10.putAll(bundle);
        }
        if (b10 != null) {
            h10.putAll(b10);
        }
        this.f715c = h10;
        this.f714b = true;
    }
}
