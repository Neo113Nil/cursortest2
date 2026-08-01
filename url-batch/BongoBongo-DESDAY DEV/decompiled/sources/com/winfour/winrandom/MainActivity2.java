package com.winfour.winrandom;

import android.content.Intent;
import android.os.Bundle;
import com.winfour.winrandom.ui.HomeActivity;
import g.AbstractActivityC0106i;

/* loaded from: classes.dex */
public final class MainActivity2 extends AbstractActivityC0106i {
    @Override // g.AbstractActivityC0106i, a.l, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        startActivity(new Intent(this, (Class<?>) HomeActivity.class));
        finish();
    }
}
