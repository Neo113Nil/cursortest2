package androidx.core.view;

import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* compiled from: View.kt */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 8, 0}, xi = 176)
/* loaded from: classes3.dex */
public final class ViewKt$doOnPreDraw$1 implements Runnable {
    final /* synthetic */ Function1 $action;
    final /* synthetic */ View $this_doOnPreDraw;

    @Override // java.lang.Runnable
    public final void run() {
        this.$action.invoke(this.$this_doOnPreDraw);
    }
}
