package com.baidu.platform.comjni.jninative.tts;

import com.baidu.platform.comapi.wnplatform.tts.a;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public class WNaviTTSPlayer {
    private static boolean bStopVoiceOutput = false;
    private static List<a> mTtsPlayerListListener;
    private static a mTtsPlayerListener;

    public static void addOutTTSPlayerListener(a aVar) {
        if (aVar != null) {
            if (mTtsPlayerListListener == null) {
                mTtsPlayerListListener = new ArrayList();
            }
            if (mTtsPlayerListListener.contains(aVar)) {
                return;
            }
            mTtsPlayerListListener.add(aVar);
        }
    }

    public static int getTTSState() {
        List<a> list;
        List<a> list2 = mTtsPlayerListListener;
        if (list2 != null && list2.size() > 0 && (list = mTtsPlayerListListener) != null && list.size() > 0) {
            for (int i8 = 0; i8 < mTtsPlayerListListener.size(); i8++) {
                if (mTtsPlayerListListener.get(i8) != null) {
                    mTtsPlayerListListener.get(i8).getTTSState();
                }
            }
        }
        a aVar = mTtsPlayerListener;
        if (aVar == null) {
            return 0;
        }
        return aVar.getTTSState();
    }

    public static void pauseVoiceTTSOutput() {
        bStopVoiceOutput = true;
    }

    public static int playTTSText(String str, int i8, int i9, int i10) {
        List<a> list;
        List<a> list2 = mTtsPlayerListListener;
        if (list2 != null && list2.size() > 0 && !bStopVoiceOutput && (list = mTtsPlayerListListener) != null && list.size() > 0) {
            for (int i11 = 0; i11 < mTtsPlayerListListener.size(); i11++) {
                if (mTtsPlayerListListener.get(i11) != null) {
                    mTtsPlayerListListener.get(i11).playTTSText(str, i8, i9);
                }
            }
        }
        a aVar = mTtsPlayerListener;
        if (aVar == null || bStopVoiceOutput) {
            return 0;
        }
        return aVar.playTTSText(str, i8, i9);
    }

    public static void removeOutTTSPlayerListener(a aVar) {
        List<a> list = mTtsPlayerListListener;
        if (list == null || list.size() <= 0) {
            return;
        }
        mTtsPlayerListListener.remove(aVar);
    }

    public static void resumeVoiceTTSOutput() {
        bStopVoiceOutput = false;
    }

    public static void setTTSPlayerListener(a aVar) {
        mTtsPlayerListener = aVar;
    }
}
