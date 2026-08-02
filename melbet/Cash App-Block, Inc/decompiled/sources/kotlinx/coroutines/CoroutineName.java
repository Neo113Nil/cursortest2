package kotlinx.coroutines;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import kotlin.coroutines.AbstractCoroutineContextElement;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.Job;

/* loaded from: classes3.dex */
public final class CoroutineName extends AbstractCoroutineContextElement {
    public static final Job.Key Key = new Job.Key();
    public final String name;

    public CoroutineName(String str) {
        super(Key);
        this.name = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CoroutineName) && Intrinsics.areEqual(this.name, ((CoroutineName) obj).name);
    }

    public final int hashCode() {
        return this.name.hashCode();
    }

    public final String toString() {
        return CameraState$Type$EnumUnboxingLocalUtility.m(new StringBuilder("CoroutineName("), this.name, ')');
    }
}
