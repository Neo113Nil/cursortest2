package com.neonpulse.gridlogic;

import A.b;
import L0.ViewOnClickListenerC0025a;
import O0.k;
import R0.e;
import V0.d;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.neonpulse.gridlogic.GameplayActivity;
import com.neonpulse.gridlogic.ResultActivity;
import g.AbstractActivityC0132i;

/* loaded from: classes.dex */
public final class ResultActivity extends AbstractActivityC0132i {

    /* renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ int f1986z = 0;

    /* renamed from: y, reason: collision with root package name */
    public final d f1987y = new d(new k(this, 0));

    @Override // g.AbstractActivityC0132i, a.l, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(t().f744a);
        boolean booleanExtra = getIntent().getBooleanExtra("won", false);
        final int intExtra = getIntent().getIntExtra("score", 0);
        final int intExtra2 = getIntent().getIntExtra("level", 1);
        final int intExtra3 = getIntent().getIntExtra("lives", 0);
        if (booleanExtra) {
            t().f748f.setText(getString(R.string.victory));
            t().f748f.setTextColor(b.a(this, R.color.neon_green));
            t().f747e.setText(getString(R.string.result_outcome_win));
            if (intExtra2 < 15) {
                t().f746c.setVisibility(0);
                t().f746c.setOnClickListener(new View.OnClickListener() { // from class: O0.l
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i = ResultActivity.f1986z;
                        ResultActivity resultActivity = ResultActivity.this;
                        Intent intent = new Intent(resultActivity, (Class<?>) GameplayActivity.class);
                        intent.putExtra("level", intExtra2 + 1);
                        intent.putExtra("lives", intExtra3);
                        intent.putExtra("score", intExtra);
                        resultActivity.startActivity(intent);
                        resultActivity.finish();
                    }
                });
            }
        } else {
            t().f748f.setText(getString(R.string.defeat));
            t().f748f.setTextColor(b.a(this, R.color.neon_magenta));
            t().f747e.setText(getString(R.string.result_outcome_lose));
            t().f746c.setVisibility(8);
        }
        t().f749g.setText(getString(R.string.result_score, Integer.valueOf(intExtra)));
        t().d.setOnClickListener(new View.OnClickListener() { // from class: O0.m
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i = ResultActivity.f1986z;
                ResultActivity resultActivity = ResultActivity.this;
                Intent intent = new Intent(resultActivity, (Class<?>) GameplayActivity.class);
                intent.putExtra("level", intExtra2);
                intent.putExtra("lives", 3);
                intent.putExtra("score", 0);
                resultActivity.startActivity(intent);
                resultActivity.finish();
            }
        });
        t().f745b.setOnClickListener(new ViewOnClickListenerC0025a(5, this));
    }

    public final e t() {
        return (e) this.f1987y.a();
    }
}
