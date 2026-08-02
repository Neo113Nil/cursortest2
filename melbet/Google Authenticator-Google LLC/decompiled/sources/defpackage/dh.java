package defpackage;

import android.os.Bundle;
import com.google.android.apps.authenticator2.addfirstotp.AddFirstOtpActivity;
import com.google.android.apps.authenticator2.editotp.EditOtpActivity;
import com.google.android.apps.authenticator2.enterkey.EnterKeyActivity;
import com.google.android.apps.authenticator2.howitworks.GoogleAccountSyncingIntroductionActivity;
import com.google.android.apps.authenticator2.howitworks.HowItWorksActivity;
import com.google.android.apps.authenticator2.main.MainActivity;
import com.google.android.apps.authenticator2.migration.MigrationActivity;
import com.google.android.apps.authenticator2.settings.SettingsActivity;
import com.google.apps.tiktok.account.ui.onegoogle.expresssignin.selector.ExpressSignInActivity;
import java.util.ArrayList;
import java.util.Map;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dh implements nz {
    final /* synthetic */ ng a;
    private final /* synthetic */ int b;

    public dh(di diVar, int i) {
        this.b = i;
        this.a = diVar;
    }

    /* JADX WARN: Type inference failed for: r7v12, types: [gly, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v18, types: [gly, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v24, types: [gly, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v30, types: [gly, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v38, types: [gly, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v46, types: [gly, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v52, types: [gly, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v58, types: [gly, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v62, types: [gly, java.lang.Object] */
    @Override // defpackage.nz
    public final void a() {
        switch (this.b) {
            case 0:
                ng ngVar = this.a;
                dk i = ((di) ngVar).i();
                i.e();
                ngVar.aE().a("androidx:appcompat");
                i.o();
                break;
            case 1:
                Object obj = ((bg) this.a).e.a;
                bl blVar = (bl) obj;
                blVar.e.k(blVar, (bi) obj, null);
                break;
            case 2:
                ng ngVar2 = this.a;
                Bundle a = ngVar2.aE().a("android:support:activity-result");
                if (a != null) {
                    oh ohVar = ngVar2.g;
                    ArrayList<Integer> integerArrayList = a.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
                    ArrayList<String> stringArrayList = a.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
                    if (stringArrayList != null && integerArrayList != null) {
                        ArrayList<String> stringArrayList2 = a.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
                        if (stringArrayList2 != null) {
                            ohVar.c.addAll(stringArrayList2);
                        }
                        Bundle bundle = a.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT");
                        if (bundle != null) {
                            ohVar.f.putAll(bundle);
                        }
                        int size = stringArrayList.size();
                        for (int i2 = 0; i2 < size; i2++) {
                            String str = stringArrayList.get(i2);
                            Map map = ohVar.b;
                            if (map.containsKey(str)) {
                                Integer num = (Integer) map.remove(str);
                                if (!ohVar.f.containsKey(str)) {
                                    ohVar.a.remove(num);
                                }
                            }
                            Integer num2 = integerArrayList.get(i2);
                            num2.getClass();
                            int intValue = num2.intValue();
                            String str2 = stringArrayList.get(i2);
                            str2.getClass();
                            ohVar.d(intValue, str2);
                        }
                        break;
                    }
                }
                break;
            case 3:
                ng ngVar3 = this.a;
                ((AddFirstOtpActivity) ngVar3).A();
                ((bos) ngVar3).C().i().b();
                break;
            case 4:
                ng ngVar4 = this.a;
                bos bosVar = (bos) ngVar4;
                if (!bosVar.o) {
                    bosVar.o = true;
                    bosVar.b().f();
                    break;
                }
                break;
            case 5:
                ng ngVar5 = this.a;
                ((EditOtpActivity) ngVar5).A();
                ((bqy) ngVar5).C().i().b();
                break;
            case 6:
                ng ngVar6 = this.a;
                bqy bqyVar = (bqy) ngVar6;
                if (!bqyVar.o) {
                    bqyVar.o = true;
                    bqyVar.b().f();
                    break;
                }
                break;
            case 7:
                ng ngVar7 = this.a;
                ((EnterKeyActivity) ngVar7).A();
                ((brk) ngVar7).C().i().b();
                break;
            case 8:
                ng ngVar8 = this.a;
                brk brkVar = (brk) ngVar8;
                if (!brkVar.o) {
                    brkVar.o = true;
                    brkVar.b().f();
                    break;
                }
                break;
            case 9:
                ng ngVar9 = this.a;
                ((GoogleAccountSyncingIntroductionActivity) ngVar9).A();
                ((brt) ngVar9).C().i().b();
                break;
            case 10:
                ng ngVar10 = this.a;
                brt brtVar = (brt) ngVar10;
                if (!brtVar.o) {
                    brtVar.o = true;
                    brtVar.b().f();
                    break;
                }
                break;
            case 11:
                ng ngVar11 = this.a;
                brv brvVar = (brv) ngVar11;
                if (!brvVar.o) {
                    brvVar.o = true;
                    brvVar.b().f();
                    break;
                }
                break;
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                ng ngVar12 = this.a;
                ((HowItWorksActivity) ngVar12).B();
                ((brv) ngVar12).C().i().b();
                break;
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                ng ngVar13 = this.a;
                bsm bsmVar = (bsm) ngVar13;
                if (!bsmVar.o) {
                    bsmVar.o = true;
                    bsmVar.b().f();
                    break;
                }
                break;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                ng ngVar14 = this.a;
                bty btyVar = (bty) ngVar14;
                if (!btyVar.o) {
                    btyVar.o = true;
                    btyVar.b().f();
                    break;
                }
                break;
            case 15:
                ng ngVar15 = this.a;
                ((MainActivity) ngVar15).D();
                ((bty) ngVar15).C().i().b();
                break;
            case 16:
                ng ngVar16 = this.a;
                bxg bxgVar = (bxg) ngVar16;
                if (!bxgVar.o) {
                    bxgVar.o = true;
                    bxgVar.b().f();
                    break;
                }
                break;
            case 17:
                ng ngVar17 = this.a;
                ((MigrationActivity) ngVar17).B();
                ((bxg) ngVar17).C().i().b();
                break;
            case 18:
                ng ngVar18 = this.a;
                cbn cbnVar = (cbn) ngVar18;
                if (!cbnVar.o) {
                    cbnVar.o = true;
                    cbnVar.b().f();
                    break;
                }
                break;
            case 19:
                ng ngVar19 = this.a;
                ((SettingsActivity) ngVar19).B();
                ((cbn) ngVar19).C().i().b();
                break;
            default:
                ng ngVar20 = this.a;
                ((ExpressSignInActivity) ngVar20).A();
                ((fzg) ngVar20).C().i().b();
                break;
        }
    }

    public /* synthetic */ dh(ng ngVar, int i) {
        this.b = i;
        this.a = ngVar;
    }
}
