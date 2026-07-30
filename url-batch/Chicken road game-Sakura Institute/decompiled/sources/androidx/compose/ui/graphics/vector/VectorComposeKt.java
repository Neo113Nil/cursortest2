package androidx.compose.ui.graphics.vector;

import androidx.autofill.HintConstants;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.profileinstaller.ProfileVerifier;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* compiled from: VectorCompose.kt */
@Metadata(d1 = {"\u0000L\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\u0085\u0001\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u00052\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0016\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\u00010\u0010¢\u0006\u0002\b\u0011¢\u0006\u0002\b\u0012H\u0007¢\u0006\u0002\u0010\u0013\u001a¦\u0001\u0010\u0014\u001a\u00020\u00012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\b\b\u0002\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u00052\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00192\b\b\u0002\u0010\u001c\u001a\u00020\u00052\b\b\u0002\u0010\u001d\u001a\u00020\u00052\b\b\u0002\u0010\u001e\u001a\u00020\u001f2\b\b\u0002\u0010 \u001a\u00020!2\b\b\u0002\u0010\"\u001a\u00020\u00052\b\b\u0002\u0010#\u001a\u00020\u00052\b\b\u0002\u0010$\u001a\u00020\u00052\b\b\u0002\u0010%\u001a\u00020\u0005H\u0007ø\u0001\u0000¢\u0006\u0004\b&\u0010'\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006("}, d2 = {"Group", "", HintConstants.AUTOFILL_HINT_NAME, "", "rotation", "", "pivotX", "pivotY", "scaleX", "scaleY", "translationX", "translationY", "clipPathData", "", "Landroidx/compose/ui/graphics/vector/PathNode;", "content", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "Landroidx/compose/ui/graphics/vector/VectorComposable;", "(Ljava/lang/String;FFFFFFFLjava/util/List;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "Path", "pathData", "pathFillType", "Landroidx/compose/ui/graphics/PathFillType;", "fill", "Landroidx/compose/ui/graphics/Brush;", "fillAlpha", "stroke", "strokeAlpha", "strokeLineWidth", "strokeLineCap", "Landroidx/compose/ui/graphics/StrokeCap;", "strokeLineJoin", "Landroidx/compose/ui/graphics/StrokeJoin;", "strokeLineMiter", "trimPathStart", "trimPathEnd", "trimPathOffset", "Path-9cdaXJ4", "(Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFLandroidx/compose/runtime/Composer;III)V", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class VectorComposeKt {
    /* JADX WARN: Removed duplicated region for block: B:107:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0124  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void Group(String str, float f, float f2, float f3, float f4, float f5, float f6, float f7, List<? extends PathNode> list, final Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, final int i, final int i2) {
        int i3;
        int i4;
        float f8;
        int i5;
        float f9;
        int i6;
        float f10;
        int i7;
        int i8;
        int i9;
        String str2;
        float f11;
        float f12;
        float f13;
        float f14;
        List<? extends PathNode> emptyPath;
        final float f15;
        final float f16;
        final float f17;
        final List<? extends PathNode> list2;
        final float f18;
        final float f19;
        ScopeUpdateScope endRestartGroup;
        int i10;
        Composer startRestartGroup = composer.startRestartGroup(-213417674);
        ComposerKt.sourceInformation(startRestartGroup, "C(Group)P(2,5,3,4,6,7,8,9)58@2500L585:VectorCompose.kt#huu6hf");
        int i11 = i2 & 1;
        if (i11 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i12 = i2 & 2;
        if (i12 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(f) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                f8 = f2;
                i3 |= startRestartGroup.changed(f8) ? 256 : 128;
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= 3072;
                } else if ((i & 3072) == 0) {
                    f9 = f3;
                    i3 |= startRestartGroup.changed(f9) ? 2048 : 1024;
                    i6 = i2 & 16;
                    if (i6 == 0) {
                        i3 |= 24576;
                    } else if ((i & 24576) == 0) {
                        f10 = f4;
                        i3 |= startRestartGroup.changed(f10) ? 16384 : 8192;
                        i7 = i2 & 32;
                        if (i7 != 0) {
                            i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                        } else if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                            i3 |= startRestartGroup.changed(f5) ? 131072 : 65536;
                        }
                        i8 = i2 & 64;
                        if (i8 != 0) {
                            i3 |= 1572864;
                        } else if ((i & 1572864) == 0) {
                            i3 |= startRestartGroup.changed(f6) ? 1048576 : 524288;
                        }
                        i9 = i2 & 128;
                        if (i9 != 0) {
                            i3 |= 12582912;
                        } else if ((i & 12582912) == 0) {
                            i3 |= startRestartGroup.changed(f7) ? 8388608 : 4194304;
                        }
                        if ((i & 100663296) == 0) {
                            if ((i2 & 256) == 0 && startRestartGroup.changedInstance(list)) {
                                i10 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                                i3 |= i10;
                            }
                            i10 = 33554432;
                            i3 |= i10;
                        }
                        if ((i2 & 512) != 0) {
                            i3 |= 805306368;
                        } else if ((i & 805306368) == 0) {
                            i3 |= startRestartGroup.changedInstance(function2) ? 536870912 : 268435456;
                        }
                        if ((306783379 & i3) == 306783378 || !startRestartGroup.getSkipping()) {
                            startRestartGroup.startDefaults();
                            if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                                str2 = i11 != 0 ? "" : str;
                                f11 = i12 != 0 ? 0.0f : f;
                                if (i4 != 0) {
                                    f8 = 0.0f;
                                }
                                if (i5 != 0) {
                                    f9 = 0.0f;
                                }
                                if (i6 != 0) {
                                    f10 = 1.0f;
                                }
                                f12 = i7 == 0 ? f5 : 1.0f;
                                f13 = i8 != 0 ? 0.0f : f6;
                                f14 = i9 == 0 ? f7 : 0.0f;
                                if ((i2 & 256) != 0) {
                                    emptyPath = VectorKt.getEmptyPath();
                                    i3 &= -234881025;
                                    startRestartGroup.endDefaults();
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-213417674, i3, -1, "androidx.compose.ui.graphics.vector.Group (VectorCompose.kt:57)");
                                    }
                                    VectorComposeKt$Group$1 vectorComposeKt$Group$1 = new Function0<GroupComponent>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$1
                                        /* JADX WARN: Can't rename method to resolve collision */
                                        @Override // kotlin.jvm.functions.Function0
                                        public final GroupComponent invoke() {
                                            return new GroupComponent();
                                        }
                                    };
                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -548224868, "CC(ComposeNode)P(1,2)336@12596L9:Composables.kt#9igjgp");
                                    if (!(startRestartGroup.getApplier() instanceof VectorApplier)) {
                                        ComposablesKt.invalidApplier();
                                    }
                                    startRestartGroup.startNode();
                                    if (!startRestartGroup.getInserting()) {
                                        startRestartGroup.createNode(vectorComposeKt$Group$1);
                                    } else {
                                        startRestartGroup.useNode();
                                    }
                                    Composer m3333constructorimpl = Updater.m3333constructorimpl(startRestartGroup);
                                    Updater.m3340setimpl(m3333constructorimpl, str2, new Function2<GroupComponent, String, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$1
                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, String str3) {
                                            invoke2(groupComponent, str3);
                                            return Unit.INSTANCE;
                                        }

                                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2(GroupComponent groupComponent, String str3) {
                                            groupComponent.setName(str3);
                                        }
                                    });
                                    Updater.m3340setimpl(m3333constructorimpl, Float.valueOf(f11), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$2
                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f20) {
                                            invoke(groupComponent, f20.floatValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void invoke(GroupComponent groupComponent, float f20) {
                                            groupComponent.setRotation(f20);
                                        }
                                    });
                                    Updater.m3340setimpl(m3333constructorimpl, Float.valueOf(f8), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$3
                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f20) {
                                            invoke(groupComponent, f20.floatValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void invoke(GroupComponent groupComponent, float f20) {
                                            groupComponent.setPivotX(f20);
                                        }
                                    });
                                    Updater.m3340setimpl(m3333constructorimpl, Float.valueOf(f9), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$4
                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f20) {
                                            invoke(groupComponent, f20.floatValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void invoke(GroupComponent groupComponent, float f20) {
                                            groupComponent.setPivotY(f20);
                                        }
                                    });
                                    Updater.m3340setimpl(m3333constructorimpl, Float.valueOf(f10), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$5
                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f20) {
                                            invoke(groupComponent, f20.floatValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void invoke(GroupComponent groupComponent, float f20) {
                                            groupComponent.setScaleX(f20);
                                        }
                                    });
                                    Updater.m3340setimpl(m3333constructorimpl, Float.valueOf(f12), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$6
                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f20) {
                                            invoke(groupComponent, f20.floatValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void invoke(GroupComponent groupComponent, float f20) {
                                            groupComponent.setScaleY(f20);
                                        }
                                    });
                                    Updater.m3340setimpl(m3333constructorimpl, Float.valueOf(f13), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$7
                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f20) {
                                            invoke(groupComponent, f20.floatValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void invoke(GroupComponent groupComponent, float f20) {
                                            groupComponent.setTranslationX(f20);
                                        }
                                    });
                                    Updater.m3340setimpl(m3333constructorimpl, Float.valueOf(f14), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$8
                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f20) {
                                            invoke(groupComponent, f20.floatValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void invoke(GroupComponent groupComponent, float f20) {
                                            groupComponent.setTranslationY(f20);
                                        }
                                    });
                                    Updater.m3340setimpl(m3333constructorimpl, emptyPath, new Function2<GroupComponent, List<? extends PathNode>, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$9
                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, List<? extends PathNode> list3) {
                                            invoke2(groupComponent, list3);
                                            return Unit.INSTANCE;
                                        }

                                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2(GroupComponent groupComponent, List<? extends PathNode> list3) {
                                            groupComponent.setClipPathData(list3);
                                        }
                                    });
                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 541925533, "C72@3070L9:VectorCompose.kt#huu6hf");
                                    function2.invoke(startRestartGroup, Integer.valueOf((i3 >> 27) & 14));
                                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                    startRestartGroup.endNode();
                                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                    f15 = f12;
                                    f16 = f13;
                                    f17 = f9;
                                    list2 = emptyPath;
                                    float f20 = f8;
                                    f18 = f14;
                                    f19 = f20;
                                }
                            } else {
                                startRestartGroup.skipToGroupEnd();
                                if ((i2 & 256) != 0) {
                                    i3 &= -234881025;
                                }
                                str2 = str;
                                f11 = f;
                                f12 = f5;
                                f13 = f6;
                                f14 = f7;
                            }
                            emptyPath = list;
                            startRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            VectorComposeKt$Group$1 vectorComposeKt$Group$12 = new Function0<GroupComponent>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$1
                                /* JADX WARN: Can't rename method to resolve collision */
                                @Override // kotlin.jvm.functions.Function0
                                public final GroupComponent invoke() {
                                    return new GroupComponent();
                                }
                            };
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -548224868, "CC(ComposeNode)P(1,2)336@12596L9:Composables.kt#9igjgp");
                            if (!(startRestartGroup.getApplier() instanceof VectorApplier)) {
                            }
                            startRestartGroup.startNode();
                            if (!startRestartGroup.getInserting()) {
                            }
                            Composer m3333constructorimpl2 = Updater.m3333constructorimpl(startRestartGroup);
                            Updater.m3340setimpl(m3333constructorimpl2, str2, new Function2<GroupComponent, String, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$1
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, String str3) {
                                    invoke2(groupComponent, str3);
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(GroupComponent groupComponent, String str3) {
                                    groupComponent.setName(str3);
                                }
                            });
                            Updater.m3340setimpl(m3333constructorimpl2, Float.valueOf(f11), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$2
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f202) {
                                    invoke(groupComponent, f202.floatValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(GroupComponent groupComponent, float f202) {
                                    groupComponent.setRotation(f202);
                                }
                            });
                            Updater.m3340setimpl(m3333constructorimpl2, Float.valueOf(f8), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$3
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f202) {
                                    invoke(groupComponent, f202.floatValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(GroupComponent groupComponent, float f202) {
                                    groupComponent.setPivotX(f202);
                                }
                            });
                            Updater.m3340setimpl(m3333constructorimpl2, Float.valueOf(f9), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$4
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f202) {
                                    invoke(groupComponent, f202.floatValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(GroupComponent groupComponent, float f202) {
                                    groupComponent.setPivotY(f202);
                                }
                            });
                            Updater.m3340setimpl(m3333constructorimpl2, Float.valueOf(f10), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$5
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f202) {
                                    invoke(groupComponent, f202.floatValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(GroupComponent groupComponent, float f202) {
                                    groupComponent.setScaleX(f202);
                                }
                            });
                            Updater.m3340setimpl(m3333constructorimpl2, Float.valueOf(f12), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$6
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f202) {
                                    invoke(groupComponent, f202.floatValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(GroupComponent groupComponent, float f202) {
                                    groupComponent.setScaleY(f202);
                                }
                            });
                            Updater.m3340setimpl(m3333constructorimpl2, Float.valueOf(f13), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$7
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f202) {
                                    invoke(groupComponent, f202.floatValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(GroupComponent groupComponent, float f202) {
                                    groupComponent.setTranslationX(f202);
                                }
                            });
                            Updater.m3340setimpl(m3333constructorimpl2, Float.valueOf(f14), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$8
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f202) {
                                    invoke(groupComponent, f202.floatValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(GroupComponent groupComponent, float f202) {
                                    groupComponent.setTranslationY(f202);
                                }
                            });
                            Updater.m3340setimpl(m3333constructorimpl2, emptyPath, new Function2<GroupComponent, List<? extends PathNode>, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$9
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, List<? extends PathNode> list3) {
                                    invoke2(groupComponent, list3);
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(GroupComponent groupComponent, List<? extends PathNode> list3) {
                                    groupComponent.setClipPathData(list3);
                                }
                            });
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 541925533, "C72@3070L9:VectorCompose.kt#huu6hf");
                            function2.invoke(startRestartGroup, Integer.valueOf((i3 >> 27) & 14));
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            startRestartGroup.endNode();
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            f15 = f12;
                            f16 = f13;
                            f17 = f9;
                            list2 = emptyPath;
                            float f202 = f8;
                            f18 = f14;
                            f19 = f202;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            str2 = str;
                            f11 = f;
                            f15 = f5;
                            f16 = f6;
                            list2 = list;
                            f19 = f8;
                            f17 = f9;
                            f18 = f7;
                        }
                        endRestartGroup = startRestartGroup.endRestartGroup();
                        if (endRestartGroup != null) {
                            final String str3 = str2;
                            final float f21 = f11;
                            final float f22 = f10;
                            endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$4
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
                                    VectorComposeKt.Group(str3, f21, f19, f17, f22, f15, f16, f18, list2, function2, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                                }
                            });
                            return;
                        }
                        return;
                    }
                    f10 = f4;
                    i7 = i2 & 32;
                    if (i7 != 0) {
                    }
                    i8 = i2 & 64;
                    if (i8 != 0) {
                    }
                    i9 = i2 & 128;
                    if (i9 != 0) {
                    }
                    if ((i & 100663296) == 0) {
                    }
                    if ((i2 & 512) != 0) {
                    }
                    if ((306783379 & i3) == 306783378) {
                    }
                    startRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                    }
                    if (i11 != 0) {
                    }
                    if (i12 != 0) {
                    }
                    if (i4 != 0) {
                    }
                    if (i5 != 0) {
                    }
                    if (i6 != 0) {
                    }
                    if (i7 == 0) {
                    }
                    if (i8 != 0) {
                    }
                    if (i9 == 0) {
                    }
                    if ((i2 & 256) != 0) {
                    }
                    emptyPath = list;
                    startRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    VectorComposeKt$Group$1 vectorComposeKt$Group$122 = new Function0<GroupComponent>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$1
                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // kotlin.jvm.functions.Function0
                        public final GroupComponent invoke() {
                            return new GroupComponent();
                        }
                    };
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -548224868, "CC(ComposeNode)P(1,2)336@12596L9:Composables.kt#9igjgp");
                    if (!(startRestartGroup.getApplier() instanceof VectorApplier)) {
                    }
                    startRestartGroup.startNode();
                    if (!startRestartGroup.getInserting()) {
                    }
                    Composer m3333constructorimpl22 = Updater.m3333constructorimpl(startRestartGroup);
                    Updater.m3340setimpl(m3333constructorimpl22, str2, new Function2<GroupComponent, String, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$1
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, String str32) {
                            invoke2(groupComponent, str32);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(GroupComponent groupComponent, String str32) {
                            groupComponent.setName(str32);
                        }
                    });
                    Updater.m3340setimpl(m3333constructorimpl22, Float.valueOf(f11), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$2
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f2022) {
                            invoke(groupComponent, f2022.floatValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(GroupComponent groupComponent, float f2022) {
                            groupComponent.setRotation(f2022);
                        }
                    });
                    Updater.m3340setimpl(m3333constructorimpl22, Float.valueOf(f8), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$3
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f2022) {
                            invoke(groupComponent, f2022.floatValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(GroupComponent groupComponent, float f2022) {
                            groupComponent.setPivotX(f2022);
                        }
                    });
                    Updater.m3340setimpl(m3333constructorimpl22, Float.valueOf(f9), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$4
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f2022) {
                            invoke(groupComponent, f2022.floatValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(GroupComponent groupComponent, float f2022) {
                            groupComponent.setPivotY(f2022);
                        }
                    });
                    Updater.m3340setimpl(m3333constructorimpl22, Float.valueOf(f10), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$5
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f2022) {
                            invoke(groupComponent, f2022.floatValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(GroupComponent groupComponent, float f2022) {
                            groupComponent.setScaleX(f2022);
                        }
                    });
                    Updater.m3340setimpl(m3333constructorimpl22, Float.valueOf(f12), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$6
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f2022) {
                            invoke(groupComponent, f2022.floatValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(GroupComponent groupComponent, float f2022) {
                            groupComponent.setScaleY(f2022);
                        }
                    });
                    Updater.m3340setimpl(m3333constructorimpl22, Float.valueOf(f13), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$7
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f2022) {
                            invoke(groupComponent, f2022.floatValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(GroupComponent groupComponent, float f2022) {
                            groupComponent.setTranslationX(f2022);
                        }
                    });
                    Updater.m3340setimpl(m3333constructorimpl22, Float.valueOf(f14), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$8
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f2022) {
                            invoke(groupComponent, f2022.floatValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(GroupComponent groupComponent, float f2022) {
                            groupComponent.setTranslationY(f2022);
                        }
                    });
                    Updater.m3340setimpl(m3333constructorimpl22, emptyPath, new Function2<GroupComponent, List<? extends PathNode>, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$9
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, List<? extends PathNode> list3) {
                            invoke2(groupComponent, list3);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(GroupComponent groupComponent, List<? extends PathNode> list3) {
                            groupComponent.setClipPathData(list3);
                        }
                    });
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 541925533, "C72@3070L9:VectorCompose.kt#huu6hf");
                    function2.invoke(startRestartGroup, Integer.valueOf((i3 >> 27) & 14));
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    startRestartGroup.endNode();
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    f15 = f12;
                    f16 = f13;
                    f17 = f9;
                    list2 = emptyPath;
                    float f2022 = f8;
                    f18 = f14;
                    f19 = f2022;
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                f9 = f3;
                i6 = i2 & 16;
                if (i6 == 0) {
                }
                f10 = f4;
                i7 = i2 & 32;
                if (i7 != 0) {
                }
                i8 = i2 & 64;
                if (i8 != 0) {
                }
                i9 = i2 & 128;
                if (i9 != 0) {
                }
                if ((i & 100663296) == 0) {
                }
                if ((i2 & 512) != 0) {
                }
                if ((306783379 & i3) == 306783378) {
                }
                startRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                }
                if (i11 != 0) {
                }
                if (i12 != 0) {
                }
                if (i4 != 0) {
                }
                if (i5 != 0) {
                }
                if (i6 != 0) {
                }
                if (i7 == 0) {
                }
                if (i8 != 0) {
                }
                if (i9 == 0) {
                }
                if ((i2 & 256) != 0) {
                }
                emptyPath = list;
                startRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                VectorComposeKt$Group$1 vectorComposeKt$Group$1222 = new Function0<GroupComponent>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final GroupComponent invoke() {
                        return new GroupComponent();
                    }
                };
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -548224868, "CC(ComposeNode)P(1,2)336@12596L9:Composables.kt#9igjgp");
                if (!(startRestartGroup.getApplier() instanceof VectorApplier)) {
                }
                startRestartGroup.startNode();
                if (!startRestartGroup.getInserting()) {
                }
                Composer m3333constructorimpl222 = Updater.m3333constructorimpl(startRestartGroup);
                Updater.m3340setimpl(m3333constructorimpl222, str2, new Function2<GroupComponent, String, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, String str32) {
                        invoke2(groupComponent, str32);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(GroupComponent groupComponent, String str32) {
                        groupComponent.setName(str32);
                    }
                });
                Updater.m3340setimpl(m3333constructorimpl222, Float.valueOf(f11), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$2
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f20222) {
                        invoke(groupComponent, f20222.floatValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(GroupComponent groupComponent, float f20222) {
                        groupComponent.setRotation(f20222);
                    }
                });
                Updater.m3340setimpl(m3333constructorimpl222, Float.valueOf(f8), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$3
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f20222) {
                        invoke(groupComponent, f20222.floatValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(GroupComponent groupComponent, float f20222) {
                        groupComponent.setPivotX(f20222);
                    }
                });
                Updater.m3340setimpl(m3333constructorimpl222, Float.valueOf(f9), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$4
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f20222) {
                        invoke(groupComponent, f20222.floatValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(GroupComponent groupComponent, float f20222) {
                        groupComponent.setPivotY(f20222);
                    }
                });
                Updater.m3340setimpl(m3333constructorimpl222, Float.valueOf(f10), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$5
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f20222) {
                        invoke(groupComponent, f20222.floatValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(GroupComponent groupComponent, float f20222) {
                        groupComponent.setScaleX(f20222);
                    }
                });
                Updater.m3340setimpl(m3333constructorimpl222, Float.valueOf(f12), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$6
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f20222) {
                        invoke(groupComponent, f20222.floatValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(GroupComponent groupComponent, float f20222) {
                        groupComponent.setScaleY(f20222);
                    }
                });
                Updater.m3340setimpl(m3333constructorimpl222, Float.valueOf(f13), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$7
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f20222) {
                        invoke(groupComponent, f20222.floatValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(GroupComponent groupComponent, float f20222) {
                        groupComponent.setTranslationX(f20222);
                    }
                });
                Updater.m3340setimpl(m3333constructorimpl222, Float.valueOf(f14), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$8
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f20222) {
                        invoke(groupComponent, f20222.floatValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(GroupComponent groupComponent, float f20222) {
                        groupComponent.setTranslationY(f20222);
                    }
                });
                Updater.m3340setimpl(m3333constructorimpl222, emptyPath, new Function2<GroupComponent, List<? extends PathNode>, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$9
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, List<? extends PathNode> list3) {
                        invoke2(groupComponent, list3);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(GroupComponent groupComponent, List<? extends PathNode> list3) {
                        groupComponent.setClipPathData(list3);
                    }
                });
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 541925533, "C72@3070L9:VectorCompose.kt#huu6hf");
                function2.invoke(startRestartGroup, Integer.valueOf((i3 >> 27) & 14));
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                startRestartGroup.endNode();
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                if (ComposerKt.isTraceInProgress()) {
                }
                f15 = f12;
                f16 = f13;
                f17 = f9;
                list2 = emptyPath;
                float f20222 = f8;
                f18 = f14;
                f19 = f20222;
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            f8 = f2;
            i5 = i2 & 8;
            if (i5 != 0) {
            }
            f9 = f3;
            i6 = i2 & 16;
            if (i6 == 0) {
            }
            f10 = f4;
            i7 = i2 & 32;
            if (i7 != 0) {
            }
            i8 = i2 & 64;
            if (i8 != 0) {
            }
            i9 = i2 & 128;
            if (i9 != 0) {
            }
            if ((i & 100663296) == 0) {
            }
            if ((i2 & 512) != 0) {
            }
            if ((306783379 & i3) == 306783378) {
            }
            startRestartGroup.startDefaults();
            if ((i & 1) != 0) {
            }
            if (i11 != 0) {
            }
            if (i12 != 0) {
            }
            if (i4 != 0) {
            }
            if (i5 != 0) {
            }
            if (i6 != 0) {
            }
            if (i7 == 0) {
            }
            if (i8 != 0) {
            }
            if (i9 == 0) {
            }
            if ((i2 & 256) != 0) {
            }
            emptyPath = list;
            startRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
            }
            VectorComposeKt$Group$1 vectorComposeKt$Group$12222 = new Function0<GroupComponent>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$1
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function0
                public final GroupComponent invoke() {
                    return new GroupComponent();
                }
            };
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -548224868, "CC(ComposeNode)P(1,2)336@12596L9:Composables.kt#9igjgp");
            if (!(startRestartGroup.getApplier() instanceof VectorApplier)) {
            }
            startRestartGroup.startNode();
            if (!startRestartGroup.getInserting()) {
            }
            Composer m3333constructorimpl2222 = Updater.m3333constructorimpl(startRestartGroup);
            Updater.m3340setimpl(m3333constructorimpl2222, str2, new Function2<GroupComponent, String, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, String str32) {
                    invoke2(groupComponent, str32);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(GroupComponent groupComponent, String str32) {
                    groupComponent.setName(str32);
                }
            });
            Updater.m3340setimpl(m3333constructorimpl2222, Float.valueOf(f11), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$2
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f202222) {
                    invoke(groupComponent, f202222.floatValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(GroupComponent groupComponent, float f202222) {
                    groupComponent.setRotation(f202222);
                }
            });
            Updater.m3340setimpl(m3333constructorimpl2222, Float.valueOf(f8), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$3
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f202222) {
                    invoke(groupComponent, f202222.floatValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(GroupComponent groupComponent, float f202222) {
                    groupComponent.setPivotX(f202222);
                }
            });
            Updater.m3340setimpl(m3333constructorimpl2222, Float.valueOf(f9), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$4
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f202222) {
                    invoke(groupComponent, f202222.floatValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(GroupComponent groupComponent, float f202222) {
                    groupComponent.setPivotY(f202222);
                }
            });
            Updater.m3340setimpl(m3333constructorimpl2222, Float.valueOf(f10), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$5
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f202222) {
                    invoke(groupComponent, f202222.floatValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(GroupComponent groupComponent, float f202222) {
                    groupComponent.setScaleX(f202222);
                }
            });
            Updater.m3340setimpl(m3333constructorimpl2222, Float.valueOf(f12), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$6
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f202222) {
                    invoke(groupComponent, f202222.floatValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(GroupComponent groupComponent, float f202222) {
                    groupComponent.setScaleY(f202222);
                }
            });
            Updater.m3340setimpl(m3333constructorimpl2222, Float.valueOf(f13), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$7
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f202222) {
                    invoke(groupComponent, f202222.floatValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(GroupComponent groupComponent, float f202222) {
                    groupComponent.setTranslationX(f202222);
                }
            });
            Updater.m3340setimpl(m3333constructorimpl2222, Float.valueOf(f14), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$8
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f202222) {
                    invoke(groupComponent, f202222.floatValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(GroupComponent groupComponent, float f202222) {
                    groupComponent.setTranslationY(f202222);
                }
            });
            Updater.m3340setimpl(m3333constructorimpl2222, emptyPath, new Function2<GroupComponent, List<? extends PathNode>, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$9
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, List<? extends PathNode> list3) {
                    invoke2(groupComponent, list3);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(GroupComponent groupComponent, List<? extends PathNode> list3) {
                    groupComponent.setClipPathData(list3);
                }
            });
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 541925533, "C72@3070L9:VectorCompose.kt#huu6hf");
            function2.invoke(startRestartGroup, Integer.valueOf((i3 >> 27) & 14));
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            if (ComposerKt.isTraceInProgress()) {
            }
            f15 = f12;
            f16 = f13;
            f17 = f9;
            list2 = emptyPath;
            float f202222 = f8;
            f18 = f14;
            f19 = f202222;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        f8 = f2;
        i5 = i2 & 8;
        if (i5 != 0) {
        }
        f9 = f3;
        i6 = i2 & 16;
        if (i6 == 0) {
        }
        f10 = f4;
        i7 = i2 & 32;
        if (i7 != 0) {
        }
        i8 = i2 & 64;
        if (i8 != 0) {
        }
        i9 = i2 & 128;
        if (i9 != 0) {
        }
        if ((i & 100663296) == 0) {
        }
        if ((i2 & 512) != 0) {
        }
        if ((306783379 & i3) == 306783378) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i11 != 0) {
        }
        if (i12 != 0) {
        }
        if (i4 != 0) {
        }
        if (i5 != 0) {
        }
        if (i6 != 0) {
        }
        if (i7 == 0) {
        }
        if (i8 != 0) {
        }
        if (i9 == 0) {
        }
        if ((i2 & 256) != 0) {
        }
        emptyPath = list;
        startRestartGroup.endDefaults();
        if (ComposerKt.isTraceInProgress()) {
        }
        VectorComposeKt$Group$1 vectorComposeKt$Group$122222 = new Function0<GroupComponent>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final GroupComponent invoke() {
                return new GroupComponent();
            }
        };
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -548224868, "CC(ComposeNode)P(1,2)336@12596L9:Composables.kt#9igjgp");
        if (!(startRestartGroup.getApplier() instanceof VectorApplier)) {
        }
        startRestartGroup.startNode();
        if (!startRestartGroup.getInserting()) {
        }
        Composer m3333constructorimpl22222 = Updater.m3333constructorimpl(startRestartGroup);
        Updater.m3340setimpl(m3333constructorimpl22222, str2, new Function2<GroupComponent, String, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$1
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, String str32) {
                invoke2(groupComponent, str32);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(GroupComponent groupComponent, String str32) {
                groupComponent.setName(str32);
            }
        });
        Updater.m3340setimpl(m3333constructorimpl22222, Float.valueOf(f11), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$2
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f2022222) {
                invoke(groupComponent, f2022222.floatValue());
                return Unit.INSTANCE;
            }

            public final void invoke(GroupComponent groupComponent, float f2022222) {
                groupComponent.setRotation(f2022222);
            }
        });
        Updater.m3340setimpl(m3333constructorimpl22222, Float.valueOf(f8), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$3
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f2022222) {
                invoke(groupComponent, f2022222.floatValue());
                return Unit.INSTANCE;
            }

            public final void invoke(GroupComponent groupComponent, float f2022222) {
                groupComponent.setPivotX(f2022222);
            }
        });
        Updater.m3340setimpl(m3333constructorimpl22222, Float.valueOf(f9), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$4
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f2022222) {
                invoke(groupComponent, f2022222.floatValue());
                return Unit.INSTANCE;
            }

            public final void invoke(GroupComponent groupComponent, float f2022222) {
                groupComponent.setPivotY(f2022222);
            }
        });
        Updater.m3340setimpl(m3333constructorimpl22222, Float.valueOf(f10), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$5
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f2022222) {
                invoke(groupComponent, f2022222.floatValue());
                return Unit.INSTANCE;
            }

            public final void invoke(GroupComponent groupComponent, float f2022222) {
                groupComponent.setScaleX(f2022222);
            }
        });
        Updater.m3340setimpl(m3333constructorimpl22222, Float.valueOf(f12), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$6
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f2022222) {
                invoke(groupComponent, f2022222.floatValue());
                return Unit.INSTANCE;
            }

            public final void invoke(GroupComponent groupComponent, float f2022222) {
                groupComponent.setScaleY(f2022222);
            }
        });
        Updater.m3340setimpl(m3333constructorimpl22222, Float.valueOf(f13), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$7
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f2022222) {
                invoke(groupComponent, f2022222.floatValue());
                return Unit.INSTANCE;
            }

            public final void invoke(GroupComponent groupComponent, float f2022222) {
                groupComponent.setTranslationX(f2022222);
            }
        });
        Updater.m3340setimpl(m3333constructorimpl22222, Float.valueOf(f14), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$8
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f2022222) {
                invoke(groupComponent, f2022222.floatValue());
                return Unit.INSTANCE;
            }

            public final void invoke(GroupComponent groupComponent, float f2022222) {
                groupComponent.setTranslationY(f2022222);
            }
        });
        Updater.m3340setimpl(m3333constructorimpl22222, emptyPath, new Function2<GroupComponent, List<? extends PathNode>, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$9
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, List<? extends PathNode> list3) {
                invoke2(groupComponent, list3);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(GroupComponent groupComponent, List<? extends PathNode> list3) {
                groupComponent.setClipPathData(list3);
            }
        });
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 541925533, "C72@3070L9:VectorCompose.kt#huu6hf");
        function2.invoke(startRestartGroup, Integer.valueOf((i3 >> 27) & 14));
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        startRestartGroup.endNode();
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        if (ComposerKt.isTraceInProgress()) {
        }
        f15 = f12;
        f16 = f13;
        f17 = f9;
        list2 = emptyPath;
        float f2022222 = f8;
        f18 = f14;
        f19 = f2022222;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0314  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0329  */
    /* JADX WARN: Removed duplicated region for block: B:61:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0273  */
    /* renamed from: Path-9cdaXJ4, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m4543Path9cdaXJ4(final List<? extends PathNode> list, int i, String str, Brush brush, float f, Brush brush2, float f2, float f3, int i2, int i3, float f4, float f5, float f6, float f7, Composer composer, final int i4, final int i5, final int i6) {
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int defaultFillType;
        Brush brush3;
        float f8;
        final float f9;
        final String str2;
        final float f10;
        final float f11;
        final int i21;
        final float f12;
        final Brush brush4;
        final float f13;
        final float f14;
        final int i22;
        ScopeUpdateScope endRestartGroup;
        Composer startRestartGroup = composer.startRestartGroup(-1478270750);
        ComposerKt.sourceInformation(startRestartGroup, "C(Path)P(3,4:c#ui.graphics.PathFillType,2!4,10,7:c#ui.graphics.StrokeCap,8:c#ui.graphics.StrokeJoin!1,13)115@5068L876:VectorCompose.kt#huu6hf");
        if ((i6 & 1) != 0) {
            i7 = i4 | 6;
        } else if ((i4 & 6) == 0) {
            i7 = (startRestartGroup.changedInstance(list) ? 4 : 2) | i4;
        } else {
            i7 = i4;
        }
        int i23 = i6 & 2;
        if (i23 != 0) {
            i7 |= 48;
        } else if ((i4 & 48) == 0) {
            i7 |= startRestartGroup.changed(i) ? 32 : 16;
            i8 = i6 & 4;
            if (i8 == 0) {
                i7 |= 384;
            } else if ((i4 & 384) == 0) {
                i7 |= startRestartGroup.changed(str) ? 256 : 128;
                i9 = i6 & 8;
                if (i9 != 0) {
                    i7 |= 3072;
                } else if ((i4 & 3072) == 0) {
                    i7 |= startRestartGroup.changed(brush) ? 2048 : 1024;
                    i10 = i6 & 16;
                    if (i10 == 0) {
                        i7 |= 24576;
                    } else if ((i4 & 24576) == 0) {
                        i7 |= startRestartGroup.changed(f) ? 16384 : 8192;
                        i11 = i6 & 32;
                        if (i11 != 0) {
                            i7 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                        } else if ((i4 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                            i7 |= startRestartGroup.changed(brush2) ? 131072 : 65536;
                        }
                        i12 = i6 & 64;
                        if (i12 != 0) {
                            i7 |= 1572864;
                        } else if ((i4 & 1572864) == 0) {
                            i7 |= startRestartGroup.changed(f2) ? 1048576 : 524288;
                        }
                        i13 = i6 & 128;
                        if (i13 != 0) {
                            i7 |= 12582912;
                        } else if ((i4 & 12582912) == 0) {
                            i7 |= startRestartGroup.changed(f3) ? 8388608 : 4194304;
                        }
                        i14 = i6 & 256;
                        if (i14 != 0) {
                            i7 |= 100663296;
                        } else if ((i4 & 100663296) == 0) {
                            i7 |= startRestartGroup.changed(i2) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                        }
                        i15 = i6 & 512;
                        if (i15 != 0) {
                            i7 |= 805306368;
                        } else if ((i4 & 805306368) == 0) {
                            i7 |= startRestartGroup.changed(i3) ? 536870912 : 268435456;
                        }
                        i16 = i6 & 1024;
                        if (i16 != 0) {
                            i17 = i5 | 6;
                        } else if ((i5 & 6) == 0) {
                            i17 = i5 | (startRestartGroup.changed(f4) ? 4 : 2);
                        } else {
                            i17 = i5;
                        }
                        i18 = i6 & 2048;
                        if (i18 != 0) {
                            i17 |= 48;
                        } else if ((i5 & 48) == 0) {
                            i17 |= startRestartGroup.changed(f5) ? 32 : 16;
                        }
                        int i24 = i17;
                        i19 = i6 & 4096;
                        if (i19 != 0) {
                            i24 |= 384;
                        } else if ((i5 & 384) == 0) {
                            i24 |= startRestartGroup.changed(f6) ? 256 : 128;
                            i20 = i6 & 8192;
                            if (i20 == 0) {
                                i24 |= 3072;
                            } else if ((i5 & 3072) == 0) {
                                i24 |= startRestartGroup.changed(f7) ? 2048 : 1024;
                                if ((i7 & 306783379) == 306783378 || (i24 & 1171) != 1170 || !startRestartGroup.getSkipping()) {
                                    defaultFillType = i23 != 0 ? VectorKt.getDefaultFillType() : i;
                                    String str3 = i8 != 0 ? "" : str;
                                    Brush brush5 = i9 != 0 ? null : brush;
                                    float f15 = i10 != 0 ? 1.0f : f;
                                    brush3 = i11 != 0 ? null : brush2;
                                    float f16 = i12 != 0 ? 1.0f : f2;
                                    float f17 = i13 != 0 ? 0.0f : f3;
                                    int defaultStrokeLineCap = i14 != 0 ? VectorKt.getDefaultStrokeLineCap() : i2;
                                    int defaultStrokeLineJoin = i15 != 0 ? VectorKt.getDefaultStrokeLineJoin() : i3;
                                    float f18 = i16 != 0 ? 4.0f : f4;
                                    float f19 = i18 != 0 ? 0.0f : f5;
                                    float f20 = i19 != 0 ? 1.0f : f6;
                                    f8 = i20 == 0 ? f7 : 0.0f;
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-1478270750, i7, i24, "androidx.compose.ui.graphics.vector.Path (VectorCompose.kt:114)");
                                    }
                                    VectorComposeKt$Path$1 vectorComposeKt$Path$1 = new Function0<PathComponent>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Path$1
                                        /* JADX WARN: Can't rename method to resolve collision */
                                        @Override // kotlin.jvm.functions.Function0
                                        public final PathComponent invoke() {
                                            return new PathComponent();
                                        }
                                    };
                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1886828752, "CC(ComposeNode):Composables.kt#9igjgp");
                                    if (!(startRestartGroup.getApplier() instanceof VectorApplier)) {
                                        ComposablesKt.invalidApplier();
                                    }
                                    startRestartGroup.startNode();
                                    if (startRestartGroup.getInserting()) {
                                        startRestartGroup.createNode(vectorComposeKt$Path$1);
                                    } else {
                                        startRestartGroup.useNode();
                                    }
                                    Composer m3333constructorimpl = Updater.m3333constructorimpl(startRestartGroup);
                                    Updater.m3340setimpl(m3333constructorimpl, str3, new Function2<PathComponent, String, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Path$2$1
                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(PathComponent pathComponent, String str4) {
                                            invoke2(pathComponent, str4);
                                            return Unit.INSTANCE;
                                        }

                                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2(PathComponent pathComponent, String str4) {
                                            pathComponent.setName(str4);
                                        }
                                    });
                                    Updater.m3340setimpl(m3333constructorimpl, list, new Function2<PathComponent, List<? extends PathNode>, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Path$2$2
                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(PathComponent pathComponent, List<? extends PathNode> list2) {
                                            invoke2(pathComponent, list2);
                                            return Unit.INSTANCE;
                                        }

                                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2(PathComponent pathComponent, List<? extends PathNode> list2) {
                                            pathComponent.setPathData(list2);
                                        }
                                    });
                                    Updater.m3340setimpl(m3333constructorimpl, PathFillType.m4115boximpl(defaultFillType), new Function2<PathComponent, PathFillType, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Path$2$3
                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(PathComponent pathComponent, PathFillType pathFillType) {
                                            m4545invokepweu1eQ(pathComponent, pathFillType.getValue());
                                            return Unit.INSTANCE;
                                        }

                                        /* renamed from: invoke-pweu1eQ, reason: not valid java name */
                                        public final void m4545invokepweu1eQ(PathComponent pathComponent, int i25) {
                                            pathComponent.m4537setPathFillTypeoQ8Xj4U(i25);
                                        }
                                    });
                                    Updater.m3340setimpl(m3333constructorimpl, brush5, new Function2<PathComponent, Brush, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Path$2$4
                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(PathComponent pathComponent, Brush brush6) {
                                            invoke2(pathComponent, brush6);
                                            return Unit.INSTANCE;
                                        }

                                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2(PathComponent pathComponent, Brush brush6) {
                                            pathComponent.setFill(brush6);
                                        }
                                    });
                                    Updater.m3340setimpl(m3333constructorimpl, Float.valueOf(f15), new Function2<PathComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Path$2$5
                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(PathComponent pathComponent, Float f21) {
                                            invoke(pathComponent, f21.floatValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void invoke(PathComponent pathComponent, float f21) {
                                            pathComponent.setFillAlpha(f21);
                                        }
                                    });
                                    Updater.m3340setimpl(m3333constructorimpl, brush3, new Function2<PathComponent, Brush, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Path$2$6
                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(PathComponent pathComponent, Brush brush6) {
                                            invoke2(pathComponent, brush6);
                                            return Unit.INSTANCE;
                                        }

                                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2(PathComponent pathComponent, Brush brush6) {
                                            pathComponent.setStroke(brush6);
                                        }
                                    });
                                    Updater.m3340setimpl(m3333constructorimpl, Float.valueOf(f16), new Function2<PathComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Path$2$7
                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(PathComponent pathComponent, Float f21) {
                                            invoke(pathComponent, f21.floatValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void invoke(PathComponent pathComponent, float f21) {
                                            pathComponent.setStrokeAlpha(f21);
                                        }
                                    });
                                    Updater.m3340setimpl(m3333constructorimpl, Float.valueOf(f17), new Function2<PathComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Path$2$8
                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(PathComponent pathComponent, Float f21) {
                                            invoke(pathComponent, f21.floatValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void invoke(PathComponent pathComponent, float f21) {
                                            pathComponent.setStrokeLineWidth(f21);
                                        }
                                    });
                                    Updater.m3340setimpl(m3333constructorimpl, StrokeJoin.m4196boximpl(defaultStrokeLineJoin), new Function2<PathComponent, StrokeJoin, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Path$2$9
                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(PathComponent pathComponent, StrokeJoin strokeJoin) {
                                            m4546invokekLtJ_vA(pathComponent, strokeJoin.getValue());
                                            return Unit.INSTANCE;
                                        }

                                        /* renamed from: invoke-kLtJ_vA, reason: not valid java name */
                                        public final void m4546invokekLtJ_vA(PathComponent pathComponent, int i25) {
                                            pathComponent.m4539setStrokeLineJoinWw9F2mQ(i25);
                                        }
                                    });
                                    Updater.m3340setimpl(m3333constructorimpl, StrokeCap.m4186boximpl(defaultStrokeLineCap), new Function2<PathComponent, StrokeCap, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Path$2$10
                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(PathComponent pathComponent, StrokeCap strokeCap) {
                                            m4544invokeCSYIeUk(pathComponent, strokeCap.getValue());
                                            return Unit.INSTANCE;
                                        }

                                        /* renamed from: invoke-CSYIeUk, reason: not valid java name */
                                        public final void m4544invokeCSYIeUk(PathComponent pathComponent, int i25) {
                                            pathComponent.m4538setStrokeLineCapBeK7IIE(i25);
                                        }
                                    });
                                    Updater.m3340setimpl(m3333constructorimpl, Float.valueOf(f18), new Function2<PathComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Path$2$11
                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(PathComponent pathComponent, Float f21) {
                                            invoke(pathComponent, f21.floatValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void invoke(PathComponent pathComponent, float f21) {
                                            pathComponent.setStrokeLineMiter(f21);
                                        }
                                    });
                                    Updater.m3340setimpl(m3333constructorimpl, Float.valueOf(f19), new Function2<PathComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Path$2$12
                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(PathComponent pathComponent, Float f21) {
                                            invoke(pathComponent, f21.floatValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void invoke(PathComponent pathComponent, float f21) {
                                            pathComponent.setTrimPathStart(f21);
                                        }
                                    });
                                    Updater.m3340setimpl(m3333constructorimpl, Float.valueOf(f20), new Function2<PathComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Path$2$13
                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(PathComponent pathComponent, Float f21) {
                                            invoke(pathComponent, f21.floatValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void invoke(PathComponent pathComponent, float f21) {
                                            pathComponent.setTrimPathEnd(f21);
                                        }
                                    });
                                    Updater.m3340setimpl(m3333constructorimpl, Float.valueOf(f8), new Function2<PathComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Path$2$14
                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(PathComponent pathComponent, Float f21) {
                                            invoke(pathComponent, f21.floatValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void invoke(PathComponent pathComponent, float f21) {
                                            pathComponent.setTrimPathOffset(f21);
                                        }
                                    });
                                    startRestartGroup.endNode();
                                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                    f9 = f18;
                                    str2 = str3;
                                    f10 = f17;
                                    f11 = f15;
                                    i21 = defaultStrokeLineJoin;
                                    f12 = f19;
                                    brush4 = brush5;
                                    f13 = f16;
                                    f14 = f20;
                                    i22 = defaultStrokeLineCap;
                                } else {
                                    startRestartGroup.skipToGroupEnd();
                                    defaultFillType = i;
                                    str2 = str;
                                    brush4 = brush;
                                    f11 = f;
                                    brush3 = brush2;
                                    f13 = f2;
                                    f10 = f3;
                                    i22 = i2;
                                    i21 = i3;
                                    f9 = f4;
                                    f12 = f5;
                                    f14 = f6;
                                    f8 = f7;
                                }
                                endRestartGroup = startRestartGroup.endRestartGroup();
                                if (endRestartGroup != null) {
                                    final int i25 = defaultFillType;
                                    final Brush brush6 = brush3;
                                    final float f21 = f8;
                                    endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Path$3
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

                                        public final void invoke(Composer composer2, int i26) {
                                            VectorComposeKt.m4543Path9cdaXJ4(list, i25, str2, brush4, f11, brush6, f13, f10, i22, i21, f9, f12, f14, f21, composer2, RecomposeScopeImplKt.updateChangedFlags(i4 | 1), RecomposeScopeImplKt.updateChangedFlags(i5), i6);
                                        }
                                    });
                                    return;
                                }
                                return;
                            }
                            if ((i7 & 306783379) == 306783378) {
                            }
                            if (i23 != 0) {
                            }
                            if (i8 != 0) {
                            }
                            if (i9 != 0) {
                            }
                            if (i10 != 0) {
                            }
                            if (i11 != 0) {
                            }
                            if (i12 != 0) {
                            }
                            if (i13 != 0) {
                            }
                            if (i14 != 0) {
                            }
                            if (i15 != 0) {
                            }
                            if (i16 != 0) {
                            }
                            if (i18 != 0) {
                            }
                            if (i19 != 0) {
                            }
                            if (i20 == 0) {
                            }
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            VectorComposeKt$Path$1 vectorComposeKt$Path$12 = new Function0<PathComponent>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Path$1
                                /* JADX WARN: Can't rename method to resolve collision */
                                @Override // kotlin.jvm.functions.Function0
                                public final PathComponent invoke() {
                                    return new PathComponent();
                                }
                            };
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1886828752, "CC(ComposeNode):Composables.kt#9igjgp");
                            if (!(startRestartGroup.getApplier() instanceof VectorApplier)) {
                            }
                            startRestartGroup.startNode();
                            if (startRestartGroup.getInserting()) {
                            }
                            Composer m3333constructorimpl2 = Updater.m3333constructorimpl(startRestartGroup);
                            Updater.m3340setimpl(m3333constructorimpl2, str3, new Function2<PathComponent, String, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Path$2$1
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(PathComponent pathComponent, String str4) {
                                    invoke2(pathComponent, str4);
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(PathComponent pathComponent, String str4) {
                                    pathComponent.setName(str4);
                                }
                            });
                            Updater.m3340setimpl(m3333constructorimpl2, list, new Function2<PathComponent, List<? extends PathNode>, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Path$2$2
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(PathComponent pathComponent, List<? extends PathNode> list2) {
                                    invoke2(pathComponent, list2);
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(PathComponent pathComponent, List<? extends PathNode> list2) {
                                    pathComponent.setPathData(list2);
                                }
                            });
                            Updater.m3340setimpl(m3333constructorimpl2, PathFillType.m4115boximpl(defaultFillType), new Function2<PathComponent, PathFillType, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Path$2$3
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(PathComponent pathComponent, PathFillType pathFillType) {
                                    m4545invokepweu1eQ(pathComponent, pathFillType.getValue());
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke-pweu1eQ, reason: not valid java name */
                                public final void m4545invokepweu1eQ(PathComponent pathComponent, int i252) {
                                    pathComponent.m4537setPathFillTypeoQ8Xj4U(i252);
                                }
                            });
                            Updater.m3340setimpl(m3333constructorimpl2, brush5, new Function2<PathComponent, Brush, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Path$2$4
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(PathComponent pathComponent, Brush brush62) {
                                    invoke2(pathComponent, brush62);
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(PathComponent pathComponent, Brush brush62) {
                                    pathComponent.setFill(brush62);
                                }
                            });
                            Updater.m3340setimpl(m3333constructorimpl2, Float.valueOf(f15), new Function2<PathComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Path$2$5
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(PathComponent pathComponent, Float f212) {
                                    invoke(pathComponent, f212.floatValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(PathComponent pathComponent, float f212) {
                                    pathComponent.setFillAlpha(f212);
                                }
                            });
                            Updater.m3340setimpl(m3333constructorimpl2, brush3, new Function2<PathComponent, Brush, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Path$2$6
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(PathComponent pathComponent, Brush brush62) {
                                    invoke2(pathComponent, brush62);
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(PathComponent pathComponent, Brush brush62) {
                                    pathComponent.setStroke(brush62);
                                }
                            });
                            Updater.m3340setimpl(m3333constructorimpl2, Float.valueOf(f16), new Function2<PathComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Path$2$7
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(PathComponent pathComponent, Float f212) {
                                    invoke(pathComponent, f212.floatValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(PathComponent pathComponent, float f212) {
                                    pathComponent.setStrokeAlpha(f212);
                                }
                            });
                            Updater.m3340setimpl(m3333constructorimpl2, Float.valueOf(f17), new Function2<PathComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Path$2$8
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(PathComponent pathComponent, Float f212) {
                                    invoke(pathComponent, f212.floatValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(PathComponent pathComponent, float f212) {
                                    pathComponent.setStrokeLineWidth(f212);
                                }
                            });
                            Updater.m3340setimpl(m3333constructorimpl2, StrokeJoin.m4196boximpl(defaultStrokeLineJoin), new Function2<PathComponent, StrokeJoin, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Path$2$9
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(PathComponent pathComponent, StrokeJoin strokeJoin) {
                                    m4546invokekLtJ_vA(pathComponent, strokeJoin.getValue());
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke-kLtJ_vA, reason: not valid java name */
                                public final void m4546invokekLtJ_vA(PathComponent pathComponent, int i252) {
                                    pathComponent.m4539setStrokeLineJoinWw9F2mQ(i252);
                                }
                            });
                            Updater.m3340setimpl(m3333constructorimpl2, StrokeCap.m4186boximpl(defaultStrokeLineCap), new Function2<PathComponent, StrokeCap, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Path$2$10
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(PathComponent pathComponent, StrokeCap strokeCap) {
                                    m4544invokeCSYIeUk(pathComponent, strokeCap.getValue());
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke-CSYIeUk, reason: not valid java name */
                                public final void m4544invokeCSYIeUk(PathComponent pathComponent, int i252) {
                                    pathComponent.m4538setStrokeLineCapBeK7IIE(i252);
                                }
                            });
                            Updater.m3340setimpl(m3333constructorimpl2, Float.valueOf(f18), new Function2<PathComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Path$2$11
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(PathComponent pathComponent, Float f212) {
                                    invoke(pathComponent, f212.floatValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(PathComponent pathComponent, float f212) {
                                    pathComponent.setStrokeLineMiter(f212);
                                }
                            });
                            Updater.m3340setimpl(m3333constructorimpl2, Float.valueOf(f19), new Function2<PathComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Path$2$12
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(PathComponent pathComponent, Float f212) {
                                    invoke(pathComponent, f212.floatValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(PathComponent pathComponent, float f212) {
                                    pathComponent.setTrimPathStart(f212);
                                }
                            });
                            Updater.m3340setimpl(m3333constructorimpl2, Float.valueOf(f20), new Function2<PathComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Path$2$13
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(PathComponent pathComponent, Float f212) {
                                    invoke(pathComponent, f212.floatValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(PathComponent pathComponent, float f212) {
                                    pathComponent.setTrimPathEnd(f212);
                                }
                            });
                            Updater.m3340setimpl(m3333constructorimpl2, Float.valueOf(f8), new Function2<PathComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Path$2$14
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(PathComponent pathComponent, Float f212) {
                                    invoke(pathComponent, f212.floatValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(PathComponent pathComponent, float f212) {
                                    pathComponent.setTrimPathOffset(f212);
                                }
                            });
                            startRestartGroup.endNode();
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            f9 = f18;
                            str2 = str3;
                            f10 = f17;
                            f11 = f15;
                            i21 = defaultStrokeLineJoin;
                            f12 = f19;
                            brush4 = brush5;
                            f13 = f16;
                            f14 = f20;
                            i22 = defaultStrokeLineCap;
                            endRestartGroup = startRestartGroup.endRestartGroup();
                            if (endRestartGroup != null) {
                            }
                        }
                        i20 = i6 & 8192;
                        if (i20 == 0) {
                        }
                        if ((i7 & 306783379) == 306783378) {
                        }
                        if (i23 != 0) {
                        }
                        if (i8 != 0) {
                        }
                        if (i9 != 0) {
                        }
                        if (i10 != 0) {
                        }
                        if (i11 != 0) {
                        }
                        if (i12 != 0) {
                        }
                        if (i13 != 0) {
                        }
                        if (i14 != 0) {
                        }
                        if (i15 != 0) {
                        }
                        if (i16 != 0) {
                        }
                        if (i18 != 0) {
                        }
                        if (i19 != 0) {
                        }
                        if (i20 == 0) {
                        }
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        VectorComposeKt$Path$1 vectorComposeKt$Path$122 = new Function0<PathComponent>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Path$1
                            /* JADX WARN: Can't rename method to resolve collision */
                            @Override // kotlin.jvm.functions.Function0
                            public final PathComponent invoke() {
                                return new PathComponent();
                            }
                        };
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1886828752, "CC(ComposeNode):Composables.kt#9igjgp");
                        if (!(startRestartGroup.getApplier() instanceof VectorApplier)) {
                        }
                        startRestartGroup.startNode();
                        if (startRestartGroup.getInserting()) {
                        }
                        Composer m3333constructorimpl22 = Updater.m3333constructorimpl(startRestartGroup);
                        Updater.m3340setimpl(m3333constructorimpl22, str3, new Function2<PathComponent, String, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Path$2$1
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(PathComponent pathComponent, String str4) {
                                invoke2(pathComponent, str4);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(PathComponent pathComponent, String str4) {
                                pathComponent.setName(str4);
                            }
                        });
                        Updater.m3340setimpl(m3333constructorimpl22, list, new Function2<PathComponent, List<? extends PathNode>, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Path$2$2
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(PathComponent pathComponent, List<? extends PathNode> list2) {
                                invoke2(pathComponent, list2);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(PathComponent pathComponent, List<? extends PathNode> list2) {
                                pathComponent.setPathData(list2);
                            }
                        });
                        Updater.m3340setimpl(m3333constructorimpl22, PathFillType.m4115boximpl(defaultFillType), new Function2<PathComponent, PathFillType, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Path$2$3
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(PathComponent pathComponent, PathFillType pathFillType) {
                                m4545invokepweu1eQ(pathComponent, pathFillType.getValue());
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke-pweu1eQ, reason: not valid java name */
                            public final void m4545invokepweu1eQ(PathComponent pathComponent, int i252) {
                                pathComponent.m4537setPathFillTypeoQ8Xj4U(i252);
                            }
                        });
                        Updater.m3340setimpl(m3333constructorimpl22, brush5, new Function2<PathComponent, Brush, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Path$2$4
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(PathComponent pathComponent, Brush brush62) {
                                invoke2(pathComponent, brush62);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(PathComponent pathComponent, Brush brush62) {
                                pathComponent.setFill(brush62);
                            }
                        });
                        Updater.m3340setimpl(m3333constructorimpl22, Float.valueOf(f15), new Function2<PathComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Path$2$5
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(PathComponent pathComponent, Float f212) {
                                invoke(pathComponent, f212.floatValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(PathComponent pathComponent, float f212) {
                                pathComponent.setFillAlpha(f212);
                            }
                        });
                        Updater.m3340setimpl(m3333constructorimpl22, brush3, new Function2<PathComponent, Brush, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Path$2$6
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(PathComponent pathComponent, Brush brush62) {
                                invoke2(pathComponent, brush62);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(PathComponent pathComponent, Brush brush62) {
                                pathComponent.setStroke(brush62);
                            }
                        });
                        Updater.m3340setimpl(m3333constructorimpl22, Float.valueOf(f16), new Function2<PathComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Path$2$7
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(PathComponent pathComponent, Float f212) {
                                invoke(pathComponent, f212.floatValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(PathComponent pathComponent, float f212) {
                                pathComponent.setStrokeAlpha(f212);
                            }
                        });
                        Updater.m3340setimpl(m3333constructorimpl22, Float.valueOf(f17), new Function2<PathComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Path$2$8
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(PathComponent pathComponent, Float f212) {
                                invoke(pathComponent, f212.floatValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(PathComponent pathComponent, float f212) {
                                pathComponent.setStrokeLineWidth(f212);
                            }
                        });
                        Updater.m3340setimpl(m3333constructorimpl22, StrokeJoin.m4196boximpl(defaultStrokeLineJoin), new Function2<PathComponent, StrokeJoin, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Path$2$9
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(PathComponent pathComponent, StrokeJoin strokeJoin) {
                                m4546invokekLtJ_vA(pathComponent, strokeJoin.getValue());
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke-kLtJ_vA, reason: not valid java name */
                            public final void m4546invokekLtJ_vA(PathComponent pathComponent, int i252) {
                                pathComponent.m4539setStrokeLineJoinWw9F2mQ(i252);
                            }
                        });
                        Updater.m3340setimpl(m3333constructorimpl22, StrokeCap.m4186boximpl(defaultStrokeLineCap), new Function2<PathComponent, StrokeCap, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Path$2$10
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(PathComponent pathComponent, StrokeCap strokeCap) {
                                m4544invokeCSYIeUk(pathComponent, strokeCap.getValue());
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke-CSYIeUk, reason: not valid java name */
                            public final void m4544invokeCSYIeUk(PathComponent pathComponent, int i252) {
                                pathComponent.m4538setStrokeLineCapBeK7IIE(i252);
                            }
                        });
                        Updater.m3340setimpl(m3333constructorimpl22, Float.valueOf(f18), new Function2<PathComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Path$2$11
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(PathComponent pathComponent, Float f212) {
                                invoke(pathComponent, f212.floatValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(PathComponent pathComponent, float f212) {
                                pathComponent.setStrokeLineMiter(f212);
                            }
                        });
                        Updater.m3340setimpl(m3333constructorimpl22, Float.valueOf(f19), new Function2<PathComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Path$2$12
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(PathComponent pathComponent, Float f212) {
                                invoke(pathComponent, f212.floatValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(PathComponent pathComponent, float f212) {
                                pathComponent.setTrimPathStart(f212);
                            }
                        });
                        Updater.m3340setimpl(m3333constructorimpl22, Float.valueOf(f20), new Function2<PathComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Path$2$13
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(PathComponent pathComponent, Float f212) {
                                invoke(pathComponent, f212.floatValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(PathComponent pathComponent, float f212) {
                                pathComponent.setTrimPathEnd(f212);
                            }
                        });
                        Updater.m3340setimpl(m3333constructorimpl22, Float.valueOf(f8), new Function2<PathComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Path$2$14
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(PathComponent pathComponent, Float f212) {
                                invoke(pathComponent, f212.floatValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(PathComponent pathComponent, float f212) {
                                pathComponent.setTrimPathOffset(f212);
                            }
                        });
                        startRestartGroup.endNode();
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        f9 = f18;
                        str2 = str3;
                        f10 = f17;
                        f11 = f15;
                        i21 = defaultStrokeLineJoin;
                        f12 = f19;
                        brush4 = brush5;
                        f13 = f16;
                        f14 = f20;
                        i22 = defaultStrokeLineCap;
                        endRestartGroup = startRestartGroup.endRestartGroup();
                        if (endRestartGroup != null) {
                        }
                    }
                    i11 = i6 & 32;
                    if (i11 != 0) {
                    }
                    i12 = i6 & 64;
                    if (i12 != 0) {
                    }
                    i13 = i6 & 128;
                    if (i13 != 0) {
                    }
                    i14 = i6 & 256;
                    if (i14 != 0) {
                    }
                    i15 = i6 & 512;
                    if (i15 != 0) {
                    }
                    i16 = i6 & 1024;
                    if (i16 != 0) {
                    }
                    i18 = i6 & 2048;
                    if (i18 != 0) {
                    }
                    int i242 = i17;
                    i19 = i6 & 4096;
                    if (i19 != 0) {
                    }
                    i20 = i6 & 8192;
                    if (i20 == 0) {
                    }
                    if ((i7 & 306783379) == 306783378) {
                    }
                    if (i23 != 0) {
                    }
                    if (i8 != 0) {
                    }
                    if (i9 != 0) {
                    }
                    if (i10 != 0) {
                    }
                    if (i11 != 0) {
                    }
                    if (i12 != 0) {
                    }
                    if (i13 != 0) {
                    }
                    if (i14 != 0) {
                    }
                    if (i15 != 0) {
                    }
                    if (i16 != 0) {
                    }
                    if (i18 != 0) {
                    }
                    if (i19 != 0) {
                    }
                    if (i20 == 0) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    VectorComposeKt$Path$1 vectorComposeKt$Path$1222 = new Function0<PathComponent>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Path$1
                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // kotlin.jvm.functions.Function0
                        public final PathComponent invoke() {
                            return new PathComponent();
                        }
                    };
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1886828752, "CC(ComposeNode):Composables.kt#9igjgp");
                    if (!(startRestartGroup.getApplier() instanceof VectorApplier)) {
                    }
                    startRestartGroup.startNode();
                    if (startRestartGroup.getInserting()) {
                    }
                    Composer m3333constructorimpl222 = Updater.m3333constructorimpl(startRestartGroup);
                    Updater.m3340setimpl(m3333constructorimpl222, str3, new Function2<PathComponent, String, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Path$2$1
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(PathComponent pathComponent, String str4) {
                            invoke2(pathComponent, str4);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(PathComponent pathComponent, String str4) {
                            pathComponent.setName(str4);
                        }
                    });
                    Updater.m3340setimpl(m3333constructorimpl222, list, new Function2<PathComponent, List<? extends PathNode>, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Path$2$2
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(PathComponent pathComponent, List<? extends PathNode> list2) {
                            invoke2(pathComponent, list2);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(PathComponent pathComponent, List<? extends PathNode> list2) {
                            pathComponent.setPathData(list2);
                        }
                    });
                    Updater.m3340setimpl(m3333constructorimpl222, PathFillType.m4115boximpl(defaultFillType), new Function2<PathComponent, PathFillType, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Path$2$3
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(PathComponent pathComponent, PathFillType pathFillType) {
                            m4545invokepweu1eQ(pathComponent, pathFillType.getValue());
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke-pweu1eQ, reason: not valid java name */
                        public final void m4545invokepweu1eQ(PathComponent pathComponent, int i252) {
                            pathComponent.m4537setPathFillTypeoQ8Xj4U(i252);
                        }
                    });
                    Updater.m3340setimpl(m3333constructorimpl222, brush5, new Function2<PathComponent, Brush, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Path$2$4
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(PathComponent pathComponent, Brush brush62) {
                            invoke2(pathComponent, brush62);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(PathComponent pathComponent, Brush brush62) {
                            pathComponent.setFill(brush62);
                        }
                    });
                    Updater.m3340setimpl(m3333constructorimpl222, Float.valueOf(f15), new Function2<PathComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Path$2$5
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(PathComponent pathComponent, Float f212) {
                            invoke(pathComponent, f212.floatValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(PathComponent pathComponent, float f212) {
                            pathComponent.setFillAlpha(f212);
                        }
                    });
                    Updater.m3340setimpl(m3333constructorimpl222, brush3, new Function2<PathComponent, Brush, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Path$2$6
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(PathComponent pathComponent, Brush brush62) {
                            invoke2(pathComponent, brush62);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(PathComponent pathComponent, Brush brush62) {
                            pathComponent.setStroke(brush62);
                        }
                    });
                    Updater.m3340setimpl(m3333constructorimpl222, Float.valueOf(f16), new Function2<PathComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Path$2$7
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(PathComponent pathComponent, Float f212) {
                            invoke(pathComponent, f212.floatValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(PathComponent pathComponent, float f212) {
                            pathComponent.setStrokeAlpha(f212);
                        }
                    });
                    Updater.m3340setimpl(m3333constructorimpl222, Float.valueOf(f17), new Function2<PathComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Path$2$8
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(PathComponent pathComponent, Float f212) {
                            invoke(pathComponent, f212.floatValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(PathComponent pathComponent, float f212) {
                            pathComponent.setStrokeLineWidth(f212);
                        }
                    });
                    Updater.m3340setimpl(m3333constructorimpl222, StrokeJoin.m4196boximpl(defaultStrokeLineJoin), new Function2<PathComponent, StrokeJoin, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Path$2$9
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(PathComponent pathComponent, StrokeJoin strokeJoin) {
                            m4546invokekLtJ_vA(pathComponent, strokeJoin.getValue());
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke-kLtJ_vA, reason: not valid java name */
                        public final void m4546invokekLtJ_vA(PathComponent pathComponent, int i252) {
                            pathComponent.m4539setStrokeLineJoinWw9F2mQ(i252);
                        }
                    });
                    Updater.m3340setimpl(m3333constructorimpl222, StrokeCap.m4186boximpl(defaultStrokeLineCap), new Function2<PathComponent, StrokeCap, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Path$2$10
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(PathComponent pathComponent, StrokeCap strokeCap) {
                            m4544invokeCSYIeUk(pathComponent, strokeCap.getValue());
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke-CSYIeUk, reason: not valid java name */
                        public final void m4544invokeCSYIeUk(PathComponent pathComponent, int i252) {
                            pathComponent.m4538setStrokeLineCapBeK7IIE(i252);
                        }
                    });
                    Updater.m3340setimpl(m3333constructorimpl222, Float.valueOf(f18), new Function2<PathComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Path$2$11
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(PathComponent pathComponent, Float f212) {
                            invoke(pathComponent, f212.floatValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(PathComponent pathComponent, float f212) {
                            pathComponent.setStrokeLineMiter(f212);
                        }
                    });
                    Updater.m3340setimpl(m3333constructorimpl222, Float.valueOf(f19), new Function2<PathComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Path$2$12
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(PathComponent pathComponent, Float f212) {
                            invoke(pathComponent, f212.floatValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(PathComponent pathComponent, float f212) {
                            pathComponent.setTrimPathStart(f212);
                        }
                    });
                    Updater.m3340setimpl(m3333constructorimpl222, Float.valueOf(f20), new Function2<PathComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Path$2$13
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(PathComponent pathComponent, Float f212) {
                            invoke(pathComponent, f212.floatValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(PathComponent pathComponent, float f212) {
                            pathComponent.setTrimPathEnd(f212);
                        }
                    });
                    Updater.m3340setimpl(m3333constructorimpl222, Float.valueOf(f8), new Function2<PathComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Path$2$14
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(PathComponent pathComponent, Float f212) {
                            invoke(pathComponent, f212.floatValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(PathComponent pathComponent, float f212) {
                            pathComponent.setTrimPathOffset(f212);
                        }
                    });
                    startRestartGroup.endNode();
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    f9 = f18;
                    str2 = str3;
                    f10 = f17;
                    f11 = f15;
                    i21 = defaultStrokeLineJoin;
                    f12 = f19;
                    brush4 = brush5;
                    f13 = f16;
                    f14 = f20;
                    i22 = defaultStrokeLineCap;
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                i10 = i6 & 16;
                if (i10 == 0) {
                }
                i11 = i6 & 32;
                if (i11 != 0) {
                }
                i12 = i6 & 64;
                if (i12 != 0) {
                }
                i13 = i6 & 128;
                if (i13 != 0) {
                }
                i14 = i6 & 256;
                if (i14 != 0) {
                }
                i15 = i6 & 512;
                if (i15 != 0) {
                }
                i16 = i6 & 1024;
                if (i16 != 0) {
                }
                i18 = i6 & 2048;
                if (i18 != 0) {
                }
                int i2422 = i17;
                i19 = i6 & 4096;
                if (i19 != 0) {
                }
                i20 = i6 & 8192;
                if (i20 == 0) {
                }
                if ((i7 & 306783379) == 306783378) {
                }
                if (i23 != 0) {
                }
                if (i8 != 0) {
                }
                if (i9 != 0) {
                }
                if (i10 != 0) {
                }
                if (i11 != 0) {
                }
                if (i12 != 0) {
                }
                if (i13 != 0) {
                }
                if (i14 != 0) {
                }
                if (i15 != 0) {
                }
                if (i16 != 0) {
                }
                if (i18 != 0) {
                }
                if (i19 != 0) {
                }
                if (i20 == 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                VectorComposeKt$Path$1 vectorComposeKt$Path$12222 = new Function0<PathComponent>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Path$1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final PathComponent invoke() {
                        return new PathComponent();
                    }
                };
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1886828752, "CC(ComposeNode):Composables.kt#9igjgp");
                if (!(startRestartGroup.getApplier() instanceof VectorApplier)) {
                }
                startRestartGroup.startNode();
                if (startRestartGroup.getInserting()) {
                }
                Composer m3333constructorimpl2222 = Updater.m3333constructorimpl(startRestartGroup);
                Updater.m3340setimpl(m3333constructorimpl2222, str3, new Function2<PathComponent, String, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Path$2$1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(PathComponent pathComponent, String str4) {
                        invoke2(pathComponent, str4);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(PathComponent pathComponent, String str4) {
                        pathComponent.setName(str4);
                    }
                });
                Updater.m3340setimpl(m3333constructorimpl2222, list, new Function2<PathComponent, List<? extends PathNode>, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Path$2$2
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(PathComponent pathComponent, List<? extends PathNode> list2) {
                        invoke2(pathComponent, list2);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(PathComponent pathComponent, List<? extends PathNode> list2) {
                        pathComponent.setPathData(list2);
                    }
                });
                Updater.m3340setimpl(m3333constructorimpl2222, PathFillType.m4115boximpl(defaultFillType), new Function2<PathComponent, PathFillType, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Path$2$3
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(PathComponent pathComponent, PathFillType pathFillType) {
                        m4545invokepweu1eQ(pathComponent, pathFillType.getValue());
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke-pweu1eQ, reason: not valid java name */
                    public final void m4545invokepweu1eQ(PathComponent pathComponent, int i252) {
                        pathComponent.m4537setPathFillTypeoQ8Xj4U(i252);
                    }
                });
                Updater.m3340setimpl(m3333constructorimpl2222, brush5, new Function2<PathComponent, Brush, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Path$2$4
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(PathComponent pathComponent, Brush brush62) {
                        invoke2(pathComponent, brush62);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(PathComponent pathComponent, Brush brush62) {
                        pathComponent.setFill(brush62);
                    }
                });
                Updater.m3340setimpl(m3333constructorimpl2222, Float.valueOf(f15), new Function2<PathComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Path$2$5
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(PathComponent pathComponent, Float f212) {
                        invoke(pathComponent, f212.floatValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(PathComponent pathComponent, float f212) {
                        pathComponent.setFillAlpha(f212);
                    }
                });
                Updater.m3340setimpl(m3333constructorimpl2222, brush3, new Function2<PathComponent, Brush, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Path$2$6
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(PathComponent pathComponent, Brush brush62) {
                        invoke2(pathComponent, brush62);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(PathComponent pathComponent, Brush brush62) {
                        pathComponent.setStroke(brush62);
                    }
                });
                Updater.m3340setimpl(m3333constructorimpl2222, Float.valueOf(f16), new Function2<PathComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Path$2$7
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(PathComponent pathComponent, Float f212) {
                        invoke(pathComponent, f212.floatValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(PathComponent pathComponent, float f212) {
                        pathComponent.setStrokeAlpha(f212);
                    }
                });
                Updater.m3340setimpl(m3333constructorimpl2222, Float.valueOf(f17), new Function2<PathComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Path$2$8
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(PathComponent pathComponent, Float f212) {
                        invoke(pathComponent, f212.floatValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(PathComponent pathComponent, float f212) {
                        pathComponent.setStrokeLineWidth(f212);
                    }
                });
                Updater.m3340setimpl(m3333constructorimpl2222, StrokeJoin.m4196boximpl(defaultStrokeLineJoin), new Function2<PathComponent, StrokeJoin, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Path$2$9
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(PathComponent pathComponent, StrokeJoin strokeJoin) {
                        m4546invokekLtJ_vA(pathComponent, strokeJoin.getValue());
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke-kLtJ_vA, reason: not valid java name */
                    public final void m4546invokekLtJ_vA(PathComponent pathComponent, int i252) {
                        pathComponent.m4539setStrokeLineJoinWw9F2mQ(i252);
                    }
                });
                Updater.m3340setimpl(m3333constructorimpl2222, StrokeCap.m4186boximpl(defaultStrokeLineCap), new Function2<PathComponent, StrokeCap, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Path$2$10
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(PathComponent pathComponent, StrokeCap strokeCap) {
                        m4544invokeCSYIeUk(pathComponent, strokeCap.getValue());
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke-CSYIeUk, reason: not valid java name */
                    public final void m4544invokeCSYIeUk(PathComponent pathComponent, int i252) {
                        pathComponent.m4538setStrokeLineCapBeK7IIE(i252);
                    }
                });
                Updater.m3340setimpl(m3333constructorimpl2222, Float.valueOf(f18), new Function2<PathComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Path$2$11
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(PathComponent pathComponent, Float f212) {
                        invoke(pathComponent, f212.floatValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(PathComponent pathComponent, float f212) {
                        pathComponent.setStrokeLineMiter(f212);
                    }
                });
                Updater.m3340setimpl(m3333constructorimpl2222, Float.valueOf(f19), new Function2<PathComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Path$2$12
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(PathComponent pathComponent, Float f212) {
                        invoke(pathComponent, f212.floatValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(PathComponent pathComponent, float f212) {
                        pathComponent.setTrimPathStart(f212);
                    }
                });
                Updater.m3340setimpl(m3333constructorimpl2222, Float.valueOf(f20), new Function2<PathComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Path$2$13
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(PathComponent pathComponent, Float f212) {
                        invoke(pathComponent, f212.floatValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(PathComponent pathComponent, float f212) {
                        pathComponent.setTrimPathEnd(f212);
                    }
                });
                Updater.m3340setimpl(m3333constructorimpl2222, Float.valueOf(f8), new Function2<PathComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Path$2$14
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(PathComponent pathComponent, Float f212) {
                        invoke(pathComponent, f212.floatValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(PathComponent pathComponent, float f212) {
                        pathComponent.setTrimPathOffset(f212);
                    }
                });
                startRestartGroup.endNode();
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                if (ComposerKt.isTraceInProgress()) {
                }
                f9 = f18;
                str2 = str3;
                f10 = f17;
                f11 = f15;
                i21 = defaultStrokeLineJoin;
                f12 = f19;
                brush4 = brush5;
                f13 = f16;
                f14 = f20;
                i22 = defaultStrokeLineCap;
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            i9 = i6 & 8;
            if (i9 != 0) {
            }
            i10 = i6 & 16;
            if (i10 == 0) {
            }
            i11 = i6 & 32;
            if (i11 != 0) {
            }
            i12 = i6 & 64;
            if (i12 != 0) {
            }
            i13 = i6 & 128;
            if (i13 != 0) {
            }
            i14 = i6 & 256;
            if (i14 != 0) {
            }
            i15 = i6 & 512;
            if (i15 != 0) {
            }
            i16 = i6 & 1024;
            if (i16 != 0) {
            }
            i18 = i6 & 2048;
            if (i18 != 0) {
            }
            int i24222 = i17;
            i19 = i6 & 4096;
            if (i19 != 0) {
            }
            i20 = i6 & 8192;
            if (i20 == 0) {
            }
            if ((i7 & 306783379) == 306783378) {
            }
            if (i23 != 0) {
            }
            if (i8 != 0) {
            }
            if (i9 != 0) {
            }
            if (i10 != 0) {
            }
            if (i11 != 0) {
            }
            if (i12 != 0) {
            }
            if (i13 != 0) {
            }
            if (i14 != 0) {
            }
            if (i15 != 0) {
            }
            if (i16 != 0) {
            }
            if (i18 != 0) {
            }
            if (i19 != 0) {
            }
            if (i20 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            VectorComposeKt$Path$1 vectorComposeKt$Path$122222 = new Function0<PathComponent>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Path$1
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function0
                public final PathComponent invoke() {
                    return new PathComponent();
                }
            };
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1886828752, "CC(ComposeNode):Composables.kt#9igjgp");
            if (!(startRestartGroup.getApplier() instanceof VectorApplier)) {
            }
            startRestartGroup.startNode();
            if (startRestartGroup.getInserting()) {
            }
            Composer m3333constructorimpl22222 = Updater.m3333constructorimpl(startRestartGroup);
            Updater.m3340setimpl(m3333constructorimpl22222, str3, new Function2<PathComponent, String, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Path$2$1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(PathComponent pathComponent, String str4) {
                    invoke2(pathComponent, str4);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(PathComponent pathComponent, String str4) {
                    pathComponent.setName(str4);
                }
            });
            Updater.m3340setimpl(m3333constructorimpl22222, list, new Function2<PathComponent, List<? extends PathNode>, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Path$2$2
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(PathComponent pathComponent, List<? extends PathNode> list2) {
                    invoke2(pathComponent, list2);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(PathComponent pathComponent, List<? extends PathNode> list2) {
                    pathComponent.setPathData(list2);
                }
            });
            Updater.m3340setimpl(m3333constructorimpl22222, PathFillType.m4115boximpl(defaultFillType), new Function2<PathComponent, PathFillType, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Path$2$3
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(PathComponent pathComponent, PathFillType pathFillType) {
                    m4545invokepweu1eQ(pathComponent, pathFillType.getValue());
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke-pweu1eQ, reason: not valid java name */
                public final void m4545invokepweu1eQ(PathComponent pathComponent, int i252) {
                    pathComponent.m4537setPathFillTypeoQ8Xj4U(i252);
                }
            });
            Updater.m3340setimpl(m3333constructorimpl22222, brush5, new Function2<PathComponent, Brush, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Path$2$4
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(PathComponent pathComponent, Brush brush62) {
                    invoke2(pathComponent, brush62);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(PathComponent pathComponent, Brush brush62) {
                    pathComponent.setFill(brush62);
                }
            });
            Updater.m3340setimpl(m3333constructorimpl22222, Float.valueOf(f15), new Function2<PathComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Path$2$5
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(PathComponent pathComponent, Float f212) {
                    invoke(pathComponent, f212.floatValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(PathComponent pathComponent, float f212) {
                    pathComponent.setFillAlpha(f212);
                }
            });
            Updater.m3340setimpl(m3333constructorimpl22222, brush3, new Function2<PathComponent, Brush, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Path$2$6
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(PathComponent pathComponent, Brush brush62) {
                    invoke2(pathComponent, brush62);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(PathComponent pathComponent, Brush brush62) {
                    pathComponent.setStroke(brush62);
                }
            });
            Updater.m3340setimpl(m3333constructorimpl22222, Float.valueOf(f16), new Function2<PathComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Path$2$7
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(PathComponent pathComponent, Float f212) {
                    invoke(pathComponent, f212.floatValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(PathComponent pathComponent, float f212) {
                    pathComponent.setStrokeAlpha(f212);
                }
            });
            Updater.m3340setimpl(m3333constructorimpl22222, Float.valueOf(f17), new Function2<PathComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Path$2$8
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(PathComponent pathComponent, Float f212) {
                    invoke(pathComponent, f212.floatValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(PathComponent pathComponent, float f212) {
                    pathComponent.setStrokeLineWidth(f212);
                }
            });
            Updater.m3340setimpl(m3333constructorimpl22222, StrokeJoin.m4196boximpl(defaultStrokeLineJoin), new Function2<PathComponent, StrokeJoin, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Path$2$9
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(PathComponent pathComponent, StrokeJoin strokeJoin) {
                    m4546invokekLtJ_vA(pathComponent, strokeJoin.getValue());
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke-kLtJ_vA, reason: not valid java name */
                public final void m4546invokekLtJ_vA(PathComponent pathComponent, int i252) {
                    pathComponent.m4539setStrokeLineJoinWw9F2mQ(i252);
                }
            });
            Updater.m3340setimpl(m3333constructorimpl22222, StrokeCap.m4186boximpl(defaultStrokeLineCap), new Function2<PathComponent, StrokeCap, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Path$2$10
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(PathComponent pathComponent, StrokeCap strokeCap) {
                    m4544invokeCSYIeUk(pathComponent, strokeCap.getValue());
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke-CSYIeUk, reason: not valid java name */
                public final void m4544invokeCSYIeUk(PathComponent pathComponent, int i252) {
                    pathComponent.m4538setStrokeLineCapBeK7IIE(i252);
                }
            });
            Updater.m3340setimpl(m3333constructorimpl22222, Float.valueOf(f18), new Function2<PathComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Path$2$11
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(PathComponent pathComponent, Float f212) {
                    invoke(pathComponent, f212.floatValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(PathComponent pathComponent, float f212) {
                    pathComponent.setStrokeLineMiter(f212);
                }
            });
            Updater.m3340setimpl(m3333constructorimpl22222, Float.valueOf(f19), new Function2<PathComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Path$2$12
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(PathComponent pathComponent, Float f212) {
                    invoke(pathComponent, f212.floatValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(PathComponent pathComponent, float f212) {
                    pathComponent.setTrimPathStart(f212);
                }
            });
            Updater.m3340setimpl(m3333constructorimpl22222, Float.valueOf(f20), new Function2<PathComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Path$2$13
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(PathComponent pathComponent, Float f212) {
                    invoke(pathComponent, f212.floatValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(PathComponent pathComponent, float f212) {
                    pathComponent.setTrimPathEnd(f212);
                }
            });
            Updater.m3340setimpl(m3333constructorimpl22222, Float.valueOf(f8), new Function2<PathComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Path$2$14
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(PathComponent pathComponent, Float f212) {
                    invoke(pathComponent, f212.floatValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(PathComponent pathComponent, float f212) {
                    pathComponent.setTrimPathOffset(f212);
                }
            });
            startRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            if (ComposerKt.isTraceInProgress()) {
            }
            f9 = f18;
            str2 = str3;
            f10 = f17;
            f11 = f15;
            i21 = defaultStrokeLineJoin;
            f12 = f19;
            brush4 = brush5;
            f13 = f16;
            f14 = f20;
            i22 = defaultStrokeLineCap;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        i8 = i6 & 4;
        if (i8 == 0) {
        }
        i9 = i6 & 8;
        if (i9 != 0) {
        }
        i10 = i6 & 16;
        if (i10 == 0) {
        }
        i11 = i6 & 32;
        if (i11 != 0) {
        }
        i12 = i6 & 64;
        if (i12 != 0) {
        }
        i13 = i6 & 128;
        if (i13 != 0) {
        }
        i14 = i6 & 256;
        if (i14 != 0) {
        }
        i15 = i6 & 512;
        if (i15 != 0) {
        }
        i16 = i6 & 1024;
        if (i16 != 0) {
        }
        i18 = i6 & 2048;
        if (i18 != 0) {
        }
        int i242222 = i17;
        i19 = i6 & 4096;
        if (i19 != 0) {
        }
        i20 = i6 & 8192;
        if (i20 == 0) {
        }
        if ((i7 & 306783379) == 306783378) {
        }
        if (i23 != 0) {
        }
        if (i8 != 0) {
        }
        if (i9 != 0) {
        }
        if (i10 != 0) {
        }
        if (i11 != 0) {
        }
        if (i12 != 0) {
        }
        if (i13 != 0) {
        }
        if (i14 != 0) {
        }
        if (i15 != 0) {
        }
        if (i16 != 0) {
        }
        if (i18 != 0) {
        }
        if (i19 != 0) {
        }
        if (i20 == 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        VectorComposeKt$Path$1 vectorComposeKt$Path$1222222 = new Function0<PathComponent>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Path$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final PathComponent invoke() {
                return new PathComponent();
            }
        };
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1886828752, "CC(ComposeNode):Composables.kt#9igjgp");
        if (!(startRestartGroup.getApplier() instanceof VectorApplier)) {
        }
        startRestartGroup.startNode();
        if (startRestartGroup.getInserting()) {
        }
        Composer m3333constructorimpl222222 = Updater.m3333constructorimpl(startRestartGroup);
        Updater.m3340setimpl(m3333constructorimpl222222, str3, new Function2<PathComponent, String, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Path$2$1
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(PathComponent pathComponent, String str4) {
                invoke2(pathComponent, str4);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(PathComponent pathComponent, String str4) {
                pathComponent.setName(str4);
            }
        });
        Updater.m3340setimpl(m3333constructorimpl222222, list, new Function2<PathComponent, List<? extends PathNode>, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Path$2$2
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(PathComponent pathComponent, List<? extends PathNode> list2) {
                invoke2(pathComponent, list2);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(PathComponent pathComponent, List<? extends PathNode> list2) {
                pathComponent.setPathData(list2);
            }
        });
        Updater.m3340setimpl(m3333constructorimpl222222, PathFillType.m4115boximpl(defaultFillType), new Function2<PathComponent, PathFillType, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Path$2$3
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(PathComponent pathComponent, PathFillType pathFillType) {
                m4545invokepweu1eQ(pathComponent, pathFillType.getValue());
                return Unit.INSTANCE;
            }

            /* renamed from: invoke-pweu1eQ, reason: not valid java name */
            public final void m4545invokepweu1eQ(PathComponent pathComponent, int i252) {
                pathComponent.m4537setPathFillTypeoQ8Xj4U(i252);
            }
        });
        Updater.m3340setimpl(m3333constructorimpl222222, brush5, new Function2<PathComponent, Brush, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Path$2$4
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(PathComponent pathComponent, Brush brush62) {
                invoke2(pathComponent, brush62);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(PathComponent pathComponent, Brush brush62) {
                pathComponent.setFill(brush62);
            }
        });
        Updater.m3340setimpl(m3333constructorimpl222222, Float.valueOf(f15), new Function2<PathComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Path$2$5
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(PathComponent pathComponent, Float f212) {
                invoke(pathComponent, f212.floatValue());
                return Unit.INSTANCE;
            }

            public final void invoke(PathComponent pathComponent, float f212) {
                pathComponent.setFillAlpha(f212);
            }
        });
        Updater.m3340setimpl(m3333constructorimpl222222, brush3, new Function2<PathComponent, Brush, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Path$2$6
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(PathComponent pathComponent, Brush brush62) {
                invoke2(pathComponent, brush62);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(PathComponent pathComponent, Brush brush62) {
                pathComponent.setStroke(brush62);
            }
        });
        Updater.m3340setimpl(m3333constructorimpl222222, Float.valueOf(f16), new Function2<PathComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Path$2$7
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(PathComponent pathComponent, Float f212) {
                invoke(pathComponent, f212.floatValue());
                return Unit.INSTANCE;
            }

            public final void invoke(PathComponent pathComponent, float f212) {
                pathComponent.setStrokeAlpha(f212);
            }
        });
        Updater.m3340setimpl(m3333constructorimpl222222, Float.valueOf(f17), new Function2<PathComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Path$2$8
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(PathComponent pathComponent, Float f212) {
                invoke(pathComponent, f212.floatValue());
                return Unit.INSTANCE;
            }

            public final void invoke(PathComponent pathComponent, float f212) {
                pathComponent.setStrokeLineWidth(f212);
            }
        });
        Updater.m3340setimpl(m3333constructorimpl222222, StrokeJoin.m4196boximpl(defaultStrokeLineJoin), new Function2<PathComponent, StrokeJoin, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Path$2$9
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(PathComponent pathComponent, StrokeJoin strokeJoin) {
                m4546invokekLtJ_vA(pathComponent, strokeJoin.getValue());
                return Unit.INSTANCE;
            }

            /* renamed from: invoke-kLtJ_vA, reason: not valid java name */
            public final void m4546invokekLtJ_vA(PathComponent pathComponent, int i252) {
                pathComponent.m4539setStrokeLineJoinWw9F2mQ(i252);
            }
        });
        Updater.m3340setimpl(m3333constructorimpl222222, StrokeCap.m4186boximpl(defaultStrokeLineCap), new Function2<PathComponent, StrokeCap, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Path$2$10
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(PathComponent pathComponent, StrokeCap strokeCap) {
                m4544invokeCSYIeUk(pathComponent, strokeCap.getValue());
                return Unit.INSTANCE;
            }

            /* renamed from: invoke-CSYIeUk, reason: not valid java name */
            public final void m4544invokeCSYIeUk(PathComponent pathComponent, int i252) {
                pathComponent.m4538setStrokeLineCapBeK7IIE(i252);
            }
        });
        Updater.m3340setimpl(m3333constructorimpl222222, Float.valueOf(f18), new Function2<PathComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Path$2$11
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(PathComponent pathComponent, Float f212) {
                invoke(pathComponent, f212.floatValue());
                return Unit.INSTANCE;
            }

            public final void invoke(PathComponent pathComponent, float f212) {
                pathComponent.setStrokeLineMiter(f212);
            }
        });
        Updater.m3340setimpl(m3333constructorimpl222222, Float.valueOf(f19), new Function2<PathComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Path$2$12
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(PathComponent pathComponent, Float f212) {
                invoke(pathComponent, f212.floatValue());
                return Unit.INSTANCE;
            }

            public final void invoke(PathComponent pathComponent, float f212) {
                pathComponent.setTrimPathStart(f212);
            }
        });
        Updater.m3340setimpl(m3333constructorimpl222222, Float.valueOf(f20), new Function2<PathComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Path$2$13
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(PathComponent pathComponent, Float f212) {
                invoke(pathComponent, f212.floatValue());
                return Unit.INSTANCE;
            }

            public final void invoke(PathComponent pathComponent, float f212) {
                pathComponent.setTrimPathEnd(f212);
            }
        });
        Updater.m3340setimpl(m3333constructorimpl222222, Float.valueOf(f8), new Function2<PathComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Path$2$14
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(PathComponent pathComponent, Float f212) {
                invoke(pathComponent, f212.floatValue());
                return Unit.INSTANCE;
            }

            public final void invoke(PathComponent pathComponent, float f212) {
                pathComponent.setTrimPathOffset(f212);
            }
        });
        startRestartGroup.endNode();
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        if (ComposerKt.isTraceInProgress()) {
        }
        f9 = f18;
        str2 = str3;
        f10 = f17;
        f11 = f15;
        i21 = defaultStrokeLineJoin;
        f12 = f19;
        brush4 = brush5;
        f13 = f16;
        f14 = f20;
        i22 = defaultStrokeLineCap;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }
}
