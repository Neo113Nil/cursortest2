package c5;

import android.animation.ObjectAnimator;
import android.animation.TypeConverter;
import android.graphics.Path;
import android.util.Property;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public abstract class i {
    public static <T, V> ObjectAnimator a(T t3, Property<T, V> property, Path path) {
        return ObjectAnimator.ofObject(t3, property, (TypeConverter) null, path);
    }
}
