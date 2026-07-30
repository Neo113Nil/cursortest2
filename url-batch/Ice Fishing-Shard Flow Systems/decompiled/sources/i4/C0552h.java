package i4;

import android.content.Context;
import h4.AbstractActivityC0488c;
import io.flutter.plugin.platform.u;
import j4.C0572a;
import java.util.ArrayList;
import java.util.List;
import m4.C0690c;

/* renamed from: i4.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0552h {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f5548a = new ArrayList();

    public C0552h(AbstractActivityC0488c abstractActivityC0488c, String[] strArr) {
        C0690c c0690c = (C0690c) D0.j.Q().f330e;
        if (c0690c.f6535b) {
            return;
        }
        c0690c.d(abstractActivityC0488c.getApplicationContext());
        c0690c.a(abstractActivityC0488c.getApplicationContext(), strArr);
    }

    public final C0547c a(C0551g c0551g) {
        C0547c c0547c;
        Context context = c0551g.f5542a;
        C0572a c0572a = c0551g.f5543b;
        String str = c0551g.f5544c;
        List<String> list = c0551g.f5545d;
        u uVar = new u();
        boolean z7 = c0551g.f5546e;
        boolean z8 = c0551g.f5547f;
        if (c0572a == null) {
            C0690c c0690c = (C0690c) D0.j.Q().f330e;
            if (!c0690c.f6535b) {
                throw new AssertionError("DartEntrypoints can only be created once a FlutterEngine is created.");
            }
            c0572a = new C0572a((String) c0690c.f6538e.f7206c, "main");
        }
        C0572a c0572a2 = c0572a;
        ArrayList arrayList = this.f5548a;
        if (arrayList.size() == 0) {
            c0547c = new C0547c(context, null, uVar, z7, z8);
            if (str != null) {
                c0547c.f5509i.f7461a.a("setInitialRoute", str, null);
            }
            c0547c.f5503c.c(c0572a2, list);
        } else {
            C0547c c0547c2 = (C0547c) arrayList.get(0);
            if (!c0547c2.f5501a.isAttached()) {
                throw new IllegalStateException("Spawn can only be called on a fully constructed FlutterEngine");
            }
            c0547c = new C0547c(context, c0547c2.f5501a.spawn(c0572a2.f5954c, c0572a2.f5953b, str, list, C0547c.f5499y), uVar, z7, z8);
        }
        arrayList.add(c0547c);
        c0547c.f5521v.add(new C0550f(this, c0547c));
        return c0547c;
    }
}
