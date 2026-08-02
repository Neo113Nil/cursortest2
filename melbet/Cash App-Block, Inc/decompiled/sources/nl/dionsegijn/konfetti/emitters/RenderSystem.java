package nl.dionsegijn.konfetti.emitters;

import android.graphics.Canvas;
import android.graphics.Paint;
import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.lifecycle.ViewModelKt;
import androidx.recyclerview.widget.RecyclerView;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.bugsnag.android.Thread$State$EnumUnboxingLocalUtility;
import com.squareup.util.coroutines.BufferCountKt$bufferSkip$1;
import com.stripe.android.financialconnections.analytics.AuthSessionEvent;
import com.stripe.android.financialconnections.analytics.FinancialConnectionsAnalyticsEvent;
import com.stripe.android.financialconnections.analytics.FinancialConnectionsAnalyticsTrackerImpl;
import com.stripe.android.financialconnections.features.notice.NoticeSheetState;
import com.stripe.android.financialconnections.features.notice.NoticeSheetViewModel;
import com.stripe.android.financialconnections.features.partnerauth.PartnerAuthViewModel;
import com.stripe.android.financialconnections.features.partnerauth.SharedPartnerAuthState;
import com.stripe.android.financialconnections.features.streamlinedconsent.IDConsentContentViewModel;
import com.stripe.android.financialconnections.model.FinancialConnectionsAuthorizationSession;
import com.stripe.android.financialconnections.model.FinancialConnectionsSessionManifest;
import com.stripe.android.financialconnections.navigation.topappbar.TopAppBarState;
import com.stripe.android.financialconnections.presentation.Async;
import com.stripe.android.financialconnections.presentation.FinancialConnectionsSheetNativeViewModel;
import com.stripe.android.financialconnections.presentation.FinancialConnectionsSheetNativeViewModel$onBackClick$1;
import com.stripe.android.financialconnections.presentation.FinancialConnectionsViewModel;
import com.stripe.android.uicore.elements.PhoneNumberController$$ExternalSyntheticLambda5;
import dev.chrisbanes.haze.HazeEffectNode;
import java.util.ArrayList;
import java.util.Date;
import java.util.Random;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.ranges.IntProgressionIterator;
import kotlin.ranges.IntRange;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.StateFlowImpl;
import nl.dionsegijn.konfetti.Confetti;
import nl.dionsegijn.konfetti.models.ConfettiConfig;
import nl.dionsegijn.konfetti.models.Shape;
import nl.dionsegijn.konfetti.models.Size;
import nl.dionsegijn.konfetti.models.Vector;
import nl.dionsegijn.konfetti.modules.LocationModule;
import nl.dionsegijn.konfetti.modules.VelocityModule;

/* loaded from: classes9.dex */
public final class RenderSystem {
    public final int[] colors;
    public final ConfettiConfig config;
    public final long createdAt;
    public final StreamEmitter emitter;
    public final boolean enabled;
    public final Vector gravity;
    public final LocationModule location;
    public final ArrayList particles;
    public final Random random;
    public final Shape[] shapes;
    public final Size[] sizes;
    public final VelocityModule velocity;

    /* renamed from: nl.dionsegijn.konfetti.emitters.RenderSystem$1, reason: invalid class name */
    /* loaded from: classes8.dex */
    public final /* synthetic */ class AnonymousClass1 extends FunctionReferenceImpl implements Function0 {
        public final /* synthetic */ int $r8$classId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ AnonymousClass1(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
            super(i, i2, cls, obj, str, str2);
            this.$r8$classId = i3;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            float m;
            float m2;
            float f;
            Object value;
            NoticeSheetState noticeSheetState;
            Object value2;
            SharedPartnerAuthState sharedPartnerAuthState;
            Object value3;
            SharedPartnerAuthState sharedPartnerAuthState2;
            final int i = 0;
            final int i2 = 1;
            Continuation continuation = null;
            switch (this.$r8$classId) {
                case 0:
                    RenderSystem renderSystem = (RenderSystem) this.receiver;
                    VelocityModule velocityModule = renderSystem.velocity;
                    Random random = renderSystem.random;
                    ConfettiConfig confettiConfig = renderSystem.config;
                    ArrayList arrayList = renderSystem.particles;
                    LocationModule locationModule = renderSystem.location;
                    Float f2 = (Float) locationModule.maxX;
                    Random random2 = (Random) locationModule.random;
                    if (f2 == null) {
                        m = locationModule.minX;
                    } else {
                        float nextFloat = random2.nextFloat();
                        Float f3 = (Float) locationModule.maxX;
                        f3.getClass();
                        float floatValue = f3.floatValue();
                        float f4 = locationModule.minX;
                        m = CameraState$Type$EnumUnboxingLocalUtility.m(floatValue, f4, nextFloat, f4);
                    }
                    if (((Float) locationModule.maxY) == null) {
                        m2 = locationModule.minY;
                    } else {
                        float nextFloat2 = random2.nextFloat();
                        Float f5 = (Float) locationModule.maxY;
                        f5.getClass();
                        float floatValue2 = f5.floatValue();
                        float f6 = locationModule.minY;
                        m2 = CameraState$Type$EnumUnboxingLocalUtility.m(floatValue2, f6, nextFloat2, f6);
                    }
                    Vector vector = new Vector(m, m2);
                    Size[] sizeArr = renderSystem.sizes;
                    Size size = sizeArr[random.nextInt(sizeArr.length)];
                    Shape[] shapeArr = renderSystem.shapes;
                    Shape shape = shapeArr[random.nextInt(shapeArr.length)];
                    int[] iArr = renderSystem.colors;
                    int i3 = iArr[random.nextInt(iArr.length)];
                    long j = confettiConfig.timeToLive;
                    boolean z = confettiConfig.fadeOut;
                    Random random3 = velocityModule.random;
                    Float f7 = velocityModule.maxSpeed;
                    float f8 = velocityModule.minSpeed;
                    if (f7 != null) {
                        f8 = (random3.nextFloat() * (f7.floatValue() - f8)) + velocityModule.minSpeed;
                    }
                    Double d = velocityModule.maxAngle;
                    double d2 = velocityModule.minAngle;
                    if (d == null) {
                        f = f8;
                    } else {
                        f = f8;
                        d2 = (random3.nextDouble() * (d.doubleValue() - d2)) + velocityModule.minAngle;
                    }
                    arrayList.add(new Confetti(vector, i3, size, shape, j, z, new Vector(f * ((float) Math.cos(d2)), ((float) Math.sin(d2)) * f), (((velocityModule.random.nextFloat() * 2.0f) - 1.0f) * 0.2f) + 1.0f));
                    break;
                case 1:
                    StateFlowImpl stateFlowImpl = ((NoticeSheetViewModel) this.receiver)._stateFlow;
                    do {
                        value = stateFlowImpl.getValue();
                        noticeSheetState = (NoticeSheetState) value;
                        noticeSheetState.getClass();
                    } while (!stateFlowImpl.compareAndSet(value, NoticeSheetState.copy$default(noticeSheetState, null, null, 3)));
                case 2:
                    final PartnerAuthViewModel partnerAuthViewModel = (PartnerAuthViewModel) this.receiver;
                    StateFlowImpl stateFlowImpl2 = partnerAuthViewModel._stateFlow;
                    do {
                        value2 = stateFlowImpl2.getValue();
                        sharedPartnerAuthState = (SharedPartnerAuthState) value2;
                        sharedPartnerAuthState.getClass();
                    } while (!stateFlowImpl2.compareAndSet(value2, SharedPartnerAuthState.copy$default(sharedPartnerAuthState, null, null, new Async.Loading(new SharedPartnerAuthState.AuthenticationStatus(SharedPartnerAuthState.AuthenticationStatus.Action.AUTHENTICATING)), 23)));
                    partnerAuthViewModel.withState(new Function1() { // from class: com.stripe.android.financialconnections.features.partnerauth.PartnerAuthViewModel$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            int i4 = i;
                            PartnerAuthViewModel partnerAuthViewModel2 = partnerAuthViewModel;
                            Continuation continuation2 = null;
                            SharedPartnerAuthState sharedPartnerAuthState3 = (SharedPartnerAuthState) obj;
                            switch (i4) {
                                case 0:
                                    sharedPartnerAuthState3.getClass();
                                    SharedPartnerAuthState.Payload payload = (SharedPartnerAuthState.Payload) sharedPartnerAuthState3.payload.invoke();
                                    FinancialConnectionsAuthorizationSession financialConnectionsAuthorizationSession = payload != null ? payload.authSession : null;
                                    if (financialConnectionsAuthorizationSession == null) {
                                        a$$ExternalSyntheticBUOutline0.m$3("Payload shouldn't be null when the user launches the auth flow");
                                        return null;
                                    }
                                    partnerAuthViewModel2.postAuthSessionEvent.invoke(financialConnectionsAuthorizationSession.id, new AuthSessionEvent.OAuthLaunched(new Date()));
                                    FinancialConnectionsAnalyticsTrackerImpl financialConnectionsAnalyticsTrackerImpl = partnerAuthViewModel2.eventTracker;
                                    FinancialConnectionsSessionManifest.Pane pane = partnerAuthViewModel2.initialState.pane;
                                    pane.getClass();
                                    FinancialConnectionsAnalyticsEvent.ConsentAgree.INSTANCE.getClass();
                                    financialConnectionsAnalyticsTrackerImpl.track(new FinancialConnectionsAnalyticsEvent.SearchScroll(Thread$State$EnumUnboxingLocalUtility.m("pane", FinancialConnectionsAnalyticsEvent.getAnalyticsValue$financial_connections_release(pane)), "click.prepane.continue", true));
                                    partnerAuthViewModel2.launchAuthInBrowser(financialConnectionsAuthorizationSession);
                                    return Unit.INSTANCE;
                                default:
                                    sharedPartnerAuthState3.getClass();
                                    if (sharedPartnerAuthState3.inModal) {
                                        FinancialConnectionsAnalyticsTrackerImpl financialConnectionsAnalyticsTrackerImpl2 = partnerAuthViewModel2.eventTracker;
                                        FinancialConnectionsSessionManifest.Pane pane2 = partnerAuthViewModel2.initialState.pane;
                                        pane2.getClass();
                                        FinancialConnectionsAnalyticsEvent.ConsentAgree.INSTANCE.getClass();
                                        financialConnectionsAnalyticsTrackerImpl2.track(new FinancialConnectionsAnalyticsEvent.Click(Thread$State$EnumUnboxingLocalUtility.m("pane", FinancialConnectionsAnalyticsEvent.getAnalyticsValue$financial_connections_release(pane2)), "click.prepane.cancel", true));
                                    } else {
                                        FinancialConnectionsAnalyticsTrackerImpl financialConnectionsAnalyticsTrackerImpl3 = partnerAuthViewModel2.eventTracker;
                                        FinancialConnectionsSessionManifest.Pane pane3 = partnerAuthViewModel2.initialState.pane;
                                        pane3.getClass();
                                        FinancialConnectionsAnalyticsEvent.ConsentAgree.INSTANCE.getClass();
                                        financialConnectionsAnalyticsTrackerImpl3.track(new FinancialConnectionsAnalyticsEvent.Click(Thread$State$EnumUnboxingLocalUtility.m("pane", FinancialConnectionsAnalyticsEvent.getAnalyticsValue$financial_connections_release(pane3)), "click.prepane.choose_another_bank", true));
                                    }
                                    JobKt.launch$default(ViewModelKt.getViewModelScope(partnerAuthViewModel2), null, null, new BufferCountKt$bufferSkip$1(partnerAuthViewModel2, sharedPartnerAuthState3, continuation2, 9), 3);
                                    return Unit.INSTANCE;
                            }
                        }
                    });
                    break;
                case 3:
                    final PartnerAuthViewModel partnerAuthViewModel2 = (PartnerAuthViewModel) this.receiver;
                    partnerAuthViewModel2.getClass();
                    partnerAuthViewModel2.withState(new Function1() { // from class: com.stripe.android.financialconnections.features.partnerauth.PartnerAuthViewModel$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            int i4 = i2;
                            PartnerAuthViewModel partnerAuthViewModel22 = partnerAuthViewModel2;
                            Continuation continuation2 = null;
                            SharedPartnerAuthState sharedPartnerAuthState3 = (SharedPartnerAuthState) obj;
                            switch (i4) {
                                case 0:
                                    sharedPartnerAuthState3.getClass();
                                    SharedPartnerAuthState.Payload payload = (SharedPartnerAuthState.Payload) sharedPartnerAuthState3.payload.invoke();
                                    FinancialConnectionsAuthorizationSession financialConnectionsAuthorizationSession = payload != null ? payload.authSession : null;
                                    if (financialConnectionsAuthorizationSession == null) {
                                        a$$ExternalSyntheticBUOutline0.m$3("Payload shouldn't be null when the user launches the auth flow");
                                        return null;
                                    }
                                    partnerAuthViewModel22.postAuthSessionEvent.invoke(financialConnectionsAuthorizationSession.id, new AuthSessionEvent.OAuthLaunched(new Date()));
                                    FinancialConnectionsAnalyticsTrackerImpl financialConnectionsAnalyticsTrackerImpl = partnerAuthViewModel22.eventTracker;
                                    FinancialConnectionsSessionManifest.Pane pane = partnerAuthViewModel22.initialState.pane;
                                    pane.getClass();
                                    FinancialConnectionsAnalyticsEvent.ConsentAgree.INSTANCE.getClass();
                                    financialConnectionsAnalyticsTrackerImpl.track(new FinancialConnectionsAnalyticsEvent.SearchScroll(Thread$State$EnumUnboxingLocalUtility.m("pane", FinancialConnectionsAnalyticsEvent.getAnalyticsValue$financial_connections_release(pane)), "click.prepane.continue", true));
                                    partnerAuthViewModel22.launchAuthInBrowser(financialConnectionsAuthorizationSession);
                                    return Unit.INSTANCE;
                                default:
                                    sharedPartnerAuthState3.getClass();
                                    if (sharedPartnerAuthState3.inModal) {
                                        FinancialConnectionsAnalyticsTrackerImpl financialConnectionsAnalyticsTrackerImpl2 = partnerAuthViewModel22.eventTracker;
                                        FinancialConnectionsSessionManifest.Pane pane2 = partnerAuthViewModel22.initialState.pane;
                                        pane2.getClass();
                                        FinancialConnectionsAnalyticsEvent.ConsentAgree.INSTANCE.getClass();
                                        financialConnectionsAnalyticsTrackerImpl2.track(new FinancialConnectionsAnalyticsEvent.Click(Thread$State$EnumUnboxingLocalUtility.m("pane", FinancialConnectionsAnalyticsEvent.getAnalyticsValue$financial_connections_release(pane2)), "click.prepane.cancel", true));
                                    } else {
                                        FinancialConnectionsAnalyticsTrackerImpl financialConnectionsAnalyticsTrackerImpl3 = partnerAuthViewModel22.eventTracker;
                                        FinancialConnectionsSessionManifest.Pane pane3 = partnerAuthViewModel22.initialState.pane;
                                        pane3.getClass();
                                        FinancialConnectionsAnalyticsEvent.ConsentAgree.INSTANCE.getClass();
                                        financialConnectionsAnalyticsTrackerImpl3.track(new FinancialConnectionsAnalyticsEvent.Click(Thread$State$EnumUnboxingLocalUtility.m("pane", FinancialConnectionsAnalyticsEvent.getAnalyticsValue$financial_connections_release(pane3)), "click.prepane.choose_another_bank", true));
                                    }
                                    JobKt.launch$default(ViewModelKt.getViewModelScope(partnerAuthViewModel22), null, null, new BufferCountKt$bufferSkip$1(partnerAuthViewModel22, sharedPartnerAuthState3, continuation2, 9), 3);
                                    return Unit.INSTANCE;
                            }
                        }
                    });
                    break;
                case 4:
                    StateFlowImpl stateFlowImpl3 = ((PartnerAuthViewModel) this.receiver)._stateFlow;
                    do {
                        value3 = stateFlowImpl3.getValue();
                        sharedPartnerAuthState2 = (SharedPartnerAuthState) value3;
                        sharedPartnerAuthState2.getClass();
                    } while (!stateFlowImpl3.compareAndSet(value3, SharedPartnerAuthState.copy$default(sharedPartnerAuthState2, null, null, null, 27)));
                case 5:
                    IDConsentContentViewModel iDConsentContentViewModel = (IDConsentContentViewModel) this.receiver;
                    iDConsentContentViewModel.getClass();
                    FinancialConnectionsViewModel.execute$default(iDConsentContentViewModel, new IDConsentContentViewModel.AnonymousClass1(iDConsentContentViewModel, continuation, i2), new PhoneNumberController$$ExternalSyntheticLambda5(16));
                    break;
                case 6:
                    FinancialConnectionsSheetNativeViewModel financialConnectionsSheetNativeViewModel = (FinancialConnectionsSheetNativeViewModel) this.receiver;
                    FinancialConnectionsSessionManifest.Pane pane = (FinancialConnectionsSessionManifest.Pane) financialConnectionsSheetNativeViewModel.currentPane.getValue();
                    TopAppBarState topAppBarState = (TopAppBarState) financialConnectionsSheetNativeViewModel.topAppBarState.$$delegate_0.getValue();
                    Throwable th = topAppBarState.error;
                    if (th != null) {
                        financialConnectionsSheetNativeViewModel.onCloseFromErrorClick(th);
                    } else if (topAppBarState.canCloseWithoutConfirmation) {
                        JobKt.launch$default(ViewModelKt.getViewModelScope(financialConnectionsSheetNativeViewModel), null, null, new FinancialConnectionsSheetNativeViewModel$onBackClick$1(financialConnectionsSheetNativeViewModel, pane, continuation, i2), 3);
                        FinancialConnectionsSheetNativeViewModel.closeAuthFlow$default(financialConnectionsSheetNativeViewModel, null, null, 1);
                    } else {
                        JobKt.launch$default(ViewModelKt.getViewModelScope(financialConnectionsSheetNativeViewModel), null, null, new FinancialConnectionsSheetNativeViewModel$onBackClick$1(financialConnectionsSheetNativeViewModel, pane, continuation, 2), 3);
                    }
                    break;
                case 7:
                    ((FinancialConnectionsSheetNativeViewModel) this.receiver).trackBackgroundStateChanged(true);
                    break;
                case 8:
                    ((FinancialConnectionsSheetNativeViewModel) this.receiver).trackBackgroundStateChanged(false);
                    break;
                case 9:
                    FinancialConnectionsSheetNativeViewModel financialConnectionsSheetNativeViewModel2 = (FinancialConnectionsSheetNativeViewModel) this.receiver;
                    financialConnectionsSheetNativeViewModel2.getClass();
                    FinancialConnectionsSheetNativeViewModel.closeAuthFlow$default(financialConnectionsSheetNativeViewModel2, null, null, 1);
                    break;
                default:
                    ((HazeEffectNode) this.receiver).updateEffect();
                    break;
            }
            return Unit.INSTANCE;
        }
    }

    public RenderSystem(LocationModule locationModule, VelocityModule velocityModule, Vector vector, Size[] sizeArr, Shape[] shapeArr, int[] iArr, ConfettiConfig confettiConfig, StreamEmitter streamEmitter) {
        long currentTimeMillis = System.currentTimeMillis();
        locationModule.getClass();
        velocityModule.getClass();
        vector.getClass();
        sizeArr.getClass();
        shapeArr.getClass();
        iArr.getClass();
        confettiConfig.getClass();
        this.location = locationModule;
        this.velocity = velocityModule;
        this.gravity = vector;
        this.sizes = sizeArr;
        this.shapes = shapeArr;
        this.colors = iArr;
        this.config = confettiConfig;
        this.emitter = streamEmitter;
        this.createdAt = currentTimeMillis;
        this.enabled = true;
        this.random = new Random();
        this.particles = new ArrayList();
        streamEmitter.addConfettiFunc = new AnonymousClass1(0, this, RenderSystem.class, "addConfetti", "addConfetti()V", 0, 0);
    }

    public final long getCreatedAt() {
        return this.createdAt;
    }

    public final void render(Canvas canvas, float f) {
        int i;
        canvas.getClass();
        if (this.enabled) {
            StreamEmitter streamEmitter = this.emitter;
            float f2 = streamEmitter.createParticleMs + f;
            streamEmitter.createParticleMs = f2;
            float f3 = streamEmitter.amountPerMs;
            if (f2 >= f3 && streamEmitter.elapsedTime < 2000.0f) {
                IntProgressionIterator it = new IntRange(1, (int) (f2 / f3), 1).iterator();
                while (it.hasNext) {
                    it.nextInt();
                    streamEmitter.particlesCreated++;
                    AnonymousClass1 anonymousClass1 = streamEmitter.addConfettiFunc;
                    if (anonymousClass1 != null) {
                        anonymousClass1.invoke();
                    }
                }
                streamEmitter.createParticleMs %= streamEmitter.amountPerMs;
            }
            streamEmitter.elapsedTime = (f * 1000.0f) + streamEmitter.elapsedTime;
        }
        ArrayList arrayList = this.particles;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            Confetti confetti = (Confetti) arrayList.get(size);
            confetti.getClass();
            Vector vector = confetti.acceleration;
            Vector vector2 = this.gravity;
            vector2.getClass();
            vector.addScaled(vector2, 1.0f / confetti.mass);
            float f4 = confetti.width;
            Vector vector3 = confetti.location;
            Vector vector4 = confetti.velocity;
            float f5 = confetti.speedF;
            float f6 = vector.y;
            vector4.x += vector.x;
            vector4.y += f6;
            vector3.addScaled(vector4, f * f5 * confetti.density);
            long j = confetti.lifespan;
            if (j <= 0) {
                int i2 = 0;
                if (confetti.fadeOut && (i = confetti.alpha - ((int) ((5.0f * f) * f5))) >= 0) {
                    i2 = i;
                }
                confetti.alpha = i2;
            } else {
                confetti.lifespan = j - ((long) (f * 1000.0f));
            }
            float f7 = confetti.rotationSpeed * f * f5;
            float f8 = confetti.rotation + f7;
            confetti.rotation = f8;
            if (f8 >= 360.0f) {
                confetti.rotation = RecyclerView.DECELERATION_RATE;
            }
            float f9 = confetti.rotationWidth - f7;
            confetti.rotationWidth = f9;
            if (f9 < RecyclerView.DECELERATION_RATE) {
                confetti.rotationWidth = f4;
            }
            Paint paint = confetti.paint;
            if (vector3.y > canvas.getHeight()) {
                confetti.lifespan = 0L;
            } else if (vector3.x <= canvas.getWidth() && vector3.x + f4 >= RecyclerView.DECELERATION_RATE && vector3.y + f4 >= RecyclerView.DECELERATION_RATE) {
                paint.setColor((confetti.alpha << 24) | (confetti.color & 16777215));
                float abs = Math.abs((confetti.rotationWidth / f4) - 0.5f) * 2.0f;
                float f10 = (abs * f4) / 2.0f;
                int save = canvas.save();
                canvas.translate(vector3.x - f10, vector3.y);
                canvas.rotate(confetti.rotation, f10, f4 / 2.0f);
                canvas.scale(abs, 1.0f);
                confetti.shape.draw(canvas, paint, f4);
                canvas.restoreToCount(save);
            }
        }
        CollectionsKt__MutableCollectionsKt.removeAll(arrayList, RenderSystem$render$1.INSTANCE);
    }
}
