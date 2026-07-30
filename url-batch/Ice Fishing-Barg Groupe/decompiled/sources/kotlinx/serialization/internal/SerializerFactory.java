package kotlinx.serialization.internal;

import defpackage.ny;
import kotlinx.serialization.KSerializer;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
@ny
/* loaded from: classes.dex */
public interface SerializerFactory {
    KSerializer serializer(KSerializer... kSerializerArr);
}
