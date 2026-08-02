package com.stripe.android.uicore.elements;

import androidx.camera.core.LegacySessionConfig;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.material3.DatePickerKt$$ExternalSyntheticLambda23;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.ValueInsets;
import com.squareup.cash.mooncake.compose_ui.ComposeMooncakeThemeKt;
import com.squareup.cash.mooncake.compose_ui.components.PushOnPressScope;
import com.stripe.hcaptcha.HCaptcha$$ExternalSyntheticLambda1;
import com.valentinilk.shimmer.ShimmerModifierKt$shimmer$1$1;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.Ref$IntRef;
import okhttp3.internal.http2.Http2Connection$$ExternalSyntheticLambda3;

/* loaded from: classes6.dex */
public final /* synthetic */ class DropdownFieldUIKt$$ExternalSyntheticLambda4 implements Function3 {
    public final /* synthetic */ int $r8$classId = 1;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ long f$1;
    public final /* synthetic */ Object f$2;
    public final /* synthetic */ Object f$3;
    public final /* synthetic */ Object f$4;
    public final /* synthetic */ Object f$5;

    public /* synthetic */ DropdownFieldUIKt$$ExternalSyntheticLambda4(Modifier modifier, Shape shape, long j, Function0 function0, Alignment alignment, ComposableLambdaImpl composableLambdaImpl) {
        this.f$0 = modifier;
        this.f$2 = shape;
        this.f$1 = j;
        this.f$3 = function0;
        this.f$4 = alignment;
        this.f$5 = composableLambdaImpl;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.$r8$classId;
        int i2 = 1;
        Object obj4 = this.f$5;
        Object obj5 = this.f$4;
        Object obj6 = this.f$3;
        Object obj7 = this.f$2;
        Object obj8 = this.f$0;
        switch (i) {
            case 0:
                List list = (List) obj8;
                LegacySessionConfig legacySessionConfig = (LegacySessionConfig) obj7;
                State state = (State) obj6;
                MutableState mutableState = (MutableState) obj5;
                ScrollState scrollState = (ScrollState) obj4;
                Composer composer = (Composer) obj2;
                int intValue = ((Integer) obj3).intValue();
                ((ColumnScope) obj).getClass();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 17) != 16)) {
                    Ref$IntRef ref$IntRef = new Ref$IntRef();
                    int i3 = 0;
                    for (Object obj9 : list) {
                        int i4 = i3 + 1;
                        if (i3 < 0) {
                            CollectionsKt__CollectionsKt.throwIndexOverflow();
                            throw null;
                        }
                        String str = (String) obj9;
                        Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
                        Integer num = (Integer) state.getValue();
                        ref$BooleanRef.element = i3 >= (num != null ? num.intValue() : -1) - i2 ? i2 : 0;
                        Integer num2 = (Integer) state.getValue();
                        if (num2 != null && i3 == num2.intValue()) {
                            gapComposer.startReplaceGroup(265540657);
                            Boolean bool = (Boolean) mutableState.getValue();
                            bool.booleanValue();
                            Updater.LaunchedEffect(gapComposer, bool, new ShimmerModifierKt$shimmer$1$1(scrollState, ref$IntRef, null, 22));
                        } else {
                            gapComposer.startReplaceGroup(258805566);
                        }
                        gapComposer.end(false);
                        Integer num3 = (Integer) state.getValue();
                        boolean z = num3 != null && i3 == num3.intValue();
                        Modifier onGloballyPositioned = ValueInsets.onGloballyPositioned(Modifier.Companion.$$INSTANCE, new HCaptcha$$ExternalSyntheticLambda1(2, ref$BooleanRef, ref$IntRef));
                        boolean changedInstance = gapComposer.changedInstance(legacySessionConfig) | gapComposer.changed(i3);
                        Object rememberedValue = gapComposer.rememberedValue();
                        if (changedInstance || rememberedValue == Composer.Companion.Empty) {
                            rememberedValue = new Http2Connection$$ExternalSyntheticLambda3(legacySessionConfig, i3, mutableState, 8);
                            gapComposer.updateRememberedValue(rememberedValue);
                        }
                        DropdownFieldUIKt.m4067DropdownMenuItemT042LqI(str, z, this.f$1, onGloballyPositioned, (Function0) rememberedValue, gapComposer, 0);
                        i3 = i4;
                        i2 = 1;
                    }
                } else {
                    gapComposer.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            default:
                Modifier modifier = (Modifier) obj8;
                Shape shape = (Shape) obj7;
                Function0 function0 = (Function0) obj6;
                Alignment alignment = (Alignment) obj5;
                ComposableLambdaImpl composableLambdaImpl = (ComposableLambdaImpl) obj4;
                PushOnPressScope pushOnPressScope = (PushOnPressScope) obj;
                Composer composer2 = (Composer) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                pushOnPressScope.getClass();
                if ((intValue2 & 6) == 0) {
                    intValue2 |= ((GapComposer) composer2).changed(pushOnPressScope) ? 4 : 2;
                }
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 19) != 18)) {
                    ComposeMooncakeThemeKt.MooncakeTheme(Expect_jvmKt.rememberComposableLambda(39075641, new DatePickerKt$$ExternalSyntheticLambda23(modifier, shape, this.f$1, function0, pushOnPressScope, alignment, composableLambdaImpl), gapComposer2), gapComposer2, 6);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ DropdownFieldUIKt$$ExternalSyntheticLambda4(ArrayList arrayList, long j, LegacySessionConfig legacySessionConfig, MutableState mutableState, MutableState mutableState2, ScrollState scrollState) {
        this.f$0 = arrayList;
        this.f$1 = j;
        this.f$2 = legacySessionConfig;
        this.f$3 = mutableState;
        this.f$4 = mutableState2;
        this.f$5 = scrollState;
    }
}
