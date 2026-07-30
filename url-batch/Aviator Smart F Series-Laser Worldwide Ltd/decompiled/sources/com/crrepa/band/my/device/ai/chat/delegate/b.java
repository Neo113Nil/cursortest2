package com.crrepa.band.my.device.ai.chat.delegate;

import android.util.Log;
import androidx.annotation.NonNull;
import cn.hutool.core.text.l;
import com.crrepa.band.my.ble.band.cmd.i4;
import com.crrepa.band.my.device.ai.chat.model.HisiliconErrorCode;
import com.crrepa.band.my.device.ai.chat.x;
import com.crrepa.band.my.device.ai.helper.AIProvider;
import com.crrepa.band.my.device.ai.helper.d;
import com.crrepa.ble.conn.type.CRPChatErrorCode;

/* loaded from: classes2.dex */
public class b {
    private int answerIndex;
    private final c chatDelegate;
    private final com.crrepa.band.my.device.ai.chat.delegate.a chatManager;
    private String unSendAnswer;

    class a implements x {
        a() {
        }

        @Override // com.crrepa.band.my.device.ai.chat.x
        public void onEndedSuccess(@NonNull String str) {
            Log.d("AIChat", "onEndedSuccess=" + str);
            if (com.crrepa.band.my.ble.band.utils.a.getInstance().isHisilicon()) {
                b.access$184(b.this, str);
                Log.d("AIChat", "onEndedSuccess-ForWatch-unSendAnswer-" + b.this.unSendAnswer);
                i4.getInstance().sendHisiliconChatResponse(b.this.unSendAnswer);
                b.this.unSendAnswer = "";
                return;
            }
            if (!b.this.chatDelegate.isStreamChat) {
                i4.getInstance().sendChatResponse(str);
                return;
            }
            b.access$184(b.this, str);
            b.access$208(b.this);
            Log.d("AIChat", "onEndedSuccess-ForWatch-unSendAnswer-" + b.this.unSendAnswer + "，answerIndex=" + b.this.answerIndex);
            i4.getInstance().sendChatResponse(b.this.unSendAnswer, b.this.answerIndex, true);
            b.this.unSendAnswer = "";
        }

        @Override // com.crrepa.band.my.device.ai.chat.x
        public void onFail(int i8, @NonNull String str) {
            Log.d("AIChat", "onFail-ForWatch-" + str);
            b.this.setResponseEnded(true);
            if (com.crrepa.band.my.ble.band.utils.a.getInstance().isHisilicon()) {
                i4.getInstance().sendHisiliconChatError(HisiliconErrorCode.AI_SERVER_BUSY);
            } else {
                i4.getInstance().sendChatError(CRPChatErrorCode.SERVER_BUSY_ERROR);
            }
        }

        @Override // com.crrepa.band.my.device.ai.chat.x
        public void onSuccess(@NonNull String str) {
            Log.d("AIChat", "onSuccess-ForWatch-answer-" + str);
            Log.d("AIChat", "onSuccess-ForWatch-wholeAnswer-" + b.this.chatDelegate.wholeAnswer);
            String replaceAll = str.replace("*", l.SPACE).replace("#", l.SPACE).replaceAll("\n+", "\n");
            Log.d("AIChat", "onSuccess-ForWatch-answer-filtered-" + replaceAll);
            if (com.crrepa.band.my.ble.band.utils.a.getInstance().isHisilicon()) {
                b.access$184(b.this, replaceAll);
                if (b.this.unSendAnswer.length() > 20) {
                    Log.d("AIChat", "onSuccess-ForWatch-unSendAnswer-" + b.this.unSendAnswer);
                    i4.getInstance().sendHisiliconChatResponse(b.this.unSendAnswer);
                    b.this.unSendAnswer = "";
                    return;
                }
                return;
            }
            if (!b.this.chatDelegate.isStreamChat) {
                i4.getInstance().sendChatResponse(replaceAll);
                return;
            }
            b.access$184(b.this, replaceAll);
            if (b.this.unSendAnswer.length() > 20) {
                b.access$208(b.this);
                Log.d("AIChat", "onSuccess-ForWatch-unSendAnswer-" + b.this.unSendAnswer + "，answerIndex=" + b.this.answerIndex);
                i4.getInstance().sendChatResponse(b.this.unSendAnswer, b.this.answerIndex, false);
                b.this.unSendAnswer = "";
            }
        }
    }

    public b() {
        com.crrepa.band.my.device.ai.chat.delegate.a aVar = new com.crrepa.band.my.device.ai.chat.delegate.a();
        this.chatManager = aVar;
        this.chatDelegate = aVar.getChatDelegate();
        this.unSendAnswer = "";
    }

    static /* synthetic */ String access$184(b bVar, Object obj) {
        String str = bVar.unSendAnswer + obj;
        bVar.unSendAnswer = str;
        return str;
    }

    static /* synthetic */ int access$208(b bVar) {
        int i8 = bVar.answerIndex;
        bVar.answerIndex = i8 + 1;
        return i8;
    }

    public String getWholeAnswer() {
        return this.chatDelegate.getWholeAnswer();
    }

    public void requestChatGPTForWatch(String str) {
        c cVar = this.chatDelegate;
        cVar.isFromWatch = true;
        cVar.isStreamChat = AIProvider.isStreamChat();
        this.unSendAnswer = "";
        this.answerIndex = 0;
        if (d.isUnauthorizedAndShowTips()) {
            setResponseEnded(true);
        }
        this.chatManager.requestChatGPT(str, new a());
    }

    public void resetQid() {
        this.chatDelegate.currentQid = "";
        this.unSendAnswer = "";
    }

    public void setResponseEnded(boolean z7) {
        this.chatDelegate.setResponseEnded(z7);
    }
}
