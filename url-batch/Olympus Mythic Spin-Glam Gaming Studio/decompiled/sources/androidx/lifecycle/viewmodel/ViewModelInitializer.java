package androidx.lifecycle.viewmodel;

import androidx.lifecycle.ViewModel;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.KClass;

/* compiled from: InitializerViewModelFactory.android.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003R \u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR&\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00028\u00000\t8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Landroidx/lifecycle/viewmodel/ViewModelInitializer;", "Landroidx/lifecycle/ViewModel;", "T", "", "Lkotlin/reflect/KClass;", "clazz", "Lkotlin/reflect/KClass;", "getClazz$lifecycle_viewmodel", "()Lkotlin/reflect/KClass;", "Lkotlin/Function1;", "Landroidx/lifecycle/viewmodel/CreationExtras;", "initializer", "Lkotlin/jvm/functions/Function1;", "getInitializer$lifecycle_viewmodel", "()Lkotlin/jvm/functions/Function1;", "lifecycle-viewmodel"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ViewModelInitializer<T extends ViewModel> {
    private final KClass clazz;
    private final Function1 initializer;

    /* renamed from: getClazz$lifecycle_viewmodel, reason: from getter */
    public final KClass getClazz() {
        return this.clazz;
    }

    /* renamed from: getInitializer$lifecycle_viewmodel, reason: from getter */
    public final Function1 getInitializer() {
        return this.initializer;
    }
}
