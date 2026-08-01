package com.luckyarcade.spinthrow;

import android.content.Intent;
import android.os.Bundle;
import g.AbstractActivityC0159k;

/* loaded from: classes.dex */
public final class MainActivity2 extends AbstractActivityC0159k {
    @Override // androidx.fragment.app.AbstractActivityC0064v, a.p, z.j, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        startActivity(new Intent(this, (Class<?>) HomeActivity.class));
        finish();
    }
}
