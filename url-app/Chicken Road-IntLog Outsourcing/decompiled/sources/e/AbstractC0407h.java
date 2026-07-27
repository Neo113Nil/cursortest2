package e;

import android.content.Intent;
import android.os.Bundle;
import f.AbstractC0413a;
import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: e.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0407h {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f5507a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f5508b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f5509c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    public ArrayList f5510d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public final transient HashMap f5511e = new HashMap();

    /* renamed from: f, reason: collision with root package name */
    public final HashMap f5512f = new HashMap();

    /* renamed from: g, reason: collision with root package name */
    public final Bundle f5513g = new Bundle();

    public final boolean a(int i2, int i3, Intent intent) {
        InterfaceC0401b interfaceC0401b;
        String str = (String) this.f5507a.get(Integer.valueOf(i2));
        if (str == null) {
            return false;
        }
        C0405f c0405f = (C0405f) this.f5511e.get(str);
        if (c0405f == null || (interfaceC0401b = c0405f.f5503a) == null || !this.f5510d.contains(str)) {
            this.f5512f.remove(str);
            this.f5513g.putParcelable(str, new C0400a(i3, intent));
            return true;
        }
        interfaceC0401b.b(c0405f.f5504b.b(i3, intent));
        this.f5510d.remove(str);
        return true;
    }

    public abstract void b(int i2, AbstractC0413a abstractC0413a, C0408i c0408i);
}
