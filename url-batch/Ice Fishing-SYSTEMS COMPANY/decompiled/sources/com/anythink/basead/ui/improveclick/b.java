package com.anythink.basead.ui.improveclick;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.anythink.basead.ui.improveclick.ambience.BaseAmbienceView;
import com.anythink.basead.ui.improveclick.ambience.BubbleDropAnimView;
import com.anythink.basead.ui.improveclick.c;
import com.anythink.basead.ui.improveclick.g;
import com.anythink.core.common.h.w;
import com.anythink.core.common.h.x;
import com.anythink.core.common.v.am;
import com.anythink.core.common.v.m;
import java.util.Map;

/* loaded from: classes.dex */
public final class b extends c {

    /* renamed from: a, reason: collision with root package name */
    public static final int f11285a = 1;

    /* renamed from: b, reason: collision with root package name */
    public static final int f11286b = 2;

    /* renamed from: c, reason: collision with root package name */
    public static final int f11287c = 3;

    /* renamed from: l, reason: collision with root package name */
    private BaseAmbienceView f11288l;

    /* renamed from: m, reason: collision with root package name */
    private com.anythink.basead.ui.improveclick.ambience.a f11289m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f11290n;

    /* renamed from: o, reason: collision with root package name */
    private int f11291o;

    /* renamed from: p, reason: collision with root package name */
    private int f11292p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f11293q;

    /* renamed from: r, reason: collision with root package name */
    private boolean f11294r;

    private boolean b() {
        int bv = this.f11297f.f14325o.bv();
        if (bv != 2) {
            if (bv != 3 || this.f11299h != 2) {
                return false;
            }
            com.anythink.basead.ui.improveclick.ambience.a aVar = new com.anythink.basead.ui.improveclick.ambience.a();
            this.f11289m = aVar;
            aVar.a(this.f11298g, this.f11291o);
            return true;
        }
        if (this.f11288l == null) {
            BubbleDropAnimView bubbleDropAnimView = new BubbleDropAnimView(this.f11295d);
            this.f11288l = bubbleDropAnimView;
            bubbleDropAnimView.initSetting(this.f11297f, this.f11301k);
            if (this.f11297f.f14325o.bv() == 2) {
                if (this.f11299h != 2) {
                    this.f11298g.addView(this.f11288l, -1, -1);
                } else if (this.f11298g.getParent() != null && (this.f11298g.getParent() instanceof ViewGroup)) {
                    ((ViewGroup) this.f11298g.getParent()).addView(this.f11288l, -1, -1);
                }
            }
        }
        return true;
    }

    @Override // com.anythink.basead.ui.improveclick.c
    public final void a(Context context, w wVar, x xVar, ViewGroup viewGroup, RelativeLayout relativeLayout, View view, int i, c.a aVar) {
        super.a(context, wVar, xVar, viewGroup, relativeLayout, view, i, aVar);
        this.f11290n = false;
        this.f11291o = 1;
        if (this.f11299h == 3) {
            this.f11291o = this.f11297f.f14325o.C();
        } else {
            this.f11291o = m.f(this.f11295d);
        }
        this.f11292p = 1;
        this.f11293q = false;
        this.f11294r = false;
    }

    @Override // com.anythink.basead.ui.improveclick.c
    public final void a(int i, Map<String, Object> map) {
        boolean z8 = true;
        switch (i) {
            case 110:
                BaseAmbienceView baseAmbienceView = this.f11288l;
                if (baseAmbienceView != null) {
                    baseAmbienceView.onResume();
                    break;
                }
                break;
            case 111:
                BaseAmbienceView baseAmbienceView2 = this.f11288l;
                if (baseAmbienceView2 != null) {
                    baseAmbienceView2.onPause();
                    break;
                }
                break;
            case 112:
            case 115:
                a();
                break;
            case 113:
                Object obj = map.get("click_type");
                Object obj2 = map.get(g.a.f11329g);
                if (obj != null && (obj instanceof Integer) && obj2 != null && (obj2 instanceof Integer)) {
                    int intValue = ((Integer) obj).intValue();
                    int intValue2 = ((Integer) obj2).intValue();
                    if (intValue != 5 && intValue != 6 && intValue != 7) {
                        int b9 = com.anythink.basead.ui.f.c.b(intValue, intValue2);
                        if (b9 != 0 && b9 != 1) {
                            if (b9 == 2) {
                                this.f11293q = true;
                                break;
                            }
                        } else {
                            this.f11294r = true;
                            break;
                        }
                    }
                }
                break;
            case 114:
                Object obj3 = map.get(g.a.f11327e);
                if (obj3 != null && (obj3 instanceof Integer)) {
                    this.f11292p = ((Integer) obj3).intValue();
                }
                int bv = this.f11297f.f14325o.bv();
                if (bv != 2) {
                    if (bv == 3 && this.f11299h == 2) {
                        com.anythink.basead.ui.improveclick.ambience.a aVar = new com.anythink.basead.ui.improveclick.ambience.a();
                        this.f11289m = aVar;
                        aVar.a(this.f11298g, this.f11291o);
                    } else {
                        z8 = false;
                    }
                } else if (this.f11288l == null) {
                    BubbleDropAnimView bubbleDropAnimView = new BubbleDropAnimView(this.f11295d);
                    this.f11288l = bubbleDropAnimView;
                    bubbleDropAnimView.initSetting(this.f11297f, this.f11301k);
                    if (this.f11297f.f14325o.bv() == 2) {
                        if (this.f11299h == 2) {
                            if (this.f11298g.getParent() != null && (this.f11298g.getParent() instanceof ViewGroup)) {
                                ((ViewGroup) this.f11298g.getParent()).addView(this.f11288l, -1, -1);
                            }
                        } else {
                            this.f11298g.addView(this.f11288l, -1, -1);
                        }
                    }
                }
                this.f11290n = z8;
                break;
        }
    }

    @Override // com.anythink.basead.ui.improveclick.c
    public final void a() {
        if (this.f11290n) {
            x xVar = this.f11297f;
            w wVar = this.f11296e;
            com.anythink.basead.b.e.a(xVar);
            com.anythink.core.common.u.e.a(xVar, wVar, this.f11291o, this.f11292p, this.f11297f.f14325o.bv() == 2 ? 3 : 4, this.f11293q, this.f11294r);
        }
        BaseAmbienceView baseAmbienceView = this.f11288l;
        if (baseAmbienceView != null) {
            baseAmbienceView.release();
            am.a(this.f11288l);
        }
    }
}
