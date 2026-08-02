package org.commonmark.node;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.Rect;
import android.os.Parcelable;
import androidx.glance.session.SessionWorker$doWork$2$2;
import androidx.lifecycle.SavedStateHandle;
import androidx.navigation.NavAction;
import androidx.navigation.NavArgument;
import androidx.navigation.NavDeepLink;
import androidx.navigation.NavDestination;
import androidx.navigation.Navigator;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.android.material.progressindicator.BaseProgressIndicatorSpec;
import com.google.android.material.progressindicator.DrawingDelegate$ActiveIndicator;
import com.squareup.cash.badging.db.BadgeQueries$$ExternalSyntheticLambda5;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.blockers.flow.RealMultiBlockerFacilitator;
import com.squareup.cash.blockers.flow.RealMultiBlockerFacilitator$AbstractMultiBlockerResolver$resolve$9;
import com.squareup.cash.blockers.flow.api.MultiBlockerFacilitator$Resolver;
import com.squareup.cash.blockers.screens.BlockersScreens;
import com.squareup.cash.blockers.views.SetNameViewKt$SetName$2$1;
import com.squareup.protos.franklin.app.EndFlowRequest;
import com.squareup.protos.franklin.app.SetDateRequest;
import com.squareup.protos.franklin.app.SubmitFormRequest;
import com.squareup.protos.franklin.persona.ResolvePersonaDidvBlockerRequest;
import com.squareup.workflow1.internal.SubtreeManager;
import com.withpersona.sdk2.inquiry.workflows.WorkflowState;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function1;
import kotlin.time.InstantKt$$ExternalSyntheticLambda0;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlowImpl;
import kotlinx.coroutines.internal.MainDispatcherLoader;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import kotlinx.coroutines.sync.MutexImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.commonmark.parser.Parser;
import papa.SafeTrace;

/* loaded from: classes4.dex */
public abstract class Node implements MultiBlockerFacilitator$Resolver {
    public final /* synthetic */ int $r8$classId;
    public Object firstChild;
    public Object lastChild;
    public Object next;
    public Object parent;
    public Object prev;

    public Node(Parcelable parcelable, SavedStateHandle savedStateHandle) {
        this.$r8$classId = 4;
        savedStateHandle.getClass();
        this.parent = JobKt.CoroutineScope(Dispatchers.Default.plus(JobKt.SupervisorJob$default()));
        this.firstChild = FlowKt.MutableStateFlow(parcelable);
        savedStateHandle.getClass();
        SubtreeManager subtreeManager = new SubtreeManager();
        subtreeManager.snapshotCache = savedStateHandle;
        subtreeManager.contextForChildren = savedStateHandle.getStateFlow(null, "WorkflowContextAdapter.state");
        subtreeManager.emitActionToParent = new MutexImpl();
        DefaultScheduler defaultScheduler = Dispatchers.Default;
        subtreeManager.workflowSession = JobKt.CoroutineScope(MainDispatcherLoader.dispatcher.plus(JobKt.SupervisorJob$default()));
        subtreeManager.interceptor = new LinkedHashMap();
        subtreeManager.idCounter = new LinkedHashMap();
        subtreeManager.children = new InstantKt$$ExternalSyntheticLambda0(15);
        this.lastChild = subtreeManager;
        this.prev = FlowKt.MutableStateFlow(null);
        this.next = FlowKt.MutableStateFlow(null);
    }

    public static float vectorToCanvasRotation(float[] fArr) {
        return (float) Math.toDegrees(Math.atan2(fArr[1], fArr[0]));
    }

    public abstract void accept(Parser parser);

    public abstract void adjustCanvas(Canvas canvas, Rect rect, float f, boolean z, boolean z2);

    public void appendChild(Node node) {
        node.unlink();
        node.setParent(this);
        Node node2 = (Node) this.lastChild;
        if (node2 == null) {
            this.firstChild = node;
            this.lastChild = node;
        } else {
            node2.next = node;
            node.prev = node2;
            this.lastChild = node;
        }
    }

    public NavDestination build() {
        NavDestination instantiateDestination = instantiateDestination();
        instantiateDestination.label = null;
        for (Map.Entry entry : ((LinkedHashMap) this.lastChild).entrySet()) {
            instantiateDestination.addArgument((String) entry.getKey(), (NavArgument) entry.getValue());
        }
        Iterator it = ((ArrayList) this.prev).iterator();
        while (it.hasNext()) {
            instantiateDestination.addDeepLink((NavDeepLink) it.next());
        }
        for (Map.Entry entry2 : ((LinkedHashMap) this.next).entrySet()) {
            instantiateDestination.putAction(((Number) entry2.getKey()).intValue(), (NavAction) entry2.getValue());
        }
        String str = (String) this.firstChild;
        if (str != null) {
            instantiateDestination.setRoute(str);
        }
        return instantiateDestination;
    }

    public abstract void drawStopIndicator(Canvas canvas, Paint paint, int i, int i2);

    public abstract void fillIndicator(Canvas canvas, Paint paint, DrawingDelegate$ActiveIndicator drawingDelegate$ActiveIndicator, int i);

    public abstract void fillTrack(Canvas canvas, Paint paint, float f, float f2, int i, int i2, int i3);

    public Node getParent() {
        return (Node) this.parent;
    }

    public abstract int getPreferredHeight();

    public abstract int getPreferredWidth();

    public NavDestination instantiateDestination() {
        return ((Navigator) this.parent).createDestination();
    }

    public abstract void invalidateCachedPaths();

    public abstract Object proceed(RealMultiBlockerFacilitator$AbstractMultiBlockerResolver$resolve$9 realMultiBlockerFacilitator$AbstractMultiBlockerResolver$resolve$9);

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0050, code lost:
    
        if (kotlinx.coroutines.JobKt.withContext(r13, r5, r0) == r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object resolve(Function1 function1, ContinuationImpl continuationImpl) {
        RealMultiBlockerFacilitator$AbstractMultiBlockerResolver$resolve$9 realMultiBlockerFacilitator$AbstractMultiBlockerResolver$resolve$9;
        int i;
        Node node;
        if (continuationImpl instanceof RealMultiBlockerFacilitator$AbstractMultiBlockerResolver$resolve$9) {
            realMultiBlockerFacilitator$AbstractMultiBlockerResolver$resolve$9 = (RealMultiBlockerFacilitator$AbstractMultiBlockerResolver$resolve$9) continuationImpl;
            int i2 = realMultiBlockerFacilitator$AbstractMultiBlockerResolver$resolve$9.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realMultiBlockerFacilitator$AbstractMultiBlockerResolver$resolve$9.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = realMultiBlockerFacilitator$AbstractMultiBlockerResolver$resolve$9.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realMultiBlockerFacilitator$AbstractMultiBlockerResolver$resolve$9.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    RealMultiBlockerFacilitator realMultiBlockerFacilitator = (RealMultiBlockerFacilitator) this.next;
                    CoroutineContext coroutineContext = realMultiBlockerFacilitator.ioDispatcher;
                    node = this;
                    SetNameViewKt$SetName$2$1 setNameViewKt$SetName$2$1 = new SetNameViewKt$SetName$2$1(realMultiBlockerFacilitator, node, function1, (Continuation) null, 12);
                    realMultiBlockerFacilitator$AbstractMultiBlockerResolver$resolve$9.label = 1;
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            SafeTrace.throwOnFailure(obj);
                            return obj;
                        }
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                    node = this;
                }
                realMultiBlockerFacilitator$AbstractMultiBlockerResolver$resolve$9.label = 2;
                Object proceed = node.proceed(realMultiBlockerFacilitator$AbstractMultiBlockerResolver$resolve$9);
                return proceed != coroutineSingletons ? coroutineSingletons : proceed;
            }
        }
        realMultiBlockerFacilitator$AbstractMultiBlockerResolver$resolve$9 = new RealMultiBlockerFacilitator$AbstractMultiBlockerResolver$resolve$9(this, continuationImpl);
        Object obj2 = realMultiBlockerFacilitator$AbstractMultiBlockerResolver$resolve$9.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realMultiBlockerFacilitator$AbstractMultiBlockerResolver$resolve$9.label;
        if (i != 0) {
        }
        realMultiBlockerFacilitator$AbstractMultiBlockerResolver$resolve$9.label = 2;
        Object proceed2 = node.proceed(realMultiBlockerFacilitator$AbstractMultiBlockerResolver$resolve$9);
        if (proceed2 != coroutineSingletons2) {
        }
    }

    public void setOutput(Object obj) {
        StateFlowImpl stateFlowImpl = (StateFlowImpl) this.prev;
        if (stateFlowImpl.getValue() != null) {
            return;
        }
        stateFlowImpl.setValue(obj);
    }

    public void setParent(Node node) {
        this.parent = node;
    }

    public String toString() {
        switch (this.$r8$classId) {
            case 0:
                return getClass().getSimpleName() + "{" + toStringAttributes() + "}";
            default:
                return super.toString();
        }
    }

    public String toStringAttributes() {
        return "";
    }

    public void unlink() {
        Node node = (Node) this.prev;
        if (node != null) {
            node.next = (Node) this.next;
        } else {
            Node node2 = (Node) this.parent;
            if (node2 != null) {
                node2.firstChild = (Node) this.next;
            }
        }
        Node node3 = (Node) this.next;
        if (node3 != null) {
            node3.prev = node;
        } else {
            Node node4 = (Node) this.parent;
            if (node4 != null) {
                node4.lastChild = node;
            }
        }
        this.parent = null;
        this.next = null;
        this.prev = null;
    }

    public void updateState(WorkflowState workflowState) {
        ((SubtreeManager) this.lastChild).updateState(workflowState);
    }

    @Override // com.squareup.cash.blockers.flow.api.MultiBlockerFacilitator$Resolver
    public Object resolve(ResolvePersonaDidvBlockerRequest resolvePersonaDidvBlockerRequest, Continuation continuation) {
        return resolve(new BadgeQueries$$ExternalSyntheticLambda5(resolvePersonaDidvBlockerRequest, 19), (ContinuationImpl) continuation);
    }

    @Override // com.squareup.cash.blockers.flow.api.MultiBlockerFacilitator$Resolver
    public Object resolve(SubmitFormRequest submitFormRequest, ContinuationImpl continuationImpl) {
        return resolve(new BadgeQueries$$ExternalSyntheticLambda5(submitFormRequest, 16), continuationImpl);
    }

    @Override // com.squareup.cash.blockers.flow.api.MultiBlockerFacilitator$Resolver
    public Object resolve(EndFlowRequest endFlowRequest, Continuation continuation) {
        return resolve(new BadgeQueries$$ExternalSyntheticLambda5(endFlowRequest, 17), (ContinuationImpl) continuation);
    }

    @Override // com.squareup.cash.blockers.flow.api.MultiBlockerFacilitator$Resolver
    public Object resolve(SetDateRequest setDateRequest, SessionWorker$doWork$2$2 sessionWorker$doWork$2$2) {
        return resolve(new BadgeQueries$$ExternalSyntheticLambda5(setDateRequest, 18), sessionWorker$doWork$2$2);
    }

    public Node() {
        this.$r8$classId = 0;
        this.parent = null;
        this.firstChild = null;
        this.lastChild = null;
        this.prev = null;
        this.next = null;
    }

    public Node(Navigator navigator, String str) {
        this.$r8$classId = 1;
        this.parent = navigator;
        this.firstChild = str;
        this.lastChild = new LinkedHashMap();
        this.prev = new ArrayList();
        this.next = new LinkedHashMap();
    }

    public Node(BaseProgressIndicatorSpec baseProgressIndicatorSpec) {
        this.$r8$classId = 2;
        Path path = new Path();
        this.firstChild = path;
        this.lastChild = new Path();
        this.prev = new PathMeasure(path, false);
        this.parent = baseProgressIndicatorSpec;
        this.next = new Matrix();
    }

    public Node(RealMultiBlockerFacilitator realMultiBlockerFacilitator, BlockersScreens blockersScreens) {
        this.$r8$classId = 3;
        blockersScreens.getClass();
        this.next = realMultiBlockerFacilitator;
        this.parent = blockersScreens;
        BlockersData blockersData = blockersScreens.getBlockersData();
        this.firstChild = blockersData;
        String str = blockersData.blockerId;
        str.getClass();
        this.lastChild = str;
        String str2 = blockersData.groupId;
        str2.getClass();
        this.prev = str2;
    }
}
