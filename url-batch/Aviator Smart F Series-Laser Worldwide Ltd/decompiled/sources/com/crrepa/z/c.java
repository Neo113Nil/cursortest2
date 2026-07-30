package com.crrepa.z;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/* loaded from: classes3.dex */
public class c implements f {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    private final Handler f14069a;

    static class a extends Handler {

        /* renamed from: a, reason: collision with root package name */
        @NonNull
        private final String f14070a;

        /* renamed from: b, reason: collision with root package name */
        private final int f14071b;

        a(@NonNull Looper looper, @NonNull String str, int i8) {
            super((Looper) l.a(looper));
            this.f14070a = (String) l.a(str);
            this.f14071b = i8;
        }

        private File a(@NonNull String str, @NonNull String str2) {
            l.a(str);
            l.a(str2);
            File file = new File(str);
            if (!file.exists()) {
                file.mkdirs();
            }
            File file2 = new File(file, String.format("%s_%s.csv", str2, 0));
            File file3 = null;
            int i8 = 0;
            while (file2.exists()) {
                i8++;
                file3 = file2;
                file2 = new File(file, String.format("%s_%s.csv", str2, Integer.valueOf(i8)));
            }
            return (file3 == null || file3.length() >= ((long) this.f14071b)) ? file2 : file3;
        }

        @Override // android.os.Handler
        public void handleMessage(@NonNull Message message) {
            FileWriter fileWriter;
            String str = (String) message.obj;
            try {
                fileWriter = new FileWriter(a(this.f14070a, "logs"), true);
            } catch (IOException unused) {
                fileWriter = null;
            }
            try {
                a(fileWriter, str);
                fileWriter.flush();
                fileWriter.close();
            } catch (IOException unused2) {
                if (fileWriter != null) {
                    try {
                        fileWriter.flush();
                        fileWriter.close();
                    } catch (IOException unused3) {
                    }
                }
            }
        }

        private void a(@NonNull FileWriter fileWriter, @NonNull String str) {
            l.a(fileWriter);
            l.a(str);
            fileWriter.append((CharSequence) str);
        }
    }

    public c(@NonNull Handler handler) {
        this.f14069a = (Handler) l.a(handler);
    }

    @Override // com.crrepa.z.f
    public void log(int i8, @Nullable String str, @NonNull String str2) {
        l.a(str2);
        Handler handler = this.f14069a;
        handler.sendMessage(handler.obtainMessage(i8, str2));
    }
}
