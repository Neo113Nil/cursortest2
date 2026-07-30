package com.majelw.libystne;

import android.os.Bundle;
import android.util.Log;
import defpackage.hf0;
import defpackage.ij2;
import defpackage.ju0;
import defpackage.my;
import defpackage.re;
import defpackage.yx;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class MainActivity2 extends re {
    public static final /* synthetic */ int n = 0;

    @Override // defpackage.kr0, defpackage.xx, defpackage.wx, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        hf0.a(this);
        boolean z = (bundle != null && bundle.getBoolean("state_open_main")) || getIntent().getBooleanExtra("extra_open_main", false) || (getSharedPreferences("template_session", 0).getBoolean("main_entered", false) && getSharedPreferences("template_session", 0).getBoolean("photo_pick_in_progress", false));
        Log.d("MainActivity2", "onCreate initialMain=" + z + " savedState=" + (bundle != null));
        if (z) {
            ij2.m(this, true);
        }
        yx.a(this, new my(-1158625569, new ju0(z, this), true));
    }

    @Override // defpackage.xx, defpackage.wx, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        bundle.getClass();
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("state_open_main", getIntent().getBooleanExtra("extra_open_main", false) || getSharedPreferences("template_session", 0).getBoolean("main_entered", false));
    }
}
