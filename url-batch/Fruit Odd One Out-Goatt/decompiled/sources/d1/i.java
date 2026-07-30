package d1;

import java.io.Serializable;

/* compiled from: r8-map-id-a2d84f7cf5ca45495ceb585fa5ae0341076c951e080151b58cf9359cc6e7e89d */
/* loaded from: classes.dex */
public abstract class i implements f, Serializable {

    /* renamed from: b, reason: collision with root package name */
    public final int f92b;

    public i(int i2) {
        this.f92b = i2;
    }

    @Override // d1.f
    public final int c() {
        return this.f92b;
    }

    public final String toString() {
        l.f95a.getClass();
        String obj = getClass().getGenericInterfaces()[0].toString();
        return obj.startsWith("kotlin.jvm.functions.") ? obj.substring(21) : obj;
    }
}
