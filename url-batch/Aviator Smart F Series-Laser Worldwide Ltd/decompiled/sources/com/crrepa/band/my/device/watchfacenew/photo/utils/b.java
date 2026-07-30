package com.crrepa.band.my.device.watchfacenew.photo.utils;

import android.net.Uri;
import com.crrepa.band.my.device.watchfacenew.delegate.img.i;
import com.crrepa.band.my.device.watchfacenew.photo.model.ImgSelectedBean;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public class b {
    private final ArrayList<ImgSelectedBean> addedImgList;
    private int calculateFreeSpace;
    private final ArrayList<ImgSelectedBean> croppedImgList;

    /* renamed from: com.crrepa.band.my.device.watchfacenew.photo.utils.b$b, reason: collision with other inner class name */
    private static final class C0194b {
        static final b instance = new b();

        private C0194b() {
        }
    }

    public static b get() {
        return C0194b.instance;
    }

    public void addAddedPhotoItem(List<Uri> list) {
        this.addedImgList.addAll(i.getImgSelectedList(list));
    }

    public void clear() {
        this.addedImgList.clear();
        this.croppedImgList.clear();
    }

    public ArrayList<ImgSelectedBean> getAddedImgList() {
        return this.addedImgList;
    }

    public int getCalculateFreeSpace() {
        return this.calculateFreeSpace;
    }

    public ArrayList<ImgSelectedBean> getCroppedImgList() {
        return this.croppedImgList;
    }

    public void setCalculateFreeSpace(int i8) {
        this.calculateFreeSpace = i8;
    }

    private b() {
        this.addedImgList = new ArrayList<>();
        this.croppedImgList = new ArrayList<>();
    }
}
