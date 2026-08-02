package papa.internal;

import androidx.camera.core.CameraSelector$$ExternalSyntheticOutline0;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import coil3.RealImageLoader;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.io.Closeable;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.MatchResult;
import kotlin.text.MatcherMatchResult;
import kotlinx.coroutines.CoroutineDispatcher;
import papa.AppStart$AppStartData;

/* loaded from: classes3.dex */
public final /* synthetic */ class Perfs$$ExternalSyntheticLambda4 implements Function1 {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ Perfs$$ExternalSyntheticLambda4(int i) {
        this.$r8$classId = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                Function1 function1 = (Function1) obj;
                function1.getClass();
                AppStart$AppStartData appStart$AppStartData = Perfs.appStartData;
                if (appStart$AppStartData != null) {
                    Perfs.appStartData = (AppStart$AppStartData) function1.invoke(appStart$AppStartData);
                    return Unit.INSTANCE;
                }
                Intrinsics.throwUninitializedPropertyAccessException("appStartData");
                throw null;
            case 1:
                ((MatchResult) obj).getClass();
                return "IPV6_REDACTED";
            case 2:
                ((MatchResult) obj).getClass();
                return "REDACTED";
            case 3:
                ((MatchResult) obj).getClass();
                return "REDACTED";
            case 4:
                ((MatchResult) obj).getClass();
                return "geo:REDACTED_ADDRESS";
            case 5:
                MatchResult matchResult = (MatchResult) obj;
                matchResult.getClass();
                MatchResult.Destructured destructured = matchResult.getDestructured();
                String str = (String) ((MatcherMatchResult) destructured.getMatch()).getGroupValues().get(1);
                String str2 = (String) ((MatcherMatchResult) destructured.getMatch()).getGroupValues().get(2);
                String str3 = (String) ((MatcherMatchResult) destructured.getMatch()).getGroupValues().get(4);
                StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("/", str, "/", str2, "/REDACTED");
                m.append(str3);
                return m.toString();
            case 6:
                MatchResult matchResult2 = (MatchResult) obj;
                matchResult2.getClass();
                return Recorder$$ExternalSyntheticOutline2.m$1((String) ((MatcherMatchResult) matchResult2.getDestructured().getMatch()).getGroupValues().get(1), "REDACTED_STABLECOIN_ADDRESS");
            case 7:
                MatchResult matchResult3 = (MatchResult) obj;
                matchResult3.getClass();
                return Recorder$$ExternalSyntheticOutline2.m$1((String) ((MatcherMatchResult) matchResult3.getDestructured().getMatch()).getGroupValues().get(1), "REDACTED_STABLECOIN_ADDRESS");
            case 8:
                ((MatchResult) obj).getClass();
                return "REDACTED_STABLECOIN_ADDRESS";
            case 9:
                ((MatchResult) obj).getClass();
                return "REDACTED_STABLECOIN_ADDRESS";
            case 10:
                MatchResult matchResult4 = (MatchResult) obj;
                matchResult4.getClass();
                MatchResult.Destructured destructured2 = matchResult4.getDestructured();
                return CameraSelector$$ExternalSyntheticOutline0.m("/", (String) ((MatcherMatchResult) destructured2.getMatch()).getGroupValues().get(1), "/REWARD_CODE", (String) ((MatcherMatchResult) destructured2.getMatch()).getGroupValues().get(2));
            case 11:
                MatchResult matchResult5 = (MatchResult) obj;
                matchResult5.getClass();
                return Recorder$$ExternalSyntheticOutline2.m("/$CASHTAG", (String) ((MatcherMatchResult) matchResult5.getDestructured().getMatch()).getGroupValues().get(1));
            case 12:
                MatchResult matchResult6 = (MatchResult) obj;
                matchResult6.getClass();
                return Recorder$$ExternalSyntheticOutline2.m("cashtag=$CASHTAG", (String) ((MatcherMatchResult) matchResult6.getDestructured().getMatch()).getGroupValues().get(1));
            case 13:
                MatchResult matchResult7 = (MatchResult) obj;
                matchResult7.getClass();
                return Recorder$$ExternalSyntheticOutline2.m("token=WL_REDACTED", (String) ((MatcherMatchResult) matchResult7.getDestructured().getMatch()).getGroupValues().get(1));
            case 14:
                RealImageLoader realImageLoader = (RealImageLoader) obj;
                realImageLoader.getClass();
                realImageLoader.shutdown();
                return Unit.INSTANCE;
            case 15:
                RealImageLoader realImageLoader2 = (RealImageLoader) obj;
                realImageLoader2.getClass();
                realImageLoader2.shutdown();
                return Unit.INSTANCE;
            case 16:
                Closeable closeable = (Closeable) obj;
                closeable.getClass();
                closeable.close();
                return Unit.INSTANCE;
            case 17:
                return Boolean.valueOf(obj == null);
            case 18:
                CoroutineContext.Element element = (CoroutineContext.Element) obj;
                if (element instanceof CoroutineDispatcher) {
                    return (CoroutineDispatcher) element;
                }
                return null;
            default:
                Function1 function12 = (Function1) obj;
                function12.getClass();
                AppStart$AppStartData appStart$AppStartData2 = Perfs.appStartData;
                if (appStart$AppStartData2 != null) {
                    Perfs.appStartData = (AppStart$AppStartData) function12.invoke(appStart$AppStartData2);
                    return Unit.INSTANCE;
                }
                Intrinsics.throwUninitializedPropertyAccessException("appStartData");
                throw null;
        }
    }
}
