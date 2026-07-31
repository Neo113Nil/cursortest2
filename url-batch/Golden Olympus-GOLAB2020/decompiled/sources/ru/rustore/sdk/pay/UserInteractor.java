package ru.rustore.sdk.pay;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.rustore.sdk.core.tasks.Task;
import ru.rustore.sdk.pay.internal.bk;
import ru.rustore.sdk.pay.internal.dh;
import ru.rustore.sdk.pay.internal.fn;
import ru.rustore.sdk.pay.internal.gn;
import ru.rustore.sdk.pay.internal.hn;
import ru.rustore.sdk.pay.internal.in;
import ru.rustore.sdk.pay.internal.jk;
import ru.rustore.sdk.pay.model.UserAuthorizationStatus;
import ru.rustore.sdk.reactive.single.SingleMapKt;
import ru.rustore.sdk.reactive.single.SingleOnErrorReturnKt;

@Metadata
/* loaded from: classes3.dex */
public final class UserInteractor {

    @NotNull
    private final in controller;

    public UserInteractor(@NotNull in controller) {
        Intrinsics.checkNotNullParameter(controller, "controller");
        this.controller = controller;
    }

    @NotNull
    public final Task<UserAuthorizationStatus> getUserAuthorizationStatus() {
        hn hnVar = this.controller.f44352a;
        bk bkVar = hnVar.f44295a;
        bkVar.getClass();
        return dh.a(SingleOnErrorReturnKt.onErrorReturn(SingleMapKt.map(bkVar.a(new jk(bkVar)), new fn(hnVar.f44296b)), gn.f44189a));
    }
}
