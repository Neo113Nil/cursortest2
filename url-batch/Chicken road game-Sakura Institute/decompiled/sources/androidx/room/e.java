package androidx.room;

import android.app.Application;
import android.provider.Settings;
import c7.m1;
import com.android.installreferrer.api.InstallReferrerClient;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import f4.e0;
import f4.f0;
import java.security.MessageDigest;
import java.util.concurrent.Callable;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class e extends j6.i implements q6.e {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f1081g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f1082h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(Object obj, h6.d dVar, int i7) {
        super(2, dVar);
        this.f1081g = i7;
        this.f1082h = obj;
    }

    @Override // j6.a
    public final h6.d create(Object obj, h6.d dVar) {
        switch (this.f1081g) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return new e((Callable) this.f1082h, dVar, 0);
            case 1:
                return new e((e0) this.f1082h, dVar, 1);
            default:
                return new e((m1) this.f1082h, dVar, 2);
        }
    }

    @Override // q6.e
    public final Object d(Object obj, Object obj2) {
        switch (this.f1081g) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return ((e) create((c7.x) obj, (h6.d) obj2)).invokeSuspend(d6.z.f2639a);
            case 1:
                return ((e) create((c7.x) obj, (h6.d) obj2)).invokeSuspend(d6.z.f2639a);
            default:
                e eVar = (e) create((f7.g) obj, (h6.d) obj2);
                d6.z zVar = d6.z.f2639a;
                eVar.invokeSuspend(zVar);
                return zVar;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0035, code lost:
    
        if (r2 == null) goto L9;
     */
    @Override // j6.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object b9;
        int i7 = this.f1081g;
        Object obj2 = this.f1082h;
        switch (i7) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                d6.a.e(obj);
                return ((Callable) obj2).call();
            case 1:
                d6.a.e(obj);
                e0 e0Var = (e0) obj2;
                e0Var.getClass();
                Application application = e0Var.f3316a;
                try {
                    AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(application);
                    r6.k.e(advertisingIdInfo, "getAdvertisingIdInfo(...)");
                    if (!advertisingIdInfo.isLimitAdTrackingEnabled()) {
                        b9 = advertisingIdInfo.getId();
                        break;
                    }
                    b9 = "";
                } catch (Throwable th) {
                    b9 = d6.a.b(th);
                }
                if (b9 instanceof d6.l) {
                    b9 = "";
                }
                String str = (String) b9;
                String string = Settings.Secure.getString(application.getContentResolver(), "android_id");
                if (string == null) {
                    string = "";
                }
                String str2 = string + application.getPackageName();
                MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
                byte[] bytes = str2.getBytes(z6.a.f10114a);
                r6.k.e(bytes, "getBytes(...)");
                byte[] digest = messageDigest.digest(bytes);
                r6.k.e(digest, "digest(...)");
                String substring = e6.k.h0(digest, "", new c7.r(1), 30).substring(0, 32);
                r6.k.e(substring, "substring(...)");
                String substring2 = substring.substring(0, 8);
                r6.k.e(substring2, "substring(...)");
                String substring3 = substring.substring(8, 12);
                r6.k.e(substring3, "substring(...)");
                String substring4 = substring.substring(12, 16);
                r6.k.e(substring4, "substring(...)");
                String substring5 = substring.substring(16, 20);
                r6.k.e(substring5, "substring(...)");
                String substring6 = substring.substring(20, 32);
                r6.k.e(substring6, "substring(...)");
                StringBuilder sb = new StringBuilder();
                sb.append(substring2);
                sb.append("-");
                sb.append(substring3);
                sb.append("-");
                sb.append(substring4);
                sb.append("-");
                sb.append(substring5);
                return new f0(str, a0.m.m(sb, "-", substring6));
            default:
                d6.a.e(obj);
                ((m1) obj2).start();
                return d6.z.f2639a;
        }
    }
}
