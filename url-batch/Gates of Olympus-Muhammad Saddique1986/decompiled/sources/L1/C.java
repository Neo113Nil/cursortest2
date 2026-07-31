package L1;

import B.Y;
import android.app.Application;
import android.provider.Settings;
import e2.InterfaceC0426e;
import java.security.MessageDigest;
import n2.AbstractC0721a;
import q2.InterfaceC0835w;

/* loaded from: classes.dex */
public final class C extends X1.i implements InterfaceC0426e {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Y f3351h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C(Y y3, V1.d dVar) {
        super(2, dVar);
        this.f3351h = y3;
    }

    @Override // e2.InterfaceC0426e
    public final Object h(Object obj, Object obj2) {
        return ((C) o((V1.d) obj2, (InterfaceC0835w) obj)).q(R1.y.f4171a);
    }

    @Override // X1.a
    public final V1.d o(V1.d dVar, Object obj) {
        return new C(this.f3351h, dVar);
    }

    @Override // X1.a
    public final Object q(Object obj) {
        R1.a.e(obj);
        Application application = (Application) this.f3351h.f334d;
        String string = Settings.Secure.getString(application.getContentResolver(), "android_id");
        if (string == null) {
            string = "";
        }
        String str = string + application.getPackageName();
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        byte[] bytes = str.getBytes(AbstractC0721a.f7347a);
        f2.j.e(bytes, "getBytes(...)");
        byte[] digest = messageDigest.digest(bytes);
        f2.j.e(digest, "digest(...)");
        String substring = S1.k.v0(digest, "", null, null, new A2.i(3), 30).substring(0, 32);
        f2.j.e(substring, "substring(...)");
        String substring2 = substring.substring(0, 8);
        f2.j.e(substring2, "substring(...)");
        String substring3 = substring.substring(8, 12);
        f2.j.e(substring3, "substring(...)");
        String substring4 = substring.substring(12, 16);
        f2.j.e(substring4, "substring(...)");
        String substring5 = substring.substring(16, 20);
        f2.j.e(substring5, "substring(...)");
        String substring6 = substring.substring(20, 32);
        f2.j.e(substring6, "substring(...)");
        return substring2 + "-" + substring3 + "-" + substring4 + "-" + substring5 + "-" + substring6;
    }
}
