package androidx.savedstate;

import android.os.Bundle;
import androidx.lifecycle.e;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private final b f1362a;

    /* renamed from: b, reason: collision with root package name */
    private final SavedStateRegistry f1363b = new SavedStateRegistry();

    private a(b bVar) {
        this.f1362a = bVar;
    }

    public static a a(b bVar) {
        return new a(bVar);
    }

    public SavedStateRegistry b() {
        return this.f1363b;
    }

    public void c(Bundle bundle) {
        e a7 = this.f1362a.a();
        if (a7.b() != e.c.INITIALIZED) {
            throw new IllegalStateException("Restarter must be created only during owner's initialization stage");
        }
        a7.a(new Recreator(this.f1362a));
        this.f1363b.b(a7, bundle);
    }

    public void d(Bundle bundle) {
        this.f1363b.c(bundle);
    }
}
