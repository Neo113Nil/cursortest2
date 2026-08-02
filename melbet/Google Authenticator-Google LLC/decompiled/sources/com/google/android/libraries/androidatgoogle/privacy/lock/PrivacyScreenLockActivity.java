package com.google.android.libraries.androidatgoogle.privacy.lock;

import android.content.Context;
import android.hardware.biometrics.BiometricManager;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import com.google.android.apps.authenticator2.R;
import defpackage.ae;
import defpackage.bd;
import defpackage.brn;
import defpackage.dfc;
import defpackage.dfd;
import defpackage.di;
import defpackage.ekx;
import defpackage.ksp;
import defpackage.oy;
import defpackage.oz;
import defpackage.pa;
import defpackage.pb;
import defpackage.pd;
import defpackage.pg;
import defpackage.pj;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class PrivacyScreenLockActivity extends di {
    private ekx o;

    @Override // defpackage.ng, android.app.Activity
    public final void onBackPressed() {
        moveTaskToBack(true);
    }

    @Override // defpackage.bg, defpackage.ng, defpackage.cp, android.app.Activity
    protected final void onCreate(Bundle bundle) {
        oz ozVar;
        CharSequence charSequence;
        BiometricManager.Strings strings;
        super.onCreate(bundle);
        setContentView(R.layout.aag_privacy_lock_activity);
        pb b = pb.b(getApplicationContext());
        CharSequence charSequence2 = null;
        if (Build.VERSION.SDK_INT >= 31) {
            BiometricManager biometricManager = b.a;
            if (biometricManager == null) {
                Log.e("BiometricManager", "Failure in getStrings(). BiometricManager was null.");
                ozVar = null;
            } else {
                ozVar = new oz(oy.a(biometricManager, 33023));
            }
        } else {
            brn brnVar = b.b;
            Context context = (Context) brnVar.a;
            ozVar = new oz(new pa(b, context.getResources(), brnVar.W(), oy.e(context), oy.g(context), brnVar.V()));
        }
        pg pgVar = new pg(this, new dfc(this));
        pd pdVar = new pd();
        pdVar.b();
        pdVar.a = getString(R.string.aag_privacy_lock_prompt_title);
        pdVar.c();
        if (ozVar != null) {
            if (Build.VERSION.SDK_INT < 31 || (strings = ozVar.a) == null) {
                pa paVar = ozVar.b;
                if (paVar == null) {
                    Log.e("BiometricManager", "Failure in Strings.getPromptMessage(). No available string provider.");
                } else if (paVar.c.a(255) == 0) {
                    int i = paVar.b & (-2);
                    charSequence = paVar.a.getString(i != 4 ? i != 8 ? true != pj.c(33023) ? R.string.biometric_prompt_message : R.string.biometric_or_screen_lock_prompt_message : true != pj.c(33023) ? R.string.face_prompt_message : R.string.face_or_screen_lock_prompt_message : true != pj.c(33023) ? R.string.fingerprint_prompt_message : R.string.fingerprint_or_screen_lock_prompt_message);
                } else if ((paVar.b & 1) != 0) {
                    charSequence = paVar.a.getString(R.string.screen_lock_prompt_message);
                }
                charSequence = null;
            } else {
                charSequence = oy.c(strings);
            }
            if (charSequence != null) {
                pdVar.c = charSequence;
            }
        }
        this.o = new ekx(b, ozVar, pgVar, pdVar.a());
        bd d = a().d("PrivacyScreenLockFragment");
        if (d == null) {
            int intExtra = getIntent().getIntExtra("app_icon_res", 0);
            if (intExtra == 0) {
                throw new IllegalArgumentException("App icon resource ID extra was missing or zero");
            }
            dfd dfdVar = new dfd();
            Bundle bundle2 = new Bundle();
            bundle2.putInt("app_icon_res", intExtra);
            dfdVar.ah(bundle2);
            ae aeVar = new ae(a());
            aeVar.d(R.id.lock_fragment_holder, dfdVar, "PrivacyScreenLockFragment", 1);
            aeVar.c();
            d = dfdVar;
        }
        dfd dfdVar2 = (dfd) d;
        ekx ekxVar = this.o;
        if (ekxVar == null) {
            ksp.a("authController");
            ekxVar = null;
        }
        dfdVar2.b = ekxVar;
        Button button = dfdVar2.a;
        if (button != null) {
            ekx ekxVar2 = dfdVar2.b;
            if (ekxVar2 != null) {
                Context context2 = button.getContext();
                context2.getClass();
                charSequence2 = ekxVar2.g(context2);
            }
            button.setText(charSequence2);
        }
    }

    @Override // defpackage.di, defpackage.bg, android.app.Activity
    protected final void onStart() {
        super.onStart();
        ekx ekxVar = this.o;
        if (ekxVar == null) {
            ksp.a("authController");
            ekxVar = null;
        }
        ekxVar.h();
    }
}
