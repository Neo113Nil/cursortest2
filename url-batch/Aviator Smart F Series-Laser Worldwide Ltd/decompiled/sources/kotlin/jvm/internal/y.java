package kotlin.jvm.internal;

import java.util.List;
import kotlin.reflect.KVariance;

/* loaded from: classes4.dex */
public final class y implements kotlin.reflect.r {
    public static final a Companion = new a(null);
    private volatile List<? extends kotlin.reflect.q> bounds;
    private final Object container;
    private final boolean isReified;
    private final String name;
    private final KVariance variance;

    public static final class a {

        /* renamed from: kotlin.jvm.internal.y$a$a, reason: collision with other inner class name */
        public /* synthetic */ class C0366a {
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

        private a() {
        }

        public /* synthetic */ a(o oVar) {
            this();
        }

        public final String toString(kotlin.reflect.r typeParameter) {
            s.checkNotNullParameter(typeParameter, "typeParameter");
            StringBuilder sb = new StringBuilder();
            int i8 = C0366a.$EnumSwitchMapping$0[typeParameter.getVariance().ordinal()];
            if (i8 == 2) {
                sb.append("in ");
            } else if (i8 == 3) {
                sb.append("out ");
            }
            sb.append(typeParameter.getName());
            String sb2 = sb.toString();
            s.checkNotNullExpressionValue(sb2, "StringBuilder().apply(builderAction).toString()");
            return sb2;
        }
    }

    public y(Object obj, String name, KVariance variance, boolean z7) {
        s.checkNotNullParameter(name, "name");
        s.checkNotNullParameter(variance, "variance");
        this.container = obj;
        this.name = name;
        this.variance = variance;
        this.isReified = z7;
    }

    public static /* synthetic */ void getUpperBounds$annotations() {
    }

    public boolean equals(Object obj) {
        if (obj instanceof y) {
            y yVar = (y) obj;
            if (s.areEqual(this.container, yVar.container) && s.areEqual(getName(), yVar.getName())) {
                return true;
            }
        }
        return false;
    }

    @Override // kotlin.reflect.r
    public String getName() {
        return this.name;
    }

    @Override // kotlin.reflect.r
    public List<kotlin.reflect.q> getUpperBounds() {
        List list = this.bounds;
        if (list != null) {
            return list;
        }
        List<kotlin.reflect.q> listOf = kotlin.collections.q.listOf(u.nullableTypeOf(Object.class));
        this.bounds = listOf;
        return listOf;
    }

    @Override // kotlin.reflect.r
    public KVariance getVariance() {
        return this.variance;
    }

    public int hashCode() {
        Object obj = this.container;
        return ((obj != null ? obj.hashCode() : 0) * 31) + getName().hashCode();
    }

    @Override // kotlin.reflect.r
    public boolean isReified() {
        return this.isReified;
    }

    public final void setUpperBounds(List<? extends kotlin.reflect.q> upperBounds) {
        s.checkNotNullParameter(upperBounds, "upperBounds");
        if (this.bounds == null) {
            this.bounds = upperBounds;
            return;
        }
        throw new IllegalStateException(("Upper bounds of type parameter '" + this + "' have already been initialized.").toString());
    }

    public String toString() {
        return Companion.toString(this);
    }
}
