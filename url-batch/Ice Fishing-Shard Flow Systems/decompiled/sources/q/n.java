package q;

import android.content.ComponentName;
import android.os.Bundle;
import b.C0261b;
import b.InterfaceC0263d;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final Object f7303a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC0263d f7304b;

    /* renamed from: c, reason: collision with root package name */
    public final f f7305c;

    /* renamed from: d, reason: collision with root package name */
    public final ComponentName f7306d;

    public n(InterfaceC0263d interfaceC0263d, f fVar, ComponentName componentName) {
        this.f7304b = interfaceC0263d;
        this.f7305c = fVar;
        this.f7306d = componentName;
    }

    public final Bundle a(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        if (bundle != null) {
            bundle2.putAll(bundle);
        }
        return bundle2;
    }

    public final boolean b(Bundle bundle) {
        Bundle a7 = a(bundle);
        try {
            return ((C0261b) this.f7304b).b(this.f7305c, a7);
        } catch (SecurityException e7) {
            throw new UnsupportedOperationException("This method isn't supported by the Custom Tabs implementation.", e7);
        }
    }
}
