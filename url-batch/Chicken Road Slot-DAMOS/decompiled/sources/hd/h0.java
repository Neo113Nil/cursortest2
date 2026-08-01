package hd;

import java.io.Serializable;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class h0 implements g, Serializable {

    /* renamed from: d, reason: collision with root package name */
    public Function0 f4505d;

    /* renamed from: e, reason: collision with root package name */
    public Object f4506e;

    @Override // hd.g
    public final Object getValue() {
        if (this.f4506e == c0.f4498a) {
            Function0 function0 = this.f4505d;
            function0.getClass();
            this.f4506e = function0.invoke();
            this.f4505d = null;
        }
        return this.f4506e;
    }

    public final String toString() {
        return this.f4506e != c0.f4498a ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
