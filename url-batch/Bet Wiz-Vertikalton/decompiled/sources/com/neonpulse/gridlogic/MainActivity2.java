package com.neonpulse.gridlogic;

import android.content.Intent;
import android.os.Bundle;
import g.AbstractActivityC0132i;

/* loaded from: classes.dex */
public final class MainActivity2 extends AbstractActivityC0132i {
    @Override // g.AbstractActivityC0132i, a.l, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        startActivity(new Intent(this, (Class<?>) HomeActivity.class));
        finish();
    }
}
