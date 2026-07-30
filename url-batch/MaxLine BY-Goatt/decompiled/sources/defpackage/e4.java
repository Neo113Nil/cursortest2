package defpackage;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteTransactionListener;
import android.os.CancellationSignal;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.facebook.internal.FacebookRequestErrorClassification;
import com.facebook.internal.NativeProtocol;
import java.lang.reflect.Method;
import java.util.LinkedHashMap;
import java.util.UUID;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final /* synthetic */ class e4 implements Function0 {
    public final /* synthetic */ int m;

    public /* synthetic */ e4(int i) {
        this.m = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Class<?> returnType;
        switch (this.m) {
            case 0:
                c62.m.getClass();
                return Integer.valueOf(c62.n.d(2147418112) + NativeProtocol.MESSAGE_GET_ACCESS_TOKEN_REQUEST);
            case 1:
                return UUID.randomUUID().toString();
            case 2:
                bp2 bp2Var = j00.a;
                return null;
            case 3:
                b00.d("Unexpected call to default provider");
                throw new k81();
            case 4:
                try {
                    Method declaredMethod = SQLiteDatabase.class.getDeclaredMethod("getThreadSession", null);
                    declaredMethod.setAccessible(true);
                    return declaredMethod;
                } catch (Throwable unused) {
                    return null;
                }
            case 5:
                try {
                    String[] strArr = zs0.n;
                    Method method = (Method) zs0.o.getValue();
                    if (method == null || (returnType = method.getReturnType()) == null) {
                        return null;
                    }
                    Class cls = Integer.TYPE;
                    return returnType.getDeclaredMethod("beginTransaction", cls, SQLiteTransactionListener.class, cls, CancellationSignal.class);
                } catch (Throwable unused2) {
                    return null;
                }
            case 6:
                return new fu1();
            case 8:
                bp2 bp2Var2 = h31.a;
            case l42.DOUBLE_FIELD_NUMBER /* 7 */:
                return null;
            case 9:
                return Unit.a;
            case 10:
                return Unit.a;
            case 11:
                r00 r00Var = if1.a;
                return null;
            case ViewHierarchyConstants.PICKER_BITMASK /* 12 */:
                throw new IllegalStateException("CompositionLocal LocalLifecycleOwner not present");
            case ViewHierarchyConstants.SWITCH_BITMASK /* 13 */:
                r00 r00Var2 = nf1.a;
                return null;
            case ViewHierarchyConstants.RADIO_GROUP_BITMASK /* 14 */:
                r00 r00Var3 = of1.a;
                return null;
            case 15:
                throw new IllegalStateException("CompositionLocal LocalSavedStateRegistryOwner not present");
            case ViewHierarchyConstants.RATINGBAR_BITMASK /* 16 */:
                r00 r00Var4 = qf1.a;
                return null;
            case FacebookRequestErrorClassification.EC_USER_TOO_MANY_CALLS /* 17 */:
                return new kd2(new LinkedHashMap());
            case 18:
                bp2 bp2Var3 = nd2.a;
                return null;
            default:
                return Boolean.TRUE;
        }
    }
}
