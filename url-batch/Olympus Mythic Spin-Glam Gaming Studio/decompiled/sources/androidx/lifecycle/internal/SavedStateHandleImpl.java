package androidx.lifecycle.internal;

import android.os.Bundle;
import androidx.core.os.BundleKt;
import androidx.os.SavedStateRegistry;
import androidx.os.SavedStateWriter;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.MutableStateFlow;

/* compiled from: SavedStateHandleImpl.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0016\b\u0002\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\t\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00072\u0006\u0010\b\u001a\u00020\u0003H\u0087\u0002¢\u0006\u0004\b\t\u0010\nJ(\u0010\r\u001a\u00020\f\"\u0004\b\u0000\u0010\u00072\u0006\u0010\b\u001a\u00020\u00032\b\u0010\u000b\u001a\u0004\u0018\u00018\u0000H\u0087\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u000f\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00072\u0006\u0010\b\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u000f\u0010\nJ\u001f\u0010\u0012\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0010H\u0007¢\u0006\u0004\b\u0012\u0010\u0013R%\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R \u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00100\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0016R(\u0010\u001b\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u001a0\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0016R+\u0010\u001c\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u001a0\u00148\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0016\u001a\u0004\b\u001d\u0010\u0018R\u0017\u0010\u001e\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!¨\u0006\""}, d2 = {"Landroidx/lifecycle/internal/SavedStateHandleImpl;", "", "", "", "initialState", "<init>", "(Ljava/util/Map;)V", "T", "key", "get", "(Ljava/lang/String;)Ljava/lang/Object;", "value", "", "set", "(Ljava/lang/String;Ljava/lang/Object;)V", "remove", "Landroidx/savedstate/SavedStateRegistry$SavedStateProvider;", IronSourceConstants.EVENTS_PROVIDER, "setSavedStateProvider", "(Ljava/lang/String;Landroidx/savedstate/SavedStateRegistry$SavedStateProvider;)V", "", "regular", "Ljava/util/Map;", "getRegular", "()Ljava/util/Map;", "providers", "Lkotlinx/coroutines/flow/MutableStateFlow;", "flows", "mutableFlows", "getMutableFlows", "savedStateProvider", "Landroidx/savedstate/SavedStateRegistry$SavedStateProvider;", "getSavedStateProvider", "()Landroidx/savedstate/SavedStateRegistry$SavedStateProvider;", "lifecycle-viewmodel-savedstate"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class SavedStateHandleImpl {
    private final Map flows;
    private final Map mutableFlows;
    private final Map providers;
    private final Map regular;
    private final SavedStateRegistry.SavedStateProvider savedStateProvider;

    public SavedStateHandleImpl(Map initialState) {
        Intrinsics.checkNotNullParameter(initialState, "initialState");
        this.regular = MapsKt.toMutableMap(initialState);
        this.providers = new LinkedHashMap();
        this.flows = new LinkedHashMap();
        this.mutableFlows = new LinkedHashMap();
        this.savedStateProvider = new SavedStateRegistry.SavedStateProvider() { // from class: androidx.lifecycle.internal.SavedStateHandleImpl$$ExternalSyntheticLambda0
            @Override // androidx.savedstate.SavedStateRegistry.SavedStateProvider
            public final Bundle saveState() {
                Bundle savedStateProvider$lambda$0;
                savedStateProvider$lambda$0 = SavedStateHandleImpl.savedStateProvider$lambda$0(SavedStateHandleImpl.this);
                return savedStateProvider$lambda$0;
            }
        };
    }

    public /* synthetic */ SavedStateHandleImpl(Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? MapsKt.emptyMap() : map);
    }

    public final SavedStateRegistry.SavedStateProvider getSavedStateProvider() {
        return this.savedStateProvider;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Bundle savedStateProvider$lambda$0(SavedStateHandleImpl savedStateHandleImpl) {
        Pair[] pairArr;
        for (Map.Entry entry : MapsKt.toMap(savedStateHandleImpl.mutableFlows).entrySet()) {
            savedStateHandleImpl.set((String) entry.getKey(), ((MutableStateFlow) entry.getValue()).getValue());
        }
        for (Map.Entry entry2 : MapsKt.toMap(savedStateHandleImpl.providers).entrySet()) {
            savedStateHandleImpl.set((String) entry2.getKey(), ((SavedStateRegistry.SavedStateProvider) entry2.getValue()).saveState());
        }
        Map map = savedStateHandleImpl.regular;
        if (map.isEmpty()) {
            pairArr = new Pair[0];
        } else {
            ArrayList arrayList = new ArrayList(map.size());
            for (Map.Entry entry3 : map.entrySet()) {
                arrayList.add(TuplesKt.to((String) entry3.getKey(), entry3.getValue()));
            }
            pairArr = (Pair[]) arrayList.toArray(new Pair[0]);
        }
        Bundle bundleOf = BundleKt.bundleOf((Pair[]) Arrays.copyOf(pairArr, pairArr.length));
        SavedStateWriter.m2843constructorimpl(bundleOf);
        return bundleOf;
    }

    public final Object get(String key) {
        Object value;
        Intrinsics.checkNotNullParameter(key, "key");
        try {
            MutableStateFlow mutableStateFlow = (MutableStateFlow) this.mutableFlows.get(key);
            return (mutableStateFlow == null || (value = mutableStateFlow.getValue()) == null) ? this.regular.get(key) : value;
        } catch (ClassCastException unused) {
            remove(key);
            return null;
        }
    }

    public final void set(String key, Object value) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.regular.put(key, value);
        MutableStateFlow mutableStateFlow = (MutableStateFlow) this.flows.get(key);
        if (mutableStateFlow != null) {
            mutableStateFlow.setValue(value);
        }
        MutableStateFlow mutableStateFlow2 = (MutableStateFlow) this.mutableFlows.get(key);
        if (mutableStateFlow2 != null) {
            mutableStateFlow2.setValue(value);
        }
    }

    public final Object remove(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        Object remove = this.regular.remove(key);
        this.flows.remove(key);
        this.mutableFlows.remove(key);
        return remove;
    }

    public final void setSavedStateProvider(String key, SavedStateRegistry.SavedStateProvider provider) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(provider, "provider");
        this.providers.put(key, provider);
    }
}
