package defpackage;

import android.os.Bundle;
import java.io.Serializable;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class rr0 extends dc1 {
    public final Class BRwzKIf41E4i;
    public final Class XL4ISE6Oc65B;

    public rr0(Class cls) {
        super(true);
        this.BRwzKIf41E4i = cls;
        if (!Serializable.class.isAssignableFrom(cls)) {
            u9.a92UlCVFR9N8(cls, " does not implement Serializable.");
            throw null;
        }
        if (cls.isEnum()) {
            this.XL4ISE6Oc65B = cls;
        } else {
            u9.a92UlCVFR9N8(cls, " is not an Enum type.");
            throw null;
        }
    }

    @Override // defpackage.dc1
    public final Object PxuCJdSBwIXG(String str, Bundle bundle) {
        bundle.getClass();
        str.getClass();
        Object obj = bundle.get(str);
        if (obj instanceof Serializable) {
            return (Serializable) obj;
        }
        return null;
    }

    @Override // defpackage.dc1
    public final Object Y1f8riQaR6yg(String str) {
        Object obj = null;
        if (str.equals("null")) {
            return null;
        }
        Class cls = this.XL4ISE6Oc65B;
        Object[] enumConstants = cls.getEnumConstants();
        enumConstants.getClass();
        int length = enumConstants.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            Object obj2 = enumConstants[i];
            Enum r5 = (Enum) obj2;
            r5.getClass();
            if (pa2.xbgXKYA2cIfu(r5.name(), str, true)) {
                obj = obj2;
                break;
            }
            i++;
        }
        Enum r1 = (Enum) obj;
        if (r1 != null) {
            return r1;
        }
        throw new IllegalArgumentException("Enum value " + str + " not found for type " + cls.getName() + '.');
    }

    @Override // defpackage.dc1
    public final void e9gEMXR7LXtO(Bundle bundle, String str, Object obj) {
        str.getClass();
        bundle.putSerializable(str, (Serializable) this.BRwzKIf41E4i.cast((Serializable) obj));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rr0)) {
            return false;
        }
        return this.BRwzKIf41E4i.equals(((rr0) obj).BRwzKIf41E4i);
    }

    public final int hashCode() {
        return this.BRwzKIf41E4i.hashCode();
    }

    @Override // defpackage.dc1
    public final String lS5Rgt96tfkO() {
        return this.XL4ISE6Oc65B.getName();
    }
}
