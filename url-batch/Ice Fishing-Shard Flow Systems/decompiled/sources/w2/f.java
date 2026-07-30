package w2;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class f {

    public static final class a extends f {
        private final g result;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(g result) {
            super(null);
            Intrinsics.checkNotNullParameter(result, "result");
            this.result = result;
        }

        public static /* synthetic */ a copy$default(a aVar, g gVar, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                gVar = aVar.result;
            }
            return aVar.copy(gVar);
        }

        public final g component1() {
            return this.result;
        }

        public final a copy(g result) {
            Intrinsics.checkNotNullParameter(result, "result");
            return new a(result);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && Intrinsics.a(this.result, ((a) obj).result);
        }

        public final g getResult() {
            return this.result;
        }

        public int hashCode() {
            return this.result.hashCode();
        }

        public String toString() {
            return "Success(result=" + this.result + ')';
        }
    }

    public static final class b extends f {
        public static final b INSTANCE = new b();

        private b() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public int hashCode() {
            return 259983066;
        }

        public String toString() {
            return "Unavailable";
        }
    }

    public /* synthetic */ f(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private f() {
    }
}
