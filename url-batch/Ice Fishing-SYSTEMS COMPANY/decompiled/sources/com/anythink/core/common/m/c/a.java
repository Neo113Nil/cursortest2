package com.anythink.core.common.m.c;

import android.content.Context;
import android.text.TextUtils;
import com.anythink.core.common.v.af;
import java.util.Map;

/* loaded from: classes.dex */
public class a extends d {
    public a(Context context) {
        super(context);
    }

    @Override // com.anythink.core.common.m.c.d, com.anythink.core.common.m.c.i
    public final com.anythink.core.common.m.b.f a(com.anythink.core.common.m.b.d dVar) {
        if (!b(dVar)) {
            return null;
        }
        com.anythink.core.common.m.b.f a9 = super.a(dVar);
        if (a9 != null && a9.e()) {
            a9.b(com.anythink.core.common.m.a.f14557m);
        }
        return a9;
    }

    @Override // com.anythink.core.common.m.c.d
    public final boolean b(com.anythink.core.common.m.b.d dVar) {
        if (this.f14699b != null && dVar != null) {
            String b9 = dVar.b();
            String a9 = dVar.a();
            if ((com.anythink.core.common.m.b.g.f14676b.equals(b9) || com.anythink.core.common.m.b.g.f14675a.equals(b9) || com.anythink.core.common.m.b.g.f14679e.equals(b9)) && !TextUtils.isEmpty(a9)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.anythink.core.common.m.c.i
    public final void a(com.anythink.core.common.m.b.f fVar, com.anythink.core.common.m.b.d dVar) {
        if (!b(dVar) || fVar == null) {
            return;
        }
        int c4 = fVar.c();
        String b9 = fVar.b();
        long d2 = fVar.d();
        if (c4 != 699 || d2 <= 0) {
            return;
        }
        synchronized (this.f14701d) {
            try {
                Map<String, Long> map = this.f14700c;
                if (map != null) {
                    map.put(b9, Long.valueOf(d2));
                }
                af.a(this.f14699b, "anythink_app_pl_cl_retry", b9, d2);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void a(String str, long j9) {
        Map<String, Long> map = this.f14700c;
        if (map != null) {
            map.put(str, Long.valueOf(j9));
        }
        af.a(this.f14699b, "anythink_app_pl_cl_retry", str, j9);
    }
}
