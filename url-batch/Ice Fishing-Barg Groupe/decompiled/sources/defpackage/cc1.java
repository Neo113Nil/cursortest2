package defpackage;

import android.os.Bundle;
import java.io.Serializable;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public class cc1 extends dc1 {
    public final Class BRwzKIf41E4i;

    public cc1(Class cls) {
        super(true);
        if (!Serializable.class.isAssignableFrom(cls)) {
            u9.a92UlCVFR9N8(cls, " does not implement Serializable.");
            throw null;
        }
        if (cls.isEnum()) {
            u9.a92UlCVFR9N8(cls, " is an Enum. You should use EnumType instead.");
            throw null;
        }
        this.BRwzKIf41E4i = cls;
    }

    @Override // defpackage.dc1
    public final Object PxuCJdSBwIXG(String str, Bundle bundle) {
        bundle.getClass();
        str.getClass();
        return (Serializable) bundle.get(str);
    }

    @Override // defpackage.dc1
    /* renamed from: RAsUl2FVSrh6, reason: merged with bridge method [inline-methods] */
    public Serializable Y1f8riQaR6yg(String str) {
        throw new UnsupportedOperationException("Serializables don't support default values.");
    }

    @Override // defpackage.dc1
    public final void e9gEMXR7LXtO(Bundle bundle, String str, Object obj) {
        Serializable serializable = (Serializable) obj;
        str.getClass();
        serializable.getClass();
        this.BRwzKIf41E4i.cast(serializable);
        bundle.putSerializable(str, serializable);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cc1)) {
            return false;
        }
        return cs0.wdg6QnbFHrFF(this.BRwzKIf41E4i, ((cc1) obj).BRwzKIf41E4i);
    }

    public final int hashCode() {
        return this.BRwzKIf41E4i.hashCode();
    }

    @Override // defpackage.dc1
    public String lS5Rgt96tfkO() {
        return this.BRwzKIf41E4i.getName();
    }

    public cc1(Class cls, int i) {
        super(false);
        if (Serializable.class.isAssignableFrom(cls)) {
            this.BRwzKIf41E4i = cls;
        } else {
            u9.a92UlCVFR9N8(cls, " does not implement Serializable.");
            throw null;
        }
    }
}
