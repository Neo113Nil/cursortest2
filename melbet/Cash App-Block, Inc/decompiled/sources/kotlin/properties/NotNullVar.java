package kotlin.properties;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import kotlin.reflect.KProperty;
import net.idrnd.face.iad.capture.internal.f$$ExternalSyntheticLambda0;

/* loaded from: classes4.dex */
public final class NotNullVar implements ReadWriteProperty {
    public Object value;

    @Override // kotlin.properties.ReadOnlyProperty
    public final Object getValue(Object obj, KProperty kProperty) {
        kProperty.getClass();
        Object obj2 = this.value;
        if (obj2 != null) {
            return obj2;
        }
        f$$ExternalSyntheticLambda0.m("Property ", kProperty.getName(), " should be initialized before get.");
        return null;
    }

    @Override // kotlin.properties.ReadWriteProperty
    public final void setValue(Object obj, KProperty kProperty, Object obj2) {
        kProperty.getClass();
        obj2.getClass();
        this.value = obj2;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("NotNullProperty(");
        if (this.value != null) {
            str = "value=" + this.value;
        } else {
            str = "value not initialized yet";
        }
        return CameraState$Type$EnumUnboxingLocalUtility.m(sb, str, ')');
    }
}
