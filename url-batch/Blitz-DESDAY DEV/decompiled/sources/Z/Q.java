package Z;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import androidx.lifecycle.EnumC0069l;
import androidx.lifecycle.InterfaceC0065h;
import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public final class Q implements InterfaceC0065h, j0.f, androidx.lifecycle.P {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractComponentCallbacksC0047q f1087a;

    /* renamed from: b, reason: collision with root package name */
    public final androidx.lifecycle.O f1088b;

    /* renamed from: c, reason: collision with root package name */
    public androidx.lifecycle.t f1089c = null;
    public j0.e d = null;

    public Q(AbstractComponentCallbacksC0047q abstractComponentCallbacksC0047q, androidx.lifecycle.O o2) {
        this.f1087a = abstractComponentCallbacksC0047q;
        this.f1088b = o2;
    }

    @Override // androidx.lifecycle.InterfaceC0065h
    public final c0.c a() {
        Application application;
        AbstractComponentCallbacksC0047q abstractComponentCallbacksC0047q = this.f1087a;
        Context applicationContext = abstractComponentCallbacksC0047q.C().getApplicationContext();
        while (true) {
            if (!(applicationContext instanceof ContextWrapper)) {
                application = null;
                break;
            }
            if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
                break;
            }
            applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
        }
        c0.c cVar = new c0.c(0);
        LinkedHashMap linkedHashMap = cVar.f1719a;
        if (application != null) {
            linkedHashMap.put(androidx.lifecycle.H.d, application);
        }
        linkedHashMap.put(androidx.lifecycle.H.f1545a, this);
        linkedHashMap.put(androidx.lifecycle.H.f1546b, this);
        Bundle bundle = abstractComponentCallbacksC0047q.f1193f;
        if (bundle != null) {
            linkedHashMap.put(androidx.lifecycle.H.f1547c, bundle);
        }
        return cVar;
    }

    public final void b(EnumC0069l enumC0069l) {
        this.f1089c.d(enumC0069l);
    }

    @Override // j0.f
    public final j0.d c() {
        e();
        return this.d.f2686b;
    }

    @Override // androidx.lifecycle.P
    public final androidx.lifecycle.O d() {
        e();
        return this.f1088b;
    }

    public final void e() {
        if (this.f1089c == null) {
            this.f1089c = new androidx.lifecycle.t(this);
            j0.e eVar = new j0.e(this);
            this.d = eVar;
            eVar.a();
            androidx.lifecycle.H.d(this);
        }
    }

    @Override // androidx.lifecycle.r
    public final androidx.lifecycle.t f() {
        e();
        return this.f1089c;
    }
}
