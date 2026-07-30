package com.crrepa.band.my.device.watchfacenew.delegate.img;

import android.database.Cursor;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Environment;
import android.util.Log;
import androidx.annotation.NonNull;
import com.crrepa.band.my.device.watchfacenew.photo.model.ImgSelectedBean;
import com.moyoung.dafit.module.common.utils.g0;
import com.moyoung.dafit.module.common.utils.x0;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public class i {
    private static final String BAND_WATCH_FACE_PHOTO = "photo";

    public static int getCornerRadius() {
        return m.isHisiliconPlatform() ? z1.j.getCRPWatchFaceScreenInfo().getCornerRadius() : com.crrepa.band.my.device.watchfacenew.delegate.pointerstyle.e.getJieliWatchFaceConfigInfo().getCornerRadius();
    }

    public static String getCustomWatchFaceImgDir() {
        StringBuilder sb = new StringBuilder();
        sb.append(com.crrepa.band.my.a.getBaseFilePath());
        String str = File.separator;
        sb.append(str);
        sb.append(BAND_WATCH_FACE_PHOTO);
        sb.append(str);
        sb.append(com.crrepa.band.my.ble.band.utils.a.getInstance().getFirmwareType());
        sb.append(str);
        return sb.toString();
    }

    public static String getCustomWatchFaceImgPath(String str) {
        return getCustomWatchFaceImgDir() + str + ".png";
    }

    @NonNull
    public static String getGalleryWatchFaceTempDir() {
        return g0.getDirPathByDirName(com.moyoung.dafit.module.common.utils.d.get(), Environment.DIRECTORY_PICTURES, "NewCustomWatchFaceTemp");
    }

    private static ImgSelectedBean getImgSelectedBean(Uri uri) {
        if (uri == null) {
            return null;
        }
        Cursor query = com.moyoung.dafit.module.common.utils.d.get().getContentResolver().query(uri, null, null, null, null);
        try {
            if (query == null) {
                return null;
            }
            try {
                if (query.moveToFirst()) {
                    long j8 = query.getLong(query.getColumnIndexOrThrow("_size"));
                    if (j8 <= 0) {
                        return null;
                    }
                    String string = query.getString(query.getColumnIndexOrThrow("_display_name"));
                    String createAndGetAbsolutePath = g0.createAndGetAbsolutePath(com.moyoung.dafit.module.common.utils.d.get(), uri, getGalleryWatchFaceTempDir() + File.separator + string);
                    ImgSelectedBean imgSelectedBean = new ImgSelectedBean();
                    imgSelectedBean.name = string;
                    imgSelectedBean.path = createAndGetAbsolutePath;
                    Log.d("WatchFaceImgModel", "createAndGetAbsolutePath: " + imgSelectedBean.path);
                    imgSelectedBean.size = j8;
                    return imgSelectedBean;
                }
            } catch (Exception e8) {
                e8.printStackTrace();
            }
            return null;
        } finally {
            query.close();
        }
    }

    public static List<ImgSelectedBean> getImgSelectedList(List<Uri> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<Uri> it = list.iterator();
        while (it.hasNext()) {
            ImgSelectedBean imgSelectedBean = getImgSelectedBean(it.next());
            if (imgSelectedBean != null) {
                arrayList.add(imgSelectedBean);
            }
        }
        return arrayList;
    }

    @NonNull
    public static String getPresetImgPath() {
        return getCustomWatchFaceImgPath(m.NEW_CUSTOM_WATCH_FACE_PRESET_IMG);
    }

    public static int getScreenHeight() {
        return m.isHisiliconPlatform() ? z1.j.getCRPWatchFaceScreenInfo().getHeight() : com.crrepa.band.my.device.watchfacenew.delegate.pointerstyle.e.getJieliWatchFaceConfigInfo().getHeight();
    }

    public static int getScreenWidth() {
        return m.isHisiliconPlatform() ? z1.j.getCRPWatchFaceScreenInfo().getWidth() : com.crrepa.band.my.device.watchfacenew.delegate.pointerstyle.e.getJieliWatchFaceConfigInfo().getWidth();
    }

    public static int getThumbHeight() {
        return m.isHisiliconPlatform() ? z1.j.getCRPWatchFaceScreenInfo().getThumbHeight() : com.crrepa.band.my.device.watchfacenew.delegate.pointerstyle.e.getJieliWatchFaceConfigInfo().getThumbHeight();
    }

    public static int getThumbRadius() {
        return m.isHisiliconPlatform() ? z1.j.getCRPWatchFaceScreenInfo().getThumbCornerRadius() : com.crrepa.band.my.device.watchfacenew.delegate.pointerstyle.e.getJieliWatchFaceConfigInfo().getThumbCornerRadius();
    }

    public static int getThumbWidth() {
        return m.isHisiliconPlatform() ? z1.j.getCRPWatchFaceScreenInfo().getThumbWidth() : com.crrepa.band.my.device.watchfacenew.delegate.pointerstyle.e.getJieliWatchFaceConfigInfo().getThumbWidth();
    }

    public static boolean isImgListChanged(List<File> list, List<String> list2) {
        if (x0.isEmpty(list) && x0.isNotEmpty(list2)) {
            return true;
        }
        if (x0.isNotEmpty(list) && x0.isEmpty(list2)) {
            return true;
        }
        if (x0.isNotEmpty(list) && x0.isNotEmpty(list2) && list.size() != list2.size()) {
            return true;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<File> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(g0.getFileNameSuffixlessFromPath(g0.getFileNameFromUrl(it.next().getAbsolutePath())));
        }
        for (int i8 = 0; i8 < arrayList.size(); i8++) {
            if (!((String) arrayList.get(i8)).equals(list2.get(i8))) {
                return true;
            }
        }
        return false;
    }

    public static boolean isImgListNotChange(List<File> list, boolean z7) {
        return !isImgListChanged(list, z7 ? m.getGalleryPhotoNameList() : m.getDressPhotoNameList());
    }

    public static void saveCustomWatchFaceImgByPath(Bitmap bitmap, String str) {
        com.moyoung.dafit.module.common.utils.g.saveBitmap(com.moyoung.dafit.module.common.utils.g.getRoundBitmap(bitmap, getScreenWidth(), getScreenHeight(), getCornerRadius()), new File(str));
    }
}
