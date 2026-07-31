package androidx.compose.foundation.lazy;

import androidx.compose.foundation.gestures.FlingBehavior;
import androidx.compose.foundation.gestures.ScrollableDefaults;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.chromium.net.NetError;
import org.jetbrains.annotations.Nullable;

/* compiled from: LazyDsl.kt */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001as\u0010\u0013\u001a\u00020\u00112\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\u00062\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000fH\u0007¢\u0006\u0004\b\u0013\u0010\u0014\u001as\u0010\u0019\u001a\u00020\u00112\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\u0016\u001a\u00020\u00152\b\b\u0002\u0010\u0018\u001a\u00020\u00172\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\u00062\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000fH\u0007¢\u0006\u0004\b\u0019\u0010\u001a\u001ai\u0010\u0019\u001a\u00020\u00112\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\u0016\u001a\u00020\u00152\b\b\u0002\u0010\u0018\u001a\u00020\u00172\b\b\u0002\u0010\r\u001a\u00020\f2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000fH\u0007¢\u0006\u0004\b\u0019\u0010\u001b\u001ai\u0010\u0013\u001a\u00020\u00112\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000fH\u0007¢\u0006\u0004\b\u0013\u0010\u001c¨\u0006\u001d"}, d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/foundation/lazy/LazyListState;", "state", "Landroidx/compose/foundation/layout/PaddingValues;", "contentPadding", "", "reverseLayout", "Landroidx/compose/foundation/layout/Arrangement$Horizontal;", "horizontalArrangement", "Landroidx/compose/ui/Alignment$Vertical;", "verticalAlignment", "Landroidx/compose/foundation/gestures/FlingBehavior;", "flingBehavior", "userScrollEnabled", "Lkotlin/Function1;", "Landroidx/compose/foundation/lazy/LazyListScope;", "", "content", "LazyRow", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/lazy/LazyListState;Landroidx/compose/foundation/layout/PaddingValues;ZLandroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/foundation/gestures/FlingBehavior;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Landroidx/compose/foundation/layout/Arrangement$Vertical;", "verticalArrangement", "Landroidx/compose/ui/Alignment$Horizontal;", "horizontalAlignment", "LazyColumn", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/lazy/LazyListState;Landroidx/compose/foundation/layout/PaddingValues;ZLandroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/foundation/gestures/FlingBehavior;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/lazy/LazyListState;Landroidx/compose/foundation/layout/PaddingValues;ZLandroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/foundation/gestures/FlingBehavior;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/lazy/LazyListState;Landroidx/compose/foundation/layout/PaddingValues;ZLandroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/foundation/gestures/FlingBehavior;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "foundation_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class LazyDslKt {
    /* JADX WARN: Removed duplicated region for block: B:100:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:57:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01b7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void LazyRow(Modifier modifier, LazyListState lazyListState, PaddingValues paddingValues, boolean z, Arrangement.Horizontal horizontal, Alignment.Vertical vertical, FlingBehavior flingBehavior, boolean z2, final Function1 content, Composer composer, final int i, final int i2) {
        int i3;
        int i4;
        boolean z3;
        Arrangement.Horizontal horizontal2;
        int i5;
        Alignment.Vertical vertical2;
        FlingBehavior flingBehavior2;
        int i6;
        LazyListState lazyListState2;
        Arrangement.Horizontal horizontal3;
        FlingBehavior flingBehavior3;
        boolean z4;
        Modifier modifier2;
        LazyListState lazyListState3;
        PaddingValues paddingValues2;
        boolean z5;
        Arrangement.Horizontal horizontal4;
        Alignment.Vertical vertical3;
        FlingBehavior flingBehavior4;
        Composer composer2;
        final Modifier modifier3;
        final LazyListState lazyListState4;
        final PaddingValues paddingValues3;
        final boolean z6;
        final Arrangement.Horizontal horizontal5;
        final Alignment.Vertical vertical4;
        final FlingBehavior flingBehavior5;
        final boolean z7;
        ScopeUpdateScope endRestartGroup;
        int i7;
        int i8;
        int i9;
        Intrinsics.checkNotNullParameter(content, "content");
        Composer startRestartGroup = composer.startRestartGroup(-1724297413);
        int i10 = i2 & 1;
        if (i10 != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (startRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 112) == 0) {
            if ((i2 & 2) == 0 && startRestartGroup.changed(lazyListState)) {
                i9 = 32;
                i3 |= i9;
            }
            i9 = 16;
            i3 |= i9;
        }
        int i11 = i2 & 4;
        if (i11 != 0) {
            i3 |= 384;
        } else if ((i & 896) == 0) {
            i3 |= startRestartGroup.changed(paddingValues) ? 256 : 128;
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 7168) == 0) {
                z3 = z;
                i3 |= startRestartGroup.changed(z3) ? 2048 : 1024;
                if ((57344 & i) == 0) {
                    if ((i2 & 16) == 0) {
                        horizontal2 = horizontal;
                        if (startRestartGroup.changed(horizontal2)) {
                            i8 = 16384;
                            i3 |= i8;
                        }
                    } else {
                        horizontal2 = horizontal;
                    }
                    i8 = 8192;
                    i3 |= i8;
                } else {
                    horizontal2 = horizontal;
                }
                i5 = i2 & 32;
                if (i5 != 0) {
                    i3 |= 196608;
                } else if ((i & 458752) == 0) {
                    vertical2 = vertical;
                    i3 |= startRestartGroup.changed(vertical2) ? 131072 : 65536;
                    if ((i & 3670016) != 0) {
                        flingBehavior2 = flingBehavior;
                        i3 |= ((i2 & 64) == 0 && startRestartGroup.changed(flingBehavior2)) ? 1048576 : 524288;
                    } else {
                        flingBehavior2 = flingBehavior;
                    }
                    i6 = i2 & 128;
                    if (i6 == 0) {
                        i3 |= 12582912;
                    } else if ((i & 29360128) == 0) {
                        i3 |= startRestartGroup.changed(z2) ? 8388608 : 4194304;
                    }
                    if ((i2 & 256) != 0) {
                        i7 = (234881024 & i) == 0 ? startRestartGroup.changed(content) ? 67108864 : 33554432 : 100663296;
                        if ((191739611 & i3) == 38347922 || !startRestartGroup.getSkipping()) {
                            startRestartGroup.startDefaults();
                            if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                                Modifier modifier4 = i10 != 0 ? Modifier.INSTANCE : modifier;
                                if ((i2 & 2) != 0) {
                                    lazyListState2 = LazyListStateKt.rememberLazyListState(0, 0, startRestartGroup, 0, 3);
                                    i3 &= NetError.ERR_SSL_VERSION_OR_CIPHER_MISMATCH;
                                } else {
                                    lazyListState2 = lazyListState;
                                }
                                PaddingValues m329PaddingValues0680j_4 = i11 != 0 ? PaddingKt.m329PaddingValues0680j_4(Dp.m2507constructorimpl(0)) : paddingValues;
                                boolean z8 = i4 == 0 ? z3 : false;
                                if ((i2 & 16) != 0) {
                                    Arrangement arrangement = Arrangement.INSTANCE;
                                    horizontal3 = !z8 ? arrangement.getStart() : arrangement.getEnd();
                                    i3 &= -57345;
                                } else {
                                    horizontal3 = horizontal2;
                                }
                                Alignment.Vertical top = i5 != 0 ? Alignment.INSTANCE.getTop() : vertical2;
                                if ((i2 & 64) != 0) {
                                    flingBehavior3 = ScrollableDefaults.INSTANCE.flingBehavior(startRestartGroup, 6);
                                    i3 &= -3670017;
                                } else {
                                    flingBehavior3 = flingBehavior2;
                                }
                                if (i6 != 0) {
                                    modifier2 = modifier4;
                                    z4 = true;
                                } else {
                                    z4 = z2;
                                    modifier2 = modifier4;
                                }
                                lazyListState3 = lazyListState2;
                                paddingValues2 = m329PaddingValues0680j_4;
                                z5 = z8;
                                horizontal4 = horizontal3;
                                vertical3 = top;
                                flingBehavior4 = flingBehavior3;
                            } else {
                                startRestartGroup.skipToGroupEnd();
                                if ((i2 & 2) != 0) {
                                    i3 &= NetError.ERR_SSL_VERSION_OR_CIPHER_MISMATCH;
                                }
                                if ((i2 & 16) != 0) {
                                    i3 &= -57345;
                                }
                                if ((i2 & 64) != 0) {
                                    i3 &= -3670017;
                                }
                                modifier2 = modifier;
                                lazyListState3 = lazyListState;
                                paddingValues2 = paddingValues;
                                z4 = z2;
                                z5 = z3;
                                horizontal4 = horizontal2;
                                flingBehavior4 = flingBehavior2;
                                vertical3 = vertical2;
                            }
                            startRestartGroup.endDefaults();
                            int i12 = i3 >> 3;
                            composer2 = startRestartGroup;
                            LazyListKt.LazyList(modifier2, lazyListState3, paddingValues2, z5, false, flingBehavior4, z4, null, null, vertical3, horizontal4, content, startRestartGroup, (i3 & 14) | 24576 | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (458752 & i12) | (i12 & 3670016) | ((i3 << 12) & 1879048192), ((i3 >> 12) & 14) | ((i3 >> 21) & 112), 384);
                            modifier3 = modifier2;
                            lazyListState4 = lazyListState3;
                            paddingValues3 = paddingValues2;
                            z6 = z5;
                            horizontal5 = horizontal4;
                            vertical4 = vertical3;
                            flingBehavior5 = flingBehavior4;
                            z7 = z4;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            modifier3 = modifier;
                            lazyListState4 = lazyListState;
                            paddingValues3 = paddingValues;
                            z6 = z3;
                            horizontal5 = horizontal2;
                            flingBehavior5 = flingBehavior2;
                            vertical4 = vertical2;
                            composer2 = startRestartGroup;
                            z7 = z2;
                        }
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup == null) {
                            return;
                        }
                        endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.foundation.lazy.LazyDslKt$LazyRow$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                invoke((Composer) obj, ((Number) obj2).intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@Nullable Composer composer3, int i13) {
                                LazyDslKt.LazyRow(Modifier.this, lazyListState4, paddingValues3, z6, horizontal5, vertical4, flingBehavior5, z7, content, composer3, i | 1, i2);
                            }
                        });
                        return;
                    }
                    i3 |= i7;
                    if ((191739611 & i3) == 38347922) {
                    }
                    startRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                    }
                    if (i10 != 0) {
                    }
                    if ((i2 & 2) != 0) {
                    }
                    if (i11 != 0) {
                    }
                    if (i4 == 0) {
                    }
                    if ((i2 & 16) != 0) {
                    }
                    if (i5 != 0) {
                    }
                    if ((i2 & 64) != 0) {
                    }
                    if (i6 != 0) {
                    }
                    lazyListState3 = lazyListState2;
                    paddingValues2 = m329PaddingValues0680j_4;
                    z5 = z8;
                    horizontal4 = horizontal3;
                    vertical3 = top;
                    flingBehavior4 = flingBehavior3;
                    startRestartGroup.endDefaults();
                    int i122 = i3 >> 3;
                    composer2 = startRestartGroup;
                    LazyListKt.LazyList(modifier2, lazyListState3, paddingValues2, z5, false, flingBehavior4, z4, null, null, vertical3, horizontal4, content, startRestartGroup, (i3 & 14) | 24576 | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (458752 & i122) | (i122 & 3670016) | ((i3 << 12) & 1879048192), ((i3 >> 12) & 14) | ((i3 >> 21) & 112), 384);
                    modifier3 = modifier2;
                    lazyListState4 = lazyListState3;
                    paddingValues3 = paddingValues2;
                    z6 = z5;
                    horizontal5 = horizontal4;
                    vertical4 = vertical3;
                    flingBehavior5 = flingBehavior4;
                    z7 = z4;
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup == null) {
                    }
                }
                vertical2 = vertical;
                if ((i & 3670016) != 0) {
                }
                i6 = i2 & 128;
                if (i6 == 0) {
                }
                if ((i2 & 256) != 0) {
                }
                i3 |= i7;
                if ((191739611 & i3) == 38347922) {
                }
                startRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                }
                if (i10 != 0) {
                }
                if ((i2 & 2) != 0) {
                }
                if (i11 != 0) {
                }
                if (i4 == 0) {
                }
                if ((i2 & 16) != 0) {
                }
                if (i5 != 0) {
                }
                if ((i2 & 64) != 0) {
                }
                if (i6 != 0) {
                }
                lazyListState3 = lazyListState2;
                paddingValues2 = m329PaddingValues0680j_4;
                z5 = z8;
                horizontal4 = horizontal3;
                vertical3 = top;
                flingBehavior4 = flingBehavior3;
                startRestartGroup.endDefaults();
                int i1222 = i3 >> 3;
                composer2 = startRestartGroup;
                LazyListKt.LazyList(modifier2, lazyListState3, paddingValues2, z5, false, flingBehavior4, z4, null, null, vertical3, horizontal4, content, startRestartGroup, (i3 & 14) | 24576 | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (458752 & i1222) | (i1222 & 3670016) | ((i3 << 12) & 1879048192), ((i3 >> 12) & 14) | ((i3 >> 21) & 112), 384);
                modifier3 = modifier2;
                lazyListState4 = lazyListState3;
                paddingValues3 = paddingValues2;
                z6 = z5;
                horizontal5 = horizontal4;
                vertical4 = vertical3;
                flingBehavior5 = flingBehavior4;
                z7 = z4;
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            z3 = z;
            if ((57344 & i) == 0) {
            }
            i5 = i2 & 32;
            if (i5 != 0) {
            }
            vertical2 = vertical;
            if ((i & 3670016) != 0) {
            }
            i6 = i2 & 128;
            if (i6 == 0) {
            }
            if ((i2 & 256) != 0) {
            }
            i3 |= i7;
            if ((191739611 & i3) == 38347922) {
            }
            startRestartGroup.startDefaults();
            if ((i & 1) != 0) {
            }
            if (i10 != 0) {
            }
            if ((i2 & 2) != 0) {
            }
            if (i11 != 0) {
            }
            if (i4 == 0) {
            }
            if ((i2 & 16) != 0) {
            }
            if (i5 != 0) {
            }
            if ((i2 & 64) != 0) {
            }
            if (i6 != 0) {
            }
            lazyListState3 = lazyListState2;
            paddingValues2 = m329PaddingValues0680j_4;
            z5 = z8;
            horizontal4 = horizontal3;
            vertical3 = top;
            flingBehavior4 = flingBehavior3;
            startRestartGroup.endDefaults();
            int i12222 = i3 >> 3;
            composer2 = startRestartGroup;
            LazyListKt.LazyList(modifier2, lazyListState3, paddingValues2, z5, false, flingBehavior4, z4, null, null, vertical3, horizontal4, content, startRestartGroup, (i3 & 14) | 24576 | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (458752 & i12222) | (i12222 & 3670016) | ((i3 << 12) & 1879048192), ((i3 >> 12) & 14) | ((i3 >> 21) & 112), 384);
            modifier3 = modifier2;
            lazyListState4 = lazyListState3;
            paddingValues3 = paddingValues2;
            z6 = z5;
            horizontal5 = horizontal4;
            vertical4 = vertical3;
            flingBehavior5 = flingBehavior4;
            z7 = z4;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        z3 = z;
        if ((57344 & i) == 0) {
        }
        i5 = i2 & 32;
        if (i5 != 0) {
        }
        vertical2 = vertical;
        if ((i & 3670016) != 0) {
        }
        i6 = i2 & 128;
        if (i6 == 0) {
        }
        if ((i2 & 256) != 0) {
        }
        i3 |= i7;
        if ((191739611 & i3) == 38347922) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i10 != 0) {
        }
        if ((i2 & 2) != 0) {
        }
        if (i11 != 0) {
        }
        if (i4 == 0) {
        }
        if ((i2 & 16) != 0) {
        }
        if (i5 != 0) {
        }
        if ((i2 & 64) != 0) {
        }
        if (i6 != 0) {
        }
        lazyListState3 = lazyListState2;
        paddingValues2 = m329PaddingValues0680j_4;
        z5 = z8;
        horizontal4 = horizontal3;
        vertical3 = top;
        flingBehavior4 = flingBehavior3;
        startRestartGroup.endDefaults();
        int i122222 = i3 >> 3;
        composer2 = startRestartGroup;
        LazyListKt.LazyList(modifier2, lazyListState3, paddingValues2, z5, false, flingBehavior4, z4, null, null, vertical3, horizontal4, content, startRestartGroup, (i3 & 14) | 24576 | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (458752 & i122222) | (i122222 & 3670016) | ((i3 << 12) & 1879048192), ((i3 >> 12) & 14) | ((i3 >> 21) & 112), 384);
        modifier3 = modifier2;
        lazyListState4 = lazyListState3;
        paddingValues3 = paddingValues2;
        z6 = z5;
        horizontal5 = horizontal4;
        vertical4 = vertical3;
        flingBehavior5 = flingBehavior4;
        z7 = z4;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:57:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01b8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void LazyColumn(Modifier modifier, LazyListState lazyListState, PaddingValues paddingValues, boolean z, Arrangement.Vertical vertical, Alignment.Horizontal horizontal, FlingBehavior flingBehavior, boolean z2, final Function1 content, Composer composer, final int i, final int i2) {
        int i3;
        int i4;
        boolean z3;
        Arrangement.Vertical vertical2;
        int i5;
        Alignment.Horizontal horizontal2;
        FlingBehavior flingBehavior2;
        int i6;
        LazyListState lazyListState2;
        Arrangement.Vertical vertical3;
        FlingBehavior flingBehavior3;
        boolean z4;
        Modifier modifier2;
        LazyListState lazyListState3;
        PaddingValues paddingValues2;
        boolean z5;
        Arrangement.Vertical vertical4;
        Alignment.Horizontal horizontal3;
        FlingBehavior flingBehavior4;
        Composer composer2;
        final Modifier modifier3;
        final LazyListState lazyListState4;
        final PaddingValues paddingValues3;
        final boolean z6;
        final Arrangement.Vertical vertical5;
        final Alignment.Horizontal horizontal4;
        final FlingBehavior flingBehavior5;
        final boolean z7;
        ScopeUpdateScope endRestartGroup;
        int i7;
        int i8;
        int i9;
        Intrinsics.checkNotNullParameter(content, "content");
        Composer startRestartGroup = composer.startRestartGroup(-740714857);
        int i10 = i2 & 1;
        if (i10 != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (startRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 112) == 0) {
            if ((i2 & 2) == 0 && startRestartGroup.changed(lazyListState)) {
                i9 = 32;
                i3 |= i9;
            }
            i9 = 16;
            i3 |= i9;
        }
        int i11 = i2 & 4;
        if (i11 != 0) {
            i3 |= 384;
        } else if ((i & 896) == 0) {
            i3 |= startRestartGroup.changed(paddingValues) ? 256 : 128;
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 7168) == 0) {
                z3 = z;
                i3 |= startRestartGroup.changed(z3) ? 2048 : 1024;
                if ((57344 & i) == 0) {
                    if ((i2 & 16) == 0) {
                        vertical2 = vertical;
                        if (startRestartGroup.changed(vertical2)) {
                            i8 = 16384;
                            i3 |= i8;
                        }
                    } else {
                        vertical2 = vertical;
                    }
                    i8 = 8192;
                    i3 |= i8;
                } else {
                    vertical2 = vertical;
                }
                i5 = i2 & 32;
                if (i5 != 0) {
                    i3 |= 196608;
                } else if ((i & 458752) == 0) {
                    horizontal2 = horizontal;
                    i3 |= startRestartGroup.changed(horizontal2) ? 131072 : 65536;
                    if ((i & 3670016) != 0) {
                        flingBehavior2 = flingBehavior;
                        i3 |= ((i2 & 64) == 0 && startRestartGroup.changed(flingBehavior2)) ? 1048576 : 524288;
                    } else {
                        flingBehavior2 = flingBehavior;
                    }
                    i6 = i2 & 128;
                    if (i6 == 0) {
                        i3 |= 12582912;
                    } else if ((i & 29360128) == 0) {
                        i3 |= startRestartGroup.changed(z2) ? 8388608 : 4194304;
                    }
                    if ((i2 & 256) != 0) {
                        i7 = (i & 234881024) == 0 ? startRestartGroup.changed(content) ? 67108864 : 33554432 : 100663296;
                        if ((191739611 & i3) == 38347922 || !startRestartGroup.getSkipping()) {
                            startRestartGroup.startDefaults();
                            if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                                Modifier modifier4 = i10 != 0 ? Modifier.INSTANCE : modifier;
                                if ((i2 & 2) != 0) {
                                    lazyListState2 = LazyListStateKt.rememberLazyListState(0, 0, startRestartGroup, 0, 3);
                                    i3 &= NetError.ERR_SSL_VERSION_OR_CIPHER_MISMATCH;
                                } else {
                                    lazyListState2 = lazyListState;
                                }
                                PaddingValues m329PaddingValues0680j_4 = i11 != 0 ? PaddingKt.m329PaddingValues0680j_4(Dp.m2507constructorimpl(0)) : paddingValues;
                                boolean z8 = i4 == 0 ? z3 : false;
                                if ((i2 & 16) != 0) {
                                    Arrangement arrangement = Arrangement.INSTANCE;
                                    vertical3 = !z8 ? arrangement.getTop() : arrangement.getBottom();
                                    i3 &= -57345;
                                } else {
                                    vertical3 = vertical2;
                                }
                                Alignment.Horizontal start = i5 != 0 ? Alignment.INSTANCE.getStart() : horizontal2;
                                if ((i2 & 64) != 0) {
                                    flingBehavior3 = ScrollableDefaults.INSTANCE.flingBehavior(startRestartGroup, 6);
                                    i3 &= -3670017;
                                } else {
                                    flingBehavior3 = flingBehavior2;
                                }
                                if (i6 != 0) {
                                    modifier2 = modifier4;
                                    z4 = true;
                                } else {
                                    z4 = z2;
                                    modifier2 = modifier4;
                                }
                                lazyListState3 = lazyListState2;
                                paddingValues2 = m329PaddingValues0680j_4;
                                z5 = z8;
                                vertical4 = vertical3;
                                horizontal3 = start;
                                flingBehavior4 = flingBehavior3;
                            } else {
                                startRestartGroup.skipToGroupEnd();
                                if ((i2 & 2) != 0) {
                                    i3 &= NetError.ERR_SSL_VERSION_OR_CIPHER_MISMATCH;
                                }
                                if ((i2 & 16) != 0) {
                                    i3 &= -57345;
                                }
                                if ((i2 & 64) != 0) {
                                    i3 &= -3670017;
                                }
                                modifier2 = modifier;
                                lazyListState3 = lazyListState;
                                paddingValues2 = paddingValues;
                                z4 = z2;
                                z5 = z3;
                                vertical4 = vertical2;
                                flingBehavior4 = flingBehavior2;
                                horizontal3 = horizontal2;
                            }
                            startRestartGroup.endDefaults();
                            int i12 = i3 >> 3;
                            composer2 = startRestartGroup;
                            LazyListKt.LazyList(modifier2, lazyListState3, paddingValues2, z5, true, flingBehavior4, z4, horizontal3, vertical4, null, null, content, startRestartGroup, (i3 & 14) | 24576 | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (458752 & i12) | (i12 & 3670016) | ((i3 << 6) & 29360128) | ((i3 << 12) & 234881024), (i3 >> 21) & 112, 1536);
                            modifier3 = modifier2;
                            lazyListState4 = lazyListState3;
                            paddingValues3 = paddingValues2;
                            z6 = z5;
                            vertical5 = vertical4;
                            horizontal4 = horizontal3;
                            flingBehavior5 = flingBehavior4;
                            z7 = z4;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            modifier3 = modifier;
                            lazyListState4 = lazyListState;
                            paddingValues3 = paddingValues;
                            z6 = z3;
                            vertical5 = vertical2;
                            flingBehavior5 = flingBehavior2;
                            horizontal4 = horizontal2;
                            composer2 = startRestartGroup;
                            z7 = z2;
                        }
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup == null) {
                            return;
                        }
                        endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.foundation.lazy.LazyDslKt$LazyColumn$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                invoke((Composer) obj, ((Number) obj2).intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@Nullable Composer composer3, int i13) {
                                LazyDslKt.LazyColumn(Modifier.this, lazyListState4, paddingValues3, z6, vertical5, horizontal4, flingBehavior5, z7, content, composer3, i | 1, i2);
                            }
                        });
                        return;
                    }
                    i3 |= i7;
                    if ((191739611 & i3) == 38347922) {
                    }
                    startRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                    }
                    if (i10 != 0) {
                    }
                    if ((i2 & 2) != 0) {
                    }
                    if (i11 != 0) {
                    }
                    if (i4 == 0) {
                    }
                    if ((i2 & 16) != 0) {
                    }
                    if (i5 != 0) {
                    }
                    if ((i2 & 64) != 0) {
                    }
                    if (i6 != 0) {
                    }
                    lazyListState3 = lazyListState2;
                    paddingValues2 = m329PaddingValues0680j_4;
                    z5 = z8;
                    vertical4 = vertical3;
                    horizontal3 = start;
                    flingBehavior4 = flingBehavior3;
                    startRestartGroup.endDefaults();
                    int i122 = i3 >> 3;
                    composer2 = startRestartGroup;
                    LazyListKt.LazyList(modifier2, lazyListState3, paddingValues2, z5, true, flingBehavior4, z4, horizontal3, vertical4, null, null, content, startRestartGroup, (i3 & 14) | 24576 | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (458752 & i122) | (i122 & 3670016) | ((i3 << 6) & 29360128) | ((i3 << 12) & 234881024), (i3 >> 21) & 112, 1536);
                    modifier3 = modifier2;
                    lazyListState4 = lazyListState3;
                    paddingValues3 = paddingValues2;
                    z6 = z5;
                    vertical5 = vertical4;
                    horizontal4 = horizontal3;
                    flingBehavior5 = flingBehavior4;
                    z7 = z4;
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup == null) {
                    }
                }
                horizontal2 = horizontal;
                if ((i & 3670016) != 0) {
                }
                i6 = i2 & 128;
                if (i6 == 0) {
                }
                if ((i2 & 256) != 0) {
                }
                i3 |= i7;
                if ((191739611 & i3) == 38347922) {
                }
                startRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                }
                if (i10 != 0) {
                }
                if ((i2 & 2) != 0) {
                }
                if (i11 != 0) {
                }
                if (i4 == 0) {
                }
                if ((i2 & 16) != 0) {
                }
                if (i5 != 0) {
                }
                if ((i2 & 64) != 0) {
                }
                if (i6 != 0) {
                }
                lazyListState3 = lazyListState2;
                paddingValues2 = m329PaddingValues0680j_4;
                z5 = z8;
                vertical4 = vertical3;
                horizontal3 = start;
                flingBehavior4 = flingBehavior3;
                startRestartGroup.endDefaults();
                int i1222 = i3 >> 3;
                composer2 = startRestartGroup;
                LazyListKt.LazyList(modifier2, lazyListState3, paddingValues2, z5, true, flingBehavior4, z4, horizontal3, vertical4, null, null, content, startRestartGroup, (i3 & 14) | 24576 | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (458752 & i1222) | (i1222 & 3670016) | ((i3 << 6) & 29360128) | ((i3 << 12) & 234881024), (i3 >> 21) & 112, 1536);
                modifier3 = modifier2;
                lazyListState4 = lazyListState3;
                paddingValues3 = paddingValues2;
                z6 = z5;
                vertical5 = vertical4;
                horizontal4 = horizontal3;
                flingBehavior5 = flingBehavior4;
                z7 = z4;
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            z3 = z;
            if ((57344 & i) == 0) {
            }
            i5 = i2 & 32;
            if (i5 != 0) {
            }
            horizontal2 = horizontal;
            if ((i & 3670016) != 0) {
            }
            i6 = i2 & 128;
            if (i6 == 0) {
            }
            if ((i2 & 256) != 0) {
            }
            i3 |= i7;
            if ((191739611 & i3) == 38347922) {
            }
            startRestartGroup.startDefaults();
            if ((i & 1) != 0) {
            }
            if (i10 != 0) {
            }
            if ((i2 & 2) != 0) {
            }
            if (i11 != 0) {
            }
            if (i4 == 0) {
            }
            if ((i2 & 16) != 0) {
            }
            if (i5 != 0) {
            }
            if ((i2 & 64) != 0) {
            }
            if (i6 != 0) {
            }
            lazyListState3 = lazyListState2;
            paddingValues2 = m329PaddingValues0680j_4;
            z5 = z8;
            vertical4 = vertical3;
            horizontal3 = start;
            flingBehavior4 = flingBehavior3;
            startRestartGroup.endDefaults();
            int i12222 = i3 >> 3;
            composer2 = startRestartGroup;
            LazyListKt.LazyList(modifier2, lazyListState3, paddingValues2, z5, true, flingBehavior4, z4, horizontal3, vertical4, null, null, content, startRestartGroup, (i3 & 14) | 24576 | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (458752 & i12222) | (i12222 & 3670016) | ((i3 << 6) & 29360128) | ((i3 << 12) & 234881024), (i3 >> 21) & 112, 1536);
            modifier3 = modifier2;
            lazyListState4 = lazyListState3;
            paddingValues3 = paddingValues2;
            z6 = z5;
            vertical5 = vertical4;
            horizontal4 = horizontal3;
            flingBehavior5 = flingBehavior4;
            z7 = z4;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        z3 = z;
        if ((57344 & i) == 0) {
        }
        i5 = i2 & 32;
        if (i5 != 0) {
        }
        horizontal2 = horizontal;
        if ((i & 3670016) != 0) {
        }
        i6 = i2 & 128;
        if (i6 == 0) {
        }
        if ((i2 & 256) != 0) {
        }
        i3 |= i7;
        if ((191739611 & i3) == 38347922) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i10 != 0) {
        }
        if ((i2 & 2) != 0) {
        }
        if (i11 != 0) {
        }
        if (i4 == 0) {
        }
        if ((i2 & 16) != 0) {
        }
        if (i5 != 0) {
        }
        if ((i2 & 64) != 0) {
        }
        if (i6 != 0) {
        }
        lazyListState3 = lazyListState2;
        paddingValues2 = m329PaddingValues0680j_4;
        z5 = z8;
        vertical4 = vertical3;
        horizontal3 = start;
        flingBehavior4 = flingBehavior3;
        startRestartGroup.endDefaults();
        int i122222 = i3 >> 3;
        composer2 = startRestartGroup;
        LazyListKt.LazyList(modifier2, lazyListState3, paddingValues2, z5, true, flingBehavior4, z4, horizontal3, vertical4, null, null, content, startRestartGroup, (i3 & 14) | 24576 | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (458752 & i122222) | (i122222 & 3670016) | ((i3 << 6) & 29360128) | ((i3 << 12) & 234881024), (i3 >> 21) & 112, 1536);
        modifier3 = modifier2;
        lazyListState4 = lazyListState3;
        paddingValues3 = paddingValues2;
        z6 = z5;
        vertical5 = vertical4;
        horizontal4 = horizontal3;
        flingBehavior5 = flingBehavior4;
        z7 = z4;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x00e6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void LazyColumn(Modifier modifier, LazyListState lazyListState, PaddingValues paddingValues, boolean z, Arrangement.Vertical vertical, Alignment.Horizontal horizontal, FlingBehavior flingBehavior, final Function1 content, Composer composer, final int i, final int i2) {
        int i3;
        PaddingValues paddingValues2;
        int i4;
        boolean z2;
        Arrangement.Vertical vertical2;
        int i5;
        Alignment.Horizontal horizontal2;
        FlingBehavior flingBehavior2;
        LazyListState lazyListState2;
        Modifier modifier2;
        LazyListState lazyListState3;
        FlingBehavior flingBehavior3;
        PaddingValues paddingValues3;
        boolean z3;
        final Modifier modifier3;
        final LazyListState lazyListState4;
        final PaddingValues paddingValues4;
        final boolean z4;
        final Arrangement.Vertical vertical3;
        final Alignment.Horizontal horizontal3;
        final FlingBehavior flingBehavior4;
        int i6;
        int i7;
        Intrinsics.checkNotNullParameter(content, "content");
        Composer startRestartGroup = composer.startRestartGroup(-563353797);
        int i8 = i2 & 1;
        if (i8 != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (startRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 112) == 0) {
            if ((i2 & 2) == 0 && startRestartGroup.changed(lazyListState)) {
                i7 = 32;
                i3 |= i7;
            }
            i7 = 16;
            i3 |= i7;
        }
        int i9 = i2 & 4;
        if (i9 != 0) {
            i3 |= 384;
        } else if ((i & 896) == 0) {
            paddingValues2 = paddingValues;
            i3 |= startRestartGroup.changed(paddingValues2) ? 256 : 128;
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 7168) == 0) {
                z2 = z;
                i3 |= startRestartGroup.changed(z2) ? 2048 : 1024;
                if ((i & 57344) == 0) {
                    if ((i2 & 16) == 0) {
                        vertical2 = vertical;
                        if (startRestartGroup.changed(vertical2)) {
                            i6 = 16384;
                            i3 |= i6;
                        }
                    } else {
                        vertical2 = vertical;
                    }
                    i6 = 8192;
                    i3 |= i6;
                } else {
                    vertical2 = vertical;
                }
                i5 = i2 & 32;
                if (i5 != 0) {
                    i3 |= 196608;
                    horizontal2 = horizontal;
                } else {
                    horizontal2 = horizontal;
                    if ((i & 458752) == 0) {
                        i3 |= startRestartGroup.changed(horizontal2) ? 131072 : 65536;
                    }
                }
                if ((i & 3670016) == 0) {
                    flingBehavior2 = flingBehavior;
                    i3 |= ((i2 & 64) == 0 && startRestartGroup.changed(flingBehavior2)) ? 1048576 : 524288;
                } else {
                    flingBehavior2 = flingBehavior;
                }
                if ((i2 & 128) != 0) {
                    i3 |= 12582912;
                } else if ((29360128 & i) == 0) {
                    i3 |= startRestartGroup.changed(content) ? 8388608 : 4194304;
                }
                if ((23967451 & i3) == 4793490 || !startRestartGroup.getSkipping()) {
                    startRestartGroup.startDefaults();
                    if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                        Modifier modifier4 = i8 != 0 ? Modifier.INSTANCE : modifier;
                        if ((i2 & 2) != 0) {
                            lazyListState2 = LazyListStateKt.rememberLazyListState(0, 0, startRestartGroup, 0, 3);
                            i3 &= NetError.ERR_SSL_VERSION_OR_CIPHER_MISMATCH;
                        } else {
                            lazyListState2 = lazyListState;
                        }
                        if (i9 != 0) {
                            paddingValues2 = PaddingKt.m329PaddingValues0680j_4(Dp.m2507constructorimpl(0));
                        }
                        if (i4 != 0) {
                            z2 = false;
                        }
                        if ((i2 & 16) != 0) {
                            Arrangement arrangement = Arrangement.INSTANCE;
                            i3 &= -57345;
                            vertical2 = !z2 ? arrangement.getTop() : arrangement.getBottom();
                        }
                        if (i5 != 0) {
                            horizontal2 = Alignment.INSTANCE.getStart();
                        }
                        if ((i2 & 64) != 0) {
                            i3 &= -3670017;
                            modifier2 = modifier4;
                            flingBehavior3 = ScrollableDefaults.INSTANCE.flingBehavior(startRestartGroup, 6);
                            lazyListState3 = lazyListState2;
                            paddingValues3 = paddingValues2;
                            z3 = z2;
                            Arrangement.Vertical vertical4 = vertical2;
                            Alignment.Horizontal horizontal4 = horizontal2;
                            startRestartGroup.endDefaults();
                            LazyColumn(modifier2, lazyListState3, paddingValues3, z3, vertical4, horizontal4, flingBehavior3, true, content, startRestartGroup, (i3 & 14) | 12582912 | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (57344 & i3) | (458752 & i3) | (i3 & 3670016) | (234881024 & (i3 << 3)), 0);
                            modifier3 = modifier2;
                            lazyListState4 = lazyListState3;
                            paddingValues4 = paddingValues3;
                            z4 = z3;
                            vertical3 = vertical4;
                            horizontal3 = horizontal4;
                            flingBehavior4 = flingBehavior3;
                        } else {
                            modifier2 = modifier4;
                            lazyListState3 = lazyListState2;
                        }
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        if ((i2 & 2) != 0) {
                            i3 &= NetError.ERR_SSL_VERSION_OR_CIPHER_MISMATCH;
                        }
                        if ((i2 & 16) != 0) {
                            i3 &= -57345;
                        }
                        if ((i2 & 64) != 0) {
                            i3 &= -3670017;
                        }
                        modifier2 = modifier;
                        lazyListState3 = lazyListState;
                    }
                    paddingValues3 = paddingValues2;
                    z3 = z2;
                    flingBehavior3 = flingBehavior2;
                    Arrangement.Vertical vertical42 = vertical2;
                    Alignment.Horizontal horizontal42 = horizontal2;
                    startRestartGroup.endDefaults();
                    LazyColumn(modifier2, lazyListState3, paddingValues3, z3, vertical42, horizontal42, flingBehavior3, true, content, startRestartGroup, (i3 & 14) | 12582912 | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (57344 & i3) | (458752 & i3) | (i3 & 3670016) | (234881024 & (i3 << 3)), 0);
                    modifier3 = modifier2;
                    lazyListState4 = lazyListState3;
                    paddingValues4 = paddingValues3;
                    z4 = z3;
                    vertical3 = vertical42;
                    horizontal3 = horizontal42;
                    flingBehavior4 = flingBehavior3;
                } else {
                    startRestartGroup.skipToGroupEnd();
                    modifier3 = modifier;
                    lazyListState4 = lazyListState;
                    paddingValues4 = paddingValues2;
                    z4 = z2;
                    flingBehavior4 = flingBehavior2;
                    vertical3 = vertical2;
                    horizontal3 = horizontal2;
                }
                ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
                    return;
                }
                endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.foundation.lazy.LazyDslKt$LazyColumn$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                        invoke((Composer) obj, ((Number) obj2).intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@Nullable Composer composer2, int i10) {
                        LazyDslKt.LazyColumn(Modifier.this, lazyListState4, paddingValues4, z4, vertical3, horizontal3, flingBehavior4, content, composer2, i | 1, i2);
                    }
                });
                return;
            }
            z2 = z;
            if ((i & 57344) == 0) {
            }
            i5 = i2 & 32;
            if (i5 != 0) {
            }
            if ((i & 3670016) == 0) {
            }
            if ((i2 & 128) != 0) {
            }
            if ((23967451 & i3) == 4793490) {
            }
            startRestartGroup.startDefaults();
            if ((i & 1) != 0) {
            }
            Modifier modifier42 = i8 != 0 ? Modifier.INSTANCE : modifier;
            if ((i2 & 2) != 0) {
            }
            if (i9 != 0) {
            }
            if (i4 != 0) {
            }
            if ((i2 & 16) != 0) {
            }
            if (i5 != 0) {
            }
            if ((i2 & 64) != 0) {
            }
        }
        paddingValues2 = paddingValues;
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        z2 = z;
        if ((i & 57344) == 0) {
        }
        i5 = i2 & 32;
        if (i5 != 0) {
        }
        if ((i & 3670016) == 0) {
        }
        if ((i2 & 128) != 0) {
        }
        if ((23967451 & i3) == 4793490) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        Modifier modifier422 = i8 != 0 ? Modifier.INSTANCE : modifier;
        if ((i2 & 2) != 0) {
        }
        if (i9 != 0) {
        }
        if (i4 != 0) {
        }
        if ((i2 & 16) != 0) {
        }
        if (i5 != 0) {
        }
        if ((i2 & 64) != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x00e6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void LazyRow(Modifier modifier, LazyListState lazyListState, PaddingValues paddingValues, boolean z, Arrangement.Horizontal horizontal, Alignment.Vertical vertical, FlingBehavior flingBehavior, final Function1 content, Composer composer, final int i, final int i2) {
        int i3;
        PaddingValues paddingValues2;
        int i4;
        boolean z2;
        Arrangement.Horizontal horizontal2;
        int i5;
        Alignment.Vertical vertical2;
        FlingBehavior flingBehavior2;
        LazyListState lazyListState2;
        Modifier modifier2;
        LazyListState lazyListState3;
        FlingBehavior flingBehavior3;
        PaddingValues paddingValues3;
        boolean z3;
        final Modifier modifier3;
        final LazyListState lazyListState4;
        final PaddingValues paddingValues4;
        final boolean z4;
        final Arrangement.Horizontal horizontal3;
        final Alignment.Vertical vertical3;
        final FlingBehavior flingBehavior4;
        int i6;
        int i7;
        Intrinsics.checkNotNullParameter(content, "content");
        Composer startRestartGroup = composer.startRestartGroup(407929823);
        int i8 = i2 & 1;
        if (i8 != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (startRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 112) == 0) {
            if ((i2 & 2) == 0 && startRestartGroup.changed(lazyListState)) {
                i7 = 32;
                i3 |= i7;
            }
            i7 = 16;
            i3 |= i7;
        }
        int i9 = i2 & 4;
        if (i9 != 0) {
            i3 |= 384;
        } else if ((i & 896) == 0) {
            paddingValues2 = paddingValues;
            i3 |= startRestartGroup.changed(paddingValues2) ? 256 : 128;
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 7168) == 0) {
                z2 = z;
                i3 |= startRestartGroup.changed(z2) ? 2048 : 1024;
                if ((i & 57344) == 0) {
                    if ((i2 & 16) == 0) {
                        horizontal2 = horizontal;
                        if (startRestartGroup.changed(horizontal2)) {
                            i6 = 16384;
                            i3 |= i6;
                        }
                    } else {
                        horizontal2 = horizontal;
                    }
                    i6 = 8192;
                    i3 |= i6;
                } else {
                    horizontal2 = horizontal;
                }
                i5 = i2 & 32;
                if (i5 != 0) {
                    i3 |= 196608;
                    vertical2 = vertical;
                } else {
                    vertical2 = vertical;
                    if ((i & 458752) == 0) {
                        i3 |= startRestartGroup.changed(vertical2) ? 131072 : 65536;
                    }
                }
                if ((i & 3670016) == 0) {
                    flingBehavior2 = flingBehavior;
                    i3 |= ((i2 & 64) == 0 && startRestartGroup.changed(flingBehavior2)) ? 1048576 : 524288;
                } else {
                    flingBehavior2 = flingBehavior;
                }
                if ((i2 & 128) != 0) {
                    i3 |= 12582912;
                } else if ((29360128 & i) == 0) {
                    i3 |= startRestartGroup.changed(content) ? 8388608 : 4194304;
                }
                if ((23967451 & i3) == 4793490 || !startRestartGroup.getSkipping()) {
                    startRestartGroup.startDefaults();
                    if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                        Modifier modifier4 = i8 != 0 ? Modifier.INSTANCE : modifier;
                        if ((i2 & 2) != 0) {
                            lazyListState2 = LazyListStateKt.rememberLazyListState(0, 0, startRestartGroup, 0, 3);
                            i3 &= NetError.ERR_SSL_VERSION_OR_CIPHER_MISMATCH;
                        } else {
                            lazyListState2 = lazyListState;
                        }
                        if (i9 != 0) {
                            paddingValues2 = PaddingKt.m329PaddingValues0680j_4(Dp.m2507constructorimpl(0));
                        }
                        if (i4 != 0) {
                            z2 = false;
                        }
                        if ((i2 & 16) != 0) {
                            Arrangement arrangement = Arrangement.INSTANCE;
                            i3 &= -57345;
                            horizontal2 = !z2 ? arrangement.getStart() : arrangement.getEnd();
                        }
                        if (i5 != 0) {
                            vertical2 = Alignment.INSTANCE.getTop();
                        }
                        if ((i2 & 64) != 0) {
                            i3 &= -3670017;
                            modifier2 = modifier4;
                            flingBehavior3 = ScrollableDefaults.INSTANCE.flingBehavior(startRestartGroup, 6);
                            lazyListState3 = lazyListState2;
                            paddingValues3 = paddingValues2;
                            z3 = z2;
                            Arrangement.Horizontal horizontal4 = horizontal2;
                            Alignment.Vertical vertical4 = vertical2;
                            startRestartGroup.endDefaults();
                            LazyRow(modifier2, lazyListState3, paddingValues3, z3, horizontal4, vertical4, flingBehavior3, true, content, startRestartGroup, (i3 & 14) | 12582912 | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (57344 & i3) | (458752 & i3) | (i3 & 3670016) | (234881024 & (i3 << 3)), 0);
                            modifier3 = modifier2;
                            lazyListState4 = lazyListState3;
                            paddingValues4 = paddingValues3;
                            z4 = z3;
                            horizontal3 = horizontal4;
                            vertical3 = vertical4;
                            flingBehavior4 = flingBehavior3;
                        } else {
                            modifier2 = modifier4;
                            lazyListState3 = lazyListState2;
                        }
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        if ((i2 & 2) != 0) {
                            i3 &= NetError.ERR_SSL_VERSION_OR_CIPHER_MISMATCH;
                        }
                        if ((i2 & 16) != 0) {
                            i3 &= -57345;
                        }
                        if ((i2 & 64) != 0) {
                            i3 &= -3670017;
                        }
                        modifier2 = modifier;
                        lazyListState3 = lazyListState;
                    }
                    paddingValues3 = paddingValues2;
                    z3 = z2;
                    flingBehavior3 = flingBehavior2;
                    Arrangement.Horizontal horizontal42 = horizontal2;
                    Alignment.Vertical vertical42 = vertical2;
                    startRestartGroup.endDefaults();
                    LazyRow(modifier2, lazyListState3, paddingValues3, z3, horizontal42, vertical42, flingBehavior3, true, content, startRestartGroup, (i3 & 14) | 12582912 | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (57344 & i3) | (458752 & i3) | (i3 & 3670016) | (234881024 & (i3 << 3)), 0);
                    modifier3 = modifier2;
                    lazyListState4 = lazyListState3;
                    paddingValues4 = paddingValues3;
                    z4 = z3;
                    horizontal3 = horizontal42;
                    vertical3 = vertical42;
                    flingBehavior4 = flingBehavior3;
                } else {
                    startRestartGroup.skipToGroupEnd();
                    modifier3 = modifier;
                    lazyListState4 = lazyListState;
                    paddingValues4 = paddingValues2;
                    z4 = z2;
                    flingBehavior4 = flingBehavior2;
                    horizontal3 = horizontal2;
                    vertical3 = vertical2;
                }
                ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
                    return;
                }
                endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.foundation.lazy.LazyDslKt$LazyRow$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                        invoke((Composer) obj, ((Number) obj2).intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@Nullable Composer composer2, int i10) {
                        LazyDslKt.LazyRow(Modifier.this, lazyListState4, paddingValues4, z4, horizontal3, vertical3, flingBehavior4, content, composer2, i | 1, i2);
                    }
                });
                return;
            }
            z2 = z;
            if ((i & 57344) == 0) {
            }
            i5 = i2 & 32;
            if (i5 != 0) {
            }
            if ((i & 3670016) == 0) {
            }
            if ((i2 & 128) != 0) {
            }
            if ((23967451 & i3) == 4793490) {
            }
            startRestartGroup.startDefaults();
            if ((i & 1) != 0) {
            }
            Modifier modifier42 = i8 != 0 ? Modifier.INSTANCE : modifier;
            if ((i2 & 2) != 0) {
            }
            if (i9 != 0) {
            }
            if (i4 != 0) {
            }
            if ((i2 & 16) != 0) {
            }
            if (i5 != 0) {
            }
            if ((i2 & 64) != 0) {
            }
        }
        paddingValues2 = paddingValues;
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        z2 = z;
        if ((i & 57344) == 0) {
        }
        i5 = i2 & 32;
        if (i5 != 0) {
        }
        if ((i & 3670016) == 0) {
        }
        if ((i2 & 128) != 0) {
        }
        if ((23967451 & i3) == 4793490) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        Modifier modifier422 = i8 != 0 ? Modifier.INSTANCE : modifier;
        if ((i2 & 2) != 0) {
        }
        if (i9 != 0) {
        }
        if (i4 != 0) {
        }
        if ((i2 & 16) != 0) {
        }
        if (i5 != 0) {
        }
        if ((i2 & 64) != 0) {
        }
    }
}
