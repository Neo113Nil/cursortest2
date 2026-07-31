package C2;

import java.util.Iterator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import y2.InterfaceC3527b;

/* renamed from: C2.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC0297a implements InterfaceC3527b {
    public /* synthetic */ AbstractC0297a(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public static /* synthetic */ void i(AbstractC0297a abstractC0297a, B2.c cVar, int i4, Object obj, boolean z4, int i5, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: readElement");
        }
        if ((i5 & 8) != 0) {
            z4 = true;
        }
        abstractC0297a.h(cVar, i4, obj, z4);
    }

    private final int j(B2.c cVar, Object obj) {
        int g4 = cVar.g(getDescriptor());
        c(obj, g4);
        return g4;
    }

    protected abstract Object a();

    protected abstract int b(Object obj);

    protected abstract void c(Object obj, int i4);

    protected abstract Iterator d(Object obj);

    public Object deserialize(B2.e decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        return f(decoder, null);
    }

    protected abstract int e(Object obj);

    public final Object f(B2.e decoder, Object obj) {
        Object a4;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        if (obj == null || (a4 = k(obj)) == null) {
            a4 = a();
        }
        Object obj2 = a4;
        int b4 = b(obj2);
        B2.c b5 = decoder.b(getDescriptor());
        if (!b5.v()) {
            while (true) {
                int t4 = b5.t(getDescriptor());
                if (t4 == -1) {
                    break;
                }
                i(this, b5, b4 + t4, obj2, false, 8, null);
            }
        } else {
            g(b5, obj2, b4, j(b5, obj2));
        }
        b5.c(getDescriptor());
        return l(obj2);
    }

    protected abstract void g(B2.c cVar, Object obj, int i4, int i5);

    protected abstract void h(B2.c cVar, int i4, Object obj, boolean z4);

    protected abstract Object k(Object obj);

    protected abstract Object l(Object obj);

    private AbstractC0297a() {
    }
}
