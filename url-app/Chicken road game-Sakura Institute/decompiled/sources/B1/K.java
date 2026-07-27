package B1;

import A.AbstractC0017m;
import A1.v0;
import W2.InterfaceC0302y;
import android.app.Application;
import android.provider.Settings;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import java.security.MessageDigest;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import y2.AbstractC1341p;
import y2.AbstractC1343r;
import y2.C1342q;
import z2.C1439w;

/* loaded from: classes.dex */
public final class K extends E2.j implements Function2 {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ L f971k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public K(L l4, C2.a aVar) {
        super(2, aVar);
        this.f971k = l4;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object h(Object obj, Object obj2) {
        return ((K) j((C2.a) obj2, (InterfaceC0302y) obj)).l(Unit.f7487a);
    }

    @Override // E2.a
    public final C2.a j(C2.a aVar, Object obj) {
        return new K(this.f971k, aVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0027, code lost:
    
        if (r2 == null) goto L5;
     */
    @Override // E2.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object l(Object obj) {
        Object a4;
        D2.a aVar = D2.a.f2163d;
        AbstractC1343r.b(obj);
        L l4 = this.f971k;
        l4.getClass();
        Application application = l4.f972a;
        try {
            AbstractC1341p.a aVar2 = AbstractC1341p.f11673d;
            AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(application);
            Intrinsics.checkNotNullExpressionValue(advertisingIdInfo, "getAdvertisingIdInfo(...)");
            if (!advertisingIdInfo.isLimitAdTrackingEnabled()) {
                a4 = advertisingIdInfo.getId();
            }
            a4 = "";
        } catch (Throwable th) {
            AbstractC1341p.a aVar3 = AbstractC1341p.f11673d;
            a4 = AbstractC1343r.a(th);
        }
        if (a4 instanceof C1342q) {
            a4 = "";
        }
        String str = (String) a4;
        String string = Settings.Secure.getString(application.getContentResolver(), "android_id");
        String str2 = string != null ? string : "";
        String str3 = str2 + application.getPackageName();
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        byte[] bytes = str3.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        byte[] digest = messageDigest.digest(bytes);
        Intrinsics.checkNotNullExpressionValue(digest, "digest(...)");
        String substring = C1439w.w(digest, "", null, null, new v0(5), 30).substring(0, 32);
        Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
        String substring2 = substring.substring(0, 8);
        Intrinsics.checkNotNullExpressionValue(substring2, "substring(...)");
        String substring3 = substring.substring(8, 12);
        Intrinsics.checkNotNullExpressionValue(substring3, "substring(...)");
        String substring4 = substring.substring(12, 16);
        Intrinsics.checkNotNullExpressionValue(substring4, "substring(...)");
        String substring5 = substring.substring(16, 20);
        Intrinsics.checkNotNullExpressionValue(substring5, "substring(...)");
        String substring6 = substring.substring(20, 32);
        Intrinsics.checkNotNullExpressionValue(substring6, "substring(...)");
        StringBuilder sb = new StringBuilder();
        sb.append(substring2);
        sb.append("-");
        sb.append(substring3);
        sb.append("-");
        sb.append(substring4);
        sb.append("-");
        sb.append(substring5);
        return new C0094a(str, AbstractC0017m.n(sb, "-", substring6));
    }
}
