package r4;

import android.os.Bundle;
import java.io.Serializable;
import kotlin.collections.i0;
import kotlin.text.o;
import n4.f0;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class b extends f0 {

    /* renamed from: q, reason: collision with root package name */
    public final Class f8146q;

    /* renamed from: r, reason: collision with root package name */
    public final Class f8147r;

    public b(Class cls) {
        super(true);
        this.f8146q = cls;
        if (!Serializable.class.isAssignableFrom(cls)) {
            i0.e(cls, " does not implement Serializable.");
            throw null;
        }
        if (cls.isEnum()) {
            this.f8147r = cls;
        } else {
            i0.e(cls, " is not an Enum type.");
            throw null;
        }
    }

    @Override // n4.f0
    public final Object a(String str, Bundle bundle) {
        bundle.getClass();
        str.getClass();
        Object obj = bundle.get(str);
        if (obj instanceof Serializable) {
            return (Serializable) obj;
        }
        return null;
    }

    @Override // n4.f0
    public final String b() {
        return this.f8147r.getName();
    }

    @Override // n4.f0
    public final Object d(String str) {
        Object obj = null;
        if (str.equals("null")) {
            return null;
        }
        Class cls = this.f8147r;
        Object[] enumConstants = cls.getEnumConstants();
        enumConstants.getClass();
        int length = enumConstants.length;
        int i3 = 0;
        while (true) {
            if (i3 >= length) {
                break;
            }
            Object obj2 = enumConstants[i3];
            Enum r62 = (Enum) obj2;
            r62.getClass();
            if (o.f(r62.name(), str, true)) {
                obj = obj2;
                break;
            }
            i3++;
        }
        Enum r12 = (Enum) obj;
        if (r12 != null) {
            return r12;
        }
        StringBuilder q3 = v4.a.q("Enum value ", str, " not found for type ");
        q3.append(cls.getName());
        q3.append('.');
        throw new IllegalArgumentException(q3.toString());
    }

    @Override // n4.f0
    public final void e(Bundle bundle, String str, Object obj) {
        str.getClass();
        bundle.putSerializable(str, (Serializable) this.f8146q.cast((Serializable) obj));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        return this.f8146q.equals(((b) obj).f8146q);
    }

    public final int hashCode() {
        return this.f8146q.hashCode();
    }
}
