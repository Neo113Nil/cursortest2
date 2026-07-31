package com.yandex.div.core.timer;

import com.yandex.div.core.view2.Div2View;
import com.yandex.div.core.view2.errors.ErrorCollector;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public final class DivTimerEventDispatcher {

    @NotNull
    private final Set<String> activeTimerIds;

    @NotNull
    private final ErrorCollector errorCollector;

    @NotNull
    private final Map<String, TimerController> timerControllers;

    public DivTimerEventDispatcher(@NotNull ErrorCollector errorCollector) {
        Intrinsics.checkNotNullParameter(errorCollector, "errorCollector");
        this.errorCollector = errorCollector;
        this.timerControllers = new LinkedHashMap();
        this.activeTimerIds = new LinkedHashSet();
    }

    public final void addTimerController(@NotNull TimerController timerController) {
        Intrinsics.checkNotNullParameter(timerController, "timerController");
        String str = timerController.getDivTimer().f4167c;
        if (this.timerControllers.containsKey(str)) {
            return;
        }
        this.timerControllers.put(str, timerController);
    }

    public final void changeState(@NotNull String id, @NotNull String command) {
        Unit unit;
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(command, "command");
        TimerController timerController = getTimerController(id);
        if (timerController != null) {
            timerController.applyCommand(command);
            unit = Unit.f41027a;
        } else {
            unit = null;
        }
        if (unit == null) {
            this.errorCollector.logError(new IllegalArgumentException("Timer with id '" + id + "' does not exist!"));
        }
    }

    @Nullable
    public final TimerController getTimerController(@NotNull String id) {
        Intrinsics.checkNotNullParameter(id, "id");
        if (this.activeTimerIds.contains(id)) {
            return this.timerControllers.get(id);
        }
        return null;
    }

    public final void onAttach(@NotNull Div2View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Iterator<T> it = this.activeTimerIds.iterator();
        while (it.hasNext()) {
            TimerController timerController = this.timerControllers.get((String) it.next());
            if (timerController != null && !timerController.isAttachedToView(view)) {
                timerController.onAttach(view);
            }
        }
    }

    public final void onDetach(@NotNull Div2View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Iterator<T> it = this.timerControllers.values().iterator();
        while (it.hasNext()) {
            ((TimerController) it.next()).onDetach(view);
        }
    }

    public final void setActiveTimerIds(@NotNull List<String> ids) {
        Intrinsics.checkNotNullParameter(ids, "ids");
        Map<String, TimerController> map = this.timerControllers;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, TimerController> entry : map.entrySet()) {
            if (!ids.contains(entry.getKey())) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        Iterator it = linkedHashMap.values().iterator();
        while (it.hasNext()) {
            ((TimerController) it.next()).reset();
        }
        this.activeTimerIds.clear();
        this.activeTimerIds.addAll(ids);
    }
}
