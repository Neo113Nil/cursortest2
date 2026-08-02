package net.idrnd.face.iad.capture.internal;

import com.miteksystems.misnap.camera.a.b;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;

/* loaded from: classes9.dex */
public final class x3 extends b {
    public final Object a;

    public x3(Object obj) {
        this.a = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x3) && this.a.equals(((x3) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Success(value=", ")", this.a);
    }
}
