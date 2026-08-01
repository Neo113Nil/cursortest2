package com.clutchquizarena.app;

import R0.ViewOnClickListenerC0025a;
import X.A;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatButton;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.J;
import com.clutchquizarena.app.db.AppDatabase;
import g.AbstractActivityC0136i;
import g1.f;
import h0.g;
import l.C0237s;
import o1.AbstractC0299s;
import o1.AbstractC0305y;
import r0.C0334o;

/* loaded from: classes.dex */
public final class ResultActivity extends AbstractActivityC0136i {

    /* renamed from: A, reason: collision with root package name */
    public static final /* synthetic */ int f1721A = 0;

    /* renamed from: y, reason: collision with root package name */
    public C0237s f1722y;

    /* renamed from: z, reason: collision with root package name */
    public AppDatabase f1723z;

    @Override // g.AbstractActivityC0136i, a.l, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        View inflate = getLayoutInflater().inflate(R.layout.activity_result, (ViewGroup) null, false);
        int i = R.id.buttonPlayAgain;
        AppCompatButton appCompatButton = (AppCompatButton) g.d(inflate, R.id.buttonPlayAgain);
        if (appCompatButton != null) {
            i = R.id.iconTrophy;
            if (((ImageView) g.d(inflate, R.id.iconTrophy)) != null) {
                i = R.id.overlay;
                if (g.d(inflate, R.id.overlay) != null) {
                    i = R.id.textOutcome;
                    TextView textView = (TextView) g.d(inflate, R.id.textOutcome);
                    if (textView != null) {
                        i = R.id.textResultBest;
                        TextView textView2 = (TextView) g.d(inflate, R.id.textResultBest);
                        if (textView2 != null) {
                            i = R.id.textResultCorrect;
                            TextView textView3 = (TextView) g.d(inflate, R.id.textResultCorrect);
                            if (textView3 != null) {
                                i = R.id.textResultScore;
                                TextView textView4 = (TextView) g.d(inflate, R.id.textResultScore);
                                if (textView4 != null) {
                                    i = R.id.textResultTime;
                                    TextView textView5 = (TextView) g.d(inflate, R.id.textResultTime);
                                    if (textView5 != null) {
                                        i = R.id.textResultTitle;
                                        if (((TextView) g.d(inflate, R.id.textResultTitle)) != null) {
                                            ConstraintLayout constraintLayout = (ConstraintLayout) inflate;
                                            this.f1722y = new C0237s(constraintLayout, appCompatButton, textView, textView2, textView3, textView4, textView5);
                                            setContentView(constraintLayout);
                                            this.f1723z = AppDatabase.Companion.getInstance(this);
                                            i().a(this, new A(this, 2));
                                            AbstractC0299s.h(J.e(this), AbstractC0305y.f3370b, new C0334o(this, null));
                                            C0237s c0237s = this.f1722y;
                                            if (c0237s == null) {
                                                f.g("binding");
                                                throw null;
                                            }
                                            ((AppCompatButton) c0237s.f3043a).setOnClickListener(new ViewOnClickListenerC0025a(5, this));
                                            return;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
    }
}
