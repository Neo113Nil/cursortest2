package com.fortunequest.neontrack;

import X0.f;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.fortunequest.neontrack.DailyQuestActivity;
import com.fortunequest.neontrack.DefeatActivity;
import com.fortunequest.neontrack.HomeActivity;
import g.AbstractActivityC0128i;
import t0.p;
import v0.c;

/* loaded from: classes.dex */
public final class DefeatActivity extends AbstractActivityC0128i {

    /* renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ int f2078z = 0;

    /* renamed from: y, reason: collision with root package name */
    public final f f2079y = new f(new p(this, 0));

    @Override // g.AbstractActivityC0128i, a.l, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        f fVar = this.f2079y;
        setContentView(((c) fVar.a()).f4452a);
        final int i = 0;
        ((c) fVar.a()).f4453b.setOnClickListener(new View.OnClickListener(this) { // from class: t0.o

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ DefeatActivity f4148b;

            {
                this.f4148b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DefeatActivity defeatActivity = this.f4148b;
                switch (i) {
                    case 0:
                        int i2 = DefeatActivity.f2078z;
                        defeatActivity.startActivity(new Intent(defeatActivity, (Class<?>) DailyQuestActivity.class));
                        defeatActivity.finish();
                        break;
                    default:
                        int i3 = DefeatActivity.f2078z;
                        Intent intent = new Intent(defeatActivity, (Class<?>) HomeActivity.class);
                        intent.setFlags(67108864);
                        defeatActivity.startActivity(intent);
                        defeatActivity.finish();
                        break;
                }
            }
        });
        final int i2 = 1;
        ((c) fVar.a()).f4454c.setOnClickListener(new View.OnClickListener(this) { // from class: t0.o

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ DefeatActivity f4148b;

            {
                this.f4148b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DefeatActivity defeatActivity = this.f4148b;
                switch (i2) {
                    case 0:
                        int i22 = DefeatActivity.f2078z;
                        defeatActivity.startActivity(new Intent(defeatActivity, (Class<?>) DailyQuestActivity.class));
                        defeatActivity.finish();
                        break;
                    default:
                        int i3 = DefeatActivity.f2078z;
                        Intent intent = new Intent(defeatActivity, (Class<?>) HomeActivity.class);
                        intent.setFlags(67108864);
                        defeatActivity.startActivity(intent);
                        defeatActivity.finish();
                        break;
                }
            }
        });
    }
}
