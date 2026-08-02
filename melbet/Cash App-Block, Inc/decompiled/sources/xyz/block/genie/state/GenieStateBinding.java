package xyz.block.genie.state;

import java.util.List;
import kotlin.jvm.functions.Function1;

/* loaded from: classes10.dex */
public final class GenieStateBinding {
    public final List keyPath;
    public final Function1 read;
    public final GenieViewState viewState;
    public final Function1 write;

    public GenieStateBinding(GenieViewState genieViewState, List list, Function1 function1, Function1 function12) {
        genieViewState.getClass();
        list.getClass();
        this.viewState = genieViewState;
        this.keyPath = list;
        this.read = function1;
        this.write = function12;
    }

    public final Object getValue() {
        return this.read.invoke(this.viewState.value(this.keyPath));
    }

    public final void setValue(Object obj) {
        this.viewState.setValue((GenieStateValue) this.write.invoke(obj), this.keyPath);
    }
}
