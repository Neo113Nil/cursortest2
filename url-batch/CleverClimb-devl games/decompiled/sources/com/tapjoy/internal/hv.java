package com.tapjoy.internal;

import android.graphics.Point;
import android.os.SystemClock;
import com.tapjoy.TJAdUnitConstants;
import com.tapjoy.TapjoyConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import javax.annotation.Nullable;

/* loaded from: classes.dex */
public final class hv extends hr {
    public static final bi n = new bi() { // from class: com.tapjoy.internal.hv.1
        @Override // com.tapjoy.internal.bi
        public final /* synthetic */ Object a(bn bnVar) {
            return new hv(bnVar);
        }
    };

    /* renamed from: a, reason: collision with root package name */
    @Nullable
    public hy f8330a;

    /* renamed from: b, reason: collision with root package name */
    @Nullable
    public hy f8331b;

    /* renamed from: c, reason: collision with root package name */
    public hy f8332c;

    /* renamed from: d, reason: collision with root package name */
    @Nullable
    public Point f8333d;

    @Nullable
    public hy e;

    @Nullable
    public hy f;
    public String g;

    @Nullable
    public gm h;
    public ArrayList i = new ArrayList();
    public ArrayList j = new ArrayList();
    public Map k;
    public long l;

    @Nullable
    public hw m;

    public hv() {
    }

    hv(bn bnVar) {
        bnVar.h();
        String str = null;
        String str2 = null;
        while (bnVar.j()) {
            String l = bnVar.l();
            if ("frame".equals(l)) {
                bnVar.h();
                while (bnVar.j()) {
                    String l2 = bnVar.l();
                    if (TJAdUnitConstants.String.PORTRAIT.equals(l2)) {
                        this.f8330a = (hy) hy.e.a(bnVar);
                    } else if (TJAdUnitConstants.String.LANDSCAPE.equals(l2)) {
                        this.f8331b = (hy) hy.e.a(bnVar);
                    } else if ("close_button".equals(l2)) {
                        this.f8332c = (hy) hy.e.a(bnVar);
                    } else if ("close_button_offset".equals(l2)) {
                        this.f8333d = (Point) bj.f7850a.a(bnVar);
                    } else {
                        bnVar.s();
                    }
                }
                bnVar.i();
            } else if ("creative".equals(l)) {
                bnVar.h();
                while (bnVar.j()) {
                    String l3 = bnVar.l();
                    if (TJAdUnitConstants.String.PORTRAIT.equals(l3)) {
                        this.e = (hy) hy.e.a(bnVar);
                    } else if (TJAdUnitConstants.String.LANDSCAPE.equals(l3)) {
                        this.f = (hy) hy.e.a(bnVar);
                    } else {
                        bnVar.s();
                    }
                }
                bnVar.i();
            } else if ("url".equals(l)) {
                this.g = bnVar.b();
            } else if (hp.a(l)) {
                this.h = hp.a(l, bnVar);
            } else if ("mappings".equals(l)) {
                bnVar.h();
                while (bnVar.j()) {
                    String l4 = bnVar.l();
                    if (TJAdUnitConstants.String.PORTRAIT.equals(l4)) {
                        bnVar.a(this.i, ht.h);
                    } else if (TJAdUnitConstants.String.LANDSCAPE.equals(l4)) {
                        bnVar.a(this.j, ht.h);
                    } else {
                        bnVar.s();
                    }
                }
                bnVar.i();
            } else if ("meta".equals(l)) {
                this.k = bnVar.d();
            } else if ("ttl".equals(l)) {
                this.l = SystemClock.elapsedRealtime() + ((long) (bnVar.p() * 1000.0d));
            } else if ("no_more_today".equals(l)) {
                this.m = (hw) hw.f8334d.a(bnVar);
            } else if ("ad_content".equals(l)) {
                str2 = bnVar.b();
            } else if (TapjoyConstants.TJC_REDIRECT_URL.equals(l)) {
                str = bnVar.b();
            } else {
                bnVar.s();
            }
        }
        bnVar.i();
        if (this.g == null) {
            this.g = "";
        }
        if (this.i != null) {
            Iterator it = this.i.iterator();
            while (it.hasNext()) {
                ht htVar = (ht) it.next();
                if (htVar.f == null) {
                    htVar.f = str2;
                }
                if (htVar.e == null) {
                    htVar.e = str;
                }
            }
        }
        if (this.j != null) {
            Iterator it2 = this.j.iterator();
            while (it2.hasNext()) {
                ht htVar2 = (ht) it2.next();
                if (htVar2.f == null) {
                    htVar2.f = str2;
                }
                if (htVar2.e == null) {
                    htVar2.e = str;
                }
            }
        }
    }

    public final boolean a() {
        return (this.f8332c == null || this.f8330a == null || this.e == null) ? false : true;
    }

    public final boolean b() {
        return (this.f8332c == null || this.f8331b == null || this.f == null) ? false : true;
    }
}
