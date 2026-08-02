package kotlin.internal.jdk7;

import java.util.Arrays;
import java.util.List;
import kotlin.internal.PlatformImplementations;

/* loaded from: classes.dex */
public class JDK7PlatformImplementations extends PlatformImplementations {

    /* loaded from: classes9.dex */
    public final class ReflectSdkVersion {
        public static final ReflectSdkVersion INSTANCE = new ReflectSdkVersion();
        public static final Integer sdkVersion;

        static {
            Integer num;
            Object obj;
            Integer num2 = null;
            try {
                obj = Class.forName("android.os.Build$VERSION").getField("SDK_INT").get(null);
            } catch (Throwable unused) {
            }
            if (obj instanceof Integer) {
                num = (Integer) obj;
                if (num != null && num.intValue() > 0) {
                    num2 = num;
                }
                sdkVersion = num2;
            }
            num = null;
            if (num != null) {
                num2 = num;
            }
            sdkVersion = num2;
        }
    }

    @Override // kotlin.internal.PlatformImplementations
    public final void addSuppressed(Throwable th, Throwable th2) {
        th.getClass();
        th2.getClass();
        Integer num = ReflectSdkVersion.sdkVersion;
        if (num == null || num.intValue() >= 19) {
            th.addSuppressed(th2);
        } else {
            super.addSuppressed(th, th2);
        }
    }

    @Override // kotlin.internal.PlatformImplementations
    public final List getSuppressed(Throwable th) {
        th.getClass();
        Integer num = ReflectSdkVersion.sdkVersion;
        if (num != null && num.intValue() < 19) {
            return super.getSuppressed(th);
        }
        Throwable[] suppressed = th.getSuppressed();
        suppressed.getClass();
        List asList = Arrays.asList(suppressed);
        asList.getClass();
        return asList;
    }
}
