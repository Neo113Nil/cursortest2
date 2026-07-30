package kotlin.jvm.internal;

import kotlin.reflect.i;
import kotlin.reflect.j;
import kotlin.reflect.m;
import kotlin.reflect.n;

/* loaded from: classes4.dex */
public abstract class MutablePropertyReference0 extends MutablePropertyReference implements kotlin.reflect.j {
    public MutablePropertyReference0() {
    }

    @Override // kotlin.jvm.internal.CallableReference
    protected kotlin.reflect.c computeReflected() {
        return u.mutableProperty0(this);
    }

    @Override // kotlin.reflect.j, kotlin.reflect.n
    public abstract /* synthetic */ Object get();

    @Override // kotlin.reflect.j, kotlin.reflect.n
    public Object getDelegate() {
        return ((kotlin.reflect.j) getReflected()).getDelegate();
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

    @Override // kotlin.reflect.j, kotlin.reflect.n, f6.a
    public Object invoke() {
        return get();
    }

    @Override // kotlin.reflect.j
    public abstract /* synthetic */ void set(Object obj);

    public MutablePropertyReference0(Object obj) {
        super(obj);
    }

    @Override // kotlin.jvm.internal.MutablePropertyReference, kotlin.jvm.internal.PropertyReference, kotlin.reflect.m, kotlin.reflect.i
    public n.a getGetter() {
        ((kotlin.reflect.j) getReflected()).getGetter();
        return null;
    }

    @Override // kotlin.jvm.internal.MutablePropertyReference, kotlin.reflect.i
    public j.a getSetter() {
        ((kotlin.reflect.j) getReflected()).getSetter();
        return null;
    }

    public MutablePropertyReference0(Object obj, Class cls, String str, String str2, int i8) {
        super(obj, cls, str, str2, i8);
    }
}
