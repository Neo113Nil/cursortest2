package com.baidu.ar.baidumap;

import android.view.View;
import com.baidu.ar.ARType;
import com.baidu.ar.DuMixInput;
import com.baidu.ar.DuMixOutput;
import com.baidu.ar.ability.AbilityType;
import com.baidu.ar.arrender.FrameRenderListener;
import com.baidu.ar.arrender.IARRenderer;
import com.baidu.ar.arrender.IGLRenderer;
import com.baidu.ar.baidumap.bean.CommandDate;
import com.baidu.ar.baidumap.bean.CommandType;
import com.baidu.ar.lua.LuaMsgListener;
import com.baidu.ar.marker.IMarker;
import com.baidu.ar.x1;
import java.util.HashMap;

/* loaded from: classes.dex */
public interface IMapDuMix extends View.OnTouchListener {
    void addFrameRenderListener(FrameRenderListener frameRenderListener);

    boolean addLuaMsgListener(LuaMsgListener luaMsgListener);

    void cancelAll();

    void cancelCaseDownload(String str);

    void changeOutputObject(Object obj, int i8, int i9);

    void changeOutputSize(int i8, int i9);

    void checkCaseUpdate(String str, x1 x1Var);

    void clearCase();

    void doCommand(CommandType commandType, CommandDate commandDate);

    void downloadCase(String str, CaseDownloadListener caseDownloadListener);

    IARRenderer getARRenderer();

    IGLRenderer getGLRenderer();

    IMarker getMarkerManager();

    void loadCase(String str);

    void loadCase(String str, ARType aRType);

    void loadCase(String str, String str2);

    void pause();

    void pauseScene();

    void release();

    void removeFrameRenderListener(FrameRenderListener frameRenderListener);

    boolean removeLuaMsgListener(LuaMsgListener luaMsgListener);

    void resume();

    void resumeScene();

    boolean sendLuaScript2Engine(String str);

    boolean sendMsg2Lua(HashMap<String, Object> hashMap);

    void setCaseStateListener(CaseStateListener caseStateListener);

    void setLocationService(ILocationService iLocationService);

    void setup(DuMixInput duMixInput, DuMixOutput duMixOutput, MapDuMixCallback mapDuMixCallback);

    boolean startAbility(AbilityType abilityType, HashMap<String, Object> hashMap);

    void startMarker();

    boolean stopAbility(AbilityType abilityType);

    void stopMarker();
}
