package com.stripe.android.financialconnections.navigation;

import androidx.compose.animation.AnimatedContentScopeImpl;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.navigation.NavBackStackEntry;
import com.stripe.android.financialconnections.navigation.bottomsheet.BottomSheetKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function4;
import radiography.Radiography$$ExternalSyntheticLambda1;

/* loaded from: classes8.dex */
public final /* synthetic */ class DestinationKt$$ExternalSyntheticLambda0 implements Function4 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Destination f$0;

    public /* synthetic */ DestinationKt$$ExternalSyntheticLambda0(Destination destination, int i) {
        this.$r8$classId = i;
        this.f$0 = destination;
    }

    @Override // kotlin.jvm.functions.Function4
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i = this.$r8$classId;
        Destination destination = this.f$0;
        switch (i) {
            case 0:
                NavBackStackEntry navBackStackEntry = (NavBackStackEntry) obj2;
                int intValue = ((Integer) obj4).intValue();
                ((AnimatedContentScopeImpl) obj).getClass();
                navBackStackEntry.getClass();
                destination.Composable(navBackStackEntry, (Composer) obj3, (intValue >> 3) & 14);
                break;
            default:
                NavBackStackEntry navBackStackEntry2 = (NavBackStackEntry) obj2;
                Composer composer = (Composer) obj3;
                int intValue2 = ((Integer) obj4).intValue();
                ((ColumnScope) obj).getClass();
                navBackStackEntry2.getClass();
                BottomSheetKt.LifecycleAwareContent(navBackStackEntry2, Expect_jvmKt.rememberComposableLambda(-1233877248, new Radiography$$ExternalSyntheticLambda1(24, destination, navBackStackEntry2), composer), composer, ((intValue2 >> 3) & 14) | 48);
                break;
        }
        return Unit.INSTANCE;
    }
}
