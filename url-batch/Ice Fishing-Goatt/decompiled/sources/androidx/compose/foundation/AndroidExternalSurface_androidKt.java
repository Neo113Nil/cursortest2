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

    /* JADX WARN: Removed duplicated region for block: B:106:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x00a8  */
    /* renamed from: AndroidExternalSurface-58FFMhA, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m226AndroidExternalSurface58FFMhA(Modifier modifier, boolean z, long j, int i, boolean z2, final Function1<? super AndroidExternalSurfaceScope, Unit> function1, Composer composer, final int i2, final int i3) {
        Modifier modifier2;
        int i4;
        boolean z3;
        long j2;
        int i5;
        int i6;
        int i7;
        boolean z4;
        Modifier.Companion companion;
        boolean changedInstance;
        Object rememberedValue;
        boolean z5;
        long j3;
        int i8;
        boolean z6;
        Object obj;
        final long j4;
        final boolean z7;
        final Modifier modifier3;
        final int i9;
        final boolean z8;
        ScopeUpdateScope endRestartGroup;
        Composer startRestartGroup = composer.startRestartGroup(640888974);
        ComposerKt.sourceInformation(startRestartGroup, "C(AndroidExternalSurface)P(2!1,4:c#ui.unit.IntSize,5:c#foundation.AndroidExternalSurfaceZOrder)288@12167L37,291@12241L150,299@12462L774,290@12210L1032:AndroidExternalSurface.android.kt#71ulvw");
        int i10 = i3 & 1;
        if (i10 != 0) {
            i4 = i2 | 6;
            modifier2 = modifier;
        } else if ((i2 & 6) == 0) {
            modifier2 = modifier;
            i4 = (startRestartGroup.changed(modifier2) ? 4 : 2) | i2;
        } else {
            modifier2 = modifier;
            i4 = i2;
        }
        int i11 = i3 & 2;
        if (i11 != 0) {
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
                            companion = i10 == 0 ? Modifier.INSTANCE : modifier2;
                            if (i11 != 0) {
                                z3 = true;
                            }
                            if ((i3 & 4) != 0) {
                                i4 &= -897;
                                j2 = IntSize.INSTANCE.m6440getZeroYbymL2g();
                            }
                            if (i5 != 0) {
                                i6 = AndroidExternalSurfaceZOrder.INSTANCE.m222getBehindB_4ceCc();
                            }
                            if (i7 != 0) {
                                z4 = false;
                            }
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            if ((i3 & 4) != 0) {
                                i4 &= -897;
                            }
                            companion = modifier2;
                        }
                        startRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(640888974, i4, -1, "androidx.compose.foundation.AndroidExternalSurface (AndroidExternalSurface.android.kt:287)");
                        }
                        final AndroidExternalSurfaceState rememberAndroidExternalSurfaceState = rememberAndroidExternalSurfaceState(startRestartGroup, 0);
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1356109309, "CC(remember):AndroidExternalSurface.android.kt#9igjgp");
                        changedInstance = ((458752 & i4) != 131072) | startRestartGroup.changedInstance(rememberAndroidExternalSurfaceState);
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
                        z5 = ((((i4 & 896) ^ 384) <= 256 && startRestartGroup.changed(j2)) || (i4 & 384) == 256) | ((i4 & 112) != 32) | ((i4 & 7168) != 2048) | ((57344 & i4) == 16384);
                        Object rememberedValue2 = startRestartGroup.rememberedValue();
                        if (!z5 || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            final boolean z9 = z3;
                            final long j5 = j2;
                            final boolean z10 = z4;
                            final int i12 = i6;
                            j3 = j5;
                            i8 = i12;
                            z6 = z10;
                            obj = (Function1) new Function1<SurfaceView, Unit>() { // from class: androidx.compose.foundation.AndroidExternalSurface_androidKt$AndroidExternalSurface$3$1
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
                                    if (!IntSize.m6433equalsimpl0(j5, IntSize.INSTANCE.m6440getZeroYbymL2g())) {
                                        surfaceView.getHolder().setFixedSize(IntSize.m6435getWidthimpl(j5), IntSize.m6434getHeightimpl(j5));
                                    } else {
                                        surfaceView.getHolder().setSizeFromLayout();
                                    }
                                    surfaceView.getHolder().setFormat(z9 ? -1 : -3);
                                    int i13 = i12;
                                    if (AndroidExternalSurfaceZOrder.m218equalsimpl0(i13, AndroidExternalSurfaceZOrder.INSTANCE.m222getBehindB_4ceCc())) {
                                        surfaceView.setZOrderOnTop(false);
                                    } else if (AndroidExternalSurfaceZOrder.m218equalsimpl0(i13, AndroidExternalSurfaceZOrder.INSTANCE.m223getMediaOverlayB_4ceCc())) {
                                        surfaceView.setZOrderMediaOverlay(true);
                                    } else if (AndroidExternalSurfaceZOrder.m218equalsimpl0(i13, AndroidExternalSurfaceZOrder.INSTANCE.m224getOnTopB_4ceCc())) {
                                        surfaceView.setZOrderOnTop(true);
                                    }
                                    surfaceView.setSecure(z10);
                                }
                            };
                            startRestartGroup.updateRememberedValue(obj);
                        } else {
                            obj = rememberedValue2;
                            j3 = j2;
                            z6 = z4;
                            i8 = i6;
                        }
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        Modifier modifier4 = companion;
                        AndroidView_androidKt.AndroidView(function12, modifier4, androidExternalSurface_androidKt$AndroidExternalSurface$2, null, (Function1) obj, startRestartGroup, ((i4 << 3) & 112) | 384, 8);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        j4 = j3;
                        z7 = z3;
                        modifier3 = modifier4;
                        i9 = i8;
                        z8 = z6;
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        modifier3 = modifier2;
                        z7 = z3;
                        j4 = j2;
                        z8 = z4;
                        i9 = i6;
                    }
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup == null) {
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
                                AndroidExternalSurface_androidKt.m226AndroidExternalSurface58FFMhA(Modifier.this, z7, j4, i9, z8, function1, composer2, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
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
                if (i10 == 0) {
                }
                if (i11 != 0) {
                }
                if ((i3 & 4) != 0) {
                }
                if (i5 != 0) {
                }
                if (i7 != 0) {
                }
                startRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                final AndroidExternalSurfaceState rememberAndroidExternalSurfaceState2 = rememberAndroidExternalSurfaceState(startRestartGroup, 0);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1356109309, "CC(remember):AndroidExternalSurface.android.kt#9igjgp");
                changedInstance = ((458752 & i4) != 131072) | startRestartGroup.changedInstance(rememberAndroidExternalSurfaceState2);
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
                z5 = ((((i4 & 896) ^ 384) <= 256 && startRestartGroup.changed(j2)) || (i4 & 384) == 256) | ((i4 & 112) != 32) | ((i4 & 7168) != 2048) | ((57344 & i4) == 16384);
                Object rememberedValue22 = startRestartGroup.rememberedValue();
                if (z5) {
                }
                final boolean z92 = z3;
                final long j52 = j2;
                final boolean z102 = z4;
                final int i122 = i6;
                j3 = j52;
                i8 = i122;
                z6 = z102;
                obj = (Function1) new Function1<SurfaceView, Unit>() { // from class: androidx.compose.foundation.AndroidExternalSurface_androidKt$AndroidExternalSurface$3$1
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
                        if (!IntSize.m6433equalsimpl0(j52, IntSize.INSTANCE.m6440getZeroYbymL2g())) {
                            surfaceView.getHolder().setFixedSize(IntSize.m6435getWidthimpl(j52), IntSize.m6434getHeightimpl(j52));
                        } else {
                            surfaceView.getHolder().setSizeFromLayout();
                        }
                        surfaceView.getHolder().setFormat(z92 ? -1 : -3);
                        int i13 = i122;
                        if (AndroidExternalSurfaceZOrder.m218equalsimpl0(i13, AndroidExternalSurfaceZOrder.INSTANCE.m222getBehindB_4ceCc())) {
                            surfaceView.setZOrderOnTop(false);
                        } else if (AndroidExternalSurfaceZOrder.m218equalsimpl0(i13, AndroidExternalSurfaceZOrder.INSTANCE.m223getMediaOverlayB_4ceCc())) {
                            surfaceView.setZOrderMediaOverlay(true);
                        } else if (AndroidExternalSurfaceZOrder.m218equalsimpl0(i13, AndroidExternalSurfaceZOrder.INSTANCE.m224getOnTopB_4ceCc())) {
                            surfaceView.setZOrderOnTop(true);
                        }
                        surfaceView.setSecure(z102);
                    }
                };
                startRestartGroup.updateRememberedValue(obj);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                Modifier modifier42 = companion;
                AndroidView_androidKt.AndroidView(function122, modifier42, androidExternalSurface_androidKt$AndroidExternalSurface$22, null, (Function1) obj, startRestartGroup, ((i4 << 3) & 112) | 384, 8);
                if (ComposerKt.isTraceInProgress()) {
                }
                j4 = j3;
                z7 = z3;
                modifier3 = modifier42;
                i9 = i8;
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
            if (i10 == 0) {
            }
            if (i11 != 0) {
            }
            if ((i3 & 4) != 0) {
            }
            if (i5 != 0) {
            }
            if (i7 != 0) {
            }
            startRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
            }
            final AndroidExternalSurfaceState rememberAndroidExternalSurfaceState22 = rememberAndroidExternalSurfaceState(startRestartGroup, 0);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1356109309, "CC(remember):AndroidExternalSurface.android.kt#9igjgp");
            changedInstance = ((458752 & i4) != 131072) | startRestartGroup.changedInstance(rememberAndroidExternalSurfaceState22);
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
            z5 = ((((i4 & 896) ^ 384) <= 256 && startRestartGroup.changed(j2)) || (i4 & 384) == 256) | ((i4 & 112) != 32) | ((i4 & 7168) != 2048) | ((57344 & i4) == 16384);
            Object rememberedValue222 = startRestartGroup.rememberedValue();
            if (z5) {
            }
            final boolean z922 = z3;
            final long j522 = j2;
            final boolean z1022 = z4;
            final int i1222 = i6;
            j3 = j522;
            i8 = i1222;
            z6 = z1022;
            obj = (Function1) new Function1<SurfaceView, Unit>() { // from class: androidx.compose.foundation.AndroidExternalSurface_androidKt$AndroidExternalSurface$3$1
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
                    if (!IntSize.m6433equalsimpl0(j522, IntSize.INSTANCE.m6440getZeroYbymL2g())) {
                        surfaceView.getHolder().setFixedSize(IntSize.m6435getWidthimpl(j522), IntSize.m6434getHeightimpl(j522));
                    } else {
                        surfaceView.getHolder().setSizeFromLayout();
                    }
                    surfaceView.getHolder().setFormat(z922 ? -1 : -3);
                    int i13 = i1222;
                    if (AndroidExternalSurfaceZOrder.m218equalsimpl0(i13, AndroidExternalSurfaceZOrder.INSTANCE.m222getBehindB_4ceCc())) {
                        surfaceView.setZOrderOnTop(false);
                    } else if (AndroidExternalSurfaceZOrder.m218equalsimpl0(i13, AndroidExternalSurfaceZOrder.INSTANCE.m223getMediaOverlayB_4ceCc())) {
                        surfaceView.setZOrderMediaOverlay(true);
                    } else if (AndroidExternalSurfaceZOrder.m218equalsimpl0(i13, AndroidExternalSurfaceZOrder.INSTANCE.m224getOnTopB_4ceCc())) {
                        surfaceView.setZOrderOnTop(true);
                    }
                    surfaceView.setSecure(z1022);
                }
            };
            startRestartGroup.updateRememberedValue(obj);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            Modifier modifier422 = companion;
            AndroidView_androidKt.AndroidView(function1222, modifier422, androidExternalSurface_androidKt$AndroidExternalSurface$222, null, (Function1) obj, startRestartGroup, ((i4 << 3) & 112) | 384, 8);
            if (ComposerKt.isTraceInProgress()) {
            }
            j4 = j3;
            z7 = z3;
            modifier3 = modifier422;
            i9 = i8;
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
        if (i10 == 0) {
        }
        if (i11 != 0) {
        }
        if ((i3 & 4) != 0) {
        }
        if (i5 != 0) {
        }
        if (i7 != 0) {
        }
        startRestartGroup.endDefaults();
        if (ComposerKt.isTraceInProgress()) {
        }
        final AndroidExternalSurfaceState rememberAndroidExternalSurfaceState222 = rememberAndroidExternalSurfaceState(startRestartGroup, 0);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1356109309, "CC(remember):AndroidExternalSurface.android.kt#9igjgp");
        changedInstance = ((458752 & i4) != 131072) | startRestartGroup.changedInstance(rememberAndroidExternalSurfaceState222);
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
        z5 = ((((i4 & 896) ^ 384) <= 256 && startRestartGroup.changed(j2)) || (i4 & 384) == 256) | ((i4 & 112) != 32) | ((i4 & 7168) != 2048) | ((57344 & i4) == 16384);
        Object rememberedValue2222 = startRestartGroup.rememberedValue();
        if (z5) {
        }
        final boolean z9222 = z3;
        final long j5222 = j2;
        final boolean z10222 = z4;
        final int i12222 = i6;
        j3 = j5222;
        i8 = i12222;
        z6 = z10222;
        obj = (Function1) new Function1<SurfaceView, Unit>() { // from class: androidx.compose.foundation.AndroidExternalSurface_androidKt$AndroidExternalSurface$3$1
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
                if (!IntSize.m6433equalsimpl0(j5222, IntSize.INSTANCE.m6440getZeroYbymL2g())) {
                    surfaceView.getHolder().setFixedSize(IntSize.m6435getWidthimpl(j5222), IntSize.m6434getHeightimpl(j5222));
                } else {
                    surfaceView.getHolder().setSizeFromLayout();
                }
                surfaceView.getHolder().setFormat(z9222 ? -1 : -3);
                int i13 = i12222;
                if (AndroidExternalSurfaceZOrder.m218equalsimpl0(i13, AndroidExternalSurfaceZOrder.INSTANCE.m222getBehindB_4ceCc())) {
                    surfaceView.setZOrderOnTop(false);
                } else if (AndroidExternalSurfaceZOrder.m218equalsimpl0(i13, AndroidExternalSurfaceZOrder.INSTANCE.m223getMediaOverlayB_4ceCc())) {
                    surfaceView.setZOrderMediaOverlay(true);
                } else if (AndroidExternalSurfaceZOrder.m218equalsimpl0(i13, AndroidExternalSurfaceZOrder.INSTANCE.m224getOnTopB_4ceCc())) {
                    surfaceView.setZOrderOnTop(true);
                }
                surfaceView.setSecure(z10222);
            }
        };
        startRestartGroup.updateRememberedValue(obj);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        Modifier modifier4222 = companion;
        AndroidView_androidKt.AndroidView(function12222, modifier4222, androidExternalSurface_androidKt$AndroidExternalSurface$2222, null, (Function1) obj, startRestartGroup, ((i4 << 3) & 112) | 384, 8);
        if (ComposerKt.isTraceInProgress()) {
        }
        j4 = j3;
        z7 = z3;
        modifier3 = modifier4222;
        i9 = i8;
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

    /* JADX WARN: Removed duplicated region for block: B:104:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x006b  */
    /* renamed from: AndroidEmbeddedExternalSurface-sv6N_fY, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m225AndroidEmbeddedExternalSurfacesv6N_fY(Modifier modifier, boolean z, long j, float[] fArr, final Function1<? super AndroidExternalSurfaceScope, Unit> function1, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        boolean z2;
        long j2;
        int i4;
        Function1<? super AndroidExternalSurfaceScope, Unit> function12;
        Modifier.Companion companion;
        final float[] fArr2;
        final boolean z3;
        boolean changedInstance;
        Object rememberedValue;
        final long j3;
        final Modifier modifier3;
        final long j4;
        final boolean z4;
        final float[] fArr3;
        Composer startRestartGroup = composer.startRestartGroup(217541314);
        ComposerKt.sourceInformation(startRestartGroup, "C(AndroidEmbeddedExternalSurface)P(1!1,3:c#ui.unit.IntSize,4:c#ui.graphics.Matrix)455@18917L45,461@19089L639,457@18968L766:AndroidExternalSurface.android.kt#71ulvw");
        int i5 = i2 & 1;
        if (i5 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i3 = (startRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        int i6 = i2 & 2;
        if (i6 != 0) {
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
                i3 |= startRestartGroup.changedInstance(fArr != null ? Matrix.m4051boximpl(fArr) : null) ? 2048 : 1024;
            }
            if ((i2 & 16) == 0) {
                i3 |= 24576;
            } else if ((i & 24576) == 0) {
                function12 = function1;
                i3 |= startRestartGroup.changedInstance(function12) ? 16384 : 8192;
                if ((i3 & 9363) == 9362 || !startRestartGroup.getSkipping()) {
                    startRestartGroup.startDefaults();
                    if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                        companion = i5 != 0 ? Modifier.INSTANCE : modifier2;
                        if (i6 != 0) {
                            z2 = true;
                        }
                        if ((i2 & 4) != 0) {
                            i3 &= -897;
                            j2 = IntSize.INSTANCE.m6440getZeroYbymL2g();
                        }
                        if (i4 != 0) {
                            z3 = z2;
                            fArr2 = null;
                            startRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(217541314, i3, -1, "androidx.compose.foundation.AndroidEmbeddedExternalSurface (AndroidExternalSurface.android.kt:454)");
                            }
                            final AndroidEmbeddedExternalSurfaceState rememberAndroidEmbeddedExternalSurfaceState = rememberAndroidEmbeddedExternalSurfaceState(startRestartGroup, 0);
                            AndroidExternalSurface_androidKt$AndroidEmbeddedExternalSurface$1 androidExternalSurface_androidKt$AndroidEmbeddedExternalSurface$1 = new Function1<Context, TextureView>() { // from class: androidx.compose.foundation.AndroidExternalSurface_androidKt$AndroidEmbeddedExternalSurface$1
                                @Override // kotlin.jvm.functions.Function1
                                public final TextureView invoke(Context context) {
                                    return new TextureView(context);
                                }
                            };
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
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 184054658, "CC(remember):AndroidExternalSurface.android.kt#9igjgp");
                            changedInstance = ((((i3 & 896) ^ 384) <= 256 && startRestartGroup.changed(j2)) || (i3 & 384) == 256) | startRestartGroup.changedInstance(rememberAndroidEmbeddedExternalSurfaceState) | ((57344 & i3) != 16384) | ((i3 & 112) == 32) | startRestartGroup.changedInstance(fArr2 == null ? Matrix.m4051boximpl(fArr2) : null);
                            rememberedValue = startRestartGroup.rememberedValue();
                            if (!changedInstance || rememberedValue == Composer.INSTANCE.getEmpty()) {
                                j3 = j2;
                                final Function1<? super AndroidExternalSurfaceScope, Unit> function13 = function12;
                                rememberedValue = (Function1) new Function1<TextureView, Unit>() { // from class: androidx.compose.foundation.AndroidExternalSurface_androidKt$AndroidEmbeddedExternalSurface$3$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
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
                                        if (!IntSize.m6433equalsimpl0(j3, IntSize.INSTANCE.m6440getZeroYbymL2g()) && (surfaceTexture = textureView.getSurfaceTexture()) != null) {
                                            surfaceTexture.setDefaultBufferSize(IntSize.m6435getWidthimpl(j3), IntSize.m6434getHeightimpl(j3));
                                        }
                                        rememberAndroidEmbeddedExternalSurfaceState.m214setSurfaceSizeozmzZPI(j3);
                                        TextureView.SurfaceTextureListener surfaceTextureListener = textureView.getSurfaceTextureListener();
                                        AndroidEmbeddedExternalSurfaceState androidEmbeddedExternalSurfaceState = rememberAndroidEmbeddedExternalSurfaceState;
                                        if (surfaceTextureListener != androidEmbeddedExternalSurfaceState) {
                                            function13.invoke(androidEmbeddedExternalSurfaceState);
                                            textureView.setSurfaceTextureListener(rememberAndroidEmbeddedExternalSurfaceState);
                                        }
                                        textureView.setOpaque(z3);
                                        float[] fArr4 = fArr2;
                                        if (fArr4 != null) {
                                            matrix = rememberAndroidEmbeddedExternalSurfaceState.getMatrix();
                                            AndroidMatrixConversions_androidKt.m3693setFromEL8BTi8(matrix, fArr4);
                                        } else {
                                            matrix = null;
                                        }
                                        textureView.setTransform(matrix);
                                    }
                                };
                                startRestartGroup.updateRememberedValue(rememberedValue);
                            } else {
                                j3 = j2;
                            }
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            Modifier modifier4 = companion;
                            AndroidView_androidKt.AndroidView(androidExternalSurface_androidKt$AndroidEmbeddedExternalSurface$1, modifier4, androidExternalSurface_androidKt$AndroidEmbeddedExternalSurface$2, null, (Function1) rememberedValue, startRestartGroup, ((i3 << 3) & 112) | 390, 8);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            modifier3 = modifier4;
                            j4 = j3;
                            z4 = z3;
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
                    z3 = z2;
                    startRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    final AndroidEmbeddedExternalSurfaceState rememberAndroidEmbeddedExternalSurfaceState2 = rememberAndroidEmbeddedExternalSurfaceState(startRestartGroup, 0);
                    AndroidExternalSurface_androidKt$AndroidEmbeddedExternalSurface$1 androidExternalSurface_androidKt$AndroidEmbeddedExternalSurface$12 = new Function1<Context, TextureView>() { // from class: androidx.compose.foundation.AndroidExternalSurface_androidKt$AndroidEmbeddedExternalSurface$1
                        @Override // kotlin.jvm.functions.Function1
                        public final TextureView invoke(Context context) {
                            return new TextureView(context);
                        }
                    };
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
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 184054658, "CC(remember):AndroidExternalSurface.android.kt#9igjgp");
                    changedInstance = ((((i3 & 896) ^ 384) <= 256 && startRestartGroup.changed(j2)) || (i3 & 384) == 256) | startRestartGroup.changedInstance(rememberAndroidEmbeddedExternalSurfaceState2) | ((57344 & i3) != 16384) | ((i3 & 112) == 32) | startRestartGroup.changedInstance(fArr2 == null ? Matrix.m4051boximpl(fArr2) : null);
                    rememberedValue = startRestartGroup.rememberedValue();
                    if (changedInstance) {
                    }
                    j3 = j2;
                    final Function1<? super AndroidExternalSurfaceScope, Unit> function132 = function12;
                    rememberedValue = (Function1) new Function1<TextureView, Unit>() { // from class: androidx.compose.foundation.AndroidExternalSurface_androidKt$AndroidEmbeddedExternalSurface$3$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
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
                            if (!IntSize.m6433equalsimpl0(j3, IntSize.INSTANCE.m6440getZeroYbymL2g()) && (surfaceTexture = textureView.getSurfaceTexture()) != null) {
                                surfaceTexture.setDefaultBufferSize(IntSize.m6435getWidthimpl(j3), IntSize.m6434getHeightimpl(j3));
                            }
                            rememberAndroidEmbeddedExternalSurfaceState2.m214setSurfaceSizeozmzZPI(j3);
                            TextureView.SurfaceTextureListener surfaceTextureListener = textureView.getSurfaceTextureListener();
                            AndroidEmbeddedExternalSurfaceState androidEmbeddedExternalSurfaceState = rememberAndroidEmbeddedExternalSurfaceState2;
                            if (surfaceTextureListener != androidEmbeddedExternalSurfaceState) {
                                function132.invoke(androidEmbeddedExternalSurfaceState);
                                textureView.setSurfaceTextureListener(rememberAndroidEmbeddedExternalSurfaceState2);
                            }
                            textureView.setOpaque(z3);
                            float[] fArr4 = fArr2;
                            if (fArr4 != null) {
                                matrix = rememberAndroidEmbeddedExternalSurfaceState2.getMatrix();
                                AndroidMatrixConversions_androidKt.m3693setFromEL8BTi8(matrix, fArr4);
                            } else {
                                matrix = null;
                            }
                            textureView.setTransform(matrix);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    Modifier modifier42 = companion;
                    AndroidView_androidKt.AndroidView(androidExternalSurface_androidKt$AndroidEmbeddedExternalSurface$12, modifier42, androidExternalSurface_androidKt$AndroidEmbeddedExternalSurface$22, null, (Function1) rememberedValue, startRestartGroup, ((i3 << 3) & 112) | 390, 8);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    modifier3 = modifier42;
                    j4 = j3;
                    z4 = z3;
                    fArr3 = fArr2;
                } else {
                    startRestartGroup.skipToGroupEnd();
                    fArr3 = fArr;
                    modifier3 = modifier2;
                    z4 = z2;
                    j4 = j2;
                }
                ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
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

                        public final void invoke(Composer composer2, int i7) {
                            AndroidExternalSurface_androidKt.m225AndroidEmbeddedExternalSurfacesv6N_fY(Modifier.this, z4, j4, fArr3, function1, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                        }
                    });
                    return;
                }
                return;
            }
            function12 = function1;
            if ((i3 & 9363) == 9362) {
            }
            startRestartGroup.startDefaults();
            if ((i & 1) != 0) {
            }
            if (i5 != 0) {
            }
            if (i6 != 0) {
            }
            if ((i2 & 4) != 0) {
            }
            if (i4 != 0) {
            }
        }
        z2 = z;
        if ((i & 384) != 0) {
        }
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        if ((i2 & 16) == 0) {
        }
        function12 = function1;
        if ((i3 & 9363) == 9362) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i5 != 0) {
        }
        if (i6 != 0) {
        }
        if ((i2 & 4) != 0) {
        }
        if (i4 != 0) {
        }
    }
}
