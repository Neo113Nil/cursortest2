package com.crrepa.ble.conn.bean;

import android.graphics.Bitmap;
import java.io.File;
import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
public class CRPPhotoWatchFaceInfo {
    private int id;
    private List<File> photoList;
    private List<Pointer> pointerList;
    private Bitmap thumBitmap;

    /* renamed from: x, reason: collision with root package name */
    private int f12288x;

    /* renamed from: y, reason: collision with root package name */
    private int f12289y;

    public static class Pointer implements Comparable<Pointer> {
        private File file;
        private int height;
        private PointerType type;
        private int width;

        /* renamed from: x, reason: collision with root package name */
        private int f12290x;

        /* renamed from: y, reason: collision with root package name */
        private int f12291y;

        @Override // java.lang.Comparable
        public int compareTo(Pointer pointer) {
            return getType().value - pointer.getType().value;
        }

        public File getFile() {
            return this.file;
        }

        public int getHeight() {
            return this.height;
        }

        public PointerType getType() {
            return this.type;
        }

        public int getWidth() {
            return this.width;
        }

        public int getX() {
            return this.f12290x;
        }

        public int getY() {
            return this.f12291y;
        }

        public void setFile(File file) {
            this.file = file;
        }

        public void setHeight(int i8) {
            this.height = i8;
        }

        public void setType(PointerType pointerType) {
            this.type = pointerType;
        }

        public void setWidth(int i8) {
            this.width = i8;
        }

        public void setX(int i8) {
            this.f12290x = i8;
        }

        public void setY(int i8) {
            this.f12291y = i8;
        }

        public String toString() {
            return "Pointer{type=" + this.type + ", file=" + this.file + ", x=" + this.f12290x + ", y=" + this.f12291y + ", width=" + this.width + ", height=" + this.height + '}';
        }
    }

    public enum PointerType {
        HOUR(0),
        MINUTE(1),
        SECOND(2),
        SCALE(3);

        private int value;

        PointerType(int i8) {
            this.value = i8;
        }
    }

    public int getId() {
        return this.id;
    }

    public List<File> getPhotoList() {
        return this.photoList;
    }

    public List<Pointer> getPointerList() {
        return this.pointerList;
    }

    public Bitmap getThumBitmap() {
        return this.thumBitmap;
    }

    public int getX() {
        return this.f12288x;
    }

    public int getY() {
        return this.f12289y;
    }

    public void setId(int i8) {
        this.id = i8;
    }

    public void setPhotoList(List<File> list) {
        this.photoList = list;
    }

    public void setPointerList(List<Pointer> list) {
        Collections.sort(list);
        this.pointerList = list;
    }

    public void setThumBitmap(Bitmap bitmap) {
        this.thumBitmap = bitmap;
    }

    public void setX(int i8) {
        this.f12288x = i8;
    }

    public void setY(int i8) {
        this.f12289y = i8;
    }

    public String toString() {
        return "CRPPhotoWatchFaceInfo{id=" + this.id + ", x=" + this.f12288x + ", y=" + this.f12289y + ", photoList=" + this.photoList + ", thumBitmap=" + this.thumBitmap + ", pointerList=" + this.pointerList + '}';
    }
}
