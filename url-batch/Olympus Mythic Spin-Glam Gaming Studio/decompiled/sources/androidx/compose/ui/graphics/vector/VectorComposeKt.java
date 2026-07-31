package androidx.compose.ui.graphics.vector;

import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import com.google.android.exoplayer2.C;
import io.bidmachine.iab.vast.tags.VastAttributes;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: VectorCompose.kt */
@Metadata(d1 = {"\u0000L\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\u0085\u0001\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u00052\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0016\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\u00010\u0010¢\u0006\u0002\b\u0011¢\u0006\u0002\b\u0012H\u0007¢\u0006\u0002\u0010\u0013\u001a©\u0001\u0010\u0014\u001a\u00020\u00012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\b\b\u0002\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u00052\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00192\b\b\u0002\u0010\u001c\u001a\u00020\u00052\b\b\u0002\u0010\u001d\u001a\u00020\u00052\b\b\u0002\u0010\u001e\u001a\u00020\u001f2\b\b\u0002\u0010 \u001a\u00020!2\b\b\u0002\u0010\"\u001a\u00020\u00052\b\b\u0002\u0010#\u001a\u00020\u00052\b\b\u0002\u0010$\u001a\u00020\u00052\b\b\u0002\u0010%\u001a\u00020\u0005H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b&\u0010'\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006("}, d2 = {"Group", "", "name", "", "rotation", "", "pivotX", "pivotY", "scaleX", "scaleY", "translationX", "translationY", "clipPathData", "", "Landroidx/compose/ui/graphics/vector/PathNode;", "content", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "Landroidx/compose/ui/graphics/vector/VectorComposable;", "(Ljava/lang/String;FFFFFFFLjava/util/List;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "Path", "pathData", "pathFillType", "Landroidx/compose/ui/graphics/PathFillType;", "fill", "Landroidx/compose/ui/graphics/Brush;", "fillAlpha", VastAttributes.STROKE_COLOR, "strokeAlpha", "strokeLineWidth", "strokeLineCap", "Landroidx/compose/ui/graphics/StrokeCap;", "strokeLineJoin", "Landroidx/compose/ui/graphics/StrokeJoin;", "strokeLineMiter", "trimPathStart", "trimPathEnd", "trimPathOffset", "Path-9cdaXJ4", "(Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFLandroidx/compose/runtime/Composer;III)V", "ui_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class VectorComposeKt {
    /* JADX WARN: Removed duplicated region for block: B:103:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:48:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x00ec  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void Group(String str, float f, float f2, float f3, float f4, float f5, float f6, float f7, List list, final Function2 content, Composer composer, final int i, final int i2) {
        int i3;
        int i4;
        int i5;
        float f8;
        int i6;
        float f9;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        String str2;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        List emptyPath;
        final float f15;
        final float f16;
        final float f17;
        final float f18;
        final float f19;
        final String str3;
        final List list2;
        final float f20;
        final float f21;
        ScopeUpdateScope endRestartGroup;
        Intrinsics.checkNotNullParameter(content, "content");
        Composer startRestartGroup = composer.startRestartGroup(-213417674);
        int i12 = i2 & 1;
        if (i12 != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (startRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i13 = i2 & 2;
        if (i13 != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= startRestartGroup.changed(f) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 896) == 0) {
                i3 |= startRestartGroup.changed(f2) ? 256 : 128;
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= 3072;
                } else if ((i & 7168) == 0) {
                    f8 = f3;
                    i3 |= startRestartGroup.changed(f8) ? 2048 : 1024;
                    i6 = i2 & 16;
                    if (i6 == 0) {
                        i3 |= 24576;
                    } else if ((57344 & i) == 0) {
                        f9 = f4;
                        i3 |= startRestartGroup.changed(f9) ? 16384 : 8192;
                        i7 = i2 & 32;
                        if (i7 != 0) {
                            i3 |= 196608;
                        } else if ((i & 458752) == 0) {
                            i3 |= startRestartGroup.changed(f5) ? 131072 : 65536;
                        }
                        i8 = i2 & 64;
                        if (i8 != 0) {
                            i3 |= 1572864;
                        } else if ((i & 3670016) == 0) {
                            i3 |= startRestartGroup.changed(f6) ? 1048576 : 524288;
                        }
                        i9 = i2 & 128;
                        if (i9 != 0) {
                            i3 |= 12582912;
                        } else if ((i & 29360128) == 0) {
                            i3 |= startRestartGroup.changed(f7) ? 8388608 : 4194304;
                        }
                        i10 = i2 & 256;
                        if (i10 != 0) {
                            i3 |= 33554432;
                        }
                        if ((i2 & 512) == 0) {
                            if ((1879048192 & i) == 0) {
                                i11 = startRestartGroup.changed(content) ? 536870912 : 268435456;
                            }
                            if (i10 == 256 || (1533916891 & i3) != 306783378 || !startRestartGroup.getSkipping()) {
                                startRestartGroup.startDefaults();
                                if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                                    str2 = i12 == 0 ? "" : str;
                                    f10 = i13 == 0 ? 0.0f : f;
                                    f11 = i4 == 0 ? 0.0f : f2;
                                    if (i5 != 0) {
                                        f8 = 0.0f;
                                    }
                                    if (i6 != 0) {
                                        f9 = 1.0f;
                                    }
                                    f12 = i7 == 0 ? f5 : 1.0f;
                                    f13 = i8 == 0 ? 0.0f : f6;
                                    f14 = i9 == 0 ? f7 : 0.0f;
                                    if (i10 != 0) {
                                        emptyPath = VectorKt.getEmptyPath();
                                        i3 &= -234881025;
                                        startRestartGroup.endDefaults();
                                        VectorComposeKt$Group$1 vectorComposeKt$Group$1 = new Function0() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$1
                                            @Override // kotlin.jvm.functions.Function0
                                            @NotNull
                                            /* renamed from: invoke */
                                            public final GroupComponent mo4828invoke() {
                                                return new GroupComponent();
                                            }
                                        };
                                        startRestartGroup.startReplaceableGroup(-548224868);
                                        if (!(startRestartGroup.getApplier() instanceof VectorApplier)) {
                                            ComposablesKt.invalidApplier();
                                        }
                                        startRestartGroup.startNode();
                                        if (startRestartGroup.getInserting()) {
                                            startRestartGroup.createNode(vectorComposeKt$Group$1);
                                        } else {
                                            startRestartGroup.useNode();
                                        }
                                        Composer m1149constructorimpl = Updater.m1149constructorimpl(startRestartGroup);
                                        Updater.m1153setimpl(m1149constructorimpl, str2, new Function2() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$1
                                            @Override // kotlin.jvm.functions.Function2
                                            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                                invoke((GroupComponent) obj, (String) obj2);
                                                return Unit.INSTANCE;
                                            }

                                            public final void invoke(@NotNull GroupComponent set, @NotNull String it) {
                                                Intrinsics.checkNotNullParameter(set, "$this$set");
                                                Intrinsics.checkNotNullParameter(it, "it");
                                                set.setName(it);
                                            }
                                        });
                                        Updater.m1153setimpl(m1149constructorimpl, Float.valueOf(f10), new Function2() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$2
                                            @Override // kotlin.jvm.functions.Function2
                                            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                                invoke((GroupComponent) obj, ((Number) obj2).floatValue());
                                                return Unit.INSTANCE;
                                            }

                                            public final void invoke(@NotNull GroupComponent set, float f22) {
                                                Intrinsics.checkNotNullParameter(set, "$this$set");
                                                set.setRotation(f22);
                                            }
                                        });
                                        Updater.m1153setimpl(m1149constructorimpl, Float.valueOf(f11), new Function2() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$3
                                            @Override // kotlin.jvm.functions.Function2
                                            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                                invoke((GroupComponent) obj, ((Number) obj2).floatValue());
                                                return Unit.INSTANCE;
                                            }

                                            public final void invoke(@NotNull GroupComponent set, float f22) {
                                                Intrinsics.checkNotNullParameter(set, "$this$set");
                                                set.setPivotX(f22);
                                            }
                                        });
                                        Updater.m1153setimpl(m1149constructorimpl, Float.valueOf(f8), new Function2() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$4
                                            @Override // kotlin.jvm.functions.Function2
                                            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                                invoke((GroupComponent) obj, ((Number) obj2).floatValue());
                                                return Unit.INSTANCE;
                                            }

                                            public final void invoke(@NotNull GroupComponent set, float f22) {
                                                Intrinsics.checkNotNullParameter(set, "$this$set");
                                                set.setPivotY(f22);
                                            }
                                        });
                                        Updater.m1153setimpl(m1149constructorimpl, Float.valueOf(f9), new Function2() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$5
                                            @Override // kotlin.jvm.functions.Function2
                                            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                                invoke((GroupComponent) obj, ((Number) obj2).floatValue());
                                                return Unit.INSTANCE;
                                            }

                                            public final void invoke(@NotNull GroupComponent set, float f22) {
                                                Intrinsics.checkNotNullParameter(set, "$this$set");
                                                set.setScaleX(f22);
                                            }
                                        });
                                        Updater.m1153setimpl(m1149constructorimpl, Float.valueOf(f12), new Function2() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$6
                                            @Override // kotlin.jvm.functions.Function2
                                            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                                invoke((GroupComponent) obj, ((Number) obj2).floatValue());
                                                return Unit.INSTANCE;
                                            }

                                            public final void invoke(@NotNull GroupComponent set, float f22) {
                                                Intrinsics.checkNotNullParameter(set, "$this$set");
                                                set.setScaleY(f22);
                                            }
                                        });
                                        Updater.m1153setimpl(m1149constructorimpl, Float.valueOf(f13), new Function2() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$7
                                            @Override // kotlin.jvm.functions.Function2
                                            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                                invoke((GroupComponent) obj, ((Number) obj2).floatValue());
                                                return Unit.INSTANCE;
                                            }

                                            public final void invoke(@NotNull GroupComponent set, float f22) {
                                                Intrinsics.checkNotNullParameter(set, "$this$set");
                                                set.setTranslationX(f22);
                                            }
                                        });
                                        Updater.m1153setimpl(m1149constructorimpl, Float.valueOf(f14), new Function2() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$8
                                            @Override // kotlin.jvm.functions.Function2
                                            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                                invoke((GroupComponent) obj, ((Number) obj2).floatValue());
                                                return Unit.INSTANCE;
                                            }

                                            public final void invoke(@NotNull GroupComponent set, float f22) {
                                                Intrinsics.checkNotNullParameter(set, "$this$set");
                                                set.setTranslationY(f22);
                                            }
                                        });
                                        Updater.m1153setimpl(m1149constructorimpl, emptyPath, new Function2() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$9
                                            @Override // kotlin.jvm.functions.Function2
                                            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                                invoke((GroupComponent) obj, (List<? extends PathNode>) obj2);
                                                return Unit.INSTANCE;
                                            }

                                            public final void invoke(@NotNull GroupComponent set, @NotNull List<? extends PathNode> it) {
                                                Intrinsics.checkNotNullParameter(set, "$this$set");
                                                Intrinsics.checkNotNullParameter(it, "it");
                                                set.setClipPathData(it);
                                            }
                                        });
                                        startRestartGroup.startReplaceableGroup(-983907633);
                                        content.invoke(startRestartGroup, Integer.valueOf((i3 >> 27) & 14));
                                        startRestartGroup.endReplaceableGroup();
                                        startRestartGroup.endNode();
                                        startRestartGroup.endReplaceableGroup();
                                        f15 = f11;
                                        f16 = f14;
                                        f17 = f12;
                                        f18 = f13;
                                        f19 = f9;
                                        str3 = str2;
                                        list2 = emptyPath;
                                        f20 = f10;
                                        f21 = f8;
                                    }
                                } else {
                                    startRestartGroup.skipToGroupEnd();
                                    if (i10 != 0) {
                                        i3 &= -234881025;
                                    }
                                    str2 = str;
                                    f10 = f;
                                    f11 = f2;
                                    f12 = f5;
                                    f13 = f6;
                                    f14 = f7;
                                }
                                emptyPath = list;
                                startRestartGroup.endDefaults();
                                VectorComposeKt$Group$1 vectorComposeKt$Group$12 = new Function0() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$1
                                    @Override // kotlin.jvm.functions.Function0
                                    @NotNull
                                    /* renamed from: invoke */
                                    public final GroupComponent mo4828invoke() {
                                        return new GroupComponent();
                                    }
                                };
                                startRestartGroup.startReplaceableGroup(-548224868);
                                if (!(startRestartGroup.getApplier() instanceof VectorApplier)) {
                                }
                                startRestartGroup.startNode();
                                if (startRestartGroup.getInserting()) {
                                }
                                Composer m1149constructorimpl2 = Updater.m1149constructorimpl(startRestartGroup);
                                Updater.m1153setimpl(m1149constructorimpl2, str2, new Function2() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$1
                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                        invoke((GroupComponent) obj, (String) obj2);
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(@NotNull GroupComponent set, @NotNull String it) {
                                        Intrinsics.checkNotNullParameter(set, "$this$set");
                                        Intrinsics.checkNotNullParameter(it, "it");
                                        set.setName(it);
                                    }
                                });
                                Updater.m1153setimpl(m1149constructorimpl2, Float.valueOf(f10), new Function2() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$2
                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                        invoke((GroupComponent) obj, ((Number) obj2).floatValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(@NotNull GroupComponent set, float f22) {
                                        Intrinsics.checkNotNullParameter(set, "$this$set");
                                        set.setRotation(f22);
                                    }
                                });
                                Updater.m1153setimpl(m1149constructorimpl2, Float.valueOf(f11), new Function2() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$3
                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                        invoke((GroupComponent) obj, ((Number) obj2).floatValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(@NotNull GroupComponent set, float f22) {
                                        Intrinsics.checkNotNullParameter(set, "$this$set");
                                        set.setPivotX(f22);
                                    }
                                });
                                Updater.m1153setimpl(m1149constructorimpl2, Float.valueOf(f8), new Function2() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$4
                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                        invoke((GroupComponent) obj, ((Number) obj2).floatValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(@NotNull GroupComponent set, float f22) {
                                        Intrinsics.checkNotNullParameter(set, "$this$set");
                                        set.setPivotY(f22);
                                    }
                                });
                                Updater.m1153setimpl(m1149constructorimpl2, Float.valueOf(f9), new Function2() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$5
                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                        invoke((GroupComponent) obj, ((Number) obj2).floatValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(@NotNull GroupComponent set, float f22) {
                                        Intrinsics.checkNotNullParameter(set, "$this$set");
                                        set.setScaleX(f22);
                                    }
                                });
                                Updater.m1153setimpl(m1149constructorimpl2, Float.valueOf(f12), new Function2() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$6
                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                        invoke((GroupComponent) obj, ((Number) obj2).floatValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(@NotNull GroupComponent set, float f22) {
                                        Intrinsics.checkNotNullParameter(set, "$this$set");
                                        set.setScaleY(f22);
                                    }
                                });
                                Updater.m1153setimpl(m1149constructorimpl2, Float.valueOf(f13), new Function2() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$7
                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                        invoke((GroupComponent) obj, ((Number) obj2).floatValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(@NotNull GroupComponent set, float f22) {
                                        Intrinsics.checkNotNullParameter(set, "$this$set");
                                        set.setTranslationX(f22);
                                    }
                                });
                                Updater.m1153setimpl(m1149constructorimpl2, Float.valueOf(f14), new Function2() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$8
                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                        invoke((GroupComponent) obj, ((Number) obj2).floatValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(@NotNull GroupComponent set, float f22) {
                                        Intrinsics.checkNotNullParameter(set, "$this$set");
                                        set.setTranslationY(f22);
                                    }
                                });
                                Updater.m1153setimpl(m1149constructorimpl2, emptyPath, new Function2() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$9
                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                        invoke((GroupComponent) obj, (List<? extends PathNode>) obj2);
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(@NotNull GroupComponent set, @NotNull List<? extends PathNode> it) {
                                        Intrinsics.checkNotNullParameter(set, "$this$set");
                                        Intrinsics.checkNotNullParameter(it, "it");
                                        set.setClipPathData(it);
                                    }
                                });
                                startRestartGroup.startReplaceableGroup(-983907633);
                                content.invoke(startRestartGroup, Integer.valueOf((i3 >> 27) & 14));
                                startRestartGroup.endReplaceableGroup();
                                startRestartGroup.endNode();
                                startRestartGroup.endReplaceableGroup();
                                f15 = f11;
                                f16 = f14;
                                f17 = f12;
                                f18 = f13;
                                f19 = f9;
                                str3 = str2;
                                list2 = emptyPath;
                                f20 = f10;
                                f21 = f8;
                            } else {
                                startRestartGroup.skipToGroupEnd();
                                str3 = str;
                                f20 = f;
                                f15 = f2;
                                f17 = f5;
                                f18 = f6;
                                f16 = f7;
                                list2 = list;
                                f21 = f8;
                                f19 = f9;
                            }
                            endRestartGroup = startRestartGroup.endRestartGroup();
                            if (endRestartGroup != null) {
                                return;
                            }
                            endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$4
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                    invoke((Composer) obj, ((Number) obj2).intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(@Nullable Composer composer2, int i14) {
                                    VectorComposeKt.Group(str3, f20, f15, f21, f19, f17, f18, f16, list2, content, composer2, i | 1, i2);
                                }
                            });
                            return;
                        }
                        i11 = C.ENCODING_PCM_32BIT;
                        i3 |= i11;
                        if (i10 == 256) {
                        }
                        startRestartGroup.startDefaults();
                        if ((i & 1) != 0) {
                        }
                        if (i12 == 0) {
                        }
                        if (i13 == 0) {
                        }
                        if (i4 == 0) {
                        }
                        if (i5 != 0) {
                        }
                        if (i6 != 0) {
                        }
                        if (i7 == 0) {
                        }
                        if (i8 == 0) {
                        }
                        if (i9 == 0) {
                        }
                        if (i10 != 0) {
                        }
                        emptyPath = list;
                        startRestartGroup.endDefaults();
                        VectorComposeKt$Group$1 vectorComposeKt$Group$122 = new Function0() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$1
                            @Override // kotlin.jvm.functions.Function0
                            @NotNull
                            /* renamed from: invoke */
                            public final GroupComponent mo4828invoke() {
                                return new GroupComponent();
                            }
                        };
                        startRestartGroup.startReplaceableGroup(-548224868);
                        if (!(startRestartGroup.getApplier() instanceof VectorApplier)) {
                        }
                        startRestartGroup.startNode();
                        if (startRestartGroup.getInserting()) {
                        }
                        Composer m1149constructorimpl22 = Updater.m1149constructorimpl(startRestartGroup);
                        Updater.m1153setimpl(m1149constructorimpl22, str2, new Function2() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$1
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                invoke((GroupComponent) obj, (String) obj2);
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@NotNull GroupComponent set, @NotNull String it) {
                                Intrinsics.checkNotNullParameter(set, "$this$set");
                                Intrinsics.checkNotNullParameter(it, "it");
                                set.setName(it);
                            }
                        });
                        Updater.m1153setimpl(m1149constructorimpl22, Float.valueOf(f10), new Function2() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$2
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                invoke((GroupComponent) obj, ((Number) obj2).floatValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@NotNull GroupComponent set, float f22) {
                                Intrinsics.checkNotNullParameter(set, "$this$set");
                                set.setRotation(f22);
                            }
                        });
                        Updater.m1153setimpl(m1149constructorimpl22, Float.valueOf(f11), new Function2() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$3
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                invoke((GroupComponent) obj, ((Number) obj2).floatValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@NotNull GroupComponent set, float f22) {
                                Intrinsics.checkNotNullParameter(set, "$this$set");
                                set.setPivotX(f22);
                            }
                        });
                        Updater.m1153setimpl(m1149constructorimpl22, Float.valueOf(f8), new Function2() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$4
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                invoke((GroupComponent) obj, ((Number) obj2).floatValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@NotNull GroupComponent set, float f22) {
                                Intrinsics.checkNotNullParameter(set, "$this$set");
                                set.setPivotY(f22);
                            }
                        });
                        Updater.m1153setimpl(m1149constructorimpl22, Float.valueOf(f9), new Function2() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$5
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                invoke((GroupComponent) obj, ((Number) obj2).floatValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@NotNull GroupComponent set, float f22) {
                                Intrinsics.checkNotNullParameter(set, "$this$set");
                                set.setScaleX(f22);
                            }
                        });
                        Updater.m1153setimpl(m1149constructorimpl22, Float.valueOf(f12), new Function2() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$6
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                invoke((GroupComponent) obj, ((Number) obj2).floatValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@NotNull GroupComponent set, float f22) {
                                Intrinsics.checkNotNullParameter(set, "$this$set");
                                set.setScaleY(f22);
                            }
                        });
                        Updater.m1153setimpl(m1149constructorimpl22, Float.valueOf(f13), new Function2() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$7
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                invoke((GroupComponent) obj, ((Number) obj2).floatValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@NotNull GroupComponent set, float f22) {
                                Intrinsics.checkNotNullParameter(set, "$this$set");
                                set.setTranslationX(f22);
                            }
                        });
                        Updater.m1153setimpl(m1149constructorimpl22, Float.valueOf(f14), new Function2() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$8
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                invoke((GroupComponent) obj, ((Number) obj2).floatValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@NotNull GroupComponent set, float f22) {
                                Intrinsics.checkNotNullParameter(set, "$this$set");
                                set.setTranslationY(f22);
                            }
                        });
                        Updater.m1153setimpl(m1149constructorimpl22, emptyPath, new Function2() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$9
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                invoke((GroupComponent) obj, (List<? extends PathNode>) obj2);
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@NotNull GroupComponent set, @NotNull List<? extends PathNode> it) {
                                Intrinsics.checkNotNullParameter(set, "$this$set");
                                Intrinsics.checkNotNullParameter(it, "it");
                                set.setClipPathData(it);
                            }
                        });
                        startRestartGroup.startReplaceableGroup(-983907633);
                        content.invoke(startRestartGroup, Integer.valueOf((i3 >> 27) & 14));
                        startRestartGroup.endReplaceableGroup();
                        startRestartGroup.endNode();
                        startRestartGroup.endReplaceableGroup();
                        f15 = f11;
                        f16 = f14;
                        f17 = f12;
                        f18 = f13;
                        f19 = f9;
                        str3 = str2;
                        list2 = emptyPath;
                        f20 = f10;
                        f21 = f8;
                        endRestartGroup = startRestartGroup.endRestartGroup();
                        if (endRestartGroup != null) {
                        }
                    }
                    f9 = f4;
                    i7 = i2 & 32;
                    if (i7 != 0) {
                    }
                    i8 = i2 & 64;
                    if (i8 != 0) {
                    }
                    i9 = i2 & 128;
                    if (i9 != 0) {
                    }
                    i10 = i2 & 256;
                    if (i10 != 0) {
                    }
                    if ((i2 & 512) == 0) {
                    }
                    i3 |= i11;
                    if (i10 == 256) {
                    }
                    startRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                    }
                    if (i12 == 0) {
                    }
                    if (i13 == 0) {
                    }
                    if (i4 == 0) {
                    }
                    if (i5 != 0) {
                    }
                    if (i6 != 0) {
                    }
                    if (i7 == 0) {
                    }
                    if (i8 == 0) {
                    }
                    if (i9 == 0) {
                    }
                    if (i10 != 0) {
                    }
                    emptyPath = list;
                    startRestartGroup.endDefaults();
                    VectorComposeKt$Group$1 vectorComposeKt$Group$1222 = new Function0() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$1
                        @Override // kotlin.jvm.functions.Function0
                        @NotNull
                        /* renamed from: invoke */
                        public final GroupComponent mo4828invoke() {
                            return new GroupComponent();
                        }
                    };
                    startRestartGroup.startReplaceableGroup(-548224868);
                    if (!(startRestartGroup.getApplier() instanceof VectorApplier)) {
                    }
                    startRestartGroup.startNode();
                    if (startRestartGroup.getInserting()) {
                    }
                    Composer m1149constructorimpl222 = Updater.m1149constructorimpl(startRestartGroup);
                    Updater.m1153setimpl(m1149constructorimpl222, str2, new Function2() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$1
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                            invoke((GroupComponent) obj, (String) obj2);
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@NotNull GroupComponent set, @NotNull String it) {
                            Intrinsics.checkNotNullParameter(set, "$this$set");
                            Intrinsics.checkNotNullParameter(it, "it");
                            set.setName(it);
                        }
                    });
                    Updater.m1153setimpl(m1149constructorimpl222, Float.valueOf(f10), new Function2() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$2
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                            invoke((GroupComponent) obj, ((Number) obj2).floatValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@NotNull GroupComponent set, float f22) {
                            Intrinsics.checkNotNullParameter(set, "$this$set");
                            set.setRotation(f22);
                        }
                    });
                    Updater.m1153setimpl(m1149constructorimpl222, Float.valueOf(f11), new Function2() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$3
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                            invoke((GroupComponent) obj, ((Number) obj2).floatValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@NotNull GroupComponent set, float f22) {
                            Intrinsics.checkNotNullParameter(set, "$this$set");
                            set.setPivotX(f22);
                        }
                    });
                    Updater.m1153setimpl(m1149constructorimpl222, Float.valueOf(f8), new Function2() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$4
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                            invoke((GroupComponent) obj, ((Number) obj2).floatValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@NotNull GroupComponent set, float f22) {
                            Intrinsics.checkNotNullParameter(set, "$this$set");
                            set.setPivotY(f22);
                        }
                    });
                    Updater.m1153setimpl(m1149constructorimpl222, Float.valueOf(f9), new Function2() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$5
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                            invoke((GroupComponent) obj, ((Number) obj2).floatValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@NotNull GroupComponent set, float f22) {
                            Intrinsics.checkNotNullParameter(set, "$this$set");
                            set.setScaleX(f22);
                        }
                    });
                    Updater.m1153setimpl(m1149constructorimpl222, Float.valueOf(f12), new Function2() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$6
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                            invoke((GroupComponent) obj, ((Number) obj2).floatValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@NotNull GroupComponent set, float f22) {
                            Intrinsics.checkNotNullParameter(set, "$this$set");
                            set.setScaleY(f22);
                        }
                    });
                    Updater.m1153setimpl(m1149constructorimpl222, Float.valueOf(f13), new Function2() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$7
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                            invoke((GroupComponent) obj, ((Number) obj2).floatValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@NotNull GroupComponent set, float f22) {
                            Intrinsics.checkNotNullParameter(set, "$this$set");
                            set.setTranslationX(f22);
                        }
                    });
                    Updater.m1153setimpl(m1149constructorimpl222, Float.valueOf(f14), new Function2() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$8
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                            invoke((GroupComponent) obj, ((Number) obj2).floatValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@NotNull GroupComponent set, float f22) {
                            Intrinsics.checkNotNullParameter(set, "$this$set");
                            set.setTranslationY(f22);
                        }
                    });
                    Updater.m1153setimpl(m1149constructorimpl222, emptyPath, new Function2() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$9
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                            invoke((GroupComponent) obj, (List<? extends PathNode>) obj2);
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@NotNull GroupComponent set, @NotNull List<? extends PathNode> it) {
                            Intrinsics.checkNotNullParameter(set, "$this$set");
                            Intrinsics.checkNotNullParameter(it, "it");
                            set.setClipPathData(it);
                        }
                    });
                    startRestartGroup.startReplaceableGroup(-983907633);
                    content.invoke(startRestartGroup, Integer.valueOf((i3 >> 27) & 14));
                    startRestartGroup.endReplaceableGroup();
                    startRestartGroup.endNode();
                    startRestartGroup.endReplaceableGroup();
                    f15 = f11;
                    f16 = f14;
                    f17 = f12;
                    f18 = f13;
                    f19 = f9;
                    str3 = str2;
                    list2 = emptyPath;
                    f20 = f10;
                    f21 = f8;
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                f8 = f3;
                i6 = i2 & 16;
                if (i6 == 0) {
                }
                f9 = f4;
                i7 = i2 & 32;
                if (i7 != 0) {
                }
                i8 = i2 & 64;
                if (i8 != 0) {
                }
                i9 = i2 & 128;
                if (i9 != 0) {
                }
                i10 = i2 & 256;
                if (i10 != 0) {
                }
                if ((i2 & 512) == 0) {
                }
                i3 |= i11;
                if (i10 == 256) {
                }
                startRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                }
                if (i12 == 0) {
                }
                if (i13 == 0) {
                }
                if (i4 == 0) {
                }
                if (i5 != 0) {
                }
                if (i6 != 0) {
                }
                if (i7 == 0) {
                }
                if (i8 == 0) {
                }
                if (i9 == 0) {
                }
                if (i10 != 0) {
                }
                emptyPath = list;
                startRestartGroup.endDefaults();
                VectorComposeKt$Group$1 vectorComposeKt$Group$12222 = new Function0() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$1
                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    /* renamed from: invoke */
                    public final GroupComponent mo4828invoke() {
                        return new GroupComponent();
                    }
                };
                startRestartGroup.startReplaceableGroup(-548224868);
                if (!(startRestartGroup.getApplier() instanceof VectorApplier)) {
                }
                startRestartGroup.startNode();
                if (startRestartGroup.getInserting()) {
                }
                Composer m1149constructorimpl2222 = Updater.m1149constructorimpl(startRestartGroup);
                Updater.m1153setimpl(m1149constructorimpl2222, str2, new Function2() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                        invoke((GroupComponent) obj, (String) obj2);
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@NotNull GroupComponent set, @NotNull String it) {
                        Intrinsics.checkNotNullParameter(set, "$this$set");
                        Intrinsics.checkNotNullParameter(it, "it");
                        set.setName(it);
                    }
                });
                Updater.m1153setimpl(m1149constructorimpl2222, Float.valueOf(f10), new Function2() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$2
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                        invoke((GroupComponent) obj, ((Number) obj2).floatValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@NotNull GroupComponent set, float f22) {
                        Intrinsics.checkNotNullParameter(set, "$this$set");
                        set.setRotation(f22);
                    }
                });
                Updater.m1153setimpl(m1149constructorimpl2222, Float.valueOf(f11), new Function2() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$3
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                        invoke((GroupComponent) obj, ((Number) obj2).floatValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@NotNull GroupComponent set, float f22) {
                        Intrinsics.checkNotNullParameter(set, "$this$set");
                        set.setPivotX(f22);
                    }
                });
                Updater.m1153setimpl(m1149constructorimpl2222, Float.valueOf(f8), new Function2() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$4
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                        invoke((GroupComponent) obj, ((Number) obj2).floatValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@NotNull GroupComponent set, float f22) {
                        Intrinsics.checkNotNullParameter(set, "$this$set");
                        set.setPivotY(f22);
                    }
                });
                Updater.m1153setimpl(m1149constructorimpl2222, Float.valueOf(f9), new Function2() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$5
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                        invoke((GroupComponent) obj, ((Number) obj2).floatValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@NotNull GroupComponent set, float f22) {
                        Intrinsics.checkNotNullParameter(set, "$this$set");
                        set.setScaleX(f22);
                    }
                });
                Updater.m1153setimpl(m1149constructorimpl2222, Float.valueOf(f12), new Function2() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$6
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                        invoke((GroupComponent) obj, ((Number) obj2).floatValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@NotNull GroupComponent set, float f22) {
                        Intrinsics.checkNotNullParameter(set, "$this$set");
                        set.setScaleY(f22);
                    }
                });
                Updater.m1153setimpl(m1149constructorimpl2222, Float.valueOf(f13), new Function2() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$7
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                        invoke((GroupComponent) obj, ((Number) obj2).floatValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@NotNull GroupComponent set, float f22) {
                        Intrinsics.checkNotNullParameter(set, "$this$set");
                        set.setTranslationX(f22);
                    }
                });
                Updater.m1153setimpl(m1149constructorimpl2222, Float.valueOf(f14), new Function2() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$8
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                        invoke((GroupComponent) obj, ((Number) obj2).floatValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@NotNull GroupComponent set, float f22) {
                        Intrinsics.checkNotNullParameter(set, "$this$set");
                        set.setTranslationY(f22);
                    }
                });
                Updater.m1153setimpl(m1149constructorimpl2222, emptyPath, new Function2() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$9
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                        invoke((GroupComponent) obj, (List<? extends PathNode>) obj2);
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@NotNull GroupComponent set, @NotNull List<? extends PathNode> it) {
                        Intrinsics.checkNotNullParameter(set, "$this$set");
                        Intrinsics.checkNotNullParameter(it, "it");
                        set.setClipPathData(it);
                    }
                });
                startRestartGroup.startReplaceableGroup(-983907633);
                content.invoke(startRestartGroup, Integer.valueOf((i3 >> 27) & 14));
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endNode();
                startRestartGroup.endReplaceableGroup();
                f15 = f11;
                f16 = f14;
                f17 = f12;
                f18 = f13;
                f19 = f9;
                str3 = str2;
                list2 = emptyPath;
                f20 = f10;
                f21 = f8;
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            i5 = i2 & 8;
            if (i5 != 0) {
            }
            f8 = f3;
            i6 = i2 & 16;
            if (i6 == 0) {
            }
            f9 = f4;
            i7 = i2 & 32;
            if (i7 != 0) {
            }
            i8 = i2 & 64;
            if (i8 != 0) {
            }
            i9 = i2 & 128;
            if (i9 != 0) {
            }
            i10 = i2 & 256;
            if (i10 != 0) {
            }
            if ((i2 & 512) == 0) {
            }
            i3 |= i11;
            if (i10 == 256) {
            }
            startRestartGroup.startDefaults();
            if ((i & 1) != 0) {
            }
            if (i12 == 0) {
            }
            if (i13 == 0) {
            }
            if (i4 == 0) {
            }
            if (i5 != 0) {
            }
            if (i6 != 0) {
            }
            if (i7 == 0) {
            }
            if (i8 == 0) {
            }
            if (i9 == 0) {
            }
            if (i10 != 0) {
            }
            emptyPath = list;
            startRestartGroup.endDefaults();
            VectorComposeKt$Group$1 vectorComposeKt$Group$122222 = new Function0() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$1
                @Override // kotlin.jvm.functions.Function0
                @NotNull
                /* renamed from: invoke */
                public final GroupComponent mo4828invoke() {
                    return new GroupComponent();
                }
            };
            startRestartGroup.startReplaceableGroup(-548224868);
            if (!(startRestartGroup.getApplier() instanceof VectorApplier)) {
            }
            startRestartGroup.startNode();
            if (startRestartGroup.getInserting()) {
            }
            Composer m1149constructorimpl22222 = Updater.m1149constructorimpl(startRestartGroup);
            Updater.m1153setimpl(m1149constructorimpl22222, str2, new Function2() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((GroupComponent) obj, (String) obj2);
                    return Unit.INSTANCE;
                }

                public final void invoke(@NotNull GroupComponent set, @NotNull String it) {
                    Intrinsics.checkNotNullParameter(set, "$this$set");
                    Intrinsics.checkNotNullParameter(it, "it");
                    set.setName(it);
                }
            });
            Updater.m1153setimpl(m1149constructorimpl22222, Float.valueOf(f10), new Function2() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$2
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((GroupComponent) obj, ((Number) obj2).floatValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@NotNull GroupComponent set, float f22) {
                    Intrinsics.checkNotNullParameter(set, "$this$set");
                    set.setRotation(f22);
                }
            });
            Updater.m1153setimpl(m1149constructorimpl22222, Float.valueOf(f11), new Function2() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$3
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((GroupComponent) obj, ((Number) obj2).floatValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@NotNull GroupComponent set, float f22) {
                    Intrinsics.checkNotNullParameter(set, "$this$set");
                    set.setPivotX(f22);
                }
            });
            Updater.m1153setimpl(m1149constructorimpl22222, Float.valueOf(f8), new Function2() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$4
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((GroupComponent) obj, ((Number) obj2).floatValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@NotNull GroupComponent set, float f22) {
                    Intrinsics.checkNotNullParameter(set, "$this$set");
                    set.setPivotY(f22);
                }
            });
            Updater.m1153setimpl(m1149constructorimpl22222, Float.valueOf(f9), new Function2() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$5
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((GroupComponent) obj, ((Number) obj2).floatValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@NotNull GroupComponent set, float f22) {
                    Intrinsics.checkNotNullParameter(set, "$this$set");
                    set.setScaleX(f22);
                }
            });
            Updater.m1153setimpl(m1149constructorimpl22222, Float.valueOf(f12), new Function2() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$6
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((GroupComponent) obj, ((Number) obj2).floatValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@NotNull GroupComponent set, float f22) {
                    Intrinsics.checkNotNullParameter(set, "$this$set");
                    set.setScaleY(f22);
                }
            });
            Updater.m1153setimpl(m1149constructorimpl22222, Float.valueOf(f13), new Function2() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$7
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((GroupComponent) obj, ((Number) obj2).floatValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@NotNull GroupComponent set, float f22) {
                    Intrinsics.checkNotNullParameter(set, "$this$set");
                    set.setTranslationX(f22);
                }
            });
            Updater.m1153setimpl(m1149constructorimpl22222, Float.valueOf(f14), new Function2() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$8
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((GroupComponent) obj, ((Number) obj2).floatValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@NotNull GroupComponent set, float f22) {
                    Intrinsics.checkNotNullParameter(set, "$this$set");
                    set.setTranslationY(f22);
                }
            });
            Updater.m1153setimpl(m1149constructorimpl22222, emptyPath, new Function2() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$9
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((GroupComponent) obj, (List<? extends PathNode>) obj2);
                    return Unit.INSTANCE;
                }

                public final void invoke(@NotNull GroupComponent set, @NotNull List<? extends PathNode> it) {
                    Intrinsics.checkNotNullParameter(set, "$this$set");
                    Intrinsics.checkNotNullParameter(it, "it");
                    set.setClipPathData(it);
                }
            });
            startRestartGroup.startReplaceableGroup(-983907633);
            content.invoke(startRestartGroup, Integer.valueOf((i3 >> 27) & 14));
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
            f15 = f11;
            f16 = f14;
            f17 = f12;
            f18 = f13;
            f19 = f9;
            str3 = str2;
            list2 = emptyPath;
            f20 = f10;
            f21 = f8;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        i5 = i2 & 8;
        if (i5 != 0) {
        }
        f8 = f3;
        i6 = i2 & 16;
        if (i6 == 0) {
        }
        f9 = f4;
        i7 = i2 & 32;
        if (i7 != 0) {
        }
        i8 = i2 & 64;
        if (i8 != 0) {
        }
        i9 = i2 & 128;
        if (i9 != 0) {
        }
        i10 = i2 & 256;
        if (i10 != 0) {
        }
        if ((i2 & 512) == 0) {
        }
        i3 |= i11;
        if (i10 == 256) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i12 == 0) {
        }
        if (i13 == 0) {
        }
        if (i4 == 0) {
        }
        if (i5 != 0) {
        }
        if (i6 != 0) {
        }
        if (i7 == 0) {
        }
        if (i8 == 0) {
        }
        if (i9 == 0) {
        }
        if (i10 != 0) {
        }
        emptyPath = list;
        startRestartGroup.endDefaults();
        VectorComposeKt$Group$1 vectorComposeKt$Group$1222222 = new Function0() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$1
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* renamed from: invoke */
            public final GroupComponent mo4828invoke() {
                return new GroupComponent();
            }
        };
        startRestartGroup.startReplaceableGroup(-548224868);
        if (!(startRestartGroup.getApplier() instanceof VectorApplier)) {
        }
        startRestartGroup.startNode();
        if (startRestartGroup.getInserting()) {
        }
        Composer m1149constructorimpl222222 = Updater.m1149constructorimpl(startRestartGroup);
        Updater.m1153setimpl(m1149constructorimpl222222, str2, new Function2() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$1
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((GroupComponent) obj, (String) obj2);
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull GroupComponent set, @NotNull String it) {
                Intrinsics.checkNotNullParameter(set, "$this$set");
                Intrinsics.checkNotNullParameter(it, "it");
                set.setName(it);
            }
        });
        Updater.m1153setimpl(m1149constructorimpl222222, Float.valueOf(f10), new Function2() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$2
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((GroupComponent) obj, ((Number) obj2).floatValue());
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull GroupComponent set, float f22) {
                Intrinsics.checkNotNullParameter(set, "$this$set");
                set.setRotation(f22);
            }
        });
        Updater.m1153setimpl(m1149constructorimpl222222, Float.valueOf(f11), new Function2() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$3
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((GroupComponent) obj, ((Number) obj2).floatValue());
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull GroupComponent set, float f22) {
                Intrinsics.checkNotNullParameter(set, "$this$set");
                set.setPivotX(f22);
            }
        });
        Updater.m1153setimpl(m1149constructorimpl222222, Float.valueOf(f8), new Function2() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$4
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((GroupComponent) obj, ((Number) obj2).floatValue());
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull GroupComponent set, float f22) {
                Intrinsics.checkNotNullParameter(set, "$this$set");
                set.setPivotY(f22);
            }
        });
        Updater.m1153setimpl(m1149constructorimpl222222, Float.valueOf(f9), new Function2() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$5
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((GroupComponent) obj, ((Number) obj2).floatValue());
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull GroupComponent set, float f22) {
                Intrinsics.checkNotNullParameter(set, "$this$set");
                set.setScaleX(f22);
            }
        });
        Updater.m1153setimpl(m1149constructorimpl222222, Float.valueOf(f12), new Function2() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$6
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((GroupComponent) obj, ((Number) obj2).floatValue());
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull GroupComponent set, float f22) {
                Intrinsics.checkNotNullParameter(set, "$this$set");
                set.setScaleY(f22);
            }
        });
        Updater.m1153setimpl(m1149constructorimpl222222, Float.valueOf(f13), new Function2() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$7
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((GroupComponent) obj, ((Number) obj2).floatValue());
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull GroupComponent set, float f22) {
                Intrinsics.checkNotNullParameter(set, "$this$set");
                set.setTranslationX(f22);
            }
        });
        Updater.m1153setimpl(m1149constructorimpl222222, Float.valueOf(f14), new Function2() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$8
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((GroupComponent) obj, ((Number) obj2).floatValue());
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull GroupComponent set, float f22) {
                Intrinsics.checkNotNullParameter(set, "$this$set");
                set.setTranslationY(f22);
            }
        });
        Updater.m1153setimpl(m1149constructorimpl222222, emptyPath, new Function2() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$9
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((GroupComponent) obj, (List<? extends PathNode>) obj2);
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull GroupComponent set, @NotNull List<? extends PathNode> it) {
                Intrinsics.checkNotNullParameter(set, "$this$set");
                Intrinsics.checkNotNullParameter(it, "it");
                set.setClipPathData(it);
            }
        });
        startRestartGroup.startReplaceableGroup(-983907633);
        content.invoke(startRestartGroup, Integer.valueOf((i3 >> 27) & 14));
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endNode();
        startRestartGroup.endReplaceableGroup();
        f15 = f11;
        f16 = f14;
        f17 = f12;
        f18 = f13;
        f19 = f9;
        str3 = str2;
        list2 = emptyPath;
        f20 = f10;
        f21 = f8;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* renamed from: Path-9cdaXJ4, reason: not valid java name */
    public static final void m1744Path9cdaXJ4(final List pathData, int i, String str, Brush brush, float f, Brush brush2, float f2, float f3, int i2, int i3, float f4, float f5, float f6, float f7, Composer composer, final int i4, final int i5, final int i6) {
        Intrinsics.checkNotNullParameter(pathData, "pathData");
        Composer startRestartGroup = composer.startRestartGroup(-1478270750);
        final int defaultFillType = (i6 & 2) != 0 ? VectorKt.getDefaultFillType() : i;
        final String str2 = (i6 & 4) != 0 ? "" : str;
        final Brush brush3 = (i6 & 8) != 0 ? null : brush;
        float f8 = (i6 & 16) != 0 ? 1.0f : f;
        Brush brush4 = (i6 & 32) != 0 ? null : brush2;
        float f9 = (i6 & 64) != 0 ? 1.0f : f2;
        float f10 = (i6 & 128) != 0 ? 0.0f : f3;
        int defaultStrokeLineCap = (i6 & 256) != 0 ? VectorKt.getDefaultStrokeLineCap() : i2;
        int defaultStrokeLineJoin = (i6 & 512) != 0 ? VectorKt.getDefaultStrokeLineJoin() : i3;
        float f11 = (i6 & 1024) != 0 ? 4.0f : f4;
        float f12 = (i6 & 2048) != 0 ? 0.0f : f5;
        float f13 = (i6 & 4096) != 0 ? 1.0f : f6;
        float f14 = (i6 & 8192) != 0 ? 0.0f : f7;
        final VectorComposeKt$Path$1 vectorComposeKt$Path$1 = new Function0() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Path$1
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* renamed from: invoke */
            public final PathComponent mo4828invoke() {
                return new PathComponent();
            }
        };
        startRestartGroup.startReplaceableGroup(1886828752);
        if (!(startRestartGroup.getApplier() instanceof VectorApplier)) {
            ComposablesKt.invalidApplier();
        }
        startRestartGroup.startNode();
        if (startRestartGroup.getInserting()) {
            startRestartGroup.createNode(new Function0() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Path-9cdaXJ4$$inlined$ComposeNode$1
                {
                    super(0);
                }

                /* JADX WARN: Type inference failed for: r0v1, types: [androidx.compose.ui.graphics.vector.PathComponent, java.lang.Object] */
                @Override // kotlin.jvm.functions.Function0
                @NotNull
                /* renamed from: invoke */
                public final PathComponent mo4828invoke() {
                    return Function0.this.mo4828invoke();
                }
            });
        } else {
            startRestartGroup.useNode();
        }
        Composer m1149constructorimpl = Updater.m1149constructorimpl(startRestartGroup);
        Updater.m1153setimpl(m1149constructorimpl, str2, new Function2() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Path$2$1
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((PathComponent) obj, (String) obj2);
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull PathComponent set, @NotNull String it) {
                Intrinsics.checkNotNullParameter(set, "$this$set");
                Intrinsics.checkNotNullParameter(it, "it");
                set.setName(it);
            }
        });
        Updater.m1153setimpl(m1149constructorimpl, pathData, new Function2() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Path$2$2
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((PathComponent) obj, (List<? extends PathNode>) obj2);
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull PathComponent set, @NotNull List<? extends PathNode> it) {
                Intrinsics.checkNotNullParameter(set, "$this$set");
                Intrinsics.checkNotNullParameter(it, "it");
                set.setPathData(it);
            }
        });
        Updater.m1153setimpl(m1149constructorimpl, PathFillType.m1541boximpl(defaultFillType), new Function2() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Path$2$3
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                m1746invokepweu1eQ((PathComponent) obj, ((PathFillType) obj2).getValue());
                return Unit.INSTANCE;
            }

            /* renamed from: invoke-pweu1eQ, reason: not valid java name */
            public final void m1746invokepweu1eQ(@NotNull PathComponent set, int i7) {
                Intrinsics.checkNotNullParameter(set, "$this$set");
                set.m1729setPathFillTypeoQ8Xj4U(i7);
            }
        });
        Updater.m1153setimpl(m1149constructorimpl, brush3, new Function2() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Path$2$4
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((PathComponent) obj, (Brush) obj2);
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull PathComponent set, @Nullable Brush brush5) {
                Intrinsics.checkNotNullParameter(set, "$this$set");
                set.setFill(brush5);
            }
        });
        Updater.m1153setimpl(m1149constructorimpl, Float.valueOf(f8), new Function2() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Path$2$5
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((PathComponent) obj, ((Number) obj2).floatValue());
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull PathComponent set, float f15) {
                Intrinsics.checkNotNullParameter(set, "$this$set");
                set.setFillAlpha(f15);
            }
        });
        Updater.m1153setimpl(m1149constructorimpl, brush4, new Function2() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Path$2$6
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((PathComponent) obj, (Brush) obj2);
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull PathComponent set, @Nullable Brush brush5) {
                Intrinsics.checkNotNullParameter(set, "$this$set");
                set.setStroke(brush5);
            }
        });
        Updater.m1153setimpl(m1149constructorimpl, Float.valueOf(f9), new Function2() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Path$2$7
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((PathComponent) obj, ((Number) obj2).floatValue());
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull PathComponent set, float f15) {
                Intrinsics.checkNotNullParameter(set, "$this$set");
                set.setStrokeAlpha(f15);
            }
        });
        Updater.m1153setimpl(m1149constructorimpl, Float.valueOf(f10), new Function2() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Path$2$8
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((PathComponent) obj, ((Number) obj2).floatValue());
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull PathComponent set, float f15) {
                Intrinsics.checkNotNullParameter(set, "$this$set");
                set.setStrokeLineWidth(f15);
            }
        });
        Updater.m1153setimpl(m1149constructorimpl, StrokeJoin.m1597boximpl(defaultStrokeLineJoin), new Function2() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Path$2$9
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                m1747invokekLtJ_vA((PathComponent) obj, ((StrokeJoin) obj2).getValue());
                return Unit.INSTANCE;
            }

            /* renamed from: invoke-kLtJ_vA, reason: not valid java name */
            public final void m1747invokekLtJ_vA(@NotNull PathComponent set, int i7) {
                Intrinsics.checkNotNullParameter(set, "$this$set");
                set.m1731setStrokeLineJoinWw9F2mQ(i7);
            }
        });
        Updater.m1153setimpl(m1149constructorimpl, StrokeCap.m1587boximpl(defaultStrokeLineCap), new Function2() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Path$2$10
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                m1745invokeCSYIeUk((PathComponent) obj, ((StrokeCap) obj2).getValue());
                return Unit.INSTANCE;
            }

            /* renamed from: invoke-CSYIeUk, reason: not valid java name */
            public final void m1745invokeCSYIeUk(@NotNull PathComponent set, int i7) {
                Intrinsics.checkNotNullParameter(set, "$this$set");
                set.m1730setStrokeLineCapBeK7IIE(i7);
            }
        });
        Updater.m1153setimpl(m1149constructorimpl, Float.valueOf(f11), new Function2() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Path$2$11
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((PathComponent) obj, ((Number) obj2).floatValue());
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull PathComponent set, float f15) {
                Intrinsics.checkNotNullParameter(set, "$this$set");
                set.setStrokeLineMiter(f15);
            }
        });
        Updater.m1153setimpl(m1149constructorimpl, Float.valueOf(f12), new Function2() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Path$2$12
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((PathComponent) obj, ((Number) obj2).floatValue());
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull PathComponent set, float f15) {
                Intrinsics.checkNotNullParameter(set, "$this$set");
                set.setTrimPathStart(f15);
            }
        });
        Updater.m1153setimpl(m1149constructorimpl, Float.valueOf(f13), new Function2() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Path$2$13
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((PathComponent) obj, ((Number) obj2).floatValue());
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull PathComponent set, float f15) {
                Intrinsics.checkNotNullParameter(set, "$this$set");
                set.setTrimPathEnd(f15);
            }
        });
        Updater.m1153setimpl(m1149constructorimpl, Float.valueOf(f14), new Function2() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Path$2$14
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((PathComponent) obj, ((Number) obj2).floatValue());
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull PathComponent set, float f15) {
                Intrinsics.checkNotNullParameter(set, "$this$set");
                set.setTrimPathOffset(f15);
            }
        });
        startRestartGroup.endNode();
        startRestartGroup.endReplaceableGroup();
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        final float f15 = f8;
        final Brush brush5 = brush4;
        final float f16 = f9;
        final float f17 = f10;
        final int i7 = defaultStrokeLineCap;
        final int i8 = defaultStrokeLineJoin;
        final float f18 = f11;
        final float f19 = f12;
        final float f20 = f13;
        final float f21 = f14;
        endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Path$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((Composer) obj, ((Number) obj2).intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(@Nullable Composer composer2, int i9) {
                VectorComposeKt.m1744Path9cdaXJ4(pathData, defaultFillType, str2, brush3, f15, brush5, f16, f17, i7, i8, f18, f19, f20, f21, composer2, i4 | 1, i5, i6);
            }
        });
    }
}
