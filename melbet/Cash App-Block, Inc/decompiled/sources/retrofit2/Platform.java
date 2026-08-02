package retrofit2;

import retrofit2.Reflection;

/* loaded from: classes3.dex */
public abstract class Platform {
    public static final Reflection builtInFactories;
    public static final AndroidMainExecutor callbackExecutor;
    public static final Reflection reflection;

    static {
        String property = System.getProperty("java.vm.name");
        property.getClass();
        if (property.equals("RoboVM")) {
            callbackExecutor = null;
            reflection = new Reflection(0);
            builtInFactories = new Reflection(3);
        } else if (property.equals("Dalvik")) {
            callbackExecutor = new AndroidMainExecutor(0);
            reflection = new Reflection.Android24(0);
            builtInFactories = new BuiltInFactories$Java8(3);
        } else {
            callbackExecutor = null;
            reflection = new Reflection.Java8();
            builtInFactories = new BuiltInFactories$Java8(3);
        }
    }
}
