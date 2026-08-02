package kotlin.reflect.jvm.internal.impl.resolve.constants;

import java.util.List;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlinx.coroutines.tasks.TasksKt$awaitImpl$2$2;

/* loaded from: classes9.dex */
public final class TypedArrayValue extends ArrayValue {

    /* renamed from: type, reason: collision with root package name */
    public final KotlinType f1536type;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TypedArrayValue(List<? extends ConstantValue<?>> list, KotlinType kotlinType) {
        super(list, new TasksKt$awaitImpl$2$2(kotlinType, 18));
        list.getClass();
        kotlinType.getClass();
        this.f1536type = kotlinType;
    }

    public final KotlinType getType() {
        return this.f1536type;
    }
}
