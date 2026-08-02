package defpackage;

import android.widget.TextView;
import com.google.android.apps.authenticator2.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class buz implements gex {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public buz(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // defpackage.gex
    public final void a(Throwable th) {
        switch (this.b) {
            case 0:
                ((hkf) ((hkf) ((hkf) bvm.a.g()).h(th)).i("com/google/android/apps/authenticator2/main/OtpListFragmentPeer$GetOtpsOnFragmentStartCallback", "onLoadError", (char) 1515, "OtpListFragmentPeer.java")).s("Could not load otps.");
                break;
            case 1:
                ((hkf) ((hkf) ((hkf) bqw.a.g()).h(th)).i("com/google/android/apps/authenticator2/editotp/EditOtpFragmentPeer$GetAccountsAndOtpToUpdateCallback", "onLoadError", (char) 352, "EditOtpFragmentPeer.java")).s("Could not fetch information to show for the edit page.");
                break;
            case 2:
                bvm bvmVar = (bvm) this.a;
                buf bufVar = bvmVar.c;
                bvmVar.q(bufVar.bs().getString(R.string.something_went_wrong));
                ((hkf) ((hkf) ((hkf) bvm.a.g()).h(th)).i("com/google/android/apps/authenticator2/main/OtpListFragmentPeer$MoveToOfflineStateCallback", "onLoadError", (char) 1668, "OtpListFragmentPeer.java")).s("Could not moved otps to offline mode");
                bvm.e(bufVar).i(false, false);
                bvmVar.N = bvj.DISABLED;
                bvmVar.n();
                break;
            case 3:
                ((hkf) ((hkf) ((hkf) bvm.a.g()).h(th)).i("com/google/android/apps/authenticator2/main/OtpListFragmentPeer$MoveToOnlineStateCallback", "onLoadError", (char) 1629, "OtpListFragmentPeer.java")).s("Could not moved otps to online mode");
                bvm bvmVar2 = (bvm) this.a;
                buf bufVar2 = bvmVar2.c;
                bvmVar2.q(bufVar2.bs().getString(R.string.something_went_wrong));
                bvmVar2.N = bvj.FAILED;
                bvmVar2.n();
                bvm.e(bufVar2).i(false, false);
                break;
            case 4:
                ((hkf) ((hkf) ((hkf) bvm.a.g()).h(th)).i("com/google/android/apps/authenticator2/main/OtpListFragmentPeer$StagedImportDataCallback", "onLoadError", (char) 1485, "OtpListFragmentPeer.java")).s("Could not load staged import data.");
                break;
            case 5:
                bvm.e(((bvm) this.a).c).i(false, false);
                break;
            case 6:
                ((hkf) ((hkf) ((hkf) bvm.a.g()).h(th)).i("com/google/android/apps/authenticator2/main/OtpListFragmentPeer$SyncOtpsOnFragmentStartCallback", "onLoadError", (char) 1566, "OtpListFragmentPeer.java")).s("Did not sync otps");
                bvm.e(((bvm) this.a).c).i(false, false);
                break;
            default:
                fpm.m(((bya) this.a).b.J(), R.string.something_went_wrong, -1).g();
                ((hkf) ((hkf) ((hkf) bya.a.g()).h(th)).i("com/google/android/apps/authenticator2/migration/exports/ExportFragmentPeer$GetOtpsOnFragmentStartCallback", "onLoadError", (char) 221, "ExportFragmentPeer.java")).s("Could not load otps on fragment start.");
                break;
        }
    }

    @Override // defpackage.gex
    public final /* synthetic */ void b(Object obj) {
        switch (this.b) {
            case 0:
                ((hkf) ((hkf) bvm.a.e()).i("com/google/android/apps/authenticator2/main/OtpListFragmentPeer$GetOtpsOnFragmentStartCallback", "onLoaded", 1509, "OtpListFragmentPeer.java")).s("Successfully fetched otps.");
                ((bvm) this.a).o((hel) obj);
                break;
            case 1:
                bqk bqkVar = (bqk) obj;
                hel c = bqkVar.c();
                bqw bqwVar = (bqw) this.a;
                bqwVar.n = c;
                bqwVar.m = bqkVar.b();
                bqwVar.o = bqkVar.a();
                bqwVar.p = (fuf) hdb.c(bqwVar.m).b(new bqg(this, 4)).g();
                bqs bqsVar = bqwVar.c;
                bqw.c(bqsVar).setText(bqwVar.o.b);
                if (!bqwVar.p.b.k.equals("pseudonymous")) {
                    bqwVar.h.t(bqwVar.n);
                    bqwVar.r = 0;
                    bqw.a(bqsVar).getViewTreeObserver().addOnGlobalLayoutListener(new gu(this, 4));
                    break;
                } else {
                    bqw.a(bqsVar).setVisibility(8);
                    ((TextView) bqsVar.J().findViewById(R.id.multiple_accounts_choice_header)).setVisibility(8);
                    ((TextView) bqsVar.J().findViewById(R.id.multiple_accounts_choice_text)).setVisibility(8);
                    break;
                }
            case 2:
                bwp bwpVar = (bwp) obj;
                hkh hkhVar = bvm.a;
                ((hkf) ((hkf) hkhVar.e()).i("com/google/android/apps/authenticator2/main/OtpListFragmentPeer$MoveToOfflineStateCallback", "onLoaded", 1642, "OtpListFragmentPeer.java")).s("Successfully moved otps to offline mode.");
                if (bwpVar.a) {
                    ((hkf) ((hkf) hkhVar.e()).i("com/google/android/apps/authenticator2/main/OtpListFragmentPeer$MoveToOfflineStateCallback", "onLoaded", 1644, "OtpListFragmentPeer.java")).s("Old otps deletion was successful.");
                    Object obj2 = this.a;
                    jkj k = hqs.a.k();
                    if (!k.b.M()) {
                        k.t();
                    }
                    jkp jkpVar = k.b;
                    hqs hqsVar = (hqs) jkpVar;
                    hqsVar.c = 9;
                    hqsVar.b = 1 | hqsVar.b;
                    bvm bvmVar = (bvm) obj2;
                    String str = bvmVar.C;
                    if (!jkpVar.M()) {
                        k.t();
                    }
                    bov bovVar = bvmVar.o;
                    hqs hqsVar2 = (hqs) k.b;
                    str.getClass();
                    hqsVar2.b |= 64;
                    hqsVar2.g = str;
                    bovVar.a((hqs) k.q());
                } else {
                    ((hkf) ((hkf) hkhVar.e()).i("com/google/android/apps/authenticator2/main/OtpListFragmentPeer$MoveToOfflineStateCallback", "onLoaded", 1651, "OtpListFragmentPeer.java")).s("Old otps deletion was not successful.");
                    Object obj3 = this.a;
                    jkj k2 = hqs.a.k();
                    if (!k2.b.M()) {
                        k2.t();
                    }
                    jkp jkpVar2 = k2.b;
                    hqs hqsVar3 = (hqs) jkpVar2;
                    hqsVar3.c = 13;
                    hqsVar3.b = 1 | hqsVar3.b;
                    bvm bvmVar2 = (bvm) obj3;
                    String str2 = bvmVar2.C;
                    if (!jkpVar2.M()) {
                        k2.t();
                    }
                    bov bovVar2 = bvmVar2.o;
                    hqs hqsVar4 = (hqs) k2.b;
                    str2.getClass();
                    hqsVar4.b |= 64;
                    hqsVar4.g = str2;
                    bovVar2.a((hqs) k2.q());
                    fhm fhmVar = new fhm(bvmVar2.e, R.style.ThemeOverlay_GoogleMaterial3_MaterialAlertDialog_Centered);
                    buf bufVar = bvmVar2.c;
                    fhmVar.t(bufVar.R(R.string.delete_from_passbox_during_migration_error_title));
                    fhmVar.m(bufVar.R(R.string.delete_from_passbox_during_migration_error_text));
                    fhmVar.r(bufVar.R(R.string.error_qr_ok), new bul(0));
                    fhmVar.a.n = false;
                    fhmVar.j(R.drawable.warning_error_color);
                    fhmVar.i();
                }
                bvm bvmVar3 = (bvm) this.a;
                bvmVar3.o(bwpVar.b);
                bvm.e(bvmVar3.c).i(false, false);
                bvmVar3.N = bvj.DISABLED;
                bvmVar3.n();
                break;
            case 3:
                bwq bwqVar = (bwq) obj;
                hkh hkhVar2 = bvm.a;
                ((hkf) ((hkf) hkhVar2.e()).i("com/google/android/apps/authenticator2/main/OtpListFragmentPeer$MoveToOnlineStateCallback", "onLoaded", 1604, "OtpListFragmentPeer.java")).s("Successfully moved otps to online mode.");
                if (bwqVar.a) {
                    ((hkf) ((hkf) hkhVar2.e()).i("com/google/android/apps/authenticator2/main/OtpListFragmentPeer$MoveToOnlineStateCallback", "onLoaded", 1606, "OtpListFragmentPeer.java")).s("Passbox sync after moving online was successful.");
                    Object obj4 = this.a;
                    jkj k3 = hqs.a.k();
                    if (!k3.b.M()) {
                        k3.t();
                    }
                    jkp jkpVar3 = k3.b;
                    hqs hqsVar5 = (hqs) jkpVar3;
                    hqsVar5.c = 11;
                    hqsVar5.b = 1 | hqsVar5.b;
                    bvm bvmVar4 = (bvm) obj4;
                    String str3 = bvmVar4.C;
                    if (!jkpVar3.M()) {
                        k3.t();
                    }
                    bov bovVar3 = bvmVar4.o;
                    hqs hqsVar6 = (hqs) k3.b;
                    str3.getClass();
                    hqsVar6.b |= 64;
                    hqsVar6.g = str3;
                    bovVar3.a((hqs) k3.q());
                    bvmVar4.N = bvj.SUCCESSFUL;
                } else {
                    ((hkf) ((hkf) hkhVar2.e()).i("com/google/android/apps/authenticator2/main/OtpListFragmentPeer$MoveToOnlineStateCallback", "onLoaded", 1614, "OtpListFragmentPeer.java")).s("Passbox sync after moving online was not successful.");
                    Object obj5 = this.a;
                    jkj k4 = hqs.a.k();
                    if (!k4.b.M()) {
                        k4.t();
                    }
                    jkp jkpVar4 = k4.b;
                    hqs hqsVar7 = (hqs) jkpVar4;
                    hqsVar7.c = 14;
                    hqsVar7.b = 1 | hqsVar7.b;
                    bvm bvmVar5 = (bvm) obj5;
                    String str4 = bvmVar5.C;
                    if (!jkpVar4.M()) {
                        k4.t();
                    }
                    bov bovVar4 = bvmVar5.o;
                    hqs hqsVar8 = (hqs) k4.b;
                    str4.getClass();
                    hqsVar8.b |= 64;
                    hqsVar8.g = str4;
                    bovVar4.a((hqs) k4.q());
                    bvmVar5.N = bvj.FAILED;
                }
                bvm bvmVar6 = (bvm) this.a;
                bvmVar6.o(bwqVar.b);
                bvmVar6.n();
                bvm.e(bvmVar6.c).i(false, false);
                break;
            case 4:
                cab cabVar = (cab) obj;
                bvm bvmVar7 = (bvm) this.a;
                bvmVar7.G = cabVar;
                if (cabVar.a && !cabVar.b.isEmpty() && !bvmVar7.R) {
                    buf bufVar2 = bvmVar7.c;
                    if (bufVar2.F().d("staged_import_dialog") == null && bufVar2.F().d("discard_staged_import_dialog") == null) {
                        bvmVar7.s(33);
                        frv frvVar = bvmVar7.d;
                        bwd bwdVar = new bwd();
                        jqq.g(bwdVar);
                        gmk.d(bwdVar, frvVar);
                        bwdVar.p(bufVar2.F(), "staged_import_dialog");
                        break;
                    }
                }
                break;
            case 5:
                int ordinal = ((bxe) obj).ordinal();
                if (ordinal == 1) {
                    bvm bvmVar8 = (bvm) this.a;
                    bvmVar8.N = bvj.FAILED;
                    bvm.e(bvmVar8.c).i(false, false);
                } else if (ordinal != 2) {
                    Object obj6 = this.a;
                    if (ordinal != 3) {
                        bvm bvmVar9 = (bvm) obj6;
                        bvmVar9.N = bvj.DISABLED;
                        bvm.e(bvmVar9.c).i(false, false);
                    } else {
                        bvm bvmVar10 = (bvm) obj6;
                        bvmVar10.N = bvj.SUCCESSFUL;
                        bvm.e(bvmVar10.c).i(false, false);
                    }
                } else {
                    ((bvm) this.a).N = bvj.IN_PROGRESS;
                }
                ((bvm) this.a).n();
                break;
            case 6:
                int ordinal2 = ((bxe) obj).ordinal();
                if (ordinal2 == 1) {
                    ((bvm) this.a).N = bvj.FAILED;
                    ((hkf) ((hkf) bvm.a.e()).i("com/google/android/apps/authenticator2/main/OtpListFragmentPeer$SyncOtpsOnFragmentStartCallback", "onLoaded", 1545, "OtpListFragmentPeer.java")).s("Syncing failed.");
                } else if (ordinal2 != 2) {
                    Object obj7 = this.a;
                    if (ordinal2 != 3) {
                        ((bvm) obj7).N = bvj.DISABLED;
                        ((hkf) ((hkf) bvm.a.e()).i("com/google/android/apps/authenticator2/main/OtpListFragmentPeer$SyncOtpsOnFragmentStartCallback", "onLoaded", 1557, "OtpListFragmentPeer.java")).s("Syncing disabled.");
                    } else {
                        ((bvm) obj7).N = bvj.SUCCESSFUL;
                        ((hkf) ((hkf) bvm.a.e()).i("com/google/android/apps/authenticator2/main/OtpListFragmentPeer$SyncOtpsOnFragmentStartCallback", "onLoaded", 1553, "OtpListFragmentPeer.java")).s("Successful otp syncing.");
                    }
                } else {
                    ((bvm) this.a).N = bvj.IN_PROGRESS;
                    ((hkf) ((hkf) bvm.a.e()).i("com/google/android/apps/authenticator2/main/OtpListFragmentPeer$SyncOtpsOnFragmentStartCallback", "onLoaded", 1549, "OtpListFragmentPeer.java")).s("Syncing in progress.");
                }
                bvm bvmVar11 = (bvm) this.a;
                bvmVar11.n();
                bvm.e(bvmVar11.c).i(false, false);
                break;
            default:
                hel helVar = (hel) obj;
                boolean isEmpty = helVar.isEmpty();
                Object obj8 = this.a;
                if (!isEmpty) {
                    bya byaVar = (bya) obj8;
                    bya.b(byaVar.b).setEnabled(true);
                    ((hkf) ((hkf) bya.a.e()).i("com/google/android/apps/authenticator2/migration/exports/ExportFragmentPeer$GetOtpsOnFragmentStartCallback", "onLoaded", 204, "ExportFragmentPeer.java")).s("Successfully fetched otps on fragment start.");
                    byaVar.i = hdb.c(helVar).d(new bwv(6)).e();
                    byaVar.f.t(byaVar.i);
                    byaVar.g = hnu.x(helVar, new bwv(7));
                    break;
                } else {
                    ((bya) obj8).c();
                    break;
                }
        }
    }
}
