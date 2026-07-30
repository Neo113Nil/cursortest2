package com.crrepa.band.my.device.watchfacenew.delegate.img;

import android.util.Log;
import com.google.gson.Gson;
import com.moyoung.dafit.module.common.utils.x0;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public class m {
    private static final String DRESS_PHOTO_NAME_LIST = "dress_photo_name_list";
    private static final String GALLERY_PHOTO_NAME_LIST = "gallery_photo_name_list";
    public static final String NEW_CUSTOM_WATCH_FACE_PRESET_IMG = "101";
    private static final String PHOTO_WATCH_FACE_AVAILABLE_SIZE = "available_size_custom_photo_watch_face";
    private static final String PHOTO_WATCH_FACE_MAX_COUNT = "photo_watch_face_max_count";
    private static final String PHOTO_WATCH_FACE_PLATFORM = "photo_watch_face_platform";
    private static final String SENT_TO_BAND_IS_GALLERY = "sent_to_band_is_gallery";
    private static final String SENT_TO_BAND_PHOTO_NAME_LIST = "sent_to_band_photo_name_list";
    private static final String SENT_TO_BAND_SELECTED_INDEX = "sent_to_band_selected_index";

    class a extends Thread {
        a() {
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            new File(i.getCustomWatchFaceImgDir()).delete();
        }
    }

    public static void delete() {
        com.moyoung.dafit.module.common.network.provider.g.getInstance().remove(PHOTO_WATCH_FACE_AVAILABLE_SIZE);
        com.moyoung.dafit.module.common.network.provider.g.getInstance().remove(PHOTO_WATCH_FACE_MAX_COUNT);
    }

    public static void deletePhoto() {
        com.moyoung.dafit.module.common.network.provider.g.getInstance().remove(GALLERY_PHOTO_NAME_LIST);
        com.moyoung.dafit.module.common.network.provider.g.getInstance().remove(DRESS_PHOTO_NAME_LIST);
        com.moyoung.dafit.module.common.network.provider.g.getInstance().remove(SENT_TO_BAND_PHOTO_NAME_LIST);
        com.moyoung.dafit.module.common.network.provider.g.getInstance().remove(SENT_TO_BAND_SELECTED_INDEX);
        deletePhotoWatchFaceFile();
    }

    private static void deletePhotoWatchFaceFile() {
        new a().start();
    }

    public static List<String> getDressPhotoNameList() {
        return getPhotoNameList(DRESS_PHOTO_NAME_LIST);
    }

    public static List<String> getGalleryPhotoNameList() {
        return getPhotoNameList(GALLERY_PHOTO_NAME_LIST);
    }

    private static List<String> getPhotoNameList(String str) {
        Gson gson = new Gson();
        String string = com.moyoung.dafit.module.common.network.provider.g.getInstance().getString(str, "");
        ArrayList arrayList = new ArrayList();
        if (x0.isEmpty(string)) {
            return null;
        }
        List<String> list = (List) gson.fromJson(string, List.class);
        if (x0.isNotEmpty((List<?>) list)) {
            for (String str2 : list) {
                if (x0.isNotEmpty(str2)) {
                    if (new File(i.getCustomWatchFaceImgDir() + str2 + ".png").exists()) {
                        arrayList.add(str2);
                    }
                }
            }
        }
        return arrayList;
    }

    public static int getPhotoWatchFaceAvailableSize() {
        return (com.moyoung.dafit.module.common.network.provider.g.getInstance().getInt(PHOTO_WATCH_FACE_AVAILABLE_SIZE, 0) >= 0 ? r0 : 0) - 100;
    }

    public static int getPhotoWatchFaceMaxCount() {
        return com.moyoung.dafit.module.common.network.provider.g.getInstance().getInt(PHOTO_WATCH_FACE_MAX_COUNT, com.crrepa.band.my.ble.band.utils.a.getInstance().isHisilicon() ? 10 : 8);
    }

    public static int getPhotoWatchFacePlatform() {
        return com.moyoung.dafit.module.common.network.provider.g.getInstance().getInt(PHOTO_WATCH_FACE_PLATFORM, 1);
    }

    public static boolean getSentToBandIsGallery() {
        return com.moyoung.dafit.module.common.network.provider.g.getInstance().getBoolean(SENT_TO_BAND_IS_GALLERY, !x0.isNotEmpty(getDressPhotoNameList()));
    }

    public static List<String> getSentToBandPhotoNameList() {
        return getPhotoNameList(SENT_TO_BAND_PHOTO_NAME_LIST);
    }

    public static int getSentToBandSelectedIndex() {
        return com.moyoung.dafit.module.common.network.provider.g.getInstance().getInt(SENT_TO_BAND_SELECTED_INDEX, -1);
    }

    public static boolean hasPhotoWatchFaceAvailableSize() {
        return com.moyoung.dafit.module.common.network.provider.g.getInstance().contains(PHOTO_WATCH_FACE_AVAILABLE_SIZE);
    }

    public static boolean isHisiliconPlatform() {
        return getPhotoWatchFacePlatform() == 1 && com.crrepa.band.my.ble.band.utils.a.getInstance().isHisilicon();
    }

    public static void saveDressPhotoNameList(List<String> list) {
        com.moyoung.dafit.module.common.network.provider.g.getInstance().putString(DRESS_PHOTO_NAME_LIST, new Gson().toJson(list));
        com.moyoung.dafit.module.common.network.provider.g.getInstance().remove(GALLERY_PHOTO_NAME_LIST);
    }

    public static void saveGalleryPhotoNameList(List<String> list) {
        com.moyoung.dafit.module.common.network.provider.g.getInstance().putString(GALLERY_PHOTO_NAME_LIST, new Gson().toJson(list));
        com.moyoung.dafit.module.common.network.provider.g.getInstance().remove(DRESS_PHOTO_NAME_LIST);
    }

    public static void savePhotoWatchFaceAvailableSize(int i8) {
        Log.d("WatchFaceImgProvider", "savePhotoWatchFaceAvailableSize: " + i8);
        com.moyoung.dafit.module.common.network.provider.g.getInstance().putInt(PHOTO_WATCH_FACE_AVAILABLE_SIZE, i8);
    }

    public static void savePhotoWatchFaceMaxCount(int i8) {
        com.moyoung.dafit.module.common.network.provider.g.getInstance().putInt(PHOTO_WATCH_FACE_MAX_COUNT, i8);
    }

    public static void savePhotoWatchFacePlatform(int i8) {
        com.moyoung.dafit.module.common.network.provider.g.getInstance().putInt(PHOTO_WATCH_FACE_PLATFORM, i8);
    }

    public static void saveSentToBandIsGallery(boolean z7) {
        com.moyoung.dafit.module.common.network.provider.g.getInstance().putBoolean(SENT_TO_BAND_IS_GALLERY, z7);
    }

    public static void saveSentToBandPhotoNameList(List<String> list) {
        com.moyoung.dafit.module.common.network.provider.g.getInstance().putString(SENT_TO_BAND_PHOTO_NAME_LIST, new Gson().toJson(list));
    }

    public static void saveSentToBandSelectedIndex(int i8) {
        com.moyoung.dafit.module.common.network.provider.g.getInstance().putInt(SENT_TO_BAND_SELECTED_INDEX, i8);
    }
}
