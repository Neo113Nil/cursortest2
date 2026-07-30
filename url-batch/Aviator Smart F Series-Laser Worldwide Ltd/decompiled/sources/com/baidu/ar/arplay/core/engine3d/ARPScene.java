package com.baidu.ar.arplay.core.engine3d;

import android.util.Log;
import com.baidu.ar.arplay.core.engine.engine3d.IARPCamera;
import com.baidu.ar.arplay.core.engine.engine3d.IARPNode;
import com.baidu.ar.arplay.core.engine.engine3d.IARPScene;
import java.util.HashMap;

/* loaded from: classes.dex */
public class ARPScene implements IARPScene {
    private HashMap<String, ARPNode> mNodeCache;
    private long mScenePtr = -1;

    public ARPScene() {
        init();
    }

    private IARPNode arpNodeFromInternalNode(long j8) {
        String nativeGetNodeName = nativeGetNodeName(j8);
        ARPNode aRPNode = this.mNodeCache.get(nativeGetNodeName);
        if (aRPNode != null) {
            return aRPNode;
        }
        ARPNode aRPNode2 = new ARPNode();
        aRPNode2.bindInternal(j8);
        this.mNodeCache.put(nativeGetNodeName, aRPNode2);
        return aRPNode2;
    }

    private void init() {
        this.mNodeCache = new HashMap<>();
    }

    @Override // com.baidu.ar.arplay.core.engine.engine3d.IARPScene
    public IARPCamera getActiveCamera() {
        long nativeGetActiveCamera = nativeGetActiveCamera(this.mScenePtr);
        ARPCamera defaultCamera = ARPCamera.getDefaultCamera();
        defaultCamera.bindInternal(nativeGetActiveCamera);
        return defaultCamera;
    }

    @Override // com.baidu.ar.arplay.core.engine.engine3d.IARPScene
    public String getName(long j8) {
        return nativeGetName(j8);
    }

    @Override // com.baidu.ar.arplay.core.engine.engine3d.IARPScene
    public IARPNode getNodeByName(String str) {
        long j8 = this.mScenePtr;
        if (j8 != -1) {
            return arpNodeFromInternalNode(nativeGetNodeByName(j8, str));
        }
        Log.e(ARPScene.class.getSimpleName(), "node addr is error");
        return null;
    }

    @Override // com.baidu.ar.arplay.core.engine.engine3d.IARPScene
    public IARPNode getRootNode() {
        long j8 = this.mScenePtr;
        if (j8 != -1) {
            return arpNodeFromInternalNode(nativeGetRootNode(j8));
        }
        Log.e(ARPScene.class.getSimpleName(), "node addr is error");
        return null;
    }

    public native long nativeGetActiveCamera(long j8);

    public native String nativeGetName(long j8);

    public native long nativeGetNodeByName(long j8, String str);

    public native String nativeGetNodeName(long j8);

    public native long nativeGetRootNode(long j8);

    public native void nativeRelocate(long j8);

    public native float[] nativeSceneProject(long j8, float[] fArr);

    public native void nativeSetOffScreenGuideWork(long j8, boolean z7);

    public native void nativeSetVisible(long j8, boolean z7);

    @Override // com.baidu.ar.arplay.core.engine.engine3d.IARPScene
    public void relocate() {
        long j8 = this.mScenePtr;
        if (j8 == -1) {
            Log.e(ARPScene.class.getSimpleName(), "node addr is error");
        } else {
            nativeRelocate(j8);
        }
    }

    @Override // com.baidu.ar.arplay.core.engine.engine3d.IARPScene
    public float[] sceneProject(float[] fArr) {
        long j8 = this.mScenePtr;
        if (j8 != -1) {
            return nativeSceneProject(j8, fArr);
        }
        Log.e(ARPScene.class.getSimpleName(), "node addr is error");
        return null;
    }

    @Override // com.baidu.ar.arplay.core.engine.engine3d.IARPScene
    public void setInternal(long j8) {
        this.mScenePtr = j8;
    }

    @Override // com.baidu.ar.arplay.core.engine.engine3d.IARPScene
    public void setOffScreenGuideWork(boolean z7) {
        long j8 = this.mScenePtr;
        if (j8 == -1) {
            Log.e(ARPScene.class.getSimpleName(), "node addr is error");
        } else {
            nativeSetOffScreenGuideWork(j8, z7);
        }
    }

    @Override // com.baidu.ar.arplay.core.engine.engine3d.IARPScene
    public boolean setVisible(boolean z7) {
        long j8 = this.mScenePtr;
        if (j8 == -1) {
            Log.e(ARPScene.class.getSimpleName(), "node addr is error");
            return false;
        }
        nativeSetVisible(j8, z7);
        return true;
    }
}
