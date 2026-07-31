package R;

import I.X0;
import java.util.Map;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final Object f4015a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f4016b = true;

    /* renamed from: c, reason: collision with root package name */
    public final l f4017c;

    public f(i iVar, Object obj) {
        this.f4015a = obj;
        Map map = (Map) iVar.f4027a.get(obj);
        A0.l lVar = new A0.l(10, iVar);
        X0 x02 = m.f4036a;
        this.f4017c = new l(map, lVar);
    }
}
