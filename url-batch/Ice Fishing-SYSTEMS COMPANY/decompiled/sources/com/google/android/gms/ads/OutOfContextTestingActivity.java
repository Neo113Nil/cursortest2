package com.google.android.gms.ads;

import V2.b;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.RemoteException;
import android.widget.LinearLayout;
import com.google.android.gms.internal.ads.BinderC3317hd;
import com.icefishing.icefishingliveapp.C5284R;
import q2.C4883d;
import q2.C4903n;
import q2.C4907p;
import q2.InterfaceC4915t0;

/* loaded from: classes.dex */
public final class OutOfContextTestingActivity extends Activity {
    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C4903n c4903n = C4907p.f40108g.f40110b;
        BinderC3317hd binderC3317hd = new BinderC3317hd();
        c4903n.getClass();
        InterfaceC4915t0 interfaceC4915t0 = (InterfaceC4915t0) new C4883d(c4903n, this, binderC3317hd).d(this, false);
        if (interfaceC4915t0 == null) {
            finish();
            return;
        }
        setContentView(C5284R.layout.admob_empty_layout);
        LinearLayout linearLayout = (LinearLayout) findViewById(C5284R.id.layout);
        Intent intent = getIntent();
        if (intent == null) {
            finish();
            return;
        }
        String stringExtra = intent.getStringExtra("adUnit");
        if (stringExtra == null) {
            finish();
            return;
        }
        try {
            interfaceC4915t0.r2(stringExtra, new b(this), new b(linearLayout));
        } catch (RemoteException unused) {
            finish();
        }
    }
}
