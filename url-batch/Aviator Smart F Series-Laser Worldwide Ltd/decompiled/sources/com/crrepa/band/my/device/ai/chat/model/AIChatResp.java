package com.crrepa.band.my.device.ai.chat.model;

/* loaded from: classes2.dex */
public class AIChatResp {
    public Data data;
    public int ended;
    public int need_clear_history;
    public String path;
    public String qid;
    public String type;

    public static class Data {
        public String answer;
        public int anti_porn;
        public int index;
        public String part;
        public String trace_id;
    }

    public boolean isEnded() {
        return this.ended == 1;
    }
}
