package com.squareup.cash.storage;

import android.content.Context;
import android.util.JsonReader;
import androidx.activity.compose.ReportDrawnComposition;
import androidx.collection.MutableLongObjectMap;
import androidx.compose.foundation.AbstractClickableNode;
import androidx.compose.foundation.AbstractClickableNode$onKeyEvent$1;
import androidx.compose.foundation.interaction.PressInteraction;
import androidx.datastore.core.SimpleActor;
import androidx.room.InvalidationTracker;
import androidx.room.ObserverWrapper;
import app.cash.broadway.screen.Screen;
import app.cash.broadway.ui.Ui;
import app.cash.versioned.VersionedKt;
import coil3.ComponentRegistry$Builder$$ExternalSyntheticLambda3;
import com.bugsnag.android.AppDataCollector;
import com.bugsnag.android.AppWithState;
import com.bugsnag.android.Client;
import com.bugsnag.android.DeviceDataCollector;
import com.bugsnag.android.DeviceId;
import com.bugsnag.android.Event;
import com.bugsnag.android.EventInternal;
import com.bugsnag.android.InternalHooks;
import com.bugsnag.android.NativeInterface;
import com.bugsnag.android.Severity;
import com.bugsnag.android.SeverityReason;
import com.bugsnag.android.User;
import com.bugsnag.android.UserState;
import com.squareup.cash.core.navigationcontainer.models.NavigationModel;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.core.navigationcontainer.navigator.CashNavigator;
import com.squareup.cash.core.navigationcontainer.navigator.FullScreen;
import com.squareup.cash.core.navigationcontainer.navigator.InternalScreen;
import java.io.File;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.io.FilesKt__UtilsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlinx.coroutines.JobKt;

/* loaded from: classes.dex */
public final /* synthetic */ class RealStorage$temp$1 extends FunctionReferenceImpl implements Function1 {
    public final /* synthetic */ int $r8$classId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RealStorage$temp$1(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, i2, cls, obj, str, str2);
        this.$r8$classId = i3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v9 */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i;
        AppDataCollector appDataCollector;
        FullScreen fullScreen;
        FullScreen fullScreen2;
        int i2 = 0;
        int i3 = 1;
        String str = 0;
        String str2 = null;
        str = 0;
        switch (this.$r8$classId) {
            case 0:
                Context context = (Context) obj;
                context.getClass();
                ((RealStorage) this.receiver).getClass();
                File cacheDir = context.getCacheDir();
                cacheDir.getClass();
                File resolve = FilesKt__UtilsKt.resolve(cacheDir, "temp");
                resolve.mkdirs();
                return resolve;
            case 1:
                Function0 function0 = (Function0) obj;
                ReportDrawnComposition reportDrawnComposition = (ReportDrawnComposition) this.receiver;
                Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
                reportDrawnComposition.snapshotStateObserver.observeReads(function0, reportDrawnComposition.checkReporter, new ComponentRegistry$Builder$$ExternalSyntheticLambda3(2, ref$BooleanRef, function0));
                if (ref$BooleanRef.element) {
                    reportDrawnComposition.removeReporter();
                }
                return Unit.INSTANCE;
            case 2:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                AbstractClickableNode abstractClickableNode = (AbstractClickableNode) this.receiver;
                MutableLongObjectMap mutableLongObjectMap = abstractClickableNode.currentKeyPressInteractions;
                if (booleanValue) {
                    abstractClickableNode.initializeIndicationAndInteractionSourceIfNeeded();
                } else {
                    if (abstractClickableNode.interactionSource != null) {
                        Object[] objArr = mutableLongObjectMap.values;
                        long[] jArr = mutableLongObjectMap.metadata;
                        int length = jArr.length - 2;
                        if (length >= 0) {
                            int i4 = 0;
                            while (true) {
                                long j = jArr[i4];
                                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i5 = 8;
                                    int i6 = 8 - ((~(i4 - length)) >>> 31);
                                    int i7 = i2;
                                    while (i7 < i6) {
                                        if ((j & 255) < 128) {
                                            i = i5;
                                            JobKt.launch$default(abstractClickableNode.getCoroutineScope(), null, null, new AbstractClickableNode$onKeyEvent$1(abstractClickableNode, (PressInteraction.Press) objArr[(i4 << 3) + i7], str, i3), 3);
                                        } else {
                                            i = i5;
                                        }
                                        j >>= i;
                                        i7++;
                                        i5 = i;
                                    }
                                    if (i6 != i5) {
                                    }
                                }
                                if (i4 != length) {
                                    i4++;
                                    i2 = 0;
                                }
                            }
                        }
                        PressInteraction.Press press = abstractClickableNode.indirectPointerPressInteraction;
                        if (press != null) {
                            JobKt.launch$default(abstractClickableNode.getCoroutineScope(), null, null, new AbstractClickableNode$onKeyEvent$1(abstractClickableNode, press, str, 2), 3);
                        }
                    }
                    mutableLongObjectMap.clear();
                    abstractClickableNode.indirectPointerPressInteraction = null;
                    abstractClickableNode.onCancelKeyInput();
                }
                return Unit.INSTANCE;
            case 3:
                Set set = (Set) obj;
                set.getClass();
                InvalidationTracker invalidationTracker = (InvalidationTracker) this.receiver;
                ReentrantLock reentrantLock = invalidationTracker.observerMapLock;
                reentrantLock.lock();
                try {
                    List list = CollectionsKt.toList(invalidationTracker.observerMap.values());
                    reentrantLock.unlock();
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        ((ObserverWrapper) it.next()).notifyByTableIds$room_runtime_release(set);
                    }
                    return Unit.INSTANCE;
                } catch (Throwable th) {
                    reentrantLock.unlock();
                    throw th;
                }
            case 4:
                ((Ui.EventReceiver) this.receiver).sendEvent(obj);
                return Unit.INSTANCE;
            case 5:
                long longValue = ((Number) obj).longValue();
                Client client = ((InternalHooks) this.receiver).client;
                try {
                    DeviceDataCollector deviceDataCollector = client.deviceDataCollector;
                    if (deviceDataCollector != null && (appDataCollector = client.appDataCollector) != null) {
                        Event createEmptyEvent = NativeInterface.createEmptyEvent();
                        User user = ((UserState) client.userState.get()).user;
                        createEmptyEvent.impl.device = deviceDataCollector.generateHistoricDeviceWithState(longValue);
                        AppWithState appWithState = new AppWithState(appDataCollector.config, appDataCollector.binaryArch, appDataCollector.packageName, appDataCollector.releaseStage, appDataCollector.versionName, null, null, null, null);
                        EventInternal eventInternal = createEmptyEvent.impl;
                        eventInternal.f940app = appWithState;
                        SeverityReason severityReason = eventInternal.severityReason;
                        Severity severity = severityReason.currentSeverity;
                        boolean z = severityReason.unhandled;
                        eventInternal.severityReason = new SeverityReason("anrError", severity, z, z != severityReason.originalUnhandled, severityReason.attributeValue, severityReason.attributeKey);
                        String str3 = user.id;
                        String str4 = user.email;
                        String str5 = user.name;
                        eventInternal.getClass();
                        eventInternal.userImpl = new User(str3, str4, str5);
                        return createEmptyEvent;
                    }
                    return null;
                } catch (Exception unused) {
                    return null;
                }
            case 6:
                JsonReader jsonReader = (JsonReader) obj;
                ((DeviceId.Companion) this.receiver).getClass();
                jsonReader.beginObject();
                if (jsonReader.hasNext() && "id".equals(jsonReader.nextName())) {
                    str = jsonReader.nextString();
                }
                return new DeviceId(str);
            case 7:
                JsonReader jsonReader2 = (JsonReader) obj;
                ((User.Companion) this.receiver).getClass();
                jsonReader2.beginObject();
                String str6 = null;
                String str7 = null;
                while (jsonReader2.hasNext()) {
                    String nextName = jsonReader2.nextName();
                    String nextString = jsonReader2.nextString();
                    if (nextName != null) {
                        int hashCode = nextName.hashCode();
                        if (hashCode != 3355) {
                            if (hashCode != 3373707) {
                                if (hashCode == 96619420 && nextName.equals("email")) {
                                    str6 = nextString;
                                }
                            } else if (nextName.equals("name")) {
                                str7 = nextString;
                            }
                        } else if (nextName.equals("id")) {
                            str2 = nextString;
                        }
                    }
                }
                User user2 = new User(str2, str6, str7);
                jsonReader2.endObject();
                return user2;
            case 8:
                Screen screen = (Screen) obj;
                screen.getClass();
                return Boolean.valueOf(((BetterNavigator) this.receiver).isTab(screen));
            case 9:
                String str8 = (String) obj;
                str8.getClass();
                CashNavigator cashNavigator = (CashNavigator) this.receiver;
                cashNavigator.getClass();
                SimpleActor simpleActor = cashNavigator.navigator;
                simpleActor.getClass();
                for (BetterNavigator betterNavigator : ((LinkedHashMap) simpleActor.messageQueue).values()) {
                    betterNavigator.getClass();
                    betterNavigator.uiStateKeys.add(str8);
                }
                return Unit.INSTANCE;
            case 10:
                String str9 = (String) obj;
                str9.getClass();
                CashNavigator cashNavigator2 = (CashNavigator) this.receiver;
                cashNavigator2.getClass();
                SimpleActor simpleActor2 = cashNavigator2.navigator;
                simpleActor2.getClass();
                for (BetterNavigator betterNavigator2 : ((LinkedHashMap) simpleActor2.messageQueue).values()) {
                    betterNavigator2.getClass();
                    betterNavigator2.uiStateKeys.remove(str9);
                    InternalScreen internalScreen = (InternalScreen) betterNavigator2.deferredTearDowns.get(str9);
                    if (internalScreen != null) {
                        betterNavigator2.tearDownOrDefer(internalScreen, false);
                    }
                }
                return Unit.INSTANCE;
            default:
                NavigationModel.Ready.Swipe.Page page = (NavigationModel.Ready.Swipe.Page) obj;
                page.getClass();
                CashNavigator cashNavigator3 = (CashNavigator) this.receiver;
                cashNavigator3.getClass();
                SimpleActor simpleActor3 = cashNavigator3.navigator;
                Object obj2 = ((LinkedHashMap) simpleActor3.messageQueue).get((Enum) simpleActor3.consumeMessage);
                obj2.getClass();
                BetterNavigator betterNavigator3 = (BetterNavigator) obj2;
                if (betterNavigator3.swipeEnabled && (fullScreen = betterNavigator3.swipe) != null && (fullScreen2 = betterNavigator3.fullScreen) != null && betterNavigator3.isTab(fullScreen2.screen) && betterNavigator3.state != BetterNavigator.State.Paused && betterNavigator3.swipeState.activePage.value != page && fullScreen.startedScope != null) {
                    betterNavigator3.dispatchSwipeHandlers(page, true);
                    NavigationModel.Ready.Swipe swipe = betterNavigator3.swipeState;
                    betterNavigator3.swipeState = NavigationModel.Ready.Swipe.copy$default(swipe, null, VersionedKt.update(swipe.activePage, page), 3);
                    betterNavigator3.dirty = true;
                    betterNavigator3.emitIfDirty();
                }
                return Unit.INSTANCE;
        }
    }
}
