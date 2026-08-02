package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.SparseArray;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class emo implements jrw {
    private final jsb a;
    private final /* synthetic */ int b;

    public emo(jsb jsbVar, int i) {
        this.b = i;
        this.a = jsbVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.koe, defpackage.kod
    public final /* synthetic */ Object b() {
        Object obj;
        final int i = 1;
        final int i2 = 0;
        switch (this.b) {
            case 0:
                Context b = ((jrk) this.a).b();
                int i3 = clm.c;
                return Integer.valueOf(cmd.a(b));
            case 1:
                return new emg(jrv.a(this.a));
            case 2:
                Context b2 = ((jrk) this.a).b();
                PackageManager packageManager = b2.getPackageManager();
                String packageName = b2.getPackageName();
                try {
                    PackageInfo packageInfo = packageManager.getPackageInfo(packageName, 0);
                    return new bsh(packageInfo.versionName, packageInfo.versionCode, null);
                } catch (PackageManager.NameNotFoundException e) {
                    ((hkf) ((hkf) ((hkf) eiu.a.g()).h(e)).i("com/google/android/libraries/performance/primes/metrics/core/PrimesCoreMetricDaggerModule", "provideVersionNameAndCode", 92, "PrimesCoreMetricDaggerModule.java")).u("Failed to get PackageInfo for: %s", packageName);
                    return new bsh(null, 0, null);
                }
            case 3:
                return new emt((hai) this.a.b());
            case 4:
                Object hjnVar = Build.VERSION.SDK_INT >= 30 ? new hjn((emk) this.a.b()) : hjb.a;
                hjnVar.getClass();
                return hjnVar;
            case 5:
                return !((gzp) ((jrx) this.a).a).f() ? new eoa() { // from class: eop
                    @Override // defpackage.eoa
                    public final eoc a(SparseArray sparseArray) {
                        if (i != 0) {
                            return null;
                        }
                        hoq.s(sparseArray.size() != 0);
                        eog c = eog.c((guc) sparseArray.get(0), false);
                        hoq.u(c);
                        return c.a();
                    }
                } : new eoa() { // from class: eop
                    @Override // defpackage.eoa
                    public final eoc a(SparseArray sparseArray) {
                        if (i2 != 0) {
                            return null;
                        }
                        hoq.s(sparseArray.size() != 0);
                        eog c = eog.c((guc) sparseArray.get(0), false);
                        hoq.u(c);
                        return c.a();
                    }
                };
            case 6:
                return !((gzp) ((jrx) this.a).a).f() ? new eod() { // from class: eoo
                    @Override // defpackage.eod
                    public final hel a(SparseArray sparseArray) {
                        if (i != 0) {
                            int i4 = hel.d;
                            return his.a;
                        }
                        if (sparseArray.size() == 0) {
                            int i5 = hel.d;
                            return his.a;
                        }
                        eog c = eog.c((guc) sparseArray.get(0), false);
                        if (c == null) {
                            int i6 = hel.d;
                            return his.a;
                        }
                        int i7 = hel.d;
                        heg hegVar = new heg(4);
                        hel o = hel.o(c.b);
                        if (o.size() <= 0) {
                            return hegVar.g();
                        }
                        eof eofVar = (eof) o.get(0);
                        let.a.k();
                        eoc eocVar = eofVar.a;
                        throw null;
                    }
                } : new eod() { // from class: eoo
                    @Override // defpackage.eod
                    public final hel a(SparseArray sparseArray) {
                        if (i2 != 0) {
                            int i4 = hel.d;
                            return his.a;
                        }
                        if (sparseArray.size() == 0) {
                            int i5 = hel.d;
                            return his.a;
                        }
                        eog c = eog.c((guc) sparseArray.get(0), false);
                        if (c == null) {
                            int i6 = hel.d;
                            return his.a;
                        }
                        int i7 = hel.d;
                        heg hegVar = new heg(4);
                        hel o = hel.o(c.b);
                        if (o.size() <= 0) {
                            return hegVar.g();
                        }
                        eof eofVar = (eof) o.get(0);
                        let.a.k();
                        eoc eocVar = eofVar.a;
                        throw null;
                    }
                };
            case 7:
                if (((gzp) ((jrx) this.a).a).f()) {
                    gua b3 = guc.b();
                    b3.a(eog.c, new eog());
                    obj = new hjn(((guc) b3).f());
                } else {
                    obj = hjb.a;
                }
                obj.getClass();
                return obj;
            case 8:
                return new Handler((Looper) ((gzs) ((bnu) this.a).a()).a);
            case 9:
                return new eqb(this.a);
            case 10:
                gzp gzpVar = (gzp) ((jrx) this.a).a;
                gyf gyfVar = gyf.a;
                return (eqg) gzpVar.d(new eqg(gyfVar, gyfVar));
            case 11:
                return new hjn((emk) this.a.b());
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                return new eri();
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                return esz.a(((jrk) this.a).b());
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                return new exm(((jrk) this.a).b());
            case 15:
                frz j = ((fsr) iwc.a((gld) ((jrx) this.a).a, fsr.class)).j();
                j.getClass();
                return j;
            case 16:
                return new fvd((ftf) this.a.b(), i);
            case 17:
                return new iyi(((jsd) this.a).b());
            case 18:
                return new ftz((afr) ((jrx) this.a).a);
            case 19:
                return new fuc((glu) this.a.b());
            default:
                return new fuq((fuy) this.a.b());
        }
    }
}
