package f1;

import android.animation.ObjectAnimator;
import android.animation.TypeConverter;
import android.graphics.Path;
import android.util.Property;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public abstract class i {
    public static <T, V> ObjectAnimator a(T t3, Property<T, V> property, Path path) {
        return ObjectAnimator.ofObject(t3, property, (TypeConverter) null, path);
    }
}
