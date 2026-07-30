package kotlin.jvm.internal;

import kotlin.reflect.m;
import kotlin.reflect.o;

/* loaded from: classes4.dex */
public abstract class PropertyReference1 extends PropertyReference implements kotlin.reflect.o {
    public PropertyReference1() {
    }

    @Override // kotlin.jvm.internal.CallableReference
    protected kotlin.reflect.c computeReflected() {
        return u.property1(this);
    }

    @Override // kotlin.reflect.o
    public abstract /* synthetic */ Object get(Object obj);

    @Override // kotlin.reflect.o
    public Object getDelegate(Object obj) {
        return ((kotlin.reflect.o) getReflected()).getDelegate(obj);
    }

    @Override // kotlin.jvm.internal.PropertyReference, kotlin.reflect.m, kotlin.reflect.i
    public /* bridge */ /* synthetic */ m.a getGetter() {
        getGetter();
        return null;
    }

    @Override // kotlin.reflect.o, f6.l
    public Object invoke(Object obj) {
        return get(obj);
    }

    public PropertyReference1(Object obj) {
        super(obj);
    }

    @Override // kotlin.jvm.internal.PropertyReference, kotlin.reflect.m, kotlin.reflect.i
    public o.a getGetter() {
        ((kotlin.reflect.o) getReflected()).getGetter();
        return null;
    }

    public PropertyReference1(Object obj, Class cls, String str, String str2, int i8) {
        super(obj, cls, str, str2, i8);
    }
}
