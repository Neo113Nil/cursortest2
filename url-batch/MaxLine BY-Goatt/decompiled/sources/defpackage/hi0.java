package defpackage;

import java.io.Serializable;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class hi0 implements Serializable {
    private static final long serialVersionUID = 0;
    public final Class m;

    public hi0(Enum[] enumArr) {
        enumArr.getClass();
        Class<?> componentType = enumArr.getClass().getComponentType();
        componentType.getClass();
        this.m = componentType;
    }

    private final Object readResolve() {
        Object[] enumConstants = this.m.getEnumConstants();
        enumConstants.getClass();
        return new gi0((Enum[]) enumConstants);
    }
}
