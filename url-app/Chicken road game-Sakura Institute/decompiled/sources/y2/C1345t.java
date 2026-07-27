package y2;

import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata
/* renamed from: y2.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C1345t<T> implements InterfaceC1335j, Serializable {

    /* renamed from: d, reason: collision with root package name */
    public Function0 f11679d;

    /* renamed from: e, reason: collision with root package name */
    public volatile Object f11680e;

    /* renamed from: i, reason: collision with root package name */
    public final Object f11681i;

    public C1345t(Function0 initializer, Object obj, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        obj = (i2 & 2) != 0 ? null : obj;
        Intrinsics.checkNotNullParameter(initializer, "initializer");
        this.f11679d = initializer;
        this.f11680e = C1321A.f11654a;
        this.f11681i = obj == null ? this : obj;
    }

    @Override // y2.InterfaceC1335j
    public final boolean a() {
        return this.f11680e != C1321A.f11654a;
    }

    @Override // y2.InterfaceC1335j
    public final Object getValue() {
        Object obj;
        Object obj2 = this.f11680e;
        C1321A c1321a = C1321A.f11654a;
        if (obj2 != c1321a) {
            return obj2;
        }
        synchronized (this.f11681i) {
            obj = this.f11680e;
            if (obj == c1321a) {
                Function0 function0 = this.f11679d;
                Intrinsics.c(function0);
                obj = function0.invoke();
                this.f11680e = obj;
                this.f11679d = null;
            }
        }
        return obj;
    }

    public final String toString() {
        return a() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
