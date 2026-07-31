package androidx.work.impl.constraints.controllers;

import androidx.work.impl.constraints.ConstraintListener;
import androidx.work.impl.constraints.trackers.ConstraintTracker;
import androidx.work.impl.model.WorkSpec;
import com.yandex.div.core.timer.TimerController;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ConstraintController.kt */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u001c\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010!\n\u0002\b\u000b\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0001-B\u0017\b\u0000\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0005\u0010\u0006J#\u0010\u000b\u001a\u00020\n2\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\t\u001a\u0004\u0018\u00018\u0000H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH&¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00028\u0000H&¢\u0006\u0004\b\u0013\u0010\u0014J\u001b\u0010\u0017\u001a\u00020\n2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\r0\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\r\u0010\u0019\u001a\u00020\n¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001d\u001a\u00020\u000f2\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010 \u001a\u00020\n2\u0006\u0010\u001f\u001a\u00028\u0000H\u0016¢\u0006\u0004\b \u0010!R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\"R\u001a\u0010$\u001a\b\u0012\u0004\u0012\u00020\r0#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u001a\u0010&\u001a\b\u0012\u0004\u0012\u00020\u001b0#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010%R\u0018\u0010\t\u001a\u0004\u0018\u00018\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010'R.\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\u0012\u001a\u0004\u0018\u00010\u00078\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,¨\u0006."}, d2 = {"Landroidx/work/impl/constraints/controllers/ConstraintController;", "T", "Landroidx/work/impl/constraints/ConstraintListener;", "Landroidx/work/impl/constraints/trackers/ConstraintTracker;", "tracker", "<init>", "(Landroidx/work/impl/constraints/trackers/ConstraintTracker;)V", "Landroidx/work/impl/constraints/controllers/ConstraintController$OnConstraintUpdatedCallback;", "callback", "currentValue", "", "updateCallback", "(Landroidx/work/impl/constraints/controllers/ConstraintController$OnConstraintUpdatedCallback;Ljava/lang/Object;)V", "Landroidx/work/impl/model/WorkSpec;", "workSpec", "", "hasConstraint", "(Landroidx/work/impl/model/WorkSpec;)Z", "value", "isConstrained", "(Ljava/lang/Object;)Z", "", "workSpecs", "replace", "(Ljava/lang/Iterable;)V", TimerController.RESET_COMMAND, "()V", "", "workSpecId", "isWorkSpecConstrained", "(Ljava/lang/String;)Z", "newValue", "onConstraintChanged", "(Ljava/lang/Object;)V", "Landroidx/work/impl/constraints/trackers/ConstraintTracker;", "", "matchingWorkSpecs", "Ljava/util/List;", "matchingWorkSpecIds", "Ljava/lang/Object;", "Landroidx/work/impl/constraints/controllers/ConstraintController$OnConstraintUpdatedCallback;", "getCallback", "()Landroidx/work/impl/constraints/controllers/ConstraintController$OnConstraintUpdatedCallback;", "setCallback", "(Landroidx/work/impl/constraints/controllers/ConstraintController$OnConstraintUpdatedCallback;)V", "OnConstraintUpdatedCallback", "work-runtime_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes11.dex */
public abstract class ConstraintController<T> implements ConstraintListener<T> {
    private OnConstraintUpdatedCallback callback;
    private Object currentValue;
    private final List matchingWorkSpecIds;
    private final List matchingWorkSpecs;
    private final ConstraintTracker tracker;

    /* compiled from: ConstraintController.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H&J\u0016\u0010\u0007\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H&¨\u0006\b"}, d2 = {"Landroidx/work/impl/constraints/controllers/ConstraintController$OnConstraintUpdatedCallback;", "", "onConstraintMet", "", "workSpecs", "", "Landroidx/work/impl/model/WorkSpec;", "onConstraintNotMet", "work-runtime_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public interface OnConstraintUpdatedCallback {
        void onConstraintMet(List workSpecs);

        void onConstraintNotMet(List workSpecs);
    }

    public abstract boolean hasConstraint(WorkSpec workSpec);

    public abstract boolean isConstrained(Object value);

    public ConstraintController(ConstraintTracker tracker) {
        Intrinsics.checkNotNullParameter(tracker, "tracker");
        this.tracker = tracker;
        this.matchingWorkSpecs = new ArrayList();
        this.matchingWorkSpecIds = new ArrayList();
    }

    public final void setCallback(OnConstraintUpdatedCallback onConstraintUpdatedCallback) {
        if (this.callback != onConstraintUpdatedCallback) {
            this.callback = onConstraintUpdatedCallback;
            updateCallback(onConstraintUpdatedCallback, this.currentValue);
        }
    }

    public final void replace(Iterable workSpecs) {
        Intrinsics.checkNotNullParameter(workSpecs, "workSpecs");
        this.matchingWorkSpecs.clear();
        this.matchingWorkSpecIds.clear();
        List list = this.matchingWorkSpecs;
        for (T t : workSpecs) {
            if (hasConstraint((WorkSpec) t)) {
                list.add(t);
            }
        }
        List list2 = this.matchingWorkSpecs;
        List list3 = this.matchingWorkSpecIds;
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            list3.add(((WorkSpec) it.next()).id);
        }
        if (this.matchingWorkSpecs.isEmpty()) {
            this.tracker.removeListener(this);
        } else {
            this.tracker.addListener(this);
        }
        updateCallback(this.callback, this.currentValue);
    }

    public final void reset() {
        if (this.matchingWorkSpecs.isEmpty()) {
            return;
        }
        this.matchingWorkSpecs.clear();
        this.tracker.removeListener(this);
    }

    public final boolean isWorkSpecConstrained(String workSpecId) {
        Intrinsics.checkNotNullParameter(workSpecId, "workSpecId");
        Object obj = this.currentValue;
        return obj != null && isConstrained(obj) && this.matchingWorkSpecIds.contains(workSpecId);
    }

    private final void updateCallback(OnConstraintUpdatedCallback callback, Object currentValue) {
        if (this.matchingWorkSpecs.isEmpty() || callback == null) {
            return;
        }
        if (currentValue == null || isConstrained(currentValue)) {
            callback.onConstraintNotMet(this.matchingWorkSpecs);
        } else {
            callback.onConstraintMet(this.matchingWorkSpecs);
        }
    }

    @Override // androidx.work.impl.constraints.ConstraintListener
    public void onConstraintChanged(Object newValue) {
        this.currentValue = newValue;
        updateCallback(this.callback, newValue);
    }
}
