package defpackage;

import android.util.Log;
import com.android.installreferrer.api.InstallReferrerClient;
import com.google.firebase.components.ComponentRegistrar;
import java.lang.reflect.InvocationTargetException;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final /* synthetic */ class zj implements p01 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ zj(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.p01
    public final Object get() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                String str = (String) obj;
                try {
                    Class<?> cls = Class.forName(str);
                    if (ComponentRegistrar.class.isAssignableFrom(cls)) {
                        return (ComponentRegistrar) cls.getDeclaredConstructor(null).newInstance(null);
                    }
                    throw new ta0("Class " + str + " is not an instance of com.google.firebase.components.ComponentRegistrar");
                } catch (ClassNotFoundException unused) {
                    Log.w("ComponentDiscovery", "Class " + str + " is not an found.");
                    return null;
                } catch (IllegalAccessException e) {
                    throw new ta0(qy0.k("Could not instantiate ", str, "."), e);
                } catch (InstantiationException e2) {
                    throw new ta0(qy0.k("Could not instantiate ", str, "."), e2);
                } catch (NoSuchMethodException e3) {
                    throw new ta0(qy0.j("Could not instantiate ", str), e3);
                } catch (InvocationTargetException e4) {
                    throw new ta0(qy0.j("Could not instantiate ", str), e4);
                }
            case 1:
                return (ComponentRegistrar) obj;
            default:
                return new a70((ez) obj);
        }
    }
}
