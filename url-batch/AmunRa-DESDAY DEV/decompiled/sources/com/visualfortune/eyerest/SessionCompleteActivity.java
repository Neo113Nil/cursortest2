package com.visualfortune.eyerest;

import L0.ViewOnClickListenerC0025a;
import P0.f;
import Q0.d;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.visualfortune.eyerest.SessionActivity;
import com.visualfortune.eyerest.SessionCompleteActivity;
import g.AbstractActivityC0131i;

/* loaded from: classes.dex */
public final class SessionCompleteActivity extends AbstractActivityC0131i {

    /* renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ int f1946z = 0;

    /* renamed from: y, reason: collision with root package name */
    public final d f1947y = new d(new O0.d(this, 2));

    @Override // g.AbstractActivityC0131i, a.l, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        d dVar = this.f1947y;
        setContentView(((f) dVar.a()).f656a);
        int intExtra = getIntent().getIntExtra("duration", 0);
        int intExtra2 = getIntent().getIntExtra("exercises", 0);
        final int intExtra3 = getIntent().getIntExtra("routine", 1);
        ((f) dVar.a()).f658c.setText(getString(R.string.session_duration, Integer.valueOf(intExtra / 60), Integer.valueOf(intExtra % 60)));
        ((f) dVar.a()).d.setText(getString(R.string.session_exercises, Integer.valueOf(intExtra2)));
        ((f) dVar.a()).f659e.setOnClickListener(new View.OnClickListener() { // from class: O0.n
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i = SessionCompleteActivity.f1946z;
                SessionCompleteActivity sessionCompleteActivity = SessionCompleteActivity.this;
                sessionCompleteActivity.startActivity(new Intent(sessionCompleteActivity, (Class<?>) SessionActivity.class).putExtra("routine", intExtra3));
                sessionCompleteActivity.finish();
            }
        });
        ((f) dVar.a()).f657b.setOnClickListener(new ViewOnClickListenerC0025a(5, this));
    }
}
