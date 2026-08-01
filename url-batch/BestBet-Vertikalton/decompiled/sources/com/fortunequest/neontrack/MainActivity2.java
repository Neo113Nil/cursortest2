package com.fortunequest.neontrack;

import android.content.Intent;
import android.os.Bundle;
import g.AbstractActivityC0128i;

/* loaded from: classes.dex */
public final class MainActivity2 extends AbstractActivityC0128i {
    @Override // g.AbstractActivityC0128i, a.l, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        startActivity(new Intent(this, (Class<?>) HomeActivity.class));
        finish();
    }
}
