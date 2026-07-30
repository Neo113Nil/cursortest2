package cn.hutool.core.annotation;

import java.lang.annotation.Annotation;
import java.util.HashMap;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.function.Predicate;

/* loaded from: classes.dex */
public abstract class m implements u2 {
    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ j2 lambda$getLinkAnnotation$1(g0 g0Var, g0 g0Var2) {
        return (j2) e1.getSynthesizedAnnotation(g0Var.getAttribute(), j2.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$getLinkAnnotation$2(RelationType[] relationTypeArr, j2 j2Var) {
        return cn.hutool.core.util.h.contains(relationTypeArr, j2Var.type());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$process$0(i0 i0Var, r2 r2Var, String str, g0 g0Var) {
        j2 linkAnnotation = getLinkAnnotation(g0Var, processTypes());
        if (cn.hutool.core.util.e0.isNull(linkAnnotation)) {
            return;
        }
        r2 linkedAnnotation = getLinkedAnnotation(linkAnnotation, i0Var, r2Var.annotationType());
        if (cn.hutool.core.util.e0.isNull(linkedAnnotation)) {
            return;
        }
        processLinkedAttribute(i0Var, linkAnnotation, r2Var, r2Var.getAttributes().get(str), linkedAnnotation, linkedAnnotation.getAttributes().get(linkAnnotation.attribute()));
    }

    protected void checkAttributeType(g0 g0Var, g0 g0Var2) {
        cn.hutool.core.lang.q.equals(g0Var.getAttributeType(), g0Var2.getAttributeType(), "return type of the linked attribute [{}] is inconsistent with the original [{}]", g0Var.getAttribute(), g0Var2.getAttribute());
    }

    protected void checkLinkedAttributeNotNull(g0 g0Var, g0 g0Var2, j2 j2Var) {
        cn.hutool.core.lang.q.notNull(g0Var2, "cannot find linked attribute [{}] of original [{}] in [{}]", g0Var.getAttribute(), j2Var.attribute(), getLinkedAnnotationType(j2Var, g0Var.getAnnotationType()));
    }

    protected void checkLinkedSelf(g0 g0Var, g0 g0Var2) {
        cn.hutool.core.lang.q.isFalse(g0Var == g0Var2 || cn.hutool.core.util.e0.equals(g0Var.getAttribute(), g0Var2.getAttribute()), "cannot link self [{}]", g0Var.getAttribute());
    }

    @Override // cn.hutool.core.annotation.u2
    public /* bridge */ /* synthetic */ int compareTo(u2 u2Var) {
        return t2.a(this, u2Var);
    }

    protected j2 getLinkAnnotation(final g0 g0Var, final RelationType... relationTypeArr) {
        return (j2) cn.hutool.core.lang.l0.ofNullable(g0Var).map(new Function() { // from class: cn.hutool.core.annotation.j
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                j2 lambda$getLinkAnnotation$1;
                lambda$getLinkAnnotation$1 = m.lambda$getLinkAnnotation$1(g0.this, (g0) obj);
                return lambda$getLinkAnnotation$1;
            }
        }).filter(new Predicate() { // from class: cn.hutool.core.annotation.k
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                boolean lambda$getLinkAnnotation$2;
                lambda$getLinkAnnotation$2 = m.lambda$getLinkAnnotation$2(relationTypeArr, (j2) obj);
                return lambda$getLinkAnnotation$2;
            }
        }).get();
    }

    protected r2 getLinkedAnnotation(j2 j2Var, i0 i0Var, Class<? extends Annotation> cls) {
        return i0Var.getSynthesizedAnnotation(getLinkedAnnotationType(j2Var, cls));
    }

    protected Class<?> getLinkedAnnotationType(j2 j2Var, Class<?> cls) {
        return cn.hutool.core.util.e0.equals(j2Var.annotation(), Annotation.class) ? cls : j2Var.annotation();
    }

    @Override // cn.hutool.core.annotation.u2
    public /* bridge */ /* synthetic */ int order() {
        return t2.c(this);
    }

    @Override // cn.hutool.core.annotation.u2
    public void process(final r2 r2Var, final i0 i0Var) {
        new HashMap(r2Var.getAttributes()).forEach(new BiConsumer() { // from class: cn.hutool.core.annotation.l
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                m.this.lambda$process$0(i0Var, r2Var, (String) obj, (g0) obj2);
            }
        });
    }

    protected abstract void processLinkedAttribute(i0 i0Var, j2 j2Var, r2 r2Var, g0 g0Var, r2 r2Var2, g0 g0Var2);

    protected abstract RelationType[] processTypes();

    @Override // cn.hutool.core.annotation.u2, java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        int compareTo;
        compareTo = compareTo((u2) obj);
        return compareTo;
    }
}
