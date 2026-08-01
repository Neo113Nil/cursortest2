package defpackage;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteTransactionListener;
import android.os.CancellationSignal;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final /* synthetic */ class z1 implements ir {
    public final /* synthetic */ int f;

    @Override // defpackage.ir
    public final Object a() {
        Class<?> returnType;
        int i = this.f;
        sk0 sk0Var = sk0.a;
        switch (i) {
            case 0:
                q qVar = g70.f;
                return Integer.valueOf(g70.f.a().nextInt(2147418112) + 65536);
            case 1:
                try {
                    Method declaredMethod = SQLiteDatabase.class.getDeclaredMethod("getThreadSession", null);
                    declaredMethod.setAccessible(true);
                    return declaredMethod;
                } catch (Throwable unused) {
                    return null;
                }
            case 2:
                try {
                    String[] strArr = yq.g;
                    Method method = (Method) yq.h.getValue();
                    if (method == null || (returnType = method.getReturnType()) == null) {
                        return null;
                    }
                    Class cls = Integer.TYPE;
                    return returnType.getDeclaredMethod("beginTransaction", cls, SQLiteTransactionListener.class, cls, CancellationSignal.class);
                } catch (Throwable unused2) {
                    return null;
                }
            case 3:
            case 4:
                return sk0Var;
            default:
                return Boolean.TRUE;
        }
    }
}
