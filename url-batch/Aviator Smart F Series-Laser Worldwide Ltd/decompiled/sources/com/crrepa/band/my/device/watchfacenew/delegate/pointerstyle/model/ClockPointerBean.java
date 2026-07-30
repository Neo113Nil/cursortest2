package com.crrepa.band.my.device.watchfacenew.delegate.pointerstyle.model;

import android.os.Environment;
import android.util.Log;
import com.moyoung.dafit.module.common.utils.d;
import com.moyoung.dafit.module.common.utils.g0;
import java.io.File;
import java.util.List;

/* loaded from: classes2.dex */
public class ClockPointerBean {
    public static final int NONE_POINTER_ID = 0;
    public int id;
    public boolean isNonePointer = false;
    public String name;
    public List<PointerConfig> pointer_content;
    public String preview;
    public int rotate_x;
    public int rotate_y;
    public List<String> tpls;

    public static class PointerConfig {
        public String pointer_file;
        public int pointer_h;
        public String pointer_type;
        public int pointer_w;
        public int pointer_x;
        public int pointer_y;
    }

    private static String getPointerDir() {
        return g0.getDirPathByDirName(d.get(), Environment.DIRECTORY_PICTURES, "WatchFacePointerStyle");
    }

    public static File getPointerFile(String str) {
        String str2 = getPointerDir() + File.separator + g0.getFileNameFromUrl(str);
        Log.d("getPointerFile", str2);
        return new File(str2);
    }
}
