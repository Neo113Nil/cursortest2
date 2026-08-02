package com.google.android.libraries.social.licenses;

import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import com.google.android.apps.authenticator2.R;
import defpackage.ae;
import defpackage.by;
import defpackage.di;
import defpackage.exp;
import defpackage.exs;
import defpackage.ni;
import defpackage.yi;
import defpackage.yq;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class LicenseMenuActivity extends di {
    @Override // defpackage.bg, defpackage.ng, defpackage.cp, android.app.Activity
    protected final void onCreate(Bundle bundle) {
        ni.a(this);
        super.onCreate(bundle);
        setContentView(R.layout.libraries_social_licenses_license_menu_activity_appcompat);
        Toolbar toolbar = (Toolbar) findViewById(R.id.license_menu_toolbar);
        k(toolbar);
        CharSequence title = getTitle();
        ArrayList<View> arrayList = new ArrayList<>();
        toolbar.findViewsWithText(arrayList, title, 1);
        if (arrayList.size() == 1) {
            yq.m(arrayList.get(0), true);
        }
        if (h() != null) {
            h().v();
        }
        View findViewById = findViewById(R.id.license_menu_activity_root);
        exp expVar = new exp(toolbar, toolbar.getPaddingLeft(), toolbar.getPaddingTop(), toolbar.getPaddingRight(), toolbar.getPaddingBottom(), 1);
        int i = yq.a;
        yi.c(findViewById, expVar);
        by a = a();
        if (a.c(R.id.license_menu_fragment_container) instanceof exs) {
            return;
        }
        exs exsVar = new exs();
        ae aeVar = new ae(a);
        aeVar.d(R.id.license_menu_fragment_container, exsVar, null, 1);
        aeVar.c();
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        finish();
        return true;
    }
}
