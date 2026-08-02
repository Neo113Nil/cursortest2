package f2;

import d2.InterfaceC0300c;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.r;

/* loaded from: classes.dex */
public abstract class i extends AbstractC0326c implements kotlin.jvm.internal.g {

    /* renamed from: d, reason: collision with root package name */
    public final int f4988d;

    public i(int i3, InterfaceC0300c interfaceC0300c) {
        super(interfaceC0300c);
        this.f4988d = i3;
    }

    @Override // kotlin.jvm.internal.g
    public final int getArity() {
        return this.f4988d;
    }

    @Override // f2.AbstractC0324a
    public final String toString() {
        if (this.f4979a != null) {
            return super.toString();
        }
        r.f9693a.getClass();
        String obj = getClass().getGenericInterfaces()[0].toString();
        if (obj.startsWith("kotlin.jvm.functions.")) {
            obj = obj.substring(21);
        }
        j.d(obj, "renderLambdaToString(...)");
        return obj;
    }
}
