package defpackage;

import android.os.Bundle;
import android.os.Parcelable;
import java.io.Serializable;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class bc1 extends dc1 {
    public final Class BRwzKIf41E4i;

    public bc1(Class cls) {
        super(true);
        if (Parcelable.class.isAssignableFrom(cls) || Serializable.class.isAssignableFrom(cls)) {
            this.BRwzKIf41E4i = cls;
        } else {
            u9.a92UlCVFR9N8(cls, " does not implement Parcelable or Serializable.");
            throw null;
        }
    }

    @Override // defpackage.dc1
    public final Object PxuCJdSBwIXG(String str, Bundle bundle) {
        bundle.getClass();
        str.getClass();
        return bundle.get(str);
    }

    @Override // defpackage.dc1
    public final Object Y1f8riQaR6yg(String str) {
        throw new UnsupportedOperationException("Parcelables don't support default values.");
    }

    @Override // defpackage.dc1
    public final void e9gEMXR7LXtO(Bundle bundle, String str, Object obj) {
        str.getClass();
        this.BRwzKIf41E4i.cast(obj);
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
        if (obj == null || !bc1.class.equals(obj.getClass())) {
            return false;
        }
        return cs0.wdg6QnbFHrFF(this.BRwzKIf41E4i, ((bc1) obj).BRwzKIf41E4i);
    }

    public final int hashCode() {
        return this.BRwzKIf41E4i.hashCode();
    }

    @Override // defpackage.dc1
    public final String lS5Rgt96tfkO() {
        return this.BRwzKIf41E4i.getName();
    }
}
