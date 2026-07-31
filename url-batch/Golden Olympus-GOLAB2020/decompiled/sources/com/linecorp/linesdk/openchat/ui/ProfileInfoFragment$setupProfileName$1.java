package com.linecorp.linesdk.openchat.ui;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
final class ProfileInfoFragment$setupProfileName$1 extends kotlin.jvm.internal.s implements Function1<String, Unit> {
    final /* synthetic */ ProfileInfoFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ProfileInfoFragment$setupProfileName$1(ProfileInfoFragment profileInfoFragment) {
        super(1);
        this.this$0 = profileInfoFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((String) obj);
        return Unit.f41027a;
    }

    public final void invoke(@NotNull String name) {
        OpenChatInfoViewModel openChatInfoViewModel;
        Intrinsics.checkNotNullParameter(name, "name");
        openChatInfoViewModel = this.this$0.viewModel;
        if (openChatInfoViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            openChatInfoViewModel = null;
        }
        openChatInfoViewModel.getProfileName().o(name);
    }
}
