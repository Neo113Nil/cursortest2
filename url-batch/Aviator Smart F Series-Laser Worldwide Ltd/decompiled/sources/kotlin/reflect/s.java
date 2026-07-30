package kotlin.reflect;

import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes4.dex */
public final class s {
    public static final a Companion = new a(null);
    public static final s star = new s(null, null);
    private final q type;
    private final KVariance variance;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.o oVar) {
            this();
        }

        public static /* synthetic */ void getStar$annotations() {
        }

        public final s contravariant(q type) {
            kotlin.jvm.internal.s.checkNotNullParameter(type, "type");
            return new s(KVariance.IN, type);
        }

        public final s covariant(q type) {
            kotlin.jvm.internal.s.checkNotNullParameter(type, "type");
            return new s(KVariance.OUT, type);
        }

        public final s getSTAR() {
            return s.star;
        }

        public final s invariant(q type) {
            kotlin.jvm.internal.s.checkNotNullParameter(type, "type");
            return new s(KVariance.INVARIANT, type);
        }
    }

    public /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[KVariance.values().length];
            try {
                iArr[KVariance.INVARIANT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[KVariance.IN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[KVariance.OUT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public s(KVariance kVariance, q qVar) {
        String str;
        this.variance = kVariance;
        this.type = qVar;
        if ((kVariance == null) == (qVar == null)) {
            return;
        }
        if (kVariance == null) {
            str = "Star projection must have no type specified.";
        } else {
            str = "The projection variance " + kVariance + " requires type to be specified.";
        }
        throw new IllegalArgumentException(str.toString());
    }

    public static final s contravariant(q qVar) {
        return Companion.contravariant(qVar);
    }

    public static /* synthetic */ s copy$default(s sVar, KVariance kVariance, q qVar, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            kVariance = sVar.variance;
        }
        if ((i8 & 2) != 0) {
            qVar = sVar.type;
        }
        return sVar.copy(kVariance, qVar);
    }

    public static final s covariant(q qVar) {
        return Companion.covariant(qVar);
    }

    public static final s invariant(q qVar) {
        return Companion.invariant(qVar);
    }

    public final KVariance component1() {
        return this.variance;
    }

    public final q component2() {
        return this.type;
    }

    public final s copy(KVariance kVariance, q qVar) {
        return new s(kVariance, qVar);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return this.variance == sVar.variance && kotlin.jvm.internal.s.areEqual(this.type, sVar.type);
    }

    public final q getType() {
        return this.type;
    }

    public final KVariance getVariance() {
        return this.variance;
    }

    public int hashCode() {
        KVariance kVariance = this.variance;
        int hashCode = (kVariance == null ? 0 : kVariance.hashCode()) * 31;
        q qVar = this.type;
        return hashCode + (qVar != null ? qVar.hashCode() : 0);
    }

    public String toString() {
        KVariance kVariance = this.variance;
        int i8 = kVariance == null ? -1 : b.$EnumSwitchMapping$0[kVariance.ordinal()];
        if (i8 == -1) {
            return "*";
        }
        if (i8 == 1) {
            return String.valueOf(this.type);
        }
        if (i8 == 2) {
            return "in " + this.type;
        }
        if (i8 != 3) {
            throw new NoWhenBranchMatchedException();
        }
        return "out " + this.type;
    }
}
