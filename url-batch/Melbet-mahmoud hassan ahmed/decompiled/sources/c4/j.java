package c4;

import android.app.Application;
import c4.c1;

/* loaded from: classes.dex */
final class j implements c1.a {

    /* renamed from: a, reason: collision with root package name */
    private Application f1994a;

    private j() {
    }

    /* synthetic */ j(g gVar) {
        this();
    }

    @Override // c4.c1.a
    public final /* synthetic */ c1.a a(Application application) {
        this.f1994a = (Application) w1.a(application);
        return this;
    }

    @Override // c4.c1.a
    public final c1 zza() {
        w1.c(this.f1994a, Application.class);
        return new h(this.f1994a, null);
    }
}
