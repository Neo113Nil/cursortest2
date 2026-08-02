package papa;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.text.Regex;
import kotlin.text.RegexOption;
import kotlin.text.StringsKt;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
import okio.Buffer;
import papa.internal.Perfs;

/* loaded from: classes3.dex */
public final /* synthetic */ class Handlers$$ExternalSyntheticLambda1 implements Function0 {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ Handlers$$ExternalSyntheticLambda1(int i) {
        this.$r8$classId = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$r8$classId) {
            case 0:
                return new Handler(Looper.getMainLooper());
            case 1:
                return new Regex("/(bitcoin/partner)/(sell|transfer|buy)/([\\w-]+)(.*)?", RegexOption.IGNORE_CASE);
            case 2:
                return new Regex("(ethereum:|solana:)(.*)", RegexOption.IGNORE_CASE);
            case 3:
                return new Regex("(eip155:\\d+:)(0x[0-9a-fA-F]{40})", RegexOption.IGNORE_CASE);
            case 4:
                return new Regex("0x[0-9a-fA-F]{40}\\b");
            case 5:
                return new Regex("\\b[1-9A-HJ-NP-Za-km-z]{32,44}\\b");
            case 6:
                return new Regex("/(app|reward)/\\w+(/.*)?");
            case 7:
                return new Regex("/[$€£]\\w+(/|:|\\?|\\s|$)");
            case 8:
                return new Regex("cashtag=[$€£]\\w+(/|:|&|\\?|\\s|$)");
            case 9:
                return new Regex("token=WL_\\w+(/|:|&|\\?|\\s|$)");
            case 10:
                return new Buffer();
            case 11:
                try {
                    return Throwable.class.getMethod("addSuppressed", Throwable.class);
                } catch (Throwable unused) {
                    return null;
                }
            case 12:
                boolean z = false;
                if (MainThreadMessageSpy.enabled) {
                    Handlers.checkOnMainThread();
                    if (MainThreadMessageSpy.currentMessageAsString != null) {
                        Handlers.checkOnMainThread();
                        String str = MainThreadMessageSpy.currentMessageAsString;
                        str.getClass();
                        z = StringsKt.contains((CharSequence) str, (CharSequence) "android.view.Choreographer$FrameDisplayEventReceiver", false);
                    }
                }
                return Boolean.valueOf(z);
            case 13:
                ArrayList arrayList = Choreographers.pendingRenderedCallbacks;
                Duration.Companion companion = Duration.Companion;
                long duration = DurationKt.toDuration(System.nanoTime(), DurationUnit.NANOSECONDS);
                try {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        OnFrameRenderedListener onFrameRenderedListener = (OnFrameRenderedListener) it.next();
                        try {
                            onFrameRenderedListener.mo4370onFrameRenderedLRDsOJo(duration);
                        } catch (AbstractMethodError e) {
                            throw new RuntimeException("Lambda " + onFrameRenderedListener + " does not implement " + OnFrameRenderedListener.class + ", try declaring it with " + Reflection.factory.getOrCreateKotlinClass(OnFrameRenderedListener.class).getSimpleName() + " { }", e);
                        }
                    }
                    arrayList.clear();
                    return Unit.INSTANCE;
                } catch (Throwable th) {
                    arrayList.clear();
                    throw th;
                }
            default:
                AppStart$AppStartData appStart$AppStartData = Perfs.appStartData;
                if (appStart$AppStartData == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("appStartData");
                    throw null;
                }
                long uptimeMillis = SystemClock.uptimeMillis() - appStart$AppStartData.processStartUptimeMillis;
                AppStart$AppStartData appStart$AppStartData2 = Perfs.appStartData;
                if (appStart$AppStartData2 != null) {
                    Perfs.appStartData = AppStart$AppStartData.copy$default(appStart$AppStartData2, null, null, null, Long.valueOf(uptimeMillis), null, null, null, null, null, null, null, null, null, null, -524289);
                    return Unit.INSTANCE;
                }
                Intrinsics.throwUninitializedPropertyAccessException("appStartData");
                throw null;
        }
    }
}
