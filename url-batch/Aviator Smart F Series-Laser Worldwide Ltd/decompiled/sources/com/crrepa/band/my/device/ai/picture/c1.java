package com.crrepa.band.my.device.ai.picture;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Environment;
import android.util.Log;
import com.crrepa.band.my.ble.band.cmd.i4;
import com.crrepa.band.my.device.ai.helper.AIProvider;
import com.crrepa.band.my.device.ai.picture.model.AIPictureModel;
import com.crrepa.band.my.device.watchface.model.BandWatchFaceChangeEvent;
import com.crrepa.band.my.model.band.BaseBandModel;
import com.crrepa.band.my.model.band.CustomizeBandModel;
import com.crrepa.ble.conn.bean.CRPAiWatchFacePreviewInfo;
import com.crrepa.ble.conn.bean.CRPJieliWatchFaceLayoutInfo;
import com.crrepa.ble.conn.bean.CRPPhotoWatchFaceInfo;
import com.crrepa.ble.conn.bean.CRPWatchFaceBackgroundInfo;
import com.crrepa.ble.conn.bean.CRPWatchFaceLayoutInfo;
import com.crrepa.ble.conn.listener.CRPFileTransListener;
import com.crrepa.ble.conn.type.CRPChatErrorCode;
import com.crrepa.ble.conn.type.CRPWatchFaceType;
import java.io.File;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public class c1 {
    private Bitmap aiBitmap;
    private String pictureFilePath;

    class a implements CRPFileTransListener {
        CRPFileTransListener transListener;

        public a(CRPFileTransListener cRPFileTransListener) {
            this.transListener = cRPFileTransListener;
        }

        @Override // com.crrepa.ble.conn.listener.CRPFileTransListener
        public void onError(int i8) {
            Log.d("WatchFaceTransListener", "onError-" + i8);
            CRPFileTransListener cRPFileTransListener = this.transListener;
            if (cRPFileTransListener != null) {
                cRPFileTransListener.onError(i8);
            }
        }

        @Override // com.crrepa.ble.conn.listener.CRPFileTransListener
        public void onTransCompleted() {
            Log.d("WatchFaceTransListener", "onTransCompleted");
            if (com.crrepa.band.my.ble.band.utils.a.getInstance().isJieli707()) {
                CRPWatchFaceType cRPWatchFaceType = CRPWatchFaceType.AI_WATCH_FACE;
                com.crrepa.band.my.device.watchfacenew.delegate.pointerstyle.e.saveSelectedHandId(cRPWatchFaceType, 0);
                CRPJieliWatchFaceLayoutInfo jieliWatchFaceLayoutInfo = com.crrepa.band.my.device.watchfacenew.delegate.pointerstyle.e.getJieliWatchFaceLayoutInfo(cRPWatchFaceType);
                jieliWatchFaceLayoutInfo.setShowPointer(false);
                i4.getInstance().sendJieliAIWatchFaceLayout(jieliWatchFaceLayoutInfo);
                Log.d("AI表盘", "layoutInfo: " + jieliWatchFaceLayoutInfo);
            }
            com.moyoung.dafit.module.common.network.provider.g.getInstance().putString(AIPictureModel.SENT_AI_PICTURE_PATH, c1.this.pictureFilePath);
            org.greenrobot.eventbus.c.getDefault().post(new BandWatchFaceChangeEvent(null));
            CRPFileTransListener cRPFileTransListener = this.transListener;
            if (cRPFileTransListener != null) {
                cRPFileTransListener.onTransCompleted();
            }
        }

        @Override // com.crrepa.ble.conn.listener.CRPFileTransListener
        public void onTransProgressChanged(int i8) {
            Log.d("WatchFaceTransListener", "onTransProgressChanged=" + i8);
            CRPFileTransListener cRPFileTransListener = this.transListener;
            if (cRPFileTransListener != null) {
                cRPFileTransListener.onTransProgressChanged(i8);
            }
        }

        @Override // com.crrepa.ble.conn.listener.CRPFileTransListener
        public void onTransProgressStarting() {
            Log.d("WatchFaceTransListener", "onTransProgressStarting");
            com.moyoung.dafit.module.common.network.provider.g.getInstance().putString(AIPictureModel.SENT_AI_PICTURE_PATH, null);
            CRPFileTransListener cRPFileTransListener = this.transListener;
            if (cRPFileTransListener != null) {
                cRPFileTransListener.onTransProgressStarting();
            }
        }
    }

    public static String get707AIImgDir() {
        return com.moyoung.dafit.module.common.utils.g0.getDirPathByDirName(com.moyoung.dafit.module.common.utils.d.get(), Environment.DIRECTORY_PICTURES, "707_AI");
    }

    public void sendAIWatchFace(CRPWatchFaceLayoutInfo cRPWatchFaceLayoutInfo, CRPFileTransListener cRPFileTransListener) {
        CRPWatchFaceBackgroundInfo cRPWatchFaceBackgroundInfo;
        Bitmap changeBitmapSize;
        i4.getInstance().sendAIWatchFaceLayout(cRPWatchFaceLayoutInfo);
        int width = this.aiBitmap.getWidth();
        int height = this.aiBitmap.getHeight();
        Log.d("AIWatchFace", "sendAIWatchFace bitmapWidth: " + width + " bitmapHeight: " + height);
        if (height != cRPWatchFaceLayoutInfo.getHeight() || width != cRPWatchFaceLayoutInfo.getWidth()) {
            this.aiBitmap = com.moyoung.dafit.module.common.utils.g.changeBitmapSize(this.aiBitmap, cRPWatchFaceLayoutInfo.getWidth(), cRPWatchFaceLayoutInfo.getHeight());
            Log.d("AIWatchFace", "sendAIWatchFace layoutInfo.getWidth(): " + cRPWatchFaceLayoutInfo.getWidth() + " layoutInfo.getHeight(): " + cRPWatchFaceLayoutInfo.getHeight());
        }
        if (com.crrepa.band.my.ble.band.utils.a.getInstance().isCircleScreen()) {
            this.aiBitmap = com.moyoung.dafit.module.common.utils.g.getCirleBitmap(this.aiBitmap);
        }
        int thumWidth = cRPWatchFaceLayoutInfo.getThumWidth();
        int thumHeight = cRPWatchFaceLayoutInfo.getThumHeight();
        boolean isRoundedRectangleScreen = com.crrepa.band.my.ble.band.utils.a.getInstance().isRoundedRectangleScreen();
        if (thumWidth == 0 || thumHeight == 0) {
            cRPWatchFaceBackgroundInfo = new CRPWatchFaceBackgroundInfo(this.aiBitmap, cRPWatchFaceLayoutInfo.getCompressionType());
        } else {
            if (isRoundedRectangleScreen) {
                BaseBandModel connectBand = com.crrepa.band.my.ble.band.utils.a.getInstance().getConnectBand();
                int thumFilletRadius = connectBand.getThumFilletRadius();
                if (connectBand instanceof CustomizeBandModel) {
                    thumFilletRadius = ((CustomizeBandModel) connectBand).getThumbRadiusForWatch(cRPWatchFaceLayoutInfo.getWidth(), thumWidth);
                }
                changeBitmapSize = com.moyoung.dafit.module.common.utils.g.getRoundBitmap(this.aiBitmap, thumWidth, thumHeight, thumFilletRadius);
                Log.d("AIWatchFace", "sendAIWatchFace thumbWidth: " + thumWidth + " thumbHeight: " + thumHeight + " thumbCornerRadius: " + thumFilletRadius);
            } else {
                changeBitmapSize = com.moyoung.dafit.module.common.utils.g.changeBitmapSize(this.aiBitmap, thumWidth, thumHeight);
            }
            com.moyoung.dafit.module.common.utils.g.saveBitmap(changeBitmapSize, new File(com.moyoung.dafit.module.common.utils.g0.getPicturesFilePath(com.moyoung.dafit.module.common.utils.d.get(), "watch_face_thumb.png")));
            cRPWatchFaceBackgroundInfo = new CRPWatchFaceBackgroundInfo(this.aiBitmap, changeBitmapSize, cRPWatchFaceLayoutInfo.getCompressionType());
        }
        i4.getInstance().sendAIWatchFace(cRPWatchFaceBackgroundInfo, new a(cRPFileTransListener));
    }

    public void sendAIWatchFaceForWatch(CRPWatchFaceLayoutInfo cRPWatchFaceLayoutInfo) {
        if (com.crrepa.band.my.ble.band.utils.a.getInstance().isHisilicon()) {
            sendHisiliconAIWatchFace(null);
            return;
        }
        if (com.crrepa.band.my.ble.band.utils.a.getInstance().isJieli707()) {
            sendJieliAIWatchFace(null);
        } else if (cRPWatchFaceLayoutInfo != null) {
            sendAIWatchFace(cRPWatchFaceLayoutInfo, null);
        } else {
            i4.getInstance().queryAIWatchFaceLayout();
            i4.getInstance().sendAIWatchFaceError(CRPChatErrorCode.SERVER_BUSY_ERROR);
        }
    }

    public void sendAIWatchFacePreview(CRPAiWatchFacePreviewInfo cRPAiWatchFacePreviewInfo) {
        CRPWatchFaceLayoutInfo.CompressionType compressionType;
        this.aiBitmap = BitmapFactory.decodeFile(new File(this.pictureFilePath).getPath());
        int width = cRPAiWatchFacePreviewInfo.getWidth();
        int height = cRPAiWatchFacePreviewInfo.getHeight();
        int cornerRadius = cRPAiWatchFacePreviewInfo.getCornerRadius();
        Log.d("AIWatchFace", "sendAIWatchFacePreview thumbWidth: " + width + " thumbHeight: " + height + " thumbCornerRadius: " + cornerRadius);
        Bitmap roundBitmap = com.moyoung.dafit.module.common.utils.g.getRoundBitmap(this.aiBitmap, width, height, cornerRadius);
        if (com.crrepa.band.my.ble.band.utils.a.getInstance().isJieli707()) {
            compressionType = CRPWatchFaceLayoutInfo.CompressionType.JIELI_707;
        } else {
            CRPWatchFaceLayoutInfo aIWatchFaceLayoutInfo = AIProvider.getAIWatchFaceLayoutInfo();
            compressionType = aIWatchFaceLayoutInfo == null ? CRPWatchFaceLayoutInfo.CompressionType.ORIGINAL : aIWatchFaceLayoutInfo.getCompressionType();
        }
        i4.getInstance().sendAIWatchFacePreview(compressionType, roundBitmap, null);
    }

    public void sendHisiliconAIWatchFace(CRPFileTransListener cRPFileTransListener) {
        i4.getInstance().sendHisiliconWatchFaceLayout(z1.j.getNewWatchFaceLayoutInfo(CRPWatchFaceType.AI_WATCH_FACE));
        i4.getInstance().sendHisiliconAIWatchFace(new a(cRPFileTransListener));
    }

    public void sendHisiliconAIWatchFacePreview(CRPAiWatchFacePreviewInfo cRPAiWatchFacePreviewInfo) {
        this.aiBitmap = BitmapFactory.decodeFile(new File(this.pictureFilePath).getPath());
        int width = cRPAiWatchFacePreviewInfo.getWidth();
        int height = cRPAiWatchFacePreviewInfo.getHeight();
        int cornerRadius = cRPAiWatchFacePreviewInfo.getCornerRadius();
        Log.d("AIWatchFace", "sendHisiliconAIWatchFacePreview thumbWidth: " + width + " thumbHeight: " + height + " thumbCornerRadius: " + cornerRadius);
        Bitmap roundBitmap = com.moyoung.dafit.module.common.utils.g.getRoundBitmap(this.aiBitmap, width, height, cornerRadius);
        com.moyoung.dafit.module.common.utils.g.saveBitmap(roundBitmap, new File(com.moyoung.dafit.module.common.utils.g0.getPicturesFilePath(com.moyoung.dafit.module.common.utils.d.get(), "watch_face_preview_hisilicon.png")));
        i4.getInstance().sendHisiliconAIWatchFacePreview(roundBitmap, null);
    }

    public void sendJieliAIWatchFace(CRPFileTransListener cRPFileTransListener) {
        Log.d("AIWatchFace", "sendJieliAIWatchFace aiBitmap width: " + this.aiBitmap.getWidth() + " height: " + this.aiBitmap.getHeight());
        int screenWidth = com.crrepa.band.my.device.watchfacenew.delegate.img.i.getScreenWidth();
        int screenHeight = com.crrepa.band.my.device.watchfacenew.delegate.img.i.getScreenHeight();
        Log.d("AIWatchFace", "sendJieliAIWatchFace width: " + screenWidth + " height: " + screenHeight);
        this.aiBitmap = com.moyoung.dafit.module.common.utils.g.changeBitmapSize(this.aiBitmap, screenWidth, screenHeight);
        if (com.crrepa.band.my.ble.band.utils.a.getInstance().isCircleScreen()) {
            this.aiBitmap = com.moyoung.dafit.module.common.utils.g.getCirleBitmap(this.aiBitmap);
        }
        File file = new File(get707AIImgDir() + File.separator + "0.png");
        com.moyoung.dafit.module.common.utils.g.saveBitmap(this.aiBitmap, file);
        ArrayList arrayList = new ArrayList();
        arrayList.add(file);
        CRPPhotoWatchFaceInfo cRPPhotoWatchFaceInfo = new CRPPhotoWatchFaceInfo();
        cRPPhotoWatchFaceInfo.setPhotoList(arrayList);
        cRPPhotoWatchFaceInfo.setThumBitmap(com.crrepa.band.my.device.watchfacenew.photo.utils.c.getThumbBitmapWithLabel(this.aiBitmap, false, false));
        i4.getInstance().sendJieliAIWatchFace(cRPPhotoWatchFaceInfo, new a(cRPFileTransListener));
    }

    public void setAIBitmap(Bitmap bitmap) {
        this.aiBitmap = bitmap;
    }

    public void setHisiliconAIWatchFace() {
        Bitmap thumbBitmapWithLabel = com.crrepa.band.my.device.watchfacenew.photo.utils.c.getThumbBitmapWithLabel(this.aiBitmap, false);
        int screenWidth = com.crrepa.band.my.device.watchfacenew.delegate.img.i.getScreenWidth();
        int screenHeight = com.crrepa.band.my.device.watchfacenew.delegate.img.i.getScreenHeight();
        Log.d("AIWatchFace", "setHisiliconAIWatchFace width: " + screenWidth + " height: " + screenHeight);
        this.aiBitmap = com.moyoung.dafit.module.common.utils.g.changeBitmapSize(this.aiBitmap, screenWidth, screenHeight);
        if (com.crrepa.band.my.ble.band.utils.a.getInstance().isCircleScreen()) {
            this.aiBitmap = com.moyoung.dafit.module.common.utils.g.getCirleBitmap(this.aiBitmap);
            Log.d("setHisiliconAIWatchFace", "isCircleScreen: true");
        }
        i4.getInstance().setHisiliconAIWatchFace(this.aiBitmap, thumbBitmapWithLabel);
        com.moyoung.dafit.module.common.utils.g.saveBitmap(this.aiBitmap, new File(com.moyoung.dafit.module.common.utils.g0.getPicturesFilePath(com.moyoung.dafit.module.common.utils.d.get(), "HisiliconAIWatchFaceAIBitmap.png")));
        com.moyoung.dafit.module.common.utils.g.saveBitmap(thumbBitmapWithLabel, new File(com.moyoung.dafit.module.common.utils.g0.getPicturesFilePath(com.moyoung.dafit.module.common.utils.d.get(), "HisiliconAIWatchFaceThumbBitmapWithLabel.png")));
    }

    public void setPictureFilePath(String str) {
        this.pictureFilePath = str;
        Log.d("AIWatchFace", "pictureFilePath: " + str);
    }
}
