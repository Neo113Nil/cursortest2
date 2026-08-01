package com.visualfortune.eyerest;

import android.content.Intent;
import android.os.Bundle;
import g.AbstractActivityC0131i;

/* loaded from: classes.dex */
public final class MainActivity2 extends AbstractActivityC0131i {
    @Override // g.AbstractActivityC0131i, a.l, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        startActivity(new Intent(this, (Class<?>) HomeActivity.class));
        finish();
    }
}
