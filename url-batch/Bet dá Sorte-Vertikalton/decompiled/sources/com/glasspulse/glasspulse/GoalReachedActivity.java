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
import com.glasspulse.glasspulse.GoalReachedActivity;
import com.glasspulse.glasspulse.HomeActivity;
import com.glasspulse.glasspulse.R;
import com.glasspulse.glasspulse.TrackerActivity;
import g.AbstractActivityC0128i;
import k0.z;
import p0.C0268c;
import q0.g;

/* loaded from: classes.dex */
public final class GoalReachedActivity extends AbstractActivityC0128i {

    /* renamed from: A, reason: collision with root package name */
    public static final /* synthetic */ int f1596A = 0;

    /* renamed from: y, reason: collision with root package name */
    public final c f1597y;

    /* renamed from: z, reason: collision with root package name */
    public final c f1598z;

    public GoalReachedActivity() {
        final int i = 0;
        this.f1597y = new c(new InterfaceC0058a(this) { // from class: o0.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ GoalReachedActivity f3366b;

            {
                this.f3366b = this;
            }

            @Override // a1.InterfaceC0058a
            public final Object a() {
                GoalReachedActivity goalReachedActivity = this.f3366b;
                switch (i) {
                    case 0:
                        int i2 = GoalReachedActivity.f1596A;
                        View inflate = goalReachedActivity.getLayoutInflater().inflate(R.layout.activity_victory, (ViewGroup) null, false);
                        int i3 = R.id.btnContinue;
                        Button button = (Button) z.g(inflate, R.id.btnContinue);
                        if (button != null) {
                            i3 = R.id.btnTrackMore;
                            Button button2 = (Button) z.g(inflate, R.id.btnTrackMore);
                            if (button2 != null) {
                                i3 = R.id.victoryBody;
                                TextView textView = (TextView) z.g(inflate, R.id.victoryBody);
                                if (textView != null) {
                                    i3 = R.id.victoryTitle;
                                    if (((TextView) z.g(inflate, R.id.victoryTitle)) != null) {
                                        return new q0.g((FrameLayout) inflate, button, button2, textView);
                                    }
                                }
                            }
                        }
                        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i3)));
                    default:
                        int i4 = GoalReachedActivity.f1596A;
                        return new C0268c(goalReachedActivity);
                }
            }
        });
        final int i2 = 1;
        this.f1598z = new c(new InterfaceC0058a(this) { // from class: o0.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ GoalReachedActivity f3366b;

            {
                this.f3366b = this;
            }

            @Override // a1.InterfaceC0058a
            public final Object a() {
                GoalReachedActivity goalReachedActivity = this.f3366b;
                switch (i2) {
                    case 0:
                        int i22 = GoalReachedActivity.f1596A;
                        View inflate = goalReachedActivity.getLayoutInflater().inflate(R.layout.activity_victory, (ViewGroup) null, false);
                        int i3 = R.id.btnContinue;
                        Button button = (Button) z.g(inflate, R.id.btnContinue);
                        if (button != null) {
                            i3 = R.id.btnTrackMore;
                            Button button2 = (Button) z.g(inflate, R.id.btnTrackMore);
                            if (button2 != null) {
                                i3 = R.id.victoryBody;
                                TextView textView = (TextView) z.g(inflate, R.id.victoryBody);
                                if (textView != null) {
                                    i3 = R.id.victoryTitle;
                                    if (((TextView) z.g(inflate, R.id.victoryTitle)) != null) {
                                        return new q0.g((FrameLayout) inflate, button, button2, textView);
                                    }
                                }
                            }
                        }
                        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i3)));
                    default:
                        int i4 = GoalReachedActivity.f1596A;
                        return new C0268c(goalReachedActivity);
                }
            }
        });
    }

    @Override // g.AbstractActivityC0128i, a.l, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        c cVar = this.f1597y;
        setContentView(((g) cVar.a()).f3493a);
        TextView textView = ((g) cVar.a()).d;
        c cVar2 = this.f1598z;
        C0268c c0268c = (C0268c) cVar2.a();
        c0268c.a();
        Integer valueOf = Integer.valueOf(c0268c.f3420a.getInt("today_intake_ml", 0));
        C0268c c0268c2 = (C0268c) cVar2.a();
        c0268c2.a();
        textView.setText(getString(R.string.victory_body, valueOf, Integer.valueOf(c0268c2.f3420a.getInt("streak_days", 0))));
        final int i = 0;
        ((g) cVar.a()).f3494b.setOnClickListener(new View.OnClickListener(this) { // from class: o0.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ GoalReachedActivity f3368b;

            {
                this.f3368b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GoalReachedActivity goalReachedActivity = this.f3368b;
                switch (i) {
                    case 0:
                        int i2 = GoalReachedActivity.f1596A;
                        Intent intent = new Intent(goalReachedActivity, (Class<?>) HomeActivity.class);
                        intent.setFlags(603979776);
                        goalReachedActivity.startActivity(intent);
                        goalReachedActivity.finish();
                        break;
                    default:
                        int i3 = GoalReachedActivity.f1596A;
                        goalReachedActivity.startActivity(new Intent(goalReachedActivity, (Class<?>) TrackerActivity.class));
                        goalReachedActivity.finish();
                        break;
                }
            }
        });
        final int i2 = 1;
        ((g) cVar.a()).f3495c.setOnClickListener(new View.OnClickListener(this) { // from class: o0.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ GoalReachedActivity f3368b;

            {
                this.f3368b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GoalReachedActivity goalReachedActivity = this.f3368b;
                switch (i2) {
                    case 0:
                        int i22 = GoalReachedActivity.f1596A;
                        Intent intent = new Intent(goalReachedActivity, (Class<?>) HomeActivity.class);
                        intent.setFlags(603979776);
                        goalReachedActivity.startActivity(intent);
                        goalReachedActivity.finish();
                        break;
                    default:
                        int i3 = GoalReachedActivity.f1596A;
                        goalReachedActivity.startActivity(new Intent(goalReachedActivity, (Class<?>) TrackerActivity.class));
                        goalReachedActivity.finish();
                        break;
                }
            }
        });
    }
}
