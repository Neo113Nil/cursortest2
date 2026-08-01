package expo.modules.systemui.singletons;

import android.os.Build;
import android.util.Log;
import androidx.appcompat.app.AppCompatDelegate;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SystemUI.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JC\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\n2!\u0010\u000b\u001a\u001d\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\u00070\fH\u0002J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0005H\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lexpo/modules/systemui/singletons/SystemUI;", "", "<init>", "()V", "TAG", "", "setUserInterfaceStyle", "", "style", "successCallback", "Lkotlin/Function0;", "failureCallback", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "reason", "expo-system-ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SystemUI {
    public static final SystemUI INSTANCE = new SystemUI();
    private static final String TAG = "SystemUI";

    private SystemUI() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0030, code lost:
    
        if (r4.equals("light") == false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x005f, code lost:
    
        r0 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0044, code lost:
    
        if (r4.equals("") == false) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void setUserInterfaceStyle(String style, Function0<Unit> successCallback, Function1<? super String, Unit> failureCallback) {
        int i = -1;
        if (style != null) {
            int hashCode = style.hashCode();
            if (hashCode != 0) {
                if (hashCode != 3075958) {
                    if (hashCode != 102970646) {
                        if (hashCode == 1673671211 && style.equals("automatic")) {
                            if (Build.VERSION.SDK_INT < 28) {
                                i = 3;
                            }
                        }
                    }
                    failureCallback.invoke("Invalid user interface style: \"" + style + "\"");
                    return;
                }
                if (style.equals("dark")) {
                    i = 2;
                }
                failureCallback.invoke("Invalid user interface style: \"" + style + "\"");
                return;
            }
        }
        AppCompatDelegate.setDefaultNightMode(i);
        successCallback.invoke();
    }

    @JvmStatic
    public static final void setUserInterfaceStyle(String style) {
        Intrinsics.checkNotNullParameter(style, "style");
        INSTANCE.setUserInterfaceStyle(style, new Function0() { // from class: expo.modules.systemui.singletons.SystemUI$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit unit;
                unit = Unit.INSTANCE;
                return unit;
            }
        }, new Function1() { // from class: expo.modules.systemui.singletons.SystemUI$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit userInterfaceStyle$lambda$1;
                userInterfaceStyle$lambda$1 = SystemUI.setUserInterfaceStyle$lambda$1((String) obj);
                return userInterfaceStyle$lambda$1;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setUserInterfaceStyle$lambda$1(String m) {
        Intrinsics.checkNotNullParameter(m, "m");
        Log.e(TAG, m);
        return Unit.INSTANCE;
    }
}
