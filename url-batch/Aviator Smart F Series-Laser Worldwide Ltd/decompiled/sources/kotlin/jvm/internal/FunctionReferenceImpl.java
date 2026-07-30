package kotlin.jvm.internal;

/* loaded from: classes4.dex */
public class FunctionReferenceImpl extends FunctionReference {
    public FunctionReferenceImpl(int i8, kotlin.reflect.g gVar, String str, String str2) {
        super(i8, CallableReference.NO_RECEIVER, ((l) gVar).getJClass(), str, str2, !(gVar instanceof kotlin.reflect.d) ? 1 : 0);
    }

    public FunctionReferenceImpl(int i8, Class cls, String str, String str2, int i9) {
        super(i8, CallableReference.NO_RECEIVER, cls, str, str2, i9);
    }

    public FunctionReferenceImpl(int i8, Object obj, Class cls, String str, String str2, int i9) {
        super(i8, obj, cls, str, str2, i9);
    }
}
