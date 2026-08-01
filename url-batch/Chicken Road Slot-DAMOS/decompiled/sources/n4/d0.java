package n4;

import android.os.Bundle;
import android.os.Parcelable;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class d0 extends f0 {

    /* renamed from: q, reason: collision with root package name */
    public final Class f7040q;

    public d0(Class cls) {
        super(true);
        if (Parcelable.class.isAssignableFrom(cls) || Serializable.class.isAssignableFrom(cls)) {
            this.f7040q = cls;
        } else {
            kotlin.collections.i0.e(cls, " does not implement Parcelable or Serializable.");
            throw null;
        }
    }

    @Override // n4.f0
    public final Object a(String str, Bundle bundle) {
        bundle.getClass();
        str.getClass();
        return bundle.get(str);
    }

    @Override // n4.f0
    public final String b() {
        return this.f7040q.getName();
    }

    @Override // n4.f0
    public final Object d(String str) {
        throw new UnsupportedOperationException("Parcelables don't support default values.");
    }

    @Override // n4.f0
    public final void e(Bundle bundle, String str, Object obj) {
        str.getClass();
        this.f7040q.cast(obj);
        if (obj == null || (obj instanceof Parcelable)) {
            bundle.putParcelable(str, (Parcelable) obj);
        } else if (obj instanceof Serializable) {
            bundle.putSerializable(str, (Serializable) obj);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !d0.class.equals(obj.getClass())) {
            return false;
        }
        return Intrinsics.a(this.f7040q, ((d0) obj).f7040q);
    }

    public final int hashCode() {
        return this.f7040q.hashCode();
    }
}
