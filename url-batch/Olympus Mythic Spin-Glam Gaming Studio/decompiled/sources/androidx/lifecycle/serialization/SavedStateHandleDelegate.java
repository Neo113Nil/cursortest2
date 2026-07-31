package androidx.lifecycle.serialization;

import android.os.Bundle;
import androidx.core.os.BundleKt;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.internal.CanonicalName_jvmKt;
import androidx.os.SavedStateRegistry;
import androidx.os.SavedStateWriter;
import androidx.os.serialization.SavedStateConfiguration;
import androidx.os.serialization.SavedStateDecoderKt;
import androidx.os.serialization.SavedStateEncoderKt;
import com.safedk.android.utils.j;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;
import kotlinx.serialization.KSerializer;

/* compiled from: SavedStateHandleDelegate.kt */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0004\u0012\u00028\u00000\u00022\u00020\u0004:\u0001(J\u0019\u0010\u0007\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0007\u0010\bJ%\u0010\f\u001a\u00020\u00052\b\u0010\t\u001a\u0004\u0018\u00010\u00032\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\nH\u0002¢\u0006\u0004\b\f\u0010\rJ&\u0010\u000e\u001a\u00028\u00002\b\u0010\t\u001a\u0004\u0018\u00010\u00032\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\nH\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ.\u0010\u0012\u001a\u00020\u00112\b\u0010\t\u001a\u0004\u0018\u00010\u00032\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\n2\u0006\u0010\u0010\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0013\u0010\u0016\u001a\u00060\u0014j\u0002`\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010\u001e\u001a\u0004\u0018\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010!\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u001a\u0010$\u001a\b\u0012\u0004\u0012\u00028\u00000#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0018\u0010&\u001a\u0004\u0018\u00010\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'¨\u0006)"}, d2 = {"Landroidx/lifecycle/serialization/SavedStateHandleDelegate;", "T", "Lkotlin/properties/ReadWriteProperty;", "", "Landroidx/savedstate/SavedStateRegistry$SavedStateProvider;", "", "qualifiedKey", "loadInitialValue", "(Ljava/lang/String;)Ljava/lang/Object;", "thisRef", "Lkotlin/reflect/KProperty;", "property", "getQualifiedKey", "(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/String;", "getValue", "(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;", "value", "", "setValue", "(Ljava/lang/Object;Lkotlin/reflect/KProperty;Ljava/lang/Object;)V", "Landroid/os/Bundle;", "Landroidx/savedstate/SavedState;", "saveState", "()Landroid/os/Bundle;", "Landroidx/lifecycle/SavedStateHandle;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "Lkotlinx/serialization/KSerializer;", "serializer", "Lkotlinx/serialization/KSerializer;", "key", "Ljava/lang/String;", "Landroidx/savedstate/serialization/SavedStateConfiguration;", j.c, "Landroidx/savedstate/serialization/SavedStateConfiguration;", "Lkotlin/Function0;", "init", "Lkotlin/jvm/functions/Function0;", "cachedValue", "Ljava/lang/Object;", "UNINITIALIZED", "lifecycle-viewmodel-savedstate"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
final class SavedStateHandleDelegate<T> implements ReadWriteProperty, SavedStateRegistry.SavedStateProvider {
    private Object cachedValue;
    private final SavedStateConfiguration configuration;
    private final Function0 init;
    private final String key;
    private final SavedStateHandle savedStateHandle;
    private final KSerializer serializer;

    /* compiled from: SavedStateHandleDelegate.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/lifecycle/serialization/SavedStateHandleDelegate$UNINITIALIZED;", "", "<init>", "()V", "lifecycle-viewmodel-savedstate"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class UNINITIALIZED {
        public static final UNINITIALIZED INSTANCE = new UNINITIALIZED();

        private UNINITIALIZED() {
        }
    }

    @Override // kotlin.properties.ReadWriteProperty, kotlin.properties.ReadOnlyProperty
    public Object getValue(Object thisRef, KProperty property) {
        Intrinsics.checkNotNullParameter(property, "property");
        if (Intrinsics.areEqual(this.cachedValue, UNINITIALIZED.INSTANCE)) {
            String qualifiedKey = getQualifiedKey(thisRef, property);
            this.savedStateHandle.setSavedStateProvider(qualifiedKey, this);
            this.cachedValue = loadInitialValue(qualifiedKey);
        }
        return this.cachedValue;
    }

    @Override // kotlin.properties.ReadWriteProperty
    public void setValue(Object thisRef, KProperty property, Object value) {
        Intrinsics.checkNotNullParameter(property, "property");
        if (Intrinsics.areEqual(this.cachedValue, UNINITIALIZED.INSTANCE)) {
            this.savedStateHandle.setSavedStateProvider(getQualifiedKey(thisRef, property), this);
        }
        this.cachedValue = value;
    }

    @Override // androidx.savedstate.SavedStateRegistry.SavedStateProvider
    public Bundle saveState() {
        Pair[] pairArr;
        if (Intrinsics.areEqual(this.cachedValue, UNINITIALIZED.INSTANCE)) {
            Map emptyMap = MapsKt.emptyMap();
            if (emptyMap.isEmpty()) {
                pairArr = new Pair[0];
            } else {
                ArrayList arrayList = new ArrayList(emptyMap.size());
                for (Map.Entry entry : emptyMap.entrySet()) {
                    arrayList.add(TuplesKt.to((String) entry.getKey(), entry.getValue()));
                }
                pairArr = (Pair[]) arrayList.toArray(new Pair[0]);
            }
            Bundle bundleOf = BundleKt.bundleOf((Pair[]) Arrays.copyOf(pairArr, pairArr.length));
            SavedStateWriter.m2843constructorimpl(bundleOf);
            return bundleOf;
        }
        return SavedStateEncoderKt.encodeToSavedStateNullable(this.serializer, this.cachedValue, this.configuration);
    }

    private final Object loadInitialValue(String qualifiedKey) {
        Bundle bundle = (Bundle) this.savedStateHandle.get(qualifiedKey);
        if (bundle == null) {
            return this.init.mo4828invoke();
        }
        KSerializer kSerializer = this.serializer;
        Intrinsics.checkNotNull(kSerializer, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<{T of androidx.lifecycle.serialization.SavedStateHandleDelegate & Any}>");
        return SavedStateDecoderKt.decodeFromSavedStateNullable(kSerializer, bundle, this.configuration);
    }

    private final String getQualifiedKey(Object thisRef, KProperty property) {
        String str;
        String str2 = this.key;
        if (str2 != null) {
            return str2;
        }
        if (thisRef != null) {
            str = CanonicalName_jvmKt.getCanonicalName(Reflection.getOrCreateKotlinClass(thisRef.getClass())) + '.';
        } else {
            str = "";
        }
        return str + property.getName();
    }
}
