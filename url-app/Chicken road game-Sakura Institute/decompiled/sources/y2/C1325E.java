package y2;

import java.io.Serializable;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: y2.E, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1325E implements InterfaceC1335j, Serializable {

    /* renamed from: d, reason: collision with root package name */
    public Function0 f11658d;

    /* renamed from: e, reason: collision with root package name */
    public Object f11659e;

    @Override // y2.InterfaceC1335j
    public final boolean a() {
        return this.f11659e != C1321A.f11654a;
    }

    @Override // y2.InterfaceC1335j
    public final Object getValue() {
        if (this.f11659e == C1321A.f11654a) {
            Function0 function0 = this.f11658d;
            Intrinsics.c(function0);
            this.f11659e = function0.invoke();
            this.f11658d = null;
        }
        return this.f11659e;
    }

    public final String toString() {
        return a() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
