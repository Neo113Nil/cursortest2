package T;

import android.os.Bundle;
import androidx.lifecycle.AbstractC0248o;
import androidx.lifecycle.C0255w;
import androidx.lifecycle.EnumC0246m;
import androidx.lifecycle.EnumC0247n;
import androidx.lifecycle.InterfaceC0252t;
import androidx.lifecycle.InterfaceC0253u;
import kotlin.jvm.internal.i;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final Object f2216a;

    /* renamed from: b, reason: collision with root package name */
    public final f f2217b = new f();

    /* renamed from: c, reason: collision with root package name */
    public boolean f2218c;

    public g(h hVar) {
        this.f2216a = hVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.lifecycle.u, java.lang.Object] */
    public final void a() {
        ?? r02 = this.f2216a;
        AbstractC0248o lifecycle = r02.getLifecycle();
        if (((C0255w) lifecycle).f3527d != EnumC0247n.f3512g) {
            throw new IllegalStateException("Restarter must be created only during owner's initialization stage");
        }
        lifecycle.a(new b(0, r02));
        final f fVar = this.f2217b;
        fVar.getClass();
        if (fVar.f2211b) {
            throw new IllegalStateException("SavedStateRegistry was already attached.");
        }
        lifecycle.a(new InterfaceC0252t() { // from class: T.c
            @Override // androidx.lifecycle.InterfaceC0252t
            public final void a(InterfaceC0253u interfaceC0253u, EnumC0246m enumC0246m) {
                f this$0 = f.this;
                i.e(this$0, "this$0");
                if (enumC0246m == EnumC0246m.ON_START) {
                    this$0.f2215f = true;
                } else if (enumC0246m == EnumC0246m.ON_STOP) {
                    this$0.f2215f = false;
                }
            }
        });
        fVar.f2211b = true;
        this.f2218c = true;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.u, java.lang.Object] */
    public final void b(Bundle bundle) {
        if (!this.f2218c) {
            a();
        }
        C0255w c0255w = (C0255w) this.f2216a.getLifecycle();
        if (c0255w.f3527d.compareTo(EnumC0247n.f3514i) >= 0) {
            throw new IllegalStateException(("performRestore cannot be called when owner is " + c0255w.f3527d).toString());
        }
        f fVar = this.f2217b;
        if (!fVar.f2211b) {
            throw new IllegalStateException("You must call performAttach() before calling performRestore(Bundle).");
        }
        if (fVar.f2213d) {
            throw new IllegalStateException("SavedStateRegistry was already restored.");
        }
        fVar.f2212c = bundle != null ? bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key") : null;
        fVar.f2213d = true;
    }
}
