package androidx.lifecycle;

import android.os.Bundle;
import androidx.lifecycle.internal.SavedStateHandleImpl;
import androidx.os.SavedStateReader;
import androidx.os.SavedStateRegistry;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SavedStateHandle.android.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u001a2\u00020\u0001:\u0002\u001b\u001aB\u001f\b\u0017\u0012\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006B\t\b\u0017¢\u0006\u0004\b\u0005\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\t\u0010\nJ \u0010\r\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u000b2\u0006\u0010\f\u001a\u00020\u0003H\u0087\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\bH\u0007¢\u0006\u0004\b\u0011\u0010\u0012R$\u0010\u0015\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00140\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0018\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001c"}, d2 = {"Landroidx/lifecycle/SavedStateHandle;", "", "", "", "initialState", "<init>", "(Ljava/util/Map;)V", "()V", "Landroidx/savedstate/SavedStateRegistry$SavedStateProvider;", "savedStateProvider", "()Landroidx/savedstate/SavedStateRegistry$SavedStateProvider;", "T", "key", "get", "(Ljava/lang/String;)Ljava/lang/Object;", IronSourceConstants.EVENTS_PROVIDER, "", "setSavedStateProvider", "(Ljava/lang/String;Landroidx/savedstate/SavedStateRegistry$SavedStateProvider;)V", "", "Landroidx/lifecycle/SavedStateHandle$SavingStateLiveData;", "liveDatas", "Ljava/util/Map;", "Landroidx/lifecycle/internal/SavedStateHandleImpl;", "impl", "Landroidx/lifecycle/internal/SavedStateHandleImpl;", "Companion", "SavingStateLiveData", "lifecycle-viewmodel-savedstate"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class SavedStateHandle {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private SavedStateHandleImpl impl;
    private final Map liveDatas;

    public SavedStateHandle(Map initialState) {
        Intrinsics.checkNotNullParameter(initialState, "initialState");
        this.liveDatas = new LinkedHashMap();
        this.impl = new SavedStateHandleImpl(initialState);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SavedStateHandle() {
        this.liveDatas = new LinkedHashMap();
        this.impl = new SavedStateHandleImpl(null, 1, 0 == true ? 1 : 0);
    }

    public final SavedStateRegistry.SavedStateProvider savedStateProvider() {
        return this.impl.getSavedStateProvider();
    }

    public final Object get(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this.impl.get(key);
    }

    public final void setSavedStateProvider(String key, SavedStateRegistry.SavedStateProvider provider) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(provider, "provider");
        this.impl.setSavedStateProvider(key, provider);
    }

    /* compiled from: SavedStateHandle.android.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\b\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0018\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Landroidx/lifecycle/SavedStateHandle$SavingStateLiveData;", "T", "Landroidx/lifecycle/MutableLiveData;", "value", "", "setValue", "(Ljava/lang/Object;)V", "", "key", "Ljava/lang/String;", "Landroidx/lifecycle/SavedStateHandle;", "handle", "Landroidx/lifecycle/SavedStateHandle;", "lifecycle-viewmodel-savedstate"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class SavingStateLiveData<T> extends MutableLiveData<T> {
        private SavedStateHandle handle;
        private String key;

        @Override // androidx.lifecycle.MutableLiveData, androidx.lifecycle.LiveData
        public void setValue(Object value) {
            SavedStateHandleImpl savedStateHandleImpl;
            SavedStateHandle savedStateHandle = this.handle;
            if (savedStateHandle != null && (savedStateHandleImpl = savedStateHandle.impl) != null) {
                savedStateHandleImpl.set(this.key, value);
            }
            super.setValue(value);
        }
    }

    /* compiled from: SavedStateHandle.android.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\t\u001a\u00020\b2\u000e\u0010\u0006\u001a\n\u0018\u00010\u0004j\u0004\u0018\u0001`\u00052\u000e\u0010\u0007\u001a\n\u0018\u00010\u0004j\u0004\u0018\u0001`\u0005H\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Landroidx/lifecycle/SavedStateHandle$Companion;", "", "<init>", "()V", "Landroid/os/Bundle;", "Landroidx/savedstate/SavedState;", "restoredState", "defaultState", "Landroidx/lifecycle/SavedStateHandle;", "createHandle", "(Landroid/os/Bundle;Landroid/os/Bundle;)Landroidx/lifecycle/SavedStateHandle;", "lifecycle-viewmodel-savedstate"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final SavedStateHandle createHandle(Bundle restoredState, Bundle defaultState) {
            if (restoredState == null) {
                restoredState = defaultState;
            }
            if (restoredState == null) {
                return new SavedStateHandle();
            }
            ClassLoader classLoader = SavedStateHandle.class.getClassLoader();
            Intrinsics.checkNotNull(classLoader);
            restoredState.setClassLoader(classLoader);
            return new SavedStateHandle(SavedStateReader.m2840toMapimpl(SavedStateReader.m2801constructorimpl(restoredState)));
        }
    }
}
