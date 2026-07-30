package com.crrepa.band.my.device.watchfacenew.photo.model;

import android.graphics.Matrix;
import androidx.annotation.NonNull;
import java.io.Serializable;

/* loaded from: classes2.dex */
public class ImgSelectedBean implements Serializable {
    public String croppedPath;
    public Matrix matrix;
    public String name;
    public String path;
    public long size;

    @NonNull
    public String toString() {
        return "PhotoItem{name='" + this.name + "', path='" + this.path + "', cropPath='" + this.croppedPath + "', size=" + this.size + ", matrix=" + this.matrix + '}';
    }
}
