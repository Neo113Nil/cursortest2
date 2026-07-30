package n2;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public class b {
    private static final int MIN_ECG_SIZE = 500;
    private BufferedWriter bufferedWriter = null;
    private File file;

    public b() {
        File file = new File(com.crrepa.band.my.a.getEcgFileDirPath(), String.valueOf(System.currentTimeMillis()));
        this.file = file;
        if (file.getParentFile().exists()) {
            return;
        }
        this.file.getParentFile().mkdirs();
    }

    public String write(List<Integer> list) {
        if (list == null || list.size() < 500) {
            return null;
        }
        try {
            try {
                try {
                    if (this.bufferedWriter == null) {
                        this.bufferedWriter = new BufferedWriter(new FileWriter(this.file));
                    }
                    Iterator<Integer> it = list.iterator();
                    while (it.hasNext()) {
                        this.bufferedWriter.write(it.next().toString());
                        this.bufferedWriter.newLine();
                    }
                    this.bufferedWriter.close();
                    BufferedWriter bufferedWriter = this.bufferedWriter;
                    if (bufferedWriter != null) {
                        bufferedWriter.close();
                    }
                } catch (IOException e8) {
                    e8.printStackTrace();
                    BufferedWriter bufferedWriter2 = this.bufferedWriter;
                    if (bufferedWriter2 != null) {
                        bufferedWriter2.close();
                    }
                }
            } catch (IOException e9) {
                e9.printStackTrace();
            }
            return this.file.getAbsolutePath();
        } catch (Throwable th) {
            BufferedWriter bufferedWriter3 = this.bufferedWriter;
            if (bufferedWriter3 != null) {
                try {
                    bufferedWriter3.close();
                } catch (IOException e10) {
                    e10.printStackTrace();
                }
            }
            throw th;
        }
    }
}
