package com.winworm.neongrid.ui;

import M0.ViewOnClickListenerC0028a;
import Q0.a;
import R0.c;
import T0.f;
import U0.e;
import V0.i;
import V0.s;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import com.winworm.neongrid.R;
import com.winworm.neongrid.ui.LevelsActivity;
import f1.InterfaceC0090a;
import g.AbstractActivityC0108i;
import i0.g;
import java.util.Iterator;
import java.util.LinkedHashMap;
import k1.b;

/* loaded from: classes.dex */
public final class LevelsActivity extends AbstractActivityC0108i {

    /* renamed from: B, reason: collision with root package name */
    public static final /* synthetic */ int f2054B = 0;

    /* renamed from: A, reason: collision with root package name */
    public final e f2055A;

    /* renamed from: y, reason: collision with root package name */
    public final e f2056y;

    /* renamed from: z, reason: collision with root package name */
    public final e f2057z;

    public LevelsActivity() {
        final int i = 0;
        this.f2056y = new e(new InterfaceC0090a(this) { // from class: T0.g

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ LevelsActivity f838b;

            {
                this.f838b = this;
            }

            @Override // f1.InterfaceC0090a
            public final Object b() {
                LevelsActivity levelsActivity = this.f838b;
                switch (i) {
                    case 0:
                        int i2 = LevelsActivity.f2054B;
                        View inflate = levelsActivity.getLayoutInflater().inflate(R.layout.activity_levels, (ViewGroup) null, false);
                        int i3 = R.id.backButton;
                        MaterialButton materialButton = (MaterialButton) i0.g.h(inflate, R.id.backButton);
                        if (materialButton != null) {
                            i3 = R.id.levelsRecycler;
                            RecyclerView recyclerView = (RecyclerView) i0.g.h(inflate, R.id.levelsRecycler);
                            if (recyclerView != null) {
                                return new R0.c((LinearLayout) inflate, materialButton, recyclerView);
                            }
                        }
                        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i3)));
                    case 1:
                        int i4 = LevelsActivity.f2054B;
                        return new Q0.a(levelsActivity);
                    default:
                        int i5 = LevelsActivity.f2054B;
                        return new f(new h(levelsActivity));
                }
            }
        });
        final int i2 = 1;
        this.f2057z = new e(new InterfaceC0090a(this) { // from class: T0.g

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ LevelsActivity f838b;

            {
                this.f838b = this;
            }

            @Override // f1.InterfaceC0090a
            public final Object b() {
                LevelsActivity levelsActivity = this.f838b;
                switch (i2) {
                    case 0:
                        int i22 = LevelsActivity.f2054B;
                        View inflate = levelsActivity.getLayoutInflater().inflate(R.layout.activity_levels, (ViewGroup) null, false);
                        int i3 = R.id.backButton;
                        MaterialButton materialButton = (MaterialButton) i0.g.h(inflate, R.id.backButton);
                        if (materialButton != null) {
                            i3 = R.id.levelsRecycler;
                            RecyclerView recyclerView = (RecyclerView) i0.g.h(inflate, R.id.levelsRecycler);
                            if (recyclerView != null) {
                                return new R0.c((LinearLayout) inflate, materialButton, recyclerView);
                            }
                        }
                        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i3)));
                    case 1:
                        int i4 = LevelsActivity.f2054B;
                        return new Q0.a(levelsActivity);
                    default:
                        int i5 = LevelsActivity.f2054B;
                        return new f(new h(levelsActivity));
                }
            }
        });
        final int i3 = 2;
        this.f2055A = new e(new InterfaceC0090a(this) { // from class: T0.g

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ LevelsActivity f838b;

            {
                this.f838b = this;
            }

            @Override // f1.InterfaceC0090a
            public final Object b() {
                LevelsActivity levelsActivity = this.f838b;
                switch (i3) {
                    case 0:
                        int i22 = LevelsActivity.f2054B;
                        View inflate = levelsActivity.getLayoutInflater().inflate(R.layout.activity_levels, (ViewGroup) null, false);
                        int i32 = R.id.backButton;
                        MaterialButton materialButton = (MaterialButton) i0.g.h(inflate, R.id.backButton);
                        if (materialButton != null) {
                            i32 = R.id.levelsRecycler;
                            RecyclerView recyclerView = (RecyclerView) i0.g.h(inflate, R.id.levelsRecycler);
                            if (recyclerView != null) {
                                return new R0.c((LinearLayout) inflate, materialButton, recyclerView);
                            }
                        }
                        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i32)));
                    case 1:
                        int i4 = LevelsActivity.f2054B;
                        return new Q0.a(levelsActivity);
                    default:
                        int i5 = LevelsActivity.f2054B;
                        return new f(new h(levelsActivity));
                }
            }
        });
    }

    @Override // g.AbstractActivityC0108i, a.l, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        e eVar = this.f2056y;
        setContentView(((c) eVar.a()).f748a);
        ((c) eVar.a()).f749b.setOnClickListener(new ViewOnClickListenerC0028a(3, this));
        ((c) eVar.a()).f750c.setLayoutManager(new GridLayoutManager());
        ((c) eVar.a()).f750c.setAdapter((f) this.f2055A.a());
    }

    @Override // g.AbstractActivityC0108i, android.app.Activity
    public final void onResume() {
        super.onResume();
        k1.c cVar = new k1.c(1, 12, 1);
        int d02 = s.d0(i.x0(cVar));
        if (d02 < 16) {
            d02 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(d02);
        Iterator it = cVar.iterator();
        while (true) {
            b bVar = (b) it;
            boolean z2 = bVar.f2790c;
            e eVar = this.f2057z;
            if (!z2) {
                f fVar = (f) this.f2055A.a();
                int e2 = g.e(((a) eVar.a()).f734a.getInt("max_unlocked_level", 1), 1, 12);
                fVar.getClass();
                fVar.f835e = e2;
                fVar.f836f = linkedHashMap;
                fVar.f2297a.b();
                return;
            }
            Object next = bVar.next();
            int intValue = ((Number) next).intValue();
            a aVar = (a) eVar.a();
            aVar.getClass();
            linkedHashMap.put(next, Integer.valueOf(aVar.f734a.getInt("high_score_level_" + intValue, 0)));
        }
    }
}
