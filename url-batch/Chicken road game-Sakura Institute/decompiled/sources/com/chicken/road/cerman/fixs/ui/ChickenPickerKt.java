package com.chicken.road.cerman.fixs.ui;

import androidx.compose.material3.ExposedDropdownMenu_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import com.chicken.road.cerman.fixs.data.Chicken;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ChickenPicker.kt */
@Metadata(d1 = {"\u0000,\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u001aO\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0014\u0010\u0007\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0004\u0012\u00020\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\fH\u0007¢\u0006\u0002\u0010\r¨\u0006\u000e²\u0006\n\u0010\u000f\u001a\u00020\nX\u008a\u008e\u0002"}, d2 = {"ChickenPicker", "", "chickens", "", "Lcom/chicken/road/cerman/fixs/data/Chicken;", "selectedId", "", "onPick", "Lkotlin/Function1;", "allowNone", "", "label", "", "(Ljava/util/List;Ljava/lang/Long;Lkotlin/jvm/functions/Function1;ZLjava/lang/String;Landroidx/compose/runtime/Composer;II)V", "app_release", "expanded"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ChickenPickerKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ChickenPicker$lambda$6(List list, Long l, Function1 function1, boolean z, String str, int i, int i2, Composer composer, int i3) {
        ChickenPicker(list, l, function1, z, str, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0113 A[EDGE_INSN: B:68:0x0113->B:50:0x0113 BREAK  A[LOOP:0: B:41:0x00f6->B:66:0x00f6], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0084  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ChickenPicker(final List<Chicken> chickens, final Long l, final Function1<? super Long, Unit> onPick, boolean z, String str, Composer composer, final int i, final int i2) {
        int i3;
        final boolean z2;
        int i4;
        String str2;
        boolean z3;
        Object rememberedValue;
        Iterator<T> it;
        Chicken chicken;
        String str3;
        Object rememberedValue2;
        Composer composer2;
        final String str4;
        ScopeUpdateScope endRestartGroup;
        Intrinsics.checkNotNullParameter(chickens, "chickens");
        Intrinsics.checkNotNullParameter(onPick, "onPick");
        Composer startRestartGroup = composer.startRestartGroup(-1944628642);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(chickens) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(l) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= startRestartGroup.changedInstance(onPick) ? 256 : 128;
        }
        int i5 = i2 & 8;
        if (i5 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            z2 = z;
            i3 |= startRestartGroup.changed(z2) ? 2048 : 1024;
            i4 = i2 & 16;
            if (i4 == 0) {
                i3 |= 24576;
            } else if ((i & 24576) == 0) {
                str2 = str;
                i3 |= startRestartGroup.changed(str2) ? 16384 : 8192;
                if ((i3 & 9363) == 9362 || !startRestartGroup.getSkipping()) {
                    z3 = i5 != 0 ? true : z2;
                    String str5 = i4 != 0 ? "Chicken" : str2;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1944628642, i3, -1, "com.chicken.road.cerman.fixs.ui.ChickenPicker (ChickenPicker.kt:27)");
                    }
                    startRestartGroup.startReplaceGroup(-1038791905);
                    rememberedValue = startRestartGroup.rememberedValue();
                    Object obj = null;
                    if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                        rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
                        startRestartGroup.updateRememberedValue(rememberedValue);
                    }
                    final MutableState mutableState = (MutableState) rememberedValue;
                    startRestartGroup.endReplaceGroup();
                    it = chickens.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        Object next = it.next();
                        long id = ((Chicken) next).getId();
                        if (l != null && id == l.longValue()) {
                            obj = next;
                            break;
                        }
                    }
                    chicken = (Chicken) obj;
                    if (chicken != null || (str3 = chicken.getName()) == null) {
                        str3 = z3 ? "Whole flock" : "Pick chicken";
                    }
                    String str6 = str3;
                    boolean ChickenPicker$lambda$1 = ChickenPicker$lambda$1(mutableState);
                    startRestartGroup.startReplaceGroup(-1038783851);
                    rememberedValue2 = startRestartGroup.rememberedValue();
                    if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        rememberedValue2 = new Function1() { // from class: com.chicken.road.cerman.fixs.ui.ChickenPickerKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                Unit ChickenPicker$lambda$5$lambda$4;
                                ChickenPicker$lambda$5$lambda$4 = ChickenPickerKt.ChickenPicker$lambda$5$lambda$4(MutableState.this, ((Boolean) obj2).booleanValue());
                                return ChickenPicker$lambda$5$lambda$4;
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue2);
                    }
                    startRestartGroup.endReplaceGroup();
                    composer2 = startRestartGroup;
                    ExposedDropdownMenu_androidKt.ExposedDropdownMenuBox(ChickenPicker$lambda$1, (Function1) rememberedValue2, null, ComposableLambdaKt.rememberComposableLambda(-1531652620, true, new ChickenPickerKt$ChickenPicker$2(str6, str5, mutableState, z3, onPick, chickens), startRestartGroup, 54), startRestartGroup, 3120, 4);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z2 = z3;
                    str4 = str5;
                } else {
                    startRestartGroup.skipToGroupEnd();
                    str4 = str2;
                    composer2 = startRestartGroup;
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.updateScope(new Function2() { // from class: com.chicken.road.cerman.fixs.ui.ChickenPickerKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj2, Object obj3) {
                            Unit ChickenPicker$lambda$6;
                            ChickenPicker$lambda$6 = ChickenPickerKt.ChickenPicker$lambda$6(chickens, l, onPick, z2, str4, i, i2, (Composer) obj2, ((Integer) obj3).intValue());
                            return ChickenPicker$lambda$6;
                        }
                    });
                    return;
                }
                return;
            }
            str2 = str;
            if ((i3 & 9363) == 9362) {
            }
            if (i5 != 0) {
            }
            if (i4 != 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            startRestartGroup.startReplaceGroup(-1038791905);
            rememberedValue = startRestartGroup.rememberedValue();
            Object obj2 = null;
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
            }
            final MutableState mutableState2 = (MutableState) rememberedValue;
            startRestartGroup.endReplaceGroup();
            it = chickens.iterator();
            while (true) {
                if (!it.hasNext()) {
                }
            }
            chicken = (Chicken) obj2;
            if (chicken != null) {
            }
            if (z3) {
            }
            String str62 = str3;
            boolean ChickenPicker$lambda$12 = ChickenPicker$lambda$1(mutableState2);
            startRestartGroup.startReplaceGroup(-1038783851);
            rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
            }
            startRestartGroup.endReplaceGroup();
            composer2 = startRestartGroup;
            ExposedDropdownMenu_androidKt.ExposedDropdownMenuBox(ChickenPicker$lambda$12, (Function1) rememberedValue2, null, ComposableLambdaKt.rememberComposableLambda(-1531652620, true, new ChickenPickerKt$ChickenPicker$2(str62, str5, mutableState2, z3, onPick, chickens), startRestartGroup, 54), startRestartGroup, 3120, 4);
            if (ComposerKt.isTraceInProgress()) {
            }
            z2 = z3;
            str4 = str5;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        z2 = z;
        i4 = i2 & 16;
        if (i4 == 0) {
        }
        str2 = str;
        if ((i3 & 9363) == 9362) {
        }
        if (i5 != 0) {
        }
        if (i4 != 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        startRestartGroup.startReplaceGroup(-1038791905);
        rememberedValue = startRestartGroup.rememberedValue();
        Object obj22 = null;
        if (rememberedValue == Composer.INSTANCE.getEmpty()) {
        }
        final MutableState mutableState22 = (MutableState) rememberedValue;
        startRestartGroup.endReplaceGroup();
        it = chickens.iterator();
        while (true) {
            if (!it.hasNext()) {
            }
        }
        chicken = (Chicken) obj22;
        if (chicken != null) {
        }
        if (z3) {
        }
        String str622 = str3;
        boolean ChickenPicker$lambda$122 = ChickenPicker$lambda$1(mutableState22);
        startRestartGroup.startReplaceGroup(-1038783851);
        rememberedValue2 = startRestartGroup.rememberedValue();
        if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
        }
        startRestartGroup.endReplaceGroup();
        composer2 = startRestartGroup;
        ExposedDropdownMenu_androidKt.ExposedDropdownMenuBox(ChickenPicker$lambda$122, (Function1) rememberedValue2, null, ComposableLambdaKt.rememberComposableLambda(-1531652620, true, new ChickenPickerKt$ChickenPicker$2(str622, str5, mutableState22, z3, onPick, chickens), startRestartGroup, 54), startRestartGroup, 3120, 4);
        if (ComposerKt.isTraceInProgress()) {
        }
        z2 = z3;
        str4 = str5;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean ChickenPicker$lambda$1(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ChickenPicker$lambda$2(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ChickenPicker$lambda$5$lambda$4(MutableState mutableState, boolean z) {
        ChickenPicker$lambda$2(mutableState, !ChickenPicker$lambda$1(mutableState));
        return Unit.INSTANCE;
    }
}
