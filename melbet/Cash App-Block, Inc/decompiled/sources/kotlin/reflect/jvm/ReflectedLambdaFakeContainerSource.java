package kotlin.reflect.jvm;

import kotlin.reflect.jvm.internal.impl.descriptors.SourceFile;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedContainerSource;

/* loaded from: classes9.dex */
public final class ReflectedLambdaFakeContainerSource implements DeserializedContainerSource {
    public static final ReflectedLambdaFakeContainerSource INSTANCE = new ReflectedLambdaFakeContainerSource();

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.SourceElement
    public final SourceFile getContainingFile() {
        SourceFile sourceFile = SourceFile.NO_SOURCE_FILE;
        sourceFile.getClass();
        return sourceFile;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedContainerSource
    public final String getPresentableString() {
        return "ReflectedLambdaFakeContainerSource";
    }
}
