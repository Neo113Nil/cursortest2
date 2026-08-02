package defpackage;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import com.google.android.libraries.onegoogle.accountmenu.SelectedAccountDisc;
import com.google.android.libraries.social.licenses.LicenseActivity;
import com.google.android.libraries.social.licenses.LicenseMenuActivity;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class drl implements View.OnClickListener {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ drl(Object obj, Object obj2, int i) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [dqy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v22, types: [android.view.View$OnClickListener, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v3, types: [efd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v6, types: [dqy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v3, types: [efu, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v1, types: [android.view.View$OnClickListener, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v12, types: [java.lang.Object, jfy] */
    /* JADX WARN: Type inference failed for: r6v16, types: [dou, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v22, types: [efu, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v24, types: [android.os.Parcelable, java.lang.Object] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.c) {
            case 0:
                SelectedAccountDisc selectedAccountDisc = (SelectedAccountDisc) this.a;
                dsf dsfVar = selectedAccountDisc.e;
                if (dsfVar != null) {
                    dsfVar.k.f(new cfe(5), view);
                }
                dqi dqiVar = selectedAccountDisc.f;
                if (dqiVar != null) {
                    hel helVar = dqiVar.a;
                    int i = ((his) helVar).c;
                    for (int i2 = 0; i2 < i; i2++) {
                    }
                }
                ?? r6 = this.b;
                if (r6 != 0) {
                    r6.onClick(view);
                    break;
                }
                break;
            case 1:
                fym fymVar = (fym) this.b;
                ?? r1 = fymVar.f;
                ?? r2 = fymVar.e;
                r1.a(r2.a(), (jnu) fymVar.b);
                fymVar.d.f(new cfe(5), view);
                Object obj = this.a;
                edp edpVar = (edp) ((drf) fymVar.a).a;
                edpVar.b.a.i(obj, 2);
                eea eeaVar = edpVar.a;
                eeaVar.post(new ect(eeaVar, 3));
                r1.a(r2.a(), (jnu) fymVar.c);
                break;
            case 2:
                Runnable runnable = ((dso) this.a).d;
                if (runnable != null) {
                    runnable.run();
                }
                Object obj2 = this.b;
                fao.c();
                dsl dslVar = (dsl) obj2;
                by byVar = dslVar.b;
                eb a = dsl.a(byVar);
                if (a == null) {
                    dsf dsfVar2 = dslVar.c;
                    duh duhVar = dslVar.e;
                    Bundle bundle = new Bundle();
                    eck eckVar = dsfVar2.e.n;
                    bundle.putBoolean("enableDynamicColors", true);
                    dux duxVar = (dux) ((gzp) duhVar.a().d.b()).e();
                    if (duxVar != null) {
                        bundle.putParcelable("themeConfiguration", duxVar);
                    }
                    dtw dtwVar = new dtw();
                    dtwVar.ah(bundle);
                    dsl.b(dtwVar, duhVar, dsfVar2, dslVar.f);
                    a = dtwVar;
                }
                fao.c();
                bg bgVar = dslVar.d;
                if ((bgVar == null || !bgVar.isFinishing()) && !a.ao() && !byVar.X()) {
                    a.p(byVar, dsl.a);
                    break;
                }
                break;
            case 3:
                ((hrz) ((ldt) this.b).a).f(this.a);
                break;
            case 4:
                view.getClass();
                Object obj3 = this.a;
                if (obj3 != null) {
                    ((eat) this.b).d.b((jiu) obj3, view);
                    break;
                }
                break;
            case 5:
                this.b.a(view, this.a.a());
                break;
            case 6:
                ((ecr) this.a).w.f(new cfe(5), view);
                ((ecq) this.b).e.onClick(view);
                break;
            case 7:
                eea eeaVar2 = (eea) this.b;
                eeaVar2.e.d.f(new cfe(5), view);
                eeaVar2.d((eeg) this.a, null);
                break;
            case 8:
                eea eeaVar3 = (eea) this.b;
                if (eeaVar3.b) {
                    this.a.f(new cfe(5), view);
                    eeaVar3.q(32);
                    eeaVar3.i(false);
                    break;
                }
                break;
            case 9:
                LicenseMenuActivity licenseMenuActivity = ((exr) this.a).e;
                if (licenseMenuActivity != null) {
                    ?? r62 = this.b;
                    Intent intent = new Intent(licenseMenuActivity, (Class<?>) LicenseActivity.class);
                    intent.putExtra("license", (Parcelable) r62);
                    licenseMenuActivity.startActivity(intent);
                    break;
                }
                break;
            default:
                this.b.onClick(view);
                ((fpk) this.a).e(1);
                break;
        }
    }

    public /* synthetic */ drl(Object obj, Object obj2, int i, byte[] bArr) {
        this.c = i;
        this.b = obj;
        this.a = obj2;
    }
}
