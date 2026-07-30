package kotlin.jvm.internal;

import kotlin.reflect.m;
import kotlin.reflect.p;

/* loaded from: classes4.dex */
public abstract class PropertyReference2 extends PropertyReference implements kotlin.reflect.p {
    public PropertyReference2() {
    }

    @Override // kotlin.jvm.internal.CallableReference
    protected kotlin.reflect.c computeReflected() {
        return u.property2(this);
    }

    @Override // kotlin.reflect.p
    public abstract /* synthetic */ Object get(Object obj, Object obj2);

    @Override // kotlin.reflect.p
    public Object getDelegate(Object obj, Object obj2) {
        return ((kotlin.reflect.p) getReflected()).getDelegate(obj, obj2);
    }

    @Override // kotlin.jvm.internal.PropertyReference, kotlin.reflect.m, kotlin.reflect.i
    public /* bridge */ /* synthetic */ m.a getGetter() {
        getGetter();
        return null;
    }

    @Override // kotlin.reflect.p, f6.p
    public Object invoke(Object obj, Object obj2) {
        return get(obj, obj2);
    }

    public PropertyReference2(Class cls, String str, String str2, int i8) {
        super(CallableReference.NO_RECEIVER, cls, str, str2, i8);
    }

    @Override // kotlin.jvm.internal.PropertyReference, kotlin.reflect.m, kotlin.reflect.i
    public p.a getGetter() {
        ((kotlin.reflect.p) getReflected()).getGetter();
        return null;
    }
}
