package kotlin.reflect.jvm.internal.impl.types;

import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker;

/* loaded from: classes9.dex */
public class TypeProjectionImpl extends TypeProjectionBase {
    public final Variance projection;

    /* renamed from: type, reason: collision with root package name */
    public final KotlinType f1537type;

    public static /* synthetic */ void $$$reportNull$$$0(int i) {
        String str = (i == 4 || i == 5) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 4 || i == 5) ? 2 : 3];
        switch (i) {
            case 1:
            case 2:
            case 3:
                objArr[0] = "type";
                break;
            case 4:
            case 5:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/TypeProjectionImpl";
                break;
            case 6:
                objArr[0] = "kotlinTypeRefiner";
                break;
            default:
                objArr[0] = "projection";
                break;
        }
        if (i == 4) {
            objArr[1] = "getProjectionKind";
        } else if (i != 5) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/types/TypeProjectionImpl";
        } else {
            objArr[1] = "getType";
        }
        if (i == 3) {
            objArr[2] = "replaceType";
        } else if (i != 4 && i != 5) {
            if (i != 6) {
                objArr[2] = "<init>";
            } else {
                objArr[2] = "refine";
            }
        }
        String format2 = String.format(str, objArr);
        if (i != 4 && i != 5) {
            throw new IllegalArgumentException(format2);
        }
        throw new IllegalStateException(format2);
    }

    public TypeProjectionImpl(Variance variance, KotlinType kotlinType) {
        if (variance == null) {
            $$$reportNull$$$0(0);
            throw null;
        }
        if (kotlinType == null) {
            $$$reportNull$$$0(1);
            throw null;
        }
        this.projection = variance;
        this.f1537type = kotlinType;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeProjection
    public Variance getProjectionKind() {
        Variance variance = this.projection;
        if (variance != null) {
            return variance;
        }
        $$$reportNull$$$0(4);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeProjection
    public KotlinType getType() {
        KotlinType kotlinType = this.f1537type;
        if (kotlinType != null) {
            return kotlinType;
        }
        $$$reportNull$$$0(5);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeProjection
    public boolean isStarProjection() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeProjection
    public TypeProjection refine(KotlinTypeRefiner kotlinTypeRefiner) {
        if (kotlinTypeRefiner != null) {
            return new TypeProjectionImpl(this.projection, kotlinTypeRefiner.refineType((KotlinTypeMarker) this.f1537type));
        }
        $$$reportNull$$$0(6);
        throw null;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TypeProjectionImpl(KotlinType kotlinType) {
        this(Variance.INVARIANT, kotlinType);
        if (kotlinType != null) {
        } else {
            $$$reportNull$$$0(2);
            throw null;
        }
    }
}
