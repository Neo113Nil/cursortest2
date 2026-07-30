package cn.hutool.core.annotation;

import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.UnaryOperator;

/* loaded from: classes.dex */
public class d0 extends m {
    private static final RelationType[] PROCESSED_RELATION_TYPES = {RelationType.ALIAS_FOR, RelationType.FORCE_ALIAS_FOR};

    private void checkAliasRelation(j2 j2Var, g0 g0Var, g0 g0Var2) {
        checkLinkedAttributeNotNull(g0Var, g0Var2, j2Var);
        checkAttributeType(g0Var, g0Var2);
        checkCircularDependency(g0Var, g0Var2);
    }

    private void checkCircularDependency(g0 g0Var, g0 g0Var2) {
        checkLinkedSelf(g0Var, g0Var2);
        j2 linkAnnotation = getLinkAnnotation(g0Var2, RelationType.ALIAS_FOR, RelationType.FORCE_ALIAS_FOR);
        if (cn.hutool.core.util.e0.isNull(linkAnnotation) || cn.hutool.core.util.e0.notEqual(getLinkedAnnotationType(linkAnnotation, g0Var2.getAnnotationType()), g0Var.getAnnotationType())) {
            return;
        }
        cn.hutool.core.lang.q.notEquals(linkAnnotation.attribute(), g0Var.getAttributeName(), "circular reference between the alias attribute [{}] and the original attribute [{}]", g0Var2.getAttribute(), g0Var.getAttribute());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ g0 lambda$null$1(BinaryOperator binaryOperator, g0 g0Var, g0 g0Var2) {
        Object apply;
        apply = binaryOperator.apply(g0Var2, g0Var);
        return (g0) apply;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$processAttribute$2(g0 g0Var, final BinaryOperator binaryOperator, final g0 g0Var2, r2 r2Var) {
        r2Var.replaceAttribute(g0Var.getAttributeName(), new UnaryOperator() { // from class: cn.hutool.core.annotation.a0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                g0 lambda$null$1;
                lambda$null$1 = d0.lambda$null$1(binaryOperator, g0Var2, (g0) obj);
                return lambda$null$1;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: processAttribute, reason: merged with bridge method [inline-methods] */
    public void lambda$wrappingLinkedAttribute$0(final i0 i0Var, final g0 g0Var, final g0 g0Var2, final BinaryOperator<g0> binaryOperator) {
        cn.hutool.core.lang.l0 ofNullable = cn.hutool.core.lang.l0.ofNullable(g0Var2.getAnnotationType());
        i0Var.getClass();
        ofNullable.map(new Function() { // from class: cn.hutool.core.annotation.y
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return i0.this.getSynthesizedAnnotation((Class) obj);
            }
        }).ifPresent(new Consumer() { // from class: cn.hutool.core.annotation.z
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                d0.lambda$processAttribute$2(g0.this, binaryOperator, g0Var, (r2) obj);
            }
        });
    }

    private void wrappingLinkedAttribute(final i0 i0Var, final g0 g0Var, g0 g0Var2, final BinaryOperator<g0> binaryOperator) {
        if (g0Var2.isWrapped()) {
            ((n) g0Var2).getAllLinkedNonWrappedAttributes().forEach(new Consumer() { // from class: cn.hutool.core.annotation.x
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    d0.this.lambda$wrappingLinkedAttribute$0(i0Var, g0Var, binaryOperator, (g0) obj);
                }
            });
        } else {
            lambda$wrappingLinkedAttribute$0(i0Var, g0Var, g0Var2, binaryOperator);
        }
    }

    @Override // cn.hutool.core.annotation.m, cn.hutool.core.annotation.u2
    public /* bridge */ /* synthetic */ int compareTo(u2 u2Var) {
        return t2.a(this, u2Var);
    }

    @Override // cn.hutool.core.annotation.m, cn.hutool.core.annotation.u2
    public int order() {
        return -2147483646;
    }

    @Override // cn.hutool.core.annotation.m
    protected void processLinkedAttribute(i0 i0Var, j2 j2Var, r2 r2Var, g0 g0Var, r2 r2Var2, g0 g0Var2) {
        checkAliasRelation(j2Var, g0Var, g0Var2);
        if (RelationType.ALIAS_FOR.equals(j2Var.type())) {
            wrappingLinkedAttribute(i0Var, g0Var, g0Var2, new BinaryOperator() { // from class: cn.hutool.core.annotation.b0
                @Override // java.util.function.BiFunction
                public final Object apply(Object obj, Object obj2) {
                    return new e0((g0) obj, (g0) obj2);
                }
            });
        } else {
            wrappingLinkedAttribute(i0Var, g0Var, g0Var2, new BinaryOperator() { // from class: cn.hutool.core.annotation.c0
                @Override // java.util.function.BiFunction
                public final Object apply(Object obj, Object obj2) {
                    return new m1((g0) obj, (g0) obj2);
                }
            });
        }
    }

    @Override // cn.hutool.core.annotation.m
    protected RelationType[] processTypes() {
        return PROCESSED_RELATION_TYPES;
    }

    @Override // cn.hutool.core.annotation.m, cn.hutool.core.annotation.u2, java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        int compareTo;
        compareTo = compareTo((u2) obj);
        return compareTo;
    }
}
