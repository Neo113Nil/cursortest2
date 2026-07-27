package com.onesignal.inAppMessages.internal.display.impl;

import e5.g;
import f4.v;
import k4.InterfaceC1218d;
import l4.EnumC1260a;
import m4.e;
import m4.h;
import t4.InterfaceC1441l;

@e(c = "com.onesignal.inAppMessages.internal.display.impl.WebViewManager$calculateHeightAndShowWebViewAfterNewActivity$2$1", f = "WebViewManager.kt", l = {279}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class WebViewManager$calculateHeightAndShowWebViewAfterNewActivity$2$1 extends h implements InterfaceC1441l {
    final /* synthetic */ int $pagePxHeight;
    int label;
    final /* synthetic */ WebViewManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebViewManager$calculateHeightAndShowWebViewAfterNewActivity$2$1(WebViewManager webViewManager, int i2, InterfaceC1218d interfaceC1218d) {
        super(1, interfaceC1218d);
        this.this$0 = webViewManager;
        this.$pagePxHeight = i2;
    }

    @Override // m4.AbstractC1293a
    public final InterfaceC1218d create(InterfaceC1218d interfaceC1218d) {
        return new WebViewManager$calculateHeightAndShowWebViewAfterNewActivity$2$1(this.this$0, this.$pagePxHeight, interfaceC1218d);
    }

    @Override // m4.AbstractC1293a
    public final Object invokeSuspend(Object obj) {
        Object showMessageView;
        EnumC1260a enumC1260a = EnumC1260a.f11058a;
        int i2 = this.label;
        if (i2 == 0) {
            g.y(obj);
            WebViewManager webViewManager = this.this$0;
            Integer num = new Integer(this.$pagePxHeight);
            this.label = 1;
            showMessageView = webViewManager.showMessageView(num, this);
            if (showMessageView == enumC1260a) {
                return enumC1260a;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g.y(obj);
        }
        return v.f5689a;
    }

    @Override // t4.InterfaceC1441l
    public final Object invoke(InterfaceC1218d interfaceC1218d) {
        return ((WebViewManager$calculateHeightAndShowWebViewAfterNewActivity$2$1) create(interfaceC1218d)).invokeSuspend(v.f5689a);
    }
}
