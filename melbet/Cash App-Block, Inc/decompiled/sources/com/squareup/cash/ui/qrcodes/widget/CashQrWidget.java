package com.squareup.cash.ui.qrcodes.widget;

import android.content.Context;
import android.util.Log;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.glance.appwidget.AppWidgetId;
import androidx.glance.appwidget.AppWidgetUtilsKt;
import androidx.glance.appwidget.GlanceAppWidget$deleted$1;
import androidx.glance.appwidget.GlanceAppWidget$update$4;
import androidx.glance.appwidget.GlanceAppWidgetKt;
import androidx.glance.appwidget.RemoteViewsTranslatorKt;
import androidx.glance.appwidget.SizeMode;
import androidx.glance.appwidget.Tracing;
import androidx.glance.appwidget.TracingApi29Impl;
import androidx.glance.session.SessionManagerImpl;
import androidx.glance.session.SessionManagerKt;
import androidx.glance.state.GlanceState;
import androidx.glance.state.PreferencesGlanceStateDefinition;
import androidx.paging.PageFetcher$flow$1;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.clientroutes.ClientRoute;
import com.squareup.cash.clientroutes.ClientRouteSpec;
import com.squareup.cash.clientroutes.ClientRoutesConfig;
import com.squareup.cash.clientroutes.RealUriFormatter;
import com.squareup.cash.ui.MainActivity;
import com.squareup.cash.work.views.WorkViewFactory$$ExternalSyntheticLambda12;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.collections.EmptyMap;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Reflection;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes7.dex */
public final class CashQrWidget {
    public final SessionManagerImpl sessionManager = SessionManagerKt.GlanceSessionManager;
    public final SizeMode.Single sizeMode = SizeMode.Single.INSTANCE;
    public final PreferencesGlanceStateDefinition stateDefinition = PreferencesGlanceStateDefinition.INSTANCE;

    public static Object update$glance_appwidget_release$default(CashQrWidget cashQrWidget, Context context, int i, ContinuationImpl continuationImpl) {
        cashQrWidget.getClass();
        if (Tracing.enabled.get()) {
            TracingApi29Impl.INSTANCE.beginAsyncSection("GlanceAppWidget::update", 0);
        }
        Object runWithLock = cashQrWidget.sessionManager.runWithLock(new GlanceAppWidget$update$4(context, new AppWidgetId(i), cashQrWidget, (Continuation) null), continuationImpl);
        return runWithLock == CoroutineSingletons.COROUTINE_SUSPENDED ? runWithLock : Unit.INSTANCE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x009d, code lost:
    
        if (r9.deleteStore(r7, r8, r6, r0) == r1) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00fa, code lost:
    
        if (r9.deleteStore(r7, r8, r6, r0) == r1) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00c6, code lost:
    
        if (r9.deleteStore(r7, r8, r6, r0) == r1) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x006f, code lost:
    
        if (r6.sessionManager.runWithLock(r2, r0) == r1) goto L55;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object deleted$glance_appwidget_release(Context context, int i, ContinuationImpl continuationImpl) {
        GlanceAppWidget$deleted$1 glanceAppWidget$deleted$1;
        CashQrWidget cashQrWidget;
        int i2;
        Throwable th;
        PreferencesGlanceStateDefinition preferencesGlanceStateDefinition;
        PreferencesGlanceStateDefinition preferencesGlanceStateDefinition2;
        PreferencesGlanceStateDefinition preferencesGlanceStateDefinition3;
        if (continuationImpl instanceof GlanceAppWidget$deleted$1) {
            glanceAppWidget$deleted$1 = (GlanceAppWidget$deleted$1) continuationImpl;
            int i3 = glanceAppWidget$deleted$1.label;
            if ((i3 & PKIFailureInfo.systemUnavail) != 0) {
                glanceAppWidget$deleted$1.label = i3 - PKIFailureInfo.systemUnavail;
                Object obj = glanceAppWidget$deleted$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                Continuation continuation = null;
                switch (glanceAppWidget$deleted$1.label) {
                    case 0:
                        SafeTrace.throwOnFailure(obj);
                        PageFetcher$flow$1 pageFetcher$flow$1 = new PageFetcher$flow$1(new AppWidgetId(i), continuation, 10);
                        glanceAppWidget$deleted$1.L$0 = this;
                        glanceAppWidget$deleted$1.L$1 = context;
                        glanceAppWidget$deleted$1.I$0 = i;
                        glanceAppWidget$deleted$1.label = 1;
                        break;
                    case 1:
                        i = glanceAppWidget$deleted$1.I$0;
                        context = glanceAppWidget$deleted$1.L$1;
                        this = (CashQrWidget) glanceAppWidget$deleted$1.L$0;
                        SafeTrace.throwOnFailure(obj);
                        try {
                            glanceAppWidget$deleted$1.L$0 = this;
                            glanceAppWidget$deleted$1.L$1 = context;
                            glanceAppWidget$deleted$1.I$0 = i;
                            glanceAppWidget$deleted$1.label = 2;
                            this.getClass();
                        } catch (CancellationException unused) {
                            int i4 = i;
                            cashQrWidget = this;
                            i2 = i4;
                            preferencesGlanceStateDefinition2 = cashQrWidget.stateDefinition;
                            if (preferencesGlanceStateDefinition2 != null) {
                            }
                            return Unit.INSTANCE;
                        } catch (Throwable th2) {
                            th = th2;
                            int i5 = i;
                            cashQrWidget = this;
                            i2 = i5;
                            try {
                                Log.e("GlanceAppWidget", "Error in user-provided deletion callback", th);
                                preferencesGlanceStateDefinition = cashQrWidget.stateDefinition;
                                if (preferencesGlanceStateDefinition != null) {
                                }
                                return Unit.INSTANCE;
                            } catch (Throwable th3) {
                                PreferencesGlanceStateDefinition preferencesGlanceStateDefinition4 = cashQrWidget.stateDefinition;
                                if (preferencesGlanceStateDefinition4 == null) {
                                    throw th3;
                                }
                                GlanceState glanceState = GlanceState.INSTANCE;
                                String createUniqueRemoteUiName = AppWidgetUtilsKt.createUniqueRemoteUiName(i2);
                                glanceAppWidget$deleted$1.L$0 = th3;
                                glanceAppWidget$deleted$1.L$1 = null;
                                glanceAppWidget$deleted$1.label = 6;
                                if (glanceState.deleteStore(context, preferencesGlanceStateDefinition4, createUniqueRemoteUiName, glanceAppWidget$deleted$1) != coroutineSingletons) {
                                    th = th3;
                                    break;
                                }
                            }
                        }
                        if (Unit.INSTANCE != coroutineSingletons) {
                            int i6 = i;
                            cashQrWidget = this;
                            i2 = i6;
                            preferencesGlanceStateDefinition3 = cashQrWidget.stateDefinition;
                            if (preferencesGlanceStateDefinition3 != null) {
                                GlanceState glanceState2 = GlanceState.INSTANCE;
                                String createUniqueRemoteUiName2 = AppWidgetUtilsKt.createUniqueRemoteUiName(i2);
                                glanceAppWidget$deleted$1.L$0 = null;
                                glanceAppWidget$deleted$1.L$1 = null;
                                glanceAppWidget$deleted$1.label = 3;
                                break;
                            }
                            return Unit.INSTANCE;
                        }
                        return coroutineSingletons;
                    case 2:
                        i2 = glanceAppWidget$deleted$1.I$0;
                        context = glanceAppWidget$deleted$1.L$1;
                        cashQrWidget = (CashQrWidget) glanceAppWidget$deleted$1.L$0;
                        try {
                            SafeTrace.throwOnFailure(obj);
                            preferencesGlanceStateDefinition3 = cashQrWidget.stateDefinition;
                            if (preferencesGlanceStateDefinition3 != null) {
                            }
                        } catch (CancellationException unused2) {
                            preferencesGlanceStateDefinition2 = cashQrWidget.stateDefinition;
                            if (preferencesGlanceStateDefinition2 != null) {
                                GlanceState glanceState3 = GlanceState.INSTANCE;
                                String createUniqueRemoteUiName3 = AppWidgetUtilsKt.createUniqueRemoteUiName(i2);
                                glanceAppWidget$deleted$1.L$0 = null;
                                glanceAppWidget$deleted$1.L$1 = null;
                                glanceAppWidget$deleted$1.label = 4;
                                break;
                            }
                            return Unit.INSTANCE;
                        } catch (Throwable th4) {
                            th = th4;
                            Log.e("GlanceAppWidget", "Error in user-provided deletion callback", th);
                            preferencesGlanceStateDefinition = cashQrWidget.stateDefinition;
                            if (preferencesGlanceStateDefinition != null) {
                                GlanceState glanceState4 = GlanceState.INSTANCE;
                                String createUniqueRemoteUiName4 = AppWidgetUtilsKt.createUniqueRemoteUiName(i2);
                                glanceAppWidget$deleted$1.L$0 = null;
                                glanceAppWidget$deleted$1.L$1 = null;
                                glanceAppWidget$deleted$1.label = 5;
                                break;
                            }
                            return Unit.INSTANCE;
                        }
                        return Unit.INSTANCE;
                    case 3:
                    case 4:
                    case 5:
                        SafeTrace.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    case 6:
                        th = (Throwable) glanceAppWidget$deleted$1.L$0;
                        SafeTrace.throwOnFailure(obj);
                        throw th;
                    default:
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                }
            }
        }
        glanceAppWidget$deleted$1 = new GlanceAppWidget$deleted$1(this, continuationImpl);
        Object obj2 = glanceAppWidget$deleted$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        Continuation continuation2 = null;
        switch (glanceAppWidget$deleted$1.label) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void provideGlance(Context context, ContinuationImpl continuationImpl) {
        CashQrWidget$provideGlance$1 cashQrWidget$provideGlance$1;
        int i;
        if (continuationImpl instanceof CashQrWidget$provideGlance$1) {
            cashQrWidget$provideGlance$1 = (CashQrWidget$provideGlance$1) continuationImpl;
            int i2 = cashQrWidget$provideGlance$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                cashQrWidget$provideGlance$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = cashQrWidget$provideGlance$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = cashQrWidget$provideGlance$1.label;
                if (i == 0) {
                    if (i == 1) {
                        throw Recorder$$ExternalSyntheticOutline2.m(obj);
                    }
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return;
                }
                SafeTrace.throwOnFailure(obj);
                ClientRoutesConfig.standard.getClass();
                ClientRoute.ViewQrCode viewQrCode = new ClientRoute.ViewQrCode();
                ClientRouteSpec clientRouteSpec = viewQrCode.spec$1;
                clientRouteSpec.getClass();
                EmptyMap emptyMap = viewQrCode.parameters;
                emptyMap.getClass();
                String format2 = RealUriFormatter.format("https", "internal.cash.app", clientRouteSpec.pathFormat, clientRouteSpec.parameterNames, emptyMap, null, clientRouteSpec.accountRequirement);
                format2.getClass();
                ComposableLambdaImpl composableLambdaImpl = new ComposableLambdaImpl(new WorkViewFactory$$ExternalSyntheticLambda12(12, context, RemoteViewsTranslatorKt.buildShortcutIntent(context, format2, Reflection.factory.getOrCreateKotlinClass(MainActivity.class))), true, -983243199);
                cashQrWidget$provideGlance$1.label = 1;
                GlanceAppWidgetKt.provideContent(composableLambdaImpl, cashQrWidget$provideGlance$1);
                return;
            }
        }
        cashQrWidget$provideGlance$1 = new CashQrWidget$provideGlance$1(this, continuationImpl);
        Object obj2 = cashQrWidget$provideGlance$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = cashQrWidget$provideGlance$1.label;
        if (i == 0) {
        }
    }
}
