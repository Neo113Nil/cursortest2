package cn.hutool.core.annotation;

import com.google.android.exoplayer2.C;

/* loaded from: classes.dex */
public class k2 extends m {
    private static final RelationType[] PROCESSED_RELATION_TYPES = {RelationType.MIRROR_FOR};

    private void checkMirrorRelation(j2 j2Var, g0 g0Var, g0 g0Var2) {
        checkLinkedAttributeNotNull(g0Var, g0Var2, j2Var);
        checkAttributeType(g0Var, g0Var2);
        RelationType relationType = RelationType.MIRROR_FOR;
        j2 linkAnnotation = getLinkAnnotation(g0Var2, relationType);
        cn.hutool.core.lang.q.isTrue(cn.hutool.core.util.e0.isNotNull(linkAnnotation) && relationType.equals(linkAnnotation.type()), "mirror attribute [{}] of original attribute [{}] must marked by @Link, and also @LinkType.type() must is [{}]", g0Var2.getAttribute(), g0Var.getAttribute(), relationType);
        checkLinkedSelf(g0Var, g0Var2);
    }

    private void checkMirrored(g0 g0Var, g0 g0Var2) {
        boolean z7 = g0Var instanceof l2;
        boolean z8 = g0Var2 instanceof l2;
        if (z7 && z8 && cn.hutool.core.util.e0.equals(((l2) g0Var).getLinked(), ((l2) g0Var2).getOriginal())) {
        } else {
            throw new IllegalArgumentException((!z7 || z8) ? (z7 || !z8) ? cn.hutool.core.text.l.format("attribute [{}] cannot mirror for [{}], because [{}] already mirrored for [{}] and  [{}] already mirrored for [{}]", g0Var2.getAttribute(), g0Var.getAttribute(), g0Var2.getAttribute(), ((l2) g0Var2).getLinked(), g0Var.getAttribute(), ((l2) g0Var).getLinked()) : cn.hutool.core.text.l.format("attribute [{}] cannot mirror for [{}], because it's already mirrored for [{}]", g0Var2.getAttribute(), g0Var.getAttribute(), ((l2) g0Var2).getLinked()) : cn.hutool.core.text.l.format("attribute [{}] cannot mirror for [{}], because it's already mirrored for [{}]", g0Var.getAttribute(), g0Var2.getAttribute(), ((l2) g0Var).getLinked()));
        }
    }

    @Override // cn.hutool.core.annotation.m, cn.hutool.core.annotation.u2
    public /* bridge */ /* synthetic */ int compareTo(u2 u2Var) {
        return t2.a(this, u2Var);
    }

    @Override // cn.hutool.core.annotation.m, cn.hutool.core.annotation.u2
    public int order() {
        return C.RATE_UNSET_INT;
    }

    @Override // cn.hutool.core.annotation.m
    protected void processLinkedAttribute(i0 i0Var, j2 j2Var, r2 r2Var, g0 g0Var, r2 r2Var2, g0 g0Var2) {
        if ((g0Var instanceof l2) || (g0Var2 instanceof l2)) {
            checkMirrored(g0Var, g0Var2);
            return;
        }
        checkMirrorRelation(j2Var, g0Var, g0Var2);
        r2Var.setAttribute(g0Var.getAttributeName(), new l2(g0Var, g0Var2));
        r2Var2.setAttribute(j2Var.attribute(), new l2(g0Var2, g0Var));
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
