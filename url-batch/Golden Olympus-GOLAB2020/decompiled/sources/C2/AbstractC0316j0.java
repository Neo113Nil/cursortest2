package C2;

import B2.c;
import java.util.Iterator;
import java.util.Map;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import y2.InterfaceC3527b;

/* renamed from: C2.j0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC0316j0 extends AbstractC0297a {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC3527b f300a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC3527b f301b;

    public /* synthetic */ AbstractC0316j0(InterfaceC3527b interfaceC3527b, InterfaceC3527b interfaceC3527b2, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC3527b, interfaceC3527b2);
    }

    @Override // y2.InterfaceC3527b, y2.InterfaceC3535j, y2.InterfaceC3526a
    public abstract A2.f getDescriptor();

    public final InterfaceC3527b m() {
        return this.f300a;
    }

    public final InterfaceC3527b n() {
        return this.f301b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // C2.AbstractC0297a
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public final void g(B2.c decoder, Map builder, int i4, int i5) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        Intrinsics.checkNotNullParameter(builder, "builder");
        if (i5 < 0) {
            throw new IllegalArgumentException("Size must be known in advance when using READ_ALL");
        }
        kotlin.ranges.d o4 = kotlin.ranges.g.o(kotlin.ranges.g.p(0, i5 * 2), 2);
        int b4 = o4.b();
        int d4 = o4.d();
        int e4 = o4.e();
        if ((e4 <= 0 || b4 > d4) && (e4 >= 0 || d4 > b4)) {
            return;
        }
        while (true) {
            h(decoder, i4 + b4, builder, false);
            if (b4 == d4) {
                return;
            } else {
                b4 += e4;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // C2.AbstractC0297a
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public final void h(B2.c decoder, int i4, Map builder, boolean z4) {
        int i5;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        Intrinsics.checkNotNullParameter(builder, "builder");
        Object c4 = c.a.c(decoder, getDescriptor(), i4, this.f300a, null, 8, null);
        if (z4) {
            i5 = decoder.t(getDescriptor());
            if (i5 != i4 + 1) {
                throw new IllegalArgumentException(("Value must follow key in a map, index for key: " + i4 + ", returned index for value: " + i5).toString());
            }
        } else {
            i5 = i4 + 1;
        }
        int i6 = i5;
        builder.put(c4, (!builder.containsKey(c4) || (this.f301b.getDescriptor().e() instanceof A2.e)) ? c.a.c(decoder, getDescriptor(), i6, this.f301b, null, 8, null) : decoder.y(getDescriptor(), i6, this.f301b, MapsKt.getValue(builder, c4)));
    }

    @Override // y2.InterfaceC3535j
    public void serialize(B2.f encoder, Object obj) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        int e4 = e(obj);
        A2.f descriptor = getDescriptor();
        B2.d D4 = encoder.D(descriptor, e4);
        Iterator d4 = d(obj);
        int i4 = 0;
        while (d4.hasNext()) {
            Map.Entry entry = (Map.Entry) d4.next();
            Object key = entry.getKey();
            Object value = entry.getValue();
            int i5 = i4 + 1;
            D4.m(getDescriptor(), i4, m(), key);
            i4 += 2;
            D4.m(getDescriptor(), i5, n(), value);
        }
        D4.c(descriptor);
    }

    private AbstractC0316j0(InterfaceC3527b interfaceC3527b, InterfaceC3527b interfaceC3527b2) {
        super(null);
        this.f300a = interfaceC3527b;
        this.f301b = interfaceC3527b2;
    }
}
