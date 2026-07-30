package k0;

import android.os.Bundle;
import androidx.lifecycle.C0245k;
import i.C0523j;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import p.C0812b;
import p.C0813c;
import p.C0816f;

/* renamed from: k0.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0593d {

    /* renamed from: b, reason: collision with root package name */
    public boolean f6023b;

    /* renamed from: c, reason: collision with root package name */
    public Bundle f6024c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f6025d;

    /* renamed from: e, reason: collision with root package name */
    public C0523j f6026e;

    /* renamed from: a, reason: collision with root package name */
    public final C0816f f6022a = new C0816f();

    /* renamed from: f, reason: collision with root package name */
    public boolean f6027f = true;

    public final Bundle a(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        if (!this.f6025d) {
            throw new IllegalStateException("You can consumeRestoredStateForKey only after super.onCreate of corresponding component");
        }
        Bundle bundle = this.f6024c;
        if (bundle == null) {
            return null;
        }
        Bundle bundle2 = bundle.getBundle(key);
        Bundle bundle3 = this.f6024c;
        if (bundle3 != null) {
            bundle3.remove(key);
        }
        Bundle bundle4 = this.f6024c;
        if (bundle4 != null && !bundle4.isEmpty()) {
            return bundle2;
        }
        this.f6024c = null;
        return bundle2;
    }

    public final InterfaceC0592c b() {
        String str;
        InterfaceC0592c interfaceC0592c;
        Intrinsics.checkNotNullParameter("androidx.lifecycle.internal.SavedStateHandlesProvider", "key");
        Iterator it = this.f6022a.iterator();
        do {
            C0812b c0812b = (C0812b) it;
            if (!c0812b.hasNext()) {
                return null;
            }
            Map.Entry components = (Map.Entry) c0812b.next();
            Intrinsics.checkNotNullExpressionValue(components, "components");
            str = (String) components.getKey();
            interfaceC0592c = (InterfaceC0592c) components.getValue();
        } while (!Intrinsics.a(str, "androidx.lifecycle.internal.SavedStateHandlesProvider"));
        return interfaceC0592c;
    }

    public final void c(String key, InterfaceC0592c provider) {
        Object obj;
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(provider, "provider");
        C0816f c0816f = this.f6022a;
        C0813c a7 = c0816f.a(key);
        if (a7 != null) {
            obj = a7.f7141e;
        } else {
            C0813c c0813c = new C0813c(key, provider);
            c0816f.f7150l++;
            C0813c c0813c2 = c0816f.f7148e;
            if (c0813c2 == null) {
                c0816f.f7147d = c0813c;
                c0816f.f7148e = c0813c;
            } else {
                c0813c2.f7142i = c0813c;
                c0813c.f7143l = c0813c2;
                c0816f.f7148e = c0813c;
            }
            obj = null;
        }
        if (((InterfaceC0592c) obj) != null) {
            throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
        }
    }

    public final void d() {
        Intrinsics.checkNotNullParameter(C0245k.class, "clazz");
        if (!this.f6027f) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
        C0523j c0523j = this.f6026e;
        if (c0523j == null) {
            c0523j = new C0523j(this);
        }
        this.f6026e = c0523j;
        try {
            C0245k.class.getDeclaredConstructor(null);
            C0523j c0523j2 = this.f6026e;
            if (c0523j2 != null) {
                String className = C0245k.class.getName();
                Intrinsics.checkNotNullExpressionValue(className, "clazz.name");
                Intrinsics.checkNotNullParameter(className, "className");
                ((LinkedHashSet) c0523j2.f5468b).add(className);
            }
        } catch (NoSuchMethodException e7) {
            throw new IllegalArgumentException("Class " + C0245k.class.getSimpleName() + " must have default constructor in order to be automatically recreated", e7);
        }
    }
}
