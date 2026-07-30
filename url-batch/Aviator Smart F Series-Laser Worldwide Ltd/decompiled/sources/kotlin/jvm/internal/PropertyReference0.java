package kotlin.jvm.internal;

import kotlin.reflect.m;
import kotlin.reflect.n;

/* loaded from: classes4.dex */
public abstract class PropertyReference0 extends PropertyReference implements kotlin.reflect.n {
    public PropertyReference0() {
    }

    @Override // kotlin.jvm.internal.CallableReference
    protected kotlin.reflect.c computeReflected() {
        return u.property0(this);
    }

    @Override // kotlin.reflect.n
    public abstract /* synthetic */ Object get();

    @Override // kotlin.reflect.n
    public Object getDelegate() {
        return ((kotlin.reflect.n) getReflected()).getDelegate();
    }

    @Override // kotlin.jvm.internal.PropertyReference, kotlin.reflect.m, kotlin.reflect.i
    public /* bridge */ /* synthetic */ m.a getGetter() {
        getGetter();
        return null;
    }

    @Override // kotlin.reflect.n, f6.a
    public Object invoke() {
        return get();
    }

    public PropertyReference0(Object obj) {
        super(obj);
    }

    @Override // kotlin.jvm.internal.PropertyReference, kotlin.reflect.m, kotlin.reflect.i
    public n.a getGetter() {
        ((kotlin.reflect.n) getReflected()).getGetter();
        return null;
    }

    public PropertyReference0(Object obj, Class cls, String str, String str2, int i8) {
        super(obj, cls, str, str2, i8);
    }
}
