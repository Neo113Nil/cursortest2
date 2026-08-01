package a1;

import android.os.Bundle;
import androidx.lifecycle.w;
import java.util.Map;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class q implements m, f5.e {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ o f47d;

    /* renamed from: e, reason: collision with root package name */
    public w f48e;

    /* renamed from: i, reason: collision with root package name */
    public c6.s f49i;

    public q(o oVar) {
        this.f47d = oVar;
        Object e2 = oVar.e("androidx.savedstate.SavedStateRegistry");
        Bundle bundle = e2 instanceof Bundle ? (Bundle) e2 : null;
        if (bundle != null && this.f49i == null) {
            c6.s sVar = new c6.s(new h5.b(this, new b(10, this)));
            this.f49i = sVar;
            sVar.g(bundle);
        }
        oVar.f("androidx.savedstate.SavedStateRegistry", new b(1, this));
    }

    @Override // f5.e
    public final c6.l b() {
        c6.s sVar = this.f49i;
        if (sVar == null) {
            c6.s sVar2 = new c6.s(new h5.b(this, new b(10, this)));
            this.f49i = sVar2;
            sVar2.g(null);
            sVar = sVar2;
        }
        return (c6.l) sVar.f1869e;
    }

    @Override // a1.m
    public final boolean c(Object obj) {
        return this.f47d.c(obj);
    }

    @Override // a1.m
    public final Map d() {
        return this.f47d.d();
    }

    @Override // a1.m
    public final Object e(String str) {
        return this.f47d.e(str);
    }

    @Override // a1.m
    public final l f(String str, Function0 function0) {
        return this.f47d.f(str, function0);
    }

    @Override // androidx.lifecycle.u
    public final w g() {
        w wVar = this.f48e;
        if (wVar != null) {
            return wVar;
        }
        w wVar2 = new w(this, false);
        this.f48e = wVar2;
        return wVar2;
    }
}
