package D1;

import android.app.Application;
import android.provider.Settings;
import h2.AbstractC0439a;
import java.security.MessageDigest;
import k2.InterfaceC0550w;

/* loaded from: classes.dex */
public final class F extends R1.i implements Y1.e {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ A2.g f529e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public F(A2.g gVar, P1.d dVar) {
        super(2, dVar);
        this.f529e = gVar;
    }

    @Override // R1.a
    public final P1.d create(Object obj, P1.d dVar) {
        return new F(this.f529e, dVar);
    }

    @Override // Y1.e
    public final Object g(Object obj, Object obj2) {
        return ((F) create((InterfaceC0550w) obj, (P1.d) obj2)).invokeSuspend(L1.z.f2729a);
    }

    @Override // R1.a
    public final Object invokeSuspend(Object obj) {
        Q1.a aVar = Q1.a.f3113d;
        I2.l.Q(obj);
        Application application = (Application) this.f529e.f83b;
        String string = Settings.Secure.getString(application.getContentResolver(), "android_id");
        if (string == null) {
            string = "";
        }
        String str = string + application.getPackageName();
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        byte[] bytes = str.getBytes(AbstractC0439a.f5056a);
        Z1.i.e(bytes, "getBytes(...)");
        byte[] digest = messageDigest.digest(bytes);
        Z1.i.e(digest, "digest(...)");
        String substring = M1.k.h0(digest, "", null, null, new E(0), 30).substring(0, 32);
        Z1.i.e(substring, "substring(...)");
        String substring2 = substring.substring(0, 8);
        Z1.i.e(substring2, "substring(...)");
        String substring3 = substring.substring(8, 12);
        Z1.i.e(substring3, "substring(...)");
        String substring4 = substring.substring(12, 16);
        Z1.i.e(substring4, "substring(...)");
        String substring5 = substring.substring(16, 20);
        Z1.i.e(substring5, "substring(...)");
        String substring6 = substring.substring(20, 32);
        Z1.i.e(substring6, "substring(...)");
        return substring2 + "-" + substring3 + "-" + substring4 + "-" + substring5 + "-" + substring6;
    }
}
