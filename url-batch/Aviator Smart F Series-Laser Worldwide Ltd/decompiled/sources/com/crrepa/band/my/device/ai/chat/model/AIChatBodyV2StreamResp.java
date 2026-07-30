package com.crrepa.band.my.device.ai.chat.model;

/* loaded from: classes2.dex */
public class AIChatBodyV2StreamResp {
    public Data data;
    public int ended;
    public int need_clear_history;
    public String path;
    public String qid;
    public String type;

    public static class Data {
        public String answer;
        public FunctionCall function_call;
        public int index;
        public String moduleErrInfo;
        public String part;
        public String trace_id;

        public static class FunctionCall {
        }
    }

    public boolean isEnded() {
        return this.ended == 1;
    }
}
