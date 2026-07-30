package com.crrepa.band.my.device.ai.chat.delegate.child;

import android.util.Log;
import com.baidu.mapapi.http.HttpClient;
import com.crrepa.band.my.device.ai.chat.x;
import com.moyoung.lib.ai.chat.d;
import com.moyoung.lib.ai.chat.f;

/* loaded from: classes2.dex */
public class e extends com.crrepa.band.my.device.ai.chat.delegate.c {

    class a implements f {
        final /* synthetic */ x val$callback;
        final /* synthetic */ String val$qid;

        a(String str, x xVar) {
            this.val$qid = str;
            this.val$callback = xVar;
        }

        @Override // com.moyoung.lib.ai.chat.f
        public void onError(String str) {
            String str2 = "error: " + str;
            Log.d("MoyAI", str2);
            org.greenrobot.eventbus.c.getDefault().post(new com.crrepa.band.my.device.ai.debugmodel.f("chatResultStr=" + str2));
            if (((com.crrepa.band.my.device.ai.chat.delegate.c) e.this).currentQid.equals(this.val$qid)) {
                e.this.setResponseEnded(true);
                this.val$callback.onFail(-1, str);
            }
        }

        @Override // com.moyoung.lib.ai.chat.f
        public void onNotStreamResponse(String str) {
            String str2 = "onSuccess: " + str;
            Log.d("MoyAI", str2);
            org.greenrobot.eventbus.c.getDefault().post(new com.crrepa.band.my.device.ai.debugmodel.f(str2));
            Log.d("AIChat", ((com.crrepa.band.my.device.ai.chat.delegate.c) e.this).currentQid + "========" + this.val$qid);
            if (((com.crrepa.band.my.device.ai.chat.delegate.c) e.this).currentQid.equals(this.val$qid)) {
                e.access$384(e.this, str);
                e.this.setResponseEnded(true);
                this.val$callback.onEndedSuccess(((com.crrepa.band.my.device.ai.chat.delegate.c) e.this).wholeAnswer);
                return;
            }
            Log.d("AIChat", ((com.crrepa.band.my.device.ai.chat.delegate.c) e.this).currentQid + HttpClient.ENDFLAG + this.val$qid + ",两个不同的qid");
            StringBuilder sb = new StringBuilder();
            sb.append("两个不同的qid，废弃的qid的answerJson：");
            sb.append(str2);
            Log.d("AIChat", sb.toString());
        }

        @Override // com.moyoung.lib.ai.chat.f
        public void onStreamComplete() {
            String str = "onComplete: " + ((com.crrepa.band.my.device.ai.chat.delegate.c) e.this).wholeAnswer;
            Log.d("MoyAI", str);
            org.greenrobot.eventbus.c.getDefault().post(new com.crrepa.band.my.device.ai.debugmodel.f(str));
            Log.d("AIChat", ((com.crrepa.band.my.device.ai.chat.delegate.c) e.this).currentQid + "========" + this.val$qid);
            if (((com.crrepa.band.my.device.ai.chat.delegate.c) e.this).currentQid.equals(this.val$qid)) {
                e.this.setResponseEnded(true);
                if (((com.crrepa.band.my.device.ai.chat.delegate.c) e.this).isFromWatch) {
                    this.val$callback.onEndedSuccess("");
                    return;
                } else {
                    this.val$callback.onEndedSuccess(((com.crrepa.band.my.device.ai.chat.delegate.c) e.this).wholeAnswer);
                    return;
                }
            }
            Log.d("AIChat", ((com.crrepa.band.my.device.ai.chat.delegate.c) e.this).currentQid + HttpClient.ENDFLAG + this.val$qid + ",两个不同的qid");
            StringBuilder sb = new StringBuilder();
            sb.append("两个不同的qid，废弃的qid的answerJson：");
            sb.append(str);
            Log.d("AIChat", sb.toString());
        }

        @Override // com.moyoung.lib.ai.chat.f
        public void onStreamResponse(String str) {
            String str2 = "onSuccess: " + str;
            Log.d("MoyAI", str2);
            org.greenrobot.eventbus.c.getDefault().post(new com.crrepa.band.my.device.ai.debugmodel.f(str2));
            Log.d("AIChat", ((com.crrepa.band.my.device.ai.chat.delegate.c) e.this).currentQid + "========" + this.val$qid);
            if (((com.crrepa.band.my.device.ai.chat.delegate.c) e.this).currentQid.equals(this.val$qid)) {
                e.access$884(e.this, str);
                if (((com.crrepa.band.my.device.ai.chat.delegate.c) e.this).isFromWatch) {
                    this.val$callback.onSuccess(str);
                    return;
                } else {
                    this.val$callback.onSuccess(((com.crrepa.band.my.device.ai.chat.delegate.c) e.this).wholeAnswer);
                    return;
                }
            }
            Log.d("AIChat", ((com.crrepa.band.my.device.ai.chat.delegate.c) e.this).currentQid + HttpClient.ENDFLAG + this.val$qid + ",两个不同的qid");
            StringBuilder sb = new StringBuilder();
            sb.append("两个不同的qid，废弃的qid的answerJson：");
            sb.append(str2);
            Log.d("AIChat", sb.toString());
        }
    }

    static /* synthetic */ String access$384(e eVar, Object obj) {
        String str = eVar.wholeAnswer + obj;
        eVar.wholeAnswer = str;
        return str;
    }

    static /* synthetic */ String access$884(e eVar, Object obj) {
        String str = eVar.wholeAnswer + obj;
        eVar.wholeAnswer = str;
        return str;
    }

    @Override // com.crrepa.band.my.device.ai.chat.delegate.c
    public void clearCurrentTopic() {
        com.moyoung.lib.ai.e.get().chat.clearCurrentTopic();
    }

    @Override // com.crrepa.band.my.device.ai.chat.delegate.c
    public void requestChatGPT(String str, String str2, x xVar) {
        Log.d("providerType", "魔样");
        int i8 = this.isFromWatch ? 200 : 500;
        String str3 = "question：" + str + "\ncurrentQid：" + this.currentQid;
        Log.d("MoyAI", str3);
        org.greenrobot.eventbus.c.getDefault().post(new com.crrepa.band.my.device.ai.debugmodel.e(str3));
        com.moyoung.lib.ai.e.get().chat.textToChat(new d.a().setPrompt(str).setIsStream(this.isStreamChat).setMaxTokens(i8).build(), new a(str2, xVar));
    }
}
