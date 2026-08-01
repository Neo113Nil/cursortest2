package com.winfour.neondrop.ui;

import O0.ViewOnClickListenerC0025a;
import S0.a;
import T0.e;
import W0.d;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.button.MaterialButton;
import com.winfour.neondrop.R;
import com.winfour.neondrop.ui.GameActivity;
import com.winfour.neondrop.ui.ResultActivity;
import f1.InterfaceC0099a;
import g.AbstractActivityC0110i;
import h0.a0;
import m.C0227a;

/* loaded from: classes.dex */
public final class ResultActivity extends AbstractActivityC0110i {

    /* renamed from: A, reason: collision with root package name */
    public static final /* synthetic */ int f2116A = 0;

    /* renamed from: y, reason: collision with root package name */
    public final d f2117y;

    /* renamed from: z, reason: collision with root package name */
    public final d f2118z;

    public ResultActivity() {
        final int i = 0;
        this.f2117y = new d(new InterfaceC0099a(this) { // from class: V0.k

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ResultActivity f946b;

            {
                this.f946b = this;
            }

            @Override // f1.InterfaceC0099a
            public final Object a() {
                ResultActivity resultActivity = this.f946b;
                switch (i) {
                    case 0:
                        int i2 = ResultActivity.f2116A;
                        View inflate = resultActivity.getLayoutInflater().inflate(R.layout.activity_result, (ViewGroup) null, false);
                        int i3 = R.id.homeButton;
                        MaterialButton materialButton = (MaterialButton) C0227a.g(inflate, R.id.homeButton);
                        if (materialButton != null) {
                            i3 = R.id.nextLevelButton;
                            MaterialButton materialButton2 = (MaterialButton) C0227a.g(inflate, R.id.nextLevelButton);
                            if (materialButton2 != null) {
                                i3 = R.id.playAgainButton;
                                MaterialButton materialButton3 = (MaterialButton) C0227a.g(inflate, R.id.playAgainButton);
                                if (materialButton3 != null) {
                                    i3 = R.id.resultMessage;
                                    TextView textView = (TextView) C0227a.g(inflate, R.id.resultMessage);
                                    if (textView != null) {
                                        i3 = R.id.resultScore;
                                        TextView textView2 = (TextView) C0227a.g(inflate, R.id.resultScore);
                                        if (textView2 != null) {
                                            i3 = R.id.resultTitle;
                                            TextView textView3 = (TextView) C0227a.g(inflate, R.id.resultTitle);
                                            if (textView3 != null) {
                                                return new T0.e((ConstraintLayout) inflate, materialButton, materialButton2, materialButton3, textView, textView2, textView3);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i3)));
                    default:
                        int i4 = ResultActivity.f2116A;
                        return new S0.a(resultActivity);
                }
            }
        });
        final int i2 = 1;
        this.f2118z = new d(new InterfaceC0099a(this) { // from class: V0.k

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ResultActivity f946b;

            {
                this.f946b = this;
            }

            @Override // f1.InterfaceC0099a
            public final Object a() {
                ResultActivity resultActivity = this.f946b;
                switch (i2) {
                    case 0:
                        int i22 = ResultActivity.f2116A;
                        View inflate = resultActivity.getLayoutInflater().inflate(R.layout.activity_result, (ViewGroup) null, false);
                        int i3 = R.id.homeButton;
                        MaterialButton materialButton = (MaterialButton) C0227a.g(inflate, R.id.homeButton);
                        if (materialButton != null) {
                            i3 = R.id.nextLevelButton;
                            MaterialButton materialButton2 = (MaterialButton) C0227a.g(inflate, R.id.nextLevelButton);
                            if (materialButton2 != null) {
                                i3 = R.id.playAgainButton;
                                MaterialButton materialButton3 = (MaterialButton) C0227a.g(inflate, R.id.playAgainButton);
                                if (materialButton3 != null) {
                                    i3 = R.id.resultMessage;
                                    TextView textView = (TextView) C0227a.g(inflate, R.id.resultMessage);
                                    if (textView != null) {
                                        i3 = R.id.resultScore;
                                        TextView textView2 = (TextView) C0227a.g(inflate, R.id.resultScore);
                                        if (textView2 != null) {
                                            i3 = R.id.resultTitle;
                                            TextView textView3 = (TextView) C0227a.g(inflate, R.id.resultTitle);
                                            if (textView3 != null) {
                                                return new T0.e((ConstraintLayout) inflate, materialButton, materialButton2, materialButton3, textView, textView2, textView3);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i3)));
                    default:
                        int i4 = ResultActivity.f2116A;
                        return new S0.a(resultActivity);
                }
            }
        });
    }

    @Override // g.AbstractActivityC0110i, a.l, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(v().f816a);
        final int intExtra = getIntent().getIntExtra("extra_level", 1);
        int intExtra2 = getIntent().getIntExtra("extra_score", 0);
        int intExtra3 = getIntent().getIntExtra("extra_earned", 0);
        if (getIntent().getBooleanExtra("extra_victory", false)) {
            v().f821g.setText(getString(R.string.victory_title));
            v().f819e.setText(getString(R.string.victory_message, Integer.valueOf(intExtra)));
            v().f820f.setText(getString(R.string.result_score, Integer.valueOf(intExtra2)));
            d dVar = this.f2118z;
            a aVar = (a) dVar.a();
            aVar.getClass();
            int i = intExtra + 1;
            if (i > 15) {
                i = 15;
            }
            SharedPreferences sharedPreferences = aVar.f800a;
            if (i > a0.e(sharedPreferences.getInt("unlocked_level", 1), 1, 15)) {
                g1.d.d(sharedPreferences, "prefs");
                SharedPreferences.Editor edit = sharedPreferences.edit();
                edit.putInt("unlocked_level", i);
                edit.apply();
            }
            a aVar2 = (a) dVar.a();
            if (intExtra3 <= 0) {
                aVar2.getClass();
            } else {
                SharedPreferences sharedPreferences2 = aVar2.f800a;
                g1.d.d(sharedPreferences2, "prefs");
                SharedPreferences.Editor edit2 = sharedPreferences2.edit();
                edit2.putInt("total_crystals", aVar2.f800a.getInt("total_crystals", 0) + intExtra3);
                edit2.apply();
            }
            SharedPreferences sharedPreferences3 = ((a) dVar.a()).f800a;
            if (intExtra2 > sharedPreferences3.getInt("best_score", 0)) {
                SharedPreferences.Editor edit3 = sharedPreferences3.edit();
                edit3.putInt("best_score", intExtra2);
                edit3.apply();
            }
            v().f818c.setVisibility(intExtra < 15 ? 0 : 8);
            final int i2 = 0;
            v().f818c.setOnClickListener(new View.OnClickListener(this) { // from class: V0.l

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ ResultActivity f948b;

                {
                    this.f948b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i3 = intExtra;
                    ResultActivity resultActivity = this.f948b;
                    switch (i2) {
                        case 0:
                            int i4 = ResultActivity.f2116A;
                            g1.d.e(resultActivity, "context");
                            Intent putExtra = new Intent(resultActivity, (Class<?>) GameActivity.class).putExtra("extra_level", i3 + 1);
                            g1.d.d(putExtra, "putExtra(...)");
                            resultActivity.startActivity(putExtra);
                            resultActivity.finish();
                            break;
                        default:
                            int i5 = ResultActivity.f2116A;
                            g1.d.e(resultActivity, "context");
                            Intent putExtra2 = new Intent(resultActivity, (Class<?>) GameActivity.class).putExtra("extra_level", i3);
                            g1.d.d(putExtra2, "putExtra(...)");
                            resultActivity.startActivity(putExtra2);
                            resultActivity.finish();
                            break;
                    }
                }
            });
        } else {
            v().f821g.setText(getString(R.string.defeat_title));
            v().f819e.setText(getString(R.string.defeat_message));
            v().f820f.setText(getString(R.string.result_score, Integer.valueOf(intExtra2)));
            v().f818c.setVisibility(8);
        }
        final int i3 = 1;
        v().d.setOnClickListener(new View.OnClickListener(this) { // from class: V0.l

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ResultActivity f948b;

            {
                this.f948b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i32 = intExtra;
                ResultActivity resultActivity = this.f948b;
                switch (i3) {
                    case 0:
                        int i4 = ResultActivity.f2116A;
                        g1.d.e(resultActivity, "context");
                        Intent putExtra = new Intent(resultActivity, (Class<?>) GameActivity.class).putExtra("extra_level", i32 + 1);
                        g1.d.d(putExtra, "putExtra(...)");
                        resultActivity.startActivity(putExtra);
                        resultActivity.finish();
                        break;
                    default:
                        int i5 = ResultActivity.f2116A;
                        g1.d.e(resultActivity, "context");
                        Intent putExtra2 = new Intent(resultActivity, (Class<?>) GameActivity.class).putExtra("extra_level", i32);
                        g1.d.d(putExtra2, "putExtra(...)");
                        resultActivity.startActivity(putExtra2);
                        resultActivity.finish();
                        break;
                }
            }
        });
        v().f817b.setOnClickListener(new ViewOnClickListenerC0025a(5, this));
    }

    public final e v() {
        return (e) this.f2117y.a();
    }
}
