package b6;

import androidx.exifinterface.media.ExifInterface;
import kotlin.jvm.internal.s;

/* loaded from: classes4.dex */
public abstract class b {
    public static final a IMPLEMENTATIONS = new d6.c();

    public static final boolean apiVersionIsAtLeast(int i8, int i9, int i10) {
        return y5.d.CURRENT.isAtLeast(i8, i9, i10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final /* synthetic */ <T> T castToBaseType(Object obj) {
        try {
            s.reifiedOperationMarker(1, ExifInterface.GPS_DIRECTION_TRUE);
            return obj;
        } catch (ClassCastException e8) {
            ClassLoader classLoader = obj.getClass().getClassLoader();
            s.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
            ClassLoader classLoader2 = Object.class.getClassLoader();
            if (s.areEqual(classLoader, classLoader2)) {
                throw e8;
            }
            throw new ClassNotFoundException("Instance class was loaded from a different classloader: " + classLoader + ", base type classloader: " + classLoader2, e8);
        }
    }
}
