package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class krd implements Serializable {
    private static final long serialVersionUID = 0;
    private final Class a;

    public krd(Enum[] enumArr) {
        Class<?> componentType = enumArr.getClass().getComponentType();
        componentType.getClass();
        this.a = componentType;
    }

    private final Object readResolve() {
        Object[] enumConstants = this.a.getEnumConstants();
        enumConstants.getClass();
        return ixf.k((Enum[]) enumConstants);
    }
}
