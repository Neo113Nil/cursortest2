package com.anythink.basead.ui.c;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.anythink.basead.ui.CountDownView;
import com.anythink.basead.ui.GuideToClickView;
import com.anythink.basead.ui.improveclick.c;
import com.anythink.basead.ui.improveclick.d;
import com.anythink.basead.ui.simpleview.SimpleCircleView;
import com.anythink.core.common.h.w;
import com.anythink.core.common.h.x;
import com.anythink.core.common.v.am;

/* loaded from: classes.dex */
public final class b extends a {

    /* renamed from: o, reason: collision with root package name */
    private GuideToClickView f10785o;

    /* renamed from: p, reason: collision with root package name */
    private SimpleCircleView f10786p;

    public b(Context context, w wVar, x xVar, c.a aVar, int i, ViewGroup viewGroup) {
        super(context, wVar, xVar, aVar, i, viewGroup);
    }

    @Override // com.anythink.basead.ui.c.a
    public final void a(ViewGroup viewGroup) {
        super.a(viewGroup);
        this.f10786p = new SimpleCircleView(this.f10767a);
        GuideToClickView guideToClickView = new GuideToClickView(this.f10767a);
        this.f10785o = guideToClickView;
        guideToClickView.hideBackground();
        viewGroup.addView(this.f10786p, -1, -1);
        viewGroup.addView(this.f10785o, -1, -1);
        b(this.f10769c.f14325o.aR());
        this.f10785o.setOnClickListener(new View.OnClickListener() { // from class: com.anythink.basead.ui.c.b.1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                b bVar = b.this;
                c.a aVar = bVar.f10771e;
                if (aVar != null) {
                    aVar.a(14, 26);
                } else {
                    bVar.d();
                }
            }
        });
        d.a aVar = this.f10774h;
        if (aVar != null) {
            aVar.a(true);
        }
    }

    @Override // com.anythink.basead.ui.c.a
    public final void d() {
        super.d();
        GuideToClickView guideToClickView = this.f10785o;
        if (guideToClickView != null) {
            am.a(guideToClickView);
        }
        SimpleCircleView simpleCircleView = this.f10786p;
        if (simpleCircleView != null) {
            am.a(simpleCircleView);
        }
        c();
        CountDownView countDownView = this.f10779n;
        if (countDownView != null) {
            countDownView.refresh(this.f10778m);
            this.f10779n.setOnClickListener(new View.OnClickListener() { // from class: com.anythink.basead.ui.c.b.2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    d.a aVar = b.this.f10774h;
                    if (aVar != null) {
                        aVar.b();
                    }
                }
            });
        }
        d.a aVar = this.f10774h;
        if (aVar != null) {
            aVar.a(false);
        }
    }
}
