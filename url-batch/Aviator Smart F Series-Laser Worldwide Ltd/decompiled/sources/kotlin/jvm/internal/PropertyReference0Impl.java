package kotlin.jvm.internal;

/* loaded from: classes4.dex */
public class PropertyReference0Impl extends PropertyReference0 {
    public PropertyReference0Impl(kotlin.reflect.g gVar, String str, String str2) {
        super(CallableReference.NO_RECEIVER, ((l) gVar).getJClass(), str, str2, !(gVar instanceof kotlin.reflect.d) ? 1 : 0);
    }

    @Override // kotlin.jvm.internal.PropertyReference0, kotlin.reflect.n
    public Object get() {
        getGetter();
        throw null;
    }

    public PropertyReference0Impl(Class cls, String str, String str2, int i8) {
        super(CallableReference.NO_RECEIVER, cls, str, str2, i8);
    }

    public PropertyReference0Impl(Object obj, Class cls, String str, String str2, int i8) {
        super(obj, cls, str, str2, i8);
    }
}
