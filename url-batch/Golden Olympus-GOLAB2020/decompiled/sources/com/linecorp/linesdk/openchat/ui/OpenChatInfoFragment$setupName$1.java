package com.linecorp.linesdk.openchat.ui;

import androidx.lifecycle.B;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

@Metadata
/* loaded from: classes2.dex */
/* synthetic */ class OpenChatInfoFragment$setupName$1 extends kotlin.jvm.internal.p implements Function1<String, Unit> {
    OpenChatInfoFragment$setupName$1(Object obj) {
        super(1, obj, B.class, "setValue", "setValue(Ljava/lang/Object;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((String) obj);
        return Unit.f41027a;
    }

    public final void invoke(String str) {
        ((B) this.receiver).o(str);
    }
}
