package defpackage;

import android.content.Intent;
import android.widget.RadioButton;
import com.google.android.apps.authenticator2.R;
import com.google.android.apps.authenticator2.addfirstotp.AddFirstOtpActivity;
import com.google.android.apps.authenticator2.enterkey.EnterKeyActivity;
import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bvn implements gxu {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public bvn(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // defpackage.gxu
    public final /* synthetic */ gxv a(gxq gxqVar) {
        switch (this.b) {
            case 0:
                ((hkf) ((hkf) bvm.a.e()).i("com/google/android/apps/authenticator2/main/OtpListFragmentPeer", "onAddFirstOtpEvent", 714, "OtpListFragmentPeer.java")).s("OTP will be added manually");
                bvm bvmVar = (bvm) this.a;
                Intent intent = new Intent(bvmVar.K, (Class<?>) AddFirstOtpActivity.class);
                ftc.a(intent, ((buq) gxqVar).a());
                hoq.an(bvmVar.c, intent, 13);
                break;
            case 1:
                ((hkf) ((hkf) bvm.a.e()).i("com/google/android/apps/authenticator2/main/OtpListFragmentPeer", "onAddOtpManuallyFabEvent", 705, "OtpListFragmentPeer.java")).s("OTP will be added manually");
                bvm bvmVar2 = (bvm) this.a;
                Intent intent2 = new Intent(bvmVar2.K, (Class<?>) EnterKeyActivity.class);
                ftc.a(intent2, ((bus) gxqVar).a());
                hoq.an(bvmVar2.c, intent2, 11);
                break;
            case 2:
                ((hkf) ((hkf) bxq.a.e()).i("com/google/android/apps/authenticator2/migration/MigrationNavigationFragmentPeer", "onExportOtpsEvent", 175, "MigrationNavigationFragmentPeer.java")).s("OTPs will be exported");
                pd pdVar = new pd();
                bxq bxqVar = (bxq) this.a;
                bxo bxoVar = bxqVar.b;
                pdVar.a = bxoVar.bs().getString(R.string.biometric_prompt_title);
                pdVar.b = bxoVar.bs().getString(R.string.biometric_prompt_subtitle);
                pdVar.c();
                pdVar.b();
                bxqVar.g.a(pdVar.a());
                break;
            case 3:
                ((hkf) ((hkf) bxq.a.e()).i("com/google/android/apps/authenticator2/migration/MigrationNavigationFragmentPeer", "onCreateExportQrCodeEvent", 191, "MigrationNavigationFragmentPeer.java")).s("QR code for export of OTPs will be created");
                bzk a = ((bxy) gxqVar).a();
                bxq bxqVar2 = (bxq) this.a;
                bxqVar2.e = a;
                bxqVar2.a(byd.a(bxqVar2.d, bxqVar2.e), "ExportQrCodeFragment");
                break;
            case 4:
                bxq bxqVar3 = (bxq) this.a;
                bxqVar3.a(bza.a(bxqVar3.d), "ImportFragment");
                break;
            case 5:
                bzk a2 = ((bye) gxqVar).a();
                bxq bxqVar4 = (bxq) this.a;
                bxqVar4.e = a2;
                bxqVar4.a(byr.a(bxqVar4.d, bxqVar4.e), "RemoveExportedFragment");
                break;
            case 6:
                byn bynVar = (byn) gxqVar;
                heg hegVar = new heg(4);
                int i = 0;
                int i2 = 0;
                int i3 = 0;
                while (true) {
                    bya byaVar = (bya) this.a;
                    if (i >= byaVar.i.size()) {
                        byaVar.i = hegVar.g();
                        gfy gfyVar = byaVar.f;
                        gfyVar.t(byaVar.i);
                        gfyVar.f(i2);
                        bya.b(byaVar.b).setEnabled(i3 != 0);
                        break;
                    } else {
                        byj byjVar = (byj) byaVar.i.get(i);
                        if (byjVar.b.equals(bynVar.a().b)) {
                            hegVar.h(bynVar.a());
                            if (bynVar.a().c) {
                                i3++;
                            }
                            i2 = i;
                        } else {
                            if (byjVar.c) {
                                i3++;
                            }
                            hegVar.h(byjVar);
                        }
                        i++;
                    }
                }
            case 7:
                byh byhVar = (byh) this.a;
                int i4 = byhVar.d;
                int i5 = byhVar.c;
                if (i5 != i4 - 1) {
                    byhVar.c = i5 + 1;
                    byhVar.c();
                    byh.b(byhVar.a).setVisibility(0);
                    break;
                } else {
                    break;
                }
            case 8:
                byh byhVar2 = (byh) this.a;
                byhVar2.c--;
                byhVar2.c();
                byd bydVar = byhVar2.a;
                byh.a(bydVar).setText(R.string.next);
                if (byhVar2.c == 0) {
                    byh.b(bydVar).setVisibility(8);
                }
                break;
            case 9:
                break;
            case 10:
                break;
            case 11:
                byu byuVar = (byu) this.a;
                byr byrVar = byuVar.b;
                if (!((RadioButton) byrVar.J().findViewById(R.id.rb_2)).isChecked()) {
                    byrVar.E().finish();
                    break;
                } else {
                    bxc bxcVar = (bxc) byuVar.c;
                    cam d = bxcVar.c.d(byuVar.f, Long.valueOf(Instant.now().toEpochMilli()));
                    bxcVar.d(d, bxb.DELETE_OTPS);
                    byuVar.d.i(cbp.k(d.a), byuVar.e);
                    break;
                }
            default:
                bze bzeVar = (bze) this.a;
                bzeVar.f.i(cbp.j(gwu.g(dih.d(bzeVar.e.b())).i(new bwu(3), bzeVar.i)), bzeVar.h);
                break;
        }
        return gxv.a;
    }
}
