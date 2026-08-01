package l8;

import android.util.Log;
import com.google.firebase.components.ComponentRegistrar;
import java.lang.reflect.InvocationTargetException;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final /* synthetic */ class d implements w8.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5904a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f5905b;

    public /* synthetic */ d(int i3, Object obj) {
        this.f5904a = i3;
        this.f5905b = obj;
    }

    @Override // w8.a
    public final Object get() {
        switch (this.f5904a) {
            case 0:
                String str = (String) this.f5905b;
                try {
                    Class<?> cls = Class.forName(str);
                    if (ComponentRegistrar.class.isAssignableFrom(cls)) {
                        return (ComponentRegistrar) cls.getDeclaredConstructor(null).newInstance(null);
                    }
                    throw new m("Class " + str + " is not an instance of com.google.firebase.components.ComponentRegistrar");
                } catch (ClassNotFoundException unused) {
                    Log.w("ComponentDiscovery", "Class " + str + " is not an found.");
                    return null;
                } catch (IllegalAccessException e2) {
                    throw new m(n0.l.g("Could not instantiate ", str, "."), e2);
                } catch (InstantiationException e9) {
                    throw new m(n0.l.g("Could not instantiate ", str, "."), e9);
                } catch (NoSuchMethodException e10) {
                    throw new m(v4.a.k("Could not instantiate ", str), e10);
                } catch (InvocationTargetException e11) {
                    throw new m(v4.a.k("Could not instantiate ", str), e11);
                }
            case 1:
                return (ComponentRegistrar) this.f5905b;
            default:
                return new y8.c((g8.g) this.f5905b);
        }
    }
}
