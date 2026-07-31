package org.asyncstorage.storage;

import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.Promise;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineName;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;

/* compiled from: RNStorage.kt */
@Metadata(d1 = {"\u0000*\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u001a=\u0010\u0004\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0006*\u00020\u00032\u0006\u0010\u0007\u001a\u00020\b2\u001c\u0010\t\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00060\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u0001H\u0002¢\u0006\u0002\u0010\f\"\u001a\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"createStorageScope", "Lkotlin/Function1;", "", "Lkotlinx/coroutines/CoroutineScope;", "lunchWithRejection", "", "T", BaseJavaModule.METHOD_TYPE_PROMISE, "Lcom/facebook/react/bridge/Promise;", "block", "Lkotlin/coroutines/Continuation;", "", "(Lkotlinx/coroutines/CoroutineScope;Lcom/facebook/react/bridge/Promise;Lkotlin/jvm/functions/Function1;)V", "react-native-async-storage_async-storage_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class RNStorageKt {
    private static final Function1<String, CoroutineScope> createStorageScope = new Function1() { // from class: org.asyncstorage.storage.RNStorageKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            CoroutineScope createStorageScope$lambda$0;
            createStorageScope$lambda$0 = RNStorageKt.createStorageScope$lambda$0((String) obj);
            return createStorageScope$lambda$0;
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    public static final CoroutineScope createStorageScope$lambda$0(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return CoroutineScopeKt.CoroutineScope(SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null).plus(new CoroutineName(name)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> void lunchWithRejection(CoroutineScope coroutineScope, Promise promise, Function1<? super Continuation<? super T>, ? extends Object> function1) {
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new RNStorageKt$lunchWithRejection$1(function1, promise, null), 3, null);
    }
}
