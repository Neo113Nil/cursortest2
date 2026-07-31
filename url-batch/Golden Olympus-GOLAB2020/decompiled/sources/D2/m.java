package D2;

import A2.f;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public abstract class m {

    public static final class a implements A2.f {

        /* renamed from: a, reason: collision with root package name */
        private final W1.h f416a;

        a(Function0 function0) {
            this.f416a = W1.i.b(function0);
        }

        private final A2.f b() {
            return (A2.f) this.f416a.getValue();
        }

        @Override // A2.f
        public String a() {
            return b().a();
        }

        @Override // A2.f
        public boolean c() {
            return f.a.c(this);
        }

        @Override // A2.f
        public int d(String name) {
            Intrinsics.checkNotNullParameter(name, "name");
            return b().d(name);
        }

        @Override // A2.f
        public A2.j e() {
            return b().e();
        }

        @Override // A2.f
        public int f() {
            return b().f();
        }

        @Override // A2.f
        public String g(int i4) {
            return b().g(i4);
        }

        @Override // A2.f
        public List getAnnotations() {
            return f.a.a(this);
        }

        @Override // A2.f
        public List h(int i4) {
            return b().h(i4);
        }

        @Override // A2.f
        public A2.f i(int i4) {
            return b().i(i4);
        }

        @Override // A2.f
        public boolean isInline() {
            return f.a.b(this);
        }

        @Override // A2.f
        public boolean j(int i4) {
            return b().j(i4);
        }
    }

    public static final h d(B2.e eVar) {
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        h hVar = eVar instanceof h ? (h) eVar : null;
        if (hVar != null) {
            return hVar;
        }
        throw new IllegalStateException("This serializer can be used only with Json format.Expected Decoder to be JsonDecoder, got " + H.b(eVar.getClass()));
    }

    public static final n e(B2.f fVar) {
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        n nVar = fVar instanceof n ? (n) fVar : null;
        if (nVar != null) {
            return nVar;
        }
        throw new IllegalStateException("This serializer can be used only with Json format.Expected Encoder to be JsonEncoder, got " + H.b(fVar.getClass()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final A2.f f(Function0 function0) {
        return new a(function0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(B2.e eVar) {
        d(eVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(B2.f fVar) {
        e(fVar);
    }
}
