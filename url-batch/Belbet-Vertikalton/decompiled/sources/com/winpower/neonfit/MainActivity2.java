package com.winpower.neonfit;

import T0.m;
import U0.d;
import W0.g;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.winpower.neonfit.DashboardActivity;
import com.winpower.neonfit.MainActivity2;
import com.winpower.neonfit.SettingsActivity;
import h.AbstractActivityC0132i;

/* loaded from: classes.dex */
public final class MainActivity2 extends AbstractActivityC0132i {

    /* renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ int f2608z = 0;

    /* renamed from: y, reason: collision with root package name */
    public final g f2609y = new g(new m(this, 1));

    @Override // h.AbstractActivityC0132i, b.l, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        g gVar = this.f2609y;
        setContentView(((d) gVar.a()).f1250a);
        final int i = 0;
        ((d) gVar.a()).f1251b.setOnClickListener(new View.OnClickListener(this) { // from class: T0.o

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MainActivity2 f1187b;

            {
                this.f1187b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MainActivity2 mainActivity2 = this.f1187b;
                switch (i) {
                    case 0:
                        int i2 = MainActivity2.f2608z;
                        mainActivity2.startActivity(new Intent(mainActivity2, (Class<?>) DashboardActivity.class));
                        break;
                    default:
                        int i3 = MainActivity2.f2608z;
                        mainActivity2.startActivity(new Intent(mainActivity2, (Class<?>) SettingsActivity.class));
                        break;
                }
            }
        });
        final int i2 = 1;
        ((d) gVar.a()).f1252c.setOnClickListener(new View.OnClickListener(this) { // from class: T0.o

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MainActivity2 f1187b;

            {
                this.f1187b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MainActivity2 mainActivity2 = this.f1187b;
                switch (i2) {
                    case 0:
                        int i22 = MainActivity2.f2608z;
                        mainActivity2.startActivity(new Intent(mainActivity2, (Class<?>) DashboardActivity.class));
                        break;
                    default:
                        int i3 = MainActivity2.f2608z;
                        mainActivity2.startActivity(new Intent(mainActivity2, (Class<?>) SettingsActivity.class));
                        break;
                }
            }
        });
    }
}
