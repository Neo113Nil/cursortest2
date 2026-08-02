package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import java.util.Set;
import kotlin.collections.SetsKt__SetsJVMKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNullable;
import kotlinx.coroutines.tasks.TasksKt$awaitImpl$2$2;

/* loaded from: classes9.dex */
public final class ClassDeserializer {
    public final MemoizedFunctionToNullable classes;
    public final DeserializationComponents components;
    public static final Companion Companion = new Companion(null);
    public static final Set BLACK_LIST = SetsKt__SetsJVMKt.setOf(ClassId.Companion.topLevel(StandardNames.FqNames.cloneable.toSafe()));

    public final class ClassKey {
        public final ClassData classData;
        public final ClassId classId;

        public ClassKey(ClassId classId, ClassData classData) {
            classId.getClass();
            this.classId = classId;
            this.classData = classData;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof ClassKey) {
                return Intrinsics.areEqual(this.classId, ((ClassKey) obj).classId);
            }
            return false;
        }

        public final int hashCode() {
            return this.classId.hashCode();
        }
    }

    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public final Set<ClassId> getBLACK_LIST() {
            return ClassDeserializer.BLACK_LIST;
        }
    }

    public ClassDeserializer(DeserializationComponents deserializationComponents) {
        deserializationComponents.getClass();
        this.components = deserializationComponents;
        this.classes = deserializationComponents.getStorageManager().createMemoizedFunctionWithNullableValues(new TasksKt$awaitImpl$2$2(this, 20));
    }

    public static /* synthetic */ ClassDescriptor deserializeClass$default(ClassDeserializer classDeserializer, ClassId classId, ClassData classData, int i, Object obj) {
        if ((i & 2) != 0) {
            classData = null;
        }
        return classDeserializer.deserializeClass(classId, classData);
    }

    public final ClassDescriptor deserializeClass(ClassId classId, ClassData classData) {
        classId.getClass();
        return (ClassDescriptor) this.classes.invoke(new ClassKey(classId, classData));
    }
}
