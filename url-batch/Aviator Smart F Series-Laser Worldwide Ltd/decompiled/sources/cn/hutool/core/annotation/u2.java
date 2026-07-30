package cn.hutool.core.annotation;

/* loaded from: classes.dex */
public interface u2 extends Comparable {
    public static final v ALIAS_ANNOTATION_POST_PROCESSOR = new v();
    public static final k2 MIRROR_LINK_ANNOTATION_POST_PROCESSOR = new k2();
    public static final d0 ALIAS_LINK_ANNOTATION_POST_PROCESSOR = new d0();

    int compareTo(u2 u2Var);

    @Override // java.lang.Comparable
    /* bridge */ /* synthetic */ int compareTo(Object obj);

    int order();

    void process(r2 r2Var, i0 i0Var);
}
