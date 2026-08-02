package com.squareup.cash.support.views.article;

import androidx.compose.runtime.MutableState;
import androidx.compose.ui.layout.LayoutCoordinates;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes7.dex */
public final /* synthetic */ class ArticleViewKt$$ExternalSyntheticLambda26 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Function0 f$0;
    public final /* synthetic */ MutableState f$1;

    public /* synthetic */ ArticleViewKt$$ExternalSyntheticLambda26(Function0 function0, MutableState mutableState, int i) {
        this.$r8$classId = i;
        this.f$0 = function0;
        this.f$1 = mutableState;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.$r8$classId;
        MutableState mutableState = this.f$1;
        Function0 function0 = this.f$0;
        switch (i) {
            case 0:
                LayoutCoordinates layoutCoordinates = (LayoutCoordinates) obj;
                layoutCoordinates.getClass();
                if (((int) (layoutCoordinates.mo838getSizeYbymL2g() & BodyPartID.bodyIdMax)) > 0 && !((Boolean) mutableState.getValue()).booleanValue()) {
                    mutableState.setValue(Boolean.TRUE);
                    function0.invoke();
                }
                break;
            default:
                ((Long) obj).longValue();
                mutableState.setValue(Boolean.TRUE);
                function0.invoke();
                break;
        }
        return Unit.INSTANCE;
    }
}
