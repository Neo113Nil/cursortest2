package org.koin.viewmodel;

import android.os.Bundle;
import androidx.core.os.BundleKt;
import androidx.lifecycle.SavedStateHandleSupport;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.MutableCreationExtras;
import androidx.savedstate.SavedStateReader;
import androidx.savedstate.SavedStateRegistryOwner;
import androidx.savedstate.SavedStateWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BundleExt.kt */
@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001a\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00060\u0002j\u0002`\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0007\u001a\u0014\u0010\u0006\u001a\u0010\u0012\b\u0012\u00060\u0002j\u0002`\u00030\u0007j\u0002`\b*\u001a\u0010\t\"\b\u0012\u0004\u0012\u0002`\u00030\u00072\f\u0012\b\u0012\u00060\u0002j\u0002`\u00030\u0007¨\u0006\n"}, d2 = {"toExtras", "Landroidx/lifecycle/viewmodel/CreationExtras;", "Landroid/os/Bundle;", "Landroidx/savedstate/SavedState;", "viewModelStoreOwner", "Landroidx/lifecycle/ViewModelStoreOwner;", "emptyState", "Lkotlin/Function0;", "Lorg/koin/viewmodel/SavedStateDefinition;", "SavedStateDefinition", "koin-core-viewmodel_release"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes.dex */
public final class BundleExtKt {
    public static final Function0<Bundle> emptyState() {
        return new Function0() { // from class: org.koin.viewmodel.BundleExtKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Bundle emptyState$lambda$0;
                emptyState$lambda$0 = BundleExtKt.emptyState$lambda$0();
                return emptyState$lambda$0;
            }
        };
    }

    public static final CreationExtras toExtras(Bundle bundle, ViewModelStoreOwner viewModelStoreOwner) {
        Object m9577constructorimpl;
        Intrinsics.checkNotNullParameter(bundle, "<this>");
        Intrinsics.checkNotNullParameter(viewModelStoreOwner, "viewModelStoreOwner");
        if (SavedStateReader.m8978isEmptyimpl(SavedStateReader.m8900constructorimpl(bundle))) {
            return null;
        }
        try {
            Result.Companion companion = Result.INSTANCE;
            MutableCreationExtras mutableCreationExtras = new MutableCreationExtras(null, 1, null);
            mutableCreationExtras.set(SavedStateHandleSupport.DEFAULT_ARGS_KEY, bundle);
            mutableCreationExtras.set(SavedStateHandleSupport.VIEW_MODEL_STORE_OWNER_KEY, viewModelStoreOwner);
            mutableCreationExtras.set(SavedStateHandleSupport.SAVED_STATE_REGISTRY_OWNER_KEY, (SavedStateRegistryOwner) viewModelStoreOwner);
            m9577constructorimpl = Result.m9577constructorimpl(mutableCreationExtras);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m9577constructorimpl = Result.m9577constructorimpl(ResultKt.createFailure(th));
        }
        return (CreationExtras) (Result.m9583isFailureimpl(m9577constructorimpl) ? null : m9577constructorimpl);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Bundle emptyState$lambda$0() {
        Pair[] pairArr;
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
        SavedStateWriter.m8986constructorimpl(bundleOf);
        return bundleOf;
    }
}
