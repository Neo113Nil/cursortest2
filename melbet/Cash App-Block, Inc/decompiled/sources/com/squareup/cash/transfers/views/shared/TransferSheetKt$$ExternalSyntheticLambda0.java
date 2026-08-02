package com.squareup.cash.transfers.views.shared;

import androidx.compose.runtime.MutableState;
import com.squareup.cash.payments.presenters.PaymentRouterData;
import com.squareup.cash.recipients.viewmodels.SectionViewModel;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes6.dex */
public final /* synthetic */ class TransferSheetKt$$ExternalSyntheticLambda0 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ boolean f$0;
    public final /* synthetic */ MutableState f$1;
    public final /* synthetic */ MutableState f$2;

    public /* synthetic */ TransferSheetKt$$ExternalSyntheticLambda0(boolean z, MutableState mutableState, MutableState mutableState2, int i) {
        this.$r8$classId = i;
        this.f$0 = z;
        this.f$1 = mutableState;
        this.f$2 = mutableState2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x004d, code lost:
    
        if (r6 != false) goto L24;
     */
    @Override // kotlin.jvm.functions.Function0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke() {
        Object obj;
        List list;
        int i = this.$r8$classId;
        boolean z = true;
        MutableState mutableState = this.f$2;
        MutableState mutableState2 = this.f$1;
        boolean z2 = this.f$0;
        switch (i) {
            case 0:
                if ((!z2 || !((Boolean) mutableState2.getValue()).booleanValue()) && (z2 || !((Boolean) mutableState.getValue()).booleanValue())) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 1:
                if (z2) {
                    return Unit.INSTANCE;
                }
                mutableState2.setValue("");
                mutableState.setValue(Boolean.TRUE);
                return Unit.INSTANCE;
            default:
                if (!((Boolean) mutableState2.getValue()).booleanValue()) {
                    Iterator it = ((PaymentRouterData) mutableState.getValue()).sections.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            obj = it.next();
                            if (((SectionViewModel) obj).f1193type == SectionViewModel.Type.SUGGESTED) {
                            }
                        } else {
                            obj = null;
                        }
                    }
                    SectionViewModel sectionViewModel = (SectionViewModel) obj;
                    if (((sectionViewModel == null || (list = sectionViewModel.recipients) == null) ? 0 : list.size()) >= 5) {
                    }
                }
                z = false;
                return Boolean.valueOf(z);
        }
    }
}
