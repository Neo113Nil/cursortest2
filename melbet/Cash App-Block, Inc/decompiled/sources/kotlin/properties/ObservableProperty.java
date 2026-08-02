package kotlin.properties;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import kotlin.reflect.KProperty;

/* loaded from: classes9.dex */
public abstract class ObservableProperty implements ReadWriteProperty {
    public Object value;

    public ObservableProperty(Object obj) {
        this.value = obj;
    }

    public void afterChange(Object obj, KProperty kProperty, Object obj2) {
        kProperty.getClass();
    }

    public void beforeChange(KProperty kProperty) {
        kProperty.getClass();
    }

    @Override // kotlin.properties.ReadOnlyProperty
    public Object getValue(Object obj, KProperty kProperty) {
        kProperty.getClass();
        return this.value;
    }

    @Override // kotlin.properties.ReadWriteProperty
    public void setValue(Object obj, KProperty kProperty, Object obj2) {
        kProperty.getClass();
        Object obj3 = this.value;
        beforeChange(kProperty);
        this.value = obj2;
        afterChange(obj3, kProperty, obj2);
    }

    public String toString() {
        return Recorder$$ExternalSyntheticOutline1.m(new StringBuilder("ObservableProperty(value="), this.value, ')');
    }
}
