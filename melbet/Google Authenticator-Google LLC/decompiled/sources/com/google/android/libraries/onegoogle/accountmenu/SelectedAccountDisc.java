package com.google.android.libraries.onegoogle.accountmenu;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.google.android.apps.authenticator2.R;
import com.google.android.libraries.onegoogle.account.disc.AccountParticleDisc;
import com.google.android.libraries.onegoogle.common.CirclePulseDrawable;
import defpackage.aer;
import defpackage.csm;
import defpackage.cud;
import defpackage.dgc;
import defpackage.dih;
import defpackage.dov;
import defpackage.dpp;
import defpackage.dqi;
import defpackage.dqv;
import defpackage.drj;
import defpackage.drk;
import defpackage.drl;
import defpackage.dsf;
import defpackage.ebv;
import defpackage.ebw;
import defpackage.eca;
import defpackage.ecb;
import defpackage.ecf;
import defpackage.ecg;
import defpackage.gzp;
import defpackage.hac;
import defpackage.heg;
import defpackage.hel;
import defpackage.his;
import defpackage.hoq;
import defpackage.jtp;
import java.lang.ref.WeakReference;
import java.util.concurrent.ExecutorService;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class SelectedAccountDisc extends FrameLayout {
    public final ImageView a;
    public final AccountParticleDisc b;
    public View.OnTouchListener c;
    public View.OnTouchListener d;
    public dsf e;
    public dqi f;
    public boolean g;
    public hac h;
    public hac i;
    public hac j;
    public boolean k;

    public SelectedAccountDisc(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        new Rect();
        new Rect();
        new WeakReference(null);
        this.g = true;
        this.h = new csm(4);
        this.i = new csm(5);
        this.j = new csm(6);
        LayoutInflater.from(context).inflate(R.layout.selected_account_disc, (ViewGroup) this, true);
        AccountParticleDisc accountParticleDisc = (AccountParticleDisc) findViewById(R.id.og_selected_account_disc_apd);
        this.b = accountParticleDisc;
        ImageView imageView = (ImageView) findViewById(R.id.incognito_on_image_view);
        this.a = imageView;
        int i2 = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, drj.a, i, 0);
        try {
            int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(0, -1);
            if (dimensionPixelSize != -1) {
                hoq.I(!accountParticleDisc.p(), "setMaxDiscContentSize is only allowed before calling initialize.");
                accountParticleDisc.k(dimensionPixelSize);
            }
            obtainStyledAttributes.recycle();
            int ad = dih.ad(context);
            if (ad != 0) {
                accountParticleDisc.setBackgroundResource(ad);
                imageView.setBackgroundResource(ad);
            }
            super.setOnTouchListener(new drk(this, i2));
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    private static final void c(heg hegVar, hac hacVar) {
        dpp dppVar = (dpp) hacVar.bB();
        if (dppVar != null) {
            hegVar.h(dppVar);
        }
    }

    public final int a() {
        ImageView imageView = this.a;
        if (imageView.getVisibility() == 0) {
            return (imageView.getHeight() - imageView.getPaddingTop()) - imageView.getPaddingBottom();
        }
        AccountParticleDisc accountParticleDisc = this.b;
        return accountParticleDisc.m.f() ? accountParticleDisc.e.b(accountParticleDisc.a()) : accountParticleDisc.a();
    }

    public final void b(dsf dsfVar, aer aerVar) {
        hel helVar;
        heg hegVar = new heg(4);
        ebv ebvVar = dsfVar.e;
        Context e = ebvVar.n.e(getContext());
        eca ecaVar = ebvVar.f;
        dov dovVar = dsfVar.c;
        ExecutorService executorService = dsfVar.j;
        AccountParticleDisc accountParticleDisc = this.b;
        if (accountParticleDisc.j != null) {
            int i = hel.d;
            helVar = his.a;
        } else {
            int i2 = hel.d;
            helVar = his.a;
        }
        hegVar.j(helVar);
        gzp gzpVar = ebvVar.g;
        if (gzpVar.f()) {
            ecg ecgVar = new ecg(e, aerVar, (dqv) gzpVar.b());
            int a = a();
            CirclePulseDrawable circlePulseDrawable = ecgVar.b.a;
            circlePulseDrawable.b = a;
            circlePulseDrawable.a();
            ecgVar.e = true;
            gzp gzpVar2 = ebvVar.l;
            aerVar.L().a(new ecf(dsfVar.b, ecgVar));
            hegVar.h(ecgVar);
        }
        if (jtp.e(getContext())) {
            c(hegVar, this.i);
        } else {
            gzp gzpVar3 = ebvVar.h;
            if (gzpVar3.f()) {
                Object b = gzpVar3.b();
                ebw ebwVar = (ebw) b;
                ebwVar.d = new ecb(e, ebwVar.a, new cud(dsfVar, 5), aerVar);
                ebwVar.d.b(ebwVar.e);
                hegVar.h(ebwVar.d);
                aerVar.L().a(((ebw) gzpVar3.b()).c);
            }
            c(hegVar, this.h);
            c(hegVar, this.j);
        }
        hel g = hegVar.g();
        if (g.isEmpty()) {
            return;
        }
        dqi dqiVar = new dqi(g, aerVar);
        this.f = dqiVar;
        hoq.I(accountParticleDisc.g, "setDecorationRetriever is not allowed with false allowBadges.");
        accountParticleDisc.j = dqiVar;
        accountParticleDisc.m(accountParticleDisc.k);
        if (accountParticleDisc.h) {
            dih.W(new dgc(accountParticleDisc, dqiVar, 10));
        }
        accountParticleDisc.l();
        accountParticleDisc.g();
    }

    @Override // android.view.View
    public final void setOnClickListener(View.OnClickListener onClickListener) {
        super.setOnClickListener(new drl(this, onClickListener, 0));
    }

    @Override // android.view.View
    public final void setOnTouchListener(View.OnTouchListener onTouchListener) {
        this.c = onTouchListener;
    }

    public void setScale(float f) {
        this.b.a.n(f);
    }

    public SelectedAccountDisc(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SelectedAccountDisc(Context context) {
        this(context, null);
    }
}
