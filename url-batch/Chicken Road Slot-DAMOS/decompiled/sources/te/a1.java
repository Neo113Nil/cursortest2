package te;

import com.google.android.gms.internal.measurement.se;
import com.google.firebase.installations.FirebaseInstallationsRegistrar;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final /* synthetic */ class a1 implements v.n, l8.e {
    public static /* synthetic */ void c(Object obj, Object obj2, String str) {
        throw new IllegalArgumentException((str + obj + obj2).toString());
    }

    public static /* synthetic */ void d(Object obj, String str) {
        throw new IllegalArgumentException(str + obj);
    }

    public static /* synthetic */ void e(String str) {
        throw new IllegalArgumentException(str);
    }

    public static /* synthetic */ void f(String str, Object obj, Object obj2, Object obj3, Object obj4) {
        throw new IllegalArgumentException((str + obj + obj2 + obj3 + obj4).toString());
    }

    public static /* synthetic */ void g(Object obj, Object obj2, String str) {
        throw new IllegalArgumentException(str + obj + obj2);
    }

    public static /* synthetic */ void h(Object obj, String str) {
        throw new IllegalStateException((str + obj).toString());
    }

    public static /* synthetic */ void i(Object obj, String str) {
        throw new IllegalStateException(str + obj);
    }

    @Override // l8.e
    public Object b(se seVar) {
        x8.d lambda$getComponents$0;
        lambda$getComponents$0 = FirebaseInstallationsRegistrar.lambda$getComponents$0(seVar);
        return lambda$getComponents$0;
    }

    @Override // v.n
    public float a(float f3) {
        return f3;
    }
}
