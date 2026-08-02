package com.buildbox;

/* loaded from: classes.dex */
public interface CustomIntegrator extends Integrator {
    void buttonActivated(String str);

    boolean buttonVisible(String str);

    void loadingDidComplete();

    void sceneOnEnter(String str);

    void sceneOnExit(String str);

    void screenOnEnter(String str);

    void screenOnExit(String str);
}
