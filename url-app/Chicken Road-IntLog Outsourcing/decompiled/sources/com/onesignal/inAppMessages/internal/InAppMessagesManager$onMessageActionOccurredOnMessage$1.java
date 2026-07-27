package com.onesignal.inAppMessages.internal;

import com.onesignal.inAppMessages.internal.prompt.impl.InAppMessagePrompt;
import e5.g;
import f4.v;
import java.util.List;
import k4.InterfaceC1218d;
import l4.EnumC1260a;
import m4.e;
import m4.h;
import t4.InterfaceC1441l;

@e(c = "com.onesignal.inAppMessages.internal.InAppMessagesManager$onMessageActionOccurredOnMessage$1", f = "InAppMessagesManager.kt", l = {801, 802, 804, 806}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class InAppMessagesManager$onMessageActionOccurredOnMessage$1 extends h implements InterfaceC1441l {
    final /* synthetic */ InAppMessageClickResult $action;
    final /* synthetic */ InAppMessage $message;
    int label;
    final /* synthetic */ InAppMessagesManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InAppMessagesManager$onMessageActionOccurredOnMessage$1(InAppMessageClickResult inAppMessageClickResult, InAppMessage inAppMessage, InAppMessagesManager inAppMessagesManager, InterfaceC1218d interfaceC1218d) {
        super(1, interfaceC1218d);
        this.$action = inAppMessageClickResult;
        this.$message = inAppMessage;
        this.this$0 = inAppMessagesManager;
    }

    @Override // m4.AbstractC1293a
    public final InterfaceC1218d create(InterfaceC1218d interfaceC1218d) {
        return new InAppMessagesManager$onMessageActionOccurredOnMessage$1(this.$action, this.$message, this.this$0, interfaceC1218d);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x008e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0070 A[RETURN] */
    @Override // m4.AbstractC1293a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object firePublicClickHandler;
        Object beginProcessingPrompts;
        Object fireRESTCallForClick;
        Object fireOutcomesForClick;
        EnumC1260a enumC1260a = EnumC1260a.f11058a;
        int i2 = this.label;
        if (i2 == 0) {
            g.y(obj);
            this.$action.setFirstClick(this.$message.takeActionAsUnique());
            InAppMessagesManager inAppMessagesManager = this.this$0;
            InAppMessage inAppMessage = this.$message;
            InAppMessageClickResult inAppMessageClickResult = this.$action;
            this.label = 1;
            firePublicClickHandler = inAppMessagesManager.firePublicClickHandler(inAppMessage, inAppMessageClickResult, this);
            if (firePublicClickHandler == enumC1260a) {
                return enumC1260a;
            }
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        if (i2 != 4) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        g.y(obj);
                        return v.f5689a;
                    }
                    g.y(obj);
                    this.this$0.fireTagCallForClick(this.$action);
                    InAppMessagesManager inAppMessagesManager2 = this.this$0;
                    String messageId = this.$message.getMessageId();
                    List<InAppMessageOutcome> outcomes = this.$action.getOutcomes();
                    this.label = 4;
                    fireOutcomesForClick = inAppMessagesManager2.fireOutcomesForClick(messageId, outcomes, this);
                    if (fireOutcomesForClick == enumC1260a) {
                        return enumC1260a;
                    }
                    return v.f5689a;
                }
                g.y(obj);
                this.this$0.fireClickAction(this.$action);
                InAppMessagesManager inAppMessagesManager3 = this.this$0;
                InAppMessage inAppMessage2 = this.$message;
                InAppMessageClickResult inAppMessageClickResult2 = this.$action;
                this.label = 3;
                fireRESTCallForClick = inAppMessagesManager3.fireRESTCallForClick(inAppMessage2, inAppMessageClickResult2, this);
                if (fireRESTCallForClick == enumC1260a) {
                    return enumC1260a;
                }
                this.this$0.fireTagCallForClick(this.$action);
                InAppMessagesManager inAppMessagesManager22 = this.this$0;
                String messageId2 = this.$message.getMessageId();
                List<InAppMessageOutcome> outcomes2 = this.$action.getOutcomes();
                this.label = 4;
                fireOutcomesForClick = inAppMessagesManager22.fireOutcomesForClick(messageId2, outcomes2, this);
                if (fireOutcomesForClick == enumC1260a) {
                }
                return v.f5689a;
            }
            g.y(obj);
        }
        InAppMessagesManager inAppMessagesManager4 = this.this$0;
        InAppMessage inAppMessage3 = this.$message;
        List<InAppMessagePrompt> prompts = this.$action.getPrompts();
        this.label = 2;
        beginProcessingPrompts = inAppMessagesManager4.beginProcessingPrompts(inAppMessage3, prompts, this);
        if (beginProcessingPrompts == enumC1260a) {
            return enumC1260a;
        }
        this.this$0.fireClickAction(this.$action);
        InAppMessagesManager inAppMessagesManager32 = this.this$0;
        InAppMessage inAppMessage22 = this.$message;
        InAppMessageClickResult inAppMessageClickResult22 = this.$action;
        this.label = 3;
        fireRESTCallForClick = inAppMessagesManager32.fireRESTCallForClick(inAppMessage22, inAppMessageClickResult22, this);
        if (fireRESTCallForClick == enumC1260a) {
        }
        this.this$0.fireTagCallForClick(this.$action);
        InAppMessagesManager inAppMessagesManager222 = this.this$0;
        String messageId22 = this.$message.getMessageId();
        List<InAppMessageOutcome> outcomes22 = this.$action.getOutcomes();
        this.label = 4;
        fireOutcomesForClick = inAppMessagesManager222.fireOutcomesForClick(messageId22, outcomes22, this);
        if (fireOutcomesForClick == enumC1260a) {
        }
        return v.f5689a;
    }

    @Override // t4.InterfaceC1441l
    public final Object invoke(InterfaceC1218d interfaceC1218d) {
        return ((InAppMessagesManager$onMessageActionOccurredOnMessage$1) create(interfaceC1218d)).invokeSuspend(v.f5689a);
    }
}
