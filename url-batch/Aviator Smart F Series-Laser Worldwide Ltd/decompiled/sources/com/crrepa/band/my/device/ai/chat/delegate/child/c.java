package com.crrepa.band.my.device.ai.chat.delegate.child;

import android.util.Log;
import com.baidu.ar.util.SystemInfoUtil;
import com.baidu.mapapi.http.HttpClient;
import com.crrepa.band.my.device.ai.chat.x;
import com.crrepa.band.my.device.ai.debugmodel.f;
import com.my.lib.AFlash;
import com.my.lib.data.ErrorCode;
import com.my.lib.data.SubscriptionInfo;
import f6.p;
import f6.s;
import y5.w;

/* loaded from: classes2.dex */
public class c extends com.crrepa.band.my.device.ai.chat.delegate.c {
    protected String contentId = "";

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ w lambda$requestChatGPT$0(String str, x xVar, String str2, String str3, String str4, String str5, SubscriptionInfo subscriptionInfo) {
        String str6 = "onSuccess: " + str2 + SystemInfoUtil.COMMA + str3 + SystemInfoUtil.COMMA + str5 + "\n" + str4;
        Log.d("AFlash", str6);
        org.greenrobot.eventbus.c.getDefault().post(new f(str6));
        this.contentId = str5;
        Log.d("AIChat", this.currentQid + "========" + str);
        if (this.currentQid.equals(str)) {
            if (this.isStreamChat) {
                responseStream(str4, xVar);
            } else {
                setResponseEnded(true);
                this.wholeAnswer = str4;
                xVar.onEndedSuccess(str4);
            }
            return null;
        }
        Log.d("AIChat", this.currentQid + HttpClient.ENDFLAG + str + ",两个不同的qid");
        StringBuilder sb = new StringBuilder();
        sb.append("两个不同的qid，废弃的qid的answerJson：");
        sb.append(str6);
        Log.d("AIChat", sb.toString());
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ w lambda$requestChatGPT$1(String str, x xVar, String str2, ErrorCode errorCode) {
        String str3 = "errorCode: " + errorCode.getCode() + "，Message：" + errorCode.getMessage();
        Log.d("AFlash", str3);
        org.greenrobot.eventbus.c.getDefault().post(new f("chatResultStr=" + str3));
        com.crrepa.band.my.device.ai.helper.c.checkUnauthorized(errorCode.getCode());
        if (!this.currentQid.equals(str)) {
            return null;
        }
        setResponseEnded(true);
        xVar.onFail(Integer.parseInt(errorCode.getCode()), errorCode.getMessage());
        return null;
    }

    private void responseStream(String str, x xVar) {
        Log.d("AFlash", "responseStream=" + str);
        int length = str.length();
        int i8 = 0;
        while (i8 < length) {
            int min = Math.min(i8 + 3, length);
            String substring = str.substring(i8, min);
            String str2 = this.wholeAnswer + substring;
            this.wholeAnswer = str2;
            if (min >= length) {
                setResponseEnded(true);
                if (this.isFromWatch) {
                    xVar.onEndedSuccess(substring);
                    return;
                } else {
                    xVar.onEndedSuccess(this.wholeAnswer);
                    return;
                }
            }
            if (this.isFromWatch) {
                xVar.onSuccess(substring);
            } else {
                xVar.onSuccess(str2);
            }
            try {
                Thread.sleep(50L);
            } catch (InterruptedException unused) {
            }
            i8 = min;
        }
    }

    @Override // com.crrepa.band.my.device.ai.chat.delegate.c
    public void clearCurrentTopic() {
        this.contentId = "";
    }

    @Override // com.crrepa.band.my.device.ai.chat.delegate.c
    public void requestChatGPT(String str, final String str2, final x xVar) {
        Log.d("providerType", "艾闪");
        String currentLanguage = com.crrepa.band.my.device.ai.asr.b.getCurrentLanguage();
        String str3 = currentLanguage + ",,," + str + ",,,   currentQid：" + this.currentQid + ",,,   contentId：" + this.contentId;
        Log.d("AFlash", str3);
        org.greenrobot.eventbus.c.getDefault().post(new com.crrepa.band.my.device.ai.debugmodel.e(str3));
        AFlash.Companion.getInstance().textChat(com.moyoung.dafit.module.common.utils.d.get(), str2, com.crrepa.band.my.device.ai.helper.c.getWID(), str2, str, this.contentId, currentLanguage, new s() { // from class: com.crrepa.band.my.device.ai.chat.delegate.child.a
            @Override // f6.s
            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
                w lambda$requestChatGPT$0;
                lambda$requestChatGPT$0 = c.this.lambda$requestChatGPT$0(str2, xVar, (String) obj, (String) obj2, (String) obj3, (String) obj4, (SubscriptionInfo) obj5);
                return lambda$requestChatGPT$0;
            }
        }, new p() { // from class: com.crrepa.band.my.device.ai.chat.delegate.child.b
            @Override // f6.p
            public final Object invoke(Object obj, Object obj2) {
                w lambda$requestChatGPT$1;
                lambda$requestChatGPT$1 = c.this.lambda$requestChatGPT$1(str2, xVar, (String) obj, (ErrorCode) obj2);
                return lambda$requestChatGPT$1;
            }
        });
        com.crrepa.band.my.device.ai.helper.d.logChatEvent(this.isFromWatch);
    }
}
