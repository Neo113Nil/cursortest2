package com.crrepa.band.my.model;

import android.graphics.Bitmap;
import com.squareup.picasso.v;

/* loaded from: classes2.dex */
public class PresetWatchFaceModel {
    public static final int WATCH_FACE_CUSTOMIZE = 3;
    public static final int WATCH_FACE_DEFAULT = 1;
    public static final int WATCH_FACE_PRESET = 2;
    public static final int WATCH_FACE_WEAR = 4;
    private Bitmap bitmap;
    private boolean checked;
    private boolean hasWatchFace = true;
    private v requestCreator;
    private int type;

    public PresetWatchFaceModel(int i8, v vVar, boolean z7) {
        this.type = i8;
        this.requestCreator = vVar;
        this.checked = z7;
    }

    public Bitmap getBitmap() {
        return this.bitmap;
    }

    public v getRequestCreator() {
        return this.requestCreator;
    }

    public int getType() {
        return this.type;
    }

    public boolean hasWatchFace() {
        return this.hasWatchFace;
    }

    public boolean isChecked() {
        return this.checked;
    }

    public void setBitmap(Bitmap bitmap) {
        this.bitmap = bitmap;
    }

    public void setChecked(boolean z7) {
        this.checked = z7;
    }

    public void setHasWatchFace(boolean z7) {
        this.hasWatchFace = z7;
    }

    public void setRequestCreator(v vVar) {
        this.requestCreator = vVar;
    }

    public void setType(int i8) {
        this.type = i8;
    }
}
