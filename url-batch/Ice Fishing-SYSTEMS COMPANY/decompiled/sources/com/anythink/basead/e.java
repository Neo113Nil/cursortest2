package com.anythink.basead;

import android.app.Activity;
import android.content.Context;
import com.anythink.basead.b.c.i;
import com.anythink.core.common.h.w;
import com.anythink.core.common.h.x;
import com.anythink.core.common.v.q;
import com.anythink.expressad.foundation.h.k;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    private com.anythink.basead.e.a f6400a;

    public interface a {
        void a();

        void b();
    }

    public final void a(Context context, w wVar, x xVar, a aVar) {
        try {
            com.anythink.basead.e.a aVar2 = new com.anythink.basead.e.a(!(context instanceof Activity) ? c.a().d() : context, q.a(context, "myoffer_feedback_dialog", k.f19792e));
            this.f6400a = aVar2;
            aVar2.a(aVar, wVar, xVar);
            this.f6400a.show();
        } catch (Throwable th) {
            i.v("show feedback dialog error", th.getMessage() + ", " + q.a(th.getStackTrace()));
        }
    }

    public final boolean a() {
        com.anythink.basead.e.a aVar = this.f6400a;
        return aVar != null && aVar.isShowing();
    }
}
