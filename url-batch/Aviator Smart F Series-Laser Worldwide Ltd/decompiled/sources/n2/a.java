package n2;

import android.text.TextUtils;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public class a {
    private static final int MAX_ECG_SIZE = 3750;

    /* JADX WARN: Removed duplicated region for block: B:45:0x007c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int[] readEcgData(String str) {
        BufferedReader bufferedReader;
        File file = new File(str);
        BufferedReader bufferedReader2 = null;
        if (!file.exists()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        try {
            bufferedReader = new BufferedReader(new FileReader(file));
            try {
                try {
                    int i8 = 0;
                    for (String readLine = bufferedReader.readLine(); !TextUtils.isEmpty(readLine) && MAX_ECG_SIZE > i8; readLine = bufferedReader.readLine()) {
                        i8++;
                        arrayList.add(Integer.valueOf(Integer.parseInt(readLine)));
                    }
                    int[] iArr = new int[arrayList.size()];
                    for (int i9 = 0; i9 < arrayList.size(); i9++) {
                        iArr[i9] = ((Integer) arrayList.get(i9)).intValue();
                    }
                    try {
                        bufferedReader.close();
                    } catch (IOException e8) {
                        e8.printStackTrace();
                    }
                    return iArr;
                } catch (Exception e9) {
                    e = e9;
                    e.printStackTrace();
                    if (bufferedReader != null) {
                        try {
                            bufferedReader.close();
                        } catch (IOException e10) {
                            e10.printStackTrace();
                        }
                    }
                    return null;
                }
            } catch (Throwable th) {
                th = th;
                bufferedReader2 = bufferedReader;
                if (bufferedReader2 != null) {
                    try {
                        bufferedReader2.close();
                    } catch (IOException e11) {
                        e11.printStackTrace();
                    }
                }
                throw th;
            }
        } catch (Exception e12) {
            e = e12;
            bufferedReader = null;
        } catch (Throwable th2) {
            th = th2;
            if (bufferedReader2 != null) {
            }
            throw th;
        }
    }
}
