package com.crrepa.band.my.health.ecg.alg;

import java.util.List;

/* loaded from: classes2.dex */
public class c {
    private int averageHeartRate;
    private int diagnosisType;
    private List<Integer> ecgList;
    private int fatigue;
    private int heartLoad;
    private boolean heartRateFast;
    private boolean heartRateMisaligned;
    private boolean heartRateSlow;
    private int heartRateStop;
    private int heartRateStrength;
    private int leakage;
    private int mentalStress;
    private int prematureBeat;

    public int getAverageHeartRate() {
        return this.averageHeartRate;
    }

    public int getDiagnosisType() {
        return this.diagnosisType;
    }

    public List<Integer> getEcgList() {
        return this.ecgList;
    }

    public int getFatigue() {
        return this.fatigue;
    }

    public int getHeartLoad() {
        return this.heartLoad;
    }

    public int getHeartRateStop() {
        return this.heartRateStop;
    }

    public int getHeartRateStrength() {
        return this.heartRateStrength;
    }

    public int getLeakage() {
        return this.leakage;
    }

    public int getMentalStress() {
        return this.mentalStress;
    }

    public int getPrematureBeat() {
        return this.prematureBeat;
    }

    public boolean isHeartRateFast() {
        return this.heartRateFast;
    }

    public boolean isHeartRateMisaligned() {
        return this.heartRateMisaligned;
    }

    public boolean isHeartRateSlow() {
        return this.heartRateSlow;
    }

    public void setAverageHeartRate(int i8) {
        this.averageHeartRate = i8;
    }

    public void setDiagnosisType(int i8) {
        this.diagnosisType = i8;
    }

    public void setEcgList(List<Integer> list) {
        this.ecgList = list;
    }

    public void setFatigue(int i8) {
        this.fatigue = i8;
    }

    public void setHeartLoad(int i8) {
        this.heartLoad = i8;
    }

    public void setHeartRateFast(boolean z7) {
        this.heartRateFast = z7;
    }

    public void setHeartRateMisaligned(boolean z7) {
        this.heartRateMisaligned = z7;
    }

    public void setHeartRateSlow(boolean z7) {
        this.heartRateSlow = z7;
    }

    public void setHeartRateStop(int i8) {
        this.heartRateStop = i8;
    }

    public void setHeartRateStrength(int i8) {
        this.heartRateStrength = i8;
    }

    public void setLeakage(int i8) {
        this.leakage = i8;
    }

    public void setMentalStress(int i8) {
        this.mentalStress = i8;
    }

    public void setPrematureBeat(int i8) {
        this.prematureBeat = i8;
    }
}
