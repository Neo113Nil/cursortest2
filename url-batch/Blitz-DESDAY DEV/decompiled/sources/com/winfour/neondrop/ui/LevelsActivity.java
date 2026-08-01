package com.winfour.neondrop.ui;

import O0.ViewOnClickListenerC0025a;
import S0.a;
import T0.c;
import V0.h;
import V0.i;
import W0.d;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import com.winfour.neondrop.R;
import com.winfour.neondrop.ui.LevelsActivity;
import f1.InterfaceC0099a;
import g.AbstractActivityC0110i;
import m.C0227a;

/* loaded from: classes.dex */
public final class LevelsActivity extends AbstractActivityC0110i {

    /* renamed from: A, reason: collision with root package name */
    public static final /* synthetic */ int f2113A = 0;

    /* renamed from: y, reason: collision with root package name */
    public final d f2114y;

    /* renamed from: z, reason: collision with root package name */
    public final d f2115z;

    public LevelsActivity() {
        final int i = 0;
        this.f2114y = new d(new InterfaceC0099a(this) { // from class: V0.j

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ LevelsActivity f944b;

            {
                this.f944b = this;
            }

            @Override // f1.InterfaceC0099a
            public final Object a() {
                LevelsActivity levelsActivity = this.f944b;
                switch (i) {
                    case 0:
                        int i2 = LevelsActivity.f2113A;
                        View inflate = levelsActivity.getLayoutInflater().inflate(R.layout.activity_levels, (ViewGroup) null, false);
                        int i3 = R.id.backButton;
                        MaterialButton materialButton = (MaterialButton) C0227a.g(inflate, R.id.backButton);
                        if (materialButton != null) {
                            i3 = R.id.levelsList;
                            RecyclerView recyclerView = (RecyclerView) C0227a.g(inflate, R.id.levelsList);
                            if (recyclerView != null) {
                                i3 = R.id.levelsTitle;
                                if (((TextView) C0227a.g(inflate, R.id.levelsTitle)) != null) {
                                    i3 = R.id.topBar;
                                    if (((LinearLayout) C0227a.g(inflate, R.id.topBar)) != null) {
                                        return new T0.c((ConstraintLayout) inflate, materialButton, recyclerView);
                                    }
                                }
                            }
                        }
                        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i3)));
                    default:
                        int i4 = LevelsActivity.f2113A;
                        return new S0.a(levelsActivity);
                }
            }
        });
        final int i2 = 1;
        this.f2115z = new d(new InterfaceC0099a(this) { // from class: V0.j

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ LevelsActivity f944b;

            {
                this.f944b = this;
            }

            @Override // f1.InterfaceC0099a
            public final Object a() {
                LevelsActivity levelsActivity = this.f944b;
                switch (i2) {
                    case 0:
                        int i22 = LevelsActivity.f2113A;
                        View inflate = levelsActivity.getLayoutInflater().inflate(R.layout.activity_levels, (ViewGroup) null, false);
                        int i3 = R.id.backButton;
                        MaterialButton materialButton = (MaterialButton) C0227a.g(inflate, R.id.backButton);
                        if (materialButton != null) {
                            i3 = R.id.levelsList;
                            RecyclerView recyclerView = (RecyclerView) C0227a.g(inflate, R.id.levelsList);
                            if (recyclerView != null) {
                                i3 = R.id.levelsTitle;
                                if (((TextView) C0227a.g(inflate, R.id.levelsTitle)) != null) {
                                    i3 = R.id.topBar;
                                    if (((LinearLayout) C0227a.g(inflate, R.id.topBar)) != null) {
                                        return new T0.c((ConstraintLayout) inflate, materialButton, recyclerView);
                                    }
                                }
                            }
                        }
                        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i3)));
                    default:
                        int i4 = LevelsActivity.f2113A;
                        return new S0.a(levelsActivity);
                }
            }
        });
    }

    @Override // g.AbstractActivityC0110i, a.l, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        d dVar = this.f2114y;
        setContentView(((c) dVar.a()).f812a);
        ((c) dVar.a()).f813b.setOnClickListener(new ViewOnClickListenerC0025a(4, this));
        ((c) dVar.a()).f814c.setLayoutManager(new LinearLayoutManager(1));
        ((c) dVar.a()).f814c.setAdapter(new h(U0.d.f864a, (a) this.f2115z.a(), new i(this)));
    }
}
