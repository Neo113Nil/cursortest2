package defpackage;

import android.content.Intent;
import android.net.Uri;
import android.view.View;
import com.google.android.apps.authenticator2.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class buw implements gbj {
    final /* synthetic */ bvm a;

    public buw(bvm bvmVar) {
        this.a = bvmVar;
    }

    @Override // defpackage.gbj
    public final /* bridge */ /* synthetic */ void a(Object obj, Throwable th) {
        if (th instanceof cal) {
            Throwable cause = th.getCause();
            if (cause instanceof cbl) {
                ((hkf) ((hkf) ((hkf) bvm.a.g()).h(cause)).i("com/google/android/apps/authenticator2/main/OtpListFragmentPeer$AddOtpToPassboxViaQrCodeFutureCallback", "onFailure", (char) 1362, "OtpListFragmentPeer.java")).s("Otp code migration attempted from main fragment.");
                fhm fhmVar = new fhm(this.a.e, R.style.ThemeOverlay_GoogleMaterial3_MaterialAlertDialog_Centered);
                fhmVar.s(R.string.error);
                fhmVar.l(R.string.error_migration_message);
                fhmVar.q(R.string.error_qr_ok, new bul(3));
                fhmVar.j(R.drawable.warning_error_color);
                fhmVar.i();
                return;
            }
            if (cause instanceof cbj) {
                ((hkf) ((hkf) ((hkf) bvm.a.g()).h(cause)).i("com/google/android/apps/authenticator2/main/OtpListFragmentPeer$AddOtpToPassboxViaQrCodeFutureCallback", "onFailure", (char) 1372, "OtpListFragmentPeer.java")).s("Fido QR code scanned from main fragment.");
                final String str = ((cbj) cause).a;
                buf bufVar = this.a.c;
                fpm m = fpm.m(bufVar.J(), R.string.use_passkey_text, -2);
                m.l(bvm.i(bufVar));
                m.o(R.string.continue_text, new View.OnClickListener() { // from class: buv
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        hoq.am(buw.this.a.c, new Intent("android.intent.action.VIEW").setData(Uri.parse(str)));
                    }
                });
                m.g();
                return;
            }
            if (!(cause instanceof cbk)) {
                ((hkf) ((hkf) ((hkf) bvm.a.g()).h(th)).i("com/google/android/apps/authenticator2/main/OtpListFragmentPeer$AddOtpToPassboxViaQrCodeFutureCallback", "onFailure", (char) 1396, "OtpListFragmentPeer.java")).s("Otp not added successfully to the local database");
                bvm bvmVar = this.a;
                bvmVar.q(bvmVar.c.bs().getString(R.string.something_went_wrong));
                return;
            }
            ((hkf) ((hkf) ((hkf) bvm.a.g()).h(th)).i("com/google/android/apps/authenticator2/main/OtpListFragmentPeer$AddOtpToPassboxViaQrCodeFutureCallback", "onFailure", (char) 1385, "OtpListFragmentPeer.java")).s("Otp could not be created from an invalid QR code during scanning.");
            fhm fhmVar2 = new fhm(this.a.e, R.style.ThemeOverlay_GoogleMaterial3_MaterialAlertDialog_Centered);
            fhmVar2.s(R.string.error);
            fhmVar2.l(R.string.error_qr_message);
            fhmVar2.q(R.string.error_qr_ok, new bul(4));
            fhmVar2.j(R.drawable.warning_error_color);
            fhmVar2.i();
        }
    }

    @Override // defpackage.gbj
    public final /* bridge */ /* synthetic */ void b(Object obj, Object obj2) {
    }

    @Override // defpackage.gbj
    public final /* synthetic */ void c() {
    }
}
