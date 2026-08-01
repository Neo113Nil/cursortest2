package com.clutchquizarena.app;

import A0.h;
import R0.ViewOnClickListenerC0025a;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatButton;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.J;
import com.clutchquizarena.app.db.AppDatabase;
import g.AbstractActivityC0136i;
import g1.f;
import h0.g;
import o1.AbstractC0299s;
import o1.AbstractC0305y;
import r0.C0331l;

/* loaded from: classes.dex */
public final class MainActivity extends AbstractActivityC0136i {

    /* renamed from: A, reason: collision with root package name */
    public static final /* synthetic */ int f1718A = 0;

    /* renamed from: y, reason: collision with root package name */
    public h f1719y;

    /* renamed from: z, reason: collision with root package name */
    public AppDatabase f1720z;

    @Override // g.AbstractActivityC0136i, a.l, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        View inflate = getLayoutInflater().inflate(R.layout.activity_main, (ViewGroup) null, false);
        int i = R.id.buttonNext;
        AppCompatButton appCompatButton = (AppCompatButton) g.d(inflate, R.id.buttonNext);
        if (appCompatButton != null) {
            i = R.id.logoImage;
            if (((ImageView) g.d(inflate, R.id.logoImage)) != null) {
                ConstraintLayout constraintLayout = (ConstraintLayout) inflate;
                this.f1719y = new h(constraintLayout, appCompatButton);
                setContentView(constraintLayout);
                this.f1720z = AppDatabase.Companion.getInstance(this);
                AbstractC0299s.h(J.e(this), AbstractC0305y.f3370b, new C0331l(this, null));
                h hVar = this.f1719y;
                if (hVar == null) {
                    f.g("binding");
                    throw null;
                }
                ((AppCompatButton) hVar.f30b).setOnClickListener(new ViewOnClickListenerC0025a(4, this));
                return;
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
    }
}
