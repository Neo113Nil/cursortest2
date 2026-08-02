package net.idrnd.face.iad.capture.internal;

import com.miteksystems.misnap.camera.a.b;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;

/* loaded from: classes9.dex */
public final class w3 extends b {
    public final Object a;

    public w3(Object obj) {
        this.a = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w3) && this.a.equals(((w3) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Failure(error=", ")", this.a);
    }
}
