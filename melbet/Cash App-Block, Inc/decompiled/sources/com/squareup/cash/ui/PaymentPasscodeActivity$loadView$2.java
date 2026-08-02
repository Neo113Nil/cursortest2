package com.squareup.cash.ui;

import app.cash.broadway.presenter.Presenter;
import app.cash.broadway.ui.Ui;
import kotlin.Function;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final /* synthetic */ class PaymentPasscodeActivity$loadView$2 implements Ui.EventReceiver, FunctionAdapter {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Presenter.Binding $tmp0;

    public /* synthetic */ PaymentPasscodeActivity$loadView$2(Presenter.Binding binding, int i) {
        this.$r8$classId = i;
        this.$tmp0 = binding;
    }

    public final boolean equals(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                if ((obj instanceof Ui.EventReceiver) && (obj instanceof FunctionAdapter)) {
                    break;
                }
                break;
            default:
                if ((obj instanceof Ui.EventReceiver) && (obj instanceof FunctionAdapter)) {
                    break;
                }
                break;
        }
        return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
    }

    @Override // kotlin.jvm.internal.FunctionAdapter
    public final Function getFunctionDelegate() {
        switch (this.$r8$classId) {
        }
        return new FunctionReferenceImpl(1, 0, Presenter.Binding.class, this.$tmp0, "sendEvent", "sendEvent(Ljava/lang/Object;)V");
    }

    public final int hashCode() {
        switch (this.$r8$classId) {
        }
        return getFunctionDelegate().hashCode();
    }

    @Override // app.cash.broadway.ui.Ui.EventReceiver
    public final void sendEvent(Object obj) {
        int i = this.$r8$classId;
        Presenter.Binding binding = this.$tmp0;
        switch (i) {
            case 0:
                obj.getClass();
                binding.sendEvent(obj);
                break;
            default:
                binding.sendEvent(obj);
                break;
        }
    }
}
