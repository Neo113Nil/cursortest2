package com.squareup.cash.work.applets.views;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import androidx.camera.camera2.pipe.graph.GraphCommand;
import androidx.camera.camera2.pipe.graph.GraphLoop;
import androidx.camera.video.Recorder;
import androidx.core.view.ContentInfoCompat;
import androidx.credentials.playservices.controllers.CredentialProviderBaseController$Companion;
import androidx.lifecycle.LifecycleOwner;
import androidx.room.util.DBUtil;
import androidx.transition.Scene;
import androidx.transition.Slide;
import androidx.transition.TransitionManager;
import androidx.transition.TransitionSet;
import app.cash.arcade.protocol.host.arcade.ButtonHostProtocol;
import app.cash.arcade.protocol.host.redwoodlazylayout.LazyListHostProtocol;
import app.cash.arcade.protocol.host.redwoodlazylayout.LazyListProtocolNode$OnViewportChanged;
import app.cash.arcade.protocol.host.redwoodlazylayout.RefreshableLazyListProtocolNode$OnViewportChanged;
import app.cash.broadway.navigation.Navigator;
import app.cash.broadway.presenter.Presenter;
import app.cash.broadway.presenter.molecule.MoleculePresenterKt;
import app.cash.broadway.presenter.molecule.MoleculePresenterKt$asPresenter$1$start$2;
import app.cash.paraphrase.FormattedResource;
import app.cash.redwood.yoga.internal.YGNode;
import app.cash.redwood.yoga.internal.Yoga;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.RealImageLoader;
import com.bugsnag.android.TraceParser;
import com.caverock.androidsvg.SVG;
import com.datadog.android.rum.RumMonitor;
import com.datadog.trace.bootstrap.instrumentation.api.AgentPropagation$KeyClassifier;
import com.squareup.cash.R;
import com.squareup.cash.account.presenters.ProfileUpsellPresenter;
import com.squareup.cash.blockers.presenters.FormattedResources;
import com.squareup.cash.blockers.presenters.SelectionPresenter;
import com.squareup.cash.card.onboarding.core.CardShaderGenerator;
import com.squareup.cash.data.blockers.BlockersHelper;
import com.squareup.cash.db2.Instrument$Adapter;
import com.squareup.cash.idv.ProfilePageUpsellComponentV2;
import com.squareup.cash.tabs.views.ToolbarTuckTargets;
import com.squareup.cash.tax.applet.views.TaxesAppletViewsModule$$ExternalSyntheticLambda1;
import com.squareup.cash.tax.presenters.TaxReturnsPresenter;
import com.squareup.cash.ui.CashNavigationLogger;
import com.squareup.cash.ui.widget.recycler.RecyclerViewWithNestedScrollingChildren;
import com.squareup.cash.work.analytics.ShiftsAnalytics;
import com.squareup.cash.work.applets.presenters.RealShiftsTileDataLoader;
import com.squareup.cash.work.applets.presenters.WorkAppletTilePresenter$Factory$Impl;
import com.squareup.cash.work.webview.views.WorkWebViewDownloadHandler$CookieProvider$Companion$$ExternalSyntheticLambda0;
import com.squareup.protos.franklin.ui.ProfileUpsellConfiguration;
import com.squareup.scannerview.TextSetter;
import com.squareup.wire.internal.FieldBinding$$ExternalSyntheticLambda5;
import com.squareup.workflow1.Snapshot;
import com.squareup.workflow1.StatefulWorkflow;
import com.squareup.workflow1.ui.CompatibleKt;
import com.squareup.workflow1.ui.Named;
import com.squareup.workflow1.ui.ViewEnvironment;
import com.squareup.workflow1.ui.ViewRegistry;
import com.squareup.workflow1.ui.ViewRegistryKt;
import com.squareup.workflow1.ui.ViewShowRenderingKt;
import com.squareup.workflow1.ui.androidx.KeyedSavedStateRegistryOwner;
import com.squareup.workflow1.ui.androidx.RealWorkflowLifecycleOwner;
import com.squareup.workflow1.ui.backstack.BackStackConfig;
import com.squareup.workflow1.ui.backstack.BackStackContainer;
import com.squareup.workflow1.ui.backstack.BackStackScreen;
import com.squareup.workflow1.ui.backstack.ViewStateCache$update$hiddenKeys$1;
import com.squareup.workflow1.ui.backstack.ViewStateCacheKt;
import com.squareup.workflow1.ui.backstack.ViewStateFrame;
import com.squareup.workflow1.ui.modal.AlertContainer;
import com.squareup.workflow1.ui.modal.HasModals;
import com.stripe.android.financialconnections.domain.PollAuthorizationSessionAccounts$invoke$4;
import com.stripe.android.financialconnections.features.institutionpicker.InstitutionPickerViewModel;
import com.stripe.android.financialconnections.model.FinancialConnectionsInstitution;
import com.stripe.android.financialconnections.presentation.FinancialConnectionsViewModel;
import com.withpersona.sdk2.inquiry.governmentid.Screen;
import com.withpersona.sdk2.inquiry.governmentid.autoClassification.SelectCountryAndIdClassRunner;
import com.withpersona.sdk2.inquiry.governmentid.cameraScreen.CameraScreenRunner;
import com.withpersona.sdk2.inquiry.governmentid.reviewCaptureScreen.GovernmentIdReviewRunner;
import com.withpersona.sdk2.inquiry.modal.CustomModalViewContainer;
import com.withpersona.sdk2.inquiry.ui.UiScreenRunner;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import dev.zacsweers.metro.Provider;
import io.noties.markwon.MarkwonConfiguration;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.collections.SetsKt___SetsKt;
import kotlin.collections.builders.MapBuilder;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.SequencesKt___SequencesKt;
import kotlin.text.StringsKt__StringsKt$lineSequence$$inlined$Sequence$1;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowImpl;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.json.JsonImpl;
import okio.Path$$ExternalSyntheticBUOutline0;

/* loaded from: classes9.dex */
public final /* synthetic */ class WorkApplet$applet$1 extends FunctionReferenceImpl implements Function2 {
    public final /* synthetic */ int $r8$classId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WorkApplet$applet$1(Object obj) {
        super(2, 0, RumMonitor.class, obj, "addAttribute", "addAttribute(Ljava/lang/String;Ljava/lang/Object;)V");
        this.$r8$classId = 20;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x036f, code lost:
    
        if (r1.equals("SnakeSkin") != false) goto L144;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:?, code lost:
    
        return androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1.m("texture(u", r1, "Texture, ", r2, ")");
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x038e, code lost:
    
        if (r1.equals("HeatColors") != false) goto L144;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x0397, code lost:
    
        if (r1.equals("Icon") != false) goto L144;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x03ab, code lost:
    
        if (r1.equals("ShimmerGradient") != false) goto L144;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x03b4, code lost:
    
        if (r1.equals("HeatMask") != false) goto L144;
     */
    /* JADX WARN: Code restructure failed: missing block: B:365:0x0687, code lost:
    
        if (r10 >= 0) goto L268;
     */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0695  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x069a  */
    /* JADX WARN: Removed duplicated region for block: B:341:0x063e  */
    /* JADX WARN: Removed duplicated region for block: B:342:0x0640  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0232  */
    @Override // kotlin.jvm.functions.Function2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj, Object obj2) {
        int size;
        GraphCommand graphCommand;
        List list;
        String str;
        boolean z;
        BackStackScreen backStackScreen;
        List list2;
        List list3;
        Iterator it;
        boolean z2;
        Pair pair;
        boolean z3;
        Unit unit;
        Object obj3 = null;
        switch (this.$r8$classId) {
            case 0:
                Navigator navigator = (Navigator) obj;
                CoroutineScope coroutineScope = (CoroutineScope) obj2;
                navigator.getClass();
                coroutineScope.getClass();
                TextSetter textSetter = ((WorkApplet) this.receiver).workAppletTileFactory;
                Instrument$Adapter instrument$Adapter = ((WorkAppletTilePresenter$Factory$Impl) textSetter.textView).delegateFactory;
                ShiftsAnalytics shiftsAnalytics = (ShiftsAnalytics) ((Provider) instrument$Adapter.cash_instrument_typeAdapter).invoke();
                RealShiftsTileDataLoader realShiftsTileDataLoader = (RealShiftsTileDataLoader) ((Provider) instrument$Adapter.card_brandAdapter).invoke();
                ToolbarTuckTargets toolbarTuckTargets = (ToolbarTuckTargets) ((CashNavigationLogger.MetroFactory) instrument$Adapter.balance_currencyAdapter).invoke();
                shiftsAnalytics.getClass();
                realShiftsTileDataLoader.getClass();
                Presenter.Binding start$default = Presenter.start$default(MoleculePresenterKt.asPresenter$default(new TaxReturnsPresenter(navigator, shiftsAnalytics, realShiftsTileDataLoader, toolbarTuckTargets)), coroutineScope, (LifecycleOwner) textSetter.textSwitcher);
                return new WorkAppletTile((RealImageLoader) textSetter.scannerText, new TaxesAppletViewsModule$$ExternalSyntheticLambda1(start$default, 20), ((MoleculePresenterKt$asPresenter$1$start$2) start$default).getModels());
            case 1:
                List list4 = (List) obj;
                Continuation continuation = (Continuation) obj2;
                GraphLoop graphLoop = (GraphLoop) this.receiver;
                graphLoop.getClass();
                GraphCommand.Stop stop = GraphCommand.Stop.INSTANCE$3;
                GraphCommand.Stop stop2 = GraphCommand.Stop.INSTANCE$2;
                GraphCommand.Stop stop3 = GraphCommand.Stop.INSTANCE$1;
                GraphCommand.Stop stop4 = GraphCommand.Stop.INSTANCE;
                if (list4.size() != 1) {
                    List list5 = list4;
                    size = list5.size() - 1;
                    if (size >= 0) {
                        int i = -1;
                        while (true) {
                            int i2 = size - 1;
                            GraphCommand graphCommand2 = (GraphCommand) list4.get(size);
                            if (!Intrinsics.areEqual(graphCommand2, stop3) && !Intrinsics.areEqual(graphCommand2, stop2) && !Intrinsics.areEqual(graphCommand2, stop4) && !Intrinsics.areEqual(graphCommand2, stop)) {
                                if ((graphCommand2 instanceof GraphCommand.RequestProcessor) && i < 0) {
                                    i = size;
                                }
                                if (i2 < 0) {
                                    size = i;
                                } else {
                                    size = i2;
                                }
                            }
                        }
                        graphCommand = (GraphCommand) list4.get(size);
                        if (Intrinsics.areEqual(graphCommand, stop2)) {
                            list4.remove(size);
                        } else {
                            if (Intrinsics.areEqual(graphCommand, stop)) {
                                Object processShutdown = graphLoop.processShutdown(list4, continuation);
                                return processShutdown == CoroutineSingletons.COROUTINE_SUSPENDED ? processShutdown : Unit.INSTANCE;
                            }
                            if (Intrinsics.areEqual(graphCommand, stop3)) {
                                TraceParser traceParser = graphLoop.currentRequestProcessor;
                                if (traceParser != null) {
                                    traceParser.abortCaptures$camera_camera2_pipe();
                                }
                                graphLoop.currentRepeatingRequest = null;
                                list4.remove(size);
                                int i3 = 0;
                                while (i3 < size) {
                                    GraphCommand graphCommand3 = (GraphCommand) list4.get(i3);
                                    if (!Intrinsics.areEqual(graphCommand3, stop4) && !Intrinsics.areEqual(graphCommand3, stop3) && !(graphCommand3 instanceof GraphCommand.Repeat) && !(graphCommand3 instanceof GraphCommand.Trigger)) {
                                        if (graphCommand3 instanceof GraphCommand.Capture) {
                                            graphLoop.abortRequests(((GraphCommand.Capture) graphCommand3).requests);
                                        } else {
                                            i3++;
                                        }
                                    }
                                    list4.remove(i3);
                                    size--;
                                }
                            } else if (Intrinsics.areEqual(graphCommand, stop4)) {
                                TraceParser traceParser2 = graphLoop.currentRequestProcessor;
                                if (traceParser2 != null) {
                                    traceParser2.stopRepeating$camera_camera2_pipe();
                                }
                                graphLoop.currentRepeatingRequest = null;
                                list4.remove(size);
                                int i4 = 0;
                                while (i4 < size) {
                                    GraphCommand graphCommand4 = (GraphCommand) list4.get(i4);
                                    if (Intrinsics.areEqual(graphCommand4, stop4) || (graphCommand4 instanceof GraphCommand.Repeat)) {
                                        list4.remove(i4);
                                        size--;
                                    } else {
                                        i4++;
                                    }
                                }
                            } else {
                                if (graphCommand instanceof GraphCommand.RequestProcessor) {
                                    Object processRequestProcessor = graphLoop.processRequestProcessor(list4, size, (GraphCommand.RequestProcessor) graphCommand, continuation);
                                    return processRequestProcessor == CoroutineSingletons.COROUTINE_SUSPENDED ? processRequestProcessor : Unit.INSTANCE;
                                }
                                if (graphCommand instanceof GraphCommand.Capture) {
                                    graphLoop.processCapture(list4, size, (GraphCommand.Capture) graphCommand, true);
                                } else if (graphCommand instanceof GraphCommand.Trigger) {
                                    graphLoop.processTrigger(list4, size, (GraphCommand.Trigger) graphCommand);
                                } else if (graphCommand instanceof GraphCommand.Parameters) {
                                    GraphCommand.Parameters parameters = (GraphCommand.Parameters) graphCommand;
                                    Map map = graphLoop.requiredParameters;
                                    graphLoop.currentGraphParameters = parameters.graphParameters;
                                    Map map2 = parameters.graph3AParameters;
                                    graphLoop.currentGraph3AParameters = map2;
                                    if (!map2.isEmpty()) {
                                        MapBuilder mapBuilder = new MapBuilder();
                                        mapBuilder.putAll(map2);
                                        map.getClass();
                                        mapBuilder.putAll(map);
                                        map = mapBuilder.build();
                                    }
                                    graphLoop.currentRequiredParameters = map;
                                    list4.remove(size);
                                    int i5 = 0;
                                    while (i5 < size) {
                                        if (((GraphCommand) list4.get(i5)) instanceof GraphCommand.Parameters) {
                                            list4.remove(i5);
                                            size--;
                                        } else {
                                            i5++;
                                        }
                                    }
                                    graphLoop.reissueRepeatingRequest();
                                } else {
                                    if (graphCommand instanceof GraphCommand.Listeners) {
                                        throw null;
                                    }
                                    if (!(graphCommand instanceof GraphCommand.Repeat)) {
                                        Drop$$ExternalSyntheticBUOutline0.m1m();
                                        return null;
                                    }
                                    graphLoop.processRepeat(size, list4, true);
                                }
                            }
                        }
                        return Unit.INSTANCE;
                    }
                    size = -1;
                    if (size < 0) {
                        int size2 = list5.size();
                        int i6 = -1;
                        int i7 = -1;
                        for (int i8 = 0; i8 < size2; i8++) {
                            GraphCommand graphCommand5 = (GraphCommand) list4.get(i8);
                            if (graphCommand5 instanceof GraphCommand.Parameters) {
                                i6 = i8;
                            } else if (graphCommand5 instanceof GraphCommand.Listeners) {
                                i7 = i8;
                            } else if (!(graphCommand5 instanceof GraphCommand.Repeat)) {
                                if (i6 < 0) {
                                    size = i6;
                                } else if (i7 >= 0) {
                                    size = i7;
                                } else {
                                    if (graphLoop.currentRepeatingRequest != null && graphLoop._captureProcessingEnabled.getValue()) {
                                        int size3 = list5.size();
                                        for (int i9 = 0; i9 < size3; i9++) {
                                            GraphCommand graphCommand6 = (GraphCommand) list4.get(i9);
                                            if ((graphCommand6 instanceof GraphCommand.Capture) || (graphCommand6 instanceof GraphCommand.Trigger)) {
                                                size = i9;
                                            }
                                        }
                                    }
                                    int size4 = list5.size();
                                    int i10 = 0;
                                    size = -1;
                                    while (i10 < size4 && (((GraphCommand) list4.get(i10)) instanceof GraphCommand.Repeat)) {
                                        int i11 = i10;
                                        i10++;
                                        size = i11;
                                    }
                                }
                            }
                        }
                        if (i6 < 0) {
                        }
                    }
                    graphCommand = (GraphCommand) list4.get(size);
                    if (Intrinsics.areEqual(graphCommand, stop2)) {
                    }
                    return Unit.INSTANCE;
                }
                size = 0;
                graphCommand = (GraphCommand) list4.get(size);
                if (Intrinsics.areEqual(graphCommand, stop2)) {
                }
                return Unit.INSTANCE;
            case 2:
                ((CredentialProviderBaseController$Companion) this.receiver).getClass();
                return CredentialProviderBaseController$Companion.getCredentialExceptionTypeToException$credentials_play_services_auth((String) obj, (String) obj2);
            case 3:
                ((CredentialProviderBaseController$Companion) this.receiver).getClass();
                return CredentialProviderBaseController$Companion.createCredentialExceptionTypeToException$credentials_play_services_auth((String) obj, (String) obj2);
            case 4:
                ((CredentialProviderBaseController$Companion) this.receiver).getClass();
                return CredentialProviderBaseController$Companion.createCredentialExceptionTypeToException$credentials_play_services_auth((String) obj, (String) obj2);
            case 5:
                ((CredentialProviderBaseController$Companion) this.receiver).getClass();
                return CredentialProviderBaseController$Companion.getCredentialExceptionTypeToException$credentials_play_services_auth((String) obj, (String) obj2);
            case 6:
                ((CredentialProviderBaseController$Companion) this.receiver).getClass();
                return CredentialProviderBaseController$Companion.getCredentialExceptionTypeToException$credentials_play_services_auth((String) obj, (String) obj2);
            case 7:
                int intValue = ((Number) obj).intValue();
                int intValue2 = ((Number) obj2).intValue();
                LazyListProtocolNode$OnViewportChanged lazyListProtocolNode$OnViewportChanged = (LazyListProtocolNode$OnViewportChanged) this.receiver;
                SVG svg = lazyListProtocolNode$OnViewportChanged.eventSink;
                int i12 = lazyListProtocolNode$OnViewportChanged.id;
                LazyListHostProtocol lazyListHostProtocol = lazyListProtocolNode$OnViewportChanged.protocol;
                JsonImpl jsonImpl = lazyListHostProtocol.json;
                Object[] objArr = {Integer.valueOf(intValue), Integer.valueOf(intValue2)};
                IntSerializer intSerializer = lazyListHostProtocol.serializer_1;
                intSerializer.getClass();
                svg.sendEvent(new ContentInfoCompat.CompatImpl(i12, 2, jsonImpl, objArr, new KSerializer[]{intSerializer, intSerializer}));
                return Unit.INSTANCE;
            case 8:
                int intValue3 = ((Number) obj).intValue();
                int intValue4 = ((Number) obj2).intValue();
                RefreshableLazyListProtocolNode$OnViewportChanged refreshableLazyListProtocolNode$OnViewportChanged = (RefreshableLazyListProtocolNode$OnViewportChanged) this.receiver;
                SVG svg2 = refreshableLazyListProtocolNode$OnViewportChanged.eventSink;
                int i13 = refreshableLazyListProtocolNode$OnViewportChanged.id;
                ButtonHostProtocol buttonHostProtocol = refreshableLazyListProtocolNode$OnViewportChanged.protocol;
                JsonImpl jsonImpl2 = (JsonImpl) buttonHostProtocol.serializer_0;
                Object[] objArr2 = {Integer.valueOf(intValue3), Integer.valueOf(intValue4)};
                IntSerializer intSerializer2 = (IntSerializer) buttonHostProtocol.serializer_6;
                intSerializer2.getClass();
                svg2.sendEvent(new ContentInfoCompat.CompatImpl(i13, 2, jsonImpl2, objArr2, new KSerializer[]{intSerializer2, intSerializer2}));
                return Unit.INSTANCE;
            case 9:
                YGNode yGNode = (YGNode) obj;
                yGNode.getClass();
                ((Yoga) this.receiver).getClass();
                Yoga.YGZeroOutLayoutRecursivly(yGNode, obj2);
                return Unit.INSTANCE;
            case 10:
                return Boolean.valueOf(((AgentPropagation$KeyClassifier) this.receiver).accept((String) obj, (String) obj2));
            case 11:
                List list6 = (List) obj;
                ProfileUpsellConfiguration profileUpsellConfiguration = (ProfileUpsellConfiguration) obj2;
                list6.getClass();
                ((ProfileUpsellPresenter) this.receiver).getClass();
                if (profileUpsellConfiguration == null || (list = profileUpsellConfiguration.upsell_entity_ids_priority) == null) {
                    list = EmptyList.INSTANCE;
                }
                List list7 = list;
                Iterator it2 = list6.iterator();
                if (it2.hasNext()) {
                    obj3 = it2.next();
                    if (it2.hasNext()) {
                        int indexOf = CollectionsKt.indexOf(((ProfilePageUpsellComponentV2) obj3).entity_id, list7);
                        if (indexOf < 0) {
                            indexOf = Integer.MAX_VALUE;
                        }
                        do {
                            Object next = it2.next();
                            int indexOf2 = list7.indexOf(((ProfilePageUpsellComponentV2) next).entity_id);
                            if (indexOf2 < 0) {
                                indexOf2 = Integer.MAX_VALUE;
                            }
                            if (indexOf > indexOf2) {
                                obj3 = next;
                                indexOf = indexOf2;
                            }
                        } while (it2.hasNext());
                    }
                }
                return (ProfilePageUpsellComponentV2) obj3;
            case 12:
                obj.getClass();
                obj2.getClass();
                ((FormattedResources) this.receiver).getClass();
                return new FormattedResource(R.string.blockers_passcode_title_pin_format_personal_account, new Object[]{obj, obj2});
            case 13:
                obj.getClass();
                obj2.getClass();
                ((FormattedResources) this.receiver).getClass();
                return new FormattedResource(R.string.blockers_passcode_title_pin_format_business_account, new Object[]{obj, obj2});
            case 14:
                return ((SelectionPresenter) this.receiver).handleError((BlockersHelper.BlockersAction.ShowError) obj);
            case 15:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                ((StateFlowImpl) ((MutableStateFlow) this.receiver)).setValue(bool);
                return Unit.INSTANCE;
            case 16:
                obj.getClass();
                obj2.getClass();
                ((FormattedResources) this.receiver).getClass();
                return new FormattedResource(R.string.set_pin_title_format_personal_account, new Object[]{obj, obj2});
            case 17:
                obj.getClass();
                obj2.getClass();
                ((FormattedResources) this.receiver).getClass();
                return new FormattedResource(R.string.set_pin_title_format_business_account, new Object[]{obj, obj2});
            case 18:
                String str2 = (String) obj;
                String str3 = (String) obj2;
                str2.getClass();
                str3.getClass();
                ((CardShaderGenerator.Instanced) this.receiver).getClass();
                switch (str2.hashCode()) {
                    case -1955878649:
                        if (str2.equals("Normal")) {
                            str = "CARD.textureLayers0.y";
                            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("texture(u", str2, "Array, vec3(", str3, ", "), str, "))");
                        }
                        a$$ExternalSyntheticBUOutline0.m1430m((Object) "Unknown texture: ".concat(str2));
                        return null;
                    case -1036569316:
                        break;
                    case -727451855:
                        break;
                    case -441491749:
                        if (str2.equals("HoloBase")) {
                            str = "CARD.textureLayers1.x";
                            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("texture(u", str2, "Array, vec3(", str3, ", "), str, "))");
                        }
                        a$$ExternalSyntheticBUOutline0.m1430m((Object) "Unknown texture: ".concat(str2));
                        return null;
                    case 2273433:
                        break;
                    case 15736736:
                        break;
                    case 127142515:
                        if (str2.equals("HoloReflect")) {
                            str = "CARD.textureLayers1.y";
                            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("texture(u", str2, "Array, vec3(", str3, ", "), str, "))");
                        }
                        a$$ExternalSyntheticBUOutline0.m1430m((Object) "Unknown texture: ".concat(str2));
                        return null;
                    case 1963654873:
                        if (str2.equals("Albedo")) {
                            str = "CARD.textureLayers0.x";
                            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("texture(u", str2, "Array, vec3(", str3, ", "), str, "))");
                        }
                        a$$ExternalSyntheticBUOutline0.m1430m((Object) "Unknown texture: ".concat(str2));
                        return null;
                    case 2088428221:
                        break;
                    case 2130210929:
                        if (str2.equals("InkMetalHeat")) {
                            str = "CARD.textureLayers0.z";
                            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("texture(u", str2, "Array, vec3(", str3, ", "), str, "))");
                        }
                        a$$ExternalSyntheticBUOutline0.m1430m((Object) "Unknown texture: ".concat(str2));
                        return null;
                    default:
                        a$$ExternalSyntheticBUOutline0.m1430m((Object) "Unknown texture: ".concat(str2));
                        return null;
                }
            case 19:
                String str4 = (String) obj;
                String str5 = (String) obj2;
                str4.getClass();
                str5.getClass();
                ((CardShaderGenerator.SingleCard) this.receiver).getClass();
                return "texture2D(u" + str4 + "Texture, " + str5 + ")";
            case 20:
                String str6 = (String) obj;
                str6.getClass();
                ((RumMonitor) this.receiver).addAttribute(obj2, str6);
                return Unit.INSTANCE;
            case 21:
                return ((RecyclerViewWithNestedScrollingChildren) this.receiver).findChildViewUnder(((Number) obj).floatValue(), ((Number) obj2).floatValue());
            case 22:
                return ((StatefulWorkflow) this.receiver).initialState(obj, (Snapshot) obj2);
            case 23:
                BackStackScreen backStackScreen2 = (BackStackScreen) obj;
                ViewEnvironment viewEnvironment = (ViewEnvironment) obj2;
                backStackScreen2.getClass();
                viewEnvironment.getClass();
                BackStackContainer backStackContainer = (BackStackContainer) this.receiver;
                Recorder.AnonymousClass4 anonymousClass4 = backStackContainer.viewStateCache;
                ViewEnvironment viewEnvironment2 = new ViewEnvironment(MapsKt__MapsKt.plus(viewEnvironment.map, new Pair(BackStackConfig.Companion, backStackScreen2.backStack.isEmpty() ? BackStackConfig.First : BackStackConfig.Other)));
                ArrayList arrayList = backStackScreen2.frames;
                ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
                Iterator it3 = arrayList.iterator();
                while (it3.hasNext()) {
                    Object next2 = it3.next();
                    next2.getClass();
                    arrayList2.add(new Named(next2, "backstack"));
                }
                if (arrayList2.isEmpty()) {
                    a$$ExternalSyntheticBUOutline0.m$3("Failed requirement.");
                    return null;
                }
                BackStackScreen backStackScreen3 = new BackStackScreen(CollectionsKt.first((List) arrayList2), arrayList2.subList(1, arrayList2.size()));
                View childAt = backStackContainer.getChildCount() > 0 ? backStackContainer.getChildAt(0) : null;
                Object obj4 = backStackScreen3.top;
                if (childAt != null) {
                    View view = ViewShowRenderingKt.canShowRendering(childAt, obj4) ? childAt : null;
                    if (view != null) {
                        anonymousClass4.prune(backStackScreen3.frames);
                        ViewShowRenderingKt.showRendering(view, obj4, viewEnvironment2);
                        return Unit.INSTANCE;
                    }
                }
                ViewRegistry viewRegistry = (ViewRegistry) viewEnvironment2.get(ViewRegistry.Companion);
                Context context = backStackContainer.getContext();
                context.getClass();
                View buildView = ViewRegistryKt.buildView(viewRegistry, backStackScreen3.top, viewEnvironment2, context, backStackContainer, new WorkWebViewDownloadHandler$CookieProvider$Companion$$ExternalSyntheticLambda0(21));
                ViewShowRenderingKt.start(buildView);
                List list8 = backStackScreen3.backStack;
                LinkedHashMap linkedHashMap = (LinkedHashMap) anonymousClass4.val$audioErrorConsumer;
                MarkwonConfiguration markwonConfiguration = (MarkwonConfiguration) anonymousClass4.this$0;
                list8.getClass();
                String access$getNamedKey = ViewStateCacheKt.access$getNamedKey(buildView);
                Set set = SequencesKt___SequencesKt.toSet(SequencesKt___SequencesKt.map(new StringsKt__StringsKt$lineSequence$$inlined$Sequence$1(list8, 1), ViewStateCache$update$hiddenKeys$1.INSTANCE));
                if (list8.size() != set.size()) {
                    Path$$ExternalSyntheticBUOutline0.m$1("Duplicate entries not allowed in ", 46, list8);
                    return null;
                }
                markwonConfiguration.installChildRegistryOwnerOn(buildView, access$getNamedKey);
                ViewStateFrame viewStateFrame = (ViewStateFrame) linkedHashMap.remove(access$getNamedKey);
                if (viewStateFrame != null) {
                    buildView.restoreHierarchyState(viewStateFrame.viewState);
                }
                if (childAt != null) {
                    String access$getNamedKey2 = ViewStateCacheKt.access$getNamedKey(childAt);
                    if (!set.contains(access$getNamedKey2)) {
                        access$getNamedKey2 = null;
                    }
                    if (access$getNamedKey2 != null) {
                        SparseArray<Parcelable> sparseArray = new SparseArray<>();
                        childAt.saveHierarchyState(sparseArray);
                        linkedHashMap.put(access$getNamedKey2, new ViewStateFrame(access$getNamedKey2, sparseArray));
                        KeyedSavedStateRegistryOwner keyedSavedStateRegistryOwner = (KeyedSavedStateRegistryOwner) ((LinkedHashMap) markwonConfiguration.imageDestinationProcessor).remove(access$getNamedKey2);
                        if (keyedSavedStateRegistryOwner == null) {
                            z = false;
                            unit = null;
                        } else {
                            LinkedHashMap linkedHashMap2 = (LinkedHashMap) markwonConfiguration.theme;
                            if (linkedHashMap2 == null) {
                                z3 = false;
                            } else {
                                Bundle bundle = new Bundle();
                                z3 = false;
                                keyedSavedStateRegistryOwner.controller.performSave(bundle);
                                linkedHashMap2.put(keyedSavedStateRegistryOwner.key, bundle);
                            }
                            unit = Unit.INSTANCE;
                            z = z3;
                        }
                        if (unit == null) {
                            a$$ExternalSyntheticBUOutline0.m$3(Intrinsics.stringPlus(access$getNamedKey2, "No such child: "));
                            return null;
                        }
                        LinkedHashSet plus = SetsKt___SetsKt.plus(set, access$getNamedKey);
                        Set minus = SetsKt___SetsKt.minus(linkedHashMap.keySet(), (Iterable) plus);
                        Set keySet = linkedHashMap.keySet();
                        Set set2 = minus;
                        keySet.getClass();
                        set2.getClass();
                        keySet.removeAll(CollectionsKt__MutableCollectionsKt.convertToListIfNotCollection(set2));
                        markwonConfiguration.pruneAllChildRegistryOwnersExcept(plus);
                        backStackScreen = backStackContainer.currentRendering;
                        if (backStackScreen != null && (list2 = backStackScreen.backStack) != null) {
                            list3 = list2;
                            if ((list3 instanceof Collection) || !list3.isEmpty()) {
                                it = list3.iterator();
                                while (it.hasNext()) {
                                    if (CompatibleKt.compatible((Named) it.next(), obj4)) {
                                        z2 = true;
                                        if (childAt == null) {
                                            backStackContainer.addView(buildView);
                                        } else {
                                            View findViewById = childAt.findViewById(R.id.back_stack_body);
                                            View findViewById2 = buildView.findViewById(R.id.back_stack_body);
                                            if (findViewById == null || findViewById2 == null) {
                                                findViewById = childAt;
                                                findViewById2 = buildView;
                                            }
                                            if (!z2) {
                                                pair = new Pair(8388611, 8388613);
                                            } else {
                                                if (!z2) {
                                                    Drop$$ExternalSyntheticBUOutline0.m1m();
                                                    return null;
                                                }
                                                pair = new Pair(8388613, 8388611);
                                            }
                                            int intValue5 = ((Number) pair.first).intValue();
                                            int intValue6 = ((Number) pair.second).intValue();
                                            TransitionSet transitionSet = new TransitionSet();
                                            Slide slide = new Slide(intValue5);
                                            slide.mTargets.add(findViewById);
                                            transitionSet.addTransition(slide);
                                            Slide slide2 = new Slide(intValue6);
                                            slide2.mTargets.add(findViewById2);
                                            transitionSet.addTransition(slide2);
                                            transitionSet.setInterpolator(new AccelerateDecelerateInterpolator());
                                            TransitionManager.endTransitions(backStackContainer);
                                            TransitionManager.go(new Scene(buildView, backStackContainer), transitionSet);
                                        }
                                        if (childAt != null) {
                                            LifecycleOwner lifecycleOwner = DBUtil.get(childAt);
                                            RealWorkflowLifecycleOwner realWorkflowLifecycleOwner = lifecycleOwner instanceof RealWorkflowLifecycleOwner ? (RealWorkflowLifecycleOwner) lifecycleOwner : null;
                                            if (realWorkflowLifecycleOwner != null) {
                                                realWorkflowLifecycleOwner.destroyOnDetach();
                                            }
                                        }
                                        backStackContainer.currentRendering = backStackScreen3;
                                        return Unit.INSTANCE;
                                    }
                                }
                            }
                        }
                        z2 = z;
                        if (childAt == null) {
                        }
                        if (childAt != null) {
                        }
                        backStackContainer.currentRendering = backStackScreen3;
                        return Unit.INSTANCE;
                    }
                }
                z = false;
                LinkedHashSet plus2 = SetsKt___SetsKt.plus(set, access$getNamedKey);
                Set minus2 = SetsKt___SetsKt.minus(linkedHashMap.keySet(), (Iterable) plus2);
                Set keySet2 = linkedHashMap.keySet();
                Set set22 = minus2;
                keySet2.getClass();
                set22.getClass();
                keySet2.removeAll(CollectionsKt__MutableCollectionsKt.convertToListIfNotCollection(set22));
                markwonConfiguration.pruneAllChildRegistryOwnersExcept(plus2);
                backStackScreen = backStackContainer.currentRendering;
                if (backStackScreen != null) {
                    list3 = list2;
                    if (list3 instanceof Collection) {
                    }
                    it = list3.iterator();
                    while (it.hasNext()) {
                    }
                }
                z2 = z;
                if (childAt == null) {
                }
                if (childAt != null) {
                }
                backStackContainer.currentRendering = backStackScreen3;
                return Unit.INSTANCE;
            case 24:
                HasModals hasModals = (HasModals) obj;
                ViewEnvironment viewEnvironment3 = (ViewEnvironment) obj2;
                hasModals.getClass();
                viewEnvironment3.getClass();
                ((AlertContainer) this.receiver).update(hasModals, viewEnvironment3);
                return Unit.INSTANCE;
            case 25:
                FinancialConnectionsInstitution financialConnectionsInstitution = (FinancialConnectionsInstitution) obj;
                boolean booleanValue = ((Boolean) obj2).booleanValue();
                financialConnectionsInstitution.getClass();
                InstitutionPickerViewModel institutionPickerViewModel = (InstitutionPickerViewModel) this.receiver;
                institutionPickerViewModel.getClass();
                FinancialConnectionsViewModel.execute$default(institutionPickerViewModel, new PollAuthorizationSessionAccounts$invoke$4(institutionPickerViewModel, booleanValue, financialConnectionsInstitution, (Continuation) null), new FieldBinding$$ExternalSyntheticLambda5(financialConnectionsInstitution, 13));
                return Unit.INSTANCE;
            case 26:
                Screen.AutoClassificationSelectCountryAndIdClassScreen autoClassificationSelectCountryAndIdClassScreen = (Screen.AutoClassificationSelectCountryAndIdClassScreen) obj;
                ViewEnvironment viewEnvironment4 = (ViewEnvironment) obj2;
                autoClassificationSelectCountryAndIdClassScreen.getClass();
                viewEnvironment4.getClass();
                ((SelectCountryAndIdClassRunner) this.receiver).showRendering(autoClassificationSelectCountryAndIdClassScreen, viewEnvironment4);
                return Unit.INSTANCE;
            case 27:
                Screen.CameraScreen cameraScreen = (Screen.CameraScreen) obj;
                ViewEnvironment viewEnvironment5 = (ViewEnvironment) obj2;
                cameraScreen.getClass();
                viewEnvironment5.getClass();
                ((CameraScreenRunner) this.receiver).showRendering(cameraScreen, viewEnvironment5);
                return Unit.INSTANCE;
            case 28:
                Screen.ReviewScreen reviewScreen = (Screen.ReviewScreen) obj;
                ViewEnvironment viewEnvironment6 = (ViewEnvironment) obj2;
                reviewScreen.getClass();
                viewEnvironment6.getClass();
                ((GovernmentIdReviewRunner) this.receiver).showRendering(reviewScreen, viewEnvironment6);
                return Unit.INSTANCE;
            default:
                HasModals hasModals2 = (HasModals) obj;
                ViewEnvironment viewEnvironment7 = (ViewEnvironment) obj2;
                hasModals2.getClass();
                viewEnvironment7.getClass();
                CustomModalViewContainer customModalViewContainer = (CustomModalViewContainer) this.receiver;
                UiScreenRunner.Companion companion = CustomModalViewContainer.Companion;
                customModalViewContainer.update(hasModals2, viewEnvironment7);
                return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ WorkApplet$applet$1(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, i2, cls, obj, str, str2);
        this.$r8$classId = i3;
    }
}
