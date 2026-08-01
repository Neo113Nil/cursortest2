package com.glasspulse.glasspulse;

import S0.c;
import a1.InterfaceC0058a;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.glasspulse.glasspulse.GoalsActivity;
import com.glasspulse.glasspulse.R;
import g.AbstractActivityC0128i;
import java.util.List;
import k0.z;
import p0.AbstractC0266a;
import p0.C0267b;
import p0.C0268c;
import q0.b;

/* loaded from: classes.dex */
public final class GoalsActivity extends AbstractActivityC0128i {

    /* renamed from: A, reason: collision with root package name */
    public static final /* synthetic */ int f1599A = 0;

    /* renamed from: y, reason: collision with root package name */
    public final c f1600y;

    /* renamed from: z, reason: collision with root package name */
    public final c f1601z;

    public GoalsActivity() {
        final int i = 0;
        this.f1600y = new c(new InterfaceC0058a(this) { // from class: o0.d

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ GoalsActivity f3372b;

            {
                this.f3372b = this;
            }

            @Override // a1.InterfaceC0058a
            public final Object a() {
                GoalsActivity goalsActivity = this.f3372b;
                switch (i) {
                    case 0:
                        int i2 = GoalsActivity.f1599A;
                        View inflate = goalsActivity.getLayoutInflater().inflate(R.layout.activity_levels, (ViewGroup) null, false);
                        int i3 = R.id.btnBack;
                        Button button = (Button) z.g(inflate, R.id.btnBack);
                        if (button != null) {
                            i3 = R.id.btnEasy;
                            Button button2 = (Button) z.g(inflate, R.id.btnEasy);
                            if (button2 != null) {
                                i3 = R.id.btnHard;
                                Button button3 = (Button) z.g(inflate, R.id.btnHard);
                                if (button3 != null) {
                                    i3 = R.id.btnMedium;
                                    Button button4 = (Button) z.g(inflate, R.id.btnMedium);
                                    if (button4 != null) {
                                        i3 = R.id.levelsTitle;
                                        if (((TextView) z.g(inflate, R.id.levelsTitle)) != null) {
                                            return new q0.b((FrameLayout) inflate, button, button2, button3, button4);
                                        }
                                    }
                                }
                            }
                        }
                        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i3)));
                    default:
                        int i4 = GoalsActivity.f1599A;
                        return new C0268c(goalsActivity);
                }
            }
        });
        final int i2 = 1;
        this.f1601z = new c(new InterfaceC0058a(this) { // from class: o0.d

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ GoalsActivity f3372b;

            {
                this.f3372b = this;
            }

            @Override // a1.InterfaceC0058a
            public final Object a() {
                GoalsActivity goalsActivity = this.f3372b;
                switch (i2) {
                    case 0:
                        int i22 = GoalsActivity.f1599A;
                        View inflate = goalsActivity.getLayoutInflater().inflate(R.layout.activity_levels, (ViewGroup) null, false);
                        int i3 = R.id.btnBack;
                        Button button = (Button) z.g(inflate, R.id.btnBack);
                        if (button != null) {
                            i3 = R.id.btnEasy;
                            Button button2 = (Button) z.g(inflate, R.id.btnEasy);
                            if (button2 != null) {
                                i3 = R.id.btnHard;
                                Button button3 = (Button) z.g(inflate, R.id.btnHard);
                                if (button3 != null) {
                                    i3 = R.id.btnMedium;
                                    Button button4 = (Button) z.g(inflate, R.id.btnMedium);
                                    if (button4 != null) {
                                        i3 = R.id.levelsTitle;
                                        if (((TextView) z.g(inflate, R.id.levelsTitle)) != null) {
                                            return new q0.b((FrameLayout) inflate, button, button2, button3, button4);
                                        }
                                    }
                                }
                            }
                        }
                        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i3)));
                    default:
                        int i4 = GoalsActivity.f1599A;
                        return new C0268c(goalsActivity);
                }
            }
        });
    }

    @Override // g.AbstractActivityC0128i, a.l, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        c cVar = this.f1600y;
        setContentView(((b) cVar.a()).f3478a);
        final int i = 0;
        ((b) cVar.a()).f3480c.setOnClickListener(new View.OnClickListener(this) { // from class: o0.c

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ GoalsActivity f3370b;

            {
                this.f3370b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GoalsActivity goalsActivity = this.f3370b;
                switch (i) {
                    case 0:
                        int i2 = GoalsActivity.f1599A;
                        goalsActivity.t(0);
                        break;
                    case 1:
                        int i3 = GoalsActivity.f1599A;
                        goalsActivity.t(1);
                        break;
                    case 2:
                        int i4 = GoalsActivity.f1599A;
                        goalsActivity.t(2);
                        break;
                    default:
                        int i5 = GoalsActivity.f1599A;
                        goalsActivity.finish();
                        break;
                }
            }
        });
        final int i2 = 1;
        ((b) cVar.a()).f3481e.setOnClickListener(new View.OnClickListener(this) { // from class: o0.c

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ GoalsActivity f3370b;

            {
                this.f3370b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GoalsActivity goalsActivity = this.f3370b;
                switch (i2) {
                    case 0:
                        int i22 = GoalsActivity.f1599A;
                        goalsActivity.t(0);
                        break;
                    case 1:
                        int i3 = GoalsActivity.f1599A;
                        goalsActivity.t(1);
                        break;
                    case 2:
                        int i4 = GoalsActivity.f1599A;
                        goalsActivity.t(2);
                        break;
                    default:
                        int i5 = GoalsActivity.f1599A;
                        goalsActivity.finish();
                        break;
                }
            }
        });
        final int i3 = 2;
        ((b) cVar.a()).d.setOnClickListener(new View.OnClickListener(this) { // from class: o0.c

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ GoalsActivity f3370b;

            {
                this.f3370b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GoalsActivity goalsActivity = this.f3370b;
                switch (i3) {
                    case 0:
                        int i22 = GoalsActivity.f1599A;
                        goalsActivity.t(0);
                        break;
                    case 1:
                        int i32 = GoalsActivity.f1599A;
                        goalsActivity.t(1);
                        break;
                    case 2:
                        int i4 = GoalsActivity.f1599A;
                        goalsActivity.t(2);
                        break;
                    default:
                        int i5 = GoalsActivity.f1599A;
                        goalsActivity.finish();
                        break;
                }
            }
        });
        final int i4 = 3;
        ((b) cVar.a()).f3479b.setOnClickListener(new View.OnClickListener(this) { // from class: o0.c

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ GoalsActivity f3370b;

            {
                this.f3370b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GoalsActivity goalsActivity = this.f3370b;
                switch (i4) {
                    case 0:
                        int i22 = GoalsActivity.f1599A;
                        goalsActivity.t(0);
                        break;
                    case 1:
                        int i32 = GoalsActivity.f1599A;
                        goalsActivity.t(1);
                        break;
                    case 2:
                        int i42 = GoalsActivity.f1599A;
                        goalsActivity.t(2);
                        break;
                    default:
                        int i5 = GoalsActivity.f1599A;
                        goalsActivity.finish();
                        break;
                }
            }
        });
    }

    public final void t(int i) {
        C0268c c0268c = (C0268c) this.f1601z.a();
        c0268c.getClass();
        List list = AbstractC0266a.f3416a;
        C0267b c0267b = (C0267b) ((i < 0 || i >= list.size()) ? (C0267b) list.get(1) : list.get(i));
        c0268c.f3420a.edit().putInt("selected_goal", c0267b.f3417a).putInt("daily_goal_ml", c0267b.f3419c).commit();
        startActivity(new Intent(this, (Class<?>) TrackerActivity.class));
        finish();
    }
}
