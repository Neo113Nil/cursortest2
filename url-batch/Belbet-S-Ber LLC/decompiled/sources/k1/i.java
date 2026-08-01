package k1;

import android.animation.ObjectAnimator;
import android.animation.TypeConverter;
import android.graphics.Path;
import android.util.Property;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public abstract class i {
    public static <T, V> ObjectAnimator a(T t4, Property<T, V> property, Path path) {
        return ObjectAnimator.ofObject(t4, property, (TypeConverter) null, path);
    }
}
