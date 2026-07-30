package com.crrepa.band.my.device.ai.chat.model;

import com.google.android.exoplayer2.source.rtsp.SessionDescription;
import java.util.List;

/* loaded from: classes2.dex */
public class AIChatBodyOverseaResp {
    public List<Choice> choices;
    public long created;
    public String id;
    public String model;
    public String object;
    public String qid;
    public String system_fingerprint;

    public static class Choice {
        public Delta delta;
        public String finish_reason;
        public int index;
        public String logprobs;
        public Message message;

        public String getAnswer() {
            Delta delta = this.delta;
            return delta != null ? delta.content : this.message.content;
        }

        public boolean isEnded() {
            return "stop".equals(this.finish_reason) || SessionDescription.ATTR_LENGTH.equals(this.finish_reason);
        }
    }

    public static class Delta {
        public String content;
    }

    public static class Message {
        public String content;
        public String role;
    }
}
