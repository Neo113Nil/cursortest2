package kotlin.jvm.internal;

import kotlin.reflect.i;
import kotlin.reflect.l;
import kotlin.reflect.m;
import kotlin.reflect.p;

/* loaded from: classes4.dex */
public abstract class MutablePropertyReference2 extends MutablePropertyReference implements kotlin.reflect.l {
    public MutablePropertyReference2() {
    }

    @Override // kotlin.jvm.internal.CallableReference
    protected kotlin.reflect.c computeReflected() {
        return u.mutableProperty2(this);
    }

    @Override // kotlin.reflect.l, kotlin.reflect.p
    public abstract /* synthetic */ Object get(Object obj, Object obj2);

    @Override // kotlin.reflect.l, kotlin.reflect.p
    public Object getDelegate(Object obj, Object obj2) {
        return ((kotlin.reflect.l) getReflected()).getDelegate(obj, obj2);
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

    @Override // kotlin.reflect.l, kotlin.reflect.p, f6.p
    public Object invoke(Object obj, Object obj2) {
        return get(obj, obj2);
    }

    @Override // kotlin.reflect.l
    public abstract /* synthetic */ void set(Object obj, Object obj2, Object obj3);

    public MutablePropertyReference2(Class cls, String str, String str2, int i8) {
        super(CallableReference.NO_RECEIVER, cls, str, str2, i8);
    }

    @Override // kotlin.jvm.internal.MutablePropertyReference, kotlin.jvm.internal.PropertyReference, kotlin.reflect.m, kotlin.reflect.i
    public p.a getGetter() {
        ((kotlin.reflect.l) getReflected()).getGetter();
        return null;
    }

    @Override // kotlin.jvm.internal.MutablePropertyReference, kotlin.reflect.i
    public l.a getSetter() {
        ((kotlin.reflect.l) getReflected()).getSetter();
        return null;
    }
}
