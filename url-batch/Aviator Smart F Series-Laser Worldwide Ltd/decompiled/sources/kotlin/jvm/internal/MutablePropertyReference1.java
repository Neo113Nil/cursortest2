package kotlin.jvm.internal;

import kotlin.reflect.i;
import kotlin.reflect.k;
import kotlin.reflect.m;
import kotlin.reflect.o;

/* loaded from: classes4.dex */
public abstract class MutablePropertyReference1 extends MutablePropertyReference implements kotlin.reflect.k {
    public MutablePropertyReference1() {
    }

    @Override // kotlin.jvm.internal.CallableReference
    protected kotlin.reflect.c computeReflected() {
        return u.mutableProperty1(this);
    }

    @Override // kotlin.reflect.k, kotlin.reflect.o
    public abstract /* synthetic */ Object get(Object obj);

    @Override // kotlin.reflect.k, kotlin.reflect.o
    public Object getDelegate(Object obj) {
        return ((kotlin.reflect.k) getReflected()).getDelegate(obj);
    }

    @Override // kotlin.jvm.internal.MutablePropertyReference, kotlin.jvm.internal.PropertyReference, kotlin.reflect.m, kotlin.reflect.i
    public /* bridge */ /* synthetic */ m.a getGetter() {
        getGetter();
        return null;
    }

    @Override // kotlin.jvm.internal.MutablePropertyReference, kotlin.reflect.i
    public /* bridge */ /* synthetic */ i.a getSetter() {
        getSetter();
        return null;
    }

    @Override // kotlin.reflect.k, kotlin.reflect.o, f6.l
    public Object invoke(Object obj) {
        return get(obj);
    }

    @Override // kotlin.reflect.k
    public abstract /* synthetic */ void set(Object obj, Object obj2);

    public MutablePropertyReference1(Object obj) {
        super(obj);
    }

    @Override // kotlin.jvm.internal.MutablePropertyReference, kotlin.jvm.internal.PropertyReference, kotlin.reflect.m, kotlin.reflect.i
    public o.a getGetter() {
        ((kotlin.reflect.k) getReflected()).getGetter();
        return null;
    }

    @Override // kotlin.jvm.internal.MutablePropertyReference, kotlin.reflect.i
    public k.a getSetter() {
        ((kotlin.reflect.k) getReflected()).getSetter();
        return null;
    }

    public MutablePropertyReference1(Object obj, Class cls, String str, String str2, int i8) {
        super(obj, cls, str, str2, i8);
    }
}
