package R;

import F.C0047j0;
import I.Y0;
import java.util.Map;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final Object f3142a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f3143b = true;

    /* renamed from: c, reason: collision with root package name */
    public final l f3144c;

    public f(i iVar, Object obj) {
        this.f3142a = obj;
        Map map = (Map) iVar.f3154a.get(obj);
        C0047j0 c0047j0 = new C0047j0(10, iVar);
        Y0 y02 = m.f3163a;
        this.f3144c = new l(map, c0047j0);
    }
}
