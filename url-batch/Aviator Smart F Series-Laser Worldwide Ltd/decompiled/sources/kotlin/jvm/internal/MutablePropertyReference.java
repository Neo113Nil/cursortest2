package kotlin.jvm.internal;

import kotlin.reflect.i;
import kotlin.reflect.m;

/* loaded from: classes4.dex */
public abstract class MutablePropertyReference extends PropertyReference implements kotlin.reflect.i {
    public MutablePropertyReference() {
    }

    @Override // kotlin.jvm.internal.PropertyReference, kotlin.reflect.m, kotlin.reflect.i
    public abstract /* synthetic */ m.a getGetter();

    @Override // kotlin.reflect.i
    public abstract /* synthetic */ i.a getSetter();

    public MutablePropertyReference(Object obj) {
        super(obj);
    }

    public MutablePropertyReference(Object obj, Class cls, String str, String str2, int i8) {
        super(obj, cls, str, str2, i8);
    }
}
