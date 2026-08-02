package radiography.internal;

import androidx.camera.camera2.adapter.CoroutineAdaptersKt$awaitUntil$1;
import androidx.compose.foundation.ClickableKt$$ExternalSyntheticLambda0;
import androidx.compose.material3.ThumbNode$onAttach$1;
import androidx.concurrent.futures.CallbackToFutureAdapter$Completer;
import androidx.concurrent.futures.CallbackToFutureAdapter$SafeFuture;
import androidx.concurrent.futures.ResolvableFuture;
import androidx.media3.extractor.metadata.scte35.SpliceScheduleCommand;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.mlkit.vision.text.zza;
import com.squareup.cash.cashapplite.CashAppLiteReleaseModule$$ExternalSyntheticLambda0;
import com.squareup.cash.money.applets.sections.AppletTileUninstalledRowVariantProvider;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import dev.zacsweers.metro.internal.SetFactory;
import java.util.BitSet;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.text.LinesIterator;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.CompletableDeferredImpl;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.JobKt;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;
import radiography.Radiography$$ExternalSyntheticLambda1;

/* loaded from: classes4.dex */
public abstract class RenderTreeStringKt {
    public static CallbackToFutureAdapter$SafeFuture asListenableFuture$default(CompletableDeferredImpl completableDeferredImpl) {
        CallbackToFutureAdapter$Completer callbackToFutureAdapter$Completer = new CallbackToFutureAdapter$Completer();
        callbackToFutureAdapter$Completer.cancellationFuture = new ResolvableFuture();
        CallbackToFutureAdapter$SafeFuture callbackToFutureAdapter$SafeFuture = new CallbackToFutureAdapter$SafeFuture(callbackToFutureAdapter$Completer);
        callbackToFutureAdapter$Completer.future = callbackToFutureAdapter$SafeFuture;
        callbackToFutureAdapter$Completer.tag = JsonLogicResult$Success$$ExternalSyntheticOutline0.class;
        try {
            completableDeferredImpl.invokeOnCompletion(new ClickableKt$$ExternalSyntheticLambda0(3, callbackToFutureAdapter$Completer, completableDeferredImpl));
            callbackToFutureAdapter$Completer.tag = "Deferred.asListenableFuture";
            return callbackToFutureAdapter$SafeFuture;
        } catch (Exception e) {
            callbackToFutureAdapter$SafeFuture.setException(e);
            return callbackToFutureAdapter$SafeFuture;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object awaitUntil(Deferred deferred, long j, ContinuationImpl continuationImpl) {
        CoroutineAdaptersKt$awaitUntil$1 coroutineAdaptersKt$awaitUntil$1;
        int i;
        if (continuationImpl instanceof CoroutineAdaptersKt$awaitUntil$1) {
            coroutineAdaptersKt$awaitUntil$1 = (CoroutineAdaptersKt$awaitUntil$1) continuationImpl;
            int i2 = coroutineAdaptersKt$awaitUntil$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                coroutineAdaptersKt$awaitUntil$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = coroutineAdaptersKt$awaitUntil$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = coroutineAdaptersKt$awaitUntil$1.label;
                Continuation continuation = null;
                char c = 1;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    ThumbNode$onAttach$1 thumbNode$onAttach$1 = new ThumbNode$onAttach$1(deferred, continuation, c == true ? 1 : 0);
                    coroutineAdaptersKt$awaitUntil$1.label = 1;
                    obj = JobKt.withTimeoutOrNull(j, thumbNode$onAttach$1, coroutineAdaptersKt$awaitUntil$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Boolean.valueOf(obj != null);
            }
        }
        coroutineAdaptersKt$awaitUntil$1 = new CoroutineAdaptersKt$awaitUntil$1(continuationImpl);
        Object obj2 = coroutineAdaptersKt$awaitUntil$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = coroutineAdaptersKt$awaitUntil$1.label;
        Continuation continuation2 = null;
        char c2 = 1;
        if (i != 0) {
        }
        return Boolean.valueOf(obj2 != null);
    }

    public static final void propagateTo(Deferred deferred, CompletableDeferred completableDeferred) {
        deferred.getClass();
        completableDeferred.getClass();
        deferred.invokeOnCompletion(new ClickableKt$$ExternalSyntheticLambda0(2, deferred, completableDeferred));
    }

    public static AppletTileUninstalledRowVariantProvider provideAppletTileUninstalledRowVariantProvider$sections(CashAppLiteReleaseModule$$ExternalSyntheticLambda0 cashAppLiteReleaseModule$$ExternalSyntheticLambda0) {
        return cashAppLiteReleaseModule$$ExternalSyntheticLambda0.f$0 ? new SpliceScheduleCommand.Event() : new zza(29);
    }

    public static Set provideMoneyTabApplets$sections(SetFactory setFactory, SetFactory setFactory2, CashAppLiteReleaseModule$$ExternalSyntheticLambda0 cashAppLiteReleaseModule$$ExternalSyntheticLambda0) {
        return (Set) (cashAppLiteReleaseModule$$ExternalSyntheticLambda0.f$0 ? setFactory2.invoke() : setFactory.invoke());
    }

    public static final void renderRecursively(StringBuilder sb, Object obj, Radiography$$ExternalSyntheticLambda1 radiography$$ExternalSyntheticLambda1, int i, BitSet bitSet) {
        StringBuilder sb2 = new StringBuilder();
        List list = (List) radiography$$ExternalSyntheticLambda1.invoke(sb2, obj);
        LinesIterator linesIterator = new LinesIterator(sb2);
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (!linesIterator.hasNext()) {
                int size = list.size() - 1;
                for (Object obj2 : list) {
                    int i4 = i2 + 1;
                    if (i2 < 0) {
                        CollectionsKt__CollectionsKt.throwIndexOverflow();
                        throw null;
                    }
                    if (i2 == size) {
                        bitSet.set(i);
                    }
                    if (obj2 != null) {
                        renderRecursively(sb, obj2, radiography$$ExternalSyntheticLambda1, i + 1, bitSet);
                    }
                    i2 = i4;
                }
                bitSet.clear(i);
                return;
            }
            Object next = linesIterator.next();
            int i5 = i3 + 1;
            if (i3 < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
                throw null;
            }
            String str = (String) next;
            boolean z = i3 > 0;
            int i6 = i - 1;
            sb.append((char) 160);
            if (i6 >= 0) {
                int i7 = 0;
                while (true) {
                    if (i7 > 0) {
                        sb.append(' ');
                    }
                    if (bitSet.get(i7)) {
                        if (i7 != i6 || z) {
                            sb.append(' ');
                        } else {
                            sb.append((char) 9584);
                        }
                    } else if (i7 != i6 || z) {
                        sb.append((char) 9474);
                    } else {
                        sb.append((char) 9500);
                    }
                    if (i7 == i6) {
                        break;
                    } else {
                        i7++;
                    }
                }
            }
            if (i > 0) {
                if (z) {
                    sb.append(" ");
                } else {
                    sb.append("─");
                }
            }
            sb.append(str);
            sb.append('\n');
            i3 = i5;
        }
    }
}
