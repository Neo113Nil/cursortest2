package kotlin.reflect.jvm.internal.impl.km;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes9.dex */
public final class KmConstantValue {
    public final Object value;

    public KmConstantValue(Object obj) {
        this.value = obj;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof KmConstantValue) && Intrinsics.areEqual(this.value, ((KmConstantValue) obj).value);
    }

    public int hashCode() {
        Object obj = this.value;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public String toString() {
        return Recorder$$ExternalSyntheticOutline1.m(new StringBuilder("KmConstantValue(value="), this.value, ')');
    }
}
