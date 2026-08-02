package com.google.android.libraries.androidatgoogle.privacy.settings;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import com.google.android.apps.authenticator2.R;
import defpackage.ae;
import defpackage.agf;
import defpackage.cs;
import defpackage.dfh;
import defpackage.dfj;
import defpackage.dfk;
import defpackage.di;
import defpackage.fhk;
import defpackage.koi;
import defpackage.ksj;
import defpackage.ksx;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class PrivacyScreenSettingsActivity extends di {
    private final koi o;

    public PrivacyScreenSettingsActivity() {
        dfh dfhVar = new dfh(this, 0);
        int i = ksx.a;
        this.o = new agf(new ksj(dfk.class), new dfh(this, 2), dfhVar, new dfh(this, 3));
    }

    @Override // android.app.Activity
    public final void finish() {
        if (((dfk) this.o.a()).a) {
            Intent intent = new Intent("android.intent.action.MAIN");
            intent.addCategory("android.intent.category.LAUNCHER");
            intent.setPackage(getPackageName());
            intent.addFlags(268468224);
            startActivity(getIntent());
        }
        super.finish();
    }

    @Override // defpackage.bg, defpackage.ng, defpackage.cp, android.app.Activity
    protected final void onCreate(Bundle bundle) {
        Intent intent = getIntent();
        int intExtra = intent != null ? intent.getIntExtra("aag_privacy_activity_theme", 0) : 0;
        if (intExtra != 0) {
            setTheme(intExtra);
        }
        Intent intent2 = getIntent();
        if (intent2 == null || intent2.getBooleanExtra("aag_privacy_dynamic_colors", true)) {
            fhk.a(this);
        }
        super.onCreate(bundle);
        setContentView(R.layout.aag_privacy_settings_activity);
        k((Toolbar) findViewById(R.id.settings_actionbar));
        cs h = h();
        if (h == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        h.v();
        if (bundle == null) {
            ae aeVar = new ae(a());
            aeVar.d(R.id.settings_container, new dfj(), null, 1);
            aeVar.c();
        }
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        menuItem.getClass();
        f().c();
        return true;
    }
}
