package com.google.android.libraries.onegoogle.accountmanagement;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.util.Property;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.apps.authenticator2.R;
import com.google.android.libraries.onegoogle.account.disc.AccountParticleDisc;
import defpackage.dqs;
import defpackage.dqt;
import defpackage.dqu;
import defpackage.fym;
import defpackage.gzp;
import defpackage.yq;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class SelectedAccountView extends ConstraintLayout implements dqt {
    private static final Property t = Property.of(ImageView.class, Float.class, "rotation");
    public final AccountParticleDisc i;
    public final ImageView j;
    public final ImageView k;
    public final FrameLayout l;
    public final ObjectAnimator m;
    public boolean n;
    public dqu o;
    public String p;
    public String q;
    public dqs r;
    public fym s;
    private final TextView u;
    private final TextView v;
    private final TextView w;
    private final String x;
    private final String y;

    public SelectedAccountView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.o = dqu.a().a();
        LayoutInflater.from(context).inflate(R.layout.selected_account_view, this);
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.account_menu_header_signed_in_layout_min_height);
        if (dimensionPixelSize != this.d) {
            this.d = dimensionPixelSize;
            requestLayout();
        }
        this.u = (TextView) findViewById(R.id.og_primary_account_information);
        this.v = (TextView) findViewById(R.id.og_secondary_account_information);
        this.w = (TextView) findViewById(R.id.counter);
        this.i = (AccountParticleDisc) findViewById(R.id.account_avatar);
        ImageView imageView = (ImageView) findViewById(R.id.og_collapsed_chevron);
        this.j = imageView;
        this.m = ObjectAnimator.ofFloat(imageView, (Property<ImageView, Float>) t, 360.0f, 180.0f);
        this.k = (ImageView) findViewById(R.id.og_custom_icon);
        this.l = (FrameLayout) findViewById(R.id.og_trailing_drawable_container);
        this.x = getResources().getString(R.string.og_account_list_collapsed_a11y);
        this.y = getResources().getString(R.string.og_account_list_expanded_a11y);
    }

    public final void e() {
        gzp gzpVar = this.o.a;
    }

    @Override // defpackage.dqt
    public final TextView f() {
        return this.w;
    }

    @Override // defpackage.dqt
    public final TextView g() {
        return this.u;
    }

    @Override // defpackage.dqt
    public final TextView h() {
        return this.v;
    }

    @Override // defpackage.dqt
    public final AccountParticleDisc i() {
        return this.i;
    }

    public final void j(boolean z) {
        int i = yq.a;
        ImageView imageView = this.j;
        imageView.setImportantForAccessibility(1);
        imageView.setContentDescription(z ? this.p : this.q);
        yq.n(this, z ? this.y : this.x);
    }

    public SelectedAccountView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SelectedAccountView(Context context) {
        this(context, null);
    }
}
