package androidx.window.embedding;

import android.app.Activity;
import androidx.core.util.Consumer;
import androidx.window.core.ExperimentalWindowApi;
import androidx.window.embedding.EmbeddingInterfaceCompat;
import androidx.window.embedding.ExtensionEmbeddingBackend;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ExtensionEmbeddingBackend.kt */
@ExperimentalWindowApi
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0001\u0018\u0000 \n2\u00020\u0001:\u0003\n\u000b\fR&\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u0012\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007¨\u0006\r"}, d2 = {"Landroidx/window/embedding/ExtensionEmbeddingBackend;", "Landroidx/window/embedding/EmbeddingBackend;", "Ljava/util/concurrent/CopyOnWriteArrayList;", "Landroidx/window/embedding/ExtensionEmbeddingBackend$SplitListenerWrapper;", "splitChangeCallbacks", "Ljava/util/concurrent/CopyOnWriteArrayList;", "getSplitChangeCallbacks", "()Ljava/util/concurrent/CopyOnWriteArrayList;", "getSplitChangeCallbacks$annotations", "()V", "Companion", "EmbeddingCallbackImpl", "SplitListenerWrapper", "window_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class ExtensionEmbeddingBackend implements EmbeddingBackend {
    private static final ReentrantLock globalLock = new ReentrantLock();
    private final CopyOnWriteArrayList splitChangeCallbacks;

    public final CopyOnWriteArrayList getSplitChangeCallbacks() {
        return this.splitChangeCallbacks;
    }

    /* compiled from: ExtensionEmbeddingBackend.kt */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001J\u001b\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR#\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Landroidx/window/embedding/ExtensionEmbeddingBackend$SplitListenerWrapper;", "", "", "Landroidx/window/embedding/SplitInfo;", "splitInfoList", "", "accept", "(Ljava/util/List;)V", "Landroid/app/Activity;", "activity", "Landroid/app/Activity;", "Ljava/util/concurrent/Executor;", "executor", "Ljava/util/concurrent/Executor;", "Landroidx/core/util/Consumer;", "callback", "Landroidx/core/util/Consumer;", "getCallback", "()Landroidx/core/util/Consumer;", "lastValue", "Ljava/util/List;", "window_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class SplitListenerWrapper {
        private final Activity activity;
        private final Consumer callback;
        private final Executor executor;
        private List lastValue;

        public final void accept(List splitInfoList) {
            Intrinsics.checkNotNullParameter(splitInfoList, "splitInfoList");
            final ArrayList arrayList = new ArrayList();
            for (Object obj : splitInfoList) {
                if (((SplitInfo) obj).contains(this.activity)) {
                    arrayList.add(obj);
                }
            }
            if (Intrinsics.areEqual(arrayList, this.lastValue)) {
                return;
            }
            this.lastValue = arrayList;
            this.executor.execute(new Runnable() { // from class: androidx.window.embedding.ExtensionEmbeddingBackend$SplitListenerWrapper$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    ExtensionEmbeddingBackend.SplitListenerWrapper.m2884accept$lambda1(ExtensionEmbeddingBackend.SplitListenerWrapper.this, arrayList);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: accept$lambda-1, reason: not valid java name */
        public static final void m2884accept$lambda1(SplitListenerWrapper this$0, List splitsWithActivity) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(splitsWithActivity, "$splitsWithActivity");
            this$0.callback.accept(splitsWithActivity);
        }
    }

    /* compiled from: ExtensionEmbeddingBackend.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\b\u0080\u0004\u0018\u00002\u00020\u0001J\u001d\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R*\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\u0007¨\u0006\r"}, d2 = {"Landroidx/window/embedding/ExtensionEmbeddingBackend$EmbeddingCallbackImpl;", "Landroidx/window/embedding/EmbeddingInterfaceCompat$EmbeddingCallbackInterface;", "", "Landroidx/window/embedding/SplitInfo;", "splitInfo", "", "onSplitInfoChanged", "(Ljava/util/List;)V", "lastInfo", "Ljava/util/List;", "getLastInfo", "()Ljava/util/List;", "setLastInfo", "window_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public final class EmbeddingCallbackImpl implements EmbeddingInterfaceCompat.EmbeddingCallbackInterface {
        private List lastInfo;
        final /* synthetic */ ExtensionEmbeddingBackend this$0;

        @Override // androidx.window.embedding.EmbeddingInterfaceCompat.EmbeddingCallbackInterface
        public void onSplitInfoChanged(List splitInfo) {
            Intrinsics.checkNotNullParameter(splitInfo, "splitInfo");
            this.lastInfo = splitInfo;
            Iterator it = this.this$0.getSplitChangeCallbacks().iterator();
            while (it.hasNext()) {
                ((SplitListenerWrapper) it.next()).accept(splitInfo);
            }
        }
    }
}
