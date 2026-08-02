package papa.internal;

import android.view.View;
import android.view.ViewTreeObserver;
import app.cash.broadway.presenter.SavedState;
import app.cash.broadway.screen.Screen;
import com.squareup.cash.backstack.api.BackStack$ScreenEntry;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.core.navigationcontainer.navigator.Navigation;
import java.lang.ref.WeakReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.Ref$ObjectRef;

/* loaded from: classes3.dex */
public final /* synthetic */ class ViewTreeObservers$$ExternalSyntheticLambda2 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;
    public final /* synthetic */ Object f$2;
    public final /* synthetic */ Object f$3;
    public final /* synthetic */ Ref$ObjectRef f$4;

    public /* synthetic */ ViewTreeObservers$$ExternalSyntheticLambda2(Object obj, Object obj2, Object obj3, Object obj4, Ref$ObjectRef ref$ObjectRef, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = obj3;
        this.f$3 = obj4;
        this.f$4 = ref$ObjectRef;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        SavedState savedState;
        int i = this.$r8$classId;
        Ref$ObjectRef ref$ObjectRef = this.f$4;
        Object obj = this.f$3;
        Object obj2 = this.f$2;
        Object obj3 = this.f$1;
        Object obj4 = this.f$0;
        switch (i) {
            case 0:
                Ref$BooleanRef ref$BooleanRef = (Ref$BooleanRef) obj4;
                WeakReference weakReference = (WeakReference) obj3;
                Function0 function0 = (Function0) obj2;
                OnPreDrawListenerWrapper onPreDrawListenerWrapper = (OnPreDrawListenerWrapper) obj;
                if (ref$BooleanRef.element) {
                    return Unit.INSTANCE;
                }
                ref$BooleanRef.element = true;
                View view = (View) weakReference.get();
                if (view != null) {
                    weakReference.clear();
                    ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
                    if (viewTreeObserver.isAlive()) {
                        Object obj5 = ref$ObjectRef.element;
                        if (obj5 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("listener");
                            throw null;
                        }
                        switch (onPreDrawListenerWrapper.$r8$classId) {
                            case 0:
                                ViewTreeObserver.OnPreDrawListener onPreDrawListener = (ViewTreeObserver.OnPreDrawListener) obj5;
                                onPreDrawListener.getClass();
                                viewTreeObserver.removeOnPreDrawListener(onPreDrawListener);
                                break;
                            default:
                                ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = (ViewTreeObserver.OnGlobalLayoutListener) obj5;
                                onGlobalLayoutListener.getClass();
                                viewTreeObserver.removeOnGlobalLayoutListener(onGlobalLayoutListener);
                                break;
                        }
                    }
                }
                function0.invoke();
                return Unit.INSTANCE;
            default:
                BetterNavigator betterNavigator = (BetterNavigator) obj4;
                Screen screen = (Screen) obj3;
                String str = (String) obj2;
                Navigation.ScreenNavigation screenNavigation = (Navigation.ScreenNavigation) obj;
                Navigation.ScreenNavigation.Restore restore = screenNavigation instanceof Navigation.ScreenNavigation.Restore ? (Navigation.ScreenNavigation.Restore) screenNavigation : null;
                if ((restore == null || (savedState = restore.savedState) == null) && (savedState = (SavedState) betterNavigator.pausedStates.remove(str)) == null && (savedState = (SavedState) betterNavigator.tabPresenterStates.get(str)) == null) {
                    BackStack$ScreenEntry backStack$ScreenEntry = (BackStack$ScreenEntry) ref$ObjectRef.element;
                    savedState = backStack$ScreenEntry != null ? backStack$ScreenEntry.presenterState : null;
                }
                return betterNavigator.startPresenter(screen, str, null, savedState);
        }
    }
}
