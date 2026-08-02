package defpackage;

import android.content.res.Resources;
import android.view.View;
import java.util.Arrays;
import java.util.Map;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class ajt implements krt {
    private final /* synthetic */ int a;

    public /* synthetic */ ajt(int i) {
        this.a = i;
    }

    @Override // defpackage.krt
    public final Object a(Object obj) {
        switch (this.a) {
            case 0:
                ((ajd) obj).getClass();
                throw new kok("An operation is not implemented.");
            case 1:
                Resources resources = (Resources) obj;
                resources.getClass();
                return Boolean.valueOf((resources.getConfiguration().uiMode & 48) == 32);
            case 2:
                amh amhVar = (amh) obj;
                amhVar.getClass();
                return Boolean.valueOf(amhVar.l());
            case 3:
                amh amhVar2 = (amh) obj;
                int i = akt.h;
                amhVar2.getClass();
                kqd kqdVar = new kqd();
                while (amhVar2.l()) {
                    kqdVar.add(Integer.valueOf((int) amhVar2.b(0)));
                }
                return ixd.j(kqdVar);
            case 4:
                aok aokVar = aok.a;
                return false;
            case 5:
                Map.Entry entry = (Map.Entry) obj;
                asa asaVar = asa.a;
                entry.getClass();
                String str = (String) entry.getKey();
                Object value = entry.getValue();
                if (value instanceof Object[]) {
                    value = Arrays.toString((Object[]) value);
                    value.getClass();
                }
                return str + " : " + value;
            case 6:
                axt axtVar = (axt) obj;
                axtVar.getClass();
                return true != axtVar.d() ? "OneTime" : "Periodic";
            case 7:
                awg awgVar = (awg) obj;
                awgVar.getClass();
                String simpleName = awgVar.getClass().getSimpleName();
                simpleName.getClass();
                return simpleName;
            case 8:
                ((jjq) obj).getClass();
                return new dzi(new brn());
            case 9:
                jkj C = ((caf) obj).C();
                if (!C.b.M()) {
                    C.t();
                }
                ((caf) C.b).b = jlu.a;
                return (caf) C.q();
            case 10:
                eff effVar = (eff) obj;
                String str2 = dtw.aj;
                effVar.getClass();
                effVar.c++;
                return kow.a;
            case 11:
                eff effVar2 = (eff) obj;
                String str3 = dtw.aj;
                effVar2.getClass();
                effVar2.e++;
                return kow.a;
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                eff effVar3 = (eff) obj;
                String str4 = dtw.aj;
                effVar3.getClass();
                effVar3.d++;
                return kow.a;
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                eff effVar4 = (eff) obj;
                String str5 = dtw.aj;
                effVar4.getClass();
                effVar4.f++;
                return kow.a;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                eb ebVar = (eb) obj;
                ebVar.getClass();
                ebVar.d();
                return kow.a;
            case 15:
                ((jit) obj).getClass();
                return null;
            case 16:
                ((View) obj).getClass();
                return jiv.b;
            case 17:
                dxa dxaVar = (dxa) obj;
                dxaVar.getClass();
                return new dwc(new jfm(new jfh(new jha(1, dxaVar.a()))), 3);
            case 18:
                throw new IllegalStateException("Tap not set");
            case 19:
                Map map = dvq.a;
                ((View) obj).getClass();
                return jiv.a;
            default:
                Map map2 = dvq.a;
                ((View) obj).getClass();
                return jiv.a;
        }
    }
}
