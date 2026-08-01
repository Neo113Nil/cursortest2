package com.winfour.neondrop.ui;

import S0.a;
import T0.b;
import W0.d;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.button.MaterialButton;
import com.winfour.neondrop.R;
import com.winfour.neondrop.ui.GameActivity;
import com.winfour.neondrop.ui.HomeActivity;
import com.winfour.neondrop.ui.LevelsActivity;
import com.winfour.neondrop.ui.RulesActivity;
import f1.InterfaceC0099a;
import g.AbstractActivityC0110i;
import h0.a0;
import m.C0227a;

/* loaded from: classes.dex */
public final class HomeActivity extends AbstractActivityC0110i {

    /* renamed from: A, reason: collision with root package name */
    public static final /* synthetic */ int f2110A = 0;

    /* renamed from: y, reason: collision with root package name */
    public final d f2111y;

    /* renamed from: z, reason: collision with root package name */
    public final d f2112z;

    public HomeActivity() {
        final int i = 0;
        this.f2111y = new d(new InterfaceC0099a(this) { // from class: V0.d

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ HomeActivity f932b;

            {
                this.f932b = this;
            }

            @Override // f1.InterfaceC0099a
            public final Object a() {
                HomeActivity homeActivity = this.f932b;
                switch (i) {
                    case 0:
                        int i2 = HomeActivity.f2110A;
                        View inflate = homeActivity.getLayoutInflater().inflate(R.layout.activity_home, (ViewGroup) null, false);
                        int i3 = R.id.crystalsText;
                        TextView textView = (TextView) C0227a.g(inflate, R.id.crystalsText);
                        if (textView != null) {
                            i3 = R.id.levelsButton;
                            MaterialButton materialButton = (MaterialButton) C0227a.g(inflate, R.id.levelsButton);
                            if (materialButton != null) {
                                i3 = R.id.playButton;
                                MaterialButton materialButton2 = (MaterialButton) C0227a.g(inflate, R.id.playButton);
                                if (materialButton2 != null) {
                                    i3 = R.id.rulesButton;
                                    MaterialButton materialButton3 = (MaterialButton) C0227a.g(inflate, R.id.rulesButton);
                                    if (materialButton3 != null) {
                                        i3 = R.id.subtitleText;
                                        if (((TextView) C0227a.g(inflate, R.id.subtitleText)) != null) {
                                            i3 = R.id.titleText;
                                            if (((TextView) C0227a.g(inflate, R.id.titleText)) != null) {
                                                return new T0.b((ConstraintLayout) inflate, textView, materialButton, materialButton2, materialButton3);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i3)));
                    default:
                        int i4 = HomeActivity.f2110A;
                        return new S0.a(homeActivity);
                }
            }
        });
        final int i2 = 1;
        this.f2112z = new d(new InterfaceC0099a(this) { // from class: V0.d

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ HomeActivity f932b;

            {
                this.f932b = this;
            }

            @Override // f1.InterfaceC0099a
            public final Object a() {
                HomeActivity homeActivity = this.f932b;
                switch (i2) {
                    case 0:
                        int i22 = HomeActivity.f2110A;
                        View inflate = homeActivity.getLayoutInflater().inflate(R.layout.activity_home, (ViewGroup) null, false);
                        int i3 = R.id.crystalsText;
                        TextView textView = (TextView) C0227a.g(inflate, R.id.crystalsText);
                        if (textView != null) {
                            i3 = R.id.levelsButton;
                            MaterialButton materialButton = (MaterialButton) C0227a.g(inflate, R.id.levelsButton);
                            if (materialButton != null) {
                                i3 = R.id.playButton;
                                MaterialButton materialButton2 = (MaterialButton) C0227a.g(inflate, R.id.playButton);
                                if (materialButton2 != null) {
                                    i3 = R.id.rulesButton;
                                    MaterialButton materialButton3 = (MaterialButton) C0227a.g(inflate, R.id.rulesButton);
                                    if (materialButton3 != null) {
                                        i3 = R.id.subtitleText;
                                        if (((TextView) C0227a.g(inflate, R.id.subtitleText)) != null) {
                                            i3 = R.id.titleText;
                                            if (((TextView) C0227a.g(inflate, R.id.titleText)) != null) {
                                                return new T0.b((ConstraintLayout) inflate, textView, materialButton, materialButton2, materialButton3);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i3)));
                    default:
                        int i4 = HomeActivity.f2110A;
                        return new S0.a(homeActivity);
                }
            }
        });
    }

    @Override // g.AbstractActivityC0110i, a.l, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        d dVar = this.f2111y;
        setContentView(((b) dVar.a()).f808a);
        final int i = 0;
        ((b) dVar.a()).d.setOnClickListener(new View.OnClickListener(this) { // from class: V0.e

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ HomeActivity f934b;

            {
                this.f934b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HomeActivity homeActivity = this.f934b;
                switch (i) {
                    case 0:
                        int i2 = HomeActivity.f2110A;
                        Intent putExtra = new Intent(homeActivity, (Class<?>) GameActivity.class).putExtra("extra_level", a0.e(((S0.a) homeActivity.f2112z.a()).f800a.getInt("unlocked_level", 1), 1, 15));
                        g1.d.d(putExtra, "putExtra(...)");
                        homeActivity.startActivity(putExtra);
                        break;
                    case 1:
                        int i3 = HomeActivity.f2110A;
                        homeActivity.startActivity(new Intent(homeActivity, (Class<?>) LevelsActivity.class));
                        break;
                    default:
                        int i4 = HomeActivity.f2110A;
                        homeActivity.startActivity(new Intent(homeActivity, (Class<?>) RulesActivity.class));
                        break;
                }
            }
        });
        final int i2 = 1;
        ((b) dVar.a()).f810c.setOnClickListener(new View.OnClickListener(this) { // from class: V0.e

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ HomeActivity f934b;

            {
                this.f934b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HomeActivity homeActivity = this.f934b;
                switch (i2) {
                    case 0:
                        int i22 = HomeActivity.f2110A;
                        Intent putExtra = new Intent(homeActivity, (Class<?>) GameActivity.class).putExtra("extra_level", a0.e(((S0.a) homeActivity.f2112z.a()).f800a.getInt("unlocked_level", 1), 1, 15));
                        g1.d.d(putExtra, "putExtra(...)");
                        homeActivity.startActivity(putExtra);
                        break;
                    case 1:
                        int i3 = HomeActivity.f2110A;
                        homeActivity.startActivity(new Intent(homeActivity, (Class<?>) LevelsActivity.class));
                        break;
                    default:
                        int i4 = HomeActivity.f2110A;
                        homeActivity.startActivity(new Intent(homeActivity, (Class<?>) RulesActivity.class));
                        break;
                }
            }
        });
        final int i3 = 2;
        ((b) dVar.a()).f811e.setOnClickListener(new View.OnClickListener(this) { // from class: V0.e

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ HomeActivity f934b;

            {
                this.f934b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HomeActivity homeActivity = this.f934b;
                switch (i3) {
                    case 0:
                        int i22 = HomeActivity.f2110A;
                        Intent putExtra = new Intent(homeActivity, (Class<?>) GameActivity.class).putExtra("extra_level", a0.e(((S0.a) homeActivity.f2112z.a()).f800a.getInt("unlocked_level", 1), 1, 15));
                        g1.d.d(putExtra, "putExtra(...)");
                        homeActivity.startActivity(putExtra);
                        break;
                    case 1:
                        int i32 = HomeActivity.f2110A;
                        homeActivity.startActivity(new Intent(homeActivity, (Class<?>) LevelsActivity.class));
                        break;
                    default:
                        int i4 = HomeActivity.f2110A;
                        homeActivity.startActivity(new Intent(homeActivity, (Class<?>) RulesActivity.class));
                        break;
                }
            }
        });
    }

    @Override // g.AbstractActivityC0110i, android.app.Activity
    public final void onResume() {
        super.onResume();
        ((b) this.f2111y.a()).f809b.setText(getString(R.string.crystals_label, Integer.valueOf(((a) this.f2112z.a()).f800a.getInt("total_crystals", 0))));
    }
}
