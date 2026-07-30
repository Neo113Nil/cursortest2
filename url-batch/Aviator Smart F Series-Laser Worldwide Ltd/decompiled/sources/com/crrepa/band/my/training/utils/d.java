package com.crrepa.band.my.training.utils;

import android.text.TextUtils;
import android.util.Log;
import com.crrepa.band.my.model.gps.TrainingLocation;
import com.moyoung.dafit.module.common.utils.s;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/* loaded from: classes3.dex */
public class d {
    private e5.b encryptor = new e5.b();
    private BufferedWriter bufferedWriter = null;
    private File trainingPathfile = null;

    public File close() {
        BufferedWriter bufferedWriter = this.bufferedWriter;
        if (bufferedWriter == null) {
            return null;
        }
        try {
            bufferedWriter.flush();
            this.bufferedWriter.close();
            return this.trainingPathfile;
        } catch (IOException e8) {
            e8.printStackTrace();
            return null;
        }
    }

    public boolean createFile(Date date) {
        if (date == null) {
            return false;
        }
        File file = new File(com.crrepa.band.my.a.getGpsTrainingDirPath());
        if (!file.exists()) {
            file.mkdirs();
        }
        try {
            this.trainingPathfile = new File(file, String.valueOf(date.getTime()));
            this.bufferedWriter = new BufferedWriter(new FileWriter(this.trainingPathfile));
            return true;
        } catch (IOException e8) {
            e8.printStackTrace();
            return false;
        }
    }

    public List<TrainingLocation> readTrainingPath(File file, boolean z7) {
        if (file == null || !file.exists()) {
            return null;
        }
        if (!z7) {
            return readTrainingPath(file);
        }
        try {
            ArrayList arrayList = new ArrayList();
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            e5.a aVar = new e5.a();
            while (true) {
                String readLine = bufferedReader.readLine();
                if (TextUtils.isEmpty(readLine)) {
                    return arrayList;
                }
                Charset charset = StandardCharsets.UTF_8;
                String str = new String(aVar.decrypt(readLine.getBytes(charset)), charset);
                Log.d("readTrainingPath", str);
                arrayList.add((TrainingLocation) s.json2Bean(str, TrainingLocation.class));
            }
        } catch (Exception e8) {
            e8.printStackTrace();
            return null;
        }
    }

    public boolean writeLocation(TrainingLocation trainingLocation) {
        if (this.bufferedWriter == null) {
            return false;
        }
        try {
            String bean2Json = s.bean2Json(trainingLocation);
            e5.b bVar = this.encryptor;
            Charset charset = StandardCharsets.UTF_8;
            byte[] encrypt = bVar.encrypt(bean2Json.getBytes(charset));
            if (encrypt != null && encrypt.length > 0) {
                this.bufferedWriter.write(new String(encrypt, charset).replaceAll("\n", ""));
            }
            this.bufferedWriter.newLine();
            return true;
        } catch (IOException e8) {
            e8.printStackTrace();
            return false;
        }
    }

    private List<TrainingLocation> readTrainingPath(File file) {
        if (file != null && file.exists()) {
            try {
                StringBuilder sb = new StringBuilder();
                BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
                while (true) {
                    String readLine = bufferedReader.readLine();
                    if (readLine != null) {
                        sb.append(readLine);
                    } else {
                        return s.json2List(sb.toString(), TrainingLocation[].class);
                    }
                }
            } catch (IOException e8) {
                e8.printStackTrace();
            }
        }
        return null;
    }
}
