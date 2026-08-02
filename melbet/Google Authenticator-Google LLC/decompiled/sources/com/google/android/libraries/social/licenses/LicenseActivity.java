package com.google.android.libraries.social.licenses;

import android.os.Build;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.text.Layout;
import android.view.MenuItem;
import android.view.View;
import android.widget.ScrollView;
import android.widget.TextView;
import com.google.android.apps.authenticator2.R;
import defpackage.cs;
import defpackage.di;
import defpackage.exf;
import defpackage.exn;
import defpackage.mr;
import defpackage.ni;
import defpackage.xq;
import defpackage.yi;
import defpackage.yq;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class LicenseActivity extends di {
    @Override // defpackage.bg, defpackage.ng, defpackage.cp, android.app.Activity
    public final void onCreate(Bundle bundle) {
        ni.a(this);
        super.onCreate(bundle);
        setContentView(R.layout.libraries_social_licenses_license_activity_appcompat);
        final Toolbar toolbar = (Toolbar) findViewById(R.id.license_toolbar);
        k(toolbar);
        exn exnVar = (exn) getIntent().getParcelableExtra("license");
        if (h() != null) {
            cs h = h();
            String str = exnVar.a;
            h.j(str);
            ArrayList<View> arrayList = new ArrayList<>();
            toolbar.findViewsWithText(arrayList, str, 1);
            if (arrayList.size() == 1) {
                yq.m(arrayList.get(0), true);
            }
            h().s();
            h().v();
            h().u();
        }
        View findViewById = findViewById(R.id.license_activity_root);
        final ScrollView scrollView = (ScrollView) findViewById(R.id.license_activity_scrollview);
        final int paddingLeft = toolbar.getPaddingLeft();
        final int paddingTop = toolbar.getPaddingTop();
        final int paddingRight = toolbar.getPaddingRight();
        final int paddingBottom = toolbar.getPaddingBottom();
        final int paddingLeft2 = scrollView.getPaddingLeft();
        final int paddingTop2 = scrollView.getPaddingTop();
        final int paddingRight2 = scrollView.getPaddingRight();
        final int paddingBottom2 = scrollView.getPaddingBottom();
        xq xqVar = new xq() { // from class: exo
            @Override // defpackage.xq
            public final zz a(View view, zz zzVar) {
                vb f = zzVar.f(519);
                int i = f.b;
                int i2 = f.c;
                int i3 = f.d;
                Toolbar.this.setPadding(paddingLeft + i, paddingTop + i2, paddingRight + i3, paddingBottom);
                int i4 = f.e;
                scrollView.setPadding(paddingLeft2 + i, paddingTop2, paddingRight2 + i3, paddingBottom2 + i4);
                zn zmVar = Build.VERSION.SDK_INT >= 36 ? new zm(zzVar) : Build.VERSION.SDK_INT >= 35 ? new zl(zzVar) : Build.VERSION.SDK_INT >= 34 ? new zk(zzVar) : Build.VERSION.SDK_INT >= 31 ? new zj(zzVar) : Build.VERSION.SDK_INT >= 30 ? new zi(zzVar) : Build.VERSION.SDK_INT >= 29 ? new zh(zzVar) : new zg(zzVar);
                zmVar.g(519, vb.d(i, 0, i3, i4));
                return zmVar.a();
            }
        };
        int i = yq.a;
        yi.c(findViewById, xqVar);
        TextView textView = (TextView) findViewById(R.id.license_activity_textview);
        String d = exf.d(this, "third_party_licenses", exnVar.b, exnVar.c);
        if (d == null) {
            finish();
        } else {
            textView.setText(d);
        }
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        finish();
        return true;
    }

    @Override // android.app.Activity
    public final void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        ScrollView scrollView = (ScrollView) findViewById(R.id.license_activity_scrollview);
        int i = bundle.getInt("scroll_pos");
        if (i != 0) {
            scrollView.post(new mr(this, i, scrollView, 8));
        }
    }

    @Override // defpackage.ng, defpackage.cp, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        ScrollView scrollView = (ScrollView) findViewById(R.id.license_activity_scrollview);
        Layout layout = ((TextView) findViewById(R.id.license_activity_textview)).getLayout();
        if (layout != null) {
            bundle.putInt("scroll_pos", layout.getLineStart(layout.getLineForVertical(scrollView.getScrollY())));
        }
    }
}
