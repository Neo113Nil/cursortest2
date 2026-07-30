package com.anythink.basead.ui.c;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.anythink.basead.ui.CountDownView;
import com.anythink.basead.ui.component.emdcardimprove.RedPacketPage;
import com.anythink.basead.ui.f.b;
import com.anythink.basead.ui.improveclick.c;
import com.anythink.basead.ui.improveclick.d;
import com.anythink.core.common.h.r;
import com.anythink.core.common.h.w;
import com.anythink.core.common.h.x;
import com.anythink.core.common.v.am;
import com.anythink.core.common.v.q;
import com.anythink.expressad.foundation.h.k;

/* loaded from: classes.dex */
public final class c extends a {

    /* renamed from: o, reason: collision with root package name */
    com.anythink.basead.ui.f.a f10789o;

    /* renamed from: p, reason: collision with root package name */
    int f10790p;

    /* renamed from: q, reason: collision with root package name */
    int f10791q;

    /* renamed from: r, reason: collision with root package name */
    private RedPacketPage f10792r;

    public c(Context context, w wVar, x xVar, c.a aVar, int i, ViewGroup viewGroup) {
        super(context, wVar, xVar, aVar, i, viewGroup);
    }

    @Override // com.anythink.basead.ui.c.a
    public final void a(ViewGroup viewGroup) {
        super.a(viewGroup);
        this.f10790p = this.f10769c.f14325o.aX() / 10;
        this.f10791q = this.f10769c.f14325o.aX() % 10;
        this.f10792r = new RedPacketPage(this.f10767a);
        com.anythink.basead.ui.f.a aVar = new com.anythink.basead.ui.f.a(this.f10768b, this.f10769c);
        this.f10789o = aVar;
        aVar.b(this.f10792r);
        this.f10792r.setOpenIconClickClickAction(this.f10769c.f14325o.aW());
        this.f10792r.setRedPacketClickListener(new b.a() { // from class: com.anythink.basead.ui.c.c.1
            /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
            /* JADX WARN: Code restructure failed: missing block: B:20:0x000d, code lost:
            
                if (r5.f10793a.f10791q > 0) goto L10;
             */
            /* JADX WARN: Code restructure failed: missing block: B:21:0x0010, code lost:
            
                r1 = false;
             */
            /* JADX WARN: Code restructure failed: missing block: B:24:0x0017, code lost:
            
                if (r5.f10793a.f10790p > 0) goto L10;
             */
            /* JADX WARN: Code restructure failed: missing block: B:26:0x001e, code lost:
            
                if (r5.f10793a.f10790p >= 2) goto L10;
             */
            @Override // com.anythink.basead.ui.f.b.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void a(int i, int i4) {
                boolean z8;
                c.a aVar2;
                boolean z9 = true;
                switch (i4) {
                    case 27:
                        z8 = c.this.f10769c.f14325o.aW() == 2;
                        if (!z8) {
                            c cVar = c.this;
                            com.anythink.basead.ui.f.b.a(cVar.f10779n, true, cVar.f10769c, false);
                        }
                        z9 = z8;
                        break;
                    case 28:
                        break;
                    case 29:
                        break;
                    case 30:
                        z8 = false;
                        break;
                    case 31:
                        break;
                    default:
                        z8 = false;
                        z9 = z8;
                        break;
                }
                if (z9 && (aVar2 = c.this.f10771e) != null) {
                    aVar2.a(i, i4);
                }
                if (z8) {
                    if (c.this.f10792r != null) {
                        am.a(c.this.f10792r);
                        d.a aVar3 = c.this.f10774h;
                        if (aVar3 != null) {
                            aVar3.a(false);
                        }
                    }
                    c.this.f10779n.setVisibility(0);
                    c.this.f10779n.setOnClickListener(new View.OnClickListener() { // from class: com.anythink.basead.ui.c.c.1.1
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            d.a aVar4 = c.this.f10774h;
                            if (aVar4 != null) {
                                aVar4.b();
                            }
                        }
                    });
                }
            }
        });
        w wVar = this.f10768b;
        if (wVar != null) {
            String x3 = wVar.x();
            w wVar2 = this.f10768b;
            if ((wVar2 instanceof r) && !TextUtils.isEmpty(((r) wVar2).aL())) {
                x3 = ((r) this.f10768b).aL();
            }
            this.f10792r.setAdTitle(TextUtils.isEmpty(x3) ? "" : !TextUtils.isEmpty(this.f10769c.f14325o.aS()) ? this.f10769c.f14325o.aS().replace("{__sender__}", "") : this.f10767a.getResources().getString(q.a(this.f10767a, "myoffer_red_packet_title_text", k.f19794g), x3));
            this.f10792r.setAdBless(this.f10769c.f14325o.aT());
            if (TextUtils.isEmpty(this.f10768b.z())) {
                this.f10792r.setAdIconUrl(this.f10768b.B());
            } else {
                this.f10792r.setAdIconUrl(this.f10768b.z());
            }
            this.f10792r.setAdNotice(this.f10769c.f14325o.aV(), this.f10768b.K());
            this.f10792r.setCTAText(this.f10769c.f14325o.bh());
        }
        viewGroup.addView(this.f10792r, -1, -1);
        b(this.f10769c.f14325o.aR());
        CountDownView countDownView = this.f10779n;
        if (countDownView != null) {
            com.anythink.basead.ui.f.b.a(countDownView, false, this.f10769c, false);
        }
        d.a aVar2 = this.f10774h;
        if (aVar2 != null) {
            aVar2.a(true);
        }
    }

    @Override // com.anythink.basead.ui.c.a
    public final void a() {
        super.a();
        d.a aVar = this.f10774h;
        if (aVar != null) {
            aVar.d();
        }
    }

    @Override // com.anythink.basead.ui.c.a
    public final void a(long j9) {
        super.a(j9);
        if (this.f10777l >= this.f10778m) {
            this.f10779n.setOnClickListener(new View.OnClickListener() { // from class: com.anythink.basead.ui.c.c.2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    d.a aVar = c.this.f10774h;
                    if (aVar != null) {
                        aVar.b();
                    }
                }
            });
        }
    }
}
