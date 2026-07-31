package C2;

import java.util.Arrays;
import kotlin.collections.AbstractC3219i;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import y2.C3534i;
import y2.InterfaceC3527b;

/* loaded from: classes3.dex */
public final class G implements InterfaceC3527b {

    /* renamed from: a, reason: collision with root package name */
    private final Enum[] f206a;

    /* renamed from: b, reason: collision with root package name */
    private A2.f f207b;

    /* renamed from: c, reason: collision with root package name */
    private final W1.h f208c;

    static final class a extends kotlin.jvm.internal.s implements Function0 {

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ String f210j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String str) {
            super(0);
            this.f210j = str;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final A2.f invoke() {
            A2.f fVar = G.this.f207b;
            return fVar == null ? G.this.c(this.f210j) : fVar;
        }
    }

    public G(String serialName, Enum[] values) {
        Intrinsics.checkNotNullParameter(serialName, "serialName");
        Intrinsics.checkNotNullParameter(values, "values");
        this.f206a = values;
        this.f208c = W1.i.b(new a(serialName));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final A2.f c(String str) {
        F f4 = new F(str, this.f206a.length);
        for (Enum r02 : this.f206a) {
            C0343x0.m(f4, r02.name(), false, 2, null);
        }
        return f4;
    }

    @Override // y2.InterfaceC3526a
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public Enum deserialize(B2.e decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        int n4 = decoder.n(getDescriptor());
        if (n4 >= 0) {
            Enum[] enumArr = this.f206a;
            if (n4 < enumArr.length) {
                return enumArr[n4];
            }
        }
        throw new C3534i(n4 + " is not among valid " + getDescriptor().a() + " enum values, values size is " + this.f206a.length);
    }

    @Override // y2.InterfaceC3535j
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public void serialize(B2.f encoder, Enum value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        int S3 = AbstractC3219i.S(this.f206a, value);
        if (S3 != -1) {
            encoder.p(getDescriptor(), S3);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(value);
        sb.append(" is not a valid enum ");
        sb.append(getDescriptor().a());
        sb.append(", must be one of ");
        String arrays = Arrays.toString(this.f206a);
        Intrinsics.checkNotNullExpressionValue(arrays, "toString(this)");
        sb.append(arrays);
        throw new C3534i(sb.toString());
    }

    @Override // y2.InterfaceC3527b, y2.InterfaceC3535j, y2.InterfaceC3526a
    public A2.f getDescriptor() {
        return (A2.f) this.f208c.getValue();
    }

    public String toString() {
        return "kotlinx.serialization.internal.EnumSerializer<" + getDescriptor().a() + '>';
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public G(String serialName, Enum[] values, A2.f descriptor) {
        this(serialName, values);
        Intrinsics.checkNotNullParameter(serialName, "serialName");
        Intrinsics.checkNotNullParameter(values, "values");
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        this.f207b = descriptor;
    }
}
