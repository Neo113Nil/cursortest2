package kotlin.reflect.jvm.internal.impl.types.checker;

import kotlin.reflect.jvm.internal.impl.types.KotlinType;

/* loaded from: classes9.dex */
public final class SubtypePathNode {
    public final SubtypePathNode previous;

    /* renamed from: type, reason: collision with root package name */
    public final KotlinType f1538type;

    public SubtypePathNode(KotlinType kotlinType, SubtypePathNode subtypePathNode) {
        kotlinType.getClass();
        this.f1538type = kotlinType;
        this.previous = subtypePathNode;
    }
}
