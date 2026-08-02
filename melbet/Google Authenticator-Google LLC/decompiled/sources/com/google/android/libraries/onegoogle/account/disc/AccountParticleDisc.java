package com.google.android.libraries.onegoogle.account.disc;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.apps.authenticator2.R;
import com.google.android.libraries.onegoogle.account.disc.AccountParticleDisc;
import defpackage.bry;
import defpackage.dgc;
import defpackage.dih;
import defpackage.dja;
import defpackage.dlj;
import defpackage.dov;
import defpackage.dpb;
import defpackage.dpd;
import defpackage.dpn;
import defpackage.dpo;
import defpackage.dpq;
import defpackage.dps;
import defpackage.dpx;
import defpackage.dqj;
import defpackage.dqk;
import defpackage.dql;
import defpackage.dqp;
import defpackage.drp;
import defpackage.dze;
import defpackage.edb;
import defpackage.efu;
import defpackage.fao;
import defpackage.gyf;
import defpackage.gzp;
import defpackage.hoq;
import defpackage.jtp;
import defpackage.kee;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class AccountParticleDisc extends FrameLayout {
    public final dpb a;
    public final BadgeFrameLayout b;
    public final RingFrameLayout c;
    public final CopyOnWriteArrayList d;
    public dql e;
    public dpx f;
    public boolean g;
    public boolean h;
    public dpd i;
    public dps j;
    public Object k;
    public dov l;
    public gzp m;
    public boolean n;
    public final edb o;
    public dze p;
    public bry q;
    private final boolean r;
    private final dpq s;
    private final boolean t;
    private final int u;
    private dqp v;
    private efu w;
    private gzp x;

    public AccountParticleDisc(Context context, AttributeSet attributeSet, int i, boolean z, boolean z2) {
        super(context, attributeSet, i);
        this.d = new CopyOnWriteArrayList();
        final int i2 = 1;
        this.s = new dpq(this) { // from class: dpc
            public final /* synthetic */ AccountParticleDisc a;

            {
                this.a = this;
            }

            @Override // defpackage.dpq
            public final void a() {
                if (i2 == 0) {
                    dih.W(new dlj(this.a, 4));
                    return;
                }
                AccountParticleDisc accountParticleDisc = this.a;
                accountParticleDisc.l();
                accountParticleDisc.g();
            }
        };
        final int i3 = 0;
        this.o = new edb(new dpq(this) { // from class: dpc
            public final /* synthetic */ AccountParticleDisc a;

            {
                this.a = this;
            }

            @Override // defpackage.dpq
            public final void a() {
                if (i3 == 0) {
                    dih.W(new dlj(this.a, 4));
                    return;
                }
                AccountParticleDisc accountParticleDisc = this.a;
                accountParticleDisc.l();
                accountParticleDisc.g();
            }
        });
        gyf gyfVar = gyf.a;
        this.x = gyfVar;
        this.m = gyfVar;
        this.n = z2;
        if (z) {
            LayoutInflater.from(context).inflate(R.layout.simple_account_particle_disc, (ViewGroup) this, true);
        } else {
            LayoutInflater.from(context).inflate(R.layout.account_particle_disc, (ViewGroup) this, true);
        }
        dpb dpbVar = (dpb) findViewById(R.id.og_apd_internal_image_view);
        this.a = dpbVar;
        if (z) {
            dpbVar.o(2, 2);
        }
        this.b = (BadgeFrameLayout) findViewById(R.id.badge_wrapper);
        this.c = (RingFrameLayout) findViewById(R.id.ring_wrapper);
        this.e = dja.l(context, z2);
        dpbVar.j(z2);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, dqj.a, i, R.style.OneGoogle_AccountParticleDisc_DayNight);
        try {
            int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(5, Integer.MIN_VALUE);
            dimensionPixelSize = dimensionPixelSize == Integer.MIN_VALUE ? obtainStyledAttributes.getDimensionPixelSize(4, Integer.MIN_VALUE) : dimensionPixelSize;
            this.r = obtainStyledAttributes.getBoolean(0, true);
            this.h = obtainStyledAttributes.getBoolean(1, false);
            this.t = obtainStyledAttributes.getBoolean(3, false);
            this.u = obtainStyledAttributes.getDimensionPixelSize(2, getResources().getDimensionPixelSize(R.dimen.og_apd_default_disc_min_touch_target_size));
            dpbVar.i(obtainStyledAttributes.getBoolean(6, true));
            obtainStyledAttributes.recycle();
            j();
            if (dimensionPixelSize != Integer.MIN_VALUE) {
                k(dimensionPixelSize);
            }
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [dps, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v0, types: [dps, java.lang.Object] */
    private final gzp q() {
        fao.c();
        if (!this.h) {
            return gyf.a;
        }
        edb edbVar = this.o;
        fao.c();
        Object obj = edbVar.c;
        if (obj == null) {
            return gyf.a;
        }
        ?? r1 = edbVar.b;
        if (r1 != 0) {
            gzp f = edb.f(r1.b(obj));
            if (f.f()) {
                return f;
            }
        }
        ?? r0 = edbVar.a;
        return r0 != 0 ? edb.f(r0.b(edbVar.c)) : gyf.a;
    }

    private final void r() {
        efu efuVar = this.w;
        if (efuVar == null) {
            return;
        }
        dpx dpxVar = this.f;
        if (dpxVar != null) {
            dpxVar.c = efuVar;
            if (dpxVar.e != null) {
                BadgeFrameLayout badgeFrameLayout = dpxVar.a;
                badgeFrameLayout.e(efuVar);
                badgeFrameLayout.c(efuVar, dpxVar.e);
            }
        }
        dqp dqpVar = this.v;
        if (dqpVar != null) {
            efu efuVar2 = this.w;
            dqpVar.d = efuVar2;
            if (dqpVar.c != null) {
                RingFrameLayout ringFrameLayout = dqpVar.b;
                ringFrameLayout.e(efuVar2);
                ringFrameLayout.c(efuVar2, dqpVar.c);
            }
        }
    }

    public final int a() {
        return this.a.a();
    }

    public final dpn b() {
        Object obj;
        dze dzeVar = this.p;
        if (dzeVar == null || (obj = dzeVar.b) == null) {
            return null;
        }
        return (dpn) ((dpo) obj).a.e();
    }

    public final String c() {
        if (this.m.f()) {
            return ((dqk) this.m.b()).b;
        }
        return null;
    }

    public final void d(efu efuVar) {
        if (this.g || this.h) {
            this.w = efuVar;
            r();
            if (this.g) {
                BadgeFrameLayout badgeFrameLayout = this.b;
                badgeFrameLayout.d();
                badgeFrameLayout.b(efuVar);
            }
            if (this.h) {
                RingFrameLayout ringFrameLayout = this.c;
                ringFrameLayout.d();
                ringFrameLayout.b(efuVar);
            }
        }
    }

    public final void e() {
        if (this.g) {
            return;
        }
        hoq.I(!p(), "enableBadges is only allowed before calling initialize.");
        this.g = true;
    }

    public final void f(dpd dpdVar, dov dovVar) {
        dpdVar.getClass();
        this.i = dpdVar;
        this.l = dovVar;
        if (this.t && this.x.f()) {
            int intValue = this.u - ((Integer) this.x.b()).intValue();
            int paddingLeft = (intValue - getPaddingLeft()) - getPaddingRight();
            int paddingTop = (intValue - getPaddingTop()) - getPaddingBottom();
            int max = Math.max(0, (int) Math.ceil(paddingLeft / 2.0f));
            int max2 = Math.max(0, (int) Math.ceil(paddingTop / 2.0f));
            setPadding(getPaddingLeft() + max, getPaddingTop() + max2, getPaddingRight() + max, getPaddingBottom() + max2);
        }
        if (this.g || this.h) {
            setClipChildren(false);
            setClipToPadding(false);
        }
        dih.W(new dgc(this, dovVar, 11, null));
        if (this.h) {
            this.v = new dqp(this.a, this.c);
        }
        if (this.g) {
            this.f = new dpx(this.b, this.a);
        }
        r();
    }

    public final void g() {
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            ((drp) ((kee) it.next()).a).b();
        }
    }

    public final void h(Object obj) {
        dih.W(new dgc(this, obj, 12));
    }

    public final void i(boolean z) {
        if (z == this.h) {
            return;
        }
        hoq.I(!p(), "setAllowRings is only allowed before calling initialize.");
        this.h = z;
    }

    public final void j() {
        dpb dpbVar = this.a;
        dpbVar.l();
        dpbVar.h(true);
    }

    public final void k(int i) {
        int dimension;
        hoq.I(!p(), "setMaxDiscContentSize is only allowed before calling initialize.");
        this.x = gzp.h(Integer.valueOf(i));
        if (this.g || this.h || this.r) {
            dimension = (int) getResources().getDimension(((float) i) > getResources().getDimension(R.dimen.og_apd_min_avatar_size_for_legacy_large_ring) ? R.dimen.og_apd_min_padding_large_ring : R.dimen.og_apd_min_padding);
        } else {
            dimension = 0;
        }
        dpb dpbVar = this.a;
        ViewGroup.LayoutParams layoutParams = dpbVar.getLayoutParams();
        layoutParams.width = i;
        layoutParams.height = i;
        dpbVar.f(i - (dimension + dimension));
    }

    public final void l() {
        dih.W(new dlj(this, 5));
    }

    public final void m(Object obj) {
        dze dzeVar = this.p;
        if (dzeVar != null) {
            dzeVar.c(this.s);
        }
        dps dpsVar = this.j;
        dze dzeVar2 = null;
        if (dpsVar != null && obj != null) {
            dzeVar2 = dpsVar.b(obj);
        }
        this.p = dzeVar2;
        if (dzeVar2 != null) {
            dzeVar2.b(this.s);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [dps, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1, types: [dps, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v2, types: [dps, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v3, types: [dps, java.lang.Object] */
    public final void n(Object obj) {
        fao.c();
        edb edbVar = this.o;
        edbVar.d(edbVar.b, edbVar.c);
        edbVar.d(edbVar.a, edbVar.c);
        edbVar.c = obj;
        edbVar.c(edbVar.b, obj);
        edbVar.c(edbVar.a, obj);
        gzp q = q();
        this.m = q;
        dqp dqpVar = this.v;
        if (dqpVar != null) {
            dqpVar.b(q);
        }
        m(obj);
        dpx dpxVar = this.f;
        if (dpxVar != null) {
            dpxVar.a(b(), false);
        }
    }

    public final void o() {
        fao.c();
        gzp q = q();
        if (q.equals(this.m)) {
            return;
        }
        this.m = q;
        dqp dqpVar = this.v;
        if (dqpVar != null) {
            fao.c();
            dqpVar.a(q, true);
        }
        g();
    }

    public final boolean p() {
        return this.i != null;
    }

    public AccountParticleDisc(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.ogAccountParticleDiscStyle);
    }

    public AccountParticleDisc(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, false);
    }

    public AccountParticleDisc(Context context, AttributeSet attributeSet, int i, boolean z) {
        this(context, attributeSet, i, z, jtp.d(context));
    }

    public AccountParticleDisc(Context context) {
        this(context, (AttributeSet) null);
    }

    public AccountParticleDisc(Context context, boolean z) {
        this(context, null, R.attr.ogAccountParticleDiscStyle, z);
    }
}
