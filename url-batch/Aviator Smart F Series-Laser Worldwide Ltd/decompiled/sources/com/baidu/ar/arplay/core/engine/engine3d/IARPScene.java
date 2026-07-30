package com.baidu.ar.arplay.core.engine.engine3d;

/* loaded from: classes.dex */
public interface IARPScene {
    IARPCamera getActiveCamera();

    String getName(long j8);

    IARPNode getNodeByName(String str);

    IARPNode getRootNode();

    void relocate();

    float[] sceneProject(float[] fArr);

    void setInternal(long j8);

    void setOffScreenGuideWork(boolean z7);

    boolean setVisible(boolean z7);
}
