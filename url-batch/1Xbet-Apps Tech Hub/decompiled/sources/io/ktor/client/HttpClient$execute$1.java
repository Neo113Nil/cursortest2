package io.ktor.client;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.objectweb.asm.Opcodes;

/* compiled from: HttpClient.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "io.ktor.client.HttpClient", f = "HttpClient.kt", i = {}, l = {Opcodes.ATHROW}, m = "execute$ktor_client_core", n = {}, s = {})
/* loaded from: classes3.dex */
final class HttpClient$execute$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ HttpClient this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HttpClient$execute$1(HttpClient httpClient, Continuation<? super HttpClient$execute$1> continuation) {
        super(continuation);
        this.this$0 = httpClient;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.execute$ktor_client_core(null, this);
    }
}
