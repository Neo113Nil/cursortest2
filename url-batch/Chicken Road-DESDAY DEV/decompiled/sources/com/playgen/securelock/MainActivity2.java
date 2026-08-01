package com.playgen.securelock;

import android.content.Intent;
import android.os.Bundle;
import g.AbstractActivityC0133i;

/* loaded from: classes.dex */
public final class MainActivity2 extends AbstractActivityC0133i {
    @Override // g.AbstractActivityC0133i, a.l, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        startActivity(new Intent(this, (Class<?>) GeneratorActivity.class));
        finish();
    }
}
