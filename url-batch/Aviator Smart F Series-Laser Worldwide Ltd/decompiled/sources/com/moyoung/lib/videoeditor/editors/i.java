package com.moyoung.lib.videoeditor.editors;

import android.util.Log;
import androidx.annotation.NonNull;
import cn.hutool.core.text.l;

/* loaded from: classes4.dex */
public class i {

    class a implements b {
        final /* synthetic */ b val$callback;
        final /* synthetic */ com.moyoung.lib.videoeditor.editors.bean.b val$editBean;

        a(com.moyoung.lib.videoeditor.editors.bean.b bVar, b bVar2) {
            this.val$editBean = bVar;
            this.val$callback = bVar2;
        }

        @Override // com.moyoung.lib.videoeditor.editors.b
        public void onFailure(String str) {
            this.val$editBean.clearTempFile();
            this.val$callback.onFailure(str);
            this.val$callback.onFinish();
        }

        @Override // com.moyoung.lib.videoeditor.editors.b
        public /* bridge */ /* synthetic */ void onFinish() {
            com.moyoung.lib.videoeditor.editors.a.a(this);
        }

        @Override // com.moyoung.lib.videoeditor.editors.b
        public /* bridge */ /* synthetic */ void onProgress(String str) {
            com.moyoung.lib.videoeditor.editors.a.b(this, str);
        }

        @Override // com.moyoung.lib.videoeditor.editors.b
        public void onStart() {
            this.val$callback.onStart();
        }

        @Override // com.moyoung.lib.videoeditor.editors.b
        public void onSuccess(String str) {
            this.val$editBean.clearTempFile();
            this.val$callback.onSuccess(str);
            this.val$callback.onFinish();
        }
    }

    public static void addPadding(com.moyoung.lib.videoeditor.editors.bean.d dVar, @NonNull b bVar) {
        String createCmd = createCmd(dVar);
        Log.d("VideoPaddingSizeEditor", "cmd=" + createCmd);
        h.execute(createCmd, bVar);
    }

    public static void compress(String str, String str2, @NonNull b bVar) {
        h.execute("-y -i " + str + " -strict -2 -vcodec mpeg4 -preset ultrafast -crf 28 -acodec copy -ac 2 " + str2, bVar);
    }

    private static String createCmd(com.moyoung.lib.videoeditor.editors.bean.d dVar) {
        String str = dVar.inputFilePath;
        String str2 = dVar.outputFilePath;
        int i8 = dVar.targetWidth;
        int i9 = dVar.targetHeight;
        int i10 = dVar.originalWidth;
        return "-y -i " + str + " -vf pad=width=" + i8 + ":height=" + i9 + ":x=" + ((i8 - i10) / 2) + ":y=" + ((i9 - dVar.originalHeight) / 2) + ":color=black -c:v mjpeg -q:v 6 -c:a copy " + str2;
    }

    public static void cutTime(com.moyoung.lib.videoeditor.editors.bean.a aVar, @NonNull b bVar) {
        long j8 = aVar.startMs;
        h.execute("-y -i " + aVar.inputFilePath + " -ss " + (j8 / 1000) + " -t " + ((aVar.endMs - j8) / 1000) + " -vf fps=fps=30 -c:v mpeg4 -qp 6 -b:v 1M -an " + aVar.outputFilePath, bVar);
    }

    public static void edit(com.moyoung.lib.videoeditor.editors.bean.b bVar, @NonNull b bVar2) {
        String createCmd = createCmd(bVar);
        Log.d("VideoEditor", "cmd=" + createCmd);
        h.execute(createCmd, new a(bVar, bVar2));
    }

    public static void editCorner(String str, String str2, String str3, b bVar) {
        String str4 = "-y -i " + str + " -i " + str3 + " -filter_complex [1:v]scale=iw*min(iw/iw\\,ih/ih):ih*min(iw/iw\\,ih/ih),setsar=1[maskv];[0:v][maskv]overlay=(main_w-overlay_w)/2:(main_h-overlay_h)/2 -c:v mjpeg -q:v 6 -c:a copy " + str2;
        Log.d("VideoCornerEditor", "cmd=" + str4);
        h.execute(str4, bVar);
    }

    public static void encode264(String str, String str2, @NonNull b bVar) {
        String str3 = "-y -i " + str + " -c:v mpeg4 -b:v 2000k -c:a copy " + str2;
        Log.d("Video264EncodeEditor", "cmd=" + str3);
        h.execute(str3, bVar);
    }

    public static String getCropValue(com.moyoung.lib.videoeditor.editors.bean.b bVar) {
        return bVar.cropWidth + ":" + bVar.cropHeight + ":" + bVar.cropX + ":" + bVar.cropY;
    }

    public static void resize(com.moyoung.lib.videoeditor.editors.bean.c cVar, @NonNull b bVar) {
        h.execute("-y -i " + cVar.inputFilePath + " -vf crop=" + com.moyoung.lib.videoeditor.editors.bean.c.getCropValue(cVar) + " -c:v mpeg4 -c:a copy " + cVar.outputFilePath, bVar);
    }

    private static String createCmd(com.moyoung.lib.videoeditor.editors.bean.b bVar) {
        String str;
        long j8 = bVar.startMs;
        long j9 = j8 / 1000;
        long j10 = (bVar.endMs - j8) / 1000;
        if (bVar.extraCmd.isEmpty()) {
            str = "";
        } else {
            str = bVar.extraCmd + l.SPACE;
        }
        return "-y -i " + bVar.inputFilePath + " -ss " + j9 + " -t " + j10 + " -vf crop=" + getCropValue(bVar) + ",scale=" + bVar.targetWidth + ":" + bVar.targetHeight + " -c:v mjpeg -q:v " + bVar.quality + " -r " + bVar.fps + " -b:v 1M" + (bVar.isRemoveAudio ? " -an" : "") + str + l.SPACE + bVar.outputFilePath;
    }
}
