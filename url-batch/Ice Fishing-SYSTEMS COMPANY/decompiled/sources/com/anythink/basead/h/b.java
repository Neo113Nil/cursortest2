package com.anythink.basead.h;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import com.anythink.basead.ui.MraidBannerATView;
import com.anythink.basead.ui.SdkBannerATView;
import com.anythink.core.common.h.x;
import java.util.Map;

/* loaded from: classes.dex */
public final class b extends c {

    /* renamed from: a, reason: collision with root package name */
    com.anythink.basead.g.a f9155a;

    /* renamed from: k, reason: collision with root package name */
    private final String f9156k;

    public b(Context context, x xVar, String str, boolean z8) {
        super(context, xVar, str, z8);
        this.f9156k = "b";
    }

    @Override // com.anythink.basead.h.a
    public final void a(Activity activity, Map<String, Object> map) {
    }

    public final View b() {
        if (a()) {
            return this.f9164g.n() ? new MraidBannerATView(this.f9160c, this.f9161d, this.f9164g, this.f9155a) : new SdkBannerATView(this.f9160c, this.f9161d, this.f9164g, this.f9155a);
        }
        return null;
    }

    @Override // com.anythink.basead.h.c
    public final void c() {
        this.f9155a = null;
    }

    public final void a(com.anythink.basead.g.a aVar) {
        this.f9155a = aVar;
    }
}
