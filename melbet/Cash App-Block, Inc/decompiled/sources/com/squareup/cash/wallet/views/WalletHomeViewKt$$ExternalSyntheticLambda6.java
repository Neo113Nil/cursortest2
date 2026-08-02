package com.squareup.cash.wallet.views;

import androidx.compose.runtime.MutableState;
import com.squareup.cash.work.views.clockin.ClockInSheetMode;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes7.dex */
public final /* synthetic */ class WalletHomeViewKt$$ExternalSyntheticLambda6 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ MutableState f$0;

    public /* synthetic */ WalletHomeViewKt$$ExternalSyntheticLambda6(int i, MutableState mutableState) {
        this.$r8$classId = i;
        this.f$0 = mutableState;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$r8$classId;
        MutableState mutableState = this.f$0;
        switch (i) {
            case 0:
                mutableState.setValue(Boolean.FALSE);
                break;
            case 1:
                Boolean bool = (Boolean) mutableState.getValue();
                bool.booleanValue();
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                Boolean bool2 = (Boolean) mutableState.getValue();
                bool2.getClass();
                break;
            case 7:
                mutableState.setValue(Boolean.TRUE);
                break;
            case 8:
                Boolean bool3 = (Boolean) mutableState.getValue();
                bool3.getClass();
                break;
            case 9:
                mutableState.setValue(ClockInSheetMode.JobPicker);
                break;
            case 10:
                mutableState.setValue(ClockInSheetMode.LocationPicker);
                break;
            case 11:
                mutableState.setValue(Boolean.FALSE);
                break;
            case 12:
                mutableState.setValue(Boolean.FALSE);
                break;
            case 13:
                ((Function0) mutableState.getValue()).invoke();
                break;
            case 14:
                mutableState.setValue(Boolean.valueOf(!((Boolean) mutableState.getValue()).booleanValue()));
                break;
            case 15:
                mutableState.setValue(Boolean.FALSE);
                break;
            case 16:
                mutableState.setValue(Boolean.FALSE);
                break;
            case 17:
                mutableState.setValue(Boolean.TRUE);
                break;
            case 18:
                mutableState.setValue(Boolean.TRUE);
                break;
            case 19:
                mutableState.setValue(Boolean.FALSE);
                break;
            case 20:
                mutableState.setValue(Boolean.TRUE);
                break;
            case 21:
                mutableState.setValue(Boolean.TRUE);
                break;
            default:
                mutableState.setValue(Boolean.FALSE);
                break;
        }
        return Unit.INSTANCE;
    }
}
