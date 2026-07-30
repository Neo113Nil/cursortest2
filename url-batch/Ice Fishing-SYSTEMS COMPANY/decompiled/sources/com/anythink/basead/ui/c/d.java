package com.anythink.basead.ui.c;

import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.anythink.basead.b.b.j;
import com.anythink.basead.ui.CountDownView;
import com.anythink.basead.ui.component.emdcardimprove.SecondEndCardView;
import com.anythink.basead.ui.f.b;
import com.anythink.basead.ui.improveclick.c;
import com.anythink.basead.ui.improveclick.d;
import com.anythink.core.common.h.w;
import com.anythink.core.common.h.x;
import com.anythink.core.common.v.am;
import com.anythink.core.common.v.q;
import com.anythink.expressad.foundation.h.k;

/* loaded from: classes.dex */
public final class d extends a {

    /* renamed from: o, reason: collision with root package name */
    SecondEndCardView f10796o;

    /* renamed from: p, reason: collision with root package name */
    com.anythink.basead.ui.f.a f10797p;

    /* renamed from: q, reason: collision with root package name */
    int f10798q;

    /* renamed from: r, reason: collision with root package name */
    boolean f10799r;

    /* renamed from: s, reason: collision with root package name */
    boolean f10800s;

    /* renamed from: t, reason: collision with root package name */
    private View f10801t;

    public d(Context context, w wVar, x xVar, c.a aVar, int i, ViewGroup viewGroup) {
        super(context, wVar, xVar, aVar, i, viewGroup);
        this.f10798q = 1;
    }

    @Override // com.anythink.basead.ui.c.a
    public final void d() {
        super.d();
        this.f10800s = true;
    }

    @Override // com.anythink.basead.ui.c.a
    public final View f() {
        return this.f10801t;
    }

    @Override // com.anythink.basead.ui.c.a
    public final void a(final ViewGroup viewGroup) {
        super.a(viewGroup);
        this.f10801t = this.f10773g;
        this.f10798q = this.f10769c.f14325o.aY();
        SecondEndCardView secondEndCardView = new SecondEndCardView(this.f10767a);
        this.f10796o = secondEndCardView;
        secondEndCardView.setAdTitle(this.f10768b.x());
        this.f10796o.setAdDesc(this.f10768b.y());
        if (TextUtils.isEmpty(this.f10768b.z())) {
            this.f10796o.setAdIcon(this.f10768b.B());
        } else {
            this.f10796o.setAdIcon(this.f10768b.z());
        }
        if (TextUtils.isEmpty(this.f10768b.D())) {
            SecondEndCardView secondEndCardView2 = this.f10796o;
            Context context = this.f10767a;
            secondEndCardView2.setCTAText(context.getString(com.anythink.basead.b.e.a(context, this.f10768b)));
        } else {
            this.f10796o.setCTAText(this.f10768b.D());
        }
        boolean z8 = this.f10772f != 1;
        this.f10799r = z8;
        this.f10796o.addApkComplianceElements(!z8);
        if (!this.f10799r) {
            this.f10796o.setBackgroundColor(Color.parseColor("#CC000000"));
        }
        d.a aVar = this.f10774h;
        View c4 = aVar != null ? aVar.c() : null;
        if (c4 == null) {
            c4 = b();
        }
        if (c4 != null) {
            if ((c4 instanceof TextView) && TextUtils.isEmpty(this.f10769c.f14325o.bm())) {
                ((TextView) c4).setText(q.a(this.f10767a, "myoffer_sub_close_default_skip_text", k.f19794g));
            }
            if (c4 instanceof ImageView) {
                c4.setBackgroundResource(q.a(this.f10767a, "myoffer_base_skip_icon", k.f19790c));
            }
            c4.setOnClickListener(new View.OnClickListener() { // from class: com.anythink.basead.ui.c.d.1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    CountDownView countDownView;
                    d.a aVar2 = d.this.f10774h;
                    if (aVar2 != null) {
                        aVar2.a(true);
                    }
                    SecondEndCardView secondEndCardView3 = d.this.f10796o;
                    if (secondEndCardView3 != null && secondEndCardView3.getParent() == null) {
                        d dVar = d.this;
                        if (dVar.f10799r) {
                            ViewGroup viewGroup2 = dVar.f10773g;
                            if (viewGroup2 != null) {
                                viewGroup2.setVisibility(4);
                                if (d.this.f10773g.getParent() instanceof ViewGroup) {
                                    ((ViewGroup) d.this.f10773g.getParent()).addView(d.this.f10796o, -1, -1);
                                }
                            }
                        } else {
                            viewGroup.addView(dVar.f10796o, -1, -1);
                        }
                        d dVar2 = d.this;
                        dVar2.f10801t = dVar2.f10796o;
                        d dVar3 = d.this;
                        dVar3.f10797p = new com.anythink.basead.ui.f.a(dVar3.f10768b, dVar3.f10769c);
                        d dVar4 = d.this;
                        dVar4.f10797p.b(dVar4.f10796o);
                        d.this.f10796o.setSecondECClickListener(new b.a() { // from class: com.anythink.basead.ui.c.d.1.1
                            @Override // com.anythink.basead.ui.f.b.a
                            public final void a(int i, int i4) {
                                switch (i4) {
                                    case 36:
                                        break;
                                    case 37:
                                        if (d.this.f10798q < 2) {
                                            return;
                                        }
                                        break;
                                    case j.f5963M /* 38 */:
                                        if (d.this.f10798q < 3) {
                                            return;
                                        }
                                        break;
                                    default:
                                        return;
                                }
                                c.a aVar3 = d.this.f10771e;
                                if (aVar3 != null) {
                                    aVar3.a(i, i4);
                                }
                            }
                        });
                    }
                    d dVar5 = d.this;
                    dVar5.b(dVar5.f10769c.f14325o.ba());
                    d dVar6 = d.this;
                    if (dVar6.f10799r && (countDownView = dVar6.f10779n) != null) {
                        am.a(countDownView);
                        ViewGroup.LayoutParams layoutParams = d.this.f10779n.getLayoutParams();
                        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(layoutParams.width, layoutParams.height);
                        layoutParams2.addRule(11);
                        layoutParams2.setMargins(0, q.a(d.this.f10767a, 8.0f), q.a(d.this.f10767a, 8.0f), 0);
                        d dVar7 = d.this;
                        dVar7.f10796o.addCloseView(dVar7.f10779n, layoutParams2);
                    }
                    d.this.a(true);
                }
            });
        }
        this.f10800s = false;
    }

    @Override // com.anythink.basead.ui.c.a
    public final void a(long j9) {
        super.a(j9);
        if (this.f10777l >= this.f10778m) {
            com.anythink.basead.ui.f.b.a(this.f10779n, true, this.f10769c, false);
            this.f10779n.setOnClickListener(new View.OnClickListener() { // from class: com.anythink.basead.ui.c.d.2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    d dVar = d.this;
                    if (dVar.f10800s || dVar.f10798q != 4) {
                        d.a aVar = dVar.f10774h;
                        if (aVar != null) {
                            aVar.b();
                            return;
                        }
                        return;
                    }
                    c.a aVar2 = dVar.f10771e;
                    if (aVar2 != null) {
                        aVar2.a(1, 39);
                    }
                }
            });
        }
    }
}
