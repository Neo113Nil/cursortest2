package C2;

import A2.k;
import com.ironsource.b9;
import i2.InterfaceC2471a;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import y2.InterfaceC3527b;

/* renamed from: C2.h0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0312h0 extends Y {

    /* renamed from: c, reason: collision with root package name */
    private final A2.f f287c;

    /* renamed from: C2.h0$a */
    private static final class a implements Map.Entry, InterfaceC2471a {

        /* renamed from: b, reason: collision with root package name */
        private final Object f288b;

        /* renamed from: c, reason: collision with root package name */
        private final Object f289c;

        public a(Object obj, Object obj2) {
            this.f288b = obj;
            this.f289c = obj2;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.areEqual(this.f288b, aVar.f288b) && Intrinsics.areEqual(this.f289c, aVar.f289c);
        }

        @Override // java.util.Map.Entry
        public Object getKey() {
            return this.f288b;
        }

        @Override // java.util.Map.Entry
        public Object getValue() {
            return this.f289c;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            Object obj = this.f288b;
            int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
            Object obj2 = this.f289c;
            return hashCode + (obj2 != null ? obj2.hashCode() : 0);
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public String toString() {
            return "MapEntry(key=" + this.f288b + ", value=" + this.f289c + ')';
        }
    }

    /* renamed from: C2.h0$b */
    static final class b extends kotlin.jvm.internal.s implements Function1 {

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ InterfaceC3527b f290i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ InterfaceC3527b f291j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(InterfaceC3527b interfaceC3527b, InterfaceC3527b interfaceC3527b2) {
            super(1);
            this.f290i = interfaceC3527b;
            this.f291j = interfaceC3527b2;
        }

        public final void a(A2.a buildSerialDescriptor) {
            Intrinsics.checkNotNullParameter(buildSerialDescriptor, "$this$buildSerialDescriptor");
            A2.a.b(buildSerialDescriptor, b9.h.f15463W, this.f290i.getDescriptor(), null, false, 12, null);
            A2.a.b(buildSerialDescriptor, "value", this.f291j.getDescriptor(), null, false, 12, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((A2.a) obj);
            return Unit.f41027a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0312h0(InterfaceC3527b keySerializer, InterfaceC3527b valueSerializer) {
        super(keySerializer, valueSerializer, null);
        Intrinsics.checkNotNullParameter(keySerializer, "keySerializer");
        Intrinsics.checkNotNullParameter(valueSerializer, "valueSerializer");
        this.f287c = A2.i.c("kotlin.collections.Map.Entry", k.c.f101a, new A2.f[0], new b(keySerializer, valueSerializer));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // C2.Y
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public Object a(Map.Entry entry) {
        Intrinsics.checkNotNullParameter(entry, "<this>");
        return entry.getKey();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // C2.Y
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public Object c(Map.Entry entry) {
        Intrinsics.checkNotNullParameter(entry, "<this>");
        return entry.getValue();
    }

    @Override // y2.InterfaceC3527b, y2.InterfaceC3535j, y2.InterfaceC3526a
    public A2.f getDescriptor() {
        return this.f287c;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // C2.Y
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public Map.Entry e(Object obj, Object obj2) {
        return new a(obj, obj2);
    }
}
