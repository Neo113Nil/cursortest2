package com.anythink.core.common.u;

import android.content.Context;
import com.anythink.basead.b.c.i;
import com.anythink.core.common.h.u;
import com.anythink.core.common.m;
import com.anythink.core.common.m.d.d;
import com.anythink.core.common.m.q;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class f extends m<u> {

    /* renamed from: g, reason: collision with root package name */
    private static volatile f f16707g;

    private f(Context context) {
        super(context);
    }

    public static f a(Context context) {
        if (f16707g == null) {
            synchronized (f.class) {
                try {
                    if (f16707g == null) {
                        f16707g = new f(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f16707g;
    }

    @Override // com.anythink.core.common.m
    public final void a(List<u> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<u> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().a().toString());
        }
        com.anythink.core.d.b k6 = i.k(i.l());
        if (k6 != null) {
            if (k6.G() != 1) {
                com.anythink.core.common.m.d dVar = new com.anythink.core.common.m.d(this.f14551d, k6.G(), arrayList);
                dVar.s();
                dVar.a(0, (q) null);
                return;
            } else {
                com.anythink.core.common.m.d.a aVar = new com.anythink.core.common.m.d.a(arrayList);
                aVar.a(1, k6.F());
                aVar.a();
                aVar.a((d.a) null);
                return;
            }
        }
        com.anythink.core.common.m.d dVar2 = new com.anythink.core.common.m.d(this.f14551d, 0, arrayList);
        dVar2.s();
        dVar2.a(0, (q) null);
    }
}
