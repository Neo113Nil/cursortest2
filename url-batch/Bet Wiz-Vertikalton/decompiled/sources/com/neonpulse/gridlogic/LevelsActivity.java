package com.neonpulse.gridlogic;

import A.b;
import L0.ViewOnClickListenerC0025a;
import Q0.a;
import R0.c;
import V0.d;
import W0.i;
import android.content.Intent;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.neonpulse.gridlogic.GameplayActivity;
import com.neonpulse.gridlogic.LevelsActivity;
import com.neonpulse.gridlogic.R;
import d1.InterfaceC0081a;
import g.AbstractActivityC0132i;
import j0.AbstractC0142a;
import l.C0237q;

/* loaded from: classes.dex */
public final class LevelsActivity extends AbstractActivityC0132i {

    /* renamed from: A, reason: collision with root package name */
    public static final /* synthetic */ int f1976A = 0;

    /* renamed from: y, reason: collision with root package name */
    public final d f1977y;

    /* renamed from: z, reason: collision with root package name */
    public final d f1978z;

    public LevelsActivity() {
        final int i = 0;
        this.f1977y = new d(new InterfaceC0081a(this) { // from class: O0.f

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ LevelsActivity f678b;

            {
                this.f678b = this;
            }

            @Override // d1.InterfaceC0081a
            public final Object a() {
                LevelsActivity levelsActivity = this.f678b;
                switch (i) {
                    case 0:
                        int i2 = LevelsActivity.f1976A;
                        View inflate = levelsActivity.getLayoutInflater().inflate(R.layout.activity_levels, (ViewGroup) null, false);
                        int i3 = R.id.btnBack;
                        Button button = (Button) AbstractC0142a.f(inflate, R.id.btnBack);
                        if (button != null) {
                            i3 = R.id.levelsContainer;
                            LinearLayout linearLayout = (LinearLayout) AbstractC0142a.f(inflate, R.id.levelsContainer);
                            if (linearLayout != null) {
                                return new R0.c((FrameLayout) inflate, button, linearLayout);
                            }
                        }
                        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i3)));
                    default:
                        int i4 = LevelsActivity.f1976A;
                        return new Q0.a(levelsActivity);
                }
            }
        });
        final int i2 = 1;
        this.f1978z = new d(new InterfaceC0081a(this) { // from class: O0.f

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ LevelsActivity f678b;

            {
                this.f678b = this;
            }

            @Override // d1.InterfaceC0081a
            public final Object a() {
                LevelsActivity levelsActivity = this.f678b;
                switch (i2) {
                    case 0:
                        int i22 = LevelsActivity.f1976A;
                        View inflate = levelsActivity.getLayoutInflater().inflate(R.layout.activity_levels, (ViewGroup) null, false);
                        int i3 = R.id.btnBack;
                        Button button = (Button) AbstractC0142a.f(inflate, R.id.btnBack);
                        if (button != null) {
                            i3 = R.id.levelsContainer;
                            LinearLayout linearLayout = (LinearLayout) AbstractC0142a.f(inflate, R.id.levelsContainer);
                            if (linearLayout != null) {
                                return new R0.c((FrameLayout) inflate, button, linearLayout);
                            }
                        }
                        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i3)));
                    default:
                        int i4 = LevelsActivity.f1976A;
                        return new Q0.a(levelsActivity);
                }
            }
        });
    }

    @Override // g.AbstractActivityC0132i, a.l, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        d dVar = this.f1977y;
        setContentView(((c) dVar.a()).f740a);
        t();
        ((c) dVar.a()).f741b.setOnClickListener(new ViewOnClickListenerC0025a(4, this));
    }

    @Override // g.AbstractActivityC0132i, android.app.Activity
    public final void onResume() {
        super.onResume();
        ((c) this.f1977y.a()).f742c.removeAllViews();
        t();
    }

    public final void t() {
        int i = ((a) this.f1978z.a()).f727a.getInt("unlocked_level", 1);
        LinearLayout linearLayout = ((c) this.f1977y.a()).f742c;
        for (V0.c cVar : i.l0(new V0.c("Easy", new i1.c(1, 5, 1)), new V0.c("Medium", new i1.c(6, 10, 1)), new V0.c("Hard", new i1.c(11, 15, 1)))) {
            String str = (String) cVar.f872a;
            i1.c cVar2 = (i1.c) cVar.f873b;
            TextView textView = new TextView(this);
            textView.setText(str);
            textView.setTextColor(b.a(this, R.color.neon_cyan));
            textView.setTextSize(18.0f);
            textView.setGravity(17);
            textView.setPadding(0, u(12), 0, u(8));
            linearLayout.addView(textView);
            LinearLayout linearLayout2 = new LinearLayout(this);
            linearLayout2.setOrientation(0);
            linearLayout2.setGravity(17);
            final int i2 = cVar2.f2518a;
            int i3 = cVar2.f2519b;
            if (i2 <= i3) {
                while (true) {
                    final boolean z2 = i2 > i;
                    C0237q c0237q = new C0237q(this, null);
                    c0237q.setText(z2 ? "—" : String.valueOf(i2));
                    c0237q.setEnabled(!z2);
                    c0237q.setMinHeight(u(48));
                    c0237q.setMinimumHeight(u(48));
                    c0237q.setTextColor(b.a(this, z2 ? R.color.locked_gray : R.color.neon_cyan));
                    c0237q.setBackground(A.a.b(this, z2 ? R.drawable.level_btn_locked : R.drawable.level_btn_bg));
                    c0237q.setBackgroundTintList(null);
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(u(52), u(52));
                    layoutParams.setMargins(u(6), 0, u(6), 0);
                    c0237q.setLayoutParams(layoutParams);
                    c0237q.setOnClickListener(new View.OnClickListener() { // from class: O0.g
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            int i4 = LevelsActivity.f1976A;
                            if (z2) {
                                return;
                            }
                            LevelsActivity levelsActivity = this;
                            Intent intent = new Intent(levelsActivity, (Class<?>) GameplayActivity.class);
                            intent.putExtra("level", i2);
                            intent.putExtra("lives", 3);
                            intent.putExtra("score", 0);
                            levelsActivity.startActivity(intent);
                        }
                    });
                    linearLayout2.addView(c0237q);
                    if (i2 != i3) {
                        i2++;
                    }
                }
            }
            linearLayout.addView(linearLayout2);
        }
    }

    public final int u(int i) {
        return (int) TypedValue.applyDimension(1, i, getResources().getDisplayMetrics());
    }
}
