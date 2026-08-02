package kotlinx.serialization.internal;

import kotlinx.serialization.KSerializer;

/* loaded from: classes3.dex */
public interface GeneratedSerializer extends KSerializer {
    KSerializer[] childSerializers();

    KSerializer[] typeParametersSerializers();
}
