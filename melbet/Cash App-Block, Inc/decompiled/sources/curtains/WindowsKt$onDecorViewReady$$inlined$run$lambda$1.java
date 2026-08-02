package curtains;

import android.view.View;
import android.view.Window;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.functions.Function1;
import okio.internal.DefaultSocket;

/* loaded from: classes4.dex */
public final class WindowsKt$onDecorViewReady$$inlined$run$lambda$1 {
    public final /* synthetic */ Function1 $onDecorViewReady$inlined;
    public final /* synthetic */ Window $this_onDecorViewReady$inlined;
    public final /* synthetic */ DefaultSocket $this_run;

    public WindowsKt$onDecorViewReady$$inlined$run$lambda$1(DefaultSocket defaultSocket, Window window, Function1 function1) {
        this.$this_run = defaultSocket;
        this.$this_onDecorViewReady$inlined = window;
        this.$onDecorViewReady$inlined = function1;
    }

    public final void onContentChanged() {
        ((CopyOnWriteArrayList) this.$this_run.source).remove(this);
        View peekDecorView = this.$this_onDecorViewReady$inlined.peekDecorView();
        peekDecorView.getClass();
        this.$onDecorViewReady$inlined.invoke(peekDecorView);
    }
}
