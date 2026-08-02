package com.google.android.libraries.onegoogle.account.particle;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.apps.authenticator2.R;
import com.google.android.libraries.onegoogle.account.disc.AccountParticleDisc;
import defpackage.dqt;
import defpackage.efu;
import defpackage.efw;
import defpackage.fym;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class AccountParticle extends ConstraintLayout implements dqt, efw {
    public final AccountParticleDisc i;
    public final TextView j;
    public final TextView k;
    public boolean l;
    public fym m;
    private final TextView n;

    public AccountParticle(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater.from(context).inflate(R.layout.account_particle, (ViewGroup) this, true);
        AccountParticleDisc accountParticleDisc = (AccountParticleDisc) findViewById(R.id.account_avatar);
        accountParticleDisc.getClass();
        this.i = accountParticleDisc;
        TextView textView = (TextView) findViewById(R.id.og_primary_account_information);
        textView.getClass();
        this.j = textView;
        TextView textView2 = (TextView) findViewById(R.id.og_secondary_account_information);
        textView2.getClass();
        this.k = textView2;
        this.n = (TextView) findViewById(R.id.counter);
    }

    @Override // defpackage.efw
    public final void b(efu efuVar) {
        if (this.l) {
            efuVar.c(this, 90144);
            this.i.d(efuVar);
        }
    }

    @Override // defpackage.efw
    public final void e(efu efuVar) {
        if (this.l) {
            AccountParticleDisc accountParticleDisc = this.i;
            if (accountParticleDisc.g) {
                accountParticleDisc.b.e(efuVar);
            }
            if (accountParticleDisc.h) {
                accountParticleDisc.c.e(efuVar);
            }
            efuVar.e(this);
        }
    }

    @Override // defpackage.dqt
    public final TextView f() {
        return this.n;
    }

    @Override // defpackage.dqt
    public final TextView g() {
        return this.j;
    }

    @Override // defpackage.dqt
    public final TextView h() {
        return this.k;
    }

    @Override // defpackage.dqt
    public final AccountParticleDisc i() {
        return this.i;
    }

    public AccountParticle(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.ogAccountParticleStyle);
    }

    public AccountParticle(Context context) {
        this(context, null);
    }
}
