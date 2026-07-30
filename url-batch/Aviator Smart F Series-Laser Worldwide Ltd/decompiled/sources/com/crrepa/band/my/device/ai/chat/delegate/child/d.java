package com.crrepa.band.my.device.ai.chat.delegate.child;

import android.util.Log;
import androidx.annotation.NonNull;
import com.artillery.ctc.CtHelper;
import com.artillery.ctc.base.ChatBodyRequest;
import com.artillery.ctc.base.ChatRequestBody;
import com.artillery.ctc.base.FunctionType;
import com.artillery.ctc.base.LargeModel;
import com.artillery.ctc.base.Msg;
import com.artillery.ctc.base.NetChatBody;
import com.artillery.ctc.interfaces.IChatCallback;
import com.artillery.ctc.interfaces.IResultCallback;
import com.baidu.mapapi.http.HttpClient;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.device.ai.chat.model.AIChatBodyOverseaResp;
import com.crrepa.band.my.device.ai.chat.model.AIChatBodyV2NotStreamResp;
import com.crrepa.band.my.device.ai.chat.model.AIChatBodyV2StreamResp;
import com.crrepa.band.my.device.ai.chat.model.AIChatErrorResp;
import com.crrepa.band.my.device.ai.chat.model.AIChatErrorResp2;
import com.crrepa.band.my.device.ai.chat.model.LimitedQueue;
import com.crrepa.band.my.device.ai.chat.x;
import com.crrepa.band.my.device.ai.debugmodel.f;
import com.crrepa.band.my.device.ai.helper.AIProvider;
import com.crrepa.band.my.device.ai.helper.g;
import com.google.gson.Gson;
import com.moyoung.dafit.module.common.utils.p;
import com.moyoung.dafit.module.common.utils.x0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* loaded from: classes2.dex */
public class d extends com.crrepa.band.my.device.ai.chat.delegate.c {
    public static final String DEFAULT_LARGE_MODEL_TYPE = "yiyan";
    private final LimitedQueue<ChatRequestBody.Messages> chatMsgLimitedQueue = new LimitedQueue<>(5);
    private ChatRequestBody.Messages currentQuestionMsg;

    class a implements IResultCallback {
        final /* synthetic */ x val$callback;
        final /* synthetic */ String val$qid;

        a(String str, x xVar) {
            this.val$qid = str;
            this.val$callback = xVar;
        }

        @Override // com.artillery.ctc.interfaces.IResultCallback
        public void onFail(@NonNull Integer num, @NonNull String str) {
            Log.d("AIChat", "onFail=" + num + HttpClient.ENDFLAG + str);
            org.greenrobot.eventbus.c.getDefault().post(new f(num.intValue(), str));
            if (((com.crrepa.band.my.device.ai.chat.delegate.c) d.this).currentQid.equals(this.val$qid)) {
                d.this.setResponseEnded(true);
                this.val$callback.onFail(num.intValue(), str);
            }
        }

        @Override // com.artillery.ctc.interfaces.IResultCallback
        public void onSuccess(@NonNull String str) {
            Log.d("AIChat", "onSuccess=" + str);
            org.greenrobot.eventbus.c.getDefault().post(new f(str + "\n         完整回复：" + ((com.crrepa.band.my.device.ai.chat.delegate.c) d.this).wholeAnswer));
            if (((com.crrepa.band.my.device.ai.chat.delegate.c) d.this).currentQid.equals(this.val$qid)) {
                Log.d("AIChat", ((com.crrepa.band.my.device.ai.chat.delegate.c) d.this).currentQid + "========" + this.val$qid);
                try {
                    d.this.dealProhibitionError(str, true, this.val$callback);
                    return;
                } catch (Exception unused) {
                    d.this.dealOverseaResp(str, this.val$callback);
                    return;
                }
            }
            Log.d("AIChat", ((com.crrepa.band.my.device.ai.chat.delegate.c) d.this).currentQid + HttpClient.ENDFLAG + this.val$qid + ",两个不同的qid");
            StringBuilder sb = new StringBuilder();
            sb.append("两个不同的qid，废弃的qid的answerJson：");
            sb.append(str);
            Log.d("AIChat", sb.toString());
        }
    }

    class b implements IChatCallback {
        final /* synthetic */ x val$callback;
        final /* synthetic */ String val$qid;

        b(String str, x xVar) {
            this.val$qid = str;
            this.val$callback = xVar;
        }

        @Override // com.artillery.ctc.interfaces.IChatFailCallback
        public void onFail(int i8, @NonNull String str) {
            Log.d("AIChat", "onFail=" + i8 + HttpClient.ENDFLAG + str);
            org.greenrobot.eventbus.c.getDefault().post(new f(i8, str));
            if (((com.crrepa.band.my.device.ai.chat.delegate.c) d.this).currentQid.equals(this.val$qid)) {
                d.this.setResponseEnded(true);
                this.val$callback.onFail(i8, str);
            }
        }

        @Override // com.artillery.ctc.interfaces.ISimpleCallback
        public void onSuccess(@NonNull String str) {
            Log.d("AIChat", "onSuccess=" + str);
            org.greenrobot.eventbus.c.getDefault().post(new f(str));
            if (((com.crrepa.band.my.device.ai.chat.delegate.c) d.this).currentQid.equals(this.val$qid)) {
                Log.d("AIChat", ((com.crrepa.band.my.device.ai.chat.delegate.c) d.this).currentQid + "========" + this.val$qid);
                try {
                    d.this.dealProhibitionError(str, false, this.val$callback);
                    return;
                } catch (Exception unused) {
                    d.this.dealBodyV2Resp(str, this.val$callback);
                    return;
                }
            }
            Log.d("AIChat", ((com.crrepa.band.my.device.ai.chat.delegate.c) d.this).currentQid + HttpClient.ENDFLAG + this.val$qid + ",两个不同的qid");
            StringBuilder sb = new StringBuilder();
            sb.append("两个不同的qid，废弃的qid的answerJson：");
            sb.append(str);
            Log.d("AIChat", sb.toString());
        }
    }

    private synchronized void addCurrentQuestionMsg(ChatRequestBody.Messages messages) {
        if (this.chatMsgLimitedQueue.getDeque().isEmpty()) {
            this.chatMsgLimitedQueue.add(messages);
            return;
        }
        if (com.moyoung.lib.ai.chat.b.ROLE_USER.equals(this.chatMsgLimitedQueue.getDeque().getLast().role)) {
            this.chatMsgLimitedQueue.getDeque().removeLast();
        }
        this.chatMsgLimitedQueue.add(messages);
    }

    private void chatWithBodyOverseas(String str, String str2, x xVar) {
        int i8 = this.isFromWatch ? this.isStreamChat ? 500 : 200 : 1000;
        ChatRequestBody.Oversea oversea = new ChatRequestBody.Oversea();
        oversea.prompt = str;
        ChatRequestBody.Messages messages = new ChatRequestBody.Messages(com.moyoung.lib.ai.chat.b.ROLE_USER, oversea.prompt);
        this.currentQuestionMsg = messages;
        addCurrentQuestionMsg(messages);
        oversea.max_tokens = Integer.valueOf(i8);
        oversea.language = g.getAISupportedLanguageCode();
        oversea.stream = Boolean.valueOf(this.isStreamChat);
        oversea.qid = str2;
        oversea.messages = getChatMsgOverseaList();
        oversea.enableSearch = Boolean.TRUE;
        NetChatBody netChatBody = new NetChatBody(str2, FunctionType.ST.ordinal(), oversea);
        Log.d("AIChat", "chatWithBodyOverseasNew-" + new Gson().toJson(netChatBody));
        org.greenrobot.eventbus.c.getDefault().post(new com.crrepa.band.my.device.ai.debugmodel.e(netChatBody));
        CtHelper.Companion.get().chatWithBodyOverseasNew(netChatBody, new a(str2, xVar));
    }

    private void chatWithBodyV2(String str, String str2, boolean z7, x xVar) {
        String str3;
        int i8 = this.isFromWatch ? this.isStreamChat ? 500 : 200 : 1000;
        ChatBodyRequest chatBodyRequest = new ChatBodyRequest();
        if (!this.isFromWatch || this.isStreamChat) {
            chatBodyRequest.prompt = str;
        } else {
            chatBodyRequest.prompt = str + "。回复内容控制在" + i8 + "字以内。";
        }
        ChatRequestBody.Messages messages = new ChatRequestBody.Messages(com.moyoung.lib.ai.chat.b.ROLE_USER, chatBodyRequest.prompt);
        this.currentQuestionMsg = messages;
        addCurrentQuestionMsg(messages);
        chatBodyRequest.qid = str2;
        chatBodyRequest.userId = p.getDeviceId(com.moyoung.dafit.module.common.utils.d.get());
        chatBodyRequest.stream = Boolean.valueOf(this.isStreamChat);
        chatBodyRequest.max_tokens = Integer.valueOf(i8);
        chatBodyRequest.messages = getChatMsgV2List();
        chatBodyRequest.online = true;
        LargeModel selectedLargeModel = AIProvider.getSelectedLargeModel();
        if (!z7 || selectedLargeModel == null || (str3 = selectedLargeModel.type) == null) {
            str3 = DEFAULT_LARGE_MODEL_TYPE;
        }
        chatBodyRequest.type = str3;
        Log.d("AIChat", "chatBodyRequest-" + new Gson().toJson(chatBodyRequest));
        org.greenrobot.eventbus.c.getDefault().post(new com.crrepa.band.my.device.ai.debugmodel.e(chatBodyRequest));
        CtHelper.Companion.get().chatWithBodyV2(chatBodyRequest, new b(str2, xVar));
    }

    private void dealBodyV2NotStreamResp(String str, x xVar) {
        AIChatBodyV2NotStreamResp.Rows rows;
        AIChatBodyV2NotStreamResp.Data data;
        try {
            AIChatBodyV2NotStreamResp aIChatBodyV2NotStreamResp = (AIChatBodyV2NotStreamResp) new Gson().fromJson(str, AIChatBodyV2NotStreamResp.class);
            if (aIChatBodyV2NotStreamResp == null || (rows = aIChatBodyV2NotStreamResp.rows) == null || (data = rows.data) == null || x0.isEmpty(data.answer)) {
                setResponseEnded(true);
                xVar.onFail(-1, getErrorAnswerTips() + "!!!!");
                removeCurrentQuestionMsg();
                return;
            }
            AIChatBodyV2NotStreamResp.Rows rows2 = aIChatBodyV2NotStreamResp.rows;
            if (rows2.need_clear_history != 1) {
                if (Objects.equals(this.currentQid, rows2.qid)) {
                    xVar.onEndedSuccess(rows2.data.answer);
                }
            } else {
                removeCurrentQuestionMsg();
                String inscriptionsErrorTips = getInscriptionsErrorTips();
                setResponseEnded(true);
                xVar.onEndedSuccess(inscriptionsErrorTips);
            }
        } catch (Exception unused) {
            setResponseEnded(true);
            xVar.onFail(-1, getErrorAnswerTips() + "!!!");
            removeCurrentQuestionMsg();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void dealBodyV2Resp(@NonNull String str, x xVar) {
        String replaceToDaGPT = replaceToDaGPT(str);
        Log.d("AIChat", "dealBodyV2Resp-" + replaceToDaGPT);
        if (x0.isEmpty(replaceToDaGPT)) {
            return;
        }
        if (this.isStreamChat) {
            dealBodyV2StreamResp(replaceToDaGPT, xVar);
        } else {
            dealBodyV2NotStreamResp(replaceToDaGPT, xVar);
        }
    }

    private void dealBodyV2StreamResp(String str, x xVar) {
        AIChatBodyV2StreamResp.Data data;
        try {
            AIChatBodyV2StreamResp aIChatBodyV2StreamResp = (AIChatBodyV2StreamResp) new Gson().fromJson(str, AIChatBodyV2StreamResp.class);
            if (aIChatBodyV2StreamResp == null || (data = aIChatBodyV2StreamResp.data) == null || x0.isEmpty(data.answer)) {
                return;
            }
            String str2 = aIChatBodyV2StreamResp.data.answer;
            if (aIChatBodyV2StreamResp.need_clear_history == 1) {
                removeCurrentQuestionMsg();
                String inscriptionsErrorTips = getInscriptionsErrorTips();
                setResponseEnded(true);
                xVar.onEndedSuccess(inscriptionsErrorTips);
                return;
            }
            if (Objects.equals(this.currentQid, aIChatBodyV2StreamResp.qid)) {
                if (x0.isEmpty(this.wholeAnswer)) {
                    this.chatMsgLimitedQueue.add(new ChatRequestBody.Messages(com.moyoung.lib.ai.chat.b.ROLE_ASSISTANT, str2));
                } else {
                    this.chatMsgLimitedQueue.getDeque().getLast().content = str2;
                }
                String substring = this.isFromWatch ? str2.substring(this.wholeAnswer.length()) : str2;
                if (aIChatBodyV2StreamResp.isEnded()) {
                    setResponseEnded(true);
                    xVar.onEndedSuccess(substring);
                } else {
                    xVar.onSuccess(substring);
                }
                this.wholeAnswer = str2;
            }
        } catch (Exception unused) {
            setResponseEnded(true);
            xVar.onFail(-1, getErrorAnswerTips() + "!!");
            removeCurrentQuestionMsg();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void dealOverseaResp(@NonNull String str, x xVar) {
        Log.d("AIChat", "dealOverseaResp-" + str);
        if (x0.isEmpty(str)) {
            return;
        }
        try {
            AIChatBodyOverseaResp aIChatBodyOverseaResp = (AIChatBodyOverseaResp) new Gson().fromJson(replaceToDaGPT(str), AIChatBodyOverseaResp.class);
            if (Objects.equals(this.currentQid, aIChatBodyOverseaResp.qid)) {
                if (x0.isEmpty(aIChatBodyOverseaResp.choices)) {
                    setResponseEnded(true);
                    return;
                }
                AIChatBodyOverseaResp.Choice choice = aIChatBodyOverseaResp.choices.get(0);
                setResponseEnded(choice.isEnded());
                if (choice.isEnded() && this.isStreamChat) {
                    if (this.isFromWatch) {
                        xVar.onEndedSuccess("");
                        return;
                    } else {
                        xVar.onEndedSuccess(this.wholeAnswer);
                        return;
                    }
                }
                String answer = choice.getAnswer();
                if (x0.isEmpty(answer)) {
                    return;
                }
                if (x0.isEmpty(this.wholeAnswer)) {
                    this.wholeAnswer = answer;
                    this.chatMsgLimitedQueue.add(new ChatRequestBody.Messages(com.moyoung.lib.ai.chat.b.ROLE_ASSISTANT, answer));
                } else {
                    ChatRequestBody.Messages last = this.chatMsgLimitedQueue.getDeque().getLast();
                    String str2 = this.wholeAnswer + answer;
                    this.wholeAnswer = str2;
                    last.content = str2;
                }
                if (this.isFromWatch) {
                    xVar.onSuccess(answer);
                } else {
                    xVar.onSuccess(this.wholeAnswer);
                }
            }
        } catch (Exception unused) {
            setResponseEnded(true);
            xVar.onFail(-1, getErrorAnswerTips() + "!");
            removeCurrentQuestionMsg();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0029, code lost:
    
        if ("500".equals(r6.error.status) != false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x004b, code lost:
    
        if ("500".equals(r6.status) != false) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void dealProhibitionError(String str, boolean z7, x xVar) {
        if (z7) {
            try {
                AIChatErrorResp2 aIChatErrorResp2 = (AIChatErrorResp2) new Gson().fromJson(str, AIChatErrorResp2.class);
                if (!"400".equals(aIChatErrorResp2.error.status)) {
                }
            } catch (Exception unused) {
                Log.d("dealProhibitionError", "dealProhibitionError = false");
            }
        } else {
            try {
                AIChatErrorResp aIChatErrorResp = (AIChatErrorResp) new Gson().fromJson(str, AIChatErrorResp.class);
                if (!"400".equals(aIChatErrorResp.status)) {
                }
            } catch (Exception unused2) {
                Log.d("dealProhibitionError", "dealProhibitionError = false");
            }
        }
        setResponseEnded(true);
        xVar.onEndedSuccess(getInscriptionsErrorTips());
        removeCurrentQuestionMsg();
        clearCurrentTopic();
        return;
        throw new Exception();
    }

    private synchronized List<ChatRequestBody.Messages> getChatMsgList() {
        List<ChatRequestBody.Messages> convertToList = this.chatMsgLimitedQueue.convertToList();
        if (x0.isEmpty(convertToList)) {
            return convertToList;
        }
        if (!com.moyoung.lib.ai.chat.b.ROLE_USER.equals(convertToList.get(0).role)) {
            convertToList.remove(0);
            this.chatMsgLimitedQueue.getDeque().removeFirst();
        }
        return convertToList;
    }

    private synchronized List<ChatRequestBody.Messages> getChatMsgOverseaList() {
        List<ChatRequestBody.Messages> chatMsgList;
        chatMsgList = getChatMsgList();
        if (chatMsgList.size() >= 1) {
            chatMsgList.remove(chatMsgList.size() - 1);
        }
        return chatMsgList;
    }

    private synchronized List<Msg> getChatMsgV2List() {
        ArrayList arrayList;
        try {
            List<ChatRequestBody.Messages> chatMsgList = getChatMsgList();
            arrayList = new ArrayList();
            for (ChatRequestBody.Messages messages : chatMsgList) {
                arrayList.add(new Msg(messages.role, messages.content));
            }
            if (arrayList.size() >= 1) {
                arrayList.remove(arrayList.size() - 1);
            }
        } catch (Throwable th) {
            throw th;
        }
        return arrayList;
    }

    @NonNull
    private static String getErrorAnswerTips() {
        return com.moyoung.dafit.module.common.utils.d.get().getResources().getString(R.string.ai_chat_answer_error);
    }

    @NonNull
    private static String getInscriptionsErrorTips() {
        return com.moyoung.dafit.module.common.utils.d.get().getResources().getString(R.string.ai_inscriptions_error_tips);
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x001b, code lost:
    
        r3.chatMsgLimitedQueue.getDeque().remove(r1);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private synchronized void removeCurrentQuestionMsg() {
        Iterator<ChatRequestBody.Messages> it = this.chatMsgLimitedQueue.getDeque().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            ChatRequestBody.Messages next = it.next();
            if (next == this.currentQuestionMsg) {
                break;
            }
        }
    }

    @NonNull
    private static String replaceToDaGPT(String str) {
        return str.replace("文心一言", "Da GPT").replace("ERNIE Bot", "Da GPT").replace("OpenAI", "Da GPT");
    }

    @Override // com.crrepa.band.my.device.ai.chat.delegate.c
    public void clearCurrentTopic() {
        this.chatMsgLimitedQueue.clear();
    }

    @Override // com.crrepa.band.my.device.ai.chat.delegate.c
    public void requestChatGPT(String str, String str2, x xVar) {
        if (com.crrepa.band.my.device.ai.helper.d.isMultipleMode()) {
            chatWithBodyV2(str, str2, true, xVar);
        } else if (CtHelper.Companion.get().isOverseas()) {
            chatWithBodyOverseas(str, str2, xVar);
        } else {
            chatWithBodyV2(str, str2, false, xVar);
        }
        com.crrepa.band.my.device.ai.helper.d.logChatEvent(this.isFromWatch);
    }
}
