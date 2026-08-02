package com.squareup.cash.treehouse.android;

import app.cash.molecule.PlatformKt;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.android.gms.internal.mlkit_genai_prompt.zzmo;
import com.squareup.cash.api.ContextKt;
import com.squareup.cash.api.RealServiceContextManager;
import com.squareup.cash.session.backend.SessionManager;
import com.squareup.cash.treehouse.platform.CashContextService;
import com.squareup.protos.franklin.app.SubmitBlockerRequest;
import com.squareup.protos.franklin.app.SubmitBlockerResponse;
import com.squareup.protos.franklin.common.RequestContext;
import com.squareup.protos.franklin.common.ResponseContext;
import com.squareup.wire.ProtoAdapter;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import okio.ByteString;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes.dex */
public final class RealCashContextService implements CashContextService {
    public final ProtoAdapter requestContextAdapter = RequestContext.ADAPTER;
    public final ProtoAdapter responseContextAdapter = ResponseContext.ADAPTER;
    public final RealServiceContextManager serviceContextManager;
    public final SessionManager sessionManager;
    public final String webPortalBaseUrl;

    public RealCashContextService(SessionManager sessionManager, RealServiceContextManager realServiceContextManager, String str) {
        this.sessionManager = sessionManager;
        this.serviceContextManager = realServiceContextManager;
        this.webPortalBaseUrl = str;
    }

    @Override // com.squareup.cash.treehouse.platform.CashContextService
    public final Object consumeResponseContext(ByteString byteString, ByteString byteString2, Continuation continuation) {
        Object consumeResponseContext = this.serviceContextManager.consumeResponseContext((RequestContext) this.requestContextAdapter.decode(byteString), (ResponseContext) this.responseContextAdapter.decode(byteString2), "RealCashContextService", new Exception(), (zzmo) continuation);
        return consumeResponseContext == CoroutineSingletons.COROUTINE_SUSPENDED ? consumeResponseContext : Unit.INSTANCE;
    }

    @Override // com.squareup.cash.treehouse.platform.CashContextService
    public final Object consumeSubmitBlockerResponseAppResponseContext(ByteString byteString, ByteString byteString2, Continuation continuation) {
        Object consumeResponseContext = this.serviceContextManager.consumeResponseContext(ContextKt.toRequestContext((SubmitBlockerRequest.AppRequestContext) SubmitBlockerRequest.AppRequestContext.ADAPTER.decode(byteString)), ContextKt.toResponseContext((SubmitBlockerResponse.AppResponseContext) SubmitBlockerResponse.AppResponseContext.ADAPTER.decode(byteString2)), "RealCashContextService", new Exception(), (zzmo) continuation);
        return consumeResponseContext == CoroutineSingletons.COROUTINE_SUSPENDED ? consumeResponseContext : Unit.INSTANCE;
    }

    @Override // com.squareup.cash.treehouse.platform.CashContextService
    public final String getCustomerToken() {
        return PlatformKt.activeAccountToken(this.sessionManager);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    @Override // com.squareup.cash.treehouse.platform.CashContextService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object produceRequestContext(List list, ByteString byteString, ContinuationImpl continuationImpl) {
        RealCashContextService$produceRequestContext$2 realCashContextService$produceRequestContext$2;
        int i;
        List list2;
        if (continuationImpl instanceof RealCashContextService$produceRequestContext$2) {
            realCashContextService$produceRequestContext$2 = (RealCashContextService$produceRequestContext$2) continuationImpl;
            int i2 = realCashContextService$produceRequestContext$2.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realCashContextService$produceRequestContext$2.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = realCashContextService$produceRequestContext$2.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realCashContextService$produceRequestContext$2.label;
                ProtoAdapter protoAdapter = this.requestContextAdapter;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    RequestContext requestContext = (RequestContext) protoAdapter.decode(byteString);
                    realCashContextService$produceRequestContext$2.L$0 = list;
                    realCashContextService$produceRequestContext$2.label = 1;
                    obj = this.serviceContextManager.produceRequestContext(requestContext, realCashContextService$produceRequestContext$2);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    list2 = list;
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    List list3 = realCashContextService$produceRequestContext$2.L$0;
                    SafeTrace.throwOnFailure(obj);
                    list2 = list3;
                }
                return protoAdapter.encodeByteString(RequestContext.copy$default((RequestContext) obj, null, null, null, null, list2, null, null, null, null, null, null, null, 8175));
            }
        }
        realCashContextService$produceRequestContext$2 = new RealCashContextService$produceRequestContext$2(this, continuationImpl);
        Object obj2 = realCashContextService$produceRequestContext$2.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realCashContextService$produceRequestContext$2.label;
        ProtoAdapter protoAdapter2 = this.requestContextAdapter;
        if (i != 0) {
        }
        return protoAdapter2.encodeByteString(RequestContext.copy$default((RequestContext) obj2, null, null, null, null, list2, null, null, null, null, null, null, null, 8175));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // com.squareup.cash.treehouse.platform.CashContextService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object produceSubmitBlockerRequestAppRequestContext(ContinuationImpl continuationImpl) {
        RealCashContextService$produceSubmitBlockerRequestAppRequestContext$1 realCashContextService$produceSubmitBlockerRequestAppRequestContext$1;
        int i;
        if (continuationImpl instanceof RealCashContextService$produceSubmitBlockerRequestAppRequestContext$1) {
            realCashContextService$produceSubmitBlockerRequestAppRequestContext$1 = (RealCashContextService$produceSubmitBlockerRequestAppRequestContext$1) continuationImpl;
            int i2 = realCashContextService$produceSubmitBlockerRequestAppRequestContext$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realCashContextService$produceSubmitBlockerRequestAppRequestContext$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = realCashContextService$produceSubmitBlockerRequestAppRequestContext$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realCashContextService$produceSubmitBlockerRequestAppRequestContext$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    RequestContext build = new RequestContext.Builder().build();
                    realCashContextService$produceSubmitBlockerRequestAppRequestContext$1.label = 1;
                    obj = this.serviceContextManager.produceRequestContext(build, realCashContextService$produceSubmitBlockerRequestAppRequestContext$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return ContextKt.toAppRequestContext((RequestContext) obj).encodeByteString();
            }
        }
        realCashContextService$produceSubmitBlockerRequestAppRequestContext$1 = new RealCashContextService$produceSubmitBlockerRequestAppRequestContext$1(this, continuationImpl);
        Object obj2 = realCashContextService$produceSubmitBlockerRequestAppRequestContext$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realCashContextService$produceSubmitBlockerRequestAppRequestContext$1.label;
        if (i != 0) {
        }
        return ContextKt.toAppRequestContext((RequestContext) obj2).encodeByteString();
    }

    @Override // com.squareup.cash.treehouse.platform.CashContextService
    public final String webPortalBaseUrl() {
        return this.webPortalBaseUrl;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // com.squareup.cash.treehouse.platform.CashContextService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object produceRequestContext(ByteString byteString, ContinuationImpl continuationImpl) {
        RealCashContextService$produceRequestContext$1 realCashContextService$produceRequestContext$1;
        int i;
        if (continuationImpl instanceof RealCashContextService$produceRequestContext$1) {
            realCashContextService$produceRequestContext$1 = (RealCashContextService$produceRequestContext$1) continuationImpl;
            int i2 = realCashContextService$produceRequestContext$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realCashContextService$produceRequestContext$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = realCashContextService$produceRequestContext$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realCashContextService$produceRequestContext$1.label;
                ProtoAdapter protoAdapter = this.requestContextAdapter;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    RequestContext requestContext = (RequestContext) protoAdapter.decode(byteString);
                    realCashContextService$produceRequestContext$1.label = 1;
                    obj = this.serviceContextManager.produceRequestContext(requestContext, realCashContextService$produceRequestContext$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return protoAdapter.encodeByteString((RequestContext) obj);
            }
        }
        realCashContextService$produceRequestContext$1 = new RealCashContextService$produceRequestContext$1(this, continuationImpl);
        Object obj2 = realCashContextService$produceRequestContext$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realCashContextService$produceRequestContext$1.label;
        ProtoAdapter protoAdapter2 = this.requestContextAdapter;
        if (i != 0) {
        }
        return protoAdapter2.encodeByteString((RequestContext) obj2);
    }
}
