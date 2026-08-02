package defpackage;

import android.content.Intent;
import android.text.TextUtils;
import com.google.android.apps.authenticator2.R;
import com.google.android.apps.authenticator2.editotp.AccountView;
import com.google.android.apps.authenticator2.enterkey.EnterKeyActivity;
import com.google.android.apps.authenticator2.howitworks.GoogleAccountSyncingIntroductionActivity;
import com.google.android.apps.authenticator2.howitworks.HowItWorksActivity;
import j$.time.Instant;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bop implements gxu {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public bop(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // defpackage.gxu
    public final /* synthetic */ gxv a(gxq gxqVar) {
        boolean z;
        boolean z2;
        int i = 6;
        int i2 = 2;
        int i3 = 5;
        int i4 = 1;
        switch (this.b) {
            case 0:
                Object obj = this.a;
                boo booVar = (boo) obj;
                booVar.d.i(new cbp(booVar.e.b(gwu.g(dih.d(booVar.f.b())).i(new bpn(obj, i4), booVar.g)).a), booVar.h);
                return gxv.a;
            case 1:
                ((hkf) ((hkf) boo.a.e()).i("com/google/android/apps/authenticator2/addfirstotp/AddFirstOtpFragmentPeer", "onAddViaEnteringKeyEvent", 146, "AddFirstOtpFragmentPeer.java")).s("OTP will be added manually");
                boo booVar2 = (boo) this.a;
                Intent intent = new Intent(booVar2.i, (Class<?>) EnterKeyActivity.class);
                ftc.a(intent, ((bol) gxqVar).a());
                hoq.an(booVar2.b, intent, 11);
                return gxv.a;
            case 2:
                bqd bqdVar = (bqd) this.a;
                bqd.a((AccountView) bqdVar.a).setChecked(true);
                return new gxv(new bql((bqz) bqdVar.d));
            case 3:
                return new gxv(new bql((bqz) ((bqd) this.a).d));
            case 4:
                bqa bqaVar = (bqa) gxqVar;
                bqw bqwVar = (bqw) this.a;
                int indexOf = bqwVar.n.indexOf(bqaVar.a());
                if (indexOf != bqwVar.r) {
                    bqd.a((AccountView) bqwVar.s.z().a).setChecked(false);
                    bqwVar.r = indexOf;
                    bqwVar.s = (AccountView) bqw.a(bqwVar.c).f(bqwVar.r).a;
                    bqwVar.q = (fuf) hdb.c(bqwVar.m).b(new bqg(bqaVar, i2)).g();
                }
                return gxv.a;
            case 5:
                Object obj2 = this.a;
                bqw bqwVar2 = (bqw) obj2;
                bqs bqsVar = bqwVar2.c;
                String obj3 = bqw.c(bqsVar).getText().toString();
                if (TextUtils.isEmpty(obj3)) {
                    bqw.d(bqsVar).k(bqsVar.R(R.string.otp_name_missing));
                    return gxv.a;
                }
                bqwVar2.q = (fuf) hdb.c(bqwVar2.m).b(new bqg(obj2, 3)).g();
                if (bqwVar2.p.equals(bqwVar2.q)) {
                    bpb b = bqwVar2.o.b();
                    b.e(obj3);
                    b.h(Instant.now().toEpochMilli());
                    bpc a = b.a();
                    bxc bxcVar = (bxc) bqwVar2.d;
                    cam e = bxcVar.c.e(a);
                    bxcVar.d(e, bxb.UPDATE_OTP);
                    bqwVar2.e.i(new cbp(e.a), bqwVar2.k);
                    return gxv.a;
                }
                bpb b2 = bqwVar2.o.b();
                b2.e(obj3);
                b2.h(Instant.now().toEpochMilli());
                b2.i(a.R());
                hvi hviVar = bqwVar2.t.a(bqwVar2.q.a).a(b2.a()).a;
                bpf bpfVar = new bpf(obj2, i3);
                hvl hvlVar = bqwVar2.j;
                bqwVar2.e.i(new cbp(hoq.au(hoq.at(hviVar, bpfVar, hvlVar), new bwu(i4), hvlVar)), bqwVar2.l);
                return gxv.a;
            case 6:
                ((hkf) ((hkf) bri.a.e()).i("com/google/android/apps/authenticator2/enterkey/EnterKeyFragmentPeer", "onAddEnteredOtp", 116, "EnterKeyFragmentPeer.java")).s("Saving manually entered OTP.");
                bri briVar = (bri) this.a;
                bre breVar = briVar.b;
                if (bri.c(breVar).getText().length() == 0) {
                    bri.e(breVar).k(breVar.R(R.string.enter_otp_name_missing));
                    z = false;
                } else {
                    bri.e(breVar).k(null);
                    z = true;
                }
                try {
                } catch (IllegalArgumentException e2) {
                    ((hkf) ((hkf) ((hkf) bri.a.g()).h(e2)).i("com/google/android/apps/authenticator2/enterkey/EnterKeyFragmentPeer", "checkIsSecretKeyValidAndShowAnErrorIfNot", (char) 177, "EnterKeyFragmentPeer.java")).s("Invalid secret input by the user");
                    if ((e2.getCause() instanceof hpv) && e2.getCause().getMessage() != null) {
                        String message = e2.getCause().getMessage();
                        if (message.startsWith("Unrecognized character")) {
                            bri.f(breVar).k(breVar.R(R.string.enter_key_illegal_char));
                        } else if (message.startsWith("Invalid input length")) {
                            bri.f(breVar).k(breVar.R(R.string.enter_key_too_short));
                        }
                    }
                }
                if (hpx.f.h(bri.g(breVar)).length >= 10) {
                    bri.f(breVar).k(null);
                    z2 = true;
                    if (z) {
                    }
                    ((hkf) ((hkf) bri.a.g()).i("com/google/android/apps/authenticator2/enterkey/EnterKeyFragmentPeer", "onAddEnteredOtp", 123, "EnterKeyFragmentPeer.java")).s("Invalid inputs during manually saving an OTP.");
                    return gxv.a;
                }
                bri.f(breVar).k(breVar.R(R.string.enter_key_too_short));
                z2 = false;
                if (z || !z2) {
                    ((hkf) ((hkf) bri.a.g()).i("com/google/android/apps/authenticator2/enterkey/EnterKeyFragmentPeer", "onAddEnteredOtp", 123, "EnterKeyFragmentPeer.java")).s("Invalid inputs during manually saving an OTP.");
                } else {
                    ((hkf) ((hkf) bri.a.e()).i("com/google/android/apps/authenticator2/enterkey/EnterKeyFragmentPeer", "onAddEnteredOtp", 120, "EnterKeyFragmentPeer.java")).s("Valid inputs during manually saving an OTP.");
                    bre breVar2 = briVar.b;
                    String str = true != bri.a(breVar2).getText().toString().equals(breVar2.R(R.string.enter_key_page_add_button_time_based)) ? "hotp" : "totp";
                    bpb bpbVar = new bpb();
                    bpbVar.e(bri.c(breVar2).getText().toString());
                    bpbVar.a = null;
                    bpbVar.g(bri.g(breVar2));
                    bpbVar.f(str);
                    bpbVar.b = str.equals("totp") ? null : 0;
                    bpbVar.i(a.R());
                    bpbVar.h(Instant.now().toEpochMilli());
                    bpbVar.d(false);
                    bpbVar.b(bpc.a.d);
                    bpbVar.c(6);
                    bpbVar.c = null;
                    briVar.c.i(new cbp(briVar.d.a(bpbVar.a()).a), briVar.e);
                }
                return gxv.a;
            case 7:
                ((GoogleAccountSyncingIntroductionActivity) ((brn) this.a).a).finish();
                return gxv.a;
            case 8:
                ((HowItWorksActivity) ((bry) this.a).a).finish();
                return gxv.a;
            case 9:
                bsa bsaVar = (bsa) ((bse) this.a).b;
                int i5 = bse.b(bsaVar).b;
                if (((bsd) gxqVar).a()) {
                    return new gxv(new bsc());
                }
                int i6 = i5 + 1;
                if (i6 == 4) {
                    return new gxv(new bsc());
                }
                bse.b(bsaVar).h(i6);
                return gxv.a;
            case 10:
                bvs bvsVar = (bvs) gxqVar;
                ((hkf) ((hkf) bvm.a.e()).i("com/google/android/apps/authenticator2/main/OtpListFragmentPeer", "onOtpClickedEvent", 723, "OtpListFragmentPeer.java")).s("Otp was clicked.");
                boolean z3 = bvsVar.a().e;
                Object obj4 = this.a;
                if (z3) {
                    bvm bvmVar = (bvm) obj4;
                    bvmVar.q(bvmVar.c.bs().getString(R.string.could_not_create_otp_code));
                } else {
                    ((bvm) obj4).k(bvsVar.a().b.replace(" ", ""));
                }
                return gxv.a;
            case 11:
                bvt bvtVar = (bvt) gxqVar;
                ((hkf) ((hkf) bvm.a.e()).i("com/google/android/apps/authenticator2/main/OtpListFragmentPeer", "onOtpLongClickedEvent", 735, "OtpListFragmentPeer.java")).s("Long click on OTP");
                boolean z4 = bvtVar.a().e;
                Object obj5 = this.a;
                if (z4) {
                    bvm bvmVar2 = (bvm) obj5;
                    bvmVar2.q(bvmVar2.c.bs().getString(R.string.could_not_create_otp_code));
                } else {
                    ((bvm) obj5).k(bvtVar.a().b.replace(" ", ""));
                }
                return gxv.a;
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                bux buxVar = (bux) gxqVar;
                ((hkf) ((hkf) bvm.a.e()).i("com/google/android/apps/authenticator2/main/OtpListFragmentPeer", "onDeleteOtpEvent", 747, "OtpListFragmentPeer.java")).s("OTP will be deleted.");
                Object obj6 = this.a;
                gtt f = ((bvm) obj6).k.f("OtpSoftDeletion", 30);
                try {
                    cam c = ((bvm) obj6).m.c((bpc) hdb.c(((bvm) obj6).F).b(new bqg(buxVar, i)).g(), Instant.now().toEpochMilli());
                    gbi gbiVar = ((bvm) obj6).i;
                    gbiVar.i(new cbp(c.a), ((bvm) obj6).s);
                    gbiVar.i(new cbp(c.b), ((bvm) obj6).t);
                    f.close();
                    return gxv.a;
                } finally {
                }
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                final bvr bvrVar = (bvr) gxqVar;
                bvm bvmVar3 = (bvm) this.a;
                bpc bpcVar = (bpc) hdb.c(bvmVar3.F).b(new gzr() { // from class: bug
                    @Override // defpackage.gzr
                    public final boolean a(Object obj7) {
                        return ((bpc) obj7).g.equals(bvr.this.a().d);
                    }
                }).g();
                bpb b3 = bpcVar.b();
                b3.b = Integer.valueOf(bpcVar.f.intValue() + 1);
                cam e3 = bvmVar3.V.e(b3.a());
                cbp cbpVar = new cbp(e3.a);
                bvk bvkVar = bvmVar3.u;
                gbi gbiVar2 = bvmVar3.i;
                gbiVar2.i(cbpVar, bvkVar);
                gbiVar2.i(new cbp(e3.b), bvmVar3.v);
                return gxv.a;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                int i7 = ((bwf) gxqVar).a;
                Object obj7 = this.a;
                if (i7 == 1) {
                    bvm bvmVar4 = (bvm) obj7;
                    bvmVar4.s(34);
                    cab cabVar = bvmVar4.G;
                    if (cabVar == null || cabVar.b.isEmpty()) {
                        ((hkf) ((hkf) bvm.a.g()).i("com/google/android/apps/authenticator2/main/OtpListFragmentPeer", "performImport", 1405, "OtpListFragmentPeer.java")).s("No staged migration data to import.");
                    } else {
                        gbi gbiVar3 = bvmVar4.i;
                        cad cadVar = bvmVar4.W;
                        cab cabVar2 = bvmVar4.G;
                        cabVar2.getClass();
                        gbiVar3.i(cbp.j(ixl.e(cadVar.c, new cac(cadVar, cabVar2, null))), bvmVar4.y);
                    }
                } else if (i7 == 2) {
                    bvm bvmVar5 = (bvm) obj7;
                    frv frvVar = bvmVar5.d;
                    bvz bvzVar = new bvz();
                    jqq.g(bvzVar);
                    gmk.d(bvzVar, frvVar);
                    bvzVar.p(bvmVar5.c.F(), "discard_staged_import_dialog");
                } else {
                    bvm bvmVar6 = (bvm) obj7;
                    bvmVar6.s(35);
                    bvmVar6.R = true;
                }
                return gxv.a;
            case 15:
                int i8 = ((bwa) gxqVar).a;
                Object obj8 = this.a;
                if (i8 == 1) {
                    bvm bvmVar7 = (bvm) obj8;
                    bvmVar7.s(36);
                    bvmVar7.i.i(cbp.k(bvmVar7.X.a()), bvmVar7.z);
                } else {
                    bvm bvmVar8 = (bvm) obj8;
                    bvmVar8.s(35);
                    bvmVar8.R = true;
                }
                return gxv.a;
            case 16:
                ((hkf) ((hkf) bvm.a.e()).i("com/google/android/apps/authenticator2/main/OtpListFragmentPeer", "onAddOtpFabEvent", 650, "OtpListFragmentPeer.java")).s("FAB for adding an OTP clicked.");
                bvm bvmVar9 = (bvm) this.a;
                if (bvmVar9.O) {
                    bvmVar9.j();
                } else {
                    bvmVar9.l();
                }
                return gxv.a;
            case 17:
                ((hkf) ((hkf) bvm.a.e()).i("com/google/android/apps/authenticator2/main/OtpListFragmentPeer", "onScrimClickEvent", 661, "OtpListFragmentPeer.java")).s("Scrim clicked.");
                ((bvm) this.a).j();
                return gxv.a;
            case 18:
                ((bvm) this.a).p(((bvu) gxqVar).a());
                return gxv.a;
            case 19:
                ((bvm) this.a).m(((bvv) gxqVar).a().d);
                return gxv.a;
            default:
                ((hkf) ((hkf) bvm.a.e()).i("com/google/android/apps/authenticator2/main/OtpListFragmentPeer", "onAddOtpViaQrCodeFabEvent", 697, "OtpListFragmentPeer.java")).s("OTP will be added via QR Code");
                Object obj9 = this.a;
                bvm bvmVar10 = (bvm) obj9;
                cam b4 = bvmVar10.m.b(hoq.au(dih.d(bvmVar10.l.b()), new bpn(obj9, i3), bvmVar10.A));
                cbp cbpVar2 = new cbp(b4.a);
                buu buuVar = bvmVar10.q;
                gbi gbiVar4 = bvmVar10.i;
                gbiVar4.i(cbpVar2, buuVar);
                gbiVar4.i(new cbp(b4.b), bvmVar10.r);
                bvmVar10.j();
                return gxv.a;
        }
    }
}
