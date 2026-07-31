package C2;

import A2.j;
import A2.k;
import io.jsonwebtoken.JwtParser;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class F extends C0343x0 {

    /* renamed from: m, reason: collision with root package name */
    private final A2.j f199m;

    /* renamed from: n, reason: collision with root package name */
    private final W1.h f200n;

    static final class a extends kotlin.jvm.internal.s implements Function0 {

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ int f201i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ String f202j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ F f203k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(int i4, String str, F f4) {
            super(0);
            this.f201i = i4;
            this.f202j = str;
            this.f203k = f4;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final A2.f[] invoke() {
            int i4 = this.f201i;
            A2.f[] fVarArr = new A2.f[i4];
            for (int i5 = 0; i5 < i4; i5++) {
                fVarArr[i5] = A2.i.d(this.f202j + JwtParser.SEPARATOR_CHAR + this.f203k.g(i5), k.d.f102a, new A2.f[0], null, 8, null);
            }
            return fVarArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public F(String name, int i4) {
        super(name, null, i4, 2, null);
        Intrinsics.checkNotNullParameter(name, "name");
        this.f199m = j.b.f98a;
        this.f200n = W1.i.b(new a(i4, name, this));
    }

    private final A2.f[] t() {
        return (A2.f[]) this.f200n.getValue();
    }

    @Override // C2.C0343x0, A2.f
    public A2.j e() {
        return this.f199m;
    }

    @Override // C2.C0343x0
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof A2.f)) {
            return false;
        }
        A2.f fVar = (A2.f) obj;
        return fVar.e() == j.b.f98a && Intrinsics.areEqual(a(), fVar.a()) && Intrinsics.areEqual(AbstractC0339v0.a(this), AbstractC0339v0.a(fVar));
    }

    @Override // C2.C0343x0
    public int hashCode() {
        int hashCode = a().hashCode();
        int i4 = 1;
        for (String str : A2.h.b(this)) {
            int i5 = i4 * 31;
            i4 = i5 + (str != null ? str.hashCode() : 0);
        }
        return (hashCode * 31) + i4;
    }

    @Override // C2.C0343x0, A2.f
    public A2.f i(int i4) {
        return t()[i4];
    }

    @Override // C2.C0343x0
    public String toString() {
        return CollectionsKt.joinToString$default(A2.h.b(this), ", ", a() + '(', ")", 0, null, null, 56, null);
    }
}
