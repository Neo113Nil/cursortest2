package com.startapp.sdk.ads.video.downloader.impl;

import com.startapp.sdk.internal.vd;
import com.startapp.sdk.internal.xd;
import java.io.File;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SpillingKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.AwaitKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.Dispatchers;

/* compiled from: Sta */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 4, 0}, xi = 48)
@DebugMetadata(c = "com.startapp.sdk.ads.video.downloader.impl.DownloadEngine$downloadResume$2", f = "DownloadEngine.kt", i = {0, 0}, l = {242}, m = "invokeSuspend", n = {"$this$coroutineScope", "jobs"}, nl = {-1}, s = {"L$0", "L$1"}, v = 2)
/* loaded from: classes3.dex */
final class DownloadEngine$downloadResume$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super List<? extends Unit>>, Object> {
    final /* synthetic */ File $destFile;
    final /* synthetic */ List<Pair<Integer, vd>> $incompleteIndexed;
    final /* synthetic */ xd $progressFile;
    final /* synthetic */ int $progressFlushBytes;
    final /* synthetic */ URL $url;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DownloadEngine$downloadResume$2(List list, a aVar, URL url, xd xdVar, File file, int i, Continuation continuation) {
        super(2, continuation);
        this.$incompleteIndexed = list;
        this.this$0 = aVar;
        this.$url = url;
        this.$progressFile = xdVar;
        this.$destFile = file;
        this.$progressFlushBytes = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        DownloadEngine$downloadResume$2 downloadEngine$downloadResume$2 = new DownloadEngine$downloadResume$2(this.$incompleteIndexed, this.this$0, this.$url, this.$progressFile, this.$destFile, this.$progressFlushBytes, continuation);
        downloadEngine$downloadResume$2.L$0 = obj;
        return downloadEngine$downloadResume$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super List<? extends Unit>> continuation) {
        return ((DownloadEngine$downloadResume$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Deferred async$default;
        CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return obj;
        }
        ResultKt.throwOnFailure(obj);
        List<Pair<Integer, vd>> list = this.$incompleteIndexed;
        a aVar = this.this$0;
        URL url = this.$url;
        xd xdVar = this.$progressFile;
        File file = this.$destFile;
        int i2 = this.$progressFlushBytes;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            int i3 = i2;
            ArrayList arrayList2 = arrayList;
            async$default = BuildersKt__Builders_commonKt.async$default(coroutineScope, Dispatchers.getIO(), null, new DownloadEngine$downloadResume$2$jobs$1$1((vd) pair.component2(), aVar, url, xdVar, file, ((Number) pair.component1()).intValue(), i3, null), 2, null);
            arrayList2.add(async$default);
            arrayList = arrayList2;
            i2 = i3;
        }
        ArrayList arrayList3 = arrayList;
        this.L$0 = SpillingKt.nullOutSpilledVariable(coroutineScope);
        this.L$1 = SpillingKt.nullOutSpilledVariable(arrayList3);
        this.label = 1;
        Object awaitAll = AwaitKt.awaitAll(arrayList3, this);
        return awaitAll == coroutine_suspended ? coroutine_suspended : awaitAll;
    }
}
