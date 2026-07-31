package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.gestures.FlingBehavior;
import androidx.compose.foundation.gestures.ScrollableDefaults;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import com.google.android.exoplayer2.C;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: LazyGridDsl.kt */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\n\u001a{\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\b2\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u0011H\u0007¢\u0006\u0004\b\u0015\u0010\u0016\u001a{\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\b2\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u0011H\u0007¢\u0006\u0004\b\u0018\u0010\u0019\u001aB\u0010\u001f\u001a\u001a\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001c\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001e0\u001d0\u001a2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u0006H\u0003ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010 \u001aB\u0010!\u001a\u001a\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001c\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001e0\u001d0\u001a2\u0006\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0006H\u0003ø\u0001\u0000¢\u0006\u0004\b!\u0010\"\u001a-\u0010&\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d2\u0006\u0010#\u001a\u00020\u001e2\u0006\u0010$\u001a\u00020\u001e2\u0006\u0010%\u001a\u00020\u001eH\u0002¢\u0006\u0004\b&\u0010'\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006("}, d2 = {"Landroidx/compose/foundation/lazy/grid/GridCells;", "columns", "Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/foundation/lazy/grid/LazyGridState;", "state", "Landroidx/compose/foundation/layout/PaddingValues;", "contentPadding", "", "reverseLayout", "Landroidx/compose/foundation/layout/Arrangement$Vertical;", "verticalArrangement", "Landroidx/compose/foundation/layout/Arrangement$Horizontal;", "horizontalArrangement", "Landroidx/compose/foundation/gestures/FlingBehavior;", "flingBehavior", "userScrollEnabled", "Lkotlin/Function1;", "Landroidx/compose/foundation/lazy/grid/LazyGridScope;", "", "content", "LazyVerticalGrid", "(Landroidx/compose/foundation/lazy/grid/GridCells;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/lazy/grid/LazyGridState;Landroidx/compose/foundation/layout/PaddingValues;ZLandroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/foundation/gestures/FlingBehavior;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "rows", "LazyHorizontalGrid", "(Landroidx/compose/foundation/lazy/grid/GridCells;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/lazy/grid/LazyGridState;Landroidx/compose/foundation/layout/PaddingValues;ZLandroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/foundation/gestures/FlingBehavior;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Lkotlin/Function2;", "Landroidx/compose/ui/unit/Density;", "Landroidx/compose/ui/unit/Constraints;", "", "", "rememberColumnWidthSums", "(Landroidx/compose/foundation/lazy/grid/GridCells;Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/runtime/Composer;I)Lkotlin/jvm/functions/Function2;", "rememberRowHeightSums", "(Landroidx/compose/foundation/lazy/grid/GridCells;Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/runtime/Composer;I)Lkotlin/jvm/functions/Function2;", "gridSize", "slotCount", "spacing", "calculateCellsCrossAxisSizeImpl", "(III)Ljava/util/List;", "foundation_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class LazyGridDslKt {
    /* JADX WARN: Removed duplicated region for block: B:100:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:60:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01f8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void LazyVerticalGrid(final GridCells columns, Modifier modifier, LazyGridState lazyGridState, PaddingValues paddingValues, boolean z, Arrangement.Vertical vertical, Arrangement.Horizontal horizontal, FlingBehavior flingBehavior, boolean z2, final Function1 content, Composer composer, final int i, final int i2) {
        int i3;
        int i4;
        PaddingValues paddingValues2;
        int i5;
        boolean z3;
        Arrangement.Vertical vertical2;
        int i6;
        Arrangement.Horizontal horizontal2;
        int i7;
        int i8;
        Modifier modifier2;
        LazyGridState lazyGridState2;
        Arrangement.Vertical vertical3;
        FlingBehavior flingBehavior2;
        boolean z4;
        LazyGridState lazyGridState3;
        boolean z5;
        PaddingValues paddingValues3;
        Arrangement.Vertical vertical4;
        Arrangement.Horizontal horizontal3;
        FlingBehavior flingBehavior3;
        final Modifier modifier3;
        final LazyGridState lazyGridState4;
        final FlingBehavior flingBehavior4;
        final boolean z6;
        Composer composer2;
        final Arrangement.Horizontal horizontal4;
        final boolean z7;
        final Arrangement.Vertical vertical5;
        final PaddingValues paddingValues4;
        ScopeUpdateScope endRestartGroup;
        int i9;
        int i10;
        int i11;
        Intrinsics.checkNotNullParameter(columns, "columns");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer startRestartGroup = composer.startRestartGroup(1485410512);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (startRestartGroup.changed(columns) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i12 = i2 & 2;
        if (i12 != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= startRestartGroup.changed(modifier) ? 32 : 16;
            if ((i & 896) == 0) {
                if ((i2 & 4) == 0 && startRestartGroup.changed(lazyGridState)) {
                    i11 = 256;
                    i3 |= i11;
                }
                i11 = 128;
                i3 |= i11;
            }
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 7168) == 0) {
                paddingValues2 = paddingValues;
                i3 |= startRestartGroup.changed(paddingValues2) ? 2048 : 1024;
                i5 = i2 & 16;
                if (i5 != 0) {
                    i3 |= 24576;
                } else if ((i & 57344) == 0) {
                    z3 = z;
                    i3 |= startRestartGroup.changed(z3) ? 16384 : 8192;
                    if ((458752 & i) != 0) {
                        if ((i2 & 32) == 0) {
                            vertical2 = vertical;
                            if (startRestartGroup.changed(vertical2)) {
                                i10 = 131072;
                                i3 |= i10;
                            }
                        } else {
                            vertical2 = vertical;
                        }
                        i10 = 65536;
                        i3 |= i10;
                    } else {
                        vertical2 = vertical;
                    }
                    i6 = i2 & 64;
                    if (i6 == 0) {
                        i3 |= 1572864;
                        horizontal2 = horizontal;
                    } else {
                        horizontal2 = horizontal;
                        if ((i & 3670016) == 0) {
                            i3 |= startRestartGroup.changed(horizontal2) ? 1048576 : 524288;
                        }
                    }
                    if ((i & 29360128) == 0) {
                        if ((i2 & 128) == 0 && startRestartGroup.changed(flingBehavior)) {
                            i9 = 8388608;
                            i3 |= i9;
                        }
                        i9 = 4194304;
                        i3 |= i9;
                    }
                    i7 = i2 & 256;
                    if (i7 == 0) {
                        i3 |= 100663296;
                    } else if ((i & 234881024) == 0) {
                        i3 |= startRestartGroup.changed(z2) ? 67108864 : 33554432;
                    }
                    if ((i2 & 512) != 0) {
                        if ((i & 1879048192) == 0) {
                            i8 = startRestartGroup.changed(content) ? 536870912 : 268435456;
                        }
                        if ((1533916891 & i3) == 306783378 || !startRestartGroup.getSkipping()) {
                            startRestartGroup.startDefaults();
                            if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                                modifier2 = i12 != 0 ? Modifier.INSTANCE : modifier;
                                if ((i2 & 4) != 0) {
                                    lazyGridState2 = LazyGridStateKt.rememberLazyGridState(0, 0, startRestartGroup, 0, 3);
                                    i3 &= -897;
                                } else {
                                    lazyGridState2 = lazyGridState;
                                }
                                PaddingValues m329PaddingValues0680j_4 = i4 != 0 ? PaddingKt.m329PaddingValues0680j_4(Dp.m2507constructorimpl(0)) : paddingValues2;
                                boolean z8 = i5 == 0 ? z3 : false;
                                if ((i2 & 32) != 0) {
                                    Arrangement arrangement = Arrangement.INSTANCE;
                                    vertical3 = !z8 ? arrangement.getTop() : arrangement.getBottom();
                                    i3 &= -458753;
                                } else {
                                    vertical3 = vertical2;
                                }
                                Arrangement.Horizontal start = i6 != 0 ? Arrangement.INSTANCE.getStart() : horizontal2;
                                if ((i2 & 128) != 0) {
                                    flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(startRestartGroup, 6);
                                    i3 &= -29360129;
                                } else {
                                    flingBehavior2 = flingBehavior;
                                }
                                if (i7 != 0) {
                                    lazyGridState3 = lazyGridState2;
                                    z4 = true;
                                } else {
                                    z4 = z2;
                                    lazyGridState3 = lazyGridState2;
                                }
                                z5 = z8;
                                paddingValues3 = m329PaddingValues0680j_4;
                                vertical4 = vertical3;
                                horizontal3 = start;
                                flingBehavior3 = flingBehavior2;
                            } else {
                                startRestartGroup.skipToGroupEnd();
                                if ((i2 & 4) != 0) {
                                    i3 &= -897;
                                }
                                if ((i2 & 32) != 0) {
                                    i3 &= -458753;
                                }
                                if ((i2 & 128) != 0) {
                                    i3 &= -29360129;
                                }
                                modifier2 = modifier;
                                lazyGridState3 = lazyGridState;
                                flingBehavior3 = flingBehavior;
                                z4 = z2;
                                paddingValues3 = paddingValues2;
                                z5 = z3;
                                vertical4 = vertical2;
                                horizontal3 = horizontal2;
                            }
                            startRestartGroup.endDefaults();
                            int i13 = i3 >> 3;
                            Function2 rememberColumnWidthSums = rememberColumnWidthSums(columns, horizontal3, paddingValues3, startRestartGroup, (i3 & 14) | ((i3 >> 15) & 112) | (i13 & 896));
                            int i14 = (i13 & 14) | 196608 | (i13 & 112) | (i3 & 7168) | (57344 & i3) | (i13 & 3670016) | (i13 & 29360128);
                            int i15 = i3 << 9;
                            int i16 = i14 | (i15 & 234881024) | (i15 & 1879048192);
                            int i17 = (i3 >> 27) & 14;
                            modifier3 = modifier2;
                            lazyGridState4 = lazyGridState3;
                            flingBehavior4 = flingBehavior3;
                            z6 = z4;
                            composer2 = startRestartGroup;
                            LazyGridKt.LazyGrid(modifier3, lazyGridState4, rememberColumnWidthSums, paddingValues3, z5, true, flingBehavior4, z6, vertical4, horizontal3, content, startRestartGroup, i16, i17, 0);
                            horizontal4 = horizontal3;
                            z7 = z5;
                            vertical5 = vertical4;
                            paddingValues4 = paddingValues3;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            modifier3 = modifier;
                            lazyGridState4 = lazyGridState;
                            flingBehavior4 = flingBehavior;
                            paddingValues4 = paddingValues2;
                            horizontal4 = horizontal2;
                            z7 = z3;
                            vertical5 = vertical2;
                            composer2 = startRestartGroup;
                            z6 = z2;
                        }
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup == null) {
                            return;
                        }
                        endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.foundation.lazy.grid.LazyGridDslKt$LazyVerticalGrid$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                invoke((Composer) obj, ((Number) obj2).intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@Nullable Composer composer3, int i18) {
                                LazyGridDslKt.LazyVerticalGrid(GridCells.this, modifier3, lazyGridState4, paddingValues4, z7, vertical5, horizontal4, flingBehavior4, z6, content, composer3, i | 1, i2);
                            }
                        });
                        return;
                    }
                    i8 = C.ENCODING_PCM_32BIT;
                    i3 |= i8;
                    if ((1533916891 & i3) == 306783378) {
                    }
                    startRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                    }
                    if (i12 != 0) {
                    }
                    if ((i2 & 4) != 0) {
                    }
                    if (i4 != 0) {
                    }
                    if (i5 == 0) {
                    }
                    if ((i2 & 32) != 0) {
                    }
                    if (i6 != 0) {
                    }
                    if ((i2 & 128) != 0) {
                    }
                    if (i7 != 0) {
                    }
                    z5 = z8;
                    paddingValues3 = m329PaddingValues0680j_4;
                    vertical4 = vertical3;
                    horizontal3 = start;
                    flingBehavior3 = flingBehavior2;
                    startRestartGroup.endDefaults();
                    int i132 = i3 >> 3;
                    Function2 rememberColumnWidthSums2 = rememberColumnWidthSums(columns, horizontal3, paddingValues3, startRestartGroup, (i3 & 14) | ((i3 >> 15) & 112) | (i132 & 896));
                    int i142 = (i132 & 14) | 196608 | (i132 & 112) | (i3 & 7168) | (57344 & i3) | (i132 & 3670016) | (i132 & 29360128);
                    int i152 = i3 << 9;
                    int i162 = i142 | (i152 & 234881024) | (i152 & 1879048192);
                    int i172 = (i3 >> 27) & 14;
                    modifier3 = modifier2;
                    lazyGridState4 = lazyGridState3;
                    flingBehavior4 = flingBehavior3;
                    z6 = z4;
                    composer2 = startRestartGroup;
                    LazyGridKt.LazyGrid(modifier3, lazyGridState4, rememberColumnWidthSums2, paddingValues3, z5, true, flingBehavior4, z6, vertical4, horizontal3, content, startRestartGroup, i162, i172, 0);
                    horizontal4 = horizontal3;
                    z7 = z5;
                    vertical5 = vertical4;
                    paddingValues4 = paddingValues3;
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup == null) {
                    }
                }
                z3 = z;
                if ((458752 & i) != 0) {
                }
                i6 = i2 & 64;
                if (i6 == 0) {
                }
                if ((i & 29360128) == 0) {
                }
                i7 = i2 & 256;
                if (i7 == 0) {
                }
                if ((i2 & 512) != 0) {
                }
                i3 |= i8;
                if ((1533916891 & i3) == 306783378) {
                }
                startRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                }
                if (i12 != 0) {
                }
                if ((i2 & 4) != 0) {
                }
                if (i4 != 0) {
                }
                if (i5 == 0) {
                }
                if ((i2 & 32) != 0) {
                }
                if (i6 != 0) {
                }
                if ((i2 & 128) != 0) {
                }
                if (i7 != 0) {
                }
                z5 = z8;
                paddingValues3 = m329PaddingValues0680j_4;
                vertical4 = vertical3;
                horizontal3 = start;
                flingBehavior3 = flingBehavior2;
                startRestartGroup.endDefaults();
                int i1322 = i3 >> 3;
                Function2 rememberColumnWidthSums22 = rememberColumnWidthSums(columns, horizontal3, paddingValues3, startRestartGroup, (i3 & 14) | ((i3 >> 15) & 112) | (i1322 & 896));
                int i1422 = (i1322 & 14) | 196608 | (i1322 & 112) | (i3 & 7168) | (57344 & i3) | (i1322 & 3670016) | (i1322 & 29360128);
                int i1522 = i3 << 9;
                int i1622 = i1422 | (i1522 & 234881024) | (i1522 & 1879048192);
                int i1722 = (i3 >> 27) & 14;
                modifier3 = modifier2;
                lazyGridState4 = lazyGridState3;
                flingBehavior4 = flingBehavior3;
                z6 = z4;
                composer2 = startRestartGroup;
                LazyGridKt.LazyGrid(modifier3, lazyGridState4, rememberColumnWidthSums22, paddingValues3, z5, true, flingBehavior4, z6, vertical4, horizontal3, content, startRestartGroup, i1622, i1722, 0);
                horizontal4 = horizontal3;
                z7 = z5;
                vertical5 = vertical4;
                paddingValues4 = paddingValues3;
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            paddingValues2 = paddingValues;
            i5 = i2 & 16;
            if (i5 != 0) {
            }
            z3 = z;
            if ((458752 & i) != 0) {
            }
            i6 = i2 & 64;
            if (i6 == 0) {
            }
            if ((i & 29360128) == 0) {
            }
            i7 = i2 & 256;
            if (i7 == 0) {
            }
            if ((i2 & 512) != 0) {
            }
            i3 |= i8;
            if ((1533916891 & i3) == 306783378) {
            }
            startRestartGroup.startDefaults();
            if ((i & 1) != 0) {
            }
            if (i12 != 0) {
            }
            if ((i2 & 4) != 0) {
            }
            if (i4 != 0) {
            }
            if (i5 == 0) {
            }
            if ((i2 & 32) != 0) {
            }
            if (i6 != 0) {
            }
            if ((i2 & 128) != 0) {
            }
            if (i7 != 0) {
            }
            z5 = z8;
            paddingValues3 = m329PaddingValues0680j_4;
            vertical4 = vertical3;
            horizontal3 = start;
            flingBehavior3 = flingBehavior2;
            startRestartGroup.endDefaults();
            int i13222 = i3 >> 3;
            Function2 rememberColumnWidthSums222 = rememberColumnWidthSums(columns, horizontal3, paddingValues3, startRestartGroup, (i3 & 14) | ((i3 >> 15) & 112) | (i13222 & 896));
            int i14222 = (i13222 & 14) | 196608 | (i13222 & 112) | (i3 & 7168) | (57344 & i3) | (i13222 & 3670016) | (i13222 & 29360128);
            int i15222 = i3 << 9;
            int i16222 = i14222 | (i15222 & 234881024) | (i15222 & 1879048192);
            int i17222 = (i3 >> 27) & 14;
            modifier3 = modifier2;
            lazyGridState4 = lazyGridState3;
            flingBehavior4 = flingBehavior3;
            z6 = z4;
            composer2 = startRestartGroup;
            LazyGridKt.LazyGrid(modifier3, lazyGridState4, rememberColumnWidthSums222, paddingValues3, z5, true, flingBehavior4, z6, vertical4, horizontal3, content, startRestartGroup, i16222, i17222, 0);
            horizontal4 = horizontal3;
            z7 = z5;
            vertical5 = vertical4;
            paddingValues4 = paddingValues3;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        if ((i & 896) == 0) {
        }
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        paddingValues2 = paddingValues;
        i5 = i2 & 16;
        if (i5 != 0) {
        }
        z3 = z;
        if ((458752 & i) != 0) {
        }
        i6 = i2 & 64;
        if (i6 == 0) {
        }
        if ((i & 29360128) == 0) {
        }
        i7 = i2 & 256;
        if (i7 == 0) {
        }
        if ((i2 & 512) != 0) {
        }
        i3 |= i8;
        if ((1533916891 & i3) == 306783378) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i12 != 0) {
        }
        if ((i2 & 4) != 0) {
        }
        if (i4 != 0) {
        }
        if (i5 == 0) {
        }
        if ((i2 & 32) != 0) {
        }
        if (i6 != 0) {
        }
        if ((i2 & 128) != 0) {
        }
        if (i7 != 0) {
        }
        z5 = z8;
        paddingValues3 = m329PaddingValues0680j_4;
        vertical4 = vertical3;
        horizontal3 = start;
        flingBehavior3 = flingBehavior2;
        startRestartGroup.endDefaults();
        int i132222 = i3 >> 3;
        Function2 rememberColumnWidthSums2222 = rememberColumnWidthSums(columns, horizontal3, paddingValues3, startRestartGroup, (i3 & 14) | ((i3 >> 15) & 112) | (i132222 & 896));
        int i142222 = (i132222 & 14) | 196608 | (i132222 & 112) | (i3 & 7168) | (57344 & i3) | (i132222 & 3670016) | (i132222 & 29360128);
        int i152222 = i3 << 9;
        int i162222 = i142222 | (i152222 & 234881024) | (i152222 & 1879048192);
        int i172222 = (i3 >> 27) & 14;
        modifier3 = modifier2;
        lazyGridState4 = lazyGridState3;
        flingBehavior4 = flingBehavior3;
        z6 = z4;
        composer2 = startRestartGroup;
        LazyGridKt.LazyGrid(modifier3, lazyGridState4, rememberColumnWidthSums2222, paddingValues3, z5, true, flingBehavior4, z6, vertical4, horizontal3, content, startRestartGroup, i162222, i172222, 0);
        horizontal4 = horizontal3;
        z7 = z5;
        vertical5 = vertical4;
        paddingValues4 = paddingValues3;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:60:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01f9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void LazyHorizontalGrid(final GridCells rows, Modifier modifier, LazyGridState lazyGridState, PaddingValues paddingValues, boolean z, Arrangement.Horizontal horizontal, Arrangement.Vertical vertical, FlingBehavior flingBehavior, boolean z2, final Function1 content, Composer composer, final int i, final int i2) {
        int i3;
        int i4;
        PaddingValues paddingValues2;
        int i5;
        boolean z3;
        Arrangement.Horizontal horizontal2;
        int i6;
        Arrangement.Vertical vertical2;
        int i7;
        int i8;
        Modifier modifier2;
        LazyGridState lazyGridState2;
        Arrangement.Horizontal horizontal3;
        FlingBehavior flingBehavior2;
        boolean z4;
        LazyGridState lazyGridState3;
        boolean z5;
        PaddingValues paddingValues3;
        Arrangement.Horizontal horizontal4;
        Arrangement.Vertical vertical3;
        FlingBehavior flingBehavior3;
        final Modifier modifier3;
        final LazyGridState lazyGridState4;
        final FlingBehavior flingBehavior4;
        final boolean z6;
        Composer composer2;
        final Arrangement.Vertical vertical4;
        final boolean z7;
        final Arrangement.Horizontal horizontal5;
        final PaddingValues paddingValues4;
        ScopeUpdateScope endRestartGroup;
        int i9;
        int i10;
        int i11;
        Intrinsics.checkNotNullParameter(rows, "rows");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer startRestartGroup = composer.startRestartGroup(2123608858);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (startRestartGroup.changed(rows) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i12 = i2 & 2;
        if (i12 != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= startRestartGroup.changed(modifier) ? 32 : 16;
            if ((i & 896) == 0) {
                if ((i2 & 4) == 0 && startRestartGroup.changed(lazyGridState)) {
                    i11 = 256;
                    i3 |= i11;
                }
                i11 = 128;
                i3 |= i11;
            }
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 7168) == 0) {
                paddingValues2 = paddingValues;
                i3 |= startRestartGroup.changed(paddingValues2) ? 2048 : 1024;
                i5 = i2 & 16;
                if (i5 != 0) {
                    i3 |= 24576;
                } else if ((i & 57344) == 0) {
                    z3 = z;
                    i3 |= startRestartGroup.changed(z3) ? 16384 : 8192;
                    if ((458752 & i) != 0) {
                        if ((i2 & 32) == 0) {
                            horizontal2 = horizontal;
                            if (startRestartGroup.changed(horizontal2)) {
                                i10 = 131072;
                                i3 |= i10;
                            }
                        } else {
                            horizontal2 = horizontal;
                        }
                        i10 = 65536;
                        i3 |= i10;
                    } else {
                        horizontal2 = horizontal;
                    }
                    i6 = i2 & 64;
                    if (i6 == 0) {
                        i3 |= 1572864;
                        vertical2 = vertical;
                    } else {
                        vertical2 = vertical;
                        if ((i & 3670016) == 0) {
                            i3 |= startRestartGroup.changed(vertical2) ? 1048576 : 524288;
                        }
                    }
                    if ((i & 29360128) == 0) {
                        if ((i2 & 128) == 0 && startRestartGroup.changed(flingBehavior)) {
                            i9 = 8388608;
                            i3 |= i9;
                        }
                        i9 = 4194304;
                        i3 |= i9;
                    }
                    i7 = i2 & 256;
                    if (i7 == 0) {
                        i3 |= 100663296;
                    } else if ((i & 234881024) == 0) {
                        i3 |= startRestartGroup.changed(z2) ? 67108864 : 33554432;
                    }
                    if ((i2 & 512) != 0) {
                        if ((i & 1879048192) == 0) {
                            i8 = startRestartGroup.changed(content) ? 536870912 : 268435456;
                        }
                        if ((1533916891 & i3) == 306783378 || !startRestartGroup.getSkipping()) {
                            startRestartGroup.startDefaults();
                            if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                                modifier2 = i12 != 0 ? Modifier.INSTANCE : modifier;
                                if ((i2 & 4) != 0) {
                                    lazyGridState2 = LazyGridStateKt.rememberLazyGridState(0, 0, startRestartGroup, 0, 3);
                                    i3 &= -897;
                                } else {
                                    lazyGridState2 = lazyGridState;
                                }
                                PaddingValues m329PaddingValues0680j_4 = i4 != 0 ? PaddingKt.m329PaddingValues0680j_4(Dp.m2507constructorimpl(0)) : paddingValues2;
                                boolean z8 = i5 == 0 ? z3 : false;
                                if ((i2 & 32) != 0) {
                                    Arrangement arrangement = Arrangement.INSTANCE;
                                    horizontal3 = !z8 ? arrangement.getStart() : arrangement.getEnd();
                                    i3 &= -458753;
                                } else {
                                    horizontal3 = horizontal2;
                                }
                                Arrangement.Vertical top = i6 != 0 ? Arrangement.INSTANCE.getTop() : vertical2;
                                if ((i2 & 128) != 0) {
                                    flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(startRestartGroup, 6);
                                    i3 &= -29360129;
                                } else {
                                    flingBehavior2 = flingBehavior;
                                }
                                if (i7 != 0) {
                                    lazyGridState3 = lazyGridState2;
                                    z4 = true;
                                } else {
                                    z4 = z2;
                                    lazyGridState3 = lazyGridState2;
                                }
                                z5 = z8;
                                paddingValues3 = m329PaddingValues0680j_4;
                                horizontal4 = horizontal3;
                                vertical3 = top;
                                flingBehavior3 = flingBehavior2;
                            } else {
                                startRestartGroup.skipToGroupEnd();
                                if ((i2 & 4) != 0) {
                                    i3 &= -897;
                                }
                                if ((i2 & 32) != 0) {
                                    i3 &= -458753;
                                }
                                if ((i2 & 128) != 0) {
                                    i3 &= -29360129;
                                }
                                modifier2 = modifier;
                                lazyGridState3 = lazyGridState;
                                flingBehavior3 = flingBehavior;
                                z4 = z2;
                                paddingValues3 = paddingValues2;
                                z5 = z3;
                                horizontal4 = horizontal2;
                                vertical3 = vertical2;
                            }
                            startRestartGroup.endDefaults();
                            int i13 = i3 >> 3;
                            Function2 rememberRowHeightSums = rememberRowHeightSums(rows, vertical3, paddingValues3, startRestartGroup, (i3 & 14) | ((i3 >> 15) & 112) | (i13 & 896));
                            int i14 = (i13 & 14) | 196608 | (i13 & 112) | (i3 & 7168) | (57344 & i3) | (i13 & 3670016) | (i13 & 29360128) | ((i3 << 6) & 234881024) | ((i3 << 12) & 1879048192);
                            int i15 = (i3 >> 27) & 14;
                            modifier3 = modifier2;
                            lazyGridState4 = lazyGridState3;
                            flingBehavior4 = flingBehavior3;
                            z6 = z4;
                            composer2 = startRestartGroup;
                            LazyGridKt.LazyGrid(modifier3, lazyGridState4, rememberRowHeightSums, paddingValues3, z5, false, flingBehavior4, z6, vertical3, horizontal4, content, startRestartGroup, i14, i15, 0);
                            vertical4 = vertical3;
                            z7 = z5;
                            horizontal5 = horizontal4;
                            paddingValues4 = paddingValues3;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            modifier3 = modifier;
                            lazyGridState4 = lazyGridState;
                            flingBehavior4 = flingBehavior;
                            paddingValues4 = paddingValues2;
                            vertical4 = vertical2;
                            z7 = z3;
                            horizontal5 = horizontal2;
                            composer2 = startRestartGroup;
                            z6 = z2;
                        }
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup == null) {
                            return;
                        }
                        endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.foundation.lazy.grid.LazyGridDslKt$LazyHorizontalGrid$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                invoke((Composer) obj, ((Number) obj2).intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@Nullable Composer composer3, int i16) {
                                LazyGridDslKt.LazyHorizontalGrid(GridCells.this, modifier3, lazyGridState4, paddingValues4, z7, horizontal5, vertical4, flingBehavior4, z6, content, composer3, i | 1, i2);
                            }
                        });
                        return;
                    }
                    i8 = C.ENCODING_PCM_32BIT;
                    i3 |= i8;
                    if ((1533916891 & i3) == 306783378) {
                    }
                    startRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                    }
                    if (i12 != 0) {
                    }
                    if ((i2 & 4) != 0) {
                    }
                    if (i4 != 0) {
                    }
                    if (i5 == 0) {
                    }
                    if ((i2 & 32) != 0) {
                    }
                    if (i6 != 0) {
                    }
                    if ((i2 & 128) != 0) {
                    }
                    if (i7 != 0) {
                    }
                    z5 = z8;
                    paddingValues3 = m329PaddingValues0680j_4;
                    horizontal4 = horizontal3;
                    vertical3 = top;
                    flingBehavior3 = flingBehavior2;
                    startRestartGroup.endDefaults();
                    int i132 = i3 >> 3;
                    Function2 rememberRowHeightSums2 = rememberRowHeightSums(rows, vertical3, paddingValues3, startRestartGroup, (i3 & 14) | ((i3 >> 15) & 112) | (i132 & 896));
                    int i142 = (i132 & 14) | 196608 | (i132 & 112) | (i3 & 7168) | (57344 & i3) | (i132 & 3670016) | (i132 & 29360128) | ((i3 << 6) & 234881024) | ((i3 << 12) & 1879048192);
                    int i152 = (i3 >> 27) & 14;
                    modifier3 = modifier2;
                    lazyGridState4 = lazyGridState3;
                    flingBehavior4 = flingBehavior3;
                    z6 = z4;
                    composer2 = startRestartGroup;
                    LazyGridKt.LazyGrid(modifier3, lazyGridState4, rememberRowHeightSums2, paddingValues3, z5, false, flingBehavior4, z6, vertical3, horizontal4, content, startRestartGroup, i142, i152, 0);
                    vertical4 = vertical3;
                    z7 = z5;
                    horizontal5 = horizontal4;
                    paddingValues4 = paddingValues3;
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup == null) {
                    }
                }
                z3 = z;
                if ((458752 & i) != 0) {
                }
                i6 = i2 & 64;
                if (i6 == 0) {
                }
                if ((i & 29360128) == 0) {
                }
                i7 = i2 & 256;
                if (i7 == 0) {
                }
                if ((i2 & 512) != 0) {
                }
                i3 |= i8;
                if ((1533916891 & i3) == 306783378) {
                }
                startRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                }
                if (i12 != 0) {
                }
                if ((i2 & 4) != 0) {
                }
                if (i4 != 0) {
                }
                if (i5 == 0) {
                }
                if ((i2 & 32) != 0) {
                }
                if (i6 != 0) {
                }
                if ((i2 & 128) != 0) {
                }
                if (i7 != 0) {
                }
                z5 = z8;
                paddingValues3 = m329PaddingValues0680j_4;
                horizontal4 = horizontal3;
                vertical3 = top;
                flingBehavior3 = flingBehavior2;
                startRestartGroup.endDefaults();
                int i1322 = i3 >> 3;
                Function2 rememberRowHeightSums22 = rememberRowHeightSums(rows, vertical3, paddingValues3, startRestartGroup, (i3 & 14) | ((i3 >> 15) & 112) | (i1322 & 896));
                int i1422 = (i1322 & 14) | 196608 | (i1322 & 112) | (i3 & 7168) | (57344 & i3) | (i1322 & 3670016) | (i1322 & 29360128) | ((i3 << 6) & 234881024) | ((i3 << 12) & 1879048192);
                int i1522 = (i3 >> 27) & 14;
                modifier3 = modifier2;
                lazyGridState4 = lazyGridState3;
                flingBehavior4 = flingBehavior3;
                z6 = z4;
                composer2 = startRestartGroup;
                LazyGridKt.LazyGrid(modifier3, lazyGridState4, rememberRowHeightSums22, paddingValues3, z5, false, flingBehavior4, z6, vertical3, horizontal4, content, startRestartGroup, i1422, i1522, 0);
                vertical4 = vertical3;
                z7 = z5;
                horizontal5 = horizontal4;
                paddingValues4 = paddingValues3;
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            paddingValues2 = paddingValues;
            i5 = i2 & 16;
            if (i5 != 0) {
            }
            z3 = z;
            if ((458752 & i) != 0) {
            }
            i6 = i2 & 64;
            if (i6 == 0) {
            }
            if ((i & 29360128) == 0) {
            }
            i7 = i2 & 256;
            if (i7 == 0) {
            }
            if ((i2 & 512) != 0) {
            }
            i3 |= i8;
            if ((1533916891 & i3) == 306783378) {
            }
            startRestartGroup.startDefaults();
            if ((i & 1) != 0) {
            }
            if (i12 != 0) {
            }
            if ((i2 & 4) != 0) {
            }
            if (i4 != 0) {
            }
            if (i5 == 0) {
            }
            if ((i2 & 32) != 0) {
            }
            if (i6 != 0) {
            }
            if ((i2 & 128) != 0) {
            }
            if (i7 != 0) {
            }
            z5 = z8;
            paddingValues3 = m329PaddingValues0680j_4;
            horizontal4 = horizontal3;
            vertical3 = top;
            flingBehavior3 = flingBehavior2;
            startRestartGroup.endDefaults();
            int i13222 = i3 >> 3;
            Function2 rememberRowHeightSums222 = rememberRowHeightSums(rows, vertical3, paddingValues3, startRestartGroup, (i3 & 14) | ((i3 >> 15) & 112) | (i13222 & 896));
            int i14222 = (i13222 & 14) | 196608 | (i13222 & 112) | (i3 & 7168) | (57344 & i3) | (i13222 & 3670016) | (i13222 & 29360128) | ((i3 << 6) & 234881024) | ((i3 << 12) & 1879048192);
            int i15222 = (i3 >> 27) & 14;
            modifier3 = modifier2;
            lazyGridState4 = lazyGridState3;
            flingBehavior4 = flingBehavior3;
            z6 = z4;
            composer2 = startRestartGroup;
            LazyGridKt.LazyGrid(modifier3, lazyGridState4, rememberRowHeightSums222, paddingValues3, z5, false, flingBehavior4, z6, vertical3, horizontal4, content, startRestartGroup, i14222, i15222, 0);
            vertical4 = vertical3;
            z7 = z5;
            horizontal5 = horizontal4;
            paddingValues4 = paddingValues3;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        if ((i & 896) == 0) {
        }
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        paddingValues2 = paddingValues;
        i5 = i2 & 16;
        if (i5 != 0) {
        }
        z3 = z;
        if ((458752 & i) != 0) {
        }
        i6 = i2 & 64;
        if (i6 == 0) {
        }
        if ((i & 29360128) == 0) {
        }
        i7 = i2 & 256;
        if (i7 == 0) {
        }
        if ((i2 & 512) != 0) {
        }
        i3 |= i8;
        if ((1533916891 & i3) == 306783378) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i12 != 0) {
        }
        if ((i2 & 4) != 0) {
        }
        if (i4 != 0) {
        }
        if (i5 == 0) {
        }
        if ((i2 & 32) != 0) {
        }
        if (i6 != 0) {
        }
        if ((i2 & 128) != 0) {
        }
        if (i7 != 0) {
        }
        z5 = z8;
        paddingValues3 = m329PaddingValues0680j_4;
        horizontal4 = horizontal3;
        vertical3 = top;
        flingBehavior3 = flingBehavior2;
        startRestartGroup.endDefaults();
        int i132222 = i3 >> 3;
        Function2 rememberRowHeightSums2222 = rememberRowHeightSums(rows, vertical3, paddingValues3, startRestartGroup, (i3 & 14) | ((i3 >> 15) & 112) | (i132222 & 896));
        int i142222 = (i132222 & 14) | 196608 | (i132222 & 112) | (i3 & 7168) | (57344 & i3) | (i132222 & 3670016) | (i132222 & 29360128) | ((i3 << 6) & 234881024) | ((i3 << 12) & 1879048192);
        int i152222 = (i3 >> 27) & 14;
        modifier3 = modifier2;
        lazyGridState4 = lazyGridState3;
        flingBehavior4 = flingBehavior3;
        z6 = z4;
        composer2 = startRestartGroup;
        LazyGridKt.LazyGrid(modifier3, lazyGridState4, rememberRowHeightSums2222, paddingValues3, z5, false, flingBehavior4, z6, vertical3, horizontal4, content, startRestartGroup, i142222, i152222, 0);
        vertical4 = vertical3;
        z7 = z5;
        horizontal5 = horizontal4;
        paddingValues4 = paddingValues3;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    private static final Function2 rememberColumnWidthSums(final GridCells gridCells, final Arrangement.Horizontal horizontal, final PaddingValues paddingValues, Composer composer, int i) {
        composer.startReplaceableGroup(-1355301804);
        composer.startReplaceableGroup(1618982084);
        boolean changed = composer.changed(gridCells) | composer.changed(horizontal) | composer.changed(paddingValues);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
            rememberedValue = new Function2() { // from class: androidx.compose.foundation.lazy.grid.LazyGridDslKt$rememberColumnWidthSums$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    return m451invoke0kLqBqw((Density) obj, ((Constraints) obj2).getValue());
                }

                @NotNull
                /* renamed from: invoke-0kLqBqw, reason: not valid java name */
                public final List<Integer> m451invoke0kLqBqw(@NotNull Density density, long j) {
                    Intrinsics.checkNotNullParameter(density, "$this$null");
                    if (Constraints.m2487getMaxWidthimpl(j) == Integer.MAX_VALUE) {
                        throw new IllegalArgumentException("LazyVerticalGrid's width should be bound by parent.");
                    }
                    PaddingValues paddingValues2 = PaddingValues.this;
                    LayoutDirection layoutDirection = LayoutDirection.Ltr;
                    List<Integer> mutableList = CollectionsKt.toMutableList((Collection) gridCells.calculateCrossAxisCellSizes(density, Constraints.m2487getMaxWidthimpl(j) - density.mo265roundToPx0680j_4(Dp.m2507constructorimpl(PaddingKt.calculateStartPadding(paddingValues2, layoutDirection) + PaddingKt.calculateEndPadding(PaddingValues.this, layoutDirection))), density.mo265roundToPx0680j_4(horizontal.getSpacing())));
                    int size = mutableList.size();
                    for (int i2 = 1; i2 < size; i2++) {
                        mutableList.set(i2, Integer.valueOf(mutableList.get(i2).intValue() + mutableList.get(i2 - 1).intValue()));
                    }
                    return mutableList;
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        Function2 function2 = (Function2) rememberedValue;
        composer.endReplaceableGroup();
        return function2;
    }

    private static final Function2 rememberRowHeightSums(final GridCells gridCells, final Arrangement.Vertical vertical, final PaddingValues paddingValues, Composer composer, int i) {
        composer.startReplaceableGroup(239683573);
        composer.startReplaceableGroup(1618982084);
        boolean changed = composer.changed(gridCells) | composer.changed(vertical) | composer.changed(paddingValues);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
            rememberedValue = new Function2() { // from class: androidx.compose.foundation.lazy.grid.LazyGridDslKt$rememberRowHeightSums$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    return m452invoke0kLqBqw((Density) obj, ((Constraints) obj2).getValue());
                }

                @NotNull
                /* renamed from: invoke-0kLqBqw, reason: not valid java name */
                public final List<Integer> m452invoke0kLqBqw(@NotNull Density density, long j) {
                    Intrinsics.checkNotNullParameter(density, "$this$null");
                    if (Constraints.m2486getMaxHeightimpl(j) != Integer.MAX_VALUE) {
                        List<Integer> mutableList = CollectionsKt.toMutableList((Collection) gridCells.calculateCrossAxisCellSizes(density, Constraints.m2486getMaxHeightimpl(j) - density.mo265roundToPx0680j_4(Dp.m2507constructorimpl(PaddingValues.this.getTop() + PaddingValues.this.getBottom())), density.mo265roundToPx0680j_4(vertical.getSpacing())));
                        int size = mutableList.size();
                        for (int i2 = 1; i2 < size; i2++) {
                            mutableList.set(i2, Integer.valueOf(mutableList.get(i2).intValue() + mutableList.get(i2 - 1).intValue()));
                        }
                        return mutableList;
                    }
                    throw new IllegalArgumentException("LazyHorizontalGrid's height should be bound by parent.");
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        Function2 function2 = (Function2) rememberedValue;
        composer.endReplaceableGroup();
        return function2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List calculateCellsCrossAxisSizeImpl(int i, int i2, int i3) {
        int i4 = i - (i3 * (i2 - 1));
        int i5 = i4 / i2;
        int i6 = i4 % i2;
        ArrayList arrayList = new ArrayList(i2);
        int i7 = 0;
        while (i7 < i2) {
            arrayList.add(Integer.valueOf((i7 < i6 ? 1 : 0) + i5));
            i7++;
        }
        return arrayList;
    }
}
