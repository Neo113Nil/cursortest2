package C2;

import B2.c;
import java.util.Iterator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import y2.InterfaceC3527b;

/* renamed from: C2.w, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC0340w extends AbstractC0297a {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC3527b f339a;

    public /* synthetic */ AbstractC0340w(InterfaceC3527b interfaceC3527b, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC3527b);
    }

    @Override // C2.AbstractC0297a
    protected final void g(B2.c decoder, Object obj, int i4, int i5) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        if (i5 < 0) {
            throw new IllegalArgumentException("Size must be known in advance when using READ_ALL");
        }
        for (int i6 = 0; i6 < i5; i6++) {
            h(decoder, i4 + i6, obj, false);
        }
    }

    @Override // y2.InterfaceC3527b, y2.InterfaceC3535j, y2.InterfaceC3526a
    public abstract A2.f getDescriptor();

    @Override // C2.AbstractC0297a
    protected void h(B2.c decoder, int i4, Object obj, boolean z4) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        n(obj, i4, c.a.c(decoder, getDescriptor(), i4, this.f339a, null, 8, null));
    }

    protected abstract void n(Object obj, int i4, Object obj2);

    @Override // y2.InterfaceC3535j
    public void serialize(B2.f encoder, Object obj) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        int e4 = e(obj);
        A2.f descriptor = getDescriptor();
        B2.d D4 = encoder.D(descriptor, e4);
        Iterator d4 = d(obj);
        for (int i4 = 0; i4 < e4; i4++) {
            D4.m(getDescriptor(), i4, this.f339a, d4.next());
        }
        D4.c(descriptor);
    }

    private AbstractC0340w(InterfaceC3527b interfaceC3527b) {
        super(null);
        this.f339a = interfaceC3527b;
    }
}
