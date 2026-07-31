package androidx.window.embedding;

import android.annotation.SuppressLint;
import androidx.window.core.ExperimentalWindowApi;
import androidx.window.embedding.EmbeddingInterfaceCompat;
import com.ironsource.O6;
import java.util.List;
import java.util.function.Consumer;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: EmbeddingTranslatingCallback.kt */
@ExperimentalWindowApi
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001J\u001d\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Landroidx/window/embedding/EmbeddingTranslatingCallback;", "Ljava/util/function/Consumer;", "", "Landroidx/window/extensions/embedding/SplitInfo;", "splitInfoList", "", "accept", "(Ljava/util/List;)V", "Landroidx/window/embedding/EmbeddingInterfaceCompat$EmbeddingCallbackInterface;", "callback", "Landroidx/window/embedding/EmbeddingInterfaceCompat$EmbeddingCallbackInterface;", "Landroidx/window/embedding/EmbeddingAdapter;", O6.G1, "Landroidx/window/embedding/EmbeddingAdapter;", "window_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
@SuppressLint({"NewApi"})
/* loaded from: classes3.dex */
public final class EmbeddingTranslatingCallback implements Consumer<List<? extends androidx.window.extensions.embedding.SplitInfo>> {
    private final EmbeddingAdapter adapter;
    private final EmbeddingInterfaceCompat.EmbeddingCallbackInterface callback;

    @Override // java.util.function.Consumer
    public /* bridge */ /* synthetic */ void accept(List<? extends androidx.window.extensions.embedding.SplitInfo> list) {
        accept2((List) list);
    }

    /* renamed from: accept, reason: avoid collision after fix types in other method */
    public void accept2(List splitInfoList) {
        Intrinsics.checkNotNullParameter(splitInfoList, "splitInfoList");
        this.callback.onSplitInfoChanged(this.adapter.translate(splitInfoList));
    }
}
