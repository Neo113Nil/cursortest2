package com.squareup.cash.support.chat.views.transcript.message.compose;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes8.dex */
public final /* synthetic */ class MessageRetryKt$$ExternalSyntheticLambda13 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ String f$0;
    public final /* synthetic */ Function1 f$1;
    public final /* synthetic */ Function1 f$2;

    public /* synthetic */ MessageRetryKt$$ExternalSyntheticLambda13(String str, Function1 function1, Function1 function12, int i) {
        this.$r8$classId = i;
        this.f$0 = str;
        this.f$1 = function1;
        this.f$2 = function12;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$r8$classId;
        Function1 function1 = this.f$2;
        Function1 function12 = this.f$1;
        String str = this.f$0;
        switch (i) {
            case 0:
                if (str != null) {
                    function1.invoke(str);
                }
                function12.invoke(Boolean.FALSE);
                break;
            case 1:
                if (str != null) {
                    function1.invoke(str);
                }
                function12.invoke(Boolean.FALSE);
                break;
            case 2:
                if (str != null) {
                    function1.invoke(str);
                }
                function12.invoke(Boolean.FALSE);
                break;
            default:
                if (str != null) {
                    function1.invoke(str);
                }
                function12.invoke(Boolean.FALSE);
                break;
        }
        return Unit.INSTANCE;
    }
}
