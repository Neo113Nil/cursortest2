package com.baidu.ar.arrender;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.PointF;
import android.opengl.EGLContext;
import android.os.Looper;
import android.text.TextUtils;
import android.view.ViewGroup;
import com.baidu.ar.DuMixInput;
import com.baidu.ar.DuMixOutput;
import com.baidu.ar.arplay.core.engine.ARPDataInteraction;
import com.baidu.ar.arplay.core.engine.ARPEngine;
import com.baidu.ar.arplay.core.engine.engine3d.IARPCamera;
import com.baidu.ar.arplay.core.engine.engine3d.IARPNode;
import com.baidu.ar.arplay.core.engine.engine3d.IARPScene;
import com.baidu.ar.arplay.core.engine.rotate.Orientation;
import com.baidu.ar.arplay.core.engine.rotate.OrientationManager;
import com.baidu.ar.arplay.core.renderer.OnNeedCacheFrameListener;
import com.baidu.ar.arplay.core.renderer.TakePictureCallback;
import com.baidu.ar.arplay.representation.Matrixf4x4;
import com.baidu.ar.arplay.representation.Quaternion;
import com.baidu.ar.arplay.representation.Vector3f;
import com.baidu.ar.arplay.representation.Vector4f;
import com.baidu.ar.arrender.c;
import com.baidu.ar.bb;
import com.baidu.ar.databasic.AlgoHandleAdapter;
import com.baidu.ar.db;
import com.baidu.ar.h;
import com.baidu.ar.i;
import com.baidu.ar.k4;
import com.baidu.ar.l;
import com.baidu.ar.p7;
import com.baidu.ar.r3;
import com.baidu.ar.t4;
import com.baidu.ar.u;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes.dex */
public class a extends com.baidu.ar.arrender.b implements IARRenderer, OrientationManager.OrientationListener {
    public List<String> P;
    public f Q;
    public e R;
    public Runnable S;
    public bb T;
    public Runnable U;
    public float V;
    public int W;
    public boolean X;
    public ARRenderFpsCallback Y;

    /* renamed from: com.baidu.ar.arrender.a$a, reason: collision with other inner class name */
    public class RunnableC0030a implements Runnable {
        public RunnableC0030a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IARPCamera activeCamera;
            IARPScene currentScene = a.this.f2283j.getCurrentScene();
            if (currentScene == null || (activeCamera = currentScene.getActiveCamera()) == null) {
                return;
            }
            activeCamera.setViewMatrix(a.this.T.f());
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IARPCamera activeCamera;
            IARPScene currentScene = a.this.f2283j.getCurrentScene();
            if (currentScene == null || (activeCamera = currentScene.getActiveCamera()) == null) {
                return;
            }
            activeCamera.setFieldOfView(a.this.V);
        }
    }

    public class c implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f1740a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Object f1741b;

        public c(String str, Object obj) {
            this.f1740a = str;
            this.f1741b = obj;
        }

        @Override // java.lang.Runnable
        public void run() {
            i iVar = a.this.f2285l;
            if (iVar != null) {
                iVar.a(this.f1740a, this.f1741b);
            }
        }
    }

    public static /* synthetic */ class d {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f1743a;

        static {
            int[] iArr = new int[c.a.values().length];
            f1743a = iArr;
            try {
                iArr[c.a.INT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f1743a[c.a.FLOAT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f1743a[c.a.FLOAT_ARRAY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f1743a[c.a.STRING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public interface e {
        void onInputSizeChange(int i8, int i9);
    }

    public interface f {
        void a(int i8, int i9);
    }

    public a(Context context, Looper looper, r3 r3Var, EGLContext eGLContext, String str) {
        super(context, looper, r3Var, eGLContext, str);
        this.W = 0;
        this.X = true;
    }

    @Override // com.baidu.ar.arrender.IARRenderer
    public void addAlgoCache(int i8, boolean z7) {
        if (this.f2283j == null || i8 < 0) {
            return;
        }
        h.a("ARRenderer", "addAlgoCache type = " + i8 + " && sync = " + z7);
        this.f2283j.addAlgoType(new int[]{i8}, z7 ? 1 : 0);
    }

    public final boolean c(u uVar) {
        return uVar.e() && uVar.d() != this.L;
    }

    @Override // com.baidu.ar.arrender.IARRenderer
    public void calibrationTouchAngle() {
        p7 p7Var = this.f2286m;
        if (p7Var != null) {
            p7Var.a();
        }
    }

    @Override // com.baidu.ar.arrender.b, com.baidu.ar.g0
    public void changeOutputSize(int i8, int i9) {
        super.changeOutputSize(i8, i9);
        f fVar = this.Q;
        if (fVar != null) {
            fVar.a(i8, i9);
        }
    }

    @Override // com.baidu.ar.arrender.IARRenderer
    public void clearAlgoCache() {
        ARPEngine aRPEngine = this.f2283j;
        if (aRPEngine != null) {
            aRPEngine.clearAlgoCache();
        }
    }

    @Override // com.baidu.ar.arrender.IARRenderer
    public void clearCaseLutFilter() {
        ARPEngine aRPEngine = this.f2283j;
        if (aRPEngine != null) {
            aRPEngine.disableCaseLutTexture();
        }
    }

    @Override // com.baidu.ar.arrender.IARRenderer
    public void convertAlgo2ScreenPoint(PointF pointF, boolean z7) {
        l.a(pointF, z7, this.f2275b, this.f2276c, this.I);
    }

    @Override // com.baidu.ar.arrender.b
    public void d(boolean z7) {
        h.a("ARRenderer", "onCameraSwitch front = " + z7);
        super.d(z7);
        ARPEngine aRPEngine = this.f2283j;
        if (aRPEngine != null && aRPEngine.getARPRenderer() != null) {
            this.f2283j.getARPRenderer().setCameraFace(z7);
        }
        ARPEngine aRPEngine2 = this.f2283j;
        if (aRPEngine2 != null) {
            aRPEngine2.setIsFrontCamera(z7);
        }
        DuMixInput duMixInput = this.f2275b;
        if (duMixInput != null && duMixInput.isCameraInput()) {
            this.f2275b.setFrontCamera(z7);
        }
        e(!z7);
        updateDeviceOrientation();
        this.W = 3;
    }

    public final void e(boolean z7) {
        if (this.f2281h == null) {
            return;
        }
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("id", 10200);
        hashMap.put("front_camera", Integer.valueOf(!z7 ? 1 : 0));
        this.f2281h.a(1902, hashMap);
    }

    @Override // com.baidu.ar.arrender.IARRenderer
    public void enableSyncFaceLandmark(boolean z7) {
        ARPEngine aRPEngine = this.f2283j;
        if (aRPEngine != null) {
            aRPEngine.setFaceLandMarkFrameAcheMode(z7 ? 1 : 0);
        }
    }

    @Override // com.baidu.ar.arrender.IARRenderer
    public void enableSyncRender(boolean z7) {
        h.c("ARRenderer", "enableSyncRender enable = " + z7);
        ARPEngine aRPEngine = this.f2283j;
        if (aRPEngine == null || aRPEngine.getARPRenderer() == null) {
            return;
        }
        this.f2283j.getARPRenderer().setSourceSyncProperty(z7);
    }

    @Override // com.baidu.ar.arrender.IARRenderer
    public String getCurrentCasePath() {
        return this.f2288o;
    }

    @Override // com.baidu.ar.arrender.IARRenderer
    public Matrixf4x4 getInitialTransform() {
        IARPScene currentScene;
        IARPCamera activeCamera;
        ARPEngine aRPEngine = this.f2283j;
        if (aRPEngine == null || (currentScene = aRPEngine.getCurrentScene()) == null || (activeCamera = currentScene.getActiveCamera()) == null) {
            return null;
        }
        return activeCamera.getInitialTransform();
    }

    @Override // com.baidu.ar.arrender.IARRenderer
    public void getSnapShot(TakePictureCallback takePictureCallback) {
        ARPEngine aRPEngine = this.f2283j;
        if (aRPEngine == null || aRPEngine.getARPRenderer() == null) {
            return;
        }
        this.f2283j.getARPRenderer().getSnapShot(takePictureCallback, this.f2276c.getOutputWidth(), this.f2276c.getOutputHeight(), OrientationManager.getGlobalOrientation().getDegree());
    }

    @Override // com.baidu.ar.arrender.IARRenderer
    public void initWorldAxis() {
        ARPEngine aRPEngine = this.f2283j;
        if (aRPEngine != null) {
            aRPEngine.initWorldAxis();
        }
    }

    @Override // com.baidu.ar.arrender.IARRenderer
    public boolean isDriverdByARPVersion() {
        ARPEngine aRPEngine = this.f2283j;
        if (aRPEngine != null) {
            return aRPEngine.isDriverdByARPVersion();
        }
        return false;
    }

    @Override // com.baidu.ar.arrender.IARRenderer
    public float[] location2ScreenPoint(float[] fArr) {
        IARPScene currentScene;
        ARPEngine aRPEngine = this.f2283j;
        return (aRPEngine == null || (currentScene = aRPEngine.getCurrentScene()) == null) ? new float[0] : currentScene.sceneProject(fArr);
    }

    @Override // com.baidu.ar.arrender.b, com.baidu.ar.arplay.core.renderer.OnRenderFinishedListener
    public void onRenderFinished(long j8) {
        ARRenderFpsCallback aRRenderFpsCallback = this.Y;
        if (aRRenderFpsCallback != null && (aRRenderFpsCallback.listenType() & 2) != 0) {
            this.Y.onRenderFinished();
        }
        super.onRenderFinished(j8);
    }

    @Override // com.baidu.ar.arrender.b, com.baidu.ar.arplay.core.renderer.OnRenderStartedListener
    public void onRenderStarted(long j8) {
        ARRenderFpsCallback aRRenderFpsCallback = this.Y;
        if (aRRenderFpsCallback != null && (aRRenderFpsCallback.listenType() & 1) != 0) {
            this.Y.onRenderStarted();
        }
        super.onRenderStarted(j8);
        p();
    }

    @Override // com.baidu.ar.arplay.core.engine.rotate.OrientationManager.OrientationListener
    public void onRotateOrientation(Orientation orientation) {
        if (this.f2281h != null) {
            h.a("ARRenderer", "sendOrientation2Render orientation = " + orientation);
            this.f2281h.a(4001, l.a(orientation));
        }
    }

    public final void p() {
        int i8;
        if (this.f2284k && (i8 = this.W) >= 0 && this.X) {
            if (i8 == 3) {
                this.f2283j.setEngineBlendState(0);
            } else if (i8 == 0) {
                this.f2283j.setEngineBlendState(1);
            }
            this.W--;
        }
    }

    @Override // com.baidu.ar.arrender.IARRenderer
    public void pauseScene() {
        h.a("ARRenderer", "pauseScene()");
        ARPEngine aRPEngine = this.f2283j;
        if (aRPEngine != null) {
            aRPEngine.pauseScene();
        }
    }

    public DuMixInput q() {
        return this.f2275b;
    }

    public DuMixOutput r() {
        return this.f2276c;
    }

    @Override // com.baidu.ar.arrender.b, com.baidu.ar.g0
    public void release() {
        this.P = null;
        this.Q = null;
        this.R = null;
        this.Y = null;
        super.release();
    }

    @Override // com.baidu.ar.arrender.IARRenderer
    public void removeAlgoCache(int i8) {
        if (this.f2283j == null || i8 < 0) {
            return;
        }
        h.a("ARRenderer", "removeAlgoCache type = " + i8);
        this.f2283j.removeAlgoType(new int[]{i8});
    }

    @Override // com.baidu.ar.arrender.IARRenderer
    public void render(long j8) {
        if (this.f2283j == null || !this.f2284k) {
            return;
        }
        this.f2283j.getARPRenderer().render(j8);
    }

    @Override // com.baidu.ar.arrender.IARRenderer
    public void resumeScene() {
        h.a("ARRenderer", "resumeScene()");
        ARPEngine aRPEngine = this.f2283j;
        if (aRPEngine != null) {
            aRPEngine.resumeScene();
        }
    }

    @Override // com.baidu.ar.arrender.IARRenderer
    public void sceneRelocate() {
        IARPScene currentScene;
        ARPEngine aRPEngine = this.f2283j;
        if (aRPEngine == null || (currentScene = aRPEngine.getCurrentScene()) == null) {
            return;
        }
        currentScene.relocate();
    }

    @Override // com.baidu.ar.arrender.IARRenderer
    public void sceneRotateToCamera() {
        ARPEngine aRPEngine = this.f2283j;
        if (aRPEngine != null) {
            aRPEngine.sceneRotateToCamera();
        }
    }

    @Override // com.baidu.ar.arrender.IARRenderer
    public void sceneWorldPositionToOrigin() {
        ARPEngine aRPEngine = this.f2283j;
        if (aRPEngine != null) {
            aRPEngine.sceneWorldPositionToOrigin();
        }
    }

    @Override // com.baidu.ar.arrender.IARRenderer
    public boolean set3DModelVisible(boolean z7) {
        ARPEngine aRPEngine = this.f2283j;
        if (aRPEngine == null || aRPEngine.getCurrentScene() == null) {
            return false;
        }
        return this.f2283j.getCurrentScene().setVisible(z7);
    }

    @Override // com.baidu.ar.arrender.IARRenderer
    public void setAlgoHandleData(long j8, String str) {
        if (this.f2283j == null || j8 <= 0 || TextUtils.isEmpty(str)) {
            return;
        }
        u uVar = new u();
        uVar.a(str);
        uVar.a(AlgoHandleAdapter.getHandleTimeStamp(j8));
        uVar.b(AlgoHandleAdapter.getHandleIsFront(j8));
        uVar.c(AlgoHandleAdapter.getHandleEnableSync(j8));
        if (b(uVar)) {
            return;
        }
        this.f2283j.setAlgoDataHandle(j8);
    }

    @Override // com.baidu.ar.arrender.IARRenderer
    public void setAvatarGestureConfig() {
        ARPEngine aRPEngine = this.f2283j;
        if (aRPEngine != null) {
            aRPEngine.setAvatarGestureConfig();
        }
    }

    @Override // com.baidu.ar.arrender.IARRenderer
    public void setBlendShape(HashMap<String, Double> hashMap) {
        ARPEngine aRPEngine = this.f2283j;
        if (aRPEngine != null) {
            aRPEngine.setBlendShape(hashMap);
        }
    }

    @Override // com.baidu.ar.arrender.IARRenderer
    public void setCacheFrameListener(OnNeedCacheFrameListener onNeedCacheFrameListener) {
        ARPEngine aRPEngine = this.f2283j;
        if (aRPEngine == null || aRPEngine.getARPRenderer() == null) {
            return;
        }
        this.f2283j.getARPRenderer().setOnNeedCacheFrameListener(onNeedCacheFrameListener);
    }

    @Override // com.baidu.ar.arrender.IARRenderer
    public void setEnabledAbilities(List<String> list) {
        this.P = list;
    }

    @Override // com.baidu.ar.arrender.IARRenderer
    public void setEnvironmentDataPipKV(String str, Object obj) {
        ARPEngine aRPEngine = this.f2283j;
        if (aRPEngine == null || aRPEngine.getARPRenderer() == null) {
            return;
        }
        this.f2283j.getARPRenderer().runAsyncOnRenderContext(new c(str, obj));
    }

    @Override // com.baidu.ar.arrender.IARRenderer
    public void setFieldOfView(float f8) {
        ARPEngine aRPEngine = this.f2283j;
        if (aRPEngine == null || aRPEngine.getARPRenderer() == null) {
            return;
        }
        this.V = f8;
        if (this.U == null) {
            this.U = new b();
        }
        this.f2283j.getARPRenderer().cancelAysncRenderTask(this.U);
        this.f2283j.getARPRenderer().runAsyncOnRenderContext(this.U);
    }

    @Override // com.baidu.ar.arrender.IARRenderer
    public void setGLWebViewUseable(Context context, ViewGroup viewGroup) {
        t4 t4Var = this.f2287n;
        if (t4Var != null) {
            t4Var.a(context, viewGroup, this);
        }
    }

    @Override // com.baidu.ar.arrender.IARRenderer
    public void setImuType(com.baidu.ar.imu.a aVar) {
        p7 p7Var = this.f2286m;
        if (p7Var != null) {
            p7Var.a(aVar.a());
        }
    }

    @Override // com.baidu.ar.arrender.IARRenderer
    public void setInteractionCallback(ARPDataInteraction.b bVar) {
        ARPEngine aRPEngine = this.f2283j;
        if (aRPEngine != null) {
            aRPEngine.setInteraction(bVar);
        }
    }

    @Override // com.baidu.ar.arrender.IARRenderer
    public void setNativeWebViewUseable(Context context, ViewGroup viewGroup) {
        t4 t4Var = this.f2287n;
        if (t4Var != null) {
            t4Var.b(context, viewGroup, null);
        }
    }

    @Override // com.baidu.ar.arrender.IARRenderer
    public void setOffScreenGuideWork(boolean z7) {
        IARPScene currentScene;
        ARPEngine aRPEngine = this.f2283j;
        if (aRPEngine == null || (currentScene = aRPEngine.getCurrentScene()) == null) {
            return;
        }
        currentScene.setOffScreenGuideWork(z7);
    }

    @Override // com.baidu.ar.arrender.IARRenderer
    public void setRenderBlendInput(boolean z7) {
        this.X = z7;
        ARPEngine aRPEngine = this.f2283j;
        if (aRPEngine != null) {
            aRPEngine.setEngineBlendState(z7 ? 3 : 2);
        }
    }

    @Override // com.baidu.ar.arrender.IARRenderer
    public void setRootNodeEulerAngle(float f8, float f9, float f10) {
        IARPNode rootNode;
        if (this.f2283j == null) {
            return;
        }
        Vector3f vector3f = new Vector3f((float) ((f8 * 3.141592653589793d) / 180.0d), (float) ((f9 * 3.141592653589793d) / 180.0d), (float) ((f10 * 3.141592653589793d) / 180.0d));
        IARPScene currentScene = this.f2283j.getCurrentScene();
        if (currentScene == null || (rootNode = currentScene.getRootNode()) == null) {
            return;
        }
        rootNode.setEulerAnges(vector3f);
    }

    @Override // com.baidu.ar.arrender.IARRenderer
    public void setRootNodeRotation(float f8, float f9, float f10) {
        IARPNode rootNode;
        if (this.f2283j == null) {
            return;
        }
        Quaternion quaternion = new Quaternion();
        Quaternion quaternion2 = new Quaternion();
        quaternion2.setAxisAngle(new Vector3f(0.0f, 0.0f, 1.0f), f8);
        Quaternion quaternion3 = new Quaternion();
        quaternion3.setAxisAngle(new Vector3f(1.0f, 0.0f, 0.0f), f9);
        Quaternion quaternion4 = new Quaternion();
        quaternion4.setAxisAngle(new Vector3f(0.0f, 0.0f, 1.0f), f10);
        quaternion.multiplyByQuat(quaternion2);
        quaternion.multiplyByQuat(quaternion3);
        quaternion.multiplyByQuat(quaternion4);
        Vector4f vector4f = new Vector4f();
        quaternion.toAxisAngle(vector4f);
        vector4f.setW((float) Math.toRadians(vector4f.getW()));
        IARPScene currentScene = this.f2283j.getCurrentScene();
        if (currentScene == null || (rootNode = currentScene.getRootNode()) == null) {
            return;
        }
        rootNode.setRotation(vector4f);
    }

    @Override // com.baidu.ar.arrender.IARRenderer
    public void setSkeletonData(HashMap<String, List<Double>> hashMap) {
        ARPEngine aRPEngine = this.f2283j;
        if (aRPEngine != null) {
            aRPEngine.setSkeletionData(hashMap);
        }
    }

    @Override // com.baidu.ar.arrender.IARRenderer
    public void setSyncFrameTimestamp(long j8) {
        ARPEngine aRPEngine = this.f2283j;
        if (aRPEngine == null || aRPEngine.getARPRenderer() == null) {
            return;
        }
        this.f2283j.getARPRenderer().setAlgoPts(j8);
    }

    @Override // com.baidu.ar.arrender.IARRenderer
    public void setTouchEnable(boolean z7) {
        com.baidu.ar.arplay.core.engine.a aVar = this.A;
        if (aVar != null) {
            aVar.c(z7);
        }
    }

    @Override // com.baidu.ar.arrender.IARRenderer
    public void updateDeviceOrientation() {
        onRotateOrientation(OrientationManager.getGlobalOrientation());
    }

    @Override // com.baidu.ar.arrender.IARRenderer
    public String updateFilterCase(String str) {
        ARPEngine aRPEngine = this.f2283j;
        if (aRPEngine != null) {
            return aRPEngine.adjustFilterWithCasePathParam(str);
        }
        return null;
    }

    @Override // com.baidu.ar.arrender.IARRenderer
    public void updateFilterData(com.baidu.ar.arrender.c cVar) {
        if (this.f2283j == null || cVar == null || b(cVar) || this.f2296w) {
            h.b("ARRenderer", "updateFilterData error!!!");
            return;
        }
        int i8 = d.f1743a[cVar.h().ordinal()];
        if (i8 == 1) {
            this.f2283j.adjustFilterWithIntParam(cVar.i(), cVar.f(), ((Integer) cVar.g()).intValue(), cVar.b());
            return;
        }
        if (i8 == 2) {
            Object g8 = cVar.g();
            this.f2283j.adjustFilterWithFloatParam(cVar.i(), cVar.f(), g8 instanceof Double ? (float) ((Double) g8).doubleValue() : ((Float) g8).floatValue(), cVar.b());
        } else if (i8 == 3) {
            this.f2283j.adjustFilterWithFloatArrayParam(cVar.i(), cVar.f(), (float[]) cVar.g(), cVar.b());
        } else if (i8 != 4) {
            h.b("ARRenderer", "updateFilterData filterData.getAdjustValueType() error!!!");
        } else {
            this.f2283j.adjustFilterWithStringParam(cVar.i(), cVar.f(), (String) cVar.g(), cVar.b());
        }
    }

    @Override // com.baidu.ar.arrender.IARRenderer
    public void updateFilterNodeData(k4 k4Var) {
        ARPEngine aRPEngine = this.f2283j;
        if (aRPEngine != null) {
            aRPEngine.getARPRenderer();
        }
        h.b("ARRenderer", "updateFilterNodeData error!!!");
    }

    @Override // com.baidu.ar.arrender.IARRenderer
    public void updateRenderCameraData(bb bbVar) {
        ARPEngine aRPEngine = this.f2283j;
        if (aRPEngine == null || aRPEngine.getARPRenderer() == null || bbVar == null || b(bbVar)) {
            h.b("ARRenderer", "updateRenderCameraData error!!!");
            return;
        }
        this.T = bbVar;
        if (this.S == null) {
            this.S = new RunnableC0030a();
        }
        this.f2283j.getARPRenderer().cancelAysncRenderTask(this.S);
        this.f2283j.getARPRenderer().runAsyncOnRenderContext(this.S);
    }

    @Override // com.baidu.ar.arrender.IARRenderer
    public void updateRenderNodeData(db dbVar, boolean z7) {
        ARPEngine aRPEngine = this.f2283j;
        if (aRPEngine != null) {
            aRPEngine.getARPRenderer();
        }
        h.b("ARRenderer", "updateRenderNodeData error!!!");
    }

    @Override // com.baidu.ar.arrender.IARRenderer
    public void updateTransforms(Matrixf4x4 matrixf4x4) {
        IARPScene currentScene;
        ARPEngine aRPEngine = this.f2283j;
        if (aRPEngine == null || (currentScene = aRPEngine.getCurrentScene()) == null) {
            return;
        }
        currentScene.getActiveCamera().setTransform(matrixf4x4);
    }

    public a(Context context, Looper looper, r3 r3Var, String str) {
        this(context, looper, r3Var, null, str);
    }

    public void a(Bitmap bitmap, float f8, float f9, float f10, float f11) {
        ARPEngine aRPEngine = this.f2283j;
        if (aRPEngine != null) {
            aRPEngine.setAuthPic(bitmap, new float[]{f8, f9, f10, f11});
        }
    }

    public boolean b(u uVar) {
        return !uVar.c() && (a(uVar) || c(uVar));
    }

    public void a(ARRenderFpsCallback aRRenderFpsCallback) {
        this.Y = aRRenderFpsCallback;
    }

    public void a(e eVar) {
        this.R = eVar;
    }

    public void a(f fVar) {
        this.Q = fVar;
    }

    @Override // com.baidu.ar.g0
    public void a(Object obj, int i8, int i9) {
        super.a(obj, i8, i9);
        e eVar = this.R;
        if (eVar != null) {
            eVar.onInputSizeChange(i8, i9);
        }
    }

    public final boolean a(u uVar) {
        List<String> list = this.P;
        return list == null || !list.contains(uVar.a());
    }
}
