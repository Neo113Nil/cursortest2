package com.crrepa.band.my.device.ai.asr.model;

import java.util.List;

/* loaded from: classes2.dex */
public class AsrResp {
    public static final int SUCCESS_NO = 0;
    private String corpus_no;
    private String err_msg;
    private int err_no;
    private List<String> result;
    private String sn;

    public String getCorpus_no() {
        return this.corpus_no;
    }

    public String getErr_msg() {
        return this.err_msg;
    }

    public int getErr_no() {
        return this.err_no;
    }

    public List<String> getResult() {
        return this.result;
    }

    public String getSn() {
        return this.sn;
    }

    public void setCorpus_no(String str) {
        this.corpus_no = str;
    }

    public void setErr_msg(String str) {
        this.err_msg = str;
    }

    public void setErr_no(int i8) {
        this.err_no = i8;
    }

    public void setResult(List<String> list) {
        this.result = list;
    }

    public void setSn(String str) {
        this.sn = str;
    }
}
