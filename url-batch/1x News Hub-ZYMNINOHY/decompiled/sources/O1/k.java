package O1;

import android.os.Bundle;
import androidx.lifecycle.C0161c;
import java.util.HashMap;
import n.C1117c;
import n.C1120f;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public boolean f1180a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f1181b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f1182c;

    /* renamed from: d, reason: collision with root package name */
    public Object f1183d;

    /* renamed from: e, reason: collision with root package name */
    public Object f1184e;
    public Object f;

    public static HashMap b(byte[] bArr) {
        HashMap hashMap = new HashMap();
        hashMap.put("enabled", Boolean.TRUE);
        hashMap.put("data", bArr);
        return hashMap;
    }

    public Bundle a(String str) {
        if (!this.f1181b) {
            throw new IllegalStateException("You can consumeRestoredStateForKey only after super.onCreate of corresponding component");
        }
        Bundle bundle = (Bundle) this.f1184e;
        if (bundle == null) {
            return null;
        }
        Bundle bundle2 = bundle.getBundle(str);
        Bundle bundle3 = (Bundle) this.f1184e;
        if (bundle3 != null) {
            bundle3.remove(str);
        }
        Bundle bundle4 = (Bundle) this.f1184e;
        if (bundle4 != null && !bundle4.isEmpty()) {
            return bundle2;
        }
        this.f1184e = null;
        return bundle2;
    }

    public void c(String str, V.d provider) {
        Object obj;
        kotlin.jvm.internal.j.e(provider, "provider");
        C1120f c1120f = (C1120f) this.f1183d;
        C1117c b3 = c1120f.b(str);
        if (b3 != null) {
            obj = b3.f9975b;
        } else {
            C1117c c1117c = new C1117c(str, provider);
            c1120f.f9984d++;
            C1117c c1117c2 = c1120f.f9982b;
            if (c1117c2 == null) {
                c1120f.f9981a = c1117c;
                c1120f.f9982b = c1117c;
            } else {
                c1117c2.f9976c = c1117c;
                c1117c.f9977d = c1117c2;
                c1120f.f9982b = c1117c;
            }
            obj = null;
        }
        if (((V.d) obj) != null) {
            throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
        }
    }

    public void d() {
        if (!this.f1182c) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
        V.a aVar = (V.a) this.f;
        if (aVar == null) {
            aVar = new V.a(this);
        }
        this.f = aVar;
        try {
            C0161c.class.getDeclaredConstructor(new Class[0]);
            V.a aVar2 = (V.a) this.f;
            if (aVar2 != null) {
                aVar2.f1588a.add(C0161c.class.getName());
            }
        } catch (NoSuchMethodException e3) {
            throw new IllegalArgumentException("Class " + C0161c.class.getSimpleName() + " must have default constructor in order to be automatically recreated", e3);
        }
    }
}
