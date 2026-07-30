package com.crrepa.band.my.device.appmarket.map;

import android.content.Context;
import android.os.Environment;
import android.util.Log;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/* loaded from: classes2.dex */
public class d {
    public static final String CYCLING_ROUTE_FILE_NAME = "route_riding_search.bin";
    public static final String POI_FILE_NAME = "poi.bin";
    public static final String POI_SUGGESTION_FILE_NAME = "poi_sug_search.bin";
    public static final String REGEOCODE_SEARCH_FILE_NAME = "regeocode_search.bin";
    public static final String REMAIN_ROUTE_FILE_NAME = "remain_route_update.bin";
    public static final String TRANSIT_ROUTE_FILE_NAME = "route_transit_search.bin";
    public static final String WALKING_ROUTE_FILE_NAME = "route_walking_search.bin";

    private static File createFile(Context context, String str) {
        File file = new File(context.getExternalFilesDir(Environment.DIRECTORY_DOCUMENTS) + File.separator + "BaiduMap", str);
        if (!file.getParentFile().exists()) {
            file.getParentFile().mkdirs();
        }
        return file;
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x001f -> B:9:0x0034). Please report as a decompilation issue!!! */
    public static File save(Context context, String str, String str2) {
        BufferedWriter bufferedWriter;
        Log.d("MapFileWriter", str);
        File createFile = createFile(context, str2);
        BufferedWriter bufferedWriter2 = null;
        try {
            try {
                try {
                    bufferedWriter = new BufferedWriter(new FileWriter(createFile));
                } catch (Throwable th) {
                    th = th;
                }
            } catch (IOException e8) {
                e = e8;
            }
        } catch (IOException e9) {
            e9.printStackTrace();
        }
        try {
            bufferedWriter.write(str);
            bufferedWriter.close();
            bufferedWriter.close();
        } catch (IOException e10) {
            e = e10;
            bufferedWriter2 = bufferedWriter;
            e.printStackTrace();
            if (bufferedWriter2 != null) {
                bufferedWriter2.close();
            }
            return createFile;
        } catch (Throwable th2) {
            th = th2;
            bufferedWriter2 = bufferedWriter;
            if (bufferedWriter2 != null) {
                try {
                    bufferedWriter2.close();
                } catch (IOException e11) {
                    e11.printStackTrace();
                }
            }
            throw th;
        }
        return createFile;
    }
}
