package com.squareup.cash.support.backend.real;

import app.cash.api.ApiResult;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.support.backend.api.ScreenshotService$ServiceState;
import com.squareup.cash.support.chat.backend.api.MessageBody;
import com.squareup.cash.support.chat.backend.real.RealConversationService;
import com.squareup.protos.cash.cashsessionrecorder.app.v1.ScreenshotBundleService;
import com.squareup.protos.cash.cashsessionrecorder.app.v1.SubmitScreenshotBundleRequest;
import com.stripe.hcaptcha.HCaptcha;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.StateFlowImpl;
import okio.ByteString;
import org.bouncycastle.pqc.jcajce.spec.McElieceCCA2KeyGenParameterSpec;
import papa.SafeTrace;

/* loaded from: classes7.dex */
public final class RealScreenshotService$uploadAndSendScreenshotBundle$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ List $fileUris;
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ String $screenshotRequestId;
    public int label;
    public final /* synthetic */ HCaptcha this$0;

    /* renamed from: com.squareup.cash.support.backend.real.RealScreenshotService$uploadAndSendScreenshotBundle$1$1, reason: invalid class name */
    public final /* synthetic */ class AnonymousClass1 extends FunctionReferenceImpl implements Function1 {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1(1, ScreenshotService$ServiceState.Sending.class, "<init>", "<init>(Ljava/util/List;)V", 0);

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            List list = (List) obj;
            list.getClass();
            return new ScreenshotService$ServiceState.Sending(list);
        }
    }

    /* renamed from: com.squareup.cash.support.backend.real.RealScreenshotService$uploadAndSendScreenshotBundle$1$3, reason: invalid class name */
    public final /* synthetic */ class AnonymousClass3 extends FunctionReferenceImpl implements Function1 {
        public static final AnonymousClass3 INSTANCE = new AnonymousClass3(1, ScreenshotService$ServiceState.Succeeded.class, "<init>", "<init>(Ljava/util/List;)V", 0);

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            List list = (List) obj;
            list.getClass();
            return new ScreenshotService$ServiceState.Succeeded(list);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RealScreenshotService$uploadAndSendScreenshotBundle$1(HCaptcha hCaptcha, List list, String str, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.this$0 = hCaptcha;
        this.$fileUris = list;
        this.$screenshotRequestId = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.$r8$classId) {
            case 0:
                return new RealScreenshotService$uploadAndSendScreenshotBundle$1(this.this$0, this.$fileUris, this.$screenshotRequestId, continuation, 0);
            default:
                return new RealScreenshotService$uploadAndSendScreenshotBundle$1(this.this$0, this.$fileUris, this.$screenshotRequestId, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((RealScreenshotService$uploadAndSendScreenshotBundle$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x00fc, code lost:
    
        if (r0 == r1) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:?, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0094, code lost:
    
        if (r4 == r1) goto L40;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object access$uploadAllFiles;
        Object submitScreenshotBundle;
        Object access$uploadAllFiles2;
        int i = this.$r8$classId;
        String str = this.$screenshotRequestId;
        List list = this.$fileUris;
        HCaptcha hCaptcha = this.this$0;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i2 = this.label;
                if (i2 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    this.label = 1;
                    access$uploadAllFiles = HCaptcha.access$uploadAllFiles(hCaptcha, list, this);
                    break;
                } else {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                        submitScreenshotBundle = obj;
                        ApiResult apiResult = (ApiResult) submitScreenshotBundle;
                        if (apiResult instanceof ApiResult.Failure) {
                            StateFlowImpl stateFlowImpl = (StateFlowImpl) hCaptcha.captchaVerifier;
                            ScreenshotService$ServiceState.Failed failed = new ScreenshotService$ServiceState.Failed(((ScreenshotService$ServiceState) stateFlowImpl.getValue()).getFileStates(), ScreenshotService$ServiceState.Failed.FailReason.SENT_SCREENSHOTS_FAILED);
                            stateFlowImpl.getClass();
                            stateFlowImpl.updateState(null, failed);
                        } else {
                            if (!(apiResult instanceof ApiResult.Success)) {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                return null;
                            }
                            hCaptcha.notifyState(AnonymousClass3.INSTANCE);
                        }
                        return Unit.INSTANCE;
                    }
                    SafeTrace.throwOnFailure(obj);
                    access$uploadAllFiles = obj;
                }
                List list2 = (List) access$uploadAllFiles;
                if (list2.isEmpty()) {
                    return Unit.INSTANCE;
                }
                hCaptcha.notifyState(AnonymousClass1.INSTANCE);
                ScreenshotBundleService screenshotBundleService = (ScreenshotBundleService) hCaptcha.onSuccessListeners;
                String joinToString$default = CollectionsKt.joinToString$default(list, null, null, null, 0, null, null, 63);
                ByteString.Companion companion = ByteString.Companion;
                String hex = ByteString.Companion.encodeUtf8(joinToString$default).digest$okio(McElieceCCA2KeyGenParameterSpec.SHA1).hex();
                List list3 = list2;
                ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list3, 10));
                Iterator it = list3.iterator();
                while (it.hasNext()) {
                    arrayList.add(((RealScreenshotService$UploadedFile) it.next()).fileToken);
                }
                SubmitScreenshotBundleRequest submitScreenshotBundleRequest = new SubmitScreenshotBundleRequest(hex, str, arrayList, ByteString.EMPTY);
                this.label = 2;
                submitScreenshotBundle = screenshotBundleService.submitScreenshotBundle(submitScreenshotBundleRequest, this);
                break;
            default:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i3 = this.label;
                if (i3 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    this.label = 1;
                    access$uploadAllFiles2 = HCaptcha.access$uploadAllFiles(hCaptcha, list, this);
                    if (access$uploadAllFiles2 == coroutineSingletons2) {
                        return coroutineSingletons2;
                    }
                } else {
                    if (i3 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                    access$uploadAllFiles2 = obj;
                }
                List<RealScreenshotService$UploadedFile> list4 = (List) access$uploadAllFiles2;
                if (list4.isEmpty()) {
                    return Unit.INSTANCE;
                }
                hCaptcha.notifyState(RealScreenshotService$uploadAndSendScreenshotsToSupportChat$1$1.INSTANCE);
                for (RealScreenshotService$UploadedFile realScreenshotService$UploadedFile : list4) {
                    ((RealConversationService) hCaptcha.exception).sendMessage(new MessageBody.FileBody(realScreenshotService$UploadedFile.fileMetadata, realScreenshotService$UploadedFile.fileUri, realScreenshotService$UploadedFile.fileToken), str, null, false);
                }
                hCaptcha.notifyState(RealScreenshotService$uploadAndSendScreenshotsToSupportChat$1$3.INSTANCE);
                return Unit.INSTANCE;
        }
    }
}
