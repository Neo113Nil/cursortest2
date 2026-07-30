package com.baidu.mapapi.walknavi.model;

/* loaded from: classes2.dex */
public class WalkSimpleMapInfo {
    private int distToNextGP;
    private String nextRouteName;
    private boolean nextStepTurnMsg;
    private int paragraphLength;

    public int getDistToNextGP() {
        return this.distToNextGP;
    }

    public String getNextRouteName() {
        return this.nextRouteName;
    }

    public int getParagraphLength() {
        return this.paragraphLength;
    }

    public boolean isNextStepTurnMsg() {
        return this.nextStepTurnMsg;
    }

    public void setDistToNextGP(int i8) {
        this.distToNextGP = i8;
    }

    public void setNextRouteName(String str) {
        this.nextRouteName = str;
    }

    public void setNextStepTurnMsg(boolean z7) {
        this.nextStepTurnMsg = z7;
    }

    public void setParagraphLength(int i8) {
        this.paragraphLength = i8;
    }
}
