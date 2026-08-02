package com.withpersona.sdk2.inquiry.ui.uiStep;

import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes4.dex */
public final class UiStepFragment$special$$inlined$lazyViewModel$4 extends Lambda implements Function0 {
    public final /* synthetic */ Lazy $owner$delegate;
    public final /* synthetic */ int $r8$classId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ UiStepFragment$special$$inlined$lazyViewModel$4(Lazy lazy, int i) {
        super(0);
        this.$r8$classId = i;
        this.$owner$delegate = lazy;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory;
        int i = this.$r8$classId;
        Lazy lazy = this.$owner$delegate;
        switch (i) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                ViewModelStoreOwner viewModelStoreOwner = (ViewModelStoreOwner) lazy.getValue();
                hasDefaultViewModelProviderFactory = viewModelStoreOwner instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwner : null;
                if (hasDefaultViewModelProviderFactory == null) {
                    break;
                } else {
                    break;
                }
            case 3:
                break;
            case 4:
                ViewModelStoreOwner viewModelStoreOwner2 = (ViewModelStoreOwner) lazy.getValue();
                hasDefaultViewModelProviderFactory = viewModelStoreOwner2 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwner2 : null;
                if (hasDefaultViewModelProviderFactory == null) {
                    break;
                } else {
                    break;
                }
            case 5:
                break;
            case 6:
                ViewModelStoreOwner viewModelStoreOwner3 = (ViewModelStoreOwner) lazy.getValue();
                hasDefaultViewModelProviderFactory = viewModelStoreOwner3 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwner3 : null;
                if (hasDefaultViewModelProviderFactory == null) {
                    break;
                } else {
                    break;
                }
            case 7:
                break;
            case 8:
                ViewModelStoreOwner viewModelStoreOwner4 = (ViewModelStoreOwner) lazy.getValue();
                hasDefaultViewModelProviderFactory = viewModelStoreOwner4 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwner4 : null;
                if (hasDefaultViewModelProviderFactory == null) {
                    break;
                } else {
                    break;
                }
            case 9:
                ViewModelStoreOwner viewModelStoreOwner5 = (ViewModelStoreOwner) lazy.getValue();
                hasDefaultViewModelProviderFactory = viewModelStoreOwner5 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwner5 : null;
                if (hasDefaultViewModelProviderFactory == null) {
                    break;
                } else {
                    break;
                }
            case 10:
                break;
            case 11:
                ViewModelStoreOwner viewModelStoreOwner6 = (ViewModelStoreOwner) lazy.getValue();
                hasDefaultViewModelProviderFactory = viewModelStoreOwner6 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwner6 : null;
                if (hasDefaultViewModelProviderFactory == null) {
                    break;
                } else {
                    break;
                }
            case 12:
                break;
            case 13:
                break;
            case 14:
                ViewModelStoreOwner viewModelStoreOwner7 = (ViewModelStoreOwner) lazy.getValue();
                hasDefaultViewModelProviderFactory = viewModelStoreOwner7 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwner7 : null;
                if (hasDefaultViewModelProviderFactory == null) {
                    break;
                } else {
                    break;
                }
            case 15:
                break;
            case 16:
                ViewModelStoreOwner viewModelStoreOwner8 = (ViewModelStoreOwner) lazy.getValue();
                hasDefaultViewModelProviderFactory = viewModelStoreOwner8 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwner8 : null;
                if (hasDefaultViewModelProviderFactory == null) {
                    break;
                } else {
                    break;
                }
            default:
                ViewModelStoreOwner viewModelStoreOwner9 = (ViewModelStoreOwner) lazy.getValue();
                hasDefaultViewModelProviderFactory = viewModelStoreOwner9 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwner9 : null;
                if (hasDefaultViewModelProviderFactory == null) {
                    break;
                } else {
                    break;
                }
        }
        return CreationExtras.Empty.INSTANCE;
    }
}
