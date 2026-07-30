package S1;

import android.util.Log;
import com.google.firebase.components.ComponentRegistrar;
import e2.InterfaceC0372a;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
public final /* synthetic */ class d implements InterfaceC0372a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2472a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2473b;

    public /* synthetic */ d(int i2, Object obj) {
        this.f2472a = i2;
        this.f2473b = obj;
    }

    @Override // e2.InterfaceC0372a
    public final Object get() {
        switch (this.f2472a) {
            case 0:
                String str = (String) this.f2473b;
                try {
                    Class<?> cls = Class.forName(str);
                    if (ComponentRegistrar.class.isAssignableFrom(cls)) {
                        return (ComponentRegistrar) cls.getDeclaredConstructor(null).newInstance(null);
                    }
                    throw new m("Class " + str + " is not an instance of com.google.firebase.components.ComponentRegistrar");
                } catch (ClassNotFoundException unused) {
                    Log.w("ComponentDiscovery", "Class " + str + " is not an found.");
                    return null;
                } catch (IllegalAccessException e7) {
                    throw new m(r4.f.d("Could not instantiate ", str, "."), e7);
                } catch (InstantiationException e8) {
                    throw new m(r4.f.d("Could not instantiate ", str, "."), e8);
                } catch (NoSuchMethodException e9) {
                    throw new m(r4.f.i("Could not instantiate ", str), e9);
                } catch (InvocationTargetException e10) {
                    throw new m(r4.f.i("Could not instantiate ", str), e10);
                }
            case 1:
                return (ComponentRegistrar) this.f2473b;
            default:
                return new g2.c((P1.g) this.f2473b);
        }
    }
}
