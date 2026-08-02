package kotlinx.serialization;

import kotlin.jvm.functions.Function2;
import kotlin.time.InstantKt$$ExternalSyntheticLambda0;
import kotlinx.serialization.internal.CachingKt;
import kotlinx.serialization.internal.ClassValueCache;
import kotlinx.serialization.internal.ParametrizedSerializerCache;
import kotlinx.serialization.internal.SerializerCache;
import okhttp3.FormBody;
import okhttp3.internal.ws.RealWebSocket$connect$1;
import operations.logic.equals.Equals$$ExternalSyntheticLambda0;

/* loaded from: classes9.dex */
public abstract class SerializersCacheKt {
    public static final ParametrizedSerializerCache PARAMETRIZED_SERIALIZERS_CACHE;
    public static final ParametrizedSerializerCache PARAMETRIZED_SERIALIZERS_CACHE_NULLABLE;
    public static final SerializerCache SERIALIZERS_CACHE;
    public static final SerializerCache SERIALIZERS_CACHE_NULLABLE;

    static {
        InstantKt$$ExternalSyntheticLambda0 instantKt$$ExternalSyntheticLambda0 = new InstantKt$$ExternalSyntheticLambda0(26);
        boolean z = CachingKt.useClassValue;
        SERIALIZERS_CACHE = z ? new ClassValueCache(instantKt$$ExternalSyntheticLambda0) : new FormBody.Builder(instantKt$$ExternalSyntheticLambda0);
        InstantKt$$ExternalSyntheticLambda0 instantKt$$ExternalSyntheticLambda02 = new InstantKt$$ExternalSyntheticLambda0(27);
        SERIALIZERS_CACHE_NULLABLE = z ? new ClassValueCache(instantKt$$ExternalSyntheticLambda02) : new FormBody.Builder(instantKt$$ExternalSyntheticLambda02);
        Equals$$ExternalSyntheticLambda0 equals$$ExternalSyntheticLambda0 = new Equals$$ExternalSyntheticLambda0(22);
        PARAMETRIZED_SERIALIZERS_CACHE = z ? new ClassValueCache(equals$$ExternalSyntheticLambda0) : new RealWebSocket$connect$1((Function2) equals$$ExternalSyntheticLambda0);
        Equals$$ExternalSyntheticLambda0 equals$$ExternalSyntheticLambda02 = new Equals$$ExternalSyntheticLambda0(23);
        PARAMETRIZED_SERIALIZERS_CACHE_NULLABLE = z ? new ClassValueCache(equals$$ExternalSyntheticLambda02) : new RealWebSocket$connect$1((Function2) equals$$ExternalSyntheticLambda02);
    }
}
