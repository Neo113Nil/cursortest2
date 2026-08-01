package io.ktor.client.plugins.cookies;

import io.ktor.client.HttpClient;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.objectweb.asm.Opcodes;

/* compiled from: HttpCookies.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "io.ktor.client.plugins.cookies.HttpCookiesKt", f = "HttpCookies.kt", i = {}, l = {Opcodes.D2I}, m = "cookies", n = {}, s = {})
/* loaded from: classes3.dex */
final class HttpCookiesKt$cookies$2 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;

    HttpCookiesKt$cookies$2(Continuation<? super HttpCookiesKt$cookies$2> continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return HttpCookiesKt.cookies((HttpClient) null, (String) null, this);
    }
}
