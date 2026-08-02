package com.google.android.libraries.onegoogle.accountmanagement;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import defpackage.dqz;
import defpackage.gzp;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class AddAccountActivity extends Activity {
    private boolean a;

    private final void a(Bundle bundle) {
        this.a = bundle.getBoolean("isAddActivityStarted");
    }

    @Override // android.app.Activity
    protected final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 9) {
            dqz dqzVar = dqz.a;
            if (dqzVar.b) {
                dqzVar.b = false;
                dqzVar.c = gzp.h(Long.valueOf(SystemClock.elapsedRealtime()));
            }
        }
        finish();
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        dqz.a.b = true;
        if (bundle != null) {
            a(bundle);
        }
        if (this.a) {
            return;
        }
        Intent intent = new Intent("android.settings.ADD_ACCOUNT_SETTINGS");
        intent.putExtra("account_types", new String[]{"com.google"});
        startActivityForResult(intent, 9);
        this.a = true;
    }

    @Override // android.app.Activity
    protected final void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        a(bundle);
    }

    @Override // android.app.Activity
    protected final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("isAddActivityStarted", this.a);
    }
}
