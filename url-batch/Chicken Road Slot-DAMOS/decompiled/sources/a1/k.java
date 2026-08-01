package a1;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteTransactionListener;
import android.os.CancellationSignal;
import com.appsflyer.attribution.RequestError;
import j0.a0;
import j0.f0;
import j0.u;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import n0.n2;
import n0.v;
import te.x0;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final /* synthetic */ class k implements Function0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f37d;

    public /* synthetic */ k(int i3) {
        this.f37d = i3;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [hd.g, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Class<?> returnType;
        switch (this.f37d) {
            case 0:
                return new j(new LinkedHashMap());
            case 1:
                n2 n2Var = p.f46a;
                return null;
            case 2:
                n2 n2Var2 = c1.g.f1483a;
                return null;
            case a4.j.INTEGER_FIELD_NUMBER /* 3 */:
                n2 n2Var3 = c1.i.f1485a;
                return null;
            case a4.j.LONG_FIELD_NUMBER /* 4 */:
                return Unit.f5554a;
            case a4.j.STRING_FIELD_NUMBER /* 5 */:
                v vVar = e.i.f3751a;
                return null;
            case a4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                n2 n2Var4 = e0.b.f3765a;
                return null;
            case a4.j.DOUBLE_FIELD_NUMBER /* 7 */:
                v vVar2 = g0.b.f4221a;
                return null;
            case a4.j.BYTES_FIELD_NUMBER /* 8 */:
                return g0.a.f4220a;
            case 9:
                throw new IllegalStateException("CompositionLocal LocalSavedStateRegistryOwner not present");
            case 10:
                throw new IllegalStateException("CompositionLocal LocalLifecycleOwner not present");
            case RequestError.STOP_TRACKING /* 11 */:
                return j0.b.b(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, -1, 65535);
            case 12:
                n2 n2Var5 = j0.b.f4788a;
                return Boolean.TRUE;
            case 13:
                a2.i iVar = j0.o.f4881a;
                return Boolean.TRUE;
            case 14:
                return new x2.f(48);
            case 15:
                n2 n2Var6 = j0.r.f4893a;
                return Boolean.FALSE;
            case 16:
                return u.f4895a;
            case 17:
                return new j0.v();
            case 18:
                return new a0();
            case 19:
                return m0.l.f6400a;
            case 20:
                return new f0(null, 32767);
            case 21:
                try {
                    Method declaredMethod = SQLiteDatabase.class.getDeclaredMethod("getThreadSession", null);
                    declaredMethod.setAccessible(true);
                    return declaredMethod;
                } catch (Throwable unused) {
                    return null;
                }
            case 22:
                try {
                    Method method = (Method) k5.d.f5408r.getValue();
                    if (method == null || (returnType = method.getReturnType()) == null) {
                        return null;
                    }
                    Class cls = Integer.TYPE;
                    return returnType.getDeclaredMethod("beginTransaction", cls, SQLiteTransactionListener.class, cls, CancellationSignal.class);
                } catch (Throwable unused2) {
                    return null;
                }
            case 23:
                v vVar3 = l4.a.f5860a;
                return null;
            case 24:
                return new x0("com.manholeroboramprush.cardestroy.ui.navigation.Portal.Game", l9.f.INSTANCE, new Annotation[0]);
            case 25:
                return new x0("com.manholeroboramprush.cardestroy.ui.navigation.Portal.Main", l9.j.INSTANCE, new Annotation[0]);
            case 26:
                return new x0("com.manholeroboramprush.cardestroy.ui.navigation.Portal.NotRobot", l9.k.INSTANCE, new Annotation[0]);
            case 27:
                return new x0("com.manholeroboramprush.cardestroy.ui.navigation.Portal.PrivacyPolicy", l9.l.INSTANCE, new Annotation[0]);
            case 28:
                return new x0("com.manholeroboramprush.cardestroy.ui.navigation.Portal.Records", l9.m.INSTANCE, new Annotation[0]);
            default:
                return new x0("com.manholeroboramprush.cardestroy.ui.navigation.Portal.Splash", l9.n.INSTANCE, new Annotation[0]);
        }
    }
}
