package com.winfour.neondrop;

import android.content.Intent;
import android.os.Bundle;
import com.winfour.neondrop.ui.HomeActivity;
import g.AbstractActivityC0110i;

/* loaded from: classes.dex */
public final class MainActivity2 extends AbstractActivityC0110i {
    @Override // g.AbstractActivityC0110i, a.l, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        startActivity(new Intent(this, (Class<?>) HomeActivity.class));
        finish();
    }
}
