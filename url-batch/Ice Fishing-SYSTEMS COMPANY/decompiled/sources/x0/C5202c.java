package x0;

import android.os.Bundle;
import androidx.lifecycle.C0503k;
import h.C4551j;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import kotlin.jvm.internal.h;
import o.C4819b;
import o.C4820c;
import o.C4823f;

/* renamed from: x0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5202c {

    /* renamed from: b, reason: collision with root package name */
    public boolean f41767b;

    /* renamed from: c, reason: collision with root package name */
    public Bundle f41768c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f41769d;

    /* renamed from: e, reason: collision with root package name */
    public C4551j f41770e;

    /* renamed from: a, reason: collision with root package name */
    public final C4823f f41766a = new C4823f();

    /* renamed from: f, reason: collision with root package name */
    public boolean f41771f = true;

    public final Bundle a(String str) {
        if (!this.f41769d) {
            throw new IllegalStateException("You can consumeRestoredStateForKey only after super.onCreate of corresponding component");
        }
        Bundle bundle = this.f41768c;
        if (bundle == null) {
            return null;
        }
        Bundle bundle2 = bundle.getBundle(str);
        Bundle bundle3 = this.f41768c;
        if (bundle3 != null) {
            bundle3.remove(str);
        }
        Bundle bundle4 = this.f41768c;
        if (bundle4 != null && !bundle4.isEmpty()) {
            return bundle2;
        }
        this.f41768c = null;
        return bundle2;
    }

    public final InterfaceC5201b b() {
        String str;
        InterfaceC5201b interfaceC5201b;
        Iterator it = this.f41766a.iterator();
        do {
            C4819b c4819b = (C4819b) it;
            if (!c4819b.hasNext()) {
                return null;
            }
            Map.Entry components = (Map.Entry) c4819b.next();
            h.d(components, "components");
            str = (String) components.getKey();
            interfaceC5201b = (InterfaceC5201b) components.getValue();
        } while (!h.a(str, "androidx.lifecycle.internal.SavedStateHandlesProvider"));
        return interfaceC5201b;
    }

    public final void c(String str, InterfaceC5201b provider) {
        Object obj;
        h.e(provider, "provider");
        C4823f c4823f = this.f41766a;
        C4820c a9 = c4823f.a(str);
        if (a9 != null) {
            obj = a9.f39664u;
        } else {
            C4820c c4820c = new C4820c(str, provider);
            c4823f.f39673w++;
            C4820c c4820c2 = c4823f.f39671u;
            if (c4820c2 == null) {
                c4823f.f39670n = c4820c;
                c4823f.f39671u = c4820c;
            } else {
                c4820c2.f39665v = c4820c;
                c4820c.f39666w = c4820c2;
                c4823f.f39671u = c4820c;
            }
            obj = null;
        }
        if (((InterfaceC5201b) obj) != null) {
            throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
        }
    }

    public final void d() {
        if (!this.f41771f) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
        C4551j c4551j = this.f41770e;
        if (c4551j == null) {
            c4551j = new C4551j(this);
        }
        this.f41770e = c4551j;
        try {
            C0503k.class.getDeclaredConstructor(new Class[0]);
            C4551j c4551j2 = this.f41770e;
            if (c4551j2 != null) {
                ((LinkedHashSet) c4551j2.f38114b).add(C0503k.class.getName());
            }
        } catch (NoSuchMethodException e6) {
            throw new IllegalArgumentException("Class " + C0503k.class.getSimpleName() + " must have default constructor in order to be automatically recreated", e6);
        }
    }
}
