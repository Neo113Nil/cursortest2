package com.baidu.ar.npc;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;
import android.view.OrientationEventListener;
import com.baidu.ar.npc.BaiduArView;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* loaded from: classes.dex */
public class ArBridge {
    private static final int INVALID_MESSAGE_ID = -1;
    private static final int MSG_MESSAGE_FROM_ENGINE = 1;
    private static ArBridge self;
    private WeakReference<BaiduArView> mArView;
    private Handler mHandler;
    private List<ArCallback> mMsgHandlers;
    private OrientationEventListener mOrientationEventListener;
    private HandlerThread mThread;
    private VideoUpdateCallback mVideoCallback;
    private long mCurrentGLThreadID = -1;
    private int mDeviceOrientation = -1;
    private TouchOrientation mTouchOrientation = TouchOrientation.SCREEN_ORIENTATION_NOT_DEFINED;
    private int mFPS = 0;
    private boolean mHasResumeByUser = false;

    private static class ArCallback {
        public MessageHandler mHandler;
        public int mMessageId;
        public int mMessageType;

        public ArCallback(int i8, int i9, MessageHandler messageHandler) {
            this.mMessageType = i8;
            this.mMessageId = i9;
            this.mHandler = messageHandler;
        }
    }

    private static class ArMessage {
        public HashMap<String, Object> mData;
        public int mMessageID;
        public int mMessageType;
        public int mResMessageID;

        public ArMessage(int i8, int i9, HashMap<String, Object> hashMap, int i10) {
            this.mMessageType = i8;
            this.mMessageID = i9;
            this.mData = hashMap;
            this.mResMessageID = i10;
        }
    }

    public interface CaptureCallback {
        void onSucceed(Bitmap bitmap);
    }

    public static class LuaSdkBridgeMessageType {
        public static final int MSG_TYPE_SDK_LUA_GAME_CONFIG = 1001;
    }

    public interface MessageHandler {
        void handleMessage(int i8, int i9, HashMap<String, Object> hashMap);
    }

    public static class MessageParamKeys {
        public static final String MAP_NPC_KEY_NAME = "script";
        public static final String MODEL_COLOR_KEY = "model_color";
        public static final String MODEL_TYPE_KEY = "model_type";
    }

    public static class MessageType {
        public static final int MSG_ALL = 0;
        public static final int MSG_CASE_INIT_COMPLETED = 9;
        public static final int MSG_MODEL_APPEAR = 201;
        public static final int MSG_MODEL_DISAPPEAR = 202;
        public static final int MSG_NONE = -1;
        public static final int MSG_PLAY_MUSIC = 1001;
        public static final int MSG_PLAY_MUSIC_RES = 1002;
        public static final int MSG_START_CONFIG = 10;
        public static final int MSG_TRACK_FOUND = 101;
        public static final int MSG_TRACK_LOST = 102;
        public static final int MSG_TYPE_IMU_CLOSE = 303;
        public static final int MSG_TYPE_IMU_CLOSE_RES = 304;
        public static final int MSG_TYPE_IMU_OPEN = 301;
        public static final int MSG_TYPE_IMU_OPEN_RES = 302;
        public static final int MSG_TYPE_LUA_SDK_BRIDGE = 1901;
        public static final int MSG_TYPE_MUSIC_FAILED = 1010;
        public static final int MSG_TYPE_MUSIC_FINISHED = 1009;
        public static final int MSG_TYPE_OPEN_URL = 1301;
        public static final int MSG_TYPE_PAUSE_MUSIC = 1003;
        public static final int MSG_TYPE_PAUSE_MUSIC_RES = 1004;
        public static final int MSG_TYPE_PHONE_CALL = 1401;
        public static final int MSG_TYPE_RESUME_MUSIC = 1005;
        public static final int MSG_TYPE_RESUME_MUSIC_RES = 1006;
        public static final int MSG_TYPE_SDK_LUA_BRIDGE = 1902;
        public static final int MSG_TYPE_SDK_RUN_SCRIPT = 2001;
        public static final int MSG_TYPE_SDK_SET_MODEL_COLOR = 2002;
        public static final int MSG_TYPE_SHARE = 1601;
        public static final int MSG_TYPE_STATISTICS = 1801;
        public static final int MSG_TYPE_STOP_MUSIC = 1007;
        public static final int MSG_TYPE_STOP_MUSIC_RES = 1008;
        public static final int MSG_TYPE_VIBERATOR = 1501;
        public static final int MSG_TYPE_VIDEO_PAUSE = 1023;
        public static final int MSG_TYPE_VIDEO_PAUSE_RES = 1024;
        public static final int MSG_TYPE_VIDEO_PLAY = 1021;
        public static final int MSG_TYPE_VIDEO_PLAY_FAILED = 1029;
        public static final int MSG_TYPE_VIDEO_PLAY_FINISH = 1030;
        public static final int MSG_TYPE_VIDEO_PLAY_RES = 1022;
        public static final int MSG_TYPE_VIDEO_RESUME = 1025;
        public static final int MSG_TYPE_VIDEO_RESUME_RES = 1026;
        public static final int MSG_TYPE_VIDEO_STOP = 1027;
        public static final int MSG_TYPE_VIDEO_STOP_RES = 1028;
        public static final int MSG_USR_INTERACTION_CONFIG = 11;
    }

    public enum TouchOrientation {
        SCREEN_ORIENTATION_PORTRAIT,
        SCREEN_ORIENTATION_LANDSCAPE,
        SCREEN_ORIENTATION_REVERSE_PORTRAIT,
        SCREEN_ORIENTATION_REVERSE_LANDSCAPE,
        SCREEN_ORIENTATION_NOT_DEFINED
    }

    public interface VideoUpdateCallback {
        void onUpdateVideoFrame(String str, int i8, String str2);
    }

    private ArBridge() {
        HandlerThread handlerThread = new HandlerThread("msg_callback_thread");
        this.mThread = handlerThread;
        handlerThread.start();
        this.mHandler = new Handler(this.mThread.getLooper(), new Handler.Callback() { // from class: com.baidu.ar.npc.ArBridge.1
            @Override // android.os.Handler.Callback
            public boolean handleMessage(Message message) {
                if (message.what != 1) {
                    return false;
                }
                ArBridge.this.processIncomingMessage((ArMessage) message.obj);
                return false;
            }
        });
        this.mMsgHandlers = new LinkedList();
    }

    public static synchronized ArBridge getInstance() {
        ArBridge arBridge;
        synchronized (ArBridge.class) {
            try {
                if (self == null) {
                    self = new ArBridge();
                }
                arBridge = self;
            } catch (Throwable th) {
                throw th;
            }
        }
        return arBridge;
    }

    public static native boolean libraryHasLoaded();

    /* JADX INFO: Access modifiers changed from: private */
    public void processIncomingMessage(ArMessage arMessage) {
        for (ArCallback arCallback : this.mMsgHandlers) {
            int i8 = arCallback.mMessageType;
            if (i8 == 0 || arMessage.mMessageType == i8) {
                int i9 = arCallback.mMessageId;
                if (-1 == i9 || arMessage.mResMessageID == i9) {
                    arCallback.mHandler.handleMessage(arMessage.mMessageType, arMessage.mMessageID, arMessage.mData);
                }
            }
        }
    }

    private void receiveMsgFromEngine(int i8, int i9, HashMap<String, Object> hashMap, int i10) {
        this.mHandler.obtainMessage(1, new ArMessage(i8, i9, hashMap, i10)).sendToTarget();
    }

    private void sendMessageImpl(int i8, HashMap<String, Object> hashMap, int i9) {
        sendMessageImpl(i8, -1, hashMap, i9);
    }

    public void clearScreen() {
        executeOnGLThread(new Runnable() { // from class: com.baidu.ar.npc.ArBridge.15
            @Override // java.lang.Runnable
            public void run() {
                ArBridge.this.nativeClearScreen();
            }
        });
    }

    public int createCase(final String str, final HashMap<String, Object> hashMap, final int i8, final int i9) {
        WeakReference<BaiduArView> weakReference = this.mArView;
        if (weakReference != null && weakReference.get() != null) {
            this.mArView.get().mNeedDestroy = false;
        }
        final int caseId = getCaseId();
        executeOnGLThread(new Runnable() { // from class: com.baidu.ar.npc.ArBridge.7
            @Override // java.lang.Runnable
            public void run() {
                ArBridge.this.nativeCreateCase(str, caseId, hashMap, i8, i9);
            }
        });
        return caseId;
    }

    public void destroyCase() {
        WeakReference<BaiduArView> weakReference = this.mArView;
        if (weakReference == null || weakReference.get() == null || !this.mArView.get().mUpdating) {
            nativeDestroyCase();
        } else {
            this.mArView.get().mNeedDestroy = true;
        }
    }

    public void executeOnGLThread(Runnable runnable) {
        WeakReference<BaiduArView> weakReference = this.mArView;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        if (this.mCurrentGLThreadID == Thread.currentThread().getId()) {
            runnable.run();
        } else {
            this.mArView.get().queueEvent(runnable);
        }
    }

    native int getCaseId();

    public int getFps() {
        executeOnGLThread(new Runnable() { // from class: com.baidu.ar.npc.ArBridge.17
            @Override // java.lang.Runnable
            public void run() {
                ArBridge arBridge = ArBridge.this;
                arBridge.mFPS = arBridge.nativeGetFps();
            }
        });
        return this.mFPS;
    }

    native int getMessageID();

    native void nativeClearScreen();

    native void nativeCreateCase(String str, int i8, HashMap<String, Object> hashMap, int i9, int i10);

    native void nativeDestroyCase();

    native int nativeGetFps();

    native void nativeOnPause();

    native void nativeOnPauseByUser();

    native void nativeOnResume();

    native void nativeOnResumeByUser();

    native void nativeReset();

    native void nativeSetCameraDefaultPos();

    native void nativeSetEuler(float f8, float f9, float f10, String str);

    native void nativeSetFrustum(float f8, float f9);

    native void nativeSetSize(int i8, int i9);

    native void nativeSetTargetInfo(HashMap<String, Object> hashMap);

    native void nativeUpdate();

    native void nativeUpdateRMatrix(float[] fArr);

    native void nativeUpdateRTMatrix(float[] fArr);

    native void nativeUpdateSLAMMatrix(float[] fArr);

    void onPause() {
        OrientationEventListener orientationEventListener = this.mOrientationEventListener;
        if (orientationEventListener != null) {
            orientationEventListener.disable();
        }
        executeOnGLThread(new Runnable() { // from class: com.baidu.ar.npc.ArBridge.18
            @Override // java.lang.Runnable
            public void run() {
                ArBridge.this.nativeOnPause();
            }
        });
    }

    public void onPauseByUser() {
        this.mHasResumeByUser = false;
        executeOnGLThread(new Runnable() { // from class: com.baidu.ar.npc.ArBridge.14
            @Override // java.lang.Runnable
            public void run() {
                ArBridge.this.nativeOnPauseByUser();
            }
        });
    }

    void onResume() {
        if (this.mOrientationEventListener == null && this.mArView.get() != null) {
            this.mOrientationEventListener = new OrientationEventListener(this.mArView.get().getContext(), 3) { // from class: com.baidu.ar.npc.ArBridge.19
                @Override // android.view.OrientationEventListener
                public void onOrientationChanged(int i8) {
                    ArBridge.this.mDeviceOrientation = i8;
                    Log.d("orientation", "orientation " + ArBridge.this.mDeviceOrientation);
                    if (ArBridge.this.mDeviceOrientation < 0) {
                        ArBridge.this.mTouchOrientation = TouchOrientation.SCREEN_ORIENTATION_NOT_DEFINED;
                        return;
                    }
                    int i9 = (ArBridge.this.mDeviceOrientation + 360) % 360;
                    if (i9 <= 45 || i9 > 315) {
                        ArBridge.this.mTouchOrientation = TouchOrientation.SCREEN_ORIENTATION_PORTRAIT;
                        return;
                    }
                    if (i9 > 45 && i9 <= 135) {
                        ArBridge.this.mTouchOrientation = TouchOrientation.SCREEN_ORIENTATION_REVERSE_LANDSCAPE;
                    } else if (i9 > 135 && i9 <= 225) {
                        ArBridge.this.mTouchOrientation = TouchOrientation.SCREEN_ORIENTATION_REVERSE_PORTRAIT;
                    } else {
                        if (i9 <= 225 || i9 > 315) {
                            return;
                        }
                        ArBridge.this.mTouchOrientation = TouchOrientation.SCREEN_ORIENTATION_LANDSCAPE;
                    }
                }
            };
        }
        OrientationEventListener orientationEventListener = this.mOrientationEventListener;
        if (orientationEventListener != null && orientationEventListener.canDetectOrientation()) {
            this.mOrientationEventListener.enable();
        }
        executeOnGLThread(new Runnable() { // from class: com.baidu.ar.npc.ArBridge.20
            @Override // java.lang.Runnable
            public void run() {
                ArBridge.this.nativeOnResume();
            }
        });
        if (this.mHasResumeByUser) {
            onResumeByUser();
            this.mHasResumeByUser = false;
        }
    }

    public void onResumeByUser() {
        WeakReference<BaiduArView> weakReference = this.mArView;
        if (weakReference == null || weakReference.get() == null) {
            this.mHasResumeByUser = true;
        }
        executeOnGLThread(new Runnable() { // from class: com.baidu.ar.npc.ArBridge.13
            @Override // java.lang.Runnable
            public void run() {
                ArBridge.this.mHasResumeByUser = false;
                ArBridge.this.nativeOnResumeByUser();
            }
        });
    }

    void onTouchEvent(final int i8, final int i9, final float f8, final float f9, final float f10, final float f11, final int i10, final float f12, final float f13, final float f14, final float f15, final long j8) {
        executeOnGLThread(new Runnable() { // from class: com.baidu.ar.npc.ArBridge.21
            @Override // java.lang.Runnable
            public void run() {
                Log.d("orientation", "onTouchEvent the orientation is " + ArBridge.this.mTouchOrientation.name());
                ArBridge arBridge = ArBridge.this;
                arBridge.onTouchEventNative(i8, i9, f8, f9, f10, f11, i10, f12, f13, f14, f15, j8, arBridge.mTouchOrientation.ordinal());
            }
        });
    }

    native void onTouchEventNative(int i8, int i9, float f8, float f9, float f10, float f11, int i10, float f12, float f13, float f14, float f15, long j8, int i11);

    public synchronized void registerMessageHandler(final int i8, final MessageHandler messageHandler) {
        this.mHandler.post(new Runnable() { // from class: com.baidu.ar.npc.ArBridge.5
            @Override // java.lang.Runnable
            public void run() {
                ArBridge.this.mMsgHandlers.add(new ArCallback(i8, -1, messageHandler));
            }
        });
    }

    public synchronized void removeMessageHandeler(final MessageHandler messageHandler) {
        this.mHandler.post(new Runnable() { // from class: com.baidu.ar.npc.ArBridge.6
            @Override // java.lang.Runnable
            public void run() {
                Iterator it = ArBridge.this.mMsgHandlers.iterator();
                while (it.hasNext()) {
                    if (((ArCallback) it.next()).mHandler == messageHandler) {
                        it.remove();
                    }
                }
            }
        });
    }

    public void reset() {
        executeOnGLThread(new Runnable() { // from class: com.baidu.ar.npc.ArBridge.16
            @Override // java.lang.Runnable
            public void run() {
                ArBridge.this.nativeReset();
            }
        });
    }

    public void sendLuaScriptToEngine(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("script", str);
        sendMessage(2001, hashMap);
    }

    public void sendMessage(int i8, HashMap<String, Object> hashMap) {
        sendMessageImpl(i8, hashMap, -1);
    }

    native void sendMessageToEngine(int i8, int i9, HashMap<String, Object> hashMap, int i10);

    public void sendResponseMessage(int i8, HashMap<String, Object> hashMap, int i9) {
        sendMessageImpl(i8, hashMap, i9);
    }

    public void setArView(BaiduArView baiduArView) {
        this.mArView = new WeakReference<>(baiduArView);
    }

    public void setCameraDefaultPos() {
        nativeSetCameraDefaultPos();
    }

    public void setEuler(final float f8, final float f9, final float f10, final String str) {
        executeOnGLThread(new Runnable() { // from class: com.baidu.ar.npc.ArBridge.10
            @Override // java.lang.Runnable
            public void run() {
                ArBridge.this.nativeSetEuler(f8, f9, f10, str);
            }
        });
    }

    public void setFrustum(final float f8, final float f9) {
        executeOnGLThread(new Runnable() { // from class: com.baidu.ar.npc.ArBridge.11
            @Override // java.lang.Runnable
            public void run() {
                ArBridge.this.nativeSetFrustum(f8, f9);
            }
        });
    }

    native void setGLJniEnv();

    public void setGLThreadID(long j8) {
        this.mCurrentGLThreadID = j8;
    }

    public void setModelVirtualColor(int i8, boolean z7) {
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("model_color", Integer.valueOf(i8));
        if (!z7) {
            hashMap.put("model_type", 1);
        }
        sendMessage(2002, hashMap);
    }

    public void setSize(final int i8, final int i9) {
        executeOnGLThread(new Runnable() { // from class: com.baidu.ar.npc.ArBridge.9
            @Override // java.lang.Runnable
            public void run() {
                ArBridge.this.nativeSetSize(i8, i9);
            }
        });
    }

    public void setTargetInfo(final HashMap<String, Object> hashMap) {
        executeOnGLThread(new Runnable() { // from class: com.baidu.ar.npc.ArBridge.8
            @Override // java.lang.Runnable
            public void run() {
                ArBridge.this.nativeSetTargetInfo(hashMap);
            }
        });
    }

    public synchronized void setVideoUpdateCallback(VideoUpdateCallback videoUpdateCallback) {
        this.mVideoCallback = videoUpdateCallback;
    }

    public void surfaceViewCapture(final CaptureCallback captureCallback) {
        BaiduArView baiduArView = this.mArView.get();
        if (baiduArView != null) {
            baiduArView.takeSnapshot(new BaiduArView.ARPictureCallback() { // from class: com.baidu.ar.npc.ArBridge.2
                @Override // com.baidu.ar.npc.BaiduArView.ARPictureCallback
                public void onPictureTaken(final Bitmap bitmap) {
                    ArBridge.this.mHandler.post(new Runnable() { // from class: com.baidu.ar.npc.ArBridge.2.1
                        @Override // java.lang.Runnable
                        public void run() {
                            captureCallback.onSucceed(bitmap);
                        }
                    });
                }
            });
        } else {
            this.mHandler.post(new Runnable() { // from class: com.baidu.ar.npc.ArBridge.3
                @Override // java.lang.Runnable
                public void run() {
                    captureCallback.onSucceed(null);
                }
            });
        }
    }

    public void switchCase(final String str, final HashMap<String, Object> hashMap, final int i8, final int i9) {
        executeOnGLThread(new Runnable() { // from class: com.baidu.ar.npc.ArBridge.12
            @Override // java.lang.Runnable
            public void run() {
                ArBridge.this.nativeDestroyCase();
                ArBridge.this.setGLJniEnv();
                ArBridge arBridge = ArBridge.this;
                arBridge.nativeCreateCase(str, arBridge.getCaseId(), hashMap, i8, i9);
            }
        });
    }

    void update() {
        nativeUpdate();
    }

    public void updateRMatrix(float[] fArr) {
        nativeUpdateRMatrix(fArr);
    }

    public void updateRTMatrix(float[] fArr) {
        nativeUpdateRTMatrix(fArr);
    }

    public void updateSLAMMatrix(float[] fArr) {
        nativeUpdateSLAMMatrix(fArr);
    }

    public void updateVideoFrame(String str, int i8, String str2) {
        VideoUpdateCallback videoUpdateCallback = this.mVideoCallback;
        if (videoUpdateCallback != null) {
            videoUpdateCallback.onUpdateVideoFrame(str, i8, str2);
        }
    }

    private void sendMessageImpl(final int i8, final int i9, final HashMap<String, Object> hashMap, final int i10) {
        WeakReference<BaiduArView> weakReference = this.mArView;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.mArView.get().queueEvent(new Runnable() { // from class: com.baidu.ar.npc.ArBridge.4
            @Override // java.lang.Runnable
            public void run() {
                int i11 = i9;
                if (-1 != i11) {
                    ArBridge.this.sendMessageToEngine(i8, i11, hashMap, i10);
                } else {
                    ArBridge arBridge = ArBridge.this;
                    arBridge.sendMessageToEngine(i8, arBridge.getMessageID(), hashMap, i10);
                }
            }
        });
    }
}
