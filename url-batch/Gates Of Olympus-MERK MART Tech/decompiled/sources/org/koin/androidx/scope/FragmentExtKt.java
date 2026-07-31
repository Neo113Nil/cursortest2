package org.koin.androidx.scope;

import androidx.core.view.KeyEventDispatcher;
import androidx.exifinterface.media.ExifInterface;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import org.koin.android.ext.android.ComponentCallbackExtKt;
import org.koin.android.scope.AndroidScopeComponent;
import org.koin.core.component.KoinScopeComponentKt;
import org.koin.core.scope.Scope;

/* compiled from: FragmentExt.kt */
@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u001a\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u0006*\u00020\u00022\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u001a\f\u0010\u0007\u001a\u0004\u0018\u00010\u0001*\u00020\u0002\u001a\u001e\u0010\f\u001a\u0002H\r\"\n\b\u0000\u0010\r\u0018\u0001*\u00020\t*\u00020\u0002H\u0086\b¢\u0006\u0002\u0010\u000b\"\u0017\u0010\b\u001a\u0004\u0018\u00010\t*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"createFragmentScope", "Lorg/koin/core/scope/Scope;", "Landroidx/fragment/app/Fragment;", "useParentActivityScope", "", "fragmentScope", "Lkotlin/Lazy;", "getScopeOrNull", "scopeActivity", "Lorg/koin/androidx/scope/ScopeActivity;", "getScopeActivity", "(Landroidx/fragment/app/Fragment;)Lorg/koin/androidx/scope/ScopeActivity;", "requireScopeActivity", ExifInterface.GPS_DIRECTION_TRUE, "koin-android_release"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes.dex */
public final class FragmentExtKt {
    public static /* synthetic */ Scope createFragmentScope$default(Fragment fragment, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        return createFragmentScope(fragment, z);
    }

    public static final Scope createFragmentScope(Fragment fragment, boolean z) {
        Intrinsics.checkNotNullParameter(fragment, "<this>");
        if (!(fragment instanceof AndroidScopeComponent)) {
            throw new IllegalStateException("Fragment should implement AndroidScopeComponent".toString());
        }
        Fragment fragment2 = fragment;
        Scope scopeOrNull = ComponentCallbackExtKt.getKoin(fragment2).getScopeOrNull(KoinScopeComponentKt.getScopeId(fragment));
        if (scopeOrNull == null) {
            scopeOrNull = ComponentActivityExtKt.createScopeForCurrentLifecycle(fragment2, fragment, AndroidScopeArchetypesKt.getFragmentScopeArchetype());
        }
        if (z) {
            KeyEventDispatcher.Component activity = fragment.getActivity();
            AndroidScopeComponent androidScopeComponent = activity instanceof AndroidScopeComponent ? (AndroidScopeComponent) activity : null;
            Scope scope = androidScopeComponent != null ? androidScopeComponent.getScope() : null;
            if (scope != null) {
                scopeOrNull.getLogger().debug("Link to parent activity scope: '" + scope.getId() + '\'');
                scopeOrNull.linkTo(scope);
                return scopeOrNull;
            }
            scopeOrNull.getLogger().debug("Fragment '" + fragment + "' can't be linked to parent activity scope. No Parent Activity Scope found.");
        }
        return scopeOrNull;
    }

    public static final Lazy<Scope> fragmentScope(final Fragment fragment, final boolean z) {
        Intrinsics.checkNotNullParameter(fragment, "<this>");
        return LazyKt.lazy(new Function0() { // from class: org.koin.androidx.scope.FragmentExtKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Scope createFragmentScope;
                createFragmentScope = FragmentExtKt.createFragmentScope(Fragment.this, z);
                return createFragmentScope;
            }
        });
    }

    public static /* synthetic */ Lazy fragmentScope$default(Fragment fragment, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        return fragmentScope(fragment, z);
    }

    public static final Scope getScopeOrNull(Fragment fragment) {
        Intrinsics.checkNotNullParameter(fragment, "<this>");
        return ComponentCallbackExtKt.getKoin(fragment).getScopeOrNull(KoinScopeComponentKt.getScopeId(fragment));
    }

    public static final ScopeActivity getScopeActivity(Fragment fragment) {
        Intrinsics.checkNotNullParameter(fragment, "<this>");
        FragmentActivity activity = fragment.getActivity();
        if (activity instanceof ScopeActivity) {
            return (ScopeActivity) activity;
        }
        return null;
    }

    public static final /* synthetic */ <T extends ScopeActivity> T requireScopeActivity(Fragment fragment) {
        Intrinsics.checkNotNullParameter(fragment, "<this>");
        FragmentActivity activity = fragment.getActivity();
        Intrinsics.reifiedOperationMarker(2, ExifInterface.GPS_DIRECTION_TRUE);
        T t = (T) activity;
        if (t != null) {
            return t;
        }
        StringBuilder sb = new StringBuilder("can't get ScopeActivity for class ");
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        throw new IllegalStateException(sb.append(Reflection.getOrCreateKotlinClass(ScopeActivity.class)).toString().toString());
    }
}
