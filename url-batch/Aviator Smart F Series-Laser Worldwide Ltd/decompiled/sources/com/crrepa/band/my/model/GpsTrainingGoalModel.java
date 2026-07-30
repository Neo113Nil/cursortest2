package com.crrepa.band.my.model;

/* loaded from: classes2.dex */
public class GpsTrainingGoalModel {
    private boolean checked;
    private String goal;
    private String hint;
    private float value;

    public GpsTrainingGoalModel(String str, String str2, float f8) {
        this.goal = str;
        this.hint = str2;
        this.value = f8;
    }

    public String getGoal() {
        return this.goal;
    }

    public String getHint() {
        return this.hint;
    }

    public float getValue() {
        return this.value;
    }

    public boolean isChecked() {
        return this.checked;
    }

    public void setChecked(boolean z7) {
        this.checked = z7;
    }

    public void setGoal(String str) {
        this.goal = str;
    }

    public void setHint(String str) {
        this.hint = str;
    }

    public void setValue(float f8) {
        this.value = f8;
    }
}
