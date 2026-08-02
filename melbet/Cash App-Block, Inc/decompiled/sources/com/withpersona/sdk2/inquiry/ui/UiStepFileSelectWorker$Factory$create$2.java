package com.withpersona.sdk2.inquiry.ui;

import android.net.Uri;
import android.opengl.GLES20;
import android.opengl.GLES30;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.withpersona.sdk2.inquiry.launchers.DocumentSelectLauncherResult;
import com.withpersona.sdk2.inquiry.launchers.DocumentsSelectLauncherResult;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.flow.FlowKt;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class UiStepFileSelectWorker$Factory$create$2 extends SuspendLambda implements Function1 {
    public final /* synthetic */ int $fileUploadLimit;
    public final /* synthetic */ int $r8$classId;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UiStepFileSelectWorker$Factory$create$2(int i, int i2, Continuation continuation) {
        super(1, continuation);
        this.$r8$classId = 1;
        this.label = i;
        this.$fileUploadLimit = i2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        switch (this.$r8$classId) {
            case 0:
                return new UiStepFileSelectWorker$Factory$create$2(this.$fileUploadLimit, continuation, 0);
            case 1:
                return new UiStepFileSelectWorker$Factory$create$2(this.label, this.$fileUploadLimit, continuation);
            default:
                return new UiStepFileSelectWorker$Factory$create$2(this.$fileUploadLimit, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Continuation continuation = (Continuation) obj;
        switch (this.$r8$classId) {
        }
        return ((UiStepFileSelectWorker$Factory$create$2) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0032, code lost:
    
        if (r8 == r0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0049, code lost:
    
        if (r8 == r0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0094, code lost:
    
        if (r8 == r0) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00ae, code lost:
    
        if (r8 == r0) goto L49;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        int i2 = this.$fileUploadLimit;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i3 = this.label;
                if (i3 != 0) {
                    if (i3 == 1) {
                        SafeTrace.throwOnFailure(obj);
                        Uri uri = (Uri) obj;
                        return uri != null ? CollectionsKt__CollectionsJVMKt.listOf(uri) : EmptyList.INSTANCE;
                    }
                    if (i3 == 2) {
                        SafeTrace.throwOnFailure(obj);
                        return (List) obj;
                    }
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SafeTrace.throwOnFailure(obj);
                if (i2 != 1) {
                    DocumentsSelectLauncherResult documentsSelectLauncherResult = new DocumentsSelectLauncherResult();
                    this.label = 2;
                    obj = FlowKt.first(documentsSelectLauncherResult, this);
                    break;
                } else {
                    DocumentSelectLauncherResult documentSelectLauncherResult = new DocumentSelectLauncherResult();
                    this.label = 1;
                    obj = FlowKt.first(documentSelectLauncherResult, this);
                    break;
                }
                return coroutineSingletons;
            case 1:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                int i4 = this.label;
                if (i4 != 0) {
                    GLES20.glDeleteBuffers(1, new int[]{i4}, 0);
                }
                if (i2 != 0) {
                    GLES30.glDeleteVertexArrays(1, new int[]{i2}, 0);
                }
                return Unit.INSTANCE;
            default:
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i5 = this.label;
                if (i5 != 0) {
                    if (i5 != 1) {
                        if (i5 == 2) {
                            SafeTrace.throwOnFailure(obj);
                            return (List) obj;
                        }
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                    Uri uri2 = (Uri) obj;
                    if (uri2 != null) {
                        return CollectionsKt__CollectionsJVMKt.listOf(uri2);
                    }
                    return null;
                }
                SafeTrace.throwOnFailure(obj);
                if (i2 != 1) {
                    DocumentsSelectLauncherResult documentsSelectLauncherResult2 = new DocumentsSelectLauncherResult();
                    this.label = 2;
                    obj = FlowKt.firstOrNull(documentsSelectLauncherResult2, this);
                    break;
                } else {
                    DocumentSelectLauncherResult documentSelectLauncherResult2 = new DocumentSelectLauncherResult();
                    this.label = 1;
                    obj = FlowKt.firstOrNull(documentSelectLauncherResult2, this);
                    break;
                }
                return coroutineSingletons3;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ UiStepFileSelectWorker$Factory$create$2(int i, Continuation continuation, int i2) {
        super(1, continuation);
        this.$r8$classId = i2;
        this.$fileUploadLimit = i;
    }
}
