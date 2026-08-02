package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.InstallSourceInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import j$.util.Comparator$CC;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class eks implements hac {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ eks(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, koe] */
    /* JADX WARN: Type inference failed for: r7v20, types: [java.lang.Object, jpt] */
    /* JADX WARN: Type inference failed for: r7v44, types: [java.lang.Object, koe] */
    /* JADX WARN: Type inference failed for: r7v58, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r7v59, types: [hac, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v66, types: [hac, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v76, types: [java.lang.Object, jpt] */
    /* JADX WARN: Type inference failed for: r7v79, types: [java.lang.Object, koe] */
    /* JADX WARN: Type inference failed for: r7v82, types: [java.lang.Object, koe] */
    @Override // defpackage.hac
    public final Object bB() {
        InstallSourceInfo installSourceInfo;
        String installingPackageName;
        switch (this.b) {
            case 0:
                return (Boolean) this.a.b();
            case 1:
                return Long.valueOf(Double.valueOf((String) ((eki) this.a).a.bB()).longValue());
            case 2:
                return this.a;
            case 3:
                if (Build.VERSION.SDK_INT < 30) {
                    return gyf.a;
                }
                Context context = (Context) this.a;
                try {
                    installSourceInfo = context.getPackageManager().getInstallSourceInfo(context.getPackageName());
                    installingPackageName = installSourceInfo.getInstallingPackageName();
                    return gzp.g(installingPackageName);
                } catch (PackageManager.NameNotFoundException unused) {
                    return gyf.a;
                }
            case 4:
                return hel.t(Comparator$CC.comparing(new ejs(6), Comparator$CC.reverseOrder()), (Iterable) this.a.b());
            case 5:
                return Long.valueOf(((eml) this.a).l.a().getTotalSpace() / 1024);
            case 6:
                return ((emx) this.a).b();
            case 7:
                Object obj = this.a;
                int i = eot.a;
                long j = eos.l;
                if (j == 0) {
                    synchronized (eos.class) {
                        j = eos.l;
                        if (j == 0) {
                            float f = 60.0f;
                            float floatValue = ((Float) eos.l((Context) obj).d(Float.valueOf(60.0f))).floatValue();
                            if (floatValue >= 1.0f) {
                                f = floatValue;
                            }
                            j = (long) Math.ceil(1.0E9d / f);
                            eos.l = j;
                        }
                    }
                }
                return Long.valueOf(j);
            case 8:
                return elh.a(((epx) this.a).b, "getMemoryUsageMetric");
            case 9:
                return this.a.b();
            case 10:
                return (SharedPreferences) ((gzp) this.a).b();
            case 11:
                return Boolean.valueOf(jur.a.bB().b((Context) this.a));
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                AtomicReference atomicReference = etd.a;
                hwm hwmVar = new hwm(null);
                hwmVar.f = this.a;
                return hwmVar.f();
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                AtomicReference atomicReference2 = etd.a;
                return new ets(new dbw((Context) this.a));
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                AtomicReference atomicReference3 = etd.a;
                return new iyi((List) this.a);
            case 15:
                AtomicReference atomicReference4 = etd.a;
                return (evt) ((gzp) this.a.bB()).e();
            case 16:
                return gzp.h(new evt(((hwm) this.a).c));
            case 17:
                Object obj2 = ((hwm) this.a).f;
                AtomicReference atomicReference5 = etd.a;
                try {
                    return gzp.h(((Context) obj2).getPackageManager().getApplicationInfo("com.google.android.gms", 0));
                } catch (PackageManager.NameNotFoundException unused2) {
                    return gyf.a;
                }
            case 18:
                return (hvm) this.a.b();
            case 19:
                return (gzp) this.a.b();
            default:
                return (iyi) this.a.b();
        }
    }
}
