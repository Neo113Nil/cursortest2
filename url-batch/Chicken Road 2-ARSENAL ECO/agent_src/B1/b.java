package B1;

import W4.o;
import android.util.Log;
import com.google.firebase.components.ComponentRegistrar;
import com.onesignal.inAppMessages.internal.display.impl.a;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
public final /* synthetic */ class b implements A1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f87a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f88b;

    public /* synthetic */ b(int i7, Object obj) {
        this.f87a = i7;
        this.f88b = obj;
    }

    @Override // A1.a
    public final Object get() {
        switch (this.f87a) {
            case 0:
                return new C1.b((m1.g) this.f88b);
            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                String str = (String) this.f88b;
                try {
                    Class<?> cls = Class.forName(str);
                    if (ComponentRegistrar.class.isAssignableFrom(cls)) {
                        return (ComponentRegistrar) cls.getDeclaredConstructor(null).newInstance(null);
                    }
                    throw new p1.j("Class " + str + " is not an instance of com.google.firebase.components.ComponentRegistrar");
                } catch (ClassNotFoundException unused) {
                    Log.w("ComponentDiscovery", "Class " + str + " is not an found.");
                    return null;
                } catch (IllegalAccessException e4) {
                    throw new p1.j(o.e("Could not instantiate ", str, "."), e4);
                } catch (InstantiationException e7) {
                    throw new p1.j(o.e("Could not instantiate ", str, "."), e7);
                } catch (NoSuchMethodException e8) {
                    throw new p1.j(C1.c.h("Could not instantiate ", str), e8);
                } catch (InvocationTargetException e9) {
                    throw new p1.j(C1.c.h("Could not instantiate ", str), e9);
                }
            default:
                return (ComponentRegistrar) this.f88b;
        }
    }
}
