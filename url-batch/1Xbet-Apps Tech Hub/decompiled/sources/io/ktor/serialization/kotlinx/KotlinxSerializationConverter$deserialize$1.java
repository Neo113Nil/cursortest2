package io.ktor.serialization.kotlinx;

import com.google.firebase.analytics.FirebaseAnalytics;
import io.ktor.http.auth.HttpAuthHeader;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: KotlinxSerializationConverter.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "io.ktor.serialization.kotlinx.KotlinxSerializationConverter", f = "KotlinxSerializationConverter.kt", i = {0, 0, 0, 0, 1, 1, 1}, l = {74, 78}, m = "deserialize", n = {"this", HttpAuthHeader.Parameters.Charset, "typeInfo", FirebaseAnalytics.Param.CONTENT, "this", HttpAuthHeader.Parameters.Charset, "serializer"}, s = {"L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2"})
/* loaded from: classes3.dex */
final class KotlinxSerializationConverter$deserialize$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ KotlinxSerializationConverter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    KotlinxSerializationConverter$deserialize$1(KotlinxSerializationConverter kotlinxSerializationConverter, Continuation<? super KotlinxSerializationConverter$deserialize$1> continuation) {
        super(continuation);
        this.this$0 = kotlinxSerializationConverter;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.deserialize(null, null, null, this);
    }
}
