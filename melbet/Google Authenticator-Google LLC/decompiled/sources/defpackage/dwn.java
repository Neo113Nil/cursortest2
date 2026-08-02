package defpackage;

import android.os.SystemClock;
import java.util.Random;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dwn implements jrw {
    private final jsb a;
    private final /* synthetic */ int b;

    public dwn(jsb jsbVar, int i) {
        this.b = i;
        this.a = jsbVar;
    }

    @Override // defpackage.koe, defpackage.kod
    public final /* synthetic */ Object b() {
        switch (this.b) {
            case 0:
                return new dwv(((jrk) this.a).b());
            case 1:
                return new dwv(((jrk) this.a).b());
            case 2:
                String packageName = ((jrk) this.a).b().getPackageName();
                packageName.getClass();
                return new eff(packageName);
            case 3:
                dwv dwvVar = (dwv) this.a.b();
                dwvVar.getClass();
                return dwvVar.c;
            case 4:
                dwv dwvVar2 = (dwv) this.a.b();
                dwvVar2.getClass();
                return dwvVar2.g;
            case 5:
                ent entVar = (ent) eos.z((gzp) ((jrx) this.a).a, new eig(0));
                entVar.getClass();
                return entVar;
            case 6:
                emu emuVar = (emu) eos.z((gzp) ((jrx) this.a).a, new eig(9));
                emuVar.getClass();
                return emuVar;
            case 7:
                emz emzVar = (emz) eos.z(((bnu) this.a).a(), new eig(8));
                emzVar.getClass();
                return emzVar;
            case 8:
                eob eobVar = (eob) eos.z((gzp) ((jrx) this.a).a, new eig(1));
                eobVar.getClass();
                return eobVar;
            case 9:
                gzp gzpVar = (gzp) ((jrx) this.a).a;
                return gzpVar.f() ? gzp.g((ema) ((koe) gzpVar.b()).b()) : gyf.a;
            case 10:
                eoy eoyVar = (eoy) eos.z((gzp) ((jrx) this.a).a, new eig(2));
                eoyVar.getClass();
                return eoyVar;
            case 11:
                eqr eqrVar = (eqr) eos.z(((bnu) this.a).a(), new eig(3));
                eqrVar.getClass();
                return eqrVar;
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                return (eiv) ((bnu) this.a).a().d(eiv.a().b());
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                eqw eqwVar = (eqw) eos.z(((bnu) this.a).a(), new eig(5));
                eqwVar.getClass();
                return eqwVar;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                erc ercVar = (erc) eos.z(((bnu) this.a).a(), new eig(7));
                ercVar.getClass();
                return ercVar;
            case 15:
                return new emg(((jrk) this.a).b());
            case 16:
                return new Random(SystemClock.elapsedRealtime());
            case 17:
                eim eimVar = (eim) this.a.b();
                eim.b(eimVar);
                eimVar.getClass();
                return eimVar;
            case 18:
                return (dih) ((bnu) this.a).a().d(new dih());
            case 19:
                return new eiq();
            default:
                epk epkVar = (epk) ((koe) ((bnu) this.a).a().d(new eig(10))).b();
                epkVar.getClass();
                return epkVar;
        }
    }
}
