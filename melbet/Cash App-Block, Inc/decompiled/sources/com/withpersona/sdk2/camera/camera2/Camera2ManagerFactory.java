package com.withpersona.sdk2.camera.camera2;

import android.content.Context;
import com.withpersona.sdk2.camera.stats.RealCameraStatsManager;
import com.withpersona.sdk2.camera.video.VideoCaptureMethod;
import com.withpersona.sdk2.inquiry.shared.files.SdkFilesManager;
import java.util.Collection;
import java.util.Iterator;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;

/* loaded from: classes5.dex */
public final class Camera2ManagerFactory {
    public final Camera2ImageAnalyzer analyzer;
    public final CameraChoiceHelper cameraChoiceHelper;
    public final CameraChoices cameraChoices;
    public final RealCameraStatsManager cameraStatsManager;
    public int choiceIndex;
    public final Context context;
    public final boolean isAudioRequired;
    public final Camera2PreviewView previewView;
    public final SdkFilesManager sdkFilesManager;
    public final VideoCaptureMethod videoCaptureMethod;

    public Camera2ManagerFactory(Context context, RealCameraStatsManager realCameraStatsManager, SdkFilesManager sdkFilesManager, CameraChoiceHelper cameraChoiceHelper, CameraChoices cameraChoices, Camera2PreviewView camera2PreviewView, Camera2ImageAnalyzer camera2ImageAnalyzer, VideoCaptureMethod videoCaptureMethod, boolean z) {
        context.getClass();
        realCameraStatsManager.getClass();
        sdkFilesManager.getClass();
        cameraChoiceHelper.getClass();
        camera2ImageAnalyzer.getClass();
        videoCaptureMethod.getClass();
        this.context = context;
        this.cameraStatsManager = realCameraStatsManager;
        this.sdkFilesManager = sdkFilesManager;
        this.cameraChoiceHelper = cameraChoiceHelper;
        this.cameraChoices = cameraChoices;
        this.previewView = camera2PreviewView;
        this.analyzer = camera2ImageAnalyzer;
        this.videoCaptureMethod = videoCaptureMethod;
        this.isAudioRequired = z;
        Iterator it = CollectionsKt.plus((Iterable) cameraChoices.backupChoices, (Collection) CollectionsKt__CollectionsJVMKt.listOf(cameraChoices.primaryChoice)).iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            CameraChoice cameraChoice = (CameraChoice) it.next();
            CameraChoiceHelper cameraChoiceHelper2 = this.cameraChoiceHelper;
            cameraChoiceHelper2.getClass();
            cameraChoice.getClass();
            if (!cameraChoiceHelper2.badCameraChoices.contains(cameraChoice)) {
                break;
            } else {
                i++;
            }
        }
        this.choiceIndex = i != -1 ? i : 0;
    }

    public final Camera2Manager newInstance() {
        CameraChoices cameraChoices = this.cameraChoices;
        return new Camera2Manager(this.context, (CameraChoice) CollectionsKt.plus((Iterable) cameraChoices.backupChoices, (Collection) CollectionsKt__CollectionsJVMKt.listOf(cameraChoices.primaryChoice)).get(this.choiceIndex), this.previewView, this.analyzer, this.videoCaptureMethod, this.isAudioRequired, this.cameraStatsManager, this.sdkFilesManager);
    }
}
