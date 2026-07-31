package z4;

import android.os.Bundle;
import androidx.lifecycle.m0;
import androidx.lifecycle.p;
import java.util.LinkedHashMap;
import p.b;
import r4.d;
import x4.f;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final f f9170a;

    /* renamed from: b, reason: collision with root package name */
    public final m0 f9171b;

    /* renamed from: e, reason: collision with root package name */
    public boolean f9174e;

    /* renamed from: f, reason: collision with root package name */
    public Bundle f9175f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f9176g;

    /* renamed from: c, reason: collision with root package name */
    public final b f9172c = new b(22);

    /* renamed from: d, reason: collision with root package name */
    public final LinkedHashMap f9173d = new LinkedHashMap();

    /* renamed from: h, reason: collision with root package name */
    public boolean f9177h = true;

    public a(f fVar, m0 m0Var) {
        this.f9170a = fVar;
        this.f9171b = m0Var;
    }

    public final void a() {
        f fVar = this.f9170a;
        if (fVar.g().f871c != p.f848e) {
            throw new IllegalStateException("Restarter must be created only during owner's initialization stage");
        }
        if (this.f9174e) {
            throw new IllegalStateException("SavedStateRegistry was already attached.");
        }
        this.f9171b.b();
        fVar.g().a(new d(1, this));
        this.f9174e = true;
    }
}
