package androidx.compose.foundation;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.view.SurfaceView;
import android.view.TextureView;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.AndroidMatrixConversions_androidKt;
import androidx.compose.ui.graphics.Matrix;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.viewinterop.AndroidView_androidKt;
import androidx.profileinstaller.ProfileVerifier;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: AndroidExternalSurface.android.kt */
@Metadata(d1 = {"\u0000H\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aU\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\u0017\u0010\n\u001a\u0013\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00010\u000b¢\u0006\u0002\b\rH\u0007ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001a]\u0010\u0010\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00052\u0017\u0010\n\u001a\u0013\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00010\u000b¢\u0006\u0002\b\rH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015\u001a\r\u0010\u0016\u001a\u00020\u0017H\u0003¢\u0006\u0002\u0010\u0018\u001a\r\u0010\u0019\u001a\u00020\u001aH\u0003¢\u0006\u0002\u0010\u001b\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001c"}, d2 = {"AndroidEmbeddedExternalSurface", "", "modifier", "Landroidx/compose/ui/Modifier;", "isOpaque", "", "surfaceSize", "Landroidx/compose/ui/unit/IntSize;", "transform", "Landroidx/compose/ui/graphics/Matrix;", "onInit", "Lkotlin/Function1;", "Landroidx/compose/foundation/AndroidExternalSurfaceScope;", "Lkotlin/ExtensionFunctionType;", "AndroidEmbeddedExternalSurface-sv6N_fY", "(Landroidx/compose/ui/Modifier;ZJ[FLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "AndroidExternalSurface", "zOrder", "Landroidx/compose/foundation/AndroidExternalSurfaceZOrder;", "isSecure", "AndroidExternalSurface-58FFMhA", "(Landroidx/compose/ui/Modifier;ZJIZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "rememberAndroidEmbeddedExternalSurfaceState", "Landroidx/compose/foundation/AndroidEmbeddedExternalSurfaceState;", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/AndroidEmbeddedExternalSurfaceState;", "rememberAndroidExternalSurfaceState", "Landroidx/compose/foundation/AndroidExternalSurfaceState;", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/AndroidExternalSurfaceState;", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AndroidExternalSurface_androidKt {
    private static final AndroidExternalSurfaceState rememberAndroidExternalSurfaceState(Composer composer, int i) {
        ComposerKt.sourceInformationMarkerStart(composer, -873615933, "C(rememberAndroidExternalSurfaceState)190@7150L24,191@7186L47:AndroidExternalSurface.android.kt#71ulvw");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-873615933, i, -1, "androidx.compose.foundation.rememberAndroidExternalSurfaceState (AndroidExternalSurface.android.kt:189)");
        }
        ComposerKt.sourceInformationMarkerStart(composer, 773894976, "CC(rememberCoroutineScope)482@20332L144:Effects.kt#9igjgp");
        ComposerKt.sourceInformationMarkerStart(composer, -954367824, "CC(remember):Effects.kt#9igjgp");
        Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == Composer.INSTANCE.getEmpty()) {
            CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composer));
            composer.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
            rememberedValue = compositionScopedCoroutineScopeCanceller;
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) rememberedValue).getCoroutineScope();
        ComposerKt.sourceInformationMarkerEnd(composer);
        ComposerKt.sourceInformationMarkerStart(composer, 1983762950, "CC(remember):AndroidExternalSurface.android.kt#9igjgp");
        Object rememberedValue2 = composer.rememberedValue();
        if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
            rememberedValue2 = new AndroidExternalSurfaceState(coroutineScope);
            composer.updateRememberedValue(rememberedValue2);
        }
        AndroidExternalSurfaceState androidExternalSurfaceState = (AndroidExternalSurfaceState) rememberedValue2;
        ComposerKt.sourceInformationMarkerEnd(composer);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return androidExternalSurfaceState;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x011a  */
    /* renamed from: AndroidExternalSurface-58FFMhA, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m234AndroidExternalSurface58FFMhA(Modifier modifier, boolean z, long j, int i, boolean z2, final Function1<? super AndroidExternalSurfaceScope, Unit> function1, Composer composer, final int i2, final int i3) {
        Modifier modifier2;
        int i4;
        boolean z3;
        long j2;
        int i5;
        int i6;
        int i7;
        boolean z4;
        Modifier.Companion companion;
        boolean z5;
        boolean z6;
        boolean changedInstance;
        Object rememberedValue;
        boolean z7;
        Object rememberedValue2;
        final long j3;
        final int i8;
        final boolean z8;
        ScopeUpdateScope endRestartGroup;
        Composer startRestartGroup = composer.startRestartGroup(640888974);
        ComposerKt.sourceInformation(startRestartGroup, "C(AndroidExternalSurface)P(2!1,4:c#ui.unit.IntSize,5:c#foundation.AndroidExternalSurfaceZOrder)288@12167L37,291@12241L150,299@12462L774,290@12210L1032:AndroidExternalSurface.android.kt#71ulvw");
        int i9 = i3 & 1;
        if (i9 != 0) {
            i4 = i2 | 6;
            modifier2 = modifier;
        } else if ((i2 & 6) == 0) {
            modifier2 = modifier;
            i4 = (startRestartGroup.changed(modifier2) ? 4 : 2) | i2;
        } else {
            modifier2 = modifier;
            i4 = i2;
        }
        int i10 = i3 & 2;
        if (i10 != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            z3 = z;
            i4 |= startRestartGroup.changed(z3) ? 32 : 16;
            if ((i2 & 384) != 0) {
                j2 = j;
                i4 |= ((i3 & 4) == 0 && startRestartGroup.changed(j2)) ? 256 : 128;
            } else {
                j2 = j;
            }
            i5 = i3 & 8;
            if (i5 == 0) {
                i4 |= 3072;
            } else if ((i2 & 3072) == 0) {
                i6 = i;
                i4 |= startRestartGroup.changed(i6) ? 2048 : 1024;
                i7 = i3 & 16;
                if (i7 != 0) {
                    i4 |= 24576;
                } else if ((i2 & 24576) == 0) {
                    z4 = z2;
                    i4 |= startRestartGroup.changed(z4) ? 16384 : 8192;
                    if ((i3 & 32) == 0) {
                        i4 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    } else if ((i2 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                        i4 |= startRestartGroup.changedInstance(function1) ? 131072 : 65536;
                    }
                    if ((i4 & 74899) == 74898 || !startRestartGroup.getSkipping()) {
                        startRestartGroup.startDefaults();
                        if ((i2 & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                            companion = i9 == 0 ? Modifier.INSTANCE : modifier2;
                            if (i10 != 0) {
                                z3 = true;
                            }
                            if ((i3 & 4) != 0) {
                                i4 &= -897;
                                j2 = IntSize.INSTANCE.m6474getZeroYbymL2g();
                            }
                            if (i5 != 0) {
                                i6 = AndroidExternalSurfaceZOrder.INSTANCE.m230getBehindB_4ceCc();
                            }
                            z5 = z3;
                            if (i7 != 0) {
                                z6 = false;
                                final int i11 = i6;
                                int i12 = i4;
                                final long j4 = j2;
                                startRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(640888974, i12, -1, "androidx.compose.foundation.AndroidExternalSurface (AndroidExternalSurface.android.kt:287)");
                                }
                                final AndroidExternalSurfaceState rememberAndroidExternalSurfaceState = rememberAndroidExternalSurfaceState(startRestartGroup, 0);
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1356109309, "CC(remember):AndroidExternalSurface.android.kt#9igjgp");
                                changedInstance = ((458752 & i12) == 131072) | startRestartGroup.changedInstance(rememberAndroidExternalSurfaceState);
                                rememberedValue = startRestartGroup.rememberedValue();
                                if (!changedInstance || rememberedValue == Composer.INSTANCE.getEmpty()) {
                                    rememberedValue = (Function1) new Function1<Context, SurfaceView>() { // from class: androidx.compose.foundation.AndroidExternalSurface_androidKt$AndroidExternalSurface$1$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        /* JADX WARN: Multi-variable type inference failed */
                                        {
                                            super(1);
                                        }

                                        @Override // kotlin.jvm.functions.Function1
                                        public final SurfaceView invoke(Context context) {
                                            SurfaceView surfaceView = new SurfaceView(context);
                                            Function1<AndroidExternalSurfaceScope, Unit> function12 = function1;
                                            AndroidExternalSurfaceState androidExternalSurfaceState = rememberAndroidExternalSurfaceState;
                                            function12.invoke(androidExternalSurfaceState);
                                            surfaceView.getHolder().addCallback(androidExternalSurfaceState);
                                            return surfaceView;
                                        }
                                    };
                                    startRestartGroup.updateRememberedValue(rememberedValue);
                                }
                                Function1 function12 = (Function1) rememberedValue;
                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                AndroidExternalSurface_androidKt$AndroidExternalSurface$2 androidExternalSurface_androidKt$AndroidExternalSurface$2 = new Function1<SurfaceView, Unit>() { // from class: androidx.compose.foundation.AndroidExternalSurface_androidKt$AndroidExternalSurface$2
                                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2(SurfaceView surfaceView) {
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Unit invoke(SurfaceView surfaceView) {
                                        invoke2(surfaceView);
                                        return Unit.INSTANCE;
                                    }
                                };
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1356101613, "CC(remember):AndroidExternalSurface.android.kt#9igjgp");
                                z7 = ((((i12 & 896) ^ 384) <= 256 && startRestartGroup.changed(j4)) || (i12 & 384) == 256) | ((i12 & 112) == 32) | ((i12 & 7168) == 2048) | ((57344 & i12) == 16384);
                                rememberedValue2 = startRestartGroup.rememberedValue();
                                if (!z7 || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                    final boolean z9 = z5;
                                    final boolean z10 = z6;
                                    rememberedValue2 = (Function1) new Function1<SurfaceView, Unit>() { // from class: androidx.compose.foundation.AndroidExternalSurface_androidKt$AndroidExternalSurface$3$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(1);
                                        }

                                        @Override // kotlin.jvm.functions.Function1
                                        public /* bridge */ /* synthetic */ Unit invoke(SurfaceView surfaceView) {
                                            invoke2(surfaceView);
                                            return Unit.INSTANCE;
                                        }

                                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2(SurfaceView surfaceView) {
                                            if (!IntSize.m6467equalsimpl0(j4, IntSize.INSTANCE.m6474getZeroYbymL2g())) {
                                                surfaceView.getHolder().setFixedSize(IntSize.m6469getWidthimpl(j4), IntSize.m6468getHeightimpl(j4));
                                            } else {
                                                surfaceView.getHolder().setSizeFromLayout();
                                            }
                                            surfaceView.getHolder().setFormat(z9 ? -1 : -3);
                                            int i13 = i11;
                                            if (AndroidExternalSurfaceZOrder.m226equalsimpl0(i13, AndroidExternalSurfaceZOrder.INSTANCE.m230getBehindB_4ceCc())) {
                                                surfaceView.setZOrderOnTop(false);
                                            } else if (AndroidExternalSurfaceZOrder.m226equalsimpl0(i13, AndroidExternalSurfaceZOrder.INSTANCE.m231getMediaOverlayB_4ceCc())) {
                                                surfaceView.setZOrderMediaOverlay(true);
                                            } else if (AndroidExternalSurfaceZOrder.m226equalsimpl0(i13, AndroidExternalSurfaceZOrder.INSTANCE.m232getOnTopB_4ceCc())) {
                                                surfaceView.setZOrderOnTop(true);
                                            }
                                            surfaceView.setSecure(z10);
                                        }
                                    };
                                    startRestartGroup.updateRememberedValue(rememberedValue2);
                                }
                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                AndroidView_androidKt.AndroidView(function12, companion, androidExternalSurface_androidKt$AndroidExternalSurface$2, null, (Function1) rememberedValue2, startRestartGroup, ((i12 << 3) & 112) | 384, 8);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                z3 = z5;
                                j3 = j4;
                                i8 = i11;
                                z8 = z6;
                            }
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            if ((i3 & 4) != 0) {
                                i4 &= -897;
                            }
                            companion = modifier2;
                            z5 = z3;
                        }
                        z6 = z4;
                        final int i112 = i6;
                        int i122 = i4;
                        final long j42 = j2;
                        startRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        final AndroidExternalSurfaceState rememberAndroidExternalSurfaceState2 = rememberAndroidExternalSurfaceState(startRestartGroup, 0);
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1356109309, "CC(remember):AndroidExternalSurface.android.kt#9igjgp");
                        changedInstance = ((458752 & i122) == 131072) | startRestartGroup.changedInstance(rememberAndroidExternalSurfaceState2);
                        rememberedValue = startRestartGroup.rememberedValue();
                        if (!changedInstance) {
                        }
                        rememberedValue = (Function1) new Function1<Context, SurfaceView>() { // from class: androidx.compose.foundation.AndroidExternalSurface_androidKt$AndroidExternalSurface$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public final SurfaceView invoke(Context context) {
                                SurfaceView surfaceView = new SurfaceView(context);
                                Function1<AndroidExternalSurfaceScope, Unit> function122 = function1;
                                AndroidExternalSurfaceState androidExternalSurfaceState = rememberAndroidExternalSurfaceState2;
                                function122.invoke(androidExternalSurfaceState);
                                surfaceView.getHolder().addCallback(androidExternalSurfaceState);
                                return surfaceView;
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue);
                        Function1 function122 = (Function1) rememberedValue;
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        AndroidExternalSurface_androidKt$AndroidExternalSurface$2 androidExternalSurface_androidKt$AndroidExternalSurface$22 = new Function1<SurfaceView, Unit>() { // from class: androidx.compose.foundation.AndroidExternalSurface_androidKt$AndroidExternalSurface$2
                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(SurfaceView surfaceView) {
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(SurfaceView surfaceView) {
                                invoke2(surfaceView);
                                return Unit.INSTANCE;
                            }
                        };
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1356101613, "CC(remember):AndroidExternalSurface.android.kt#9igjgp");
                        z7 = ((((i122 & 896) ^ 384) <= 256 && startRestartGroup.changed(j42)) || (i122 & 384) == 256) | ((i122 & 112) == 32) | ((i122 & 7168) == 2048) | ((57344 & i122) == 16384);
                        rememberedValue2 = startRestartGroup.rememberedValue();
                        if (!z7) {
                        }
                        final boolean z92 = z5;
                        final boolean z102 = z6;
                        rememberedValue2 = (Function1) new Function1<SurfaceView, Unit>() { // from class: androidx.compose.foundation.AndroidExternalSurface_androidKt$AndroidExternalSurface$3$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(SurfaceView surfaceView) {
                                invoke2(surfaceView);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(SurfaceView surfaceView) {
                                if (!IntSize.m6467equalsimpl0(j42, IntSize.INSTANCE.m6474getZeroYbymL2g())) {
                                    surfaceView.getHolder().setFixedSize(IntSize.m6469getWidthimpl(j42), IntSize.m6468getHeightimpl(j42));
                                } else {
                                    surfaceView.getHolder().setSizeFromLayout();
                                }
                                surfaceView.getHolder().setFormat(z92 ? -1 : -3);
                                int i13 = i112;
                                if (AndroidExternalSurfaceZOrder.m226equalsimpl0(i13, AndroidExternalSurfaceZOrder.INSTANCE.m230getBehindB_4ceCc())) {
                                    surfaceView.setZOrderOnTop(false);
                                } else if (AndroidExternalSurfaceZOrder.m226equalsimpl0(i13, AndroidExternalSurfaceZOrder.INSTANCE.m231getMediaOverlayB_4ceCc())) {
                                    surfaceView.setZOrderMediaOverlay(true);
                                } else if (AndroidExternalSurfaceZOrder.m226equalsimpl0(i13, AndroidExternalSurfaceZOrder.INSTANCE.m232getOnTopB_4ceCc())) {
                                    surfaceView.setZOrderOnTop(true);
                                }
                                surfaceView.setSecure(z102);
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue2);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        AndroidView_androidKt.AndroidView(function122, companion, androidExternalSurface_androidKt$AndroidExternalSurface$22, null, (Function1) rememberedValue2, startRestartGroup, ((i122 << 3) & 112) | 384, 8);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        z3 = z5;
                        j3 = j42;
                        i8 = i112;
                        z8 = z6;
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        companion = modifier2;
                        j3 = j2;
                        z8 = z4;
                        i8 = i6;
                    }
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup == null) {
                        final Modifier modifier3 = companion;
                        final boolean z11 = z3;
                        endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.AndroidExternalSurface_androidKt$AndroidExternalSurface$4
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                invoke(composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer2, int i13) {
                                AndroidExternalSurface_androidKt.m234AndroidExternalSurface58FFMhA(Modifier.this, z11, j3, i8, z8, function1, composer2, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
                            }
                        });
                        return;
                    }
                    return;
                }
                z4 = z2;
                if ((i3 & 32) == 0) {
                }
                if ((i4 & 74899) == 74898) {
                }
                startRestartGroup.startDefaults();
                if ((i2 & 1) != 0) {
                }
                if (i9 == 0) {
                }
                if (i10 != 0) {
                }
                if ((i3 & 4) != 0) {
                }
                if (i5 != 0) {
                }
                z5 = z3;
                if (i7 != 0) {
                }
                z6 = z4;
                final int i1122 = i6;
                int i1222 = i4;
                final long j422 = j2;
                startRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                final AndroidExternalSurfaceState rememberAndroidExternalSurfaceState22 = rememberAndroidExternalSurfaceState(startRestartGroup, 0);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1356109309, "CC(remember):AndroidExternalSurface.android.kt#9igjgp");
                changedInstance = ((458752 & i1222) == 131072) | startRestartGroup.changedInstance(rememberAndroidExternalSurfaceState22);
                rememberedValue = startRestartGroup.rememberedValue();
                if (!changedInstance) {
                }
                rememberedValue = (Function1) new Function1<Context, SurfaceView>() { // from class: androidx.compose.foundation.AndroidExternalSurface_androidKt$AndroidExternalSurface$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final SurfaceView invoke(Context context) {
                        SurfaceView surfaceView = new SurfaceView(context);
                        Function1<AndroidExternalSurfaceScope, Unit> function1222 = function1;
                        AndroidExternalSurfaceState androidExternalSurfaceState = rememberAndroidExternalSurfaceState22;
                        function1222.invoke(androidExternalSurfaceState);
                        surfaceView.getHolder().addCallback(androidExternalSurfaceState);
                        return surfaceView;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
                Function1 function1222 = (Function1) rememberedValue;
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                AndroidExternalSurface_androidKt$AndroidExternalSurface$2 androidExternalSurface_androidKt$AndroidExternalSurface$222 = new Function1<SurfaceView, Unit>() { // from class: androidx.compose.foundation.AndroidExternalSurface_androidKt$AndroidExternalSurface$2
                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(SurfaceView surfaceView) {
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(SurfaceView surfaceView) {
                        invoke2(surfaceView);
                        return Unit.INSTANCE;
                    }
                };
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1356101613, "CC(remember):AndroidExternalSurface.android.kt#9igjgp");
                z7 = ((((i1222 & 896) ^ 384) <= 256 && startRestartGroup.changed(j422)) || (i1222 & 384) == 256) | ((i1222 & 112) == 32) | ((i1222 & 7168) == 2048) | ((57344 & i1222) == 16384);
                rememberedValue2 = startRestartGroup.rememberedValue();
                if (!z7) {
                }
                final boolean z922 = z5;
                final boolean z1022 = z6;
                rememberedValue2 = (Function1) new Function1<SurfaceView, Unit>() { // from class: androidx.compose.foundation.AndroidExternalSurface_androidKt$AndroidExternalSurface$3$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(SurfaceView surfaceView) {
                        invoke2(surfaceView);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(SurfaceView surfaceView) {
                        if (!IntSize.m6467equalsimpl0(j422, IntSize.INSTANCE.m6474getZeroYbymL2g())) {
                            surfaceView.getHolder().setFixedSize(IntSize.m6469getWidthimpl(j422), IntSize.m6468getHeightimpl(j422));
                        } else {
                            surfaceView.getHolder().setSizeFromLayout();
                        }
                        surfaceView.getHolder().setFormat(z922 ? -1 : -3);
                        int i13 = i1122;
                        if (AndroidExternalSurfaceZOrder.m226equalsimpl0(i13, AndroidExternalSurfaceZOrder.INSTANCE.m230getBehindB_4ceCc())) {
                            surfaceView.setZOrderOnTop(false);
                        } else if (AndroidExternalSurfaceZOrder.m226equalsimpl0(i13, AndroidExternalSurfaceZOrder.INSTANCE.m231getMediaOverlayB_4ceCc())) {
                            surfaceView.setZOrderMediaOverlay(true);
                        } else if (AndroidExternalSurfaceZOrder.m226equalsimpl0(i13, AndroidExternalSurfaceZOrder.INSTANCE.m232getOnTopB_4ceCc())) {
                            surfaceView.setZOrderOnTop(true);
                        }
                        surfaceView.setSecure(z1022);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                AndroidView_androidKt.AndroidView(function1222, companion, androidExternalSurface_androidKt$AndroidExternalSurface$222, null, (Function1) rememberedValue2, startRestartGroup, ((i1222 << 3) & 112) | 384, 8);
                if (ComposerKt.isTraceInProgress()) {
                }
                z3 = z5;
                j3 = j422;
                i8 = i1122;
                z8 = z6;
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            i6 = i;
            i7 = i3 & 16;
            if (i7 != 0) {
            }
            z4 = z2;
            if ((i3 & 32) == 0) {
            }
            if ((i4 & 74899) == 74898) {
            }
            startRestartGroup.startDefaults();
            if ((i2 & 1) != 0) {
            }
            if (i9 == 0) {
            }
            if (i10 != 0) {
            }
            if ((i3 & 4) != 0) {
            }
            if (i5 != 0) {
            }
            z5 = z3;
            if (i7 != 0) {
            }
            z6 = z4;
            final int i11222 = i6;
            int i12222 = i4;
            final long j4222 = j2;
            startRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
            }
            final AndroidExternalSurfaceState rememberAndroidExternalSurfaceState222 = rememberAndroidExternalSurfaceState(startRestartGroup, 0);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1356109309, "CC(remember):AndroidExternalSurface.android.kt#9igjgp");
            changedInstance = ((458752 & i12222) == 131072) | startRestartGroup.changedInstance(rememberAndroidExternalSurfaceState222);
            rememberedValue = startRestartGroup.rememberedValue();
            if (!changedInstance) {
            }
            rememberedValue = (Function1) new Function1<Context, SurfaceView>() { // from class: androidx.compose.foundation.AndroidExternalSurface_androidKt$AndroidExternalSurface$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public final SurfaceView invoke(Context context) {
                    SurfaceView surfaceView = new SurfaceView(context);
                    Function1<AndroidExternalSurfaceScope, Unit> function12222 = function1;
                    AndroidExternalSurfaceState androidExternalSurfaceState = rememberAndroidExternalSurfaceState222;
                    function12222.invoke(androidExternalSurfaceState);
                    surfaceView.getHolder().addCallback(androidExternalSurfaceState);
                    return surfaceView;
                }
            };
            startRestartGroup.updateRememberedValue(rememberedValue);
            Function1 function12222 = (Function1) rememberedValue;
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            AndroidExternalSurface_androidKt$AndroidExternalSurface$2 androidExternalSurface_androidKt$AndroidExternalSurface$2222 = new Function1<SurfaceView, Unit>() { // from class: androidx.compose.foundation.AndroidExternalSurface_androidKt$AndroidExternalSurface$2
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(SurfaceView surfaceView) {
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(SurfaceView surfaceView) {
                    invoke2(surfaceView);
                    return Unit.INSTANCE;
                }
            };
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1356101613, "CC(remember):AndroidExternalSurface.android.kt#9igjgp");
            z7 = ((((i12222 & 896) ^ 384) <= 256 && startRestartGroup.changed(j4222)) || (i12222 & 384) == 256) | ((i12222 & 112) == 32) | ((i12222 & 7168) == 2048) | ((57344 & i12222) == 16384);
            rememberedValue2 = startRestartGroup.rememberedValue();
            if (!z7) {
            }
            final boolean z9222 = z5;
            final boolean z10222 = z6;
            rememberedValue2 = (Function1) new Function1<SurfaceView, Unit>() { // from class: androidx.compose.foundation.AndroidExternalSurface_androidKt$AndroidExternalSurface$3$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(SurfaceView surfaceView) {
                    invoke2(surfaceView);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(SurfaceView surfaceView) {
                    if (!IntSize.m6467equalsimpl0(j4222, IntSize.INSTANCE.m6474getZeroYbymL2g())) {
                        surfaceView.getHolder().setFixedSize(IntSize.m6469getWidthimpl(j4222), IntSize.m6468getHeightimpl(j4222));
                    } else {
                        surfaceView.getHolder().setSizeFromLayout();
                    }
                    surfaceView.getHolder().setFormat(z9222 ? -1 : -3);
                    int i13 = i11222;
                    if (AndroidExternalSurfaceZOrder.m226equalsimpl0(i13, AndroidExternalSurfaceZOrder.INSTANCE.m230getBehindB_4ceCc())) {
                        surfaceView.setZOrderOnTop(false);
                    } else if (AndroidExternalSurfaceZOrder.m226equalsimpl0(i13, AndroidExternalSurfaceZOrder.INSTANCE.m231getMediaOverlayB_4ceCc())) {
                        surfaceView.setZOrderMediaOverlay(true);
                    } else if (AndroidExternalSurfaceZOrder.m226equalsimpl0(i13, AndroidExternalSurfaceZOrder.INSTANCE.m232getOnTopB_4ceCc())) {
                        surfaceView.setZOrderOnTop(true);
                    }
                    surfaceView.setSecure(z10222);
                }
            };
            startRestartGroup.updateRememberedValue(rememberedValue2);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            AndroidView_androidKt.AndroidView(function12222, companion, androidExternalSurface_androidKt$AndroidExternalSurface$2222, null, (Function1) rememberedValue2, startRestartGroup, ((i12222 << 3) & 112) | 384, 8);
            if (ComposerKt.isTraceInProgress()) {
            }
            z3 = z5;
            j3 = j4222;
            i8 = i11222;
            z8 = z6;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        z3 = z;
        if ((i2 & 384) != 0) {
        }
        i5 = i3 & 8;
        if (i5 == 0) {
        }
        i6 = i;
        i7 = i3 & 16;
        if (i7 != 0) {
        }
        z4 = z2;
        if ((i3 & 32) == 0) {
        }
        if ((i4 & 74899) == 74898) {
        }
        startRestartGroup.startDefaults();
        if ((i2 & 1) != 0) {
        }
        if (i9 == 0) {
        }
        if (i10 != 0) {
        }
        if ((i3 & 4) != 0) {
        }
        if (i5 != 0) {
        }
        z5 = z3;
        if (i7 != 0) {
        }
        z6 = z4;
        final int i112222 = i6;
        int i122222 = i4;
        final long j42222 = j2;
        startRestartGroup.endDefaults();
        if (ComposerKt.isTraceInProgress()) {
        }
        final AndroidExternalSurfaceState rememberAndroidExternalSurfaceState2222 = rememberAndroidExternalSurfaceState(startRestartGroup, 0);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1356109309, "CC(remember):AndroidExternalSurface.android.kt#9igjgp");
        changedInstance = ((458752 & i122222) == 131072) | startRestartGroup.changedInstance(rememberAndroidExternalSurfaceState2222);
        rememberedValue = startRestartGroup.rememberedValue();
        if (!changedInstance) {
        }
        rememberedValue = (Function1) new Function1<Context, SurfaceView>() { // from class: androidx.compose.foundation.AndroidExternalSurface_androidKt$AndroidExternalSurface$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final SurfaceView invoke(Context context) {
                SurfaceView surfaceView = new SurfaceView(context);
                Function1<AndroidExternalSurfaceScope, Unit> function122222 = function1;
                AndroidExternalSurfaceState androidExternalSurfaceState = rememberAndroidExternalSurfaceState2222;
                function122222.invoke(androidExternalSurfaceState);
                surfaceView.getHolder().addCallback(androidExternalSurfaceState);
                return surfaceView;
            }
        };
        startRestartGroup.updateRememberedValue(rememberedValue);
        Function1 function122222 = (Function1) rememberedValue;
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        AndroidExternalSurface_androidKt$AndroidExternalSurface$2 androidExternalSurface_androidKt$AndroidExternalSurface$22222 = new Function1<SurfaceView, Unit>() { // from class: androidx.compose.foundation.AndroidExternalSurface_androidKt$AndroidExternalSurface$2
            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(SurfaceView surfaceView) {
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(SurfaceView surfaceView) {
                invoke2(surfaceView);
                return Unit.INSTANCE;
            }
        };
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1356101613, "CC(remember):AndroidExternalSurface.android.kt#9igjgp");
        z7 = ((((i122222 & 896) ^ 384) <= 256 && startRestartGroup.changed(j42222)) || (i122222 & 384) == 256) | ((i122222 & 112) == 32) | ((i122222 & 7168) == 2048) | ((57344 & i122222) == 16384);
        rememberedValue2 = startRestartGroup.rememberedValue();
        if (!z7) {
        }
        final boolean z92222 = z5;
        final boolean z102222 = z6;
        rememberedValue2 = (Function1) new Function1<SurfaceView, Unit>() { // from class: androidx.compose.foundation.AndroidExternalSurface_androidKt$AndroidExternalSurface$3$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(SurfaceView surfaceView) {
                invoke2(surfaceView);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(SurfaceView surfaceView) {
                if (!IntSize.m6467equalsimpl0(j42222, IntSize.INSTANCE.m6474getZeroYbymL2g())) {
                    surfaceView.getHolder().setFixedSize(IntSize.m6469getWidthimpl(j42222), IntSize.m6468getHeightimpl(j42222));
                } else {
                    surfaceView.getHolder().setSizeFromLayout();
                }
                surfaceView.getHolder().setFormat(z92222 ? -1 : -3);
                int i13 = i112222;
                if (AndroidExternalSurfaceZOrder.m226equalsimpl0(i13, AndroidExternalSurfaceZOrder.INSTANCE.m230getBehindB_4ceCc())) {
                    surfaceView.setZOrderOnTop(false);
                } else if (AndroidExternalSurfaceZOrder.m226equalsimpl0(i13, AndroidExternalSurfaceZOrder.INSTANCE.m231getMediaOverlayB_4ceCc())) {
                    surfaceView.setZOrderMediaOverlay(true);
                } else if (AndroidExternalSurfaceZOrder.m226equalsimpl0(i13, AndroidExternalSurfaceZOrder.INSTANCE.m232getOnTopB_4ceCc())) {
                    surfaceView.setZOrderOnTop(true);
                }
                surfaceView.setSecure(z102222);
            }
        };
        startRestartGroup.updateRememberedValue(rememberedValue2);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        AndroidView_androidKt.AndroidView(function122222, companion, androidExternalSurface_androidKt$AndroidExternalSurface$22222, null, (Function1) rememberedValue2, startRestartGroup, ((i122222 << 3) & 112) | 384, 8);
        if (ComposerKt.isTraceInProgress()) {
        }
        z3 = z5;
        j3 = j42222;
        i8 = i112222;
        z8 = z6;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    private static final AndroidEmbeddedExternalSurfaceState rememberAndroidEmbeddedExternalSurfaceState(Composer composer, int i) {
        ComposerKt.sourceInformationMarkerStart(composer, -1057437053, "C(rememberAndroidEmbeddedExternalSurfaceState)384@15036L24,385@15072L55:AndroidExternalSurface.android.kt#71ulvw");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1057437053, i, -1, "androidx.compose.foundation.rememberAndroidEmbeddedExternalSurfaceState (AndroidExternalSurface.android.kt:383)");
        }
        ComposerKt.sourceInformationMarkerStart(composer, 773894976, "CC(rememberCoroutineScope)482@20332L144:Effects.kt#9igjgp");
        ComposerKt.sourceInformationMarkerStart(composer, -954367824, "CC(remember):Effects.kt#9igjgp");
        Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == Composer.INSTANCE.getEmpty()) {
            CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composer));
            composer.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
            rememberedValue = compositionScopedCoroutineScopeCanceller;
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) rememberedValue).getCoroutineScope();
        ComposerKt.sourceInformationMarkerEnd(composer);
        ComposerKt.sourceInformationMarkerStart(composer, 1142294264, "CC(remember):AndroidExternalSurface.android.kt#9igjgp");
        Object rememberedValue2 = composer.rememberedValue();
        if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
            rememberedValue2 = new AndroidEmbeddedExternalSurfaceState(coroutineScope);
            composer.updateRememberedValue(rememberedValue2);
        }
        AndroidEmbeddedExternalSurfaceState androidEmbeddedExternalSurfaceState = (AndroidEmbeddedExternalSurfaceState) rememberedValue2;
        ComposerKt.sourceInformationMarkerEnd(composer);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return androidEmbeddedExternalSurfaceState;
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x008e  */
    /* renamed from: AndroidEmbeddedExternalSurface-sv6N_fY, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m233AndroidEmbeddedExternalSurfacesv6N_fY(Modifier modifier, boolean z, long j, float[] fArr, final Function1<? super AndroidExternalSurfaceScope, Unit> function1, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        boolean z2;
        long j2;
        int i4;
        Modifier.Companion companion;
        float[] fArr2;
        int i5;
        boolean z3;
        final long j3;
        boolean changedInstance;
        Object rememberedValue;
        boolean changedInstance2;
        Object rememberedValue2;
        final long j4;
        final float[] fArr3;
        Composer startRestartGroup = composer.startRestartGroup(217541314);
        ComposerKt.sourceInformation(startRestartGroup, "C(AndroidEmbeddedExternalSurface)P(1!1,3:c#ui.unit.IntSize,4:c#ui.graphics.Matrix)455@18917L45,458@18999L203,467@19273L485,457@18968L796:AndroidExternalSurface.android.kt#71ulvw");
        int i6 = i2 & 1;
        if (i6 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i3 = (startRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        int i7 = i2 & 2;
        if (i7 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            z2 = z;
            i3 |= startRestartGroup.changed(z2) ? 32 : 16;
            if ((i & 384) != 0) {
                j2 = j;
                i3 |= ((i2 & 4) == 0 && startRestartGroup.changed(j2)) ? 256 : 128;
            } else {
                j2 = j;
            }
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                i3 |= startRestartGroup.changedInstance(fArr != null ? Matrix.m4069boximpl(fArr) : null) ? 2048 : 1024;
            }
            if ((i2 & 16) == 0) {
                i3 |= 24576;
            } else if ((i & 24576) == 0) {
                i3 |= startRestartGroup.changedInstance(function1) ? 16384 : 8192;
            }
            if ((i3 & 9363) == 9362 || !startRestartGroup.getSkipping()) {
                startRestartGroup.startDefaults();
                if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                    companion = i6 == 0 ? Modifier.INSTANCE : modifier2;
                    if (i7 != 0) {
                        z2 = true;
                    }
                    if ((i2 & 4) != 0) {
                        j2 = IntSize.INSTANCE.m6474getZeroYbymL2g();
                        i3 &= -897;
                    }
                    if (i4 == 0) {
                        i5 = i3;
                        z3 = z2;
                        j3 = j2;
                        fArr2 = null;
                        startRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(217541314, i5, -1, "androidx.compose.foundation.AndroidEmbeddedExternalSurface (AndroidExternalSurface.android.kt:454)");
                        }
                        final AndroidEmbeddedExternalSurfaceState rememberAndroidEmbeddedExternalSurfaceState = rememberAndroidEmbeddedExternalSurfaceState(startRestartGroup, 0);
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 184051342, "CC(remember):AndroidExternalSurface.android.kt#9igjgp");
                        int i8 = (i5 & 896) ^ 384;
                        changedInstance = ((i8 <= 256 && startRestartGroup.changed(j3)) || (i5 & 384) == 256) | startRestartGroup.changedInstance(rememberAndroidEmbeddedExternalSurfaceState) | ((57344 & i5) != 16384);
                        rememberedValue = startRestartGroup.rememberedValue();
                        if (!changedInstance || rememberedValue == Composer.INSTANCE.getEmpty()) {
                            rememberedValue = (Function1) new Function1<Context, TextureView>() { // from class: androidx.compose.foundation.AndroidExternalSurface_androidKt$AndroidEmbeddedExternalSurface$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public final TextureView invoke(Context context) {
                                    TextureView textureView = new TextureView(context);
                                    AndroidEmbeddedExternalSurfaceState androidEmbeddedExternalSurfaceState = AndroidEmbeddedExternalSurfaceState.this;
                                    long j5 = j3;
                                    Function1<AndroidExternalSurfaceScope, Unit> function12 = function1;
                                    androidEmbeddedExternalSurfaceState.m222setSurfaceSizeozmzZPI(j5);
                                    function12.invoke(androidEmbeddedExternalSurfaceState);
                                    textureView.setSurfaceTextureListener(androidEmbeddedExternalSurfaceState);
                                    return textureView;
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue);
                        }
                        Function1 function12 = (Function1) rememberedValue;
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        AndroidExternalSurface_androidKt$AndroidEmbeddedExternalSurface$2 androidExternalSurface_androidKt$AndroidEmbeddedExternalSurface$2 = new Function1<TextureView, Unit>() { // from class: androidx.compose.foundation.AndroidExternalSurface_androidKt$AndroidEmbeddedExternalSurface$2
                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(TextureView textureView) {
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(TextureView textureView) {
                                invoke2(textureView);
                                return Unit.INSTANCE;
                            }
                        };
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 184060392, "CC(remember):AndroidExternalSurface.android.kt#9igjgp");
                        changedInstance2 = ((i8 <= 256 && startRestartGroup.changed(j3)) || (i5 & 384) == 256) | startRestartGroup.changedInstance(rememberAndroidEmbeddedExternalSurfaceState) | ((i5 & 112) == 32) | startRestartGroup.changedInstance(fArr2 == null ? Matrix.m4069boximpl(fArr2) : null);
                        rememberedValue2 = startRestartGroup.rememberedValue();
                        if (!changedInstance2 || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            final long j5 = j3;
                            final boolean z4 = z3;
                            final float[] fArr4 = fArr2;
                            rememberedValue2 = (Function1) new Function1<TextureView, Unit>() { // from class: androidx.compose.foundation.AndroidExternalSurface_androidKt$AndroidEmbeddedExternalSurface$3$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(TextureView textureView) {
                                    invoke2(textureView);
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(TextureView textureView) {
                                    android.graphics.Matrix matrix;
                                    SurfaceTexture surfaceTexture;
                                    if (!IntSize.m6467equalsimpl0(j5, IntSize.INSTANCE.m6474getZeroYbymL2g()) && (surfaceTexture = textureView.getSurfaceTexture()) != null) {
                                        surfaceTexture.setDefaultBufferSize(IntSize.m6469getWidthimpl(j5), IntSize.m6468getHeightimpl(j5));
                                    }
                                    rememberAndroidEmbeddedExternalSurfaceState.m222setSurfaceSizeozmzZPI(j5);
                                    textureView.setOpaque(z4);
                                    float[] fArr5 = fArr4;
                                    if (fArr5 != null) {
                                        matrix = rememberAndroidEmbeddedExternalSurfaceState.getMatrix();
                                        AndroidMatrixConversions_androidKt.m3710setFromEL8BTi8(matrix, fArr5);
                                    } else {
                                        matrix = null;
                                    }
                                    textureView.setTransform(matrix);
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue2);
                        }
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        AndroidView_androidKt.AndroidView(function12, companion, androidExternalSurface_androidKt$AndroidEmbeddedExternalSurface$2, null, (Function1) rememberedValue2, startRestartGroup, ((i5 << 3) & 112) | 384, 8);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        z2 = z3;
                        j4 = j3;
                        fArr3 = fArr2;
                    } else {
                        fArr2 = fArr;
                    }
                } else {
                    startRestartGroup.skipToGroupEnd();
                    if ((i2 & 4) != 0) {
                        i3 &= -897;
                    }
                    fArr2 = fArr;
                    companion = modifier2;
                }
                i5 = i3;
                z3 = z2;
                j3 = j2;
                startRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                final AndroidEmbeddedExternalSurfaceState rememberAndroidEmbeddedExternalSurfaceState2 = rememberAndroidEmbeddedExternalSurfaceState(startRestartGroup, 0);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 184051342, "CC(remember):AndroidExternalSurface.android.kt#9igjgp");
                int i82 = (i5 & 896) ^ 384;
                changedInstance = ((i82 <= 256 && startRestartGroup.changed(j3)) || (i5 & 384) == 256) | startRestartGroup.changedInstance(rememberAndroidEmbeddedExternalSurfaceState2) | ((57344 & i5) != 16384);
                rememberedValue = startRestartGroup.rememberedValue();
                if (!changedInstance) {
                }
                rememberedValue = (Function1) new Function1<Context, TextureView>() { // from class: androidx.compose.foundation.AndroidExternalSurface_androidKt$AndroidEmbeddedExternalSurface$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final TextureView invoke(Context context) {
                        TextureView textureView = new TextureView(context);
                        AndroidEmbeddedExternalSurfaceState androidEmbeddedExternalSurfaceState = AndroidEmbeddedExternalSurfaceState.this;
                        long j52 = j3;
                        Function1<AndroidExternalSurfaceScope, Unit> function122 = function1;
                        androidEmbeddedExternalSurfaceState.m222setSurfaceSizeozmzZPI(j52);
                        function122.invoke(androidEmbeddedExternalSurfaceState);
                        textureView.setSurfaceTextureListener(androidEmbeddedExternalSurfaceState);
                        return textureView;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
                Function1 function122 = (Function1) rememberedValue;
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                AndroidExternalSurface_androidKt$AndroidEmbeddedExternalSurface$2 androidExternalSurface_androidKt$AndroidEmbeddedExternalSurface$22 = new Function1<TextureView, Unit>() { // from class: androidx.compose.foundation.AndroidExternalSurface_androidKt$AndroidEmbeddedExternalSurface$2
                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(TextureView textureView) {
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(TextureView textureView) {
                        invoke2(textureView);
                        return Unit.INSTANCE;
                    }
                };
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 184060392, "CC(remember):AndroidExternalSurface.android.kt#9igjgp");
                changedInstance2 = ((i82 <= 256 && startRestartGroup.changed(j3)) || (i5 & 384) == 256) | startRestartGroup.changedInstance(rememberAndroidEmbeddedExternalSurfaceState2) | ((i5 & 112) == 32) | startRestartGroup.changedInstance(fArr2 == null ? Matrix.m4069boximpl(fArr2) : null);
                rememberedValue2 = startRestartGroup.rememberedValue();
                if (!changedInstance2) {
                }
                final long j52 = j3;
                final boolean z42 = z3;
                final float[] fArr42 = fArr2;
                rememberedValue2 = (Function1) new Function1<TextureView, Unit>() { // from class: androidx.compose.foundation.AndroidExternalSurface_androidKt$AndroidEmbeddedExternalSurface$3$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(TextureView textureView) {
                        invoke2(textureView);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(TextureView textureView) {
                        android.graphics.Matrix matrix;
                        SurfaceTexture surfaceTexture;
                        if (!IntSize.m6467equalsimpl0(j52, IntSize.INSTANCE.m6474getZeroYbymL2g()) && (surfaceTexture = textureView.getSurfaceTexture()) != null) {
                            surfaceTexture.setDefaultBufferSize(IntSize.m6469getWidthimpl(j52), IntSize.m6468getHeightimpl(j52));
                        }
                        rememberAndroidEmbeddedExternalSurfaceState2.m222setSurfaceSizeozmzZPI(j52);
                        textureView.setOpaque(z42);
                        float[] fArr5 = fArr42;
                        if (fArr5 != null) {
                            matrix = rememberAndroidEmbeddedExternalSurfaceState2.getMatrix();
                            AndroidMatrixConversions_androidKt.m3710setFromEL8BTi8(matrix, fArr5);
                        } else {
                            matrix = null;
                        }
                        textureView.setTransform(matrix);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                AndroidView_androidKt.AndroidView(function122, companion, androidExternalSurface_androidKt$AndroidEmbeddedExternalSurface$22, null, (Function1) rememberedValue2, startRestartGroup, ((i5 << 3) & 112) | 384, 8);
                if (ComposerKt.isTraceInProgress()) {
                }
                z2 = z3;
                j4 = j3;
                fArr3 = fArr2;
            } else {
                startRestartGroup.skipToGroupEnd();
                fArr3 = fArr;
                companion = modifier2;
                j4 = j2;
            }
            ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
                final Modifier modifier3 = companion;
                final boolean z5 = z2;
                endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.AndroidExternalSurface_androidKt$AndroidEmbeddedExternalSurface$4
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i9) {
                        AndroidExternalSurface_androidKt.m233AndroidEmbeddedExternalSurfacesv6N_fY(Modifier.this, z5, j4, fArr3, function1, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                    }
                });
                return;
            }
            return;
        }
        z2 = z;
        if ((i & 384) != 0) {
        }
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        if ((i2 & 16) == 0) {
        }
        if ((i3 & 9363) == 9362) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i6 == 0) {
        }
        if (i7 != 0) {
        }
        if ((i2 & 4) != 0) {
        }
        if (i4 == 0) {
        }
    }
}
