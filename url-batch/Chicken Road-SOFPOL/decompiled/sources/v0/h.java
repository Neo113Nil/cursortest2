package v0;

import a0.g1;
import android.os.Bundle;
import androidx.lifecycle.m0;
import androidx.lifecycle.w;
import java.util.Map;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class h implements e, x4.f {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f f7443d;

    /* renamed from: e, reason: collision with root package name */
    public final x4.e f7444e;

    /* renamed from: f, reason: collision with root package name */
    public final w f7445f;

    /* renamed from: g, reason: collision with root package name */
    public final x4.e f7446g;

    public h(f fVar) {
        this.f7443d = fVar;
        x4.e eVar = new x4.e(new z4.a(this, new m0(18, this)), 1);
        this.f7444e = eVar;
        this.f7445f = new w(this, false);
        this.f7446g = (x4.e) eVar.f8656b;
        Object e8 = fVar.e("androidx.savedstate.SavedStateRegistry");
        eVar.d(e8 instanceof Bundle ? (Bundle) e8 : null);
        fVar.f("androidx.savedstate.SavedStateRegistry", new m0(16, this));
    }

    @Override // x4.f
    public final x4.e b() {
        return this.f7446g;
    }

    @Override // v0.e
    public final boolean c(Object obj) {
        return this.f7443d.c(obj);
    }

    @Override // v0.e
    public final Map d() {
        return this.f7443d.d();
    }

    @Override // v0.e
    public final Object e(String str) {
        return this.f7443d.e(str);
    }

    @Override // v0.e
    public final g1 f(String str, p6.a aVar) {
        return this.f7443d.f(str, aVar);
    }

    @Override // androidx.lifecycle.u
    public final w g() {
        return this.f7445f;
    }
}
