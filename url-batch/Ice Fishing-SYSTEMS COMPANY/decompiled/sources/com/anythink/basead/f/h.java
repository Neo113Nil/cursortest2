package com.anythink.basead.f;

import android.content.Context;
import android.view.ViewGroup;
import com.anythink.basead.f.c;
import com.anythink.core.common.d.t;
import com.anythink.core.common.h.x;
import com.anythink.core.common.v.am;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public class h extends c {

    /* renamed from: j, reason: collision with root package name */
    private static final String f9122j = "h";
    boolean i;

    /* renamed from: k, reason: collision with root package name */
    private final Map<String, Object> f9123k;

    public h(Context context, c.b bVar, x xVar) {
        super(context, bVar, xVar);
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        this.f9123k = concurrentHashMap;
        a(concurrentHashMap);
    }

    @Override // com.anythink.basead.f.c
    public final void b() {
        super.b();
    }

    public final boolean h() {
        return (this.f9054g != null || com.anythink.basead.b.e.b(this.f9051d, this.f9049b) || com.anythink.basead.b.e.a(this.f9051d, this.f9049b)) ? false : true;
    }

    public final void a() {
        this.i = true;
    }

    public final void a(final ViewGroup viewGroup) {
        if (c()) {
            am.a(false);
            t.b().b(new Runnable() { // from class: com.anythink.basead.f.h.1
                @Override // java.lang.Runnable
                public final void run() {
                    h hVar = h.this;
                    hVar.f9055h.a(viewGroup, hVar.f9123k, h.this.i);
                }
            });
        } else {
            com.anythink.basead.g.a aVar = this.f9052e;
            if (aVar != null) {
                aVar.onShowFailed(com.anythink.basead.d.g.a(com.anythink.basead.d.g.i, com.anythink.basead.d.g.f6306D));
            }
        }
    }
}
