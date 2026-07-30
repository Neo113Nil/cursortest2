package D0;

import android.animation.ObjectAnimator;
import android.animation.TypeConverter;
import android.graphics.Path;
import android.util.Property;

/* loaded from: classes.dex */
public abstract class i {
    public static <T, V> ObjectAnimator a(T t9, Property<T, V> property, Path path) {
        return ObjectAnimator.ofObject(t9, property, (TypeConverter) null, path);
    }
}
