package androidx.activity;

import android.os.Build;
import android.view.View;
import android.view.Window;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.lifecycle.EnumC0246m;
import androidx.lifecycle.InterfaceC0252t;
import androidx.lifecycle.InterfaceC0253u;
import androidx.lifecycle.S;
import com.onesignal.core.activities.PermissionsActivity;
import com.onesignal.inAppMessages.internal.display.impl.a;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public final class f implements InterfaceC0252t {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f3193f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ l f3194g;

    public /* synthetic */ f(l lVar, int i7) {
        this.f3193f = i7;
        this.f3194g = lVar;
    }

    @Override // androidx.lifecycle.InterfaceC0252t
    public final void a(InterfaceC0253u interfaceC0253u, EnumC0246m enumC0246m) {
        s sVar;
        switch (this.f3193f) {
            case 0:
                if (enumC0246m == EnumC0246m.ON_DESTROY) {
                    ((PermissionsActivity) this.f3194g).mContextAwareHelper.f3936b = null;
                    if (!((PermissionsActivity) this.f3194g).isChangingConfigurations()) {
                        LinkedHashMap linkedHashMap = ((PermissionsActivity) this.f3194g).getViewModelStore().f3498a;
                        Iterator it = linkedHashMap.values().iterator();
                        while (it.hasNext()) {
                            ((S) it.next()).clear();
                        }
                        linkedHashMap.clear();
                    }
                    k kVar = (k) ((PermissionsActivity) this.f3194g).mReportFullyDrawnExecutor;
                    PermissionsActivity permissionsActivity = kVar.f3201i;
                    permissionsActivity.getWindow().getDecorView().removeCallbacks(kVar);
                    permissionsActivity.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(kVar);
                    break;
                }
                break;
            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                if (enumC0246m == EnumC0246m.ON_STOP) {
                    Window window = ((PermissionsActivity) this.f3194g).getWindow();
                    View peekDecorView = window != null ? window.peekDecorView() : null;
                    if (peekDecorView != null) {
                        peekDecorView.cancelPendingInputEvents();
                        break;
                    }
                }
                break;
            case com.onesignal.core.internal.permissions.h.ONESIGNAL_PERMISSION_REQUEST_CODE /* 2 */:
                PermissionsActivity permissionsActivity2 = (PermissionsActivity) this.f3194g;
                permissionsActivity2.ensureViewModelStore();
                permissionsActivity2.getLifecycle().b(this);
                break;
            default:
                if (enumC0246m == EnumC0246m.ON_CREATE && Build.VERSION.SDK_INT >= 33) {
                    sVar = this.f3194g.mOnBackPressedDispatcher;
                    OnBackInvokedDispatcher invoker = h.a((l) interfaceC0253u);
                    sVar.getClass();
                    kotlin.jvm.internal.i.e(invoker, "invoker");
                    sVar.f3219e = invoker;
                    p pVar = p.f3209a;
                    OnBackInvokedDispatcher onBackInvokedDispatcher = sVar.f3219e;
                    OnBackInvokedCallback onBackInvokedCallback = sVar.f3218d;
                    if (onBackInvokedDispatcher != null && onBackInvokedCallback != null && sVar.f3220f) {
                        pVar.c(onBackInvokedDispatcher, onBackInvokedCallback);
                        sVar.f3220f = false;
                        break;
                    }
                }
                break;
        }
    }
}
