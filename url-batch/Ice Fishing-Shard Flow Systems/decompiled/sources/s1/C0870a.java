package s1;

import java.util.Arrays;
import r1.InterfaceC0843b;

/* renamed from: s1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0870a {

    /* renamed from: a, reason: collision with root package name */
    public final int f7634a;

    /* renamed from: b, reason: collision with root package name */
    public final r1.e f7635b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC0843b f7636c;

    /* renamed from: d, reason: collision with root package name */
    public final String f7637d;

    public C0870a(r1.e eVar, InterfaceC0843b interfaceC0843b, String str) {
        this.f7635b = eVar;
        this.f7636c = interfaceC0843b;
        this.f7637d = str;
        this.f7634a = Arrays.hashCode(new Object[]{eVar, interfaceC0843b, str});
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0870a)) {
            return false;
        }
        C0870a c0870a = (C0870a) obj;
        return t1.u.i(this.f7635b, c0870a.f7635b) && t1.u.i(this.f7636c, c0870a.f7636c) && t1.u.i(this.f7637d, c0870a.f7637d);
    }

    public final int hashCode() {
        return this.f7634a;
    }
}
