package n4;

import android.os.Bundle;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public class e0 extends f0 {

    /* renamed from: q, reason: collision with root package name */
    public final Class f7041q;

    public e0(Class cls) {
        super(true);
        if (!Serializable.class.isAssignableFrom(cls)) {
            kotlin.collections.i0.e(cls, " does not implement Serializable.");
            throw null;
        }
        if (cls.isEnum()) {
            kotlin.collections.i0.e(cls, " is an Enum. You should use EnumType instead.");
            throw null;
        }
        this.f7041q = cls;
    }

    @Override // n4.f0
    public final Object a(String str, Bundle bundle) {
        bundle.getClass();
        str.getClass();
        return (Serializable) bundle.get(str);
    }

    @Override // n4.f0
    public String b() {
        return this.f7041q.getName();
    }

    @Override // n4.f0
    public final void e(Bundle bundle, String str, Object obj) {
        Serializable serializable = (Serializable) obj;
        str.getClass();
        serializable.getClass();
        this.f7041q.cast(serializable);
        bundle.putSerializable(str, serializable);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e0)) {
            return false;
        }
        return Intrinsics.a(this.f7041q, ((e0) obj).f7041q);
    }

    @Override // n4.f0
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public Serializable d(String str) {
        throw new UnsupportedOperationException("Serializables don't support default values.");
    }

    public final int hashCode() {
        return this.f7041q.hashCode();
    }

    public e0(Class cls, int i3) {
        super(false);
        if (Serializable.class.isAssignableFrom(cls)) {
            this.f7041q = cls;
        } else {
            kotlin.collections.i0.e(cls, " does not implement Serializable.");
            throw null;
        }
    }
}
