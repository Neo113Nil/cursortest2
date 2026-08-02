package com.squareup.cash.ui;

import android.app.ActivityManager;
import android.graphics.Typeface;
import android.os.Process;
import android.os.StrictMode;
import androidx.activity.ComponentActivity;
import androidx.activity.ComponentActivity$$ExternalSyntheticLambda12;
import androidx.activity.OnBackPressedDispatcher;
import androidx.compose.ui.platform.WrappedComposition;
import androidx.core.content.res.ResourcesCompat;
import androidx.datastore.core.SimpleActor;
import androidx.emoji2.text.EmojiCompat;
import androidx.lifecycle.Lifecycle;
import androidx.room.TransactionExecutor;
import androidx.work.impl.StartStopToken;
import androidx.work.impl.WorkLauncherImpl;
import app.cash.broadway.screen.Screen;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.bugsnag.android.BugsnagExitInfoPlugin;
import com.bugsnag.android.Session;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.components.LazySet;
import com.google.firebase.components.OptionalProvider;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import com.google.firebase.concurrent.CustomThreadFactory;
import com.google.firebase.inject.Provider;
import com.google.firebase.messaging.FirebaseMessaging;
import com.squareup.cash.core.navigationcontainer.api.NavigatorState;
import com.squareup.cash.core.navigationcontainer.navigator.CashNavigator;
import com.squareup.cash.support.screens.SupportScreens;
import com.squareup.cash.support.screenshot.ScreenshotEventReceiver;
import com.squareup.cash.support.screenshot.ScreenshotViewEvent;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.android.HandlerContext;
import kotlinx.coroutines.selects.OnTimeout;
import kotlinx.coroutines.selects.SelectImplementation;
import kotlinx.coroutines.selects.SelectInstance;
import papa.internal.AppUpdateDetector$$ExternalSyntheticLambda1;
import papa.internal.AppUpdateDetector$Companion$$ExternalSyntheticLambda5;
import papa.internal.Perfs$$ExternalSyntheticLambda4;

/* loaded from: classes.dex */
public final /* synthetic */ class MainActivity$$ExternalSyntheticLambda8 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;

    public /* synthetic */ MainActivity$$ExternalSyntheticLambda8(int i, Object obj, Object obj2) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        OptionalProvider$$ExternalSyntheticLambda0 optionalProvider$$ExternalSyntheticLambda0;
        switch (this.$r8$classId) {
            case 0:
                MainActivity mainActivity = (MainActivity) this.f$0;
                Screen screen = (Screen) this.f$1;
                int i = MainActivity.$r8$clinit;
                screen.getClass();
                MainContainerDelegate mainContainerDelegate = mainActivity.mainContainerDelegate;
                if (mainContainerDelegate == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mainContainerDelegate");
                    throw null;
                }
                CashNavigator cashNavigator = mainContainerDelegate.cashNavigator;
                cashNavigator.getClass();
                cashNavigator.navigator.navigatorFor(NavigatorState.Unlocked).goTo(screen, null, null);
                return;
            case 1:
                ComponentActivity componentActivity = (ComponentActivity) this.f$0;
                OnBackPressedDispatcher onBackPressedDispatcher = (OnBackPressedDispatcher) this.f$1;
                int i2 = ComponentActivity.$r8$clinit;
                componentActivity.getLifecycle().addObserver(new ComponentActivity$$ExternalSyntheticLambda12(onBackPressedDispatcher, componentActivity));
                return;
            case 2:
                TransactionExecutor transactionExecutor = (TransactionExecutor) this.f$0;
                try {
                    ((Runnable) this.f$1).run();
                    return;
                } finally {
                    transactionExecutor.scheduleNext();
                }
            case 3:
                WrappedComposition wrappedComposition = (WrappedComposition) this.f$0;
                Lifecycle lifecycle = (Lifecycle) this.f$1;
                if (wrappedComposition.disposed) {
                    return;
                }
                wrappedComposition.addedToLifecycle = lifecycle;
                lifecycle.addObserver(wrappedComposition);
                return;
            case 4:
                ((ResourcesCompat.FontCallback) this.f$0).onFontRetrieved((Typeface) this.f$1);
                return;
            case 5:
                EmojiCompat.InitWithExecutor initWithExecutor = (EmojiCompat.InitWithExecutor) this.f$0;
                initWithExecutor.mInitCallback.onFailed((Throwable) this.f$1);
                return;
            case 6:
                SimpleActor simpleActor = (SimpleActor) this.f$0;
                ((WorkLauncherImpl) simpleActor.consumeMessage).stopWork((StartStopToken) this.f$1, 3);
                return;
            case 7:
                BugsnagExitInfoPlugin.SessionProcessStateSummaryCallback.m1906$r8$lambda$QPUy4RVrcc3KS2boevCGyjIyBs((ActivityManager) this.f$0, (Session) this.f$1);
                return;
            case 8:
                OptionalProvider optionalProvider = (OptionalProvider) this.f$0;
                Provider provider = (Provider) this.f$1;
                if (optionalProvider.delegate != OptionalProvider.EMPTY_PROVIDER) {
                    a$$ExternalSyntheticBUOutline0.m$1("provide() can be called only once.");
                    return;
                }
                synchronized (optionalProvider) {
                    optionalProvider$$ExternalSyntheticLambda0 = optionalProvider.handler;
                    optionalProvider.handler = null;
                    optionalProvider.delegate = provider;
                }
                optionalProvider$$ExternalSyntheticLambda0.getClass();
                return;
            case 9:
                LazySet lazySet = (LazySet) this.f$0;
                Provider provider2 = (Provider) this.f$1;
                synchronized (lazySet) {
                    try {
                        if (lazySet.actualSet == null) {
                            lazySet.providers.add(provider2);
                        } else {
                            lazySet.actualSet.add(provider2.get());
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
            case 10:
                CustomThreadFactory customThreadFactory = (CustomThreadFactory) this.f$0;
                Runnable runnable = (Runnable) this.f$1;
                Process.setThreadPriority(customThreadFactory.priority);
                StrictMode.ThreadPolicy threadPolicy = customThreadFactory.policy;
                if (threadPolicy != null) {
                    StrictMode.setThreadPolicy(threadPolicy);
                }
                runnable.run();
                return;
            case 11:
                ((FirebaseMessaging) this.f$0).lambda$deleteToken$9((TaskCompletionSource) this.f$1);
                return;
            case 12:
                ((ScreenshotEventReceiver) this.f$0).sendEvent((ScreenshotViewEvent) new ScreenshotViewEvent.PreparationCompleted((SupportScreens.ScreenshotScreen.ScreenshotArgs) this.f$1));
                return;
            case 13:
                ((CancellableContinuationImpl) this.f$0).resumeUndispatched((HandlerContext) this.f$1, Unit.INSTANCE);
                return;
            case 14:
                ((SelectImplementation) ((SelectInstance) this.f$0)).trySelect((OnTimeout) this.f$1, Unit.INSTANCE);
                return;
            case 15:
                ((Perfs$$ExternalSyntheticLambda4) this.f$0).invoke((AppUpdateDetector$$ExternalSyntheticLambda1) this.f$1);
                return;
            default:
                ((Perfs$$ExternalSyntheticLambda4) this.f$0).invoke(new AppUpdateDetector$Companion$$ExternalSyntheticLambda5((Throwable) this.f$1, 0));
                return;
        }
    }
}
