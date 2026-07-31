package androidx.compose.runtime.internal;

import androidx.collection.MutableScatterMap;
import androidx.collection.MutableScatterSet;
import androidx.collection.ScatterMapKt;
import androidx.collection.ScatterSet;
import androidx.collection.ScatterSetKt;
import androidx.compose.runtime.ComposeNodeLifecycleCallback;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RememberManager;
import androidx.compose.runtime.RememberObserver;
import androidx.compose.runtime.RememberObserverHolder;
import androidx.compose.runtime.Stack;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.tooling.CompositionErrorContext;
import com.ironsource.C4834q2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: RememberEventDispatcher.kt */
@StabilityInferred
@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\rJ%\u0010\u0013\u001a\u00020\u00072\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00020\u0007¢\u0006\u0004\b\u0015\u0010\u0003J\u0017\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0018\u0010\u0017J\u001d\u0010\u001b\u001a\u00020\u00072\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00070\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001e\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010 \u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u001dH\u0016¢\u0006\u0004\b \u0010\u001fJ\u0017\u0010#\u001a\u00020\u00072\u0006\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b#\u0010$J\u0017\u0010%\u001a\u00020\u00072\u0006\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b%\u0010$J\u0017\u0010&\u001a\u00020\u00072\u0006\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b&\u0010$J\r\u0010'\u001a\u00020\u0007¢\u0006\u0004\b'\u0010\u0003J\r\u0010(\u001a\u00020\u0007¢\u0006\u0004\b(\u0010\u0003J\r\u0010)\u001a\u00020\u0007¢\u0006\u0004\b)\u0010\u0003R\u001e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010*R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010+R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010,R\u001c\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00050-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/R\u001c\u00100\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u0010,R\u001a\u00101\u001a\b\u0012\u0004\u0012\u00020\n0\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u0010,R \u00102\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00190\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u0010,R\u001e\u0010 \u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010/R$\u00105\u001a\u0010\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u000204\u0018\u0001038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00106R$\u00108\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u0001078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00109R\u001e\u0010;\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010:8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010<¨\u0006="}, d2 = {"Landroidx/compose/runtime/internal/RememberEventDispatcher;", "Landroidx/compose/runtime/RememberManager;", "<init>", "()V", "Landroidx/compose/runtime/collection/MutableVector;", "Landroidx/compose/runtime/RememberObserverHolder;", "list", "", "dispatchRememberList", "(Landroidx/compose/runtime/collection/MutableVector;)V", "", C4834q2.p, "recordLeaving", "(Ljava/lang/Object;)V", "", "Landroidx/compose/runtime/RememberObserver;", "abandoning", "Landroidx/compose/runtime/tooling/CompositionErrorContext;", "traceContext", "prepare", "(Ljava/util/Set;Landroidx/compose/runtime/tooling/CompositionErrorContext;)V", "clear", "remembering", "(Landroidx/compose/runtime/RememberObserverHolder;)V", "forgetting", "Lkotlin/Function0;", "effect", "sideEffect", "(Lkotlin/jvm/functions/Function0;)V", "Landroidx/compose/runtime/ComposeNodeLifecycleCallback;", "deactivating", "(Landroidx/compose/runtime/ComposeNodeLifecycleCallback;)V", "releasing", "Landroidx/compose/runtime/RecomposeScopeImpl;", "scope", "rememberPausingScope", "(Landroidx/compose/runtime/RecomposeScopeImpl;)V", "startResumingScope", "endResumingScope", "dispatchRememberObservers", "dispatchSideEffects", "dispatchAbandons", "Ljava/util/Set;", "Landroidx/compose/runtime/tooling/CompositionErrorContext;", "Landroidx/compose/runtime/collection/MutableVector;", "Landroidx/collection/MutableScatterSet;", "rememberSet", "Landroidx/collection/MutableScatterSet;", "currentRememberingList", "leaving", "sideEffects", "Landroidx/collection/MutableScatterMap;", "Landroidx/compose/runtime/internal/PausedCompositionRemembers;", "pausedPlaceholders", "Landroidx/collection/MutableScatterMap;", "Landroidx/compose/runtime/Stack;", "nestedRemembersLists", "Ljava/util/ArrayList;", "Landroidx/collection/ScatterSet;", "ignoreLeavingSet", "Landroidx/collection/ScatterSet;", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class RememberEventDispatcher implements RememberManager {
    private Set abandoning;
    private MutableVector currentRememberingList;
    private ScatterSet ignoreLeavingSet;
    private final MutableVector leaving;
    private ArrayList nestedRemembersLists;
    private MutableScatterMap pausedPlaceholders;
    private MutableScatterSet releasing;
    private MutableScatterSet rememberSet;
    private final MutableVector remembering;
    private final MutableVector sideEffects;
    private CompositionErrorContext traceContext;

    public RememberEventDispatcher() {
        MutableVector mutableVector = new MutableVector(new RememberObserverHolder[16], 0);
        this.remembering = mutableVector;
        this.rememberSet = ScatterSetKt.mutableScatterSetOf();
        this.currentRememberingList = mutableVector;
        this.leaving = new MutableVector(new Object[16], 0);
        this.sideEffects = new MutableVector(new Function0[16], 0);
    }

    public final void prepare(Set abandoning, CompositionErrorContext traceContext) {
        clear();
        this.abandoning = abandoning;
        this.traceContext = traceContext;
    }

    public final void clear() {
        this.abandoning = null;
        this.traceContext = null;
        this.remembering.clear();
        this.rememberSet.clear();
        this.currentRememberingList = this.remembering;
        this.leaving.clear();
        this.sideEffects.clear();
        this.releasing = null;
        this.pausedPlaceholders = null;
        this.nestedRemembersLists = null;
    }

    @Override // androidx.compose.runtime.RememberManager
    public void remembering(RememberObserverHolder instance) {
        this.currentRememberingList.add(instance);
        this.rememberSet.add(instance);
    }

    @Override // androidx.compose.runtime.RememberManager
    public void forgetting(RememberObserverHolder instance) {
        if (this.rememberSet.contains(instance)) {
            this.rememberSet.remove(instance);
            if (!this.currentRememberingList.remove(instance) && !this.remembering.remove(instance)) {
                forgetting$removeFrom(instance, this.remembering);
            }
            Set set = this.abandoning;
            if (set == null) {
                return;
            } else {
                set.add(instance.getWrapped());
            }
        }
        ScatterSet scatterSet = this.ignoreLeavingSet;
        if (scatterSet == null || !scatterSet.contains(instance)) {
            recordLeaving(instance);
        }
    }

    @Override // androidx.compose.runtime.RememberManager
    public void sideEffect(Function0 effect) {
        this.sideEffects.add(effect);
    }

    @Override // androidx.compose.runtime.RememberManager
    public void deactivating(ComposeNodeLifecycleCallback instance) {
        recordLeaving(instance);
    }

    @Override // androidx.compose.runtime.RememberManager
    public void releasing(ComposeNodeLifecycleCallback instance) {
        MutableScatterSet mutableScatterSet = this.releasing;
        if (mutableScatterSet == null) {
            mutableScatterSet = ScatterSetKt.mutableScatterSetOf();
            this.releasing = mutableScatterSet;
        }
        mutableScatterSet.plusAssign(instance);
        recordLeaving(instance);
    }

    @Override // androidx.compose.runtime.RememberManager
    public void rememberPausingScope(RecomposeScopeImpl scope) {
        Set set = this.abandoning;
        if (set == null) {
            return;
        }
        PausedCompositionRemembers pausedCompositionRemembers = new PausedCompositionRemembers(set);
        MutableScatterMap mutableScatterMap = this.pausedPlaceholders;
        if (mutableScatterMap == null) {
            mutableScatterMap = ScatterMapKt.mutableScatterMapOf();
            this.pausedPlaceholders = mutableScatterMap;
        }
        mutableScatterMap.set(scope, pausedCompositionRemembers);
        this.currentRememberingList.add(new RememberObserverHolder(pausedCompositionRemembers, null));
    }

    @Override // androidx.compose.runtime.RememberManager
    public void startResumingScope(RecomposeScopeImpl scope) {
        MutableScatterMap mutableScatterMap = this.pausedPlaceholders;
        PausedCompositionRemembers pausedCompositionRemembers = mutableScatterMap != null ? (PausedCompositionRemembers) mutableScatterMap.get(scope) : null;
        if (pausedCompositionRemembers != null) {
            ArrayList arrayList = this.nestedRemembersLists;
            if (arrayList == null) {
                arrayList = Stack.m1135constructorimpl$default(null, 1, null);
                this.nestedRemembersLists = arrayList;
            }
            Stack.m1144pushimpl(arrayList, this.currentRememberingList);
            this.currentRememberingList = pausedCompositionRemembers.getPausedRemembers();
        }
    }

    @Override // androidx.compose.runtime.RememberManager
    public void endResumingScope(RecomposeScopeImpl scope) {
        MutableVector mutableVector;
        MutableScatterMap mutableScatterMap = this.pausedPlaceholders;
        if (mutableScatterMap == null || ((PausedCompositionRemembers) mutableScatterMap.get(scope)) == null) {
            return;
        }
        ArrayList arrayList = this.nestedRemembersLists;
        if (arrayList != null && (mutableVector = (MutableVector) Stack.m1143popimpl(arrayList)) != null) {
            this.currentRememberingList = mutableVector;
        }
        mutableScatterMap.remove(scope);
    }

    public final void dispatchRememberObservers() {
        Object beginSection;
        Set set = this.abandoning;
        if (set == null) {
            return;
        }
        this.ignoreLeavingSet = null;
        if (this.leaving.getSize() != 0) {
            beginSection = Trace.INSTANCE.beginSection("Compose:onForgotten");
            try {
                MutableScatterSet mutableScatterSet = this.releasing;
                for (int size = this.leaving.getSize() - 1; -1 < size; size--) {
                    Object obj = this.leaving.content[size];
                    try {
                        if (obj instanceof RememberObserverHolder) {
                            RememberObserver wrapped = ((RememberObserverHolder) obj).getWrapped();
                            set.remove(wrapped);
                            wrapped.onForgotten();
                        }
                        if (obj instanceof ComposeNodeLifecycleCallback) {
                            if (mutableScatterSet != null && mutableScatterSet.contains(obj)) {
                                ((ComposeNodeLifecycleCallback) obj).onRelease();
                            } else {
                                ((ComposeNodeLifecycleCallback) obj).onDeactivate();
                            }
                        }
                        Unit unit = Unit.INSTANCE;
                    } catch (Throwable th) {
                        CompositionErrorContext compositionErrorContext = this.traceContext;
                        if (compositionErrorContext != null) {
                            compositionErrorContext.attachComposeStackTrace(th, obj);
                        }
                        throw th;
                    }
                }
                Unit unit2 = Unit.INSTANCE;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (this.remembering.getSize() != 0) {
            Trace trace = Trace.INSTANCE;
            beginSection = trace.beginSection("Compose:onRemembered");
            try {
                dispatchRememberList(this.remembering);
                Unit unit3 = Unit.INSTANCE;
                trace.endSection(beginSection);
            } finally {
                Trace.INSTANCE.endSection(beginSection);
            }
        }
    }

    private final void dispatchRememberList(MutableVector list) {
        Set set = this.abandoning;
        if (set == null) {
            return;
        }
        Object[] objArr = list.content;
        int size = list.getSize();
        for (int i = 0; i < size; i++) {
            RememberObserverHolder rememberObserverHolder = (RememberObserverHolder) objArr[i];
            RememberObserver wrapped = rememberObserverHolder.getWrapped();
            set.remove(wrapped);
            try {
                wrapped.onRemembered();
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                CompositionErrorContext compositionErrorContext = this.traceContext;
                if (compositionErrorContext != null) {
                    compositionErrorContext.attachComposeStackTrace(th, rememberObserverHolder);
                }
                throw th;
            }
        }
    }

    public final void dispatchSideEffects() {
        if (this.sideEffects.getSize() != 0) {
            Object beginSection = Trace.INSTANCE.beginSection("Compose:sideeffects");
            try {
                MutableVector mutableVector = this.sideEffects;
                Object[] objArr = mutableVector.content;
                int size = mutableVector.getSize();
                for (int i = 0; i < size; i++) {
                    ((Function0) objArr[i]).mo4828invoke();
                }
                this.sideEffects.clear();
                Unit unit = Unit.INSTANCE;
                Trace.INSTANCE.endSection(beginSection);
            } catch (Throwable th) {
                Trace.INSTANCE.endSection(beginSection);
                throw th;
            }
        }
    }

    public final void dispatchAbandons() {
        Set set = this.abandoning;
        if (set == null || set.isEmpty()) {
            return;
        }
        Object beginSection = Trace.INSTANCE.beginSection("Compose:abandons");
        try {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                RememberObserver rememberObserver = (RememberObserver) it.next();
                it.remove();
                rememberObserver.onAbandoned();
            }
            Unit unit = Unit.INSTANCE;
            Trace.INSTANCE.endSection(beginSection);
        } catch (Throwable th) {
            Trace.INSTANCE.endSection(beginSection);
            throw th;
        }
    }

    private final void recordLeaving(Object instance) {
        this.leaving.add(instance);
    }

    private static final boolean forgetting$removeFrom(RememberObserverHolder rememberObserverHolder, MutableVector mutableVector) {
        Object[] objArr = mutableVector.content;
        int size = mutableVector.getSize();
        for (int i = 0; i < size; i++) {
            RememberObserver wrapped = ((RememberObserverHolder) objArr[i]).getWrapped();
            if (wrapped instanceof PausedCompositionRemembers) {
                MutableVector pausedRemembers = ((PausedCompositionRemembers) wrapped).getPausedRemembers();
                if (pausedRemembers.remove(rememberObserverHolder) || forgetting$removeFrom(rememberObserverHolder, pausedRemembers)) {
                    return true;
                }
            }
        }
        return false;
    }
}
